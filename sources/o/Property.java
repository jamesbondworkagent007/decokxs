package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.MovementMethod;
import o.TransitionManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Property {
    public static final java.util.Map<java.lang.String, Function2<TransitionManager.TaskDescription, BX, Unit>> copydefault = C56424yEw.KWHzl();

    public static final TransitionManager KWHzl(@NotNull MovementMethod.TaskDescription taskDescription, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(bx, "");
        TransitionManager.Application application = TransitionManager.OLrzqt;
        TransitionManager.TaskDescription taskDescription2 = new TransitionManager.TaskDescription();
        taskDescription2.KWHzl(taskDescription.AkhnZx());
        KWHzl(taskDescription2, taskDescription, bx);
        DL dlAhwBna = taskDescription.AhwBna();
        taskDescription2.OLrzqt(dlAhwBna != null ? dlAhwBna.toString() : null);
        Function2<TransitionManager.TaskDescription, BX, Unit> function2 = copydefault.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(taskDescription2, bx);
        }
        return taskDescription2.EZpvd();
    }

    public static final void KWHzl(TransitionManager.TaskDescription taskDescription, MovementMethod.TaskDescription taskDescription2, BX bx) {
        taskDescription.AEQbTJ(java.lang.Boolean.valueOf(taskDescription2.values()));
        taskDescription.KWHzl(java.lang.Boolean.valueOf(taskDescription2.ejfBZ()));
    }
}
