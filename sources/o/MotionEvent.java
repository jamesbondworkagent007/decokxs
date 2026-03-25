package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.Factory2;
import o.MenuItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MotionEvent implements InterfaceC4949Bx {
    public final Factory2.Application AEQbTJ;

    public MotionEvent(@NotNull Factory2.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        MenuItem.Activity activity = MenuItem.KWHzl;
        MenuItem.ActionBar actionBar = new MenuItem.ActionBar();
        actionBar.AEQbTJ((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.AEQbTJ.OLrzqt().OLrzqt(actionBar.KWHzl(), continuation);
    }
}
