//
//  ChatManager.swift
//  PruebaInicial
//
//  Created by Estudiantes on 5/31/1ights reserved.
//

import SQLite
import UIKit

class ChatManager {
    
    static var db:MessageStorage = MessageStorage()
    var MessagesG = [Message]()

    init(){
        
    }
    
    func addMessge(from:Int, to:Int, text:String) {
        ChatManager.db.addMessge(from, to: to, text: text)
    }
    
    //Trae los mensajes de la base de datos
    func getMessages(from:Int, to:Int) -> Void{
        MessagesG = ChatManager.db.getMessages(from, to: to)
        MessagesG.appendContentsOf(ChatManager.db.getMessages(to, to: from))
    }
    
    //Refresh Messages Get messages from Rest Service
    func refreshMessages(from: Int, to:Int) -> Void {
        
    }
    
    func start(from:Int, to:Int) -> Void {
        self.MessagesG.removeAll()
        self.getMessages(from, to: to)
    }
  
    func getMsg(id:Int) -> Message{
        //debugPrint(id,MessagesG)
        return MessagesG[id];
    }
        
    func count() -> Int {
        return MessagesG.count
    }
    
    
    
}
