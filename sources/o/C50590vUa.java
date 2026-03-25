package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.balance.dto.AccountBalance;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringTradePresenterNew;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.RecurringBuyFrequency;
import com.okinc.tradingbot.impl.strategy.view.AllocationItem;
import com.okinc.tradingbot.impl.strategy.view.CoinPriceItem;
import com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C52812wZg;
import o.C55688xof;
import o.vTU;
import o.vTV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vUa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50590vUa extends AbstractC48165uHj<uQT, RecurringTradePresenterNew> {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vUc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50590vUa.AkhnZx(this.AEQbTJ);
        }
    });
    public vTS AEQbTJ = new FragmentManager();
    public vTS OLrzqt = new LoaderManager();

    /* JADX INFO: renamed from: o.vUa$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.zDUObI;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RecurringTradePresenterNew djBIcL(C50590vUa c50590vUa) {
        return (RecurringTradePresenterNew) c50590vUa.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uQT valueOf(C50590vUa c50590vUa) {
        return (uQT) c50590vUa.gGvvIC();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "RecurringTradeFragmentNew", new kotlin.Pair[0], null, 8, null);
    }

    public static final C53518wmx AkhnZx(C50590vUa c50590vUa) {
        android.content.Context contextRequireContext = c50590vUa.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    private final C53518wmx getNewProxyInstance() {
        return (C53518wmx) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return getNewProxyInstance();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.copydefault(view);
        ((RecurringTradePresenterNew) dxcTrN()).zLjUOn();
        ((uQT) gGvvIC()).AYXKKw.setMaxDecimal(2);
        hDKMBd();
        fARcdN();
        getFieldNames();
        zsXlph();
        ((uQT) gGvvIC()).djBIcL.setText("--");
        C55867xrz.KWHzl.OLrzqt("recurring", ((RecurringTradePresenterNew) dxcTrN()).fvQaOB().gEmmrt());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        ((RecurringTradePresenterNew) dxcTrN()).AEQbTJ(((RecurringTradePresenterNew) dxcTrN()).fetchVPNInfo());
    }

    /* JADX INFO: renamed from: o.vUa$FragmentManager */
    public static final class FragmentManager implements vTS {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.vTS
        public void AEQbTJ(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
        }

        public FragmentManager() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.vTU.Activity.newInstance$default(o.vTU$Activity, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, o.vTS, int, java.lang.Object):o.vTU */
        @Override // o.vTS
        public void KWHzl(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            vTU.Activity.newInstance$default(vTU.Companion, C50590vUa.djBIcL(C50590vUa.this).fvQaOB().copydefault("recurring"), C50590vUa.valueOf(C50590vUa.this).AYXKKw.KWHzl(), arrayList, null, C50590vUa.this.OLrzqt, 8, null).show(C50590vUa.this.getChildFragmentManager(), "RecurringCoinRatioFragment");
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringTradePresenterNew.requestMinInvest$default(com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringTradePresenterNew, long, int, java.lang.Object):void */
        @Override // o.vTS
        public void EZpvd(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String name = ((SelectCoinData) it.next()).getName();
                if (name == null) {
                    name = "";
                }
                arrayList2.add(name);
            }
            C50590vUa.djBIcL(C50590vUa.this).fARcdN().clear();
            C50590vUa.djBIcL(C50590vUa.this).fARcdN().addAll(arrayList);
            C50590vUa.this.EZpvd(arrayList2);
            RecurringTradePresenterNew.requestMinInvest$default(C50590vUa.djBIcL(C50590vUa.this), 0L, 1, null);
            C50590vUa.this.fJNWhG();
            C50590vUa.valueOf(C50590vUa.this).OLrzqt.setPriceRange(C50590vUa.djBIcL(C50590vUa.this).fJNWhG());
        }
    }

    /* JADX INFO: renamed from: o.vUa$LoaderManager */
    public static final class LoaderManager implements vTS {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.vTS
        public void KWHzl(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
        }

        public LoaderManager() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.vTV.ActionBar.newInstance$default(o.vTV$ActionBar, int, int, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, o.vTS, int, java.lang.Object):o.wnr */
        @Override // o.vTS
        public void AEQbTJ(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            vTV.ActionBar actionBar = vTV.Companion;
            java.util.ArrayList<SelectCoinData> arrayListDjBIcL = C50590vUa.djBIcL(C50590vUa.this).djBIcL();
            java.lang.String strOLrzqt = C50590vUa.djBIcL(C50590vUa.this).fvQaOB().OLrzqt();
            actionBar.AEQbTJ((3 & 1) != 0 ? 1 : 0, (3 & 2) != 0 ? 20 : 0, arrayListDjBIcL, arrayList, strOLrzqt == null ? "" : strOLrzqt, "Recurring_ratio_page", C50590vUa.this.AEQbTJ).show(C50590vUa.this.getChildFragmentManager(), "SelectCoinFragment");
        }

        @Override // o.vTS
        public void EZpvd(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String name = ((SelectCoinData) it.next()).getName();
                if (name == null) {
                    name = "";
                }
                arrayList2.add(name);
            }
            C50590vUa.djBIcL(C50590vUa.this).fARcdN().clear();
            C50590vUa.djBIcL(C50590vUa.this).fARcdN().addAll(arrayList);
            C50590vUa.this.EZpvd(arrayList2);
            RecurringTradePresenterNew.requestMinInvest$default(C50590vUa.djBIcL(C50590vUa.this), 0L, 1, null);
            C50590vUa.this.fJNWhG();
            C50590vUa.valueOf(C50590vUa.this).OLrzqt.setPriceRange(C50590vUa.djBIcL(C50590vUa.this).fJNWhG());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        java.lang.String displayQuoteSymbol;
        ((uQT) gGvvIC()).DbNXlk.setOnSelectedCallback(new Function1() { // from class: o.vUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.valueOf(this.copydefault, (java.lang.String) obj);
            }
        });
        BizInstrument bizInstrumentAhwBna = ((RecurringTradePresenterNew) dxcTrN()).fvQaOB().AhwBna();
        ((uQT) gGvvIC()).DbNXlk.setFm(getChildFragmentManager());
        ((uQT) gGvvIC()).DbNXlk.copydefault(this, bizInstrumentAhwBna, TradeType.BUY_OPEN, true);
        boolean zIsDisplayTradeReceive = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.isDisplayTradeReceive() : false;
        uBL ubl = ((uQT) gGvvIC()).DbNXlk;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        ubl.setVisibility(zIsDisplayTradeReceive ? 0 : 8);
        uBL ubl2 = ((uQT) gGvvIC()).DbNXlk;
        int i = C55688xof.Application.getLegacyAudioStream;
        if (bizInstrumentAhwBna != null && (displayQuoteSymbol = bizInstrumentAhwBna.getDisplayQuoteSymbol()) != null) {
            str = displayQuoteSymbol;
        }
        ubl2.setReminderText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("investCcy", str))));
        ((RecurringTradePresenterNew) dxcTrN()).fvQaOB().gEmmrt(((uQT) gGvvIC()).DbNXlk.OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C50590vUa c50590vUa, java.lang.String str) {
        pUU.EZpvd("USDRename", "RecurringTradeFragmentNew onTradeWith selected: " + str);
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fvQaOB().gEmmrt(str);
        ((uQT) c50590vUa.gGvvIC()).AYXKKw.copydefault();
        ((uQT) c50590vUa.gGvvIC()).AYXKKw.EZpvd();
        c50590vUa.AEQbTJ(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vUa$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50590vUa copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50590vUa c50590vUa) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c50590vUa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.copydefault.getContext();
                if (context == null) {
                    return;
                }
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.onComplete);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.DcMfJKDGTeJD);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vUa$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50590vUa OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50590vUa c50590vUa) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c50590vUa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.fIwbmz();
                C56028xvA.botClickTrack$default("recurringTimeView", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vUa$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C50590vUa KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50590vUa c50590vUa) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c50590vUa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.vUa$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50590vUa KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50590vUa c50590vUa) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c50590vUa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (C50590vUa.djBIcL(this.KWHzl).fARcdN().size() == 1 && C50590vUa.djBIcL(this.KWHzl).copydefault()) {
                    vTV.ActionBar actionBar = vTV.Companion;
                    java.util.ArrayList<SelectCoinData> arrayListDjBIcL = C50590vUa.djBIcL(this.KWHzl).djBIcL();
                    java.util.ArrayList<SelectCoinData> arrayListFARcdN = C50590vUa.djBIcL(this.KWHzl).fARcdN();
                    java.lang.String strOLrzqt = C50590vUa.djBIcL(this.KWHzl).fvQaOB().OLrzqt();
                    if (strOLrzqt == null) {
                        strOLrzqt = "";
                    }
                    actionBar.AEQbTJ((3 & 1) != 0 ? 1 : 0, (3 & 2) != 0 ? 20 : 0, arrayListDjBIcL, arrayListFARcdN, strOLrzqt, "Recurring_main_page", this.KWHzl.AEQbTJ).show(this.KWHzl.getChildFragmentManager(), "SelectCoinFragment");
                } else {
                    vTU.Activity.newInstance$default(vTU.Companion, C50590vUa.djBIcL(this.KWHzl).fvQaOB().copydefault("recurring"), C50590vUa.valueOf(this.KWHzl).AYXKKw.KWHzl(), C50590vUa.djBIcL(this.KWHzl).fARcdN(), null, this.KWHzl.OLrzqt, 8, null).show(this.KWHzl.getChildFragmentManager(), "RecurringCoinRatioFragment");
                }
                C56028xvA.botClickTrack$default("recurringCoinFilter", null, 2, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        ((uQT) gGvvIC()).gEmmrt.setContentText(((RecurringTradePresenterNew) dxcTrN()).KWHzl(((RecurringTradePresenterNew) dxcTrN()).AuCTel(), ((RecurringTradePresenterNew) dxcTrN()).getNewProxyInstance(), ((RecurringTradePresenterNew) dxcTrN()).hDKMBd(), ((RecurringTradePresenterNew) dxcTrN()).gEmmrt()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        C50653vWj c50653vWj = ((uQT) gGvvIC()).EZpvd;
        c50653vWj.setOnClickListener(new TaskDescription(c50653vWj, 1000L, this));
        vUW vuw = ((uQT) gGvvIC()).OLrzqt;
        vuw.OLrzqt(new Function0() { // from class: o.vUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50590vUa.DbNXlk(this.AEQbTJ);
            }
        });
        vuw.KWHzl(new Function0() { // from class: o.vUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50590vUa.isConnected(this.KWHzl);
            }
        });
        ((uQT) gGvvIC()).copydefault.setShowClick((!C55697xoo.OLrzqt.isConnected() || C56071xvr.gEmmrt.ejfBZ() || C54589xNz.EZpvd.EZpvd()) ? false : true, new View.OnClickListener() { // from class: o.vUg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50590vUa.KWHzl(this.AEQbTJ, view);
            }
        });
        C50660vWq c50660vWq = ((uQT) gGvvIC()).gEmmrt;
        c50660vWq.setOnClickListener(new Activity(c50660vWq, 1000L, this));
        ((uQT) gGvvIC()).AYXKKw.setOnTextChangeCallback(new Function1() { // from class: o.vUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.gEmmrt(this.KWHzl, (java.lang.String) obj);
            }
        });
        C53518wmx newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            newProxyInstance.setOnClickListener(new StateListAnimator(newProxyInstance, 1000L, this));
        }
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.vUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50590vUa.EZpvd(this.EZpvd, str, bundle);
            }
        });
        C55320xhi c55320xhi = ((uQT) gGvvIC()).values;
        c55320xhi.setOnClickListener(new ActionBar(c55320xhi, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(final C50590vUa c50590vUa) {
        C50404vNd.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder), ((uQT) c50590vUa.gGvvIC()).OLrzqt.OLrzqt(), (52 & 4) != 0 ? 40 : 0, false, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null, new Function2() { // from class: o.vUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50590vUa.copydefault(this.OLrzqt, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }).show(c50590vUa.getChildFragmentManager(), "BottomEditStrategyNameDialog");
        C56028xvA.botClickTrack$default("botName", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C50590vUa c50590vUa, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).copydefault(true);
            c50590vUa.EZpvd(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isConnected(final C50590vUa c50590vUa) {
        vMR vmrCopydefault = vMR.Companion.copydefault(((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fIwbmz(), new Function1() { // from class: o.vUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.KWHzl(this.OLrzqt, (java.util.ArrayList) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = c50590vUa.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        vmrCopydefault.show(childFragmentManager);
        C56028xvA.botClickTrack$default("priceRange", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50590vUa c50590vUa, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).EZpvd(arrayList);
        ((uQT) c50590vUa.gGvvIC()).OLrzqt.setPriceRange(((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fJNWhG());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C50590vUa c50590vUa, android.view.View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String strCopydefault = ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fvQaOB().copydefault("recurring");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        int iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(strCopydefault)) == null) ? null : tradeCoinInfoAhwBna.getId());
        FragmentActivity activity = c50590vUa.getActivity();
        if (activity != null) {
            ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(activity, new CurrencyModel(iAhwBna, strCopydefault), false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C50590vUa c50590vUa, java.lang.String str) {
        c50590vUa.KWHzl(false);
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).KWHzl(((uQT) c50590vUa.gGvvIC()).AYXKKw.KWHzl());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C50590vUa c50590vUa, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        pUU.KWHzl("Order", "RecurringTradeFragmentNew Order 二次确认");
        c50590vUa.iwGUEr();
    }

    /* JADX INFO: renamed from: o.vUa$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        xOW newProxyInstance;
        if (checkInvestIsValid$default(this, false, 1, null) && ((RecurringTradePresenterNew) dxcTrN()).copydefault()) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            final java.lang.String str = c54589xNz.EZpvd() ? "demo" : "live";
            C32866mlf.onEvent$default("app_trade_strategy_confirm_create_click", (TrackChannel[]) null, new Function1() { // from class: o.vUw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50590vUa.EZpvd(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vUz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50590vUa.AEQbTJ(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = BotOrderConfirmFragment.Companion.copydefault(((RecurringTradePresenterNew) dxcTrN()).fvQaOB().gEmmrt(), ((RecurringTradePresenterNew) dxcTrN()).fvQaOB().djBIcL(), ((RecurringTradePresenterNew) dxcTrN()).copydefault(((uQT) gGvvIC()).OLrzqt.OLrzqt(), ((uQT) gGvvIC()).AYXKKw.KWHzl()), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : new Function1() { // from class: o.vUb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50590vUa.AYXKKw(this.AEQbTJ, (java.lang.String) obj);
                    }
                });
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                botOrderConfirmFragmentCopydefault.show(childFragmentManager);
                return;
            }
            pUU.KWHzl("BotOrder", "二次确认功能关闭 RecurringTradeFragmentNew Start Order");
            iwGUEr();
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entrust_type", "recurring", true);
        eventParamsList.put(OtcExtraKeys.MODE, str, true);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strWlaJM = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
        if (strWlaJM != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strWlaJM)) {
            eventParamsList.put("account_type", strWlaJM, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "recurring", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C50590vUa c50590vUa, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "price_setting")) {
            c50590vUa.ejfBZ();
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coins")) {
            c50590vUa.AuCTel();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        java.util.ArrayList<SelectCoinData> arrayListFARcdN = ((RecurringTradePresenterNew) dxcTrN()).fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListFARcdN, 10));
        for (SelectCoinData selectCoinData : arrayListFARcdN) {
            java.lang.String name = selectCoinData.getName();
            java.lang.String str = "";
            if (name == null) {
                name = "";
            }
            java.lang.String icon = selectCoinData.getIcon();
            if (icon != null) {
                str = icon;
            }
            arrayList.add(new CoinPriceItem(name, str, C56046xvS.AEQbTJ.EZpvd(selectCoinData.getMinPrice(), selectCoinData.getMaxPrice())));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((CoinPriceItem) obj).OLrzqt(), (java.lang.Object) "--")) {
                arrayList2.add(obj);
            }
        }
        CoinsPriceBottomSheet.Companion.copydefault(arrayList2, CoinsPriceBottomSheet.Mode.PRICE_RANGE).show(getChildFragmentManager(), "CoinsPriceBottomSheet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        java.util.ArrayList<SelectCoinData> arrayListFARcdN = ((RecurringTradePresenterNew) dxcTrN()).fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListFARcdN, 10));
        for (SelectCoinData selectCoinData : arrayListFARcdN) {
            java.lang.String name = selectCoinData.getName();
            if (name == null) {
                name = "";
            }
            java.lang.String ratio = selectCoinData.getRatio();
            arrayList.add(new AllocationItem(name, C33129mqd.divS$default(ratio == null ? "" : ratio, 100, null, null, null, 14, null)));
        }
        C52566wQd.Companion.KWHzl(arrayList).show(getChildFragmentManager(), "CoinTargetAllocationRingChartBottomSheet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void iwGUEr() {
        ((RecurringTradePresenterNew) dxcTrN()).AEQbTJ(((uQT) gGvvIC()).OLrzqt.OLrzqt(), ((uQT) gGvvIC()).AYXKKw.KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        C50626vVj.Companion.KWHzl(RecurringBuyFrequency.Companion.AEQbTJ(((RecurringTradePresenterNew) dxcTrN()).AuCTel(), ((RecurringTradePresenterNew) dxcTrN()).getNewProxyInstance()), ((RecurringTradePresenterNew) dxcTrN()).getNewProxyInstance(), ((RecurringTradePresenterNew) dxcTrN()).hDKMBd(), ((RecurringTradePresenterNew) dxcTrN()).gEmmrt(), new yHT() { // from class: o.vUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C50590vUa.EZpvd(this.OLrzqt, (RecurringBuyFrequency) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), (FirstTimeBuyOption) obj4);
            }
        }).show(getChildFragmentManager(), "RecurringBuyFrequencySelectionBottomSheet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50590vUa c50590vUa, RecurringBuyFrequency recurringBuyFrequency, int i, int i2, FirstTimeBuyOption firstTimeBuyOption) {
        Intrinsics.checkNotNullParameter(recurringBuyFrequency, "");
        Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).OLrzqt(recurringBuyFrequency.getPeriodIndex());
        RecurringTradePresenterNew recurringTradePresenterNew = (RecurringTradePresenterNew) c50590vUa.dxcTrN();
        if (recurringBuyFrequency.isHourlyFrequency()) {
            i = recurringBuyFrequency.getSubPeriodIndex();
        }
        recurringTradePresenterNew.KWHzl(i);
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).AEQbTJ(i2);
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).KWHzl(firstTimeBuyOption);
        c50590vUa.getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        ((RecurringTradePresenterNew) dxcTrN()).AEQbTJ(((RecurringTradePresenterNew) dxcTrN()).djBIcL());
        BizInstrument bizInstrumentAYXKKw = ((RecurringTradePresenterNew) dxcTrN()).AYXKKw();
        if (bizInstrumentAYXKKw != null) {
            ((RecurringTradePresenterNew) dxcTrN()).OLrzqt(bizInstrumentAYXKKw.getInstType(), bizInstrumentAYXKKw.getInstId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zsXlph() {
        TradeLiveData<java.util.ArrayList<AccountBalance>> tradeLiveDataEZpvd = ((RecurringTradePresenterNew) dxcTrN()).EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vUi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.AhwBna(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataAkhnZx = ((RecurringTradePresenterNew) dxcTrN()).AkhnZx();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.copydefault(this.OLrzqt, (MinInvestResp) obj);
            }
        }));
        C56111xwe<java.util.List<StrategyResponse>> c56111xweValues = ((RecurringTradePresenterNew) dxcTrN()).values();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweValues.observe(viewLifecycleOwner3, new PendingIntent(new Function1() { // from class: o.vUq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }));
        ((RecurringTradePresenterNew) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.KWHzl(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweUzCIH = ((RecurringTradePresenterNew) dxcTrN()).uzCIH();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweUzCIH.observe(viewLifecycleOwner4, new PendingIntent(new Function1() { // from class: o.vUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.djBIcL(this.EZpvd, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweValueOf = ((RecurringTradePresenterNew) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweValueOf.observe(viewLifecycleOwner5, new PendingIntent(new Function1() { // from class: o.vUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.AhwBna(this.copydefault, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AhwBna(C50590vUa c50590vUa, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c50590vUa.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C50590vUa c50590vUa, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        java.lang.String strCopydefault = xMR.copydefault.copydefault(minInvestResp.getMinInvestment());
        ((uQT) c50590vUa.gGvvIC()).AYXKKw.setHint("≥" + strCopydefault);
        c50590vUa.KWHzl(false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C50590vUa c50590vUa, java.util.List list) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        ((uQT) c50590vUa.gGvvIC()).AYXKKw.copydefault();
        ((uQT) c50590vUa.gGvvIC()).AYXKKw.EZpvd();
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).wlaJM();
        c50590vUa.getFieldNames();
        pUU.KWHzl(c50590vUa.getTAG(), "order success");
        C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> c56126xwtAuCTel = c50590vUa.finit().AuCTel();
        StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (strategyResponse != null && (algoId = strategyResponse.getAlgoId()) != null) {
            str = algoId;
        }
        c56126xwtAuCTel.KWHzl(C56390yDp.OLrzqt("recurring", str));
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).AEQbTJ(true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50590vUa c50590vUa, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).ejfBZ().bB_())) {
            java.lang.Exception exc = (java.lang.Exception) pair.second;
            if (exc != null && (message = exc.getMessage()) != null) {
                C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strGEmmrt = ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fvQaOB().gEmmrt();
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 == null) {
                message2 = "";
            }
            java.lang.String str2 = message2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "recurring", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str2, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).DbNXlk().bB_())) {
            pUU.copydefault(c50590vUa.getTAG(), pair.first + " fails cause: " + ((java.lang.Exception) pair.second).getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(final C50590vUa c50590vUa, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "average_ratio")) {
            android.content.Context context = c50590vUa.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.processStrongAuthMessage));
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C48033uCm.Fragment.gBtXYZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fvQaOB().copydefault("recurring")))));
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintViewpositionInWindow, new View.OnClickListener() { // from class: o.vUk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50590vUa.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "custom_ratio")) {
            android.content.Context context2 = c50590vUa.getContext();
            if (context2 == null) {
                return Unit.INSTANCE;
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context2);
            viewOnClickListenerC54939xaY2.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.processStrongAuthMessage));
            viewOnClickListenerC54939xaY2.EZpvd(C33069mpW.copydefault(C48033uCm.Fragment.dzkkkq, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fvQaOB().copydefault("recurring")))));
            viewOnClickListenerC54939xaY2.EZpvd(C48033uCm.Fragment.fupbxE, new View.OnClickListener() { // from class: o.vUt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50590vUa.OLrzqt(viewOnClickListenerC54939xaY2, c50590vUa, view);
                }
            });
            viewOnClickListenerC54939xaY2.OLrzqt(C48033uCm.Fragment.deregisterUser, new View.OnClickListener() { // from class: o.vUu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50590vUa.AEQbTJ(viewOnClickListenerC54939xaY2, view);
                }
            });
            viewOnClickListenerC54939xaY2.show();
        }
        java.util.ArrayList<SelectCoinData> arrayListFARcdN = ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListFARcdN, 10));
        java.util.Iterator<T> it = arrayListFARcdN.iterator();
        while (it.hasNext()) {
            java.lang.String name = ((SelectCoinData) it.next()).getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(name);
        }
        c50590vUa.EZpvd(arrayList);
        c50590vUa.AubY();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C50590vUa c50590vUa, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        vTU.Companion.AEQbTJ(((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fvQaOB().copydefault("recurring"), ((uQT) c50590vUa.gGvvIC()).AYXKKw.KWHzl(), ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).fARcdN(), "custom_ratio", c50590vUa.OLrzqt).show(c50590vUa.getChildFragmentManager(), "RecurringCoinRatioFragment");
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C50590vUa c50590vUa, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((uQT) c50590vUa.gGvvIC()).djBIcL.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        ((uQT) gGvvIC()).copydefault.setText(C33070mpX.AYXKKw(C55688xof.Application.ActionBarTabListener), uLP.AEQbTJ(((RecurringTradePresenterNew) dxcTrN()).iwGUEr()), "");
        ((RecurringTradePresenterNew) dxcTrN()).KWHzl(((uQT) gGvvIC()).AYXKKw.KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AubY() {
        valueOf();
        ((RecurringTradePresenterNew) dxcTrN()).AEQbTJ(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        C53518wmx newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            newProxyInstance.OLrzqt();
        }
        RecurringTradePresenterNew.fetchAccountGroupData$default((RecurringTradePresenterNew) dxcTrN(), false, 1, null);
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        ((RecurringTradePresenterNew) dxcTrN()).AubY();
        if (z || ((RecurringTradePresenterNew) dxcTrN()).fARcdN().isEmpty()) {
            AYXKKw();
        }
        fetchVPNInfo();
        AuCTelauCTel();
        fJNWhG();
        java.util.ArrayList<SelectCoinData> arrayListFARcdN = ((RecurringTradePresenterNew) dxcTrN()).fARcdN();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListFARcdN, 10));
        java.util.Iterator<T> it = arrayListFARcdN.iterator();
        while (it.hasNext()) {
            java.lang.String name = ((SelectCoinData) it.next()).getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(name);
        }
        EZpvd(arrayList);
        values();
        RecurringTradePresenterNew.requestMinInvest$default((RecurringTradePresenterNew) dxcTrN(), 0L, 1, null);
        AubY();
        ((RecurringTradePresenterNew) dxcTrN()).AEQbTJ(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTelauCTel() {
        ((uQT) gGvvIC()).AYXKKw.setUnit(((RecurringTradePresenterNew) dxcTrN()).fvQaOB().copydefault("recurring"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        ((uQT) gGvvIC()).OLrzqt.setBotName(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        ((uQT) gGvvIC()).copydefault.OLrzqt((!C55697xoo.OLrzqt.isConnected() || C56071xvr.gEmmrt.ejfBZ() || C54589xNz.EZpvd.EZpvd()) ? false : true);
        ((uQT) gGvvIC()).copydefault.setText(C33070mpX.AYXKKw(C55688xof.Application.ActionBarTabListener), "-- " + ((RecurringTradePresenterNew) dxcTrN()).fvQaOB().copydefault("recurring"), "");
        ((uQT) gGvvIC()).copydefault.setTitleAppearance(C52761wXj.LoaderManager.AxsJAY);
        ((uQT) gGvvIC()).copydefault.setTitleColor(C52761wXj.Activity.DCUTEIddSDPG);
        ((uQT) gGvvIC()).copydefault.setContentAppearance(C52761wXj.LoaderManager.AwvSrB);
        ((uQT) gGvvIC()).copydefault.OLrzqt(true, new View.OnClickListener() { // from class: o.vUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50590vUa.AEQbTJ(this.AEQbTJ, view);
            }
        });
        copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(final C50590vUa c50590vUa, android.view.View view) {
        RecurringTradePresenterNew.fetchAccountGroupData$default((RecurringTradePresenterNew) c50590vUa.dxcTrN(), false, 1, null);
        java.lang.String strAEQbTJ = ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).AEQbTJ(AccountType.TRADE);
        vUU.Companion.KWHzl(((RecurringTradePresenterNew) c50590vUa.dxcTrN()).AhwBna(), C33070mpX.AYXKKw(C48033uCm.Fragment.hdBMmm) + " " + strAEQbTJ, new Function1() { // from class: o.vTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50590vUa.AEQbTJ(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }).show(c50590vUa.getChildFragmentManager(), vUU.class.getSimpleName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50590vUa c50590vUa, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).KWHzl().clear();
        ((RecurringTradePresenterNew) c50590vUa.dxcTrN()).KWHzl().addAll(arrayList);
        c50590vUa.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        android.widget.TextView textViewCopydefault;
        if (!SPUtils.getBoolean("recurring_need_on_boarding", true, "trade_bot_recurring_setting") || (textViewCopydefault = ((uQT) gGvvIC()).copydefault.copydefault()) == null) {
            return;
        }
        textViewCopydefault.post(new java.lang.Runnable() { // from class: o.vTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50590vUa.fetchVPNInfo(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fetchVPNInfo(C50590vUa c50590vUa) {
        android.content.Context contextRequireContext = c50590vUa.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C52812wZg c52812wZg = new C52812wZg(contextRequireContext);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(((uQT) c50590vUa.gGvvIC()).copydefault.copydefault());
        stateListAnimator.EZpvd(1);
        stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.getUserContextRegisteredStatus));
        stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.aKhcqp));
        C52812wZg c52812wZgOLrzqt = c52812wZg.AEQbTJ(stateListAnimator).OLrzqt(0);
        c52812wZgOLrzqt.KWHzl(new Function0() { // from class: o.vTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50590vUa.KWHzl();
            }
        });
        c52812wZgOLrzqt.fARcdN();
        SPUtils.put("recurring_need_on_boarding", java.lang.Boolean.FALSE, "trade_bot_recurring_setting");
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return;
        }
        C50653vWj.refreshCircleCoins$default(((uQT) gGvvIC()).EZpvd, list, 0, 2, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (CollectionsKt___CollectionsKt.AkhnZx(list, i) != null) {
                sb.append((java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list, i));
                sb.append(", ");
            }
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        ((uQT) gGvvIC()).EZpvd.setTitle(C33069mpW.copydefault(C55688xof.Application.Cancellable, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", sb.toString()))));
        android.widget.TextView textView = ((uQT) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(((RecurringTradePresenterNew) dxcTrN()).copydefault() ^ true ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        java.lang.String str;
        if (((RecurringTradePresenterNew) dxcTrN()).AuCTelauCTel()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (CollectionsKt___CollectionsKt.AkhnZx(((RecurringTradePresenterNew) dxcTrN()).fARcdN(), i) != null) {
                SelectCoinData selectCoinData = (SelectCoinData) CollectionsKt___CollectionsKt.AkhnZx(((RecurringTradePresenterNew) dxcTrN()).fARcdN(), i);
                sb.append(selectCoinData != null ? selectCoinData.getName() : null);
                sb.append(", ");
            }
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        if (((RecurringTradePresenterNew) dxcTrN()).fARcdN().size() > 3) {
            sb.append("...");
        }
        if (((RecurringTradePresenterNew) dxcTrN()).fARcdN().size() <= 1) {
            str = ((java.lang.Object) sb) + C33070mpX.AYXKKw(C55688xof.Application.addCustomAction);
        } else {
            str = ((java.lang.Object) sb) + C33070mpX.AYXKKw(C55688xof.Application.getName);
        }
        ((uQT) gGvvIC()).OLrzqt.setBotName(str);
    }

    public static /* synthetic */ boolean checkInvestIsValid$default(C50590vUa c50590vUa, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c50590vUa.KWHzl(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean KWHzl(boolean z) {
        java.lang.String minInvestment;
        MinInvestResp value = ((RecurringTradePresenterNew) dxcTrN()).AkhnZx().getValue();
        if (value == null || (minInvestment = value.getMinInvestment()) == null) {
            minInvestment = "0";
        }
        java.lang.String strKWHzl = ((uQT) gGvvIC()).AYXKKw.KWHzl();
        if (!z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            ((uQT) gGvvIC()).AYXKKw.EZpvd();
            return true;
        }
        if (C33129mqd.copydefault(strKWHzl, minInvestment)) {
            ((uQT) gGvvIC()).AYXKKw.EZpvd();
            return true;
        }
        ((uQT) gGvvIC()).AYXKKw.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.setFlags)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(minInvestment)), C56390yDp.OLrzqt("unit", ((RecurringTradePresenterNew) dxcTrN()).fvQaOB().copydefault("recurring")))));
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        java.lang.Object next;
        android.os.Bundle arguments = getArguments();
        RecurringOrderData recurringOrderData = arguments != null ? (RecurringOrderData) arguments.getParcelable("bot_copy_req") : null;
        if (!(recurringOrderData instanceof RecurringOrderData)) {
            recurringOrderData = null;
        }
        if (recurringOrderData != null) {
            setArguments(null);
            ((RecurringTradePresenterNew) dxcTrN()).fARcdN().clear();
            java.util.List<CoinRatioParam> recurringList = recurringOrderData.getRecurringList();
            if (recurringList != null) {
                for (CoinRatioParam coinRatioParam : recurringList) {
                    java.util.Iterator<T> it = ((RecurringTradePresenterNew) dxcTrN()).djBIcL().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((SelectCoinData) next).getName(), (java.lang.Object) coinRatioParam.getCcy())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SelectCoinData selectCoinData = (SelectCoinData) next;
                    if (selectCoinData != null) {
                        java.util.ArrayList<SelectCoinData> arrayListFARcdN = ((RecurringTradePresenterNew) dxcTrN()).fARcdN();
                        selectCoinData.setRatio(C33129mqd.mulS$default(coinRatioParam.getRatio(), 100, null, null, null, 14, null));
                        selectCoinData.setSelected(true);
                        selectCoinData.setMinPrice(coinRatioParam.getMinPrice());
                        selectCoinData.setMaxPrice(coinRatioParam.getMaxPrice());
                        arrayListFARcdN.add(selectCoinData);
                    }
                }
            }
            java.util.ArrayList<SelectCoinData> arrayListFARcdN2 = ((RecurringTradePresenterNew) dxcTrN()).fARcdN();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListFARcdN2, 10));
            java.util.Iterator<T> it2 = arrayListFARcdN2.iterator();
            while (it2.hasNext()) {
                java.lang.String name = ((SelectCoinData) it2.next()).getName();
                if (name == null) {
                    name = "";
                }
                arrayList.add(name);
            }
            EZpvd(arrayList);
            ((RecurringTradePresenterNew) dxcTrN()).OLrzqt(RecurringCycleConfigNew.Companion.OLrzqt(recurringOrderData.getPeriod()));
            ((RecurringTradePresenterNew) dxcTrN()).KWHzl(Intrinsics.EZpvd((java.lang.Object) recurringOrderData.getPeriod(), (java.lang.Object) "hourly") ? RecurringHourlyConfig.Companion.OLrzqt(recurringOrderData.getRecurringHour()) : C56548yJl.copydefault(C33129mqd.AhwBna(recurringOrderData.getRecurringDay()) - 1, 0));
            ((RecurringTradePresenterNew) dxcTrN()).AEQbTJ(C33129mqd.AhwBna(recurringOrderData.getRecurringTime()));
            getFieldNames();
            java.lang.String stgyName = recurringOrderData.getStgyName();
            if (stgyName != null) {
                ((uQT) gGvvIC()).OLrzqt.setBotName(stgyName);
            } else {
                fJNWhG();
            }
            ((uQT) gGvvIC()).OLrzqt.setPriceRange(((RecurringTradePresenterNew) dxcTrN()).fJNWhG());
        }
    }
}
