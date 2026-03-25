package com.okinc.business.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TokenInfoForAlert implements Parcelable {
    public static final Parcelable.Creator<TokenInfoForAlert> CREATOR = new Creator();
    public String AEQbTJ;
    public final int AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final boolean KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public String valueOf;

    public static final class Creator implements Parcelable.Creator<TokenInfoForAlert> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoForAlert createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenInfoForAlert(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoForAlert[] newArray(int i) {
            return new TokenInfoForAlert[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInfoForAlert() {
        this(null, null, null, null, null, null, null, null, false, 0, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfoForAlert KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TokenInfoForAlert(str, str2, str3, str4, str5, str6, str7, str8, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.djBIcL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInfoForAlert)) {
            return false;
        }
        TokenInfoForAlert tokenInfoForAlert = (TokenInfoForAlert) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tokenInfoForAlert.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenInfoForAlert.EZpvd) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) tokenInfoForAlert.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tokenInfoForAlert.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tokenInfoForAlert.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) tokenInfoForAlert.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tokenInfoForAlert.valueOf) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tokenInfoForAlert.AEQbTJ) && this.KWHzl == tokenInfoForAlert.KWHzl && this.AYXKKw == tokenInfoForAlert.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfoForAlert(chainId=" + this.OLrzqt + ", chainName=" + this.EZpvd + ", tokenContractAddress=" + this.djBIcL + ", tokenLogoUrl=" + this.AhwBna + ", chainLogoUrl=" + this.copydefault + ", tokenSymbol=" + this.gEmmrt + ", tokenPrice=" + this.valueOf + ", marketCap=" + this.AEQbTJ + ", disableTokenChange=" + this.KWHzl + ", sourceType=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.AYXKKw);
    }

    public TokenInfoForAlert(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.djBIcL = str3;
        this.AhwBna = str4;
        this.copydefault = str5;
        this.gEmmrt = str6;
        this.valueOf = str7;
        this.AEQbTJ = str8;
        this.KWHzl = z;
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0046: ARITH (r21v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r20v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void (m)] (LINE:7) call: com.okinc.business.market.bean.TokenInfoForAlert.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void type: THIS */
    public /* synthetic */ TokenInfoForAlert(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) == 0 ? str8 : "", (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? 2 : i);
    }
}
