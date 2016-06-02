//
//  Contact.swift
//  PruebaInicial
//
//  Created by invitado on 27/05/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit

class Contact {
    var name : String;
    var userName : String;
    var id : Int;
    init(id : Int, name: String, userName : String){
        self.name = name;
        self.id = id;
        self.userName = userName;
    }
    
}