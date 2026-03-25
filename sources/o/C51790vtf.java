package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51790vtf {
    public final androidx.fragment.app.Fragment EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C51790vtf(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = fragment;
        this.KWHzl = str;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 androidx.fragment.app.Fragment)
  (r2v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r3v0 int))
 A[MD:(androidx.fragment.app.Fragment, java.lang.String, int):void (m)] (LINE:49) call: o.vtf.<init>(androidx.fragment.app.Fragment, java.lang.String, int):void type: THIS */
    public /* synthetic */ C51790vtf(androidx.fragment.app.Fragment fragment, java.lang.String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, str, (i2 & 4) != 0 ? 8 : i);
    }
}
