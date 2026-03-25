package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17634fMp extends AppCompatTextView {
    public final int EZpvd;
    public final float KWHzl;
    public final float OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17634fMp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17634fMp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.fMp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C17634fMp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17634fMp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int iAEQbTJ = AEQbTJ(80.0f);
        this.EZpvd = iAEQbTJ;
        this.copydefault = 14.0f;
        this.OLrzqt = 10.0f;
        this.KWHzl = 1.0f;
        setMaxWidth(iAEQbTJ);
        setSingleLine(true);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        EZpvd();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        EZpvd();
    }

    public final void EZpvd() {
        java.lang.String string;
        boolean z;
        java.lang.CharSequence text = getText();
        if (text == null || (string = text.toString()) == null || string.length() == 0) {
            return;
        }
        int iMin = ((getWidth() > 0 ? java.lang.Math.min(getWidth(), this.EZpvd) : this.EZpvd) - getPaddingLeft()) - getPaddingRight();
        if (iMin <= 0) {
            return;
        }
        android.text.TextPaint textPaint = new android.text.TextPaint(getPaint());
        float f = this.copydefault;
        float f2 = f;
        while (true) {
            if (f2 < this.OLrzqt) {
                z = false;
                break;
            }
            textPaint.setTextSize(KWHzl(f2));
            if (textPaint.breakText(string, true, iMin, null) >= string.length()) {
                f = f2;
                z = true;
                break;
            }
            f2 -= this.KWHzl;
        }
        if (z) {
            setTextSize(2, f);
            setSingleLine(true);
            setMaxLines(1);
        } else {
            setTextSize(2, this.OLrzqt);
            setSingleLine(false);
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    private final int AEQbTJ(float f) {
        return yII.EZpvd(android.util.TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()));
    }

    public final float KWHzl(float f) {
        return android.util.TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }
}
