package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ViewHierarchyEncoder;
import o.ViewStub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WindowManagerPolicyConstants {
    public static final java.util.Map<java.lang.String, Function2<ViewStub.TaskDescription, BX, Unit>> KWHzl = C56424yEw.KWHzl();

    public static final ViewStub EZpvd(@NotNull ViewHierarchyEncoder.StateListAnimator stateListAnimator, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(bx, "");
        ViewStub.Activity activity = ViewStub.KWHzl;
        ViewStub.TaskDescription taskDescription = new ViewStub.TaskDescription();
        taskDescription.EZpvd(stateListAnimator.AkhnZx());
        KWHzl(taskDescription, stateListAnimator, bx);
        DL dlAYXKKw = stateListAnimator.AYXKKw();
        taskDescription.AEQbTJ(dlAYXKKw != null ? dlAYXKKw.toString() : null);
        Function2<ViewStub.TaskDescription, BX, Unit> function2 = KWHzl.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(taskDescription, bx);
        }
        return taskDescription.AEQbTJ();
    }

    public static final void KWHzl(ViewStub.TaskDescription taskDescription, ViewHierarchyEncoder.StateListAnimator stateListAnimator, BX bx) {
        taskDescription.EZpvd(java.lang.Boolean.valueOf(stateListAnimator.isConnected()));
        taskDescription.copydefault(java.lang.Boolean.valueOf(stateListAnimator.ejfBZ()));
    }
}
