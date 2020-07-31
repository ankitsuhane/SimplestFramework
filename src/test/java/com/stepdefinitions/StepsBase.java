package com.stepdefinitions;

import org.springframework.test.context.ContextConfiguration;

import com.AppConfig;

import cucumber.api.java8.En;

/**
 * This class bootstraps the Spring Config for the test to run.
 *
 */
@ContextConfiguration(classes = {AppConfig.class})
public class StepsBase implements En {
}