package o;

import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50025uzd {
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

    public static final int EZpvd(int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return EZpvd(contextAEQbTJ, i);
    }
}
