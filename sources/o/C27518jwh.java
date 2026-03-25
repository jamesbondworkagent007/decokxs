package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27518jwh extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public InterfaceC27525jwo AEQbTJ;
    public boolean AYXKKw;
    public boolean EZpvd;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> KWHzl;
    public InterfaceC27520jwj copydefault;
    public iXA djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27518jwh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27518jwh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final iXA KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenInputListeners(@NotNull InterfaceC27520jwj interfaceC27520jwj) {
        Intrinsics.checkNotNullParameter(interfaceC27520jwj, "");
        this.copydefault = interfaceC27520jwj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:54) call: o.jwh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27518jwh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27518jwh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new Function2() { // from class: o.jwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27518jwh.EZpvd(this.AEQbTJ, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        AYXKKw();
    }

    /* JADX INFO: renamed from: o.jwh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jwh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final InterfaceC27525jwo AEQbTJ() {
        InterfaceC27525jwo c27527jwq;
        if (this.AEQbTJ == null) {
            if (this.AYXKKw) {
                C23903iNp c23903iNpEZpvd = C23903iNp.EZpvd(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(c23903iNpEZpvd, "");
                c27527jwq = new C27534jwx(c23903iNpEZpvd);
            } else {
                C23904iNq c23904iNqEZpvd = C23904iNq.EZpvd(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(c23904iNqEZpvd, "");
                c27527jwq = new C27527jwq(c23904iNqEZpvd);
            }
            this.AEQbTJ = c27527jwq;
        }
        InterfaceC27525jwo interfaceC27525jwo = this.AEQbTJ;
        Intrinsics.copydefault(interfaceC27525jwo);
        return interfaceC27525jwo;
    }

    public static final Unit EZpvd(C27518jwh c27518jwh, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c27518jwh.AEQbTJ().EZpvd(charSequence, c27518jwh.EZpvd().getTokenSymbol(), !c27518jwh.EZpvd);
        boolean zOLrzqt = c27518jwh.OLrzqt(c55033xcM);
        c27518jwh.KWHzl(c55033xcM);
        InterfaceC27520jwj interfaceC27520jwj = c27518jwh.copydefault;
        if (interfaceC27520jwj != null) {
            interfaceC27520jwj.AEQbTJ(c55033xcM.valueOf(), c27518jwh.EZpvd(), zOLrzqt);
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        removeAllViews();
        addView(AEQbTJ().copydefault());
        InterfaceC27525jwo interfaceC27525jwoAEQbTJ = AEQbTJ();
        C55033xcM c55033xcMEZpvd = interfaceC27525jwoAEQbTJ.EZpvd();
        android.content.Context context = c55033xcMEZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55033xcMEZpvd.setMinHeight(C55298xhM.OLrzqt(72, context));
        c55033xcMEZpvd.setMaxDecimalValue(6);
        c55033xcMEZpvd.setMaxIntegerLength(26);
        c55033xcMEZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27518jwh.setUpViews$lambda$4$lambda$2$lambda$1(this.OLrzqt, view);
            }
        });
        c55033xcMEZpvd.setOnTextWillChange(this.KWHzl);
        android.content.Context context2 = c55033xcMEZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TextViewCompat.setLineHeight(c55033xcMEZpvd, C55298xhM.OLrzqt(50, context2));
        if (this.AYXKKw) {
            c55033xcMEZpvd.setGravity(TextAlign.LEFT);
            c55033xcMEZpvd.setTextAppearance(C25493ixk.Dialog.EZpvd);
        }
        interfaceC27525jwoAEQbTJ.OLrzqt().setClickListener(new View.OnClickListener() { // from class: o.jwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27518jwh.setUpViews$lambda$4$lambda$3(this.OLrzqt, view);
            }
        });
    }

    public static final void setUpViews$lambda$4$lambda$2$lambda$1(C27518jwh c27518jwh, android.view.View view) {
        InterfaceC27520jwj interfaceC27520jwj = c27518jwh.copydefault;
        if (interfaceC27520jwj != null) {
            interfaceC27520jwj.wlaJM();
        }
    }

    public static final void setUpViews$lambda$4$lambda$3(C27518jwh c27518jwh, android.view.View view) {
        InterfaceC27520jwj interfaceC27520jwj = c27518jwh.copydefault;
        if (interfaceC27520jwj != null) {
            interfaceC27520jwj.uzCIH();
        }
    }

    public final void copydefault(boolean z) {
        if (this.AYXKKw != z) {
            this.AYXKKw = z;
            this.AEQbTJ = null;
            AYXKKw();
        }
    }

    public final void setData(@NotNull iXA ixa, @NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(ixa, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        this.djBIcL = ixa;
        setupSingleTokenInput(ixa, transactionConfig);
    }

    public final void AEQbTJ(boolean z) {
        iXA ixaKWHzl;
        if (this.EZpvd != z) {
            this.EZpvd = z;
            AEQbTJ().EZpvd(AEQbTJ().EZpvd().valueOf(), EZpvd().getTokenSymbol(), !z);
            if (!this.AYXKKw || (ixaKWHzl = KWHzl()) == null) {
                return;
            }
            C25479ixW c25479ixWValueOf = ixaKWHzl.valueOf();
            AEQbTJ(ixaKWHzl.AEQbTJ((1032191 & 1) != 0 ? ixaKWHzl.AuCTel : null, (1032191 & 2) != 0 ? ixaKWHzl.DbNXlk : false, (1032191 & 4) != 0 ? ixaKWHzl.copydefault : null, (1032191 & 8) != 0 ? ixaKWHzl.AYXKKw : null, (1032191 & 16) != 0 ? ixaKWHzl.ejfBZ : null, (1032191 & 32) != 0 ? ixaKWHzl.fARcdN : null, (1032191 & 64) != 0 ? ixaKWHzl.djBIcL : null, (1032191 & 128) != 0 ? ixaKWHzl.EZpvd : 0, (1032191 & 256) != 0 ? ixaKWHzl.fIwbmz : 0, (1032191 & 512) != 0 ? ixaKWHzl.AkhnZx : false, (1032191 & 1024) != 0 ? ixaKWHzl.values : false, (1032191 & 2048) != 0 ? ixaKWHzl.fJNWhG : null, (1032191 & 4096) != 0 ? ixaKWHzl.KWHzl : null, (1032191 & 8192) != 0 ? ixaKWHzl.AEQbTJ : null, (1032191 & 16384) != 0 ? ixaKWHzl.isConnected : c25479ixWValueOf != null ? C25479ixW.copy$default(c25479ixWValueOf, "", -1, null, 4, null) : null, (1032191 & 32768) != 0 ? ixaKWHzl.AhwBna : false, (1032191 & 65536) != 0 ? ixaKWHzl.valueOf : false, (1032191 & 131072) != 0 ? ixaKWHzl.OLrzqt : false, (1032191 & 262144) != 0 ? ixaKWHzl.fetchVPNInfo : false, (1032191 & 524288) != 0 ? ixaKWHzl.gEmmrt : false));
        }
    }

    public final C55033xcM copydefault() {
        return AEQbTJ().EZpvd();
    }

    public final void OLrzqt() {
        AEQbTJ().AEQbTJ().setVisibility(this.AYXKKw ? 0 : 8);
        OLrzqt(new C25479ixW(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DrNnAm), 0, null, 6, null));
    }

    public final int OLrzqt(TransactionConfig transactionConfig) {
        if (transactionConfig.AuCTelauCTel()) {
            java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
            if (numFJNWhG != null && numFJNWhG.intValue() == 0) {
                return C25493ixk.FragmentManager.fVjYLc;
            }
            if (numFJNWhG != null && numFJNWhG.intValue() == 1) {
                return C25493ixk.FragmentManager.hNurIN;
            }
            if (numFJNWhG != null) {
                numFJNWhG.intValue();
            }
            return C25493ixk.FragmentManager.QfJbVf;
        }
        InvestOrder investOrderAhwBna = transactionConfig.AhwBna();
        return (investOrderAhwBna == null || !Intrinsics.EZpvd(investOrderAhwBna.getRedeemNeedUnbond(), java.lang.Boolean.TRUE)) ? transactionConfig.AxsJAY() ? transactionConfig.gHZMYf() ? C25493ixk.FragmentManager.DCJXGO : C25493ixk.FragmentManager.DCUTEI : transactionConfig.getFieldNames() ? C25493ixk.FragmentManager.OqFWZa : C25493ixk.FragmentManager.zuWLRA : C25493ixk.FragmentManager.gkZNMa;
    }

    public final void setupSingleTokenInput(iXA ixa, TransactionConfig transactionConfig) {
        InterfaceC27525jwo interfaceC27525jwoAEQbTJ = AEQbTJ();
        C27308jsj c27308jsjOLrzqt = interfaceC27525jwoAEQbTJ.OLrzqt();
        c27308jsjOLrzqt.setVisibility((transactionConfig.fIwbmz() == 1 || transactionConfig.fIwbmz() == 13 || this.AYXKKw) ? 0 : 8);
        c27308jsjOLrzqt.setData(new C25536iya(ixa.values(), ixa.AhwBna(), transactionConfig.wlaJM() && ixa.AuCTel(), ixa.fIwbmz(), OLrzqt(transactionConfig)));
        C55033xcM c55033xcMEZpvd = interfaceC27525jwoAEQbTJ.EZpvd();
        c55033xcMEZpvd.setMaxDecimalValue(ixa.AhwBna());
        if (ixa.fetchVPNInfo() || (ixa.DbNXlk() && c55033xcMEZpvd.valueOf().length() == 0)) {
            c55033xcMEZpvd.setPlainNumericText(ixa.DbNXlk() ? ixa.KWHzl() : "0");
        }
        c55033xcMEZpvd.setOnTextWillChange(this.KWHzl);
        if (this.AYXKKw) {
            AEQbTJ(ixa);
            return;
        }
        interfaceC27525jwoAEQbTJ.AEQbTJ().setVisibility(0);
        interfaceC27525jwoAEQbTJ.AEQbTJ().setText(ixa.AEQbTJ());
        OLrzqt(ixa.valueOf());
    }

    private final InvestTokenWithAmount EZpvd() {
        InvestTokenWithAmount investTokenWithAmountValues;
        iXA ixa = this.djBIcL;
        return (ixa == null || (investTokenWithAmountValues = ixa.values()) == null) ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmountValues;
    }

    public final void AEQbTJ(iXA ixa) {
        InterfaceC27525jwo interfaceC27525jwoAEQbTJ = AEQbTJ();
        C25479ixW c25479ixWValueOf = ixa.valueOf();
        if (c25479ixWValueOf != null && c25479ixWValueOf.OLrzqt() && (C33129mqd.OLrzqt((java.lang.CharSequence) ixa.valueOf().KWHzl()) || ixa.valueOf().AEQbTJ() != null)) {
            OLrzqt(ixa.valueOf());
            return;
        }
        interfaceC27525jwoAEQbTJ.AEQbTJ().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        interfaceC27525jwoAEQbTJ.AEQbTJ().setText(ixa.AEQbTJ());
        interfaceC27525jwoAEQbTJ.AEQbTJ().setVisibility((ixa.fetchVPNInfo() || ixa.AkhnZx() || !C33129mqd.AEQbTJ(interfaceC27525jwoAEQbTJ.EZpvd().valueOf(), "0")) ? 8 : 0);
    }

    private final void OLrzqt(C25479ixW c25479ixW) {
        if (c25479ixW == null) {
            return;
        }
        if (c25479ixW.EZpvd() == 6 || c25479ixW.EZpvd() == 8 || (c25479ixW.EZpvd() == 9 && c25479ixW.AEQbTJ() != null && (!c25479ixW.AEQbTJ().getDisappearAfterInput() || !C33129mqd.AhwBna(C33129mqd.EZpvd(copydefault().valueOf()), BigDecimal.ZERO)))) {
            copydefault(c25479ixW);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) c25479ixW.KWHzl())) {
            showNormalMessage$default(this, c25479ixW.KWHzl(), 0, 2, null);
        }
    }

    private final void copydefault(C25479ixW c25479ixW) {
        InterfaceC27525jwo interfaceC27525jwoAEQbTJ = AEQbTJ();
        InvestTipInfoVo investTipInfoVoAEQbTJ = c25479ixW.AEQbTJ();
        if ((investTipInfoVoAEQbTJ != null ? investTipInfoVoAEQbTJ.getClickAction() : null) == InvestClickActionType.NO_ACTION) {
            interfaceC27525jwoAEQbTJ.KWHzl().setTextColor(ContextCompat.getColor(getContext(), c25479ixW.copydefault()));
            interfaceC27525jwoAEQbTJ.KWHzl().setText(c25479ixW.AEQbTJ().getTipContent());
            interfaceC27525jwoAEQbTJ.KWHzl().setOnClickListener(null);
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
            interfaceC27525jwoAEQbTJ.KWHzl().setTextColor(color);
            interfaceC27525jwoAEQbTJ.KWHzl().setText(spannableStringBuilder);
            android.content.Context context3 = getContext();
            if (context3 != null) {
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                android.widget.TextView textViewKWHzl = interfaceC27525jwoAEQbTJ.KWHzl();
                InvestTipInfoVo investTipInfoVoAEQbTJ3 = c25479ixW.AEQbTJ();
                Intrinsics.copydefault(investTipInfoVoAEQbTJ3);
                c27569jxf.AEQbTJ(context3, null, textViewKWHzl, investTipInfoVoAEQbTJ3, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            }
        }
        interfaceC27525jwoAEQbTJ.KWHzl().setVisibility(0);
    }

    public static /* synthetic */ void showNormalMessage$default(C27518jwh c27518jwh, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fhUrPt;
        }
        c27518jwh.copydefault(str, i);
    }

    public final void copydefault(java.lang.String str, int i) {
        InterfaceC27525jwo interfaceC27525jwoAEQbTJ = AEQbTJ();
        interfaceC27525jwoAEQbTJ.KWHzl().setTextColor(ContextCompat.getColor(getContext(), i));
        interfaceC27525jwoAEQbTJ.KWHzl().setText(str);
        interfaceC27525jwoAEQbTJ.KWHzl().setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
        interfaceC27525jwoAEQbTJ.KWHzl().setOnClickListener(null);
    }

    public final void setMaxTag() {
        AEQbTJ().EZpvd().setTag(AEQbTJ().EZpvd().getId(), java.lang.Boolean.TRUE);
    }

    private final boolean OLrzqt(C55033xcM c55033xcM) {
        java.lang.Object tag = c55033xcM.getTag(AEQbTJ().EZpvd().getId());
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void KWHzl(C55033xcM c55033xcM) {
        c55033xcM.setTag(AEQbTJ().EZpvd().getId(), java.lang.Boolean.FALSE);
    }
}
