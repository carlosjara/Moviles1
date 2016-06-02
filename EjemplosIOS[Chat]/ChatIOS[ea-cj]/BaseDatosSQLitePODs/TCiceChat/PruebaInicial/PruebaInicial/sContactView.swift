//
//  sContactView.swift
//  PruebaInicial
//
//  Created by Estudiantes on 5/31/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit

class sContactViewController: UIViewController, UITableViewDataSource {
    
    @IBOutlet weak var lblID: UILabel!
    @IBOutlet var tableView: UITableView!
    var idEntrar:Int = 0
    var cManager = ContactManager ()
    var nombreUserDestino:Contact = Contact(id: 1,name: "a",userName: "b")
    var nombreUserRemitente:Contact = Contact(id: 1,name: "a",userName: "b")
    
    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let cell:CustomTableViewCell = tableView.dequeueReusableCellWithIdentifier("Custom01") as! CustomTableViewCell
        let contact = cManager.getContactAt(indexPath.row)
        cell.nameLbl.text = contact?.name
        cell.userNameLbl.text = contact?.userName
        
        return cell
    }
    
    func tableView(tableView: UITableView,numberOfRowsInSection section: Int) -> Int{
        return cManager.contactCount();
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        cManager.getContacts(idEntrar)
        //cManager.getContactAt(idEntrar)?.userName
        lblID.text? = "Usuario: \(idEntrar)"
    }
    
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        if(segue.identifier == "Conversar"){
            nombreUserDestino = cManager.getContactAt((tableView.indexPathForSelectedRow?.row)!)!
            nombreUserRemitente = cManager.getContactAt(idEntrar)!
        }
        (segue.destinationViewController as! ChatView).userDestino = nombreUserDestino
        (segue.destinationViewController as! ChatView).userDestino = nombreUserRemitente
        
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    override func viewWillAppear(animated: Bool) {
        tableView.reloadData()
    }

}
