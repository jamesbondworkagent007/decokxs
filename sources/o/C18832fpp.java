package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18832fpp {
    public boolean AEQbTJ;
    public final AbstractActivityC33041mov KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    public C18832fpp(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.KWHzl = abstractActivityC33041mov;
        this.AEQbTJ = true;
        this.OLrzqt = 1;
    }

    public final InterfaceC18835fps AEQbTJ() {
        if (this.copydefault == 0) {
            C18798fpH c18798fpH = new C18798fpH(this.KWHzl);
            c18798fpH.AEQbTJ(this.OLrzqt);
            return c18798fpH;
        }
        C18838fpv c18838fpv = new C18838fpv(this.KWHzl);
        c18838fpv.OLrzqt(this.AEQbTJ);
        c18838fpv.OLrzqt(this.OLrzqt);
        return c18838fpv;
    }
}
