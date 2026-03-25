package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$onAsyncViewCreated$1;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$setupListeners$2;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchSubPage;
import com.okinc.market.search.features.favorite.ui.adapter.FavoriteSearchPageResult;
import com.okinc.market.search.features.favorite.ui.viewmodel.FavoriteSearchViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import java.util.SortedMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C40078qIn;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41836qyN extends AbstractC41839qyQ implements InterfaceC49363unD {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public final int AhwBna = qZH.ActionBar.DGUQLIekVPG;
    public C42774rck EZpvd;
    public C41848qyZ KWHzl;
    public boolean copydefault;
    public java.lang.String gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
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

    public C41836qyN() {
        final StateListAnimator stateListAnimator = new StateListAnimator(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$special$$inlined$parentViewModels$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FavoriteSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$special$$inlined$parentViewModels$5
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
    }

    private final FavoriteSearchViewModel KWHzl() {
        return (FavoriteSearchViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: o.qyN$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qyN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC33042mow
    public void AEQbTJ(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.AEQbTJ(view, bundle);
        if (isAdded()) {
            KWHzl(view);
        } else {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new FavoriteSearchResultRootFragment$onAsyncViewCreated$1(this, view, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(android.view.View view) {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.KWHzl = new C41848qyZ(childFragmentManager);
        C42774rck c42774rckOLrzqt = C42774rck.OLrzqt(view);
        c42774rckOLrzqt.AEQbTJ.setAdapter(this.KWHzl);
        c42774rckOLrzqt.copydefault.setupWithViewPager(c42774rckOLrzqt.AEQbTJ);
        this.EZpvd = c42774rckOLrzqt;
        valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void valueOf() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, KWHzl(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchResultRootFragment$setupListeners$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FavoriteSearchViewModel.StateListAnimator) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FavoriteSearchViewModel.StateListAnimator) obj).AEQbTJ((Triple<C40078qIn, ? extends Map<String, TickersData>, ? extends Map<String, ? extends Map<String, ? extends BizInstrument>>>) obj2);
            }
        }, null, new FavoriteSearchResultRootFragment$setupListeners$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(C40078qIn c40078qIn) {
        java.lang.String first;
        boolean zFIwbmz = c40078qIn.fIwbmz();
        this.copydefault = zFIwbmz;
        if (zFIwbmz) {
            this.gEmmrt = c40078qIn.gEmmrt();
            java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : fragments) {
                if (obj instanceof AbstractC41852qyd) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC41852qyd) it.next()).EZpvd();
            }
            C40375qTn.AEQbTJ.copydefault(getTAG(), "setup view pager with empty data");
            return;
        }
        java.lang.String strGEmmrt = c40078qIn.gEmmrt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<C39994qFk> listKWHzl = c40078qIn.KWHzl();
        if (listKWHzl != null) {
            if (!(!listKWHzl.isEmpty())) {
                listKWHzl = null;
            }
            if (listKWHzl != null) {
                arrayList2.add(new FavoriteSearchPageResult(strGEmmrt, listKWHzl.size(), FavoriteSearchSubPage.COIN));
            }
        }
        java.util.List<C39994qFk> listAkhnZx = c40078qIn.AkhnZx();
        if (listAkhnZx != null) {
            if (!(!listAkhnZx.isEmpty())) {
                listAkhnZx = null;
            }
            if (listAkhnZx != null) {
                arrayList2.add(new FavoriteSearchPageResult(strGEmmrt, listAkhnZx.size(), FavoriteSearchSubPage.SPOT));
            }
        }
        java.util.List<C39994qFk> listAhwBna = c40078qIn.AhwBna();
        if (listAhwBna != null) {
            if (!(!listAhwBna.isEmpty())) {
                listAhwBna = null;
            }
            if (listAhwBna != null) {
                arrayList2.add(new FavoriteSearchPageResult(strGEmmrt, listAhwBna.size(), FavoriteSearchSubPage.FUTURES));
            }
        }
        Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>> tripleFetchVPNInfo = c40078qIn.fetchVPNInfo();
        if (tripleFetchVPNInfo != null && ((first = tripleFetchVPNInfo.getFirst()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) first) || C33129mqd.KWHzl((java.util.Collection) tripleFetchVPNInfo.getThird()))) {
            java.util.List<InterfaceC41655qus> third = tripleFetchVPNInfo.getThird();
            arrayList2.add(new FavoriteSearchPageResult(strGEmmrt, third != null ? third.size() : 0, FavoriteSearchSubPage.DEX));
        }
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMapDbNXlk = c40078qIn.DbNXlk();
        if (sortedMapDbNXlk != null) {
            SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMap = sortedMapDbNXlk.isEmpty() ^ true ? sortedMapDbNXlk : null;
            if (sortedMap != null) {
                arrayList2.add(new FavoriteSearchPageResult(strGEmmrt, sortedMap.size(), FavoriteSearchSubPage.OPTIONS));
            }
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C41848qyZ c41848qyZ = new C41848qyZ(childFragmentManager);
        this.KWHzl = c41848qyZ;
        c41848qyZ.OLrzqt(arrayList2);
        C42774rck c42774rck = this.EZpvd;
        if (c42774rck != null) {
            c42774rck.AEQbTJ.setAdapter(this.KWHzl);
            c42774rck.copydefault.setupWithViewPager(c42774rck.AEQbTJ);
            c42774rck.AEQbTJ.setOffscreenPageLimit(arrayList2.size());
            c42774rck.AEQbTJ.setCurrentItem(copydefault(arrayList2), false);
        }
        C40375qTn.AEQbTJ.copydefault(getTAG(), "setup view pager with pages " + arrayList2.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [165=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(java.util.List<FavoriteSearchPageResult> list) {
        java.lang.String groupName;
        FragmentActivity activity = getActivity();
        int i = 0;
        if (activity == null) {
            return 0;
        }
        android.content.Intent intent = activity.getIntent();
        UserGroupEditJumpData userGroupEditJumpData = intent != null ? (UserGroupEditJumpData) intent.getParcelableExtra("WATCH_LIST_TYPE") : null;
        if (userGroupEditJumpData == null || (groupName = userGroupEditJumpData.getGroupName()) == null) {
            groupName = "";
        }
        switch (groupName.hashCode()) {
            case -531492226:
                if (groupName.equals("OPTIONS")) {
                    java.util.Iterator<FavoriteSearchPageResult> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) it.next().getPage().getTrackSubType(), (java.lang.Object) "OPTION")) {
                            return i;
                        }
                        i++;
                    }
                    return -1;
                }
                return (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1) && Intrinsics.EZpvd((java.lang.Object) ((FavoriteSearchPageResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getPage().getTrackSubType(), (java.lang.Object) "COIN")) ? 1 : 0;
            case 67575:
                if (groupName.equals("DEX")) {
                    java.util.Iterator<FavoriteSearchPageResult> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) it2.next().getPage().getTrackSubType(), (java.lang.Object) "CEDEFI")) {
                            return i;
                        }
                        i++;
                    }
                    return -1;
                }
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1)) {
                    return 0;
                }
            case 2552066:
                if (groupName.equals("SPOT")) {
                    java.util.Iterator<FavoriteSearchPageResult> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) it3.next().getPage().getTrackSubType(), (java.lang.Object) "SPOT")) {
                            return i;
                        }
                        i++;
                    }
                    return -1;
                }
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1)) {
                }
                break;
            case 214415088:
                if (groupName.equals("FUTURES")) {
                    java.util.Iterator<FavoriteSearchPageResult> it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) it4.next().getPage().getTrackSubType(), (java.lang.Object) "SWAP")) {
                            return i;
                        }
                        i++;
                    }
                    return -1;
                }
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1)) {
                }
                break;
            case 1996612801:
                if (groupName.equals("CRYPTO")) {
                    java.util.Iterator<FavoriteSearchPageResult> it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) it5.next().getPage().getTrackSubType(), (java.lang.Object) "COIN")) {
                            return i;
                        }
                        i++;
                    }
                    return -1;
                }
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1)) {
                }
                break;
            default:
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 1)) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.qyN$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
            if (fragment != null && !(fragment instanceof C41860qyl)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C41860qyl)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C41860qyl)) {
                    parentFragment = null;
                }
                fragment = (C41860qyl) parentFragment;
            }
            if (!(fragment instanceof C41860qyl)) {
                fragment = null;
            }
            C41860qyl c41860qyl = (C41860qyl) fragment;
            C41860qyl c41860qyl2 = c41860qyl instanceof ViewModelStoreOwner ? c41860qyl : null;
            if (c41860qyl2 != null) {
                return c41860qyl2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C41860qyl.class.getSimpleName()).toString());
        }
    }
}
