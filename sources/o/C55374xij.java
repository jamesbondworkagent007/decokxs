package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55374xij {
    public static final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.aHXSQp, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme")) {
            return C52761wXj.LoaderManager.fvQaOB;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKTheme.Inverse")) {
            return C52761wXj.LoaderManager.flVtFt;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme.Modern")) {
            return C52761wXj.LoaderManager.DXXBbs;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme.Modern.Inverse")) {
            return C52761wXj.LoaderManager.ODWQjV;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme.Alternative")) {
            return C52761wXj.LoaderManager.AxsJAYaxsJAY;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme.Alternative.Inverse")) {
            return C52761wXj.LoaderManager.hUfVAv;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme.Alternative.Web3")) {
            return C52761wXj.LoaderManager.iZzfmt;
        }
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "OKUITheme.Alternative.Web3.Inverse")) {
            return C52761wXj.LoaderManager.AxsJAYsNCnLh;
        }
        return 0;
    }

    public static final android.content.Context KWHzl(@NotNull android.content.Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.uiMode = i | (configuration.uiMode & (-49));
        return new androidx.appcompat.view.ContextThemeWrapper(context.createConfigurationContext(configuration), i2);
    }

    public static final android.content.Context AEQbTJ(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C55365xia(context, i);
    }
}
