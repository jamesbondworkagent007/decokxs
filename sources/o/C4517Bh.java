package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4517Bh<I, O> implements InterfaceC54860xY<I, O, InterfaceC5037Ch, InterfaceC5039Cj> {
    public final I AEQbTJ;
    public final InterfaceC5039Cj EZpvd;
    public java.lang.Object KWHzl;
    public final DT OLrzqt;
    public final InterfaceC5037Ch copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.Bh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4517Bh copy$default(C4517Bh c4517Bh, java.lang.Object obj, Result result, InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, DT dt, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c4517Bh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            result = Result.m7376boximpl(c4517Bh.KWHzl);
        }
        if ((i & 4) != 0) {
            interfaceC5037Ch = c4517Bh.copydefault;
        }
        InterfaceC5037Ch interfaceC5037Ch2 = interfaceC5037Ch;
        if ((i & 8) != 0) {
            interfaceC5039Cj = c4517Bh.EZpvd;
        }
        InterfaceC5039Cj interfaceC5039Cj2 = interfaceC5039Cj;
        if ((i & 16) != 0) {
            dt = c4517Bh.OLrzqt;
        }
        return c4517Bh.KWHzl(obj, result.m7386unboximpl(), interfaceC5037Ch2, interfaceC5039Cj2, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.lang.Object obj) {
        this.KWHzl = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4517Bh<I, O> KWHzl(I i, @NotNull java.lang.Object obj, @NotNull InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(dt, "");
        return new C4517Bh<>(i, obj, interfaceC5037Ch, interfaceC5039Cj, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public DT KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56995ya
    public I OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54860xY
    public java.lang.Object copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4517Bh)) {
            return false;
        }
        C4517Bh c4517Bh = (C4517Bh) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c4517Bh.AEQbTJ) && Result.m7379equalsimpl0(this.KWHzl, c4517Bh.KWHzl) && Intrinsics.EZpvd(this.copydefault, c4517Bh.copydefault) && Intrinsics.EZpvd(this.EZpvd, c4517Bh.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c4517Bh.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/Object; */
    @Override // o.InterfaceC54833xX
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public InterfaceC5039Cj EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        I i = this.AEQbTJ;
        int iHashCode = i == null ? 0 : i.hashCode();
        int iM7382hashCodeimpl = Result.m7382hashCodeimpl(this.KWHzl);
        int iHashCode2 = this.copydefault.hashCode();
        InterfaceC5039Cj interfaceC5039Cj = this.EZpvd;
        return (((((((iHashCode * 31) + iM7382hashCodeimpl) * 31) + iHashCode2) * 31) + (interfaceC5039Cj != null ? interfaceC5039Cj.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpAttemptInterceptorContext(request=" + this.AEQbTJ + ", response=" + ((java.lang.Object) Result.m7385toStringimpl(this.KWHzl)) + ", protocolRequest=" + this.copydefault + ", protocolResponse=" + this.EZpvd + ", executionContext=" + this.OLrzqt + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.InterfaceC54887xZ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public InterfaceC5037Ch AEQbTJ() {
        return this.copydefault;
    }

    public C4517Bh(I i, @NotNull java.lang.Object obj, @NotNull InterfaceC5037Ch interfaceC5037Ch, InterfaceC5039Cj interfaceC5039Cj, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(interfaceC5037Ch, "");
        Intrinsics.checkNotNullParameter(dt, "");
        this.AEQbTJ = i;
        this.KWHzl = obj;
        this.copydefault = interfaceC5037Ch;
        this.EZpvd = interfaceC5039Cj;
        this.OLrzqt = dt;
    }
}
