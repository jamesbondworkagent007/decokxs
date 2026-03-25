package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$onPeriodFilterSelect$1;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$setListener$4;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$setListener$6;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$setListener$7;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType;
import com.okinc.components.track.TrackChannel;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.List;
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
import o.C25937jLx;
import o.C40525qZb;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25925jLl extends AbstractC25931jLr implements InterfaceC49363unD, qXK {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C42784rcu copydefault;
    public boolean gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final /* synthetic */ qXB AEQbTJ = new qXB();
    public final int AhwBna = qZH.ActionBar.QfJbVf;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jLn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25925jLl.KWHzl();
        }
    });
    public FuturesAnalysisRankingPnlType AYXKKw = FuturesAnalysisRankingPnlType.NET_PNL;
    public FuturesAnalysisRankingPeriod EZpvd = FuturesAnalysisRankingPeriod.PERIOD_30D;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.AEQbTJ.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.AEQbTJ.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf() {
        this.AEQbTJ.copydefault();
    }

    public <T extends InterfaceC49369unJ<T>, A> Flow<A> AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
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

    public C25925jLl() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FuturesAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.jLl$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jLl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesAnalysisViewModel AYXKKw() {
        return (FuturesAnalysisViewModel) this.valueOf.getValue();
    }

    public static final C25932jLs KWHzl() {
        return new C25932jLs(null, null, false, false, 15, null);
    }

    public final C25932jLs AEQbTJ() {
        return (C25932jLs) this.KWHzl.getValue();
    }

    public final void copydefault(FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType) {
        AppCompatTextView appCompatTextView;
        C28005kLj c28005kLj;
        android.widget.TextView textViewCopydefault;
        if (futuresAnalysisRankingPnlType != this.AYXKKw) {
            AYXKKw().OLrzqt(futuresAnalysisRankingPnlType, this.EZpvd);
        }
        this.AYXKKw = futuresAnalysisRankingPnlType;
        C42784rcu c42784rcu = this.copydefault;
        if (c42784rcu != null && (c28005kLj = c42784rcu.OLrzqt) != null && (textViewCopydefault = c28005kLj.copydefault()) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            textViewCopydefault.setText(futuresAnalysisRankingPnlType.onGetTitle(contextRequireContext));
        }
        C42784rcu c42784rcu2 = this.copydefault;
        if (c42784rcu2 == null || (appCompatTextView = c42784rcu2.AYXKKw) == null) {
            return;
        }
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        appCompatTextView.setText(futuresAnalysisRankingPnlType.onGetTitle(contextRequireContext2).toString());
    }

    private final void AEQbTJ(FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod) {
        C28005kLj c28005kLj;
        android.widget.TextView textViewCopydefault;
        if (futuresAnalysisRankingPeriod != this.EZpvd) {
            AYXKKw().OLrzqt(this.AYXKKw, futuresAnalysisRankingPeriod);
        }
        this.EZpvd = futuresAnalysisRankingPeriod;
        C42784rcu c42784rcu = this.copydefault;
        if (c42784rcu == null || (c28005kLj = c42784rcu.EZpvd) == null || (textViewCopydefault = c28005kLj.copydefault()) == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        textViewCopydefault.setText(futuresAnalysisRankingPeriod.onGetTitle(contextRequireContext));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42784rcu c42784rcuAEQbTJ = C42784rcu.AEQbTJ(view);
        OLrzqt(c42784rcuAEQbTJ.copydefault, c42784rcuAEQbTJ.AEQbTJ, c42784rcuAEQbTJ.KWHzl);
        c42784rcuAEQbTJ.copydefault.setGravity(17);
        c42784rcuAEQbTJ.djBIcL.setAdapter(AEQbTJ());
        c42784rcuAEQbTJ.djBIcL.setItemAnimator(null);
        c42784rcuAEQbTJ.djBIcL.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.copydefault = c42784rcuAEQbTJ;
        copydefault(FuturesAnalysisRankingPnlType.NET_PNL);
        AEQbTJ(FuturesAnalysisRankingPeriod.PERIOD_30D);
        C32866mlf.onEvent$default("FuturesAnalysis_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        values();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    private final void values() {
        C28005kLj c28005kLj;
        C28005kLj c28005kLj2;
        C42784rcu c42784rcu = this.copydefault;
        if (c42784rcu != null && (c28005kLj2 = c42784rcu.OLrzqt) != null) {
            c28005kLj2.setOnClickListener(new ActionBar(c28005kLj2, 1000L, this));
        }
        C42784rcu c42784rcu2 = this.copydefault;
        if (c42784rcu2 == null || (c28005kLj = c42784rcu2.EZpvd) == null) {
            return;
        }
        c28005kLj.setOnClickListener(new Application(c28005kLj, 1000L, this));
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        getChildFragmentManager().setFragmentResultListener("request_key_pnl_type", this, new FragmentResultListener() { // from class: o.jLm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                this.EZpvd.AEQbTJ(str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("request_key_period", this, new FragmentResultListener() { // from class: o.jLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                this.EZpvd.copydefault(str, bundle);
            }
        });
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AYXKKw(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$setListener$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd((InterfaceC49371unL<? extends List<C25937jLx>>) obj2);
            }
        }, null, new FuturesAnalysisRankingFragment$setListener$4(this, null), 2, null);
        collectLatestOnLifecycle(AYXKKw(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingFragment$setListener$5
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).AhwBna();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ((PayloadPeriod) obj2);
            }
        }, Lifecycle.State.RESUMED, new FuturesAnalysisRankingFragment$setListener$6(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRankingFragment$setListener$7(this, null), 3, null);
    }

    public final void EZpvd(InterfaceC49371unL<? extends java.util.List<C25937jLx>> interfaceC49371unL) {
        java.lang.String strCopydefault;
        if ((interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) || (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
            if (this.gEmmrt) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            EZpvd(qZH.PendingIntent.GQzpsZ, qZH.PendingIntent.hwkNQP, qZH.PendingIntent.gFTCsA, new Function0() { // from class: o.jLk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25925jLl.copydefault(this.AEQbTJ);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            this.gEmmrt = true;
            valueOf();
            copydefault((java.util.List<C25937jLx>) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        this.gEmmrt = true;
        FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod = this.EZpvd;
        if (futuresAnalysisRankingPeriod == FuturesAnalysisRankingPeriod.PERIOD_ALL) {
            strCopydefault = C33070mpX.AYXKKw(qZH.PendingIntent.hGuIrQ);
        } else {
            strCopydefault = C33069mpW.copydefault(qZH.PendingIntent.pXZxY, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(futuresAnalysisRankingPeriod.getNum()))));
        }
        qXK.StateListAnimator.showEmptyState$default(this, (java.lang.String) null, strCopydefault, (java.lang.String) null, 0, (Function0) null, 29, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(C25925jLl c25925jLl) {
        c25925jLl.onRefresh("FuturesAnalysisOverviewFragment", c25925jLl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jLl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25925jLl KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25925jLl c25925jLl) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c25925jLl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.jLl$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25925jLl EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25925jLl c25925jLl) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c25925jLl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.DbNXlk();
            }
        }
    }

    public final void copydefault(java.util.List<C25937jLx> list) {
        AEQbTJ().copydefault(list);
    }

    public final void AEQbTJ(java.lang.String str, android.os.Bundle bundle) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "request_key_pnl_type")) {
            FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType = (FuturesAnalysisRankingPnlType) CollectionsKt___CollectionsKt.AkhnZx(FuturesAnalysisRankingPnlType.getEntries(), bundle.getInt("key.select_index"));
            if (futuresAnalysisRankingPnlType == null) {
                return;
            }
            copydefault(futuresAnalysisRankingPnlType);
            C32866mlf.onEvent$default("TradeJournal_PerformanceByTicker_SortingBy_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str, android.os.Bundle bundle) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "request_key_period")) {
            FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod = (FuturesAnalysisRankingPeriod) CollectionsKt___CollectionsKt.AkhnZx(FuturesAnalysisRankingPeriod.getEntries(), bundle.getInt("key.select_index"));
            if (futuresAnalysisRankingPeriod == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRankingFragment$onPeriodFilterSelect$1(this, null), 3, null);
            AEQbTJ(futuresAnalysisRankingPeriod);
            C32866mlf.onEvent$default("FuturesAnalysis_PerformanceByTicker_SelectTime_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    public final void OLrzqt() {
        int iIndexOf = FuturesAnalysisRankingPnlType.getEntries().indexOf(this.AYXKKw);
        InterfaceC56445yFq<FuturesAnalysisRankingPnlType> entries = FuturesAnalysisRankingPnlType.getEntries();
        C40525qZb.TaskDescription taskDescription = C40525qZb.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C40525qZb c40525qZbEZpvd = taskDescription.EZpvd("request_key_pnl_type", contextRequireContext, entries, iIndexOf);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c40525qZbEZpvd.show(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        int iIndexOf = FuturesAnalysisRankingPeriod.getEntries().indexOf(this.EZpvd);
        InterfaceC56445yFq<FuturesAnalysisRankingPeriod> entries = FuturesAnalysisRankingPeriod.getEntries();
        C40525qZb.TaskDescription taskDescription = C40525qZb.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C40525qZb c40525qZbEZpvd = taskDescription.EZpvd("request_key_period", contextRequireContext, entries, iIndexOf);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c40525qZbEZpvd.show(childFragmentManager);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        AYXKKw().OLrzqt(this.AYXKKw, this.EZpvd);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(PayloadPeriod payloadPeriod) {
        FuturesAnalysisRankingPeriod next;
        if (payloadPeriod != null) {
            java.util.Iterator<FuturesAnalysisRankingPeriod> it = FuturesAnalysisRankingPeriod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.getPayload() == payloadPeriod) {
                        break;
                    }
                }
            }
            FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod = next;
            if (futuresAnalysisRankingPeriod != null) {
                AEQbTJ(futuresAnalysisRankingPeriod);
            }
        }
    }
}
