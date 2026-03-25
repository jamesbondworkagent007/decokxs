package o;

import android.text.StaticLayout;
import android.text.TextUtils;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37732ozQ {
    public static final C37732ozQ copydefault = new C37732ozQ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.CharSequence OLrzqt(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return " ";
    }

    private C37732ozQ() {
    }

    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> OLrzqt(java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, str, 0, true, 2, (java.lang.Object) null);
        while (iIndexOf$default >= 0 && iIndexOf$default < charSequence.length()) {
            int length = str.length() + iIndexOf$default;
            arrayList.add(C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(length)));
            if (z) {
                break;
            }
            iIndexOf$default = StringsKt__StringsKt.OLrzqt(charSequence, str, length, true);
        }
        return arrayList;
    }

    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> KWHzl(java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            java.lang.String strReplace = new Regex("\\s").replace(charSequence, "");
            java.lang.String strReplace2 = new Regex("\\s").replace(str, "");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strReplace, strReplace2, 0, true, 2, (java.lang.Object) null);
            while (iIndexOf$default >= 0 && iIndexOf$default < charSequence.length()) {
                int length = strReplace2.length() + iIndexOf$default;
                arrayList.add(C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIndexOf$default), java.lang.Integer.valueOf(length)));
                if (z) {
                    break;
                }
                iIndexOf$default = StringsKt__StringsKt.OLrzqt((java.lang.CharSequence) strReplace, strReplace2, length, true);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (kotlin.Pair pair : arrayList) {
                int iIntValue = ((java.lang.Number) pair.component1()).intValue();
                int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
                char cCharAt = strReplace.charAt(iIntValue);
                char cCharAt2 = strReplace.charAt(iIntValue2 - 1);
                java.lang.String strSubstring = strReplace.substring(0, iIntValue + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                int iKWHzl = KWHzl(strSubstring, cCharAt);
                java.lang.String strSubstring2 = strReplace.substring(0, iIntValue2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                int iKWHzl2 = KWHzl(strSubstring2, cCharAt2);
                int iEZpvd = EZpvd(charSequence.toString(), cCharAt, iKWHzl);
                int iEZpvd2 = EZpvd(charSequence.toString(), cCharAt2, iKWHzl2);
                kotlin.Pair pairOLrzqt = (iEZpvd == -1 || iEZpvd2 == -1) ? null : C56390yDp.OLrzqt(java.lang.Integer.valueOf(iEZpvd), java.lang.Integer.valueOf(iEZpvd2 + 1));
                if (pairOLrzqt != null) {
                    arrayList2.add(pairOLrzqt);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
            pUU.KWHzl("SearchRecordTextHighlightUtil", "buildBufferIgnoreSpace failed:" + (message != null ? message : ""));
            objM7377constructorimpl = yDY.AhwBna();
        }
        return (java.util.List) objM7377constructorimpl;
    }

    public final int KWHzl(java.lang.String str, char c) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public final int EZpvd(java.lang.String str, char c, int i) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == c && (i2 = i2 + 1) == i) {
                return i3;
            }
        }
        return -1;
    }

    public static /* synthetic */ java.lang.CharSequence build$default(C37732ozQ c37732ozQ, java.lang.CharSequence charSequence, java.lang.String str, java.lang.Integer num, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        java.lang.Integer num2 = num;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c37732ozQ.AEQbTJ(charSequence, str, num2, z4, z2, z3);
    }

    public final java.lang.CharSequence AEQbTJ(java.lang.CharSequence charSequence, java.lang.String str, @androidx.annotation.ColorRes java.lang.Integer num, boolean z, boolean z2, boolean z3) {
        java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> listOLrzqt;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fkESqH);
        int iIntValue = num != null ? num.intValue() : C32113mPz.ActionBar.AxsJAY;
        if (z) {
            listOLrzqt = KWHzl(charSequence, str, z2);
        } else {
            listOLrzqt = OLrzqt(charSequence, str, z2);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            int iIntValue2 = ((java.lang.Number) pair.component1()).intValue();
            int iIntValue3 = ((java.lang.Number) pair.component2()).intValue();
            if (z3) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(iCopydefault), iIntValue2, iIntValue3, 33);
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), iIntValue2, iIntValue3, 33);
            } else {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(iIntValue)), iIntValue2, iIntValue3, 33);
            }
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final java.lang.Object EZpvd(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorRes java.lang.Integer num, boolean z, boolean z2, @NotNull Continuation<? super java.lang.CharSequence> continuation) {
        java.lang.String strReplace = new Regex("\\s").replace(str, new Function1() { // from class: o.ozN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37732ozQ.OLrzqt((MatchResult) obj);
            }
        });
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(strReplace, 0, strReplace.length(), textView.getPaint(), textView.getContext().getResources().getDisplayMetrics().widthPixels);
        PrecomputedTextCompat.Params textMetricsParams = TextViewCompat.getTextMetricsParams(textView);
        Intrinsics.checkNotNullExpressionValue(textMetricsParams, "");
        builderObtain.setBreakStrategy(textMetricsParams.getBreakStrategy());
        builderObtain.setMaxLines(TextViewCompat.getMaxLines(textView));
        builderObtain.setHyphenationFrequency(textMetricsParams.getHyphenationFrequency());
        android.text.TextDirectionHeuristic textDirection = textMetricsParams.getTextDirection();
        if (textDirection != null) {
            builderObtain.setTextDirection(textDirection);
        }
        builderObtain.setEllipsize(TextUtils.TruncateAt.END);
        android.text.StaticLayout staticLayoutBuild = builderObtain.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        java.lang.CharSequence text = staticLayoutBuild.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        return (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? text : (z || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) strReplace, (java.lang.CharSequence) str2, true)) ? (!z || C37288oqx.AEQbTJ(strReplace, str2)) ? AEQbTJ(text, str2, num, z, true, z2) : text : text;
    }
}
