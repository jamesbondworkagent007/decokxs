package com.okinc.business.dexui.main.market.base;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ActionOnMarketDetail {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ActionOnMarketDetail[] $VALUES;
    public static final ActionOnMarketDetail ADDRESS_COPY = new ActionOnMarketDetail("ADDRESS_COPY", 0, "address_click");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ActionOnMarketDetail[] $values() {
        return new ActionOnMarketDetail[]{ADDRESS_COPY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ActionOnMarketDetail> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ActionOnMarketDetail(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ActionOnMarketDetail[] actionOnMarketDetailArr$values = $values();
        $VALUES = actionOnMarketDetailArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(actionOnMarketDetailArr$values);
    }

    public static ActionOnMarketDetail valueOf(String str) {
        return (ActionOnMarketDetail) Enum.valueOf(ActionOnMarketDetail.class, str);
    }

    public static ActionOnMarketDetail[] values() {
        return (ActionOnMarketDetail[]) $VALUES.clone();
    }
}
