package com.okinc.business.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class PathRouterUi implements Parcelable {
    public static final Parcelable.Creator<PathRouterUi> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final String AhwBna;
    public final List<String> AkhnZx;
    public final String DbNXlk;
    public final boolean EZpvd;
    public final int KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final String fIwbmz;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public final PathType isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<PathRouterUi> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PathRouterUi createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PathRouterUi(parcel.readString(), parcel.readString(), parcel.readString(), PathType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PathRouterUi[] newArray(int i) {
            return new PathRouterUi[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathType AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathRouterUi OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PathType pathType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, boolean z2, @NotNull String str8, @NotNull String str9, @NotNull List<String> list, boolean z3, boolean z4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(pathType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PathRouterUi(str, str2, str3, pathType, str4, str5, str6, str7, z, z2, str8, str9, list, z3, z4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathRouterUi)) {
            return false;
        }
        PathRouterUi pathRouterUi = (PathRouterUi) obj;
        return Intrinsics.EZpvd((Object) this.AhwBna, (Object) pathRouterUi.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) pathRouterUi.valueOf) && Intrinsics.EZpvd((Object) this.copydefault, (Object) pathRouterUi.copydefault) && this.isConnected == pathRouterUi.isConnected && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) pathRouterUi.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.values, (Object) pathRouterUi.values) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) pathRouterUi.fIwbmz) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) pathRouterUi.AEQbTJ) && this.EZpvd == pathRouterUi.EZpvd && this.djBIcL == pathRouterUi.djBIcL && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) pathRouterUi.DbNXlk) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) pathRouterUi.OLrzqt) && Intrinsics.EZpvd(this.AkhnZx, pathRouterUi.AkhnZx) && this.gEmmrt == pathRouterUi.gEmmrt && this.AYXKKw == pathRouterUi.AYXKKw && this.KWHzl == pathRouterUi.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.AhwBna.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.values.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + this.DbNXlk.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PathRouterUi(logoUrl=" + this.AhwBna + ", name=" + this.valueOf + ", amount=" + this.copydefault + ", pathType=" + this.isConnected + ", percentage=" + this.fetchVPNInfo + ", savedAmount=" + this.values + ", time=" + this.fIwbmz + ", gasPrice=" + this.AEQbTJ + ", isFreeNetworkFee=" + this.EZpvd + ", isSelected=" + this.djBIcL + ", routerLabel=" + this.DbNXlk + ", id=" + this.OLrzqt + ", signatures=" + this.AkhnZx + ", isNeedClaim=" + this.gEmmrt + ", isOkxDex=" + this.AYXKKw + ", bridgeType=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.isConnected.name());
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.values);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.OLrzqt);
        parcel.writeStringList(this.AkhnZx);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.KWHzl);
    }

    public PathRouterUi(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PathType pathType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, boolean z2, @NotNull String str8, @NotNull String str9, @NotNull List<String> list, boolean z3, boolean z4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(pathType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = str;
        this.valueOf = str2;
        this.copydefault = str3;
        this.isConnected = pathType;
        this.fetchVPNInfo = str4;
        this.values = str5;
        this.fIwbmz = str6;
        this.AEQbTJ = str7;
        this.EZpvd = z;
        this.djBIcL = z2;
        this.DbNXlk = str8;
        this.OLrzqt = str9;
        this.AkhnZx = list;
        this.gEmmrt = z3;
        this.AYXKKw = z4;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 com.okinc.business.domain.model.PathType)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 boolean)
  (r30v0 boolean)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.util.List)
  (r34v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.domain.model.PathType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.util.List<java.lang.String>, boolean, boolean, int):void (m)] (LINE:13) call: com.okinc.business.domain.model.PathRouterUi.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.domain.model.PathType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.util.List, boolean, boolean, int):void type: THIS */
    public /* synthetic */ PathRouterUi(String str, String str2, String str3, PathType pathType, String str4, String str5, String str6, String str7, boolean z, boolean z2, String str8, String str9, List list, boolean z3, boolean z4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, pathType, str4, str5, str6, str7, z, z2, str8, str9, list, z3, (i2 & 16384) != 0 ? false : z4, (i2 & 32768) != 0 ? 0 : i);
    }
}
