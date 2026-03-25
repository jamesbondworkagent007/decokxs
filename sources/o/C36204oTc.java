package o;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.settings.main.data.datasource.ChartDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.TopDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.TradingDisplayType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$delayDismiss$1;
import com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$initData$1;
import com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$subscribeOnUiChange$1;
import com.okinc.kline.features.settings.main.viewmodel.KlineMainSettingViewModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.LazyThreadSafetyMode;
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
import o.ActivityC39442psS;
import o.C35964oKf;
import o.C36187oSm;
import o.InterfaceC49363unD;
import o.InterfaceC54581xNr;
import o.oSJ;
import o.oSU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36204oTc extends oSO implements InterfaceC49363unD, oSP, InterfaceC35976oKr {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AhwBna;
    public oOR djBIcL;
    public oKD gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public int AkhnZx = 1;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oSZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36204oTc.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35976oKr
    public void OLrzqt(@NotNull oKD okd) {
        Intrinsics.checkNotNullParameter(okd, "");
        this.gEmmrt = okd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.AkhnZx = i;
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

    public C36204oTc() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineMainSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.features.settings.main.ui.KlineSettingsDialog$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.oTc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oTc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C36204oTc OLrzqt(@NotNull SettingEntryPoint settingEntryPoint, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C36204oTc c36204oTc = new C36204oTc();
            c36204oTc.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("entry_point", settingEntryPoint)));
            c36204oTc.show(fragmentManager);
            return c36204oTc;
        }

        public final C36204oTc AEQbTJ(@NotNull SettingEntryPoint settingEntryPoint) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            C36204oTc c36204oTc = new C36204oTc();
            c36204oTc.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("entry_point", settingEntryPoint)));
            return c36204oTc;
        }
    }

    public static final C36213oTl copydefault(C36204oTc c36204oTc) {
        return new C36213oTl(c36204oTc);
    }

    public final C36213oTl valueOf() {
        return (C36213oTl) this.AYXKKw.getValue();
    }

    public final KlineMainSettingViewModel AYXKKw() {
        return (KlineMainSettingViewModel) this.isConnected.getValue();
    }

    public final pCW gEmmrt() {
        return (pCW) this.AhwBna.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = oOR.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        oOR oor = this.djBIcL;
        if (oor != null && (recyclerView = oor.EZpvd) != null) {
            copydefault(recyclerView);
        }
        DbNXlk();
        djBIcL();
        C36234oUf.EZpvd.gEmmrt();
    }

    private final void copydefault(RecyclerView recyclerView) {
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new C36241oUm(new Function1() { // from class: o.oTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C36204oTc.copydefault(((java.lang.Integer) obj).intValue()));
            }
        }, new Function1() { // from class: o.oTf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C36204oTc.KWHzl(((java.lang.Integer) obj).intValue()));
            }
        }, null, 4, null));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 6);
        gridLayoutManager.setSpanSizeLookup(new Application());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(valueOf());
    }

    public static final int copydefault(int i) {
        if (i == 2) {
            return C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        if (i != 3) {
            return 0;
        }
        return C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public static final int KWHzl(int i) {
        if (i == 2) {
            return C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        if (i != 3) {
            return 0;
        }
        return C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.oTc$Application */
    public static final class Application extends GridLayoutManager.SpanSizeLookup {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            oSJ osjCopydefault = C36204oTc.this.valueOf().copydefault(i);
            if (osjCopydefault instanceof oSJ.Activity) {
                return 2;
            }
            return osjCopydefault instanceof oSJ.StateListAnimator ? 3 : 6;
        }
    }

    private final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineSettingsDialog$subscribeOnUiChange$1(this, null), 3, null);
    }

    private final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineSettingsDialog$initData$1(this, null), 3, null);
    }

    @Override // o.InterfaceC35976oKr
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        show(fragmentManager, str);
    }

    @Override // o.oSP
    public void copydefault(@NotNull oSJ osj) {
        java.lang.String strCopydefault;
        SettingEntryPoint settingEntryPointEZpvd;
        java.lang.String strAEQbTJ;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(osj, "");
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        oSK oskKWHzl = osj.KWHzl();
        if (oskKWHzl == TopDisplayType.Landscape) {
            RxBus.KWHzl("kline_full_screen");
            gEmmrt().KWHzl("trade_type");
            C36234oUf.EZpvd.EZpvd("top_settings", "landscape");
            KWHzl();
            return;
        }
        if (oskKWHzl == TopDisplayType.Indicators) {
            startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC37844pCu.class));
            gEmmrt().KWHzl("system_avail_mem");
            C36234oUf.EZpvd.EZpvd("top_settings", "indicators");
            dismissAllowingStateLoss();
            return;
        }
        if (oskKWHzl == TopDisplayType.Drawing) {
            oKD okd = this.gEmmrt;
            if (okd != null) {
                okd.copydefault();
            }
            gEmmrt().KWHzl("txType");
            C36234oUf.EZpvd.EZpvd("top_settings", "drawings");
            KWHzl();
            return;
        }
        if (oskKWHzl == TopDisplayType.Formula) {
            SPUtils.put("kline_setting_formula_new_tips", java.lang.Boolean.FALSE);
            InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            if (interfaceC43033rhe != null) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                if (interfaceC43033rhe.EZpvd(childFragmentManager, new yHO() { // from class: o.oTe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C36204oTc.copydefault(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                    }
                })) {
                    C37908pFd.AYXKKw("custom_formula");
                    return;
                }
            }
            C37908pFd.AYXKKw("custom_formula");
            return;
        }
        if (oskKWHzl == TopDisplayType.Compare) {
            SettingEntryPoint settingEntryPointEZpvd2 = AYXKKw().EZpvd();
            if (settingEntryPointEZpvd2 == null || (strCopydefault = settingEntryPointEZpvd2.copydefault()) == null || (settingEntryPointEZpvd = AYXKKw().EZpvd()) == null || (strAEQbTJ = settingEntryPointEZpvd.AEQbTJ()) == null || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, strAEQbTJ, strCopydefault, null, null, 12, null)) == null) {
                return;
            }
            InterfaceC43033rhe interfaceC43033rhe2 = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
            if (interfaceC43033rhe2 != null) {
                androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                if (interfaceC43033rhe2.copydefault(childFragmentManager2, C56402yEa.EZpvd(suggestedInstrument$default), new Function1() { // from class: o.oTg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C36204oTc.EZpvd(this.EZpvd, context, (java.util.List) obj);
                    }
                })) {
                    SPUtils.put("kline_setting_compare_new_tips", java.lang.Boolean.FALSE);
                    C37908pFd.OLrzqt();
                    return;
                }
            }
            SPUtils.put("kline_setting_compare_new_tips", java.lang.Boolean.FALSE);
            C37908pFd.OLrzqt();
            return;
        }
        if (oskKWHzl == TopDisplayType.Tutorial) {
            if (pFP.OLrzqt.OLrzqt()) {
                new C39333pqN().show(getChildFragmentManager(), C39333pqN.class.getSimpleName());
            } else {
                C39598pvP c39598pvP = new C39598pvP();
                androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                c39598pvP.show(childFragmentManager3);
            }
            C36234oUf.EZpvd.EZpvd("top_settings", "tutorial");
            gEmmrt().KWHzl(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK);
            return;
        }
        boolean z = false;
        if (oskKWHzl == TopDisplayType.Settings) {
            SettingEntryPoint settingEntryPointEZpvd3 = AYXKKw().EZpvd();
            if (settingEntryPointEZpvd3 != null) {
                oTH.Companion.AEQbTJ(settingEntryPointEZpvd3, context);
            }
            C36236oUh.EZpvd.KWHzl(false);
            C36234oUf.EZpvd.EZpvd("top_settings", "settings");
            gEmmrt().KWHzl("walletType");
            dismissAllowingStateLoss();
            return;
        }
        if (oskKWHzl == TopDisplayType.Date) {
            SPUtils.put("kline_setting_date_tips", java.lang.Boolean.FALSE);
            C36234oUf.EZpvd.EZpvd("top_settings", "date");
            if (AhwBna()) {
                AYXKKw(this);
                return;
            } else {
                C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C35964oKf.Fragment.ibnZAm), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                dismissAllowingStateLoss();
                return;
            }
        }
        if (oskKWHzl == TradingDisplayType.OpenOrders) {
            oSH osh = new oSH();
            androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
            osh.show(childFragmentManager4);
            return;
        }
        if (oskKWHzl == TradingDisplayType.HistoricalOrder) {
            C36200oSz c36200oSz = new C36200oSz();
            androidx.fragment.app.FragmentManager childFragmentManager5 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "");
            c36200oSz.show(childFragmentManager5);
            return;
        }
        if (oskKWHzl == TradingDisplayType.AverageCost) {
            C36195oSu c36195oSu = new C36195oSu();
            androidx.fragment.app.FragmentManager childFragmentManager6 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager6, "");
            c36195oSu.show(childFragmentManager6);
            return;
        }
        if (oskKWHzl == TradingDisplayType.CostOfPositions) {
            oSD osd = new oSD();
            androidx.fragment.app.FragmentManager childFragmentManager7 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager7, "");
            osd.show(childFragmentManager7);
            return;
        }
        if (oskKWHzl == TradingDisplayType.BreakEvenPrice) {
            C36196oSv c36196oSv = new C36196oSv();
            androidx.fragment.app.FragmentManager childFragmentManager8 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager8, "");
            c36196oSv.show(childFragmentManager8);
            return;
        }
        if (oskKWHzl == TradingDisplayType.LipPrice) {
            oSB osb = new oSB();
            androidx.fragment.app.FragmentManager childFragmentManager9 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager9, "");
            osb.show(childFragmentManager9);
            return;
        }
        if (oskKWHzl == ChartDisplayType.Axis) {
            C36190oSp c36190oSp = new C36190oSp();
            c36190oSp.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.oTi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    C36204oTc.KWHzl(this.OLrzqt, dialogInterface);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager10 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager10, "");
            c36190oSp.show(childFragmentManager10);
            return;
        }
        if (oskKWHzl == ChartDisplayType.CountDown) {
            C36189oSo c36189oSo = new C36189oSo();
            androidx.fragment.app.FragmentManager childFragmentManager11 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager11, "");
            c36189oSo.show(childFragmentManager11);
            return;
        }
        if (oskKWHzl == ChartDisplayType.PriceAlerts) {
            C36192oSr c36192oSr = new C36192oSr();
            androidx.fragment.app.FragmentManager childFragmentManager12 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager12, "");
            c36192oSr.show(childFragmentManager12);
            return;
        }
        if (oskKWHzl == ChartDisplayType.EconomicCalendar) {
            C36187oSm.ActionBar actionBar = C36187oSm.Companion;
            SettingEntryPoint settingEntryPointEZpvd4 = AYXKKw().EZpvd();
            if (settingEntryPointEZpvd4 != null && settingEntryPointEZpvd4.AYXKKw()) {
                z = true;
            }
            C36187oSm c36187oSmOLrzqt = actionBar.OLrzqt(z);
            c36187oSmOLrzqt.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.oTk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    C36204oTc.EZpvd(this.EZpvd, dialogInterface);
                }
            });
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c36187oSmOLrzqt.show(parentFragmentManager);
        }
    }

    public static final Unit copydefault(C36204oTc c36204oTc, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        c36204oTc.dismissAllowingStateLoss();
        ActivityC39442psS.StateListAnimator stateListAnimator = ActivityC39442psS.Companion;
        FragmentActivity activity = c36204oTc.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        stateListAnimator.EZpvd(activity, str, str2, str3);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C36204oTc c36204oTc, android.content.DialogInterface dialogInterface) {
        c36204oTc.AYXKKw().copydefault();
    }

    public static final void EZpvd(C36204oTc c36204oTc, android.content.DialogInterface dialogInterface) {
        c36204oTc.AYXKKw().copydefault();
        oKD okd = c36204oTc.gEmmrt;
        if (okd != null) {
            okd.valueOf(C36246oUr.copydefault().call());
        }
    }

    public final boolean AhwBna() {
        return C36246oUr.copydefault().ODWQjV() > 0 || C36246oUr.copydefault().ODWQjV() == -1;
    }

    @Override // o.oSP
    public void OLrzqt(@NotNull oSJ.StateListAnimator stateListAnimator, boolean z) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        oSK oskKWHzl = stateListAnimator.KWHzl();
        if (oskKWHzl == TradingDisplayType.OpenOrders) {
            oKD okd = this.gEmmrt;
            if (okd != null) {
                okd.copydefault(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "open_order");
            gEmmrt().KWHzl("isCertificateTampered");
        } else if (oskKWHzl == TradingDisplayType.HistoricalOrder) {
            oKD okd2 = this.gEmmrt;
            if (okd2 != null) {
                okd2.djBIcL(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "historical_orders");
            gEmmrt().KWHzl("isApplicationHooked");
        } else if (oskKWHzl == TradingDisplayType.AverageCost) {
            oKD okd3 = this.gEmmrt;
            if (okd3 != null) {
                okd3.gEmmrt(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "average_cost");
            gEmmrt().KWHzl("isDebuggerAttached");
        } else if (oskKWHzl == TradingDisplayType.CostOfPositions) {
            oKD okd4 = this.gEmmrt;
            if (okd4 != null) {
                okd4.KWHzl(z);
            }
            gEmmrt().KWHzl("isClockTampered");
        } else if (oskKWHzl == TradingDisplayType.BreakEvenPrice) {
            oKD okd5 = this.gEmmrt;
            if (okd5 != null) {
                okd5.EZpvd(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "breakeven_price");
        } else if (oskKWHzl == TradingDisplayType.LipPrice) {
            oKD okd6 = this.gEmmrt;
            if (okd6 != null) {
                okd6.AEQbTJ(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "liquidation_price");
        } else if (oskKWHzl == ChartDisplayType.Axis) {
            oKD okd7 = this.gEmmrt;
            if (okd7 != null) {
                okd7.AYXKKw(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "y_axis");
            gEmmrt().KWHzl(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK);
        } else if (oskKWHzl == ChartDisplayType.CountDown) {
            oKD okd8 = this.gEmmrt;
            if (okd8 != null) {
                okd8.OLrzqt(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "countdown");
            gEmmrt().KWHzl("main_start");
        } else if (oskKWHzl == ChartDisplayType.PriceAlerts) {
            oKD okd9 = this.gEmmrt;
            if (okd9 != null) {
                okd9.AhwBna(z);
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "alerts");
            gEmmrt().KWHzl("task_call_method");
        } else if (oskKWHzl == ChartDisplayType.EconomicCalendar) {
            C36236oUh c36236oUh = C36236oUh.EZpvd;
            c36236oUh.copydefault(z);
            AYXKKw().KWHzl().setShowUpcomingEvents(z);
            if (!z) {
                AYXKKw().KWHzl().setShowPastEvents(false);
                c36236oUh.OLrzqt(false);
            }
            if (z) {
                FragmentKt.setFragmentResult(this, "re_open_eco_calendar", BundleKt.bundleOf());
            }
            oKD okd10 = this.gEmmrt;
            if (okd10 != null) {
                okd10.valueOf(C36246oUr.copydefault().call());
            }
            C36234oUf.EZpvd.EZpvd("bottom_settings", "economic_event");
        }
        AYXKKw().copydefault();
    }

    @Override // o.oSP
    public void OLrzqt(android.widget.SeekBar seekBar, int i, boolean z) {
        pUU.EZpvd("KlineSettingsDialog", "onProgressChanged: " + i + ", is fromUser: " + z);
        oKD okd = this.gEmmrt;
        if (okd != null) {
            okd.EZpvd(((i - 50) * 1.0f) / 200.0f);
        }
    }

    @Override // o.oSP
    public void EZpvd(android.widget.SeekBar seekBar) {
        pUU.EZpvd("KlineSettingsDialog", "onStartTrackingTouch: " + (seekBar != null ? java.lang.Integer.valueOf(seekBar.getProgress()) : null));
        AEQbTJ(false);
        oKD okd = this.gEmmrt;
        if (okd != null) {
            okd.OLrzqt();
        }
    }

    @Override // o.oSP
    public void AEQbTJ(android.widget.SeekBar seekBar) {
        pUU.EZpvd("KlineSettingsDialog", "onStopTrackingTouch: " + (seekBar != null ? java.lang.Integer.valueOf(seekBar.getProgress()) : null));
        if (seekBar != null) {
            C36236oUh.EZpvd.OLrzqt(seekBar.getProgress());
        }
        AEQbTJ(true);
        oKD okd = this.gEmmrt;
        if (okd != null) {
            okd.EZpvd();
        }
        gEmmrt().KWHzl("isDeviceRooted");
    }

    public final void AEQbTJ(boolean z) {
        android.view.Window window;
        C55118xds root;
        android.graphics.drawable.Drawable background;
        wXQ wxq;
        RecyclerView recyclerView;
        oOR oor = this.djBIcL;
        if (oor != null && (recyclerView = oor.EZpvd) != null) {
            int i = 0;
            for (android.view.View view : ViewGroupKt.getChildren(recyclerView)) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                android.view.View view2 = view;
                if (i != recyclerView.getChildCount() - 1) {
                    view2.setVisibility(z ? 0 : 8);
                }
                i++;
            }
        }
        int i2 = z ? 255 : 0;
        C54946xaf binding = getBinding();
        if (binding != null && (wxq = binding.KWHzl) != null) {
            wxq.setAlpha(C33129mqd.djBIcL(java.lang.Integer.valueOf(i2)));
        }
        C54946xaf binding2 = getBinding();
        if (binding2 != null && (root = binding2.getRoot()) != null && (background = root.getBackground()) != null) {
            background.setAlpha(i2);
        }
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(z ? 0.5f : 0.0f);
        }
        if (C59449zhJ.equals$default(AYXKKw().KWHzl().getCurrentMode(), "YScale", false, 2, null)) {
            AYXKKw().KWHzl().setNeedUpdateInYScale(!z);
            if (z) {
                return;
            }
            AYXKKw().KWHzl().setMoveInterceptMode(" YUPDOWNMOVE");
        }
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineSettingsDialog$delayDismiss$1(this, null), 3, null);
    }

    public final void AYXKKw(final C36204oTc c36204oTc) {
        oSU.Application application = oSU.Companion;
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        application.EZpvd(parentFragmentManager, new Function1() { // from class: o.oTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36204oTc.OLrzqt(this.copydefault, this, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit OLrzqt(C36204oTc c36204oTc, C36204oTc c36204oTc2, long j) {
        c36204oTc.dismissAllowingStateLoss();
        oKD okd = c36204oTc2.gEmmrt;
        if (okd != null) {
            okd.KWHzl(j);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oKD okd = this.gEmmrt;
        if (okd != null) {
            okd.KWHzl();
        }
        C36234oUf.EZpvd.djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C39215poB.OLrzqt.AEQbTJ(gEmmrt().OLrzqt());
    }

    public static final Unit EZpvd(C36204oTc c36204oTc, android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            BizInstrument bizInstrument = (BizInstrument) it.next();
            arrayList.add(new MarketCoinInfo(bizInstrument.getInstId(), bizInstrument.getInstType(), (java.lang.String) null, (java.lang.String) null, C55687xoe.AEQbTJ.OLrzqt(bizInstrument.getTradeSymbol()), 12, (DefaultConstructorMarker) null));
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList);
        c36204oTc.dismissAllowingStateLoss();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38783pfu.class);
        intent.putParcelableArrayListExtra("data", arrayList2);
        intent.putExtra("from", "TICKER_COMPARE");
        c36204oTc.startActivity(intent);
        return Unit.INSTANCE;
    }
}
