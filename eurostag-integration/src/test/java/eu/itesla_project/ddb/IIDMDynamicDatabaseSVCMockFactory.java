package eu.itesla_project.ddb; /**
 * Copyright (c) 2017, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */


/**
 * @author Christian Biasuzzi <christian.biasuzzi@techrain.it>
 */
public class IIDMDynamicDatabaseSVCMockFactory implements DynamicDatabaseClientFactory {

    @Override
    public DynamicDatabaseClient create(boolean cache) {
        return new DynamicDatabaseSVCMock();
    }

}
