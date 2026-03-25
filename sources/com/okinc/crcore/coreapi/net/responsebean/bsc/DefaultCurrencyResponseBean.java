package com.okinc.crcore.coreapi.net.responsebean.bsc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DefaultCurrencyResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String buy;
    private final boolean onlyStableCoinSupported;
    private final String sell;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultCurrencyResponseBean() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefaultCurrencyResponseBean copy$default(DefaultCurrencyResponseBean defaultCurrencyResponseBean, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultCurrencyResponseBean.buy;
        }
        if ((i & 2) != 0) {
            str2 = defaultCurrencyResponseBean.sell;
        }
        if ((i & 4) != 0) {
            z = defaultCurrencyResponseBean.onlyStableCoinSupported;
        }
        return defaultCurrencyResponseBean.copy(str, str2, z);
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
    public final DefaultCurrencyResponseBean copy(String str, String str2, boolean z) {
        return new DefaultCurrencyResponseBean(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultCurrencyResponseBean)) {
            return false;
        }
        DefaultCurrencyResponseBean defaultCurrencyResponseBean = (DefaultCurrencyResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.buy, (Object) defaultCurrencyResponseBean.buy) && Intrinsics.EZpvd((Object) this.sell, (Object) defaultCurrencyResponseBean.sell) && this.onlyStableCoinSupported == defaultCurrencyResponseBean.onlyStableCoinSupported;
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
        String str = this.buy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sell;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.onlyStableCoinSupported);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefaultCurrencyResponseBean(buy=" + this.buy + ", sell=" + this.sell + ", onlyStableCoinSupported=" + this.onlyStableCoinSupported + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.DefaultCurrencyResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefaultCurrencyResponseBean> serializer() {
            return DefaultCurrencyResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefaultCurrencyResponseBean(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buy = null;
        } else {
            this.buy = str;
        }
        if ((i & 2) == 0) {
            this.sell = null;
        } else {
            this.sell = str2;
        }
        if ((i & 4) == 0) {
            this.onlyStableCoinSupported = false;
        } else {
            this.onlyStableCoinSupported = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DefaultCurrencyResponseBean defaultCurrencyResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || defaultCurrencyResponseBean.buy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, defaultCurrencyResponseBean.buy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || defaultCurrencyResponseBean.sell != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, defaultCurrencyResponseBean.sell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || defaultCurrencyResponseBean.onlyStableCoinSupported) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, defaultCurrencyResponseBean.onlyStableCoinSupported);
        }
    }

    public DefaultCurrencyResponseBean(String str, String str2, boolean z) {
        this.buy = str;
        this.sell = str2;
        this.onlyStableCoinSupported = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.DefaultCurrencyResponseBean.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DefaultCurrencyResponseBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
