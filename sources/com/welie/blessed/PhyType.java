package com.welie.blessed;

/* JADX INFO: loaded from: classes17.dex */
public enum PhyType {
    LE_1M(1, 1),
    LE_2M(2, 2),
    LE_CODED(3, 4),
    UNKNOWN_PHY_TYPE(-1, -1);

    public final int mask;
    public final int value;

    PhyType(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }

    public static PhyType fromValue(int i) {
        for (PhyType phyType : values()) {
            if (phyType.value == i) {
                return phyType;
            }
        }
        return UNKNOWN_PHY_TYPE;
    }
}
