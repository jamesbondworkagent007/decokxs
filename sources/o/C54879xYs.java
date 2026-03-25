package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54879xYs implements InterfaceC54865xYe {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54879xYs() {
        this(null, null, null, false, 15, null);
    }

    public C54879xYs(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, boolean z) {
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = bool;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000f: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, boolean):void (m)] (LINE:16) call: o.xYs.<init>(java.lang.String, java.lang.String, java.lang.Boolean, boolean):void type: THIS */
    public /* synthetic */ C54879xYs(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? java.lang.Boolean.TRUE : bool, (i & 8) != 0 ? false : z);
    }

    @Override // o.InterfaceC54865xYe
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = "0";
        if (!C33129mqd.OLrzqt(str, "0")) {
            return null;
        }
        C38307pTy.Application application = C38307pTy.Companion;
        C38307pTy c38307pTyAEQbTJ = application.AEQbTJ(0);
        if (Intrinsics.EZpvd(this.KWHzl, java.lang.Boolean.TRUE)) {
            c38307pTyAEQbTJ = application.EZpvd(2);
            str2 = "0.00";
        }
        C38307pTy c38307pTy = c38307pTyAEQbTJ;
        if (this.copydefault != null) {
            return C54862xYb.formatAmtWithSign$default(pTB.OLrzqt((java.lang.Object) str2), c38307pTy, this.copydefault, this.EZpvd, null, 8, null);
        }
        if (this.AEQbTJ != null) {
            return C54862xYb.formatAmtWithSymbol$default(pTB.OLrzqt((java.lang.Object) str2), c38307pTy, this.AEQbTJ, this.EZpvd, null, 8, null);
        }
        return pTB.formatICUNumber$default(C33129mqd.EZpvd(str2), RoundingMode.DOWN, c38307pTy, null, null, 12, null);
    }
}
