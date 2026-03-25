package com.okinc.business.market.features.favorites.editing.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.market.features.favorites.editing.domain.group.ValidateMarketFavoritesGroupNameUseCase;
import com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet;
import com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.edit.OKEditText;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC49411unz;
import o.C33129mqd;
import o.C33606mzd;
import o.C41353qpH;
import o.C41431qqg;
import o.C42649raR;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC49363unD;
import o.InterfaceC49369unJ;
import o.InterfaceC49371unL;
import o.InterfaceC56387yDm;
import o.InterfaceC56560yJx;
import o.jSA;
import o.jTS;
import o.jTW;
import o.pUU;
import o.qZH;
import o.rVN;
import o.wXQ;
import o.yCM;
import o.yDV;
import o.yEE;
import o.yHO;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesEditGroupNameBottomSheet extends jTW implements InterfaceC49363unD {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm djBIcL;
    public C42649raR gEmmrt;

    @yCM
    public ValidateMarketFavoritesGroupNameUseCase validateGroupNameUseCase;
    public final InterfaceC56387yDm valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.values().length];
            try {
                iArr[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.INVALID_CHARACTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.INVALID_LENGTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.DUPLICATE_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.INVALID_SPACE_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult.INVALID_EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
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

    public MarketFavoritesEditGroupNameBottomSheet() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketFavoritesGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavoritesEditGroupNameBottomSheet.valueOf(this.OLrzqt);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketFavoritesEditGroupNameBottomSheet.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void show$default(StateListAnimator stateListAnimator, FragmentManager fragmentManager, String str, List list, FavoriteCrypotsInfo favoriteCrypotsInfo, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                favoriteCrypotsInfo = null;
            }
            stateListAnimator.KWHzl(fragmentManager, str, (List<String>) list, favoriteCrypotsInfo);
        }

        public final void KWHzl(@NotNull FragmentManager fragmentManager, final String str, @NotNull final List<String> list, final FavoriteCrypotsInfo favoriteCrypotsInfo) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            pUU.EZpvd("MarketFavoritesEditGroupNameBottomSheet", "show oldGroupName: " + str + ", existingGroupNames: " + list);
            ((MarketFavoritesEditGroupNameBottomSheet) jSA.copydefault(new MarketFavoritesEditGroupNameBottomSheet(), new Function1() { // from class: o.jUc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketFavoritesEditGroupNameBottomSheet.StateListAnimator.OLrzqt(str, list, favoriteCrypotsInfo, (android.os.Bundle) obj);
                }
            })).show(fragmentManager);
        }

        public static final Unit OLrzqt(String str, List list, FavoriteCrypotsInfo favoriteCrypotsInfo, Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            bundle.putString("groupId", str);
            bundle.putStringArray("list", (String[]) list.toArray(new String[0]));
            bundle.putParcelable("data", favoriteCrypotsInfo);
            return Unit.INSTANCE;
        }
    }

    private final MarketFavoritesGroupViewModel gEmmrt() {
        return (MarketFavoritesGroupViewModel) this.djBIcL.getValue();
    }

    public final String AYXKKw() {
        return (String) this.valueOf.getValue();
    }

    public static final String valueOf(MarketFavoritesEditGroupNameBottomSheet marketFavoritesEditGroupNameBottomSheet) {
        return marketFavoritesEditGroupNameBottomSheet.requireArguments().getString("groupId");
    }

    /* JADX DEBUG: Possible override for method o.jTW.OLrzqt()V */
    public final Set<String> OLrzqt() {
        return (Set) this.AYXKKw.getValue();
    }

    public static final Set EZpvd(MarketFavoritesEditGroupNameBottomSheet marketFavoritesEditGroupNameBottomSheet) {
        Set setQOLQEE;
        String[] stringArray = marketFavoritesEditGroupNameBottomSheet.requireArguments().getStringArray("list");
        return (stringArray == null || (setQOLQEE = yDV.QOLQEE(stringArray)) == null) ? yEE.copydefault() : setQOLQEE;
    }

    public final ValidateMarketFavoritesGroupNameUseCase AhwBna() {
        ValidateMarketFavoritesGroupNameUseCase validateMarketFavoritesGroupNameUseCase = this.validateGroupNameUseCase;
        if (validateMarketFavoritesGroupNameUseCase != null) {
            return validateMarketFavoritesGroupNameUseCase;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C42649raR c42649raREZpvd = C42649raR.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        c42649raREZpvd.OLrzqt.setShowSoftInputOnFocus(true);
        OKEditText oKEditText = c42649raREZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        C33606mzd.AEQbTJ(oKEditText, new Function1() { // from class: o.jUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketFavoritesEditGroupNameBottomSheet.KWHzl(this.copydefault, c42649raREZpvd, (java.lang.CharSequence) obj);
            }
        });
        String strAYXKKw = AYXKKw();
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            c42649raREZpvd.KWHzl.setText(qZH.PendingIntent.DcMfJKgMxgjU);
            c42649raREZpvd.copydefault.setText(qZH.PendingIntent.fbC);
            C52794wYp c52794wYp = c42649raREZpvd.copydefault;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        } else {
            c42649raREZpvd.OLrzqt.setText(AYXKKw());
            OKEditText oKEditText2 = c42649raREZpvd.OLrzqt;
            Editable text = oKEditText2.getText();
            oKEditText2.setSelection(text != null ? text.length() : 0);
            c42649raREZpvd.KWHzl.setText(qZH.PendingIntent.DcMfJKffREWX);
            c42649raREZpvd.copydefault.setText(qZH.PendingIntent.ejfBZ);
            C52794wYp c52794wYp2 = c42649raREZpvd.copydefault;
            c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
        }
        this.gEmmrt = c42649raREZpvd;
        isConnected();
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    public static final Unit KWHzl(MarketFavoritesEditGroupNameBottomSheet marketFavoritesEditGroupNameBottomSheet, C42649raR c42649raR, CharSequence charSequence) {
        Intrinsics.copydefault(c42649raR);
        marketFavoritesEditGroupNameBottomSheet.AEQbTJ(c42649raR, String.valueOf(charSequence));
        return Unit.INSTANCE;
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(21);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        OKEditText oKEditText;
        super.onResume();
        C42649raR c42649raR = this.gEmmrt;
        if (c42649raR == null || (oKEditText = c42649raR.OLrzqt) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C41431qqg.EZpvd(oKEditText, contextRequireContext);
    }

    private final void isConnected() {
        collectLatestOnLifecycle(gEmmrt(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet$observeUiStates$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, Lifecycle.State.CREATED, new MarketFavoritesEditGroupNameBottomSheet$observeUiStates$2(this));
    }

    public static final /* synthetic */ Object OLrzqt(MarketFavoritesEditGroupNameBottomSheet marketFavoritesEditGroupNameBottomSheet, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        marketFavoritesEditGroupNameBottomSheet.EZpvd((InterfaceC49371unL<String>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public final void EZpvd(InterfaceC49371unL<String> interfaceC49371unL) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            setCancelable(false);
            C42649raR c42649raR = this.gEmmrt;
            if (c42649raR == null || (c52794wYp4 = c42649raR.copydefault) == null) {
                return;
            }
            c52794wYp4.OLrzqt(0L);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            pUU.copydefault(getTag(), "updateEditGroupNameUiState error: " + application.AEQbTJ());
            setCancelable(true);
            C42649raR c42649raR2 = this.gEmmrt;
            if (c42649raR2 != null && (c52794wYp3 = c42649raR2.copydefault) != null) {
                c52794wYp3.fIwbmz();
            }
            C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            pUU.EZpvd(getTag(), "updateEditGroupNameUiState success: " + activity.copydefault());
            setCancelable(true);
            C42649raR c42649raR3 = this.gEmmrt;
            if (c42649raR3 != null && (c52794wYp2 = c42649raR3.copydefault) != null) {
                c52794wYp2.fIwbmz();
            }
            String name = MarketFavoritesEditGroupNameBottomSheet.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            Bundle bundle = new Bundle();
            bundle.putString("groupId", AYXKKw());
            bundle.putString(OtpEventTracker.OTP_EVENT_VALUE_NEW, (String) activity.copydefault());
            Unit unit = Unit.INSTANCE;
            FragmentKt.setFragmentResult(this, name, bundle);
            dismissAllowingStateLoss();
            Bundle arguments = getArguments();
            FavoriteCrypotsInfo favoriteCrypotsInfo = arguments != null ? (FavoriteCrypotsInfo) arguments.getParcelable("data") : null;
            FavoriteCrypotsInfo favoriteCrypotsInfo2 = favoriteCrypotsInfo instanceof FavoriteCrypotsInfo ? favoriteCrypotsInfo : null;
            if (favoriteCrypotsInfo2 != null) {
                jTS.StateListAnimator stateListAnimator = jTS.Companion;
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                stateListAnimator.copydefault(parentFragmentManager, favoriteCrypotsInfo2.getCurrentGroupName(), favoriteCrypotsInfo2.getCryptoList(), favoriteCrypotsInfo2.getPageType());
                return;
            }
            return;
        }
        setCancelable(true);
        C42649raR c42649raR4 = this.gEmmrt;
        if (c42649raR4 == null || (c52794wYp = c42649raR4.copydefault) == null) {
            return;
        }
        c52794wYp.fIwbmz();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ MarketFavoritesEditGroupNameBottomSheet OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, MarketFavoritesEditGroupNameBottomSheet marketFavoritesEditGroupNameBottomSheet) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = marketFavoritesEditGroupNameBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.valueOf();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ MarketFavoritesEditGroupNameBottomSheet OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, MarketFavoritesEditGroupNameBottomSheet marketFavoritesEditGroupNameBottomSheet) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = marketFavoritesEditGroupNameBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.djBIcL();
            }
        }
    }

    public final boolean AEQbTJ(C42649raR c42649raR, String str) {
        if (C33129mqd.OLrzqt((CharSequence) AYXKKw()) && Intrinsics.EZpvd((Object) str, (Object) AYXKKw())) {
            c42649raR.copydefault.setEnabled(false);
            TextView textView = c42649raR.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            c42649raR.AEQbTJ.setText((CharSequence) null);
            return false;
        }
        switch (TaskDescription.OLrzqt[((ValidateMarketFavoritesGroupNameUseCase.GroupNameValidationResult) AhwBna().KWHzl((Object) C56390yDp.OLrzqt(str, OLrzqt()))).ordinal()]) {
            case 1:
                c42649raR.copydefault.setEnabled(true);
                TextView textView2 = c42649raR.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                c42649raR.AEQbTJ.setText((CharSequence) null);
                return true;
            case 2:
                c42649raR.copydefault.setEnabled(true);
                TextView textView3 = c42649raR.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(0);
                c42649raR.AEQbTJ.setText(qZH.PendingIntent.DcMfJKfNLfdT);
                return false;
            case 3:
                c42649raR.copydefault.setEnabled(true);
                TextView textView4 = c42649raR.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                c42649raR.AEQbTJ.setText(qZH.PendingIntent.Hx);
                return false;
            case 4:
                c42649raR.copydefault.setEnabled(true);
                TextView textView5 = c42649raR.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(0);
                c42649raR.AEQbTJ.setText(qZH.PendingIntent.DcMfJKfNUfqk);
                return false;
            case 5:
                c42649raR.copydefault.setEnabled(true);
                TextView textView6 = c42649raR.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                textView6.setVisibility(0);
                c42649raR.AEQbTJ.setText(qZH.PendingIntent.DcMfJKfbSiEC);
                return false;
            case 6:
                c42649raR.copydefault.setEnabled(false);
                TextView textView7 = c42649raR.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView7, "");
                textView7.setVisibility(8);
                c42649raR.AEQbTJ.setText((CharSequence) null);
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void djBIcL() {
        String string;
        OKEditText oKEditText;
        Editable text;
        C42649raR c42649raR = this.gEmmrt;
        if (c42649raR == null || (oKEditText = c42649raR.OLrzqt) == null || (text = oKEditText.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        C42649raR c42649raR2 = this.gEmmrt;
        if (c42649raR2 == null || !AEQbTJ(c42649raR2, string)) {
            return;
        }
        pUU.EZpvd(getTag(), "requestCreateNewGroup groupName: " + string);
        gEmmrt().AEQbTJ(string);
    }

    public final void valueOf() {
        String string;
        OKEditText oKEditText;
        Editable text;
        String strAYXKKw = AYXKKw();
        if (strAYXKKw == null) {
            return;
        }
        C42649raR c42649raR = this.gEmmrt;
        if (c42649raR == null || (oKEditText = c42649raR.OLrzqt) == null || (text = oKEditText.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        C42649raR c42649raR2 = this.gEmmrt;
        if (c42649raR2 == null || !AEQbTJ(c42649raR2, string)) {
            return;
        }
        pUU.EZpvd(getTag(), "requestModifyGroupName oldGroupName: " + strAYXKKw + ", newGroupName: " + string);
        gEmmrt().EZpvd(strAYXKKw, string);
    }
}
