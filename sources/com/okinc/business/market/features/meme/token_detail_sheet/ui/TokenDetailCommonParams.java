package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenDetailCommonParams implements Parcelable {
    public static final Parcelable.Creator<TokenDetailCommonParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final String djBIcL;
    public final String gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<TokenDetailCommonParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetailCommonParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenDetailCommonParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetailCommonParams[] newArray(int i) {
            return new TokenDetailCommonParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenDetailCommonParams() {
        this(null, null, null, null, null, false, false, null, null, false, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetailCommonParams copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, @NotNull String str6, @NotNull String str7, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TokenDetailCommonParams(str, str2, str3, str4, str5, z, z2, str6, str7, z3);
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
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenDetailCommonParams)) {
            return false;
        }
        TokenDetailCommonParams tokenDetailCommonParams = (TokenDetailCommonParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tokenDetailCommonParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) tokenDetailCommonParams.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) tokenDetailCommonParams.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) tokenDetailCommonParams.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tokenDetailCommonParams.AhwBna) && this.copydefault == tokenDetailCommonParams.copydefault && this.EZpvd == tokenDetailCommonParams.EZpvd && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tokenDetailCommonParams.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tokenDetailCommonParams.valueOf) && this.KWHzl == tokenDetailCommonParams.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetailCommonParams(chainId=" + this.AEQbTJ + ", tokenSymbol=" + this.gEmmrt + ", tokenContractAddress=" + this.AYXKKw + ", tokenName=" + this.djBIcL + ", tokenLogoUrl=" + this.AhwBna + ", displayMcapKline=" + this.copydefault + ", showQuickBuyButton=" + this.EZpvd + ", marketCap=" + this.OLrzqt + ", sourceType=" + this.valueOf + ", isCollected=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.KWHzl ? 1 : 0);
    }

    public TokenDetailCommonParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, @NotNull String str6, @NotNull String str7, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AEQbTJ = str;
        this.gEmmrt = str2;
        this.AYXKKw = str3;
        this.djBIcL = str4;
        this.AhwBna = str5;
        this.copydefault = z;
        this.EZpvd = z2;
        this.OLrzqt = str6;
        this.valueOf = str7;
        this.KWHzl = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean):void (m)] (LINE:16) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TokenDetailCommonParams(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? "" : str6, (i & 256) == 0 ? str7 : "", (i & 512) == 0 ? z3 : false);
    }
}
