package com.okinc.business.market.common.constants;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.market.common.constants.RankingType;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RankingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RankingType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final RankingType DEFAULT = new RankingType("DEFAULT", 0, 0);

    @SerialName("1")
    public static final RankingType PRICE = new RankingType("PRICE", 1, 1);

    @SerialName("2")
    public static final RankingType CHANGE = new RankingType("CHANGE", 2, 2);

    @SerialName("3")
    public static final RankingType TRANSACTION = new RankingType("TRANSACTION", 3, 3);

    @SerialName("4")
    public static final RankingType UNIQUE_TRADER = new RankingType("UNIQUE_TRADER", 4, 4);

    @SerialName("5")
    public static final RankingType TURNOVER = new RankingType("TURNOVER", 5, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final RankingType MARKET_CAP = new RankingType("MARKET_CAP", 6, 6);

    @SerialName("7")
    public static final RankingType LIQUIDITY = new RankingType("LIQUIDITY", 7, 7);

    @SerialName("8")
    public static final RankingType TOKEN_AGE = new RankingType("TOKEN_AGE", 8, 8);

    @SerialName("9")
    public static final RankingType SEARCH = new RankingType("SEARCH", 9, 9);

    @SerialName("10")
    public static final RankingType HOLDER = new RankingType("HOLDER", 10, 10);

    @SerialName("11")
    public static final RankingType MENTIONED_COUNT = new RankingType("MENTIONED_COUNT", 11, 11);

    @SerialName("12")
    public static final RankingType SOCIAL_SCORE = new RankingType("SOCIAL_SCORE", 12, 12);

    @SerialName("13")
    public static final RankingType BULLISH_COUNT = new RankingType("BULLISH_COUNT", 13, 13);

    @SerialName("14")
    public static final RankingType INFLOW = new RankingType("INFLOW", 14, 14);

    @SerialName("15")
    public static final RankingType TOKEN_SCORE = new RankingType("TOKEN_SCORE", 15, 15);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RankingType[] $values() {
        return new RankingType[]{DEFAULT, PRICE, CHANGE, TRANSACTION, UNIQUE_TRADER, TURNOVER, MARKET_CAP, LIQUIDITY, TOKEN_AGE, SEARCH, HOLDER, MENTIONED_COUNT, SOCIAL_SCORE, BULLISH_COUNT, INFLOW, TOKEN_SCORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RankingType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RankingType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RankingType[] rankingTypeArr$values = $values();
        $VALUES = rankingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rankingTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RankingType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.common.constants.RankingType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RankingType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RankingType> serializer() {
            return copydefault();
        }

        public static /* synthetic */ RankingType fromValue$default(Companion companion, int i, RankingType rankingType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                rankingType = RankingType.SEARCH;
            }
            return companion.OLrzqt(i, rankingType);
        }

        public final RankingType OLrzqt(int i, @NotNull RankingType rankingType) {
            RankingType next;
            Intrinsics.checkNotNullParameter(rankingType, "");
            Iterator<RankingType> it = RankingType.getEntries().iterator();
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
            RankingType rankingType2 = next;
            return rankingType2 == null ? rankingType : rankingType2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.common.constants.RankingType", values(), new String[]{"0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9", "10", "11", "12", "13", "14", "15"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    public static RankingType valueOf(String str) {
        return (RankingType) Enum.valueOf(RankingType.class, str);
    }

    public static RankingType[] values() {
        return (RankingType[]) $VALUES.clone();
    }
}
