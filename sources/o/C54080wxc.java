package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54080wxc implements InterfaceC49574urC {
    public final C53964wvS AEQbTJ;

    public C54080wxc(@NotNull C53964wvS c53964wvS) {
        Intrinsics.checkNotNullParameter(c53964wvS, "");
        this.AEQbTJ = c53964wvS;
    }

    @Override // o.InterfaceC49574urC
    public InterfaceC49622ury EZpvd(boolean z) {
        return new C53993wvv(new C54063wxL());
    }

    @Override // o.InterfaceC49574urC
    public InterfaceC49572urA copydefault(boolean z) {
        return new C53991wvt(new C54064wxM());
    }

    @Override // o.InterfaceC49574urC
    public InterfaceC49623urz KWHzl(boolean z) {
        return new C53990wvs(new C54059wxH(this.AEQbTJ, z));
    }

    @Override // o.InterfaceC49574urC
    public InterfaceC49575urD OLrzqt(boolean z) {
        return new C53992wvu(new C54060wxI(this.AEQbTJ, z));
    }
}
