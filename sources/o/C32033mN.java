package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C31817mF;
import o.InterfaceC31925mJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C32033mN implements InterfaceC4949Bx {
    public final InterfaceC31925mJ.StateListAnimator AEQbTJ;

    public C32033mN(@NotNull InterfaceC31925mJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AEQbTJ = stateListAnimator;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        C31817mF.TaskDescription taskDescription = C31817mF.EZpvd;
        C31817mF.Application application = new C31817mF.Application();
        application.OLrzqt((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.AEQbTJ.EZpvd().OLrzqt(application.OLrzqt(), continuation);
    }
}
