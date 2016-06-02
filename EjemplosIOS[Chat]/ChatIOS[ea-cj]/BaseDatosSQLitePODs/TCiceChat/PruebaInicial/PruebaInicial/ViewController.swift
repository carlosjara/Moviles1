//
//  ViewController.swift
//  PruebaInicial
//
//  Created by invitado on 27/05/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit


class ViewController: UIViewController{

    @IBOutlet weak var txtField_Id: UITextField!
    var Id:Int?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        txtField_Id.keyboardType = UIKeyboardType.NumberPad
        

        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        if (segue.identifier == "Entrar"){
            Id = Int(txtField_Id.text!)
        }
        (segue.destinationViewController as! sContactViewController).idEntrar = Id!
    }


}

