package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.util.KlineConfigHandle$collectConfigChange$1;
import com.okinc.kline.util.KlineConfigHandle$initKlineConfig$1;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$11;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$13;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$15;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$17;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$19;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$21;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$23;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$25;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$27;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$29;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$3;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$31;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$33;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$35;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$37;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$39;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$41;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$43;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$45;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$47;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$5;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$7;
import com.okinc.kline.util.KlineConfigHandle$subscribeData$9;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.oUL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37883pEf implements InterfaceC49363unD {
    public final C36250oUv AEQbTJ;
    public final oUN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUN KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36250oUv OLrzqt() {
        return this.AEQbTJ;
    }

    public C37883pEf(@NotNull C36250oUv c36250oUv) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.AEQbTJ = c36250oUv;
        this.copydefault = oUN.Companion.OLrzqt();
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

    public final void AEQbTJ(@NotNull C36250oUv c36250oUv, @NotNull ChartViewOutSideConfig chartViewOutSideConfig) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(chartViewOutSideConfig, "");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(c36250oUv);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new KlineConfigHandle$initKlineConfig$1(this, chartViewOutSideConfig, null), 3, null);
    }

    public final void AEQbTJ(@NotNull C36250oUv c36250oUv) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(c36250oUv);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new KlineConfigHandle$collectConfigChange$1(this, null), 3, null);
    }

    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((ChartViewOutSideConfig) obj).getControlBeanAfterInit();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setControlBeanAfterInit((oUL) obj2);
            }
        }, null, new KlineConfigHandle$subscribeData$3(null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$4
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowCountdown());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMShowCountdown(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$5(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Integer.valueOf(((ChartViewOutSideConfig) obj).getMChartPosition());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMChartPosition(((Number) obj2).intValue());
            }
        }, null, new KlineConfigHandle$subscribeData$7(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$8
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMChartOffsetInit());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMChartOffsetInit(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$9(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Float.valueOf(((ChartViewOutSideConfig) obj).getKlineDefaultOffset());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setKlineDefaultOffset(((Number) obj2).floatValue());
            }
        }, null, new KlineConfigHandle$subscribeData$11(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$12
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Integer.valueOf(((ChartViewOutSideConfig) obj).getMOrdinateType());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMOrdinateType(((Number) obj2).intValue());
            }
        }, null, new KlineConfigHandle$subscribeData$13(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).isColumnChart());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setColumnChart(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$15(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$16
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Integer.valueOf(((ChartViewOutSideConfig) obj).getMKlineAbstractType());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMKlineAbstractType(((Number) obj2).intValue());
            }
        }, null, new KlineConfigHandle$subscribeData$17(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((ChartViewOutSideConfig) obj).getControlBeanAfterInit();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setControlBeanAfterInit((oUL) obj2);
            }
        }, null, new KlineConfigHandle$subscribeData$19(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$20
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowHistoryOrder());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMShowHistoryOrder(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$21(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowCurrentOrder());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMShowCurrentOrder(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$23(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$24
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowPriceWarning());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMShowPriceWarning(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$25(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$26
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowOpenOrderExtendedLine());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMShowOpenOrderExtendedLine(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$27(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$28
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMShowTradePosExtendedLine());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMShowTradePosExtendedLine(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$29(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$30
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMTradePosShowPnl());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMTradePosShowPnl(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$31(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$32
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMOpenOrderShowRight());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMOpenOrderShowRight(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$33(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$34
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMTradePosShowRight());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMTradePosShowRight(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$35(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$36
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Integer.valueOf(((ChartViewOutSideConfig) obj).getMCandlestickType());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMCandlestickType(((Number) obj2).intValue());
            }
        }, null, new KlineConfigHandle$subscribeData$37(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$38
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((ChartViewOutSideConfig) obj).getMCandleRiseColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMCandleRiseColor((String) obj2);
            }
        }, null, new KlineConfigHandle$subscribeData$39(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$40
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((ChartViewOutSideConfig) obj).getMCandleDownColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMCandleDownColor((String) obj2);
            }
        }, null, new KlineConfigHandle$subscribeData$41(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$42
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMDexAvgShowRight());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMDexAvgShowRight(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$43(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$44
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMDexAvgExtend());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMDexAvgExtend(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$45(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, this.copydefault, new MutablePropertyReference1Impl() { // from class: com.okinc.kline.util.KlineConfigHandle$subscribeData$46
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMDexAvgShowPnlAmt());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ChartViewOutSideConfig) obj).setMDexAvgShowPnlAmt(((Boolean) obj2).booleanValue());
            }
        }, null, new KlineConfigHandle$subscribeData$47(this, null), 2, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.AEQbTJ);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            return lifecycle;
        }
        java.lang.Object context = this.AEQbTJ.getContext();
        Intrinsics.copydefault(context, "");
        return (Lifecycle) context;
    }
}
