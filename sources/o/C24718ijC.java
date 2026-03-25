package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24718ijC {
    public final androidx.fragment.app.FragmentManager AEQbTJ;
    public final Function0<Unit> EZpvd;
    public final AbstractC23101hrq KWHzl;
    public final android.app.Activity OLrzqt;
    public final C24763ijv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC24758ijq EZpvd() {
        return this.copydefault;
    }

    public C24718ijC(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = fragmentManager;
        this.OLrzqt = activity;
        this.KWHzl = abstractC23101hrq;
        this.EZpvd = function0;
        this.copydefault = new C24763ijv();
    }

    public final void copydefault() {
        EZpvd().OLrzqt(this.AEQbTJ, this.OLrzqt, this.KWHzl, this.EZpvd);
    }
}
