package o;

import android.graphics.Paint;
import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57456yik extends AppCompatTextView {
    public final java.lang.String AEQbTJ;
    public StateListAnimator AYXKKw;
    public int AhwBna;
    public final java.lang.String AkhnZx;
    public boolean DbNXlk;
    public java.lang.String EZpvd;
    public android.text.DynamicLayout KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;
    public int djBIcL;
    public java.lang.String gEmmrt;
    public int isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.yik$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public interface StateListAnimator {
        void EZpvd(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57456yik(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractString(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpandOrContractClickListener(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AYXKKw = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpandString(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpandTextColor(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitLines(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.yik.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C57456yik(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57456yik(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = " ";
        java.lang.String str = "&";
        this.AEQbTJ = str;
        this.isConnected = 2;
        this.OLrzqt = "";
        this.gEmmrt = C33070mpX.AYXKKw(C57406yhn.ActionBar.EZpvd);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C57406yhn.ActionBar.AEQbTJ);
        this.EZpvd = strAYXKKw;
        this.valueOf = "  " + strAYXKKw;
        this.values = str + "  " + this.gEmmrt;
        this.djBIcL = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        setMovementMethod(new android.text.method.LinkMovementMethod());
        getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public final android.text.SpannableStringBuilder EZpvd(java.lang.String str) {
        this.OLrzqt = str;
        android.text.DynamicLayout dynamicLayout = new android.text.DynamicLayout(str, getPaint(), getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.2f, 0.0f, true);
        this.KWHzl = dynamicLayout;
        Intrinsics.copydefault(dynamicLayout);
        int lineCount = dynamicLayout.getLineCount();
        this.AhwBna = lineCount;
        if (lineCount <= this.isConnected) {
            return KWHzl(false);
        }
        return KWHzl(true);
    }

    public final void setContent(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        this.OLrzqt = str;
        this.DbNXlk = z;
        if (getWidth() <= 0) {
            post(new java.lang.Runnable() { // from class: o.yig
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57456yik.AEQbTJ(this.copydefault);
                }
            });
        } else {
            EZpvd(this.OLrzqt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(C57456yik c57456yik) {
        c57456yik.EZpvd(c57456yik.OLrzqt);
    }

    public final android.text.SpannableStringBuilder KWHzl(boolean z) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i = this.DbNXlk ? this.AhwBna : this.isConnected;
        this.copydefault = i;
        if (z) {
            int i2 = 0;
            if (i < this.AhwBna) {
                int i3 = i - 1;
                android.text.DynamicLayout dynamicLayout = this.KWHzl;
                Intrinsics.copydefault(dynamicLayout);
                int lineStart = dynamicLayout.getLineStart(i3);
                android.text.DynamicLayout dynamicLayout2 = this.KWHzl;
                Intrinsics.copydefault(dynamicLayout2);
                int lineEnd = dynamicLayout2.getLineEnd(i3);
                android.text.DynamicLayout dynamicLayout3 = this.KWHzl;
                Intrinsics.copydefault(dynamicLayout3);
                float lineWidth = dynamicLayout3.getLineWidth(i3);
                java.lang.String str = this.values;
                java.lang.String strSubstring = this.OLrzqt.substring(0, copydefault(str, lineEnd, lineStart, lineWidth, getPaint().measureText(str), 0.0f));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                if (C59449zhJ.endsWith$default(strSubstring, "\n", false, 2, null)) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                }
                spannableStringBuilder.append((java.lang.CharSequence) strSubstring);
                float lineWidth2 = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    android.text.DynamicLayout dynamicLayout4 = this.KWHzl;
                    Intrinsics.copydefault(dynamicLayout4);
                    lineWidth2 += dynamicLayout4.getLineWidth(i4);
                }
                float fMeasureText = ((lineWidth2 / i3) - lineWidth) - getPaint().measureText(str);
                if (fMeasureText > 0.0f) {
                    int i5 = 0;
                    while (i5 * getPaint().measureText(this.AkhnZx) < fMeasureText) {
                        i5++;
                    }
                    while (i2 < i5 - 1) {
                        spannableStringBuilder.append((java.lang.CharSequence) this.AkhnZx);
                        i2++;
                    }
                }
                spannableStringBuilder.append((java.lang.CharSequence) str);
                spannableStringBuilder.setSpan(new ActionBar(), spannableStringBuilder.length() - this.gEmmrt.length(), spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder.append((java.lang.CharSequence) this.OLrzqt);
                java.lang.String str2 = this.valueOf;
                android.text.DynamicLayout dynamicLayout5 = this.KWHzl;
                Intrinsics.copydefault(dynamicLayout5);
                int lineCount = dynamicLayout5.getLineCount() - 1;
                android.text.DynamicLayout dynamicLayout6 = this.KWHzl;
                Intrinsics.copydefault(dynamicLayout6);
                float lineWidth3 = dynamicLayout6.getLineWidth(lineCount);
                float lineWidth4 = 0.0f;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    android.text.DynamicLayout dynamicLayout7 = this.KWHzl;
                    Intrinsics.copydefault(dynamicLayout7);
                    lineWidth4 += dynamicLayout7.getLineWidth(i6);
                }
                float fMeasureText2 = ((lineWidth4 / lineCount) - lineWidth3) - getPaint().measureText(str2);
                if (fMeasureText2 < 0.0f) {
                    spannableStringBuilder.append((java.lang.CharSequence) "\n");
                    fMeasureText2 = getWidth() - getPaint().measureText(str2);
                }
                if (fMeasureText2 > 0.0f) {
                    int i7 = 0;
                    while (i7 * getPaint().measureText(this.AkhnZx) < fMeasureText2) {
                        i7++;
                    }
                    while (i2 < i7 - 1) {
                        spannableStringBuilder.append((java.lang.CharSequence) this.AkhnZx);
                        i2++;
                    }
                }
                spannableStringBuilder.append((java.lang.CharSequence) str2);
                spannableStringBuilder.setSpan(new Application(), spannableStringBuilder.length() - this.EZpvd.length(), spannableStringBuilder.length(), 17);
            }
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) this.OLrzqt);
        }
        setText(spannableStringBuilder);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o.yik$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public ActionBar() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C57456yik.this.DbNXlk = true;
            StateListAnimator stateListAnimator = C57456yik.this.AYXKKw;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(true);
            }
            C57456yik c57456yik = C57456yik.this;
            c57456yik.setText(c57456yik.EZpvd(c57456yik.OLrzqt));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C57456yik.this.djBIcL);
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: o.yik$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public Application() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C57456yik.this.DbNXlk = false;
            StateListAnimator stateListAnimator = C57456yik.this.AYXKKw;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(false);
            }
            C57456yik c57456yik = C57456yik.this;
            c57456yik.setText(c57456yik.EZpvd(c57456yik.OLrzqt));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C57456yik.this.djBIcL);
            textPaint.setUnderlineText(true);
        }
    }

    public final int copydefault(java.lang.String str, int i, int i2, float f, float f2, float f3) {
        int i3 = (int) (((f - (f2 + f3)) * (i - i2)) / f);
        if (i3 <= str.length()) {
            return i;
        }
        android.text.TextPaint paint = getPaint();
        int i4 = i3 + i2;
        java.lang.String strSubstring = this.OLrzqt.substring(i2, i4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return paint.measureText(strSubstring) <= f - f2 ? i4 : copydefault(str, i, i2, f, f2, f3 + getPaint().measureText(this.AkhnZx));
    }
}
