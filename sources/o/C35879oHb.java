package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35879oHb {
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

    public static final java.lang.CharSequence EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return AEQbTJ(charSequence, charSequence.toString(), obj);
    }

    /* JADX INFO: renamed from: o.oHb$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ Function0<Unit> copydefault;

        public ActionBar(Function0<Unit> function0, int i) {
            this.copydefault = function0;
            this.KWHzl = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            this.copydefault.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.KWHzl);
            textPaint.setUnderlineText(false);
        }
    }

    public static final java.lang.CharSequence AEQbTJ(@NotNull java.lang.CharSequence charSequence, @NotNull android.widget.TextView textView, java.lang.String str, @androidx.annotation.ColorInt int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ActionBar actionBar = new ActionBar(function0, i);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setHighlightColor(C33070mpX.copydefault(android.R.color.transparent));
        if (str != null) {
            return AEQbTJ(charSequence, str, actionBar);
        }
        return EZpvd(charSequence, actionBar);
    }
}
