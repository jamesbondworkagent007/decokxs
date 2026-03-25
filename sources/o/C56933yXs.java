package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56933yXs {
    public transient C56933yXs AEQbTJ;
    public final C56930yXp KWHzl;
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final C56933yXs EZpvd = new C56933yXs("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56930yXp AYXKKw() {
        return this.KWHzl;
    }

    public C56933yXs(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = new C56930yXp(str, this);
    }

    public C56933yXs(@NotNull C56930yXp c56930yXp) {
        Intrinsics.checkNotNullParameter(c56930yXp, "");
        this.KWHzl = c56930yXp;
    }

    public C56933yXs(C56930yXp c56930yXp, C56933yXs c56933yXs) {
        this.KWHzl = c56930yXp;
        this.AEQbTJ = c56933yXs;
    }

    public final java.lang.String KWHzl() {
        return this.KWHzl.KWHzl();
    }

    public final boolean AEQbTJ() {
        return this.KWHzl.OLrzqt();
    }

    public final C56933yXs EZpvd() {
        C56933yXs c56933yXs = this.AEQbTJ;
        if (c56933yXs != null) {
            return c56933yXs;
        }
        if (!(!AEQbTJ())) {
            throw new java.lang.IllegalStateException("root".toString());
        }
        C56933yXs c56933yXs2 = new C56933yXs(this.KWHzl.AEQbTJ());
        this.AEQbTJ = c56933yXs2;
        return c56933yXs2;
    }

    public final C56933yXs KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return new C56933yXs(this.KWHzl.AEQbTJ(c56935yXu), this);
    }

    public final C56935yXu OLrzqt() {
        return this.KWHzl.valueOf();
    }

    public final C56935yXu gEmmrt() {
        return this.KWHzl.AYXKKw();
    }

    public final java.util.List<C56935yXu> copydefault() {
        return this.KWHzl.gEmmrt();
    }

    public final boolean OLrzqt(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return this.KWHzl.KWHzl(c56935yXu);
    }

    public java.lang.String toString() {
        return this.KWHzl.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C56933yXs) && Intrinsics.EZpvd(this.KWHzl, ((C56933yXs) obj).KWHzl);
    }

    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX INFO: renamed from: o.yXs$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXs.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C56933yXs KWHzl(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return new C56933yXs(C56930yXp.KWHzl.copydefault(c56935yXu));
        }
    }
}
