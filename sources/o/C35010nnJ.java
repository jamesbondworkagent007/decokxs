package o;

import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_find.data.NewCoinFuturesRankPo;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC55470xkZ;
import o.InterfaceC27808kEb;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35010nnJ extends AbstractC35003nnC implements InterfaceC27808kEb {
    public final /* synthetic */ kDL hDKMBd = new kDL();
    public final Function1<AbstractC55470xkZ.StateListAnimator, Unit> getNewProxyInstance = new Function1() { // from class: o.nnL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C35010nnJ.EZpvd(this.AEQbTJ, (AbstractC55470xkZ.StateListAnimator) obj);
        }
    };

    /* JADX INFO: renamed from: o.nnJ$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hDKMBd.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.hDKMBd.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35003nnC, o.AbstractC34904nlJ
    public java.lang.String AkhnZx() {
        return "Home_Rank_New";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.hDKMBd.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.hDKMBd.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hDKMBd.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.hDKMBd.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.hDKMBd.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.hDKMBd.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    @Override // o.AbstractC34904nlJ
    public boolean fARcdN() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35003nnC
    public int zsXlph() {
        return qZH.ActionBar.invokespecialRtjmuc;
    }

    @Override // o.AbstractC35003nnC
    public void zuBGHE() {
        wlaJM().gEmmrt().observe(this, new Application(new Function1() { // from class: o.nnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35010nnJ.AEQbTJ(this.EZpvd, (Unit) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C35010nnJ c35010nnJ, Unit unit) {
        RecyclerView recyclerView;
        qZX qzxAubY = c35010nnJ.AubY();
        if (qzxAubY != null && (recyclerView = qzxAubY.djBIcL) != null && recyclerView.getAdapter() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(c35010nnJ.AuCTelauCTel());
        }
        C59534zip c59534zipAuCTelauCTel = c35010nnJ.AuCTelauCTel();
        if (c59534zipAuCTelauCTel != null) {
            c59534zipAuCTelauCTel.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C35010nnJ c35010nnJ, AbstractC55470xkZ.StateListAnimator stateListAnimator) {
        oKA oka;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stateListAnimator.DbNXlk())) {
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(c35010nnJ);
            if (interfaceC27808kEbEZpvd != null) {
                InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbEZpvd, OtpEventTracker.OTP_EVENT_VALUE_NEW, "futures", C33129mqd.gEmmrt(java.lang.Integer.valueOf(stateListAnimator.AEQbTJ() + 1)), stateListAnimator.copydefault(), "futures", null, null, 96, null);
            }
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(stateListAnimator.copydefault(), "SWAP", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            android.content.Context context = c35010nnJ.getContext();
            if (context != null && (oka = (oKA) C43251rlk.OLrzqt(oKA.class)) != null) {
                oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, null, null, null, null, c35010nnJ.AkhnZx(), null, null, 1788, null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC35003nnC
    public C59534zip AxsJAY() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.setItems(wlaJM().AYXKKw());
        c59534zip.register(AbstractC55470xkZ.StateListAnimator.class, new C34917nlW(this.getNewProxyInstance, new Function0() { // from class: o.nnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35010nnJ.copydefault(this.KWHzl);
            }
        }, this));
        return c59534zip;
    }

    @Override // o.AbstractC35003nnC
    public C59534zip copydefault() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.setItems(wlaJM().OLrzqt());
        c59534zip.register(AbstractC55470xkZ.ActionBar.class, new C41673qvJ(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), false, this, copydefault("future")));
        c59534zip.register(AbstractC55470xkZ.Application.class, new C34985nml(this, zsXlph()));
        return c59534zip;
    }

    @Override // o.AbstractC34904nlJ
    public MarketCoinInfo OLrzqt(@NotNull C55525xlb c55525xlb) {
        Intrinsics.checkNotNullParameter(c55525xlb, "");
        if (!(c55525xlb instanceof AbstractC55470xkZ.ActionBar)) {
            return null;
        }
        AbstractC55470xkZ.ActionBar actionBar = (AbstractC55470xkZ.ActionBar) c55525xlb;
        java.lang.String str = "FUTURES";
        if (!Intrinsics.EZpvd((java.lang.Object) actionBar.AYXKKw(), (java.lang.Object) "PREMARKET") && !Intrinsics.EZpvd((java.lang.Object) actionBar.AYXKKw(), (java.lang.Object) "FUTURES")) {
            str = "SWAP";
        }
        return new MarketCoinInfo(c55525xlb.copydefault(), str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC34904nlJ, com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        WatchListData futuresWatchingListData$OKMarket_market_impl;
        C55525xlb c55525xlbFetchVPNInfo;
        Intrinsics.checkNotNullParameter(action, "");
        if (action == MarketToolDialog.Action.STAR) {
            C55525xlb c55525xlbFetchVPNInfo2 = fetchVPNInfo();
            AbstractC55470xkZ.ActionBar actionBar = c55525xlbFetchVPNInfo2 instanceof AbstractC55470xkZ.ActionBar ? (AbstractC55470xkZ.ActionBar) c55525xlbFetchVPNInfo2 : null;
            java.lang.Object objDbNXlk = actionBar != null ? actionBar.DbNXlk() : null;
            NewCoinFuturesRankPo newCoinFuturesRankPo = objDbNXlk instanceof NewCoinFuturesRankPo ? (NewCoinFuturesRankPo) objDbNXlk : null;
            if (newCoinFuturesRankPo == null || (futuresWatchingListData$OKMarket_market_impl = newCoinFuturesRankPo.toFuturesWatchingListData$OKMarket_market_impl()) == null || (c55525xlbFetchVPNInfo = fetchVPNInfo()) == null) {
                return;
            }
            AEQbTJ(futuresWatchingListData$OKMarket_market_impl, c55525xlbFetchVPNInfo);
        }
    }

    @Override // o.AbstractC34904nlJ, o.InterfaceC34987nmn
    public void copydefault(int i) {
        InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this);
        if (interfaceC27808kEbEZpvd != null) {
            interfaceC27808kEbEZpvd.OLrzqt(OtpEventTracker.OTP_EVENT_VALUE_NEW, "future");
        }
        AEQbTJ(i);
    }

    private final void AEQbTJ(int i) {
        if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
            android.content.Context context = getContext();
            if (context != null) {
                sZQ.EZpvd.AEQbTJ(context, OtpEventTracker.OTP_EVENT_VALUE_NEW);
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) ActivityC34993nmt.class);
        intent.putExtra("ranking_id", i);
        intent.putExtra("ranking_tab_key", "RANKING_NEW_LISTINGS_FUTURE");
        startActivity(intent);
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC32998moE
    public void onVisible() {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.FragmentManager childFragmentManager;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        super.onVisible();
        android.view.View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(java.lang.Float.valueOf(r1.height() / view.getHeight()), java.lang.Float.valueOf(0.5f)) && (interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this)) != null) {
                interfaceC27808kEbEZpvd.copydefault(OtpEventTracker.OTP_EVENT_VALUE_NEW, "spot");
            }
        }
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.nnO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C35010nnJ.OLrzqt(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C35010nnJ c35010nnJ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) bundle.getString("type"), (java.lang.Object) "new-coin-rank")) {
            c35010nnJ.AEQbTJ(0);
        }
    }

    @Override // o.AbstractC35003nnC, o.AbstractC32998moE
    public void onInvisible() {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.FragmentManager childFragmentManager;
        super.onInvisible();
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.clearFragmentResultListener("REQUEST_CLICK_ARROW");
    }

    public static final Unit copydefault(C35010nnJ c35010nnJ) {
        boolean z = c35010nnJ instanceof C35047nnu;
        java.lang.Object obj = c35010nnJ;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = c35010nnJ.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35047nnu)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35047nnu)) {
                parentFragment = null;
            }
            obj = (C35047nnu) parentFragment;
        }
        C35047nnu c35047nnu = (C35047nnu) obj;
        if (c35047nnu != null) {
            c35047nnu.AwvSrB();
        }
        return Unit.INSTANCE;
    }
}
