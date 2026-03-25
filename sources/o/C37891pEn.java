package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37891pEn {
    public static final C37891pEn AEQbTJ = new C37891pEn();

    private C37891pEn() {
    }

    public final android.graphics.drawable.Drawable OLrzqt(@NotNull android.content.Context context, @androidx.annotation.DrawableRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(createContextWithNightMode$default(this, context, z, 0, 2, null), i);
    }

    public static /* synthetic */ android.content.Context createContextWithNightMode$default(C37891pEn c37891pEn, android.content.Context context, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = z ? C52761wXj.LoaderManager.DAIeex : C52761wXj.LoaderManager.iRxXKY;
        }
        return c37891pEn.OLrzqt(context, z, i);
    }

    public final android.content.Context OLrzqt(android.content.Context context, boolean z, @androidx.annotation.StyleRes int i) {
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.uiMode = (z ? 32 : 16) | (configuration.uiMode & (-49));
        return C38280pSy.KWHzl(new android.view.ContextThemeWrapper(context.createConfigurationContext(configuration), i));
    }
}
