package org.ff4j.couchdb;

/*
 * #%L
 * ff4j-store-couchdb
 * %%
 * Copyright (C) 2013 - 2019 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.View;
import org.ff4j.couchdb.document.CouchDbProperty;

import static org.ff4j.couchdb.CouchDbConstants.DEFAULT_PROPERTY_TYPE;

@View(name = "all", map = "function(doc) {if (doc.type == '" + DEFAULT_PROPERTY_TYPE + "' ) emit( null, doc._id )}")
public class CouchDbPropertyView extends CouchDbRepositorySupport<CouchDbProperty> {

    public CouchDbPropertyView(CouchDbConnector db) {
        super(CouchDbProperty.class, db);
    }
}
