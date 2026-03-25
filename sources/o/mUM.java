package o;

import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mUM {
    public static final android.content.Context KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context baseContext = context;
        while (baseContext != null && !(baseContext instanceof android.app.Activity) && !(baseContext instanceof android.app.Application)) {
            android.content.ContextWrapper contextWrapper = baseContext instanceof android.content.ContextWrapper ? (android.content.ContextWrapper) baseContext : null;
            baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return baseContext == null ? context : baseContext;
    }

    public static final int EZpvd(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextKWHzl = KWHzl(context);
        try {
            return ContextCompat.getColor(contextKWHzl, i);
        } catch (Resources.NotFoundException unused) {
            return C55366xib.KWHzl(i, contextKWHzl);
        }
    }

    public static final int EZpvd(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return EZpvd(context, i);
    }

    public static final int copydefault(int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return EZpvd(contextAEQbTJ, i);
    }

    public static final android.content.res.ColorStateList copydefault(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextKWHzl = KWHzl(context);
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(EZpvd(contextKWHzl, i));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        try {
            android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(contextKWHzl, i);
            return colorStateList == null ? colorStateListValueOf : colorStateList;
        } catch (Resources.NotFoundException unused) {
            return colorStateListValueOf;
        }
    }

    public static final android.content.res.ColorStateList AEQbTJ(int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return copydefault(contextAEQbTJ, i);
    }
}
