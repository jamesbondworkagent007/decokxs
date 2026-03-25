package com.welie.blessed;

/* JADX INFO: loaded from: classes24.dex */
public enum ConnectionPriority {
    BALANCED(0),
    HIGH(1),
    LOW_POWER(2);

    public final int value;

    ConnectionPriority(int i) {
        this.value = i;
    }
}
