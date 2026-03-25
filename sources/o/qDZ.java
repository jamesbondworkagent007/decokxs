package o;

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
import com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$onAsyncViewCreated$1;
import com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$setupListeners$2;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.okinc.market.search.features.main.root.ui.viewmodel.MainSearchViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.SortedMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C40078qIn;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class qDZ extends AbstractC39958qEb implements InterfaceC49363unD, InterfaceC39957qEa {
    public boolean AYXKKw;
    public C42748rcK AhwBna;
    public TabLayoutMediator djBIcL;
    public final int gEmmrt = qZH.ActionBar.RvdRAu;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
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

    public qDZ() {
        final Activity activity = new Activity(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) activity.invoke();
            }
        });
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MainSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$special$$inlined$parentViewModels$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.qEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qDZ.KWHzl(this.copydefault);
            }
        });
    }

    private final MainSearchViewModel gEmmrt() {
        return (MainSearchViewModel) this.isConnected.getValue();
    }

    public static final qEZ KWHzl(qDZ qdz) {
        return new qEZ(qdz);
    }

    /* JADX DEBUG: Possible override for method o.qEb.EZpvd()V */
    public final qEZ EZpvd() {
        return (qEZ) this.valueOf.getValue();
    }

    @Override // o.AbstractC33042mow
    public void AEQbTJ(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.AEQbTJ(view, bundle);
        if (isAdded()) {
            EZpvd(view);
        } else {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new SearchResultRootFragment$onAsyncViewCreated$1(this, view, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(android.view.View view) {
        C42748rcK c42748rcKKWHzl = C42748rcK.KWHzl(view);
        c42748rcKKWHzl.OLrzqt.setAdapter(EZpvd());
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c42748rcKKWHzl.copydefault.copydefault(), c42748rcKKWHzl.OLrzqt, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                qDZ.AEQbTJ(this.copydefault, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.djBIcL = tabLayoutMediator;
        this.AhwBna = c42748rcKKWHzl;
        djBIcL();
        qHN qhnCopydefault = qHO.copydefault(this);
        if (qhnCopydefault != null) {
            qhnCopydefault.KWHzl("ANY");
            qhnCopydefault.isConnected();
        }
        C46688tbr.registerTradeFragmentTrack$default(C46688tbr.KWHzl, this, "SearchResultRootFragment", new kotlin.Pair[0], null, 4, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(qDZ qdz, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(qdz.EZpvd().AEQbTJ(i));
        tab.setContentDescription(qdz.EZpvd().copydefault(i));
    }

    private final void djBIcL() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, gEmmrt(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.main.result.ui.SearchResultRootFragment$setupListeners$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MainSearchViewModel.StateListAnimator) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MainSearchViewModel.StateListAnimator) obj).OLrzqt((C40078qIn) obj2);
            }
        }, null, new SearchResultRootFragment$setupListeners$2(this, null), 2, null);
        AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(C40078qIn c40078qIn) {
        SubPage subPageOLrzqt;
        ViewPager2 viewPager2;
        java.util.List<C39993qFj> listCopydefault;
        java.util.List<C39992qFi> listOLrzqt;
        C40001qFr c40001qFrDjBIcL;
        C39998qFo c39998qFoEZpvd;
        java.util.List<C40006qFw> listIsConnected;
        java.util.List<C39995qFl> listAEQbTJ;
        java.util.List<C39996qFm> listValueOf;
        java.util.List<C39999qFp> listAYXKKw;
        SortedMap<java.lang.Long, java.util.List<C40005qFv>> sortedMapDbNXlk;
        java.util.List<C39994qFk> listAhwBna;
        java.util.List<C39994qFk> listAkhnZx;
        boolean z = c40078qIn == null || c40078qIn.fIwbmz();
        this.AYXKKw = z;
        if (z) {
            java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : fragments) {
                if (obj instanceof AbstractC40007qFx) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC40007qFx) it.next()).AEQbTJ();
            }
            C40375qTn.AEQbTJ.copydefault(getTAG(), "setup view pager with empty data, " + c40078qIn);
            return;
        }
        java.util.List<? extends SubPage> listAhwBna2 = yDY.AhwBna(SubPage.ALL);
        SubPage subPageAhwBna = null;
        if (c40078qIn != null && (listAkhnZx = c40078qIn.AkhnZx()) != null) {
            if (!(!listAkhnZx.isEmpty())) {
                listAkhnZx = null;
            }
            if (listAkhnZx != null) {
                listAhwBna2.add(SubPage.SPOT);
            }
        }
        if (c40078qIn != null && (listAhwBna = c40078qIn.AhwBna()) != null) {
            if (!(!listAhwBna.isEmpty())) {
                listAhwBna = null;
            }
            if (listAhwBna != null) {
                listAhwBna2.add(SubPage.FUTURES);
            }
        }
        if (c40078qIn != null && (sortedMapDbNXlk = c40078qIn.DbNXlk()) != null) {
            if (!(!sortedMapDbNXlk.isEmpty())) {
                sortedMapDbNXlk = null;
            }
            if (sortedMapDbNXlk != null) {
                listAhwBna2.add(SubPage.OPTIONS);
            }
        }
        if (c40078qIn != null && (listAYXKKw = c40078qIn.AYXKKw()) != null) {
            if (!(!listAYXKKw.isEmpty())) {
                listAYXKKw = null;
            }
            if (listAYXKKw != null) {
                listAhwBna2.add(SubPage.DEFI_WEB3);
            }
        }
        if (c40078qIn != null && (listValueOf = c40078qIn.valueOf()) != null) {
            if (!(!listValueOf.isEmpty())) {
                listValueOf = null;
            }
            if (listValueOf != null) {
                listAhwBna2.add(SubPage.EARN);
            }
        }
        if (c40078qIn != null && (listAEQbTJ = c40078qIn.AEQbTJ()) != null) {
            if (!(!listAEQbTJ.isEmpty())) {
                listAEQbTJ = null;
            }
            if (listAEQbTJ != null) {
                listAhwBna2.add(SubPage.BOTS);
            }
        }
        if (c40078qIn != null && (listIsConnected = c40078qIn.isConnected()) != null) {
            if (!(!listIsConnected.isEmpty())) {
                listIsConnected = null;
            }
            if (listIsConnected != null) {
                listAhwBna2.add(SubPage.TRADER);
            }
        }
        boolean z2 = (c40078qIn == null || (c39998qFoEZpvd = c40078qIn.EZpvd()) == null || !c39998qFoEZpvd.AhwBna() || c40078qIn.EZpvd().KWHzl().getQueryInfo() == null) ? false : true;
        boolean z3 = (c40078qIn == null || (c40001qFrDjBIcL = c40078qIn.djBIcL()) == null || !c40001qFrDjBIcL.AEQbTJ()) ? false : true;
        if (z2 || z3) {
            listAhwBna2.add(SubPage.CONTENT);
        }
        if (c40078qIn != null && (listOLrzqt = c40078qIn.OLrzqt()) != null) {
            if (!(!listOLrzqt.isEmpty())) {
                listOLrzqt = null;
            }
            if (listOLrzqt != null) {
                listAhwBna2.add(SubPage.CAMPAIGN);
            }
        }
        if (c40078qIn != null && (listCopydefault = c40078qIn.copydefault()) != null) {
            if (!(!listCopydefault.isEmpty())) {
                listCopydefault = null;
            }
            if (listCopydefault != null) {
                listAhwBna2.add(SubPage.ANNOUNCEMENT);
            }
        }
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault(getTAG(), "setup view pager with [pages " + listAhwBna2 + ", resultVo: " + c40078qIn + "]");
        boolean z4 = EZpvd().getItemCount() == 0;
        qHP qhpAEQbTJ = qHQ.AEQbTJ(this);
        if (qhpAEQbTJ != null && qhpAEQbTJ.EZpvd(this)) {
            subPageOLrzqt = SubPage.TRADER;
        } else {
            qHP qhpAEQbTJ2 = qHQ.AEQbTJ(this);
            if (qhpAEQbTJ2 == null || (subPageOLrzqt = qhpAEQbTJ2.OLrzqt(this)) == null) {
                subPageOLrzqt = (SubPage) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna2);
            }
        }
        if (z4) {
            EZpvd().EZpvd(listAhwBna2);
            if (subPageOLrzqt != null) {
                copydefault(subPageOLrzqt, false);
            }
        } else {
            C42748rcK c42748rcK = this.AhwBna;
            if (c42748rcK != null && (viewPager2 = c42748rcK.OLrzqt) != null) {
                subPageAhwBna = EZpvd().AhwBna(viewPager2.getCurrentItem());
            }
            EZpvd().EZpvd(listAhwBna2);
            if (subPageAhwBna != null) {
                if (listAhwBna2.contains(subPageAhwBna)) {
                    copydefault(subPageAhwBna, false);
                } else if (subPageOLrzqt != null && listAhwBna2.contains(subPageOLrzqt)) {
                    copydefault(subPageOLrzqt, false);
                }
            }
        }
        c40375qTn.copydefault(getTAG(), "setup view pager with pages done");
    }

    @Override // o.InterfaceC39957qEa
    public void copydefault(@NotNull SubPage subPage, boolean z) {
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(subPage, "");
        C40375qTn.AEQbTJ.copydefault(getTAG(), "nav to page " + subPage);
        C42748rcK c42748rcK = this.AhwBna;
        if (c42748rcK == null || (viewPager2 = c42748rcK.OLrzqt) == null) {
            return;
        }
        viewPager2.setCurrentItem(EZpvd().AEQbTJ(subPage), z);
    }

    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            java.lang.String trackSubType;
            C40375qTn.AEQbTJ.copydefault(qDZ.this.getTAG(), "on page selected " + i);
            qHN qhnCopydefault = qHO.copydefault(qDZ.this);
            if (qhnCopydefault != null) {
                qDZ qdz = qDZ.this;
                SubPage subPageAhwBna = qdz.EZpvd().AhwBna(i);
                qHP qhpAEQbTJ = qHQ.AEQbTJ(qdz);
                if (qhpAEQbTJ != null) {
                    qhpAEQbTJ.copydefault(subPageAhwBna);
                }
                if (subPageAhwBna == null || (trackSubType = subPageAhwBna.getTrackSubType()) == null) {
                    return;
                }
                qhnCopydefault.KWHzl(trackSubType);
                if (qdz.AYXKKw) {
                    return;
                }
                qhnCopydefault.AEQbTJ(i);
            }
        }
    }

    public final void AYXKKw() {
        ViewPager2 viewPager2;
        C42748rcK c42748rcK = this.AhwBna;
        if (c42748rcK == null || (viewPager2 = c42748rcK.OLrzqt) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new ActionBar());
    }

    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
            if (fragment != null && !(fragment instanceof qGU)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof qGU)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof qGU)) {
                    parentFragment = null;
                }
                fragment = (qGU) parentFragment;
            }
            if (!(fragment instanceof qGU)) {
                fragment = null;
            }
            qGU qgu = (qGU) fragment;
            qGU qgu2 = qgu instanceof ViewModelStoreOwner ? qgu : null;
            if (qgu2 != null) {
                return qgu2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + qGU.class.getSimpleName()).toString());
        }
    }
}
