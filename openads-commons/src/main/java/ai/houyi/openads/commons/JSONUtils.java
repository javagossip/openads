/*
 * Copyright 2017 The OpenDSP Project
 *
 * The OpenDSP Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package ai.houyi.openads.commons;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author wangwp
 */
public final class JSONUtils {

	public static String toJSONString(Object t) {
		return JSON.toJSONString(t);
	}

	@SuppressWarnings("unchecked")
	public static <T> T toObject(String string) {
		return (T) JSON.parse(string);
	}
}
