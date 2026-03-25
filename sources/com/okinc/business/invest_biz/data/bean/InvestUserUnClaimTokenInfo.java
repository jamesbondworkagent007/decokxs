package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUserUnClaimTokenInfo implements Parcelable {
    private final Integer buttonType;
    private final String callDataExtJson;
    private final Integer callDataRewardType;
    private final String claimIndex;
    private final String coinAmount;
    private final String currencyAmount;
    private final InvestUserRewardDetailPromptInformation extraData;
    private final String network;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenPrecision;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserUnClaimTokenInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUserUnClaimTokenInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserUnClaimTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUserUnClaimTokenInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? InvestUserRewardDetailPromptInformation.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserUnClaimTokenInfo[] newArray(int i) {
            return new InvestUserUnClaimTokenInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserUnClaimTokenInfo() {
        this((Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (InvestUserRewardDetailPromptInformation) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.callDataRewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.claimIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardDetailPromptInformation component7() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserUnClaimTokenInfo copy(Integer num, String str, Integer num2, String str2, String str3, String str4, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, String str5, String str6, String str7, String str8, String str9) {
        return new InvestUserUnClaimTokenInfo(num, str, num2, str2, str3, str4, investUserRewardDetailPromptInformation, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof InvestUserUnClaimTokenInfo)) {
            return false;
        }
        InvestUserUnClaimTokenInfo investUserUnClaimTokenInfo = (InvestUserUnClaimTokenInfo) obj;
        return Intrinsics.EZpvd(this.buttonType, investUserUnClaimTokenInfo.buttonType) && Intrinsics.EZpvd((Object) this.callDataExtJson, (Object) investUserUnClaimTokenInfo.callDataExtJson) && Intrinsics.EZpvd(this.callDataRewardType, investUserUnClaimTokenInfo.callDataRewardType) && Intrinsics.EZpvd((Object) this.claimIndex, (Object) investUserUnClaimTokenInfo.claimIndex) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) investUserUnClaimTokenInfo.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investUserUnClaimTokenInfo.currencyAmount) && Intrinsics.EZpvd(this.extraData, investUserUnClaimTokenInfo.extraData) && Intrinsics.EZpvd((Object) this.network, (Object) investUserUnClaimTokenInfo.network) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investUserUnClaimTokenInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investUserUnClaimTokenInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investUserUnClaimTokenInfo.tokenPrecision) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investUserUnClaimTokenInfo.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getButtonType() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallDataExtJson() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallDataRewardType() {
        return this.callDataRewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClaimIndex() {
        return this.claimIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardDetailPromptInformation getExtraData() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.buttonType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.callDataExtJson;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.callDataRewardType;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.claimIndex;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.coinAmount;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currencyAmount;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation = this.extraData;
        int iHashCode7 = investUserRewardDetailPromptInformation == null ? 0 : investUserRewardDetailPromptInformation.hashCode();
        String str5 = this.network;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenAddress;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenLogo;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenPrecision;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tokenSymbol;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserUnClaimTokenInfo(buttonType=" + this.buttonType + ", callDataExtJson=" + this.callDataExtJson + ", callDataRewardType=" + this.callDataRewardType + ", claimIndex=" + this.claimIndex + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", extraData=" + this.extraData + ", network=" + this.network + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenPrecision=" + this.tokenPrecision + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.buttonType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.callDataExtJson);
        Integer num2 = this.callDataRewardType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.claimIndex);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation = this.extraData;
        if (investUserRewardDetailPromptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUserRewardDetailPromptInformation.writeToParcel(parcel, i);
        }
        parcel.writeString(this.network);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenPrecision);
        parcel.writeString(this.tokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserUnClaimTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserUnClaimTokenInfo> serializer() {
            return InvestUserUnClaimTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserUnClaimTokenInfo(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buttonType = null;
        } else {
            this.buttonType = num;
        }
        if ((i & 2) == 0) {
            this.callDataExtJson = null;
        } else {
            this.callDataExtJson = str;
        }
        if ((i & 4) == 0) {
            this.callDataRewardType = null;
        } else {
            this.callDataRewardType = num2;
        }
        if ((i & 8) == 0) {
            this.claimIndex = null;
        } else {
            this.claimIndex = str2;
        }
        if ((i & 16) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str3;
        }
        if ((i & 32) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str4;
        }
        if ((i & 64) == 0) {
            this.extraData = null;
        } else {
            this.extraData = investUserRewardDetailPromptInformation;
        }
        if ((i & 128) == 0) {
            this.network = null;
        } else {
            this.network = str5;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str6;
        }
        if ((i & 512) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str7;
        }
        if ((i & 1024) == 0) {
            this.tokenPrecision = null;
        } else {
            this.tokenPrecision = str8;
        }
        if ((i & 2048) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserUnClaimTokenInfo investUserUnClaimTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserUnClaimTokenInfo.buttonType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, investUserUnClaimTokenInfo.buttonType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserUnClaimTokenInfo.callDataExtJson != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.callDataExtJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUserUnClaimTokenInfo.callDataRewardType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, investUserUnClaimTokenInfo.callDataRewardType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUserUnClaimTokenInfo.claimIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.claimIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUserUnClaimTokenInfo.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUserUnClaimTokenInfo.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUserUnClaimTokenInfo.extraData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, InvestUserRewardDetailPromptInformation$$serializer.INSTANCE, investUserUnClaimTokenInfo.extraData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investUserUnClaimTokenInfo.network != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investUserUnClaimTokenInfo.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investUserUnClaimTokenInfo.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investUserUnClaimTokenInfo.tokenPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.tokenPrecision);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && investUserUnClaimTokenInfo.tokenSymbol == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, investUserUnClaimTokenInfo.tokenSymbol);
    }

    public InvestUserUnClaimTokenInfo(Integer num, String str, Integer num2, String str2, String str3, String str4, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, String str5, String str6, String str7, String str8, String str9) {
        this.buttonType = num;
        this.callDataExtJson = str;
        this.callDataRewardType = num2;
        this.claimIndex = str2;
        this.coinAmount = str3;
        this.currencyAmount = str4;
        this.extraData = investUserRewardDetailPromptInformation;
        this.network = str5;
        this.tokenAddress = str6;
        this.tokenLogo = str7;
        this.tokenPrecision = str8;
        this.tokenSymbol = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation) : (r20v0 com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:346) call: com.okinc.business.invest_biz.data.bean.InvestUserUnClaimTokenInfo.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUserUnClaimTokenInfo(Integer num, String str, Integer num2, String str2, String str3, String str4, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : investUserRewardDetailPromptInformation, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? str9 : null);
    }
}
