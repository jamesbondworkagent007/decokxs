package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.buysell.ui.bsc.view.InputBoxWidgetV3$debounceNotifyTextChanged$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30019lIx extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final android.os.Handler AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public Function1<? super java.lang.String, Unit> DbNXlk;
    public java.lang.CharSequence EZpvd;
    public final StateListAnimator KWHzl;
    public MutableStateFlow<Job> OLrzqt;
    public boolean djBIcL;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public final java.lang.Runnable isConnected;
    public AbstractC31518lvY valueOf;
    public final android.os.Handler values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebounceOnTextChangedListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemBscInputWidgetBindingV3(@NotNull AbstractC31518lvY abstractC31518lvY) {
        Intrinsics.checkNotNullParameter(abstractC31518lvY, "");
        this.valueOf = abstractC31518lvY;
    }

    public final AbstractC31518lvY copydefault() {
        AbstractC31518lvY abstractC31518lvY = this.valueOf;
        if (abstractC31518lvY != null) {
            return abstractC31518lvY;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30019lIx(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = "";
        this.fetchVPNInfo = "";
        this.EZpvd = "0";
        this.OLrzqt = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
        this.KWHzl = new StateListAnimator();
        this.values = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isConnected = new java.lang.Runnable() { // from class: o.lIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C30019lIx.gEmmrt(this.AEQbTJ);
            }
        };
        EZpvd(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30019lIx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = "";
        this.fetchVPNInfo = "";
        this.EZpvd = "0";
        this.OLrzqt = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
        this.KWHzl = new StateListAnimator();
        this.values = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isConnected = new java.lang.Runnable() { // from class: o.lIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C30019lIx.gEmmrt(this.AEQbTJ);
            }
        };
        EZpvd(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30019lIx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = "";
        this.fetchVPNInfo = "";
        this.EZpvd = "0";
        this.OLrzqt = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
        this.KWHzl = new StateListAnimator();
        this.values = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isConnected = new java.lang.Runnable() { // from class: o.lIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C30019lIx.gEmmrt(this.AEQbTJ);
            }
        };
        EZpvd(context);
    }

    private final void EZpvd(android.content.Context context) {
        setItemBscInputWidgetBindingV3(AbstractC31518lvY.copydefault(android.view.LayoutInflater.from(context), this, true));
        final C55033xcM c55033xcM = copydefault().djBIcL;
        c55033xcM.setTextSize(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.DAIeex));
        c55033xcM.setGravity(TextAlign.RIGHT);
        c55033xcM.setOnTextWillChange(new Function2() { // from class: o.lIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C30019lIx.KWHzl(this.AEQbTJ, c55033xcM, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        });
        setMaxInputLength(20);
        setFiatCurrencyDropDownVisibility(8);
    }

    public static final Unit KWHzl(final C30019lIx c30019lIx, C55033xcM c55033xcM, C55033xcM c55033xcM2, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c30019lIx.EZpvd = charSequence;
        pUU.EZpvd("InputBoxWidgetV3", "keypadLabel onTextWillChange: displayAmount " + ((java.lang.Object) charSequence));
        java.lang.CharSequence text = c30019lIx.copydefault().djBIcL.getText();
        pUU.EZpvd("InputBoxWidgetV3", "keypadLabel onTextWillChange: displayText " + ((java.lang.Object) text));
        c30019lIx.KWHzl(text.toString());
        c30019lIx.djBIcL();
        c55033xcM.setInvalidInputCallback(new Function2() { // from class: o.lIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C30019lIx.KWHzl(this.copydefault, (C55033xcM) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C30019lIx c30019lIx, C55033xcM c55033xcM, int i) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        c30019lIx.EZpvd();
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str) {
        Job value = this.OLrzqt.getValue();
        if (value != null) {
            Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt.setValue(BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new InputBoxWidgetV3$debounceNotifyTextChanged$1(this, str, null), 3, null));
    }

    public final void EZpvd() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(copydefault().djBIcL, "translationX", 0.0f, 30.0f, -30.0f, 30.0f, -30.0f, 15.0f, -15.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.start();
        if (Build.VERSION.SDK_INT >= 30) {
            performHapticFeedback(17);
        }
    }

    public final void setTokenCurrency(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            if (str.length() > 8) {
                java.lang.String strSubstring = str.substring(0, 8);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                str = strSubstring + "...";
            }
            this.fetchVPNInfo = str;
        }
    }

    public final void setMaxInputLength(int i) {
        copydefault().djBIcL.setMaxInputLength(i);
    }

    public final void setMaxDecimalValue(int i) {
        copydefault().djBIcL.setMaxDecimalValue(i);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().gEmmrt.setText("≈" + str);
    }

    public final void setToggleChipFiatCurrency(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().AhwBna.setText(str);
    }

    public final void setFiatCurrencyDropDownVisibility(int i) {
        copydefault().copydefault.setVisibility(i);
    }

    public final void setFiatCurrencyDropDownOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        copydefault().copydefault.setOnClickListener(onClickListener);
        copydefault().AhwBna.setOnClickListener(onClickListener);
    }

    public final void setToggleFiatCurrencyDropDownVisibility(int i) {
        copydefault().AhwBna.setVisibility(i);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            setTokenCurrency(str);
        }
    }

    public final void setCurrencyToggleOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        copydefault().AYXKKw.setOnClickListener(onClickListener);
    }

    public final void setToggleContainerVisibility(int i) {
        if (i == 8) {
            i = 4;
        }
        copydefault().AYXKKw.setVisibility(i);
    }

    public final void setNumberInputText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        copydefault().djBIcL.setPlainNumericText(str);
    }

    public final void setIsErrorInput(boolean z) {
        this.djBIcL = z;
        setText();
    }

    public final void setToggleIconVisibility(boolean z) {
        copydefault().valueOf.setVisibility(z ? 0 : 8);
    }

    public final void djBIcL() {
        C55033xcM c55033xcM = copydefault().djBIcL;
        gEmmrt();
        this.AYXKKw = true;
        setText();
        restartBlinkDebounced$default(this, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.lIx$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C30019lIx.this.AhwBna && C30019lIx.this.isAttachedToWindow()) {
                C30019lIx.this.AYXKKw = !r0.AYXKKw;
                C30019lIx.this.setText();
                if (C30019lIx.this.AhwBna && C30019lIx.this.isAttachedToWindow()) {
                    C30019lIx.this.AEQbTJ.postDelayed(this, 500L);
                }
            }
        }
    }

    public static final void gEmmrt(C30019lIx c30019lIx) {
        c30019lIx.OLrzqt();
    }

    public static /* synthetic */ void restartBlinkDebounced$default(C30019lIx c30019lIx, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        c30019lIx.AEQbTJ(j);
    }

    public final void AEQbTJ(long j) {
        this.values.removeCallbacks(this.isConnected);
        this.values.postDelayed(this.isConnected, j);
    }

    public final void OLrzqt() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        this.AEQbTJ.post(this.KWHzl);
    }

    public final void gEmmrt() {
        this.AEQbTJ.removeCallbacksAndMessages(null);
        this.values.removeCallbacksAndMessages(null);
        this.AhwBna = false;
        this.AYXKKw = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gEmmrt();
    }

    public final void setText() {
        C55033xcM c55033xcM = copydefault().djBIcL;
        Intrinsics.copydefault(c55033xcM);
        C30018lIw.OLrzqt(c55033xcM, java.lang.String.valueOf(this.EZpvd), this.fetchVPNInfo, this.AYXKKw, this.djBIcL);
    }

    public final java.lang.String KWHzl() {
        return C31661lzi.KWHzl(copydefault().djBIcL.valueOf());
    }

    public final C55031xcK AEQbTJ() {
        return copydefault().djBIcL.KWHzl();
    }

    /* JADX INFO: renamed from: o.lIx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
