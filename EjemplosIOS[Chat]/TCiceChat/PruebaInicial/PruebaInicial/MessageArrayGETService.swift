//
//  MessageArrayGETService.swift
//  PruebaInicial
//
//  Created by Estudiantes on 6/4/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import Restofire

class MessageArrayGETService: Requestable {
    
    typealias Model = [[String: AnyObject]]
    var path: String = "/messages/"
    
    init(from : Int, to: Int){
        path+=String(from)+"/"+String(to)
    }
    
    
}
