package com.okinc.okrisk.collection.sensors;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class SensorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SensorType[] $VALUES;
    private final int code;
    public static final SensorType ACCELEROMETER = new SensorType("ACCELEROMETER", 0, 1);
    public static final SensorType GYROSCOPE = new SensorType("GYROSCOPE", 1, 2);
    public static final SensorType MAGNETOMETER = new SensorType("MAGNETOMETER", 2, 3);
    public static final SensorType GRAVITY = new SensorType("GRAVITY", 3, 4);
    public static final SensorType ALL = new SensorType("ALL", 4, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SensorType[] $values() {
        return new SensorType[]{ACCELEROMETER, GYROSCOPE, MAGNETOMETER, GRAVITY, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SensorType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private SensorType(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        SensorType[] sensorTypeArr$values = $values();
        $VALUES = sensorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sensorTypeArr$values);
    }

    public static SensorType valueOf(String str) {
        return (SensorType) Enum.valueOf(SensorType.class, str);
    }

    public static SensorType[] values() {
        return (SensorType[]) $VALUES.clone();
    }
}
