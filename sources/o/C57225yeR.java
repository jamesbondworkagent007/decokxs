package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57225yeR {
    public static final android.text.Editable EZpvd(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        android.text.Selection.setSelection(spannableStringBuilder, android.text.Selection.getSelectionStart(charSequence), android.text.Selection.getSelectionEnd(charSequence));
        return spannableStringBuilder;
    }

    public static final void copydefault(@NotNull android.text.Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "");
        int length = editable.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!CharsKt__CharJVMKt.EZpvd(editable.charAt(length))) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length != -1) {
            editable.delete(length + 1, editable.length());
        }
        int length2 = editable.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                i2 = -1;
                break;
            } else if (!CharsKt__CharJVMKt.EZpvd(editable.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            editable.delete(0, i2);
        }
    }
}
