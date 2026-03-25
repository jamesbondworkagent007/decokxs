package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19605gIo {
    public static /* synthetic */ void toastWithFailedIcon$default(android.content.Context context, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        OLrzqt(context, i, i2);
    }

    public static final void OLrzqt(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, context.getString(i), i2);
    }

    public static /* synthetic */ void toastWithFailedIcon$default(android.content.Context context, java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        OLrzqt(context, charSequence, i);
    }

    public static final void OLrzqt(@NotNull android.content.Context context, java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, charSequence, ContextCompat.getDrawable(context, C52761wXj.TaskDescription.dPkBzA), i, (java.lang.Integer) null, 0, 0, 56, (java.lang.Object) null);
    }
}
