package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46707tcJ {
    public boolean AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public java.util.ArrayList<C46705tcH> djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C46705tcH> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46707tcJ EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.ArrayList<C46705tcH> arrayList, boolean z, boolean z2, boolean z3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C46707tcJ(str, str2, str3, arrayList, z, z2, z3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46707tcJ)) {
            return false;
        }
        C46707tcJ c46707tcJ = (C46707tcJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c46707tcJ.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46707tcJ.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46707tcJ.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, c46707tcJ.djBIcL) && this.AEQbTJ == c46707tcJ.AEQbTJ && this.KWHzl == c46707tcJ.KWHzl && this.EZpvd == c46707tcJ.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c46707tcJ.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46707tcJ.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c46707tcJ.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.valueOf.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RemindDisplayGroupBean(name=" + this.valueOf + ", instrumentId=" + this.copydefault + ", displayId=" + this.OLrzqt + ", rules=" + this.djBIcL + ", isExpanded=" + this.AEQbTJ + ", isSelected=" + this.KWHzl + ", isEmpty=" + this.EZpvd + ", mainIconUrl=" + this.AYXKKw + ", subIconUrl=" + this.gEmmrt + ", tokenAddress=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AEQbTJ;
    }

    public C46707tcJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.ArrayList<C46705tcH> arrayList, boolean z, boolean z2, boolean z3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.valueOf = str;
        this.copydefault = str2;
        this.OLrzqt = str3;
        this.djBIcL = arrayList;
        this.AEQbTJ = z;
        this.KWHzl = z2;
        this.EZpvd = z3;
        this.AYXKKw = str4;
        this.gEmmrt = str5;
        this.AhwBna = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001b: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:17) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r18v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<o.tcH>, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: o.tcJ.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C46707tcJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, boolean z, boolean z2, boolean z3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new java.util.ArrayList() : arrayList, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, str6);
    }
}
