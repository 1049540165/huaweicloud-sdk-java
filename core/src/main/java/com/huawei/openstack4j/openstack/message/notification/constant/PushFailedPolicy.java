 /*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.                                         
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.message.notification.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PushFailedPolicy {
	
	// keep in a failed queue when failed
	Queue(0), 
	// drop message when failed
	Drop(1);

	Integer value;

	PushFailedPolicy(Integer value) {
		this.value = value;
	}

	@JsonValue
	Integer value() {
		return value;
	}

	@JsonCreator
	public static PushFailedPolicy forValue(Integer value) {
		if (value != null) {
			for (PushFailedPolicy state : PushFailedPolicy.values()) {
				if (value.equals(state.value)) {
					return state;
				}
			}
		}
		return null;
	}
}