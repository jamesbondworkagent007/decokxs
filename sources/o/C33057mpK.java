package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33057mpK {
    public static final android.graphics.drawable.Drawable EZpvd(int i, @NotNull android.content.Context context, @androidx.annotation.ColorRes int i2) {
        android.graphics.drawable.Drawable drawableMutate;
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return null;
        }
        DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(context, i2));
        return drawableMutate;
    }

    public static final android.graphics.drawable.Drawable OLrzqt(@NotNull android.graphics.drawable.Drawable drawable, @NotNull android.content.Context context, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
        DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(context, i));
        return drawableMutate;
    }

    public static final android.graphics.drawable.Drawable OLrzqt(int i, @NotNull android.content.Context context, @androidx.annotation.ColorInt int i2) {
        android.graphics.drawable.Drawable drawableMutate;
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            return null;
        }
        DrawableCompat.setTint(drawableMutate, i2);
        return drawableMutate;
    }

    public static final android.graphics.drawable.Drawable copydefault(@NotNull android.graphics.drawable.Drawable drawable, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(drawable, "");
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
        DrawableCompat.setTint(drawableMutate, i);
        return drawableMutate;
    }

    public static final android.graphics.drawable.Drawable EZpvd(@NotNull android.graphics.drawable.Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "");
        drawable.setBounds(0, 0, i, i);
        return drawable;
    }
}
