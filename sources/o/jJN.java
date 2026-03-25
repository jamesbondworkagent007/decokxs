package o;

import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart.FuturesAnalysisDailyFeeChartFragment$registerSubscribers$2;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel;
import com.okinc.business.market.features.analysis.futures.sub.overview.data.model.CumulativePnlPo;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.Date;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C25905jKs;
import o.C52761wXj;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jJN extends AbstractC25897jKk implements InterfaceC49363unD, qXK {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C42775rcl AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final /* synthetic */ qXB copydefault = new qXB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.copydefault.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.copydefault.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.copydefault.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.DIIpTV;
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

    public jJN() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FundingFeeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart.FuturesAnalysisDailyFeeChartFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart.FuturesAnalysisDailyFeeChartFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart.FuturesAnalysisDailyFeeChartFragment$special$$inlined$activityViewModels$default$3
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jJN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final FundingFeeViewModel EZpvd() {
        return (FundingFeeViewModel) this.KWHzl.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final C42775rcl c42775rclKWHzl = C42775rcl.KWHzl(view);
        KWHzl(c42775rclKWHzl.AEQbTJ, c42775rclKWHzl.OLrzqt, c42775rclKWHzl.EZpvd);
        BarChart barChart = c42775rclKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(barChart, "");
        copydefault(barChart, new Function1() { // from class: o.jJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jJN.copydefault(this.OLrzqt, c42775rclKWHzl, (Entry) obj);
            }
        });
        this.AEQbTJ = c42775rclKWHzl;
    }

    public static final Unit copydefault(jJN jjn, C42775rcl c42775rcl, Entry entry) {
        Intrinsics.copydefault(c42775rcl);
        java.lang.Object data = entry != null ? entry.getData() : null;
        jjn.OLrzqt(c42775rcl, data instanceof C25901jKo ? (C25901jKo) data : null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C42775rcl c42775rcl, C25901jKo c25901jKo) {
        if (c25901jKo != null) {
            if (c25901jKo.AEQbTJ() < AudioStats.AUDIO_AMPLITUDE_NONE) {
                android.content.Context context = getContext();
                if (context != null) {
                    c42775rcl.AYXKKw.setTextColor(C33508mxl.AEQbTJ(context));
                }
            } else if (c25901jKo.AEQbTJ() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                android.content.Context context2 = getContext();
                if (context2 != null) {
                    c42775rcl.AYXKKw.setTextColor(C33508mxl.copydefault(context2));
                }
            } else {
                AppCompatTextView appCompatTextView = c42775rcl.AYXKKw;
                android.content.Context context3 = getContext();
                appCompatTextView.setTextColor(context3 != null ? context3.getColor(C52761wXj.Activity.fdOvFl) : 0);
            }
            if (c25901jKo.KWHzl() == CumulativePnlPo.TimeStep.MONTH.getValue()) {
                c42775rcl.gEmmrt.setText(pTA.formatDate$default(new Date(c25901jKo.EZpvd()), OKDateEnum.DATE_FORMAT_SIMPLE_YM, null, null, 6, null));
            } else {
                c42775rcl.gEmmrt.setText(pTA.formatSimpleDate$default(new Date(c25901jKo.EZpvd()), null, 1, null));
            }
            c42775rcl.AYXKKw.setText(c25901jKo.OLrzqt());
            return;
        }
        c42775rcl.gEmmrt.setText("--");
        c42775rcl.AYXKKw.setText("--");
        AppCompatTextView appCompatTextView2 = c42775rcl.AYXKKw;
        android.content.Context context4 = getContext();
        appCompatTextView2.setTextColor(context4 != null ? context4.getColor(C52761wXj.Activity.fdOvFl) : 0);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
    }

    private final void AYXKKw() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, EZpvd(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart.FuturesAnalysisDailyFeeChartFragment$registerSubscribers$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FundingFeeViewModel.Activity) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FundingFeeViewModel.Activity) obj).OLrzqt((InterfaceC49371unL<C25905jKs>) obj2);
            }
        }, null, new FuturesAnalysisDailyFeeChartFragment$registerSubscribers$2(this, null), 2, null);
    }

    public final void AEQbTJ(C42775rcl c42775rcl, InterfaceC49371unL<C25905jKs> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            if (((C25905jKs) activity.copydefault()).OLrzqt().isEmpty()) {
                AEQbTJ(c42775rcl, new InterfaceC49371unL.TaskDescription(null, 1, null));
                return;
            }
            OLrzqt();
            BarChart barChart = c42775rcl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(barChart, "");
            EZpvd(barChart, (C25905jKs) activity.copydefault());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        boolean z = interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription;
        if (z || (interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator)) {
            C42775rcl c42775rcl2 = this.AEQbTJ;
            if (c42775rcl2 != null) {
                OLrzqt(c42775rcl2, null);
            }
            AEQbTJ(0, qZH.PendingIntent.Dfv, 0, 6, new Function0() { // from class: o.jJV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jJN.AEQbTJ();
                }
            });
            if (z) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            EZpvd(qZH.PendingIntent.finit, 0, qZH.PendingIntent.fetchVPNInfo, new Function0() { // from class: o.jJT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jJN.EZpvd(this.AEQbTJ);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(jJN jjn) {
        FundingFeeViewModel.loadData$default(jjn.EZpvd(), null, null, 3, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(BarChart barChart, C25905jKs c25905jKs) {
        AppCompatTextView appCompatTextView;
        ValueFormatter stateListAnimator;
        AppCompatTextView appCompatTextView2;
        java.lang.Object objWlaJM = CollectionsKt___CollectionsKt.wlaJM(c25905jKs.OLrzqt());
        Intrinsics.copydefault(objWlaJM, "");
        C25901jKo c25901jKo = (C25901jKo) objWlaJM;
        C42775rcl c42775rcl = this.AEQbTJ;
        if (c42775rcl != null) {
            OLrzqt(c42775rcl, c25901jKo);
        }
        java.util.List<C25901jKo> listOLrzqt = c25905jKs.OLrzqt();
        java.util.ArrayList<BarEntry> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        int i = 0;
        for (java.lang.Object obj : listOLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C25901jKo c25901jKo2 = (C25901jKo) obj;
            if (c25901jKo2.KWHzl() == CumulativePnlPo.TimeStep.MONTH.getValue()) {
                c25901jKo2.EZpvd((23 & 1) != 0 ? c25901jKo2.OLrzqt : AudioStats.AUDIO_AMPLITUDE_NONE, (23 & 2) != 0 ? c25901jKo2.copydefault : null, (23 & 4) != 0 ? c25901jKo2.EZpvd : null, (23 & 8) != 0 ? c25901jKo2.AEQbTJ : c25901jKo2.EZpvd() * 1000, (23 & 16) != 0 ? c25901jKo2.KWHzl : 0);
            }
            arrayList.add(new BarEntry(i, C33129mqd.djBIcL(java.lang.Double.valueOf(c25901jKo2.AEQbTJ())), c25901jKo2));
            i++;
        }
        int iKWHzl = c25901jKo.KWHzl();
        CumulativePnlPo.TimeStep timeStep = CumulativePnlPo.TimeStep.MONTH;
        if (iKWHzl == timeStep.getValue()) {
            C42775rcl c42775rcl2 = this.AEQbTJ;
            if (c42775rcl2 != null && (appCompatTextView2 = c42775rcl2.copydefault) != null) {
                appCompatTextView2.setText(C33070mpX.AYXKKw(qZH.PendingIntent.zeUYeG));
            }
        } else {
            C42775rcl c42775rcl3 = this.AEQbTJ;
            if (c42775rcl3 != null && (appCompatTextView = c42775rcl3.copydefault) != null) {
                appCompatTextView.setText(C33070mpX.AYXKKw(qZH.PendingIntent.DBAlnt));
            }
        }
        if (c25901jKo.KWHzl() == timeStep.getValue()) {
            stateListAnimator = new TaskDescription(c25905jKs);
        } else {
            stateListAnimator = new StateListAnimator(c25905jKs);
        }
        XAxis xAxis = barChart.getXAxis();
        xAxis.mAxisMaximum = C33129mqd.djBIcL(java.lang.Integer.valueOf(c25905jKs.OLrzqt().size()));
        xAxis.setValueFormatter(stateListAnimator);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = barChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        android.content.Context context2 = barChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context2, 0.0f, 2, null);
        for (BarEntry barEntry : arrayList) {
            if (C33129mqd.gEmmrt(java.lang.Float.valueOf(barEntry.getY()), 0)) {
                arrayList2.add(java.lang.Integer.valueOf(iTradeFallGraph$default));
            } else if (C33129mqd.AEQbTJ(java.lang.Float.valueOf(barEntry.getY()), 0)) {
                arrayList2.add(java.lang.Integer.valueOf(iTradeRiseGraph$default));
            } else {
                arrayList2.add(java.lang.Integer.valueOf(barChart.getContext().getColor(C52761wXj.Activity.fdOvFl)));
            }
        }
        Application application = new Application();
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setColors(arrayList2);
        barDataSet.setFormLineWidth(1.0f);
        barDataSet.setFormSize(15.0f);
        barDataSet.setDrawValues(false);
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        barDataSet.setHighLightAlpha(13);
        barChart.setRenderer(new jKI(barChart, barChart.getAnimator(), barChart.getViewPortHandler()));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(barDataSet);
        BarData barData = new BarData(arrayList3);
        barData.setBarWidth(0.08f);
        barChart.setData(barData);
        YAxis axisLeft = barChart.getAxisLeft();
        axisLeft.setValueFormatter(application);
        axisLeft.setLabelCount(5, true);
        if (barData.getYMax() == 0.0f && barData.getYMin() == 0.0f) {
            axisLeft.setAxisMinimum(-6.0f);
            axisLeft.setAxisMaximum(6.0f);
        } else {
            axisLeft.setAxisMinimum(barData.getYMin() < 0.0f ? barData.getYMin() * 1.1f : barData.getYMin() * 0.9f);
            axisLeft.setAxisMaximum(barData.getYMin() < 0.0f ? barData.getYMax() * 0.9f : barData.getYMax() * 1.1f);
        }
        barChart.setDragEnabled(true);
        barChart.setDragXEnabled(true);
        barChart.setDragYEnabled(true);
        barChart.moveViewToX(C33129mqd.djBIcL(java.lang.Integer.valueOf(arrayList.size() - 1)));
        barChart.setVisibleXRangeMaximum(6.0f);
        barChart.setVisibleXRangeMinimum(6.0f);
    }

    public static final class TaskDescription extends ValueFormatter {
        public final /* synthetic */ C25905jKs EZpvd;

        public TaskDescription(C25905jKs c25905jKs) {
            this.EZpvd = c25905jKs;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            return (i < 0 || i >= this.EZpvd.OLrzqt().size()) ? "" : pTA.formatDate$default(new Date(this.EZpvd.OLrzqt().get(i).EZpvd()), OKDateEnum.DATE_FORMAT_SIMPLE_YM, null, null, 6, null);
        }
    }

    public static final class StateListAnimator extends ValueFormatter {
        public final /* synthetic */ C25905jKs EZpvd;

        public StateListAnimator(C25905jKs c25905jKs) {
            this.EZpvd = c25905jKs;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            return (i < 0 || i >= this.EZpvd.OLrzqt().size()) ? "" : pTA.formatDate$default(new Date(this.EZpvd.OLrzqt().get(i).EZpvd()), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    public static final class Application extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return pTB.formatICUCompact$default(java.lang.Float.valueOf(f), null, null, null, null, 15, null);
        }
    }

    public final void copydefault(BarChart barChart, final Function1<? super Entry, Unit> function1) {
        barChart.getDescription().setEnabled(false);
        barChart.setDrawGridBackground(false);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(false);
        barChart.setPinchZoom(true);
        barChart.getLegend().setForm(Legend.LegendForm.NONE);
        barChart.setExtraOffsets(0.0f, C55298xhM.dp2pxFloat$default(12.0f, null, 1, null), 0.0f, C55298xhM.dp2pxFloat$default(8.0f, null, 1, null));
        barChart.setNestedScrollingEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.getDescription().setEnabled(false);
        barChart.setHighlightPerDragEnabled(true);
        barChart.setMinOffset(0.0f);
        barChart.getRenderer().getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        barChart.getRenderer().getPaintRender().setStrokeJoin(Paint.Join.ROUND);
        barChart.setTouchEnabled(true);
        barChart.setNoDataText("");
        C41349qpD.setOnEntryHighlighted$default(barChart, (Function0) null, new Function2() { // from class: o.jJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jJN.copydefault(function1, (Entry) obj, (Highlight) obj2);
            }
        }, 1, (java.lang.Object) null);
        barChart.setRenderer(new jKI(barChart, barChart.getAnimator(), barChart.getViewPortHandler()));
        XAxis xAxis = barChart.getXAxis();
        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        barChart.getXAxis().setDrawGridLines(false);
        barChart.getXAxis().setAxisLineColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        barChart.getXAxis().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        barChart.getXAxis().setGranularity(1.0f);
        barChart.getXAxis().setGranularityEnabled(true);
        barChart.getXAxis().setDrawAxisLine(false);
        barChart.getXAxis().setAxisLineWidth(1.0f);
        barChart.setDrawBarShadow(false);
        barChart.setNoDataText("");
        barChart.getLegend().setEnabled(false);
        xAxis.setLabelCount(6, false);
        xAxis.enableGridDashedLine(10.0f, 8.0f, 0.0f);
        xAxis.setTextSize(10.0f);
        C55051xce c55051xce = C55051xce.OLrzqt;
        xAxis.setTypeface(c55051xce.valueOf());
        xAxis.setYOffset(0.0f);
        barChart.setExtraBottomOffset(10.0f);
        barChart.getAxisRight().setEnabled(false);
        YAxis axisLeft = barChart.getAxisLeft();
        axisLeft.setDrawGridLines(true);
        axisLeft.enableGridDashedLine(10.0f, 8.0f, 0.0f);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        axisLeft.setEnabled(true);
        axisLeft.setLabelCount(5, true);
        axisLeft.setTextSize(10.0f);
        axisLeft.setTypeface(c55051xce.valueOf());
        axisLeft.setDrawZeroLine(true);
        axisLeft.setXOffset(10.0f);
        axisLeft.setGridColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        axisLeft.setZeroLineColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        axisLeft.setGranularity(1.0f);
    }

    public static final Unit copydefault(Function1 function1, Entry entry, Highlight highlight) {
        function1.invoke(entry);
        return Unit.INSTANCE;
    }
}
