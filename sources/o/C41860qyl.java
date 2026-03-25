package o;

import android.text.TextUtils;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenConfirmState$1;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenInput$1$1;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenSearchResult$1;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenWatchingOptMsg$1;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$onHandleWatching$1;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$setListener$$inlined$repeatOnLifecycleResume$1;
import com.okinc.market.search.features.favorite.ui.viewmodel.FavoriteSearchViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.edit.OKEditText;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC58185ywX;
import o.C40375qTn;
import o.C41860qyl;
import o.C55688xof;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.jSB;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qyl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41860qyl extends AbstractC41833qyK implements InterfaceC49363unD, InterfaceC41923qzv {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public C42772rci AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final int copydefault = qZH.ActionBar.fBE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public <T extends InterfaceC49369unJ<T>, A> Flow<A> EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx);
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

    public C41860qyl() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FavoriteSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qyn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41860qyl.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.qyl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qyl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C41860qyl AEQbTJ(@NotNull java.lang.String str, UserGroupEditJumpData userGroupEditJumpData) {
            Intrinsics.checkNotNullParameter(str, "");
            C41860qyl c41860qyl = new C41860qyl();
            c41860qyl.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("from", str), C56390yDp.OLrzqt("WATCH_LIST_TYPE", userGroupEditJumpData)));
            return c41860qyl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoriteSearchViewModel DbNXlk() {
        return (FavoriteSearchViewModel) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Possible override for method o.qyK.OLrzqt()V */
    public final UserGroupEditJumpData OLrzqt() {
        return (UserGroupEditJumpData) this.OLrzqt.getValue();
    }

    public static final UserGroupEditJumpData copydefault(C41860qyl c41860qyl) {
        UserGroupEditJumpData userGroupEditJumpData;
        android.os.Bundle arguments = c41860qyl.getArguments();
        if (arguments == null || (userGroupEditJumpData = (UserGroupEditJumpData) arguments.getParcelable("WATCH_LIST_TYPE")) == null) {
            return null;
        }
        return userGroupEditJumpData.isPreset() ? new UserGroupEditJumpData("ALL", C33070mpX.AYXKKw(C55688xof.Application.sbu), userGroupEditJumpData.getScene(), true) : userGroupEditJumpData;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42772rci c42772rciKWHzl = C42772rci.KWHzl(view);
        C55230xfy c55230xfy = c42772rciKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        EZpvd(c55230xfy);
        this.AEQbTJ = c42772rciKWHzl;
        C52794wYp c52794wYp = c42772rciKWHzl.AEQbTJ;
        if (c52794wYp != null) {
            AEQbTJ(c52794wYp);
        }
        jSA.OLrzqt(this, true);
    }

    public final void AEQbTJ(C52794wYp c52794wYp) {
        c52794wYp.setEnabled(false);
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.qyl$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button_type", "add_crypto", false, 4, null);
        }
    }

    public final void EZpvd(C55230xfy c55230xfy) {
        OKEditText oKEditTextKWHzl = c55230xfy.KWHzl();
        oKEditTextKWHzl.setInputType(1);
        oKEditTextKWHzl.setImeOptions(3);
        oKEditTextKWHzl.setSingleLine(true);
        oKEditTextKWHzl.setEllipsize(TextUtils.TruncateAt.END);
        oKEditTextKWHzl.setImeActionLabel(C33070mpX.AYXKKw(qZH.PendingIntent.zuBGHE), 3);
        oKEditTextKWHzl.setContentDescription("discoverTopSearchBar");
        oKEditTextKWHzl.setHint(C33070mpX.AYXKKw(qZH.PendingIntent.hfdhUn));
        c55230xfy.setClearCallback(new Function0() { // from class: o.qyo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41860qyl.KWHzl();
            }
        });
        oKEditTextKWHzl.requestFocus();
        android.widget.TextView textViewCopydefault = c55230xfy.copydefault();
        C40375qTn.AEQbTJ.copydefault(getTAG(), "cancel clicked");
        textViewCopydefault.setText(qZH.PendingIntent.QVAiDq);
        textViewCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.qyu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41860qyl.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C41860qyl c41860qyl, android.view.View view) {
        C32866mlf.onEvent$default("Favorites_search_page_click", (TrackChannel[]) null, new Function1() { // from class: o.qym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41860qyl.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c41860qyl.requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        AhwBna();
        gEmmrt();
        valueOf();
        AYXKKw();
        AEQbTJ();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FavoriteSearchFragment$setListener$$inlined$repeatOnLifecycleResume$1(this, Lifecycle.State.RESUMED, null, this), 3, null);
    }

    public final void AhwBna() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C42772rci c42772rci = this.AEQbTJ;
        if (c42772rci == null || (c55230xfy = c42772rci.AhwBna) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        C41396qpy.onTextChanged$default(oKEditTextKWHzl, LifecycleOwnerKt.getLifecycleScope(this), 0L, false, new Function1() { // from class: o.qys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41860qyl.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        }, 6, null);
    }

    public static final Unit EZpvd(C41860qyl c41860qyl, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C40375qTn.AEQbTJ.copydefault(c41860qyl.getTAG(), "search keyword -> " + str);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c41860qyl), null, null, new FavoriteSearchFragment$listenInput$1$1(c41860qyl, str, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new FavoriteSearchFragment$listenSearchResult$1(this, null));
    }

    /* JADX INFO: renamed from: o.qyl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C41860qyl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C41860qyl c41860qyl) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c41860qyl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Favorites_search_page_click", (TrackChannel[]) null, Application.copydefault, 1, (java.lang.Object) null);
                this.OLrzqt.DbNXlk().AEQbTJ(this.OLrzqt.OLrzqt());
            }
        }
    }

    public final void AEQbTJ() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new FavoriteSearchFragment$listenConfirmState$1(this, null));
    }

    public final void valueOf() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new FavoriteSearchFragment$listenWatchingOptMsg$1(this, null));
    }

    public final void AEQbTJ(InterfaceC49371unL<Unit> interfaceC49371unL) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        C55113xdn c55113xdn4;
        C40375qTn.AEQbTJ.copydefault(getTAG(), "switchContent -> " + interfaceC49371unL);
        if (!(interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator)) {
            if (!(interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
                boolean z = interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription;
                if (!z && !(interfaceC49371unL instanceof InterfaceC49371unL.Application)) {
                    if (!(interfaceC49371unL instanceof InterfaceC49371unL.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C42772rci c42772rci = this.AEQbTJ;
                    if (c42772rci != null && (c55113xdn2 = c42772rci.EZpvd) != null) {
                        c55113xdn2.setVisibility(8);
                    }
                    androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    fragmentTransactionBeginTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    androidx.fragment.app.Fragment fragmentGEmmrt = gEmmrt(this);
                    if (!(fragmentGEmmrt instanceof C41836qyN)) {
                        fragmentGEmmrt = null;
                    }
                    if (fragmentGEmmrt != null) {
                        if (fragmentGEmmrt.isHidden()) {
                            fragmentTransactionBeginTransaction.show(fragmentGEmmrt);
                        }
                    } else {
                        fragmentTransactionBeginTransaction.replace(qZH.StateListAnimator.akftKQ, new C41836qyN());
                    }
                    fragmentTransactionBeginTransaction.commitNow();
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    return;
                }
                C42772rci c42772rci2 = this.AEQbTJ;
                if (c42772rci2 != null && (c55113xdn = c42772rci2.EZpvd) != null) {
                    c55113xdn.setVisibility(8);
                }
                androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager2.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
                fragmentTransactionBeginTransaction2.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                androidx.fragment.app.Fragment fragmentGEmmrt2 = gEmmrt(this);
                if (!(fragmentGEmmrt2 instanceof C41825qyC)) {
                    fragmentGEmmrt2 = null;
                }
                if (fragmentGEmmrt2 != null) {
                    if (fragmentGEmmrt2.isHidden()) {
                        fragmentTransactionBeginTransaction2.show(fragmentGEmmrt2);
                    }
                } else {
                    fragmentTransactionBeginTransaction2.replace(qZH.StateListAnimator.akftKQ, new C41825qyC());
                }
                fragmentTransactionBeginTransaction2.commitNow();
                rVN.reportFullyDrawn$default(this, z, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            C42772rci c42772rci3 = this.AEQbTJ;
            if (c42772rci3 != null && (c55113xdn3 = c42772rci3.EZpvd) != null) {
                c55113xdn3.setVisibility(0);
            }
            androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction3 = childFragmentManager3.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "");
            fragmentTransactionBeginTransaction3.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            androidx.fragment.app.Fragment fragmentGEmmrt3 = gEmmrt(this);
            if (fragmentGEmmrt3 != null) {
                fragmentTransactionBeginTransaction3.hide(fragmentGEmmrt3);
            }
            fragmentTransactionBeginTransaction3.commitNow();
            return;
        }
        C42772rci c42772rci4 = this.AEQbTJ;
        if (c42772rci4 != null && (c55113xdn4 = c42772rci4.EZpvd) != null) {
            c55113xdn4.setVisibility(8);
        }
        androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction4 = childFragmentManager4.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "");
        fragmentTransactionBeginTransaction4.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        androidx.fragment.app.Fragment fragmentGEmmrt4 = gEmmrt(this);
        if (fragmentGEmmrt4 != null) {
            fragmentTransactionBeginTransaction4.show(fragmentGEmmrt4);
        }
        fragmentTransactionBeginTransaction4.commitNow();
    }

    public static final androidx.fragment.app.Fragment gEmmrt(C41860qyl c41860qyl) {
        return jSA.AEQbTJ(c41860qyl, qZH.StateListAnimator.akftKQ);
    }

    @Override // o.InterfaceC41923qzv
    public void KWHzl(int i, @NotNull InterfaceC55797xqi interfaceC55797xqi, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC55797xqi, "");
        C40375qTn.AEQbTJ.copydefault(getTAG(), "onHandleWatching -> " + i + ", " + interfaceC55797xqi + ", " + z);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FavoriteSearchFragment$onHandleWatching$1(this, interfaceC55797xqi, z, null), 3, null);
    }

    public final void OLrzqt(java.lang.String str) {
        requireActivity().finish();
        new jSB.ActionBar(str).AEQbTJ();
    }

    public final void AYXKKw() {
        final java.lang.String[] strArr = {"UPDATE_NEW_COIN_UI", "NEW_COIN_ONLINE_STATUS_UPDATE", "NEW_CONTRACT_ONLINE_STATUS_UPDATE"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenRxEvents$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC KWHzl;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length));
                final C41860qyl c41860qyl = this;
                this.KWHzl = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM(new Function1<String, Unit>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenRxEvents$$inlined$repeatListenRxEventOnResume$1.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        KWHzl(str);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(String str) {
                        Intrinsics.copydefault((Object) str);
                        C40375qTn.AEQbTJ.copydefault(c41860qyl.getTAG(), "listenRxEvents -> " + str);
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c41860qyl), null, null, new FavoriteSearchFragment$listenRxEvents$1$1(c41860qyl, null), 3, null);
                    }
                }) { // from class: o.jSA.ClipData
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new Function1<Throwable, Unit>() { // from class: com.okinc.market.search.features.favorite.ui.FavoriteSearchFragment$listenRxEvents$$inlined$repeatListenRxEventOnResume$1.3
                    public final void OLrzqt(Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        OLrzqt(th);
                        return Unit.INSTANCE;
                    }
                }) { // from class: o.jSA.ClipData
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                });
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
    }
}
