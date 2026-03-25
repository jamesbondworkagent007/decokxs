package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CryptoAnalysisBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CryptoAnalysisBean> CREATOR = new Creator();
    private String calcTime;
    private String coinFullName;
    private String coinIcon;
    private String coinId;
    private String coinName;
    private String holdingPer;
    private String holdingQuantity;
    private String holdingValue;
    private String holdingValueUsd;
    private String isFiat;
    private String isLiab;
    private String isStableCcy;
    private String pnlPer;
    private String pnlValue;
    private String sign;
    private String unitCost;
    private String unitPrice;

    public static final class Creator implements Parcelable.Creator<CryptoAnalysisBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAnalysisBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CryptoAnalysisBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAnalysisBean[] newArray(int i) {
            return new CryptoAnalysisBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoAnalysisBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.unitCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.pnlValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.isLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.isStableCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pnlPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.calcTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.holdingQuantity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.holdingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.holdingValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.holdingPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.unitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoAnalysisBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        return new CryptoAnalysisBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
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
        if (!(obj instanceof CryptoAnalysisBean)) {
            return false;
        }
        CryptoAnalysisBean cryptoAnalysisBean = (CryptoAnalysisBean) obj;
        return Intrinsics.EZpvd((Object) this.coinId, (Object) cryptoAnalysisBean.coinId) && Intrinsics.EZpvd((Object) this.coinIcon, (Object) cryptoAnalysisBean.coinIcon) && Intrinsics.EZpvd((Object) this.coinName, (Object) cryptoAnalysisBean.coinName) && Intrinsics.EZpvd((Object) this.coinFullName, (Object) cryptoAnalysisBean.coinFullName) && Intrinsics.EZpvd((Object) this.holdingQuantity, (Object) cryptoAnalysisBean.holdingQuantity) && Intrinsics.EZpvd((Object) this.holdingValue, (Object) cryptoAnalysisBean.holdingValue) && Intrinsics.EZpvd((Object) this.holdingValueUsd, (Object) cryptoAnalysisBean.holdingValueUsd) && Intrinsics.EZpvd((Object) this.holdingPer, (Object) cryptoAnalysisBean.holdingPer) && Intrinsics.EZpvd((Object) this.unitPrice, (Object) cryptoAnalysisBean.unitPrice) && Intrinsics.EZpvd((Object) this.unitCost, (Object) cryptoAnalysisBean.unitCost) && Intrinsics.EZpvd((Object) this.pnlValue, (Object) cryptoAnalysisBean.pnlValue) && Intrinsics.EZpvd((Object) this.isLiab, (Object) cryptoAnalysisBean.isLiab) && Intrinsics.EZpvd((Object) this.isStableCcy, (Object) cryptoAnalysisBean.isStableCcy) && Intrinsics.EZpvd((Object) this.pnlPer, (Object) cryptoAnalysisBean.pnlPer) && Intrinsics.EZpvd((Object) this.calcTime, (Object) cryptoAnalysisBean.calcTime) && Intrinsics.EZpvd((Object) this.isFiat, (Object) cryptoAnalysisBean.isFiat) && Intrinsics.EZpvd((Object) this.sign, (Object) cryptoAnalysisBean.sign);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalcTime() {
        return this.calcTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinFullName() {
        return this.coinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingPer() {
        return this.holdingPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingQuantity() {
        return this.holdingQuantity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingValue() {
        return this.holdingValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingValueUsd() {
        return this.holdingValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlPer() {
        return this.pnlPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlValue() {
        return this.pnlValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitCost() {
        return this.unitCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitPrice() {
        return this.unitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coinIcon;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.coinName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.coinFullName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.holdingQuantity;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.holdingValue;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.holdingValueUsd;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.holdingPer;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.unitPrice;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.unitCost;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.pnlValue;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.isLiab;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.isStableCcy;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.pnlPer;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.calcTime;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.isFiat;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.sign;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str17 == null ? 0 : str17.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isFiat() {
        return this.isFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLiab() {
        return this.isLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isStableCcy() {
        return this.isStableCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalcTime(String str) {
        this.calcTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinFullName(String str) {
        this.coinFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIcon(String str) {
        this.coinIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(String str) {
        this.coinId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(String str) {
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiat(String str) {
        this.isFiat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingPer(String str) {
        this.holdingPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingQuantity(String str) {
        this.holdingQuantity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingValue(String str) {
        this.holdingValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingValueUsd(String str) {
        this.holdingValueUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(String str) {
        this.isLiab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlPer(String str) {
        this.pnlPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlValue(String str) {
        this.pnlValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign(String str) {
        this.sign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStableCcy(String str) {
        this.isStableCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitCost(String str) {
        this.unitCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitPrice(String str) {
        this.unitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CryptoAnalysisBean(coinId=" + this.coinId + ", coinIcon=" + this.coinIcon + ", coinName=" + this.coinName + ", coinFullName=" + this.coinFullName + ", holdingQuantity=" + this.holdingQuantity + ", holdingValue=" + this.holdingValue + ", holdingValueUsd=" + this.holdingValueUsd + ", holdingPer=" + this.holdingPer + ", unitPrice=" + this.unitPrice + ", unitCost=" + this.unitCost + ", pnlValue=" + this.pnlValue + ", isLiab=" + this.isLiab + ", isStableCcy=" + this.isStableCcy + ", pnlPer=" + this.pnlPer + ", calcTime=" + this.calcTime + ", isFiat=" + this.isFiat + ", sign=" + this.sign + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinId);
        parcel.writeString(this.coinIcon);
        parcel.writeString(this.coinName);
        parcel.writeString(this.coinFullName);
        parcel.writeString(this.holdingQuantity);
        parcel.writeString(this.holdingValue);
        parcel.writeString(this.holdingValueUsd);
        parcel.writeString(this.holdingPer);
        parcel.writeString(this.unitPrice);
        parcel.writeString(this.unitCost);
        parcel.writeString(this.pnlValue);
        parcel.writeString(this.isLiab);
        parcel.writeString(this.isStableCcy);
        parcel.writeString(this.pnlPer);
        parcel.writeString(this.calcTime);
        parcel.writeString(this.isFiat);
        parcel.writeString(this.sign);
    }

    public CryptoAnalysisBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.coinId = str;
        this.coinIcon = str2;
        this.coinName = str3;
        this.coinFullName = str4;
        this.holdingQuantity = str5;
        this.holdingValue = str6;
        this.holdingValueUsd = str7;
        this.holdingPer = str8;
        this.unitPrice = str9;
        this.unitCost = str10;
        this.pnlValue = str11;
        this.isLiab = str12;
        this.isStableCcy = str13;
        this.pnlPer = str14;
        this.calcTime = str15;
        this.isFiat = str16;
        this.sign = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.CryptoAnalysisBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CryptoAnalysisBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17);
    }
}
