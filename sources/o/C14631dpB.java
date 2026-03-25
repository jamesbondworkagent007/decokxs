package o;

import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14631dpB {
    public static final C14631dpB copydefault = new C14631dpB();

    private C14631dpB() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dpB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.CharSequence createDisplayedText$default(C14631dpB c14631dpB, android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        return c14631dpB.copydefault(textView, charSequence, charSequence2, (java.util.List<? extends java.lang.Object>) list);
    }

    public final java.lang.CharSequence copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull final java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(list, "");
        int width = (textView.getWidth() - textView.getCompoundPaddingStart()) - textView.getCompoundPaddingEnd();
        if (width <= 0) {
            java.lang.CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            return text;
        }
        android.text.StaticLayout staticLayoutEZpvd = EZpvd(textView, textView.getMaxLines(), charSequence, width);
        if (Intrinsics.EZpvd(staticLayoutEZpvd.getText().toString(), charSequence)) {
            java.lang.String str = (java.lang.String) charSequence;
            java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(str.toString(), charSequence2.toString(), "", false, 4, (java.lang.Object) null)).toString();
            if (java.lang.Math.min(staticLayoutEZpvd.getLineCount(), textView.getMaxLines()) != java.lang.Math.min(EZpvd(textView, textView.getMaxLines(), string, width).getLineCount(), textView.getMaxLines())) {
                str = string + "\n" + ((java.lang.Object) charSequence2);
            }
            java.lang.String str2 = str;
            return list.isEmpty() ? str2 : C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.dpE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14631dpB.AEQbTJ(list, (java.util.List) obj);
                }
            }, 14, null);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString("… " + ((java.lang.Object) charSequence2));
        if (!list.isEmpty()) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, charSequence2.toString(), 0, false, 6, (java.lang.Object) null);
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                spannableString.setSpan(it.next(), iIndexOf$default, spannableString.length(), 17);
            }
        }
        Unit unit = Unit.INSTANCE;
        return AEQbTJ(textView, staticLayoutEZpvd, EZpvd(textView, 1, spannableString, width), charSequence);
    }

    public static final Unit AEQbTJ(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        list2.addAll(list);
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence AEQbTJ(android.widget.TextView textView, android.text.StaticLayout staticLayout, android.text.StaticLayout staticLayout2, java.lang.CharSequence charSequence) {
        java.lang.CharSequence text = staticLayout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(0, staticLayout.getLineCount()).iterator();
        int lineWidth = 0;
        while (it.hasNext()) {
            lineWidth += (int) staticLayout.getLineWidth(((AbstractC56415yEn) it).nextInt());
        }
        java.lang.CharSequence charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequence, textView.getPaint(), lineWidth - staticLayout2.getLineWidth(0), TextUtils.TruncateAt.END);
        Intrinsics.copydefault(charSequenceEllipsize);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequenceEllipsize, (char) 8230, 0, false, 6, (java.lang.Object) null);
        if (Intrinsics.EZpvd((java.lang.Object) charSequenceEllipsize, (java.lang.Object) "")) {
            java.lang.CharSequence text2 = staticLayout2.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "");
            return text2;
        }
        if (iIndexOf$default == -1) {
            return text;
        }
        android.text.SpannableStringBuilder spannableStringBuilderReplace = new android.text.SpannableStringBuilder().append(charSequenceEllipsize).replace(iIndexOf$default, iIndexOf$default + 1, staticLayout2.getText());
        Intrinsics.copydefault(spannableStringBuilderReplace);
        return copydefault(textView, staticLayout, staticLayout2, spannableStringBuilderReplace);
    }

    public final android.text.SpannableStringBuilder copydefault(android.widget.TextView textView, android.text.StaticLayout staticLayout, android.text.StaticLayout staticLayout2, android.text.SpannableStringBuilder spannableStringBuilder) {
        android.text.DynamicLayout dynamicLayout;
        int width = staticLayout.getWidth();
        if (Build.VERSION.SDK_INT >= 28) {
            dynamicLayout = DynamicLayout.Builder.obtain(spannableStringBuilder, textView.getPaint(), width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).build();
        } else {
            dynamicLayout = new android.text.DynamicLayout(spannableStringBuilder, spannableStringBuilder, textView.getPaint(), width, Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), false);
        }
        Intrinsics.copydefault(dynamicLayout);
        for (int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, staticLayout2.getText().toString(), 0, false, 6, (java.lang.Object) null) - 1; iIndexOf$default >= 0 && dynamicLayout.getLineCount() > textView.getMaxLines(); iIndexOf$default--) {
            spannableStringBuilder.delete(iIndexOf$default, iIndexOf$default + 1);
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ android.text.StaticLayout getStaticLayout$default(C14631dpB c14631dpB, android.widget.TextView textView, int i, java.lang.CharSequence charSequence, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = textView.getMaxLines();
        }
        return c14631dpB.EZpvd(textView, i, charSequence, i2);
    }

    public final android.text.StaticLayout EZpvd(android.widget.TextView textView, int i, java.lang.CharSequence charSequence, int i2) {
        int iCopydefault = C56548yJl.copydefault(i2, 0);
        android.text.StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textView.getPaint(), iCopydefault).setIncludePad(false).setMaxLines(i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        return staticLayoutBuild;
    }
}
