package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34389nbE {
    public static final android.text.SpannedString copydefault(@NotNull java.lang.String str, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(str, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), 0, str.length(), 33);
        return new android.text.SpannedString(spannableStringBuilder);
    }
}
