package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BinaryOperator;
import o.Function;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Consumer implements InterfaceC4949Bx {
    public final BinaryOperator.ActionBar EZpvd;

    public Consumer(@NotNull BinaryOperator.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.EZpvd = actionBar;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        Function.ActionBar actionBar = Function.copydefault;
        Function.TaskDescription taskDescription = new Function.TaskDescription();
        taskDescription.AEQbTJ((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.EZpvd.OLrzqt().OLrzqt(taskDescription.AEQbTJ(), continuation);
    }
}
