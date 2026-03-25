package com.okinc.business.market.features.module.ui.detail;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleInfo implements Parcelable {
    public static final Parcelable.Creator<ModuleInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final boolean valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<ModuleInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModuleInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ModuleInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModuleInfo[] newArray(int i) {
            return new ModuleInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModuleInfo() {
        this(null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleInfo OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
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
        return new ModuleInfo(str, str2, str3, str4, str5, z, str6, str7, str8, str9, z2, str10, str11, str12, str13);
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
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleInfo)) {
            return false;
        }
        ModuleInfo moduleInfo = (ModuleInfo) obj;
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) moduleInfo.djBIcL) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) moduleInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) moduleInfo.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) moduleInfo.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) moduleInfo.EZpvd) && this.valueOf == moduleInfo.valueOf && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) moduleInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) moduleInfo.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) moduleInfo.KWHzl) && Intrinsics.EZpvd((Object) this.values, (Object) moduleInfo.values) && this.AhwBna == moduleInfo.AhwBna && Intrinsics.EZpvd((Object) this.isConnected, (Object) moduleInfo.isConnected) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) moduleInfo.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) moduleInfo.DbNXlk) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) moduleInfo.AkhnZx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.djBIcL.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.valueOf)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.values.hashCode()) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + this.isConnected.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AkhnZx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModuleInfo(moduleId=" + this.djBIcL + ", dataId=" + this.OLrzqt + ", moduleName=" + this.gEmmrt + ", moduleNameEnglish=" + this.AYXKKw + ", description=" + this.EZpvd + ", descriptionHidden=" + this.valueOf + ", changePercentage=" + this.AEQbTJ + ", backgroundLogoUrl=" + this.copydefault + ", darkBackgroundLogoUrl=" + this.KWHzl + ", tagKey=" + this.values + ", isBoostModule=" + this.AhwBna + ", pushChannel24H=" + this.isConnected + ", pushChannel4H=" + this.fetchVPNInfo + ", pushChannel1H=" + this.DbNXlk + ", pushChannel5Min=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.values);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AkhnZx);
    }

    public ModuleInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z2, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
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
        this.djBIcL = str;
        this.OLrzqt = str2;
        this.gEmmrt = str3;
        this.AYXKKw = str4;
        this.EZpvd = str5;
        this.valueOf = z;
        this.AEQbTJ = str6;
        this.copydefault = str7;
        this.KWHzl = str8;
        this.values = str9;
        this.AhwBna = z2;
        this.isConnected = str10;
        this.fetchVPNInfo = str11;
        this.DbNXlk = str12;
        this.AkhnZx = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.business.market.features.module.ui.detail.ModuleInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ModuleInfo(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) == 0 ? str13 : "");
    }
}
