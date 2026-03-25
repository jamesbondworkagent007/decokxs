package o;

import androidx.core.content.res.ResourcesCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49965uyW {
    public static final C49965uyW EZpvd = new C49965uyW();

    private C49965uyW() {
    }

    public final android.text.SpannableStringBuilder copydefault(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.lang.String str, @NotNull android.content.Context context, int i, java.lang.Integer num, boolean z, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(str);
        final int i2 = 0;
        for (java.lang.Object obj : arrayList) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str2 = (java.lang.String) obj;
            int i3 = 0;
            for (java.lang.Object obj2 : EZpvd.OLrzqt(str2, str)) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                EZpvd.EZpvd(spannableStringBuilderValueOf, ((java.lang.Number) obj2).intValue(), str2, i, num, context, z, new Function0() { // from class: o.uyU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C49965uyW.AEQbTJ(function1, i2);
                    }
                });
                i3++;
                str2 = str2;
            }
            i2++;
        }
        return spannableStringBuilderValueOf;
    }

    public static final Unit AEQbTJ(Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final android.text.SpannableStringBuilder OLrzqt(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.lang.String str, @NotNull final android.content.Context context, int i, final int i2, boolean z, @NotNull java.lang.String str2, final int i3, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        java.lang.CharSequence charSequence;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(str);
        if (spannableStringBuilderValueOf != null && (charSequence = C33061mpO.setupSpanStyles$default(spannableStringBuilderValueOf, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.uyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49965uyW.OLrzqt(context, i2, (java.util.List) obj);
            }
        }, 14, null)) != null) {
            C33061mpO.setupSpanStyles$default(charSequence, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.uyX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49965uyW.AEQbTJ(context, i3, (java.util.List) obj);
                }
            }, 14, null);
        }
        final int i4 = 0;
        for (java.lang.Object obj : arrayList) {
            if (i4 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str3 = (java.lang.String) obj;
            int i5 = 0;
            for (java.lang.Object obj2 : EZpvd.OLrzqt(str3, str)) {
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                EZpvd.EZpvd(spannableStringBuilderValueOf, ((java.lang.Number) obj2).intValue(), str3, i, java.lang.Integer.valueOf(i2), context, z, new Function0() { // from class: o.uzb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C49965uyW.KWHzl(function1, i4);
                    }
                });
                i5++;
            }
            i4++;
        }
        return spannableStringBuilderValueOf;
    }

    public static final Unit OLrzqt(android.content.Context context, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(context.getColor(i)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.content.Context context, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(context.getColor(i)));
        list.add(new android.text.style.StyleSpan(1));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, int i, java.lang.String str, int i2, android.content.Context context) {
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(context, i2), i, str.length() + i, 18);
        }
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, int i, java.lang.String str, int i2, java.lang.Integer num, android.content.Context context, boolean z, Function0<Unit> function0) {
        C50024uzc c50024uzc = new C50024uzc(num, context, z, function0);
        EZpvd(spannableStringBuilder, i, str, i2, context);
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(c50024uzc, i, C33129mqd.AhwBna(C33129mqd.addS$default(java.lang.Integer.valueOf(i), str != null ? java.lang.Integer.valueOf(str.length()) : null, null, null, null, 14, null)), 18);
        }
    }

    public final java.util.ArrayList<java.lang.Integer> OLrzqt(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int i = 0;
        while (true) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, str, i, false, 4, (java.lang.Object) null);
            if (-1 == iIndexOf$default) {
                return arrayList;
            }
            arrayList.add(java.lang.Integer.valueOf(iIndexOf$default));
            i = iIndexOf$default + 1;
        }
    }

    public static /* synthetic */ java.lang.CharSequence styleTradeTab$default(C49965uyW c49965uyW, java.lang.String str, int i, android.content.Context context, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        return c49965uyW.OLrzqt(str, i, context);
    }

    public final java.lang.CharSequence OLrzqt(java.lang.String str, int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final android.graphics.Typeface font = ResourcesCompat.getFont(context, i);
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        java.lang.String[] strArr = new java.lang.String[1];
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        return C33061mpO.setupSpanStyles$default(strValueOf, strArr, 0, null, false, new Function1() { // from class: o.uza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49965uyW.AEQbTJ(font, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit AEQbTJ(android.graphics.Typeface typeface, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (typeface != null) {
            list.add(new C49954uyL(typeface));
        }
        return Unit.INSTANCE;
    }

    public final android.text.SpannableString copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, str2, 0, false, 6, (java.lang.Object) null);
        int length = str2.length();
        if (iIndexOf$default >= 0) {
            spannableString.setSpan(new ActionBar(function0, i), iIndexOf$default, length + iIndexOf$default, 0);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: o.uyW$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ int copydefault;

        public ActionBar(Function0<Unit> function0, int i) {
            this.KWHzl = function0;
            this.copydefault = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.copydefault);
            textPaint.setUnderlineText(true);
        }
    }
}
