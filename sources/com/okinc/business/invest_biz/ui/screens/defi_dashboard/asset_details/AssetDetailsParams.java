package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AssetDetailsParams implements Parcelable {
    public static final Parcelable.Creator<AssetDetailsParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final Integer AhwBna;
    public final String DbNXlk;
    public final String EZpvd;
    public final boolean KWHzl;
    public final String OLrzqt;
    public final AssetRawData copydefault;
    public final Integer djBIcL;
    public final String fetchVPNInfo;
    public final SheetType gEmmrt;
    public final String isConnected;
    public final AssetDetailsSource valueOf;
    public final String values;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<AssetDetailsParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDetailsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetDetailsParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), SheetType.valueOf(parcel.readString()), parcel.readInt() != 0 ? AssetRawData.CREATOR.createFromParcel(parcel) : null, AssetDetailsSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDetailsParams[] newArray(int i) {
            return new AssetDetailsParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetDetailsParams() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetDetailsParams AEQbTJ(@NotNull String str, @NotNull String str2, @StringRes Integer num, Integer num2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, String str7, String str8, @NotNull SheetType sheetType, AssetRawData assetRawData, @NotNull AssetDetailsSource assetDetailsSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(sheetType, "");
        Intrinsics.checkNotNullParameter(assetDetailsSource, "");
        return new AssetDetailsParams(str, str2, num, num2, str3, str4, str5, z, str6, str7, str8, sheetType, assetRawData, assetDetailsSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetDetailsSource AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SheetType KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetRawData copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetDetailsParams)) {
            return false;
        }
        AssetDetailsParams assetDetailsParams = (AssetDetailsParams) obj;
        return Intrinsics.EZpvd((Object) this.DbNXlk, (Object) assetDetailsParams.DbNXlk) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) assetDetailsParams.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, assetDetailsParams.AhwBna) && Intrinsics.EZpvd(this.djBIcL, assetDetailsParams.djBIcL) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) assetDetailsParams.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) assetDetailsParams.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) assetDetailsParams.EZpvd) && this.KWHzl == assetDetailsParams.KWHzl && Intrinsics.EZpvd((Object) this.values, (Object) assetDetailsParams.values) && Intrinsics.EZpvd((Object) this.isConnected, (Object) assetDetailsParams.isConnected) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) assetDetailsParams.AEQbTJ) && this.gEmmrt == assetDetailsParams.gEmmrt && Intrinsics.EZpvd(this.copydefault, assetDetailsParams.copydefault) && this.valueOf == assetDetailsParams.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.DbNXlk.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        Integer num = this.AhwBna;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.djBIcL;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        int iHashCode5 = this.fetchVPNInfo.hashCode();
        int iHashCode6 = this.AYXKKw.hashCode();
        int iHashCode7 = this.EZpvd.hashCode();
        int iHashCode8 = Boolean.hashCode(this.KWHzl);
        int iHashCode9 = this.values.hashCode();
        String str = this.isConnected;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        int iHashCode12 = this.gEmmrt.hashCode();
        AssetRawData assetRawData = this.copydefault;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (assetRawData != null ? assetRawData.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetDetailsParams(title=" + this.DbNXlk + ", name=" + this.OLrzqt + ", tagLabel=" + this.AhwBna + ", tagStyle=" + this.djBIcL + ", trailingText=" + this.fetchVPNInfo + ", subTitle=" + this.AYXKKw + ", reverseRangeString=" + this.EZpvd + ", isReverse=" + this.KWHzl + ", totalValue=" + this.values + ", tip=" + this.isConnected + ", boundTip=" + this.AEQbTJ + ", sheetType=" + this.gEmmrt + ", rawData=" + this.copydefault + ", source=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.OLrzqt);
        Integer num = this.AhwBna;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.djBIcL;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeString(this.values);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt.name());
        AssetRawData assetRawData = this.copydefault;
        if (assetRawData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assetRawData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.valueOf.name());
    }

    public AssetDetailsParams(@NotNull String str, @NotNull String str2, @StringRes Integer num, Integer num2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, String str7, String str8, @NotNull SheetType sheetType, AssetRawData assetRawData, @NotNull AssetDetailsSource assetDetailsSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(sheetType, "");
        Intrinsics.checkNotNullParameter(assetDetailsSource, "");
        this.DbNXlk = str;
        this.OLrzqt = str2;
        this.AhwBna = num;
        this.djBIcL = num2;
        this.fetchVPNInfo = str3;
        this.AYXKKw = str4;
        this.EZpvd = str5;
        this.KWHzl = z;
        this.values = str6;
        this.isConnected = str7;
        this.AEQbTJ = str8;
        this.gEmmrt = sheetType;
        this.copydefault = assetRawData;
        this.valueOf = assetDetailsSource;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0093: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r30v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: SGET  A[WRAPPED] (LINE:75) com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType.POSITION com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType) : (r27v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData:?: TERNARY null = ((wrap:int:0x0065: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData) : (null com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0070: SGET  A[WRAPPED] (LINE:77) com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource.MINI_PROJECT com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource) : (r29v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource):void (m)] (LINE:62) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsParams.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.SheetType, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsSource):void type: THIS */
    public /* synthetic */ AssetDetailsParams(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, SheetType sheetType, AssetRawData assetRawData, AssetDetailsSource assetDetailsSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? false : z, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? SheetType.POSITION : sheetType, (i & 4096) == 0 ? assetRawData : null, (i & 8192) != 0 ? AssetDetailsSource.MINI_PROJECT : assetDetailsSource);
    }
}
