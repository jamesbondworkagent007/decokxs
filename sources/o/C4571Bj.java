package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4571Bj<I, O> implements InterfaceC54860xY<I, O, InterfaceC5037Ch, InterfaceC5039Cj> {
    public java.lang.Object AEQbTJ;
    public final DT EZpvd;
    public final InterfaceC5039Cj KWHzl;
    public final I OLrzqt;
    public final InterfaceC5037Ch copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.Bj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4571Bj copy$default(C4571Bj c4571Bj, java.lang.Object obj, Result result, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, DT dt, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c4571Bj.OLrzqt;
        }
        if ((i & 2) != 0) {
            result = Result.m7376boximpl(c4571Bj.AEQbTJ);
        }
        if ((i & 4) != 0) {
            interfaceC5037Ch = c4571Bj.copydefault;
        }
        InterfaceC5037Ch interfaceC5037Ch2 = interfaceC5037Ch;
        if ((i & 8) != 0) {
            interfaceC5039Cj = c4571Bj.KWHzl;
        }
        InterfaceC5039Cj interfaceC5039Cj2 = interfaceC5039Cj;
        if ((i & 16) != 0) {
            dt = c4571Bj.EZpvd;
        }
        return c4571Bj.OLrzqt(obj, result.m7386unboximpl(), interfaceC5037Ch2, interfaceC5039Cj2, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.lang.Object obj) {
        this.AEQbTJ = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public DT KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public I OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4571Bj<I, O> OLrzqt(I i, @NotNull java.lang.Object obj, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(dt, "");
        return new C4571Bj<>(i, obj, interfaceC5037Ch, interfaceC5039Cj, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54860xY
    public java.lang.Object copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4571Bj)) {
            return false;
        }
        C4571Bj c4571Bj = (C4571Bj) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c4571Bj.OLrzqt) && Result.m7379equalsimpl0(this.AEQbTJ, c4571Bj.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c4571Bj.copydefault) && Intrinsics.EZpvd(this.KWHzl, c4571Bj.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c4571Bj.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.InterfaceC54887xZ
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public InterfaceC5037Ch AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        I i = this.OLrzqt;
        int iHashCode = i == null ? 0 : i.hashCode();
        int iM7382hashCodeimpl = Result.m7382hashCodeimpl(this.AEQbTJ);
        InterfaceC5037Ch interfaceC5037Ch = this.copydefault;
        int iHashCode2 = interfaceC5037Ch == null ? 0 : interfaceC5037Ch.hashCode();
        InterfaceC5039Cj interfaceC5039Cj = this.KWHzl;
        return (((((((iHashCode * 31) + iM7382hashCodeimpl) * 31) + iHashCode2) * 31) + (interfaceC5039Cj != null ? interfaceC5039Cj.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpFinalInterceptorContext(request=" + this.OLrzqt + ", response=" + ((java.lang.Object) Result.m7385toStringimpl(this.AEQbTJ)) + ", protocolRequest=" + this.copydefault + ", protocolResponse=" + this.KWHzl + ", executionContext=" + this.EZpvd + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/Object; */
    @Override // o.InterfaceC54833xX
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public InterfaceC5039Cj EZpvd() {
        return this.KWHzl;
    }

    public C4571Bj(I i, @NotNull java.lang.Object obj, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(dt, "");
        this.OLrzqt = i;
        this.AEQbTJ = obj;
        this.copydefault = interfaceC5037Ch;
        this.KWHzl = interfaceC5039Cj;
        this.EZpvd = dt;
    }
}
