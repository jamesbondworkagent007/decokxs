package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tRA {
    public static /* synthetic */ void setEndDrawableWithSize$default(C52794wYp c52794wYp, int i, int i2, java.lang.Integer num, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            i3 = 4;
        }
        AEQbTJ(c52794wYp, i, i2, num, i3);
    }

    public static final void AEQbTJ(@NotNull C52794wYp c52794wYp, int i, int i2, java.lang.Integer num, int i3) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), i);
        if (drawable != null) {
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(i2, context);
            android.content.Context context2 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(i2, context2));
            if (num != null) {
                drawable.setTint(num.intValue());
            }
        }
        c52794wYp.setCompoundDrawablesRelative(null, null, drawable, null);
        android.content.Context context3 = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c52794wYp.setCompoundDrawablePadding(C55298xhM.OLrzqt(i3, context3));
    }
}
