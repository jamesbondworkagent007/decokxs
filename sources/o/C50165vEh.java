package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.contractdca.model.ContractDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50165vEh extends AbstractC49945uyC<uTX, ContractDcaManualPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final int OLrzqt = C48033uCm.Activity.sendBehavioSecData;
    public ContractDcaAdvancedParams copydefault;

    /* JADX INFO: renamed from: o.vEh$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC49945uyC
    public boolean AkhnZx() {
        return true;
    }

    public static final /* synthetic */ uTX valueOf(C50165vEh c50165vEh) {
        return c50165vEh.values();
    }

    /* JADX INFO: renamed from: o.vEh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vEh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new C50165vEh().show(fragmentManager, "ContractDcaStopLossDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        fARcdN();
        fIwbmz();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.DwQSDd));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    private final void fJNWhG() {
        ContractDcaAdvancedParams value = OLrzqt().copydefault().getValue();
        this.copydefault = value != null ? ContractDcaAdvancedParams.copy$default(value, null, null, null, null, null, null, null, 127, null) : null;
    }

    private final void fARcdN() {
        copydefault();
        C52864waf c52864waf = values().copydefault;
        ContractDcaStopLossType contractDcaStopLossType = ContractDcaStopLossType.MARKET;
        c52864waf.setTabText(C33070mpX.AYXKKw(contractDcaStopLossType.getShowMode()), C33070mpX.AYXKKw(ContractDcaStopLossType.LIMIT.getShowMode()));
        values().copydefault.OLrzqt(new Function0() { // from class: o.vEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50165vEh.AhwBna(this.copydefault);
            }
        });
        values().copydefault.KWHzl(new Function0() { // from class: o.vEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50165vEh.gEmmrt(this.OLrzqt);
            }
        });
        C52864waf c52864waf2 = values().copydefault;
        ContractDcaAdvancedParams contractDcaAdvancedParams = this.copydefault;
        c52864waf2.setFirstSelect(Intrinsics.EZpvd((java.lang.Object) (contractDcaAdvancedParams != null ? contractDcaAdvancedParams.AEQbTJ() : null), (java.lang.Object) contractDcaStopLossType.getMode()));
    }

    public static final Unit AhwBna(C50165vEh c50165vEh) {
        ContractDcaAdvancedParams contractDcaAdvancedParams = c50165vEh.copydefault;
        if (contractDcaAdvancedParams != null) {
            contractDcaAdvancedParams.EZpvd(ContractDcaStopLossType.MARKET.getMode());
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C50165vEh c50165vEh) {
        ContractDcaAdvancedParams contractDcaAdvancedParams = c50165vEh.copydefault;
        if (contractDcaAdvancedParams != null) {
            contractDcaAdvancedParams.EZpvd(ContractDcaStopLossType.LIMIT.getMode());
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.lang.String hundredfold$default;
        java.lang.String strOLrzqt;
        BotRangeConfig slPct;
        java.lang.String max;
        BotRangeConfig slPct2;
        java.lang.String min;
        C47988uAv c47988uAv = values().OLrzqt;
        c47988uAv.setMaxDecimal(2);
        StrategyConfigInfo value = OLrzqt().valueOf().getValue();
        java.lang.String value2 = OLrzqt().OLrzqt().getValue();
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = OLrzqt();
        Intrinsics.copydefault(c47988uAv);
        xMR xmr = xMR.copydefault;
        java.lang.String hundredfold$default2 = xMR.formatHundredfold$default(xmr, (value == null || (slPct2 = value.getSlPct()) == null || (min = slPct2.getMin()) == null) ? "" : min, 0, false, null, 14, null);
        if (Intrinsics.EZpvd((java.lang.Object) value2, (java.lang.Object) "long")) {
            hundredfold$default = xMR.formatHundredfold$default(xmr, (value == null || (slPct = value.getSlPct()) == null || (max = slPct.getMax()) == null) ? "" : max, 0, false, null, 14, null);
        } else {
            hundredfold$default = "";
        }
        ContractDcaAdvancedParams contractDcaAdvancedParams = this.copydefault;
        contractDcaManualPresenterOLrzqt.OLrzqt(c47988uAv, new BotRangeConfig(hundredfold$default2, hundredfold$default, xMR.formatHundredfold$default(xmr, (contractDcaAdvancedParams == null || (strOLrzqt = contractDcaAdvancedParams.OLrzqt()) == null) ? "" : strOLrzqt, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50165vEh.OLrzqt((java.lang.String) obj);
            }
        });
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50165vEh.copydefault(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.setOnFocusChangeCallback(new Function2() { // from class: o.vEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50165vEh.KWHzl(this.KWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, null, null, null, null, 60, null);
    }

    public static final Unit copydefault(C50165vEh c50165vEh, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c50165vEh.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50165vEh c50165vEh, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            c50165vEh.AEQbTJ("sl_target");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConnected() {
        if (values().OLrzqt.uzCIH()) {
            values().OLrzqt.copydefault();
            return true;
        }
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = OLrzqt();
        C47988uAv c47988uAv = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        contractDcaManualPresenterOLrzqt.EZpvd(c47988uAv, "%");
        return !values().OLrzqt.getFieldNames();
    }

    private final void fIwbmz() {
        C52794wYp c52794wYp = values().EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        TradeLiveData<java.lang.String> tradeLiveDataAubY = OLrzqt().AubY();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAubY.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50165vEh.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C50165vEh c50165vEh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(c50165vEh.OLrzqt().values().getValue(), java.lang.Boolean.TRUE)) {
            return Unit.INSTANCE;
        }
        android.widget.TextView textView = c50165vEh.values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        c50165vEh.values().KWHzl.setText(str);
        C47988uAv.setInputErrorMsg$default(c50165vEh.values().OLrzqt, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        values().OLrzqt.AEQbTJ();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    private final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("DCABotPlaceOrder_AdvancedSetting_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50165vEh.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "contract_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vEh$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C50165vEh AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50165vEh c50165vEh) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c50165vEh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AuCTel();
            }
        }
    }

    /* JADX INFO: renamed from: o.vEh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50165vEh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50165vEh c50165vEh) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c50165vEh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.isConnected()) {
                    java.lang.String strAkhnZx = C50165vEh.valueOf(this.OLrzqt).OLrzqt.AkhnZx();
                    ContractDcaAdvancedParams contractDcaAdvancedParams = this.OLrzqt.copydefault;
                    if (contractDcaAdvancedParams != null) {
                        contractDcaAdvancedParams.copydefault(C33129mqd.AEQbTJ(strAkhnZx, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, strAkhnZx, 0, false, null, 14, null) : "");
                    }
                    ContractDcaAdvancedParams contractDcaAdvancedParams2 = this.OLrzqt.copydefault;
                    if (contractDcaAdvancedParams2 != null) {
                        this.OLrzqt.OLrzqt().EZpvd(contractDcaAdvancedParams2);
                    }
                    this.OLrzqt.AuCTel();
                }
            }
        }
    }
}
