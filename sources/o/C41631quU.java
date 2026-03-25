package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewSpotVo;
import com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$setFavoritesOptListeners$1$2;
import com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$showToolTipByInstrument$1;
import com.okinc.market.ranking.features.main.viewmodel.RankingFavoritesOptViewModel;
import com.okinc.unify_find.data.NewCoinFuturesRankPo;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC55470xkZ;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41631quU implements InterfaceC41695qvf {
    public android.content.Context KWHzl;
    public Function0<RankingFavoritesOptViewModel> OLrzqt;
    public androidx.fragment.app.Fragment copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.copydefault = null;
        this.KWHzl = null;
        this.OLrzqt = null;
    }

    public final RankingFavoritesOptViewModel KWHzl() {
        Function0<RankingFavoritesOptViewModel> function0 = this.OLrzqt;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public void EZpvd(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
        this.KWHzl = fragment.getContext();
        this.OLrzqt = new Function0() { // from class: o.quY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41631quU.AEQbTJ(fragment);
            }
        };
    }

    public void EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        RankingFavoritesOptViewModel rankingFavoritesOptViewModelKWHzl = KWHzl();
        if (rankingFavoritesOptViewModelKWHzl != null) {
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(interfaceC49363unD, rankingFavoritesOptViewModelKWHzl, new MutablePropertyReference1Impl() { // from class: com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$setFavoritesOptListeners$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((RankingFavoritesOptViewModel.Application) obj).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((RankingFavoritesOptViewModel.Application) obj).AEQbTJ((InterfaceC49371unL<Pair<String, WatchListData>>) obj2);
                }
            }, null, new DefaultRankingFavoritesOptDelegate$setFavoritesOptListeners$1$2(this, null), 2, null);
        }
    }

    @Override // o.InterfaceC41695qvf
    public void EZpvd(@NotNull android.view.View view, @NotNull RankingHotCryptoVo rankingHotCryptoVo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        KWHzl(view, new WatchListData(rankingHotCryptoVo.getAlias(), (java.lang.String) null, rankingHotCryptoVo.getInstId(), rankingHotCryptoVo.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null));
    }

    @Override // o.InterfaceC41695qvf
    public void OLrzqt(@NotNull android.view.View view, @NotNull RankingNewSpotVo rankingNewSpotVo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(rankingNewSpotVo, "");
        KWHzl(view, new WatchListData(rankingNewSpotVo.getAlias(), (java.lang.String) null, rankingNewSpotVo.getInstId(), rankingNewSpotVo.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null));
    }

    @Override // o.InterfaceC41695qvf
    public void EZpvd(@NotNull android.view.View view, @NotNull AbstractC55470xkZ.ActionBar actionBar, int i) {
        WatchListData watchListData;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (actionBar.DbNXlk() instanceof NewCoinFuturesRankPo) {
            watchListData = ((NewCoinFuturesRankPo) actionBar.DbNXlk()).toFuturesWatchingListData$OKMarket_market_impl();
        } else {
            java.lang.String strCopydefault = actionBar.copydefault();
            java.lang.String strAYXKKw = actionBar.AYXKKw();
            if (strAYXKKw == null) {
                return;
            } else {
                watchListData = new WatchListData((java.lang.String) null, (java.lang.String) null, strCopydefault, strAYXKKw, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 243, (DefaultConstructorMarker) null);
            }
        }
        KWHzl(view, watchListData);
    }

    @Override // o.InterfaceC41695qvf
    public void copydefault(@NotNull android.view.View view, @NotNull C35069noP c35069noP, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35069noP, "");
        KWHzl(view, new WatchListData("", (java.lang.String) null, c35069noP.AhwBna(), c35069noP.djBIcL(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null));
    }

    @Override // o.InterfaceC41695qvf
    public void KWHzl(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        KWHzl(view, new WatchListData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "CEDEFI", dexInstrument.getChainId(), dexInstrument.getTokenContractAddress(), dexInstrument.getTokenSymbol(), (java.lang.String) null, 135, (DefaultConstructorMarker) null));
    }

    @Override // o.InterfaceC41695qvf
    public void OLrzqt(@NotNull android.view.View view, @NotNull WatchListData watchListData, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        KWHzl(view, watchListData);
    }

    public final void KWHzl(android.view.View view, WatchListData watchListData) {
        androidx.fragment.app.Fragment fragment;
        android.content.Context context;
        RankingFavoritesOptViewModel rankingFavoritesOptViewModelKWHzl = KWHzl();
        if (rankingFavoritesOptViewModelKWHzl == null || (fragment = this.copydefault) == null || (context = fragment.getContext()) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        int i = C41431qqg.EZpvd(view).y;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(watchListData.getInstId(), watchListData.getInstType());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new DefaultRankingFavoritesOptDelegate$showToolTipByInstrument$1(rankingFavoritesOptViewModelKWHzl, watchListData, parentFragmentManager, fragment, fragment, i, (java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2(), context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(InterfaceC49371unL<kotlin.Pair<java.lang.String, WatchListData>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            java.lang.String str = (java.lang.String) ((kotlin.Pair) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getFirst();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                C55326xho.toast$default(qZH.PendingIntent.DTwDnp, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                C55326xho.toast$default(qZH.PendingIntent.gHZMYf, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    public static final RankingFavoritesOptViewModel AEQbTJ(final androidx.fragment.app.Fragment fragment) {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        return (RankingFavoritesOptViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(RankingFavoritesOptViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.ranking.features.main.ui.DefaultRankingFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }
}
