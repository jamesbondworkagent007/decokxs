package com.welie.blessed;

/* JADX INFO: loaded from: classes12.dex */
public enum WriteType {
    WITH_RESPONSE(2, 8),
    WITHOUT_RESPONSE(1, 4),
    SIGNED(4, 64);

    public final int property;
    public final int writeType;

    WriteType(int i, int i2) {
        this.writeType = i;
        this.property = i2;
    }
}
