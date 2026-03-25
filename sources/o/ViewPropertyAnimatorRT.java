package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.ViewDebug;
import o.ViewHierarchyEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPropertyAnimatorRT implements InterfaceC4949Bx {
    public final ViewHierarchyEncoder.StateListAnimator copydefault;

    public ViewPropertyAnimatorRT(@NotNull ViewHierarchyEncoder.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = stateListAnimator;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        ViewDebug.Application application = ViewDebug.AEQbTJ;
        ViewDebug.Activity activity = new ViewDebug.Activity();
        activity.AEQbTJ((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.copydefault.KWHzl().OLrzqt(activity.copydefault(), continuation);
    }
}
