package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4625Bl<I, O> implements InterfaceC54860xY<I, O, InterfaceC5037Ch, InterfaceC5039Cj> {
    public final C58859zS AEQbTJ;
    public final InterfaceC5037Ch EZpvd;
    public final InterfaceC5039Cj KWHzl;
    public final DT OLrzqt;
    public final I copydefault;
    public java.lang.Object valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4625Bl copy$default(C4625Bl c4625Bl, java.lang.Object obj, Result result, C58859zS c58859zS, DT dt, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c4625Bl.copydefault;
        }
        if ((i & 2) != 0) {
            result = Result.m7376boximpl(c4625Bl.valueOf);
        }
        if ((i & 4) != 0) {
            c58859zS = c4625Bl.AEQbTJ;
        }
        if ((i & 8) != 0) {
            dt = c4625Bl.OLrzqt;
        }
        return c4625Bl.AEQbTJ(obj, result.m7386unboximpl(), c58859zS, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4625Bl<I, O> AEQbTJ(I i, @NotNull java.lang.Object obj, @NotNull C58859zS c58859zS, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(c58859zS, "");
        Intrinsics.checkNotNullParameter(dt, "");
        return new C4625Bl<>(i, obj, c58859zS, dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/Object; */
    @Override // o.InterfaceC54833xX
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public InterfaceC5039Cj EZpvd() {
        return this.KWHzl;
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
    @Override // o.InterfaceC54860xY
    public java.lang.Object copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4625Bl)) {
            return false;
        }
        C4625Bl c4625Bl = (C4625Bl) obj;
        return Intrinsics.EZpvd(this.copydefault, c4625Bl.copydefault) && Result.m7379equalsimpl0(this.valueOf, c4625Bl.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c4625Bl.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c4625Bl.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        I i = this.copydefault;
        return ((((((i == null ? 0 : i.hashCode()) * 31) + Result.m7382hashCodeimpl(this.valueOf)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpInputOutputInterceptorContext(request=" + this.copydefault + ", response=" + ((java.lang.Object) Result.m7385toStringimpl(this.valueOf)) + ", call=" + this.AEQbTJ + ", executionContext=" + this.OLrzqt + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/Object; */
    @Override // o.InterfaceC54887xZ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public InterfaceC5037Ch AEQbTJ() {
        return this.EZpvd;
    }

    public C4625Bl(I i, @NotNull java.lang.Object obj, @NotNull C58859zS c58859zS, @NotNull DT dt) {
        Intrinsics.checkNotNullParameter(c58859zS, "");
        Intrinsics.checkNotNullParameter(dt, "");
        this.copydefault = i;
        this.valueOf = obj;
        this.AEQbTJ = c58859zS;
        this.OLrzqt = dt;
        this.EZpvd = c58859zS.OLrzqt();
        this.KWHzl = c58859zS.AEQbTJ();
    }
}
