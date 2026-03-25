package com.okinc.business.dexui.main.swap.setting.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class NetWorkFeeShowType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetWorkFeeShowType[] $VALUES;
    public static final NetWorkFeeShowType FREE_WITH_FEE_CROSSED = new NetWorkFeeShowType("FREE_WITH_FEE_CROSSED", 0);
    public static final NetWorkFeeShowType NOT_FREE = new NetWorkFeeShowType("NOT_FREE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetWorkFeeShowType[] $values() {
        return new NetWorkFeeShowType[]{FREE_WITH_FEE_CROSSED, NOT_FREE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetWorkFeeShowType> getEntries() {
        return $ENTRIES;
    }

    private NetWorkFeeShowType(String str, int i) {
    }

    static {
        NetWorkFeeShowType[] netWorkFeeShowTypeArr$values = $values();
        $VALUES = netWorkFeeShowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(netWorkFeeShowTypeArr$values);
    }

    public static NetWorkFeeShowType valueOf(String str) {
        return (NetWorkFeeShowType) Enum.valueOf(NetWorkFeeShowType.class, str);
    }

    public static NetWorkFeeShowType[] values() {
        return (NetWorkFeeShowType[]) $VALUES.clone();
    }
}
