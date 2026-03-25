package com.okinc.tradelite.bean;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class MainTradeTab {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MainTradeTab[] $VALUES;
    public static final StateListAnimator Companion;
    private static final Map<Integer, MainTradeTab> map;
    private final int tabInt;
    public static final MainTradeTab NONE = new MainTradeTab("NONE", 0, 0);
    public static final MainTradeTab CHART = new MainTradeTab("CHART", 1, 1);
    public static final MainTradeTab ORDER_BOOK = new MainTradeTab("ORDER_BOOK", 2, 2);
    public static final MainTradeTab LAST_TRADES = new MainTradeTab("LAST_TRADES", 3, 3);
    public static final MainTradeTab FEED = new MainTradeTab("FEED", 4, 4);
    public static final MainTradeTab OPEN_ORDERS = new MainTradeTab("OPEN_ORDERS", 5, 5);
    public static final MainTradeTab ASSETS = new MainTradeTab("ASSETS", 6, 6);
    public static final MainTradeTab TRADING_BOTS = new MainTradeTab("TRADING_BOTS", 7, 7);
    public static final MainTradeTab LEAD_TRADES = new MainTradeTab("LEAD_TRADES", 8, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MainTradeTab[] $values() {
        return new MainTradeTab[]{NONE, CHART, ORDER_BOOK, LAST_TRADES, FEED, OPEN_ORDERS, ASSETS, TRADING_BOTS, LEAD_TRADES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MainTradeTab> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabInt() {
        return this.tabInt;
    }

    private MainTradeTab(String str, int i, int i2) {
        this.tabInt = i2;
    }

    static {
        MainTradeTab[] mainTradeTabArr$values = $values();
        $VALUES = mainTradeTabArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mainTradeTabArr$values);
        Companion = new StateListAnimator(null);
        Object[] array = getEntries().toArray(new MainTradeTab[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(array.length), 16));
        for (Object obj : array) {
            linkedHashMap.put(Integer.valueOf(((MainTradeTab) obj).tabInt), obj);
        }
        map = linkedHashMap;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradelite.bean.MainTradeTab.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static MainTradeTab valueOf(String str) {
        return (MainTradeTab) Enum.valueOf(MainTradeTab.class, str);
    }

    public static MainTradeTab[] values() {
        return (MainTradeTab[]) $VALUES.clone();
    }
}
