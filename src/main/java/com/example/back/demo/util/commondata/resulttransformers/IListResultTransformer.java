package com.example.back.demo.util.commondata.resulttransformers;

import org.hibernate.transform.ResultTransformer;

import java.util.List;

@FunctionalInterface
public interface IListResultTransformer extends ResultTransformer {

    /**
     * Default implementation returning the tuples list as-is.
     *
     * @param tuples tuples list
     * @return tuples list
     */
    @Override
    default List transformList(List tuples) {
        return tuples;
    }
}