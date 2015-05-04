/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.liquidacion.dao.impl;


import java.util.List;

import org.apache.camel.example.liquidacion.dao.IncidentDAO;
import org.apache.camel.example.liquidacion.model.Incident;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class IncidentDAOImpl implements IncidentDAO
{

	private static final transient Log LOG = LogFactory.getLog(IncidentDAOImpl.class);
	
    /**
     * Sets the session factory.
     * 
     * @param sessionFactory the new session factory
     */
  
    /*
     * (non-Javadoc)
     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#findIncident()
     */
    public List<Incident> findIncident()
    {

        return null;

    }

    /*
     * (non-Javadoc)
     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#findIncident(java.lang.String)
     */
    public List<Incident> findIncident( String key )
    {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#getIncident(long)
     */
    public Incident getIncident( long id )
    {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#removeIncident(long)
     */
    public void removeIncident( long id )
    {

    }

    /*
     * (non-Javadoc)
     * @see org.apache.camel.example.reportincident.dao.IncidentDAO#saveIncident(org.apache.camel.example.reportincident.model.Incident)
     */
    public void saveIncident( Incident Incident )
    {
    }

}
