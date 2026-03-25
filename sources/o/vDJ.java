package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.contractdca.model.ContractDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vDJ extends AbstractC49945uyC<uTW, ContractDcaManualPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public ContractDcaAdvancedParams KWHzl;
    public final int AEQbTJ = C48033uCm.Activity.stopBehavioSecDataCollection;
    public boolean copydefault = true;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC49945uyC
    public boolean AkhnZx() {
        return true;
    }

    public static final /* synthetic */ uTW EZpvd(vDJ vdj) {
        return vdj.values();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vDJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vDJ vdj = new vDJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("append_enable", z);
            vdj.setArguments(bundle);
            vdj.show(fragmentManager, "DcaAppendConditionDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
        fIwbmz();
        AuCTel();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.gVEiQJ));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final void isConnected() {
        ContractDcaAdvancedParams value = OLrzqt().copydefault().getValue();
        this.KWHzl = value != null ? ContractDcaAdvancedParams.copy$default(value, null, null, null, null, null, null, null, 127, null) : null;
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? arguments.getBoolean("append_enable") : true;
    }

    private final void fIwbmz() {
        BotRangeConfig botRangeConfig;
        BotRangeConfig botRangeConfig2;
        BotRangeConfig pxStepsMult;
        BotRangeConfig volMult;
        StrategyConfigInfo value = OLrzqt().valueOf().getValue();
        C47988uAv c47988uAv = values().copydefault;
        c47988uAv.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
        c47988uAv.setMaxDecimal(2);
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = OLrzqt();
        Intrinsics.copydefault(c47988uAv);
        if (value == null || (volMult = value.getVolMult()) == null) {
            botRangeConfig = null;
        } else {
            ContractDcaAdvancedParams contractDcaAdvancedParams = this.KWHzl;
            volMult.setDefault(contractDcaAdvancedParams != null ? contractDcaAdvancedParams.valueOf() : null);
            Unit unit = Unit.INSTANCE;
            botRangeConfig = volMult;
        }
        contractDcaManualPresenterOLrzqt.OLrzqt(c47988uAv, botRangeConfig, (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : new Function1() { // from class: o.vDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.AhwBna((java.lang.String) obj);
            }
        }), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.AYXKKw((java.lang.String) obj);
            }
        });
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vDJ.EZpvd(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.setOnFocusChangeCallback(new Function2() { // from class: o.vDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vDJ.AEQbTJ(this.copydefault, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C47988uAv.setInputLayoutState$default(c47988uAv, this.copydefault ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
        C47988uAv c47988uAv2 = values().AEQbTJ;
        c47988uAv2.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
        c47988uAv2.setMaxDecimal(2);
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt2 = OLrzqt();
        Intrinsics.copydefault(c47988uAv2);
        if (value == null || (pxStepsMult = value.getPxStepsMult()) == null) {
            botRangeConfig2 = null;
        } else {
            ContractDcaAdvancedParams contractDcaAdvancedParams2 = this.KWHzl;
            pxStepsMult.setDefault(contractDcaAdvancedParams2 != null ? contractDcaAdvancedParams2.KWHzl() : null);
            Unit unit2 = Unit.INSTANCE;
            botRangeConfig2 = pxStepsMult;
        }
        contractDcaManualPresenterOLrzqt2.OLrzqt(c47988uAv2, botRangeConfig2, (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : new Function1() { // from class: o.vDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.djBIcL((java.lang.String) obj);
            }
        }), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.gEmmrt((java.lang.String) obj);
            }
        });
        c47988uAv2.setOnTextChangeCallback(new Function2() { // from class: o.vDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vDJ.AEQbTJ(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv2.setOnFocusChangeCallback(new Function2() { // from class: o.vDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vDJ.copydefault(this.AEQbTJ, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C47988uAv.setInputLayoutState$default(c47988uAv2, this.copydefault ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
    }

    public static final java.lang.String AhwBna(java.lang.String str) {
        if (str != null) {
            return C33129mqd.formatS$default(str, 2, java.lang.Boolean.FALSE, null, 4, null);
        }
        return null;
    }

    public static final java.lang.String AYXKKw(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.OLrzqt(str, 2);
        }
        return null;
    }

    public static final Unit EZpvd(vDJ vdj, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null && str.length() > 0) {
            vdj.AEQbTJ(c47988uAv);
        } else {
            c47988uAv.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vDJ vdj, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            vdj.valueOf("amount_multiplier");
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        if (str != null) {
            return C33129mqd.formatS$default(str, 2, java.lang.Boolean.FALSE, null, 4, null);
        }
        return null;
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.OLrzqt(str, 2);
        }
        return null;
    }

    public static final Unit AEQbTJ(vDJ vdj, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null && str.length() > 0) {
            vdj.AEQbTJ(c47988uAv);
        } else {
            c47988uAv.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vDJ vdj, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            vdj.valueOf("price_multiplier");
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(C47988uAv c47988uAv) {
        if (c47988uAv.isConnected() == InputLayoutState.GREY_UN_CLICKABLE) {
            return true;
        }
        OLrzqt().EZpvd(c47988uAv, c47988uAv.fARcdN());
        return !c47988uAv.getFieldNames();
    }

    private final void AuCTel() {
        C52794wYp c52794wYp = values().OLrzqt;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        TradeLiveData<java.lang.String> tradeLiveDataZLjUOn = OLrzqt().zLjUOn();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataZLjUOn.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataAubY = OLrzqt().AubY();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAubY.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.vDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit OLrzqt(vDJ vdj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(vdj.OLrzqt().values().getValue(), java.lang.Boolean.TRUE)) {
            return Unit.INSTANCE;
        }
        android.widget.TextView textView = vdj.values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        vdj.values().EZpvd.setText(str);
        C47988uAv.setInputErrorMsg$default(vdj.values().AEQbTJ, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vDJ vdj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(vdj.OLrzqt().values().getValue(), java.lang.Boolean.TRUE)) {
            return Unit.INSTANCE;
        }
        android.widget.TextView textView = vdj.values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        vdj.values().EZpvd.setText(str);
        C47988uAv.setInputErrorMsg$default(vdj.values().AEQbTJ, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vDJ EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vDJ vdj) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = vdj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ vDJ AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vDJ vdj) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = vdj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                vDJ vdj = this.AEQbTJ;
                C47988uAv c47988uAv = vDJ.EZpvd(vdj).copydefault;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                if (vdj.AEQbTJ(c47988uAv)) {
                    vDJ vdj2 = this.AEQbTJ;
                    C47988uAv c47988uAv2 = vDJ.EZpvd(vdj2).AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                    if (vdj2.AEQbTJ(c47988uAv2)) {
                        ContractDcaAdvancedParams contractDcaAdvancedParams = this.AEQbTJ.KWHzl;
                        if (contractDcaAdvancedParams != null) {
                            contractDcaAdvancedParams.AEQbTJ(vDJ.EZpvd(this.AEQbTJ).copydefault.AkhnZx());
                        }
                        ContractDcaAdvancedParams contractDcaAdvancedParams2 = this.AEQbTJ.KWHzl;
                        if (contractDcaAdvancedParams2 != null) {
                            contractDcaAdvancedParams2.KWHzl(vDJ.EZpvd(this.AEQbTJ).AEQbTJ.AkhnZx());
                        }
                        ContractDcaAdvancedParams contractDcaAdvancedParams3 = this.AEQbTJ.KWHzl;
                        if (contractDcaAdvancedParams3 != null) {
                            this.AEQbTJ.OLrzqt().EZpvd(contractDcaAdvancedParams3);
                        }
                        this.AEQbTJ.copydefault();
                    }
                }
            }
        }
    }

    private final void valueOf(final java.lang.String str) {
        C32866mlf.onEvent$default("DCABotPlaceOrder_AdvancedSetting_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDJ.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "contract_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        values().copydefault.AEQbTJ();
        values().AEQbTJ.AEQbTJ();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
