package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7917asq extends AppCompatTextView {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7917asq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7917asq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:10) call: o.asq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C7917asq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7917asq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.text.Layout layout = getLayout();
        if (layout == null) {
            return super.onTouchEvent(motionEvent);
        }
        java.lang.CharSequence text = getText();
        android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
        if (spannable == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) ((motionEvent.getX() - getTotalPaddingLeft()) + getScrollX());
        int lineForVertical = layout.getLineForVertical((int) ((motionEvent.getY() - getTotalPaddingTop()) + getScrollY()));
        float lineLeft = layout.getLineLeft(lineForVertical);
        float lineRight = layout.getLineRight(lineForVertical);
        float f = x;
        if (f < lineLeft || f > lineRight) {
            return false;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
        Intrinsics.copydefault(clickableSpanArr);
        if (!(clickableSpanArr.length == 0)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
