package com.welie.blessed;

/* JADX INFO: loaded from: classes12.dex */
public enum ScanMode {
    OPPORTUNISTIC(-1),
    BALANCED(1),
    LOW_LATENCY(2),
    LOW_POWER(0);

    public final int value;

    ScanMode(int i) {
        this.value = i;
    }
}
