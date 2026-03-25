package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.data.Entry;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.overview.data.model.CumulativePnlPo;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$initView$1$2$1;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$4;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$5;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$6;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$7;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$9;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$updateTotalPnl$1;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.market.widget.FlowedChipsView;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C25915jLb;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jKQ extends jKZ implements InterfaceC49363unD, qXK {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C42782rcs AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public boolean KWHzl;
    public boolean copydefault;
    public final /* synthetic */ qXB OLrzqt = new qXB();
    public final int djBIcL = qZH.ActionBar.dzCpvv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.OLrzqt.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.OLrzqt.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.OLrzqt.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, continuation);
    }

    public <T extends InterfaceC49369unJ<T>, A> Flow<A> KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
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

    public jKQ() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FuturesAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jKQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesAnalysisViewModel gEmmrt() {
        return (FuturesAnalysisViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42782rcs c42782rcsOLrzqt = C42782rcs.OLrzqt(view);
        int i = 0;
        OLrzqt(c42782rcsOLrzqt.KWHzl, c42782rcsOLrzqt.djBIcL, c42782rcsOLrzqt.EZpvd, c42782rcsOLrzqt.copydefault, c42782rcsOLrzqt.gEmmrt);
        c42782rcsOLrzqt.KWHzl.setGravity(17);
        FlowedChipsView flowedChipsView = c42782rcsOLrzqt.DbNXlk;
        C40839qfX c40839qfX = new C40839qfX();
        FlowedChipsView.Application.Activity[] activityArr = (FlowedChipsView.Application.Activity[]) AnalysisOverviewPeriod.getEntries().toArray(new AnalysisOverviewPeriod[0]);
        java.lang.Object[] array = AnalysisOverviewPeriod.getEntries().toArray(new AnalysisOverviewPeriod[0]);
        int length = array.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (gEmmrt().OLrzqt() == ((AnalysisOverviewPeriod) array[i])) {
                break;
            } else {
                i++;
            }
        }
        flowedChipsView.setData(c40839qfX, activityArr, i, new Function2() { // from class: o.jKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jKQ.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue(), (AnalysisOverviewPeriod) obj2);
            }
        });
        C55320xhi c55320xhi = c42782rcsOLrzqt.OcIXYQ;
        Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
        OLrzqt(c55320xhi, qZH.PendingIntent.inahnb);
        C55320xhi c55320xhi2 = c42782rcsOLrzqt.AuCTel;
        Intrinsics.checkNotNullExpressionValue(c55320xhi2, "");
        OLrzqt(c55320xhi2, qZH.PendingIntent.sRzUNh);
        this.AEQbTJ = c42782rcsOLrzqt;
    }

    public static final Unit EZpvd(jKQ jkq, int i, AnalysisOverviewPeriod analysisOverviewPeriod) {
        Intrinsics.checkNotNullParameter(analysisOverviewPeriod, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(jkq), null, null, new FuturesAnalysisOverviewFragment$initView$1$2$1(jkq, null), 3, null);
        jkq.onRefresh("FuturesAnalysisOverviewFragment", jkq);
        C32866mlf.onEvent$default("FuturesAnalysis_OverallPerformance_SelectTime_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        jHY jhy;
        C55258xgZ c55258xgZ;
        AppCompatImageView appCompatImageView;
        jHY jhy2;
        C42782rcs c42782rcs = this.AEQbTJ;
        if (c42782rcs != null && (jhy2 = c42782rcs.valueOf) != null) {
            jhy2.setOnClickListener(new View.OnClickListener() { // from class: o.jKR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jKQ.KWHzl(this.EZpvd, view);
                }
            });
        }
        C42782rcs c42782rcs2 = this.AEQbTJ;
        if (c42782rcs2 != null && (appCompatImageView = c42782rcs2.gEmmrt) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.jKS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jKQ.copydefault(this.copydefault, view);
                }
            });
        }
        collectLatestOnLifecycle(gEmmrt(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL<C25915jLb>) obj2);
            }
        }, Lifecycle.State.CREATED, new FuturesAnalysisOverviewFragment$setListener$4(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisOverviewFragment$setListener$5(this, null), 3, null);
        FuturesAnalysisViewModel futuresAnalysisViewModelGEmmrt = gEmmrt();
        FuturesAnalysisOverviewFragment$setListener$6 futuresAnalysisOverviewFragment$setListener$6 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).AhwBna();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ((PayloadPeriod) obj2);
            }
        };
        Lifecycle.State state = Lifecycle.State.RESUMED;
        collectLatestOnLifecycle(futuresAnalysisViewModelGEmmrt, futuresAnalysisOverviewFragment$setListener$6, state, new FuturesAnalysisOverviewFragment$setListener$7(this, null));
        collectLatestOnLifecycle(gEmmrt(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.overview.ui.FuturesAnalysisOverviewFragment$setListener$8
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((FuturesAnalysisViewModel.StateListAnimator) obj).gEmmrt());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).copydefault(((Boolean) obj2).booleanValue());
            }
        }, state, new FuturesAnalysisOverviewFragment$setListener$9(this, null));
        C42782rcs c42782rcs3 = this.AEQbTJ;
        if (c42782rcs3 != null && (c55258xgZ = c42782rcs3.fetchVPNInfo) != null) {
            c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        }
        C42782rcs c42782rcs4 = this.AEQbTJ;
        if (c42782rcs4 == null || (jhy = c42782rcs4.AYXKKw) == null) {
            return;
        }
        jhy.setOnHighlightDataCallback(new StateListAnimator(jhy));
    }

    public static final void KWHzl(jKQ jkq, android.view.View view) {
        AppCompatImageView appCompatImageView;
        C42782rcs c42782rcs = jkq.AEQbTJ;
        if (c42782rcs != null && (appCompatImageView = c42782rcs.gEmmrt) != null) {
            appCompatImageView.performClick();
        }
        C32866mlf.onEvent$default("FuturesAnalysis_OverallPerformance_Chart_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final void copydefault(jKQ jkq, android.view.View view) {
        C42782rcs c42782rcs = jkq.AEQbTJ;
        if (c42782rcs != null) {
            jkq.copydefault(c42782rcs);
        }
        jkq.gEmmrt().gEmmrt();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator implements InterfaceC25847jIo {
        public final /* synthetic */ jHY AEQbTJ;

        public StateListAnimator(jHY jhy) {
            this.AEQbTJ = jhy;
        }

        @Override // o.InterfaceC25847jIo
        public void OLrzqt(Entry entry, int i, float f, float f2) {
            AppCompatTextView appCompatTextView;
            AppCompatTextView appCompatTextView2;
            Intrinsics.checkNotNullParameter(entry, "");
            jKQ.this.copydefault(C33129mqd.gEmmrt(java.lang.Float.valueOf(entry.getY())));
            C42782rcs c42782rcs = jKQ.this.AEQbTJ;
            if (c42782rcs != null && (appCompatTextView2 = c42782rcs.DTwDnp) != null) {
                appCompatTextView2.setVisibility(4);
            }
            C42782rcs c42782rcs2 = jKQ.this.AEQbTJ;
            if (c42782rcs2 == null || (appCompatTextView = c42782rcs2.QKVWgx) == null) {
                return;
            }
            appCompatTextView.setVisibility(4);
        }

        @Override // o.InterfaceC25847jIo
        public void KWHzl() {
            AppCompatTextView appCompatTextView;
            AppCompatTextView appCompatTextView2;
            C42782rcs c42782rcs = jKQ.this.AEQbTJ;
            if (c42782rcs != null && (appCompatTextView2 = c42782rcs.DTwDnp) != null) {
                appCompatTextView2.setVisibility(0);
            }
            C42782rcs c42782rcs2 = jKQ.this.AEQbTJ;
            if (c42782rcs2 != null && (appCompatTextView = c42782rcs2.QKVWgx) != null) {
                appCompatTextView.setVisibility(0);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(jKQ.this), null, null, new FuturesAnalysisOverviewFragment$setListener$11$1$onHighlightCleared$1(jKQ.this, this.AEQbTJ, null), 3, null);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ jKQ AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jKQ jkq, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = jkq;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.copydefault(this.EZpvd);
                java.lang.String string = this.AEQbTJ.getString(qZH.PendingIntent.values);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ jKQ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jKQ jkq) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = jkq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("FuturesAnalysis_OverallPerformance_QuestionIcon_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.KWHzl.AEQbTJ();
            }
        }
    }

    public final void copydefault(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisOverviewFragment$updateTotalPnl$1(this, str, null), 3, null);
    }

    public final void KWHzl(C42782rcs c42782rcs, InterfaceC49371unL<C25915jLb> interfaceC49371unL) {
        if ((interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) || (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
            if (this.KWHzl) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
            jHY jhy = c42782rcs.valueOf;
            Intrinsics.checkNotNullExpressionValue(jhy, "");
            jhy.setVisibility(8);
            jHY jhy2 = c42782rcs.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(jhy2, "");
            jhy2.setVisibility(8);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            EZpvd(qZH.PendingIntent.GQzpsZ, qZH.PendingIntent.hwkNQP, qZH.PendingIntent.gFTCsA, new Function0() { // from class: o.jKT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jKQ.valueOf(this.EZpvd);
                }
            });
            jHY jhy3 = c42782rcs.valueOf;
            Intrinsics.checkNotNullExpressionValue(jhy3, "");
            jhy3.setVisibility(8);
            jHY jhy4 = c42782rcs.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(jhy4, "");
            jhy4.setVisibility(8);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            this.KWHzl = true;
            KWHzl();
            copydefault(c42782rcs, (C25915jLb) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault(), false);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        this.KWHzl = true;
        KWHzl();
        copydefault(c42782rcs, C25915jLb.Companion.OLrzqt(), true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit valueOf(jKQ jkq) {
        jkq.onRefresh("FuturesAnalysisOverviewFragment", jkq);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisOverviewFragment$showPnlAnalysisDescBottomSheet$1(this, null), 3, null);
    }

    public final void copydefault(C42782rcs c42782rcs, C25915jLb c25915jLb, boolean z) {
        java.lang.String string;
        java.lang.String strAEQbTJ;
        java.lang.String cumulativePnl;
        java.lang.String cumulativePnl2;
        FlowedChipsView flowedChipsView;
        if (z) {
            Group group = c42782rcs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            Group group2 = c42782rcs.copydefault;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(8);
            jHY jhy = c42782rcs.valueOf;
            Intrinsics.checkNotNullExpressionValue(jhy, "");
            jhy.setVisibility(8);
            jHY jhy2 = c42782rcs.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(jhy2, "");
            jhy2.setVisibility(8);
            AppCompatImageView appCompatImageView = c42782rcs.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            this.copydefault = false;
            c42782rcs.gEmmrt.setRotation(0.0f);
        } else {
            Group group3 = c42782rcs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group3, "");
            group3.setVisibility(0);
            Group group4 = c42782rcs.copydefault;
            Intrinsics.checkNotNullExpressionValue(group4, "");
            group4.setVisibility(this.copydefault ? 0 : 8);
            jHY jhy3 = c42782rcs.valueOf;
            Intrinsics.checkNotNullExpressionValue(jhy3, "");
            jhy3.setVisibility(this.copydefault ^ true ? 0 : 8);
            jHY jhy4 = c42782rcs.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(jhy4, "");
            jhy4.setVisibility(this.copydefault ? 0 : 8);
            AppCompatImageView appCompatImageView2 = c42782rcs.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
        }
        android.content.Context context = getContext();
        if (context != null) {
            C42782rcs c42782rcs2 = this.AEQbTJ;
            AnalysisOverviewPeriod analysisOverviewPeriod = (AnalysisOverviewPeriod) CollectionsKt___CollectionsKt.AkhnZx(AnalysisOverviewPeriod.getEntries(), (c42782rcs2 == null || (flowedChipsView = c42782rcs2.DbNXlk) == null) ? 0 : flowedChipsView.OLrzqt());
            c42782rcs.QVAiDq.setTextValue(analysisOverviewPeriod != null ? analysisOverviewPeriod.getPnlTitle() : null);
            AppCompatTextView appCompatTextView = c42782rcs.QbewEr;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView, c25915jLb.hDKMBd(), c25915jLb.iwGUEr(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            AppCompatTextView appCompatTextView2 = c42782rcs.QKVWgx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView2, c25915jLb.AuCTel(), c25915jLb.fIwbmz(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            c42782rcs.UeEOUB.setText(c25915jLb.AubY());
            c42782rcs.QfsBiF.setText(c25915jLb.uzCIH());
            c42782rcs.ORxRYg.setText(c25915jLb.getFieldNames());
            AppCompatTextView appCompatTextView3 = c42782rcs.fARcdN;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView3, c25915jLb.KWHzl(), c25915jLb.copydefault(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            c42782rcs.fIwbmz.setText(c25915jLb.AEQbTJ());
            c42782rcs.fJNWhG.setText(c25915jLb.OLrzqt());
            AppCompatTextView appCompatTextView4 = c42782rcs.QOLQEE;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView4, c25915jLb.isConnected(), c25915jLb.fARcdN(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            c42782rcs.sSMYrx.setText(c25915jLb.ejfBZ());
            c42782rcs.zuBGHE.setText(c25915jLb.fJNWhG());
            AppCompatTextView appCompatTextView5 = c42782rcs.AubY;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView5, c25915jLb.AkhnZx(), c25915jLb.DbNXlk(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            AppCompatTextView appCompatTextView6 = c42782rcs.wlaJM;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView6, c25915jLb.AhwBna(), c25915jLb.fetchVPNInfo(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            c42782rcs.uzCIH.setText(c25915jLb.gEmmrt());
            c42782rcs.zsXlph.setText(c25915jLb.valueOf());
            AppCompatTextView appCompatTextView7 = c42782rcs.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView7, c25915jLb.AYXKKw(), c25915jLb.djBIcL(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
            AppCompatTextView appCompatTextView8 = c42782rcs.aKErDB;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView8, c25915jLb.AuCTelauCTel(), c25915jLb.wlaJM(), 0, 0, C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context), false, 44, (java.lang.Object) null);
        }
        c42782rcs.AEQbTJ.setPercentage(c25915jLb.values());
        jHX jhx = new jHX(false, false, false, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2556, null);
        java.util.List<Entry> listEZpvd = c25915jLb.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        int i = 0;
        for (java.lang.Object obj : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.Object data = ((Entry) obj).getData();
            CumulativePnlPo cumulativePnlPo = data instanceof CumulativePnlPo ? (CumulativePnlPo) data : null;
            if (cumulativePnlPo == null || (string = java.lang.Long.valueOf(cumulativePnlPo.getDateTime()).toString()) == null) {
                string = "";
            }
            float fDjBIcL = (cumulativePnlPo == null || (cumulativePnl2 = cumulativePnlPo.getCumulativePnl()) == null) ? 0.0f : C33129mqd.djBIcL(cumulativePnl2);
            float fDjBIcL2 = C33129mqd.djBIcL(java.lang.Integer.valueOf(i));
            if (cumulativePnlPo == null || (cumulativePnl = cumulativePnlPo.getCumulativePnl()) == null || (strAEQbTJ = gEmmrt().AEQbTJ(cumulativePnl)) == null) {
                strAEQbTJ = "";
            }
            arrayList.add(new C25833jIa(string, fDjBIcL, fDjBIcL2, strAEQbTJ));
            i++;
        }
        c42782rcs.valueOf.EZpvd(jhx);
        c42782rcs.valueOf.setData(new jHZ(arrayList, OLrzqt(true)));
        c42782rcs.AYXKKw.setData(new jHZ(arrayList, OLrzqt(false)));
    }

    public final jHW OLrzqt(boolean z) {
        return new jHW(C33070mpX.copydefault(C52761wXj.Activity.iKEqwx), 1.5f, 0.0f, 0.0f, null, true, false, false, true, -1, false, !z, 1180, null);
    }

    public final void copydefault(C42782rcs c42782rcs) {
        android.view.View root;
        this.copydefault = !this.copydefault;
        Group group = c42782rcs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        Group group2 = c42782rcs.copydefault;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(this.copydefault ? 0 : 8);
        OLrzqt();
        jHY jhy = c42782rcs.valueOf;
        Intrinsics.checkNotNullExpressionValue(jhy, "");
        jhy.setVisibility(this.copydefault ^ true ? 0 : 8);
        jHY jhy2 = c42782rcs.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(jhy2, "");
        jhy2.setVisibility(this.copydefault ? 0 : 8);
        c42782rcs.gEmmrt.animate().rotation(this.copydefault ? 180.0f : 0.0f).start();
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (root = parentFragment.getView()) == null) {
            root = c42782rcs.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
        }
        C41431qqg.AEQbTJ(root);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisOverviewFragment$updateTradingFeeVisibility$1(this, null), 3, null);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        FlowedChipsView flowedChipsView;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        C42782rcs c42782rcs = this.AEQbTJ;
        AnalysisOverviewPeriod analysisOverviewPeriod = (AnalysisOverviewPeriod) CollectionsKt___CollectionsKt.AkhnZx(AnalysisOverviewPeriod.getEntries(), (c42782rcs == null || (flowedChipsView = c42782rcs.DbNXlk) == null) ? 0 : flowedChipsView.OLrzqt());
        if (analysisOverviewPeriod == null) {
            return false;
        }
        gEmmrt().EZpvd(analysisOverviewPeriod);
        return true;
    }

    public final void KWHzl(AnalysisOverviewPeriod analysisOverviewPeriod) {
        FlowedChipsView flowedChipsView;
        if (analysisOverviewPeriod != null) {
            int i = 0;
            java.lang.Object[] array = AnalysisOverviewPeriod.getEntries().toArray(new AnalysisOverviewPeriod[0]);
            int length = array.length;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (((AnalysisOverviewPeriod) array[i]) == analysisOverviewPeriod) {
                    break;
                } else {
                    i++;
                }
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                C42782rcs c42782rcs = this.AEQbTJ;
                if (c42782rcs != null && (flowedChipsView = c42782rcs.DbNXlk) != null) {
                    flowedChipsView.setSelectedIndex(iIntValue);
                }
                onRefresh("FuturesAnalysisOverviewFragment", this);
            }
        }
    }

    public final void OLrzqt(android.view.View view, @androidx.annotation.StringRes int i) {
        view.setOnClickListener(new ActionBar(view, 1000L, this, i));
    }
}
