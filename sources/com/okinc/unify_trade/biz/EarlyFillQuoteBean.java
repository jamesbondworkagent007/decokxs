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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class EarlyFillQuoteBean implements Parcelable {
    private String alternativeCurrency;
    private String currency;
    private String earlyFillAmount;
    private String earlyFillAmountPrecision;
    private String earlyFillCurrency;
    private String notionalAmount;
    private String notionalAmountPrecision;
    private String notionalCurrency;
    private String price;
    private String pricePrecision;
    private String tradeSide;
    private String ttlMs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarlyFillQuoteBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarlyFillQuoteBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyFillQuoteBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarlyFillQuoteBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyFillQuoteBean[] newArray(int i) {
            return new EarlyFillQuoteBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyFillQuoteBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.earlyFillAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ttlMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyFillQuoteBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new EarlyFillQuoteBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof EarlyFillQuoteBean)) {
            return false;
        }
        EarlyFillQuoteBean earlyFillQuoteBean = (EarlyFillQuoteBean) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) earlyFillQuoteBean.currency) && Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) earlyFillQuoteBean.alternativeCurrency) && Intrinsics.EZpvd((Object) this.earlyFillAmount, (Object) earlyFillQuoteBean.earlyFillAmount) && Intrinsics.EZpvd((Object) this.earlyFillCurrency, (Object) earlyFillQuoteBean.earlyFillCurrency) && Intrinsics.EZpvd((Object) this.notionalAmount, (Object) earlyFillQuoteBean.notionalAmount) && Intrinsics.EZpvd((Object) this.notionalCurrency, (Object) earlyFillQuoteBean.notionalCurrency) && Intrinsics.EZpvd((Object) this.price, (Object) earlyFillQuoteBean.price) && Intrinsics.EZpvd((Object) this.ttlMs, (Object) earlyFillQuoteBean.ttlMs) && Intrinsics.EZpvd((Object) this.notionalAmountPrecision, (Object) earlyFillQuoteBean.notionalAmountPrecision) && Intrinsics.EZpvd((Object) this.pricePrecision, (Object) earlyFillQuoteBean.pricePrecision) && Intrinsics.EZpvd((Object) this.earlyFillAmountPrecision, (Object) earlyFillQuoteBean.earlyFillAmountPrecision) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) earlyFillQuoteBean.tradeSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillAmount() {
        return this.earlyFillAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillAmountPrecision() {
        return this.earlyFillAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyFillCurrency() {
        return this.earlyFillCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalAmount() {
        return this.notionalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalAmountPrecision() {
        return this.notionalAmountPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCurrency() {
        return this.notionalCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceDigit() {
        return this.pricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPricePrecision() {
        return this.pricePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTtlMs() {
        return this.ttlMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.alternativeCurrency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.earlyFillAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.earlyFillCurrency;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.notionalAmount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.notionalCurrency;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.price;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.ttlMs;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.notionalAmountPrecision;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.pricePrecision;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.earlyFillAmountPrecision;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tradeSide;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillAmount(String str) {
        this.earlyFillAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillAmountPrecision(String str) {
        this.earlyFillAmountPrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarlyFillCurrency(String str) {
        this.earlyFillCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalAmount(String str) {
        this.notionalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalAmountPrecision(String str) {
        this.notionalAmountPrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalCurrency(String str) {
        this.notionalCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPricePrecision(String str) {
        this.pricePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTtlMs(String str) {
        this.ttlMs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyFillQuoteBean(currency=" + this.currency + ", alternativeCurrency=" + this.alternativeCurrency + ", earlyFillAmount=" + this.earlyFillAmount + ", earlyFillCurrency=" + this.earlyFillCurrency + ", notionalAmount=" + this.notionalAmount + ", notionalCurrency=" + this.notionalCurrency + ", price=" + this.price + ", ttlMs=" + this.ttlMs + ", notionalAmountPrecision=" + this.notionalAmountPrecision + ", pricePrecision=" + this.pricePrecision + ", earlyFillAmountPrecision=" + this.earlyFillAmountPrecision + ", tradeSide=" + this.tradeSide + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currency);
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.earlyFillAmount);
        parcel.writeString(this.earlyFillCurrency);
        parcel.writeString(this.notionalAmount);
        parcel.writeString(this.notionalCurrency);
        parcel.writeString(this.price);
        parcel.writeString(this.ttlMs);
        parcel.writeString(this.notionalAmountPrecision);
        parcel.writeString(this.pricePrecision);
        parcel.writeString(this.earlyFillAmountPrecision);
        parcel.writeString(this.tradeSide);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EarlyFillQuoteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyFillQuoteBean> serializer() {
            return EarlyFillQuoteBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyFillQuoteBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
        if ((i & 2) == 0) {
            this.alternativeCurrency = null;
        } else {
            this.alternativeCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.earlyFillAmount = null;
        } else {
            this.earlyFillAmount = str3;
        }
        if ((i & 8) == 0) {
            this.earlyFillCurrency = null;
        } else {
            this.earlyFillCurrency = str4;
        }
        if ((i & 16) == 0) {
            this.notionalAmount = null;
        } else {
            this.notionalAmount = str5;
        }
        if ((i & 32) == 0) {
            this.notionalCurrency = null;
        } else {
            this.notionalCurrency = str6;
        }
        if ((i & 64) == 0) {
            this.price = null;
        } else {
            this.price = str7;
        }
        if ((i & 128) == 0) {
            this.ttlMs = null;
        } else {
            this.ttlMs = str8;
        }
        if ((i & 256) == 0) {
            this.notionalAmountPrecision = null;
        } else {
            this.notionalAmountPrecision = str9;
        }
        if ((i & 512) == 0) {
            this.pricePrecision = null;
        } else {
            this.pricePrecision = str10;
        }
        if ((i & 1024) == 0) {
            this.earlyFillAmountPrecision = null;
        } else {
            this.earlyFillAmountPrecision = str11;
        }
        if ((i & 2048) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EarlyFillQuoteBean earlyFillQuoteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || earlyFillQuoteBean.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, earlyFillQuoteBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earlyFillQuoteBean.alternativeCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, earlyFillQuoteBean.alternativeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || earlyFillQuoteBean.earlyFillAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, earlyFillQuoteBean.earlyFillAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || earlyFillQuoteBean.earlyFillCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, earlyFillQuoteBean.earlyFillCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || earlyFillQuoteBean.notionalAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, earlyFillQuoteBean.notionalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || earlyFillQuoteBean.notionalCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, earlyFillQuoteBean.notionalCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || earlyFillQuoteBean.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, earlyFillQuoteBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || earlyFillQuoteBean.ttlMs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, earlyFillQuoteBean.ttlMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || earlyFillQuoteBean.notionalAmountPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, earlyFillQuoteBean.notionalAmountPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || earlyFillQuoteBean.pricePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, earlyFillQuoteBean.pricePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || earlyFillQuoteBean.earlyFillAmountPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, earlyFillQuoteBean.earlyFillAmountPrecision);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && earlyFillQuoteBean.tradeSide == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, earlyFillQuoteBean.tradeSide);
    }

    public EarlyFillQuoteBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.currency = str;
        this.alternativeCurrency = str2;
        this.earlyFillAmount = str3;
        this.earlyFillCurrency = str4;
        this.notionalAmount = str5;
        this.notionalCurrency = str6;
        this.price = str7;
        this.ttlMs = str8;
        this.notionalAmountPrecision = str9;
        this.pricePrecision = str10;
        this.earlyFillAmountPrecision = str11;
        this.tradeSide = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:347) call: com.okinc.unify_trade.biz.EarlyFillQuoteBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EarlyFillQuoteBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? str12 : null);
    }

    public final String getTotalDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.notionalAmountPrecision : this.earlyFillAmountPrecision;
    }

    public final String getAmountDigit() {
        return Intrinsics.EZpvd((Object) this.tradeSide, (Object) "Buy") ? this.earlyFillAmountPrecision : this.notionalAmountPrecision;
    }
}
