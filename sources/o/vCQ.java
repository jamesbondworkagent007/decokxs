package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaAddOrderPresenter;
import com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAddOrderDialog$initObserver$1;
import com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAddOrderDialog$initSeekBarDebounce$1;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.ContractDcaAvaData;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vCQ extends AbstractC49945uyC<AbstractC48523uUo, ContractDcaAddOrderPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public wYF KWHzl;
    public Job djBIcL;
    public ViewOnClickListenerC54939xaY valueOf;
    public final int copydefault = C48033uCm.Activity.DcMfJKdMCrTj;
    public final MutableSharedFlow<java.lang.Float> AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
        return this.copydefault;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ AbstractC48523uUo OLrzqt(vCQ vcq) {
        return vcq.values();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vCQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull TacticsData tacticsData, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vCQ vcq = new vCQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tacticsData", tacticsData);
            vcq.setArguments(bundle);
            vcq.show(fragmentManager, "javaClass");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ContractDcaAddOrderPresenter contractDcaAddOrderPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        contractDcaAddOrderPresenterOLrzqt.OLrzqt(arguments != null ? (TacticsData) arguments.getParcelable("tacticsData") : null);
        uzCIH();
        fJNWhG();
        AuCTel();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.addOnContextAvailableListener));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.KWHzl = wyf;
        if (wyf != null) {
            wyf.setType(5);
            wyf.setOKDSSize(52);
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(false);
            }
        }
    }

    private final void uzCIH() {
        java.lang.String direction;
        C52794wYp c52794wYpCopydefault;
        java.lang.String level;
        OKReminder oKReminder = values().values;
        oKReminder.setStyle(0);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.spnCvw);
        java.lang.String str = "";
        Intrinsics.copydefault(strAYXKKw, "");
        oKReminder.setMessage((java.lang.CharSequence) strAYXKKw);
        oKReminder.setCloseIconVisibility(false);
        TacticsData tacticsDataHDKMBd = OLrzqt().hDKMBd();
        if (tacticsDataHDKMBd == null || (direction = tacticsDataHDKMBd.getDirection()) == null) {
            direction = "";
        }
        values().EZpvd.setText(OLrzqt().fIwbmz());
        values().KWHzl.setText(C56033xvF.AhwBna(direction));
        C55251xgS c55251xgS = values().AYXKKw;
        TacticsData tacticsDataHDKMBd2 = OLrzqt().hDKMBd();
        if (tacticsDataHDKMBd2 != null && (level = tacticsDataHDKMBd2.getLevel()) != null) {
            str = level;
        }
        c55251xgS.setText(str);
        int iValueOf = C56033xvF.valueOf(direction);
        values().KWHzl.setOKDSStyle(iValueOf);
        values().AYXKKw.setOKDSStyle(iValueOf);
        final C47988uAv c47988uAv = values().AhwBna;
        SwapInstrument swapInstrumentAuCTel = OLrzqt().AuCTel();
        c47988uAv.setInputUnit(swapInstrumentAuCTel != null ? swapInstrumentAuCTel.getQuoteSymbol() : null);
        c47988uAv.setMaxDecimal(OLrzqt().iwGUEr());
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vCQ.KWHzl(this.KWHzl, c47988uAv, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C47988uAv c47988uAv2 = values().AEQbTJ;
        SwapInstrument swapInstrumentAuCTel2 = OLrzqt().AuCTel();
        c47988uAv2.setInputUnit(swapInstrumentAuCTel2 != null ? swapInstrumentAuCTel2.getQuoteSymbol() : null);
        c47988uAv2.setMaxDecimal(OLrzqt().fARcdN());
        c47988uAv2.setOnTextChangeCallback(new Function2() { // from class: o.vDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vCQ.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.AEQbTJ(this.KWHzl, ((java.lang.Float) obj).floatValue());
            }
        });
        fIwbmz();
        wYF wyf = this.KWHzl;
        if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            AEQbTJ(c52794wYpCopydefault);
        }
        values().OLrzqt.setFooterAvaTitle(C33070mpX.AYXKKw(C55688xof.Application.RWIpjU), true, new Function0() { // from class: o.vDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vCQ.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final Unit KWHzl(vCQ vcq, C47988uAv c47988uAv, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        vcq.OLrzqt().AEQbTJ(str);
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAEQbTJ = vcq.OLrzqt().AEQbTJ(str, c47988uAv.values());
        boolean zBooleanValue = pairAEQbTJ.component1().booleanValue();
        java.lang.String strComponent2 = pairAEQbTJ.component2();
        if (zBooleanValue) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(strComponent2);
        }
        vcq.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vCQ vcq, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        vcq.copydefault();
        vcq.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vCQ vcq, float f) {
        vcq.AEQbTJ.tryEmit(java.lang.Float.valueOf(f));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vCQ vcq) {
        android.content.Context context = vcq.getContext();
        if (context != null) {
            C52653wTj c52653wTj = C52653wTj.OLrzqt;
            uLP value = vcq.OLrzqt().DbNXlk().getValue();
            kotlin.Pair pairOLrzqt = value != null ? value.OLrzqt() : null;
            java.lang.String strAEQbTJ = pairOLrzqt != null ? uLP.AEQbTJ(pairOLrzqt) : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            uLP value2 = vcq.OLrzqt().AubY().getValue();
            kotlin.Pair pairOLrzqt2 = value2 != null ? value2.OLrzqt() : null;
            java.lang.String strAEQbTJ2 = pairOLrzqt2 != null ? uLP.AEQbTJ(pairOLrzqt2) : null;
            if (strAEQbTJ2 == null) {
                strAEQbTJ2 = "";
            }
            java.lang.String strWlaJM = vcq.OLrzqt().wlaJM();
            TacticsData tacticsDataHDKMBd = vcq.OLrzqt().hDKMBd();
            java.lang.String ccy = tacticsDataHDKMBd != null ? tacticsDataHDKMBd.getCcy() : null;
            java.lang.String str = ccy != null ? ccy : "";
            if (strWlaJM == null || strWlaJM.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strWlaJM)) {
                strWlaJM = str;
            }
            c52653wTj.OLrzqt(context, strAEQbTJ, strAEQbTJ2, strWlaJM);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        wYF wyf = this.KWHzl;
        if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        boolean z = (values().AEQbTJ.hDKMBd() && !values().AEQbTJ.getFieldNames()) && (values().AhwBna.hDKMBd() && !values().AhwBna.getFieldNames());
        if (z) {
            AEQbTJ(c52794wYpCopydefault);
        } else {
            c52794wYpCopydefault.setOKDSType(257);
        }
        wYF wyf2 = this.KWHzl;
        if (wyf2 == null || (c52794wYpCopydefault2 = wyf2.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault2.setEnabled(z);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vCQ KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vCQ vcq) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = vcq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.fARcdN();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vCQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vCQ vcq) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = vcq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (vCQ.OLrzqt(this.OLrzqt).AhwBna.hDKMBd() && vCQ.OLrzqt(this.OLrzqt).AEQbTJ.hDKMBd()) {
                    this.OLrzqt.OLrzqt().EZpvd(vCQ.OLrzqt(this.OLrzqt).AhwBna.AkhnZx(), vCQ.OLrzqt(this.OLrzqt).AEQbTJ.AkhnZx());
                }
            }
        }
    }

    public final void AEQbTJ(C52794wYp c52794wYp) {
        TacticsData tacticsDataHDKMBd = OLrzqt().hDKMBd();
        java.lang.String direction = tacticsDataHDKMBd != null ? tacticsDataHDKMBd.getDirection() : null;
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long")) {
            c52794wYp.setOKDSType(261);
            c52794wYp.setText(C33070mpX.AYXKKw(C55688xof.Application.setPipParamsSourceRectHint));
        } else if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "short")) {
            c52794wYp.setOKDSType(262);
            c52794wYp.setText(C33070mpX.AYXKKw(C55688xof.Application.addMenuProvider));
        }
    }

    private final void fJNWhG() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ContractDcaAddOrderDialog$initObserver$1(this, null), 3, null);
        TradeLiveData<TickersData> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.vDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.EZpvd(this.KWHzl, (TickersData) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataUzCIH = OLrzqt().uzCIH();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataUzCIH.observe(viewLifecycleOwner3, new TaskDescription(new Function1() { // from class: o.vDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> fieldNames = OLrzqt().getFieldNames();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        fieldNames.observe(viewLifecycleOwner4, new TaskDescription(new Function1() { // from class: o.vDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataAkhnZx = OLrzqt().AkhnZx();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner5, new TaskDescription(new Function1() { // from class: o.vDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.AYXKKw(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<LimitPriceData> tradeLiveDataEjfBZ = OLrzqt().ejfBZ();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner6, new TaskDescription(new Function1() { // from class: o.vCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.AEQbTJ(this.EZpvd, (LimitPriceData) obj);
            }
        }));
        TradeLiveData<ContractDcaAvaData> tradeLiveDataIsConnected = OLrzqt().isConnected();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataIsConnected.observe(viewLifecycleOwner7, new TaskDescription(new Function1() { // from class: o.vCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.KWHzl(this.EZpvd, (ContractDcaAvaData) obj);
            }
        }));
        TradeLiveData<StrategyResponse> tradeLiveDataAhwBna = OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner8, new TaskDescription(new Function1() { // from class: o.vCS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCQ.EZpvd(this.OLrzqt, (StrategyResponse) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().djBIcL().AhwBna();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner9, new Observer() { // from class: o.vCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                vCQ.copydefault((java.lang.Exception) obj);
            }
        });
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = OLrzqt().values().AhwBna();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner10, new Observer() { // from class: o.vCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                vCQ.OLrzqt((java.lang.Exception) obj);
            }
        });
    }

    public static final Unit EZpvd(vCQ vcq, TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        C47988uAv.setInputContent$default(vcq.values().AhwBna, tickersData.getLast(), false, false, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vCQ vcq, java.lang.String str) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.AEQbTJ(str, 0)) {
            str2 = "≥ " + xMR.copydefault.copydefault(str);
        }
        vcq.values().AEQbTJ.setInputHint(str2);
        vcq.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vCQ vcq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vcq.values().copydefault.setText(str);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(vCQ vcq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            vcq.KWHzl(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vCQ vcq, LimitPriceData limitPriceData) {
        Intrinsics.checkNotNullParameter(limitPriceData, "");
        vcq.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vCQ vcq, ContractDcaAvaData contractDcaAvaData) {
        Intrinsics.checkNotNullParameter(contractDcaAvaData, "");
        if (C33129mqd.AEQbTJ(contractDcaAvaData.getDiffAmt(), 0)) {
            java.lang.String diffAmt = contractDcaAvaData.getDiffAmt();
            vcq.AEQbTJ(diffAmt != null ? diffAmt : "");
        } else {
            vcq.OLrzqt().EZpvd("0");
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vCQ vcq, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.XW, 0, 1, (java.lang.Object) null);
        vcq.fARcdN();
        return Unit.INSTANCE;
    }

    public static final void copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
    }

    public static final void OLrzqt(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
    }

    private final void AuCTel() {
        C52794wYp c52794wYpCopydefault;
        wYF wyf = this.KWHzl;
        if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
    }

    public final void copydefault() {
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairOLrzqt = OLrzqt().OLrzqt(values().AEQbTJ.AkhnZx(), values().AEQbTJ.values());
        boolean zBooleanValue = pairOLrzqt.component1().booleanValue();
        java.lang.String strComponent2 = pairOLrzqt.component2();
        if (zBooleanValue || values().AEQbTJ.AkhnZx().length() == 0) {
            values().AEQbTJ.copydefault();
        } else {
            values().AEQbTJ.setInputErrorMsg(strComponent2);
        }
    }

    public final void KWHzl(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.iSpHlg), new View.OnClickListener() { // from class: o.vCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vCQ.AEQbTJ(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.processStrongAuthMessage);
        Intrinsics.copydefault(strAYXKKw, "");
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw, new View.OnClickListener() { // from class: o.vCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vCQ.KWHzl(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        this.valueOf = viewOnClickListenerC54939xaY;
    }

    public static final void AEQbTJ(vCQ vcq, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        ContractDcaAddOrderPresenter contractDcaAddOrderPresenterOLrzqt = vcq.OLrzqt();
        java.lang.String strFJNWhG = vcq.OLrzqt().fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        contractDcaAddOrderPresenterOLrzqt.EZpvd(strFJNWhG, vcq.values().AEQbTJ.AkhnZx());
        viewOnClickListenerC54939xaY.dismiss();
        vcq.valueOf = null;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, vCQ vcq, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        vcq.valueOf = null;
    }

    public final void ejfBZ() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.valueOf;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.EZpvd(OLrzqt().OLrzqt());
        }
    }

    private final void AEQbTJ(final java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        int i = C55688xof.Application.DcMfJKffREWX;
        java.lang.String strAhwBna = xMR.copydefault.AhwBna(str, OLrzqt().fARcdN());
        SwapInstrument swapInstrumentAuCTel = OLrzqt().AuCTel();
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strAhwBna + " " + (swapInstrumentAuCTel != null ? swapInstrumentAuCTel.getQuoteSymbol() : null)))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.iSpHlg), new View.OnClickListener() { // from class: o.vDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vCQ.KWHzl(this.KWHzl, str, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.processStrongAuthMessage), new View.OnClickListener() { // from class: o.vCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vCQ.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(vCQ vcq, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        vcq.OLrzqt().EZpvd(str);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void fIwbmz() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ContractDcaAddOrderDialog$initSeekBarDebounce$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        this.djBIcL = null;
        super.onDestroyView();
    }
}
