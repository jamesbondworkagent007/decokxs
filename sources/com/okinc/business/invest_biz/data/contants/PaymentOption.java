package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.invest_biz.data.contants.PaymentOption;
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
public final class PaymentOption {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentOption[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final PaymentOption NotDecided = new PaymentOption("NotDecided", 0, 0);

    @SerialName("1")
    public static final PaymentOption SingleToken = new PaymentOption("SingleToken", 1, 1);

    @SerialName("2")
    public static final PaymentOption MultiToken = new PaymentOption("MultiToken", 2, 2);

    @SerialName("3")
    public static final PaymentOption Flexible = new PaymentOption("Flexible", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentOption[] $values() {
        return new PaymentOption[]{NotDecided, SingleToken, MultiToken, Flexible};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentOption> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.PaymentOption.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) PaymentOption.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PaymentOption> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.PaymentOption", values(), new String[]{"0", "1", "2", "3"}, new Annotation[][]{null, null, null, null}, null);
    }

    private PaymentOption(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PaymentOption[] paymentOptionArr$values = $values();
        $VALUES = paymentOptionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentOptionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PaymentOption._init_$_anonymous_();
            }
        });
    }

    public static PaymentOption valueOf(String str) {
        return (PaymentOption) Enum.valueOf(PaymentOption.class, str);
    }

    public static PaymentOption[] values() {
        return (PaymentOption[]) $VALUES.clone();
    }
}
