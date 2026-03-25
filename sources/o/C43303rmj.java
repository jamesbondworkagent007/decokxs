package o;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43303rmj {
    public InterfaceC43264rlx AEQbTJ;
    public boolean EZpvd;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rmn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43303rmj.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC43264rlx interfaceC43264rlx) {
        Intrinsics.checkNotNullParameter(interfaceC43264rlx, "");
        this.AEQbTJ = interfaceC43264rlx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.EZpvd = z;
    }

    public final java.util.Map<java.lang.String, C43301rmh> KWHzl() {
        return (java.util.Map) this.OLrzqt.getValue();
    }

    public static final java.util.Map EZpvd() {
        return new LinkedHashMap();
    }

    public final InterfaceC43264rlx copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C43301rmh c43301rmh = KWHzl().get(str);
        if (c43301rmh == null) {
            c43301rmh = new C43301rmh(str);
            KWHzl().put(str, c43301rmh);
            c43301rmh.KWHzl(this.EZpvd);
        }
        if (this.AEQbTJ != null && !Intrinsics.EZpvd(c43301rmh.copydefault(), this.AEQbTJ)) {
            c43301rmh.EZpvd(this.AEQbTJ);
        }
        return c43301rmh;
    }
}
