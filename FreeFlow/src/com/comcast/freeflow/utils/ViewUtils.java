/*******************************************************************************
 * Copyright 2013 Comcast Cable Communications Management, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.comcast.freeflow.utils;

import java.util.Map;

import com.comcast.freeflow.core.FreeFlowItem;

public class ViewUtils {
	public static FreeFlowItem getItemAt(Map<?, FreeFlowItem> frameDescriptors, int x, int y){
        FreeFlowItem returnValue = null;

		for(FreeFlowItem item : frameDescriptors.values()) {
			if(item.frame.contains((int)x, (int)y)) {
                returnValue =  item;
            }
	      
	    }
		return returnValue;
	}
}
