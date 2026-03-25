package com.okinc.tradeapi.framework.constant;

import com.google.android.gms.stats.CodePackage;
import o.C56444yFp;
import o.InterfaceC49422uoJ;
import o.InterfaceC49424uoL;
import o.InterfaceC49426uoN;
import o.InterfaceC49428uoP;
import o.InterfaceC49429uoQ;
import o.InterfaceC49430uoR;
import o.InterfaceC49431uoS;
import o.InterfaceC49497upf;
import o.InterfaceC54577xNn;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class TradeKey {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeKey[] $VALUES;
    private Class<? extends InterfaceC49424uoL> clazz;
    public static final TradeKey TRADE_UI = new TradeKey("TRADE_UI", 0, InterfaceC49497upf.class);
    public static final TradeKey COMMON_COIN = new TradeKey("COMMON_COIN", 1, InterfaceC49426uoN.class);
    public static final TradeKey COMMON = new TradeKey(CodePackage.COMMON, 2, InterfaceC49422uoJ.class);
    public static final TradeKey TRADE_SWITCH = new TradeKey("TRADE_SWITCH", 3, InterfaceC49429uoQ.class);
    public static final TradeKey TRADE_ORDER_LEAD = new TradeKey("TRADE_ORDER_LEAD", 4, InterfaceC49430uoR.class);
    public static final TradeKey ORDER = new TradeKey("ORDER", 5, InterfaceC49428uoP.class);
    public static final TradeKey DEPTH = new TradeKey("DEPTH", 6, InterfaceC49431uoS.class);
    public static final TradeKey MANAGER = new TradeKey("MANAGER", 7, InterfaceC54577xNn.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeKey[] $values() {
        return new TradeKey[]{TRADE_UI, COMMON_COIN, COMMON, TRADE_SWITCH, TRADE_ORDER_LEAD, ORDER, DEPTH, MANAGER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeKey> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Class<? extends InterfaceC49424uoL> getClazz() {
        Class<? extends InterfaceC49424uoL> cls = this.clazz;
        return cls == null ? InterfaceC49424uoL.class : cls;
    }

    static {
        TradeKey[] tradeKeyArr$values = $values();
        $VALUES = tradeKeyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeKeyArr$values);
    }

    private TradeKey(String str, int i, Class cls) {
        this.clazz = cls;
    }

    public static TradeKey valueOf(String str) {
        return (TradeKey) Enum.valueOf(TradeKey.class, str);
    }

    public static TradeKey[] values() {
        return (TradeKey[]) $VALUES.clone();
    }
}
