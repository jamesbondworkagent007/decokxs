package o;

import android.view.View;
import androidx.fragment.app.FragmentResultListener;
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
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$onSetupMoreButton$1$1$2;
import com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$reloadIfError$1;
import com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$setListener$2;
import com.okinc.market.search.features.navigation.futures.model.NavSearchFuturesPageVo;
import com.okinc.market.search.features.navigation.futures.viewmodel.NavSearchFuturesGroupViewModel;
import com.okinc.market.search.misc.sp.NavSearchSP;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.InterfaceC54581xNr;
import o.qIU;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qLf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40151qLf extends AbstractC32996moC implements InterfaceC49363unD {
    public boolean AEQbTJ;
    public final TaskDescription EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C42755rcR OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42755rcR OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DQzvGN;
    }

    public C40151qLf() {
        final ActionBar actionBar = new ActionBar(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) actionBar.invoke();
            }
        });
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NavSearchFuturesGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$special$$inlined$parentViewModels$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qLh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40151qLf.KWHzl(this.AEQbTJ);
            }
        });
        this.EZpvd = new TaskDescription(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
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

    public NavSearchFuturesGroupViewModel AhwBna() {
        return (NavSearchFuturesGroupViewModel) this.copydefault.getValue();
    }

    public final qLD EZpvd() {
        return (qLD) this.KWHzl.getValue();
    }

    public static final qLD KWHzl(C40151qLf c40151qLf) {
        return new qLD(c40151qLf);
    }

    /* JADX INFO: renamed from: o.qLf$TaskDescription */
    public static final class TaskDescription extends AbstractC54575xNl {
        public TaskDescription(java.lang.String str) {
            super(str, "SWAP");
        }

        @Override // o.AbstractC54575xNl
        public void OLrzqt() {
            C40151qLf.this.KWHzl("trading_core_data_source_changed_for_new_coin");
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42755rcR c42755rcREZpvd = C42755rcR.EZpvd(view);
        Intrinsics.copydefault(c42755rcREZpvd);
        OLrzqt(c42755rcREZpvd);
        this.OLrzqt = c42755rcREZpvd;
    }

    public final void OLrzqt(C42755rcR c42755rcR) {
        c42755rcR.EZpvd.setAdapter(EZpvd());
        new TabLayoutMediator(c42755rcR.OLrzqt.copydefault(), c42755rcR.EZpvd, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C40151qLf.copydefault(this.OLrzqt, tab, i);
            }
        }).attach();
        C55254xgV c55254xgV = c42755rcR.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
        ViewPager2 viewPager2 = c42755rcR.EZpvd;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        KWHzl(c55254xgV, viewPager2);
    }

    public static final void copydefault(C40151qLf c40151qLf, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c40151qLf.EZpvd().copydefault(i));
    }

    public void KWHzl(@NotNull C55254xgV c55254xgV, @NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(c55254xgV, "");
        Intrinsics.checkNotNullParameter(viewPager2, "");
        C42758rcU c42758rcUKWHzl = C42758rcU.KWHzl(android.view.LayoutInflater.from(requireContext()), c55254xgV, false);
        c55254xgV.setOnClickListener(new Application(c55254xgV, 1000L, this, viewPager2));
        android.widget.TextView root = c42758rcUKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55254xgV.OLrzqt(root);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NavSearchFuturesGroupFragment$onSetupMoreButton$1$1$2(c42758rcUKWHzl, null), 3, null);
        c55254xgV.findViewById(C52761wXj.FragmentManager.hrjNmC).setBackgroundResource(qZH.Activity.AuCTel);
        c55254xgV.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY).setBackgroundResource(qZH.Activity.ejfBZ);
        c55254xgV.AEQbTJ(new StateListAnimator(c55254xgV));
    }

    /* JADX INFO: renamed from: o.qLf$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C55254xgV copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(C55254xgV c55254xgV) {
            this.copydefault = c55254xgV;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.Object objM7377constructorimpl;
            Unit unit;
            if (C40151qLf.this.isResumed()) {
                C40151qLf c40151qLf = C40151qLf.this;
                C55254xgV c55254xgV = this.copydefault;
                try {
                    Result.Application application = Result.Companion;
                    NavSearchFuturesPageVo navSearchFuturesPageVoAhwBna = c40151qLf.EZpvd().AhwBna(tab != null ? tab.getPosition() : 0);
                    if (navSearchFuturesPageVoAhwBna == null) {
                        return;
                    }
                    java.lang.String type = navSearchFuturesPageVoAhwBna.copydefault().gEmmrt().getType();
                    if (type.length() == 0) {
                        type = "All";
                    }
                    qPT qptKWHzl = qPU.KWHzl(c55254xgV);
                    if (qptKWHzl != null) {
                        qptKWHzl.EZpvd("FUTURES", type);
                    }
                    qPT qptKWHzl2 = qPU.KWHzl(c55254xgV);
                    if (qptKWHzl2 != null) {
                        qptKWHzl2.AYXKKw(type);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                C40151qLf c40151qLf2 = C40151qLf.this;
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C40375qTn.AEQbTJ.copydefault(c40151qLf2.getTAG(), "tab select error " + c40151qLf2.EZpvd().gEmmrt(), thM7380exceptionOrNullimpl);
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        collectLatestOnLifecycle(AhwBna(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.futures.NavSearchFuturesGroupFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((NavSearchFuturesGroupViewModel.Application) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((NavSearchFuturesGroupViewModel.Application) obj).AEQbTJ((InterfaceC49371unL) obj2);
            }
        }, Lifecycle.State.CREATED, new NavSearchFuturesGroupFragment$setListener$2(this));
        getChildFragmentManager().setFragmentResultListener("request_click_item", this, new FragmentResultListener() { // from class: o.qLm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C40151qLf.AEQbTJ(this.OLrzqt, str, bundle);
            }
        });
        C41654qur.EZpvd(this, new Function1() { // from class: o.qLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40151qLf.AEQbTJ(this.copydefault, (InterfaceC41649qum) obj);
            }
        });
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.EZpvd(this.EZpvd);
        }
        KWHzl("futures_biz_init");
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(C40151qLf c40151qLf, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        c40151qLf.EZpvd((InterfaceC49371unL<kotlin.Pair<java.lang.String, C41467qrP>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C40151qLf c40151qLf, java.lang.String str, android.os.Bundle bundle) {
        C42755rcR c42755rcR;
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TradeGroupData tradeGroupData = (TradeGroupData) bundle.getParcelable("data");
        if (tradeGroupData != null) {
            java.util.Iterator<NavSearchFuturesPageVo> it = c40151qLf.EZpvd().gEmmrt().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault().gEmmrt().getId(), (java.lang.Object) tradeGroupData.getId())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i <= 0 || (c42755rcR = c40151qLf.OLrzqt) == null || (viewPager2 = c42755rcR.EZpvd) == null) {
                return;
            }
            viewPager2.setCurrentItem(i);
        }
    }

    public static final Unit AEQbTJ(C40151qLf c40151qLf, InterfaceC41649qum interfaceC41649qum) {
        Intrinsics.checkNotNullParameter(interfaceC41649qum, "");
        C40375qTn.AEQbTJ.copydefault(c40151qLf.getTAG(), "listenQuotationDataSourceChanged " + interfaceC41649qum);
        c40151qLf.KWHzl("trading_core_data_source_changed");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qLf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C40151qLf AEQbTJ;
        public final /* synthetic */ ViewPager2 EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C40151qLf c40151qLf, ViewPager2 viewPager2) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c40151qLf;
            this.EZpvd = viewPager2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            CategoryGroupVo categoryGroupVoCopydefault;
            TradeGroupData tradeGroupDataGEmmrt;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                NavSearchFuturesPageVo navSearchFuturesPageVoAhwBna = this.AEQbTJ.EZpvd().AhwBna(this.EZpvd.getCurrentItem());
                if (navSearchFuturesPageVoAhwBna == null || (categoryGroupVoCopydefault = navSearchFuturesPageVoAhwBna.copydefault()) == null || (tradeGroupDataGEmmrt = categoryGroupVoCopydefault.gEmmrt()) == null) {
                    return;
                }
                qIU.StateListAnimator stateListAnimator = qIU.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                stateListAnimator.EZpvd(childFragmentManager, tradeGroupDataGEmmrt, "navigation_panel", java.lang.Boolean.TRUE);
            }
        }
    }

    private final void EZpvd(InterfaceC49371unL<kotlin.Pair<java.lang.String, C41467qrP>> interfaceC49371unL) {
        C40369qTh c40369qThEZpvd;
        C40369qTh c40369qThEZpvd2;
        C42755rcR c42755rcR;
        C40369qTh c40369qThEZpvd3;
        C40375qTn.AEQbTJ.copydefault(getTAG(), "update updateCategoryUiState: " + interfaceC49371unL);
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            if (!EZpvd().OLrzqt() || (c42755rcR = this.OLrzqt) == null || (c40369qThEZpvd3 = c42755rcR.getRoot()) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(c40369qThEZpvd3, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            java.util.List<CategoryGroupVo> listOLrzqt = ((C41467qrP) ((kotlin.Pair) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getSecond()).OLrzqt();
            if (!C33129mqd.KWHzl((java.util.Collection) listOLrzqt)) {
                listOLrzqt = null;
            }
            if (listOLrzqt == null) {
                EZpvd(new InterfaceC49371unL.Application(new java.lang.IllegalStateException("empty category group"), null, 2, null));
                return;
            }
            C42755rcR c42755rcR2 = this.OLrzqt;
            if (c42755rcR2 != null && (c40369qThEZpvd2 = c42755rcR2.getRoot()) != null) {
                c40369qThEZpvd2.values();
            }
            EZpvd().AEQbTJ(OLrzqt(listOLrzqt), new Function0() { // from class: o.qLj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40151qLf.AYXKKw(this.EZpvd);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (!(interfaceC49371unL instanceof InterfaceC49371unL.Application) || (((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ() instanceof CancellationException)) {
            return;
        }
        C42755rcR c42755rcR3 = this.OLrzqt;
        if (c42755rcR3 != null && (c40369qThEZpvd = c42755rcR3.getRoot()) != null) {
            c40369qThEZpvd.copydefault(getString(qZH.PendingIntent.DsL), getString(qZH.PendingIntent.djSkpj), getString(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.qLi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40151qLf.valueOf(this.AEQbTJ);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(C40151qLf c40151qLf) {
        c40151qLf.gEmmrt();
        c40151qLf.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C40151qLf c40151qLf) {
        c40151qLf.KWHzl("click_retry_button");
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C55254xgV c55254xgV;
        C42755rcR c42755rcR = this.OLrzqt;
        if (c42755rcR == null || (c55254xgV = c42755rcR.OLrzqt) == null) {
            return;
        }
        C41364qpS.copydefault(c55254xgV, java.lang.Integer.valueOf(EZpvd().AEQbTJ(CategoryGroupVo.Companion.AYXKKw())), (Function0<java.lang.Boolean>) new Function0() { // from class: o.qLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C40151qLf.KWHzl());
            }
        }, (Function1<? super java.lang.Boolean, Unit>) new Function1() { // from class: o.qLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40151qLf.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final boolean KWHzl() {
        return NavSearchSP.EZpvd.EZpvd();
    }

    public static final Unit AEQbTJ(boolean z) {
        NavSearchSP.EZpvd.KWHzl(z);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        qPP qppOLrzqt;
        kotlin.Pair<java.lang.String, java.lang.String> pairZLjUOn;
        C42755rcR c42755rcR;
        ViewPager2 viewPager2;
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        NavSearchSP.L2TabRecord l2TabRecordAEQbTJ = NavSearchSP.EZpvd.AEQbTJ();
        if (l2TabRecordAEQbTJ == null || (qppOLrzqt = qPM.OLrzqt(this)) == null || (pairZLjUOn = qppOLrzqt.zLjUOn()) == null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) l2TabRecordAEQbTJ.getInstId(), (java.lang.Object) pairZLjUOn.component1())) {
            java.util.Iterator<NavSearchFuturesPageVo> it = EZpvd().gEmmrt().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault().gEmmrt().getId(), (java.lang.Object) l2TabRecordAEQbTJ.getCategoryId())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0 || (c42755rcR = this.OLrzqt) == null || (viewPager2 = c42755rcR.EZpvd) == null) {
                return;
            }
            viewPager2.setCurrentItem(i, false);
        }
    }

    public NavSearchFuturesPageVo OLrzqt(@NotNull CategoryGroupVo categoryGroupVo) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        return new NavSearchFuturesPageVo(categoryGroupVo, null, 2, 0 == true ? 1 : 0);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        qPO qpoOLrzqt = qPQ.OLrzqt(this);
        if (qpoOLrzqt != null) {
            qpoOLrzqt.fIwbmz("FUTURES");
        }
        qPT qptCopydefault = qPU.copydefault(this);
        if (qptCopydefault != null) {
            qptCopydefault.AhwBna("FUTURES");
        }
        valueOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pair;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        qPP qppOLrzqt = qPM.OLrzqt(this);
        java.lang.String ccyType = null;
        if (qppOLrzqt == null || (pair = qppOLrzqt.zLjUOn()) == null) {
            pair = new kotlin.Pair<>(null, null);
        }
        java.lang.String strComponent1 = pair.component1();
        java.lang.String strComponent2 = pair.component2();
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("SWAP", "FUTURES")), strComponent2) && (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) != null) {
            Intrinsics.copydefault((java.lang.Object) strComponent2);
            BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strComponent2, strComponent1, null, null, 12, null);
            if (suggestedInstrument$default != null) {
                ccyType = suggestedInstrument$default.getCcyType();
            }
        }
        NavSearchFuturesGroupViewModel.loadData$default(AhwBna(), str, null, ccyType, 2, null);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NavSearchFuturesGroupFragment$reloadIfError$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        super.onDestroyView();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(this.EZpvd);
    }

    public java.util.List<NavSearchFuturesPageVo> OLrzqt(@NotNull java.util.List<CategoryGroupVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((CategoryGroupVo) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.qLf$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
