package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55033xcM extends AppCompatTextView {
    public Function2<? super C55033xcM, ? super java.lang.CharSequence, Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55033xcM(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final Function2<C55033xcM, java.lang.Integer, Unit> copydefault() {
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:22) call: o.xcM.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55033xcM(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55033xcM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55033xcM.EZpvd(this.AEQbTJ);
            }
        });
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.pXZxY);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int integer = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.zFtALg, -1);
            if (integer > 0) {
                setMaxInputLength(integer);
            }
            int integer2 = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.sRzUNh, -1);
            if (integer2 >= 0) {
                setMaxDecimalLength(integer2);
            }
            int integer3 = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.inahnb, -1);
            if (integer3 >= 0) {
                setMaxIntegerLength(integer3);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.values);
        setTextSize(56.0f);
        TextViewCompat.setLineHeight(this, C55298xhM.OLrzqt(74, context));
        setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.svhCHd));
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, 2, 56, 2, 2);
        setGravity(17);
        setLines(1);
        setTextDirection(0);
    }

    public final C55031xcK KWHzl() {
        return (C55031xcK) this.copydefault.getValue();
    }

    public static final Unit copydefault(C55033xcM c55033xcM, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function2<? super C55033xcM, ? super java.lang.CharSequence, Unit> function2 = c55033xcM.OLrzqt;
        if (function2 != null) {
            function2.invoke(c55033xcM, str);
        }
        c55033xcM.setFixAutoSizeText(str);
        return Unit.INSTANCE;
    }

    public static final C55031xcK EZpvd(final C55033xcM c55033xcM) {
        C55031xcK c55031xcK = new C55031xcK(new Function1() { // from class: o.xcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55033xcM.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        });
        c55031xcK.KWHzl(new Function1() { // from class: o.xcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55033xcM.AEQbTJ(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        return c55031xcK;
    }

    public static final Unit AEQbTJ(C55033xcM c55033xcM, int i) {
        Function2<C55033xcM, java.lang.Integer, Unit> function2Copydefault = c55033xcM.copydefault();
        if (function2Copydefault != null) {
            function2Copydefault.invoke(c55033xcM, java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public final void setMaxInputLength(int i) {
        KWHzl().EZpvd(i);
    }

    public final void setMaxDecimalLength(int i) {
        setMaxDecimalValue(i);
    }

    public final int EZpvd() {
        return OLrzqt();
    }

    public final void setMaxDecimalValue(int i) {
        KWHzl().KWHzl(i);
    }

    public final int OLrzqt() {
        return KWHzl().copydefault();
    }

    public final void setMaxIntegerLength(int i) {
        KWHzl().AEQbTJ(i);
    }

    public final int AYXKKw() {
        return KWHzl().valueOf();
    }

    public final void setOnTextWillChange(final Function2<? super C55033xcM, ? super java.lang.CharSequence, Unit> function2) {
        KWHzl().OLrzqt(new Function1() { // from class: o.xcT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55033xcM.OLrzqt(function2, this, (java.lang.String) obj);
            }
        });
        this.OLrzqt = function2;
    }

    public static final Unit OLrzqt(Function2 function2, C55033xcM c55033xcM, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function2 != null) {
            function2.invoke(c55033xcM, str);
        }
        return Unit.INSTANCE;
    }

    public final void setInvalidInputCallback(final Function2<? super C55033xcM, ? super java.lang.Integer, Unit> function2) {
        if (function2 != null) {
            KWHzl().KWHzl(new Function1() { // from class: o.xcP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55033xcM.EZpvd(function2, this, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(Function2 function2, C55033xcM c55033xcM, int i) {
        function2.invoke(c55033xcM, java.lang.Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void setFixAutoSizeText(java.lang.CharSequence charSequence) {
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

    public void setTextByAnimation(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setFixAutoSizeText(charSequence);
    }

    public void setPlainNumericText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().KWHzl(str);
    }

    public java.lang.String valueOf() {
        return KWHzl().AhwBna();
    }

    public int AEQbTJ() {
        return KWHzl().OLrzqt();
    }

    public void setLocale(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        KWHzl().OLrzqt(locale);
    }
}
