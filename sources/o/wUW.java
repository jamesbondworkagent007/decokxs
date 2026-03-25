package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wUW {
    public static /* synthetic */ java.lang.CharSequence withColorUnderlineStyle$default(java.lang.CharSequence charSequence, int i, int i2, float f, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            str = C33129mqd.gEmmrt(charSequence);
        }
        return EZpvd(charSequence, i, i2, f, str);
    }

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.CharSequence charSequence, int i, int i2, float f, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        java.lang.String strReplace$default = str;
        Intrinsics.checkNotNullParameter(strReplace$default, "");
        if (Intrinsics.EZpvd((java.lang.Object) charSequence, (java.lang.Object) "--")) {
            return charSequence;
        }
        java.lang.String string = charSequence.toString();
        if (pTF.KWHzl.EZpvd()) {
            java.lang.String strReplace$default2 = C59449zhJ.replace$default(C59449zhJ.replace$default(string, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null);
            strReplace$default = C59449zhJ.replace$default(C59449zhJ.replace$default(str, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null);
            string = strReplace$default2;
        }
        java.lang.String str2 = strReplace$default;
        wUY wuy = new wUY(i, i2, f);
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(string);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, str2, 0, false, 6, (java.lang.Object) null);
        int length = str2.length();
        if (iIndexOf$default != -1) {
            spannableStringBuilderValueOf.setSpan(wuy, iIndexOf$default, length + iIndexOf$default, 17);
        }
        Intrinsics.copydefault(spannableStringBuilderValueOf);
        return spannableStringBuilderValueOf;
    }
}
