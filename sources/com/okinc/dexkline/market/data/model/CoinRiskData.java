package com.okinc.dexkline.market.data.model;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CoinRiskData implements Parcelable {
    public final String buyTaxes;
    public final RiskLevelData contractAnalysis;
    public final String highRiskNum;
    public final String lowRiskNum;
    public final String middleRiskNum;
    public final HighRiskBannerData riskBannerData;
    public final String riskControlLevel;
    public final String riskLevel;
    public final String sellTaxes;
    public final RiskLevelData swapAnalysis;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinRiskData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CoinRiskData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinRiskData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinRiskData(parcel.readString(), parcel.readInt() == 0 ? null : RiskLevelData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RiskLevelData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HighRiskBannerData.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinRiskData[] newArray(int i) {
            return new CoinRiskData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinRiskData() {
        this((String) null, (RiskLevelData) null, (String) null, (String) null, (String) null, (String) null, (RiskLevelData) null, (HighRiskBannerData) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.highRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.sellTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinRiskData EZpvd(@NotNull String str, RiskLevelData riskLevelData, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, RiskLevelData riskLevelData2, HighRiskBannerData highRiskBannerData, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CoinRiskData(str, riskLevelData, str2, str3, str4, str5, riskLevelData2, highRiskBannerData, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.lowRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.buyTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.middleRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskLevelData copydefault() {
        return this.contractAnalysis;
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
        if (!(obj instanceof CoinRiskData)) {
            return false;
        }
        CoinRiskData coinRiskData = (CoinRiskData) obj;
        return Intrinsics.EZpvd((Object) this.buyTaxes, (Object) coinRiskData.buyTaxes) && Intrinsics.EZpvd(this.contractAnalysis, coinRiskData.contractAnalysis) && Intrinsics.EZpvd((Object) this.highRiskNum, (Object) coinRiskData.highRiskNum) && Intrinsics.EZpvd((Object) this.lowRiskNum, (Object) coinRiskData.lowRiskNum) && Intrinsics.EZpvd((Object) this.middleRiskNum, (Object) coinRiskData.middleRiskNum) && Intrinsics.EZpvd((Object) this.sellTaxes, (Object) coinRiskData.sellTaxes) && Intrinsics.EZpvd(this.swapAnalysis, coinRiskData.swapAnalysis) && Intrinsics.EZpvd(this.riskBannerData, coinRiskData.riskBannerData) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) coinRiskData.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) coinRiskData.riskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighRiskBannerData gEmmrt() {
        return this.riskBannerData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.buyTaxes.hashCode();
        RiskLevelData riskLevelData = this.contractAnalysis;
        int iHashCode2 = riskLevelData == null ? 0 : riskLevelData.hashCode();
        int iHashCode3 = this.highRiskNum.hashCode();
        int iHashCode4 = this.lowRiskNum.hashCode();
        int iHashCode5 = this.middleRiskNum.hashCode();
        int iHashCode6 = this.sellTaxes.hashCode();
        RiskLevelData riskLevelData2 = this.swapAnalysis;
        int iHashCode7 = riskLevelData2 == null ? 0 : riskLevelData2.hashCode();
        HighRiskBannerData highRiskBannerData = this.riskBannerData;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (highRiskBannerData != null ? highRiskBannerData.hashCode() : 0)) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinRiskData(buyTaxes=" + this.buyTaxes + ", contractAnalysis=" + this.contractAnalysis + ", highRiskNum=" + this.highRiskNum + ", lowRiskNum=" + this.lowRiskNum + ", middleRiskNum=" + this.middleRiskNum + ", sellTaxes=" + this.sellTaxes + ", swapAnalysis=" + this.swapAnalysis + ", riskBannerData=" + this.riskBannerData + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskLevelData valueOf() {
        return this.swapAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buyTaxes);
        RiskLevelData riskLevelData = this.contractAnalysis;
        if (riskLevelData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            riskLevelData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.highRiskNum);
        parcel.writeString(this.lowRiskNum);
        parcel.writeString(this.middleRiskNum);
        parcel.writeString(this.sellTaxes);
        RiskLevelData riskLevelData2 = this.swapAnalysis;
        if (riskLevelData2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            riskLevelData2.writeToParcel(parcel, i);
        }
        HighRiskBannerData highRiskBannerData = this.riskBannerData;
        if (highRiskBannerData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            highRiskBannerData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.riskControlLevel);
        parcel.writeString(this.riskLevel);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.CoinRiskData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinRiskData> serializer() {
            return CoinRiskData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinRiskData(int i, String str, RiskLevelData riskLevelData, String str2, String str3, String str4, String str5, RiskLevelData riskLevelData2, HighRiskBannerData highRiskBannerData, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buyTaxes = "";
        } else {
            this.buyTaxes = str;
        }
        if ((i & 2) == 0) {
            this.contractAnalysis = null;
        } else {
            this.contractAnalysis = riskLevelData;
        }
        if ((i & 4) == 0) {
            this.highRiskNum = "";
        } else {
            this.highRiskNum = str2;
        }
        if ((i & 8) == 0) {
            this.lowRiskNum = "";
        } else {
            this.lowRiskNum = str3;
        }
        if ((i & 16) == 0) {
            this.middleRiskNum = "";
        } else {
            this.middleRiskNum = str4;
        }
        if ((i & 32) == 0) {
            this.sellTaxes = "";
        } else {
            this.sellTaxes = str5;
        }
        if ((i & 64) == 0) {
            this.swapAnalysis = null;
        } else {
            this.swapAnalysis = riskLevelData2;
        }
        if ((i & 128) == 0) {
            this.riskBannerData = null;
        } else {
            this.riskBannerData = highRiskBannerData;
        }
        if ((i & 256) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str6;
        }
        if ((i & 512) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str7;
        }
    }

    public static final /* synthetic */ void copydefault(CoinRiskData coinRiskData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinRiskData.buyTaxes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinRiskData.buyTaxes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinRiskData.contractAnalysis != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, RiskLevelData$$serializer.INSTANCE, coinRiskData.contractAnalysis);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) coinRiskData.highRiskNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, coinRiskData.highRiskNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) coinRiskData.lowRiskNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, coinRiskData.lowRiskNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) coinRiskData.middleRiskNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, coinRiskData.middleRiskNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) coinRiskData.sellTaxes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, coinRiskData.sellTaxes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || coinRiskData.swapAnalysis != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, RiskLevelData$$serializer.INSTANCE, coinRiskData.swapAnalysis);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || coinRiskData.riskBannerData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, HighRiskBannerData$$serializer.INSTANCE, coinRiskData.riskBannerData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) coinRiskData.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, coinRiskData.riskControlLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) coinRiskData.riskLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, coinRiskData.riskLevel);
    }

    public CoinRiskData(@NotNull String str, RiskLevelData riskLevelData, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, RiskLevelData riskLevelData2, HighRiskBannerData highRiskBannerData, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.buyTaxes = str;
        this.contractAnalysis = riskLevelData;
        this.highRiskNum = str2;
        this.lowRiskNum = str3;
        this.middleRiskNum = str4;
        this.sellTaxes = str5;
        this.swapAnalysis = riskLevelData2;
        this.riskBannerData = highRiskBannerData;
        this.riskControlLevel = str6;
        this.riskLevel = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.data.model.RiskLevelData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.data.model.RiskLevelData) : (r13v0 com.okinc.dexkline.market.data.model.RiskLevelData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.data.model.RiskLevelData:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.data.model.RiskLevelData) : (r18v0 com.okinc.dexkline.market.data.model.RiskLevelData))
  (wrap:com.okinc.dexkline.market.data.model.HighRiskBannerData:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.dexkline.market.data.model.HighRiskBannerData) : (null com.okinc.dexkline.market.data.model.HighRiskBannerData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, com.okinc.dexkline.market.data.model.RiskLevelData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.data.model.RiskLevelData, com.okinc.dexkline.market.data.model.HighRiskBannerData, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.dexkline.market.data.model.CoinRiskData.<init>(java.lang.String, com.okinc.dexkline.market.data.model.RiskLevelData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.data.model.RiskLevelData, com.okinc.dexkline.market.data.model.HighRiskBannerData, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinRiskData(String str, RiskLevelData riskLevelData, String str2, String str3, String str4, String str5, RiskLevelData riskLevelData2, HighRiskBannerData highRiskBannerData, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : riskLevelData, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : riskLevelData2, (i & 128) == 0 ? highRiskBannerData : null, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? str7 : "");
    }
}
