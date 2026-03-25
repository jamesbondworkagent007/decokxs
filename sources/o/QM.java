package o;

import android.content.res.Resources;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class QM {
    public static volatile boolean AEQbTJ = true;

    private QM() {
    }

    public static android.graphics.drawable.Drawable KWHzl(android.content.Context context, android.content.Context context2, @androidx.annotation.DrawableRes int i) {
        return AEQbTJ(context, context2, i, null);
    }

    public static android.graphics.drawable.Drawable AEQbTJ(android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.Nullable Resources.Theme theme) {
        return AEQbTJ(context, context, i, theme);
    }

    public static android.graphics.drawable.Drawable AEQbTJ(android.content.Context context, android.content.Context context2, @androidx.annotation.DrawableRes int i, @androidx.annotation.Nullable Resources.Theme theme) {
        try {
            if (AEQbTJ) {
                return EZpvd(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (java.lang.IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (java.lang.NoClassDefFoundError unused2) {
            AEQbTJ = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return copydefault(context2, i, theme);
    }

    public static android.graphics.drawable.Drawable EZpvd(android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.Nullable Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i);
    }

    public static android.graphics.drawable.Drawable copydefault(android.content.Context context, @androidx.annotation.DrawableRes int i, @androidx.annotation.Nullable Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i, theme);
    }
}
