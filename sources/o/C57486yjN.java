package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57486yjN extends android.widget.FrameLayout {
    public int AEQbTJ;
    public final int EZpvd;
    public android.widget.TextView KWHzl;
    public final int OLrzqt;
    public android.widget.TextView copydefault;
    public int djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrontText(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.KWHzl = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRearText(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.copydefault = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57486yjN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C57406yhn.TaskDescription.fetchVPNInfo, this);
        this.OLrzqt = C55298xhM.copydefault(3.0f, context);
        this.EZpvd = C55298xhM.copydefault(2.0f, context);
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.copydefault;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean OLrzqt() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setFrontText((android.widget.TextView) findViewById(C57406yhn.StateListAnimator.QCjLjM));
        setRearText((android.widget.TextView) findViewById(C57406yhn.StateListAnimator.OxVOHk));
        EZpvd().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        EZpvd().setHighlightColor(0);
    }

    public final void setTextAndClickCallback(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, java.lang.Integer num, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        android.widget.TextView textViewEZpvd = EZpvd();
        textViewEZpvd.setText(charSequence);
        textViewEZpvd.setTextColor(C33070mpX.copydefault(num != null ? num.intValue() : C52761wXj.Activity.GzAsTt));
        android.widget.TextView textViewKWHzl = KWHzl();
        if (charSequence2.length() == 0) {
            textViewKWHzl.setVisibility(8);
            return;
        }
        textViewKWHzl.setVisibility(0);
        textViewKWHzl.setText(KWHzl(charSequence2, C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        textViewKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.yjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C57486yjN.setTextAndClickCallback$lambda$2$lambda$1(function0, view);
            }
        });
    }

    public static final void setTextAndClickCallback$lambda$2$lambda$1(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.text.Layout layout = EZpvd().getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount() - 1;
        float lineWidth = layout.getLineWidth(lineCount);
        if (getPaddingStart() + lineWidth + this.OLrzqt + KWHzl().getMeasuredWidth() + getPaddingEnd() <= getMeasuredWidth()) {
            this.AEQbTJ = (int) (getPaddingStart() + lineWidth + this.OLrzqt);
            if (OLrzqt()) {
                this.AEQbTJ = (C33570myu.AEQbTJ() - this.AEQbTJ) - C55298xhM.dp2px$default(24.0f, null, 1, null);
            }
            int lineTop = ((layout.getLineTop(lineCount) + layout.getLineBottom(lineCount)) - KWHzl().getMeasuredHeight()) / 2;
            this.djBIcL = getPaddingTop() + lineTop;
            int measuredHeight = (lineTop + KWHzl().getMeasuredHeight()) - EZpvd().getMeasuredHeight();
            if (measuredHeight > 0) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + measuredHeight);
                return;
            }
            return;
        }
        this.AEQbTJ = getPaddingStart();
        this.djBIcL = getPaddingTop() + EZpvd().getMeasuredHeight() + this.EZpvd;
        int measuredWidth = getMeasuredWidth();
        int paddingTop = getPaddingTop();
        int measuredHeight2 = EZpvd().getMeasuredHeight();
        setMeasuredDimension(measuredWidth, paddingTop + measuredHeight2 + this.EZpvd + KWHzl().getMeasuredHeight() + getPaddingBottom());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (KWHzl().getVisibility() == 0) {
            if (OLrzqt()) {
                android.widget.TextView textViewKWHzl = KWHzl();
                int i5 = this.AEQbTJ;
                int measuredWidth = KWHzl().getMeasuredWidth();
                int i6 = this.djBIcL;
                textViewKWHzl.layout(i5 - measuredWidth, i6, this.AEQbTJ, KWHzl().getMeasuredHeight() + i6);
                return;
            }
            android.widget.TextView textViewKWHzl2 = KWHzl();
            int i7 = this.AEQbTJ;
            textViewKWHzl2.layout(i7, this.djBIcL, KWHzl().getMeasuredWidth() + i7, this.djBIcL + KWHzl().getMeasuredHeight());
        }
    }

    public final java.lang.CharSequence KWHzl(java.lang.CharSequence charSequence, int i) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), 0, charSequence.length(), 33);
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, charSequence.length(), 33);
        return spannableStringBuilder;
    }
}
