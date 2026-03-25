package o;

import androidx.lifecycle.Lifecycle;
import com.okinc.market.scope.HolderScopeKt$repeatStart$job$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC40511qYo;
import o.C41783qxN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41785qxP {
    public static /* synthetic */ void repeatStart$default(AbstractC40511qYo.Activity activity, Lifecycle lifecycle, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        C41783qxN c41783qxN;
        if ((i & 2) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(activity.OLrzqt(), null, null, new HolderScopeKt$repeatStart$job$1(activity, lifecycle, function1, null), 3, null);
        if (str == null || (c41783qxN = (C41783qxN) activity.OLrzqt().getCoroutineContext().get(C41783qxN.Application.KWHzl)) == null) {
            return;
        }
        c41783qxN.OLrzqt(str, jobLaunch$default);
    }

    public static /* synthetic */ void cancelJob$default(AbstractC40511qYo.Activity activity, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        EZpvd(activity, str);
    }

    public static final void EZpvd(@NotNull AbstractC40511qYo.Activity<?> activity, java.lang.String str) {
        C41783qxN c41783qxN;
        C41783qxN c41783qxN2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (str != null && (c41783qxN2 = (C41783qxN) activity.OLrzqt().getCoroutineContext().get(C41783qxN.Application.KWHzl)) != null) {
            c41783qxN2.OLrzqt(str);
        }
        if ((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && (c41783qxN = (C41783qxN) activity.OLrzqt().getCoroutineContext().get(C41783qxN.Application.KWHzl)) != null) {
            c41783qxN.EZpvd();
        }
    }
}
