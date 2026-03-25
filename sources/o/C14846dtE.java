package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14846dtE {
    public java.lang.String AEQbTJ;
    public int AYXKKw;
    public long EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    public C14846dtE(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, long j, int i, boolean z2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.gEmmrt = str;
        this.AEQbTJ = str2;
        this.copydefault = z;
        this.EZpvd = j;
        this.AYXKKw = i;
        this.KWHzl = z2;
        this.OLrzqt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, long, int, boolean, java.lang.String):void (m)] (LINE:446) call: o.dtE.<init>(java.lang.String, java.lang.String, boolean, long, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C14846dtE(java.lang.String str, java.lang.String str2, boolean z, long j, int i, boolean z2, java.lang.String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? "" : str3);
    }
}
