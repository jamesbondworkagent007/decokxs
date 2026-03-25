package com.okinc.business.trade.features.home.ui.cefi.common;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class LimitOrderStrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitOrderStrategyType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final LimitOrderStrategyType BUY_DIP = new LimitOrderStrategyType("BUY_DIP", 0, 2);
    public static final LimitOrderStrategyType TAKE_PROFIT = new LimitOrderStrategyType("TAKE_PROFIT", 1, 3);
    public static final LimitOrderStrategyType STOP_LOSS = new LimitOrderStrategyType("STOP_LOSS", 2, 4);
    public static final LimitOrderStrategyType CHASE_HIGH = new LimitOrderStrategyType("CHASE_HIGH", 3, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitOrderStrategyType[] $values() {
        return new LimitOrderStrategyType[]{BUY_DIP, TAKE_PROFIT, STOP_LOSS, CHASE_HIGH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitOrderStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private LimitOrderStrategyType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LimitOrderStrategyType[] limitOrderStrategyTypeArr$values = $values();
        $VALUES = limitOrderStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitOrderStrategyTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.LimitOrderStrategyType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final LimitOrderStrategyType KWHzl(int i) {
            LimitOrderStrategyType next;
            Iterator<LimitOrderStrategyType> it = LimitOrderStrategyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == i) {
                    break;
                }
            }
            LimitOrderStrategyType limitOrderStrategyType = next;
            return limitOrderStrategyType == null ? LimitOrderStrategyType.BUY_DIP : limitOrderStrategyType;
        }
    }

    public static LimitOrderStrategyType valueOf(String str) {
        return (LimitOrderStrategyType) Enum.valueOf(LimitOrderStrategyType.class, str);
    }

    public static LimitOrderStrategyType[] values() {
        return (LimitOrderStrategyType[]) $VALUES.clone();
    }
}
