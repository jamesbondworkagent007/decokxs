package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.business.dexlogic.bean.TransactionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedTradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedTradeType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final AdvancedTradeType BUY = new AdvancedTradeType("BUY", 0);
    public static final AdvancedTradeType SELL = new AdvancedTradeType("SELL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedTradeType[] $values() {
        return new AdvancedTradeType[]{BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedTradeType> getEntries() {
        return $ENTRIES;
    }

    private AdvancedTradeType(String str, int i) {
    }

    static {
        AdvancedTradeType[] advancedTradeTypeArr$values = $values();
        $VALUES = advancedTradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedTradeTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {

        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AdvancedTradeType.values().length];
                try {
                    iArr[AdvancedTradeType.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvancedTradeType.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final TransactionType EZpvd(@NotNull AdvancedTradeType advancedTradeType) {
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            int i = ActionBar.AEQbTJ[advancedTradeType.ordinal()];
            if (i == 1) {
                return TransactionType.Buy;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return TransactionType.Sell;
        }
    }

    public static AdvancedTradeType valueOf(String str) {
        return (AdvancedTradeType) Enum.valueOf(AdvancedTradeType.class, str);
    }

    public static AdvancedTradeType[] values() {
        return (AdvancedTradeType[]) $VALUES.clone();
    }
}
