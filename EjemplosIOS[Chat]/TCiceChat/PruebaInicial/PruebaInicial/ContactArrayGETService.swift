//
//  RestGetRTF.swift
//  PruebaInicial
//
//  Created by Estudiantes on 6/4/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import Restofire

class ContactArrayGETService: Requestable {
    
    typealias Model = [[String: AnyObject]]
    var path: String = "/contacts/"
    
    init(id : Int){
        path+=String(id)
    }
    
    
}