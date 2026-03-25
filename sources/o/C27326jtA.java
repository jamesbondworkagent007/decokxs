package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27326jtA implements InterfaceC27436jvE {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27326jtA EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C27326jtA(str, str2, str3, z, str4, str5, str6, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27326jtA)) {
            return false;
        }
        C27326jtA c27326jtA = (C27326jtA) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27326jtA.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c27326jtA.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27326jtA.AYXKKw) && this.EZpvd == c27326jtA.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27326jtA.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c27326jtA.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27326jtA.copydefault) && this.KWHzl == c27326jtA.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        java.lang.String str = this.AYXKKw;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = this.OLrzqt.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiTotalAssetItem(totalAssets=" + this.gEmmrt + ", yesterdayProfit=" + this.AhwBna + ", yesterdayValue=" + this.AYXKKw + ", filteredByChain=" + this.EZpvd + ", hideAsset=" + this.AEQbTJ + ", lifetimeEarningShow=" + this.OLrzqt + ", lifetimeEarningCompare=" + this.copydefault + ", earnShowEnable=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C27326jtA(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.gEmmrt = str;
        this.AhwBna = str2;
        this.AYXKKw = str3;
        this.EZpvd = z;
        this.AEQbTJ = str4;
        this.OLrzqt = str5;
        this.copydefault = str6;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:10) call: o.jtA.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C27326jtA(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, str6, (i & 128) != 0 ? false : z2);
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27326jtA c27326jtA = interfaceC27436jvE instanceof C27326jtA ? (C27326jtA) interfaceC27436jvE : null;
        return c27326jtA != null && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27326jtA.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c27326jtA.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27326jtA.AYXKKw) && this.EZpvd == c27326jtA.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27326jtA.AEQbTJ);
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27326jtA c27326jtA = interfaceC27436jvE instanceof C27326jtA ? (C27326jtA) interfaceC27436jvE : null;
        return c27326jtA != null && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c27326jtA.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c27326jtA.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c27326jtA.AYXKKw) && this.EZpvd == c27326jtA.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c27326jtA.AEQbTJ);
    }
}
