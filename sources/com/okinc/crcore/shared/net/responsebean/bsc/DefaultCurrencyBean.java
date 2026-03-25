package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.DefaultCurrencyResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DefaultCurrencyBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String buy;
    private final boolean onlyStableCoinSupported;
    private final String sell;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultCurrencyBean() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefaultCurrencyBean copy$default(DefaultCurrencyBean defaultCurrencyBean, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultCurrencyBean.buy;
        }
        if ((i & 2) != 0) {
            str2 = defaultCurrencyBean.sell;
        }
        if ((i & 4) != 0) {
            z = defaultCurrencyBean.onlyStableCoinSupported;
        }
        return defaultCurrencyBean.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.onlyStableCoinSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultCurrencyBean copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DefaultCurrencyBean(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultCurrencyBean)) {
            return false;
        }
        DefaultCurrencyBean defaultCurrencyBean = (DefaultCurrencyBean) obj;
        return Intrinsics.EZpvd((Object) this.buy, (Object) defaultCurrencyBean.buy) && Intrinsics.EZpvd((Object) this.sell, (Object) defaultCurrencyBean.sell) && this.onlyStableCoinSupported == defaultCurrencyBean.onlyStableCoinSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuy() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOnlyStableCoinSupported() {
        return this.onlyStableCoinSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSell() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.buy.hashCode() * 31) + this.sell.hashCode()) * 31) + Boolean.hashCode(this.onlyStableCoinSupported);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefaultCurrencyBean(buy=" + this.buy + ", sell=" + this.sell + ", onlyStableCoinSupported=" + this.onlyStableCoinSupported + ")";
    }

    public /* synthetic */ DefaultCurrencyBean(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buy = "";
        } else {
            this.buy = str;
        }
        if ((i & 2) == 0) {
            this.sell = "";
        } else {
            this.sell = str2;
        }
        if ((i & 4) == 0) {
            this.onlyStableCoinSupported = false;
        } else {
            this.onlyStableCoinSupported = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DefaultCurrencyBean defaultCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defaultCurrencyBean.buy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defaultCurrencyBean.buy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) defaultCurrencyBean.sell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, defaultCurrencyBean.sell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || defaultCurrencyBean.onlyStableCoinSupported) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, defaultCurrencyBean.onlyStableCoinSupported);
        }
    }

    public DefaultCurrencyBean(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.buy = str;
        this.sell = str2;
        this.onlyStableCoinSupported = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DefaultCurrencyBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DefaultCurrencyBean> serializer() {
            return DefaultCurrencyBean$$serializer.INSTANCE;
        }

        public final DefaultCurrencyBean copydefault(@NotNull DefaultCurrencyResponseBean defaultCurrencyResponseBean) {
            Intrinsics.checkNotNullParameter(defaultCurrencyResponseBean, "");
            String buy = defaultCurrencyResponseBean.getBuy();
            if (buy == null) {
                buy = "";
            }
            String sell = defaultCurrencyResponseBean.getSell();
            return new DefaultCurrencyBean(buy, sell != null ? sell : "", defaultCurrencyResponseBean.getOnlyStableCoinSupported());
        }
    }
}
