package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C44335sM;
import o.InterfaceC44254sJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C44308sL implements InterfaceC4949Bx {
    public final InterfaceC44254sJ.Application AEQbTJ;

    public C44308sL(@NotNull InterfaceC44254sJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        C44335sM.Activity activity = C44335sM.KWHzl;
        C44335sM.StateListAnimator stateListAnimator = new C44335sM.StateListAnimator();
        stateListAnimator.EZpvd((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.AEQbTJ.KWHzl().OLrzqt(stateListAnimator.KWHzl(), continuation);
    }
}
