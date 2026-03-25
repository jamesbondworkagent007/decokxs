package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AccessibilityEventSource;
import o.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityNodeProvider implements InterfaceC4949Bx {
    public final WindowInsets.ActionBar OLrzqt;

    public AccessibilityNodeProvider(@NotNull WindowInsets.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.OLrzqt = actionBar;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        AccessibilityEventSource.ActionBar actionBar = AccessibilityEventSource.EZpvd;
        AccessibilityEventSource.TaskDescription taskDescription = new AccessibilityEventSource.TaskDescription();
        taskDescription.copydefault((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.OLrzqt.EZpvd().OLrzqt(taskDescription.KWHzl(), continuation);
    }
}
