package o;

import com.okinc.core.util.format.MatchPattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33574myy {

    /* JADX INFO: renamed from: o.myy$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MatchPattern.values().length];
            try {
                iArr[MatchPattern.FIRST_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MatchPattern.LAST_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchPattern.CONTAINS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public static /* synthetic */ java.lang.CharSequence setupSpanStyles$default(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i, MatchPattern matchPattern, boolean z, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 33;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            matchPattern = MatchPattern.FIRST_ONLY;
        }
        MatchPattern matchPattern2 = matchPattern;
        if ((i2 & 8) != 0) {
            z = false;
        }
        return OLrzqt(charSequence, strArr, i3, matchPattern2, z, function1);
    }

    public static final java.lang.CharSequence OLrzqt(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String[] strArr, int i, @NotNull MatchPattern matchPattern, boolean z, @NotNull Function1<? super java.util.List<java.lang.Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(matchPattern, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.text.Spannable spannableString = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(charSequence);
        if (!(strArr.length == 0)) {
            for (java.lang.String str : strArr) {
                int i2 = ActionBar.AEQbTJ[matchPattern.ordinal()];
                if (i2 == 1) {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, str, 0, z, 2, (java.lang.Object) null);
                    if (iIndexOf$default >= 0) {
                        int length = str.length();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        function1.invoke(arrayList);
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            spannableString.setSpan(it.next(), iIndexOf$default, length + iIndexOf$default, i);
                        }
                    }
                } else if (i2 == 2) {
                    int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(charSequence, str, 0, z, 2, (java.lang.Object) null);
                    if (iLastIndexOf$default >= 0) {
                        int length2 = str.length();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        function1.invoke(arrayList2);
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            spannableString.setSpan(it2.next(), iLastIndexOf$default, length2 + iLastIndexOf$default, i);
                        }
                    }
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default(charSequence, str, 0, z, 2, (java.lang.Object) null);
                    while (iIndexOf$default2 >= 0 && iIndexOf$default2 < charSequence.length()) {
                        int length3 = str.length() + iIndexOf$default2;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        function1.invoke(arrayList3);
                        java.util.Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            spannableString.setSpan(it3.next(), iIndexOf$default2, length3, i);
                        }
                        iIndexOf$default2 = StringsKt__StringsKt.OLrzqt(charSequence, str, length3, z);
                    }
                }
            }
        }
        return spannableString;
    }
}
