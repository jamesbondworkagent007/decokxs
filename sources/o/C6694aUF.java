package o;

import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6694aUF {
    public static final java.lang.CharSequence AEQbTJ(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str, @NotNull java.lang.Object obj) {
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
        return AEQbTJ(charSequence, charSequence.toString(), obj);
    }

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull android.widget.TextView textView, @androidx.annotation.ColorInt int i, boolean z, java.lang.Integer num, boolean z2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return copydefault(charSequence, textView, null, i, z, num, z2, function0);
    }

    /* JADX INFO: renamed from: o.aUF$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;

        public StateListAnimator(Function0<Unit> function0, int i, boolean z) {
            this.copydefault = function0;
            this.AEQbTJ = i;
            this.OLrzqt = z;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            view.invalidate();
            this.copydefault.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.AEQbTJ);
            textPaint.setUnderlineText(this.OLrzqt);
        }
    }

    public static final java.lang.CharSequence copydefault(@NotNull java.lang.CharSequence charSequence, @NotNull android.widget.TextView textView, java.lang.String str, @androidx.annotation.ColorInt int i, boolean z, java.lang.Integer num, boolean z2, @NotNull Function0<Unit> function0) {
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
            return AEQbTJ(AEQbTJ(charSequence, str, stateListAnimator), str, textAppearanceSpan);
        }
        return AEQbTJ(AEQbTJ(charSequence, stateListAnimator), textAppearanceSpan);
    }

    /* JADX INFO: renamed from: o.aUF$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;

        public TaskDescription(Function0<Unit> function0, int i, boolean z) {
            this.copydefault = function0;
            this.OLrzqt = i;
            this.EZpvd = z;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            view.invalidate();
            this.copydefault.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.OLrzqt);
            textPaint.setUnderlineText(this.EZpvd);
        }
    }

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull android.widget.TextView textView, java.lang.String str, @androidx.annotation.ColorInt int i, boolean z, java.lang.Integer num, boolean z2, @NotNull Function0<Unit> function0) {
        android.text.style.StyleSpan styleSpan;
        java.lang.Object textAppearanceSpan;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        TaskDescription taskDescription = new TaskDescription(function0, i, z);
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
            return AEQbTJ(AEQbTJ(charSequence, str, textAppearanceSpan), str, taskDescription);
        }
        return AEQbTJ(AEQbTJ(charSequence, textAppearanceSpan), taskDescription);
    }

    public static /* synthetic */ java.lang.CharSequence withIcon$default(java.lang.CharSequence charSequence, android.widget.TextView textView, android.graphics.drawable.Drawable drawable, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return KWHzl(charSequence, textView, drawable, function0);
    }

    public static final java.lang.CharSequence KWHzl(@NotNull java.lang.CharSequence charSequence, @NotNull android.widget.TextView textView, @NotNull android.graphics.drawable.Drawable drawable, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(16, context);
        drawable.setBounds(0, 0, iOLrzqt, iOLrzqt);
        drawable.setTint(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DeEinT));
        java.lang.String str = ((java.lang.Object) charSequence) + " [image]";
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, "[image]", 0, false, 6, (java.lang.Object) null);
        int i = iIndexOf$default + 7;
        if (iIndexOf$default != -1) {
            spannableStringBuilderValueOf.setSpan(new android.text.style.ImageSpan(drawable), iIndexOf$default, i, 33);
            spannableStringBuilderValueOf.setSpan(new ActionBar(function0), iIndexOf$default, i, 33);
            textView.setHighlightColor(0);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        Intrinsics.copydefault(spannableStringBuilderValueOf);
        return spannableStringBuilderValueOf;
    }

    /* JADX INFO: renamed from: o.aUF$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        public ActionBar(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function0<Unit> function0 = this.OLrzqt;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
