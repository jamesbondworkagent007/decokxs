package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.buysell.api.data.BSCResultErrorParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BSCResultContentData implements Parcelable {
    public static final Parcelable.Creator<BSCResultContentData> CREATOR = new Creator();
    public BSCResultButtonActionType AEQbTJ;
    public String AYXKKw;
    public String AhwBna;
    public String AkhnZx;
    public boolean AuCTel;
    public String AubY;
    public String DbNXlk;
    public String EZpvd;
    public BSCResultErrorParams KWHzl;
    public String OLrzqt;
    public ImageType copydefault;
    public boolean djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public BSCResultButtonActionType fetchVPNInfo;
    public String gEmmrt;
    public String getFieldNames;
    public boolean getNewProxyInstance;
    public boolean hDKMBd;
    public BSCResultButtonActionType isConnected;
    public String iwGUEr;
    public boolean uzCIH;
    public boolean valueOf;
    public String values;
    public String wlaJM;

    public static final class Creator implements Parcelable.Creator<BSCResultContentData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCResultContentData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCResultContentData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, ImageType.valueOf(parcel.readString()), parcel.readInt() != 0, (BSCResultButtonActionType) parcel.readParcelable(BSCResultContentData.class.getClassLoader()), (BSCResultButtonActionType) parcel.readParcelable(BSCResultContentData.class.getClassLoader()), (BSCResultButtonActionType) parcel.readParcelable(BSCResultContentData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (BSCResultErrorParams) parcel.readParcelable(BSCResultContentData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCResultContentData[] newArray(int i) {
            return new BSCResultContentData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BSCResultContentData() {
        this(null, null, false, null, null, null, false, false, false, null, false, null, null, null, false, false, null, null, null, null, false, null, null, null, null, false, false, 134217727, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCResultButtonActionType AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageType EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCResultButtonActionType OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCResultContentData copydefault(@NotNull String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, String str5, boolean z2, boolean z3, boolean z4, @NotNull ImageType imageType, boolean z5, BSCResultButtonActionType bSCResultButtonActionType, BSCResultButtonActionType bSCResultButtonActionType2, BSCResultButtonActionType bSCResultButtonActionType3, boolean z6, boolean z7, @NotNull String str6, @NotNull String str7, @NotNull String str8, BSCResultErrorParams bSCResultErrorParams, boolean z8, String str9, String str10, String str11, String str12, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(imageType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new BSCResultContentData(str, str2, z, str3, str4, str5, z2, z3, z4, imageType, z5, bSCResultButtonActionType, bSCResultButtonActionType2, bSCResultButtonActionType3, z6, z7, str6, str7, str8, bSCResultErrorParams, z8, str9, str10, str11, str12, z9, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BSCResultContentData)) {
            return false;
        }
        BSCResultContentData bSCResultContentData = (BSCResultContentData) obj;
        return Intrinsics.EZpvd((Object) this.iwGUEr, (Object) bSCResultContentData.iwGUEr) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) bSCResultContentData.EZpvd) && this.fIwbmz == bSCResultContentData.fIwbmz && Intrinsics.EZpvd((Object) this.getFieldNames, (Object) bSCResultContentData.getFieldNames) && Intrinsics.EZpvd((Object) this.values, (Object) bSCResultContentData.values) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) bSCResultContentData.AkhnZx) && this.fARcdN == bSCResultContentData.fARcdN && this.AuCTel == bSCResultContentData.AuCTel && this.uzCIH == bSCResultContentData.uzCIH && this.copydefault == bSCResultContentData.copydefault && this.hDKMBd == bSCResultContentData.hDKMBd && Intrinsics.EZpvd(this.fetchVPNInfo, bSCResultContentData.fetchVPNInfo) && Intrinsics.EZpvd(this.isConnected, bSCResultContentData.isConnected) && Intrinsics.EZpvd(this.AEQbTJ, bSCResultContentData.AEQbTJ) && this.getNewProxyInstance == bSCResultContentData.getNewProxyInstance && this.fJNWhG == bSCResultContentData.fJNWhG && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) bSCResultContentData.AYXKKw) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) bSCResultContentData.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) bSCResultContentData.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, bSCResultContentData.KWHzl) && this.ejfBZ == bSCResultContentData.ejfBZ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bSCResultContentData.OLrzqt) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) bSCResultContentData.DbNXlk) && Intrinsics.EZpvd((Object) this.AubY, (Object) bSCResultContentData.AubY) && Intrinsics.EZpvd((Object) this.wlaJM, (Object) bSCResultContentData.wlaJM) && this.valueOf == bSCResultContentData.valueOf && this.djBIcL == bSCResultContentData.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.iwGUEr.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = Boolean.hashCode(this.fIwbmz);
        String str = this.getFieldNames;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.values.hashCode();
        String str2 = this.AkhnZx;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = Boolean.hashCode(this.fARcdN);
        int iHashCode8 = Boolean.hashCode(this.AuCTel);
        int iHashCode9 = Boolean.hashCode(this.uzCIH);
        int iHashCode10 = this.copydefault.hashCode();
        int iHashCode11 = Boolean.hashCode(this.hDKMBd);
        BSCResultButtonActionType bSCResultButtonActionType = this.fetchVPNInfo;
        int iHashCode12 = bSCResultButtonActionType == null ? 0 : bSCResultButtonActionType.hashCode();
        BSCResultButtonActionType bSCResultButtonActionType2 = this.isConnected;
        int iHashCode13 = bSCResultButtonActionType2 == null ? 0 : bSCResultButtonActionType2.hashCode();
        BSCResultButtonActionType bSCResultButtonActionType3 = this.AEQbTJ;
        int iHashCode14 = bSCResultButtonActionType3 == null ? 0 : bSCResultButtonActionType3.hashCode();
        int iHashCode15 = Boolean.hashCode(this.getNewProxyInstance);
        int iHashCode16 = Boolean.hashCode(this.fJNWhG);
        int iHashCode17 = this.AYXKKw.hashCode();
        int iHashCode18 = this.AhwBna.hashCode();
        int iHashCode19 = this.gEmmrt.hashCode();
        BSCResultErrorParams bSCResultErrorParams = this.KWHzl;
        int iHashCode20 = bSCResultErrorParams == null ? 0 : bSCResultErrorParams.hashCode();
        int iHashCode21 = Boolean.hashCode(this.ejfBZ);
        String str3 = this.OLrzqt;
        int iHashCode22 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.DbNXlk;
        int iHashCode23 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AubY;
        int iHashCode24 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.wlaJM;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCResultContentData(title=" + this.iwGUEr + ", description=" + this.EZpvd + ", shouldShowRecurringBuyDescription=" + this.fIwbmz + ", subTitle=" + this.getFieldNames + ", primaryButtonText=" + this.values + ", secondaryButtonText=" + this.AkhnZx + ", shouldShowDismiss=" + this.fARcdN + ", shouldShowSecondary=" + this.AuCTel + ", shouldShowSubTitle=" + this.uzCIH + ", imageType=" + this.copydefault + ", shouldUsePreviousActivityCallback=" + this.hDKMBd + ", primaryButtonActionType=" + this.fetchVPNInfo + ", secondaryButtonActionType=" + this.isConnected + ", dismissButtonActionType=" + this.AEQbTJ + ", shouldUseCTAButtonAction=" + this.getNewProxyInstance + ", shouldGoToHomeWhenDismissed=" + this.fJNWhG + ", orderType=" + this.AYXKKw + ", orderFrequency=" + this.AhwBna + ", orderRecurringStatus=" + this.gEmmrt + ", errorParams=" + this.KWHzl + ", shouldContinueToTrade=" + this.ejfBZ + ", baseCurrency=" + this.OLrzqt + ", quoteCurrency=" + this.DbNXlk + ", topUpCurrency=" + this.AubY + ", tradeId=" + this.wlaJM + ", isOnLevel2Page=" + this.valueOf + ", isRecurringBuySupported=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iwGUEr);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.fIwbmz ? 1 : 0);
        parcel.writeString(this.getFieldNames);
        parcel.writeString(this.values);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.fARcdN ? 1 : 0);
        parcel.writeInt(this.AuCTel ? 1 : 0);
        parcel.writeInt(this.uzCIH ? 1 : 0);
        parcel.writeString(this.copydefault.name());
        parcel.writeInt(this.hDKMBd ? 1 : 0);
        parcel.writeParcelable(this.fetchVPNInfo, i);
        parcel.writeParcelable(this.isConnected, i);
        parcel.writeParcelable(this.AEQbTJ, i);
        parcel.writeInt(this.getNewProxyInstance ? 1 : 0);
        parcel.writeInt(this.fJNWhG ? 1 : 0);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
        parcel.writeParcelable(this.KWHzl, i);
        parcel.writeInt(this.ejfBZ ? 1 : 0);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AubY);
        parcel.writeString(this.wlaJM);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
    }

    public BSCResultContentData(@NotNull String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, String str5, boolean z2, boolean z3, boolean z4, @NotNull ImageType imageType, boolean z5, BSCResultButtonActionType bSCResultButtonActionType, BSCResultButtonActionType bSCResultButtonActionType2, BSCResultButtonActionType bSCResultButtonActionType3, boolean z6, boolean z7, @NotNull String str6, @NotNull String str7, @NotNull String str8, BSCResultErrorParams bSCResultErrorParams, boolean z8, String str9, String str10, String str11, String str12, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(imageType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.iwGUEr = str;
        this.EZpvd = str2;
        this.fIwbmz = z;
        this.getFieldNames = str3;
        this.values = str4;
        this.AkhnZx = str5;
        this.fARcdN = z2;
        this.AuCTel = z3;
        this.uzCIH = z4;
        this.copydefault = imageType;
        this.hDKMBd = z5;
        this.fetchVPNInfo = bSCResultButtonActionType;
        this.isConnected = bSCResultButtonActionType2;
        this.AEQbTJ = bSCResultButtonActionType3;
        this.getNewProxyInstance = z6;
        this.fJNWhG = z7;
        this.AYXKKw = str6;
        this.AhwBna = str7;
        this.gEmmrt = str8;
        this.KWHzl = bSCResultErrorParams;
        this.ejfBZ = z8;
        this.OLrzqt = str9;
        this.DbNXlk = str10;
        this.AubY = str11;
        this.wlaJM = str12;
        this.valueOf = z9;
        this.djBIcL = z10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x013b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:com.okinc.buysell.data.ImageType:?: TERNARY null = ((wrap:int:0x004c: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: SGET  A[WRAPPED] (LINE:19) com.okinc.buysell.data.ImageType.SUCCESS com.okinc.buysell.data.ImageType) : (r38v0 com.okinc.buysell.data.ImageType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r39v0 boolean))
  (wrap:com.okinc.buysell.data.BSCResultButtonActionType:?: TERNARY null = ((wrap:int:0x005d: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.data.BSCResultButtonActionType) : (r40v0 com.okinc.buysell.data.BSCResultButtonActionType))
  (wrap:com.okinc.buysell.data.BSCResultButtonActionType:?: TERNARY null = ((wrap:int:0x0065: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.data.BSCResultButtonActionType) : (r41v0 com.okinc.buysell.data.BSCResultButtonActionType))
  (wrap:com.okinc.buysell.data.BSCResultButtonActionType:?: TERNARY null = ((wrap:int:0x006d: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.data.BSCResultButtonActionType) : (r42v0 com.okinc.buysell.data.BSCResultButtonActionType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:com.okinc.buysell.api.data.BSCResultErrorParams:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.api.data.BSCResultErrorParams) : (r48v0 com.okinc.buysell.api.data.BSCResultErrorParams))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r56v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.buysell.data.ImageType, boolean, com.okinc.buysell.data.BSCResultButtonActionType, com.okinc.buysell.data.BSCResultButtonActionType, com.okinc.buysell.data.BSCResultButtonActionType, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.buysell.api.data.BSCResultErrorParams, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:9) call: com.okinc.buysell.data.BSCResultContentData.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.buysell.data.ImageType, boolean, com.okinc.buysell.data.BSCResultButtonActionType, com.okinc.buysell.data.BSCResultButtonActionType, com.okinc.buysell.data.BSCResultButtonActionType, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.buysell.api.data.BSCResultErrorParams, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ BSCResultContentData(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, ImageType imageType, boolean z5, BSCResultButtonActionType bSCResultButtonActionType, BSCResultButtonActionType bSCResultButtonActionType2, BSCResultButtonActionType bSCResultButtonActionType3, boolean z6, boolean z7, String str6, String str7, String str8, BSCResultErrorParams bSCResultErrorParams, boolean z8, String str9, String str10, String str11, String str12, boolean z9, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? ImageType.SUCCESS : imageType, (i & 1024) != 0 ? true : z5, (i & 2048) != 0 ? null : bSCResultButtonActionType, (i & 4096) != 0 ? null : bSCResultButtonActionType2, (i & 8192) != 0 ? null : bSCResultButtonActionType3, (i & 16384) != 0 ? false : z6, (i & 32768) != 0 ? false : z7, (i & 65536) != 0 ? "" : str6, (i & 131072) != 0 ? "" : str7, (i & 262144) != 0 ? "" : str8, (i & 524288) != 0 ? null : bSCResultErrorParams, (i & 1048576) != 0 ? false : z8, (i & 2097152) != 0 ? null : str9, (i & 4194304) != 0 ? null : str10, (i & 8388608) != 0 ? null : str11, (i & 16777216) != 0 ? null : str12, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z9, (i & 67108864) != 0 ? false : z10);
    }
}
