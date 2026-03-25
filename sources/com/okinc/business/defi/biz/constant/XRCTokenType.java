package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class XRCTokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ XRCTokenType[] $VALUES;
    public static final XRCTokenType Brc20Token = new XRCTokenType("Brc20Token", 0);
    public static final XRCTokenType Brc20sToken = new XRCTokenType("Brc20sToken", 1);
    public static final XRCTokenType Arc20Token = new XRCTokenType("Arc20Token", 2);
    public static final XRCTokenType SRC20Token = new XRCTokenType("SRC20Token", 3);
    public static final XRCTokenType RunesToken = new XRCTokenType("RunesToken", 4);
    public static final XRCTokenType RunesMainToken = new XRCTokenType("RunesMainToken", 5);
    public static final XRCTokenType Brc20ForFBTCToken = new XRCTokenType("Brc20ForFBTCToken", 6);
    public static final XRCTokenType RunesMainForFBTCToken = new XRCTokenType("RunesMainForFBTCToken", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ XRCTokenType[] $values() {
        return new XRCTokenType[]{Brc20Token, Brc20sToken, Arc20Token, SRC20Token, RunesToken, RunesMainToken, Brc20ForFBTCToken, RunesMainForFBTCToken};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<XRCTokenType> getEntries() {
        return $ENTRIES;
    }

    private XRCTokenType(String str, int i) {
    }

    static {
        XRCTokenType[] xRCTokenTypeArr$values = $values();
        $VALUES = xRCTokenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(xRCTokenTypeArr$values);
    }

    public static XRCTokenType valueOf(String str) {
        return (XRCTokenType) Enum.valueOf(XRCTokenType.class, str);
    }

    public static XRCTokenType[] values() {
        return (XRCTokenType[]) $VALUES.clone();
    }
}
