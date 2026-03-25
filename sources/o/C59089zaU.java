package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59089zaU implements InterfaceC59082zaN {
    public final yNU AEQbTJ;

    public C59089zaU(@NotNull yNU ynu) {
        Intrinsics.checkNotNullParameter(ynu, "");
        this.AEQbTJ = ynu;
    }

    @Override // o.InterfaceC59082zaN
    public C59078zaJ AEQbTJ(@NotNull C56929yXo c56929yXo) {
        C59078zaJ c59078zaJAEQbTJ;
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        for (yNW ynw : C56672yOa.OLrzqt(this.AEQbTJ, c56929yXo.OLrzqt())) {
            if ((ynw instanceof AbstractC59088zaT) && (c59078zaJAEQbTJ = ((AbstractC59088zaT) ynw).djBIcL().AEQbTJ(c56929yXo)) != null) {
                return c59078zaJAEQbTJ;
            }
        }
        return null;
    }
}
