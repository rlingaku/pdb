/*
 *  The copyright of this file belongs to FeedZai SA. The file cannot be    *
 *  reproduced in whole or in part, stored in a retrieval system,           *
 *  transmitted in any form, or by any means electronic, mechanical,        *
 *  photocopying, or otherwise, without the prior permission of the owner.  *
 *
 * (c) 2013 Feedzai SA, Rights Reserved.
 */
package com.feedzai.commons.sql.abstraction.dml.result;

import com.feedzai.commons.sql.abstraction.engine.DatabaseEngineException;
import com.feedzai.commons.sql.abstraction.engine.impl.H2Engine;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Result iterator for the {@link H2Engine} engine.
 *
 * @author Rui Vilao (rui.vilao@feedzai.com)
 */
public class H2ResultIterator extends ResultIterator {
    /**
     * Creates a new instance of {@link H2ResultIterator}.
     *
     * @param statement The statement.
     * @param sql       The sql statement.
     * @throws DatabaseEngineException If a database access error occurs.
     */
    public H2ResultIterator(Statement statement, String sql) throws DatabaseEngineException {
        super(statement, sql);
    }

    /**
     * Creates a new instance of {@link H2ResultIterator}.
     *
     * @param statement The prepared statement.
     * @throws DatabaseEngineException If a database access error occurs.
     */
    public H2ResultIterator(PreparedStatement statement) throws DatabaseEngineException {
        super(statement);
    }

    @Override
    public ResultColumn createResultColumn(String name, Object value) {
        return new H2ResultColumn(name, value);
    }
}
