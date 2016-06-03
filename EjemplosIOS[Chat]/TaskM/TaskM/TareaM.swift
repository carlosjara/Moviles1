//
//  TareaM.swift
//  TaskM
//
//  Created by Estudiantes on 5/20/16.
//  Copyright © 2016 sistemas. All rights reserved.
//

import UIKit
import SQLite


class TareaM {
    /*static var listTarea:[Tarea]=[]
        
    static func addTarea(tarea:Tarea){
        listTarea.append(tarea);
    }
    
    static func contTarea() -> Int {
        return listTarea.count;
    }
    
    static func getTareaAt(indice:Int) -> Tarea{
        return listTarea[indice];
    }
    
    static func BorrarTarea(indice:Int) {
        listTarea.removeAtIndex(indice);
    }*/
    private var db:Connection
    private var tasks:Table
    private var nameColumn:Expression<String>
    private var descriptionColumn:Expression<String>
    private var idColumn:Expression<Int>
    
    init(){
        let path = NSSearchPathForDirectoriesInDomains(.DocumentDirectory, .UserDomainMask, true).first!
        db = try! Connection("\(path)/db.sqlite3")
        
        tasks = Table("Tareas")
        idColumn = Expression<Int>("id")
        nameColumn = Expression<String>("name")
        descriptionColumn = Expression<String>("description")
        try! db.run(tasks.create(ifNotExists: true) { t in
            t.column(idColumn, primaryKey: PrimaryKey.Autoincrement)
            t.column(nameColumn)
            t.column(descriptionColumn)
            })
    }
    
    func addTask(name:String, desc:String) {
        try! db.run(tasks.insert(nameColumn <- name, descriptionColumn <- desc))
    }
    
    func getTask(id:Int) -> Tarea{
        let query = tasks.limit(1, offset: id)
        let task = Array(try! db.prepare(query))[0]
        
        return Tarea(nombre: task.get(nameColumn) , Descripcion: task.get(descriptionColumn));
    }
    
    func removeTask(id:Int) {
        let query = tasks.limit(1, offset: id)
        let task = Array(try! db.prepare(query))[0]
        
        try! db.run(tasks.filter(idColumn == task.get(idColumn)).delete())
    }
    
    func count() -> Int {
        return db.scalar(tasks.count)
    }
    
}