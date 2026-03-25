package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.ChannelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
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
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TradeSuggestionBean {
    private final BaseCurrencyBean baseCurrency;
    private final boolean multipleCurrencyEnabled;
    private final Boolean nativePaymentAvailable;
    private final List<ChannelBean> paymentChannels;
    private final QuoteCurrencyBean quoteCurrency;
    private final boolean stableCoinEnabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(ChannelBean$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeSuggestionBean copy$default(TradeSuggestionBean tradeSuggestionBean, boolean z, boolean z2, BaseCurrencyBean baseCurrencyBean, QuoteCurrencyBean quoteCurrencyBean, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tradeSuggestionBean.multipleCurrencyEnabled;
        }
        if ((i & 2) != 0) {
            z2 = tradeSuggestionBean.stableCoinEnabled;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            baseCurrencyBean = tradeSuggestionBean.baseCurrency;
        }
        BaseCurrencyBean baseCurrencyBean2 = baseCurrencyBean;
        if ((i & 8) != 0) {
            quoteCurrencyBean = tradeSuggestionBean.quoteCurrency;
        }
        QuoteCurrencyBean quoteCurrencyBean2 = quoteCurrencyBean;
        if ((i & 16) != 0) {
            list = tradeSuggestionBean.paymentChannels;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            bool = tradeSuggestionBean.nativePaymentAvailable;
        }
        return tradeSuggestionBean.copy(z, z3, baseCurrencyBean2, quoteCurrencyBean2, list2, bool);
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
    public final BaseCurrencyBean component3() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCurrencyBean component4() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelBean> component5() {
        return this.paymentChannels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.nativePaymentAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeSuggestionBean copy(boolean z, boolean z2, @NotNull BaseCurrencyBean baseCurrencyBean, @NotNull QuoteCurrencyBean quoteCurrencyBean, @NotNull List<ChannelBean> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseCurrencyBean, "");
        Intrinsics.checkNotNullParameter(quoteCurrencyBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TradeSuggestionBean(z, z2, baseCurrencyBean, quoteCurrencyBean, list, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSuggestionBean)) {
            return false;
        }
        TradeSuggestionBean tradeSuggestionBean = (TradeSuggestionBean) obj;
        return this.multipleCurrencyEnabled == tradeSuggestionBean.multipleCurrencyEnabled && this.stableCoinEnabled == tradeSuggestionBean.stableCoinEnabled && Intrinsics.EZpvd(this.baseCurrency, tradeSuggestionBean.baseCurrency) && Intrinsics.EZpvd(this.quoteCurrency, tradeSuggestionBean.quoteCurrency) && Intrinsics.EZpvd(this.paymentChannels, tradeSuggestionBean.paymentChannels) && Intrinsics.EZpvd(this.nativePaymentAvailable, tradeSuggestionBean.nativePaymentAvailable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseCurrencyBean getBaseCurrency() {
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
    public final List<ChannelBean> getPaymentChannels() {
        return this.paymentChannels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCurrencyBean getQuoteCurrency() {
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
        return "TradeSuggestionBean(multipleCurrencyEnabled=" + this.multipleCurrencyEnabled + ", stableCoinEnabled=" + this.stableCoinEnabled + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", paymentChannels=" + this.paymentChannels + ", nativePaymentAvailable=" + this.nativePaymentAvailable + ")";
    }

    public /* synthetic */ TradeSuggestionBean(int i, boolean z, boolean z2, BaseCurrencyBean baseCurrencyBean, QuoteCurrencyBean quoteCurrencyBean, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (28 != (i & 28)) {
            PluginExceptionsKt.throwMissingFieldException(i, 28, TradeSuggestionBean$$serializer.INSTANCE.getDescriptor());
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
        this.baseCurrency = baseCurrencyBean;
        this.quoteCurrency = quoteCurrencyBean;
        this.paymentChannels = list;
        if ((i & 32) == 0) {
            this.nativePaymentAvailable = Boolean.FALSE;
        } else {
            this.nativePaymentAvailable = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TradeSuggestionBean tradeSuggestionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeSuggestionBean.multipleCurrencyEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, tradeSuggestionBean.multipleCurrencyEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeSuggestionBean.stableCoinEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tradeSuggestionBean.stableCoinEnabled);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BaseCurrencyBean$$serializer.INSTANCE, tradeSuggestionBean.baseCurrency);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, QuoteCurrencyBean$$serializer.INSTANCE, tradeSuggestionBean.quoteCurrency);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], tradeSuggestionBean.paymentChannels);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(tradeSuggestionBean.nativePaymentAvailable, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, tradeSuggestionBean.nativePaymentAvailable);
    }

    public TradeSuggestionBean(boolean z, boolean z2, @NotNull BaseCurrencyBean baseCurrencyBean, @NotNull QuoteCurrencyBean quoteCurrencyBean, @NotNull List<ChannelBean> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(baseCurrencyBean, "");
        Intrinsics.checkNotNullParameter(quoteCurrencyBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.multipleCurrencyEnabled = z;
        this.stableCoinEnabled = z2;
        this.baseCurrency = baseCurrencyBean;
        this.quoteCurrency = quoteCurrencyBean;
        this.paymentChannels = list;
        this.nativePaymentAvailable = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (r12v0 com.okinc.crcore.shared.net.responsebean.bsc.BaseCurrencyBean)
  (r13v0 com.okinc.crcore.shared.net.responsebean.bsc.QuoteCurrencyBean)
  (r14v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r15v0 java.lang.Boolean))
 A[MD:(boolean, boolean, com.okinc.crcore.shared.net.responsebean.bsc.BaseCurrencyBean, com.okinc.crcore.shared.net.responsebean.bsc.QuoteCurrencyBean, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean>, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean.<init>(boolean, boolean, com.okinc.crcore.shared.net.responsebean.bsc.BaseCurrencyBean, com.okinc.crcore.shared.net.responsebean.bsc.QuoteCurrencyBean, java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TradeSuggestionBean(boolean z, boolean z2, BaseCurrencyBean baseCurrencyBean, QuoteCurrencyBean quoteCurrencyBean, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, baseCurrencyBean, quoteCurrencyBean, list, (i & 32) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeSuggestionBean> serializer() {
            return TradeSuggestionBean$$serializer.INSTANCE;
        }

        public final TradeSuggestionBean OLrzqt(@NotNull TradeSuggestionResponseBean tradeSuggestionResponseBean) {
            Intrinsics.checkNotNullParameter(tradeSuggestionResponseBean, "");
            boolean multipleCurrencyEnabled = tradeSuggestionResponseBean.getMultipleCurrencyEnabled();
            boolean stableCoinEnabled = tradeSuggestionResponseBean.getStableCoinEnabled();
            BaseCurrencyBean baseCurrencyBeanCopydefault = BaseCurrencyBean.Companion.copydefault(tradeSuggestionResponseBean.getBaseCurrency());
            QuoteCurrencyBean quoteCurrencyBeanKWHzl = QuoteCurrencyBean.Companion.KWHzl(tradeSuggestionResponseBean.getQuoteCurrency());
            List<ChannelResponseBean> paymentChannels = tradeSuggestionResponseBean.getPaymentChannels();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(paymentChannels, 10));
            Iterator<T> it = paymentChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(ChannelBean.Companion.copydefault((ChannelResponseBean) it.next()));
            }
            return new TradeSuggestionBean(multipleCurrencyEnabled, stableCoinEnabled, baseCurrencyBeanCopydefault, quoteCurrencyBeanKWHzl, arrayList, tradeSuggestionResponseBean.getNativePaymentAvailable());
        }
    }
}
