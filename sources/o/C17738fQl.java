package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17738fQl {
    public final java.lang.String AEQbTJ;
    public final AbstractC12782ctV KWHzl;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    public C17738fQl(@NotNull java.lang.String str, long j, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.AEQbTJ = str;
        this.copydefault = j;
        this.KWHzl = abstractC12782ctV;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r2v0 long))
  (r4v0 o.ctV)
 A[MD:(java.lang.String, long, o.ctV):void (m)] (LINE:5) call: o.fQl.<init>(java.lang.String, long, o.ctV):void type: THIS */
    public /* synthetic */ C17738fQl(java.lang.String str, long j, AbstractC12782ctV abstractC12782ctV, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? -1L : j, abstractC12782ctV);
    }
}
