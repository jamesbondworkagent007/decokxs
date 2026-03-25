package com.okinc.business.market.common.constants;

import com.okinc.business.market.common.constants.RangeType;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C33129mqd;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RangeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RangeType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;
    public static final RangeType MARKET_CAP = new RangeType("MARKET_CAP", 0, 0);
    public static final RangeType TURNOVER = new RangeType("TURNOVER", 1, 1);
    public static final RangeType LIQUIDITY = new RangeType("LIQUIDITY", 2, 2);
    public static final RangeType TIME_CREATE = new RangeType("TIME_CREATE", 3, 3);
    public static final RangeType CHANGE = new RangeType("CHANGE", 4, 4);
    public static final RangeType UNIQUE_TRADER = new RangeType("UNIQUE_TRADER", 5, 5);
    public static final RangeType HOLDER = new RangeType("HOLDER", 6, 6);
    public static final RangeType TRANSACTION = new RangeType("TRANSACTION", 7, 7);
    public static final RangeType TIME_VOLUME = new RangeType("TIME_VOLUME", 8, 8);
    public static final RangeType FDV = new RangeType("FDV", 9, 9);
    public static final RangeType RISK_FILTER = new RangeType("RISK_FILTER", 10, 10);
    public static final RangeType STABLE_TOKEN_FILTER = new RangeType("STABLE_TOKEN_FILTER", 11, 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RangeType[] $values() {
        return new RangeType[]{MARKET_CAP, TURNOVER, LIQUIDITY, TIME_CREATE, CHANGE, UNIQUE_TRADER, HOLDER, TRANSACTION, TIME_VOLUME, FDV, RISK_FILTER, STABLE_TOKEN_FILTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RangeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RangeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RangeType[] rangeTypeArr$values = $values();
        $VALUES = rangeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rangeTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RangeType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.common.constants.RangeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RangeType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RangeType> serializer() {
            return copydefault();
        }

        public final RangeType OLrzqt(@NotNull String str) {
            RangeType next;
            Intrinsics.checkNotNullParameter(str, "");
            int iAhwBna = C33129mqd.AhwBna(str);
            Iterator<RangeType> it = RangeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == iAhwBna) {
                    break;
                }
            }
            RangeType rangeType = next;
            return rangeType == null ? RangeType.FDV : rangeType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.business.market.common.constants.RangeType", values());
    }

    public static RangeType valueOf(String str) {
        return (RangeType) Enum.valueOf(RangeType.class, str);
    }

    public static RangeType[] values() {
        return (RangeType[]) $VALUES.clone();
    }
}
