package o;

import android.content.res.Resources;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55365xia extends androidx.appcompat.view.ContextThemeWrapper {
    public Resources.Theme AEQbTJ;

    public C55365xia(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        attachBaseContext(context);
        android.content.res.Configuration configuration = new android.content.res.Configuration();
        configuration.uiMode = i | (context.getResources().getConfiguration().uiMode & (-49));
        applyOverrideConfiguration(configuration);
        if (Build.VERSION.SDK_INT <= 28) {
            setTheme(C55374xij.copydefault(context));
        }
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        if (getThemeResId() != 0) {
            Resources.Theme theme = super.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "");
            return theme;
        }
        EZpvd();
        Resources.Theme theme2 = this.AEQbTJ;
        Intrinsics.copydefault(theme2);
        return theme2;
    }

    public final void EZpvd() {
        Resources.Theme theme;
        if (this.AEQbTJ == null) {
            this.AEQbTJ = getResources().newTheme();
            Resources.Theme theme2 = getBaseContext().getTheme();
            if (theme2 == null || (theme = this.AEQbTJ) == null) {
                return;
            }
            theme.setTo(theme2);
        }
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
        int brandThemeId = C52761wXj.LoaderManager.fERRXa;
        int iValues = C33512mxp.AEQbTJ.values();
        android.app.Activity activityKWHzl = C55296xhK.KWHzl(this);
        if (activityKWHzl instanceof ActivityC52757wXf) {
            ActivityC52757wXf activityC52757wXf = (ActivityC52757wXf) activityKWHzl;
            brandThemeId = activityC52757wXf.getBrandThemeId();
            iValues = activityC52757wXf.getColorThemeId();
        }
        if (theme != null) {
            C52759wXh.AEQbTJ.OLrzqt(theme, brandThemeId, iValues);
        }
    }

    @Override // androidx.appcompat.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
