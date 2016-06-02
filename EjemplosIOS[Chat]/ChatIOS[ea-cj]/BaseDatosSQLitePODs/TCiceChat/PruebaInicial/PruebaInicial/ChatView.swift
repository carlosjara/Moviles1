//
//  ChatView.swift
//  PruebaInicial
//
//  Created by Estudiantes on 5/31/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit

class ChatView: UIViewController, UITableViewDataSource{
    
    @IBOutlet var nombreChatTop: UINavigationItem!
    
    @IBOutlet var tableView: UITableView!
    var userDestino:Contact = Contact(id: 1,name: "a",userName: "b")
    var userRemitente: Contact = Contact(id: 1, name: "a", userName: "b")
    
    var cManager : ChatManager = ChatManager()
    
    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let identifier:String = "CustomM02"
        //#### NOTA PENDIENTE REVISAR EL ID PARA SELECCIONAR EL identifier
        let cell:CustomMessageTableViewCell = tableView.dequeueReusableCellWithIdentifier(identifier) as! CustomMessageTableViewCell
        let Message = cManager.getMessage(userRemitente.id, to: userDestino.id)
        cell.lblM1.text = Message.text
        return cell
    }
    
    func tableView(tableView: UITableView,numberOfRowsInSection section: Int) -> Int{
        return cManager.count();
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        nombreChatTop.title = userDestino.name
        debugPrint("-------hnh------")
        //cManager.getMessage(userRemitente.id, to: userDestino.id)
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    override func viewWillAppear(animated: Bool) {
        tableView.reloadData()
    }
}
