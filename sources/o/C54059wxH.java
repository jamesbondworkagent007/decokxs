package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54059wxH extends AbstractC49584urM {
    public final C53964wvS djBIcL;
    public final boolean valueOf;

    public C54059wxH(@NotNull C53964wvS c53964wvS, boolean z) {
        Intrinsics.checkNotNullParameter(c53964wvS, "");
        this.valueOf = z;
        this.djBIcL = c53964wvS;
    }

    public void AEQbTJ() {
        if (this.valueOf) {
            this.djBIcL.copydefault().observeForever(copydefault());
        } else {
            this.djBIcL.AYXKKw().observeForever(copydefault());
        }
    }

    public void AhwBna() {
        if (this.valueOf) {
            this.djBIcL.copydefault().removeObserver(copydefault());
        } else {
            this.djBIcL.AYXKKw().removeObserver(copydefault());
        }
    }
}
