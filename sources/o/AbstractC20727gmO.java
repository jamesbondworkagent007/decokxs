package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.OkTransactionPreparationResult;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20792gna;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C21205gvP;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20727gmO<T extends AbstractC20792gna> extends AbstractC20518giR {
    public AbstractC16654enx EZpvd;
    public T valueOf;
    public java.lang.String OLrzqt = "";
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> AEQbTJ = new Function2() { // from class: o.gmR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return AbstractC20727gmO.OLrzqt(this.copydefault, (C55033xcM) obj, (java.lang.CharSequence) obj2);
        }
    };
    public java.lang.String KWHzl = "";

    /* JADX INFO: renamed from: o.gmO$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public abstract void AYXKKw();

    public abstract void AkhnZx();

    public abstract void EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC16654enx abstractC16654enx) {
        Intrinsics.checkNotNullParameter(abstractC16654enx, "");
        this.EZpvd = abstractC16654enx;
    }

    public abstract void KWHzl(@NotNull OkTransactionPreparationResult okTransactionPreparationResult);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.valueOf = t;
    }

    public abstract void isConnected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.KWHzl;
    }

    public abstract boolean valueOf(boolean z);

    public final T djBIcL() {
        T t = this.valueOf;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final AbstractC16654enx gEmmrt() {
        AbstractC16654enx abstractC16654enx = this.EZpvd;
        if (abstractC16654enx != null) {
            return abstractC16654enx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final Unit OLrzqt(AbstractC20727gmO abstractC20727gmO, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (c55033xcM.AEQbTJ() != 0) {
            java.lang.String strValueOf = c55033xcM.valueOf();
            if (abstractC20727gmO.djBIcL().fetchVPNInfo()) {
                AbstractC20792gna abstractC20792gnaDjBIcL = abstractC20727gmO.djBIcL();
                C12623cqV c12623cqVEZpvd = abstractC20727gmO.djBIcL().EZpvd();
                abstractC20792gnaDjBIcL.KWHzl(c12623cqVEZpvd != null ? c12623cqVEZpvd.KWHzl(strValueOf) : null);
                abstractC20727gmO.djBIcL().AEQbTJ(strValueOf);
            } else {
                abstractC20727gmO.djBIcL().KWHzl(strValueOf);
                AbstractC20792gna abstractC20792gnaDjBIcL2 = abstractC20727gmO.djBIcL();
                C12623cqV c12623cqVEZpvd2 = abstractC20727gmO.djBIcL().EZpvd();
                abstractC20792gnaDjBIcL2.AEQbTJ(c12623cqVEZpvd2 != null ? c12623cqVEZpvd2.OLrzqt(strValueOf) : null);
            }
            updateAmountAndCurrencyUI$default(abstractC20727gmO, charSequence, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        EZpvd((AbstractC16654enx) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.invokespecialROgMPW, viewGroup, false));
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("from_address")) == null) {
            string = "";
        }
        this.KWHzl = string;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AEQbTJ(context);
        AkhnZx();
        AYXKKw();
        AhwBna();
        ejfBZ();
        return gEmmrt().getRoot();
    }

    public final void AEQbTJ(android.content.Context context) {
        gEmmrt().isConnected.setGravity(TextAlign.LEFT);
        gEmmrt().isConnected.setTextAlignment(5);
        gEmmrt().isConnected.setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.EZpvd));
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt().values.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        fIwbmz();
        C32866mlf.onEvent$default("SendSetAmount_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void AhwBna() {
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(gEmmrt().copydefault);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20727gmO.valueOf(this.KWHzl, obj);
            }
        });
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(gEmmrt().AEQbTJ).throttleFirst(300L, java.util.concurrent.TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.gmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20727gmO.djBIcL(this.OLrzqt, obj);
            }
        });
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst3 = C8003auW.copydefault(gEmmrt().AYXKKw).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst3, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst3, this).subscribe(new InterfaceC58227yxM() { // from class: o.gmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20727gmO.AYXKKw(this.AEQbTJ, obj);
            }
        });
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst4 = C8003auW.copydefault(gEmmrt().fetchVPNInfo).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst4, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst4, this).subscribe(new InterfaceC58227yxM() { // from class: o.gnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20727gmO.AhwBna(this.copydefault, obj);
            }
        });
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst5 = C8003auW.copydefault(gEmmrt().DbNXlk).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst5, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst5, this).subscribe(new InterfaceC58227yxM() { // from class: o.gne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20727gmO.gEmmrt(this.KWHzl, obj);
            }
        });
    }

    public static final void valueOf(AbstractC20727gmO abstractC20727gmO, java.lang.Object obj) {
        abstractC20727gmO.isConnected();
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "next_step");
    }

    public static final void djBIcL(AbstractC20727gmO abstractC20727gmO, java.lang.Object obj) {
        if (abstractC20727gmO.djBIcL().values()) {
            abstractC20727gmO.djBIcL().AEQbTJ(!abstractC20727gmO.djBIcL().fetchVPNInfo());
            abstractC20727gmO.values();
        }
    }

    public static final void AYXKKw(AbstractC20727gmO abstractC20727gmO, java.lang.Object obj) {
        if (!abstractC20727gmO.djBIcL().values() || abstractC20727gmO.djBIcL().fetchVPNInfo()) {
            return;
        }
        abstractC20727gmO.AuCTel();
    }

    public static final void AhwBna(AbstractC20727gmO abstractC20727gmO, java.lang.Object obj) {
        if (abstractC20727gmO.djBIcL().values() && abstractC20727gmO.djBIcL().fetchVPNInfo()) {
            abstractC20727gmO.AuCTel();
        }
    }

    public static final void gEmmrt(AbstractC20727gmO abstractC20727gmO, java.lang.Object obj) {
        if (abstractC20727gmO.djBIcL().values() && abstractC20727gmO.djBIcL().fetchVPNInfo()) {
            abstractC20727gmO.AuCTel();
        }
    }

    private final void ejfBZ() {
        djBIcL().valueOf().observe(this, new StateListAnimator(new Function1() { // from class: o.gmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20727gmO.KWHzl(this.OLrzqt, (OkTransactionPreparationResult) obj);
            }
        }));
        djBIcL().AkhnZx().observe(this, new StateListAnimator(new Function1() { // from class: o.gmS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20727gmO.KWHzl(this.EZpvd, (Triple) obj);
            }
        }));
    }

    public static final Unit KWHzl(AbstractC20727gmO abstractC20727gmO, OkTransactionPreparationResult okTransactionPreparationResult) {
        if (okTransactionPreparationResult == null) {
            return Unit.INSTANCE;
        }
        abstractC20727gmO.dismissLoading();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC20727gmO, true, (java.lang.String) null, 2, (java.lang.Object) null);
        abstractC20727gmO.KWHzl(okTransactionPreparationResult);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC20727gmO abstractC20727gmO, Triple triple) {
        if (abstractC20727gmO.isDetached()) {
            return Unit.INSTANCE;
        }
        abstractC20727gmO.EZpvd(((java.lang.Number) triple.getFirst()).intValue(), ((java.lang.Boolean) triple.getSecond()).booleanValue());
        return Unit.INSTANCE;
    }

    public final void values() {
        if (djBIcL().fetchVPNInfo()) {
            gEmmrt().isConnected.setMaxDecimalLength(djBIcL().OLrzqt());
            AbstractC12609cqH abstractC12609cqHGEmmrt = djBIcL().gEmmrt();
            if (abstractC12609cqHGEmmrt == null || !abstractC12609cqHGEmmrt.wlaJM()) {
                java.lang.String strKWHzl = C54862xYb.KWHzl(C33129mqd.EZpvd(djBIcL().djBIcL()), false, java.lang.Integer.valueOf(djBIcL().OLrzqt()), RoundingMode.DOWN);
                AbstractC20792gna abstractC20792gnaDjBIcL = djBIcL();
                C12623cqV c12623cqVEZpvd = djBIcL().EZpvd();
                abstractC20792gnaDjBIcL.KWHzl(c12623cqVEZpvd != null ? c12623cqVEZpvd.KWHzl(strKWHzl) : null);
                djBIcL().AEQbTJ(strKWHzl);
            }
        } else {
            gEmmrt().isConnected.setMaxDecimalLength(djBIcL().KWHzl());
            AbstractC12609cqH abstractC12609cqHGEmmrt2 = djBIcL().gEmmrt();
            if (abstractC12609cqHGEmmrt2 == null || !abstractC12609cqHGEmmrt2.wlaJM()) {
                java.lang.String strKWHzl2 = C54862xYb.KWHzl(C33129mqd.EZpvd(djBIcL().AYXKKw()), false, java.lang.Integer.valueOf(djBIcL().KWHzl()), RoundingMode.DOWN);
                djBIcL().KWHzl(strKWHzl2);
                AbstractC20792gna abstractC20792gnaDjBIcL2 = djBIcL();
                C12623cqV c12623cqVEZpvd2 = djBIcL().EZpvd();
                abstractC20792gnaDjBIcL2.AEQbTJ(c12623cqVEZpvd2 != null ? c12623cqVEZpvd2.OLrzqt(strKWHzl2) : null);
            }
        }
        updateAmountAndCurrencyUI$default(this, null, true, 1, null);
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "switch");
    }

    public final void EZpvd(@NotNull OkTransactionPreparationResult okTransactionPreparationResult) {
        java.lang.String valuation;
        java.lang.String amount;
        java.lang.String amount2;
        Intrinsics.checkNotNullParameter(okTransactionPreparationResult, "");
        gEmmrt().isConnected.setOnTextWillChange(this.AEQbTJ);
        gEmmrt().KWHzl.setEditable(gEmmrt().isConnected.KWHzl());
        if (djBIcL().values()) {
            android.widget.ImageView imageView = gEmmrt().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            AppCompatTextView appCompatTextView = gEmmrt().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            AppCompatTextView appCompatTextView2 = gEmmrt().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
        } else {
            android.widget.ImageView imageView2 = gEmmrt().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            AppCompatTextView appCompatTextView3 = gEmmrt().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            AppCompatTextView appCompatTextView4 = gEmmrt().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
        if (!djBIcL().values()) {
            djBIcL().AEQbTJ(true);
        }
        java.lang.String str = "0";
        if (djBIcL().fetchVPNInfo()) {
            TransactionInfo transactionInfoAhwBna = djBIcL().AhwBna();
            if (transactionInfoAhwBna != null && (amount2 = transactionInfoAhwBna.getAmount()) != null) {
                str = amount2;
            }
            gEmmrt().isConnected.setMaxDecimalLength(djBIcL().OLrzqt());
            AbstractC20792gna abstractC20792gnaDjBIcL = djBIcL();
            C12623cqV calculator = okTransactionPreparationResult.getCalculator();
            abstractC20792gnaDjBIcL.KWHzl(calculator != null ? calculator.KWHzl(str) : null);
            djBIcL().AEQbTJ(str);
        } else {
            gEmmrt().isConnected.setMaxDecimalLength(djBIcL().KWHzl());
            TransactionInfo transactionInfoAhwBna2 = djBIcL().AhwBna();
            if (transactionInfoAhwBna2 == null || (valuation = transactionInfoAhwBna2.getValuation()) == null) {
                valuation = "0";
            }
            TransactionInfo transactionInfoAhwBna3 = djBIcL().AhwBna();
            if (transactionInfoAhwBna3 != null && (amount = transactionInfoAhwBna3.getAmount()) != null) {
                str = amount;
            }
            C12623cqV calculator2 = okTransactionPreparationResult.getCalculator();
            java.lang.String strOLrzqt = calculator2 != null ? calculator2.OLrzqt(valuation) : null;
            djBIcL().KWHzl(valuation);
            if (C33129mqd.AEQbTJ(str, 0)) {
                java.lang.String strDivS$default = C33129mqd.divS$default(strOLrzqt, str, null, null, null, 14, null);
                if (!C33129mqd.valueOf(strDivS$default, "1.02") || !C33129mqd.copydefault(strDivS$default, "0.98")) {
                    djBIcL().AEQbTJ(strOLrzqt);
                    fARcdN();
                } else {
                    djBIcL().AEQbTJ(str);
                }
            } else {
                djBIcL().AEQbTJ(strOLrzqt);
            }
        }
        updateAmountAndCurrencyUI$default(this, null, true, 1, null);
    }

    private final void fIwbmz() {
        int iOrdinal;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            showLoading();
            AbstractC20792gna abstractC20792gnaDjBIcL = djBIcL();
            java.lang.String string = arguments.getString("wallet_id");
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = arguments.getString("coinId");
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String string3 = arguments.getString(MTAnalysisConstants.Account.KEY_ACCOUNT);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String string4 = arguments.getString("deposit_limit");
            if (string4 == null) {
                string4 = "0";
            }
            java.lang.String string5 = arguments.getString("exchange_account_name");
            if (string5 == null) {
                string5 = "";
            }
            TransactionInfo transactionInfo = (TransactionInfo) arguments.getParcelable("data");
            java.lang.String string6 = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            if (string6 == null) {
                string6 = "";
            }
            TransactionType.TaskDescription taskDescription = TransactionType.Companion;
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                iOrdinal = arguments2.getInt("txType", TransactionType.TypeTransfer.ordinal());
            } else {
                iOrdinal = TransactionType.TypeTransfer.ordinal();
            }
            TransactionType transactionTypeCopydefault = taskDescription.copydefault(iOrdinal);
            java.lang.String str = this.KWHzl;
            TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo = new TxToastCheckBizAndPayloadInfo((java.lang.Integer) 0, (java.lang.String) null, 2, (DefaultConstructorMarker) null);
            java.lang.String string7 = arguments.getString("exchange_memo");
            if (string7 == null) {
                string7 = "";
            }
            AbstractC20792gna.initTransaction$default(abstractC20792gnaDjBIcL, string, string2, string3, string4, string5, transactionInfo, string6, transactionTypeCopydefault, null, null, 1, str, txToastCheckBizAndPayloadInfo, string7, null, null, 49920, null);
        }
    }

    public final void AYXKKw(boolean z) {
        if (gEmmrt().copydefault.isEnabled() != z) {
            gEmmrt().copydefault.setEnabled(z);
        }
    }

    public final void AuCTel() {
        C21205gvP c21205gvPNewInstance$default = C21205gvP.Application.newInstance$default(C21205gvP.Companion, djBIcL(false), null, 2, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c21205gvPNewInstance$default.KWHzl(childFragmentManager, "SwitchCurrencyBottomSheetDialog", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.gmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
            public final void copydefault(android.os.Bundle bundle) {
                AbstractC20727gmO.EZpvd(this.copydefault, bundle);
            }
        });
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "choose_flat_currency");
    }

    public static final void EZpvd(AbstractC20727gmO abstractC20727gmO, android.os.Bundle bundle) {
        WalletCurrencyBean walletCurrencyBean;
        if (bundle == null || (walletCurrencyBean = (WalletCurrencyBean) bundle.getParcelable("currencyData")) == null || C59449zhJ.gEmmrt(walletCurrencyBean.getIsoCode(), abstractC20727gmO.djBIcL(false), true)) {
            return;
        }
        int iMin = java.lang.Math.min(walletCurrencyBean.getMinPrecision(), abstractC20727gmO.djBIcL().KWHzl());
        C12623cqV c12623cqVEZpvd = abstractC20727gmO.djBIcL().EZpvd();
        if (c12623cqVEZpvd != null) {
            c12623cqVEZpvd.copydefault(walletCurrencyBean);
        }
        if (abstractC20727gmO.djBIcL().fetchVPNInfo()) {
            AbstractC20792gna abstractC20792gnaDjBIcL = abstractC20727gmO.djBIcL();
            C12623cqV c12623cqVEZpvd2 = abstractC20727gmO.djBIcL().EZpvd();
            abstractC20792gnaDjBIcL.KWHzl(c12623cqVEZpvd2 != null ? c12623cqVEZpvd2.KWHzl(abstractC20727gmO.djBIcL().djBIcL()) : null);
            updateAmountAndCurrencyUI$default(abstractC20727gmO, null, false, 3, null);
            return;
        }
        abstractC20727gmO.djBIcL().KWHzl(C54862xYb.KWHzl(C33129mqd.EZpvd(abstractC20727gmO.djBIcL().AYXKKw()), false, java.lang.Integer.valueOf(iMin), RoundingMode.DOWN));
        abstractC20727gmO.gEmmrt().isConnected.setMaxDecimalLength(abstractC20727gmO.djBIcL().KWHzl());
        AbstractC20792gna abstractC20792gnaDjBIcL2 = abstractC20727gmO.djBIcL();
        C12623cqV c12623cqVEZpvd3 = abstractC20727gmO.djBIcL().EZpvd();
        abstractC20792gnaDjBIcL2.AEQbTJ(c12623cqVEZpvd3 != null ? c12623cqVEZpvd3.OLrzqt(abstractC20727gmO.djBIcL().AYXKKw()) : null);
        updateAmountAndCurrencyUI$default(abstractC20727gmO, null, true, 1, null);
    }

    public final void fARcdN() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.apAOXX);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.DztXDE);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.OEgNct, new View.OnClickListener() { // from class: o.gmU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20727gmO.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHomeButtonEnabled);
        if (str.length() == 0) {
            str = strAYXKKw;
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        if (z) {
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DGUQLIdZmdUa, new View.OnClickListener() { // from class: o.gmP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20727gmO.copydefault(viewOnClickListenerC54939xaY, this, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.keySet, new View.OnClickListener() { // from class: o.gmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20727gmO.EZpvd(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractC20727gmO abstractC20727gmO, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractC20727gmO.fIwbmz();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractC20727gmO abstractC20727gmO, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        FragmentActivity activity = abstractC20727gmO.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static /* synthetic */ void updateAmountAndCurrencyUI$default(AbstractC20727gmO abstractC20727gmO, java.lang.CharSequence charSequence, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAmountAndCurrencyUI");
        }
        if ((i & 1) != 0) {
            charSequence = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC20727gmO.OLrzqt(charSequence, z);
    }

    public final void OLrzqt(@NotNull java.lang.CharSequence charSequence, boolean z) {
        AbstractC12609cqH abstractC12609cqHGEmmrt;
        Intrinsics.checkNotNullParameter(charSequence, "");
        gEmmrt().isConnected.setOnTextWillChange(null);
        boolean z2 = z || charSequence.length() > 0 || ((abstractC12609cqHGEmmrt = djBIcL().gEmmrt()) != null && abstractC12609cqHGEmmrt.wlaJM());
        if (djBIcL().fetchVPNInfo()) {
            if (z2) {
                if (charSequence.length() == 0) {
                    java.lang.String strKWHzl = C54862xYb.KWHzl(C33129mqd.EZpvd(djBIcL().djBIcL()), false, java.lang.Integer.valueOf(djBIcL().OLrzqt()), RoundingMode.DOWN);
                    gEmmrt().isConnected.setPlainNumericText(strKWHzl);
                    charSequence = pTB.formatLocalized$default(strKWHzl, null, 1, null);
                }
                AEQbTJ(charSequence, C14731dqw.AEQbTJ.AEQbTJ(djBIcL(true), 12));
                android.widget.ImageView imageView = gEmmrt().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
            }
            AppCompatTextView appCompatTextView = gEmmrt().fetchVPNInfo;
            C12623cqV c12623cqVEZpvd = djBIcL().EZpvd();
            appCompatTextView.setText(c12623cqVEZpvd != null ? c12623cqVEZpvd.copydefault(djBIcL().AYXKKw()) : null);
            gEmmrt().DbNXlk.setText(" " + djBIcL(false));
            gEmmrt().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, djBIcL().values() ? C52761wXj.TaskDescription.QSLkRj : 0, 0);
        } else {
            if (z2) {
                if (charSequence.length() == 0) {
                    java.lang.String strKWHzl2 = C54862xYb.KWHzl(C33129mqd.EZpvd(djBIcL().AYXKKw()), false, java.lang.Integer.valueOf(djBIcL().KWHzl()), RoundingMode.DOWN);
                    gEmmrt().isConnected.setPlainNumericText(strKWHzl2);
                    charSequence = pTB.formatLocalized$default(strKWHzl2, null, 1, null);
                }
                AEQbTJ(charSequence, djBIcL(false));
                android.widget.ImageView imageView2 = gEmmrt().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(djBIcL().values() ? 0 : 8);
            }
            AppCompatTextView appCompatTextView2 = gEmmrt().fetchVPNInfo;
            C12623cqV c12623cqVEZpvd2 = djBIcL().EZpvd();
            appCompatTextView2.setText(c12623cqVEZpvd2 != null ? C12623cqV.displayCoinAmount$default(c12623cqVEZpvd2, djBIcL().djBIcL(), null, 2, null) : null);
            gEmmrt().DbNXlk.setText(" " + C14731dqw.AEQbTJ.AEQbTJ(djBIcL(true), 6));
            gEmmrt().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
        gEmmrt().isConnected.setOnTextWillChange(this.AEQbTJ);
    }

    public final java.lang.String djBIcL(boolean z) {
        java.lang.String strCopydefault;
        java.lang.String strAEQbTJ;
        if (z) {
            C12623cqV c12623cqVEZpvd = djBIcL().EZpvd();
            if (c12623cqVEZpvd != null && (strAEQbTJ = c12623cqVEZpvd.AEQbTJ()) != null) {
                return strAEQbTJ;
            }
        } else {
            C12623cqV c12623cqVEZpvd2 = djBIcL().EZpvd();
            if (c12623cqVEZpvd2 != null && (strCopydefault = c12623cqVEZpvd2.copydefault()) != null) {
                return strCopydefault;
            }
        }
        return "";
    }

    public void EZpvd(int i, boolean z) {
        if (i != 1) {
            if (i == 3 && !z) {
                valueOf(false);
                EZpvd();
                return;
            }
            return;
        }
        if (djBIcL().values()) {
            android.widget.ImageView imageView = gEmmrt().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            AppCompatTextView appCompatTextView = gEmmrt().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            AppCompatTextView appCompatTextView2 = gEmmrt().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
        } else {
            android.widget.ImageView imageView2 = gEmmrt().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            AppCompatTextView appCompatTextView3 = gEmmrt().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            AppCompatTextView appCompatTextView4 = gEmmrt().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
        updateAmountAndCurrencyUI$default(this, null, false, 3, null);
        valueOf(false);
        EZpvd();
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt().copydefault.setText(str);
    }

    private final void AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        gEmmrt().isConnected.setAmountAndSymbol(charSequence, C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.gmV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20727gmO.AEQbTJ(context, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(context.getColor(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }
}
