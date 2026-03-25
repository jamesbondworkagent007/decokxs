package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$setFavoritesOptListeners$1$2;
import com.okinc.market.search.features.navigation.favorites.viewmodel.NavFavoritesOptViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.InterfaceC55797xqi;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qKH implements qKN {
    public android.content.Context KWHzl;
    public Function0<NavFavoritesOptViewModel> OLrzqt;
    public androidx.fragment.app.Fragment copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.copydefault = null;
        this.KWHzl = null;
        this.OLrzqt = null;
    }

    public final NavFavoritesOptViewModel copydefault() {
        Function0<NavFavoritesOptViewModel> function0 = this.OLrzqt;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public void AEQbTJ(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
        this.KWHzl = fragment.getContext();
        this.OLrzqt = new Function0() { // from class: o.qKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qKH.copydefault(fragment);
            }
        };
    }

    public void AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        NavFavoritesOptViewModel navFavoritesOptViewModelCopydefault = copydefault();
        if (navFavoritesOptViewModelCopydefault != null) {
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(interfaceC49363unD, navFavoritesOptViewModelCopydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$setFavoritesOptListeners$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((NavFavoritesOptViewModel.TaskDescription) obj).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((NavFavoritesOptViewModel.TaskDescription) obj).copydefault((InterfaceC49371unL<? extends Pair<String, ? extends InterfaceC55797xqi>>) obj2);
                }
            }, null, new DefaultNavFavoritesOptDelegate$setFavoritesOptListeners$1$2(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(InterfaceC49371unL<? extends kotlin.Pair<java.lang.String, ? extends InterfaceC55797xqi>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            java.lang.String str = (java.lang.String) ((kotlin.Pair) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getFirst();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                C55326xho.toast$default(C33070mpX.AYXKKw(qZH.PendingIntent.DTwDnp), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                C55326xho.toast$default(C33070mpX.AYXKKw(qZH.PendingIntent.gHZMYf), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            } else {
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            if (application.AEQbTJ() instanceof CancellationException) {
                return;
            }
            C44157sFk.KWHzl(application.AEQbTJ());
        }
    }

    @Override // o.qKN
    public void OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        NavFavoritesOptViewModel navFavoritesOptViewModelCopydefault = copydefault();
        if (navFavoritesOptViewModelCopydefault != null) {
            navFavoritesOptViewModelCopydefault.AEQbTJ(bizInstrument);
        }
    }

    @Override // o.qKN
    public void EZpvd(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        NavFavoritesOptViewModel navFavoritesOptViewModelCopydefault = copydefault();
        if (navFavoritesOptViewModelCopydefault != null) {
            navFavoritesOptViewModelCopydefault.EZpvd(dexInstrument);
        }
    }

    @Override // o.qKN
    public void KWHzl(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        NavFavoritesOptViewModel navFavoritesOptViewModelCopydefault = copydefault();
        if (navFavoritesOptViewModelCopydefault != null) {
            navFavoritesOptViewModelCopydefault.KWHzl(bizInstrument);
        }
    }

    @Override // o.qKN
    public void KWHzl(@NotNull DexInstrument dexInstrument) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        NavFavoritesOptViewModel navFavoritesOptViewModelCopydefault = copydefault();
        if (navFavoritesOptViewModelCopydefault != null) {
            navFavoritesOptViewModelCopydefault.OLrzqt(dexInstrument);
        }
    }

    @Override // o.qKN
    public void KWHzl(@NotNull TradeCoinInfo tradeCoinInfo) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        OLrzqt(new CoinWatchInstrument(tradeCoinInfo.getSymbol(), "COIN"));
    }

    @Override // o.qKN
    public void copydefault(@NotNull TradeCoinInfo tradeCoinInfo) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        KWHzl(new CoinWatchInstrument(tradeCoinInfo.getSymbol(), "COIN"));
    }

    public static final NavFavoritesOptViewModel copydefault(final androidx.fragment.app.Fragment fragment) {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$2
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
        return (NavFavoritesOptViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(NavFavoritesOptViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.favorites.delegate.DefaultNavFavoritesOptDelegate$attachFavoritesOptContext$lambda$0$$inlined$viewModels$default$5
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
