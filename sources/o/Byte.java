package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.Character;
import o.Subset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Byte implements InterfaceC4949Bx {
    public final Character.Activity copydefault;

    public Byte(@NotNull Character.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = activity;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        Subset.Application application = Subset.OLrzqt;
        Subset.ActionBar actionBar = new Subset.ActionBar();
        actionBar.KWHzl((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.copydefault.copydefault().OLrzqt(actionBar.copydefault(), continuation);
    }
}
