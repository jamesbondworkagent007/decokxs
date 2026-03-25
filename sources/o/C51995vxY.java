package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.nmp.home.NmpBotSquareFragment$onVisible$1;
import com.okinc.tradingbot.impl.nmp.home.NmpBotSquareFragment$subscribeOnUIChange$5$1;
import com.okinc.tradingbot.impl.nmp.home.presenter.NmpBotSquarePresenter;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC51791vtg;
import o.C48033uCm;
import o.C51519voZ;
import o.C51995vxY;
import o.C52755wXd;
import o.C52761wXj;
import o.C55688xof;
import o.C56058xve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51995vxY extends AbstractC51991vxU<AbstractC48550uVo, NmpBotSquarePresenter> {
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String djBIcL;
    public final int gEmmrt = C48033uCm.Activity.iUnTnt;
    public C43316rmw valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.vxY$PictureInPictureParams */
    public static final /* synthetic */ class PictureInPictureParams implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48550uVo EZpvd(C51995vxY c51995vxY) {
        return (AbstractC48550uVo) c51995vxY.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ NmpBotSquarePresenter OLrzqt(C51995vxY c51995vxY) {
        return (NmpBotSquarePresenter) c51995vxY.dxcTrN();
    }

    private final boolean djBIcL() {
        android.os.Bundle arguments;
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ() || ((arguments = getArguments()) != null && arguments.getBoolean("HideSearchIcon", false));
    }

    /* JADX INFO: renamed from: o.vxY$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vxY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C51995vxY newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return stateListAnimator.EZpvd(str, str2, bundle, z);
        }

        public final C51995vxY EZpvd(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z) {
            C51995vxY c51995vxY = new C51995vxY();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("bot_type", str), C56390yDp.OLrzqt("tab_name", str2), C56390yDp.OLrzqt("HideSearchIcon", java.lang.Boolean.valueOf(z)));
            if (bundle != null) {
                bundleBundleOf.putAll(bundle);
            }
            c51995vxY.setArguments(bundleBundleOf);
            return c51995vxY;
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle arguments;
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments2 = getArguments();
        this.AkhnZx = arguments2 != null ? arguments2.getString("tab_name") : null;
        android.os.Bundle arguments3 = getArguments();
        this.AhwBna = arguments3 != null ? arguments3.getString("bot_type") : null;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String string = arguments4 != null ? arguments4.getString(AppsFlyerProperties.CHANNEL) : null;
        this.djBIcL = string;
        if (string != null && (arguments = getArguments()) != null) {
            C56058xve.Companion.copydefault().AEQbTJ(C56058xve.Activity.Companion.copydefault(arguments));
        }
        ((NmpBotSquarePresenter) dxcTrN()).copydefault(this.AkhnZx, this.AhwBna);
        KWHzl(this.AkhnZx);
        if (djBIcL()) {
            ((AbstractC48550uVo) gGvvIC()).djBIcL.removeView(((AbstractC48550uVo) gGvvIC()).AYXKKw);
            AppCompatImageView appCompatImageView = ((AbstractC48550uVo) gGvvIC()).AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(djBIcL() ? 8 : 0);
        }
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.OLrzqt(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        c43316rmw.register(HomeStrategyCardInfo.class, new C51512voS(true, new Function2() { // from class: o.vxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51995vxY.KWHzl(this.copydefault, (HomeStrategyCardInfo) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, null, true, this.djBIcL, 12, null));
        c43316rmw.register(C51505voL.class, new C51508voO(new Function0() { // from class: o.vyg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51995vxY.gEmmrt(this.EZpvd);
            }
        }));
        this.valueOf = c43316rmw;
        RecyclerView recyclerView = ((AbstractC48550uVo) gGvvIC()).AEQbTJ;
        recyclerView.setAdapter(this.valueOf);
        recyclerView.setItemViewCacheSize(10);
        recyclerView.addItemDecoration(new C31703mAu(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE), C55298xhM.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.zuBGHE), 0));
        C33546myW c33546myW = ((AbstractC48550uVo) gGvvIC()).valueOf;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.vyj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51995vxY.AEQbTJ(this.KWHzl, interfaceC57934yrl);
            }
        });
        ((AbstractC48550uVo) gGvvIC()).EZpvd.AEQbTJ().setTxtNoMore("");
        AppCompatImageView appCompatImageView2 = ((AbstractC48550uVo) gGvvIC()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(djBIcL() ? 8 : 0);
        AYXKKw();
        values();
        AkhnZx();
        gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C51995vxY c51995vxY, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        if (emptyData.getEmptyType() == 8) {
            NmpBotSquarePresenter.fetchBotList$default((NmpBotSquarePresenter) c51995vxY.dxcTrN(), c51995vxY.AhwBna, c51995vxY.AkhnZx, true, null, 8, null);
        } else {
            NmpBotSquarePresenter nmpBotSquarePresenter = (NmpBotSquarePresenter) c51995vxY.dxcTrN();
            for (C51527voh c51527voh : ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).AhwBna()) {
                if (Intrinsics.EZpvd((java.lang.Object) c51527voh.AEQbTJ(), (java.lang.Object) "ALL")) {
                    nmpBotSquarePresenter.copydefault(c51527voh);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final C51995vxY c51995vxY, final HomeStrategyCardInfo homeStrategyCardInfo, final int i) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        if (homeStrategyCardInfo.isEnable()) {
            return Unit.INSTANCE;
        }
        FragmentActivity fragmentActivityRequireActivity = c51995vxY.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.OKvQBs));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.OHsvZP), new View.OnClickListener() { // from class: o.vyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51995vxY.copydefault(this.KWHzl, homeStrategyCardInfo, i, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getConnectivityMgr), new View.OnClickListener() { // from class: o.vyd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51995vxY.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C51995vxY c51995vxY, HomeStrategyCardInfo homeStrategyCardInfo, int i, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        NmpBotSquarePresenter nmpBotSquarePresenter = (NmpBotSquarePresenter) c51995vxY.dxcTrN();
        java.lang.String algoId = homeStrategyCardInfo.getAlgoId();
        if (algoId == null) {
            algoId = "";
        }
        nmpBotSquarePresenter.OLrzqt(algoId, i);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C51995vxY c51995vxY) {
        ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vxY$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51995vxY OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51995vxY c51995vxY) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c51995vxY;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wXd.Application.show$default(o.wXd$Application, java.util.List, androidx.fragment.app.FragmentManager, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, android.view.View, java.lang.String, kotlin.jvm.functions.Function2, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C51995vxY.EZpvd(this.OLrzqt).KWHzl.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listOLrzqt = C51995vxY.OLrzqt(this.OLrzqt).OLrzqt();
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listOLrzqt, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : this.OLrzqt.new Dialog(), this.OLrzqt.new PendingIntent(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
                C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, LoaderManager.copydefault, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vxY$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51995vxY EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51995vxY c51995vxY) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c51995vxY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C51995vxY.EZpvd(this.EZpvd).copydefault.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listCopydefault = C51995vxY.OLrzqt(this.EZpvd).copydefault();
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listCopydefault, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : this.EZpvd.new Fragment(), this.EZpvd.new FragmentManager(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vxY$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51995vxY KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51995vxY c51995vxY) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c51995vxY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C51519voZ.TaskDescription taskDescription = C51519voZ.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                taskDescription.OLrzqt(childFragmentManager, this.KWHzl.AhwBna, this.KWHzl.AkhnZx);
                C32866mlf.onEvent$default("TradingBot_BotMarketplace_Button_Click", (TrackChannel[]) null, SharedElementCallback.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vxY$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C51995vxY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51995vxY c51995vxY) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c51995vxY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.fetchVPNInfo();
                HomeStrategySortConfig value = C51995vxY.OLrzqt(this.OLrzqt).fetchVPNInfo().getValue();
                if (value != null) {
                    ActivityC51791vtg.StateListAnimator stateListAnimator = ActivityC51791vtg.Companion;
                    FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    stateListAnimator.copydefault(fragmentActivityRequireActivity, value.getMode(), value.getDirection());
                }
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.nmp.home.presenter.NmpBotSquarePresenter.loadMoreBotList$default(com.okinc.tradingbot.impl.nmp.home.presenter.NmpBotSquarePresenter, java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C51995vxY c51995vxY, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        NmpBotSquarePresenter.loadMoreBotList$default((NmpBotSquarePresenter) c51995vxY.dxcTrN(), null, 1, null);
    }

    public final void AYXKKw() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("refresh_fav_bot");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, viewLifecycleOwner);
        final java.lang.Object obj = new java.lang.Object();
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.tradingbot.impl.nmp.home.NmpBotSquareFragment$subscribeRxBus$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (Intrinsics.EZpvd((Object) this.this$0.AkhnZx, (Object) "FAVORITE")) {
                    NmpBotSquarePresenter.fetchBotList$default(C51995vxY.OLrzqt(this.this$0), this.this$0.AhwBna, this.this$0.AkhnZx, true, null, 8, null);
                }
            }
        });
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NmpBotSquareFragment$onVisible$1(this, null), 3, null);
        ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).KWHzl(getViewLifecycleOwner(), getChildFragmentManager());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        AppCompatTextView appCompatTextView = ((AbstractC48550uVo) gGvvIC()).copydefault;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        AppCompatTextView appCompatTextView2 = ((AbstractC48550uVo) gGvvIC()).KWHzl;
        appCompatTextView2.setOnClickListener(new ActionBar(appCompatTextView2, 1000L, this));
        AppCompatImageView appCompatImageView = ((AbstractC48550uVo) gGvvIC()).AYXKKw;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
        AppCompatImageView appCompatImageView2 = ((AbstractC48550uVo) gGvvIC()).OLrzqt;
        appCompatImageView2.setOnClickListener(new Application(appCompatImageView2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vxY$Fragment */
    public static final class Fragment implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C51995vxY.EZpvd(C51995vxY.this).copydefault.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vxY$FragmentManager */
    public static final class FragmentManager implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            KWHzl(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void KWHzl(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            C51527voh c51527voh = objOLrzqt instanceof C51527voh ? (C51527voh) objOLrzqt : null;
            if (c51527voh != null) {
                C51995vxY c51995vxY = C51995vxY.this;
                C51995vxY.OLrzqt(c51995vxY).copydefault(c51527voh);
                c51995vxY.KWHzl(c51527voh.AEQbTJ());
            }
        }
    }

    /* JADX INFO: renamed from: o.vxY$Dialog */
    public static final class Dialog implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C51995vxY.EZpvd(C51995vxY.this).KWHzl.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vxY$PendingIntent */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class PendingIntent implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
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
            HomeStrategySortConfig homeStrategySortConfig = objOLrzqt instanceof HomeStrategySortConfig ? (HomeStrategySortConfig) objOLrzqt : null;
            if (homeStrategySortConfig != null) {
                C51995vxY.OLrzqt(C51995vxY.this).AEQbTJ(homeStrategySortConfig);
                C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectRanking_Click", (TrackChannel[]) null, new TaskDescription(homeStrategySortConfig), 1, (java.lang.Object) null);
            }
        }

        /* JADX INFO: renamed from: o.vxY$PendingIntent$TaskDescription */
        public static final class TaskDescription implements Function1<EventParamsList, Unit> {
            public final /* synthetic */ HomeStrategySortConfig EZpvd;

            /* JADX INFO: renamed from: o.vxY$PendingIntent$TaskDescription$Activity */
            public final /* synthetic */ class Activity {
                public static final /* synthetic */ int[] OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[HomeStrategySortConfig.values().length];
                    try {
                        iArr[HomeStrategySortConfig.SMART_SORTING.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.PNL_RATIO.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.MAX_DRAW_DOWN.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.NUM_OF_COPIES.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[HomeStrategySortConfig.Highest_PnL.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    OLrzqt = iArr;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(HomeStrategySortConfig homeStrategySortConfig) {
                this.EZpvd = homeStrategySortConfig;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                OLrzqt(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void OLrzqt(EventParamsList eventParamsList) {
                java.lang.String str;
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                int i = Activity.OLrzqt[this.EZpvd.ordinal()];
                if (i == 1) {
                    str = "overview";
                } else if (i == 2) {
                    str = "pnl";
                } else if (i == 3) {
                    str = "max_drawdown";
                } else if (i == 4) {
                    str = "used_times";
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "pnl_amount";
                }
                EventParamsList.put$default(eventParamsList, "menu_name", str, false, 4, null);
                EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vxY$LoaderManager */
    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager copydefault = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "dropdown", false, 4, null);
            EventParamsList.put$default(eventParamsList, "type", "bot_marketplace", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.vxY$SharedElementCallback */
    public static final class SharedElementCallback implements Function1<EventParamsList, Unit> {
        public static final SharedElementCallback EZpvd = new SharedElementCallback();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "filters", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.vyk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        });
        TradeLiveData<C51527voh> tradeLiveDataValueOf = ((NmpBotSquarePresenter) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner2, new PictureInPictureParams(new Function1() { // from class: o.vyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.KWHzl(this.OLrzqt, (C51527voh) obj);
            }
        }));
        TradeLiveData<HomeStrategySortConfig> tradeLiveDataFetchVPNInfo = ((NmpBotSquarePresenter) dxcTrN()).fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner3, new PictureInPictureParams(new Function1() { // from class: o.vyi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.copydefault(this.KWHzl, (HomeStrategySortConfig) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataDbNXlk = ((NmpBotSquarePresenter) dxcTrN()).DbNXlk();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataDbNXlk.observe(viewLifecycleOwner4, new PictureInPictureParams(new Function1() { // from class: o.vym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<HomeStrategyCardResult> tradeLiveDataAYXKKw = ((NmpBotSquarePresenter) dxcTrN()).AYXKKw();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner5, new PictureInPictureParams(new Function1() { // from class: o.vyn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.AEQbTJ(this.OLrzqt, (HomeStrategyCardResult) obj);
            }
        }));
        TradeLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> tradeLiveDataAkhnZx = ((NmpBotSquarePresenter) dxcTrN()).AkhnZx();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner6, new PictureInPictureParams(new Function1() { // from class: o.vyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataGEmmrt = ((NmpBotSquarePresenter) dxcTrN()).gEmmrt();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner7, new PictureInPictureParams(new Function1() { // from class: o.vxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((NmpBotSquarePresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.OLrzqt(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        ((NmpBotSquarePresenter) dxcTrN()).getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vyc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.AEQbTJ(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C51995vxY c51995vxY, java.lang.String str) {
        if (c51995vxY.isResumed() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            NmpBotSquarePresenter.fetchBotList$default((NmpBotSquarePresenter) c51995vxY.dxcTrN(), c51995vxY.AhwBna, c51995vxY.AkhnZx, true, null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C51995vxY c51995vxY, C51527voh c51527voh) {
        Intrinsics.checkNotNullParameter(c51527voh, "");
        ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).AEQbTJ(c51527voh);
        TacticsType tacticsTypeKWHzl = c51527voh.KWHzl();
        c51995vxY.AhwBna = tacticsTypeKWHzl != null ? tacticsTypeKWHzl.getConstant() : null;
        c51995vxY.AkhnZx = c51527voh.AEQbTJ();
        ((AbstractC48550uVo) c51995vxY.gGvvIC()).copydefault.setText(c51527voh.EZpvd());
        ((AbstractC48550uVo) c51995vxY.gGvvIC()).copydefault.setSelected(false);
        if (c51995vxY.isResumed()) {
            NmpBotSquarePresenter.fetchBotList$default((NmpBotSquarePresenter) c51995vxY.dxcTrN(), c51995vxY.AhwBna, c51995vxY.AkhnZx, true, null, 8, null);
        }
        c51995vxY.KWHzl(c51995vxY.AkhnZx);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C51995vxY c51995vxY, HomeStrategySortConfig homeStrategySortConfig) {
        Intrinsics.checkNotNullParameter(homeStrategySortConfig, "");
        ((AbstractC48550uVo) c51995vxY.gGvvIC()).KWHzl.setText(C33070mpX.AYXKKw(homeStrategySortConfig.getTitle()));
        ((AbstractC48550uVo) c51995vxY.gGvvIC()).KWHzl.setSelected(false);
        if (c51995vxY.isResumed()) {
            NmpBotSquarePresenter.fetchBotList$default((NmpBotSquarePresenter) c51995vxY.dxcTrN(), c51995vxY.AhwBna, c51995vxY.AkhnZx, false, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C51995vxY c51995vxY, boolean z) {
        ((AbstractC48550uVo) c51995vxY.gGvvIC()).OLrzqt.setImageResource(z ? C52761wXj.TaskDescription.dIjzlO : C52761wXj.TaskDescription.dPnHjp);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C51995vxY c51995vxY, HomeStrategyCardResult homeStrategyCardResult) {
        Intrinsics.checkNotNullParameter(homeStrategyCardResult, "");
        C33546myW c33546myW = ((AbstractC48550uVo) c51995vxY.gGvvIC()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        java.util.List<HomeStrategyCardInfo> strategies = homeStrategyCardResult.getStrategies();
        C57589ylK.KWHzl(c33546myW, strategies == null || strategies.isEmpty());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c51995vxY), null, null, new NmpBotSquareFragment$subscribeOnUIChange$5$1(homeStrategyCardResult, c51995vxY, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C51995vxY c51995vxY, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        int iIntValue = ((java.lang.Number) pair.component2()).intValue();
        if (zBooleanValue) {
            c51995vxY.EZpvd((java.util.List<? extends java.lang.Object>) ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).OLrzqt(iIntValue));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C51995vxY c51995vxY, boolean z) {
        if (z) {
            c51995vxY.EZpvd((java.util.List<? extends java.lang.Object>) ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C51995vxY c51995vxY, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).values().bB_())) {
            c51995vxY.valueOf();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51995vxY, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            java.lang.Exception exc = (java.lang.Exception) pair.second;
            if (exc != null && (message = exc.getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C51995vxY c51995vxY, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).values().bB_())) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE) && !((NmpBotSquarePresenter) c51995vxY.dxcTrN()).isConnected()) {
                C55113xdn.showLoading$default(((AbstractC48550uVo) c51995vxY.gGvvIC()).gEmmrt, 0L, 1, null);
            } else {
                ((AbstractC48550uVo) c51995vxY.gGvvIC()).gEmmrt.copydefault();
            }
        }
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        getChildFragmentManager().setFragmentResultListener("botFilterInfo", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vyb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51995vxY.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C51995vxY c51995vxY, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Parcelable parcelable = bundle.getParcelable("botFilterInfo");
        ((NmpBotSquarePresenter) c51995vxY.dxcTrN()).OLrzqt(parcelable instanceof HomeStrategyDropDownInfo ? (HomeStrategyDropDownInfo) parcelable : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str) {
        Group group = ((AbstractC48550uVo) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FAVORITE") ^ true ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.util.List<? extends java.lang.Object> list) {
        java.lang.String strAYXKKw;
        if (Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "FAVORITE")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RcLksq);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0);
        }
        java.lang.String str = strAYXKKw;
        java.lang.String strAYXKKw2 = Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "FAVORITE") ? C33070mpX.AYXKKw(C55688xof.Application.UJpkuA) : "";
        C43316rmw c43316rmw = this.valueOf;
        if (c43316rmw != null) {
            C49952uyJ.updateDataOrEmpty$default(c43316rmw, list, str, 60, strAYXKKw2, null, false, 48, null);
        }
    }

    private final void valueOf() {
        C43316rmw c43316rmw = this.valueOf;
        if (c43316rmw != null) {
            C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT), 60, false, null, null, false, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_BotCard_Click", (TrackChannel[]) null, new Function1() { // from class: o.vye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51995vxY.EZpvd(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C51995vxY c51995vxY, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "search", false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", "", false, 4, null);
        java.lang.String str = c51995vxY.djBIcL;
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        EventParamsList.put$default(eventParamsList, AppsFlyerProperties.CHANNEL, lowerCase, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.djBIcL;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
    }
}
