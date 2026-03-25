package o;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35145npm {
    public static /* synthetic */ boolean measureText$default(android.widget.TextView textView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = " ";
        }
        if ((i & 8) != 0) {
            str4 = "\n";
        }
        return AEQbTJ(textView, str, str2, str3, str4);
    }

    public static final boolean AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        float fMeasureText;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (textView.getMaxWidth() > 0) {
            android.text.TextPaint paint = textView.getPaint();
            if (paint != null) {
                fMeasureText = paint.measureText(str + str3 + str2);
            } else {
                fMeasureText = 0.0f;
            }
            if (fMeasureText > textView.getMaxWidth()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r1v4, r2v5 */
    public static final void EZpvd(@NotNull java.util.List<? extends Triple<? extends android.widget.TextView, java.lang.String, java.lang.String>> list) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            boolean zMeasureText$default = measureText$default((android.widget.TextView) triple.getFirst(), (java.lang.String) triple.getSecond(), (java.lang.String) triple.getThird(), null, null, 12, null);
            if (((java.lang.CharSequence) triple.getSecond()).length() == 0 || ((java.lang.CharSequence) triple.getThird()).length() == 0) {
                java.lang.Object second = triple.getSecond();
                java.lang.Object third = triple.getThird();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(second);
                sb.append(third);
                string = sb.toString();
            } else {
                java.lang.Object second2 = triple.getSecond();
                java.lang.String str = zMeasureText$default ? "\n" : " ";
                string = second2 + str + triple.getThird();
            }
            ((android.widget.TextView) triple.getFirst()).setText(string);
        }
    }
}
