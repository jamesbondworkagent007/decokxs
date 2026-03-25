package com.okinc.business.invest_biz.data.bean;

import kotlinx.serialization.SerialName;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class InvestClickActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestClickActionType[] $VALUES;

    @SerialName("CUSTOM_REDIRECT")
    public static final InvestClickActionType CUSTOM_REDIRECT = new InvestClickActionType("CUSTOM_REDIRECT", 0);

    @SerialName("HOVER_ON")
    public static final InvestClickActionType HOVER_ON = new InvestClickActionType("HOVER_ON", 1);

    @SerialName("NO_ACTION")
    public static final InvestClickActionType NO_ACTION = new InvestClickActionType("NO_ACTION", 2);

    @SerialName("POPUP")
    public static final InvestClickActionType POPUP = new InvestClickActionType("POPUP", 3);

    @SerialName("REDIRECT")
    public static final InvestClickActionType REDIRECT = new InvestClickActionType("REDIRECT", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestClickActionType[] $values() {
        return new InvestClickActionType[]{CUSTOM_REDIRECT, HOVER_ON, NO_ACTION, POPUP, REDIRECT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestClickActionType> getEntries() {
        return $ENTRIES;
    }

    private InvestClickActionType(String str, int i) {
    }

    static {
        InvestClickActionType[] investClickActionTypeArr$values = $values();
        $VALUES = investClickActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investClickActionTypeArr$values);
    }

    public static InvestClickActionType valueOf(String str) {
        return (InvestClickActionType) Enum.valueOf(InvestClickActionType.class, str);
    }

    public static InvestClickActionType[] values() {
        return (InvestClickActionType[]) $VALUES.clone();
    }
}
