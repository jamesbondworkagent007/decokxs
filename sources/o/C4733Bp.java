package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4733Bp<I> implements InterfaceC54833xX<I, InterfaceC5037Ch, InterfaceC5039Cj> {
    public final I AEQbTJ;
    public InterfaceC5039Cj EZpvd;
    public final InterfaceC5037Ch KWHzl;
    public final DT copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4733Bp copy$default(C4733Bp c4733Bp, java.lang.Object obj, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, DT dt, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c4733Bp.AEQbTJ;
        }
        if ((i & 2) != 0) {
            interfaceC5037Ch = c4733Bp.KWHzl;
        }
        if ((i & 4) != 0) {
            interfaceC5039Cj = c4733Bp.EZpvd;
        }
        if ((i & 8) != 0) {
            dt = c4733Bp.copydefault;
        }
        return c4733Bp.OLrzqt(obj, interfaceC5037Ch, interfaceC5039Cj, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull InterfaceC5039Cj interfaceC5039Cj) {
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        this.EZpvd = interfaceC5039Cj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public DT KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public I OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4733Bp<I> OLrzqt(I i, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5039Cj interfaceC5039Cj, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        Intrinsics.checkNotNullParameter(dt, "");
        return new C4733Bp<>(i, interfaceC5037Ch, interfaceC5039Cj, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.InterfaceC54887xZ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5037Ch AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4733Bp)) {
            return false;
        }
        C4733Bp c4733Bp = (C4733Bp) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c4733Bp.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c4733Bp.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c4733Bp.EZpvd) && Intrinsics.EZpvd(this.copydefault, c4733Bp.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        I i = this.AEQbTJ;
        return ((((((i == null ? 0 : i.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpProtocolResponseInterceptorContext(request=" + this.AEQbTJ + ", protocolRequest=" + this.KWHzl + ", protocolResponse=" + this.EZpvd + ", executionContext=" + this.copydefault + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/Object; */
    @Override // o.InterfaceC54833xX
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public InterfaceC5039Cj EZpvd() {
        return this.EZpvd;
    }

    public C4733Bp(I i, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull InterfaceC5039Cj interfaceC5039Cj, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(interfaceC5039Cj, "");
        Intrinsics.checkNotNullParameter(dt, "");
        this.AEQbTJ = i;
        this.KWHzl = interfaceC5037Ch;
        this.EZpvd = interfaceC5039Cj;
        this.copydefault = dt;
    }
}
