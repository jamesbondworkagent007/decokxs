package com.welie.blessed;

/* JADX INFO: loaded from: classes12.dex */
public enum BondState {
    NONE(10),
    BONDING(11),
    BONDED(12);

    public final int value;

    BondState(int i) {
        this.value = i;
    }

    public static BondState fromValue(int i) {
        for (BondState bondState : values()) {
            if (bondState.value == i) {
                return bondState;
            }
        }
        return NONE;
    }
}
