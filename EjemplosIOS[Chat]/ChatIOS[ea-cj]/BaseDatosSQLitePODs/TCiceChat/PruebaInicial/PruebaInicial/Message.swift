//
//  Message.swift
//  PruebaInicial
//
//  Created by invitado on 27/05/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit

class Message {
    var idMessage : Int;
    var from : Int;
    var to : Int;
    var text : String;
    var date : String;
    
    init (idMessage : Int ,from : Int, to : Int, text: String, date:String){
        self.from = from;
        self.to = to;
        self.text = text;
        self.date = date;
        self.idMessage = idMessage;
    }
}