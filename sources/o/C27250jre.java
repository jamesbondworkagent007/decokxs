package o;

import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27250jre extends ConstraintLayout {
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public iMQ OLrzqt;
    public InterfaceC58217yxC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentTextWatcher(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelayContentTextWatcher(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27250jre(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27250jre(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27250jre(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.jre$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            iMQ imq = C27250jre.this.OLrzqt;
            iMQ imq2 = null;
            if (imq == null) {
                Intrinsics.gEmmrt("");
                imq = null;
            }
            if (imq.AEQbTJ.isConnected().length() == 0) {
                iMQ imq3 = C27250jre.this.OLrzqt;
                if (imq3 == null) {
                    Intrinsics.gEmmrt("");
                    imq3 = null;
                }
                imq3.AEQbTJ.setPlainNumericText("0");
            } else {
                iMQ imq4 = C27250jre.this.OLrzqt;
                if (imq4 == null) {
                    Intrinsics.gEmmrt("");
                    imq4 = null;
                }
                if (C33129mqd.AEQbTJ(imq4.AEQbTJ.isConnected(), "100")) {
                    iMQ imq5 = C27250jre.this.OLrzqt;
                    if (imq5 == null) {
                        Intrinsics.gEmmrt("");
                        imq5 = null;
                    }
                    imq5.AEQbTJ.setPlainNumericText("100");
                }
            }
            Function1 function1 = C27250jre.this.EZpvd;
            if (function1 != null) {
                iMQ imq6 = C27250jre.this.OLrzqt;
                if (imq6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    imq2 = imq6;
                }
                function1.invoke(imq2.AEQbTJ.isConnected());
            }
        }
    }

    private final void OLrzqt() {
        iMQ imq = this.OLrzqt;
        iMQ imq2 = null;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.addTextChangedListener(new TaskDescription());
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        iMQ imq3 = this.OLrzqt;
        if (imq3 == null) {
            Intrinsics.gEmmrt("");
            imq3 = null;
        }
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(imq3.AEQbTJ).skip(1L).debounce(500L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.jrh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27250jre.copydefault(this.copydefault, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jrg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27250jre.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jri
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27250jre.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.copydefault = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jrf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27250jre.OLrzqt(function12, obj);
            }
        });
        iMQ imq4 = this.OLrzqt;
        if (imq4 == null) {
            Intrinsics.gEmmrt("");
            imq4 = null;
        }
        imq4.EZpvd.setOnSeekBarChangeListener(new Application());
        iMQ imq5 = this.OLrzqt;
        if (imq5 == null) {
            Intrinsics.gEmmrt("");
            imq5 = null;
        }
        imq5.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.jrj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27250jre.OLrzqt(this.AEQbTJ, view);
            }
        });
        iMQ imq6 = this.OLrzqt;
        if (imq6 == null) {
            Intrinsics.gEmmrt("");
            imq6 = null;
        }
        imq6.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jrk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27250jre.djBIcL(this.OLrzqt, view);
            }
        });
        iMQ imq7 = this.OLrzqt;
        if (imq7 == null) {
            Intrinsics.gEmmrt("");
            imq7 = null;
        }
        imq7.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jrm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27250jre.AhwBna(this.copydefault, view);
            }
        });
        iMQ imq8 = this.OLrzqt;
        if (imq8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imq2 = imq8;
        }
        imq2.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.jrl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27250jre.valueOf(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C27250jre c27250jre, AbstractC8060avc abstractC8060avc) {
        Function1<? super java.lang.String, Unit> function1 = c27250jre.AEQbTJ;
        if (function1 != null) {
            iMQ imq = c27250jre.OLrzqt;
            if (imq == null) {
                Intrinsics.gEmmrt("");
                imq = null;
            }
            function1.invoke(imq.AEQbTJ.isConnected());
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jre$Application */
    public static final class Application implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public Application() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            if (z) {
                iMQ imq = C27250jre.this.OLrzqt;
                if (imq == null) {
                    Intrinsics.gEmmrt("");
                    imq = null;
                }
                imq.AEQbTJ.setPlainNumericText(java.lang.String.valueOf(i));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            C27250jre.this.copydefault();
        }
    }

    public static final void OLrzqt(C27250jre c27250jre, android.view.View view) {
        c27250jre.copydefault();
        iMQ imq = c27250jre.OLrzqt;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.setPlainNumericText("25");
    }

    public static final void djBIcL(C27250jre c27250jre, android.view.View view) {
        c27250jre.copydefault();
        iMQ imq = c27250jre.OLrzqt;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.setPlainNumericText("50");
    }

    public static final void AhwBna(C27250jre c27250jre, android.view.View view) {
        c27250jre.copydefault();
        iMQ imq = c27250jre.OLrzqt;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.setPlainNumericText("75");
    }

    public static final void valueOf(C27250jre c27250jre, android.view.View view) {
        c27250jre.copydefault();
        iMQ imq = c27250jre.OLrzqt;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.setPlainNumericText("100");
    }

    private final void KWHzl() {
        android.graphics.drawable.Drawable drawableKWHzl;
        iMQ imqCopydefault = iMQ.copydefault(android.view.LayoutInflater.from(getContext()), this);
        this.OLrzqt = imqCopydefault;
        iMQ imq = null;
        if (imqCopydefault == null) {
            Intrinsics.gEmmrt("");
            imqCopydefault = null;
        }
        imqCopydefault.AEQbTJ.setMaxDecimalValue(0);
        iMQ imq2 = this.OLrzqt;
        if (imq2 == null) {
            Intrinsics.gEmmrt("");
            imq2 = null;
        }
        imq2.AEQbTJ.setMaxInputLength(3);
        if (Build.VERSION.SDK_INT >= 29 && (drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.getUriFromString)) != null) {
            iMQ imq3 = this.OLrzqt;
            if (imq3 == null) {
                Intrinsics.gEmmrt("");
                imq3 = null;
            }
            imq3.AEQbTJ.setTextSelectHandle(drawableKWHzl);
        }
        iMQ imq4 = this.OLrzqt;
        if (imq4 == null) {
            Intrinsics.gEmmrt("");
            imq4 = null;
        }
        C55251xgS c55251xgS = imq4.gEmmrt;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Float.valueOf(0.25f));
        RoundingMode roundingMode = RoundingMode.DOWN;
        c55251xgS.setText(pTB.formatPercent$default(bigDecimalEZpvd, 2, 0, roundingMode, null, 8, null));
        iMQ imq5 = this.OLrzqt;
        if (imq5 == null) {
            Intrinsics.gEmmrt("");
            imq5 = null;
        }
        imq5.copydefault.setText(pTB.formatPercent$default(C33129mqd.EZpvd(java.lang.Float.valueOf(0.5f)), 2, 0, roundingMode, null, 8, null));
        iMQ imq6 = this.OLrzqt;
        if (imq6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imq = imq6;
        }
        imq.OLrzqt.setText(pTB.formatPercent$default(C33129mqd.EZpvd(java.lang.Float.valueOf(0.75f)), 2, 0, roundingMode, null, 8, null));
    }

    public static /* synthetic */ void updateAmountAndUI$default(C27250jre c27250jre, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c27250jre.AEQbTJ(i, z);
    }

    public final void AEQbTJ(int i, boolean z) {
        iMQ imq = this.OLrzqt;
        iMQ imq2 = null;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.EZpvd.setProgress(i);
        iMQ imq3 = this.OLrzqt;
        if (imq3 == null) {
            Intrinsics.gEmmrt("");
            imq3 = null;
        }
        imq3.gEmmrt.setTagPaint(0);
        iMQ imq4 = this.OLrzqt;
        if (imq4 == null) {
            Intrinsics.gEmmrt("");
            imq4 = null;
        }
        imq4.copydefault.setTagPaint(0);
        iMQ imq5 = this.OLrzqt;
        if (imq5 == null) {
            Intrinsics.gEmmrt("");
            imq5 = null;
        }
        imq5.OLrzqt.setTagPaint(0);
        iMQ imq6 = this.OLrzqt;
        if (imq6 == null) {
            Intrinsics.gEmmrt("");
            imq6 = null;
        }
        imq6.djBIcL.setTagPaint(0);
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 25)) {
            iMQ imq7 = this.OLrzqt;
            if (imq7 == null) {
                Intrinsics.gEmmrt("");
                imq7 = null;
            }
            imq7.gEmmrt.setTagPaint(1);
        } else if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 50)) {
            iMQ imq8 = this.OLrzqt;
            if (imq8 == null) {
                Intrinsics.gEmmrt("");
                imq8 = null;
            }
            imq8.copydefault.setTagPaint(1);
        } else if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 75)) {
            iMQ imq9 = this.OLrzqt;
            if (imq9 == null) {
                Intrinsics.gEmmrt("");
                imq9 = null;
            }
            imq9.OLrzqt.setTagPaint(1);
        } else if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 100)) {
            iMQ imq10 = this.OLrzqt;
            if (imq10 == null) {
                Intrinsics.gEmmrt("");
                imq10 = null;
            }
            imq10.djBIcL.setTagPaint(1);
        }
        if (z) {
            iMQ imq11 = this.OLrzqt;
            if (imq11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imq2 = imq11;
            }
            imq2.EZpvd.setProgress(i);
        }
    }

    public final void setAmountDirect(int i) {
        iMQ imq = this.OLrzqt;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.setPlainNumericText(java.lang.String.valueOf(i));
    }

    public final void copydefault() {
        iMQ imq = this.OLrzqt;
        iMQ imq2 = null;
        if (imq == null) {
            Intrinsics.gEmmrt("");
            imq = null;
        }
        imq.AEQbTJ.clearFocus();
        android.content.Context context = getContext();
        iMQ imq3 = this.OLrzqt;
        if (imq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imq2 = imq3;
        }
        C33570myu.AEQbTJ(context, (android.view.View) imq2.AEQbTJ);
    }
}
