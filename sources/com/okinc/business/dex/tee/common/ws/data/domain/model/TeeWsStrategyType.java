package com.okinc.business.dex.tee.common.ws.data.domain.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C31200lpY;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class TeeWsStrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TeeWsStrategyType[] $VALUES;
    public static final ActionBar Companion;
    public static final TeeWsStrategyType MarketBuy = new TeeWsStrategyType("MarketBuy", 0, 8);
    public static final TeeWsStrategyType MarketSell = new TeeWsStrategyType("MarketSell", 1, 9);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TeeWsStrategyType[] $values() {
        return new TeeWsStrategyType[]{MarketBuy, MarketSell};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TeeWsStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private TeeWsStrategyType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        TeeWsStrategyType[] teeWsStrategyTypeArr$values = $values();
        $VALUES = teeWsStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(teeWsStrategyTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsStrategyType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TeeWsStrategyType copydefault(int i) {
            TeeWsStrategyType next;
            Iterator<TeeWsStrategyType> it = TeeWsStrategyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getType() == i) {
                    break;
                }
            }
            TeeWsStrategyType teeWsStrategyType = next;
            if (teeWsStrategyType != null) {
                return teeWsStrategyType;
            }
            return (TeeWsStrategyType) C31200lpY.copydefault(TeeWsStrategyType.MarketBuy, "Unsupported MemeOrderStrategyType type:" + i);
        }
    }

    public static TeeWsStrategyType valueOf(String str) {
        return (TeeWsStrategyType) Enum.valueOf(TeeWsStrategyType.class, str);
    }

    public static TeeWsStrategyType[] values() {
        return (TeeWsStrategyType[]) $VALUES.clone();
    }
}
