//
//  ContactManager.swift
//  PruebaInicial
//
//  Created by invitado on 27/05/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit

class ContactManager {
    var contactList: Array<Contact> = Array<Contact>();
    // APLICAR REST AQUI PARA LA SELECCION DEL CONTACTO
    init(){
        contactList = [Contact(id: 1,name: "Carlos Jaramillo",userName: "carlosjara"),Contact(id: 2,name: "Edgar Amezquita",userName: "EdgarM-"),Contact(id: 3,name: "Juan Rada",userName: "jcamilorada")];
        
    }    
    func getContacts(id : Int) -> Void{
       let lista : Array<Contact> = [Contact(id: 1,name: "Carlos Jaramillo",userName: "carlosjara"),Contact(id: 2,name: "Edgar Amezquita",userName: "EdgarM-"),Contact(id: 3,name: "Juan Rada",userName: "jcamilorada")];
       contactList = lista
    }
    func getContactAt(pos : Int) -> Contact? {
        if(pos >= 0 && pos < self.contactCount()){
            return self.contactList[pos]
        }
        return nil;
    }
    
    func contactCount() -> Int {
        return self.contactList.count
    }
}