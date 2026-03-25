package com.okinc.buysell.util;

import com.okinc.buysell.util.PaymentFeatureFlag;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PaymentFeatureFlag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymentFeatureFlag[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String tag;
    public static final PaymentFeatureFlag SIMPLE_TRADE_L2_TOKEN_CARRYOVER = new PaymentFeatureFlag("SIMPLE_TRADE_L2_TOKEN_CARRYOVER", 0, "simple_trade_l2_token_carryover");
    public static final PaymentFeatureFlag IS_BANNER_V2_ENABLED = new PaymentFeatureFlag("IS_BANNER_V2_ENABLED", 1, "bsc_banner_v2_enabled");
    public static final PaymentFeatureFlag IS_BANNER_POLLING_ENABLED = new PaymentFeatureFlag("IS_BANNER_POLLING_ENABLED", 2, "bsc_banner_timely_polling");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymentFeatureFlag[] $values() {
        return new PaymentFeatureFlag[]{SIMPLE_TRADE_L2_TOKEN_CARRYOVER, IS_BANNER_V2_ENABLED, IS_BANNER_POLLING_ENABLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymentFeatureFlag> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.util.PaymentFeatureFlag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) PaymentFeatureFlag.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PaymentFeatureFlag> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.util.PaymentFeatureFlag", values());
    }

    private PaymentFeatureFlag(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        PaymentFeatureFlag[] paymentFeatureFlagArr$values = $values();
        $VALUES = paymentFeatureFlagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymentFeatureFlagArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PaymentFeatureFlag._init_$_anonymous_();
            }
        });
    }

    public static PaymentFeatureFlag valueOf(String str) {
        return (PaymentFeatureFlag) Enum.valueOf(PaymentFeatureFlag.class, str);
    }

    public static PaymentFeatureFlag[] values() {
        return (PaymentFeatureFlag[]) $VALUES.clone();
    }
}
