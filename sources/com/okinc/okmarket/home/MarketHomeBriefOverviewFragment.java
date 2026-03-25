package com.okinc.okmarket.home;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo;
import com.okinc.find_ui.features.opportunity.overall.ui.viewmodel.MarketOverallStatsViewModel;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import com.okinc.okmarket.home.MarketHomeBriefOverviewFragment;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC46622tae;
import o.AbstractC49411unz;
import o.AbstractC58185ywX;
import o.ActivityC41011qik;
import o.C33054mpH;
import o.C33129mqd;
import o.C33608mzf;
import o.C34896nlB;
import o.C41348qpC;
import o.C42788rcy;
import o.C46593taB;
import o.C55071xcy;
import o.C55296xhK;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C58156yvv;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49369unJ;
import o.InterfaceC49371unL;
import o.InterfaceC56387yDm;
import o.InterfaceC56560yJx;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC8218ayb;
import o.pUU;
import o.qZH;
import o.rVN;
import o.sZQ;
import o.yCM;
import o.yHO;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketHomeBriefOverviewFragment extends AbstractC46622tae implements InterfaceC49363unD {
    public C42788rcy AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public InterfaceC58217yxC DbNXlk;

    @yCM
    public InterfaceC8218ayb currencyRepo;
    public boolean djBIcL;
    public final /* synthetic */ C46593taB gEmmrt = new C46593taB();
    public final ViewTreeObserver.OnPreDrawListener valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.gwwfep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf() {
        this.gEmmrt.OLrzqt();
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>> Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B> Flow<Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    public MarketHomeBriefOverviewFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketOverallStatsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = new ViewTreeObserver.OnPreDrawListener() { // from class: o.taj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return MarketHomeBriefOverviewFragment.KWHzl(this.copydefault);
            }
        };
    }

    public final MarketOverallStatsViewModel djBIcL() {
        return (MarketOverallStatsViewModel) this.AhwBna.getValue();
    }

    public final InterfaceC8218ayb AYXKKw() {
        InterfaceC8218ayb interfaceC8218ayb = this.currencyRepo;
        if (interfaceC8218ayb != null) {
            return interfaceC8218ayb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final boolean KWHzl(MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment) {
        marketHomeBriefOverviewFragment.EZpvd();
        return true;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = C42788rcy.EZpvd(view);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment.initView.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketOverallStatsViewModel.StateListAnimator) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketOverallStatsViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL<C34896nlB>) obj2);
            }
        }, null, new AnonymousClass2(null), 2, null);
        gEmmrt();
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$initView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C34896nlB>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = MarketHomeBriefOverviewFragment.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C34896nlB> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C34896nlB>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C34896nlB> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                MarketHomeBriefOverviewFragment.this.AEQbTJ((InterfaceC49371unL<C34896nlB>) interfaceC49371unL);
                MarketHomeBriefOverviewFragment.this.EZpvd(interfaceC49371unL);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$setListener$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C17421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17421(Continuation<? super C17421> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketHomeBriefOverviewFragment.this.new C17421(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okmarket.home.MarketHomeBriefOverviewFragment$setListener$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05851 extends SuspendLambda implements Function2<ValuationCurrency, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MarketHomeBriefOverviewFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05851(MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment, Continuation<? super C05851> continuation) {
                super(2, continuation);
                this.this$0 = marketHomeBriefOverviewFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05851(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ValuationCurrency valuationCurrency, Continuation<? super Unit> continuation) {
                return ((C05851) create(valuationCurrency, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (this.this$0.isResumed()) {
                        pUU.KWHzl(this.this$0.getTAG(), "currency changed, reload data");
                        this.this$0.djBIcL().KWHzl();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<ValuationCurrency> stateFlowOLrzqt = MarketHomeBriefOverviewFragment.this.AYXKKw().OLrzqt();
                C05851 c05851 = new C05851(MarketHomeBriefOverviewFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowOLrzqt, c05851, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C17421(null), 3, null);
    }

    public final void gEmmrt() {
        C33608mzf c33608mzf;
        C33608mzf c33608mzf2;
        C33608mzf c33608mzf3;
        C33608mzf c33608mzf4;
        C42788rcy c42788rcy = this.AYXKKw;
        if (c42788rcy != null && (c33608mzf4 = c42788rcy.AhwBna) != null) {
            c33608mzf4.setOnClickListener(new Application(c33608mzf4, 1000L, this));
        }
        C42788rcy c42788rcy2 = this.AYXKKw;
        if (c42788rcy2 != null && (c33608mzf3 = c42788rcy2.djBIcL) != null) {
            c33608mzf3.setOnClickListener(new TaskDescription(c33608mzf3, 1000L, this));
        }
        C42788rcy c42788rcy3 = this.AYXKKw;
        if (c42788rcy3 != null && (c33608mzf2 = c42788rcy3.gEmmrt) != null) {
            c33608mzf2.setOnClickListener(new Activity(c33608mzf2, 1000L, this));
        }
        C42788rcy c42788rcy4 = this.AYXKKw;
        if (c42788rcy4 == null || (c33608mzf = c42788rcy4.EZpvd) == null) {
            return;
        }
        c33608mzf.setOnClickListener(new ActionBar(c33608mzf, 1000L, this));
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        ViewTreeObserver viewTreeObserver;
        InterfaceC58217yxC interfaceC58217yxC = this.DbNXlk;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.djBIcL = false;
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnPreDrawListener(this.valueOf);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        ViewTreeObserver viewTreeObserver;
        rVN.copydefault(this);
        djBIcL().KWHzl();
        InterfaceC58217yxC interfaceC58217yxC = this.DbNXlk;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_home_page_refresh");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.tak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketHomeBriefOverviewFragment.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.DbNXlk = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.tal
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketHomeBriefOverviewFragment.copydefault(function1, obj);
            }
        });
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(this.valueOf);
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment, String str) {
        marketHomeBriefOverviewFragment.djBIcL().KWHzl();
        return Unit.INSTANCE;
    }

    public final void EZpvd(InterfaceC49371unL<C34896nlB> interfaceC49371unL) {
        C42788rcy c42788rcy;
        TextView textView;
        ArrayList arrayList;
        TextView textView2;
        C42788rcy c42788rcy2;
        TextView textView3;
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            List<MarketDiscoverOverviewTradeCalendarVo> listOLrzqt = ((C34896nlB) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).OLrzqt();
            if (listOLrzqt != null) {
                arrayList = new ArrayList();
                for (Object obj : listOLrzqt) {
                    if (Intrinsics.EZpvd((Object) ((MarketDiscoverOverviewTradeCalendarVo) obj).OLrzqt(), (Object) "economic")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                C42788rcy c42788rcy3 = this.AYXKKw;
                if (c42788rcy3 == null || (textView2 = c42788rcy3.valueOf) == null) {
                    return;
                }
                textView2.setText("--");
                return;
            }
            MarketDiscoverOverviewTradeCalendarVo marketDiscoverOverviewTradeCalendarVo = (MarketDiscoverOverviewTradeCalendarVo) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0);
            if (marketDiscoverOverviewTradeCalendarVo == null || marketDiscoverOverviewTradeCalendarVo.AEQbTJ() == null || (c42788rcy2 = this.AYXKKw) == null || (textView3 = c42788rcy2.valueOf) == null) {
                return;
            }
            textView3.setText(marketDiscoverOverviewTradeCalendarVo.AEQbTJ().EZpvd());
            return;
        }
        if (!(interfaceC49371unL instanceof InterfaceC49371unL.Application) || (c42788rcy = this.AYXKKw) == null || (textView = c42788rcy.valueOf) == null) {
            return;
        }
        textView.setText("--");
    }

    public static final void OLrzqt(MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment, C34896nlB c34896nlB) {
        MarketOverallStatsVo marketOverallStatsVoAEQbTJ;
        ConstraintLayout root;
        if (c34896nlB == null || (marketOverallStatsVoAEQbTJ = c34896nlB.copydefault()) == null) {
            C42788rcy c42788rcy = marketHomeBriefOverviewFragment.AYXKKw;
            Object tag = (c42788rcy == null || (root = c42788rcy.getRoot()) == null) ? null : root.getTag();
            marketOverallStatsVoAEQbTJ = tag instanceof MarketOverallStatsVo ? (MarketOverallStatsVo) tag : null;
            if (marketOverallStatsVoAEQbTJ == null) {
                marketOverallStatsVoAEQbTJ = MarketOverallStatsVo.Companion.AEQbTJ();
            }
        }
        C42788rcy c42788rcy2 = marketHomeBriefOverviewFragment.AYXKKw;
        if (c42788rcy2 != null) {
            c42788rcy2.DbNXlk.setText(marketOverallStatsVoAEQbTJ.KWHzl());
            c42788rcy2.fetchVPNInfo.setText(marketOverallStatsVoAEQbTJ.OLrzqt());
            C55071xcy c55071xcy = c42788rcy2.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
            C41348qpC.copydefault(c55071xcy, marketOverallStatsVoAEQbTJ.copydefault());
            c42788rcy2.fJNWhG.setText(marketOverallStatsVoAEQbTJ.gEmmrt());
            c42788rcy2.ejfBZ.setText(marketOverallStatsVoAEQbTJ.valueOf());
            C55071xcy c55071xcy2 = c42788rcy2.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55071xcy2, "");
            C41348qpC.copydefault(c55071xcy2, marketOverallStatsVoAEQbTJ.djBIcL());
            c42788rcy2.AuCTel.setText(marketOverallStatsVoAEQbTJ.AYXKKw());
            c42788rcy2.AkhnZx.setText(marketOverallStatsVoAEQbTJ.AEQbTJ());
            AppCompatImageView appCompatImageView = c42788rcy2.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C33054mpH.AEQbTJ(appCompatImageView, marketOverallStatsVoAEQbTJ.EZpvd());
            c42788rcy2.getRoot().setTag(marketOverallStatsVoAEQbTJ);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ MarketHomeBriefOverviewFragment KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = marketHomeBriefOverviewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Context context = this.KWHzl.getContext();
                if (context != null) {
                    ActivityC41011qik.Companion.OLrzqt(context);
                    this.KWHzl.AEQbTJ("calendar");
                }
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ MarketHomeBriefOverviewFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = marketHomeBriefOverviewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Context context = this.copydefault.getContext();
                if (context != null) {
                    sZQ.EZpvd.copydefault(context, "dominance");
                    this.copydefault.AEQbTJ("dominance");
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ MarketHomeBriefOverviewFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = marketHomeBriefOverviewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Context context = this.copydefault.getContext();
                if (context != null) {
                    sZQ.EZpvd.copydefault(context, "turnover");
                    this.copydefault.AEQbTJ("volume");
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ MarketHomeBriefOverviewFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, MarketHomeBriefOverviewFragment marketHomeBriefOverviewFragment) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = marketHomeBriefOverviewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Context context = this.copydefault.getContext();
                if (context != null) {
                    sZQ.EZpvd.copydefault(context, "marketCap");
                    this.copydefault.AEQbTJ("marketcap");
                }
            }
        }
    }

    public final void AEQbTJ(InterfaceC49371unL<C34896nlB> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            OLrzqt(this, (C34896nlB) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
            rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
            return;
        }
        OLrzqt(this, (C34896nlB) null);
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            rVN.reportFullyDrawn$default((Fragment) this, false, (String) null, 2, (Object) null);
        } else if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
        }
    }

    public final void EZpvd() {
        View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (!view.getGlobalVisibleRect(new Rect())) {
                this.djBIcL = false;
            } else {
                if (!C33129mqd.copydefault(Float.valueOf(r1.height() / view.getHeight()), Float.valueOf(0.5f)) || this.djBIcL) {
                    return;
                }
                this.djBIcL = true;
                valueOf();
            }
        }
    }
}
