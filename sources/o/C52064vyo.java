package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.market_place.home.list.HomeSignalType;
import com.okinc.tradingbot.impl.nmp.home.presenter.NmpSignalSquarePresenter;
import com.okinc.unify_trade.biz.HomeSignalItemInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeSignalSortConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51215vin;
import o.C43316rmw;
import o.C48033uCm;
import o.C52064vyo;
import o.C52755wXd;
import o.C52761wXj;
import o.C55688xof;
import o.C55943xtV;
import o.C56058xve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52064vyo extends AbstractC54505xKx<AbstractC48554uVs, NmpSignalSquarePresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public C43316rmw AEQbTJ;
    public java.lang.String OLrzqt;
    public final int copydefault = C48033uCm.Activity.fiXcQa;

    /* JADX INFO: renamed from: o.vyo$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public static final /* synthetic */ AbstractC48554uVs EZpvd(C52064vyo c52064vyo) {
        return c52064vyo.gGvvIC();
    }

    public static final /* synthetic */ NmpSignalSquarePresenter copydefault(C52064vyo c52064vyo) {
        return c52064vyo.dxcTrN();
    }

    /* JADX INFO: renamed from: o.vyo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vyo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C52064vyo newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            return stateListAnimator.copydefault(str, bundle);
        }

        public final C52064vyo copydefault(@NotNull java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            C52064vyo c52064vyo = new C52064vyo();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("type", str));
            if (bundle != null) {
                bundleBundleOf.putAll(bundle);
            }
            c52064vyo.setArguments(bundleBundleOf);
            return c52064vyo;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        KWHzl();
        AEQbTJ();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        NmpSignalSquarePresenter nmpSignalSquarePresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments = getArguments();
        NmpSignalSquarePresenter.fetchSignalList$default(nmpSignalSquarePresenterDxcTrN, arguments != null ? arguments.getString("type") : null, false, 2, null);
        ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).KWHzl(getViewLifecycleOwner(), getChildFragmentManager());
    }

    private final void copydefault() {
        android.os.Bundle arguments;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString(AppsFlyerProperties.CHANNEL) : null;
        this.OLrzqt = string;
        if (string != null && (arguments = getArguments()) != null) {
            C56058xve.Companion.copydefault().AEQbTJ(C56058xve.Activity.Companion.copydefault(arguments));
        }
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vyz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.OLrzqt(this.OLrzqt, (EmptyData) obj);
            }
        }));
        c43316rmw.register(HomeSignalItemInfo.class, new C51499voF(new Function1() { // from class: o.vyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.copydefault(this.OLrzqt, (HomeSignalItemInfo) obj);
            }
        }));
        this.AEQbTJ = c43316rmw;
        gGvvIC().OLrzqt.setAdapter(this.AEQbTJ);
        gGvvIC().OLrzqt.setItemViewCacheSize(10);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.zuBGHE);
        gGvvIC().OLrzqt.addItemDecoration(new C31703mAu(iCopydefault, C55298xhM.dp2px$default(0.5f, null, 1, null), iCopydefault, 0));
        C33546myW c33546myW = gGvvIC().copydefault;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.vyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C52064vyo.OLrzqt(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final Unit OLrzqt(C52064vyo c52064vyo, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        if (emptyData.getEmptyType() == 8) {
            NmpSignalSquarePresenter.fetchSignalList$default(c52064vyo.dxcTrN(), null, true, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52064vyo c52064vyo, HomeSignalItemInfo homeSignalItemInfo) {
        Intrinsics.checkNotNullParameter(homeSignalItemInfo, "");
        android.content.Context context = c52064vyo.getContext();
        if (context != null) {
            ActivityC51215vin.TaskDescription taskDescription = ActivityC51215vin.Companion;
            java.lang.String signalChanId = homeSignalItemInfo.getSignalChanId();
            if (signalChanId == null) {
                signalChanId = "";
            }
            java.lang.String str = c52064vyo.OLrzqt;
            taskDescription.KWHzl(context, signalChanId, "1", str != null ? str : "");
        }
        C55867xrz.KWHzl.EZpvd(homeSignalItemInfo.isSubscribed() ? "use" : "subscribe", c52064vyo.dxcTrN().OLrzqt().getValue(), c52064vyo.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C52064vyo c52064vyo, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c52064vyo.dxcTrN().gEmmrt();
    }

    private final void KWHzl() {
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.vyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        });
        TradeLiveData<HomeSignalType> tradeLiveDataValueOf = dxcTrN().valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vyu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.EZpvd(this.EZpvd, (HomeSignalType) obj);
            }
        }));
        TradeLiveData<HomeSignalSortConfig> tradeLiveDataOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner3, new PendingIntent(new Function1() { // from class: o.vyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.EZpvd(this.OLrzqt, (HomeSignalSortConfig) obj);
            }
        }));
        TradeLiveData<java.util.List<HomeSignalItemInfo>> tradeLiveDataEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner4, new PendingIntent(new Function1() { // from class: o.vys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        dxcTrN().AYXKKw().AkhnZx().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().AYXKKw().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner5, new PendingIntent(new Function1() { // from class: o.vyv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52064vyo.OLrzqt(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.nmp.home.presenter.NmpSignalSquarePresenter.fetchSignalList$default(com.okinc.tradingbot.impl.nmp.home.presenter.NmpSignalSquarePresenter, java.lang.String, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(C52064vyo c52064vyo, java.lang.String str) {
        if (c52064vyo.isResumed() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            NmpSignalSquarePresenter.fetchSignalList$default(c52064vyo.dxcTrN(), null, true, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52064vyo c52064vyo, HomeSignalType homeSignalType) {
        if (homeSignalType == c52064vyo.dxcTrN().AhwBna()) {
            return Unit.INSTANCE;
        }
        c52064vyo.dxcTrN().EZpvd(homeSignalType);
        c52064vyo.gGvvIC().KWHzl.setText(homeSignalType != null ? C33070mpX.AYXKKw(homeSignalType.getTitle()) : null);
        c52064vyo.dxcTrN().OLrzqt(homeSignalType != null ? homeSignalType.getType() : null, true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52064vyo c52064vyo, HomeSignalSortConfig homeSignalSortConfig) {
        Intrinsics.checkNotNullParameter(homeSignalSortConfig, "");
        c52064vyo.gGvvIC().AEQbTJ.setText(C33070mpX.AYXKKw(homeSignalSortConfig.getTitle()));
        if (c52064vyo.isResumed()) {
            NmpSignalSquarePresenter.fetchSignalList$default(c52064vyo.dxcTrN(), null, false, 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52064vyo c52064vyo, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C43316rmw c43316rmw = c52064vyo.AEQbTJ;
        if (c43316rmw != null) {
            C49952uyJ.updateDataOrEmpty$default(c43316rmw, c52064vyo.dxcTrN().AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.SaJVGb), 60, null, null, false, 56, null);
        }
        C33546myW c33546myW = c52064vyo.gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, list.isEmpty());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52064vyo, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52064vyo c52064vyo, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && !c52064vyo.dxcTrN().djBIcL()) {
            C55113xdn.showLoading$default(c52064vyo.gGvvIC().EZpvd, 0L, 1, null);
        } else {
            c52064vyo.gGvvIC().EZpvd.copydefault();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vyo$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52064vyo OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52064vyo c52064vyo) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c52064vyo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C52064vyo.EZpvd(this.OLrzqt).KWHzl.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listKWHzl = C52064vyo.copydefault(this.OLrzqt).KWHzl();
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listKWHzl, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : this.OLrzqt.new Application(), this.OLrzqt.new ActionBar(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vyo$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52064vyo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52064vyo c52064vyo) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c52064vyo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52064vyo.EZpvd(this.copydefault).AEQbTJ.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listCopydefault = C52064vyo.copydefault(this.copydefault).copydefault();
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listCopydefault, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : this.copydefault.new LoaderManager(), this.copydefault.new Dialog(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
                C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, Fragment.AEQbTJ, 1, (java.lang.Object) null);
            }
        }
    }

    public static final Unit OLrzqt(C52064vyo c52064vyo, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C43316rmw c43316rmw = c52064vyo.AEQbTJ;
        if (c43316rmw != null) {
            C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, null, 60, false, null, null, false, 61, null));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52064vyo, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C55943xtV.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final java.lang.Object obj = new java.lang.Object();
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<C55943xtV>(obj) { // from class: com.okinc.tradingbot.impl.nmp.home.NmpSignalSquareFragment$initListener$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C55943xtV c55943xtV) {
                Intrinsics.checkNotNullParameter(c55943xtV, "");
                C43316rmw c43316rmw = this.this$0.AEQbTJ;
                if (c43316rmw != null) {
                    c43316rmw.notifyItemChanged(C52064vyo.copydefault(this.this$0).KWHzl(c55943xtV.EZpvd()));
                }
            }
        });
        android.widget.TextView textView = gGvvIC().KWHzl;
        textView.setOnClickListener(new Activity(textView, 1000L, this));
        android.widget.TextView textView2 = gGvvIC().AEQbTJ;
        textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vyo$ActionBar */
    public static final class ActionBar implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            HomeSignalType homeSignalType = objOLrzqt instanceof HomeSignalType ? (HomeSignalType) objOLrzqt : null;
            if (homeSignalType != null) {
                C52064vyo.copydefault(C52064vyo.this).KWHzl(homeSignalType);
            }
        }
    }

    /* JADX INFO: renamed from: o.vyo$Application */
    public static final class Application implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C52064vyo.EZpvd(C52064vyo.this).KWHzl.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vyo$Dialog */
    public static final class Dialog implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            OLrzqt(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            HomeSignalSortConfig homeSignalSortConfig = objOLrzqt instanceof HomeSignalSortConfig ? (HomeSignalSortConfig) objOLrzqt : null;
            if (homeSignalSortConfig != null) {
                C52064vyo.copydefault(C52064vyo.this).AEQbTJ(homeSignalSortConfig);
            }
        }
    }

    /* JADX INFO: renamed from: o.vyo$LoaderManager */
    public static final class LoaderManager implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            C52064vyo.EZpvd(C52064vyo.this).AEQbTJ.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vyo$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public static final Fragment AEQbTJ = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "dropdown", false, 4, null);
            EventParamsList.put$default(eventParamsList, "type", "signal_marketplace", false, 4, null);
        }
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
    }
}
