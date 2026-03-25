package o;

import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* JADX INFO: renamed from: o.ulk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49290ulk {
    public static final C49290ulk OLrzqt = new C49290ulk();
    public static final Regex copydefault = new Regex("<mark\\b[^>]*>(.*?)</mark\\s*>", (java.util.Set<? extends RegexOption>) yEE.AhwBna(RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL));
    public static final int AEQbTJ = 8;

    private C49290ulk() {
    }

    public static /* synthetic */ java.lang.CharSequence buildMarkedSpannable$default(java.lang.CharSequence charSequence, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return EZpvd(charSequence, i, z);
    }

    public static final java.lang.CharSequence EZpvd(java.lang.CharSequence charSequence, @androidx.annotation.ColorInt int i, boolean z) {
        java.lang.String strAEQbTJ;
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        try {
            java.lang.String string = charSequence.toString();
            Regex regex = copydefault;
            if (!regex.containsMatchIn(string)) {
                return charSequence;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            int iCopydefault = 0;
            for (MatchResult matchResult : Regex.findAll$default(regex, string, 0, 2, null)) {
                kotlin.ranges.IntRange intRangeCopydefault = matchResult.copydefault();
                MatchGroup matchGroupOLrzqt = matchResult.EZpvd().OLrzqt(1);
                if (matchGroupOLrzqt == null || (strAEQbTJ = matchGroupOLrzqt.AEQbTJ()) == null) {
                    strAEQbTJ = "";
                }
                if (iCopydefault < intRangeCopydefault.KWHzl()) {
                    spannableStringBuilder.append((java.lang.CharSequence) string, iCopydefault, intRangeCopydefault.KWHzl());
                }
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) strAEQbTJ);
                int length2 = spannableStringBuilder.length();
                if (length < length2) {
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), length, length2, 33);
                    if (z) {
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length, length2, 33);
                    }
                }
                iCopydefault = intRangeCopydefault.copydefault() + 1;
            }
            if (iCopydefault < string.length()) {
                spannableStringBuilder.append((java.lang.CharSequence) string, iCopydefault, string.length());
            }
            return spannableStringBuilder;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return charSequence == null ? "" : charSequence;
        }
    }
}
