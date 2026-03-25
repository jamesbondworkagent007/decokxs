package o;

import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.yna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57711yna implements android.text.InputFilter {
    public int KWHzl;
    public java.lang.String copydefault = java.lang.String.valueOf(new DecimalFormatSymbols(java.util.Locale.getDefault()).getDecimalSeparator());

    public C57711yna(int i) {
        this.KWHzl = i;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        java.lang.String string;
        java.lang.String string2;
        if (this.KWHzl == 0) {
            if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(charSequence), (java.lang.Object) ("0" + this.copydefault))) {
                return "";
            }
            if (charSequence == null || (string2 = charSequence.toString()) == null || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) string2, (java.lang.CharSequence) this.copydefault, false, 2, (java.lang.Object) null)) {
                return null;
            }
            return charSequence.subSequence(0, StringsKt__StringsKt.indexOf$default(charSequence, this.copydefault, 0, false, 6, (java.lang.Object) null)).toString();
        }
        if (charSequence != null && charSequence.length() != 0) {
            if (spanned == null || (string = spanned.toString()) == null) {
                string = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) (charSequence != null ? charSequence.toString() : null), (java.lang.Object) this.copydefault) && string.length() == 0) {
                return "0" + this.copydefault;
            }
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) this.copydefault, false, 2, (java.lang.Object) null)) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) string, this.copydefault, 0, false, 6, (java.lang.Object) null);
                if (i3 > iIndexOf$default && charSequence.length() + ((string.length() - iIndexOf$default) - 1) > this.KWHzl) {
                    return "";
                }
            }
        }
        return null;
    }
}
