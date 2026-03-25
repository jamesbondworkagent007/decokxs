package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BuySellResultContentData implements Parcelable {
    public static final Parcelable.Creator<BuySellResultContentData> CREATOR = new Creator();
    public String AEQbTJ;
    public String AYXKKw;
    public BuySellResultButtonActionType AhwBna;
    public String AkhnZx;
    public boolean AuCTel;
    public BuySellResultButtonActionType DbNXlk;
    public String EZpvd;
    public ImageType KWHzl;
    public int OLrzqt;
    public BuySellResultButtonActionType copydefault;
    public String djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public boolean getFieldNames;
    public boolean getNewProxyInstance;
    public String hDKMBd;
    public String isConnected;
    public String uzCIH;
    public String valueOf;
    public String values;

    public static final class Creator implements Parcelable.Creator<BuySellResultContentData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellResultContentData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellResultContentData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, ImageType.valueOf(parcel.readString()), parcel.readInt() != 0, (BuySellResultButtonActionType) parcel.readParcelable(BuySellResultContentData.class.getClassLoader()), (BuySellResultButtonActionType) parcel.readParcelable(BuySellResultContentData.class.getClassLoader()), (BuySellResultButtonActionType) parcel.readParcelable(BuySellResultContentData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellResultContentData[] newArray(int i) {
            return new BuySellResultContentData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySellResultContentData() {
        this(0, null, null, false, null, null, null, false, false, false, null, false, null, null, null, false, false, null, null, null, false, null, null, false, 16777215, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellResultButtonActionType AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellResultButtonActionType EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellResultButtonActionType KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellResultContentData copydefault(int i, @NotNull String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, String str5, boolean z2, boolean z3, boolean z4, @NotNull ImageType imageType, boolean z5, BuySellResultButtonActionType buySellResultButtonActionType, BuySellResultButtonActionType buySellResultButtonActionType2, BuySellResultButtonActionType buySellResultButtonActionType3, boolean z6, boolean z7, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z8, String str9, String str10, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(imageType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new BuySellResultContentData(i, str, str2, z, str3, str4, str5, z2, z3, z4, imageType, z5, buySellResultButtonActionType, buySellResultButtonActionType2, buySellResultButtonActionType3, z6, z7, str6, str7, str8, z8, str9, str10, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageType copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySellResultContentData)) {
            return false;
        }
        BuySellResultContentData buySellResultContentData = (BuySellResultContentData) obj;
        return this.OLrzqt == buySellResultContentData.OLrzqt && Intrinsics.EZpvd((Object) this.uzCIH, (Object) buySellResultContentData.uzCIH) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) buySellResultContentData.EZpvd) && this.fJNWhG == buySellResultContentData.fJNWhG && Intrinsics.EZpvd((Object) this.hDKMBd, (Object) buySellResultContentData.hDKMBd) && Intrinsics.EZpvd((Object) this.values, (Object) buySellResultContentData.values) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) buySellResultContentData.AkhnZx) && this.ejfBZ == buySellResultContentData.ejfBZ && this.AuCTel == buySellResultContentData.AuCTel && this.fARcdN == buySellResultContentData.fARcdN && this.KWHzl == buySellResultContentData.KWHzl && this.getFieldNames == buySellResultContentData.getFieldNames && Intrinsics.EZpvd(this.AhwBna, buySellResultContentData.AhwBna) && Intrinsics.EZpvd(this.DbNXlk, buySellResultContentData.DbNXlk) && Intrinsics.EZpvd(this.copydefault, buySellResultContentData.copydefault) && this.getNewProxyInstance == buySellResultContentData.getNewProxyInstance && this.fIwbmz == buySellResultContentData.fIwbmz && Intrinsics.EZpvd((Object) this.valueOf, (Object) buySellResultContentData.valueOf) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) buySellResultContentData.djBIcL) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) buySellResultContentData.AYXKKw) && this.fetchVPNInfo == buySellResultContentData.fetchVPNInfo && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buySellResultContentData.AEQbTJ) && Intrinsics.EZpvd((Object) this.isConnected, (Object) buySellResultContentData.isConnected) && this.gEmmrt == buySellResultContentData.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.OLrzqt);
        int iHashCode2 = this.uzCIH.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = Boolean.hashCode(this.fJNWhG);
        String str = this.hDKMBd;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.values.hashCode();
        String str2 = this.AkhnZx;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = Boolean.hashCode(this.ejfBZ);
        int iHashCode9 = Boolean.hashCode(this.AuCTel);
        int iHashCode10 = Boolean.hashCode(this.fARcdN);
        int iHashCode11 = this.KWHzl.hashCode();
        int iHashCode12 = Boolean.hashCode(this.getFieldNames);
        BuySellResultButtonActionType buySellResultButtonActionType = this.AhwBna;
        int iHashCode13 = buySellResultButtonActionType == null ? 0 : buySellResultButtonActionType.hashCode();
        BuySellResultButtonActionType buySellResultButtonActionType2 = this.DbNXlk;
        int iHashCode14 = buySellResultButtonActionType2 == null ? 0 : buySellResultButtonActionType2.hashCode();
        BuySellResultButtonActionType buySellResultButtonActionType3 = this.copydefault;
        int iHashCode15 = buySellResultButtonActionType3 == null ? 0 : buySellResultButtonActionType3.hashCode();
        int iHashCode16 = Boolean.hashCode(this.getNewProxyInstance);
        int iHashCode17 = Boolean.hashCode(this.fIwbmz);
        int iHashCode18 = this.valueOf.hashCode();
        int iHashCode19 = this.djBIcL.hashCode();
        int iHashCode20 = this.AYXKKw.hashCode();
        int iHashCode21 = Boolean.hashCode(this.fetchVPNInfo);
        String str3 = this.AEQbTJ;
        int iHashCode22 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.isConnected;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellResultContentData(imageResId=" + this.OLrzqt + ", title=" + this.uzCIH + ", description=" + this.EZpvd + ", shouldShowRecurringBuyDescription=" + this.fJNWhG + ", subTitle=" + this.hDKMBd + ", primaryButtonText=" + this.values + ", secondaryButtonText=" + this.AkhnZx + ", shouldShowDismiss=" + this.ejfBZ + ", shouldShowSecondary=" + this.AuCTel + ", shouldShowSubTitle=" + this.fARcdN + ", imageType=" + this.KWHzl + ", shouldUsePreviousActivityCallback=" + this.getFieldNames + ", primaryButtonActionType=" + this.AhwBna + ", secondaryButtonActionType=" + this.DbNXlk + ", dismissButtonActionType=" + this.copydefault + ", shouldUseCTAButtonAction=" + this.getNewProxyInstance + ", shouldGoToHomeWhenDismissed=" + this.fIwbmz + ", orderType=" + this.valueOf + ", orderFrequency=" + this.djBIcL + ", orderRecurringStatus=" + this.AYXKKw + ", shouldContinueToTrade=" + this.fetchVPNInfo + ", baseCurrency=" + this.AEQbTJ + ", quoteCurrency=" + this.isConnected + ", isRecurringBuySupported=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.uzCIH);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.fJNWhG ? 1 : 0);
        parcel.writeString(this.hDKMBd);
        parcel.writeString(this.values);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.ejfBZ ? 1 : 0);
        parcel.writeInt(this.AuCTel ? 1 : 0);
        parcel.writeInt(this.fARcdN ? 1 : 0);
        parcel.writeString(this.KWHzl.name());
        parcel.writeInt(this.getFieldNames ? 1 : 0);
        parcel.writeParcelable(this.AhwBna, i);
        parcel.writeParcelable(this.DbNXlk, i);
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeInt(this.getNewProxyInstance ? 1 : 0);
        parcel.writeInt(this.fIwbmz ? 1 : 0);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AYXKKw);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.isConnected);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
    }

    public BuySellResultContentData(int i, @NotNull String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, String str5, boolean z2, boolean z3, boolean z4, @NotNull ImageType imageType, boolean z5, BuySellResultButtonActionType buySellResultButtonActionType, BuySellResultButtonActionType buySellResultButtonActionType2, BuySellResultButtonActionType buySellResultButtonActionType3, boolean z6, boolean z7, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z8, String str9, String str10, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(imageType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.OLrzqt = i;
        this.uzCIH = str;
        this.EZpvd = str2;
        this.fJNWhG = z;
        this.hDKMBd = str3;
        this.values = str4;
        this.AkhnZx = str5;
        this.ejfBZ = z2;
        this.AuCTel = z3;
        this.fARcdN = z4;
        this.KWHzl = imageType;
        this.getFieldNames = z5;
        this.AhwBna = buySellResultButtonActionType;
        this.DbNXlk = buySellResultButtonActionType2;
        this.copydefault = buySellResultButtonActionType3;
        this.getNewProxyInstance = z6;
        this.fIwbmz = z7;
        this.valueOf = str6;
        this.djBIcL = str7;
        this.AYXKKw = str8;
        this.fetchVPNInfo = z8;
        this.AEQbTJ = str9;
        this.isConnected = str10;
        this.gEmmrt = z9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0115: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] o.wXj.PendingIntent.uzCIH int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:com.okinc.buysell.data.ImageType:?: TERNARY null = ((wrap:int:0x0055: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0059: SGET  A[WRAPPED] (LINE:19) com.okinc.buysell.data.ImageType.SUCCESS com.okinc.buysell.data.ImageType) : (r36v0 com.okinc.buysell.data.ImageType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005e: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:com.okinc.buysell.data.BuySellResultButtonActionType:?: TERNARY null = ((wrap:int:0x0066: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.data.BuySellResultButtonActionType) : (r38v0 com.okinc.buysell.data.BuySellResultButtonActionType))
  (wrap:com.okinc.buysell.data.BuySellResultButtonActionType:?: TERNARY null = ((wrap:int:0x006e: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.data.BuySellResultButtonActionType) : (r39v0 com.okinc.buysell.data.BuySellResultButtonActionType))
  (wrap:com.okinc.buysell.data.BuySellResultButtonActionType:?: TERNARY null = ((wrap:int:0x0078: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.data.BuySellResultButtonActionType) : (r40v0 com.okinc.buysell.data.BuySellResultButtonActionType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0083: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008e: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00db: ARITH (r50v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
 A[MD:(int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.buysell.data.ImageType, boolean, com.okinc.buysell.data.BuySellResultButtonActionType, com.okinc.buysell.data.BuySellResultButtonActionType, com.okinc.buysell.data.BuySellResultButtonActionType, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean):void (m)] (LINE:8) call: com.okinc.buysell.data.BuySellResultContentData.<init>(int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.okinc.buysell.data.ImageType, boolean, com.okinc.buysell.data.BuySellResultButtonActionType, com.okinc.buysell.data.BuySellResultButtonActionType, com.okinc.buysell.data.BuySellResultButtonActionType, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BuySellResultContentData(int i, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, ImageType imageType, boolean z5, BuySellResultButtonActionType buySellResultButtonActionType, BuySellResultButtonActionType buySellResultButtonActionType2, BuySellResultButtonActionType buySellResultButtonActionType3, boolean z6, boolean z7, String str6, String str7, String str8, boolean z8, String str9, String str10, boolean z9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C52761wXj.PendingIntent.uzCIH : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? ImageType.SUCCESS : imageType, (i2 & 2048) != 0 ? true : z5, (i2 & 4096) != 0 ? null : buySellResultButtonActionType, (i2 & 8192) != 0 ? null : buySellResultButtonActionType2, (i2 & 16384) != 0 ? null : buySellResultButtonActionType3, (i2 & 32768) != 0 ? false : z6, (i2 & 65536) != 0 ? false : z7, (i2 & 131072) != 0 ? "" : str6, (i2 & 262144) != 0 ? "" : str7, (i2 & 524288) != 0 ? "" : str8, (i2 & 1048576) != 0 ? false : z8, (i2 & 2097152) != 0 ? null : str9, (i2 & 4194304) != 0 ? null : str10, (i2 & 8388608) != 0 ? false : z9);
    }
}
