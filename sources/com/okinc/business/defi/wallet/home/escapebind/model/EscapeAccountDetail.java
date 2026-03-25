package com.okinc.business.defi.wallet.home.escapebind.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class EscapeAccountDetail implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final String chainIndex;
    private final String chainName;
    private final String coinAmount;
    private final Long coinId;
    private final String currencyAmount;
    private final Integer decimalNum;
    private final Integer displayPrecision;
    private final Boolean isMainCoin;
    private final String logo;
    private final String name;
    private final String originalCoinAmount;
    private final Long riskType;
    private final String symbol;
    private final String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EscapeAccountDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EscapeAccountDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountDetail createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string10 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EscapeAccountDetail(string, string2, string3, string4, lValueOf, string5, string6, string7, string8, string9, numValueOf, numValueOf2, string10, lValueOf2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountDetail[] newArray(int i) {
            return new EscapeAccountDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EscapeAccountDetail() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Long) null, (Boolean) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.originalCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeAccountDetail copy(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, Long l2, Boolean bool) {
        return new EscapeAccountDetail(str, str2, str3, str4, l, str5, str6, str7, str8, str9, num, num2, str10, l2, bool);
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
        if (!(obj instanceof EscapeAccountDetail)) {
            return false;
        }
        EscapeAccountDetail escapeAccountDetail = (EscapeAccountDetail) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) escapeAccountDetail.address) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) escapeAccountDetail.tokenAddress) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) escapeAccountDetail.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) escapeAccountDetail.chainName) && Intrinsics.EZpvd(this.coinId, escapeAccountDetail.coinId) && Intrinsics.EZpvd((Object) this.symbol, (Object) escapeAccountDetail.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) escapeAccountDetail.name) && Intrinsics.EZpvd((Object) this.logo, (Object) escapeAccountDetail.logo) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) escapeAccountDetail.coinAmount) && Intrinsics.EZpvd((Object) this.originalCoinAmount, (Object) escapeAccountDetail.originalCoinAmount) && Intrinsics.EZpvd(this.decimalNum, escapeAccountDetail.decimalNum) && Intrinsics.EZpvd(this.displayPrecision, escapeAccountDetail.displayPrecision) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) escapeAccountDetail.currencyAmount) && Intrinsics.EZpvd(this.riskType, escapeAccountDetail.riskType) && Intrinsics.EZpvd(this.isMainCoin, escapeAccountDetail.isMainCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisplayPrecision() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalCoinAmount() {
        return this.originalCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRiskType() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainIndex;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Long l = this.coinId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str5 = this.symbol;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.name;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.logo;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.coinAmount;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.originalCoinAmount;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        Integer num = this.decimalNum;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        Integer num2 = this.displayPrecision;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        String str10 = this.currencyAmount;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        Long l2 = this.riskType;
        int iHashCode14 = l2 == null ? 0 : l2.hashCode();
        Boolean bool = this.isMainCoin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isMainCoin() {
        return this.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeAccountDetail(address=" + this.address + ", tokenAddress=" + this.tokenAddress + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", coinId=" + this.coinId + ", symbol=" + this.symbol + ", name=" + this.name + ", logo=" + this.logo + ", coinAmount=" + this.coinAmount + ", originalCoinAmount=" + this.originalCoinAmount + ", decimalNum=" + this.decimalNum + ", displayPrecision=" + this.displayPrecision + ", currencyAmount=" + this.currencyAmount + ", riskType=" + this.riskType + ", isMainCoin=" + this.isMainCoin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.symbol);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.originalCoinAmount);
        Integer num = this.decimalNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.displayPrecision;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.currencyAmount);
        Long l2 = this.riskType;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Boolean bool = this.isMainCoin;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeAccountDetail> serializer() {
            return EscapeAccountDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeAccountDetail(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, Long l2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = str3;
        }
        if ((i & 8) == 0) {
            this.chainName = null;
        } else {
            this.chainName = str4;
        }
        if ((i & 16) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 32) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str5;
        }
        if ((i & 64) == 0) {
            this.name = null;
        } else {
            this.name = str6;
        }
        if ((i & 128) == 0) {
            this.logo = null;
        } else {
            this.logo = str7;
        }
        if ((i & 256) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str8;
        }
        if ((i & 512) == 0) {
            this.originalCoinAmount = null;
        } else {
            this.originalCoinAmount = str9;
        }
        if ((i & 1024) == 0) {
            this.decimalNum = null;
        } else {
            this.decimalNum = num;
        }
        if ((i & 2048) == 0) {
            this.displayPrecision = null;
        } else {
            this.displayPrecision = num2;
        }
        if ((i & 4096) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str10;
        }
        if ((i & 8192) == 0) {
            this.riskType = null;
        } else {
            this.riskType = l2;
        }
        this.isMainCoin = (i & 16384) == 0 ? Boolean.FALSE : bool;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeAccountDetail escapeAccountDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || escapeAccountDetail.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, escapeAccountDetail.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || escapeAccountDetail.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, escapeAccountDetail.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || escapeAccountDetail.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, escapeAccountDetail.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || escapeAccountDetail.chainName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, escapeAccountDetail.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || escapeAccountDetail.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, escapeAccountDetail.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || escapeAccountDetail.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, escapeAccountDetail.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || escapeAccountDetail.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, escapeAccountDetail.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || escapeAccountDetail.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, escapeAccountDetail.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || escapeAccountDetail.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, escapeAccountDetail.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || escapeAccountDetail.originalCoinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, escapeAccountDetail.originalCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || escapeAccountDetail.decimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, escapeAccountDetail.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || escapeAccountDetail.displayPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, escapeAccountDetail.displayPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || escapeAccountDetail.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, escapeAccountDetail.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || escapeAccountDetail.riskType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, escapeAccountDetail.riskType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd(escapeAccountDetail.isMainCoin, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, escapeAccountDetail.isMainCoin);
    }

    public EscapeAccountDetail(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, Long l2, Boolean bool) {
        this.address = str;
        this.tokenAddress = str2;
        this.chainIndex = str3;
        this.chainName = str4;
        this.coinId = l;
        this.symbol = str5;
        this.name = str6;
        this.logo = str7;
        this.coinAmount = str8;
        this.originalCoinAmount = str9;
        this.decimalNum = num;
        this.displayPrecision = num2;
        this.currencyAmount = str10;
        this.riskType = l2;
        this.isMainCoin = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.Long) : (null java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0076: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Boolean):void (m)] (LINE:65) call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ EscapeAccountDetail(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, Long l2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : str10, (i & 8192) == 0 ? l2 : null, (i & 16384) != 0 ? Boolean.FALSE : bool);
    }
}
