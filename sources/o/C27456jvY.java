package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27456jvY extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public InterfaceC27520jwj AEQbTJ;
    public InterfaceC27453jvV EZpvd;
    public boolean OLrzqt;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> copydefault;
    public iXA gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27456jvY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27456jvY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final iXA AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenInputListeners(@NotNull InterfaceC27520jwj interfaceC27520jwj) {
        Intrinsics.checkNotNullParameter(interfaceC27520jwj, "");
        this.AEQbTJ = interfaceC27520jwj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:50) call: o.jvY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27456jvY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27456jvY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = true;
        this.copydefault = new Function2() { // from class: o.jvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27456jvY.AEQbTJ(this.OLrzqt, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        AhwBna();
    }

    /* JADX INFO: renamed from: o.jvY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jvY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final InterfaceC27453jvV valueOf() {
        if (this.EZpvd == null) {
            C23906iNs c23906iNsOLrzqt = C23906iNs.OLrzqt(android.view.LayoutInflater.from(getContext()), this, false);
            Intrinsics.checkNotNullExpressionValue(c23906iNsOLrzqt, "");
            this.EZpvd = new C27513jwc(c23906iNsOLrzqt);
        }
        InterfaceC27453jvV interfaceC27453jvV = this.EZpvd;
        Intrinsics.copydefault(interfaceC27453jvV);
        return interfaceC27453jvV;
    }

    public static final Unit AEQbTJ(C27456jvY c27456jvY, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c27456jvY.valueOf().KWHzl(charSequence, c27456jvY.gEmmrt().getTokenSymbol(), !c27456jvY.OLrzqt);
        boolean zKWHzl = c27456jvY.KWHzl(c55033xcM);
        c27456jvY.OLrzqt(c55033xcM);
        InterfaceC27520jwj interfaceC27520jwj = c27456jvY.AEQbTJ;
        if (interfaceC27520jwj != null) {
            interfaceC27520jwj.AEQbTJ(c55033xcM.valueOf(), c27456jvY.gEmmrt(), zKWHzl);
        }
        return Unit.INSTANCE;
    }

    private final void AhwBna() {
        removeAllViews();
        addView(valueOf().AEQbTJ());
        C55033xcM c55033xcMOLrzqt = valueOf().OLrzqt();
        android.content.Context context = c55033xcMOLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55033xcMOLrzqt.setMinHeight(C55298xhM.OLrzqt(58, context));
        c55033xcMOLrzqt.setMaxDecimalValue(6);
        c55033xcMOLrzqt.setMaxIntegerLength(26);
        c55033xcMOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27456jvY.setUpViews$lambda$3$lambda$2$lambda$1(this.copydefault, view);
            }
        });
        c55033xcMOLrzqt.setOnTextWillChange(this.copydefault);
        android.content.Context context2 = c55033xcMOLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TextViewCompat.setLineHeight(c55033xcMOLrzqt, C55298xhM.OLrzqt(48, context2));
        if (this.valueOf) {
            c55033xcMOLrzqt.setGravity(TextAlign.LEFT);
            c55033xcMOLrzqt.setTextAppearance(C25493ixk.Dialog.EZpvd);
        }
    }

    public static final void setUpViews$lambda$3$lambda$2$lambda$1(C27456jvY c27456jvY, android.view.View view) {
        InterfaceC27520jwj interfaceC27520jwj = c27456jvY.AEQbTJ;
        if (interfaceC27520jwj != null) {
            interfaceC27520jwj.wlaJM();
        }
    }

    public final void KWHzl(boolean z) {
        if (this.valueOf != z) {
            this.valueOf = z;
            this.EZpvd = null;
            AhwBna();
        }
    }

    public final void setData(@NotNull iXA ixa) {
        Intrinsics.checkNotNullParameter(ixa, "");
        this.gEmmrt = ixa;
        C55033xcM c55033xcMOLrzqt = valueOf().OLrzqt();
        c55033xcMOLrzqt.setMaxDecimalValue(6);
        if (ixa.fetchVPNInfo() || (ixa.DbNXlk() && c55033xcMOLrzqt.valueOf().length() == 0)) {
            c55033xcMOLrzqt.setPlainNumericText(ixa.DbNXlk() ? ixa.KWHzl() : "0");
        }
        c55033xcMOLrzqt.setOnTextWillChange(this.copydefault);
        if (C33129mqd.AEQbTJ(ixa.KWHzl(), "0")) {
            OLrzqt(ixa);
        }
    }

    public final void EZpvd(boolean z) {
        iXA ixaAYXKKw;
        if (this.OLrzqt != z) {
            this.OLrzqt = z;
            valueOf().KWHzl(valueOf().OLrzqt().valueOf(), gEmmrt().getTokenSymbol(), !z);
            if (!this.valueOf || (ixaAYXKKw = AYXKKw()) == null) {
                return;
            }
            C25479ixW c25479ixWValueOf = ixaAYXKKw.valueOf();
            OLrzqt(ixaAYXKKw.AEQbTJ((1032191 & 1) != 0 ? ixaAYXKKw.AuCTel : null, (1032191 & 2) != 0 ? ixaAYXKKw.DbNXlk : false, (1032191 & 4) != 0 ? ixaAYXKKw.copydefault : null, (1032191 & 8) != 0 ? ixaAYXKKw.AYXKKw : null, (1032191 & 16) != 0 ? ixaAYXKKw.ejfBZ : null, (1032191 & 32) != 0 ? ixaAYXKKw.fARcdN : null, (1032191 & 64) != 0 ? ixaAYXKKw.djBIcL : null, (1032191 & 128) != 0 ? ixaAYXKKw.EZpvd : 0, (1032191 & 256) != 0 ? ixaAYXKKw.fIwbmz : 0, (1032191 & 512) != 0 ? ixaAYXKKw.AkhnZx : false, (1032191 & 1024) != 0 ? ixaAYXKKw.values : false, (1032191 & 2048) != 0 ? ixaAYXKKw.fJNWhG : null, (1032191 & 4096) != 0 ? ixaAYXKKw.KWHzl : null, (1032191 & 8192) != 0 ? ixaAYXKKw.AEQbTJ : null, (1032191 & 16384) != 0 ? ixaAYXKKw.isConnected : c25479ixWValueOf != null ? C25479ixW.copy$default(c25479ixWValueOf, "", -1, null, 4, null) : null, (1032191 & 32768) != 0 ? ixaAYXKKw.AhwBna : false, (1032191 & 65536) != 0 ? ixaAYXKKw.valueOf : false, (1032191 & 131072) != 0 ? ixaAYXKKw.OLrzqt : false, (1032191 & 262144) != 0 ? ixaAYXKKw.fetchVPNInfo : false, (1032191 & 524288) != 0 ? ixaAYXKKw.gEmmrt : false));
        }
    }

    public final C55033xcM EZpvd() {
        return valueOf().OLrzqt();
    }

    public final void djBIcL() {
        OLrzqt(new C25479ixW(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DrNnAm), 0, null, 6, null));
    }

    public final void KWHzl() {
        OLrzqt(new C25479ixW(C33070mpX.AYXKKw(C25493ixk.FragmentManager.djSkpj), 0, null, 6, null));
    }

    public final void OLrzqt() {
        valueOf().copydefault().setText("");
    }

    public final void AEQbTJ() {
        OLrzqt();
        copydefault();
    }

    public final void copydefault() {
        valueOf().EZpvd().copydefault();
        valueOf().KWHzl().setVisibility(4);
        valueOf().KWHzl().setText(C27492jwH.formatCurrencyAppendSymbol$default(C27492jwH.OLrzqt, "0", null, null, null, 14, null));
    }

    private final InvestTokenWithAmount gEmmrt() {
        InvestTokenWithAmount investTokenWithAmountValues;
        iXA ixa = this.gEmmrt;
        return (ixa == null || (investTokenWithAmountValues = ixa.values()) == null) ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmountValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(iXA ixa) {
        java.lang.String strAEQbTJ;
        C25479ixW c25479ixWValueOf;
        InterfaceC27453jvV interfaceC27453jvVValueOf = valueOf();
        if (ixa.AkhnZx()) {
            OLrzqt();
        }
        C25479ixW c25479ixWValueOf2 = ixa.valueOf();
        if (c25479ixWValueOf2 == null || !c25479ixWValueOf2.OLrzqt() || ixa.valueOf().AEQbTJ() == null) {
            C25479ixW c25479ixWValueOf3 = ixa.valueOf();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (c25479ixWValueOf3 != null ? c25479ixWValueOf3.KWHzl() : null))) {
                C25479ixW c25479ixWValueOf4 = ixa.valueOf();
                if ((c25479ixWValueOf4 != null ? c25479ixWValueOf4.AEQbTJ() : null) != null) {
                }
            } else {
                C25479ixW c25479ixWValueOf5 = ixa.valueOf();
                if ((c25479ixWValueOf5 != null ? c25479ixWValueOf5.AEQbTJ() : null) != null && !ixa.isConnected()) {
                    c25479ixWValueOf = C25479ixW.copy$default(ixa.valueOf(), null, 6, null, 5, null);
                } else {
                    c25479ixWValueOf = ixa.valueOf();
                }
                OLrzqt(c25479ixWValueOf);
            }
        }
        interfaceC27453jvVValueOf.EZpvd().setVisibility(ixa.AkhnZx() ? 4 : 0);
        interfaceC27453jvVValueOf.KWHzl().setVisibility(ixa.AkhnZx() ? 4 : 0);
        android.widget.TextView textViewKWHzl = interfaceC27453jvVValueOf.KWHzl();
        if (ixa.AkhnZx()) {
            interfaceC27453jvVValueOf.EZpvd().KWHzl(0L);
            strAEQbTJ = "";
        } else {
            interfaceC27453jvVValueOf.EZpvd().copydefault();
            strAEQbTJ = ixa.AEQbTJ();
        }
        textViewKWHzl.setText(strAEQbTJ);
    }

    public final void OLrzqt(C25479ixW c25479ixW) {
        if (c25479ixW == null) {
            return;
        }
        if (!c25479ixW.OLrzqt()) {
            if (c25479ixW.EZpvd() == 9 && c25479ixW.AEQbTJ() != null && (!c25479ixW.AEQbTJ().getDisappearAfterInput() || !C33129mqd.AhwBna(C33129mqd.EZpvd(EZpvd().valueOf()), BigDecimal.ZERO))) {
                EZpvd(c25479ixW);
                return;
            } else {
                valueOf().copydefault().setText(c25479ixW.KWHzl());
                return;
            }
        }
        if (c25479ixW.EZpvd() == 6 || c25479ixW.EZpvd() == 8) {
            EZpvd(c25479ixW);
        }
    }

    public final void EZpvd(C25479ixW c25479ixW) {
        InterfaceC27453jvV interfaceC27453jvVValueOf = valueOf();
        InvestTipInfoVo investTipInfoVoAEQbTJ = c25479ixW.AEQbTJ();
        if ((investTipInfoVoAEQbTJ != null ? investTipInfoVoAEQbTJ.getClickAction() : null) == InvestClickActionType.NO_ACTION) {
            interfaceC27453jvVValueOf.copydefault().setTextColor(ContextCompat.getColor(getContext(), c25479ixW.copydefault()));
            interfaceC27453jvVValueOf.copydefault().setText(c25479ixW.AEQbTJ().getTipContent());
            interfaceC27453jvVValueOf.copydefault().setOnClickListener(null);
        } else {
            int color = ContextCompat.getColor(getContext(), c25479ixW.copydefault());
            InvestTipInfoVo investTipInfoVoAEQbTJ2 = c25479ixW.AEQbTJ();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder((investTipInfoVoAEQbTJ2 != null ? investTipInfoVoAEQbTJ2.getTipContent() : null) + " ");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
            android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            if (drawableMutate != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iCopydefault = C55298xhM.copydefault(16.0f, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawableMutate.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context2));
                DrawableCompat.setTint(drawableMutate, color);
            }
            if (drawableMutate != null) {
                spannableStringBuilder.append(" ", new mAB(drawableMutate, 0, 2, null), 33);
            }
            interfaceC27453jvVValueOf.copydefault().setTextColor(color);
            interfaceC27453jvVValueOf.copydefault().setText(spannableStringBuilder);
            android.content.Context context3 = getContext();
            if (context3 != null) {
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                android.widget.TextView textViewCopydefault = interfaceC27453jvVValueOf.copydefault();
                InvestTipInfoVo investTipInfoVoAEQbTJ3 = c25479ixW.AEQbTJ();
                Intrinsics.copydefault(investTipInfoVoAEQbTJ3);
                c27569jxf.AEQbTJ(context3, null, textViewCopydefault, investTipInfoVoAEQbTJ3, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            }
        }
        interfaceC27453jvVValueOf.copydefault().setVisibility(0);
    }

    public final void setMaxTag() {
        valueOf().OLrzqt().setTag(valueOf().OLrzqt().getId(), java.lang.Boolean.TRUE);
    }

    public final boolean KWHzl(C55033xcM c55033xcM) {
        java.lang.Object tag = c55033xcM.getTag(valueOf().OLrzqt().getId());
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void OLrzqt(C55033xcM c55033xcM) {
        c55033xcM.setTag(valueOf().OLrzqt().getId(), java.lang.Boolean.FALSE);
    }
}
