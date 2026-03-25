package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4544Bi<I> implements InterfaceC56995ya<I> {
    public final DT OLrzqt;
    public I copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4544Bi copy$default(C4544Bi c4544Bi, java.lang.Object obj, DT dt, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c4544Bi.copydefault;
        }
        if ((i & 2) != 0) {
            dt = c4544Bi.OLrzqt;
        }
        return c4544Bi.EZpvd(obj, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(I i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4544Bi<I> EZpvd(I i, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(dt, "");
        return new C4544Bi<>(i, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public DT KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public I OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4544Bi)) {
            return false;
        }
        C4544Bi c4544Bi = (C4544Bi) obj;
        return Intrinsics.EZpvd(this.copydefault, c4544Bi.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c4544Bi.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        I i = this.copydefault;
        return ((i == null ? 0 : i.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpInputInterceptorContext(request=" + this.copydefault + ", executionContext=" + this.OLrzqt + ')';
    }

    public C4544Bi(I i, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(dt, "");
        this.copydefault = i;
        this.OLrzqt = dt;
    }
}
