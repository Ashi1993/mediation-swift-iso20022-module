/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.module.swiftiso20022.utils;

import org.wso2.carbon.module.swiftiso20022.model.ErrorModel;

/**
 * Class to validate the request payload.
 */
public class ValidatorUtils {

    /**
     * Method to construct the error model.
     *
     * @param errorMessage  Error message
     * @param errorCode  Error code
     * @return            Constructed Error model
     */
    public static ErrorModel constructErrorModel(String errorCode, String errorMessage) {
        return new ErrorModel(true, errorCode, errorMessage);
    }
}
