package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CoinPrice implements Parcelable {
    private String address;
    private Integer anchorStatus;
    private String chainName;
    private long coinId;
    private boolean hasPercent;
    private boolean hasPrice;
    private String price;
    private String priceChangePercent24h;
    private Long priceCoinId;
    private Integer priceType;
    private String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinPrice> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinPrice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinPrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinPrice(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinPrice[] newArray(int i) {
            return new CoinPrice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinPrice() {
        this((String) null, (String) null, 0L, (Long) null, (Integer) null, false, false, (String) null, (String) null, (String) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.anchorStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.priceCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.hasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.hasPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceChangePercent24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPrice copy(String str, String str2, long j, Long l, Integer num, boolean z, boolean z2, String str3, String str4, String str5, Integer num2) {
        return new CoinPrice(str, str2, j, l, num, z, z2, str3, str4, str5, num2);
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
        if (!(obj instanceof CoinPrice)) {
            return false;
        }
        CoinPrice coinPrice = (CoinPrice) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) coinPrice.address) && Intrinsics.EZpvd((Object) this.chainName, (Object) coinPrice.chainName) && this.coinId == coinPrice.coinId && Intrinsics.EZpvd(this.priceCoinId, coinPrice.priceCoinId) && Intrinsics.EZpvd(this.priceType, coinPrice.priceType) && this.hasPrice == coinPrice.hasPrice && this.hasPercent == coinPrice.hasPercent && Intrinsics.EZpvd((Object) this.price, (Object) coinPrice.price) && Intrinsics.EZpvd((Object) this.priceChangePercent24h, (Object) coinPrice.priceChangePercent24h) && Intrinsics.EZpvd((Object) this.symbol, (Object) coinPrice.symbol) && Intrinsics.EZpvd(this.anchorStatus, coinPrice.anchorStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAnchorStatus() {
        return this.anchorStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasPercent() {
        return this.hasPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasPrice() {
        return this.hasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChangePercent24h() {
        return this.priceChangePercent24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPriceCoinId() {
        return this.priceCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPriceType() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealPrice() {
        return this.hasPrice ? this.price : "0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Long.hashCode(this.coinId);
        Long l = this.priceCoinId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Integer num = this.priceType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        int iHashCode6 = Boolean.hashCode(this.hasPrice);
        int iHashCode7 = Boolean.hashCode(this.hasPercent);
        String str3 = this.price;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.priceChangePercent24h;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.symbol;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        Integer num2 = this.anchorStatus;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnchorStatus(Integer num) {
        this.anchorStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasPercent(boolean z) {
        this.hasPercent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasPrice(boolean z) {
        this.hasPrice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangePercent24h(String str) {
        this.priceChangePercent24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceCoinId(Long l) {
        this.priceCoinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceType(Integer num) {
        this.priceType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPrice(address=" + this.address + ", chainName=" + this.chainName + ", coinId=" + this.coinId + ", priceCoinId=" + this.priceCoinId + ", priceType=" + this.priceType + ", hasPrice=" + this.hasPrice + ", hasPercent=" + this.hasPercent + ", price=" + this.price + ", priceChangePercent24h=" + this.priceChangePercent24h + ", symbol=" + this.symbol + ", anchorStatus=" + this.anchorStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.chainName);
        parcel.writeLong(this.coinId);
        Long l = this.priceCoinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.priceType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.hasPrice ? 1 : 0);
        parcel.writeInt(this.hasPercent ? 1 : 0);
        parcel.writeString(this.price);
        parcel.writeString(this.priceChangePercent24h);
        parcel.writeString(this.symbol);
        Integer num2 = this.anchorStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.CoinPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinPrice> serializer() {
            return CoinPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinPrice(int i, String str, String str2, long j, Long l, Integer num, boolean z, boolean z2, String str3, String str4, String str5, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        this.priceCoinId = (i & 8) == 0 ? 0L : l;
        this.priceType = (i & 16) == 0 ? 0 : num;
        this.hasPrice = (i & 32) == 0 ? true : z;
        if ((i & 64) == 0) {
            this.hasPercent = false;
        } else {
            this.hasPercent = z2;
        }
        if ((i & 128) == 0) {
            this.price = "";
        } else {
            this.price = str3;
        }
        if ((i & 256) == 0) {
            this.priceChangePercent24h = "";
        } else {
            this.priceChangePercent24h = str4;
        }
        if ((i & 512) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str5;
        }
        this.anchorStatus = (i & 1024) == 0 ? null : num2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(CoinPrice coinPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinPrice.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, coinPrice.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) coinPrice.chainName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinPrice.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinPrice.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, coinPrice.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (l = coinPrice.priceCoinId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, coinPrice.priceCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num = coinPrice.priceType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, coinPrice.priceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !coinPrice.hasPrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, coinPrice.hasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || coinPrice.hasPercent) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, coinPrice.hasPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) coinPrice.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, coinPrice.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) coinPrice.priceChangePercent24h, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, coinPrice.priceChangePercent24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) coinPrice.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, coinPrice.symbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && coinPrice.anchorStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, coinPrice.anchorStatus);
    }

    public CoinPrice(String str, String str2, long j, Long l, Integer num, boolean z, boolean z2, String str3, String str4, String str5, Integer num2) {
        this.address = str;
        this.chainName = str2;
        this.coinId = j;
        this.priceCoinId = l;
        this.priceType = num;
        this.hasPrice = z;
        this.hasPercent = z2;
        this.price = str3;
        this.priceChangePercent24h = str4;
        this.symbol = str5;
        this.anchorStatus = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0077: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0027: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.Long, java.lang.Integer, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.business.defi.api.bean.CoinPrice.<init>(java.lang.String, java.lang.String, long, java.lang.Long, java.lang.Integer, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ CoinPrice(String str, String str2, long j, Long l, Integer num, boolean z, boolean z2, String str3, String str4, String str5, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : l, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? true : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) == 0 ? str5 : "", (i & 1024) != 0 ? null : num2);
    }

    public final boolean hasBestPrice() {
        Integer num = this.priceType;
        return num != null && num.intValue() == 1;
    }

    public final long bestPriceCoinId() {
        Long l = this.priceCoinId;
        return l != null ? l.longValue() : this.coinId;
    }

    public final boolean isAnchoredCoin() {
        Integer num = this.anchorStatus;
        return num != null && num.intValue() == 1;
    }
}
