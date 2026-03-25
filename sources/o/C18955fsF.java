package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18955fsF {
    public final android.text.SpannableString EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.content.Context context) {
        int color;
        int length;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (str.length() != 0 && str2.length() > 0) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, true, 2, (java.lang.Object) null);
            int color2 = ContextCompat.getColor(context, C52761wXj.Activity.fkESqH);
            if (C7911ask.AEQbTJ(context)) {
                color = ContextCompat.getColor(context, C52761wXj.Activity.htlTjW);
            } else {
                color = ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl);
            }
            while (iIndexOf$default >= 0) {
                if (str2.length() + iIndexOf$default <= str.length()) {
                    length = str2.length() + iIndexOf$default;
                } else {
                    length = str.length();
                }
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(color2), iIndexOf$default, length, 18);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), iIndexOf$default, length, 18);
                iIndexOf$default = StringsKt__StringsKt.OLrzqt((java.lang.CharSequence) str, str2, length, true);
            }
        }
        return spannableString;
    }
}
