package com.example.andrewtran.dectetdemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by andrewtran on 3/3/18.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
@interface FoundationalTestsScope {
}