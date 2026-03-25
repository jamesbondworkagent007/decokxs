package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridEditConfirmPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vGG extends AbstractC49945uyC<uVI, SpotGridEditConfirmPresenter> {
    public wYF djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final int gEmmrt = C48033uCm.Activity.fVjYLc;
    public final boolean KWHzl = true;
    public final C59534zip OLrzqt = new C59534zip();
    public final C59534zip copydefault = new C59534zip();

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vGG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ vGG newInstance$default(StateListAnimator stateListAnimator, TacticsData tacticsData, SpotGridEditParamReq spotGridEditParamReq, GridProfitAmtDisplay gridProfitAmtDisplay, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                gridProfitAmtDisplay = null;
            }
            return stateListAnimator.EZpvd(tacticsData, spotGridEditParamReq, gridProfitAmtDisplay);
        }

        public final vGG EZpvd(TacticsData tacticsData, @NotNull SpotGridEditParamReq spotGridEditParamReq, GridProfitAmtDisplay gridProfitAmtDisplay) {
            Intrinsics.checkNotNullParameter(spotGridEditParamReq, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", tacticsData);
            bundle.putParcelable("bot_grid_edit_param_req", spotGridEditParamReq);
            bundle.putParcelable("bot_grid_profit_amt_display", gridProfitAmtDisplay);
            vGG vgg = new vGG();
            vgg.setArguments(bundle);
            return vgg;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setGravity(17);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.newUnratedRating));
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.djBIcL = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        fARcdN();
        ejfBZ();
        copydefault();
    }

    public final void copydefault() {
        LiveData<java.util.List<Distribution>> liveDataEZpvd = OLrzqt().EZpvd();
        if (liveDataEZpvd == null) {
            return;
        }
        liveDataEZpvd.observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.vGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGG.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(vGG vgg, java.util.List list) {
        vgg.OLrzqt(list);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.List<Distribution> list) {
        C53490wmV c53490wmV = C53490wmV.KWHzl;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        wUX wux = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(wux, "");
        android.widget.TextView textView = values().valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.LinearLayout linearLayout = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        c53490wmV.copydefault(contextRequireContext, list, wux, textView, linearLayout, (128 & 32) != 0 ? null : values().copydefault, (128 & 64) != 0 ? null : yDY.gEmmrt(values().AhwBna, values().gEmmrt), (128 & 128) != 0 ? false : false);
    }

    private final void ejfBZ() {
        TradeLiveData<SpotGridEditParamRep> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.vGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGG.copydefault(this.copydefault, (SpotGridEditParamRep) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.vGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGG.AEQbTJ(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        OLrzqt().copydefault().AkhnZx().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.vGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGG.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(vGG vgg, SpotGridEditParamRep spotGridEditParamRep) {
        Intrinsics.checkNotNullParameter(spotGridEditParamRep, "");
        java.lang.String sCode = spotGridEditParamRep.getSCode();
        if (sCode == null) {
            C55326xho.toast$default(spotGridEditParamRep.getSMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            vgg.isConnected();
        } else {
            int iHashCode = sCode.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 48) {
                    switch (iHashCode) {
                        case 50574226:
                            if (sCode.equals("55123")) {
                                vgg.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.putLong), spotGridEditParamRep.getSMsg());
                                break;
                            }
                            break;
                        case 50574227:
                            if (sCode.equals("55124")) {
                                vgg.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.putLong), spotGridEditParamRep.getSMsg());
                                break;
                            }
                            break;
                    }
                } else if (sCode.equals("0")) {
                    C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.onCaptioningEnabledChanged), 0, 1, (java.lang.Object) null);
                    vgg.isConnected();
                }
                C55326xho.toast$default(spotGridEditParamRep.getSMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                vgg.isConnected();
            } else if (!sCode.equals("")) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vGG vgg, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        vgg.isConnected();
        java.lang.String message2 = exc.getMessage();
        pUU.copydefault("BotGridEditParamConfirmDialog", "change params fail cause by :" + (message2 != null ? message2 : ""));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vGG vgg, java.lang.Boolean bool) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        if (bool.booleanValue()) {
            wYF wyf = vgg.djBIcL;
            if (wyf != null && (c52794wYpCopydefault2 = wyf.copydefault()) != null) {
                C52794wYp.startLoading$default(c52794wYpCopydefault2, 0L, 1, null);
            }
        } else {
            wYF wyf2 = vgg.djBIcL;
            if (wyf2 != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
                c52794wYpCopydefault.fIwbmz();
            }
        }
        return Unit.INSTANCE;
    }

    private final void fJNWhG() {
        OLrzqt().OLrzqt(getArguments());
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vGG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vGG vgg) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = vgg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.OLrzqt().AhwBna();
            }
        }
    }

    private final void fARcdN() {
        C55917xsw c55917xswOLrzqt = OLrzqt().OLrzqt();
        copydefault(c55917xswOLrzqt.EZpvd());
        AEQbTJ(c55917xswOLrzqt.OLrzqt());
    }

    private final void copydefault(java.util.List<TacticsInsideItemData> list) {
        this.OLrzqt.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        RecyclerView recyclerView = values().AEQbTJ;
        recyclerView.setAdapter(this.OLrzqt);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C33064mpR.OLrzqt(this.OLrzqt, list);
    }

    private final void AEQbTJ(java.util.List<TacticsInsideItemData> list) {
        this.copydefault.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        RecyclerView recyclerView = values().OLrzqt;
        recyclerView.setAdapter(this.copydefault);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C33064mpR.OLrzqt(this.copydefault, list);
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        if (!C54589xNz.EZpvd.EZpvd()) {
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.ActionBarDrawerToggleDelegateProvider, new View.OnClickListener() { // from class: o.vGI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    vGG.copydefault(this.copydefault, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.RZMhtF, new View.OnClickListener() { // from class: o.vGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vGG.KWHzl(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(vGG vgg, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String id;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        int iAhwBna = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(vgg.OLrzqt().valueOf())) == null || (id = tradeCoinInfoAhwBna.getId()) == null) ? -1 : C33129mqd.AhwBna(id);
        InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
        FragmentActivity fragmentActivityRequireActivity = vgg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC49497upf.OLrzqt(fragmentActivityRequireActivity, new CurrencyModel(iAhwBna, vgg.OLrzqt().valueOf()), false);
        vgg.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(vGG vgg, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentActivity activity;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String minPx;
        java.lang.String maxPx;
        java.lang.String gridNum;
        TacticsData tacticsDataDjBIcL = vgg.OLrzqt().djBIcL();
        if (tacticsDataDjBIcL != null) {
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ = vgg.OLrzqt().AEQbTJ();
            java.lang.String str = "";
            if (spotGridEditParamReqAEQbTJ == null || (minPx = spotGridEditParamReqAEQbTJ.getMinPx()) == null) {
                minPx = "";
            }
            tacticsDataDjBIcL.setMinPx(minPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ2 = vgg.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ2 == null || (maxPx = spotGridEditParamReqAEQbTJ2.getMaxPx()) == null) {
                maxPx = "";
            }
            tacticsDataDjBIcL.setMaxPx(maxPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ3 = vgg.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ3 != null && (gridNum = spotGridEditParamReqAEQbTJ3.getGridNum()) != null) {
                str = gridNum;
            }
            tacticsDataDjBIcL.setGridNum(str);
        }
        TacticsData tacticsDataDjBIcL2 = vgg.OLrzqt().djBIcL();
        if (tacticsDataDjBIcL2 != null && (activity = vgg.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            vGL.Companion.OLrzqt(tacticsDataDjBIcL2).show(supportFragmentManager);
        }
        vgg.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void KWHzl(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.RZMhtF, new View.OnClickListener() { // from class: o.vGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vGG.AYXKKw(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AYXKKw(vGG vgg, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentActivity activity;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String minPx;
        java.lang.String maxPx;
        java.lang.String gridNum;
        TacticsData tacticsDataDjBIcL = vgg.OLrzqt().djBIcL();
        if (tacticsDataDjBIcL != null) {
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ = vgg.OLrzqt().AEQbTJ();
            java.lang.String str = "";
            if (spotGridEditParamReqAEQbTJ == null || (minPx = spotGridEditParamReqAEQbTJ.getMinPx()) == null) {
                minPx = "";
            }
            tacticsDataDjBIcL.setMinPx(minPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ2 = vgg.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ2 == null || (maxPx = spotGridEditParamReqAEQbTJ2.getMaxPx()) == null) {
                maxPx = "";
            }
            tacticsDataDjBIcL.setMaxPx(maxPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ3 = vgg.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ3 != null && (gridNum = spotGridEditParamReqAEQbTJ3.getGridNum()) != null) {
                str = gridNum;
            }
            tacticsDataDjBIcL.setGridNum(str);
        }
        TacticsData tacticsDataDjBIcL2 = vgg.OLrzqt().djBIcL();
        if (tacticsDataDjBIcL2 != null && (activity = vgg.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            vGL.Companion.OLrzqt(tacticsDataDjBIcL2).show(supportFragmentManager);
        }
        vgg.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
