package demo.utils;

import demo.client.Sensor;
import demo.message.DataMessage;

import java.util.function.Function;

public class MessageMapper implements Function<Sensor, DataMessage> {
    private static final TimeUtil timeUtil = new TimeUtil();
    @Override
    public DataMessage apply(Sensor sensor) {
        return new DataMessage(sensor.getId(),
                sensor.getHumidity(),
                timeUtil.format(sensor.getTimestamp()));
    }
}
