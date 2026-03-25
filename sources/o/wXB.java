package o;

import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXB extends wXG {
    public RelativeLayout.LayoutParams AEQbTJ;
    public android.graphics.Paint EZpvd;
    public android.graphics.Paint copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXG
    public android.graphics.Paint KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXG
    public android.graphics.Paint copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXG
    public void setBackgroundPaint$OKUILib_uilib(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "");
        this.copydefault = paint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXG
    public void setTextPaint$OKUILib_uilib(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "");
        this.EZpvd = paint;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:146) call: o.wXB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wXB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.hKJZrr));
        paint.setAntiAlias(true);
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.v));
        paint2.setTextSize(C55298xhM.gEmmrt(12.0f, context));
        paint2.setAntiAlias(true);
        this.EZpvd = paint2;
    }

    @Override // o.wXG, o.InterfaceC52777wXz
    public RelativeLayout.LayoutParams OLrzqt() {
        if (this.AEQbTJ == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(21);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.topMargin = C55298xhM.OLrzqt(12, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.setMarginEnd(C55298xhM.OLrzqt(16, context2));
            this.AEQbTJ = layoutParams;
        }
        return this.AEQbTJ;
    }
}
