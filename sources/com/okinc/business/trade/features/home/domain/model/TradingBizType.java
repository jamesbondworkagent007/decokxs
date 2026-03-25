package com.okinc.business.trade.features.home.domain.model;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31200lpY;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TradingBizType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradingBizType[] $VALUES;
    public static final ActionBar Companion;
    private final String type;
    public static final TradingBizType Simple = new TradingBizType("Simple", 0, "Simple");
    public static final TradingBizType Meme = new TradingBizType("Meme", 1, "Meme");
    public static final TradingBizType AdvancedMarket = new TradingBizType("AdvancedMarket", 2, "AdvancedMarket");
    public static final TradingBizType Advanced = new TradingBizType("Advanced", 3, "Advanced");
    public static final TradingBizType Limit = new TradingBizType("Limit", 4, "Limit");
    public static final TradingBizType Bridge = new TradingBizType("Bridge", 5, "Bridge");
    public static final TradingBizType Market = new TradingBizType("Market", 6, "Market");

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingBizType.values().length];
            try {
                iArr[TradingBizType.Market.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradingBizType.AdvancedMarket.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingBizType.Limit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingBizType.Simple.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingBizType.Meme.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradingBizType.Advanced.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradingBizType.Bridge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradingBizType[] $values() {
        return new TradingBizType[]{Simple, Meme, AdvancedMarket, Advanced, Limit, Bridge, Market};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradingBizType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private TradingBizType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        TradingBizType[] tradingBizTypeArr$values = $values();
        $VALUES = tradingBizTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradingBizTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.domain.model.TradingBizType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TradingBizType OLrzqt(@NotNull String str) {
            TradingBizType tradingBizType;
            Intrinsics.checkNotNullParameter(str, "");
            TradingBizType[] tradingBizTypeArrValues = TradingBizType.values();
            int length = tradingBizTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tradingBizType = null;
                    break;
                }
                tradingBizType = tradingBizTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) tradingBizType.getType(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tradingBizType == null ? TradingBizType.Simple : tradingBizType;
        }
    }

    public final int toTokenListType() {
        switch (Activity.OLrzqt[ordinal()]) {
            case 1:
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return ((Number) C31200lpY.copydefault(0, new Exception("Bridge is not supported"))).intValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TradingBizType valueOf(String str) {
        return (TradingBizType) Enum.valueOf(TradingBizType.class, str);
    }

    public static TradingBizType[] values() {
        return (TradingBizType[]) $VALUES.clone();
    }
}
