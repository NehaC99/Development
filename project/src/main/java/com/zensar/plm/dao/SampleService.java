package com.zensar.plm.dao;

/**
 * SampleService
 */
public interface SampleService<Return, Param> {

    Return insert(Param param);
}