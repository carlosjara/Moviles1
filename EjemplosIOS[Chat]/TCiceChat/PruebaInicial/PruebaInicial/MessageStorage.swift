//
//  MessageStorage.swift
//  PruebaInicial
//
//  Created by Estudiantes on 6/4/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import SQLite

class MessageStorage {
    
    private var db:Connection
    private var MessagesTb:Table
    private var idColumn:Expression<Int>;
    private var fromColumn:Expression<Int>;
    private var toColumn:Expression<Int>;
    private var textColumn:Expression<String>;
    private var dateColumn:Expression<String>;
    
    init(){
        let path = NSSearchPathForDirectoriesInDomains(.DocumentDirectory, .UserDomainMask, true).first!
        db = try! Connection("\(path)/db.sqlite3")
        debugPrint("\(path)/db.sqlite3")
        MessagesTb = Table("Messages")
        idColumn = Expression<Int>("id")
        fromColumn = Expression<Int>("from")
        toColumn = Expression<Int>("to")
        textColumn = Expression<String>("text")
        dateColumn = Expression<String>("date")
        
        try! db.run(MessagesTb.create(ifNotExists: true) { t in
            t.column(idColumn, primaryKey: PrimaryKey.Autoincrement)
            t.column(fromColumn)
            t.column(toColumn)
            t.column(textColumn)
            t.column(dateColumn)
            })
        
        //MENSAJES TEMPORALES PARA LA PRUEBA
        //try! db.run(MessagesTb.insert(fromColumn <- 1, toColumn <- 2, textColumn <- "Hola"))
        //try! db.run(MessagesTb.insert(fromColumn <- 2, toColumn <- 1, textColumn <- "Hola Como Estas?"))
        //try! db.run(MessagesTb.insert(fromColumn <- 1, toColumn <- 2, textColumn <- "Bien"))
        //try! db.run(MessagesTb.insert(fromColumn <- 1, toColumn <- 2, textColumn <- "Terminaste el proyecto ?"))
        //try! db.run(MessagesTb.insert(fromColumn <- 2, toColumn <- 3, textColumn <- "Hola "))
        //try! db.run(MessagesTb.insert(fromColumn <- 3, toColumn <- 2, textColumn <- "Hola como vas ?"))
        //try! db.run(MessagesTb.insert(fromColumn <- 2, toColumn <- 3, textColumn <- "Terminaste el proyecto ?"))
        
    }
    
    func addMessge(from:Int, to:Int, text:String) {
        let dateString = NSDate()
        let dateFormatter = NSDateFormatter()
        dateFormatter.dateFormat = "MM-dd-yyyy"
        let currentDate:String = dateFormatter.stringFromDate(dateString)
        try! db.run(MessagesTb.insert(fromColumn <- from, toColumn <- to, textColumn <- text, dateColumn <- currentDate))
    }
    
    func getMessages(from:Int, to:Int) -> [Message]{
        var MessagesG : [Message] = [Message]();
        let query = MessagesTb.select(idColumn,fromColumn,toColumn,textColumn,dateColumn).filter(fromColumn == from).filter(toColumn == to)
        let messages = Array(try! db.prepare(query))
        for row in messages {
            MessagesG.append(Message(idMessage: row.get(idColumn), from: row.get(fromColumn), to: row.get(toColumn), text: row.get(textColumn), date: row.get(dateColumn)))
            
        }
        return MessagesG
    }

}