package o;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qAI implements android.text.InputFilter {
    public final Pattern OLrzqt = Pattern.compile("[a-zA-Z0-9+\\-*/×÷(){}&_]");

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(@NotNull java.lang.CharSequence charSequence, int i, int i2, @NotNull android.text.Spanned spanned, int i3, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(spanned, "");
        while (i < i2) {
            if (!this.OLrzqt.matcher(java.lang.String.valueOf(charSequence.charAt(i))).matches()) {
                return "";
            }
            i++;
        }
        return null;
    }
}
