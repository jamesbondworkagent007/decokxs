package com.okinc.okx.paymentapi.uv;

import com.okinc.okx.paymentapi.uv.LandingPageType;
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
/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LandingPageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LandingPageType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final LandingPageType BUY_PAGE = new LandingPageType("BUY_PAGE", 0);
    public static final LandingPageType BUY_INPUT_PAGE = new LandingPageType("BUY_INPUT_PAGE", 1);
    public static final LandingPageType SELL_PAGE = new LandingPageType("SELL_PAGE", 2);
    public static final LandingPageType SELL_INPUT_PAGE = new LandingPageType("SELL_INPUT_PAGE", 3);
    public static final LandingPageType DEPOSIT_PAGE = new LandingPageType("DEPOSIT_PAGE", 4);
    public static final LandingPageType DEPOSIT_INPUT_PAGE = new LandingPageType("DEPOSIT_INPUT_PAGE", 5);
    public static final LandingPageType WITHDRAW_PAGE = new LandingPageType("WITHDRAW_PAGE", 6);
    public static final LandingPageType PAYMENT_MANAGEMENT_CENTER = new LandingPageType("PAYMENT_MANAGEMENT_CENTER", 7);
    public static final LandingPageType CONVERT_PAGE = new LandingPageType("CONVERT_PAGE", 8);
    public static final LandingPageType SIMPLE_TRADE_LEVEL1_PAGE = new LandingPageType("SIMPLE_TRADE_LEVEL1_PAGE", 9);
    public static final LandingPageType SIMPLE_TRADE_LEVEL2_PAGE = new LandingPageType("SIMPLE_TRADE_LEVEL2_PAGE", 10);
    public static final LandingPageType EXCHANGE_TOPUP = new LandingPageType("EXCHANGE_TOPUP", 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LandingPageType[] $values() {
        return new LandingPageType[]{BUY_PAGE, BUY_INPUT_PAGE, SELL_PAGE, SELL_INPUT_PAGE, DEPOSIT_PAGE, DEPOSIT_INPUT_PAGE, WITHDRAW_PAGE, PAYMENT_MANAGEMENT_CENTER, CONVERT_PAGE, SIMPLE_TRADE_LEVEL1_PAGE, SIMPLE_TRADE_LEVEL2_PAGE, EXCHANGE_TOPUP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LandingPageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.uv.LandingPageType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) LandingPageType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<LandingPageType> serializer() {
            return EZpvd();
        }
    }

    private LandingPageType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okx.paymentapi.uv.LandingPageType", values());
    }

    static {
        LandingPageType[] landingPageTypeArr$values = $values();
        $VALUES = landingPageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(landingPageTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LandingPageType._init_$_anonymous_();
            }
        });
    }

    public static LandingPageType valueOf(String str) {
        return (LandingPageType) Enum.valueOf(LandingPageType.class, str);
    }

    public static LandingPageType[] values() {
        return (LandingPageType[]) $VALUES.clone();
    }
}
