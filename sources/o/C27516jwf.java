package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27516jwf extends AppCompatTextView {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27516jwf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27516jwf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.jwf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27516jwf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27516jwf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 12;
        this.AEQbTJ = 32;
        this.OLrzqt = 1;
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, 12, 32, 1, 2);
    }

    /* JADX INFO: renamed from: o.jwf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jwf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void setAutoSizeTextConfiguration$default(C27516jwf c27516jwf, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        c27516jwf.setAutoSizeTextConfiguration(i, i2, i3);
    }

    public final void setAutoSizeTextConfiguration(int i, int i2, int i3) {
        this.KWHzl = i;
        this.AEQbTJ = i2;
        this.OLrzqt = i3;
        setupAutoSizeText();
    }

    public final void setMinTextSize(int i) {
        this.KWHzl = i;
        setupAutoSizeText();
    }

    public final void setMaxTextSize(int i) {
        this.AEQbTJ = i;
        setupAutoSizeText();
    }

    public static /* synthetic */ void setAmountAndSymbol$default(C27516jwf c27516jwf, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        c27516jwf.setAmountAndSymbol(charSequence, charSequence2, i, i2);
    }

    public final void setAmountAndSymbol(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.EZpvd = i;
        this.gEmmrt = i2;
        android.text.SpannableString spannableString = new android.text.SpannableString(((java.lang.Object) charSequence) + " " + ((java.lang.Object) charSequence2));
        int currentTextColor = getCurrentTextColor();
        if (i == 0) {
            i = currentTextColor;
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i), 0, charSequence.length(), 33);
        if (i2 == 0) {
            i2 = currentTextColor;
        }
        int length = charSequence.length() + 1;
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i2), length, charSequence2.length() + length, 33);
        OLrzqt(spannableString);
    }

    private final void OLrzqt(java.lang.CharSequence charSequence) {
        int i;
        int autoSizeMinTextSize;
        int autoSizeMaxTextSize;
        boolean z = TextViewCompat.getAutoSizeTextType(this) != 0;
        if (z) {
            autoSizeMinTextSize = TextViewCompat.getAutoSizeMinTextSize(this);
            autoSizeMaxTextSize = TextViewCompat.getAutoSizeMaxTextSize(this);
            if (autoSizeMinTextSize <= 0 || autoSizeMaxTextSize <= autoSizeMinTextSize) {
                z = false;
                i = 0;
            } else {
                int autoSizeStepGranularity = TextViewCompat.getAutoSizeStepGranularity(this);
                i = autoSizeStepGranularity >= 0 ? autoSizeStepGranularity : 1;
                TextViewCompat.setAutoSizeTextTypeWithDefaults(this, 0);
                setTextSize(0, autoSizeMaxTextSize);
                measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
                setRight(getLeft());
                setBottom(getTop());
                requestLayout();
            }
        } else {
            i = 0;
            autoSizeMinTextSize = 0;
            autoSizeMaxTextSize = 0;
        }
        super.setText(charSequence);
        if (z) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, autoSizeMinTextSize, autoSizeMaxTextSize, i, 0);
        }
    }

    public static /* synthetic */ void setAmountAndSymbolWithColorRes$default(C27516jwf c27516jwf, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        c27516jwf.setAmountAndSymbolWithColorRes(charSequence, charSequence2, i, i2);
    }

    public final void setAmountAndSymbolWithColorRes(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        setAmountAndSymbol(charSequence, charSequence2, i != 0 ? ContextCompat.getColor(getContext(), i) : 0, i2 != 0 ? ContextCompat.getColor(getContext(), i2) : 0);
    }

    public final void AEQbTJ() {
        setText("");
    }

    public final void setupAutoSizeText() {
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, this.KWHzl, this.AEQbTJ, this.OLrzqt, 2);
    }
}
