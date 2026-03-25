package com.okinc.business.market.data.constant;

import com.okinc.business.market.data.constant.PriceRangeValueType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PriceRangeValueType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PriceRangeValueType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("0")
    public static final PriceRangeValueType Min = new PriceRangeValueType("Min", 0, "0");

    @SerialName("1")
    public static final PriceRangeValueType Max = new PriceRangeValueType("Max", 1, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PriceRangeValueType[] $values() {
        return new PriceRangeValueType[]{Min, Max};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PriceRangeValueType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.constant.PriceRangeValueType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) PriceRangeValueType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PriceRangeValueType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.constant.PriceRangeValueType", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    private PriceRangeValueType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PriceRangeValueType[] priceRangeValueTypeArr$values = $values();
        $VALUES = priceRangeValueTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(priceRangeValueTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PriceRangeValueType._init_$_anonymous_();
            }
        });
    }

    public static PriceRangeValueType valueOf(String str) {
        return (PriceRangeValueType) Enum.valueOf(PriceRangeValueType.class, str);
    }

    public static PriceRangeValueType[] values() {
        return (PriceRangeValueType[]) $VALUES.clone();
    }
}
