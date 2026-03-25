package com.okinc.business.trade.features.home.ui.cefi.common;

import com.okinc.business.market.features.chart.domain.ChartType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedLimitBy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedLimitBy[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final AdvancedLimitBy Price = new AdvancedLimitBy("Price", 0, 1);
    public static final AdvancedLimitBy MCap = new AdvancedLimitBy("MCap", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedLimitBy[] $values() {
        return new AdvancedLimitBy[]{Price, MCap};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedLimitBy> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AdvancedLimitBy(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AdvancedLimitBy[] advancedLimitByArr$values = $values();
        $VALUES = advancedLimitByArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedLimitByArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AdvancedLimitBy.values().length];
                try {
                    iArr[AdvancedLimitBy.Price.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdvancedLimitBy.MCap.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AdvancedLimitBy OLrzqt(int i) {
            AdvancedLimitBy advancedLimitBy;
            AdvancedLimitBy[] advancedLimitByArrValues = AdvancedLimitBy.values();
            int length = advancedLimitByArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    advancedLimitBy = null;
                    break;
                }
                advancedLimitBy = advancedLimitByArrValues[i2];
                if (advancedLimitBy.getValue() == i) {
                    break;
                }
                i2++;
            }
            return advancedLimitBy == null ? AdvancedLimitBy.Price : advancedLimitBy;
        }

        public final ChartType KWHzl(@NotNull AdvancedLimitBy advancedLimitBy) {
            Intrinsics.checkNotNullParameter(advancedLimitBy, "");
            int i = Application.copydefault[advancedLimitBy.ordinal()];
            if (i == 1) {
                return ChartType.PRICE;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return ChartType.MARKET_CAP;
        }
    }

    public static AdvancedLimitBy valueOf(String str) {
        return (AdvancedLimitBy) Enum.valueOf(AdvancedLimitBy.class, str);
    }

    public static AdvancedLimitBy[] values() {
        return (AdvancedLimitBy[]) $VALUES.clone();
    }
}
