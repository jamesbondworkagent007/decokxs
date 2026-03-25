package o;

import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33517mxu {
    public static final C33517mxu KWHzl = new C33517mxu();

    private C33517mxu() {
    }

    public final void KWHzl(@NotNull android.content.Context context, int i) {
        Resources.Theme themeOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        context.getTheme().applyStyle(i, true);
        if (!(context instanceof android.app.Activity) || (themeOLrzqt = OLrzqt((android.app.Activity) context)) == null) {
            return;
        }
        themeOLrzqt.applyStyle(i, true);
    }

    public final Resources.Theme OLrzqt(android.app.Activity activity) {
        android.view.View viewPeekDecorView;
        android.content.Context context;
        android.view.Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, C52761wXj.ActionBar.DarRvM);
    }

    public final int OLrzqt(@NotNull android.content.Context context, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return (!context.getTheme().resolveAttribute(i, typedValue, true) || 28 > (i2 = typedValue.type) || i2 >= 32) ? ContextCompat.getColor(context, i) : typedValue.data;
    }

    public static /* synthetic */ android.content.Context resolveTheme$default(C33517mxu c33517mxu, android.content.Context context, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C33512mxp.AEQbTJ.values();
        }
        return c33517mxu.KWHzl(context, i, i2);
    }

    public final android.content.Context KWHzl(@NotNull android.content.Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            KWHzl.KWHzl(context);
        } catch (Resources.NotFoundException unused) {
            C33517mxu c33517mxu = KWHzl;
            c33517mxu.KWHzl(context, i);
            c33517mxu.KWHzl(context, i2);
        }
        return context;
    }
}
