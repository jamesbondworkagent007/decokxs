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
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$onSetupMoreButton$1$1$2;
import com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$reloadIfError$1;
import com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$setListener$2;
import com.okinc.market.search.features.navigation.spot.model.NavSearchSpotPageVo;
import com.okinc.market.search.features.navigation.spot.viewmodel.NavSearchSpotGroupViewModel;
import com.okinc.market.search.misc.sp.NavSearchSP;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
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
import o.InterfaceC41641que;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.InterfaceC54581xNr;
import o.qIU;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qRn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40321qRn extends AbstractC40319qRl implements InterfaceC49363unD {
    public final InterfaceC56387yDm DbNXlk;
    public boolean fetchVPNInfo;
    public final InterfaceC56387yDm valueOf;
    public C42822rdf values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.RgLUBD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(android.content.Context context) {
        super.onAttach(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    public <T extends InterfaceC49369unJ<T>, A> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Continuation<? super A> continuation) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, continuation);
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

    public C40321qRn() {
        final StateListAnimator stateListAnimator = new StateListAnimator(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$special$$inlined$parentViewModels$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NavSearchSpotGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$special$$inlined$parentViewModels$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.qRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40321qRn.copydefault(this.KWHzl);
            }
        });
    }

    public NavSearchSpotGroupViewModel EZpvd() {
        return (NavSearchSpotGroupViewModel) this.DbNXlk.getValue();
    }

    public final qRL gEmmrt() {
        return (qRL) this.valueOf.getValue();
    }

    public static final qRL copydefault(C40321qRn c40321qRn) {
        return new qRL(c40321qRn);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42822rdf c42822rdfCopydefault = C42822rdf.copydefault(view);
        Intrinsics.copydefault(c42822rdfCopydefault);
        KWHzl(c42822rdfCopydefault);
        this.values = c42822rdfCopydefault;
    }

    public final void KWHzl(C42822rdf c42822rdf) {
        c42822rdf.KWHzl.setAdapter(gEmmrt());
        new TabLayoutMediator(c42822rdf.EZpvd.copydefault(), c42822rdf.KWHzl, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.qRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C40321qRn.AEQbTJ(this.EZpvd, tab, i);
            }
        }).attach();
        C55254xgV c55254xgV = c42822rdf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
        ViewPager2 viewPager2 = c42822rdf.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        OLrzqt(c55254xgV, viewPager2);
    }

    public static final void AEQbTJ(C40321qRn c40321qRn, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c40321qRn.gEmmrt().KWHzl(i));
    }

    public void OLrzqt(@NotNull C55254xgV c55254xgV, @NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(c55254xgV, "");
        Intrinsics.checkNotNullParameter(viewPager2, "");
        C42758rcU c42758rcUKWHzl = C42758rcU.KWHzl(android.view.LayoutInflater.from(requireContext()), c55254xgV, false);
        c55254xgV.setOnClickListener(new Application(c55254xgV, 1000L, this, viewPager2));
        android.widget.TextView root = c42758rcUKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55254xgV.OLrzqt(root);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NavSearchSpotGroupFragment$onSetupMoreButton$1$1$2(c42758rcUKWHzl, null), 3, null);
        c55254xgV.findViewById(C52761wXj.FragmentManager.hrjNmC).setBackgroundResource(qZH.Activity.AuCTel);
        c55254xgV.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY).setBackgroundResource(qZH.Activity.ejfBZ);
        c55254xgV.AEQbTJ(new Activity(c55254xgV));
    }

    /* JADX INFO: renamed from: o.qRn$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C55254xgV KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(C55254xgV c55254xgV) {
            this.KWHzl = c55254xgV;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.Object objM7377constructorimpl;
            java.lang.String type;
            Unit unit;
            if (C40321qRn.this.isResumed()) {
                C40321qRn c40321qRn = C40321qRn.this;
                C55254xgV c55254xgV = this.KWHzl;
                try {
                    Result.Application application = Result.Companion;
                    NavSearchSpotPageVo navSearchSpotPageVoAhwBna = c40321qRn.gEmmrt().AhwBna(tab != null ? tab.getPosition() : 0);
                    if (navSearchSpotPageVoAhwBna == null) {
                        return;
                    }
                    if (navSearchSpotPageVoAhwBna.KWHzl()) {
                        type = "HEAT";
                    } else {
                        type = navSearchSpotPageVoAhwBna.AEQbTJ().gEmmrt().getType();
                        if (type.length() == 0) {
                            type = "All";
                        }
                    }
                    qPT qptKWHzl = qPU.KWHzl(c55254xgV);
                    if (qptKWHzl != null) {
                        qptKWHzl.EZpvd("SPOT", type);
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
                C40321qRn c40321qRn2 = C40321qRn.this;
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C40375qTn.AEQbTJ.copydefault(c40321qRn2.getTAG(), "tab select error " + c40321qRn2.gEmmrt().gEmmrt(), thM7380exceptionOrNullimpl);
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        collectLatestOnLifecycle(EZpvd(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.spot.NavSearchSpotGroupFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((NavSearchSpotGroupViewModel.Application) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((NavSearchSpotGroupViewModel.Application) obj).KWHzl((InterfaceC49371unL<? extends Quartet<String, ? extends List<? extends InterfaceC41641que>, ? extends List<CategoryGroupVo>, ? extends List<ChargeGroupVo>>>) obj2);
            }
        }, Lifecycle.State.CREATED, new NavSearchSpotGroupFragment$setListener$2(this));
        getChildFragmentManager().setFragmentResultListener("request_click_item", this, new FragmentResultListener() { // from class: o.qRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C40321qRn.EZpvd(this.AEQbTJ, str, bundle);
            }
        });
        AEQbTJ("spot_biz_init");
    }

    public static final /* synthetic */ java.lang.Object AEQbTJ(C40321qRn c40321qRn, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        c40321qRn.AEQbTJ((InterfaceC49371unL<? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C40321qRn c40321qRn, java.lang.String str, android.os.Bundle bundle) {
        C42822rdf c42822rdf;
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TradeGroupData tradeGroupData = (TradeGroupData) bundle.getParcelable("data");
        if (tradeGroupData != null) {
            java.util.Iterator<NavSearchSpotPageVo> it = c40321qRn.gEmmrt().gEmmrt().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ().gEmmrt().getId(), (java.lang.Object) tradeGroupData.getId())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i <= 0 || (c42822rdf = c40321qRn.values) == null || (viewPager2 = c42822rdf.KWHzl) == null) {
                return;
            }
            viewPager2.setCurrentItem(i);
        }
    }

    private final void AEQbTJ(InterfaceC49371unL<? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>> interfaceC49371unL) {
        C40369qTh root;
        C40369qTh root2;
        C42822rdf c42822rdf;
        C40369qTh root3;
        C40375qTn.AEQbTJ.copydefault(getTag(), "update updateCategoryUiState: " + interfaceC49371unL);
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            if (!gEmmrt().copydefault() || (c42822rdf = this.values) == null || (root3 = c42822rdf.getRoot()) == null) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(root3, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            java.lang.Object third = ((Quartet) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getThird();
            if (!C33129mqd.KWHzl((java.util.Collection) third)) {
                third = null;
            }
            java.util.List list = (java.util.List) third;
            if (list == null) {
                AEQbTJ(new InterfaceC49371unL.Application(new java.lang.IllegalStateException("empty category group"), null, 2, null));
                return;
            }
            C42822rdf c42822rdf2 = this.values;
            if (c42822rdf2 != null && (root2 = c42822rdf2.getRoot()) != null) {
                root2.values();
            }
            qRL qrlGEmmrt = gEmmrt();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(KWHzl((CategoryGroupVo) it.next()));
            }
            qrlGEmmrt.copydefault(arrayList, new Function0() { // from class: o.qRu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40321qRn.AhwBna(this.EZpvd);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (!(interfaceC49371unL instanceof InterfaceC49371unL.Application) || (((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ() instanceof CancellationException)) {
            return;
        }
        C42822rdf c42822rdf3 = this.values;
        if (c42822rdf3 != null && (root = c42822rdf3.getRoot()) != null) {
            root.copydefault(getString(qZH.PendingIntent.DsL), getString(qZH.PendingIntent.djSkpj), getString(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.qRw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40321qRn.AYXKKw(this.AEQbTJ);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.qRn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C40321qRn KWHzl;
        public final /* synthetic */ ViewPager2 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C40321qRn c40321qRn, ViewPager2 viewPager2) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c40321qRn;
            this.OLrzqt = viewPager2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            CategoryGroupVo categoryGroupVoAEQbTJ;
            TradeGroupData tradeGroupDataGEmmrt;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                NavSearchSpotPageVo navSearchSpotPageVoAhwBna = this.KWHzl.gEmmrt().AhwBna(this.OLrzqt.getCurrentItem());
                if (navSearchSpotPageVoAhwBna == null || (categoryGroupVoAEQbTJ = navSearchSpotPageVoAhwBna.AEQbTJ()) == null || (tradeGroupDataGEmmrt = categoryGroupVoAEQbTJ.gEmmrt()) == null) {
                    return;
                }
                qIU.StateListAnimator stateListAnimator = qIU.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                qIU.StateListAnimator.show$default(stateListAnimator, childFragmentManager, tradeGroupDataGEmmrt, "navigation_panel", null, 8, null);
            }
        }
    }

    public static final Unit AhwBna(C40321qRn c40321qRn) {
        c40321qRn.KWHzl();
        c40321qRn.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C40321qRn c40321qRn) {
        c40321qRn.AEQbTJ("click_retry_button");
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        C55254xgV c55254xgV;
        C42822rdf c42822rdf = this.values;
        if (c42822rdf == null || (c55254xgV = c42822rdf.EZpvd) == null) {
            return;
        }
        C41364qpS.copydefault(c55254xgV, java.lang.Integer.valueOf(gEmmrt().OLrzqt(CategoryGroupVo.Companion.AYXKKw())), (Function0<java.lang.Boolean>) new Function0() { // from class: o.qRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C40321qRn.DbNXlk());
            }
        }, (Function1<? super java.lang.Boolean, Unit>) new Function1() { // from class: o.qRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40321qRn.KWHzl(((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DbNXlk() {
        return NavSearchSP.EZpvd.KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(boolean z) {
        NavSearchSP.EZpvd.copydefault(z);
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        qPP qppOLrzqt;
        kotlin.Pair<java.lang.String, java.lang.String> pairZLjUOn;
        C42822rdf c42822rdf;
        ViewPager2 viewPager2;
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        NavSearchSP.L2TabRecord l2TabRecordOLrzqt = NavSearchSP.EZpvd.OLrzqt();
        if (l2TabRecordOLrzqt == null || (qppOLrzqt = qPM.OLrzqt(this)) == null || (pairZLjUOn = qppOLrzqt.zLjUOn()) == null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) l2TabRecordOLrzqt.getInstId(), (java.lang.Object) pairZLjUOn.component1())) {
            java.util.Iterator<NavSearchSpotPageVo> it = gEmmrt().gEmmrt().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().AEQbTJ().gEmmrt().getId(), (java.lang.Object) l2TabRecordOLrzqt.getCategoryId())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0 || (c42822rdf = this.values) == null || (viewPager2 = c42822rdf.KWHzl) == null) {
                return;
            }
            viewPager2.setCurrentItem(i, false);
        }
    }

    public NavSearchSpotPageVo KWHzl(@NotNull CategoryGroupVo categoryGroupVo) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        return new NavSearchSpotPageVo(categoryGroupVo, null, null, 6, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        qPO qpoOLrzqt = qPQ.OLrzqt(this);
        if (qpoOLrzqt != null) {
            qpoOLrzqt.fIwbmz("SPOT");
        }
        qPT qptCopydefault = qPU.copydefault(this);
        if (qptCopydefault != null) {
            qptCopydefault.AhwBna("SPOT");
        }
        AEQbTJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pair;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        qPP qppOLrzqt = qPM.OLrzqt(this);
        java.lang.String quoteSymbol = null;
        if (qppOLrzqt == null || (pair = qppOLrzqt.zLjUOn()) == null) {
            pair = new kotlin.Pair<>(null, null);
        }
        java.lang.String strComponent1 = pair.component1();
        java.lang.String strComponent2 = pair.component2();
        if (Intrinsics.EZpvd((java.lang.Object) strComponent2, (java.lang.Object) "SPOT") && (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strComponent2, strComponent1, null, null, 12, null)) != null) {
            quoteSymbol = suggestedInstrument$default.getQuoteSymbol();
        }
        NavSearchSpotGroupViewModel.loadData$default(EZpvd(), str, null, quoteSymbol, 2, null);
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NavSearchSpotGroupFragment$reloadIfError$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.qRn$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.copydefault;
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
