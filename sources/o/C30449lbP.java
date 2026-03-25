package o;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lbP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30449lbP {
    public static /* synthetic */ void checkLegalDisclaimerAndProceed$default(androidx.fragment.app.FragmentManager fragmentManager, DialogInterface.OnDismissListener onDismissListener, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            onDismissListener = null;
        }
        copydefault(fragmentManager, onDismissListener, function0);
    }

    public static final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, DialogInterface.OnDismissListener onDismissListener, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (C23317hvu.valueOf()) {
            function0.invoke();
        } else {
            new C30442lbI().OLrzqt(fragmentManager, function0, onDismissListener);
        }
    }
}
