package com.welie.blessed;

/* JADX INFO: loaded from: classes12.dex */
public enum PeripheralType {
    UNKNOWN(0),
    CLASSIC(1),
    LE(2),
    DUAL(3);

    public final int value;

    PeripheralType(int i) {
        this.value = i;
    }

    public static PeripheralType fromValue(int i) {
        for (PeripheralType peripheralType : values()) {
            if (peripheralType.value == i) {
                return peripheralType;
            }
        }
        return UNKNOWN;
    }
}
