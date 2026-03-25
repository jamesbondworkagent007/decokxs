package com.okinc.business.trade.features.home.ui.cefi.common;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TxDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TxDirection[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final TxDirection BUY = new TxDirection("BUY", 0, 0);
    public static final TxDirection SELL = new TxDirection("SELL", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TxDirection[] $values() {
        return new TxDirection[]{BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TxDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TxDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TxDirection[] txDirectionArr$values = $values();
        $VALUES = txDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(txDirectionArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] KWHzl;
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TxDirection.values().length];
                try {
                    iArr[TxDirection.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TxDirection.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
                int[] iArr2 = new int[AdvancedTradeType.values().length];
                try {
                    iArr2[AdvancedTradeType.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[AdvancedTradeType.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                copydefault = iArr2;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.TxDirection.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TxDirection KWHzl(int i) {
            TxDirection txDirection;
            TxDirection[] txDirectionArrValues = TxDirection.values();
            int length = txDirectionArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    txDirection = null;
                    break;
                }
                txDirection = txDirectionArrValues[i2];
                if (txDirection.getValue() == i) {
                    break;
                }
                i2++;
            }
            return txDirection == null ? TxDirection.BUY : txDirection;
        }

        public final AdvancedTradeType OLrzqt(@NotNull TxDirection txDirection) {
            Intrinsics.checkNotNullParameter(txDirection, "");
            int i = Activity.KWHzl[txDirection.ordinal()];
            if (i == 1) {
                return AdvancedTradeType.BUY;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return AdvancedTradeType.SELL;
        }

        public final TxDirection AEQbTJ(@NotNull AdvancedTradeType advancedTradeType) {
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            int i = Activity.copydefault[advancedTradeType.ordinal()];
            if (i == 1) {
                return TxDirection.BUY;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return TxDirection.SELL;
        }
    }

    public static TxDirection valueOf(String str) {
        return (TxDirection) Enum.valueOf(TxDirection.class, str);
    }

    public static TxDirection[] values() {
        return (TxDirection[]) $VALUES.clone();
    }
}
