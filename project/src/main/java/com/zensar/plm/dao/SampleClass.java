package com.zensar.plm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zensar.plm.bean.Sample;
import com.zensar.plm.connection.Connect;

/**
 * SampleClass
 */
public class SampleClass implements SampleService<Boolean, Sample> {

    Connection connection;
    PreparedStatement pStatement;

    public SampleClass() {
        connection = Connect.getConnection();
    }

    @Override
    public Boolean insert(Sample param) {
        boolean status = false;
        try {
            pStatement = connection.prepareStatement("insert into jobs values(?,?)");
            pStatement.setInt(1, param.getId());
            pStatement.setString(2, param.getName());

            if (pStatement.executeUpdate() > 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

}