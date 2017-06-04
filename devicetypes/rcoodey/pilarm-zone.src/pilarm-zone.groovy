/**
 *  Pilarm Zone
 *
 *  Copyright 2016 Ryan Coodey
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */

metadata {
	definition (name: "Pilarm Zone", namespace: "rcoodey", author: "Ryan Coodey") {
		capability "Contact Sensor"

        command "zoneEvent"
	}

	tiles(scale: 2) {
        standardTile("contact", "device.contact", width: 2, height: 2) {
        	state("open", label:'Open', icon:"st.contact.contact.open", backgroundColor:"#ffa81e")
			state("closed", label:'Closed', icon:"st.contact.contact.closed", backgroundColor:"#79b821")
        }
	    main(["contact"])
	    details(["contact"]) 
	}
}

//Handle command
def zoneEvent(String event) {
	sendEvent(name: "contact", value: event)
}