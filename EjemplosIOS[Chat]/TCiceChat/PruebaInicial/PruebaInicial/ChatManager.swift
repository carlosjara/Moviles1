//
//  ChatManager.swift
//  PruebaInicial
//
//  Created by Estudiantes on 5/31/1ights reserved.
//

import SQLite
import UIKit

class ChatManager {
    
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
    
    func getMessage(from:Int, to:Int) -> Message{
        let query = MessagesTb.select(idColumn,fromColumn,toColumn,textColumn,dateColumn).filter(fromColumn == from).filter(toColumn == to)
        let messages = Array(try! db.prepare(query))
        var solve = Message(idMessage: messages[0].get(idColumn), from: messages[0].get(fromColumn), to: messages[0].get(toColumn), text: messages[0].get(textColumn), date: messages[0].get(dateColumn))
        for msg in messages {
            solve = Message(idMessage: msg.get(idColumn), from: msg.get(fromColumn), to: msg.get(toColumn), text: msg.get(textColumn), date: msg.get(dateColumn))
        }
        return solve
    }
        
    func count() -> Int {
        return db.scalar(MessagesTb.count)
    }
    
    
    
    
    
    
    /*var chatList: Array<Message> = Array<Message>();
    
    func getMessages(from : Int, to: Int) -> Void{
        let lista : Array<Message> = [Message(idMessage : 1,from : 1, to : 2, text: "TU cucha es hombre", date:"16/12/2006"),Message(idMessage : 2,from : 2, to : 1, text: "TU hermana es hombre", date:"16/12/2006")]
        chatList = lista
    }
    
    func getMessageAt(pos : Int) -> Message? {
        if(pos >= 0 && pos < self.contactCount()){
            return self.chatList[pos]
        }
        return nil;
    }
    
    func contactCount() -> Int {
        return self.chatList.count
    }
    */
}
