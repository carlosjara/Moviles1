//
//  ContactController.swift
//  PruebaInicial
//
//  Created by invitado on 27/05/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//
import UIKit

class ContactController: UIViewController {
    
    @IBOutlet weak var lbl_Id: UILabel!
    @IBOutlet weak var tableView: UITableView!
    func tableView(tableView: UITableView,
                   cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell{
        let cell = UITableViewCell(style: UITableViewCellStyle.Subtitle, reuseIdentifier: nil);
        let contact = ContactManager.
        cell.textLabel?.text = contact?.name
        cell.detailTextLabel?.text = contact?.userName;
        return cell;
    }
    
    func tableView(tableView: UITableView,
                   numberOfRowsInSection section: Int) -> Int{
        return ContactManager.contactCount();
    }
    
    
    override func viewWillAppear(animated: Bool) {
        tableView.reloadData()
    }
}
