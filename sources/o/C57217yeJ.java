package o;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57217yeJ {
    public static /* synthetic */ android.content.Context createContextWithNightMode$default(android.content.Context context, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = z ? C52761wXj.LoaderManager.DAIeex : C52761wXj.LoaderManager.iRxXKY;
        }
        return copydefault(context, z, i);
    }

    public static final android.content.Context copydefault(@NotNull android.content.Context context, boolean z, @androidx.annotation.StyleRes int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.uiMode = (z ? 32 : 16) | (configuration.uiMode & (-49));
        android.content.Context contextKWHzl = C38280pSy.KWHzl(new androidx.appcompat.view.ContextThemeWrapper(context.createConfigurationContext(configuration), i));
        C52759wXh c52759wXh = C52759wXh.AEQbTJ;
        Resources.Theme theme = contextKWHzl.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "");
        C52759wXh.wrapOKTheme$default(c52759wXh, theme, C52761wXj.LoaderManager.fdOvFl, 0, 2, null);
        return contextKWHzl;
    }
}
