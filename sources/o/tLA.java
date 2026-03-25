package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tLA extends android.widget.LinearLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final android.graphics.Paint AEQbTJ;
    public final RectF EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.tLA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tLA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tLA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.AEQbTJ = paint;
        this.EZpvd = new RectF();
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        float f = 4;
        int i2 = (int) (context.getResources().getDisplayMetrics().density * f);
        int i3 = (int) (8 * context.getResources().getDisplayMetrics().density);
        int i4 = (int) (2 * context.getResources().getDisplayMetrics().density);
        setPadding(i2, i4, i3, i4);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        int i5 = (int) (24 * context.getResources().getDisplayMetrics().density);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
        layoutParams.setMarginEnd((int) (f * context.getResources().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.copydefault = imageView;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        textView.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.Dmq));
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        this.OLrzqt = textView;
        addView(imageView);
        addView(textView);
        paint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.ggKfIT));
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void setIcon(@androidx.annotation.DrawableRes int i) {
        this.copydefault.setImageResource(i);
    }

    public final void setIcon(android.graphics.drawable.Drawable drawable) {
        this.copydefault.setImageDrawable(drawable);
    }

    public final void setText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setText(str);
    }

    public final void setText(@androidx.annotation.StringRes int i) {
        this.OLrzqt.setText(i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.EZpvd.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        float f = 8 * getContext().getResources().getDisplayMetrics().density;
        canvas.drawRoundRect(this.EZpvd, f, f, this.AEQbTJ);
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.AEQbTJ.setColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.ggKfIT));
    }
}
