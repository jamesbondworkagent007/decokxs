package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15116dyJ {
    public boolean AEQbTJ;
    public long EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    public C15116dyJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, long j, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = str;
        this.KWHzl = str2;
        this.AEQbTJ = z;
        this.EZpvd = j;
        this.copydefault = i;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, long, int, boolean):void (m)] (LINE:278) call: o.dyJ.<init>(java.lang.String, java.lang.String, boolean, long, int, boolean):void type: THIS */
    public /* synthetic */ C15116dyJ(java.lang.String str, java.lang.String str2, boolean z, long j, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z2);
    }
}
