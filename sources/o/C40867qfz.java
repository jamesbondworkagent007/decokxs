package o;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallTrendPeriod;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$loadData$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$loadData$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$loadTrendData$1$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$refreshUIStatePeriodType$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$setListener$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$setListener$4;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$setListener$6$onTabSelected$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$updateTitleWhenChartHighlighted$1$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$updateTitleWhenChartHighlighted$2$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$updateTitleWhenChartHighlighted$2$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.model.MarketDiscoverOverallStatsVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.viewmodel.MarketDiscoverOverviewViewModel;
import com.okinc.market.discover.features.markets.viewmodel.OverviewTab;
import com.okinc.market.widget.FlowedChipsView;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
import o.C52761wXj;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.SQ;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qfz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40867qfz extends AbstractC40851qfj implements InterfaceC49363unD, qXK {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public boolean AYXKKw;
    public final /* synthetic */ qXB AhwBna = new qXB();
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm fetchVPNInfo;
    public java.lang.Float gEmmrt;
    public C42729rbs valueOf;
    public MarketDiscoverOverallType values;

    /* JADX INFO: renamed from: o.qfz$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    /* JADX INFO: renamed from: o.qfz$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OverviewTab.values().length];
            try {
                iArr[OverviewTab.MARKET_CAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OverviewTab.VOLUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OverviewTab.DOMINANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[MarketDiscoverOverallType.values().length];
            try {
                iArr2[MarketDiscoverOverallType.CAPACITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarketDiscoverOverallType.VOLUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarketDiscoverOverallType.SHARE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.AhwBna.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.AhwBna.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt() {
        this.AhwBna.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.UhxbNG;
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
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

    public C40867qfz() {
        final Dialog dialog = new Dialog(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) dialog.invoke();
            }
        });
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketDiscoverOverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$5
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
        final FragmentManager fragmentManager = new FragmentManager(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) fragmentManager.invoke();
            }
        });
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C41343qoy.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$special$$inlined$parentViewModels$10
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
        this.values = MarketDiscoverOverallType.CAPACITY;
    }

    /* JADX INFO: renamed from: o.qfz$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qfz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketDiscoverOverviewViewModel fetchVPNInfo() {
        return (MarketDiscoverOverviewViewModel) this.fetchVPNInfo.getValue();
    }

    private final C41343qoy AYXKKw() {
        return (C41343qoy) this.AkhnZx.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final C42729rbs c42729rbsKWHzl = C42729rbs.KWHzl(view);
        c42729rbsKWHzl.getRoot().setContentDescription("MarketsOverviewOverall");
        KWHzl(c42729rbsKWHzl.copydefault, (C55113xdn) null, c42729rbsKWHzl.AhwBna);
        Intrinsics.copydefault(c42729rbsKWHzl);
        AEQbTJ(c42729rbsKWHzl);
        setupTrendValueView$default(this, c42729rbsKWHzl, null, 1, null);
        C34888nku c34888nku = c42729rbsKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c34888nku, "");
        KWHzl(c34888nku, new Function1() { // from class: o.qfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40867qfz.EZpvd(this.EZpvd, c42729rbsKWHzl, (Entry) obj);
            }
        });
        KWHzl(c42729rbsKWHzl);
        this.valueOf = c42729rbsKWHzl;
        isConnected();
    }

    public static final Unit EZpvd(C40867qfz c40867qfz, C42729rbs c42729rbs, Entry entry) {
        if (c40867qfz.isVisible()) {
            Intrinsics.copydefault(c42729rbs);
            java.lang.Object data = entry != null ? entry.getData() : null;
            c40867qfz.OLrzqt(c42729rbs, data instanceof MarketDiscoverOverallTrendPo.LineChartItemPo ? (MarketDiscoverOverallTrendPo.LineChartItemPo) data : null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C55249xgQ c55249xgQ;
        AppCompatImageView appCompatImageView;
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, fetchVPNInfo(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverOverviewViewModel.StateListAnimator) obj).gEmmrt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverOverviewViewModel.StateListAnimator) obj).djBIcL((InterfaceC49371unL) obj2);
            }
        }, null, new MarketDiscoverOverviewOverallFragment$setListener$2(this, null), 2, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, fetchVPNInfo(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.MarketDiscoverOverviewOverallFragment$setListener$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverOverviewViewModel.StateListAnimator) obj).AYXKKw();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverOverviewViewModel.StateListAnimator) obj).copydefault((InterfaceC49371unL<MarketDiscoverOverallStatsVo>) obj2);
            }
        }, null, new MarketDiscoverOverviewOverallFragment$setListener$4(this, null), 2, null);
        C42729rbs c42729rbs = this.valueOf;
        if (c42729rbs != null && (appCompatImageView = c42729rbs.EZpvd) != null) {
            appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
        }
        C42729rbs c42729rbs2 = this.valueOf;
        if (c42729rbs2 != null && (c55249xgQ = c42729rbs2.AYXKKw) != null) {
            c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity());
        }
        AYXKKw().copydefault().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.qfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40867qfz.AEQbTJ(this.EZpvd, (OverviewTab) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.qfz$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            MarketDiscoverOverallType marketDiscoverOverallType;
            C40867qfz.this.AhwBna();
            C40867qfz c40867qfz = C40867qfz.this;
            MarketDiscoverOverallType[] marketDiscoverOverallTypeArrValues = MarketDiscoverOverallType.values();
            int length = marketDiscoverOverallTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    marketDiscoverOverallType = null;
                    break;
                }
                marketDiscoverOverallType = marketDiscoverOverallTypeArrValues[i];
                if (tab != null && marketDiscoverOverallType.ordinal() == tab.getPosition()) {
                    break;
                } else {
                    i++;
                }
            }
            if (marketDiscoverOverallType != null) {
                c40867qfz.values = marketDiscoverOverallType;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C40867qfz.this), null, null, new MarketDiscoverOverviewOverallFragment$setListener$6$onTabSelected$2(C40867qfz.this, null), 3, null);
                C40867qfz.this.AYXKKw = true;
                C40867qfz.this.AEQbTJ();
                C40867qfz c40867qfz2 = C40867qfz.this;
                c40867qfz2.EZpvd(c40867qfz2.values.getTrackValue());
                return;
            }
            throw new java.lang.IllegalArgumentException("invalid market overall type");
        }
    }

    public static final Unit AEQbTJ(C40867qfz c40867qfz, OverviewTab overviewTab) {
        C55249xgQ c55249xgQ;
        C55249xgQ c55249xgQ2;
        C55249xgQ c55249xgQ3;
        C55249xgQ c55249xgQ4;
        C55249xgQ c55249xgQ5;
        C55249xgQ c55249xgQ6;
        int i = overviewTab == null ? -1 : Application.copydefault[overviewTab.ordinal()];
        TabLayout.Tab tabAt = null;
        if (i == 1) {
            c40867qfz.AYXKKw = true;
            C42729rbs c42729rbs = c40867qfz.valueOf;
            if (c42729rbs != null && (c55249xgQ2 = c42729rbs.AYXKKw) != null) {
                tabAt = c55249xgQ2.getTabAt(0);
            }
            C42729rbs c42729rbs2 = c40867qfz.valueOf;
            if (c42729rbs2 != null && (c55249xgQ = c42729rbs2.AYXKKw) != null) {
                c55249xgQ.selectTab(tabAt);
            }
        } else if (i == 2) {
            c40867qfz.AYXKKw = true;
            C42729rbs c42729rbs3 = c40867qfz.valueOf;
            if (c42729rbs3 != null && (c55249xgQ4 = c42729rbs3.AYXKKw) != null) {
                tabAt = c55249xgQ4.getTabAt(1);
            }
            C42729rbs c42729rbs4 = c40867qfz.valueOf;
            if (c42729rbs4 != null && (c55249xgQ3 = c42729rbs4.AYXKKw) != null) {
                c55249xgQ3.selectTab(tabAt);
            }
        } else if (i == 3) {
            c40867qfz.AYXKKw = true;
            C42729rbs c42729rbs5 = c40867qfz.valueOf;
            if (c42729rbs5 != null && (c55249xgQ6 = c42729rbs5.AYXKKw) != null) {
                tabAt = c55249xgQ6.getTabAt(2);
            }
            C42729rbs c42729rbs6 = c40867qfz.valueOf;
            if (c42729rbs6 != null && (c55249xgQ5 = c42729rbs6.AYXKKw) != null) {
                c55249xgQ5.selectTab(tabAt);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qfz$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C40867qfz OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C40867qfz c40867qfz) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c40867qfz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C34899nlE c34899nlECopydefault = C34899nlE.Companion.copydefault(this.OLrzqt.values);
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c34899nlECopydefault.show(childFragmentManager);
            }
        }
    }

    public final void AEQbTJ(C42729rbs c42729rbs) {
        FlowedChipsView.setData$default(c42729rbs.gEmmrt, new C40839qfX(), MarketDiscoverOverallTrendPeriod.values(), 0, new Function2() { // from class: o.qfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40867qfz.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue(), (MarketDiscoverOverallTrendPeriod) obj2);
            }
        }, 4, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C40867qfz c40867qfz, int i, MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod) {
        Intrinsics.checkNotNullParameter(marketDiscoverOverallTrendPeriod, "");
        c40867qfz.valueOf();
        c40867qfz.AhwBna();
        c40867qfz.AEQbTJ();
        c40867qfz.djBIcL();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setupTrendValueView$default(C40867qfz c40867qfz, C42729rbs c42729rbs, C41092qkL c41092qkL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c41092qkL = null;
        }
        c40867qfz.copydefault(c42729rbs, c41092qkL);
    }

    public final void copydefault(C42729rbs c42729rbs, C41092qkL c41092qkL) {
        int i = Application.OLrzqt[this.values.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Group group = c42729rbs.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            Group group2 = c42729rbs.KWHzl;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(0);
            return;
        }
        Group group3 = c42729rbs.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(group3, "");
        group3.setVisibility(0);
        Group group4 = c42729rbs.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group4, "");
        group4.setVisibility(8);
        if (c41092qkL != null) {
            c42729rbs.AkhnZx.setText(fetchVPNInfo().EZpvd(c41092qkL.OLrzqt(), DisplaySign.EXCEPT_ZERO));
            c42729rbs.AkhnZx.setStyleWithTheme(c41092qkL.KWHzl());
        } else {
            c42729rbs.AkhnZx.setText("--");
            c42729rbs.AkhnZx.setStyleWithTheme(5);
        }
    }

    public final void copydefault(C42729rbs c42729rbs, InterfaceC49371unL<MarketDiscoverOverallStatsVo> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            MarketDiscoverOverallStatsVo marketDiscoverOverallStatsVo = (MarketDiscoverOverallStatsVo) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
            int i = Application.OLrzqt[this.values.ordinal()];
            if (i == 1) {
                c42729rbs.isConnected.setText(marketDiscoverOverallStatsVo.KWHzl());
                return;
            }
            if (i == 2) {
                c42729rbs.isConnected.setText(marketDiscoverOverallStatsVo.OLrzqt());
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c42729rbs.fetchVPNInfo.setText(marketDiscoverOverallStatsVo.copydefault());
            android.widget.ImageView imageView = c42729rbs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, marketDiscoverOverallStatsVo.EZpvd(), null, 0, 0, 14, null);
            c42729rbs.djBIcL.setText(marketDiscoverOverallStatsVo.AEQbTJ());
        }
    }

    public final void KWHzl(C42729rbs c42729rbs) {
        C55249xgQ c55249xgQ = c42729rbs.AYXKKw;
        TabLayout.Tab tabNewTab = c55249xgQ.newTab();
        tabNewTab.setText(C33070mpX.AYXKKw(MarketDiscoverOverallType.CAPACITY.getTileStringResId()));
        c55249xgQ.addTab(tabNewTab, true);
        TabLayout.Tab tabNewTab2 = c55249xgQ.newTab();
        tabNewTab2.setText(C33070mpX.AYXKKw(MarketDiscoverOverallType.VOLUME.getTileStringResId()));
        c55249xgQ.addTab(tabNewTab2, false);
        TabLayout.Tab tabNewTab3 = c55249xgQ.newTab();
        tabNewTab3.setText(C33070mpX.AYXKKw(MarketDiscoverOverallType.SHARE.getTileStringResId()));
        c55249xgQ.addTab(tabNewTab3, false);
        c42729rbs.AYXKKw.KWHzl(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{-16842913}}, new int[]{C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)}));
    }

    private final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$loadData$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$loadData$2(this, null), 3, null);
    }

    public final void AEQbTJ() {
        FlowedChipsView flowedChipsView;
        MarketDiscoverOverallTrendPeriod[] marketDiscoverOverallTrendPeriodArrValues = MarketDiscoverOverallTrendPeriod.values();
        C42729rbs c42729rbs = this.valueOf;
        MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod = (MarketDiscoverOverallTrendPeriod) yDV.gEmmrt(marketDiscoverOverallTrendPeriodArrValues, (c42729rbs == null || (flowedChipsView = c42729rbs.gEmmrt) == null) ? 0 : flowedChipsView.OLrzqt());
        if (marketDiscoverOverallTrendPeriod != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$loadTrendData$1$1(this, marketDiscoverOverallTrendPeriod, null), 3, null);
        }
    }

    public final void OLrzqt(C42729rbs c42729rbs, MarketDiscoverOverallTrendPo.LineChartItemPo lineChartItemPo) {
        if (lineChartItemPo == null || BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$updateTitleWhenChartHighlighted$1$1(this, c42729rbs, lineChartItemPo, null), 3, null) == null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$updateTitleWhenChartHighlighted$2$1(this, c42729rbs, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$updateTitleWhenChartHighlighted$2$2(this, c42729rbs, null), 3, null);
        }
    }

    public final void EZpvd(C42729rbs c42729rbs, InterfaceC49371unL<C41092qkL> interfaceC49371unL) {
        java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> listAEQbTJ;
        MarketDiscoverOverallTrendPo.LineChartItemPo lineChartItemPo;
        C43296rmc.AEQbTJ("MarketDiscoverOverviewOverallFragment", "update trend view: " + interfaceC49371unL);
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            C41092qkL c41092qkL = (C41092qkL) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
            if (c41092qkL.AEQbTJ().isEmpty()) {
                EZpvd(c42729rbs, new InterfaceC49371unL.TaskDescription(null, 1, null));
                return;
            }
            gEmmrt();
            C41092qkL c41092qkL2 = c41092qkL.AEQbTJ().isEmpty() ^ true ? c41092qkL : null;
            this.gEmmrt = java.lang.Float.valueOf(C33129mqd.djBIcL((c41092qkL2 == null || (listAEQbTJ = c41092qkL2.AEQbTJ()) == null || (lineChartItemPo = listAEQbTJ.get(0)) == null) ? null : lineChartItemPo.getValue()));
            copydefault(c42729rbs, c41092qkL);
            C34888nku c34888nku = c42729rbs.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c34888nku, "");
            AEQbTJ(c34888nku, c41092qkL);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        boolean z = interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription;
        if (z || (interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator)) {
            setupTrendValueView$default(this, c42729rbs, null, 1, null);
            qXK.StateListAnimator.showEmptyState$default(this, qZH.PendingIntent.RdAHlO, 0, qZH.PendingIntent.fetchVPNInfo, 0, new Function0() { // from class: o.qfA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40867qfz.valueOf(this.KWHzl);
                }
            }, 8, (java.lang.Object) null);
            if (z) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            if (!this.AYXKKw) {
                setupTrendValueView$default(this, c42729rbs, null, 1, null);
                copydefault(getString(qZH.PendingIntent.DsL), getString(qZH.PendingIntent.djSkpj), getString(qZH.PendingIntent.fetchVPNInfo), new Function0() { // from class: o.qfB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C40867qfz.AYXKKw(this.AEQbTJ);
                    }
                });
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            this.AYXKKw = false;
        }
    }

    public static final Unit valueOf(C40867qfz c40867qfz) {
        c40867qfz.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C40867qfz c40867qfz) {
        c40867qfz.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        FlowedChipsView flowedChipsView;
        C42729rbs c42729rbs = this.valueOf;
        if (c42729rbs == null || (flowedChipsView = c42729rbs.gEmmrt) == null) {
            return;
        }
        final MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod = (MarketDiscoverOverallTrendPeriod) yDV.gEmmrt(MarketDiscoverOverallTrendPeriod.values(), flowedChipsView.OLrzqt());
        if (marketDiscoverOverallTrendPeriod == null) {
            return;
        }
        C32866mlf.onEvent$default("Markets_Overview_Timeframe_Click", (TrackChannel[]) null, new Function1() { // from class: o.qfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40867qfz.copydefault(marketDiscoverOverallTrendPeriod, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "Timeframe", marketDiscoverOverallTrendPeriod.getTrackValue(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("Markets_Overview_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.qfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40867qfz.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "macro", false, 4, null);
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.ITEM_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(LineChart lineChart, final Function1<? super Entry, Unit> function1) {
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.QKVWgx);
        android.content.Context context = lineChart.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        qXS qxs = new qXS(context);
        qxs.setChartView(lineChart);
        qxs.setCircleColorAndRadius(getPathColor$default(this, null, 1, null), C33070mpX.EZpvd(SQ.Application.copydefault), C33070mpX.copydefault(C52761wXj.Activity.djBIcL), C33070mpX.EZpvd(qZH.Application.EZpvd));
        lineChart.setMarker(qxs);
        lineChart.setNestedScrollingEnabled(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.setHighlightPerDragEnabled(true);
        lineChart.setMinOffset(0.0f);
        lineChart.setExtraTopOffset(12.0f);
        lineChart.setExtraRightOffset(24.0f);
        lineChart.getRenderer().getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        lineChart.getRenderer().getPaintRender().setStrokeJoin(Paint.Join.ROUND);
        lineChart.setScaleEnabled(false);
        lineChart.setDragEnabled(true);
        lineChart.setTouchEnabled(true);
        lineChart.setNoDataText("");
        C41349qpD.setOnEntryHighlighted$default(lineChart, (Function0) null, new Function2() { // from class: o.qfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40867qfz.KWHzl(function1, (Entry) obj, (Highlight) obj2);
            }
        }, 1, (java.lang.Object) null);
        C41349qpD.AEQbTJ(lineChart, (Function1<? super android.view.MotionEvent, Unit>) new Function1() { // from class: o.qfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40867qfz.AEQbTJ((android.view.MotionEvent) obj);
            }
        }, (Function1<? super android.view.MotionEvent, Unit>) new Function1() { // from class: o.qfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40867qfz.EZpvd(function1, (android.view.MotionEvent) obj);
            }
        });
        lineChart.setDrawGridBackground(false);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(6, false);
        xAxis.enableGridDashedLine(5.0f, 5.0f, 0.0f);
        xAxis.setTextColor(iCopydefault);
        xAxis.setTextSize(10.0f);
        C55051xce c55051xce = C55051xce.OLrzqt;
        xAxis.setTypeface(c55051xce.valueOf());
        xAxis.setYOffset(8.0f);
        lineChart.setExtraBottomOffset(12.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
        lineChart.getAxisRight().setEnabled(false);
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.setEnabled(true);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(true);
        axisLeft.setLabelCount(5, true);
        axisLeft.enableGridDashedLine(5.0f, 5.0f, 0.0f);
        axisLeft.setTextColor(iCopydefault);
        axisLeft.setTextSize(10.0f);
        axisLeft.setTypeface(c55051xce.valueOf());
        axisLeft.setXOffset(10.0f);
        axisLeft.setGridColor(iCopydefault2);
        axisLeft.setZeroLineColor(iCopydefault2);
        axisLeft.setGranularity(1.0f);
    }

    /* JADX INFO: renamed from: o.qfz$Dialog */
    public static final class Dialog implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
            if (fragment != null && !(fragment instanceof C41341qow)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C41341qow)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C41341qow)) {
                    parentFragment = null;
                }
                fragment = (C41341qow) parentFragment;
            }
            if (!(fragment instanceof C41341qow)) {
                fragment = null;
            }
            C41341qow c41341qow = (C41341qow) fragment;
            C41341qow c41341qow2 = c41341qow instanceof ViewModelStoreOwner ? c41341qow : null;
            if (c41341qow2 != null) {
                return c41341qow2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C41341qow.class.getSimpleName()).toString());
        }
    }

    /* JADX INFO: renamed from: o.qfz$FragmentManager */
    public static final class FragmentManager implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
            if (fragment != null && !(fragment instanceof C41341qow)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C41341qow)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C41341qow)) {
                    parentFragment = null;
                }
                fragment = (C41341qow) parentFragment;
            }
            if (!(fragment instanceof C41341qow)) {
                fragment = null;
            }
            C41341qow c41341qow = (C41341qow) fragment;
            C41341qow c41341qow2 = c41341qow instanceof ViewModelStoreOwner ? c41341qow : null;
            if (c41341qow2 != null) {
                return c41341qow2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C41341qow.class.getSimpleName()).toString());
        }
    }

    public static final Unit KWHzl(Function1 function1, Entry entry, Highlight highlight) {
        function1.invoke(entry);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.view.MotionEvent motionEvent) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, android.view.MotionEvent motionEvent) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(LineChart lineChart, C41092qkL c41092qkL) {
        final ValueFormatter loaderManager;
        final ValueFormatter pictureInPictureParams;
        C34888nku c34888nku;
        YAxis axisLeft;
        C34888nku c34888nku2;
        YAxis axisLeft2;
        C34888nku c34888nku3;
        YAxis axisLeft3;
        C34888nku c34888nku4;
        C34888nku c34888nku5;
        LineData lineData;
        C42729rbs c42729rbs = this.valueOf;
        if (c42729rbs != null && (c34888nku5 = c42729rbs.AhwBna) != null && (lineData = (LineData) c34888nku5.getData()) != null) {
            lineData.clearValues();
        }
        C42729rbs c42729rbs2 = this.valueOf;
        if (c42729rbs2 != null && (c34888nku4 = c42729rbs2.AhwBna) != null) {
            c34888nku4.clear();
        }
        C42729rbs c42729rbs3 = this.valueOf;
        if (c42729rbs3 != null && (c34888nku3 = c42729rbs3.AhwBna) != null && (axisLeft3 = c34888nku3.getAxisLeft()) != null) {
            axisLeft3.mEntries = new float[0];
        }
        C42729rbs c42729rbs4 = this.valueOf;
        if (c42729rbs4 != null && (c34888nku2 = c42729rbs4.AhwBna) != null && (axisLeft2 = c34888nku2.getAxisLeft()) != null) {
            axisLeft2.setAxisMinimum(0.0f);
        }
        C42729rbs c42729rbs5 = this.valueOf;
        if (c42729rbs5 != null && (c34888nku = c42729rbs5.AhwBna) != null && (axisLeft = c34888nku.getAxisLeft()) != null) {
            axisLeft.setAxisMaximum(0.0f);
        }
        YAxis axisLeft4 = lineChart.getAxisLeft();
        if (axisLeft4 != null) {
            axisLeft4.resetAxisMinimum();
        }
        YAxis axisLeft5 = lineChart.getAxisLeft();
        if (axisLeft5 != null) {
            axisLeft5.resetAxisMaximum();
        }
        final int iAEQbTJ = AEQbTJ(c41092qkL);
        final int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.ORxRYg);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        float[] fArr = {0.5f, 0.0f};
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(java.lang.Integer.valueOf(C33522mxz.OLrzqt(iAEQbTJ, fArr[i])));
        }
        final GradientDrawable gradientDrawable = new GradientDrawable(orientation, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        IMarker marker = lineChart.getMarker();
        qXS qxs = marker instanceof qXS ? (qXS) marker : null;
        if (qxs != null) {
            qxs.setInnerCircleColor(iAEQbTJ);
        }
        if (c41092qkL.copydefault() == MarketDiscoverOverallTrendPeriod.ONE_DAY) {
            loaderManager = new PendingIntent();
        } else {
            loaderManager = new LoaderManager();
        }
        if (c41092qkL.EZpvd() == MarketDiscoverOverallType.SHARE) {
            pictureInPictureParams = new Fragment();
        } else {
            pictureInPictureParams = new PictureInPictureParams();
        }
        java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> listAEQbTJ = c41092qkL.AEQbTJ();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (MarketDiscoverOverallTrendPo.LineChartItemPo lineChartItemPo : listAEQbTJ) {
            arrayList2.add(new Entry(C33129mqd.djBIcL(lineChartItemPo.getTs()), C33129mqd.djBIcL(lineChartItemPo.getValue()), lineChartItemPo));
        }
        C41349qpD.copydefault(lineChart, arrayList2, (2 & 2) != 0 ? C56390yDp.OLrzqt(java.lang.Float.valueOf(0.9f), java.lang.Float.valueOf(1.1f)) : null, (2 & 4) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012a: INVOKE 
              (r18v0 'lineChart' com.github.mikephil.charting.charts.LineChart)
              (r8v1 'arrayList2' java.util.ArrayList)
              (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0000: ARITH (2 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: INVOKE 
              (wrap:java.lang.Float:0x0007: INVOKE (0.9f float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c), WRAPPED] (LINE:160))
              (wrap:java.lang.Float:0x000e: INVOKE (1.1f float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c), WRAPPED])
             STATIC call: o.yDp.OLrzqt(java.lang.Object, java.lang.Object):kotlin.Pair A[MD:<A, B>:(A, B):kotlin.Pair<A, B> (m), WRAPPED] (LINE:160)) : (null kotlin.Pair))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0018: ARITH (2 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:161) call: o.qpM.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x010e: CONSTRUCTOR 
              (r3v1 'iAEQbTJ' int A[DONT_INLINE])
              (r6v1 'gradientDrawable' android.graphics.drawable.GradientDrawable A[DONT_INLINE])
              (r4v1 'iCopydefault' int A[DONT_INLINE])
             A[MD:(int, android.graphics.drawable.GradientDrawable, int):void (m), WRAPPED] (LINE:547) call: o.qfy.<init>(int, android.graphics.drawable.GradientDrawable, int):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0023: ARITH (2 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:162) call: o.qpL.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x0113: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: o.qfC.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x002e: ARITH (2 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0034: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:163) call: o.qpJ.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x0118: CONSTRUCTOR (r2v8 'loaderManager' com.github.mikephil.charting.formatter.ValueFormatter A[DONT_INLINE]) A[MD:(com.github.mikephil.charting.formatter.ValueFormatter):void (m), WRAPPED] call: o.qfF.<init>(com.github.mikephil.charting.formatter.ValueFormatter):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0039: ARITH (2 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:164) call: o.qpK.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x011d: CONSTRUCTOR (r5v5 'pictureInPictureParams' com.github.mikephil.charting.formatter.ValueFormatter A[DONT_INLINE]) A[MD:(com.github.mikephil.charting.formatter.ValueFormatter):void (m), WRAPPED] call: o.qfE.<init>(com.github.mikephil.charting.formatter.ValueFormatter):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0044: ARITH (2 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:165) call: o.qpR.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x0122: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: o.qfL.<init>():void type: CONSTRUCTOR))
             STATIC call: o.qpD.copydefault(com.github.mikephil.charting.charts.LineChart, java.util.List, kotlin.Pair, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void A[MD:(com.github.mikephil.charting.charts.LineChart, java.util.List<? extends com.github.mikephil.charting.data.Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.jvm.functions.Function1<? super com.github.mikephil.charting.data.LineDataSet, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.github.mikephil.charting.data.LineData, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.github.mikephil.charting.components.XAxis, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.github.mikephil.charting.components.YAxis, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.github.mikephil.charting.charts.LineChart, kotlin.Unit>):void (m)] (LINE:158) in method: o.qfz.AEQbTJ(com.github.mikephil.charting.charts.LineChart, o.qkL):void, file: classes16.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.qpM, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            r0 = r17
            o.rbs r1 = r0.valueOf
            if (r1 == 0) goto L15
            o.nku r1 = r1.AhwBna
            if (r1 == 0) goto L15
            com.github.mikephil.charting.data.ChartData r1 = r1.getData()
            com.github.mikephil.charting.data.LineData r1 = (com.github.mikephil.charting.data.LineData) r1
            if (r1 == 0) goto L15
            r1.clearValues()
        L15:
            o.rbs r1 = r0.valueOf
            if (r1 == 0) goto L20
            o.nku r1 = r1.AhwBna
            if (r1 == 0) goto L20
            r1.clear()
        L20:
            o.rbs r1 = r0.valueOf
            r2 = 0
            if (r1 == 0) goto L33
            o.nku r1 = r1.AhwBna
            if (r1 == 0) goto L33
            com.github.mikephil.charting.components.YAxis r1 = r1.getAxisLeft()
            if (r1 == 0) goto L33
            float[] r3 = new float[r2]
            r1.mEntries = r3
        L33:
            o.rbs r1 = r0.valueOf
            r3 = 0
            if (r1 == 0) goto L45
            o.nku r1 = r1.AhwBna
            if (r1 == 0) goto L45
            com.github.mikephil.charting.components.YAxis r1 = r1.getAxisLeft()
            if (r1 == 0) goto L45
            r1.setAxisMinimum(r3)
        L45:
            o.rbs r1 = r0.valueOf
            if (r1 == 0) goto L56
            o.nku r1 = r1.AhwBna
            if (r1 == 0) goto L56
            com.github.mikephil.charting.components.YAxis r1 = r1.getAxisLeft()
            if (r1 == 0) goto L56
            r1.setAxisMaximum(r3)
        L56:
            com.github.mikephil.charting.components.YAxis r1 = r18.getAxisLeft()
            if (r1 == 0) goto L5f
            r1.resetAxisMinimum()
        L5f:
            com.github.mikephil.charting.components.YAxis r1 = r18.getAxisLeft()
            if (r1 == 0) goto L68
            r1.resetAxisMaximum()
        L68:
            r1 = r19
            int r3 = r0.AEQbTJ(r1)
            int r4 = o.C52761wXj.Activity.ORxRYg
            int r4 = o.C33070mpX.copydefault(r4)
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r6 = 2
            float[] r7 = new float[r6]
            r7 = {x012e: FILL_ARRAY_DATA , data: [1056964608, 0} // fill-array
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
        L81:
            if (r2 >= r6) goto L93
            r9 = r7[r2]
            int r9 = o.C33522mxz.OLrzqt(r3, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.add(r9)
            int r2 = r2 + 1
            goto L81
        L93:
            int[] r2 = kotlin.collections.CollectionsKt.gEmmrt(r8)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>(r5, r2)
            com.github.mikephil.charting.components.IMarker r2 = r18.getMarker()
            boolean r5 = r2 instanceof o.qXS
            if (r5 == 0) goto La7
            o.qXS r2 = (o.qXS) r2
            goto La8
        La7:
            r2 = 0
        La8:
            if (r2 == 0) goto Lad
            r2.setInnerCircleColor(r3)
        Lad:
            com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallTrendPeriod r2 = r19.copydefault()
            com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallTrendPeriod r5 = com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallTrendPeriod.ONE_DAY
            if (r2 != r5) goto Lbb
            o.qfz$PendingIntent r2 = new o.qfz$PendingIntent
            r2.<init>()
            goto Lc0
        Lbb:
            o.qfz$LoaderManager r2 = new o.qfz$LoaderManager
            r2.<init>()
        Lc0:
            com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType r5 = r19.EZpvd()
            com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType r7 = com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType.SHARE
            if (r5 != r7) goto Lce
            o.qfz$Fragment r5 = new o.qfz$Fragment
            r5.<init>()
            goto Ld3
        Lce:
            o.qfz$PictureInPictureParams r5 = new o.qfz$PictureInPictureParams
            r5.<init>()
        Ld3:
            java.util.List r1 = r19.AEQbTJ()
            java.util.ArrayList r8 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.copydefault(r1, r7)
            r8.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        Le6:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L10b
            java.lang.Object r7 = r1.next()
            com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo$LineChartItemPo r7 = (com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo.LineChartItemPo) r7
            com.github.mikephil.charting.data.Entry r9 = new com.github.mikephil.charting.data.Entry
            java.lang.String r10 = r7.getTs()
            float r10 = o.C33129mqd.djBIcL(r10)
            java.lang.String r11 = r7.getValue()
            float r11 = o.C33129mqd.djBIcL(r11)
            r9.<init>(r10, r11, r7)
            r8.add(r9)
            goto Le6
        L10b:
            r9 = 0
            o.qfy r10 = new o.qfy
            r10.<init>()
            o.qfC r11 = new o.qfC
            r11.<init>()
            o.qfF r12 = new o.qfF
            r12.<init>()
            o.qfE r13 = new o.qfE
            r13.<init>()
            o.qfL r14 = new o.qfL
            r14.<init>()
            r15 = 2
            r16 = 0
            r7 = r18
            o.C41349qpD.setSingleLineData$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C40867qfz.AEQbTJ(com.github.mikephil.charting.charts.LineChart, o.qkL):void");
    }

    /* JADX INFO: renamed from: o.qfz$PendingIntent */
    public static final class PendingIntent extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return pTA.formatTime$default(new Date(C33129mqd.valueOf(java.lang.Float.valueOf(f))), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }
    }

    /* JADX INFO: renamed from: o.qfz$LoaderManager */
    public static final class LoaderManager extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return pTA.formatDate$default(new Date(C33129mqd.valueOf(java.lang.Float.valueOf(f))), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: o.qfz$Fragment */
    public static final class Fragment extends ValueFormatter {
        public Fragment() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            MarketDiscoverOverviewViewModel marketDiscoverOverviewViewModelFetchVPNInfo = C40867qfz.this.fetchVPNInfo();
            java.lang.String string = C33129mqd.EZpvd(java.lang.Float.valueOf(f)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return marketDiscoverOverviewViewModelFetchVPNInfo.EZpvd(string, DisplaySign.AUTO);
        }
    }

    /* JADX INFO: renamed from: o.qfz$PictureInPictureParams */
    public static final class PictureInPictureParams extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return pTB.formatICUCompact$default(C33129mqd.EZpvd(java.lang.Float.valueOf(f)), null, null, null, null, 15, null);
        }
    }

    public static final Unit KWHzl(int i, GradientDrawable gradientDrawable, int i2, LineDataSet lineDataSet) {
        Intrinsics.checkNotNullParameter(lineDataSet, "");
        lineDataSet.setColor(i);
        lineDataSet.setLineWidth(1.5f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        lineDataSet.setFillDrawable(gradientDrawable);
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.setHighlightLineWidth(0.5f);
        lineDataSet.setHighLightColor(i2);
        lineDataSet.enableDashedHighlightLine(5.0f, 5.0f, 0.0f);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(LineData lineData) {
        Intrinsics.checkNotNullParameter(lineData, "");
        lineData.setDrawValues(false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ValueFormatter valueFormatter, XAxis xAxis) {
        Intrinsics.checkNotNullParameter(xAxis, "");
        xAxis.setValueFormatter(valueFormatter);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ValueFormatter valueFormatter, YAxis yAxis) {
        Intrinsics.checkNotNullParameter(yAxis, "");
        yAxis.setValueFormatter(valueFormatter);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(LineChart lineChart) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        lineChart.animateY(400, Easing.EaseInOutCubic);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ int getPathColor$default(C40867qfz c40867qfz, C41092qkL c41092qkL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c41092qkL = null;
        }
        return c40867qfz.AEQbTJ(c41092qkL);
    }

    public final int AEQbTJ(C41092qkL c41092qkL) {
        C34888nku c34888nku;
        C42729rbs c42729rbs = this.valueOf;
        if (c42729rbs != null && (c34888nku = c42729rbs.AhwBna) != null) {
            return C41349qpD.getThemeChartColor$default(c34888nku, C33129mqd.AEQbTJ(c41092qkL != null ? c41092qkL.OLrzqt() : null) > AudioStats.AUDIO_AMPLITUDE_NONE, false, 2, null);
        }
        android.content.Context context = getContext();
        if (context != null) {
            return C55366xib.KWHzl(C52761wXj.ActionBar.fLIjIY, context);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        C34888nku c34888nku;
        C42729rbs c42729rbs = this.valueOf;
        if (c42729rbs == null || (c34888nku = c42729rbs.AhwBna) == null) {
            return;
        }
        c34888nku.clearAnimation();
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDiscoverOverviewOverallFragment$refreshUIStatePeriodType$1(this, null), 3, null);
    }
}
