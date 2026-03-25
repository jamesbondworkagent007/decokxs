package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6825aWg;

/* JADX INFO: renamed from: o.aWF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6798aWF {
    public static boolean AEQbTJ(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean OLrzqt(java.lang.String str) {
        return AEQbTJ(str) || AbstractJsonLexerKt.NULL.equalsIgnoreCase(str);
    }

    public static boolean EZpvd(java.lang.String str) {
        return !OLrzqt(str);
    }

    public static boolean copydefault(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!java.lang.Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        return OLrzqt(str, C6825aWg.Activity.copydefault);
    }

    public static java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        if (AEQbTJ(str) || AEQbTJ(str2)) {
            return str;
        }
        try {
            int length = str2.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
            while (sb.indexOf(str2) == 0) {
                sb.delete(0, length);
            }
            int iLastIndexOf = sb.lastIndexOf(str2);
            for (int length2 = sb.length(); iLastIndexOf != -1 && iLastIndexOf == length2 - length; length2 = sb.length()) {
                sb.delete(iLastIndexOf, length2);
                iLastIndexOf = sb.lastIndexOf(str2);
            }
            return sb.toString();
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    public static java.lang.Object EZpvd(java.lang.Object obj) {
        if (obj instanceof android.text.style.AbsoluteSizeSpan) {
            return new android.text.style.AbsoluteSizeSpan(((android.text.style.AbsoluteSizeSpan) obj).getSize());
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            return new android.text.style.TypefaceSpan(((android.text.style.TypefaceSpan) obj).getFamily());
        }
        if (obj instanceof android.text.style.StyleSpan) {
            return new android.text.style.StyleSpan(((android.text.style.StyleSpan) obj).getStyle());
        }
        if (obj instanceof android.text.style.ForegroundColorSpan) {
            return new android.text.style.ForegroundColorSpan(((android.text.style.ForegroundColorSpan) obj).getForegroundColor());
        }
        if (obj instanceof android.text.style.BackgroundColorSpan) {
            return new android.text.style.BackgroundColorSpan(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor());
        }
        return obj instanceof android.text.style.UnderlineSpan ? new android.text.style.UnderlineSpan() : obj;
    }
}
