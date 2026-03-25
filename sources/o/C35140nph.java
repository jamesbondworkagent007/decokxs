package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35140nph {
    public static /* synthetic */ float getTextSize$default(android.widget.TextView textView, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        return copydefault(textView, f);
    }

    public static final float copydefault(@NotNull android.widget.TextView textView, float f) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.text.TextPaint paint = textView.getPaint();
        paint.setTextSize(C55298xhM.sp2pxFloat$default(f, null, 1, null));
        return paint.measureText(C33129mqd.gEmmrt(textView.getText()));
    }
}
