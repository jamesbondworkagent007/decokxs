package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexQuoteInfo implements Parcelable {
    public static final int $stable = 0;
    private final String amountOut;
    private final String dexName;
    private final String dexShowName;
    private final String exchangeDirection;
    private final String extraInfo;
    private final String feeRate;
    private final String fromTokenIndex;
    private final String isUnderlying;
    private final String okLinkUrl;
    private final String pairAddress;
    private final String percent;
    private final String poolId;
    private final String slippage;
    private final String toTokenContractAddress;
    private final String toTokenIndex;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexQuoteInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexQuoteInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexQuoteInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteInfo[] newArray(int i) {
            return new DexQuoteInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexQuoteInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromTokenIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.toTokenIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.isUnderlying;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.extraInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.dexShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.okLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pairAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        return new DexQuoteInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
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
        if (!(obj instanceof DexQuoteInfo)) {
            return false;
        }
        DexQuoteInfo dexQuoteInfo = (DexQuoteInfo) obj;
        return Intrinsics.EZpvd((Object) this.amountOut, (Object) dexQuoteInfo.amountOut) && Intrinsics.EZpvd((Object) this.dexName, (Object) dexQuoteInfo.dexName) && Intrinsics.EZpvd((Object) this.exchangeDirection, (Object) dexQuoteInfo.exchangeDirection) && Intrinsics.EZpvd((Object) this.feeRate, (Object) dexQuoteInfo.feeRate) && Intrinsics.EZpvd((Object) this.okLinkUrl, (Object) dexQuoteInfo.okLinkUrl) && Intrinsics.EZpvd((Object) this.pairAddress, (Object) dexQuoteInfo.pairAddress) && Intrinsics.EZpvd((Object) this.percent, (Object) dexQuoteInfo.percent) && Intrinsics.EZpvd((Object) this.slippage, (Object) dexQuoteInfo.slippage) && Intrinsics.EZpvd((Object) this.toTokenContractAddress, (Object) dexQuoteInfo.toTokenContractAddress) && Intrinsics.EZpvd((Object) this.fromTokenIndex, (Object) dexQuoteInfo.fromTokenIndex) && Intrinsics.EZpvd((Object) this.toTokenIndex, (Object) dexQuoteInfo.toTokenIndex) && Intrinsics.EZpvd((Object) this.isUnderlying, (Object) dexQuoteInfo.isUnderlying) && Intrinsics.EZpvd((Object) this.poolId, (Object) dexQuoteInfo.poolId) && Intrinsics.EZpvd((Object) this.extraInfo, (Object) dexQuoteInfo.extraInfo) && Intrinsics.EZpvd((Object) this.dexShowName, (Object) dexQuoteInfo.dexShowName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountOut() {
        return this.amountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexName() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexShowName() {
        return this.dexShowName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenIndex() {
        return this.fromTokenIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkLinkUrl() {
        return this.okLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairAddress() {
        return this.pairAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenContractAddress() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenIndex() {
        return this.toTokenIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amountOut.hashCode();
        int iHashCode2 = this.dexName.hashCode();
        int iHashCode3 = this.exchangeDirection.hashCode();
        int iHashCode4 = this.feeRate.hashCode();
        int iHashCode5 = this.okLinkUrl.hashCode();
        int iHashCode6 = this.pairAddress.hashCode();
        int iHashCode7 = this.percent.hashCode();
        int iHashCode8 = this.slippage.hashCode();
        int iHashCode9 = this.toTokenContractAddress.hashCode();
        int iHashCode10 = this.fromTokenIndex.hashCode();
        int iHashCode11 = this.toTokenIndex.hashCode();
        int iHashCode12 = this.isUnderlying.hashCode();
        int iHashCode13 = this.poolId.hashCode();
        String str = this.extraInfo;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.dexShowName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isUnderlying() {
        return this.isUnderlying;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexQuoteInfo(amountOut=" + this.amountOut + ", dexName=" + this.dexName + ", exchangeDirection=" + this.exchangeDirection + ", feeRate=" + this.feeRate + ", okLinkUrl=" + this.okLinkUrl + ", pairAddress=" + this.pairAddress + ", percent=" + this.percent + ", slippage=" + this.slippage + ", toTokenContractAddress=" + this.toTokenContractAddress + ", fromTokenIndex=" + this.fromTokenIndex + ", toTokenIndex=" + this.toTokenIndex + ", isUnderlying=" + this.isUnderlying + ", poolId=" + this.poolId + ", extraInfo=" + this.extraInfo + ", dexShowName=" + this.dexShowName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amountOut);
        parcel.writeString(this.dexName);
        parcel.writeString(this.exchangeDirection);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.okLinkUrl);
        parcel.writeString(this.pairAddress);
        parcel.writeString(this.percent);
        parcel.writeString(this.slippage);
        parcel.writeString(this.toTokenContractAddress);
        parcel.writeString(this.fromTokenIndex);
        parcel.writeString(this.toTokenIndex);
        parcel.writeString(this.isUnderlying);
        parcel.writeString(this.poolId);
        parcel.writeString(this.extraInfo);
        parcel.writeString(this.dexShowName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexQuoteInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexQuoteInfo> serializer() {
            return DexQuoteInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexQuoteInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amountOut = "";
        } else {
            this.amountOut = str;
        }
        if ((i & 2) == 0) {
            this.dexName = "";
        } else {
            this.dexName = str2;
        }
        if ((i & 4) == 0) {
            this.exchangeDirection = "";
        } else {
            this.exchangeDirection = str3;
        }
        if ((i & 8) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str4;
        }
        if ((i & 16) == 0) {
            this.okLinkUrl = "";
        } else {
            this.okLinkUrl = str5;
        }
        if ((i & 32) == 0) {
            this.pairAddress = "";
        } else {
            this.pairAddress = str6;
        }
        if ((i & 64) == 0) {
            this.percent = "";
        } else {
            this.percent = str7;
        }
        if ((i & 128) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str8;
        }
        if ((i & 256) == 0) {
            this.toTokenContractAddress = "";
        } else {
            this.toTokenContractAddress = str9;
        }
        if ((i & 512) == 0) {
            this.fromTokenIndex = "";
        } else {
            this.fromTokenIndex = str10;
        }
        if ((i & 1024) == 0) {
            this.toTokenIndex = "";
        } else {
            this.toTokenIndex = str11;
        }
        if ((i & 2048) == 0) {
            this.isUnderlying = "";
        } else {
            this.isUnderlying = str12;
        }
        if ((i & 4096) == 0) {
            this.poolId = "";
        } else {
            this.poolId = str13;
        }
        this.extraInfo = (i & 8192) == 0 ? null : str14;
        if ((i & 16384) == 0) {
            this.dexShowName = "";
        } else {
            this.dexShowName = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexQuoteInfo dexQuoteInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexQuoteInfo.amountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexQuoteInfo.amountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexQuoteInfo.dexName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexQuoteInfo.dexName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexQuoteInfo.exchangeDirection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexQuoteInfo.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexQuoteInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexQuoteInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexQuoteInfo.okLinkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexQuoteInfo.okLinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexQuoteInfo.pairAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexQuoteInfo.pairAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexQuoteInfo.percent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexQuoteInfo.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexQuoteInfo.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexQuoteInfo.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexQuoteInfo.toTokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexQuoteInfo.toTokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexQuoteInfo.fromTokenIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexQuoteInfo.fromTokenIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexQuoteInfo.toTokenIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexQuoteInfo.toTokenIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexQuoteInfo.isUnderlying, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexQuoteInfo.isUnderlying);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexQuoteInfo.poolId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexQuoteInfo.poolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dexQuoteInfo.extraInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, dexQuoteInfo.extraInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) dexQuoteInfo.dexShowName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, dexQuoteInfo.dexShowName);
    }

    public DexQuoteInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        this.amountOut = str;
        this.dexName = str2;
        this.exchangeDirection = str3;
        this.feeRate = str4;
        this.okLinkUrl = str5;
        this.pairAddress = str6;
        this.percent = str7;
        this.slippage = str8;
        this.toTokenContractAddress = str9;
        this.fromTokenIndex = str10;
        this.toTokenIndex = str11;
        this.isUnderlying = str12;
        this.poolId = str13;
        this.extraInfo = str14;
        this.dexShowName = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1680) call: com.okinc.business.dexlogic.bean.DexQuoteInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexQuoteInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? null : str14, (i & 16384) == 0 ? str15 : "");
    }
}
