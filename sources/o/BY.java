package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BY<I, O> {
    public static final Activity KWHzl = new Activity(null);
    public final C5032Cc<I, O> AEQbTJ;
    public final C5033Cd AYXKKw;
    public final BB<O> EZpvd;
    public final DT OLrzqt;
    public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> copydefault;
    public final BH<I> gEmmrt;
    public final BW valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BH<I> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5033Cd AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BW AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DT KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BB<O> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5032Cc<I, O> copydefault() {
        return this.AEQbTJ;
    }

    public BY(@NotNull C5032Cc<I, O> c5032Cc, @NotNull DT dt, @NotNull BH<I> bh, @NotNull BB<O> bb, @NotNull BW bw, @NotNull C5033Cd c5033Cd) {
        Intrinsics.checkNotNullParameter(c5032Cc, "");
        Intrinsics.checkNotNullParameter(dt, "");
        Intrinsics.checkNotNullParameter(bh, "");
        Intrinsics.checkNotNullParameter(bb, "");
        Intrinsics.checkNotNullParameter(bw, "");
        Intrinsics.checkNotNullParameter(c5033Cd, "");
        this.AEQbTJ = c5032Cc;
        this.OLrzqt = dt;
        this.gEmmrt = bh;
        this.EZpvd = bb;
        this.valueOf = bw;
        this.AYXKKw = c5033Cd;
        dt.OLrzqt(BC.copydefault.valueOf(), HR.AEQbTJ.AEQbTJ().toString());
        this.copydefault = new java.util.ArrayList();
    }

    public final void AEQbTJ(@NotNull BI bi) {
        Intrinsics.checkNotNullParameter(bi, "");
        bi.copydefault(this);
    }

    public final void KWHzl(@NotNull BM<O> bm) {
        Intrinsics.checkNotNullParameter(bm, "");
        bm.OLrzqt(this);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
