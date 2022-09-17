//
//  VenueContent.swift
//  iosApp
//
//  Created by Stéphane Rihet on 15/09/2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

struct VenueContent {
    let address: String
    let description: String
    let latitude: Double
    let longitude: Double
    let imageUrl: String
    let name: String
}

extension VenueContent {
    init(from venue: Venue) {
        self.init(address: venue.address, description: venue.description_, latitude: venue.latitude as! Double, longitude: venue.longitude as! Double, imageUrl: venue.imageUrl ?? "https://fakeface.rest/thumb/view", name: venue.name)
    }
}