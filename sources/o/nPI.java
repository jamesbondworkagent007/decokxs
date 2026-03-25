package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPI {
    public static final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return true;
    }
}
