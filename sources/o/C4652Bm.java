package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4652Bm<I> implements InterfaceC54887xZ<I, InterfaceC5037Ch> {
    public InterfaceC5037Ch AEQbTJ;
    public final DT EZpvd;
    public final I KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4652Bm copy$default(C4652Bm c4652Bm, java.lang.Object obj, InterfaceC5037Ch interfaceC5037Ch, DT dt, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c4652Bm.KWHzl;
        }
        if ((i & 2) != 0) {
            interfaceC5037Ch = c4652Bm.AEQbTJ;
        }
        if ((i & 4) != 0) {
            dt = c4652Bm.EZpvd;
        }
        return c4652Bm.OLrzqt(obj, interfaceC5037Ch, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public DT KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public I OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4652Bm<I> OLrzqt(I i, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(dt, "");
        return new C4652Bm<>(i, interfaceC5037Ch, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull InterfaceC5037Ch interfaceC5037Ch) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        this.AEQbTJ = interfaceC5037Ch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.InterfaceC54887xZ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5037Ch AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4652Bm)) {
            return false;
        }
        C4652Bm c4652Bm = (C4652Bm) obj;
        return Intrinsics.EZpvd(this.KWHzl, c4652Bm.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c4652Bm.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c4652Bm.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        I i = this.KWHzl;
        return ((((i == null ? 0 : i.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpProtocolRequestInterceptorContext(request=" + this.KWHzl + ", protocolRequest=" + this.AEQbTJ + ", executionContext=" + this.EZpvd + ')';
    }

    public C4652Bm(I i, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(dt, "");
        this.KWHzl = i;
        this.AEQbTJ = interfaceC5037Ch;
        this.EZpvd = dt;
    }
}
