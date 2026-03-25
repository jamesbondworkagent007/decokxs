package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.LocalSocket;
import o.LocalSocketAddress;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MacAddress implements InterfaceC4949Bx {
    public final LocalSocket.TaskDescription OLrzqt;

    public MacAddress(@NotNull LocalSocket.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.OLrzqt = taskDescription;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        LocalSocketAddress.StateListAnimator stateListAnimator = LocalSocketAddress.OLrzqt;
        LocalSocketAddress.ActionBar actionBar = new LocalSocketAddress.ActionBar();
        actionBar.OLrzqt((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.OLrzqt.OLrzqt().OLrzqt(actionBar.copydefault(), continuation);
    }
}
