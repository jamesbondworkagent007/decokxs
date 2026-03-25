package com.okinc.fiat.api.bean;

import com.okinc.fiat.api.bean.TopUpPageAvailableBusinessType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
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
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TopUpPageAvailableBusinessType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TopUpPageAvailableBusinessType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String type;
    public static final TopUpPageAvailableBusinessType TOP_UP = new TopUpPageAvailableBusinessType("TOP_UP", 0, "topup");
    public static final TopUpPageAvailableBusinessType CRYPTO_DEPOSIT = new TopUpPageAvailableBusinessType("CRYPTO_DEPOSIT", 1, "crypto_deposit");
    public static final TopUpPageAvailableBusinessType DEPOSIT = new TopUpPageAvailableBusinessType("DEPOSIT", 2, "deposit");
    public static final TopUpPageAvailableBusinessType BUY = new TopUpPageAvailableBusinessType("BUY", 3, "buy");
    public static final TopUpPageAvailableBusinessType BUYCRYPTO = new TopUpPageAvailableBusinessType("BUYCRYPTO", 4, TradeType.BUY_CRYPTO_TRADE_TYPE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TopUpPageAvailableBusinessType[] $values() {
        return new TopUpPageAvailableBusinessType[]{TOP_UP, CRYPTO_DEPOSIT, DEPOSIT, BUY, BUYCRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TopUpPageAvailableBusinessType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.TopUpPageAvailableBusinessType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) TopUpPageAvailableBusinessType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TopUpPageAvailableBusinessType> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.fiat.api.bean.TopUpPageAvailableBusinessType", values());
    }

    private TopUpPageAvailableBusinessType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        TopUpPageAvailableBusinessType[] topUpPageAvailableBusinessTypeArr$values = $values();
        $VALUES = topUpPageAvailableBusinessTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(topUpPageAvailableBusinessTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.niB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TopUpPageAvailableBusinessType._init_$_anonymous_();
            }
        });
    }

    public static TopUpPageAvailableBusinessType valueOf(String str) {
        return (TopUpPageAvailableBusinessType) Enum.valueOf(TopUpPageAvailableBusinessType.class, str);
    }

    public static TopUpPageAvailableBusinessType[] values() {
        return (TopUpPageAvailableBusinessType[]) $VALUES.clone();
    }
}
