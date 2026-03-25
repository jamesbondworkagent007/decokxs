package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52706wVi {
    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.String string = textView.getText().toString();
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        if (Build.VERSION.SDK_INT >= 28) {
            C52707wVj.AEQbTJ();
            spannableString.setSpan(C52704wVg.KWHzl(C55298xhM.dp2px$default(4.0f, null, 1, null), i, C55298xhM.dp2px$default(3.0f, null, 1, null)), 0, string.length(), 33);
        } else {
            spannableString.setSpan(new android.text.style.BulletSpan(C55298xhM.dp2px$default(8.0f, null, 1, null), i), 0, string.length(), 33);
        }
        textView.setText(spannableString);
    }
}
