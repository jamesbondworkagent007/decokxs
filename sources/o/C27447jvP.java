package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27447jvP extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public InterfaceC27520jwj AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public boolean KWHzl;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> copydefault;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> gEmmrt;
    public java.util.List<InvestTokenWithAmount> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27447jvP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27447jvP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenInputListeners(@NotNull InterfaceC27520jwj interfaceC27520jwj) {
        Intrinsics.checkNotNullParameter(interfaceC27520jwj, "");
        this.AYXKKw = interfaceC27520jwj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.jvP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27447jvP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27447jvP(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = yDY.AhwBna();
        this.KWHzl = true;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27447jvP.copydefault(context, this);
            }
        });
        Function2<C55033xcM, java.lang.CharSequence, Unit> function2 = new Function2() { // from class: o.jvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27447jvP.OLrzqt(this.AEQbTJ, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        this.copydefault = function2;
        Function2<C55033xcM, java.lang.CharSequence, Unit> function22 = new Function2() { // from class: o.jvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27447jvP.KWHzl(this.AEQbTJ, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        this.gEmmrt = function22;
        final C23895iNh c23895iNhKWHzl = KWHzl();
        final C27349jtX c27349jtX = c23895iNhKWHzl.AEQbTJ;
        c27349jtX.setTag(0);
        C55033xcM c55033xcMOLrzqt = c27349jtX.OLrzqt();
        c27349jtX.copydefault();
        java.lang.Object tag = c55033xcMOLrzqt.getTag();
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        applyCommonListeners$default(this, c55033xcMOLrzqt, num != null ? num.intValue() : 0, 0, 2, null);
        c55033xcMOLrzqt.setOnTextWillChange(function2);
        c55033xcMOLrzqt.addTextChangedListener(new ActionBar());
        c27349jtX.setClickListener(new View.OnClickListener() { // from class: o.jvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27447jvP.copydefault(c23895iNhKWHzl, c27349jtX, this, view);
            }
        });
        final C27349jtX c27349jtX2 = c23895iNhKWHzl.EZpvd;
        c27349jtX2.setTag(1);
        C55033xcM c55033xcMOLrzqt2 = c27349jtX2.OLrzqt();
        c27349jtX2.copydefault();
        java.lang.Object tag2 = c55033xcMOLrzqt2.getTag();
        java.lang.Integer num2 = tag2 instanceof java.lang.Integer ? (java.lang.Integer) tag2 : null;
        applyCommonListeners$default(this, c55033xcMOLrzqt2, num2 != null ? num2.intValue() : 1, 0, 2, null);
        c55033xcMOLrzqt2.setOnTextWillChange(function22);
        c55033xcMOLrzqt2.addTextChangedListener(new StateListAnimator());
        c27349jtX2.setClickListener(new View.OnClickListener() { // from class: o.jvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27447jvP.EZpvd(c23895iNhKWHzl, c27349jtX2, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: o.jvP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jvP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final C23895iNh KWHzl() {
        return (C23895iNh) this.EZpvd.getValue();
    }

    public static final C23895iNh copydefault(android.content.Context context, C27447jvP c27447jvP) {
        return C23895iNh.copydefault(android.view.LayoutInflater.from(context), c27447jvP, true);
    }

    public static final Unit OLrzqt(C27447jvP c27447jvP, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c27447jvP.KWHzl().AEQbTJ.copydefault();
        c55033xcM.setTextByAnimation(charSequence);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C27447jvP c27447jvP, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        C23895iNh c23895iNhKWHzl = c27447jvP.KWHzl();
        c55033xcM.setTextByAnimation(charSequence);
        c23895iNhKWHzl.EZpvd.copydefault();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C23895iNh c23895iNh, C27349jtX c27349jtX, C27447jvP c27447jvP, android.view.View view) {
        C27349jtX.exitEditMode$default(c23895iNh.EZpvd, false, 1, null);
        C27349jtX.enterEditMode$default(c27349jtX, false, 1, null);
        c27447jvP.KWHzl(0);
    }

    /* JADX INFO: renamed from: o.jvP$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C27447jvP.this.copydefault(0);
        }
    }

    /* JADX INFO: renamed from: o.jvP$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C27447jvP.this.copydefault(1);
        }
    }

    public static final void EZpvd(C23895iNh c23895iNh, C27349jtX c27349jtX, C27447jvP c27447jvP, android.view.View view) {
        C27349jtX.exitEditMode$default(c23895iNh.AEQbTJ, false, 1, null);
        C27349jtX.enterEditMode$default(c27349jtX, false, 1, null);
        c27447jvP.KWHzl(1);
    }

    public final void setupData(@NotNull iXA ixa) {
        InvestTokenWithAmount investTokenWithAmount;
        InvestTokenWithAmount investTokenWithAmount2;
        Intrinsics.checkNotNullParameter(ixa, "");
        this.valueOf = ixa.AYXKKw();
        this.KWHzl = ixa.fetchVPNInfo();
        this.AEQbTJ = ixa.EZpvd();
        C23895iNh c23895iNhKWHzl = KWHzl();
        if (!ixa.AYXKKw().isEmpty()) {
            investTokenWithAmount = ixa.AYXKKw().get(0);
        } else {
            investTokenWithAmount = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        }
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(ixa.AYXKKw().size()), 1)) {
            investTokenWithAmount2 = ixa.AYXKKw().get(1);
        } else {
            investTokenWithAmount2 = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        }
        if (ixa.AkhnZx()) {
            return;
        }
        if (ixa.fetchVPNInfo()) {
            c23895iNhKWHzl.AEQbTJ.AEQbTJ(EZpvd(true, investTokenWithAmount, ixa, true));
            C27349jtX.exitEditMode$default(c23895iNhKWHzl.EZpvd, false, 1, null);
            c23895iNhKWHzl.EZpvd.AEQbTJ(EZpvd(false, investTokenWithAmount2, ixa, false));
            c23895iNhKWHzl.AEQbTJ.AEQbTJ(true);
            return;
        }
        if (this.AEQbTJ == 0) {
            c23895iNhKWHzl.AEQbTJ.AEQbTJ(EZpvd(true, investTokenWithAmount, ixa, true));
            C27349jtX.exitEditMode$default(c23895iNhKWHzl.EZpvd, false, 1, null);
            c23895iNhKWHzl.EZpvd.AEQbTJ(EZpvd(false, investTokenWithAmount2, ixa, false));
            c23895iNhKWHzl.AEQbTJ.AEQbTJ(true);
            return;
        }
        c23895iNhKWHzl.EZpvd.AEQbTJ(EZpvd(true, investTokenWithAmount2, ixa, true));
        C27349jtX.exitEditMode$default(c23895iNhKWHzl.AEQbTJ, false, 1, null);
        c23895iNhKWHzl.AEQbTJ.AEQbTJ(EZpvd(false, investTokenWithAmount, ixa, false));
        c23895iNhKWHzl.EZpvd.AEQbTJ(true);
    }

    public final C55033xcM OLrzqt() {
        C27349jtX c27349jtX;
        if (this.AEQbTJ == 0) {
            c27349jtX = KWHzl().AEQbTJ;
        } else {
            c27349jtX = KWHzl().EZpvd;
        }
        return c27349jtX.OLrzqt();
    }

    public final void copydefault(@NotNull iXA ixa) {
        Intrinsics.checkNotNullParameter(ixa, "");
        C23895iNh c23895iNhKWHzl = KWHzl();
        if (this.AEQbTJ == 0) {
            c23895iNhKWHzl.AEQbTJ.AEQbTJ(EZpvd(true, OLrzqt(0), ixa, true));
        } else {
            c23895iNhKWHzl.EZpvd.AEQbTJ(EZpvd(true, OLrzqt(1), ixa, true));
        }
    }

    public final void EZpvd() {
        C23895iNh c23895iNhKWHzl = KWHzl();
        C27349jtX.exitEditMode$default(c23895iNhKWHzl.AEQbTJ, false, 1, null);
        C27349jtX.exitEditMode$default(c23895iNhKWHzl.EZpvd, false, 1, null);
    }

    public static /* synthetic */ InvestTokenWithAmount getCurrentToken$default(C27447jvP c27447jvP, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c27447jvP.OLrzqt(i);
    }

    public final InvestTokenWithAmount OLrzqt(int i) {
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(this.valueOf, i);
        return investTokenWithAmount == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
    }

    public final void KWHzl(int i) {
        this.AEQbTJ = i;
        copydefault(i);
        InterfaceC27520jwj interfaceC27520jwj = this.AYXKKw;
        if (interfaceC27520jwj != null) {
            interfaceC27520jwj.wlaJM();
        }
    }

    public final void copydefault(int i) {
        if (this.valueOf.isEmpty() && this.KWHzl) {
            return;
        }
        C23895iNh c23895iNhKWHzl = KWHzl();
        java.lang.String strValueOf = (i == 0 ? c23895iNhKWHzl.AEQbTJ : c23895iNhKWHzl.EZpvd).OLrzqt().valueOf();
        if (i == this.AEQbTJ) {
            InvestTokenWithAmount investTokenWithAmountOLrzqt = OLrzqt(i);
            InterfaceC27520jwj interfaceC27520jwj = this.AYXKKw;
            if (interfaceC27520jwj != null) {
                InterfaceC27520jwj.onInputChange$default(interfaceC27520jwj, strValueOf, investTokenWithAmountOLrzqt, false, 4, null);
            }
        }
    }

    public final C25480ixX EZpvd(boolean z, InvestTokenWithAmount investTokenWithAmount, iXA ixa, boolean z2) {
        java.lang.String str;
        java.lang.String string;
        DisplayText displayTextAEQbTJ;
        InvestTipInfoVo investTipInfoVoAEQbTJ;
        java.lang.String coinAmount = ixa.fetchVPNInfo() ? "0" : investTokenWithAmount.getCoinAmount();
        java.lang.String tokenSymbol = investTokenWithAmount.getTokenSymbol();
        if (tokenSymbol == null || tokenSymbol.length() == 0) {
            tokenSymbol = "--";
        }
        java.lang.String str2 = tokenSymbol;
        java.lang.String tokenLogo = investTokenWithAmount.getTokenLogo();
        java.lang.String strKWHzl = C27492jwH.OLrzqt.KWHzl(ixa.fetchVPNInfo() ? "0" : investTokenWithAmount.getCurrencyAmount());
        int iAhwBna = C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision());
        C24179iXv c24179iXv = ixa.OLrzqt().get(investTokenWithAmount.getTokenAddress());
        boolean zEZpvd = c24179iXv != null ? c24179iXv.EZpvd() : false;
        C24179iXv c24179iXv2 = ixa.OLrzqt().get(investTokenWithAmount.getTokenAddress());
        boolean zCopydefault = c24179iXv2 != null ? c24179iXv2.copydefault() : false;
        boolean z3 = ixa.fetchVPNInfo() || ixa.AkhnZx();
        java.lang.String strKWHzl2 = "";
        if (z) {
            C25479ixW c25479ixWValueOf = ixa.valueOf();
            if (c25479ixWValueOf == null || (investTipInfoVoAEQbTJ = c25479ixWValueOf.AEQbTJ()) == null || (string = investTipInfoVoAEQbTJ.getTipContent()) == null) {
                C25479ixW c25479ixWValueOf2 = ixa.valueOf();
                if (c25479ixWValueOf2 != null) {
                    strKWHzl2 = c25479ixWValueOf2.KWHzl();
                } else {
                    C24179iXv c24179iXv3 = ixa.OLrzqt().get(investTokenWithAmount.getTokenAddress());
                    if (c24179iXv3 == null || (displayTextAEQbTJ = c24179iXv3.AEQbTJ()) == null) {
                        string = null;
                    } else {
                        android.content.Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        string = displayTextAEQbTJ.getString(context);
                    }
                    if (string == null) {
                    }
                }
                str = strKWHzl2;
            }
            str = string;
        } else {
            str = strKWHzl2;
        }
        return new C25480ixX(coinAmount, str2, tokenLogo, strKWHzl, zCopydefault, zEZpvd, false, z3, z2, str, iAhwBna, "", false);
    }

    public static /* synthetic */ void applyCommonListeners$default(C27447jvP c27447jvP, C55033xcM c55033xcM, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 26;
        }
        c27447jvP.AEQbTJ(c55033xcM, i, i2);
    }

    public final void AEQbTJ(C55033xcM c55033xcM, int i, int i2) {
        c55033xcM.setMaxDecimalValue(6);
        c55033xcM.setMaxIntegerLength(i2);
        c55033xcM.setPlainNumericText("0");
    }
}
