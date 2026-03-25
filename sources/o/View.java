package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AccessibilityDelegate;
import o.Factory2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class View {
    public static final java.util.Map<java.lang.String, Function2<AccessibilityDelegate.Activity, BX, Unit>> AEQbTJ = C56424yEw.KWHzl();

    public static final AccessibilityDelegate AEQbTJ(@NotNull Factory2.Application application, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(bx, "");
        AccessibilityDelegate.TaskDescription taskDescription = AccessibilityDelegate.OLrzqt;
        AccessibilityDelegate.Activity activity = new AccessibilityDelegate.Activity();
        activity.EZpvd(application.isConnected());
        KWHzl(activity, application, bx);
        DL dlGEmmrt = application.gEmmrt();
        activity.AEQbTJ(dlGEmmrt != null ? dlGEmmrt.toString() : null);
        Function2<AccessibilityDelegate.Activity, BX, Unit> function2 = AEQbTJ.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(activity, bx);
        }
        return activity.copydefault();
    }

    public static final void KWHzl(AccessibilityDelegate.Activity activity, Factory2.Application application, BX bx) {
        activity.KWHzl(java.lang.Boolean.valueOf(application.DbNXlk()));
        activity.AEQbTJ(java.lang.Boolean.valueOf(application.fARcdN()));
    }
}
