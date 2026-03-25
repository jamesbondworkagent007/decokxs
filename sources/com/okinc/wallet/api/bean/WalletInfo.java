package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletInfo implements Parcelable {
    public static final Parcelable.Creator<WalletInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final int AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String gEmmrt;
    public final InterfaceC9738bbJ valueOf;

    public static final class Creator implements Parcelable.Creator<WalletInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), null, 128, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletInfo[] newArray(int i) {
            return new WalletInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletInfo AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, String str6, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WalletInfo(str, str2, str3, str4, i, str5, str6, interfaceC9738bbJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof WalletInfo)) {
            return false;
        }
        WalletInfo walletInfo = (WalletInfo) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) walletInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) walletInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) walletInfo.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) walletInfo.gEmmrt) && this.AYXKKw == walletInfo.AYXKKw && Intrinsics.EZpvd((Object) this.KWHzl, (Object) walletInfo.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) walletInfo.EZpvd) && Intrinsics.EZpvd(this.valueOf, walletInfo.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.gEmmrt.hashCode();
        int iHashCode5 = Integer.hashCode(this.AYXKKw);
        int iHashCode6 = this.KWHzl.hashCode();
        String str = this.EZpvd;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        InterfaceC9738bbJ interfaceC9738bbJ = this.valueOf;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (interfaceC9738bbJ != null ? interfaceC9738bbJ.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletInfo(accountId=" + this.AEQbTJ + ", accountName=" + this.OLrzqt + ", oriAccountName=" + this.copydefault + ", oriWalletName=" + this.gEmmrt + ", walletType=" + this.AYXKKw + ", asset=" + this.KWHzl + ", avatar=" + this.EZpvd + ", wallet=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.gEmmrt);
        parcel.writeInt(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
    }

    public WalletInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, String str6, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.gEmmrt = str4;
        this.AYXKKw = i;
        this.KWHzl = str5;
        this.EZpvd = str6;
        this.valueOf = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 int)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:o.bbJ:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null o.bbJ) : (r18v0 o.bbJ))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, o.bbJ):void (m)] (LINE:17) call: com.okinc.wallet.api.bean.WalletInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, o.bbJ):void type: THIS */
    public /* synthetic */ WalletInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, InterfaceC9738bbJ interfaceC9738bbJ, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, str6, (i2 & 128) != 0 ? null : interfaceC9738bbJ);
    }
}
