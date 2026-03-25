package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25463ixG implements InterfaceC25462ixF {
    @Override // o.InterfaceC25462ixF
    public void copydefault(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        dTK value = ((dTL) C43251rlk.copydefault(dTL.class)).AEQbTJ().getValue();
        if (value == null || value.OLrzqt() != 3) {
            return;
        }
        C27508jwX.AEQbTJ.OLrzqt(activity, bundle.getString("source"));
    }
}
