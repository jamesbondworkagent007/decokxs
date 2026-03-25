package o;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55070xcx extends AppCompatTextView {
    public android.graphics.drawable.Drawable EZpvd;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55070xcx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55070xcx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.xcx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55070xcx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55070xcx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setEndDrawable(android.graphics.drawable.Drawable drawable) {
        this.EZpvd = drawable;
        requestLayout();
    }

    public final void setTextWidth(float f) {
        this.copydefault = (int) f;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.drawable.Drawable drawable = this.EZpvd;
        if (drawable == null || getLayout() == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int iMeasureText = this.copydefault;
        if (iMeasureText == 0) {
            iMeasureText = (int) getPaint().measureText(getText().toString());
        }
        if (intrinsicWidth + iMeasureText > getMeasuredWidth()) {
            if (iMeasureText > getMeasuredWidth()) {
                setMaxLines(1);
                setEllipsize(TextUtils.TruncateAt.END);
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + drawable.getIntrinsicHeight() + C55298xhM.OLrzqt(4, context));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        int maxWidth = getMaxWidth() > 0 ? getMaxWidth() : getMeasuredWidth();
        if (getWidth() != maxWidth) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = maxWidth;
                setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        android.graphics.drawable.Drawable drawable = this.EZpvd;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int iMeasureText = this.copydefault;
            if (iMeasureText == 0) {
                iMeasureText = (int) getPaint().measureText(getText().toString());
            }
            int i = iMeasureText + intrinsicWidth;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            boolean zOLrzqt = C55296xhK.OLrzqt(context);
            if (i <= maxWidth) {
                int measuredHeight = (getMeasuredHeight() / 2) - (drawable.getIntrinsicHeight() / 2);
                if (zOLrzqt) {
                    int width = getWidth();
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    int iOLrzqt = C55298xhM.OLrzqt(6, context2);
                    int width2 = getWidth();
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    drawable.setBounds(width - ((iOLrzqt + iMeasureText) + intrinsicWidth), measuredHeight, width2 - (iMeasureText + C55298xhM.OLrzqt(6, context3)), drawable.getIntrinsicHeight() + measuredHeight);
                } else {
                    android.content.Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    int iOLrzqt2 = C55298xhM.OLrzqt(6, context4);
                    android.content.Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    drawable.setBounds(iMeasureText + iOLrzqt2, measuredHeight, i + C55298xhM.OLrzqt(6, context5), drawable.getIntrinsicHeight() + measuredHeight);
                }
            } else {
                int measuredHeight2 = getMeasuredHeight() - drawable.getIntrinsicHeight();
                if (zOLrzqt) {
                    drawable.setBounds((getWidth() - intrinsicWidth) - getPaddingStart(), measuredHeight2, getWidth(), drawable.getIntrinsicHeight() + measuredHeight2);
                } else {
                    drawable.setBounds(getPaddingStart(), measuredHeight2, intrinsicWidth + getPaddingStart(), drawable.getIntrinsicHeight() + measuredHeight2);
                }
            }
            drawable.draw(canvas);
        }
    }
}
