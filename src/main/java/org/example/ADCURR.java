package org.example;

import io.micrometer.observation.Observation;

public class ADCURR implements Observation.Scope{
    @Override
    public Observation getCurrentObservation() {

        return new ADO();
    }

    @Override
    public void close() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void makeCurrent() {

    }
}
