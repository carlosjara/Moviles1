//
//  CustomMessageTableViewCell.swift
//  PruebaInicial
//
//  Created by Estudiantes on 6/1/16.
//  Copyright © 2016 TCIceChat. All rights reserved.
//

import UIKit

class CustomMessageTableViewCell: UITableViewCell {

    @IBOutlet var lblM2: UILabel!
    @IBOutlet var lblM1: UILabel!
    @IBOutlet var lblM3: UILabel!
    @IBOutlet var lblM4: UILabel!
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }

}
