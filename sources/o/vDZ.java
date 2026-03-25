package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.trade_ui.order.strategy.contractdca.presenter.ContractDcaModifyTpSlPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.ContractDcaSpecialData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vDZ extends AbstractC49945uyC<AbstractC48665uZv, ContractDcaModifyTpSlPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final int KWHzl = C48033uCm.Activity.hcetpZ;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    public static final /* synthetic */ AbstractC48665uZv EZpvd(vDZ vdz) {
        return vdz.values();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vDZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull TacticsData tacticsData, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vDZ vdz = new vDZ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tacticsData", tacticsData);
            vdz.setArguments(bundle);
            vdz.show(fragmentManager, "ContractDcaModifyTpDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ContractDcaModifyTpSlPresenter contractDcaModifyTpSlPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        contractDcaModifyTpSlPresenterOLrzqt.AEQbTJ(arguments != null ? (TacticsData) arguments.getParcelable("tacticsData") : null);
        copydefault();
        ejfBZ();
        fJNWhG();
        AuCTel();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(-1);
    }

    public final void copydefault() {
        java.lang.String direction;
        TacticsData tacticsDataGEmmrt = OLrzqt().gEmmrt();
        if (tacticsDataGEmmrt == null || (direction = tacticsDataGEmmrt.getDirection()) == null) {
            direction = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long")) {
            OLrzqt().EZpvd();
        }
    }

    private final void fJNWhG() {
        java.lang.String direction;
        java.lang.String level;
        TacticsData tacticsDataGEmmrt = OLrzqt().gEmmrt();
        java.lang.String str = "";
        if (tacticsDataGEmmrt == null || (direction = tacticsDataGEmmrt.getDirection()) == null) {
            direction = "";
        }
        values().copydefault.setText(OLrzqt().OLrzqt());
        values().AEQbTJ.setText(C56033xvF.AhwBna(direction));
        android.widget.TextView textView = values().KWHzl;
        TacticsData tacticsDataGEmmrt2 = OLrzqt().gEmmrt();
        if (tacticsDataGEmmrt2 != null && (level = tacticsDataGEmmrt2.getLevel()) != null) {
            str = level;
        }
        textView.setText(str);
        int contractGridSideColor$default = C56033xvF.getContractGridSideColor$default(direction, false, 2, null);
        values().AEQbTJ.setTextColor(contractGridSideColor$default);
        values().KWHzl.setTextColor(contractGridSideColor$default);
        initPriceInput$default(this, direction, null, 2, null);
    }

    public static /* synthetic */ void initPriceInput$default(vDZ vdz, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        vdz.KWHzl(str, str2);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String tpPriceRange;
        java.lang.String tpPriceRange2;
        C47988uAv c47988uAv = values().valueOf;
        BizInstrument bizInstrumentAEQbTJ = OLrzqt().AEQbTJ();
        c47988uAv.setInputUnit(bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getQuoteSymbol() : null);
        c47988uAv.setMaxDecimal(OLrzqt().AhwBna());
        java.lang.String str3 = "";
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long")) {
            xMR xmr = xMR.copydefault;
            TacticsData tacticsDataGEmmrt = OLrzqt().gEmmrt();
            if (tacticsDataGEmmrt != null && (tpPriceRange2 = tacticsDataGEmmrt.getTpPriceRange()) != null) {
                str3 = tpPriceRange2;
            }
            java.lang.String strAhwBna = xmr.AhwBna(str3, OLrzqt().AhwBna());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                c47988uAv.setInputHint(strAhwBna + " - " + xmr.AhwBna(C33129mqd.gEmmrt(str2), OLrzqt().AhwBna()));
            } else {
                c47988uAv.setInputHint("≥ " + strAhwBna);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short")) {
            xMR xmr2 = xMR.copydefault;
            TacticsData tacticsDataGEmmrt2 = OLrzqt().gEmmrt();
            if (tacticsDataGEmmrt2 != null && (tpPriceRange = tacticsDataGEmmrt2.getTpPriceRange()) != null) {
                str3 = tpPriceRange;
            }
            c47988uAv.setInputHint("≤ " + xmr2.copydefault(str3, OLrzqt().AhwBna()));
        }
        TacticsData tacticsDataGEmmrt3 = OLrzqt().gEmmrt();
        java.lang.String tpPx = tacticsDataGEmmrt3 != null ? tacticsDataGEmmrt3.getTpPx() : null;
        if (AEQbTJ(tpPx).getFirst().booleanValue()) {
            C47988uAv.setInputContent$default(c47988uAv, tpPx, false, false, 6, null);
        }
    }

    private final void ejfBZ() {
        values().valueOf.setOnTextChangeCallback(new Function2() { // from class: o.vEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vDZ.EZpvd(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C52794wYp c52794wYp = values().OLrzqt;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        android.widget.ImageView imageView = values().EZpvd;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
    }

    public static final Unit EZpvd(vDZ vdz, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAEQbTJ = vdz.AEQbTJ(str);
        boolean zBooleanValue = pairAEQbTJ.component1().booleanValue();
        java.lang.String strComponent2 = pairAEQbTJ.component2();
        if (zBooleanValue) {
            vdz.values().valueOf.copydefault();
        } else {
            vdz.values().valueOf.setInputErrorMsg(strComponent2);
        }
        vdz.values().OLrzqt.setEnabled(C33129mqd.AEQbTJ(str, 0));
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> AEQbTJ(java.lang.String str) {
        ContractDcaModifyTpSlPresenter contractDcaModifyTpSlPresenterOLrzqt = OLrzqt();
        C47988uAv c47988uAv = values().valueOf;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return contractDcaModifyTpSlPresenterOLrzqt.AEQbTJ(str, c47988uAv);
    }

    private final void AuCTel() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataDjBIcL = OLrzqt().djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDZ.AEQbTJ(this.KWHzl, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<StrategyResponse> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.vEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDZ.OLrzqt(this.EZpvd, (StrategyResponse) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new Observer() { // from class: o.vEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                vDZ.KWHzl((java.lang.Exception) obj);
            }
        });
    }

    public static final Unit AEQbTJ(vDZ vdz, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String maxMultiplier;
        java.lang.String direction;
        ContractDcaSpecialData contractDcaSpecialData;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        TacticsData tacticsDataGEmmrt = vdz.OLrzqt().gEmmrt();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd((tacticsDataGEmmrt == null || (contractDcaSpecialData = tacticsDataGEmmrt.getContractDcaSpecialData()) == null) ? null : contractDcaSpecialData.getAvgPx());
        BotRangeConfig tpPx = strategyConfigInfo.getTpPx();
        if (tpPx == null || (maxMultiplier = tpPx.getMaxMultiplier()) == null) {
            maxMultiplier = "10";
        }
        BigDecimal bigDecimalMultiply = bigDecimalEZpvd.multiply(C33129mqd.EZpvd(maxMultiplier));
        vdz.OLrzqt().copydefault(C33129mqd.gEmmrt(bigDecimalMultiply));
        TacticsData tacticsDataGEmmrt2 = vdz.OLrzqt().gEmmrt();
        if (tacticsDataGEmmrt2 != null && (direction = tacticsDataGEmmrt2.getDirection()) != null) {
            str = direction;
        }
        vdz.KWHzl(str, C33129mqd.gEmmrt(bigDecimalMultiply));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vDZ vdz, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
        vdz.isConnected();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vDZ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vDZ vdz) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = vdz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.isConnected();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vDZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vDZ vdz) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = vdz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (vDZ.EZpvd(this.copydefault).valueOf.getFieldNames() || vDZ.EZpvd(this.copydefault).valueOf.uzCIH()) {
                    return;
                }
                this.copydefault.OLrzqt().EZpvd(vDZ.EZpvd(this.copydefault).valueOf.AkhnZx());
            }
        }
    }
}
