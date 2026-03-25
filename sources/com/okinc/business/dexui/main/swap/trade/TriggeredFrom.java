package com.okinc.business.dexui.main.swap.trade;

import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmEntryType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TriggeredFrom {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TriggeredFrom[] $VALUES;
    public static final TriggeredFrom SwapMarket = new TriggeredFrom("SwapMarket", 0);
    public static final TriggeredFrom SwapLimit = new TriggeredFrom("SwapLimit", 1);
    public static final TriggeredFrom AdvancedMarket = new TriggeredFrom("AdvancedMarket", 2);
    public static final TriggeredFrom AdvancedLimit = new TriggeredFrom("AdvancedLimit", 3);
    public static final TriggeredFrom CopyTrade = new TriggeredFrom("CopyTrade", 4);
    public static final TriggeredFrom MemeMarket = new TriggeredFrom("MemeMarket", 5);
    public static final TriggeredFrom Bridge = new TriggeredFrom("Bridge", 6);

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TriggeredFrom.values().length];
            try {
                iArr[TriggeredFrom.SwapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggeredFrom.AdvancedLimit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggeredFrom.CopyTrade.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TriggeredFrom[] $values() {
        return new TriggeredFrom[]{SwapMarket, SwapLimit, AdvancedMarket, AdvancedLimit, CopyTrade, MemeMarket, Bridge};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TriggeredFrom> getEntries() {
        return $ENTRIES;
    }

    private TriggeredFrom(String str, int i) {
    }

    static {
        TriggeredFrom[] triggeredFromArr$values = $values();
        $VALUES = triggeredFromArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(triggeredFromArr$values);
    }

    public final AutoConfirmEntryType toAutoConfirmEntryType() {
        int i = StateListAnimator.EZpvd[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return AutoConfirmEntryType.STRATEGY;
        }
        return AutoConfirmEntryType.MARKET;
    }

    public static TriggeredFrom valueOf(String str) {
        return (TriggeredFrom) Enum.valueOf(TriggeredFrom.class, str);
    }

    public static TriggeredFrom[] values() {
        return (TriggeredFrom[]) $VALUES.clone();
    }
}
