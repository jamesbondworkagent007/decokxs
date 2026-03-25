package o;

import android.graphics.PorterDuff;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mHE {
    public static /* synthetic */ void tint$default(android.widget.ImageView imageView, int i, PorterDuff.Mode mode, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        KWHzl(imageView, i, mode);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, int i, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(imageView, "");
        imageView.setColorFilter(i, mode);
    }

    public static final boolean EZpvd(android.content.Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
