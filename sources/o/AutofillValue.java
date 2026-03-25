package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CompletionInfo;
import o.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillValue {
    public static final java.util.Map<java.lang.String, Function2<CompletionInfo.ActionBar, BX, Unit>> AEQbTJ = C56424yEw.KWHzl();

    public static final CompletionInfo OLrzqt(@NotNull WindowInsets.ActionBar actionBar, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(bx, "");
        CompletionInfo.Activity activity = CompletionInfo.copydefault;
        CompletionInfo.ActionBar actionBar2 = new CompletionInfo.ActionBar();
        actionBar2.EZpvd(actionBar.AkhnZx());
        copydefault(actionBar2, actionBar, bx);
        DL dlAYXKKw = actionBar.AYXKKw();
        actionBar2.KWHzl(dlAYXKKw != null ? dlAYXKKw.toString() : null);
        Function2<CompletionInfo.ActionBar, BX, Unit> function2 = AEQbTJ.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(actionBar2, bx);
        }
        return actionBar2.EZpvd();
    }

    public static final void copydefault(CompletionInfo.ActionBar actionBar, WindowInsets.ActionBar actionBar2, BX bx) {
        actionBar.copydefault(java.lang.Boolean.valueOf(actionBar2.DbNXlk()));
        actionBar.KWHzl(java.lang.Boolean.valueOf(actionBar2.fJNWhG()));
        actionBar.AEQbTJ(java.lang.Boolean.FALSE);
    }
}
