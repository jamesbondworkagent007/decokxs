package com.okinc.assets.backend.api.model;

import com.google.gson.annotations.SerializedName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class RiskWarningType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskWarningType[] $VALUES;

    @SerializedName("0")
    public static final RiskWarningType Media = new RiskWarningType("Media", 0, 0);

    @SerializedName("1")
    public static final RiskWarningType Radio = new RiskWarningType("Radio", 1, 1);

    @SerializedName("2")
    public static final RiskWarningType Text = new RiskWarningType("Text", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskWarningType[] $values() {
        return new RiskWarningType[]{Media, Radio, Text};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskWarningType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RiskWarningType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RiskWarningType[] riskWarningTypeArr$values = $values();
        $VALUES = riskWarningTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskWarningTypeArr$values);
    }

    public static RiskWarningType valueOf(String str) {
        return (RiskWarningType) Enum.valueOf(RiskWarningType.class, str);
    }

    public static RiskWarningType[] values() {
        return (RiskWarningType[]) $VALUES.clone();
    }
}
