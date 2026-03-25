package o;

import android.os.MessageQueue;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.github.mikephil.charting.data.Entry;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.tradingbot.impl.market_place.my_bot.MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotAssetsChartPresenter;
import com.okinc.tradingbot.impl.market_place.my_bot.view.MyBotAssetDateType;
import com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.robinhood.ticker.TickerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC51906vvp;
import o.C48033uCm;
import o.C52761wXj;
import o.C54979xbL;
import o.C55688xof;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vrg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51685vrg extends AbstractC54505xKx<AbstractC48553uVr, MyBotAssetsChartPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C48566uWd AhwBna;
    public MessageQueue.IdleHandler copydefault;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vru
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51685vrg.AhwBna(this.EZpvd));
        }
    });
    public final int KWHzl = C48033uCm.Activity.DDjfYY;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vry
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51685vrg.gEmmrt(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.vrg$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public static final /* synthetic */ AbstractC48553uVr AYXKKw(C51685vrg c51685vrg) {
        return c51685vrg.gGvvIC();
    }

    public static final /* synthetic */ MyBotAssetsChartPresenter KWHzl(C51685vrg c51685vrg) {
        return c51685vrg.dxcTrN();
    }

    public final boolean AYXKKw() {
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.EZpvd()) {
            return true;
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
        return interfaceC55881xsMCopydefault2 != null && interfaceC55881xsMCopydefault2.OLrzqt();
    }

    public final boolean copydefault() {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AhwBna()) ? false : true;
    }

    private final boolean fJNWhG() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean AhwBna(C51685vrg c51685vrg) {
        android.os.Bundle arguments = c51685vrg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("from_cr_activity");
        }
        return false;
    }

    public final boolean valueOf() {
        return (fJNWhG() || dxcTrN().isConnected() || dxcTrN().AkhnZx()) ? false : true;
    }

    /* JADX INFO: renamed from: o.vrg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vrg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C51685vrg newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            return actionBar.copydefault(str, str2, bool);
        }

        public final C51685vrg copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            C51685vrg c51685vrg = new C51685vrg();
            c51685vrg.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_total_assets", str), C56390yDp.OLrzqt("bot_from_deeplink", str2), C56390yDp.OLrzqt("from_cr_activity", bool)));
            return c51685vrg;
        }
    }

    public final C48565uWc AEQbTJ() {
        return (C48565uWc) this.OLrzqt.getValue();
    }

    public static final C48565uWc gEmmrt(C51685vrg c51685vrg) {
        android.view.ViewStub viewStub = c51685vrg.gGvvIC().djBIcL.getViewStub();
        android.view.View viewInflate = viewStub != null ? viewStub.inflate() : null;
        Intrinsics.copydefault(viewInflate);
        C48565uWc c48565uWcKWHzl = C48565uWc.KWHzl(viewInflate);
        Intrinsics.checkNotNullExpressionValue(c48565uWcKWHzl, "");
        C54979xbL c54979xbL = c48565uWcKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c54979xbL, "");
        c51685vrg.EZpvd(c54979xbL);
        return c48565uWcKWHzl;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        int iDbNXlk;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        MyBotAssetsChartPresenter myBotAssetsChartPresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("bot_from_deeplink")) == null) {
            string = "";
        }
        myBotAssetsChartPresenterDxcTrN.KWHzl(string);
        if (!dxcTrN().isConnected()) {
            C56071xvr c56071xvr = C56071xvr.gEmmrt;
            AppCompatTextView appCompatTextView = gGvvIC().fJNWhG;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            wPQ.KWHzl(appCompatTextView, c56071xvr.DbNXlk());
            if (!dxcTrN().AkhnZx()) {
                C51730vsY c51730vsY = AEQbTJ().djBIcL;
                Intrinsics.checkNotNullExpressionValue(c51730vsY, "");
                wPQ.KWHzl(c51730vsY, c56071xvr.DbNXlk());
            }
            if (fJNWhG()) {
                iDbNXlk = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AkhnZx);
            } else {
                iDbNXlk = c56071xvr.DbNXlk();
            }
            AppCompatTextView appCompatTextView2 = gGvvIC().fJNWhG;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            wPQ.KWHzl(appCompatTextView2, iDbNXlk);
        }
        gGvvIC().OLrzqt(fJNWhG());
        gGvvIC().copydefault(valueOf());
        MyBotAssetsChartPresenter myBotAssetsChartPresenterDxcTrN2 = dxcTrN();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("bot_total_assets")) != null) {
            str = string2;
        }
        myBotAssetsChartPresenterDxcTrN2.copydefault(str);
        gEmmrt();
        fARcdN();
        fIwbmz();
        AuCTel();
        isConnected();
        KWHzl();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MyBotAssetsChartPresenter.queryUserSummary$default(dxcTrN(), null, java.lang.Boolean.valueOf(fJNWhG()), 1, null);
    }

    public final void gEmmrt() {
        if (dxcTrN().AkhnZx()) {
            gGvvIC().AEQbTJ.setVisibility(4);
            C52705wVh c52705wVh = gGvvIC().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
            c52705wVh.setVisibility(AYXKKw() ? 0 : 8);
            C52705wVh c52705wVh2 = gGvvIC().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52705wVh2, "");
            wPQ.EZpvd(c52705wVh2, 0, C56071xvr.gEmmrt.DbNXlk());
            gGvvIC().EZpvd.setEnabled(!copydefault());
            C52705wVh c52705wVh3 = gGvvIC().EZpvd;
            c52705wVh3.setOnClickListener(new TaskDescription(c52705wVh3, 1000L, this));
        }
        if (dxcTrN().isConnected()) {
            C52705wVh c52705wVh4 = gGvvIC().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52705wVh4, "");
            c52705wVh4.setVisibility(8);
            AppCompatImageView appCompatImageView = gGvvIC().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
        }
    }

    public final void fetchVPNInfo() {
        kotlin.Pair pairOLrzqt;
        if (fJNWhG()) {
            java.lang.String strAEQbTJ = wUJ.AEQbTJ.AEQbTJ();
            int i = C48033uCm.Fragment.OLrzqt;
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), C33069mpW.copydefault(this, C48033uCm.Fragment.KWHzl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("pnlStartDateTime", strAEQbTJ))));
        } else {
            int i2 = C55688xof.Application.OqHLSf;
            java.lang.String string = getString(C48033uCm.Fragment.DaTmkG);
            Intrinsics.checkNotNullExpressionValue(string, "");
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(i2), string);
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        java.lang.String str = (java.lang.String) pairOLrzqt.component2();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(iIntValue);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vrD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51685vrg.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.vrg$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51685vrg OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51685vrg c51685vrg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c51685vrg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AkhnZx();
                C55867xrz.KWHzl.KWHzl("dashboard");
            }
        }
    }

    private final void fARcdN() {
        if (dxcTrN().isConnected()) {
            gGvvIC().AkhnZx.setShowUnderline(false);
        } else {
            gGvvIC().AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.vrx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51685vrg.AYXKKw(this.KWHzl, view);
                }
            });
        }
        gGvvIC().values.setOnClickListener(new View.OnClickListener() { // from class: o.vrw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51685vrg.valueOf(this.OLrzqt, view);
            }
        });
        gGvvIC().AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vrB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51685vrg.djBIcL(this.AEQbTJ, view);
            }
        });
        if (dxcTrN().isConnected()) {
            gGvvIC().fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.vrz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51685vrg.AhwBna(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void AYXKKw(C51685vrg c51685vrg, android.view.View view) {
        c51685vrg.fetchVPNInfo();
    }

    public static final void valueOf(C51685vrg c51685vrg, android.view.View view) {
        boolean z = !c51685vrg.dxcTrN().fJNWhG();
        c51685vrg.OLrzqt(z);
        showAssetSummaryIfNeed$default(c51685vrg, c51685vrg.dxcTrN().EZpvd(), false, 2, null);
        if (c51685vrg.dxcTrN().AkhnZx()) {
            return;
        }
        c51685vrg.KWHzl(z);
    }

    public static final void djBIcL(C51685vrg c51685vrg, android.view.View view) {
        if (c51685vrg.dxcTrN().DbNXlk()) {
            C54979xbL.expand$default(c51685vrg.AEQbTJ().AEQbTJ, false, 1, null);
            C55867xrz.KWHzl.AEQbTJ("more_k");
        } else if (c51685vrg.dxcTrN().fetchVPNInfo()) {
            return;
        } else {
            C54979xbL.collapse$default(c51685vrg.AEQbTJ().AEQbTJ, false, 1, null);
        }
        c51685vrg.dxcTrN().AEQbTJ(!c51685vrg.dxcTrN().DbNXlk());
    }

    public static final void AhwBna(C51685vrg c51685vrg, android.view.View view) {
        FragmentActivity activity = c51685vrg.getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, C56071xvr.getBotMpPagePath$default(C56071xvr.gEmmrt, "ongoing", "smart_arbitrage", false, 4, null), null, new Function1() { // from class: o.vrF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51685vrg.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        getParentFragmentManager().setFragmentResultListener("refresh_assets_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vrs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51685vrg.copydefault(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void copydefault(C51685vrg c51685vrg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        MyBotAssetsChartPresenter.queryUserSummary$default(c51685vrg.dxcTrN(), null, java.lang.Boolean.valueOf(c51685vrg.fJNWhG()), 1, null);
        if (c51685vrg.dxcTrN().AkhnZx()) {
            return;
        }
        MyBotAssetsChartPresenter.queryAssetsHistoryData$default(c51685vrg.dxcTrN(), null, 1, null);
    }

    public final void AEQbTJ(final BotUserSummaryData botUserSummaryData) {
        if (botUserSummaryData == null) {
            return;
        }
        final Function0 function0 = new Function0() { // from class: o.vrq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51685vrg.AEQbTJ(this.OLrzqt, botUserSummaryData);
            }
        };
        if (isAdded() && getView() != null) {
            try {
                function0.invoke();
                Unit unit = Unit.INSTANCE;
                return;
            } catch (java.lang.Exception unused) {
                android.view.View view = getView();
                if (view != null) {
                    view.postDelayed(new java.lang.Runnable() { // from class: o.vrr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C51685vrg.AEQbTJ(function0);
                        }
                    }, 50L);
                    return;
                }
                return;
            }
        }
        android.view.View view2 = getView();
        if (view2 != null) {
            view2.postDelayed(new java.lang.Runnable() { // from class: o.vrt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51685vrg.AYXKKw(function0);
                }
            }, 50L);
        }
    }

    public static final Unit AEQbTJ(C51685vrg c51685vrg, BotUserSummaryData botUserSummaryData) {
        if (c51685vrg.isAdded() && c51685vrg.getView() != null) {
            c51685vrg.values();
            showAssetSummaryIfNeed$default(c51685vrg, botUserSummaryData, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function0 function0) {
        function0.invoke();
    }

    public static final void AYXKKw(Function0 function0) {
        function0.invoke();
    }

    private final void AuCTel() {
        TradeLiveData<BotUserSummaryData> tradeLiveDataAhwBna = dxcTrN().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vrE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.OLrzqt(this.OLrzqt, (BotUserSummaryData) obj);
            }
        }));
        TradeLiveData<java.util.List<BotAssetsHistoryData>> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.vrN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
        TradeLiveData<BotAssetsChartData> tradeLiveDataAYXKKw = dxcTrN().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.vrL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.AEQbTJ(this.copydefault, (BotAssetsChartData) obj);
            }
        }));
        TradeLiveData<BotAssetsChartData> tradeLiveDataKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner4, new Activity(new Function1() { // from class: o.vro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.AYXKKw(this.AEQbTJ, (BotAssetsChartData) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vrm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.AEQbTJ(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vrl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.KWHzl(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51685vrg c51685vrg, BotUserSummaryData botUserSummaryData) {
        c51685vrg.AEQbTJ(botUserSummaryData);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51685vrg c51685vrg, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51685vrg.values();
        c51685vrg.dxcTrN().EZpvd((java.util.List<BotAssetsHistoryData>) list);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C51685vrg c51685vrg, final BotAssetsChartData botAssetsChartData) {
        Intrinsics.checkNotNullParameter(botAssetsChartData, "");
        c51685vrg.AhwBna(new Function0() { // from class: o.vrG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51685vrg.AhwBna(this.EZpvd, botAssetsChartData);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C51685vrg c51685vrg, BotAssetsChartData botAssetsChartData) {
        if (!c51685vrg.dxcTrN().fJNWhG()) {
            botAssetsChartData = null;
        }
        c51685vrg.KWHzl(botAssetsChartData);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(final C51685vrg c51685vrg, final BotAssetsChartData botAssetsChartData) {
        Intrinsics.checkNotNullParameter(botAssetsChartData, "");
        c51685vrg.AhwBna(new Function0() { // from class: o.vrC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51685vrg.valueOf(this.OLrzqt, botAssetsChartData);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C51685vrg c51685vrg, BotAssetsChartData botAssetsChartData) {
        c51685vrg.KWHzl((BotAssetsChartData) null);
        c51685vrg.EZpvd(botAssetsChartData);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C51685vrg c51685vrg, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c51685vrg.dxcTrN().AEQbTJ().bB_()) && ((java.lang.Boolean) pair.second).booleanValue()) {
            c51685vrg.AEQbTJ().OLrzqt.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C51685vrg c51685vrg, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c51685vrg.dxcTrN().values().bB_())) {
            c51685vrg.values();
            c51685vrg.gGvvIC().isConnected.setText("--");
            c51685vrg.gGvvIC().OLrzqt.setText("--");
            C55320xhi c55320xhi = c51685vrg.gGvvIC().AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
            c55320xhi.setVisibility(8);
            c51685vrg.gGvvIC().copydefault.setText("");
            c51685vrg.gGvvIC().AhwBna.setText("--");
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c51685vrg.dxcTrN().djBIcL().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c51685vrg.dxcTrN().AEQbTJ().bB_())) {
            c51685vrg.values();
            C51722vsQ c51722vsQ = c51685vrg.AEQbTJ().copydefault;
            Intrinsics.checkNotNullExpressionValue(c51722vsQ, "");
            c51722vsQ.setVisibility(8);
            c51685vrg.AEQbTJ().OLrzqt.AEQbTJ(((java.lang.Exception) pair.second).getMessage(), new Function0() { // from class: o.vrA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C51685vrg.DbNXlk(this.OLrzqt);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotAssetsChartPresenter.queryUserSummary$default(com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotAssetsChartPresenter, java.lang.String, java.lang.Boolean, int, java.lang.Object):void */
    public static final Unit DbNXlk(C51685vrg c51685vrg) {
        MyBotAssetsChartPresenter.queryUserSummary$default(c51685vrg.dxcTrN(), null, java.lang.Boolean.valueOf(c51685vrg.fJNWhG()), 1, null);
        MyBotAssetsChartPresenter.queryAssetsHistoryData$default(c51685vrg.dxcTrN(), null, 1, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        AbstractC48553uVr abstractC48553uVrGGvvIC = gGvvIC();
        abstractC48553uVrGGvvIC.isConnected.setCharacterLists(C57862yqS.copydefault());
        abstractC48553uVrGGvvIC.isConnected.setTypeface(ResourcesCompat.getFont(requireContext(), C52761wXj.Dialog.EZpvd));
        OLrzqt(dxcTrN().fJNWhG());
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.vrv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C51685vrg.valueOf(this.KWHzl);
                }
            });
        }
    }

    public static final void valueOf(C51685vrg c51685vrg) {
        if (c51685vrg.isResumed() && c51685vrg.getView() != null && c51685vrg.isAdded()) {
            MyBotAssetsChartPresenter.queryUserSummary$default(c51685vrg.dxcTrN(), null, java.lang.Boolean.valueOf(c51685vrg.fJNWhG()), 1, null);
            if (c51685vrg.dxcTrN().AkhnZx()) {
                return;
            }
            MyBotAssetsChartPresenter.queryAssetsHistoryData$default(c51685vrg.dxcTrN(), null, 1, null);
        }
    }

    private final void OLrzqt(boolean z) {
        gGvvIC().values.setImageResource(z ? C52761wXj.TaskDescription.ODCBUN : C52761wXj.TaskDescription.invokespecialgBtXYZ);
        dxcTrN().EZpvd(z);
    }

    private final void values() {
        getParentFragmentManager().setFragmentResult("refresh_done", new android.os.Bundle());
    }

    /* JADX INFO: renamed from: o.vrg$Application */
    public static final class Application implements C54979xbL.Activity {
        public Application() {
        }

        @Override // o.C54979xbL.Activity
        public void AEQbTJ(float f, int i) {
            if (f == 0.0f && i == 0) {
                C51685vrg.this.copydefault(true);
            } else if (f == 1.0f && i == 3) {
                C51685vrg.this.copydefault(false);
            }
        }
    }

    public final void EZpvd(C54979xbL c54979xbL) {
        c54979xbL.setOnExpansionUpdateListener(new Application());
    }

    public final void djBIcL() {
        if (AEQbTJ().djBIcL.OLrzqt()) {
            return;
        }
        AEQbTJ().djBIcL.setDateSelectListener(dxcTrN().OLrzqt(), new Function1() { // from class: o.vrI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.KWHzl(this.OLrzqt, (MyBotAssetDateType) obj);
            }
        });
    }

    public static final Unit KWHzl(C51685vrg c51685vrg, MyBotAssetDateType myBotAssetDateType) {
        Intrinsics.checkNotNullParameter(myBotAssetDateType, "");
        c51685vrg.dxcTrN().copydefault(myBotAssetDateType);
        c51685vrg.dxcTrN().EZpvd(myBotAssetDateType.getType());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showAssetSummaryIfNeed$default(C51685vrg c51685vrg, BotUserSummaryData botUserSummaryData, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c51685vrg.KWHzl(botUserSummaryData, z);
    }

    public final void KWHzl(BotUserSummaryData botUserSummaryData, boolean z) {
        AbstractC48553uVr abstractC48553uVrGGvvIC = gGvvIC();
        if (dxcTrN().fJNWhG()) {
            if (abstractC48553uVrGGvvIC.copydefault()) {
                TickerView tickerView = abstractC48553uVrGGvvIC.isConnected;
                Intrinsics.checkNotNullExpressionValue(tickerView, "");
                C50968veE.EZpvd(tickerView, botUserSummaryData.getTotalAsset(), true);
            } else {
                abstractC48553uVrGGvvIC.isConnected.setText(botUserSummaryData.getTotalAsset(), z);
            }
            abstractC48553uVrGGvvIC.OLrzqt.setText(botUserSummaryData.getTotalProfit() + " (" + botUserSummaryData.getProfitRatio() + ")");
            abstractC48553uVrGGvvIC.OLrzqt.setTextColor(botUserSummaryData.getProfitRatioColor());
        } else {
            abstractC48553uVrGGvvIC.isConnected.setText("******", z);
            abstractC48553uVrGGvvIC.OLrzqt.setText("******");
        }
        abstractC48553uVrGGvvIC.copydefault.setText(botUserSummaryData.getAssetSymbol());
        abstractC48553uVrGGvvIC.AkhnZx.setText(botUserSummaryData.getCycle());
        abstractC48553uVrGGvvIC.AkhnZx.setTextColor(botUserSummaryData.getCycleColor());
        abstractC48553uVrGGvvIC.AhwBna.setText(botUserSummaryData.getOngoingBots());
    }

    public final void isConnected() {
        C56123xwq c56123xwq = C56123xwq.copydefault;
        StateFlow<ValuationCurrency> stateFlowOLrzqt = ((InterfaceC8218ayb) C43251rlk.copydefault(InterfaceC8218ayb.class)).OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56123xwq.OLrzqt(stateFlowOLrzqt, viewLifecycleOwner, new Function1() { // from class: o.vrk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51685vrg.copydefault(this.KWHzl, (ValuationCurrency) obj);
            }
        });
    }

    public static final Unit copydefault(C51685vrg c51685vrg, ValuationCurrency valuationCurrency) {
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        c51685vrg.dxcTrN().OLrzqt(valuationCurrency.getUnit(), java.lang.Boolean.valueOf(c51685vrg.fJNWhG()));
        return Unit.INSTANCE;
    }

    public final void KWHzl(BotAssetsChartData botAssetsChartData) {
        if (fJNWhG()) {
            return;
        }
        C48566uWd c48566uWd = this.AhwBna;
        boolean z = c48566uWd != null;
        C48566uWd c48566uWd2 = null;
        if (botAssetsChartData == null) {
            if (z) {
                if (c48566uWd == null) {
                    Intrinsics.gEmmrt("");
                    c48566uWd = null;
                }
                C51728vsW c51728vsW = c48566uWd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c51728vsW, "");
                c51728vsW.setVisibility(8);
                return;
            }
            return;
        }
        android.view.ViewStub viewStub = gGvvIC().fIwbmz.getViewStub();
        if (!z && viewStub != null) {
            android.view.View viewInflate = viewStub.inflate();
            this.AhwBna = C48566uWd.copydefault(viewInflate);
            ViewCompat.setLayoutDirection(viewInflate, ViewCompat.getLayoutDirection(gGvvIC().getRoot()));
            C48566uWd c48566uWd3 = this.AhwBna;
            if (c48566uWd3 == null) {
                Intrinsics.gEmmrt("");
                c48566uWd3 = null;
            }
            C51728vsW c51728vsW2 = c48566uWd3.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c51728vsW2, "");
            wPQ.EZpvd(c51728vsW2, 0, C56071xvr.gEmmrt.DbNXlk());
            C48566uWd c48566uWd4 = this.AhwBna;
            if (c48566uWd4 == null) {
                Intrinsics.gEmmrt("");
                c48566uWd4 = null;
            }
            c48566uWd4.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.vrn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51685vrg.gEmmrt(this.EZpvd, view);
                }
            });
        }
        C48566uWd c48566uWd5 = this.AhwBna;
        if (c48566uWd5 == null) {
            Intrinsics.gEmmrt("");
            c48566uWd5 = null;
        }
        C51728vsW c51728vsW3 = c48566uWd5.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c51728vsW3, "");
        c51728vsW3.setVisibility(0);
        C48566uWd c48566uWd6 = this.AhwBna;
        if (c48566uWd6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48566uWd2 = c48566uWd6;
        }
        c48566uWd2.KWHzl.setData(botAssetsChartData.copydefault(), botAssetsChartData.AEQbTJ(), botAssetsChartData.EZpvd(), botAssetsChartData.KWHzl(), botAssetsChartData.OLrzqt());
    }

    public static final void gEmmrt(C51685vrg c51685vrg, android.view.View view) {
        if (!c51685vrg.dxcTrN().isConnected() && c51685vrg.dxcTrN().DbNXlk()) {
            C54979xbL.expand$default(c51685vrg.AEQbTJ().AEQbTJ, false, 1, null);
            c51685vrg.dxcTrN().AEQbTJ(!c51685vrg.dxcTrN().DbNXlk());
        }
    }

    public final void EZpvd(BotAssetsChartData botAssetsChartData) {
        C48565uWc c48565uWcAEQbTJ = AEQbTJ();
        c48565uWcAEQbTJ.copydefault.setEyesOpen(dxcTrN().fJNWhG());
        if (botAssetsChartData == null || botAssetsChartData.copydefault().isEmpty()) {
            C51722vsQ c51722vsQ = c48565uWcAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c51722vsQ, "");
            c51722vsQ.setVisibility(8);
            c48565uWcAEQbTJ.OLrzqt.copydefault();
            return;
        }
        c48565uWcAEQbTJ.OLrzqt.KWHzl();
        C51722vsQ c51722vsQ2 = c48565uWcAEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c51722vsQ2, "");
        c51722vsQ2.setVisibility(0);
        c48565uWcAEQbTJ.copydefault.setData(botAssetsChartData.copydefault(), botAssetsChartData.AEQbTJ(), botAssetsChartData.EZpvd(), botAssetsChartData.KWHzl(), dxcTrN().OLrzqt(), botAssetsChartData.OLrzqt(), dxcTrN().EZpvd(), new StateListAnimator(c48565uWcAEQbTJ));
    }

    /* JADX INFO: renamed from: o.vrg$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator implements InterfaceC51726vsU {
        public final /* synthetic */ C48565uWc OLrzqt;

        public StateListAnimator(C48565uWc c48565uWc) {
            this.OLrzqt = c48565uWc;
        }

        @Override // o.InterfaceC51726vsU
        public void copydefault(Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "");
            C51685vrg c51685vrg = C51685vrg.this;
            c51685vrg.KWHzl(C51685vrg.KWHzl(c51685vrg).OLrzqt(entry), true);
            AppCompatTextView appCompatTextView = C51685vrg.AYXKKw(C51685vrg.this).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(4);
            this.OLrzqt.copydefault.OLrzqt(C51685vrg.this.copydefault(true, entry));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C51685vrg.this), null, null, new MyBotAssetsChartFragment$refreshBigChartView$1$1$onChartGestureStart$1(this.OLrzqt, C51685vrg.this, null), 3, null);
            C51685vrg.KWHzl(C51685vrg.this).OLrzqt(true);
        }

        @Override // o.InterfaceC51726vsU
        public void copydefault() {
            C51685vrg c51685vrg = C51685vrg.this;
            c51685vrg.KWHzl(C51685vrg.KWHzl(c51685vrg).EZpvd(), true);
            AppCompatTextView appCompatTextView = C51685vrg.AYXKKw(C51685vrg.this).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            this.OLrzqt.copydefault.OLrzqt(C51685vrg.this.copydefault(false, (Entry) null));
            this.OLrzqt.djBIcL.KWHzl();
            C51685vrg.KWHzl(C51685vrg.this).OLrzqt(false);
        }

        @Override // o.InterfaceC51726vsU
        public void EZpvd(Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "");
            C51685vrg c51685vrg = C51685vrg.this;
            c51685vrg.KWHzl(C51685vrg.KWHzl(c51685vrg).OLrzqt(entry), true);
            this.OLrzqt.copydefault.OLrzqt(C51685vrg.this.copydefault(true, entry));
        }
    }

    public final void KWHzl(final boolean z) {
        if (dxcTrN().DbNXlk()) {
            AhwBna(new Function0() { // from class: o.vrp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C51685vrg.KWHzl(this.copydefault, z);
                }
            });
        } else {
            AEQbTJ().copydefault.setEyesOpen(z);
        }
    }

    public static final Unit KWHzl(C51685vrg c51685vrg, boolean z) {
        c51685vrg.KWHzl(z ? c51685vrg.dxcTrN().gEmmrt() : null);
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        if (z) {
            gGvvIC().AEQbTJ.setImageResource(C52761wXj.TaskDescription.gbIfDn);
            AEQbTJ().OLrzqt.KWHzl();
            AEQbTJ().copydefault.KWHzl();
        } else {
            djBIcL();
            gGvvIC().AEQbTJ.setImageResource(C52761wXj.TaskDescription.fMBJsc);
        }
        dxcTrN().EZpvd(dxcTrN().valueOf());
    }

    public final boolean copydefault(boolean z, Entry entry) {
        java.util.List<BotAssetsHistoryData> listValueOf = dxcTrN().valueOf();
        if (z) {
            java.lang.Object data = entry != null ? entry.getData() : null;
            BotAssetsHistoryData botAssetsHistoryData = data instanceof BotAssetsHistoryData ? (BotAssetsHistoryData) data : null;
            java.lang.String assets = botAssetsHistoryData != null ? botAssetsHistoryData.getAssets() : null;
            BotAssetsHistoryData botAssetsHistoryData2 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.wlaJM(listValueOf);
            return C33129mqd.copydefault(assets, botAssetsHistoryData2 != null ? botAssetsHistoryData2.getAssets() : null);
        }
        BotAssetsHistoryData botAssetsHistoryData3 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.firstOrNull(listValueOf);
        java.lang.String assets2 = botAssetsHistoryData3 != null ? botAssetsHistoryData3.getAssets() : null;
        BotAssetsHistoryData botAssetsHistoryData4 = (BotAssetsHistoryData) CollectionsKt___CollectionsKt.wlaJM(listValueOf);
        return C33129mqd.copydefault(assets2, botAssetsHistoryData4 != null ? botAssetsHistoryData4.getAssets() : null);
    }

    public final void AhwBna(final Function0<Unit> function0) {
        MessageQueue.IdleHandler idleHandler = this.copydefault;
        if (idleHandler != null) {
            android.os.Looper.myQueue().removeIdleHandler(idleHandler);
        }
        MessageQueue.IdleHandler idleHandler2 = new MessageQueue.IdleHandler() { // from class: o.vrH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return C51685vrg.OLrzqt(function0);
            }
        };
        this.copydefault = idleHandler2;
        android.os.Looper.myQueue().addIdleHandler(idleHandler2);
    }

    public static final boolean OLrzqt(Function0 function0) {
        function0.invoke();
        return false;
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MessageQueue.IdleHandler idleHandler = this.copydefault;
        if (idleHandler != null) {
            android.os.Looper.myQueue().removeIdleHandler(idleHandler);
            this.copydefault = null;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vvp.TaskDescription.startActivity$default(o.vvp$TaskDescription, android.content.Context, int, int, java.lang.Object):void */
    public final void AkhnZx() {
        android.content.Context context;
        if (EZpvd() || (context = getContext()) == null) {
            return;
        }
        ActivityC51906vvp.TaskDescription.startActivity$default(ActivityC51906vvp.Companion, context, 0, 2, null);
    }

    public final boolean EZpvd() {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AhwBna()) {
            return false;
        }
        C55326xho.toastWithFailedIcon$default(C48033uCm.Fragment.fJk, 0, 1, (java.lang.Object) null);
        return true;
    }
}
