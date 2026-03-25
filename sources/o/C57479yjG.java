package o;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57479yjG extends AppCompatTextView {
    public float AEQbTJ;
    public float AYXKKw;
    public java.lang.CharSequence AhwBna;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public float copydefault;
    public java.util.List<? extends java.lang.CharSequence> djBIcL;
    public int gEmmrt;
    public boolean isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57479yjG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57479yjG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.yjG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57479yjG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57479yjG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = yDY.AhwBna();
        this.AhwBna = " ";
        this.AYXKKw = 16.0f;
        this.copydefault = 28.0f;
        this.KWHzl = 1;
        this.gEmmrt = 80;
        this.AEQbTJ = 28.0f;
        copydefault(28.0f);
        KWHzl(16);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine(true);
        setMaxLines(this.KWHzl);
        setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.AEQbTJ), 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = getMeasuredWidth();
        }
        this.OLrzqt = ((size - getPaddingStart()) - getPaddingEnd()) - this.valueOf;
        AEQbTJ();
        android.text.TextPaint textPaint = new android.text.TextPaint(getPaint());
        textPaint.setTextSize(android.util.TypedValue.applyDimension(2, this.AEQbTJ, getContext().getResources().getDisplayMetrics()));
        java.lang.CharSequence charSequenceOLrzqt = OLrzqt();
        int height = 0;
        int iMin = java.lang.Math.min((int) textPaint.measureText(charSequenceOLrzqt, 0, charSequenceOLrzqt.length()), size - this.valueOf);
        if (this.KWHzl > 1) {
            if (getLayout() != null && getLayout().getLineCount() > 0) {
                height = (int) ((getLayout().getHeight() / getLayout().getLineCount()) - (getTextSize() * 1.3f));
            }
            this.EZpvd = height;
        }
        setMeasuredDimension(iMin, getMeasuredHeight() - this.EZpvd);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.save();
        canvas.translate(0.0f, (-this.EZpvd) / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    private final void AEQbTJ() {
        int lineCount;
        android.text.StaticLayout staticLayoutBuild;
        if (this.djBIcL.isEmpty() || this.OLrzqt <= 0) {
            copydefault(this.copydefault);
            KWHzl("");
            this.isConnected = false;
            return;
        }
        java.lang.CharSequence charSequenceOLrzqt = OLrzqt();
        if (charSequenceOLrzqt.length() == 0) {
            copydefault(this.copydefault);
            KWHzl("");
            this.isConnected = false;
            return;
        }
        android.text.TextPaint textPaint = new android.text.TextPaint(getPaint());
        float f = this.copydefault;
        this.AEQbTJ = f;
        this.isConnected = false;
        if (f >= this.AYXKKw) {
            while (true) {
                textPaint.setTextSize(android.util.TypedValue.applyDimension(2, this.AEQbTJ, getContext().getResources().getDisplayMetrics()));
                staticLayoutBuild = StaticLayout.Builder.obtain(charSequenceOLrzqt, 0, charSequenceOLrzqt.length(), textPaint, this.OLrzqt).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
                if (staticLayoutBuild.getLineCount() == 1) {
                    break;
                }
                float f2 = this.AEQbTJ;
                if (f2 <= this.AYXKKw) {
                    break;
                } else {
                    this.AEQbTJ = f2 - 2.0f;
                }
            }
            lineCount = staticLayoutBuild.getLineCount();
        } else {
            lineCount = -1;
        }
        if (lineCount > this.KWHzl && (!this.djBIcL.isEmpty())) {
            textPaint.setTextSize(android.util.TypedValue.applyDimension(2, this.AEQbTJ, getContext().getResources().getDisplayMetrics()));
            if (this.AEQbTJ <= this.AYXKKw && this.djBIcL.size() > 1) {
                this.isConnected = true;
                java.lang.CharSequence charSequenceEZpvd = EZpvd(textPaint);
                copydefault(this.AEQbTJ);
                KWHzl(charSequenceEZpvd);
                return;
            }
            java.lang.CharSequence charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceOLrzqt, textPaint, this.OLrzqt * this.KWHzl, TextUtils.TruncateAt.END);
            copydefault(this.AEQbTJ);
            Intrinsics.copydefault(charSequenceEllipsize);
            KWHzl(charSequenceEllipsize);
            return;
        }
        copydefault(this.AEQbTJ);
        KWHzl(charSequenceOLrzqt);
    }

    public final java.lang.CharSequence EZpvd(android.text.TextPaint textPaint) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.List<? extends java.lang.CharSequence> listGkJEwt = C55296xhK.AEQbTJ(this) ? CollectionsKt___CollectionsKt.gkJEwt(this.djBIcL) : this.djBIcL;
        float fMeasureText = this.OLrzqt - (listGkJEwt.size() > 1 ? textPaint.measureText(this.AhwBna.toString()) * (listGkJEwt.size() - 1) : 0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGkJEwt, 10));
        java.util.Iterator<T> it = listGkJEwt.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(textPaint.measureText(((java.lang.CharSequence) it.next()).toString())));
        }
        float fAccept = CollectionsKt___CollectionsKt.accept(arrayList);
        int i = 0;
        for (java.lang.Object obj : listGkJEwt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            if (i > 0 && this.AhwBna.length() > 0) {
                spannableStringBuilder.append(this.AhwBna);
            }
            float fFloatValue = ((java.lang.Number) arrayList.get(i)).floatValue();
            if (fAccept <= fMeasureText) {
                spannableStringBuilder.append(charSequence);
            } else {
                float fMax = java.lang.Math.max((fFloatValue / fAccept) * fMeasureText, C55298xhM.dpInt$default(this.gEmmrt, (android.content.Context) null, 1, (java.lang.Object) null));
                if (fFloatValue > fMax) {
                    spannableStringBuilder.append(android.text.TextUtils.ellipsize(charSequence, textPaint, fMax, TextUtils.TruncateAt.END));
                } else {
                    spannableStringBuilder.append(charSequence);
                }
            }
            i++;
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void setTexts$default(C57479yjG c57479yjG, java.util.List list, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charSequence = " ";
        }
        c57479yjG.setTexts(list, charSequence);
    }

    public final void setTexts(@NotNull java.util.List<? extends java.lang.CharSequence> list, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.djBIcL = list;
        this.AhwBna = charSequence;
        copydefault(this.copydefault);
        KWHzl(OLrzqt());
        requestLayout();
    }

    public final void copydefault(float f, float f2) {
        this.AYXKKw = f;
        this.copydefault = f2;
        requestLayout();
    }

    public final void setMinTextWidth(int i) {
        this.gEmmrt = i;
        requestLayout();
    }

    private final void KWHzl(java.lang.CharSequence charSequence) {
        if (Intrinsics.EZpvd(getText(), charSequence)) {
            return;
        }
        setText(charSequence);
    }

    private final void copydefault(float f) {
        if (getTextSize() == f) {
            return;
        }
        setTextSize(f);
    }

    private final void KWHzl(int i) {
        if (getGravity() != i) {
            setGravity(i);
        }
    }

    public final java.lang.CharSequence OLrzqt() {
        if (this.djBIcL.isEmpty()) {
            return "";
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i = 0;
        for (java.lang.Object obj : C55296xhK.AEQbTJ(this) ? CollectionsKt___CollectionsKt.gkJEwt(this.djBIcL) : this.djBIcL) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            if (i > 0 && this.AhwBna.length() > 0) {
                spannableStringBuilder.append(this.AhwBna);
            }
            spannableStringBuilder.append(charSequence);
            i++;
        }
        return spannableStringBuilder;
    }
}
