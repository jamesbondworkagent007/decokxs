package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class gBZ {
    public static final gBZ copydefault = new gBZ();

    private gBZ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gBZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void releaseUtxo$default(gBZ gbz, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        gbz.OLrzqt(fragmentManager, function0);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        gBV gbvOLrzqt = gBV.Companion.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QDqgQU), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DNMMPQ));
        gbvOLrzqt.EZpvd(function0);
        gbvOLrzqt.show(fragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gBZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void rebroadcastTx$default(gBZ gbz, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        gbz.copydefault(fragmentManager, function0);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        gBV gbvOLrzqt = gBV.Companion.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RVsVBY), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OTwTPd));
        gbvOLrzqt.EZpvd(function0);
        gbvOLrzqt.show(fragmentManager);
    }
}
