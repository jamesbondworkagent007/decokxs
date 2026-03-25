package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo;
import com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$updateContentUi$1;
import com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$viewModelCollect$1;
import com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$viewModelCollect$3;
import com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$viewModelCollect$5;
import com.okinc.components.track.TrackChannel;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
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
import o.C25876jJq;
import o.C52761wXj;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.jIV;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jIX extends AbstractC25868jJi implements InterfaceC49363unD, qXK {
    public final Calendar KWHzl;
    public C42777rcn OLrzqt;
    public final Calendar copydefault;
    public boolean djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final /* synthetic */ qXB EZpvd = new qXB();
    public final int valueOf = qZH.ActionBar.DGUQLIhJrIAr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.EZpvd.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.EZpvd.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.EZpvd.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
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

    public <T extends InterfaceC49369unJ<T>, A> Flow<A> copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx);
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

    public jIX() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FuturesAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$special$$inlined$activityViewModels$default$3
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
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.copydefault = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, 10);
        calendar2.set(1, 2022);
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        this.KWHzl = calendar2;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jIX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesAnalysisViewModel valueOf() {
        return (FuturesAnalysisViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final C42777rcn c42777rcnEZpvd = C42777rcn.EZpvd(view);
        KWHzl(c42777rcnEZpvd.KWHzl, c42777rcnEZpvd.AEQbTJ, c42777rcnEZpvd.EZpvd);
        c42777rcnEZpvd.KWHzl.setGravity(17);
        qYH qyh = c42777rcnEZpvd.copydefault;
        Date time = this.KWHzl.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        Date time2 = this.copydefault.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "");
        qYH.setMonthRange$default(qyh, time, time2, null, 4, null);
        c42777rcnEZpvd.copydefault.setOnMonthChangedCallback(new yHO() { // from class: o.jJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return jIX.copydefault(c42777rcnEZpvd, this, (Date) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
            }
        });
        qYH qyh2 = c42777rcnEZpvd.copydefault;
        C42904rfH c42904rfHCopydefault = C42904rfH.copydefault(android.view.LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(c42904rfHCopydefault, "");
        qyh2.setupMarketView(c42904rfHCopydefault, new Function2() { // from class: o.jJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jIX.AEQbTJ(this.KWHzl, (C42904rfH) obj, (qYM) obj2);
            }
        }, qZH.StateListAnimator.getLocation);
        android.widget.TextView textView = c42777rcnEZpvd.AYXKKw;
        Date time3 = this.copydefault.getTime();
        Intrinsics.checkNotNullExpressionValue(time3, "");
        textView.setText(pTA.formatDate$default(time3, OKDateEnum.DATE_FORMAT_SIMPLE_YM, null, null, 6, null));
        c42777rcnEZpvd.AYXKKw.setTag(this.copydefault.getTime());
        Intrinsics.copydefault(c42777rcnEZpvd);
        OLrzqt(c42777rcnEZpvd, c42777rcnEZpvd.copydefault.KWHzl(), c42777rcnEZpvd.copydefault.copydefault());
        this.OLrzqt = c42777rcnEZpvd;
    }

    public static final Unit copydefault(C42777rcn c42777rcn, jIX jix, Date date, int i, int i2) {
        Intrinsics.checkNotNullParameter(date, "");
        c42777rcn.AYXKKw.setText(pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE_YM, null, null, 6, null));
        c42777rcn.AYXKKw.setTag(date);
        jix.onRefresh("FuturesAnalysisCalendarFragment", jix);
        Intrinsics.copydefault(c42777rcn);
        jix.OLrzqt(c42777rcn, i, i2);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jIX jix, C42904rfH c42904rfH, qYM qym) {
        Intrinsics.checkNotNullParameter(c42904rfH, "");
        jix.EZpvd(c42904rfH, qym);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisCalendarFragment$viewModelCollect$1(this, null), 3, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, valueOf(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$viewModelCollect$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).copydefault((InterfaceC49371unL<C25876jJq>) obj2);
            }
        }, null, new FuturesAnalysisCalendarFragment$viewModelCollect$3(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, valueOf(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.calendar.ui.FuturesAnalysisCalendarFragment$viewModelCollect$4
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Long.valueOf(((FuturesAnalysisViewModel.StateListAnimator) obj).OLrzqt());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd(((Number) obj2).longValue());
            }
        }, null, new FuturesAnalysisCalendarFragment$viewModelCollect$5(this, null), 2, null);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        final C42777rcn c42777rcn = this.OLrzqt;
        if (c42777rcn != null) {
            c42777rcn.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.jIW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jIX.AEQbTJ(c42777rcn, view);
                }
            });
            c42777rcn.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.jIZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jIX.copydefault(c42777rcn, view);
                }
            });
            android.widget.TextView textView = c42777rcn.AYXKKw;
            textView.setOnClickListener(new Application(textView, 1000L, this, c42777rcn));
            C55258xgZ c55258xgZ = c42777rcn.values;
            c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        }
        getChildFragmentManager().setFragmentResultListener("request_key.month_picker", this, new FragmentResultListener() { // from class: o.jJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                jIX.OLrzqt(this.copydefault, str, bundle);
            }
        });
        KWHzl();
    }

    public static final void AEQbTJ(C42777rcn c42777rcn, android.view.View view) {
        C32866mlf.onEvent$default("FuturesAnalysis_TradingCalendar_QuestionIcon_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        qYH.toPreMonth$default(c42777rcn.copydefault, false, 1, null);
    }

    public static final void copydefault(C42777rcn c42777rcn, android.view.View view) {
        qYH.toNextMonth$default(c42777rcn.copydefault, false, 1, null);
    }

    public static final void OLrzqt(jIX jix, java.lang.String str, android.os.Bundle bundle) {
        qYH qyh;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (str.hashCode() == 1476342284 && str.equals("request_key.month_picker")) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(bundle.getLong("key.select_date", 0L));
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                C42777rcn c42777rcn = jix.OLrzqt;
                if (c42777rcn == null || (qyh = c42777rcn.copydefault) == null) {
                    return;
                }
                qyh.setCurrentMonth(new Date(jLongValue), false);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42777rcn AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ jIX OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jIX jix, C42777rcn c42777rcn) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = jix;
            this.AEQbTJ = c42777rcn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault(this.AEQbTJ.copydefault.OLrzqt());
                C32866mlf.onEvent$default("TradeJournal_TradingCalendar_DatePicker_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jIX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, jIX jix) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = jix;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
            }
        }
    }

    public final void EZpvd(C42777rcn c42777rcn, InterfaceC49371unL<C25876jJq> interfaceC49371unL) {
        if ((interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator) || (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar)) {
            if (this.djBIcL) {
                return;
            }
            qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
        } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            EZpvd(qZH.PendingIntent.GQzpsZ, qZH.PendingIntent.hwkNQP, qZH.PendingIntent.gFTCsA, new Function0() { // from class: o.jJb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jIX.KWHzl(this.copydefault);
                }
            });
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                this.djBIcL = true;
                EZpvd();
                AEQbTJ(c42777rcn, (C25876jJq) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            this.djBIcL = true;
            EZpvd();
            AEQbTJ(c42777rcn, C25876jJq.Companion.EZpvd());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(jIX jix) {
        jix.onRefresh("FuturesAnalysisCalendarFragment", jix);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C42777rcn c42777rcn, C25876jJq c25876jJq) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesAnalysisCalendarFragment$updateContentUi$1(c42777rcn, c25876jJq, null), 3, null);
    }

    public final void EZpvd(C42904rfH c42904rfH, qYM qym) {
        java.lang.Object objOLrzqt = qym != null ? qym.OLrzqt() : null;
        C25876jJq.Application application = objOLrzqt instanceof C25876jJq.Application ? (C25876jJq.Application) objOLrzqt : null;
        CalendarPo.CalendarOneDayPo calendarOneDayPoCopydefault = application != null ? application.copydefault() : null;
        if (calendarOneDayPoCopydefault == null) {
            AppCompatTextView appCompatTextView = c42904rfH.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            Group group = c42904rfH.copydefault;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            c42904rfH.OLrzqt.setText(qZH.PendingIntent.getValue);
            return;
        }
        java.lang.String cryptoCode$default = C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(calendarOneDayPoCopydefault.getCumulativePnl()), valueOf().AEQbTJ().OLrzqt().getValue().getUnit(), null, null, DisplaySign.EXCEPT_ZERO, null, null, 54, null);
        int closedPositions = calendarOneDayPoCopydefault.getClosedPositions();
        BigDecimal bigDecimalMultiply = C33129mqd.EZpvd(calendarOneDayPoCopydefault.getWinRate()).multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(bigDecimalMultiply, null, null, DisplaySign.AUTO, null, null, 27, null);
        AppCompatTextView appCompatTextView2 = c42904rfH.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(8);
        Group group2 = c42904rfH.copydefault;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(0);
        c42904rfH.EZpvd.setText(qZH.PendingIntent.GQzpsZsQwTVT);
        c42904rfH.gEmmrt.setText(cryptoCode$default);
        c42904rfH.AYXKKw.setText(qZH.PendingIntent.GcnicV);
        c42904rfH.djBIcL.setText(java.lang.String.valueOf(closedPositions));
        c42904rfH.AhwBna.setText(qZH.PendingIntent.zFtALg);
        c42904rfH.valueOf.setText(iCUPercent$default);
    }

    public final void copydefault(Date date) {
        C25865jJf c25865jJfCopydefault = C25865jJf.Companion.copydefault(this.KWHzl.getTimeInMillis(), this.copydefault.getTimeInMillis(), date != null ? date.getTime() : this.copydefault.getTimeInMillis());
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25865jJfCopydefault.show(childFragmentManager);
    }

    public final void AEQbTJ() {
        jIV.ActionBar actionBar = jIV.Companion;
        Calendar calendar = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        C40529qZf c40529qZfAEQbTJ = actionBar.AEQbTJ(calendar);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c40529qZfAEQbTJ.show(childFragmentManager);
    }

    public final void OLrzqt(C42777rcn c42777rcn, int i, int i2) {
        if (i == 0) {
            c42777rcn.AhwBna.setEnabled(false);
            c42777rcn.gEmmrt.setEnabled(true);
            ImageViewCompat.setImageTintList(c42777rcn.AhwBna, C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
            ImageViewCompat.setImageTintList(c42777rcn.gEmmrt, C33070mpX.AEQbTJ(C52761wXj.Activity.QHmsKR));
            return;
        }
        if (i == i2 - 1) {
            c42777rcn.AhwBna.setEnabled(true);
            c42777rcn.gEmmrt.setEnabled(false);
            ImageViewCompat.setImageTintList(c42777rcn.AhwBna, C33070mpX.AEQbTJ(C52761wXj.Activity.QHmsKR));
            ImageViewCompat.setImageTintList(c42777rcn.gEmmrt, C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
            return;
        }
        c42777rcn.AhwBna.setEnabled(true);
        c42777rcn.gEmmrt.setEnabled(true);
        ImageViewCompat.setImageTintList(c42777rcn.AhwBna, C33070mpX.AEQbTJ(C52761wXj.Activity.QHmsKR));
        ImageViewCompat.setImageTintList(c42777rcn.gEmmrt, C33070mpX.AEQbTJ(C52761wXj.Activity.QHmsKR));
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        FuturesAnalysisViewModel futuresAnalysisViewModelValueOf = valueOf();
        C42777rcn c42777rcn = this.OLrzqt;
        java.lang.Object tag = (c42777rcn == null || (textView = c42777rcn.AYXKKw) == null) ? null : textView.getTag();
        Date date = tag instanceof Date ? (Date) tag : null;
        if (date == null) {
            return false;
        }
        futuresAnalysisViewModelValueOf.OLrzqt(date);
        return true;
    }
}
