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
package com.huawei.openstack4j.openstack.map.reduce.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author QianBiao.NG
 * @date   2017-07-12 15:33:40
 */
public enum ClusterType {

	Analyse(0), Stream(1);

	Integer value;

	ClusterType(Integer value) {
		this.value = value;
	}
	
	@JsonValue
	Integer value() {
		return value;
	}

	@JsonCreator
	public static ClusterType forValue(Object value) {
		if (value != null) {
			for (ClusterType s : ClusterType.values()) {
				if (value.equals(s.value)) {
					return s;
				} else if(value.toString().equalsIgnoreCase(s.name())){
					return s;
				}
			}
		}
		return null;
	}
}