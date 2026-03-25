package com.okinc.unify_trade.constants;

import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class KLineConfigType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KLineConfigType[] $VALUES;
    private final String value;
    public static final KLineConfigType CLOSE = new KLineConfigType(InvestButtonAction.ACTION_CALLBACK_CLOSE, 0, "3");
    public static final KLineConfigType TOP = new KLineConfigType("TOP", 1, "1");
    public static final KLineConfigType BOTTOM = new KLineConfigType(InvestPopUpData.POSITION_BOTTOM, 2, "2");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KLineConfigType[] $values() {
        return new KLineConfigType[]{CLOSE, TOP, BOTTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KLineConfigType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private KLineConfigType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        KLineConfigType[] kLineConfigTypeArr$values = $values();
        $VALUES = kLineConfigTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kLineConfigTypeArr$values);
    }

    public static KLineConfigType valueOf(String str) {
        return (KLineConfigType) Enum.valueOf(KLineConfigType.class, str);
    }

    public static KLineConfigType[] values() {
        return (KLineConfigType[]) $VALUES.clone();
    }
}
