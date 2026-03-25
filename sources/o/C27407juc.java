package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27407juc extends android.widget.LinearLayout {
    public InterfaceC27520jwj AEQbTJ;
    public iXA EZpvd;
    public TransactionConfig KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27407juc(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27407juc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final iXA OLrzqt() {
        return this.EZpvd;
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.juc.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27407juc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27407juc(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27407juc.OLrzqt(context, this);
            }
        });
        final C27250jre c27250jre = copydefault().EZpvd;
        c27250jre.setDelayContentTextWatcher(new Function1() { // from class: o.juh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27407juc.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
        c27250jre.setContentTextWatcher(new Function1() { // from class: o.juf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27407juc.copydefault(c27250jre, (java.lang.String) obj);
            }
        });
    }

    private final C23900iNm copydefault() {
        return (C23900iNm) this.OLrzqt.getValue();
    }

    public static final C23900iNm OLrzqt(android.content.Context context, C27407juc c27407juc) {
        return C23900iNm.KWHzl(android.view.LayoutInflater.from(context), c27407juc, true);
    }

    public static final Unit copydefault(C27407juc c27407juc, java.lang.String str) {
        InvestTokenWithAmount investTokenWithAmountValues;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strDivS$default = C33129mqd.divS$default(str, 100, null, null, null, 14, null);
        InterfaceC27520jwj interfaceC27520jwj = c27407juc.AEQbTJ;
        if (interfaceC27520jwj != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(strDivS$default);
            iXA ixaOLrzqt = c27407juc.OLrzqt();
            InterfaceC27520jwj.onInputChange$default(interfaceC27520jwj, strGEmmrt, (ixaOLrzqt == null || (investTokenWithAmountValues = ixaOLrzqt.values()) == null) ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmountValues, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C27250jre c27250jre, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27250jre.updateAmountAndUI$default(c27250jre, C33129mqd.AhwBna(str), false, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setData$default(C27407juc c27407juc, iXA ixa, TransactionConfig transactionConfig, TransactionStage transactionStage, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            transactionStage = TransactionStage.INPUT;
        }
        c27407juc.setData(ixa, transactionConfig, transactionStage);
    }

    public final void setData(@NotNull iXA ixa, @NotNull TransactionConfig transactionConfig, @NotNull TransactionStage transactionStage) {
        Intrinsics.checkNotNullParameter(ixa, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(transactionStage, "");
        this.KWHzl = transactionConfig;
        this.EZpvd = ixa;
        C23900iNm c23900iNmCopydefault = copydefault();
        android.widget.TextView textView = c23900iNmCopydefault.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        TransactionStage transactionStage2 = TransactionStage.INPUT;
        textView.setVisibility(transactionStage == transactionStage2 ? 0 : 8);
        C27250jre c27250jre = c23900iNmCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c27250jre, "");
        c27250jre.setVisibility(transactionStage == transactionStage2 ? 0 : 8);
        InvestTokenWithAmount investTokenWithAmount = ixa.AYXKKw().isEmpty() ^ true ? ixa.AYXKKw().get(0) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        InvestTokenWithAmount investTokenWithAmount2 = C33129mqd.AEQbTJ(java.lang.Integer.valueOf(ixa.AYXKKw().size()), 1) ? ixa.AYXKKw().get(1) : new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
        c23900iNmCopydefault.copydefault.setText(ixa.gEmmrt());
        if (ixa.fetchVPNInfo()) {
            c23900iNmCopydefault.EZpvd.setAmountDirect(C33129mqd.AhwBna(ixa.KWHzl()));
        }
        C27228jrI c27228jrI = c23900iNmCopydefault.OLrzqt;
        boolean zFetchVPNInfo = ixa.fetchVPNInfo();
        C25479ixW c25479ixWValueOf = ixa.valueOf();
        c27228jrI.setData(investTokenWithAmount, investTokenWithAmount2, zFetchVPNInfo, C33129mqd.OLrzqt((java.lang.CharSequence) (c25479ixWValueOf != null ? c25479ixWValueOf.KWHzl() : null)), transactionStage != transactionStage2);
        AEQbTJ(!ixa.fetchVPNInfo() && ixa.AkhnZx());
        OLrzqt(ixa);
    }

    public final void AEQbTJ(boolean z) {
        C23900iNm c23900iNmCopydefault = copydefault();
        if (z) {
            c23900iNmCopydefault.OLrzqt.EZpvd();
        } else {
            c23900iNmCopydefault.OLrzqt.copydefault();
        }
    }

    public final void OLrzqt(iXA ixa) {
        InvestTipInfoVo investTipInfoVoCopy;
        C23900iNm c23900iNmCopydefault = copydefault();
        OKReminder oKReminder = c23900iNmCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(ixa.valueOf() != null ? 0 : 8);
        C25479ixW c25479ixWValueOf = ixa.valueOf();
        if ((c25479ixWValueOf != null ? c25479ixWValueOf.AEQbTJ() : null) != null) {
            int iEZpvd = ixa.valueOf().EZpvd();
            if (iEZpvd == 6) {
                InvestTipInfoVo investTipInfoVoAEQbTJ = ixa.valueOf().AEQbTJ();
                investTipInfoVoCopy = investTipInfoVoAEQbTJ.copy((1022 & 1) != 0 ? investTipInfoVoAEQbTJ.clickAction : null, (1022 & 2) != 0 ? investTipInfoVoAEQbTJ.customRedirectData : null, (1022 & 4) != 0 ? investTipInfoVoAEQbTJ.hoverOnData : null, (1022 & 8) != 0 ? investTipInfoVoAEQbTJ.popUpData : null, (1022 & 16) != 0 ? investTipInfoVoAEQbTJ.redirectData : null, (1022 & 32) != 0 ? investTipInfoVoAEQbTJ.tipContent : null, (1022 & 64) != 0 ? investTipInfoVoAEQbTJ.type : "2", (1022 & 128) != 0 ? investTipInfoVoAEQbTJ.disappearAfterInput : false, (1022 & 256) != 0 ? investTipInfoVoAEQbTJ.title : null, (1022 & 512) != 0 ? investTipInfoVoAEQbTJ.contentType : null);
            } else if (iEZpvd == 7) {
                InvestTipInfoVo investTipInfoVoAEQbTJ2 = ixa.valueOf().AEQbTJ();
                investTipInfoVoCopy = investTipInfoVoAEQbTJ2.copy((1022 & 1) != 0 ? investTipInfoVoAEQbTJ2.clickAction : null, (1022 & 2) != 0 ? investTipInfoVoAEQbTJ2.customRedirectData : null, (1022 & 4) != 0 ? investTipInfoVoAEQbTJ2.hoverOnData : null, (1022 & 8) != 0 ? investTipInfoVoAEQbTJ2.popUpData : null, (1022 & 16) != 0 ? investTipInfoVoAEQbTJ2.redirectData : null, (1022 & 32) != 0 ? investTipInfoVoAEQbTJ2.tipContent : null, (1022 & 64) != 0 ? investTipInfoVoAEQbTJ2.type : "1", (1022 & 128) != 0 ? investTipInfoVoAEQbTJ2.disappearAfterInput : false, (1022 & 256) != 0 ? investTipInfoVoAEQbTJ2.title : null, (1022 & 512) != 0 ? investTipInfoVoAEQbTJ2.contentType : null);
            } else {
                investTipInfoVoCopy = ixa.valueOf().AEQbTJ();
            }
            C27569jxf.OLrzqt.copydefault(c23900iNmCopydefault.KWHzl, investTipInfoVoCopy);
        }
    }
}
