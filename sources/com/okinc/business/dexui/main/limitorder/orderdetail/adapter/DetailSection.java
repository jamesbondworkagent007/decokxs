package com.okinc.business.dexui.main.limitorder.orderdetail.adapter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class DetailSection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DetailSection[] $VALUES;
    public static final DetailSection OrderInfo = new DetailSection("OrderInfo", 0);
    public static final DetailSection TradeInfo = new DetailSection("TradeInfo", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DetailSection[] $values() {
        return new DetailSection[]{OrderInfo, TradeInfo};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DetailSection> getEntries() {
        return $ENTRIES;
    }

    static {
        DetailSection[] detailSectionArr$values = $values();
        $VALUES = detailSectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(detailSectionArr$values);
    }

    private DetailSection(String str, int i) {
    }

    public static DetailSection valueOf(String str) {
        return (DetailSection) Enum.valueOf(DetailSection.class, str);
    }

    public static DetailSection[] values() {
        return (DetailSection[]) $VALUES.clone();
    }
}
