/*
 * TODO: Copyright (C) 2017 LEIDOS.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **/

package gov.dot.fhwa.saxton.carma.interfacemgr;

import java.util.List;

public interface IInterfaceMgr {

    /**
     * Binds with the specified driver node.
     *
     * @param driverName - name of the driver's bind topic
     */
    void bindWithDriver(String driverName);


    /**
     * Requests the given driver's specific list of data capabilities.
     *
     * @param driverName - name of the driver's api topic
     * @return - a list of data elements available from the driver
     */
    List<String> getDriverApi(String driverName);


    /**
     * Generates a message on the system_alert topic that all nodes listen to.  Typically
     * a handler for a detected broken driver bond.
     * Note that this is not the callback to be provided to the driver's bind service.
     *
     * @param sev - severity of the problem
     * @param message - description of the problem
     */
    void sendSystemAlert(AlertSeverity sev, String message);
}