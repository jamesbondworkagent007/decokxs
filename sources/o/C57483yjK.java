package o;

import android.text.StaticLayout;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57483yjK extends AppCompatTextView {
    public float AEQbTJ;
    public float AhwBna;
    public int EZpvd;
    public int KWHzl;
    public float OLrzqt;
    public int copydefault;
    public java.lang.CharSequence djBIcL;
    public java.lang.CharSequence valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57483yjK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57483yjK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(float f, float f2) {
        this.AhwBna = f;
        this.AEQbTJ = f2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.yjK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57483yjK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57483yjK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = "";
        this.djBIcL = "";
        this.AhwBna = 18.0f;
        this.AEQbTJ = 38.0f;
        this.copydefault = 1;
        this.OLrzqt = 38.0f;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.KWHzl);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        KWHzl(this.OLrzqt);
        OLrzqt(16);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine(true);
        setMaxLines(this.copydefault);
        setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.AEQbTJ), 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.EZpvd = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        AEQbTJ();
        android.text.TextPaint textPaint = new android.text.TextPaint(getPaint());
        textPaint.setTextSize(android.util.TypedValue.applyDimension(2, this.OLrzqt, getContext().getResources().getDisplayMetrics()));
        int height = 0;
        int iMeasureText = (int) textPaint.measureText(KWHzl(this.valueOf, this.djBIcL), 0, KWHzl(this.valueOf, this.djBIcL).length());
        if (this.copydefault > 1) {
            if (getLayout() != null && getLayout().getLineCount() > 0) {
                height = (int) ((getLayout().getHeight() / getLayout().getLineCount()) - (getTextSize() * 1.3f));
            }
            this.KWHzl = height;
        }
        setMeasuredDimension(iMeasureText, getMeasuredHeight() - this.KWHzl);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.save();
        canvas.translate(0.0f, (-this.KWHzl) / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    private final void AEQbTJ() {
        int lineCount;
        android.text.StaticLayout staticLayoutBuild;
        android.text.TextPaint textPaint = new android.text.TextPaint(getPaint());
        java.lang.CharSequence charSequenceKWHzl = KWHzl(this.valueOf, this.djBIcL);
        float f = this.AEQbTJ;
        this.OLrzqt = f;
        if (f >= this.AhwBna) {
            while (true) {
                textPaint.setTextSize(android.util.TypedValue.applyDimension(2, this.OLrzqt, getContext().getResources().getDisplayMetrics()));
                staticLayoutBuild = StaticLayout.Builder.obtain(charSequenceKWHzl, 0, charSequenceKWHzl.length(), textPaint, this.EZpvd).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
                if (staticLayoutBuild.getLineCount() == 1) {
                    break;
                }
                float f2 = this.OLrzqt;
                if (f2 <= this.AhwBna) {
                    break;
                } else {
                    this.OLrzqt = f2 - 4.0f;
                }
            }
            lineCount = staticLayoutBuild.getLineCount();
        } else {
            lineCount = -1;
        }
        if (lineCount > this.copydefault && this.valueOf.length() > 0) {
            textPaint.setTextSize(android.util.TypedValue.applyDimension(2, this.OLrzqt, getContext().getResources().getDisplayMetrics()));
            this.valueOf = android.text.TextUtils.ellipsize(this.valueOf, textPaint, (this.EZpvd * this.copydefault) - textPaint.measureText("… " + ((java.lang.Object) this.djBIcL)), TextUtils.TruncateAt.END);
        }
        KWHzl(this.OLrzqt);
        copydefault(KWHzl(this.valueOf, this.djBIcL));
    }

    public static /* synthetic */ void setNumberAndUnitText$default(C57483yjK c57483yjK, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c57483yjK.setNumberAndUnitText(charSequence, charSequence2, z);
    }

    public final void setNumberAndUnitText(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.valueOf = charSequence;
        this.djBIcL = z ? C57490yjR.AEQbTJ(charSequence2, 12) : charSequence2;
        KWHzl(this.AEQbTJ);
        copydefault(KWHzl(charSequence, charSequence2));
    }

    private final void copydefault(java.lang.CharSequence charSequence) {
        if (Intrinsics.EZpvd(getText(), charSequence)) {
            return;
        }
        setText(charSequence);
    }

    private final void KWHzl(float f) {
        if (getTextSize() == f) {
            return;
        }
        setTextSize(f);
    }

    private final void OLrzqt(int i) {
        if (getGravity() != i) {
            setGravity(i);
        }
    }

    public final java.lang.CharSequence KWHzl(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (C55296xhK.AEQbTJ(this)) {
            spannableStringBuilder.append(charSequence2);
            if (charSequence.length() > 0 && charSequence2.length() > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) " ").append(charSequence);
            } else {
                spannableStringBuilder.append(charSequence);
            }
        } else {
            spannableStringBuilder.append(charSequence);
            if (charSequence.length() > 0 && charSequence2.length() > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) " ").append(charSequence2);
            } else {
                spannableStringBuilder.append(charSequence2);
            }
        }
        return spannableStringBuilder;
    }
}
