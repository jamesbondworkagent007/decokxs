package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BinaryOperator;
import o.IntToLongFunction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IntToDoubleFunction {
    public static final java.util.Map<java.lang.String, Function2<IntToLongFunction.Activity, BX, Unit>> EZpvd = C56424yEw.KWHzl();

    public static final IntToLongFunction EZpvd(@NotNull BinaryOperator.ActionBar actionBar, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(bx, "");
        IntToLongFunction.TaskDescription taskDescription = IntToLongFunction.EZpvd;
        IntToLongFunction.Activity activity = new IntToLongFunction.Activity();
        activity.EZpvd(actionBar.values());
        AEQbTJ(activity, actionBar, bx);
        DL dlAYXKKw = actionBar.AYXKKw();
        activity.OLrzqt(dlAYXKKw != null ? dlAYXKKw.toString() : null);
        Function2<IntToLongFunction.Activity, BX, Unit> function2 = EZpvd.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(activity, bx);
        }
        return activity.OLrzqt();
    }

    public static final void AEQbTJ(IntToLongFunction.Activity activity, BinaryOperator.ActionBar actionBar, BX bx) {
        activity.copydefault(java.lang.Boolean.valueOf(actionBar.isConnected()));
        activity.EZpvd(java.lang.Boolean.valueOf(actionBar.fJNWhG()));
    }
}
