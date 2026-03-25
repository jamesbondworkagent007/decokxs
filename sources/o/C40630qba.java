package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.market.discover.features.markets.MarketDiscoverMarketsFragment;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$handlePendingTabSelection$1;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$reloadIfError$1;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$setListener$$inlined$repeatOnLifecycleResume$1;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$setListener$2;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$showPeriodFilterDialog$1;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$updateCategoryUiState$1;
import com.okinc.market.discover.features.markets.sub.dex.model.DiscoverDexPageVo;
import com.okinc.market.discover.features.markets.sub.dex.viewmodel.MarketDiscoverDexGroupViewModel;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40630qba extends AbstractC32996moC implements InterfaceC49363unD {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C42705rbU copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42705rbU AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.tIwhY;
    }

    public C40630qba() {
        final StateListAnimator stateListAnimator = new StateListAnimator(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) stateListAnimator.invoke();
            }
        });
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketDiscoverDexGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$special$$inlined$parentViewModels$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$special$$inlined$parentViewModels$5
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
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qbe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40630qba.KWHzl(this.KWHzl);
            }
        });
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    public <T extends InterfaceC49369unJ<T>, A> java.lang.Object copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Continuation<? super A> continuation) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>> java.lang.Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    public final MarketDiscoverDexGroupViewModel EZpvd() {
        return (MarketDiscoverDexGroupViewModel) this.EZpvd.getValue();
    }

    public final C40649qbt OLrzqt() {
        return (C40649qbt) this.KWHzl.getValue();
    }

    public static final C40649qbt KWHzl(C40630qba c40630qba) {
        return new C40649qbt(c40630qba);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42705rbU c42705rbUEZpvd = C42705rbU.EZpvd(view);
        Intrinsics.copydefault(c42705rbUEZpvd);
        copydefault(c42705rbUEZpvd);
        this.copydefault = c42705rbUEZpvd;
    }

    public final void copydefault(C42705rbU c42705rbU) {
        c42705rbU.getRoot().setContentDescription("MarketsOverviewDexPage");
        AppCompatImageView appCompatImageView = c42705rbU.AEQbTJ;
        appCompatImageView.setOnClickListener(new ActionBar(appCompatImageView, 1000L, this));
        c42705rbU.copydefault.setAdapter(OLrzqt());
        new TabLayoutMediator(c42705rbU.OLrzqt.AYXKKw(), c42705rbU.copydefault, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qaX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C40630qba.KWHzl(this.EZpvd, tab, i);
            }
        }).attach();
        C55244xgL c55244xgL = c42705rbU.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        C41364qpS.OLrzqt(c55244xgL, C52761wXj.TaskDescription.fERRXa, new Function1() { // from class: o.qaZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C40630qba.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue()));
            }
        }, new Function1() { // from class: o.qbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40630qba.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        c42705rbU.OLrzqt.copydefault(new TaskDescription());
    }

    public static final void KWHzl(C40630qba c40630qba, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setBackgroundColor(0);
        tab.setText(c40630qba.OLrzqt().AEQbTJ(i));
    }

    public static final boolean copydefault(C40630qba c40630qba, int i) {
        DexChainGroupVo dexChainGroupVoKWHzl;
        DiscoverDexPageVo discoverDexPageVoAhwBna = c40630qba.OLrzqt().AhwBna(i);
        if (i != 0) {
            return (discoverDexPageVoAhwBna == null || (dexChainGroupVoKWHzl = discoverDexPageVoAhwBna.KWHzl()) == null || !dexChainGroupVoKWHzl.AhwBna()) ? false : true;
        }
        return true;
    }

    public static final java.lang.String AEQbTJ(C40630qba c40630qba, int i) {
        DiscoverDexPageVo discoverDexPageVoAhwBna = c40630qba.OLrzqt().AhwBna(i);
        if (discoverDexPageVoAhwBna != null) {
            return discoverDexPageVoAhwBna.copydefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.qba$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            InterfaceC38466pZv interfaceC38466pZvCopydefault = C38470pZz.copydefault(C40630qba.this);
            if (interfaceC38466pZvCopydefault != null) {
                interfaceC38466pZvCopydefault.AEQbTJ("markets", "cedefi", C40630qba.this.OLrzqt().KWHzl(tab != null ? tab.getPosition() : 0), "l3_tab");
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        collectLatestOnLifecycle(EZpvd(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverDexGroupViewModel.Application) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverDexGroupViewModel.Application) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, Lifecycle.State.CREATED, new MarketDiscoverDexFragment$setListener$2(this));
        C41654qur.EZpvd(this, new Function1() { // from class: o.qbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40630qba.AEQbTJ(this.copydefault, (InterfaceC41649qum) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverDexFragment$setListener$$inlined$repeatOnLifecycleResume$1(this, Lifecycle.State.RESUMED, null, this), 3, null);
        AEQbTJ("dex_biz_init");
    }

    public static final Unit AEQbTJ(C40630qba c40630qba, InterfaceC41649qum interfaceC41649qum) {
        Intrinsics.checkNotNullParameter(interfaceC41649qum, "");
        C41298qoF.AEQbTJ.EZpvd(c40630qba.getTAG(), "listenQuotationDataSourceChanged " + interfaceC41649qum);
        c40630qba.AEQbTJ("trading_core_data_source_changed");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InterfaceC49371unL<? extends kotlin.Pair<? extends java.util.List<DexChainGroupVo>, java.lang.Long>> interfaceC49371unL, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverDexFragment$updateCategoryUiState$1 marketDiscoverDexFragment$updateCategoryUiState$1;
        C41381qpj root;
        java.util.Collection arrayList;
        C40630qba c40630qba;
        C40630qba c40630qba2;
        C41381qpj root2;
        C42705rbU c42705rbU;
        C41381qpj root3;
        if (continuation instanceof MarketDiscoverDexFragment$updateCategoryUiState$1) {
            marketDiscoverDexFragment$updateCategoryUiState$1 = (MarketDiscoverDexFragment$updateCategoryUiState$1) continuation;
            int i = marketDiscoverDexFragment$updateCategoryUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverDexFragment$updateCategoryUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverDexFragment$updateCategoryUiState$1 = new MarketDiscoverDexFragment$updateCategoryUiState$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = marketDiscoverDexFragment$updateCategoryUiState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverDexFragment$updateCategoryUiState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C41298qoF.AEQbTJ.EZpvd(getTag(), "update updateCategoryUiState: " + interfaceC49371unL);
            if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                if (OLrzqt().KWHzl() && (c42705rbU = this.copydefault) != null && (root3 = c42705rbU.getRoot()) != null) {
                    qXK.StateListAnimator.showLoadingState$default(root3, 0L, 1, null);
                }
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                if (C27563jxZ.OLrzqt.EZpvd()) {
                    java.lang.Object first = ((kotlin.Pair) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getFirst();
                    if (!C33129mqd.KWHzl((java.util.Collection) first)) {
                        first = null;
                    }
                    arrayList = (java.util.List) first;
                } else {
                    java.lang.Object first2 = ((kotlin.Pair) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getFirst();
                    if (!C33129mqd.KWHzl((java.util.Collection) first2)) {
                        first2 = null;
                    }
                    java.util.List list = (java.util.List) first2;
                    if (list != null) {
                        arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : list) {
                            if (!((DexChainGroupVo) obj).AhwBna()) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                if (arrayList == null) {
                    InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(new java.lang.IllegalStateException("empty category group"), null, 2, null);
                    marketDiscoverDexFragment$updateCategoryUiState$1.label = 1;
                    if (OLrzqt(application, marketDiscoverDexFragment$updateCategoryUiState$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C42705rbU c42705rbU2 = this.copydefault;
                if (c42705rbU2 != null && (root2 = c42705rbU2.getRoot()) != null) {
                    root2.values();
                }
                C40649qbt c40649qbtOLrzqt = OLrzqt();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DiscoverDexPageVo((DexChainGroupVo) it.next()));
                }
                c40649qbtOLrzqt.OLrzqt(arrayList2);
                MarketDiscoverDexGroupViewModel marketDiscoverDexGroupViewModelEZpvd = EZpvd();
                marketDiscoverDexFragment$updateCategoryUiState$1.L$0 = this;
                marketDiscoverDexFragment$updateCategoryUiState$1.L$1 = this;
                marketDiscoverDexFragment$updateCategoryUiState$1.label = 2;
                objKWHzl = marketDiscoverDexGroupViewModelEZpvd.KWHzl(marketDiscoverDexFragment$updateCategoryUiState$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c40630qba = this;
                c40630qba2 = c40630qba;
                c40630qba.AEQbTJ((DexPeriodEnum) objKWHzl);
                c40630qba2.KWHzl();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c40630qba2, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if ((interfaceC49371unL instanceof InterfaceC49371unL.Application) && !(((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ() instanceof CancellationException)) {
                C42705rbU c42705rbU3 = this.copydefault;
                if (c42705rbU3 != null && (root = c42705rbU3.getRoot()) != null) {
                    root.copydefault(getString(qZH.PendingIntent.DsL), getString(qZH.PendingIntent.djSkpj), getString(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.qbd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C40630qba.AEQbTJ(this.OLrzqt);
                        }
                    });
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objKWHzl);
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40630qba = (C40630qba) marketDiscoverDexFragment$updateCategoryUiState$1.L$1;
            c40630qba2 = (C40630qba) marketDiscoverDexFragment$updateCategoryUiState$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            c40630qba.AEQbTJ((DexPeriodEnum) objKWHzl);
            c40630qba2.KWHzl();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c40630qba2, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C40630qba c40630qba) {
        c40630qba.AEQbTJ("click_retry_button");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        valueOf();
        KWHzl();
    }

    /* JADX INFO: renamed from: o.qba$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C40630qba AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C40630qba c40630qba) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c40630qba;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ViewPager2 viewPager2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.copydefault();
                InterfaceC38466pZv interfaceC38466pZvCopydefault = C38470pZz.copydefault(this.AEQbTJ);
                if (interfaceC38466pZvCopydefault != null) {
                    C40649qbt c40649qbtOLrzqt = this.AEQbTJ.OLrzqt();
                    C42705rbU c42705rbUAEQbTJ = this.AEQbTJ.AEQbTJ();
                    interfaceC38466pZvCopydefault.AEQbTJ("cedefi", c40649qbtOLrzqt.KWHzl((c42705rbUAEQbTJ == null || (viewPager2 = c42705rbUAEQbTJ.copydefault) == null) ? 0 : viewPager2.getCurrentItem()));
                }
            }
        }
    }

    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().copydefault(str);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverDexFragment$reloadIfError$1(this, null), 3, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverDexFragment$showPeriodFilterDialog$1(this, null), 3, null);
    }

    public final void AEQbTJ(DexPeriodEnum dexPeriodEnum) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        if (DexPeriodEnum.Companion.AEQbTJ(dexPeriodEnum)) {
            C42705rbU c42705rbU = this.copydefault;
            if (c42705rbU == null || (appCompatImageView2 = c42705rbU.AEQbTJ) == null) {
                return;
            }
            appCompatImageView2.setImageResource(C52761wXj.TaskDescription.RihMUf);
            return;
        }
        C42705rbU c42705rbU2 = this.copydefault;
        if (c42705rbU2 == null || (appCompatImageView = c42705rbU2.AEQbTJ) == null) {
            return;
        }
        appCompatImageView.setImageResource(C52761wXj.TaskDescription.RcvFxC);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverDexFragment$handlePendingTabSelection$1(this, null), 3, null);
    }

    public final java.lang.Integer OLrzqt(java.lang.String str) {
        java.lang.Integer numValueOf;
        if (OLrzqt().gEmmrt().isEmpty()) {
            return null;
        }
        java.util.List<DiscoverDexPageVo> listGEmmrt = OLrzqt().gEmmrt();
        if (listGEmmrt.isEmpty()) {
            return null;
        }
        int i = 0;
        if (C59449zhJ.gEmmrt(str, "all", true)) {
            return 0;
        }
        int i2 = -1;
        if (C59449zhJ.gEmmrt(str, "boost", true)) {
            java.util.Iterator<DiscoverDexPageVo> it = listGEmmrt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().KWHzl().AhwBna()) {
                    i2 = i;
                    break;
                }
                i++;
            }
            numValueOf = java.lang.Integer.valueOf(i2);
            if (numValueOf.intValue() < 0) {
                return null;
            }
        } else {
            java.util.Iterator<DiscoverDexPageVo> it2 = listGEmmrt.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DiscoverDexPageVo next = it2.next();
                if (!next.EZpvd() && C59449zhJ.gEmmrt(next.KWHzl().copydefault(), str, true)) {
                    i2 = i;
                    break;
                }
                i++;
            }
            numValueOf = java.lang.Integer.valueOf(i2);
            if (numValueOf.intValue() < 0) {
                return null;
            }
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: o.qba$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qba.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.qba$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
            if (fragment != null && !(fragment instanceof MarketDiscoverMarketsFragment)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof MarketDiscoverMarketsFragment)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof MarketDiscoverMarketsFragment)) {
                    parentFragment = null;
                }
                fragment = (MarketDiscoverMarketsFragment) parentFragment;
            }
            if (!(fragment instanceof MarketDiscoverMarketsFragment)) {
                fragment = null;
            }
            MarketDiscoverMarketsFragment marketDiscoverMarketsFragment = (MarketDiscoverMarketsFragment) fragment;
            MarketDiscoverMarketsFragment marketDiscoverMarketsFragment2 = marketDiscoverMarketsFragment instanceof ViewModelStoreOwner ? marketDiscoverMarketsFragment : null;
            if (marketDiscoverMarketsFragment2 != null) {
                return marketDiscoverMarketsFragment2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + MarketDiscoverMarketsFragment.class.getSimpleName()).toString());
        }
    }
}
