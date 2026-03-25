package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.market.ranking.features.main.ui.sub.list.futures.RankingNewListingsFuturesFragment$registerSubscribers$2;
import com.okinc.market.ranking.features.main.viewmodel.RankingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qwm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41755qwm extends AbstractC41747qwe {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qwt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41755qwm.AEQbTJ(this.EZpvd);
        }
    });

    @Override // o.AbstractC41759qwq
    public boolean AhwBna() {
        return false;
    }

    public C41755qwm() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C41778qxI.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.futures.RankingNewListingsFuturesFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.futures.RankingNewListingsFuturesFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.futures.RankingNewListingsFuturesFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final C41778qxI ejfBZ() {
        return (C41778qxI) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC41759qwq
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(qZH.PendingIntent.svY);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (Intrinsics.EZpvd((java.lang.Object) ejfBZ().KWHzl(), (java.lang.Object) "RANKING_NEW_LISTINGS_FUTURE")) {
            RankingViewModel.loadNewCoinRankData$OKMarket_market_impl$default(isConnected(), null, 1, null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/qYp; */
    /* JADX DEBUG: Possible override for method o.qwe.EZpvd()V */
    /* JADX DEBUG: Possible override for method o.qww.EZpvd()V */
    @Override // o.AbstractC41759qwq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C41713qvx OLrzqt() {
        return (C41713qvx) this.KWHzl.getValue();
    }

    public static final C41713qvx AEQbTJ(final C41755qwm c41755qwm) {
        return new C41713qvx(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), new Function0() { // from class: o.qws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41755qwm.EZpvd(this.copydefault);
            }
        });
    }

    public static final Unit EZpvd(C41755qwm c41755qwm) {
        c41755qwm.gEmmrt();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC41759qwq
    public void djBIcL() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, isConnected(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.futures.RankingNewListingsFuturesFragment$registerSubscribers$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((RankingViewModel.ActionBar) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((RankingViewModel.ActionBar) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, null, new RankingNewListingsFuturesFragment$registerSubscribers$2(this, null), 2, null);
    }

    @Override // o.AbstractC41759qwq, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(this);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.OLrzqt(OtpEventTracker.OTP_EVENT_VALUE_NEW, "futures", valueOf().KWHzl().getTrackEvent());
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C33546myW c33546myW;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C42828rdl c42828rdlAYXKKw = AYXKKw();
        if (c42828rdlAYXKKw == null || (c33546myW = c42828rdlAYXKKw.copydefault) == null) {
            return;
        }
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.qwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C41755qwm.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C41755qwm c41755qwm, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        RankingViewModel.loadNewCoinRankData$OKMarket_market_impl$default(c41755qwm.isConnected(), null, 1, null);
    }

    @Override // o.AbstractC41759qwq
    public void gEmmrt() {
        RankingViewModel.loadNewCoinRankData$OKMarket_market_impl$default(isConnected(), null, 1, null);
    }
}
