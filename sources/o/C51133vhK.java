package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.DcaCopyConfirmTipsData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.NoConfirmData;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeInfo;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51133vhK extends AbstractC49945uyC<uPX, StgyCopyPresenter> {
    public boolean djBIcL;
    public final int OLrzqt = C48033uCm.Activity.QIZEnU;
    public java.lang.String copydefault = "";
    public java.lang.String AEQbTJ = "";
    public CopyBotReqParam AhwBna = new CopyBotReqParam(null, null, null, false, null, null, null, null, false, null, 1023, null);
    public final C43316rmw KWHzl = new C43316rmw();

    /* JADX INFO: renamed from: o.vhK$Activity */
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
    public boolean fetchVPNInfo() {
        return true;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        getNewProxyInstance();
        hDKMBd();
        getFieldNames();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.LayoutRes));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    private final void getFieldNames() {
        TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveDataAxsJAY = OLrzqt().AxsJAY();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAxsJAY.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vhJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51133vhK.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        }));
        OLrzqt().djBIcL().AhwBna().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vhL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51133vhK.OLrzqt(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        OLrzqt().djBIcL().gkJEwt().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51133vhK.EZpvd(this.OLrzqt, (AutoEarnStakingQueryConfig) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vhO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51133vhK.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C51133vhK c51133vhK, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51133vhK.ejfBZ();
        c51133vhK.AuCTel();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51133vhK, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51133vhK c51133vhK, StrategyConfigInfo strategyConfigInfo) {
        c51133vhK.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51133vhK c51133vhK, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        c51133vhK.AuCTel();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C51133vhK c51133vhK, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c51133vhK.OLrzqt().gHZMYf().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51133vhK, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        C43316rmw c43316rmw = this.KWHzl;
        StgyCopyPresenter stgyCopyPresenterOLrzqt = OLrzqt();
        java.lang.String quoteSz = this.AhwBna.getQuoteSz();
        if (quoteSz == null) {
            quoteSz = "";
        }
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) stgyCopyPresenterOLrzqt.EZpvd(quoteSz));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [121=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ejfBZ() {
        values().gEmmrt.setText(OLrzqt().AkhnZx());
        java.lang.String str = this.AEQbTJ;
        switch (str.hashCode()) {
            case -1831183611:
                if (!str.equals("spot_dca")) {
                    OLrzqt().OLrzqt();
                } else {
                    fIwbmz();
                }
                break;
            case -1402017003:
                if (str.equals("contract_dca")) {
                    fARcdN();
                    break;
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    values().djBIcL.setText(OLrzqt().OLrzqt());
                    break;
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    fJNWhG();
                    break;
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    values().djBIcL.setText(OLrzqt().OLrzqt());
                    isConnected();
                    break;
                }
                break;
            case 1165749981:
                if (!str.equals("recurring")) {
                }
                break;
        }
        values().AEQbTJ.setText(OLrzqt().finit() ? C33070mpX.AYXKKw(C55688xof.Application.izFvvl) : C33070mpX.AYXKKw(C55688xof.Application.sanrWj));
    }

    public final void fJNWhG() {
        if (OLrzqt().djBIcL() instanceof C51321vkn) {
            AbstractC51317vkj abstractC51317vkjDjBIcL = OLrzqt().djBIcL();
            Intrinsics.copydefault(abstractC51317vkjDjBIcL, "");
            C51321vkn c51321vkn = (C51321vkn) abstractC51317vkjDjBIcL;
            values().AYXKKw.setText(c51321vkn.copydefault());
            values().valueOf.setText(c51321vkn.AEQbTJ());
            AEQbTJ(c51321vkn.getNewProxyInstance());
            setDirectionBgColor$default(this, c51321vkn.OLrzqt(), false, 2, null);
            copydefault(c51321vkn.getNewProxyInstance());
            setLeverBgColor$default(this, c51321vkn.OLrzqt(), false, 2, null);
        }
        values().djBIcL.setText(OLrzqt().OLrzqt());
    }

    public final void fIwbmz() {
        values().djBIcL.setText(OLrzqt().OLrzqt());
        android.widget.TextView textView = values().AYXKKw;
        AbstractC51317vkj abstractC51317vkjDjBIcL = OLrzqt().djBIcL();
        if (abstractC51317vkjDjBIcL instanceof C51326vks) {
            Intrinsics.copydefault(textView);
            C51326vks c51326vks = (C51326vks) abstractC51317vkjDjBIcL;
            textView.setVisibility(C33129mqd.AEQbTJ(c51326vks.OLrzqt(), 1) ? 0 : 8);
            textView.setText(c51326vks.EZpvd() ? C33070mpX.AYXKKw(C55688xof.Application.DCUTEI) : C33070mpX.AYXKKw(C55688xof.Application.QHmsKR));
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
            textView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDCKfqPDCfLja)));
        }
    }

    public final void fARcdN() {
        if (OLrzqt().djBIcL() instanceof C51254vjZ) {
            AbstractC51317vkj abstractC51317vkjDjBIcL = OLrzqt().djBIcL();
            Intrinsics.copydefault(abstractC51317vkjDjBIcL, "");
            C51254vjZ c51254vjZ = (C51254vjZ) abstractC51317vkjDjBIcL;
            values().AYXKKw.setText(c51254vjZ.fIwbmz());
            values().valueOf.setText(c51254vjZ.hDKMBd());
            AEQbTJ(c51254vjZ.DTwDnp());
            setDirectionBgColor$default(this, c51254vjZ.valueOf(), false, 2, null);
            copydefault(c51254vjZ.DTwDnp());
            setLeverBgColor$default(this, c51254vjZ.valueOf(), false, 2, null);
        }
        values().djBIcL.setText(OLrzqt().OLrzqt());
    }

    /* JADX INFO: renamed from: o.vhK$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51133vhK KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51133vhK c51133vhK) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c51133vhK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            C54630xPm c54630xPmAuCTelauCTel;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.KWHzl.djBIcL && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) != null) {
                    C54630xPm.setOrderConfirm$default(c54630xPmAuCTelauCTel, false, null, 2, null);
                }
                pUU.KWHzl("Order", "CopyConfirmDialogFragment Order");
                StgyCopyPresenter stgyCopyPresenterOLrzqt = this.KWHzl.OLrzqt();
                CopyBotReqParam copyBotReqParam = this.KWHzl.AhwBna;
                java.lang.Boolean autoReserve = this.KWHzl.AhwBna.getAutoReserve();
                stgyCopyPresenterOLrzqt.KWHzl(copyBotReqParam, autoReserve != null ? autoReserve.booleanValue() : true);
            }
        }
    }

    /* JADX INFO: renamed from: o.vhK$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51133vhK AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51133vhK c51133vhK) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c51133vhK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }

    public final void copydefault() {
        values().djBIcL.setVisibility(0);
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "contract_dca")) {
            values().AYXKKw.setVisibility(0);
            values().valueOf.setVisibility(0);
        } else {
            values().AYXKKw.setVisibility(8);
            values().valueOf.setVisibility(8);
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairIRxXKY = OLrzqt().djBIcL().iRxXKY();
        android.widget.TextView textView = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(pairIRxXKY.getFirst().booleanValue() ? 0 : 8);
        values().AhwBna.setText(pairIRxXKY.getSecond());
    }

    private final void getNewProxyInstance() {
        values().OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        values().OLrzqt.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(12.0f, null, 1, null), 0));
        this.KWHzl.register(AutoVipProfitInfo.class, new C54145wyo(0, false, 3, null));
        this.KWHzl.register(C55848xrg.class, new C51233vjE());
        this.KWHzl.register(BotParamItemData.class, new C51263vji());
        this.KWHzl.register(SmartCoinsData.class, new C53186wgj());
        this.KWHzl.register(CoinTipsData.class, new C51272vjr());
        this.KWHzl.register(DcaCopyConfirmTipsData.class, new C51276vjv());
        this.KWHzl.register(PriceRangeInfo.class, new C51240vjL());
        this.KWHzl.register(NoConfirmData.class, new C51253vjY(new Function1() { // from class: o.vhM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51133vhK.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        values().OLrzqt.setAdapter(this.KWHzl);
    }

    public static final Unit AEQbTJ(C51133vhK c51133vhK, boolean z) {
        c51133vhK.djBIcL = z;
        return Unit.INSTANCE;
    }

    private final void hDKMBd() {
        C52794wYp c52794wYp = values().EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public final void AEQbTJ(int i) {
        values().AYXKKw.setTextColor(i);
    }

    public static /* synthetic */ void setDirectionBgColor$default(C51133vhK c51133vhK, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c51133vhK.OLrzqt(i, z);
    }

    public final void OLrzqt(int i, boolean z) {
        android.content.res.ColorStateList colorStateListValueOf;
        android.widget.TextView textView = values().AYXKKw;
        if (z) {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        } else {
            android.content.Context context = getContext();
            colorStateListValueOf = context != null ? android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, i)) : null;
        }
        textView.setBackgroundTintList(colorStateListValueOf);
    }

    public final void copydefault(int i) {
        values().valueOf.setTextColor(i);
    }

    public static /* synthetic */ void setLeverBgColor$default(C51133vhK c51133vhK, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c51133vhK.KWHzl(i, z);
    }

    public final void KWHzl(int i, boolean z) {
        android.content.res.ColorStateList colorStateListValueOf;
        android.widget.TextView textView = values().valueOf;
        if (z) {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        } else {
            android.content.Context context = getContext();
            colorStateListValueOf = context != null ? android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, i)) : null;
        }
        textView.setBackgroundTintList(colorStateListValueOf);
    }

    /* JADX INFO: renamed from: o.vhK$ActionBar */
    public static final class ActionBar {
        public java.lang.String copydefault = "";
        public java.lang.String EZpvd = "";
        public CopyBotReqParam KWHzl = new CopyBotReqParam(null, null, null, false, null, null, null, null, false, null, 1023, null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull CopyBotReqParam copyBotReqParam) {
            Intrinsics.checkNotNullParameter(copyBotReqParam, "");
            this.KWHzl = copyBotReqParam;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            return this;
        }

        public final C51133vhK EZpvd() {
            C51133vhK c51133vhK = new C51133vhK();
            c51133vhK.AEQbTJ = this.copydefault;
            c51133vhK.AhwBna = this.KWHzl;
            c51133vhK.copydefault = this.EZpvd;
            return c51133vhK;
        }
    }
}
