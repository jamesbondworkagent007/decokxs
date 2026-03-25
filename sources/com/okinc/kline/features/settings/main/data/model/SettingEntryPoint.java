package com.okinc.kline.features.settings.main.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.kline.api.bean.EntryType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SettingEntryPoint implements Parcelable {
    public static final Parcelable.Creator<SettingEntryPoint> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public final boolean DbNXlk;
    public final boolean EZpvd;
    public final EntryType KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public final boolean isConnected;
    public final boolean valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<SettingEntryPoint> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingEntryPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SettingEntryPoint(EntryType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingEntryPoint[] newArray(int i) {
            return new SettingEntryPoint[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntryType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingEntryPoint OLrzqt(@NotNull EntryType entryType, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(entryType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SettingEntryPoint(entryType, str, str2, str3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
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
    public final boolean djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingEntryPoint)) {
            return false;
        }
        SettingEntryPoint settingEntryPoint = (SettingEntryPoint) obj;
        return this.KWHzl == settingEntryPoint.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) settingEntryPoint.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) settingEntryPoint.copydefault) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) settingEntryPoint.fetchVPNInfo) && this.values == settingEntryPoint.values && this.EZpvd == settingEntryPoint.EZpvd && this.djBIcL == settingEntryPoint.djBIcL && this.AYXKKw == settingEntryPoint.AYXKKw && this.AhwBna == settingEntryPoint.AhwBna && this.OLrzqt == settingEntryPoint.OLrzqt && this.gEmmrt == settingEntryPoint.gEmmrt && this.isConnected == settingEntryPoint.isConnected && this.valueOf == settingEntryPoint.valueOf && this.AkhnZx == settingEntryPoint.AkhnZx && this.DbNXlk == settingEntryPoint.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + Boolean.hashCode(this.values)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.isConnected)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.AkhnZx)) * 31) + Boolean.hashCode(this.DbNXlk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SettingEntryPoint(entryType=" + this.KWHzl + ", instId=" + this.AEQbTJ + ", instType=" + this.copydefault + ", leverage=" + this.fetchVPNInfo + ", isLandScape=" + this.values + ", isArbitrage=" + this.EZpvd + ", isGuideDialog=" + this.djBIcL + ", isCountDown=" + this.AYXKKw + ", isDrawing=" + this.AhwBna + ", isAbstractOnChart=" + this.OLrzqt + ", isHisOrder=" + this.gEmmrt + ", isOpenOrder=" + this.isConnected + ", isAvgCost=" + this.valueOf + ", isTutorial=" + this.AkhnZx + ", isShowUtcTime=" + this.DbNXlk + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.isConnected ? 1 : 0);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.AkhnZx ? 1 : 0);
        parcel.writeInt(this.DbNXlk ? 1 : 0);
    }

    public SettingEntryPoint(@NotNull EntryType entryType, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(entryType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = entryType;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.fetchVPNInfo = str3;
        this.values = z;
        this.EZpvd = z2;
        this.djBIcL = z3;
        this.AYXKKw = z4;
        this.AhwBna = z5;
        this.OLrzqt = z6;
        this.gEmmrt = z7;
        this.isConnected = z8;
        this.valueOf = z9;
        this.AkhnZx = z10;
        this.DbNXlk = z11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0093: CONSTRUCTOR 
  (r17v0 com.okinc.kline.api.bean.EntryType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 boolean) : true)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 boolean) : false)
 A[MD:(com.okinc.kline.api.bean.EntryType, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:8) call: com.okinc.kline.features.settings.main.data.model.SettingEntryPoint.<init>(com.okinc.kline.api.bean.EntryType, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ SettingEntryPoint(EntryType entryType, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(entryType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? true : z4, (i & 256) != 0 ? true : z5, (i & 512) != 0 ? true : z6, (i & 1024) != 0 ? true : z7, (i & 2048) != 0 ? true : z8, (i & 4096) != 0 ? true : z9, (i & 8192) == 0 ? z10 : true, (i & 16384) == 0 ? z11 : false);
    }
}
