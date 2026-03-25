package com.okinc.okex.lite_market_api.bean;

import androidx.camera.video.AudioStats;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FairPriceTickerData {
    private String changePrice;
    private String coin;
    private String fairPricePair;
    private boolean isConverterNeeded;
    private boolean isStableCoin;
    private double percent;
    private String percentToDisplay;
    private String price;
    private String priceToDisplay;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FairPriceTickerData() {
        this((String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, false, (String) null, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.priceToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component4() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.percentToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fairPricePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isConverterNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.changePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FairPriceTickerData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new FairPriceTickerData(str, str2, str3, d, str4, str5, z, str6, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FairPriceTickerData)) {
            return false;
        }
        FairPriceTickerData fairPriceTickerData = (FairPriceTickerData) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) fairPriceTickerData.coin) && Intrinsics.EZpvd((Object) this.price, (Object) fairPriceTickerData.price) && Intrinsics.EZpvd((Object) this.priceToDisplay, (Object) fairPriceTickerData.priceToDisplay) && Double.compare(this.percent, fairPriceTickerData.percent) == 0 && Intrinsics.EZpvd((Object) this.percentToDisplay, (Object) fairPriceTickerData.percentToDisplay) && Intrinsics.EZpvd((Object) this.fairPricePair, (Object) fairPriceTickerData.fairPricePair) && this.isConverterNeeded == fairPriceTickerData.isConverterNeeded && Intrinsics.EZpvd((Object) this.changePrice, (Object) fairPriceTickerData.changePrice) && this.isStableCoin == fairPriceTickerData.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePrice() {
        return this.changePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFairPricePair() {
        return this.fairPricePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercentToDisplay() {
        return this.percentToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceToDisplay() {
        return this.priceToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.coin.hashCode() * 31) + this.price.hashCode()) * 31) + this.priceToDisplay.hashCode()) * 31) + Double.hashCode(this.percent)) * 31) + this.percentToDisplay.hashCode()) * 31) + this.fairPricePair.hashCode()) * 31) + Boolean.hashCode(this.isConverterNeeded)) * 31) + this.changePrice.hashCode()) * 31) + Boolean.hashCode(this.isStableCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConverterNeeded() {
        return this.isConverterNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStableCoin() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangePrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConverterNeeded(boolean z) {
        this.isConverterNeeded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFairPricePair(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fairPricePair = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercent(double d) {
        this.percent = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercentToDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.percentToDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceToDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceToDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStableCoin(boolean z) {
        this.isStableCoin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FairPriceTickerData(coin=" + this.coin + ", price=" + this.price + ", priceToDisplay=" + this.priceToDisplay + ", percent=" + this.percent + ", percentToDisplay=" + this.percentToDisplay + ", fairPricePair=" + this.fairPricePair + ", isConverterNeeded=" + this.isConverterNeeded + ", changePrice=" + this.changePrice + ", isStableCoin=" + this.isStableCoin + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite_market_api.bean.FairPriceTickerData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FairPriceTickerData> serializer() {
            return FairPriceTickerData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FairPriceTickerData(int i, String str, String str2, String str3, double d, String str4, String str5, boolean z, String str6, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coin = "";
        } else {
            this.coin = str;
        }
        if ((i & 2) == 0) {
            this.price = "";
        } else {
            this.price = str2;
        }
        if ((i & 4) == 0) {
            this.priceToDisplay = "";
        } else {
            this.priceToDisplay = str3;
        }
        if ((i & 8) == 0) {
            this.percent = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.percent = d;
        }
        if ((i & 16) == 0) {
            this.percentToDisplay = "";
        } else {
            this.percentToDisplay = str4;
        }
        if ((i & 32) == 0) {
            this.fairPricePair = "";
        } else {
            this.fairPricePair = str5;
        }
        if ((i & 64) == 0) {
            this.isConverterNeeded = false;
        } else {
            this.isConverterNeeded = z;
        }
        if ((i & 128) == 0) {
            this.changePrice = "";
        } else {
            this.changePrice = str6;
        }
        if ((i & 256) == 0) {
            this.isStableCoin = false;
        } else {
            this.isStableCoin = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarketLite_market_lite_api(FairPriceTickerData fairPriceTickerData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fairPriceTickerData.coin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fairPriceTickerData.coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fairPriceTickerData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fairPriceTickerData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fairPriceTickerData.priceToDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fairPriceTickerData.priceToDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || Double.compare(fairPriceTickerData.percent, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 3, fairPriceTickerData.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fairPriceTickerData.percentToDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fairPriceTickerData.percentToDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fairPriceTickerData.fairPricePair, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fairPriceTickerData.fairPricePair);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || fairPriceTickerData.isConverterNeeded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, fairPriceTickerData.isConverterNeeded);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fairPriceTickerData.changePrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fairPriceTickerData.changePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || fairPriceTickerData.isStableCoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, fairPriceTickerData.isStableCoin);
        }
    }

    public FairPriceTickerData(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.coin = str;
        this.price = str2;
        this.priceToDisplay = str3;
        this.percent = d;
        this.percentToDisplay = str4;
        this.fairPricePair = str5;
        this.isConverterNeeded = z;
        this.changePrice = str6;
        this.isStableCoin = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r16v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r23v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:17) call: com.okinc.okex.lite_market_api.bean.FairPriceTickerData.<init>(java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ FairPriceTickerData(String str, String str2, String str3, double d, String str4, String str5, boolean z, String str6, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? false : z, (i & 128) == 0 ? str6 : "", (i & 256) == 0 ? z2 : false);
    }
}
