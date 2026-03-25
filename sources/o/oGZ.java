package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGZ {
    public static final void OLrzqt(@NotNull wYK wyk) {
        Intrinsics.checkNotNullParameter(wyk, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(wyk.getContext(), C44105sDn.Application.values);
        if (drawable != null) {
            wyk.setButtonDrawable(drawable);
        }
    }
}
