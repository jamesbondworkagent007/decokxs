package o;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import com.robinhood.ticker.TickerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25955jMo extends TickerView {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Function0<java.lang.Float> EZpvd;
    public Function0<java.lang.Float> OLrzqt;
    public Animator.AnimatorListener copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25955jMo(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:18) call: o.jMo.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C25955jMo(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25955jMo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: o.jMo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jMo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void OLrzqt(@NotNull Function0<java.lang.Float> function0, @NotNull Function0<java.lang.Float> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.EZpvd = function0;
        this.OLrzqt = function02;
        setCharacterLists(C57862yqS.copydefault());
        setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.EZpvd));
    }

    public static /* synthetic */ void setTickerText$default(C25955jMo c25955jMo, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        c25955jMo.setTickerText(str, z, z2);
    }

    public final void setTickerText(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(this.copydefault);
        this.copydefault = null;
        setText(str, z);
        if (z2) {
            if (z) {
                ActionBar actionBar = new ActionBar();
                this.copydefault = actionBar;
                copydefault(actionBar);
                return;
            }
            KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.jMo$ActionBar */
    public static final class ActionBar extends android.animation.AnimatorListenerAdapter {
        public ActionBar() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            C25955jMo c25955jMo = C25955jMo.this;
            c25955jMo.EZpvd(c25955jMo.copydefault);
            C25955jMo.this.copydefault = null;
            C25955jMo.this.KWHzl();
        }
    }

    public final boolean KWHzl() {
        return post(new java.lang.Runnable() { // from class: o.jMq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25955jMo.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(C25955jMo c25955jMo) {
        java.lang.String strDjBIcL = c25955jMo.djBIcL();
        android.text.TextPaint textPaint = new android.text.TextPaint(c25955jMo.uzCIH);
        Function0<java.lang.Float> function0 = c25955jMo.EZpvd;
        float fFloatValue = function0 != null ? function0.invoke().floatValue() : 0.0f;
        Intrinsics.copydefault((java.lang.Object) strDjBIcL);
        if (c25955jMo.KWHzl(textPaint, strDjBIcL) > fFloatValue) {
            do {
                float textSize = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(c25955jMo.getContext(), "");
                textPaint.setTextSize(textSize - C55298xhM.djBIcL(1.0f, r6));
                float textSize2 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(c25955jMo.getContext(), "");
                if (C55298xhM.AhwBna(textSize2, r6) - 1.0f <= 8.0f) {
                    break;
                }
            } while (c25955jMo.KWHzl(textPaint, strDjBIcL) > fFloatValue);
        } else {
            while (true) {
                float textSize3 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(c25955jMo.getContext(), "");
                if (C55298xhM.AhwBna(textSize3, r6) >= 32.0f || c25955jMo.KWHzl(c25955jMo.copydefault(textPaint, 1.0f), strDjBIcL) >= fFloatValue) {
                    break;
                }
                float textSize4 = textPaint.getTextSize();
                Intrinsics.checkNotNullExpressionValue(c25955jMo.getContext(), "");
                textPaint.setTextSize(textSize4 + C55298xhM.djBIcL(1.0f, r6));
            }
        }
        if (c25955jMo.valueOf() == textPaint.getTextSize()) {
            return;
        }
        c25955jMo.setTextSize(textPaint.getTextSize());
        c25955jMo.setText("", false);
        c25955jMo.setText(strDjBIcL, false);
    }

    private final android.graphics.Paint copydefault(android.graphics.Paint paint, float f) {
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        float textSize = paint2.getTextSize();
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint2.setTextSize(textSize + C55298xhM.djBIcL(f, r1));
        return paint2;
    }

    public final float KWHzl(android.graphics.Paint paint, java.lang.String str) {
        Function0<java.lang.Float> function0;
        float fMeasureText = paint.measureText(str);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return fMeasureText + (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0) + (getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) r0) : 0) + ((getVisibility() != 0 || (function0 = this.OLrzqt) == null) ? 0.0f : function0.invoke().floatValue());
    }
}
