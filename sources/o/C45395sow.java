package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45395sow {

    /* JADX INFO: renamed from: o.sow$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ int KWHzl;

        public StateListAnimator(Function0<Unit> function0, int i, boolean z) {
            this.EZpvd = function0;
            this.KWHzl = i;
            this.AEQbTJ = z;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            view.invalidate();
            this.EZpvd.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.KWHzl);
            textPaint.setUnderlineText(this.AEQbTJ);
        }
    }

    public static final java.lang.CharSequence AEQbTJ(@NotNull java.lang.CharSequence charSequence, @NotNull android.widget.TextView textView, java.lang.String str, @androidx.annotation.ColorInt int i, boolean z, java.lang.Integer num, boolean z2, @NotNull Function0<Unit> function0) {
        android.text.style.StyleSpan styleSpan;
        java.lang.Object textAppearanceSpan;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        StateListAnimator stateListAnimator = new StateListAnimator(function0, i, z);
        if (num != null) {
            textAppearanceSpan = new android.text.style.TextAppearanceSpan(textView.getContext(), num.intValue());
        } else if (z2) {
            textAppearanceSpan = styleSpan;
            styleSpan = new android.text.style.StyleSpan(1);
        } else {
            textAppearanceSpan = styleSpan;
            styleSpan = new android.text.style.StyleSpan(0);
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        if (str != null) {
            return KWHzl(KWHzl(charSequence, str, stateListAnimator), str, textAppearanceSpan);
        }
        return AEQbTJ(AEQbTJ(charSequence, stateListAnimator), textAppearanceSpan);
    }

    public static final java.lang.CharSequence KWHzl(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(charSequence);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, str, 0, false, 6, (java.lang.Object) null);
        int length = str.length();
        if (iIndexOf$default != -1) {
            spannableStringBuilderValueOf.setSpan(obj, iIndexOf$default, length + iIndexOf$default, 17);
        }
        Intrinsics.copydefault(spannableStringBuilderValueOf);
        return spannableStringBuilderValueOf;
    }

    public static final java.lang.CharSequence AEQbTJ(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return KWHzl(charSequence, charSequence.toString(), obj);
    }

    public static final android.text.Spannable AEQbTJ(@NotNull android.text.Spannable spannable) {
        Intrinsics.checkNotNullParameter(spannable, "");
        if (spannable.length() == 0) {
            return new android.text.SpannableString("");
        }
        int length = spannable.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!java.lang.Character.isWhitespace(spannable.charAt(i))) {
                break;
            }
            i++;
        }
        int length2 = spannable.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (!java.lang.Character.isWhitespace(spannable.charAt(length2))) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        if (i == -1) {
            return new android.text.SpannableString("");
        }
        if (i > length2) {
            return new android.text.SpannableString("");
        }
        java.lang.CharSequence charSequenceSubSequence = spannable.subSequence(i, C56548yJl.valueOf(length2 + 1, spannable.length()));
        Intrinsics.copydefault(charSequenceSubSequence, "");
        return (android.text.Spannable) charSequenceSubSequence;
    }
}
