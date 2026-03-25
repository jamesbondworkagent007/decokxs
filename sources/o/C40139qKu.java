package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$reloadIfError$1;
import com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$setListener$3;
import com.okinc.market.search.features.navigation.favorites.viewmodel.NavFavoritesGroupViewModel;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40139qKu extends AbstractC40133qKo implements InterfaceC49363unD {
    public final InterfaceC56387yDm AhwBna;
    public C42761rcX gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.Th;
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

    public C40139qKu() {
        final Application application = new Application(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) application.invoke();
            }
        });
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NavFavoritesGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$special$$inlined$parentViewModels$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.qKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40139qKu.AEQbTJ(this.copydefault);
            }
        });
    }

    public final NavFavoritesGroupViewModel djBIcL() {
        return (NavFavoritesGroupViewModel) this.valueOf.getValue();
    }

    /* JADX DEBUG: Possible override for method o.qKo.AEQbTJ()V */
    public final qKK AEQbTJ() {
        return (qKK) this.AhwBna.getValue();
    }

    public static final qKK AEQbTJ(C40139qKu c40139qKu) {
        return new qKK(c40139qKu);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42761rcX c42761rcXOLrzqt = C42761rcX.OLrzqt(view);
        c42761rcXOLrzqt.getRoot().setContentExcludeViews(c42761rcXOLrzqt.EZpvd);
        Intrinsics.copydefault(c42761rcXOLrzqt);
        KWHzl(c42761rcXOLrzqt);
        this.gEmmrt = c42761rcXOLrzqt;
    }

    public final void KWHzl(C42761rcX c42761rcX) {
        c42761rcX.copydefault.setAdapter(AEQbTJ());
        new TabLayoutMediator(c42761rcX.AEQbTJ.copydefault(), c42761rcX.copydefault, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C40139qKu.KWHzl(this.OLrzqt, tab, i);
            }
        }).attach();
        C55254xgV c55254xgV = c42761rcX.AEQbTJ;
        c55254xgV.AEQbTJ(new TaskDescription(c55254xgV, c42761rcX));
        c55254xgV.findViewById(C52761wXj.FragmentManager.hrjNmC).setBackgroundResource(qZH.Activity.AuCTel);
        c55254xgV.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY).setBackgroundResource(qZH.Activity.ejfBZ);
    }

    public static final void KWHzl(C40139qKu c40139qKu, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c40139qKu.AEQbTJ().KWHzl(i));
    }

    /* JADX INFO: renamed from: o.qKu$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C42761rcX KWHzl;
        public final /* synthetic */ C55254xgV OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription(C55254xgV c55254xgV, C42761rcX c42761rcX) {
            this.OLrzqt = c55254xgV;
            this.KWHzl = c42761rcX;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strEZpvd;
            if (C40139qKu.this.isResumed()) {
                C55254xgV c55254xgV = this.OLrzqt;
                Intrinsics.copydefault(c55254xgV);
                qPT qptKWHzl = qPU.KWHzl(c55254xgV);
                if (qptKWHzl != null) {
                    qptKWHzl.getFieldNames();
                }
                C55254xgV c55254xgV2 = this.OLrzqt;
                Intrinsics.copydefault(c55254xgV2);
                qPT qptKWHzl2 = qPU.KWHzl(c55254xgV2);
                if (qptKWHzl2 != null) {
                    C40369qTh root = this.KWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    qKU qkuAEQbTJ = C40139qKu.this.AEQbTJ().AEQbTJ(tab != null ? tab.getPosition() : 0);
                    if (qkuAEQbTJ == null || (strEZpvd = qkuAEQbTJ.EZpvd()) == null) {
                        strEZpvd = "ANY";
                    }
                    qptKWHzl2.copydefault(root, strEZpvd);
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        collectLatestOnLifecycle(djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((NavFavoritesGroupViewModel.Application) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((NavFavoritesGroupViewModel.Application) obj).OLrzqt((InterfaceC49371unL<? extends Pair<? extends List<UserGroup>, ? extends List<UserGroup>>>) obj2);
            }
        }, new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesGroupFragment$setListener$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((NavFavoritesGroupViewModel.Application) obj).OLrzqt());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((NavFavoritesGroupViewModel.Application) obj).AEQbTJ(((Boolean) obj2).booleanValue());
            }
        }, Lifecycle.State.CREATED, new NavSearchFavoritesGroupFragment$setListener$3(this));
        OLrzqt("favorites_biz_init");
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(C40139qKu c40139qKu, InterfaceC49371unL interfaceC49371unL, boolean z, Continuation continuation) {
        c40139qKu.copydefault(interfaceC49371unL, z);
        return Unit.INSTANCE;
    }

    public final void copydefault(InterfaceC49371unL<? extends kotlin.Pair<? extends java.util.List<UserGroup>, ? extends java.util.List<UserGroup>>> interfaceC49371unL, boolean z) {
        C40369qTh root;
        C55254xgV c55254xgV;
        C40369qTh root2;
        C42761rcX c42761rcX;
        C40369qTh root3;
        C40369qTh root4;
        C40375qTn.AEQbTJ.copydefault(getTAG(), "update updateCategoryUiState: [uiState: " + interfaceC49371unL + ", isHideCryptoGroup: " + z + "]");
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            kotlin.Pair pair = (kotlin.Pair) ((InterfaceC49371unL.TaskDescription) interfaceC49371unL).AEQbTJ();
            java.util.List list = pair != null ? (java.util.List) pair.getFirst() : null;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapCopydefault = C40380qTs.KWHzl.copydefault();
            java.lang.String value = djBIcL().EZpvd().getValue();
            boolean z2 = mapCopydefault == null || mapCopydefault.size() == 0;
            if ((list == null || list.isEmpty()) && ((value == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value)) && z2)) {
                OLrzqt(true);
            } else {
                OLrzqt(false);
                C42761rcX c42761rcX2 = this.gEmmrt;
                if (c42761rcX2 != null && (root4 = c42761rcX2.getRoot()) != null) {
                    qXK.StateListAnimator.showEmptyState$default(root4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (Function0) null, 31, (java.lang.Object) null);
                }
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            OLrzqt(false);
            if (!AEQbTJ().EZpvd() || (c42761rcX = this.gEmmrt) == null || (root3 = c42761rcX.getRoot()) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(root3, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            OLrzqt(false);
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            kotlin.Pair pair2 = (kotlin.Pair) activity.copydefault();
            java.util.List<UserGroup> list2 = (java.util.List) pair2.component1();
            if (((java.util.List) pair2.component2()).isEmpty()) {
                copydefault(new InterfaceC49371unL.Application(new java.lang.IllegalStateException("empty category group"), null, 2, null), z);
                return;
            }
            if (list2.isEmpty()) {
                copydefault(new InterfaceC49371unL.TaskDescription(activity.copydefault()), z);
                return;
            }
            java.util.List<qKU> listKWHzl = qKU.Companion.KWHzl(list2, z);
            C42761rcX c42761rcX3 = this.gEmmrt;
            if (c42761rcX3 != null && (root2 = c42761rcX3.getRoot()) != null) {
                root2.values();
            }
            C42761rcX c42761rcX4 = this.gEmmrt;
            if (c42761rcX4 != null && (c55254xgV = c42761rcX4.AEQbTJ) != null) {
                c55254xgV.setVisibility(listKWHzl.size() <= 1 ? 8 : 0);
            }
            AEQbTJ().AEQbTJ(listKWHzl);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            OLrzqt(false);
            if (((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ() instanceof CancellationException) {
                return;
            }
            C42761rcX c42761rcX5 = this.gEmmrt;
            if (c42761rcX5 != null && (root = c42761rcX5.getRoot()) != null) {
                root.copydefault(getString(qZH.PendingIntent.DsL), getString(qZH.PendingIntent.djSkpj), getString(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.qKs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C40139qKu.AhwBna(this.AEQbTJ);
                    }
                });
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AhwBna(C40139qKu c40139qKu) {
        c40139qKu.OLrzqt("click_retry_button");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        gEmmrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        djBIcL().KWHzl(str);
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NavSearchFavoritesGroupFragment$reloadIfError$1(this, null), 3, null);
    }

    private final void OLrzqt(boolean z) {
        android.widget.FrameLayout frameLayout;
        if (isAdded()) {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(C27831kEy.class.getSimpleName());
            if (z) {
                if (fragmentFindFragmentByTag == null) {
                    getChildFragmentManager().beginTransaction().replace(qZH.StateListAnimator.zLAIeZ, jSA.EZpvd(new C27831kEy(), C56390yDp.OLrzqt("isNestedScrollingEnabled", java.lang.Boolean.FALSE), C56390yDp.OLrzqt("from_page", getTAG())), C27831kEy.class.getSimpleName()).commitNowAllowingStateLoss();
                }
            } else if (fragmentFindFragmentByTag != null) {
                getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
            }
            C42761rcX c42761rcX = this.gEmmrt;
            if (c42761rcX == null || (frameLayout = c42761rcX.EZpvd) == null) {
                return;
            }
            frameLayout.setVisibility(z ? 0 : 8);
        }
    }

    public final void valueOf() {
        C41387qpp c41387qpp;
        C55254xgV c55254xgV;
        C40369qTh root;
        C42761rcX c42761rcX = this.gEmmrt;
        if (c42761rcX != null && (root = c42761rcX.getRoot()) != null) {
            root.values();
        }
        C42761rcX c42761rcX2 = this.gEmmrt;
        if (c42761rcX2 != null && (c55254xgV = c42761rcX2.AEQbTJ) != null) {
            c55254xgV.setVisibility(8);
        }
        C42761rcX c42761rcX3 = this.gEmmrt;
        if (c42761rcX3 == null || (c41387qpp = c42761rcX3.OLrzqt) == null) {
            return;
        }
        c41387qpp.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.qKu$Application */
    public static final class Application implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
            java.lang.Object obj = fragment;
            if (fragment != null) {
                boolean z = fragment instanceof qOD;
                obj = fragment;
                if (!z) {
                    androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof qOD)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    boolean z2 = parentFragment instanceof qOD;
                    java.lang.Object obj2 = parentFragment;
                    if (!z2) {
                        obj2 = null;
                    }
                    obj = (qOD) obj2;
                }
            }
            boolean z3 = obj instanceof qOD;
            java.lang.Object obj3 = obj;
            if (!z3) {
                obj3 = null;
            }
            qOD qod = (qOD) obj3;
            ViewModelStoreOwner viewModelStoreOwner = qod instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) qod : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + qOD.class.getSimpleName()).toString());
        }
    }
}
