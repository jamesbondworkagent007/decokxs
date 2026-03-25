package o;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kPZ implements InterfaceC28131kQa {
    @yCM
    public kPZ() {
    }

    @Override // o.InterfaceC28131kQa
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, DialogInterface.OnDismissListener onDismissListener, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C30449lbP.copydefault(fragmentManager, onDismissListener, function0);
    }
}
