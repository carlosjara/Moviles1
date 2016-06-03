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
        /*
        let currentDate = NSDate()
        let calendar = NSCalendar.currentCalendar()
        let componentDay = calendar.components(.Day, fromDate: currentDate)
        let componentMonth = calendar.components(.Month, fromDate: currentDate)
        let componentYear = calendar.components(.Year, fromDate: currentDate)
        let day = componentDay.day
        let month = componentMonth.month
        let year = componentYear.year
        debugPrint("\(day)-\(month)-\(year)")
        
        let dateString = NSDate()
        let dateFormatter = NSDateFormatter()
        dateFormatter.dateFormat = "MM-dd-yyyy"
        let date2:String = dateFormatter.stringFromDate(dateString)
        debugPrint(date2)*/
        

        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        
    }
    
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        if (segue.identifier == "Entrar"){
            Id = Int(txtField_Id.text!)
        }
        (segue.destinationViewController as! sContactViewController).idEntrar = Id!
    }


}

