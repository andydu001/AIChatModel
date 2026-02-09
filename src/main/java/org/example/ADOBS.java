package org.example;

import io.micrometer.observation.Observation;

import io.micrometer.observation.ObservationRegistry;

public class ADOBS implements ObservationRegistry {

  private   ADCURR adcurr;

  ADOBS(ADCURR adcurr){

      this.adcurr = adcurr;
  }
    @Override
    public Observation getCurrentObservation() {
        return new ADO();
    }

    @Override
    public Observation.Scope getCurrentObservationScope() {
        return this.adcurr;
    }

    @Override
    public void setCurrentObservationScope(Observation.Scope current) {
       this.adcurr = (ADCURR) current;
    }

    @Override
    public ObservationConfig observationConfig() {
        return new ObservationConfig();
    }
}
