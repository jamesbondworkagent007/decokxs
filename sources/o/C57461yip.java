package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57461yip extends C55033xcM {
    public final C57487yjO KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57461yip(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.yip.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C57461yip(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57461yip(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.KWHzl = new C57487yjO(context2);
        if (getMinHeight() == -1) {
            setMinHeight(C55298xhM.OLrzqt(80, context));
        }
    }

    public final void setAmountAndSymbol(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2) {
        android.text.SpannedString spannedString;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if (C55296xhK.AEQbTJ(this)) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append(charSequence2);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.setSpan(this.KWHzl, charSequence2.length(), charSequence2.length() + 1, 33);
            spannedString = new android.text.SpannedString(spannableStringBuilder);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            spannableStringBuilder2.append(charSequence);
            spannableStringBuilder2.append((java.lang.CharSequence) " ");
            spannableStringBuilder2.append(charSequence2);
            spannableStringBuilder2.setSpan(this.KWHzl, charSequence.length(), charSequence.length() + 1, 33);
            spannedString = new android.text.SpannedString(spannableStringBuilder2);
        }
        setTextByAnimation(spannedString);
        this.KWHzl.OLrzqt();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.KWHzl.KWHzl(this);
        this.KWHzl.OLrzqt();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.KWHzl.KWHzl(null);
        this.KWHzl.EZpvd();
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        super.invalidateDrawable(drawable);
        invalidate();
    }
}
