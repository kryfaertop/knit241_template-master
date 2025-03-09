package org.knit.lab9.task14;


enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public TrafficLight getNextLight(TrafficLight trafficLight) {
        switch (trafficLight) {
            case RED:
                return GREEN;
            case GREEN:
                return YELLOW;
            case YELLOW:
                return RED;

        }
        return null;
    }
}



