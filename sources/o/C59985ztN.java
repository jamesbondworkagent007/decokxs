package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59985ztN {
    public final AbstractC59987ztP AEQbTJ;
    public final C60053zuc EZpvd;
    public final C60060zuj OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59987ztP EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60060zuj OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60053zuc copydefault() {
        return this.EZpvd;
    }

    public C59985ztN(@NotNull AbstractC59987ztP abstractC59987ztP, @NotNull C60060zuj c60060zuj, C60053zuc c60053zuc) {
        Intrinsics.checkNotNullParameter(abstractC59987ztP, "");
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        this.AEQbTJ = abstractC59987ztP;
        this.OLrzqt = c60060zuj;
        this.EZpvd = c60053zuc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ztP)
  (r2v0 o.zuj)
  (wrap:o.zuc:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.zuc) : (r3v0 o.zuc))
 A[MD:(o.ztP, o.zuj, o.zuc):void (m)] (LINE:26) call: o.ztN.<init>(o.ztP, o.zuj, o.zuc):void type: THIS */
    public /* synthetic */ C59985ztN(AbstractC59987ztP abstractC59987ztP, C60060zuj c60060zuj, C60053zuc c60053zuc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC59987ztP, c60060zuj, (i & 4) != 0 ? null : c60053zuc);
    }
}
