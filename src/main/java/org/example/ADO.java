package org.example;

import io.micrometer.common.KeyValue;

import io.micrometer.observation.Observation;

import io.micrometer.observation.ObservationConvention;

public class ADO implements Observation {
    @Override
    public Observation contextualName(String contextualName) {
        return this;
    }

    @Override
    public Observation parentObservation(Observation parentObservation) {

        return this;
    }

    @Override
    public Observation lowCardinalityKeyValue(KeyValue keyValue) {

        return this;
    }

    @Override
    public Observation highCardinalityKeyValue(KeyValue keyValue) {

        return this;
    }

    @Override
    public Observation observationConvention(ObservationConvention<?> observationConvention) {

        System.out.println("Print obser conv name:"+observationConvention.getName());

        return this;
    }

    @Override
    public Observation error(Throwable error) {

        System.out.println("Print obser error message:"+error.getMessage());

        return this;
    }

    @Override
    public Observation event(Event event) {

        System.out.println("Print obser event name:"+event.getName());

        return this;
    }

    @Override
    public Observation start() {
        return this;
    }

    @Override
    public Context getContext() {

        return new Context();
    }

    @Override
    public void stop() {

    }

    @Override
    public Scope openScope() {g

        return Scope.NOOP;
    }
}
