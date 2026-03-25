package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FxRateConversionBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String baseCurrency;
    private final String fxRate;
    private final String fxRateSessionToken;
    private final String quoteCurrency;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FxRateConversionBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FxRateConversionBean copy$default(FxRateConversionBean fxRateConversionBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fxRateConversionBean.quoteCurrency;
        }
        if ((i & 2) != 0) {
            str2 = fxRateConversionBean.baseCurrency;
        }
        if ((i & 4) != 0) {
            str3 = fxRateConversionBean.fxRateSessionToken;
        }
        if ((i & 8) != 0) {
            str4 = fxRateConversionBean.fxRate;
        }
        return fxRateConversionBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fxRateSessionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fxRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FxRateConversionBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new FxRateConversionBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FxRateConversionBean)) {
            return false;
        }
        FxRateConversionBean fxRateConversionBean = (FxRateConversionBean) obj;
        return Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) fxRateConversionBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) fxRateConversionBean.baseCurrency) && Intrinsics.EZpvd((Object) this.fxRateSessionToken, (Object) fxRateConversionBean.fxRateSessionToken) && Intrinsics.EZpvd((Object) this.fxRate, (Object) fxRateConversionBean.fxRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFxRate() {
        return this.fxRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFxRateSessionToken() {
        return this.fxRateSessionToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.quoteCurrency.hashCode() * 31) + this.baseCurrency.hashCode()) * 31) + this.fxRateSessionToken.hashCode()) * 31) + this.fxRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FxRateConversionBean(quoteCurrency=" + this.quoteCurrency + ", baseCurrency=" + this.baseCurrency + ", fxRateSessionToken=" + this.fxRateSessionToken + ", fxRate=" + this.fxRate + ")";
    }

    public /* synthetic */ FxRateConversionBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.fxRateSessionToken = "";
        } else {
            this.fxRateSessionToken = str3;
        }
        if ((i & 8) == 0) {
            this.fxRate = "";
        } else {
            this.fxRate = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FxRateConversionBean fxRateConversionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fxRateConversionBean.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fxRateConversionBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fxRateConversionBean.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fxRateConversionBean.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fxRateConversionBean.fxRateSessionToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fxRateConversionBean.fxRateSessionToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) fxRateConversionBean.fxRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, fxRateConversionBean.fxRate);
    }

    public FxRateConversionBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.quoteCurrency = str;
        this.baseCurrency = str2;
        this.fxRateSessionToken = str3;
        this.fxRate = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:321) call: com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FxRateConversionBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FxRateConversionBean> serializer() {
            return FxRateConversionBean$$serializer.INSTANCE;
        }

        public final FxRateConversionBean OLrzqt(@NotNull FxRateConversionResponseBean fxRateConversionResponseBean) {
            Intrinsics.checkNotNullParameter(fxRateConversionResponseBean, "");
            return new FxRateConversionBean(fxRateConversionResponseBean.getQuoteCurrency(), fxRateConversionResponseBean.getBaseCurrency(), fxRateConversionResponseBean.getFxRateSessionToken(), fxRateConversionResponseBean.getFxRate());
        }
    }
}
