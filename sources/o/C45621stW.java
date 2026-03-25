package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.stW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45621stW {
    public static final void EZpvd(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\n", false, 2, (java.lang.Object) null)) {
            textView.setText(str);
            return;
        }
        java.lang.String strReplace$default = C59449zhJ.replace$default(str, "\n", "\n\r", false, 4, (java.lang.Object) null);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strReplace$default, "\n\r", 0, false, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(iIndexOf$default));
        while (iIndexOf$default != -1) {
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strReplace$default, "\n\r", iIndexOf$default + 2, false, 4, (java.lang.Object) null);
            if (iIndexOf$default != -1) {
                arrayList.add(java.lang.Integer.valueOf(iIndexOf$default));
            }
        }
        int lineHeight = textView.getLineHeight();
        android.text.SpannableString spannableString = new android.text.SpannableString(strReplace$default);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView.getContext(), C47315tni.Application.ejfBZ);
        float f = textView.getContext().getResources().getDisplayMetrics().density;
        if (drawable != null) {
            drawable.setBounds(0, 0, 1, (int) ((((double) (lineHeight - (textView.getLineSpacingExtra() * f))) / 1.2d) + ((double) ((i - textView.getLineSpacingExtra()) * f))));
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            if (drawable != null) {
                spannableString.setSpan(new android.text.style.ImageSpan(drawable), iIntValue + 1, iIntValue + 2, 33);
            }
        }
        textView.setText(spannableString);
    }
}
