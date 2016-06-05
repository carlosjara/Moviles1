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
    @IBOutlet var textEntrante: UITextField!
    @IBOutlet var tableView: UITableView!
    var userDestino:Contact = Contact(id: 1,name: "a",userName: "b")
    var userRemitente: Contact = Contact(id: 1, name: "a", userName: "b")
    var msgs:[Message] = [Message]()
    
    var cManager : ChatManager = ChatManager()
    
    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let identifier:String = "CustomM02"
        let cell:CustomMessageTableViewCell = tableView.dequeueReusableCellWithIdentifier(identifier) as! CustomMessageTableViewCell
        //#### NOTA PENDIENTE REVISAR EL ID PARA SELECCIONAR EL identifier
        //msgs = cManager.getMessages(userRemitente.id, to: userDestino.id)
        let cellcount = cell.accessibilityElementCount()
        let msg = cManager.getMsg(cellcount+indexPath.row)
        //debugPrint("index path: ",cellcount+indexPath.row)
        //debugPrint("msgs: ",msgs)
        //cell.lblM1.text = msgs[indexPath.row].text
        cell.lblM1.text = msg.text
        return cell
    }
    
    func tableView(tableView: UITableView,numberOfRowsInSection section: Int) -> Int{
        return cManager.count();
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        textEntrante.keyboardType = UIKeyboardType.Default
        nombreChatTop.title = userDestino.name
        cManager.start(userRemitente.id, to: userDestino.id)
        //debugPrint(cManager.MessagesG)
        //cManager.getMessage(userRemitente.id, to: userDestino.id)
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    override func viewWillAppear(animated: Bool) {
        tableView.reloadData()
    }
    @IBAction func SendMessage(sender: AnyObject) {
        let texto:String = textEntrante.text!
        cManager.addMessge(userRemitente.id, to: userDestino.id, text: texto)
        let postSer: MessagePOSTService = MessagePOSTService(from: userRemitente.id, to:userDestino.id)
        postSer.SendMessage(userRemitente.id, to:userDestino.id,text:texto)
        textEntrante.clearButtonMode = .WhileEditing
        textEntrante.text = nil
        viewWillAppear(true)
    }
}
