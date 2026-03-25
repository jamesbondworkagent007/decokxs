package o;

import android.view.ViewTreeObserver;
import com.robinhood.ticker.TickerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tAP extends TickerView {
    public float AEQbTJ;
    public android.view.ViewTreeObserver EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public final ViewTreeObserver.OnGlobalLayoutListener copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tAP(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:23) call: o.tAP.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ tAP(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tAP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 22.0f;
        this.OLrzqt = 10.0f;
        this.AEQbTJ = 1.0f;
        this.copydefault = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.tAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                tAP.KWHzl(this.KWHzl);
            }
        };
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.QfsBiF);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.KWHzl = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.QVAiDq, 22.0f);
        this.OLrzqt = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.djSkpj, 10.0f);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.aKErDB, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void KWHzl(tAP tap) {
        if (tap.getMeasuredWidth() <= 0 || tap.djBIcL() == null) {
            return;
        }
        android.graphics.Paint paint = tap.uzCIH;
        Intrinsics.checkNotNullExpressionValue(paint, "");
        java.lang.String strDjBIcL = tap.djBIcL();
        Intrinsics.checkNotNullExpressionValue(strDjBIcL, "");
        if (tap.KWHzl(paint, strDjBIcL) > tap.getMeasuredWidth()) {
            tap.KWHzl();
        }
    }

    @Override // com.robinhood.ticker.TickerView
    public void setText(java.lang.String str) {
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.EZpvd = viewTreeObserver;
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.copydefault);
            }
        }
        if (measuredWidth > 0 && str != null) {
            android.graphics.Paint paint = this.uzCIH;
            Intrinsics.checkNotNullExpressionValue(paint, "");
            if (KWHzl(paint, str) > measuredWidth) {
                KWHzl();
            }
        }
        super.setText(str);
    }

    private final void KWHzl() {
        java.lang.String strDjBIcL = djBIcL();
        android.text.TextPaint textPaint = new android.text.TextPaint(this.uzCIH);
        int measuredWidth = getMeasuredWidth();
        Intrinsics.copydefault((java.lang.Object) strDjBIcL);
        float f = measuredWidth;
        if (KWHzl(textPaint, strDjBIcL) > f) {
            do {
                float textSize = textPaint.getTextSize();
                float f2 = this.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                textPaint.setTextSize(textSize - C55298xhM.djBIcL(f2, r6));
                float textSize2 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                if (C55298xhM.AhwBna(textSize2, r5) - this.AEQbTJ <= this.OLrzqt) {
                    break;
                }
            } while (KWHzl(textPaint, strDjBIcL) > f);
        } else {
            while (true) {
                float textSize3 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                if (C55298xhM.AhwBna(textSize3, r5) >= this.KWHzl || KWHzl(OLrzqt(textPaint, this.AEQbTJ), strDjBIcL) >= f) {
                    break;
                }
                float textSize4 = textPaint.getTextSize();
                float f3 = this.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                textPaint.setTextSize(textSize4 + C55298xhM.djBIcL(f3, r6));
            }
        }
        if (valueOf() == textPaint.getTextSize()) {
            return;
        }
        setTextSize(textPaint.getTextSize());
        setText(strDjBIcL);
    }

    private final android.graphics.Paint OLrzqt(android.graphics.Paint paint, float f) {
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        float textSize = paint2.getTextSize();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint2.setTextSize(textSize + C55298xhM.djBIcL(f, r1));
        return paint2;
    }

    private final float KWHzl(android.graphics.Paint paint, java.lang.String str) {
        int length = str.length();
        float fMeasureText = 0.0f;
        for (int i = 0; i < length; i++) {
            fMeasureText += paint.measureText(java.lang.String.valueOf(str.charAt(i)));
        }
        return fMeasureText + getPaddingStart() + getPaddingEnd();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        android.view.ViewTreeObserver viewTreeObserver = this.EZpvd;
        if (viewTreeObserver != null) {
            EZpvd(viewTreeObserver, this.copydefault);
        }
        super.onDetachedFromWindow();
    }

    public final void EZpvd(android.view.ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
