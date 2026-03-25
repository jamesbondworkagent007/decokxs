package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56457yGb {
    public final int AEQbTJ;
    public final java.util.List<java.lang.Exception> EZpvd;
    public java.nio.file.Path OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56457yGb() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Exception> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.nio.file.Path ee_() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void ef_(java.nio.file.Path path) {
        this.OLrzqt = path;
    }

    public C56457yGb(int i) {
        this.AEQbTJ = i;
        this.EZpvd = new java.util.ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (64 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:319) call: o.yGb.<init>(int):void type: THIS */
    public /* synthetic */ C56457yGb(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public final void ec_(@NotNull java.nio.file.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        java.nio.file.Path path2 = this.OLrzqt;
        this.OLrzqt = path2 != null ? path2.resolve(path) : null;
    }

    public final void ed_(@NotNull java.nio.file.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        java.nio.file.Path path2 = this.OLrzqt;
        if (!Intrinsics.EZpvd(path, path2 != null ? path2.getFileName() : null)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.nio.file.Path path3 = this.OLrzqt;
        this.OLrzqt = path3 != null ? path3.getParent() : null;
    }

    public final void KWHzl(@NotNull java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        this.copydefault++;
        if (this.EZpvd.size() < this.AEQbTJ) {
            if (this.OLrzqt != null) {
                C56461yGf.EZpvd();
                java.lang.Throwable thInitCause = C56462yGg.el_(java.lang.String.valueOf(this.OLrzqt)).initCause(exc);
                Intrinsics.copydefault(thInitCause, "");
                exc = C56458yGc.ei_(thInitCause);
            }
            this.EZpvd.add(exc);
        }
    }
}
