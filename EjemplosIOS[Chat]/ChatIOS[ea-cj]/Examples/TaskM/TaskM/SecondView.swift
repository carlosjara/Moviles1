//
//  SecondView.swift
//  TaskM
//
//  Created by Estudiantes on 5/20/16.
//  Copyright © 2016 sistemas. All rights reserved.
//

import UIKit

class SecondView: UIViewController{
    
    @IBOutlet var name: UITextField!
    @IBOutlet var desc: UITextField!
    var Manager = TareaM()
    
    @IBAction func onTouch(sender: AnyObject) {
        Manager.addTask(name.text!,desc: desc.text!);
    }
}

