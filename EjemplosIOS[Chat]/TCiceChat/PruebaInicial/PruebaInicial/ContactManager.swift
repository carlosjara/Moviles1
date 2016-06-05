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
    //var request : RestGet = RestGet(baseService: "http://10.5.99.156:8191/rest")
    //var request : RestGet = RestGet(baseService: "http://172.17.17.243:8191/rest")
    /*var request : RestGet = RestGet(baseService: "http://10.5.99.30:8191/rest")*/
    // APLICAR REST AQUI PARA LA SELECCION DEL CONTACTO
    init(){
        //contactList = [Contact(id: 1,name: "Carlos Jaramillo",userName: "carlosjara"),Contact(id: 2,name: "Edgar Amezquita",userName: "EdgarM-"),Contact(id: 3,name: "Juan Rada",userName: "jcamilorada")];
        
    }    
    func getContacts(id : Int) -> Void{
        var value: [[String: AnyObject]]!
        
        ContactArrayGETService(id: id).executeTask() {
            if let v = $0.result.value {
                value = v
                for v in value {
                    let uId : Int = v["userId"] as! Int
                    self.contactList.append(Contact(id: uId, name: v["nombre"] as! String,userName: v["userName"] as! String))
                    //print(v)
                }
                //sContactViewController.viewWillAppear(true)
            }
            
        }
        
       //var lista : Array<Contact> = [Contact(id: 1,name: "Carlos Jaramillo",userName: "carlosjara"),Contact(id: 2,name: "Edgar Amezquita",userName: "EdgarM-"),Contact(id: 3,name: "Juan Rada",userName: "jcamilorada")]
        //contactList = request.getContacts(id)
       
    }
    func getContactAt(pos : Int) -> Contact? {
        //debugPrint(contactList[1])
        if(pos >= 0 && pos < contactList.count){
            return self.contactList[pos]
        }
        return nil;
    }
    
    func contactCount() -> Int {
        return self.contactList.count
    }
}