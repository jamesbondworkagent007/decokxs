package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.UrlInterceptRegistry;
import o.WebResourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WebSettings {
    public static final java.util.Map<java.lang.String, Function2<WebResourceError.StateListAnimator, BX, Unit>> OLrzqt = C56424yEw.KWHzl();

    public static final WebResourceError copydefault(@NotNull UrlInterceptRegistry.TaskDescription taskDescription, @NotNull BX bx) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(bx, "");
        WebResourceError.Application application = WebResourceError.copydefault;
        WebResourceError.StateListAnimator stateListAnimator = new WebResourceError.StateListAnimator();
        stateListAnimator.copydefault(taskDescription.isConnected());
        KWHzl(stateListAnimator, taskDescription, bx);
        DL dlAYXKKw = taskDescription.AYXKKw();
        stateListAnimator.AEQbTJ(dlAYXKKw != null ? dlAYXKKw.toString() : null);
        Function2<WebResourceError.StateListAnimator, BX, Unit> function2 = OLrzqt.get((java.lang.String) C58108yv.OLrzqt(bx.OLrzqt(), C57578yl.EZpvd.copydefault()));
        if (function2 != null) {
            function2.invoke(stateListAnimator, bx);
        }
        return stateListAnimator.AEQbTJ();
    }

    public static final void KWHzl(WebResourceError.StateListAnimator stateListAnimator, UrlInterceptRegistry.TaskDescription taskDescription, BX bx) {
        stateListAnimator.EZpvd(java.lang.Boolean.valueOf(taskDescription.fJNWhG()));
        stateListAnimator.KWHzl(java.lang.Boolean.valueOf(taskDescription.ejfBZ()));
    }
}
