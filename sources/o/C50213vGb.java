package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.grid.viewmodel.ContractGridEditConfirmPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50213vGb extends AbstractC49945uyC<uTZ, ContractGridEditConfirmPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public wYF gEmmrt;
    public final int AYXKKw = C48033uCm.Activity.DcMfJKDSqxTE;
    public final boolean KWHzl = true;
    public final C59534zip copydefault = new C59534zip();
    public final C59534zip AEQbTJ = new C59534zip();

    /* JADX INFO: renamed from: o.vGb$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.vGb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vGb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C50213vGb AEQbTJ(TacticsData tacticsData, @NotNull java.lang.String str, @NotNull SpotGridEditParamReq spotGridEditParamReq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(spotGridEditParamReq, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", tacticsData);
            bundle.putString("formattedEstimatedPositionToCloseKey", str);
            bundle.putParcelable("bot_grid_edit_param_req", spotGridEditParamReq);
            C50213vGb c50213vGb = new C50213vGb();
            c50213vGb.setArguments(bundle);
            return c50213vGb;
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
        this.gEmmrt = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        AuCTel();
        ejfBZ();
    }

    private final void ejfBZ() {
        TradeLiveData<SpotGridEditParamRep> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50213vGb.OLrzqt(this.KWHzl, (SpotGridEditParamRep) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.vGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50213vGb.copydefault(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
        OLrzqt().EZpvd().AkhnZx().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.vGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50213vGb.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> tradeLiveDataOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner3, new Application(new Function1() { // from class: o.vGi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50213vGb.OLrzqt(this.KWHzl, (C55804xqp) obj);
            }
        }));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C50213vGb c50213vGb, SpotGridEditParamRep spotGridEditParamRep) {
        Intrinsics.checkNotNullParameter(spotGridEditParamRep, "");
        java.lang.String sCode = spotGridEditParamRep.getSCode();
        if (sCode == null) {
            C55326xho.toast$default(spotGridEditParamRep.getSMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            c50213vGb.isConnected();
        } else {
            int iHashCode = sCode.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 48) {
                    switch (iHashCode) {
                        case 50574226:
                            if (sCode.equals("55123")) {
                                TacticsData tacticsDataValueOf = c50213vGb.OLrzqt().valueOf();
                                if (tacticsDataValueOf != null) {
                                    java.lang.String orderType = tacticsDataValueOf.getOrderType();
                                    if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                                        c50213vGb.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.putLong), spotGridEditParamRep.getSMsg());
                                    } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                                        c50213vGb.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.putLong), C33070mpX.AYXKKw(C48033uCm.Fragment.dzCpvv));
                                    }
                                }
                                break;
                            }
                            break;
                        case 50574227:
                            if (sCode.equals("55124")) {
                                c50213vGb.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.putLong), spotGridEditParamRep.getSMsg());
                                break;
                            }
                            break;
                    }
                } else if (sCode.equals("0")) {
                    C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.onCaptioningEnabledChanged), 0, 1, (java.lang.Object) null);
                    c50213vGb.isConnected();
                }
                C55326xho.toast$default(spotGridEditParamRep.getSMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                c50213vGb.isConnected();
            } else if (!sCode.equals("")) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50213vGb c50213vGb, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        c50213vGb.isConnected();
        java.lang.String message2 = exc.getMessage();
        pUU.copydefault("BotContractGridEditParamConfirmDialog", "change params fail cause by :" + (message2 != null ? message2 : ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vGb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C50213vGb OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50213vGb c50213vGb) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c50213vGb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt().djBIcL();
            }
        }
    }

    public static final Unit OLrzqt(C50213vGb c50213vGb, java.lang.Boolean bool) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        if (bool.booleanValue()) {
            wYF wyf = c50213vGb.gEmmrt;
            if (wyf != null && (c52794wYpCopydefault2 = wyf.copydefault()) != null) {
                C52794wYp.startLoading$default(c52794wYpCopydefault2, 0L, 1, null);
            }
        } else {
            wYF wyf2 = c50213vGb.gEmmrt;
            if (wyf2 != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
                c52794wYpCopydefault.fIwbmz();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50213vGb c50213vGb, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c50213vGb), null, null, new BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1(c50213vGb, c55804xqp, null), 3, null);
        return Unit.INSTANCE;
    }

    private final void fJNWhG() {
        OLrzqt().AEQbTJ(getArguments());
    }

    private final void AuCTel() {
        C55917xsw c55917xswKWHzl = OLrzqt().KWHzl();
        KWHzl(c55917xswKWHzl.EZpvd());
        AEQbTJ(c55917xswKWHzl.OLrzqt());
        copydefault();
        updateReminderValue$default(this, null, null, null, null, 15, null);
        TacticsData tacticsDataValueOf = OLrzqt().valueOf();
        if (tacticsDataValueOf != null) {
            OLrzqt().AEQbTJ(tacticsDataValueOf.getAlgoId());
        }
    }

    public final void copydefault() {
        OKReminder oKReminder = values().KWHzl;
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(0);
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(0);
    }

    public static /* synthetic */ void updateReminderValue$default(C50213vGb c50213vGb, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        c50213vGb.copydefault(str, str2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strCopydefault;
        OKReminder oKReminder = values().KWHzl;
        TacticsData tacticsDataValueOf = OLrzqt().valueOf();
        if (tacticsDataValueOf != null) {
            java.lang.String orderType = tacticsDataValueOf.getOrderType();
            if (!Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid") && Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                java.lang.String direction = tacticsDataValueOf.getDirection();
                int iHashCode = direction.hashCode();
                if (iHashCode != 3327612) {
                    if (iHashCode != 109413500) {
                        if (iHashCode == 1844321735 && direction.equals("neutral")) {
                            strCopydefault = C33070mpX.AYXKKw(C48033uCm.Fragment.YqksP);
                        }
                    } else if (direction.equals("short")) {
                        if (!tacticsDataValueOf.getBasePos()) {
                            strCopydefault = C33070mpX.AYXKKw(C48033uCm.Fragment.frkDMe);
                        } else {
                            android.os.Bundle arguments = getArguments();
                            java.lang.String strCopydefault2 = C53418wlC.copydefault(arguments != null ? arguments.getString("formattedEstimatedPositionToCloseKey") : null);
                            if (C33129mqd.valueOf(strCopydefault2, "0")) {
                                strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.awiJhF, C56424yEw.gEmmrt(C56390yDp.OLrzqt("invest", str), C56390yDp.OLrzqt("reinvest", str2), C56390yDp.OLrzqt("unpairAmt", str3), C56390yDp.OLrzqt("ccy", str4)));
                            } else {
                                strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.QfJbVf, C56424yEw.gEmmrt(C56390yDp.OLrzqt("invest", str), C56390yDp.OLrzqt("reinvest", str2), C56390yDp.OLrzqt("unpairAmt", str3), C56390yDp.OLrzqt("ccy", str4), C56390yDp.OLrzqt("portionAmt", strCopydefault2)));
                            }
                        }
                    }
                    strCopydefault = "";
                } else if (direction.equals("long")) {
                }
            } else {
                strCopydefault = "";
            }
            oKReminder.setMessage((java.lang.CharSequence) strCopydefault);
        }
    }

    public final void KWHzl(java.util.List<TacticsInsideItemData> list) {
        this.copydefault.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        RecyclerView recyclerView = values().EZpvd;
        recyclerView.setAdapter(this.copydefault);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C33064mpR.OLrzqt(this.copydefault, list);
    }

    public final void AEQbTJ(java.util.List<TacticsInsideItemData> list) {
        this.AEQbTJ.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        RecyclerView recyclerView = values().OLrzqt;
        recyclerView.setAdapter(this.AEQbTJ);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C33064mpR.OLrzqt(this.AEQbTJ, list);
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        if (!C54589xNz.EZpvd.EZpvd()) {
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.ActionBarDrawerToggleDelegateProvider, new View.OnClickListener() { // from class: o.vGe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50213vGb.AhwBna(this.KWHzl, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.RZMhtF, new View.OnClickListener() { // from class: o.vGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50213vGb.djBIcL(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AhwBna(C50213vGb c50213vGb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String id;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        int iAhwBna = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(c50213vGb.OLrzqt().AYXKKw())) == null || (id = tradeCoinInfoAhwBna.getId()) == null) ? -1 : C33129mqd.AhwBna(id);
        InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
        FragmentActivity fragmentActivityRequireActivity = c50213vGb.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC49497upf.OLrzqt(fragmentActivityRequireActivity, new CurrencyModel(iAhwBna, c50213vGb.OLrzqt().AYXKKw()), false);
        c50213vGb.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void djBIcL(C50213vGb c50213vGb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentActivity activity;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String minPx;
        java.lang.String maxPx;
        java.lang.String gridNum;
        TacticsData tacticsDataValueOf = c50213vGb.OLrzqt().valueOf();
        if (tacticsDataValueOf != null) {
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ = c50213vGb.OLrzqt().AEQbTJ();
            java.lang.String str = "";
            if (spotGridEditParamReqAEQbTJ == null || (minPx = spotGridEditParamReqAEQbTJ.getMinPx()) == null) {
                minPx = "";
            }
            tacticsDataValueOf.setMinPx(minPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ2 = c50213vGb.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ2 == null || (maxPx = spotGridEditParamReqAEQbTJ2.getMaxPx()) == null) {
                maxPx = "";
            }
            tacticsDataValueOf.setMaxPx(maxPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ3 = c50213vGb.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ3 != null && (gridNum = spotGridEditParamReqAEQbTJ3.getGridNum()) != null) {
                str = gridNum;
            }
            tacticsDataValueOf.setGridNum(str);
        }
        TacticsData tacticsDataValueOf2 = c50213vGb.OLrzqt().valueOf();
        if (tacticsDataValueOf2 != null && (activity = c50213vGb.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            java.lang.String orderType = tacticsDataValueOf2.getOrderType();
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                vGL.Companion.OLrzqt(tacticsDataValueOf2).show(supportFragmentManager);
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                C50225vGn.Companion.copydefault(tacticsDataValueOf2).show(supportFragmentManager);
            }
        }
        c50213vGb.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.RZMhtF, new View.OnClickListener() { // from class: o.vGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50213vGb.AYXKKw(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AYXKKw(C50213vGb c50213vGb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentActivity activity;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String minPx;
        java.lang.String maxPx;
        java.lang.String gridNum;
        TacticsData tacticsDataValueOf = c50213vGb.OLrzqt().valueOf();
        if (tacticsDataValueOf != null) {
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ = c50213vGb.OLrzqt().AEQbTJ();
            java.lang.String str = "";
            if (spotGridEditParamReqAEQbTJ == null || (minPx = spotGridEditParamReqAEQbTJ.getMinPx()) == null) {
                minPx = "";
            }
            tacticsDataValueOf.setMinPx(minPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ2 = c50213vGb.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ2 == null || (maxPx = spotGridEditParamReqAEQbTJ2.getMaxPx()) == null) {
                maxPx = "";
            }
            tacticsDataValueOf.setMaxPx(maxPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ3 = c50213vGb.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ3 != null && (gridNum = spotGridEditParamReqAEQbTJ3.getGridNum()) != null) {
                str = gridNum;
            }
            tacticsDataValueOf.setGridNum(str);
        }
        TacticsData tacticsDataValueOf2 = c50213vGb.OLrzqt().valueOf();
        if (tacticsDataValueOf2 != null && (activity = c50213vGb.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            java.lang.String orderType = tacticsDataValueOf2.getOrderType();
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                vGL.Companion.OLrzqt(tacticsDataValueOf2).show(supportFragmentManager);
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                C50225vGn.Companion.copydefault(tacticsDataValueOf2).show(supportFragmentManager);
            }
        }
        c50213vGb.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        if (!C54589xNz.EZpvd.EZpvd()) {
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.ActionBarDrawerToggleDelegateProvider, new View.OnClickListener() { // from class: o.vGj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50213vGb.gEmmrt(this.KWHzl, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.OJuSTm), new View.OnClickListener() { // from class: o.vGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50213vGb.valueOf(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(C50213vGb c50213vGb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String id;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        int iAhwBna = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(c50213vGb.OLrzqt().AYXKKw())) == null || (id = tradeCoinInfoAhwBna.getId()) == null) ? -1 : C33129mqd.AhwBna(id);
        InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
        FragmentActivity fragmentActivityRequireActivity = c50213vGb.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC49497upf.OLrzqt(fragmentActivityRequireActivity, new CurrencyModel(iAhwBna, c50213vGb.OLrzqt().AYXKKw()), false);
        c50213vGb.isConnected();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void valueOf(C50213vGb c50213vGb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentActivity activity;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String minPx;
        java.lang.String maxPx;
        java.lang.String gridNum;
        TacticsData tacticsDataValueOf = c50213vGb.OLrzqt().valueOf();
        if (tacticsDataValueOf != null) {
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ = c50213vGb.OLrzqt().AEQbTJ();
            java.lang.String str = "";
            if (spotGridEditParamReqAEQbTJ == null || (minPx = spotGridEditParamReqAEQbTJ.getMinPx()) == null) {
                minPx = "";
            }
            tacticsDataValueOf.setMinPx(minPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ2 = c50213vGb.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ2 == null || (maxPx = spotGridEditParamReqAEQbTJ2.getMaxPx()) == null) {
                maxPx = "";
            }
            tacticsDataValueOf.setMaxPx(maxPx);
            SpotGridEditParamReq spotGridEditParamReqAEQbTJ3 = c50213vGb.OLrzqt().AEQbTJ();
            if (spotGridEditParamReqAEQbTJ3 != null && (gridNum = spotGridEditParamReqAEQbTJ3.getGridNum()) != null) {
                str = gridNum;
            }
            tacticsDataValueOf.setGridNum(str);
        }
        TacticsData tacticsDataValueOf2 = c50213vGb.OLrzqt().valueOf();
        if (tacticsDataValueOf2 != null && (activity = c50213vGb.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            java.lang.String orderType = tacticsDataValueOf2.getOrderType();
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
                vGL.Companion.OLrzqt(tacticsDataValueOf2).show(supportFragmentManager);
            } else if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) {
                C50225vGn.Companion.copydefault(tacticsDataValueOf2).show(supportFragmentManager);
            }
        }
        c50213vGb.isConnected();
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
