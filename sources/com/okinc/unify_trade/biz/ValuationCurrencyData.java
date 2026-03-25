package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ValuationCurrencyData {
    private final String currencyId;
    private final String displayName;
    private final String isDefault;
    private boolean isPremium;
    private final String isoCode;
    private final String precision;
    private final String symbol;
    private final String usdToThisRate;
    private final String usdToThisRatePremium;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValuationCurrencyData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isPremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.usdToThisRatePremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValuationCurrencyData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ValuationCurrencyData(str, str2, str3, str4, str5, str6, str7, z, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValuationCurrencyData)) {
            return false;
        }
        ValuationCurrencyData valuationCurrencyData = (ValuationCurrencyData) obj;
        return Intrinsics.EZpvd((Object) this.currencyId, (Object) valuationCurrencyData.currencyId) && Intrinsics.EZpvd((Object) this.isoCode, (Object) valuationCurrencyData.isoCode) && Intrinsics.EZpvd((Object) this.displayName, (Object) valuationCurrencyData.displayName) && Intrinsics.EZpvd((Object) this.isDefault, (Object) valuationCurrencyData.isDefault) && Intrinsics.EZpvd((Object) this.symbol, (Object) valuationCurrencyData.symbol) && Intrinsics.EZpvd((Object) this.usdToThisRate, (Object) valuationCurrencyData.usdToThisRate) && Intrinsics.EZpvd((Object) this.precision, (Object) valuationCurrencyData.precision) && this.isPremium == valuationCurrencyData.isPremium && Intrinsics.EZpvd((Object) this.usdToThisRatePremium, (Object) valuationCurrencyData.usdToThisRatePremium);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdToThisRate() {
        return this.usdToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdToThisRatePremium() {
        return this.usdToThisRatePremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.currencyId.hashCode() * 31) + this.isoCode.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.isDefault.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.usdToThisRate.hashCode()) * 31) + this.precision.hashCode()) * 31) + Boolean.hashCode(this.isPremium)) * 31) + this.usdToThisRatePremium.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPremium() {
        return this.isPremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPremium(boolean z) {
        this.isPremium = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValuationCurrencyData(currencyId=" + this.currencyId + ", isoCode=" + this.isoCode + ", displayName=" + this.displayName + ", isDefault=" + this.isDefault + ", symbol=" + this.symbol + ", usdToThisRate=" + this.usdToThisRate + ", precision=" + this.precision + ", isPremium=" + this.isPremium + ", usdToThisRatePremium=" + this.usdToThisRatePremium + ")";
    }

    public /* synthetic */ ValuationCurrencyData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        this.currencyId = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.isoCode = "USD";
        } else {
            this.isoCode = str2;
        }
        if ((i & 4) == 0) {
            this.displayName = "USD";
        } else {
            this.displayName = str3;
        }
        if ((i & 8) == 0) {
            this.isDefault = "";
        } else {
            this.isDefault = str4;
        }
        if ((i & 16) == 0) {
            this.symbol = "$";
        } else {
            this.symbol = str5;
        }
        if ((i & 32) == 0) {
            this.usdToThisRate = "1.0";
        } else {
            this.usdToThisRate = str6;
        }
        if ((i & 64) == 0) {
            this.precision = "2";
        } else {
            this.precision = str7;
        }
        if ((i & 128) == 0) {
            this.isPremium = false;
        } else {
            this.isPremium = z;
        }
        if ((i & 256) == 0) {
            this.usdToThisRatePremium = "";
        } else {
            this.usdToThisRatePremium = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ValuationCurrencyData valuationCurrencyData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) valuationCurrencyData.currencyId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, valuationCurrencyData.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) valuationCurrencyData.isoCode, (Object) "USD")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, valuationCurrencyData.isoCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) valuationCurrencyData.displayName, (Object) "USD")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, valuationCurrencyData.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) valuationCurrencyData.isDefault, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, valuationCurrencyData.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) valuationCurrencyData.symbol, (Object) "$")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, valuationCurrencyData.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) valuationCurrencyData.usdToThisRate, (Object) "1.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, valuationCurrencyData.usdToThisRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) valuationCurrencyData.precision, (Object) "2")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, valuationCurrencyData.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || valuationCurrencyData.isPremium) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, valuationCurrencyData.isPremium);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) valuationCurrencyData.usdToThisRatePremium, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, valuationCurrencyData.usdToThisRatePremium);
    }

    public ValuationCurrencyData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.currencyId = str;
        this.isoCode = str2;
        this.displayName = str3;
        this.isDefault = str4;
        this.symbol = str5;
        this.usdToThisRate = str6;
        this.precision = str7;
        this.isPremium = z;
        this.usdToThisRatePremium = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("USD") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : ("USD"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("$") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("1.0") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("2") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.unify_trade.biz.ValuationCurrencyData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ ValuationCurrencyData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "USD" : str2, (i & 4) == 0 ? str3 : "USD", (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "$" : str5, (i & 32) != 0 ? "1.0" : str6, (i & 64) != 0 ? "2" : str7, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str8 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ValuationCurrencyData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValuationCurrencyData> serializer() {
            return ValuationCurrencyData$$serializer.INSTANCE;
        }

        public final ValuationCurrencyData EZpvd() {
            return new ValuationCurrencyData("0", "USD", "美元", "1", "$", "1.0", "2", false, (String) null, MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null);
        }
    }

    public final boolean isUseIndexRate() {
        return this.usdToThisRatePremium.length() > 0;
    }
}
