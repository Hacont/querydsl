/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.sql.types;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

/**
 * @author tiwe
 *
 */
public class ShortType extends AbstractNumberType<Short>{

    @Override
    public Class<Short> getReturnedClass() {
        return Short.class;
    }

    @Override
    public void setValue(PreparedStatement st, int startIndex, Short value) throws SQLException {
        st.setShort(startIndex, value);
    }

    @Override
    public int[] getSQLTypes() {
        return new int[]{Types.SMALLINT};
    }

}