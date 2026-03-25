package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.invest_biz.data.contants.RateType;
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
public final class RateType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RateType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final RateType Unknown = new RateType("Unknown", 0, -1);

    @SerialName("0")
    public static final RateType APY = new RateType("APY", 1, 0);

    @SerialName("1")
    public static final RateType APR = new RateType("APR", 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RateType[] $values() {
        return new RateType[]{Unknown, APY, APR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RateType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.RateType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RateType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RateType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.RateType", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "0", "1"}, new Annotation[][]{null, null, null}, null);
    }

    private RateType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RateType[] rateTypeArr$values = $values();
        $VALUES = rateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rateTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RateType._init_$_anonymous_();
            }
        });
    }

    public static RateType valueOf(String str) {
        return (RateType) Enum.valueOf(RateType.class, str);
    }

    public static RateType[] values() {
        return (RateType[]) $VALUES.clone();
    }
}
