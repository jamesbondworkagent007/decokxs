package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$1;
import com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2;
import com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$2;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$3;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$4;
import com.okinc.market.common.biz_spot.CoinDataInfo;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.stateful.StatefulView;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C32113mPz;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pcb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38605pcb extends AbstractC32998moE implements InterfaceC49363unD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public oMG AEQbTJ;
    public java.lang.String AYXKKw;
    public KlineCoinInfo AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public InterfaceC39502ptZ EZpvd;
    public CoinDataInfo KWHzl;
    public boolean copydefault;
    public java.lang.Boolean djBIcL;
    public android.widget.TextView fetchVPNInfo;
    public boolean gEmmrt;
    public android.widget.LinearLayout isConnected;
    public java.lang.String valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.pcb$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oMG EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = false;
        this.AYXKKw = str;
        this.valueOf = str2;
        this.AhwBna = null;
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.UeEOUB;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX INFO: renamed from: o.pcb$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
            if (fragment != null && !(fragment instanceof C39718pxd)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C39718pxd)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C39718pxd)) {
                    parentFragment = null;
                }
                fragment = (C39718pxd) parentFragment;
            }
            if (!(fragment instanceof C39718pxd)) {
                fragment = null;
            }
            C39718pxd c39718pxd = (C39718pxd) fragment;
            C39718pxd c39718pxd2 = c39718pxd instanceof ViewModelStoreOwner ? c39718pxd : null;
            if (c39718pxd2 != null) {
                return c39718pxd2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C39718pxd.class.getSimpleName()).toString());
        }
    }

    public C38605pcb() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1(new Activity(this)));
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(UnlockTokensViewModel.class), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.djBIcL = java.lang.Boolean.FALSE;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
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

    private final C54822xWp djBIcL() {
        return (C54822xWp) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnlockTokensViewModel AYXKKw() {
        return (UnlockTokensViewModel) this.values.getValue();
    }

    /* JADX INFO: renamed from: o.pcb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pcb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C38605pcb AEQbTJ(@NotNull InterfaceC39502ptZ interfaceC39502ptZ) {
            Intrinsics.checkNotNullParameter(interfaceC39502ptZ, "");
            C38605pcb c38605pcb = new C38605pcb();
            c38605pcb.EZpvd = interfaceC39502ptZ;
            return c38605pcb;
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        showLoading();
        initIntroductionData$default(this, false, 1, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull final android.view.View view, android.os.Bundle bundle) {
        C55173xeu c55173xeu;
        C33546myW c33546myW;
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = oMG.OLrzqt(view);
        this.AYXKKw = djBIcL().AEQbTJ();
        this.valueOf = djBIcL().EZpvd();
        this.isConnected = (android.widget.LinearLayout) view.findViewById(C32113mPz.FragmentManager.DCJXGO);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaMetadataCompatApi21);
        this.fetchVPNInfo = textView;
        if (textView != null) {
            textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zqTOFw));
        }
        oMG omg = this.AEQbTJ;
        if (omg != null && (c33546myW = omg.djBIcL) != null) {
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.pci
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C38605pcb.EZpvd(view, this, interfaceC57934yrl);
                }
            });
        }
        oMG omg2 = this.AEQbTJ;
        if (omg2 != null && (c55173xeu = omg2.AYXKKw) != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pch
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C38605pcb.KWHzl(view, this, view2);
                }
            });
        }
        djBIcL().KWHzl().observe(this, new StateListAnimator(new Function1() { // from class: o.pcl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38605pcb.AEQbTJ(this.AEQbTJ, (MarketCoinInfo) obj);
            }
        }));
    }

    public static final void EZpvd(android.view.View view, C38605pcb c38605pcb, InterfaceC57934yrl interfaceC57934yrl) {
        C33546myW c33546myW;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (c43453rpa.KWHzl(context)) {
            c38605pcb.KWHzl(false);
            c38605pcb.OLrzqt(true);
            return;
        }
        oMG omg = c38605pcb.AEQbTJ;
        if (omg != null && (c33546myW = omg.djBIcL) != null) {
            c33546myW.AEQbTJ();
        }
        c38605pcb.KWHzl(true);
    }

    public static final void KWHzl(android.view.View view, C38605pcb c38605pcb, android.view.View view2) {
        C33546myW c33546myW;
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (c43453rpa.KWHzl(context)) {
            c38605pcb.KWHzl(false);
            c38605pcb.OLrzqt(true);
            return;
        }
        oMG omg = c38605pcb.AEQbTJ;
        if (omg != null && (c33546myW = omg.djBIcL) != null) {
            c33546myW.AEQbTJ();
        }
        c38605pcb.KWHzl(true);
    }

    public static final Unit AEQbTJ(C38605pcb c38605pcb, MarketCoinInfo marketCoinInfo) {
        java.lang.String instrumentId = marketCoinInfo.getInstrumentId();
        java.lang.String instrumentType = marketCoinInfo.getInstrumentType();
        if (!Intrinsics.EZpvd((java.lang.Object) instrumentId, (java.lang.Object) c38605pcb.AYXKKw) || !Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) c38605pcb.valueOf)) {
            c38605pcb.KWHzl(instrumentId, instrumentType);
            c38605pcb.showLoading();
            initIntroductionData$default(c38605pcb, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void initIntroductionData$default(C38605pcb c38605pcb, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c38605pcb.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        java.lang.String str = this.AYXKKw;
        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default == null || listSplit$default.isEmpty()) {
            return;
        }
        KWHzl((java.lang.String) listSplit$default.get(0), z);
    }

    public static /* synthetic */ void initData$default(C38605pcb c38605pcb, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c38605pcb.KWHzl(str, z);
    }

    private final void KWHzl(java.lang.String str, boolean z) {
        AEQbTJ();
        if (z) {
            AYXKKw().copydefault();
        }
        oLF.EZpvd.EZpvd(this, str, new Function1() { // from class: o.pcf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38605pcb.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.pcj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38605pcb.copydefault(this.AEQbTJ, (CoinDataInfo) obj);
            }
        }, new Function1() { // from class: o.pcg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38605pcb.copydefault((java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(C38605pcb c38605pcb, boolean z) {
        if (!c38605pcb.isAdded()) {
            return Unit.INSTANCE;
        }
        java.lang.Boolean bool = c38605pcb.djBIcL;
        java.lang.Boolean boolValueOf = bool != null ? java.lang.Boolean.valueOf(z | bool.booleanValue()) : null;
        c38605pcb.djBIcL = boolValueOf;
        if (boolValueOf != null) {
            c38605pcb.AEQbTJ(boolValueOf.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38605pcb c38605pcb, CoinDataInfo coinDataInfo) {
        c38605pcb.KWHzl = coinDataInfo;
        c38605pcb.KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineIntroductionFragment$listenDataInfo$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineIntroductionFragment$listenDataInfo$2(this, null), 3, null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        C36110oPq c36110oPq;
        super.onPause();
        oMG omg = this.AEQbTJ;
        if (omg == null || (c36110oPq = omg.fetchVPNInfo) == null) {
            return;
        }
        C39784pyq.AEQbTJ(c36110oPq);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC39502ptZ interfaceC39502ptZ = this.EZpvd;
        if (interfaceC39502ptZ != null) {
            interfaceC39502ptZ.dUDNAs();
        }
    }

    private final void AEQbTJ(boolean z) {
        NestedScrollView nestedScrollView;
        NestedScrollView nestedScrollView2;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (C43453rpa.AEQbTJ.KWHzl(context)) {
            dismissLoading();
            KWHzl(false);
        } else {
            dismissLoading();
            KWHzl(true);
        }
        if (z) {
            oMG omg = this.AEQbTJ;
            if (omg != null && (nestedScrollView2 = omg.AhwBna) != null) {
                nestedScrollView2.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = this.isConnected;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        oMG omg2 = this.AEQbTJ;
        if (omg2 != null && (nestedScrollView = omg2.AhwBna) != null) {
            nestedScrollView.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.isConnected;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void KWHzl(boolean z) {
        android.widget.LinearLayout linearLayout;
        NestedScrollView nestedScrollView;
        android.widget.LinearLayout linearLayout2;
        NestedScrollView nestedScrollView2;
        if (z) {
            android.widget.LinearLayout linearLayout3 = this.isConnected;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            oMG omg = this.AEQbTJ;
            if (omg != null && (nestedScrollView2 = omg.AhwBna) != null) {
                nestedScrollView2.setVisibility(8);
            }
            oMG omg2 = this.AEQbTJ;
            if (omg2 == null || (linearLayout2 = omg2.OLrzqt) == null) {
                return;
            }
            linearLayout2.setVisibility(0);
            return;
        }
        oMG omg3 = this.AEQbTJ;
        if (omg3 != null && (nestedScrollView = omg3.AhwBna) != null) {
            nestedScrollView.setVisibility(0);
        }
        oMG omg4 = this.AEQbTJ;
        if (omg4 != null && (linearLayout = omg4.OLrzqt) != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout4 = this.isConnected;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
    }

    public final void KWHzl() {
        java.lang.Long issueTime;
        C33546myW c33546myW;
        oMG omg = this.AEQbTJ;
        if (omg != null && (c33546myW = omg.djBIcL) != null) {
            c33546myW.AEQbTJ();
        }
        dismissLoading();
        if (!isAdded() || this.AhwBna == null || this.KWHzl == null) {
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.djBIcL = bool;
        Intrinsics.copydefault(bool);
        AEQbTJ(bool.booleanValue());
        KlineCoinInfo klineCoinInfo = this.AhwBna;
        if (klineCoinInfo != null) {
            klineCoinInfo.setMarketCapRank(java.lang.String.valueOf(klineCoinInfo != null ? klineCoinInfo.getMarketCapRank() : null));
        }
        CoinDataInfo coinDataInfo = this.KWHzl;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinDataInfo != null ? coinDataInfo.getMarketCap() : null))) {
            KlineCoinInfo klineCoinInfo2 = this.AhwBna;
            if (klineCoinInfo2 != null) {
                oLF olf = oLF.EZpvd;
                CoinDataInfo coinDataInfo2 = this.KWHzl;
                klineCoinInfo2.setMarCap(olf.KWHzl(new BigDecimal(coinDataInfo2 != null ? coinDataInfo2.getMarketCap() : null)));
            }
            KlineCoinInfo klineCoinInfo3 = this.AhwBna;
            if (klineCoinInfo3 != null) {
                oLF olf2 = oLF.EZpvd;
                CoinDataInfo coinDataInfo3 = this.KWHzl;
                klineCoinInfo3.setMarketCap(olf2.KWHzl(new BigDecimal(coinDataInfo3 != null ? coinDataInfo3.getMarketCap() : null)));
            }
        }
        KlineCoinInfo klineCoinInfo4 = this.AhwBna;
        if (klineCoinInfo4 != null) {
            CoinDataInfo coinDataInfo4 = this.KWHzl;
            klineCoinInfo4.setIssueTime(java.lang.String.valueOf((coinDataInfo4 == null || (issueTime = coinDataInfo4.getIssueTime()) == null) ? null : pTA.formatSimpleDate$default(new Date(issueTime.longValue()), null, 1, null)));
        }
        KlineCoinInfo klineCoinInfo5 = this.AhwBna;
        if (klineCoinInfo5 != null) {
            CoinDataInfo coinDataInfo5 = this.KWHzl;
            klineCoinInfo5.setFlowTotal(java.lang.String.valueOf(coinDataInfo5 != null ? coinDataInfo5.getFlowTotal() : null));
        }
        KlineCoinInfo klineCoinInfo6 = this.AhwBna;
        if (klineCoinInfo6 != null) {
            CoinDataInfo coinDataInfo6 = this.KWHzl;
            klineCoinInfo6.setIssuePrice(java.lang.String.valueOf(coinDataInfo6 != null ? coinDataInfo6.getIssuePrice() : null));
        }
        copydefault();
        KlineCoinInfo klineCoinInfo7 = this.AhwBna;
        if (klineCoinInfo7 != null) {
            CoinDataInfo coinDataInfo7 = this.KWHzl;
            klineCoinInfo7.setMaxSupMar(java.lang.String.valueOf(coinDataInfo7 != null ? coinDataInfo7.getFullyDilutedValuation() : null));
        }
        java.lang.String str = this.AYXKKw;
        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default != null && !listSplit$default.isEmpty()) {
            OLrzqt((java.lang.String) listSplit$default.get(0));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault() {
        java.lang.String str;
        KlineCoinInfo klineCoinInfo;
        java.lang.String str2 = this.AYXKKw;
        C38525pbA c38525pbAAEQbTJ = (str2 == null || (str = this.valueOf) == null || (klineCoinInfo = this.AhwBna) == null) ? null : C38525pbA.Companion.AEQbTJ(str2, str, klineCoinInfo);
        if (c38525pbAAEQbTJ != null) {
            OLrzqt(C35964oKf.StateListAnimator.fLIjIY, c38525pbAAEQbTJ);
        }
    }

    public final C37858pDh OLrzqt() {
        return (C37858pDh) this.AkhnZx.getValue();
    }

    public final void OLrzqt(java.lang.String str) {
        OLrzqt().KWHzl(str, "");
        C38507paj c38507paj = new C38507paj();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("symbol", str);
        c38507paj.setArguments(bundle);
        OLrzqt(C35964oKf.StateListAnimator.DYICSh, c38507paj);
    }

    public final void OLrzqt(int i, androidx.fragment.app.Fragment fragment) {
        try {
            getChildFragmentManager().beginTransaction().replace(i, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception(e.getLocalizedMessage(), e));
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        C55237xgE c55237xgE;
        C55237xgE c55237xgE2;
        C55237xgE c55237xgE3;
        C55113xdn c55113xdn;
        C55237xgE c55237xgE4;
        oMG omg = this.AEQbTJ;
        android.view.View viewAEQbTJ = (omg == null || (c55237xgE4 = omg.gEmmrt) == null) ? null : c55237xgE4.AEQbTJ(StatefulView.Status.Loading);
        if (viewAEQbTJ != null && (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) != null) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        }
        oMG omg2 = this.AEQbTJ;
        if (omg2 != null && (c55237xgE3 = omg2.gEmmrt) != null) {
            c55237xgE3.setLoadingDelayedTime(0L);
        }
        oMG omg3 = this.AEQbTJ;
        if (omg3 != null && (c55237xgE2 = omg3.gEmmrt) != null) {
            c55237xgE2.setStatus(StatefulView.Status.Loading);
        }
        oMG omg4 = this.AEQbTJ;
        if (omg4 == null || (c55237xgE = omg4.gEmmrt) == null) {
            return;
        }
        c55237xgE.setVisibility(0);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        C55237xgE c55237xgE;
        oMG omg = this.AEQbTJ;
        if (omg == null || (c55237xgE = omg.gEmmrt) == null || c55237xgE.getVisibility() != 0) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.None);
        c55237xgE.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oLF.EZpvd.AEQbTJ();
    }
}
