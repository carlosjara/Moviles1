//
//  MessagePOSTService.swift
//  PruebaInicial
//
//  Created by Estudiantes on 6/4/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import Restofire
import Alamofire

class MessagePOSTService {
    
    typealias Model = [[String: AnyObject]]
    var path: String = "/messages/"
    
    init(from : Int, to: Int){
        path+=String(from)+"/"+String(to)
        print(path)
    }

    func SendMessage(from: Int, to: Int, text: String) -> Void {
        let message = ["from":from, "to" : to, "text":text]
        Alamofire.request(.POST, path, parameters: message as! [String : AnyObject], encoding: .JSON)
    }
}


