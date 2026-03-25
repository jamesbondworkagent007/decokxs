package com.okinc.business.market.data.model.alert;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TokenInfoForAlert implements Parcelable {
    public static final Parcelable.Creator<TokenInfoForAlert> CREATOR = new Creator();
    public static final int EZpvd = 8;
    public final AlertType AEQbTJ;
    public final String AYXKKw;
    public String AhwBna;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final boolean gEmmrt;
    public String valueOf;
    public final String values;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TokenInfoForAlert> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoForAlert createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenInfoForAlert(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AlertType.valueOf(parcel.readString()), parcel.readInt() != 0);
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
        this(null, null, null, null, null, null, null, null, null, false, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfoForAlert EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, AlertType alertType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TokenInfoForAlert(str, str2, str3, str4, str5, str6, str7, str8, alertType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.values;
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
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tokenInfoForAlert.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tokenInfoForAlert.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) tokenInfoForAlert.djBIcL) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) tokenInfoForAlert.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tokenInfoForAlert.copydefault) && Intrinsics.EZpvd((Object) this.values, (Object) tokenInfoForAlert.values) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tokenInfoForAlert.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tokenInfoForAlert.AhwBna) && this.AEQbTJ == tokenInfoForAlert.AEQbTJ && this.gEmmrt == tokenInfoForAlert.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        int iHashCode6 = this.values.hashCode();
        int iHashCode7 = this.valueOf.hashCode();
        int iHashCode8 = this.AhwBna.hashCode();
        AlertType alertType = this.AEQbTJ;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (alertType == null ? 0 : alertType.hashCode())) * 31) + Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfoForAlert(chainId=" + this.OLrzqt + ", chainName=" + this.KWHzl + ", tokenContractAddress=" + this.djBIcL + ", tokenLogoUrl=" + this.AYXKKw + ", chainLogoUrl=" + this.copydefault + ", tokenSymbol=" + this.values + ", tokenPrice=" + this.valueOf + ", marketCap=" + this.AhwBna + ", alertType=" + this.AEQbTJ + ", disableTokenChange=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.values);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AhwBna);
        AlertType alertType = this.AEQbTJ;
        if (alertType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alertType.name());
        }
        parcel.writeInt(this.gEmmrt ? 1 : 0);
    }

    public TokenInfoForAlert(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, AlertType alertType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.djBIcL = str3;
        this.AYXKKw = str4;
        this.copydefault = str5;
        this.values = str6;
        this.valueOf = str7;
        this.AhwBna = str8;
        this.AEQbTJ = alertType;
        this.gEmmrt = z;
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
  (wrap:com.okinc.business.market.data.model.alert.AlertType:?: TERNARY null = ((wrap:int:0x003e: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.alert.AlertType) : (r19v0 com.okinc.business.market.data.model.alert.AlertType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r21v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertType, boolean):void (m)] (LINE:10) call: com.okinc.business.market.data.model.alert.TokenInfoForAlert.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.alert.AlertType, boolean):void type: THIS */
    public /* synthetic */ TokenInfoForAlert(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AlertType alertType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : alertType, (i & 512) != 0 ? false : z);
    }
}
