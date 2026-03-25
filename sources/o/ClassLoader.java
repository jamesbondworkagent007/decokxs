package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.Character;
import o.ClassCastException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassLoader {
    public static final java.util.Map<java.lang.String, Function2<ClassCastException.ActionBar, BX, Unit>> EZpvd = C56424yEw.KWHzl();

    public static final ClassCastException KWHzl(@NotNull Character.Activity activity, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bx, "");
        ClassCastException.StateListAnimator stateListAnimator = ClassCastException.copydefault;
        ClassCastException.ActionBar actionBar = new ClassCastException.ActionBar();
        actionBar.copydefault(activity.values());
        AEQbTJ(actionBar, activity, bx);
        DL dlValueOf = activity.valueOf();
        actionBar.KWHzl(dlValueOf != null ? dlValueOf.toString() : null);
        Function2<ClassCastException.ActionBar, BX, Unit> function2 = EZpvd.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(actionBar, bx);
        }
        return actionBar.OLrzqt();
    }

    public static final void AEQbTJ(ClassCastException.ActionBar actionBar, Character.Activity activity, BX bx) {
        actionBar.AEQbTJ(java.lang.Boolean.valueOf(activity.isConnected()));
        actionBar.KWHzl(java.lang.Boolean.valueOf(activity.fIwbmz()));
    }
}
