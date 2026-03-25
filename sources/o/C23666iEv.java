package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23666iEv {
    public final java.util.List<C23665iEu> AYXKKw;
    public final iEI AhwBna;
    public final java.lang.String DbNXlk;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<iEE> gEmmrt;
    public final java.lang.String isConnected;
    public final boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final C23666iEv AEQbTJ = new C23666iEv(null, null, null, null, false, false, null, null, null, false, 1023, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23666iEv() {
        this(null, null, null, null, false, false, null, null, null, false, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<iEE> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23666iEv OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, @NotNull java.util.List<iEE> list, @NotNull java.util.List<C23665iEu> list2, @NotNull iEI iei, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(iei, "");
        return new C23666iEv(str, str2, str3, str4, z, z2, list, list2, iei, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23666iEv)) {
            return false;
        }
        C23666iEv c23666iEv = (C23666iEv) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23666iEv.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c23666iEv.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c23666iEv.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c23666iEv.isConnected) && this.OLrzqt == c23666iEv.OLrzqt && this.valueOf == c23666iEv.valueOf && Intrinsics.EZpvd(this.gEmmrt, c23666iEv.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, c23666iEv.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c23666iEv.AhwBna) && this.KWHzl == c23666iEv.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        java.lang.String str = this.DbNXlk;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.isConnected;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.gEmmrt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Dashboard(accountId=" + this.copydefault + ", totalAssets=" + this.djBIcL + ", yesterdayProfit=" + this.DbNXlk + ", totalEarnings=" + this.isConnected + ", filteredByChain=" + this.OLrzqt + ", showViewByToken=" + this.valueOf + ", protocols=" + this.gEmmrt + ", investedChains=" + this.AYXKKw + ", status=" + this.AhwBna + ", earnShowEnable=" + this.KWHzl + ")";
    }

    public C23666iEv(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, @NotNull java.util.List<iEE> list, @NotNull java.util.List<C23665iEu> list2, @NotNull iEI iei, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(iei, "");
        this.copydefault = str;
        this.djBIcL = str2;
        this.DbNXlk = str3;
        this.isConnected = str4;
        this.OLrzqt = z;
        this.valueOf = z2;
        this.gEmmrt = list;
        this.AYXKKw = list2;
        this.AhwBna = iei;
        this.KWHzl = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r19v0 java.util.List))
  (wrap:o.iEI:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: INVOKE (wrap:o.iEI$StateListAnimator:0x004b: SGET  A[WRAPPED] (LINE:14) o.iEI.Companion o.iEI$StateListAnimator) VIRTUAL call: o.iEI.StateListAnimator.copydefault():o.iEI A[MD:():o.iEI (m), WRAPPED] (LINE:14)) : (r20v0 o.iEI))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List<o.iEE>, java.util.List<o.iEu>, o.iEI, boolean):void (m)] (LINE:5) call: o.iEv.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List, java.util.List, o.iEI, boolean):void type: THIS */
    public /* synthetic */ C23666iEv(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.util.List list, java.util.List list2, iEI iei, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? yDY.AhwBna() : list2, (i & 256) != 0 ? iEI.Companion.copydefault() : iei, (i & 512) == 0 ? z3 : false);
    }

    /* JADX INFO: renamed from: o.iEv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C23666iEv AEQbTJ() {
            return C23666iEv.AEQbTJ;
        }
    }
}
