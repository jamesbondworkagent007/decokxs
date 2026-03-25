package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.svS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45661suJ implements InterfaceC33217msL {
    public final boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33217msL
    public boolean KWHzl() {
        return this.EZpvd;
    }

    public C45661suJ(@NotNull C45726svi c45726svi) {
        Intrinsics.checkNotNullParameter(c45726svi, "");
        this.EZpvd = c45726svi.AEQbTJ();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.suI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45661suJ.AEQbTJ();
            }
        });
    }

    @Override // o.InterfaceC33217msL
    public androidx.fragment.app.Fragment EZpvd() {
        return (androidx.fragment.app.Fragment) this.KWHzl.getValue();
    }

    public static final androidx.fragment.app.Fragment AEQbTJ() {
        svI svi = (svI) C43251rlk.OLrzqt(svI.class);
        if (svi != null) {
            return svi.EZpvd(svS.Application.EZpvd, "LiteHeroPageId");
        }
        return null;
    }
}
