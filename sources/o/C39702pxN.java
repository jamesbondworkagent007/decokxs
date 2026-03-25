package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$ScheduleAdapter$items$1;
import com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$2;
import com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$3;
import com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$4;
import com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$2;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$3;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$4;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.stateful.StatefulView;
import java.math.RoundingMode;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C35964oKf;
import o.C35966oKh;
import o.C52761wXj;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39702pxN extends AbstractC39717pxc implements InterfaceC49363unD {
    public C36097oPd AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final Application valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.pxc.AEQbTJ()V */
    public final C36097oPd AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DPhTBN;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.pxN$VoiceInteractor */
    public static final class VoiceInteractor implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.AEQbTJ;
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

    public C39702pxN() {
        VoiceInteractor voiceInteractor = new VoiceInteractor(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1(voiceInteractor));
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(UnlockTokensViewModel.class), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C39739pxy.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = new Application();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnlockTokensViewModel valueOf() {
        return (UnlockTokensViewModel) this.djBIcL.getValue();
    }

    public final C39739pxy gEmmrt() {
        return (C39739pxy) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        C39778pyk c39778pyk;
        super.onResume();
        C36097oPd c36097oPd = this.AYXKKw;
        if (c36097oPd == null || (c39778pyk = c36097oPd.fetchVPNInfo) == null) {
            return;
        }
        c39778pyk.getAxisRight().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getXAxis().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getXAxis().setAxisLineColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c39778pyk.getAxisRight().setAxisLineColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C36097oPd c36097oPdOLrzqt = C36097oPd.OLrzqt(view);
        this.AYXKKw = c36097oPdOLrzqt;
        if (c36097oPdOLrzqt != null) {
            C39778pyk c39778pyk = c36097oPdOLrzqt.fetchVPNInfo;
            c39778pyk.getLegend().setEnabled(false);
            c39778pyk.getDescription().setEnabled(false);
            c39778pyk.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
            c39778pyk.getXAxis().setDrawGridLines(false);
            c39778pyk.getXAxis().setGranularityEnabled(true);
            c39778pyk.getXAxis().setAvoidFirstLastClipping(true);
            android.graphics.Paint paint = c39778pyk.getPaint(7);
            if (paint != null) {
                paint.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            android.graphics.Paint paint2 = c39778pyk.getPaint(11);
            if (paint2 != null) {
                paint2.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            android.graphics.Paint paint3 = c39778pyk.getPaint(18);
            if (paint3 != null) {
                paint3.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            c39778pyk.getAxisRight().setDrawGridLines(false);
            c39778pyk.getAxisRight().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            c39778pyk.getAxisLeft().setEnabled(false);
            c39778pyk.getAxisRight().setGranularityEnabled(true);
            c39778pyk.getAxisLeft().mAxisMinimum = 0.0f;
            c39778pyk.getAxisLeft().setDrawGridLines(false);
            c39778pyk.getXAxis().setLabelCount(4, true);
            c39778pyk.getAxisRight().setLabelCount(4, false);
            c39778pyk.getAxisLeft().setGranularityEnabled(true);
            c39778pyk.getAxisLeft().setLabelCount(4);
            c39778pyk.getXAxis().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            c39778pyk.setDoubleTapToZoomEnabled(false);
            c39778pyk.setDrawGridBackground(false);
            Intrinsics.copydefault(c39778pyk);
            ChartAnimator animator = c39778pyk.getAnimator();
            Intrinsics.checkNotNullExpressionValue(animator, "");
            ViewPortHandler viewPortHandler = c39778pyk.getViewPortHandler();
            Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
            c39778pyk.setRenderer(new C39785pyr(c39778pyk, animator, viewPortHandler));
            c39778pyk.setClickable(false);
            c36097oPdOLrzqt.KWHzl.setLayoutManager(new LinearLayoutManager(view.getContext()));
            c36097oPdOLrzqt.KWHzl.setAdapter(this.valueOf);
            android.widget.LinearLayout linearLayout = c36097oPdOLrzqt.AEQbTJ;
            linearLayout.setOnClickListener(new Fragment(linearLayout, 1000L, this));
            C54984xbQ c54984xbQ = c36097oPdOLrzqt.DbNXlk;
            c54984xbQ.setOnClickListener(new PictureInPictureParams(c54984xbQ, 1000L, this));
            C54984xbQ c54984xbQ2 = c36097oPdOLrzqt.gEmmrt;
            c54984xbQ2.setOnClickListener(new SharedElementCallback(c54984xbQ2, 1000L, this));
            C54984xbQ c54984xbQ3 = c36097oPdOLrzqt.AkhnZx;
            c54984xbQ3.setOnClickListener(new TaskStackBuilder(c54984xbQ3, 1000L, this));
            C54984xbQ c54984xbQ4 = c36097oPdOLrzqt.EZpvd;
            c54984xbQ4.setOnClickListener(new AssistContent(c54984xbQ4, 1000L, this));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnlockTokenScheduleFragment$initView$2(this, null), 3, null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UnlockTokenScheduleFragment$initView$3(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnlockTokenScheduleFragment$initView$4(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.pxN$ComponentCallbacks2 */
    public static final class ComponentCallbacks2<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C39709pxU) t2).gEmmrt()), java.lang.Integer.valueOf(((C39709pxU) t).gEmmrt()));
        }
    }

    /* JADX INFO: renamed from: o.pxN$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Map copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.util.Map map) {
            this.copydefault = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((java.lang.Integer) this.copydefault.get((LineDataSet) t2), (java.lang.Integer) this.copydefault.get((LineDataSet) t));
        }
    }

    /* JADX INFO: renamed from: o.pxN$FragmentManager */
    public static final class FragmentManager implements Function1<EventParamsList, Unit> {
        public static final FragmentManager EZpvd = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "7d", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.pxN$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog EZpvd = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "30d", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.pxN$LoaderManager */
    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public static final LoaderManager OLrzqt = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "1y", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.pxN$PendingIntent */
    public static final class PendingIntent implements Function1<EventParamsList, Unit> {
        public static final PendingIntent EZpvd = new PendingIntent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "unlock_schedule_time", "all", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.pxN$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C39702pxN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C39702pxN c39702pxN) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c39702pxN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C39778pyk c39778pyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C36097oPd c36097oPdAEQbTJ = this.copydefault.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (c39778pyk = c36097oPdAEQbTJ.fetchVPNInfo) != null) {
                    c39778pyk.highlightValue((Highlight) null, true);
                }
                this.copydefault.valueOf().KWHzl("ALL");
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, PendingIntent.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.pxN$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C39702pxN KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C39702pxN c39702pxN) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c39702pxN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C39778pyk c39778pyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C36097oPd c36097oPdAEQbTJ = this.KWHzl.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (c39778pyk = c36097oPdAEQbTJ.fetchVPNInfo) != null) {
                    c39778pyk.highlightValue((Highlight) null, true);
                }
                this.KWHzl.gEmmrt().KWHzl().setValue(java.lang.Boolean.valueOf(true ^ this.KWHzl.gEmmrt().KWHzl().getValue().booleanValue()));
            }
        }
    }

    /* JADX INFO: renamed from: o.pxN$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ C39702pxN EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C39702pxN c39702pxN) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c39702pxN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C39778pyk c39778pyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C36097oPd c36097oPdAEQbTJ = this.EZpvd.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (c39778pyk = c36097oPdAEQbTJ.fetchVPNInfo) != null) {
                    c39778pyk.highlightValue((Highlight) null, true);
                }
                this.EZpvd.valueOf().KWHzl("1W");
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, FragmentManager.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.pxN$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ C39702pxN AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C39702pxN c39702pxN) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c39702pxN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C39778pyk c39778pyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C36097oPd c36097oPdAEQbTJ = this.AEQbTJ.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (c39778pyk = c36097oPdAEQbTJ.fetchVPNInfo) != null) {
                    c39778pyk.highlightValue((Highlight) null, true);
                }
                this.AEQbTJ.valueOf().KWHzl("1M");
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, Dialog.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.pxN$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ C39702pxN AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C39702pxN c39702pxN) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c39702pxN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C39778pyk c39778pyk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C36097oPd c36097oPdAEQbTJ = this.AEQbTJ.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (c39778pyk = c36097oPdAEQbTJ.fetchVPNInfo) != null) {
                    c39778pyk.highlightValue((Highlight) null, true);
                }
                this.AEQbTJ.valueOf().KWHzl("1Y");
                C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, LoaderManager.OLrzqt, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(C55173xeu c55173xeu) {
        c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.dpErvT));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C35966oKh.TaskDescription.OLrzqt));
        c55173xeu.setEmptyTypeImage(9);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39702pxN.copydefault(this.OLrzqt, view);
            }
        });
    }

    public static final void copydefault(C39702pxN c39702pxN, android.view.View view) {
        UnlockTokensViewModel.fetchScheduleData$default(c39702pxN.valueOf(), null, 1, null);
    }

    private final void OLrzqt(C55173xeu c55173xeu) {
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.OVMstZ));
    }

    public final void EZpvd(C39703pxO c39703pxO, LineChart lineChart) {
        C39778pyk c39778pyk;
        C55237xgE c55237xgE;
        C55237xgE c55237xgE2;
        C39778pyk c39778pyk2;
        C55237xgE c55237xgE3;
        C55237xgE c55237xgE4;
        C55173xeu c55173xeu;
        C55237xgE c55237xgE5;
        if (lineChart == null) {
            return;
        }
        int i = 0;
        if (c39703pxO.EZpvd().isEmpty()) {
            C36097oPd c36097oPd = this.AYXKKw;
            if (c36097oPd != null && (c55237xgE5 = c36097oPd.copydefault) != null) {
                c55237xgE5.setStatus(StatefulView.Status.Empty);
            }
            C36097oPd c36097oPd2 = this.AYXKKw;
            if (c36097oPd2 != null && (c55237xgE4 = c36097oPd2.copydefault) != null && (c55173xeu = (C55173xeu) c55237xgE4.findViewById(C52761wXj.FragmentManager.gasjUx)) != null) {
                OLrzqt(c55173xeu);
            }
            C36097oPd c36097oPd3 = this.AYXKKw;
            if (c36097oPd3 != null && (c55237xgE3 = c36097oPd3.copydefault) != null) {
                c55237xgE3.setVisibility(0);
            }
            C36097oPd c36097oPd4 = this.AYXKKw;
            if (c36097oPd4 != null && (c39778pyk2 = c36097oPd4.fetchVPNInfo) != null) {
                c39778pyk2.setVisibility(8);
            }
        } else {
            C36097oPd c36097oPd5 = this.AYXKKw;
            if (c36097oPd5 != null && (c55237xgE2 = c36097oPd5.copydefault) != null) {
                c55237xgE2.setStatus(StatefulView.Status.Content);
            }
            C36097oPd c36097oPd6 = this.AYXKKw;
            if (c36097oPd6 != null && (c55237xgE = c36097oPd6.copydefault) != null) {
                c55237xgE.setVisibility(8);
            }
            C36097oPd c36097oPd7 = this.AYXKKw;
            if (c36097oPd7 != null && (c39778pyk = c36097oPd7.fetchVPNInfo) != null) {
                c39778pyk.setVisibility(0);
            }
        }
        DataRenderer renderer = lineChart.getRenderer();
        C39785pyr c39785pyr = renderer instanceof C39785pyr ? (C39785pyr) renderer : null;
        if (c39785pyr != null) {
            c39785pyr.AEQbTJ(c39703pxO.copydefault());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<C39709pxU>> entry : c39703pxO.EZpvd().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<C39709pxU> value = entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            int i2 = i;
            for (java.lang.Object obj : value) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C39709pxU c39709pxU = (C39709pxU) obj;
                arrayList2.add(new Entry(c39703pxO.AEQbTJ().indexOf(java.lang.String.valueOf(c39709pxU.AhwBna())), (float) c39709pxU.djBIcL(), c39709pxU));
                i2++;
                linkedHashMap = linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            try {
                Result.Application application = Result.Companion;
                LineDataSet lineDataSet = new LineDataSet(arrayList2, key);
                lineDataSet.setColor(((C39709pxU) CollectionsKt___CollectionsKt.AuCTelauCTel(value)).EZpvd());
                lineDataSet.setFillColor(((C39709pxU) CollectionsKt___CollectionsKt.AuCTelauCTel(value)).EZpvd());
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setFillAlpha(225);
                lineDataSet.setDrawHighlightIndicators(false);
                arrayList.add(lineDataSet);
                linkedHashMap = linkedHashMap2;
                try {
                    linkedHashMap.put(lineDataSet, java.lang.Integer.valueOf(((C39709pxU) CollectionsKt___CollectionsKt.AuCTelauCTel(value)).gEmmrt()));
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                linkedHashMap = linkedHashMap2;
            }
            i = 0;
        }
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new TaskDescription(linkedHashMap));
        }
        lineChart.setData(new LineData((java.util.List<ILineDataSet>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList)));
        lineChart.getAxisRight().setValueFormatter(new ActionBar());
        lineChart.getXAxis().setValueFormatter(new Activity(c39703pxO));
        lineChart.getXAxis().setLabelCount(4, true);
        lineChart.getXAxis().setGranularityEnabled(true);
        lineChart.getAxisRight().setLabelCount(4, false);
        lineChart.getAxisRight().setAxisMinimum(0.0f);
        lineChart.getAxisRight().setStartAtZero(true);
        lineChart.setOnChartValueSelectedListener(new StateListAnimator(c39703pxO));
        lineChart.invalidate();
    }

    /* JADX INFO: renamed from: o.pxN$ActionBar */
    public static final class ActionBar extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return pTB.formatICUCompact$default(java.lang.Float.valueOf(f), null, null, null, null, 15, null);
        }
    }

    /* JADX INFO: renamed from: o.pxN$Activity */
    public static final class Activity extends ValueFormatter {
        public final /* synthetic */ C39703pxO OLrzqt;

        public Activity(C39703pxO c39703pxO) {
            this.OLrzqt = c39703pxO;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            java.lang.Object objM7377constructorimpl;
            C39703pxO c39703pxO = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(c39703pxO.AEQbTJ().get((int) f))), null, 1, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = java.lang.String.valueOf(f);
            }
            return (java.lang.String) objM7377constructorimpl;
        }
    }

    /* JADX INFO: renamed from: o.pxN$StateListAnimator */
    public static final class StateListAnimator implements OnChartValueSelectedListener {
        public final /* synthetic */ C39703pxO copydefault;

        public StateListAnimator(C39703pxO c39703pxO) {
            this.copydefault = c39703pxO;
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            java.lang.Object data = entry != null ? entry.getData() : null;
            C39709pxU c39709pxU = data instanceof C39709pxU ? (C39709pxU) data : null;
            if (c39709pxU == null) {
                C39702pxN.this.KWHzl((java.util.List<C39709pxU>) yDY.AhwBna());
                return;
            }
            C39702pxN c39702pxN = C39702pxN.this;
            java.util.List<C39709pxU> listAhwBna = this.copydefault.OLrzqt().get(java.lang.String.valueOf(c39709pxU.AhwBna()));
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            c39702pxN.KWHzl(listAhwBna);
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            java.util.Map<java.lang.String, java.util.List<C39709pxU>> mapOLrzqt = this.copydefault.OLrzqt();
            java.lang.String strKWHzl = this.copydefault.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            java.util.List<C39709pxU> listAhwBna = mapOLrzqt.get(strKWHzl);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            C39702pxN.this.KWHzl(listAhwBna);
        }
    }

    /* JADX INFO: renamed from: o.pxN$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public final class Application extends RecyclerView.Adapter<ActionBar> {
        public java.util.List<C39709pxU> OLrzqt = yDY.AhwBna();

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        public final void KWHzl(@NotNull java.util.List<C39709pxU> list) {
            RecyclerView recyclerView;
            Intrinsics.checkNotNullParameter(list, "");
            if (Intrinsics.EZpvd(list, this.OLrzqt)) {
                return;
            }
            this.OLrzqt = list;
            notifyDataSetChanged();
            C36097oPd c36097oPdAEQbTJ = C39702pxN.this.AEQbTJ();
            if (c36097oPdAEQbTJ != null && (recyclerView = c36097oPdAEQbTJ.KWHzl) != null) {
                recyclerView.requestLayout();
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C39702pxN.this), null, null, new UnlockTokenScheduleFragment$ScheduleAdapter$items$1(C39702pxN.this, null), 3, null);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C36111oPr c36111oPrEZpvd = C36111oPr.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c36111oPrEZpvd, "");
            return new ActionBar(this, c36111oPrEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            C36111oPr c36111oPrOLrzqt = actionBar.OLrzqt();
            C39702pxN c39702pxN = C39702pxN.this;
            C39709pxU c39709pxU = this.OLrzqt.get(i);
            c36111oPrOLrzqt.copydefault.setText(c39709pxU.valueOf());
            c36111oPrOLrzqt.AEQbTJ.setImageTintList(android.content.res.ColorStateList.valueOf(c39709pxU.EZpvd()));
            c36111oPrOLrzqt.KWHzl.setText(pTB.formatICUCompact$default(java.lang.Long.valueOf(c39709pxU.AEQbTJ()), null, null, null, null, 15, null) + " " + c39702pxN.valueOf().AEQbTJ());
            c36111oPrOLrzqt.OLrzqt.setText(C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(c39709pxU.copydefault()), "USD", RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(2), DisplaySign.AUTO, Notation.COMPACT_SHORT, null, 32, null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C39702pxN.this.gEmmrt().KWHzl().getValue().booleanValue() ? this.OLrzqt.size() : java.lang.Math.min(5, this.OLrzqt.size());
        }

        /* JADX INFO: renamed from: o.pxN$Application$ActionBar */
        public final class ActionBar extends RecyclerView.ViewHolder {
            public final C36111oPr KWHzl;
            public final /* synthetic */ Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C36111oPr OLrzqt() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull Application application, C36111oPr c36111oPr) {
                super(c36111oPr.getRoot());
                Intrinsics.checkNotNullParameter(c36111oPr, "");
                this.copydefault = application;
                this.KWHzl = c36111oPr;
            }
        }
    }

    public final void KWHzl(java.util.List<C39709pxU> list) {
        RecyclerView recyclerView;
        C36112oPs c36112oPs;
        ConstraintLayout root;
        RecyclerView recyclerView2;
        C36112oPs c36112oPs2;
        ConstraintLayout root2;
        android.widget.LinearLayout linearLayout;
        this.valueOf.KWHzl(CollectionsKt___CollectionsKt.EZpvd(list, new ComponentCallbacks2()));
        C36097oPd c36097oPd = this.AYXKKw;
        if (c36097oPd != null && (linearLayout = c36097oPd.AEQbTJ) != null) {
            linearLayout.setVisibility(list.size() > 5 ? 0 : 8);
        }
        if (list.isEmpty()) {
            C36097oPd c36097oPd2 = this.AYXKKw;
            if (c36097oPd2 != null && (c36112oPs2 = c36097oPd2.valueOf) != null && (root2 = c36112oPs2.getRoot()) != null) {
                root2.setVisibility(8);
            }
            C36097oPd c36097oPd3 = this.AYXKKw;
            if (c36097oPd3 == null || (recyclerView2 = c36097oPd3.KWHzl) == null) {
                return;
            }
            recyclerView2.setVisibility(8);
            return;
        }
        C36097oPd c36097oPd4 = this.AYXKKw;
        if (c36097oPd4 != null && (c36112oPs = c36097oPd4.valueOf) != null && (root = c36112oPs.getRoot()) != null) {
            root.setVisibility(0);
        }
        C36097oPd c36097oPd5 = this.AYXKKw;
        if (c36097oPd5 == null || (recyclerView = c36097oPd5.KWHzl) == null) {
            return;
        }
        recyclerView.setVisibility(0);
    }
}
