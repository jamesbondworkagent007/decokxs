package o;

import androidx.core.content.res.ResourcesCompat;
import com.okinc.planet.widget.OrbitTypefaceSpanUnder28;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUO {
    public static /* synthetic */ void addHighLightTv$default(android.widget.TextView textView, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        copydefault(textView, str, str2, z);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        textView.setText(EZpvd(str, str2, z));
    }

    public static /* synthetic */ java.lang.CharSequence generateHighLight$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return EZpvd(str, str2, z);
    }

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return str;
        }
        java.lang.String strCopydefault = C6798aWF.copydefault(str);
        if (z) {
            strCopydefault = "(" + strCopydefault + ")";
        }
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strCopydefault.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.util.List<kotlin.Pair> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) KWHzl(lowerCase, lowerCase2));
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) " ", false, 2, (java.lang.Object) null)) {
            java.lang.String strReplace$default = C59449zhJ.replace$default(str2, " ", "", false, 4, (java.lang.Object) null);
            if (strReplace$default.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) strReplace$default, (java.lang.Object) str2)) {
                java.util.Locale locale3 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                java.lang.String lowerCase3 = strCopydefault.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                java.util.Locale locale4 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale4, "");
                java.lang.String lowerCase4 = strReplace$default.toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                listFJNWhG.addAll(KWHzl(lowerCase3, lowerCase4));
            }
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        try {
            for (kotlin.Pair pair : listFJNWhG) {
                if (((java.lang.Number) pair.getFirst()).intValue() + ((java.lang.Number) pair.getSecond()).intValue() <= strCopydefault.length()) {
                    if (C33492mxV.OLrzqt()) {
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dSJNDS)), ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getFirst()).intValue() + ((java.lang.Number) pair.getSecond()).intValue(), 33);
                    }
                    spannableString.setSpan(new android.text.style.BackgroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iRxXKY)), ((java.lang.Number) pair.getFirst()).intValue(), ((java.lang.Number) pair.getFirst()).intValue() + ((java.lang.Number) pair.getSecond()).intValue(), 33);
                }
            }
            if (!z) {
                android.graphics.Typeface font = ResourcesCompat.getFont(C43246rlf.OLrzqt.valueOf().getApplicationContext(), C52761wXj.Dialog.copydefault);
                Intrinsics.copydefault(font);
                spannableString.setSpan(new OrbitTypefaceSpanUnder28(font), 0, strCopydefault.length(), 33);
            }
        } catch (java.lang.Exception unused) {
        }
        return spannableString;
    }

    public static final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = 0;
        while (StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, length, false, 4, (java.lang.Object) null) != -1) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, length, false, 4, (java.lang.Object) null);
            arrayList.add(C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(str2.length())));
            length = iIndexOf$default + str2.length();
        }
        return arrayList;
    }
}
