package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CurrentWalletSwitchConfig implements Parcelable {
    public static final Parcelable.Creator<CurrentWalletSwitchConfig> CREATOR = new Creator();
    public final FunctionConfig AEQbTJ;
    public final ThemeType AYXKKw;
    public final int AhwBna;
    public final CurrentWalletSwitchTeeConfig EZpvd;
    public final String KWHzl;
    public final CurrentWalletSelectMode OLrzqt;
    public final CurrentWalletSwitchNetworkMode copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<CurrentWalletSwitchConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentWalletSwitchConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CurrentWalletSwitchConfig((CurrentWalletSelectMode) parcel.readParcelable(CurrentWalletSwitchConfig.class.getClassLoader()), (CurrentWalletSwitchNetworkMode) parcel.readParcelable(CurrentWalletSwitchConfig.class.getClassLoader()), parcel.readString(), parcel.readString(), ThemeType.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : CurrentWalletSwitchTeeConfig.CREATOR.createFromParcel(parcel), FunctionConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentWalletSwitchConfig[] newArray(int i) {
            return new CurrentWalletSwitchConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentWalletSelectMode AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentWalletSwitchConfig AEQbTJ(@NotNull CurrentWalletSelectMode currentWalletSelectMode, @NotNull CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, @NotNull String str, String str2, @NotNull ThemeType themeType, int i, CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig, @NotNull FunctionConfig functionConfig) {
        Intrinsics.checkNotNullParameter(currentWalletSelectMode, "");
        Intrinsics.checkNotNullParameter(currentWalletSwitchNetworkMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(themeType, "");
        Intrinsics.checkNotNullParameter(functionConfig, "");
        return new CurrentWalletSwitchConfig(currentWalletSelectMode, currentWalletSwitchNetworkMode, str, str2, themeType, i, currentWalletSwitchTeeConfig, functionConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FunctionConfig EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentWalletSwitchTeeConfig KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentWalletSwitchNetworkMode copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof CurrentWalletSwitchConfig)) {
            return false;
        }
        CurrentWalletSwitchConfig currentWalletSwitchConfig = (CurrentWalletSwitchConfig) obj;
        return Intrinsics.EZpvd(this.OLrzqt, currentWalletSwitchConfig.OLrzqt) && Intrinsics.EZpvd(this.copydefault, currentWalletSwitchConfig.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) currentWalletSwitchConfig.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) currentWalletSwitchConfig.valueOf) && this.AYXKKw == currentWalletSwitchConfig.AYXKKw && this.AhwBna == currentWalletSwitchConfig.AhwBna && Intrinsics.EZpvd(this.EZpvd, currentWalletSwitchConfig.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, currentWalletSwitchConfig.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        String str = this.valueOf;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = Integer.hashCode(this.AhwBna);
        CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig = this.EZpvd;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (currentWalletSwitchTeeConfig != null ? currentWalletSwitchTeeConfig.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrentWalletSwitchConfig(currentWalletSelectMode=" + this.OLrzqt + ", networkMode=" + this.copydefault + ", businessName=" + this.KWHzl + ", title=" + this.valueOf + ", themeType=" + this.AYXKKw + ", txSource=" + this.AhwBna + ", teeConfig=" + this.EZpvd + ", functionConfig=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThemeType valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.OLrzqt, i);
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.valueOf);
        this.AYXKKw.writeToParcel(parcel, i);
        parcel.writeInt(this.AhwBna);
        CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig = this.EZpvd;
        if (currentWalletSwitchTeeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currentWalletSwitchTeeConfig.writeToParcel(parcel, i);
        }
        this.AEQbTJ.writeToParcel(parcel, i);
    }

    public CurrentWalletSwitchConfig(@NotNull CurrentWalletSelectMode currentWalletSelectMode, @NotNull CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, @NotNull String str, String str2, @NotNull ThemeType themeType, int i, CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig, @NotNull FunctionConfig functionConfig) {
        Intrinsics.checkNotNullParameter(currentWalletSelectMode, "");
        Intrinsics.checkNotNullParameter(currentWalletSwitchNetworkMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(themeType, "");
        Intrinsics.checkNotNullParameter(functionConfig, "");
        this.OLrzqt = currentWalletSelectMode;
        this.copydefault = currentWalletSwitchNetworkMode;
        this.KWHzl = str;
        this.valueOf = str2;
        this.AYXKKw = themeType;
        this.AhwBna = i;
        this.EZpvd = currentWalletSwitchTeeConfig;
        this.AEQbTJ = functionConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:com.okinc.wallet.api.bean.CurrentWalletSelectMode:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:11) com.okinc.wallet.api.bean.CurrentWalletSelectMode.MainWalletSelected.KWHzl com.okinc.wallet.api.bean.CurrentWalletSelectMode$MainWalletSelected) : (r13v0 com.okinc.wallet.api.bean.CurrentWalletSelectMode))
  (r14v0 com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.wallet.api.bean.ThemeType:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] (LINE:15) com.okinc.wallet.api.bean.ThemeType.DEFAULT com.okinc.wallet.api.bean.ThemeType) : (r17v0 com.okinc.wallet.api.bean.ThemeType))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig:?: TERNARY null = ((wrap:int:0x0027: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig) : (r19v0 com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig))
  (wrap:com.okinc.wallet.api.bean.FunctionConfig:?: TERNARY null = ((wrap:int:0x002f: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: CONSTRUCTOR false, false, false, false, (15 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.wallet.api.bean.FunctionConfig.<init>(boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.wallet.api.bean.FunctionConfig))
 A[MD:(com.okinc.wallet.api.bean.CurrentWalletSelectMode, com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode, java.lang.String, java.lang.String, com.okinc.wallet.api.bean.ThemeType, int, com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig, com.okinc.wallet.api.bean.FunctionConfig):void (m)] (LINE:10) call: com.okinc.wallet.api.bean.CurrentWalletSwitchConfig.<init>(com.okinc.wallet.api.bean.CurrentWalletSelectMode, com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode, java.lang.String, java.lang.String, com.okinc.wallet.api.bean.ThemeType, int, com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig, com.okinc.wallet.api.bean.FunctionConfig):void type: THIS */
    public /* synthetic */ CurrentWalletSwitchConfig(CurrentWalletSelectMode currentWalletSelectMode, CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode, String str, String str2, ThemeType themeType, int i, CurrentWalletSwitchTeeConfig currentWalletSwitchTeeConfig, FunctionConfig functionConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CurrentWalletSelectMode.MainWalletSelected.KWHzl : currentWalletSelectMode, currentWalletSwitchNetworkMode, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? ThemeType.DEFAULT : themeType, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : currentWalletSwitchTeeConfig, (i2 & 128) != 0 ? new FunctionConfig(false, false, false, false, 15, null) : functionConfig);
    }
}
