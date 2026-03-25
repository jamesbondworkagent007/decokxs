package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.analysis.futures.root.FundingFeeType;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$initFilterChipDisplay$1;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$1;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$2;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$3;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$5;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$6;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$8;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$showAccountSortDialog$1;
import com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$updateAccountFilterChip$1;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.calendar.ui.share.FuturesAnalysisSharingCalendarFragment;
import com.okinc.business.market.features.analysis.futures.sub.calendar.ui.share.FuturesAnalysisVipSharingCalendarFragment;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.share.FuturesAnalysisSharingOverviewFragment;
import com.okinc.business.market.features.analysis.futures.sub.overview.ui.share.FuturesAnalysisVipSharingOverviewFragment;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisSharingRankingFragment;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.share.FuturesAnalysisVipSharingRankingFragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.reminder.OKReminder;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
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
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.jLI;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jIt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25852jIt extends jIG implements InterfaceC49363unD {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public ViewTreeObserver.OnGlobalLayoutListener AYXKKw;
    public boolean KWHzl;
    public C42787rcx OLrzqt;
    public final InterfaceC56387yDm gEmmrt;
    public final int valueOf = qZH.ActionBar.gtdfxv;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jIy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25852jIt.fJNWhG();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jIE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C25852jIt.OLrzqt());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, continuation);
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

    public C25852jIt() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FuturesAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.jIt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jIt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jIt$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment newInstance$default(Application application, android.content.Context context, java.util.Map map, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return application.copydefault(context, map, num);
        }

        public final androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            pUU.EZpvd("FuturesAnalysisRootFragment", "newInstance context: " + context + ", trackingParams: " + map);
            android.os.Bundle bundle = new android.os.Bundle();
            if (map != null) {
                for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue().toString());
                }
            }
            C25852jIt c25852jIt = new C25852jIt();
            android.os.Bundle bundleEnsureArguments = c25852jIt.ensureArguments();
            bundleEnsureArguments.putBundle("key.tracking_bundle", bundle);
            bundleEnsureArguments.putInt("type", num != null ? num.intValue() : 0);
            return c25852jIt;
        }

        public final void EZpvd(@NotNull ComponentActivity componentActivity) {
            Intrinsics.checkNotNullParameter(componentActivity, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), null, null, new FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1(componentActivity, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesAnalysisViewModel fARcdN() {
        return (FuturesAnalysisViewModel) this.gEmmrt.getValue();
    }

    private final InterfaceC8224ayh fIwbmz() {
        return (InterfaceC8224ayh) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8224ayh fJNWhG() {
        return (InterfaceC8224ayh) C43248rlh.KWHzl.AEQbTJ(InterfaceC8224ayh.class);
    }

    private final boolean ejfBZ() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean OLrzqt() {
        User userAhwBna = C55697xoo.OLrzqt.AhwBna();
        return userAhwBna != null && userAhwBna.isVip();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        FuturesAnalysisViewModel futuresAnalysisViewModelFARcdN = fARcdN();
        android.os.Bundle arguments = getArguments();
        futuresAnalysisViewModelFARcdN.AEQbTJ((arguments == null || arguments.getInt("type", 0) == 0) ? FundingFeeType.FundingRanking : FundingFeeType.FundingFee);
        C42787rcx c42787rcxCopydefault = C42787rcx.copydefault(view);
        Intrinsics.copydefault(c42787rcxCopydefault);
        AEQbTJ(c42787rcxCopydefault);
        c42787rcxCopydefault.AYXKKw.OLrzqt(new InterfaceC57903yrG() { // from class: o.jIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C25852jIt.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        c42787rcxCopydefault.AYXKKw.AhwBna(false);
        this.OLrzqt = c42787rcxCopydefault;
        valueOf();
        AEQbTJ();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(C25852jIt c25852jIt, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c25852jIt.gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C42787rcx c42787rcx;
        FragmentContainerView fragmentContainerView;
        android.view.ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.AYXKKw;
        if (onGlobalLayoutListener != null && (c42787rcx = this.OLrzqt) != null && (fragmentContainerView = c42787rcx.OLrzqt) != null && (viewTreeObserver = fragmentContainerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.AYXKKw = null;
        this.OLrzqt = null;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRootFragment$setListener$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRootFragment$setListener$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRootFragment$setListener$3(this, null), 3, null);
        collectLatestOnLifecycle(fARcdN(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$4
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Long.valueOf(((FuturesAnalysisViewModel.StateListAnimator) obj).AYXKKw());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ(((Number) obj2).longValue());
            }
        }, Lifecycle.State.CREATED, new FuturesAnalysisRootFragment$setListener$5(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new FuturesAnalysisRootFragment$setListener$6(this, null));
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, fARcdN(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd((jLI) obj2);
            }
        }, null, new FuturesAnalysisRootFragment$setListener$8(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.jIt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C25852jIt OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25852jIt c25852jIt) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c25852jIt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("FuturesAnalysis_Header_AccountSelector_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.AkhnZx();
            }
        }
    }

    /* JADX INFO: renamed from: o.jIt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C25852jIt OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25852jIt c25852jIt) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c25852jIt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("FuturesAnalysis_Header_CurrencySelector_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.isConnected();
            }
        }
    }

    public final void EZpvd(jHT jht) {
        if (jht == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRootFragment$updateAccountFilterChip$1(this, jht, null), 3, null);
    }

    public final void OLrzqt(java.lang.String str) {
        C28005kLj c28005kLj;
        android.widget.TextView textViewCopydefault;
        C42787rcx c42787rcx = this.OLrzqt;
        if (c42787rcx == null || (c28005kLj = c42787rcx.AEQbTJ) == null || (textViewCopydefault = c28005kLj.copydefault()) == null) {
            return;
        }
        if (str.length() == 0) {
            str = "USD";
        }
        textViewCopydefault.setText(str);
    }

    public final void valueOf() {
        C28005kLj c28005kLj;
        C28005kLj c28005kLj2;
        C42787rcx c42787rcx = this.OLrzqt;
        if (c42787rcx != null && (c28005kLj2 = c42787rcx.copydefault) != null) {
            c28005kLj2.setOnClickListener(new Activity(c28005kLj2, 1000L, this));
        }
        C42787rcx c42787rcx2 = this.OLrzqt;
        if (c42787rcx2 == null || (c28005kLj = c42787rcx2.AEQbTJ) == null) {
            return;
        }
        c28005kLj.setOnClickListener(new TaskDescription(c28005kLj, 1000L, this));
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRootFragment$initFilterChipDisplay$1(this, null), 3, null);
    }

    public final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisRootFragment$showAccountSortDialog$1(this, null), 3, null);
    }

    public final void isConnected() {
        wXX wxxKWHzl = fIwbmz().KWHzl();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        wxxKWHzl.show(childFragmentManager);
    }

    public final void AEQbTJ(final C42787rcx c42787rcx) {
        OKReminder oKReminder = c42787rcx.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(AYXKKw() ? 0 : 8);
        c42787rcx.gEmmrt.setMessage(C33070mpX.AYXKKw(qZH.PendingIntent.hwXsuq));
        c42787rcx.gEmmrt.setStyle(0);
        c42787rcx.gEmmrt.setOnCloseIconCallback(new Function0() { // from class: o.jIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25852jIt.KWHzl(this.OLrzqt, c42787rcx);
            }
        });
    }

    public static final Unit KWHzl(C25852jIt c25852jIt, C42787rcx c42787rcx) {
        C33546myW c33546myWEZpvd;
        c25852jIt.AhwBna();
        C42787rcx c42787rcx2 = c25852jIt.OLrzqt;
        if (c42787rcx2 != null && (c33546myWEZpvd = c42787rcx2.getRoot()) != null) {
            C41431qqg.AEQbTJ(c33546myWEZpvd);
        }
        OKReminder oKReminder = c42787rcx.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(8);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        fARcdN().djBIcL();
        java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fragments) {
            if (obj instanceof InterfaceC33016moW) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC33016moW) it.next()).onRefresh("FuturesAnalysisRootFragment", this);
        }
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("market.futures_analysis_reminder_show", true);
    }

    public final void AhwBna() {
        SPUtils.put("market.futures_analysis_reminder_show", java.lang.Boolean.FALSE);
    }

    public final void djBIcL() {
        FragmentContainerView fragmentContainerView;
        if (!isAdded() || getView() == null) {
            pUU.valueOf(getTAG(), "Fragment not attached or view is null, skip scrolling");
            return;
        }
        C42787rcx c42787rcx = this.OLrzqt;
        if (c42787rcx == null || (fragmentContainerView = c42787rcx.OLrzqt) == null) {
            pUU.valueOf(getTAG(), "rankingContainer is null, skip scrolling");
        } else {
            fragmentContainerView.post(new java.lang.Runnable() { // from class: o.jIv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C25852jIt.djBIcL(this.KWHzl);
                }
            });
        }
    }

    public static final void djBIcL(C25852jIt c25852jIt) {
        C42787rcx c42787rcx;
        FragmentContainerView fragmentContainerView;
        if (!c25852jIt.isAdded() || c25852jIt.getView() == null || (c42787rcx = c25852jIt.OLrzqt) == null) {
            pUU.valueOf(c25852jIt.getTAG(), "Fragment destroyed during post, skip scrolling");
            return;
        }
        if (c42787rcx == null || (fragmentContainerView = c42787rcx.OLrzqt) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = c25852jIt.AYXKKw;
        if (onGlobalLayoutListener != null) {
            try {
                fragmentContainerView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } catch (java.lang.Exception e) {
                pUU.OLrzqt(c25852jIt.getTAG(), "Failed to remove previous listener", e);
            }
        }
        c25852jIt.AYXKKw = c25852jIt.new ActionBar(fragmentContainerView);
        try {
            android.view.ViewTreeObserver viewTreeObserver = fragmentContainerView.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = c25852jIt.AYXKKw;
            Intrinsics.copydefault(onGlobalLayoutListener2);
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener2);
        } catch (java.lang.Exception e2) {
            pUU.OLrzqt(c25852jIt.getTAG(), "Failed to add layout listener", e2);
            c25852jIt.AYXKKw = null;
        }
    }

    /* JADX INFO: renamed from: o.jIt$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ FragmentContainerView AEQbTJ;

        public ActionBar(FragmentContainerView fragmentContainerView) {
            this.AEQbTJ = fragmentContainerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            FragmentContainerView fragmentContainerView;
            NestedScrollView nestedScrollView;
            if (C25852jIt.this.isAdded() && C25852jIt.this.getView() != null && C25852jIt.this.OLrzqt != null) {
                C42787rcx c42787rcx = C25852jIt.this.OLrzqt;
                if (c42787rcx != null && (fragmentContainerView = c42787rcx.OLrzqt) != null) {
                    C42787rcx c42787rcx2 = C25852jIt.this.OLrzqt;
                    if (c42787rcx2 == null || (nestedScrollView = c42787rcx2.AhwBna) == null) {
                        FragmentContainerView fragmentContainerView2 = this.AEQbTJ;
                        C25852jIt c25852jIt = C25852jIt.this;
                        try {
                            fragmentContainerView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } catch (java.lang.Exception e) {
                            pUU.OLrzqt(c25852jIt.getTAG(), "fail to removeOnGlobalLayoutListener ", e);
                        }
                        c25852jIt.AYXKKw = null;
                        return;
                    }
                    int top = fragmentContainerView.getTop();
                    if (top > 0 && !C25852jIt.this.KWHzl) {
                        C25852jIt.this.KWHzl = true;
                        nestedScrollView.scrollTo(0, top);
                        pUU.EZpvd(C25852jIt.this.getTAG(), "Scrolled to ranking fragment at position: " + top);
                    }
                    try {
                        fragmentContainerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } catch (java.lang.Exception e2) {
                        pUU.OLrzqt(C25852jIt.this.getTAG(), "Failed to remove listener after scroll", e2);
                    }
                    C25852jIt.this.AYXKKw = null;
                    return;
                }
                FragmentContainerView fragmentContainerView3 = this.AEQbTJ;
                C25852jIt c25852jIt2 = C25852jIt.this;
                try {
                    fragmentContainerView3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } catch (java.lang.Exception e3) {
                    pUU.OLrzqt(c25852jIt2.getTAG(), "fragmentContainerRanking is null", e3);
                }
                c25852jIt2.AYXKKw = null;
                return;
            }
            pUU.valueOf(C25852jIt.this.getTAG(), "Fragment destroyed during layout, removing listener");
            try {
                this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } catch (java.lang.Exception e4) {
                pUU.OLrzqt(C25852jIt.this.getTAG(), "Failed to remove listener", e4);
            }
            C25852jIt.this.AYXKKw = null;
        }
    }

    public final void copydefault(final long j) {
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (ejfBZ()) {
            listOLrzqt.add(FuturesAnalysisVipSharingOverviewFragment.class);
        }
        if (ejfBZ()) {
            listOLrzqt.add(FuturesAnalysisVipSharingCalendarFragment.class);
        }
        if (ejfBZ()) {
            listOLrzqt.add(FuturesAnalysisVipSharingRankingFragment.class);
        }
        listOLrzqt.add(FuturesAnalysisSharingOverviewFragment.class);
        listOLrzqt.add(FuturesAnalysisSharingCalendarFragment.class);
        listOLrzqt.add(FuturesAnalysisSharingRankingFragment.class);
        java.util.List<java.lang.Class> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
        for (final java.lang.Class cls : listFARcdN) {
            arrayList.add(ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.jIz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25852jIt.OLrzqt(j, (ImageShareParams) obj);
                }
            }), new Function1() { // from class: o.jIx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25852jIt.copydefault(cls, (ShareConfig) obj);
                }
            }));
        }
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(abstractActivityC33041mov, MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, arrayList, false, 0.0f, false, null, null, 62, null));
    }

    public static final Unit OLrzqt(long j, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("futures_analysis");
        imageShareParams.getExtras().putLong("timestamp", j);
        imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.share.bean.image.ImageCustomPreviewConfig.Activity.create$default(com.okinc.share.bean.image.ImageCustomPreviewConfig$Activity, java.lang.Class, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):com.okinc.share.bean.image.ImageCustomPreviewConfig */
    public static final Unit copydefault(java.lang.Class cls, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, cls, null, null, 6, null));
        shareConfig.getPreviewConfig().setEditable(true);
        return Unit.INSTANCE;
    }
}
