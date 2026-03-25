package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5486Tp {
    public static final Application Companion = new Application(null);
    public final java.util.Set<java.lang.String> AEQbTJ;
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public final android.util.SparseArray<java.lang.Long> OLrzqt;
    public AbstractRunnableC5485To copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.EZpvd((java.lang.Object) str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractRunnableC5485To KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.SparseArray<java.lang.Long> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault(AbstractRunnableC5485To abstractRunnableC5485To) {
        return abstractRunnableC5485To != null && this.copydefault == abstractRunnableC5485To;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    public C5486Tp(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        this.copydefault = abstractRunnableC5485To;
        this.EZpvd = "";
        this.OLrzqt = new android.util.SparseArray<>();
        EZpvd(1, -1L);
        EZpvd(2, -1L);
        EZpvd(3, -1L);
        this.AEQbTJ = this.copydefault.OLrzqt();
    }

    public final void EZpvd() {
        this.copydefault = C5483Tm.EZpvd;
    }

    public final boolean valueOf() {
        return this.copydefault instanceof C5489Ts;
    }

    public final void EZpvd(int i, long j) {
        this.OLrzqt.put(i, java.lang.Long.valueOf(j));
    }

    public final java.lang.String AEQbTJ() {
        return this.copydefault.gEmmrt();
    }

    /* JADX INFO: renamed from: o.Tp$Application */
    public static final class Application {
        private Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:39) call: o.Tp.Application.<init>():void type: THIS */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
