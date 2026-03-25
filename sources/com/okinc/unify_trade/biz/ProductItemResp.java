package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ProductItemResp implements Parcelable {
    public static final int $stable = 0;
    private final String absYieldPercentage;
    private final String alternativeCurrency;
    private final String annualYieldPercentage;
    private final String currency;
    private final String expiryTime;
    private final String interestAccuralTime;
    private final String launchTime;
    private final String productId;
    private final String settlementTime;
    private final String shortSymbol;
    private final String stopTradingTime;
    private final String strike;
    private final String symbol;
    private final String term;
    private final String type;
    private final String underlyingIndex;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ProductItemResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ProductItemResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductItemResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProductItemResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductItemResp[] newArray(int i) {
            return new ProductItemResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProductItemResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.annualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.interestAccuralTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.shortSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.launchTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.stopTradingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductItemResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new ProductItemResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductItemResp)) {
            return false;
        }
        ProductItemResp productItemResp = (ProductItemResp) obj;
        return Intrinsics.EZpvd((Object) this.productId, (Object) productItemResp.productId) && Intrinsics.EZpvd((Object) this.symbol, (Object) productItemResp.symbol) && Intrinsics.EZpvd((Object) this.currency, (Object) productItemResp.currency) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) productItemResp.alternativeCurrency) && Intrinsics.EZpvd((Object) this.type, (Object) productItemResp.type) && Intrinsics.EZpvd((Object) this.underlyingIndex, (Object) productItemResp.underlyingIndex) && Intrinsics.EZpvd((Object) this.strike, (Object) productItemResp.strike) && Intrinsics.EZpvd((Object) this.launchTime, (Object) productItemResp.launchTime) && Intrinsics.EZpvd((Object) this.stopTradingTime, (Object) productItemResp.stopTradingTime) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) productItemResp.expiryTime) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) productItemResp.settlementTime) && Intrinsics.EZpvd((Object) this.annualYieldPercentage, (Object) productItemResp.annualYieldPercentage) && Intrinsics.EZpvd((Object) this.absYieldPercentage, (Object) productItemResp.absYieldPercentage) && Intrinsics.EZpvd((Object) this.term, (Object) productItemResp.term) && Intrinsics.EZpvd((Object) this.interestAccuralTime, (Object) productItemResp.interestAccuralTime) && Intrinsics.EZpvd((Object) this.shortSymbol, (Object) productItemResp.shortSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbsYieldPercentage() {
        return this.absYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualYieldPercentage() {
        return this.annualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestAccuralTime() {
        return this.interestAccuralTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLaunchTime() {
        return this.launchTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortSymbol() {
        return this.shortSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopTradingTime() {
        return this.stopTradingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTerm() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingIndex() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.productId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.alternativeCurrency.hashCode()) * 31) + this.type.hashCode()) * 31) + this.underlyingIndex.hashCode()) * 31) + this.strike.hashCode()) * 31) + this.launchTime.hashCode()) * 31) + this.stopTradingTime.hashCode()) * 31) + this.expiryTime.hashCode()) * 31) + this.settlementTime.hashCode()) * 31) + this.annualYieldPercentage.hashCode()) * 31) + this.absYieldPercentage.hashCode()) * 31) + this.term.hashCode()) * 31) + this.interestAccuralTime.hashCode()) * 31) + this.shortSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductItemResp(productId=" + this.productId + ", symbol=" + this.symbol + ", currency=" + this.currency + ", alternativeCurrency=" + this.alternativeCurrency + ", type=" + this.type + ", underlyingIndex=" + this.underlyingIndex + ", strike=" + this.strike + ", launchTime=" + this.launchTime + ", stopTradingTime=" + this.stopTradingTime + ", expiryTime=" + this.expiryTime + ", settlementTime=" + this.settlementTime + ", annualYieldPercentage=" + this.annualYieldPercentage + ", absYieldPercentage=" + this.absYieldPercentage + ", term=" + this.term + ", interestAccuralTime=" + this.interestAccuralTime + ", shortSymbol=" + this.shortSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.productId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.currency);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.type);
        parcel.writeString(this.underlyingIndex);
        parcel.writeString(this.strike);
        parcel.writeString(this.launchTime);
        parcel.writeString(this.stopTradingTime);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.settlementTime);
        parcel.writeString(this.annualYieldPercentage);
        parcel.writeString(this.absYieldPercentage);
        parcel.writeString(this.term);
        parcel.writeString(this.interestAccuralTime);
        parcel.writeString(this.shortSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ProductItemResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductItemResp> serializer() {
            return ProductItemResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductItemResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.productId = "";
        } else {
            this.productId = str;
        }
        if ((i & 2) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str2;
        }
        if ((i & 4) == 0) {
            this.currency = "";
        } else {
            this.currency = str3;
        }
        if ((i & 8) == 0) {
            this.alternativeCurrency = "";
        } else {
            this.alternativeCurrency = str4;
        }
        if ((i & 16) == 0) {
            this.type = "";
        } else {
            this.type = str5;
        }
        if ((i & 32) == 0) {
            this.underlyingIndex = "";
        } else {
            this.underlyingIndex = str6;
        }
        if ((i & 64) == 0) {
            this.strike = "";
        } else {
            this.strike = str7;
        }
        if ((i & 128) == 0) {
            this.launchTime = "";
        } else {
            this.launchTime = str8;
        }
        if ((i & 256) == 0) {
            this.stopTradingTime = "";
        } else {
            this.stopTradingTime = str9;
        }
        if ((i & 512) == 0) {
            this.expiryTime = "";
        } else {
            this.expiryTime = str10;
        }
        if ((i & 1024) == 0) {
            this.settlementTime = "";
        } else {
            this.settlementTime = str11;
        }
        if ((i & 2048) == 0) {
            this.annualYieldPercentage = "";
        } else {
            this.annualYieldPercentage = str12;
        }
        if ((i & 4096) == 0) {
            this.absYieldPercentage = "";
        } else {
            this.absYieldPercentage = str13;
        }
        if ((i & 8192) == 0) {
            this.term = "";
        } else {
            this.term = str14;
        }
        if ((i & 16384) == 0) {
            this.interestAccuralTime = "";
        } else {
            this.interestAccuralTime = str15;
        }
        if ((i & 32768) == 0) {
            this.shortSymbol = "";
        } else {
            this.shortSymbol = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ProductItemResp productItemResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) productItemResp.productId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, productItemResp.productId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) productItemResp.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, productItemResp.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) productItemResp.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, productItemResp.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) productItemResp.alternativeCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, productItemResp.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) productItemResp.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, productItemResp.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) productItemResp.underlyingIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, productItemResp.underlyingIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) productItemResp.strike, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, productItemResp.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) productItemResp.launchTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, productItemResp.launchTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) productItemResp.stopTradingTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, productItemResp.stopTradingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) productItemResp.expiryTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, productItemResp.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) productItemResp.settlementTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, productItemResp.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) productItemResp.annualYieldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, productItemResp.annualYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) productItemResp.absYieldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, productItemResp.absYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) productItemResp.term, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, productItemResp.term);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) productItemResp.interestAccuralTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, productItemResp.interestAccuralTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) productItemResp.shortSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, productItemResp.shortSymbol);
    }

    public ProductItemResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.productId = str;
        this.symbol = str2;
        this.currency = str3;
        this.alternativeCurrency = str4;
        this.type = str5;
        this.underlyingIndex = str6;
        this.strike = str7;
        this.launchTime = str8;
        this.stopTradingTime = str9;
        this.expiryTime = str10;
        this.settlementTime = str11;
        this.annualYieldPercentage = str12;
        this.absYieldPercentage = str13;
        this.term = str14;
        this.interestAccuralTime = str15;
        this.shortSymbol = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4859) call: com.okinc.unify_trade.biz.ProductItemResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProductItemResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16);
    }
}
