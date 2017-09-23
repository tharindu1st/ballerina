/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.ballerinalang.net.http.nativeimpl.response;

import org.ballerinalang.bre.Context;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BValue;
import org.ballerinalang.natives.AbstractNativeFunction;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.net.http.HttpUtil;

/**
 * Native function to remove given header to carbon message.
 * ballerina.model.messages:removeHeader
 */
@BallerinaFunction(
        packageName = "ballerina.net.http.response",
        functionName = "removeHeader",
        args = {@Argument(name = "res", type = TypeKind.STRUCT, structType = "Response",
                          structPackage = "ballerina.net.http"),
                @Argument(name = "key", type = TypeKind.STRING)},
        isPublic = true
)
public class RemoveHeader extends AbstractNativeFunction {

    @Override
    public BValue[] execute(Context context) {
        return HttpUtil.removeHeader(context, this);
    }
}
