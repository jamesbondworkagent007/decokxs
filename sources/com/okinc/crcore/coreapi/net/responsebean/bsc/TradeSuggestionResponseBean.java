package com.okinc.crcore.coreapi.net.responsebean.bsc;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TradeSuggestionResponseBean {
    private final BaseCurrencyResponseBean baseCurrency;
    private final boolean multipleCurrencyEnabled;
    private final Boolean nativePaymentAvailable;
    private final List<ChannelResponseBean> paymentChannels;
    private final QuoteCurrencyResponseBean quoteCurrency;
    private final boolean stableCoinEnabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(ChannelResponseBean$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeSuggestionResponseBean copy$default(TradeSuggestionResponseBean tradeSuggestionResponseBean, boolean z, boolean z2, BaseCurrencyResponseBean baseCurrencyResponseBean, QuoteCurrencyResponseBean quoteCurrencyResponseBean, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tradeSuggestionResponseBean.multipleCurrencyEnabled;
        }
        if ((i & 2) != 0) {
            z2 = tradeSuggestionResponseBean.stableCoinEnabled;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            baseCurrencyResponseBean = tradeSuggestionResponseBean.baseCurrency;
        }
        BaseCurrencyResponseBean baseCurrencyResponseBean2 = baseCurrencyResponseBean;
        if ((i & 8) != 0) {
            quoteCurrencyResponseBean = tradeSuggestionResponseBean.quoteCurrency;
        }
        QuoteCurrencyResponseBean quoteCurrencyResponseBean2 = quoteCurrencyResponseBean;
        if ((i & 16) != 0) {
            list = tradeSuggestionResponseBean.paymentChannels;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            bool = tradeSuggestionResponseBean.nativePaymentAvailable;
        }
        return tradeSuggestionResponseBean.copy(z, z3, baseCurrencyResponseBean2, quoteCurrencyResponseBean2, list2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.multipleCurrencyEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.stableCoinEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseCurrencyResponseBean component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCurrencyResponseBean component4() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelResponseBean> component5() {
        return this.paymentChannels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.nativePaymentAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeSuggestionResponseBean copy(boolean z, boolean z2, @NotNull BaseCurrencyResponseBean baseCurrencyResponseBean, @NotNull QuoteCurrencyResponseBean quoteCurrencyResponseBean, @NotNull List<ChannelResponseBean> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseCurrencyResponseBean, "");
        Intrinsics.checkNotNullParameter(quoteCurrencyResponseBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TradeSuggestionResponseBean(z, z2, baseCurrencyResponseBean, quoteCurrencyResponseBean, list, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSuggestionResponseBean)) {
            return false;
        }
        TradeSuggestionResponseBean tradeSuggestionResponseBean = (TradeSuggestionResponseBean) obj;
        return this.multipleCurrencyEnabled == tradeSuggestionResponseBean.multipleCurrencyEnabled && this.stableCoinEnabled == tradeSuggestionResponseBean.stableCoinEnabled && Intrinsics.EZpvd(this.baseCurrency, tradeSuggestionResponseBean.baseCurrency) && Intrinsics.EZpvd(this.quoteCurrency, tradeSuggestionResponseBean.quoteCurrency) && Intrinsics.EZpvd(this.paymentChannels, tradeSuggestionResponseBean.paymentChannels) && Intrinsics.EZpvd(this.nativePaymentAvailable, tradeSuggestionResponseBean.nativePaymentAvailable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseCurrencyResponseBean getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMultipleCurrencyEnabled() {
        return this.multipleCurrencyEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNativePaymentAvailable() {
        return this.nativePaymentAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelResponseBean> getPaymentChannels() {
        return this.paymentChannels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCurrencyResponseBean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStableCoinEnabled() {
        return this.stableCoinEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.multipleCurrencyEnabled);
        int iHashCode2 = Boolean.hashCode(this.stableCoinEnabled);
        int iHashCode3 = this.baseCurrency.hashCode();
        int iHashCode4 = this.quoteCurrency.hashCode();
        int iHashCode5 = this.paymentChannels.hashCode();
        Boolean bool = this.nativePaymentAvailable;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeSuggestionResponseBean(multipleCurrencyEnabled=" + this.multipleCurrencyEnabled + ", stableCoinEnabled=" + this.stableCoinEnabled + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", paymentChannels=" + this.paymentChannels + ", nativePaymentAvailable=" + this.nativePaymentAvailable + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeSuggestionResponseBean> serializer() {
            return TradeSuggestionResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeSuggestionResponseBean(int i, boolean z, boolean z2, BaseCurrencyResponseBean baseCurrencyResponseBean, QuoteCurrencyResponseBean quoteCurrencyResponseBean, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (28 != (i & 28)) {
            PluginExceptionsKt.throwMissingFieldException(i, 28, TradeSuggestionResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.multipleCurrencyEnabled = false;
        } else {
            this.multipleCurrencyEnabled = z;
        }
        if ((i & 2) == 0) {
            this.stableCoinEnabled = false;
        } else {
            this.stableCoinEnabled = z2;
        }
        this.baseCurrency = baseCurrencyResponseBean;
        this.quoteCurrency = quoteCurrencyResponseBean;
        this.paymentChannels = list;
        if ((i & 32) == 0) {
            this.nativePaymentAvailable = Boolean.FALSE;
        } else {
            this.nativePaymentAvailable = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TradeSuggestionResponseBean tradeSuggestionResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeSuggestionResponseBean.multipleCurrencyEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, tradeSuggestionResponseBean.multipleCurrencyEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeSuggestionResponseBean.stableCoinEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tradeSuggestionResponseBean.stableCoinEnabled);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BaseCurrencyResponseBean$$serializer.INSTANCE, tradeSuggestionResponseBean.baseCurrency);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, QuoteCurrencyResponseBean$$serializer.INSTANCE, tradeSuggestionResponseBean.quoteCurrency);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], tradeSuggestionResponseBean.paymentChannels);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(tradeSuggestionResponseBean.nativePaymentAvailable, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, tradeSuggestionResponseBean.nativePaymentAvailable);
    }

    public TradeSuggestionResponseBean(boolean z, boolean z2, @NotNull BaseCurrencyResponseBean baseCurrencyResponseBean, @NotNull QuoteCurrencyResponseBean quoteCurrencyResponseBean, @NotNull List<ChannelResponseBean> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseCurrencyResponseBean, "");
        Intrinsics.checkNotNullParameter(quoteCurrencyResponseBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.multipleCurrencyEnabled = z;
        this.stableCoinEnabled = z2;
        this.baseCurrency = baseCurrencyResponseBean;
        this.quoteCurrency = quoteCurrencyResponseBean;
        this.paymentChannels = list;
        this.nativePaymentAvailable = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (r12v0 com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean)
  (r13v0 com.okinc.crcore.coreapi.net.responsebean.bsc.QuoteCurrencyResponseBean)
  (r14v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r15v0 java.lang.Boolean))
 A[MD:(boolean, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.QuoteCurrencyResponseBean, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.ChannelResponseBean>, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean.<init>(boolean, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.QuoteCurrencyResponseBean, java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TradeSuggestionResponseBean(boolean z, boolean z2, BaseCurrencyResponseBean baseCurrencyResponseBean, QuoteCurrencyResponseBean quoteCurrencyResponseBean, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, baseCurrencyResponseBean, quoteCurrencyResponseBean, list, (i & 32) != 0 ? Boolean.FALSE : bool);
    }
}
