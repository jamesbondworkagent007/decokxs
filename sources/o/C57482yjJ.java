package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57482yjJ implements android.text.InputFilter {
    public final int AEQbTJ;

    public C57482yjJ(int i) {
        this.AEQbTJ = i;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(@NotNull java.lang.CharSequence charSequence, int i, int i2, @NotNull android.text.Spanned spanned, int i3, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(spanned, "");
        java.lang.String strSubstring = spanned.toString().substring(0, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        java.lang.String strSubstring2 = spanned.toString().substring(i4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        java.lang.String str = strSubstring + ((java.lang.Object) charSequenceSubSequence) + strSubstring2;
        if (str.length() == 0) {
            return null;
        }
        if (KWHzl(str) > this.AEQbTJ && KWHzl(spanned.toString()) >= this.AEQbTJ) {
            return "";
        }
        return null;
    }

    public final int KWHzl(java.lang.String str) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes.length;
    }
}
