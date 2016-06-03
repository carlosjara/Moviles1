//
//  ViewController.swift
//  TaskM
//
//  Created by Estudiantes on 5/20/16.
//  Copyright © 2016 sistemas. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITableViewDataSource, UITableViewDelegate{
    
    @IBOutlet var tableView: UITableView!
    var Manager = TareaM()
    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell{
        var customcellidentifier = "CustomCell02"
        if indexPath.row % 2 == 0 {
            customcellidentifier = "CustomCell01"
        }
        let cell:CustomTableViewCell = tableView.dequeueReusableCellWithIdentifier(customcellidentifier) as! CustomTableViewCell
        let task = Manager.getTask(indexPath.row)
        cell.NameLabel?.text = task.nombre
        cell.DescriptionLabel?.text = task.Descripcion;
        return cell;
    }
    
    func tableView(tableView: UITableView,numberOfRowsInSection section: Int) -> Int{
        return Manager.count();
        
    }
    
    func tableView(tableView: UITableView, didSelectRowAtIndexPath indexPath: NSIndexPath)
    {
        //Si se selecciona una fila Se puede pasar a otro view controller,
        
        //Otra forma de hacerlo es usando el navigation controller puesto que crea una especie de 
    }
    
    
    
    func tableView(tableView: UITableView, commitEditingStyle editingStyle: UITableViewCellEditingStyle, forRowAtIndexPath indexPath: NSIndexPath) {
        if editingStyle == UITableViewCellEditingStyle.Delete{
            Manager.removeTask(indexPath.row);
            tableView.reloadData();
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        
    }

    override func viewWillAppear(animated: Bool) {
        tableView.reloadData()
    }
}

