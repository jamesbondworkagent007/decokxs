package com.welie.blessed;

/* JADX INFO: loaded from: classes12.dex */
public enum Transport {
    AUTO(0),
    BR_EDR(1),
    LE(2);

    public final int value;

    Transport(int i) {
        this.value = i;
    }

    public static Transport fromValue(int i) {
        for (Transport transport : values()) {
            if (transport.value == i) {
                return transport;
            }
        }
        return AUTO;
    }
}
