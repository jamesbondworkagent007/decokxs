package o;

import android.os.Build;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27259jrn extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public java.lang.Runnable EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public final android.os.Handler OLrzqt;
    public final long copydefault;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public iMR gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentTextWatcher(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelayContentTextWatcher(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    private final Function2<C55033xcM, java.lang.CharSequence, Unit> OLrzqt() {
        return (Function2) this.AEQbTJ.getValue();
    }

    public static final Function2 AEQbTJ(final C27259jrn c27259jrn) {
        return new Function2() { // from class: o.jro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27259jrn.EZpvd(this.KWHzl, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
    }

    public static final Unit EZpvd(C27259jrn c27259jrn, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        boolean z = c27259jrn.valueOf;
        if (!z) {
            c27259jrn.AhwBna = true;
        }
        java.lang.String strValueOf = c55033xcM.valueOf();
        if (strValueOf.length() == 0) {
            str = "0";
        } else {
            str = "100";
            if (!C33129mqd.AEQbTJ(strValueOf, "100")) {
                str = strValueOf;
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strValueOf) && !z) {
            c55033xcM.setOnTextWillChange(null);
            c55033xcM.setPlainNumericText(str);
            c55033xcM.setOnTextWillChange(c27259jrn.OLrzqt());
            c27259jrn.setAmountAndSymbol(str, "%", !c27259jrn.AYXKKw);
            if (!z) {
                c27259jrn.copydefault(str);
            }
            Function1<? super java.lang.String, Unit> function1 = c27259jrn.djBIcL;
            if (function1 != null) {
                function1.invoke(str);
            }
            c27259jrn.AEQbTJ(str);
        } else {
            c27259jrn.setAmountAndSymbol(charSequence, "%", !c27259jrn.AYXKKw);
            if (!z) {
                c27259jrn.copydefault(str);
            }
            Function1<? super java.lang.String, Unit> function12 = c27259jrn.djBIcL;
            if (function12 != null) {
                function12.invoke(str);
            }
            c27259jrn.AEQbTJ(str);
        }
        if (!z) {
            c27259jrn.AhwBna = false;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27259jrn(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27259jrn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27259jrn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
        this.copydefault = 500L;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jrp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27259jrn.AEQbTJ(this.OLrzqt);
            }
        });
        valueOf();
        EZpvd();
    }

    private final void EZpvd() {
        iMR imr = this.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.OLrzqt.setOnSeekBarChangeListener(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.jrn$StateListAnimator */
    public static final class StateListAnimator implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public StateListAnimator() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            if (!z || C27259jrn.this.AhwBna) {
                return;
            }
            C27259jrn.this.valueOf = true;
            C27259jrn.this.setAmountDirect(i);
            C27259jrn.this.valueOf = false;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            C27259jrn.this.copydefault();
        }
    }

    private final void valueOf() {
        iMR imrKWHzl = iMR.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        this.gEmmrt = imrKWHzl;
        if (imrKWHzl == null) {
            Intrinsics.gEmmrt("");
            imrKWHzl = null;
        }
        C57461yip c57461yip = imrKWHzl.KWHzl;
        c57461yip.setMaxDecimalValue(0);
        c57461yip.setMaxIntegerLength(3);
        c57461yip.setPlainNumericText("0");
        c57461yip.setOnTextWillChange(OLrzqt());
        c57461yip.setTextAppearance(C25493ixk.Dialog.EZpvd);
        setAmountAndSymbol("0", "%", true);
    }

    public final void setData() {
        iMR imr = this.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.KWHzl.setOnTextWillChange(OLrzqt());
    }

    public final void AEQbTJ(final java.lang.String str) {
        java.lang.Runnable runnable = this.EZpvd;
        if (runnable != null) {
            this.OLrzqt.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.jrr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27259jrn.EZpvd(this.copydefault, str);
            }
        };
        this.EZpvd = runnable2;
        android.os.Handler handler = this.OLrzqt;
        Intrinsics.copydefault(runnable2);
        handler.postDelayed(runnable2, this.copydefault);
    }

    public static final void EZpvd(C27259jrn c27259jrn, java.lang.String str) {
        Function1<? super java.lang.String, Unit> function1 = c27259jrn.KWHzl;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public final void copydefault(java.lang.String str) {
        if (this.valueOf) {
            return;
        }
        int iEZpvd = C56548yJl.EZpvd(C33129mqd.AhwBna(str), 0, 100);
        iMR imr = this.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.OLrzqt.setProgress(iEZpvd);
    }

    public static /* synthetic */ void updateAmountAndUI$default(C27259jrn c27259jrn, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c27259jrn.KWHzl(i, z);
    }

    public final void KWHzl(int i, boolean z) {
        iMR imr = this.gEmmrt;
        iMR imr2 = null;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.OLrzqt.setProgress(i);
        if (z) {
            iMR imr3 = this.gEmmrt;
            if (imr3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imr2 = imr3;
            }
            imr2.OLrzqt.setProgress(i);
        }
    }

    public final void setAmountDirect(int i) {
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        iMR imr = this.gEmmrt;
        iMR imr2 = null;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.KWHzl.setOnTextWillChange(null);
        iMR imr3 = this.gEmmrt;
        if (imr3 == null) {
            Intrinsics.gEmmrt("");
            imr3 = null;
        }
        imr3.KWHzl.setPlainNumericText(strValueOf);
        iMR imr4 = this.gEmmrt;
        if (imr4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imr2 = imr4;
        }
        imr2.KWHzl.setOnTextWillChange(OLrzqt());
        setAmountAndSymbol(strValueOf, "%", !this.AYXKKw);
        copydefault(strValueOf);
        Function1<? super java.lang.String, Unit> function1 = this.djBIcL;
        if (function1 != null) {
            function1.invoke(strValueOf);
        }
        AEQbTJ(strValueOf);
    }

    public final void copydefault() {
        iMR imr = this.gEmmrt;
        iMR imr2 = null;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.KWHzl.clearFocus();
        android.content.Context context = getContext();
        iMR imr3 = this.gEmmrt;
        if (imr3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imr2 = imr3;
        }
        C33570myu.AEQbTJ(context, imr2.KWHzl);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iMR imr = this.gEmmrt;
        iMR imr2 = null;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.KWHzl.clearFocus();
        android.content.Context context = getContext();
        iMR imr3 = this.gEmmrt;
        if (imr3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imr2 = imr3;
        }
        C33570myu.AEQbTJ(context, imr2.KWHzl);
        setAmountDirect(C33129mqd.AhwBna(str));
    }

    public final C57461yip AEQbTJ() {
        iMR imr = this.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        C57461yip c57461yip = imr.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c57461yip, "");
        return c57461yip;
    }

    public final void setAmountWithLottie(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iMR imr = this.gEmmrt;
        iMR imr2 = null;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        imr.KWHzl.setOnTextWillChange(null);
        iMR imr3 = this.gEmmrt;
        if (imr3 == null) {
            Intrinsics.gEmmrt("");
            imr3 = null;
        }
        imr3.KWHzl.setPlainNumericText(str);
        iMR imr4 = this.gEmmrt;
        if (imr4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imr2 = imr4;
        }
        imr2.KWHzl.setOnTextWillChange(OLrzqt());
        setAmountAndSymbol(str, "%", !this.AYXKKw);
        if (this.valueOf) {
            return;
        }
        copydefault(str);
    }

    public final void setAmountAndSymbol(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        iMR imr = null;
        if (z) {
            iMR imr2 = this.gEmmrt;
            if (imr2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imr = imr2;
            }
            imr.KWHzl.setAmountAndSymbol(charSequence, C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.jrs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27259jrn.OLrzqt(this.AEQbTJ, (java.util.List) obj);
                }
            }, 14, null));
            return;
        }
        iMR imr3 = this.gEmmrt;
        if (imr3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imr = imr3;
        }
        C57461yip c57461yip = imr.KWHzl;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.append(C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.jrq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27259jrn.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null));
        c57461yip.setTextByAnimation(new android.text.SpannedString(spannableStringBuilder));
    }

    public static final Unit OLrzqt(C27259jrn c27259jrn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        iMR imr = c27259jrn.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        android.content.Context context = imr.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27259jrn.EZpvd((java.util.List<java.lang.Object>) list, context);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C27259jrn c27259jrn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        iMR imr = c27259jrn.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        android.content.Context context = imr.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27259jrn.EZpvd((java.util.List<java.lang.Object>) list, context);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<java.lang.Object> list, android.content.Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            C7367aiW.EZpvd();
            list.add(C7368aiX.copydefault(android.graphics.Typeface.create(ResourcesCompat.getFont(context, C52761wXj.Dialog.AEQbTJ), 0)));
        }
        list.add(new android.text.style.ForegroundColorSpan(context.getColor(C52761wXj.Activity.UlJrfe)));
    }

    public final void KWHzl() {
        iMR imr = this.gEmmrt;
        if (imr == null) {
            Intrinsics.gEmmrt("");
            imr = null;
        }
        android.widget.TextView textView = imr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    public final void AEQbTJ(boolean z) {
        if (this.AYXKKw != z) {
            this.AYXKKw = z;
            iMR imr = this.gEmmrt;
            iMR imr2 = null;
            if (imr == null) {
                Intrinsics.gEmmrt("");
                imr = null;
            }
            setAmountAndSymbol(imr.KWHzl.valueOf(), "%", !z);
            iMR imr3 = this.gEmmrt;
            if (imr3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imr2 = imr3;
            }
            imr2.KWHzl.setOnTextWillChange(OLrzqt());
        }
    }
}
