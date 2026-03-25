package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$setFavoritesOptListeners$1$2;
import com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$showToolTipByDexInstrument$1;
import com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$showToolTipByInstrument$1;
import com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$showToolTipCoinQuote$1;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesOptViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40683qca implements InterfaceC40693qck {
    public Function0<MarketsFavoritesOptViewModel> AEQbTJ;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qcb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40683qca.OLrzqt();
        }
    });
    public android.content.Context OLrzqt;
    public androidx.fragment.app.Fragment copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.copydefault = null;
        this.OLrzqt = null;
        this.AEQbTJ = null;
    }

    private final MarketsFavoritesOptViewModel AEQbTJ() {
        Function0<MarketsFavoritesOptViewModel> function0 = this.AEQbTJ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt KWHzl() {
        return (C38383pWt) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38383pWt OLrzqt() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    public void EZpvd(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
        this.OLrzqt = fragment.getContext();
        this.AEQbTJ = new Function0() { // from class: o.qcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40683qca.KWHzl(fragment);
            }
        };
    }

    public void OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        MarketsFavoritesOptViewModel marketsFavoritesOptViewModelAEQbTJ = AEQbTJ();
        if (marketsFavoritesOptViewModelAEQbTJ != null) {
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(interfaceC49363unD, marketsFavoritesOptViewModelAEQbTJ, new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$setFavoritesOptListeners$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((MarketsFavoritesOptViewModel.TaskDescription) obj).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((MarketsFavoritesOptViewModel.TaskDescription) obj).copydefault((InterfaceC49371unL) obj2);
                }
            }, null, new DefaultMarketFavoritesOptDelegate$setFavoritesOptListeners$1$2(this, null), 2, null);
        }
    }

    @Override // o.InterfaceC40693qck
    public void OLrzqt(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        EZpvd(view, bizInstrument, z);
    }

    @Override // o.InterfaceC40693qck
    public void EZpvd(@NotNull android.view.View view, @NotNull TradeCoinInfo tradeCoinInfo, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        EZpvd(view, (BizInstrument) new CoinWatchInstrument(tradeCoinInfo.getSymbol(), "COIN"), false);
    }

    @Override // o.InterfaceC40693qck
    public boolean AEQbTJ(@NotNull android.view.View view, @NotNull CoinQuote coinQuote, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt(view, coinQuote, str, str2);
    }

    private final void EZpvd(android.view.View view, BizInstrument bizInstrument, boolean z) {
        androidx.fragment.app.Fragment fragment;
        android.content.Context context;
        kotlin.Pair pairOLrzqt;
        MarketsFavoritesOptViewModel marketsFavoritesOptViewModelAEQbTJ = AEQbTJ();
        if (marketsFavoritesOptViewModelAEQbTJ == null || (fragment = this.copydefault) == null || (context = fragment.getContext()) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        int i = C41431qqg.EZpvd(view).y;
        if (bizInstrument instanceof CoinWatchInstrument) {
            pairOLrzqt = C56390yDp.OLrzqt(((CoinWatchInstrument) bizInstrument).getSymbol() + "-USDT", "SPOT");
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(bizInstrument.getInstId(), bizInstrument.getInstType());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new DefaultMarketFavoritesOptDelegate$showToolTipByInstrument$1(this, (java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2(), marketsFavoritesOptViewModelAEQbTJ, bizInstrument, parentFragmentManager, fragment, fragment, i, z, context, null), 3, null);
    }

    public final boolean OLrzqt(android.view.View view, CoinQuote coinQuote, java.lang.String str, java.lang.String str2) {
        androidx.fragment.app.Fragment fragment;
        android.content.Context context;
        MarketsFavoritesOptViewModel marketsFavoritesOptViewModelAEQbTJ = AEQbTJ();
        if (marketsFavoritesOptViewModelAEQbTJ == null || (fragment = this.copydefault) == null || (context = fragment.getContext()) == null) {
            return false;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new DefaultMarketFavoritesOptDelegate$showToolTipCoinQuote$1(coinQuote, this, parentFragmentManager, fragment, fragment, C41431qqg.EZpvd(view).y, marketsFavoritesOptViewModelAEQbTJ, str, context, str2, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AEQbTJ(CoinQuote coinQuote) {
        return Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "OPTION") || coinQuote.getCountDownInfo() != null || C55608xnE.OLrzqt();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jSE.showCryptoAddedTip$default(o.jSE, android.content.Context, androidx.fragment.app.FragmentManager, o.xqi, java.lang.String, int, int, java.lang.Object):void */
    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(InterfaceC49371unL<? extends kotlin.Pair<java.lang.String, ? extends InterfaceC55797xqi>> interfaceC49371unL) {
        android.content.Context context;
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment == null || (context = fragment.getContext()) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            java.lang.String str = (java.lang.String) ((kotlin.Pair) activity.copydefault()).getFirst();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                jSE.showCryptoAddedTip$default(jSE.EZpvd, context, childFragmentManager, (InterfaceC55797xqi) ((kotlin.Pair) activity.copydefault()).getSecond(), "market_list", 0, 16, null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                C55326xho.toast$default(C33070mpX.AYXKKw(qZH.PendingIntent.gHZMYf), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    @Override // o.InterfaceC40693qck
    public void OLrzqt(@NotNull android.view.View view, @NotNull InterfaceC41655qus interfaceC41655qus, int i, boolean z, boolean z2, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        OLrzqt(view, interfaceC41655qus, z, z2, str, str2);
    }

    public final boolean OLrzqt(android.view.View view, InterfaceC41655qus interfaceC41655qus, boolean z, boolean z2, java.lang.String str, java.lang.String str2) {
        androidx.fragment.app.Fragment fragment;
        MarketsFavoritesOptViewModel marketsFavoritesOptViewModelAEQbTJ = AEQbTJ();
        if (marketsFavoritesOptViewModelAEQbTJ == null || (fragment = this.copydefault) == null) {
            return false;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new DefaultMarketFavoritesOptDelegate$showToolTipByDexInstrument$1(this, interfaceC41655qus.copydefault(), marketsFavoritesOptViewModelAEQbTJ, parentFragmentManager, fragment, view, z2, fragment, z, C33129mqd.gEmmrt(interfaceC41655qus.djBIcL()), str, str2, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarketsFavoritesOptViewModel KWHzl(final androidx.fragment.app.Fragment fragment) {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$attachFavoritesOptContext$lambda$1$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$attachFavoritesOptContext$lambda$1$$inlined$viewModels$default$2
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
        return (MarketsFavoritesOptViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(MarketsFavoritesOptViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$attachFavoritesOptContext$lambda$1$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$attachFavoritesOptContext$lambda$1$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesOptDelegate$attachFavoritesOptContext$lambda$1$$inlined$viewModels$default$5
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
