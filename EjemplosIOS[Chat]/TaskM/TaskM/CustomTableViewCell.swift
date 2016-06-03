//
//  CustomTableViewCell.swift
//  TaskM
//
//  Created by Estudiantes on 5/27/16.
//  Copyright © 2016 sistemas. All rights reserved.
//

import UIKit

class CustomTableViewCell: UITableViewCell{
    
    @IBOutlet var NameLabel: UILabel!
    @IBOutlet var DescriptionLabel: UILabel!
    
    override func awakeFromNib() {
        super.awakeFromNib()
    }
    
    override func setSelected(selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)
    }
    
}