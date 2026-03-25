package o;

import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25382ivf {
    public static final android.content.Context copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context baseContext = context;
        while (baseContext != null && !(baseContext instanceof android.app.Activity) && !(baseContext instanceof android.app.Application)) {
            android.content.ContextWrapper contextWrapper = baseContext instanceof android.content.ContextWrapper ? (android.content.ContextWrapper) baseContext : null;
            baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return baseContext == null ? context : baseContext;
    }

    public static final int KWHzl(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextCopydefault = copydefault(context);
        try {
            return ContextCompat.getColor(contextCopydefault, i);
        } catch (Resources.NotFoundException unused) {
            return C55366xib.KWHzl(i, contextCopydefault);
        }
    }

    public static final int copydefault(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context, i);
    }

    public static final int KWHzl(int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return KWHzl(contextAEQbTJ, i);
    }

    public static final android.content.res.ColorStateList OLrzqt(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context contextCopydefault = copydefault(context);
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(KWHzl(contextCopydefault, i));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        try {
            android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(contextCopydefault, i);
            return colorStateList == null ? colorStateListValueOf : colorStateList;
        } catch (Resources.NotFoundException unused) {
            return colorStateListValueOf;
        }
    }

    public static final android.content.res.ColorStateList copydefault(int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return OLrzqt(contextAEQbTJ, i);
    }
}
