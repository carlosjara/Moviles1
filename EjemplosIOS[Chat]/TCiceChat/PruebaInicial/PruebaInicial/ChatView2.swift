//
//  ChatView2.swift
//  PruebaInicial
//
//  Created by Estudiantes on 6/4/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit
class ChatView2: UIViewController {

    
    @IBOutlet var titulo: UINavigationItem!
    @IBOutlet var NavTitle: UINavigationItem!
    @IBOutlet var textoEntrante: UITextField!
    @IBOutlet var tableView: UITableView!
    
    var userDestino:Contact = Contact(id: 1,name: "a",userName: "b")
    //var userRemitente: Contact = Contact(id: 1, name: "a", userName: "b")
    var userRemitente : Int = 0
    var msgs:[Message] = [Message]()
    
    var cManager : ChatManager = ChatManager()
    var cTb: TabBarController1 = TabBarController1()
    
    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let identifier:String = "Message1"
        let cell:CustomMessageTableViewCell = tableView.dequeueReusableCellWithIdentifier(identifier) as! CustomMessageTableViewCell
        let cellcount = cell.accessibilityElementCount()
        let msg = cManager.getMsg(cellcount+indexPath.row)
        cell.lblM3.text = msg.text
        return cell
    }
    
    func tableView(tableView: UITableView,numberOfRowsInSection section: Int) -> Int{
        return cManager.count();
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        userDestino = cTb.nombreUserDestino
        userRemitente = cTb.userRemitente
        textoEntrante.keyboardType = UIKeyboardType.Default
        titulo.title = userDestino.name
        cManager.start(userRemitente, to: userDestino.id)
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    override func viewWillAppear(animated: Bool) {
        tableView.reloadData()
    }
    
    @IBAction func Enviar(sender: AnyObject) {
        let texto:String = textoEntrante.text!
        cManager.addMessge(userRemitente, to: userDestino.id, text: texto)
        debugPrint(userRemitente,userDestino.id)
        let postSer: MessagePOSTService = MessagePOSTService(from: userRemitente, to:userDestino.id)
        postSer.SendMessage(userRemitente, to:userDestino.id,text:texto)
        textoEntrante.clearButtonMode = .WhileEditing
        textoEntrante.text = nil
        viewWillAppear(true)
    }
    @IBAction func Refresh(sender: AnyObject) {
        //textoEntrante.text = nil
        cManager.refreshMessages(userRemitente, to: userDestino.id)
        viewWillAppear(true)
    }
    
    
    
}
