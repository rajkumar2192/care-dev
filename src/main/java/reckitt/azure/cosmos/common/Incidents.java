// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package reckitt.azure.cosmos.common;

import reckitt.azure.cosmos.temp.DummyProduct;
import reckitt.azure.cosmos.temp.DummySummary;

public class Incidents {
 
    public static Incident getIncident1() {

        DummyProduct product = new DummyProduct();
        DummySummary summary = new DummySummary();

        Incident incident = new Incident();
        incident.setIncidentNumber("R071188980");
        incident.setSummary(summary.getSummary());
        incident.setProduct(product.getProducts());
        incident.setPartitionKey("R071188980");

        return incident;
    }
}
