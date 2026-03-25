package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$addCalendarEvent$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$deleteCalendarEvent$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$initView$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$scrollToPosition$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$setData$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$setListener$2;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.viewmodel.TradingCalendarDetailViewPagerItemViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.LazyThreadSafetyMode;
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
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qiE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40979qiE extends AbstractC41022qiv implements InterfaceC49363unD, qXK {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public java.lang.String AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final int AuCTel;
    public TradingCalendarEconomicTypeVo DbNXlk;
    public C42689rbE djBIcL;
    public Function2<? super RecyclerView, ? super C40979qiE, Unit> ejfBZ;
    public int fARcdN;
    public boolean fetchVPNInfo;
    public ActivityResultLauncher<java.lang.String[]> gEmmrt;
    public TradingCalendarType getNewProxyInstance;
    public java.lang.String hDKMBd;
    public final InterfaceC56387yDm iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public final /* synthetic */ qXB AhwBna = new qXB();
    public final int fIwbmz = qZH.ActionBar.dLBcXg;
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.qiM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40979qiE.fetchVPNInfo(this.EZpvd);
        }
    });
    public final C41015qio isConnected = new C41015qio(yDY.AhwBna());
    public InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>> values = new InterfaceC49371unL.StateListAnimator(null, 1, null);

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
    public final void AEQbTJ(Function2<? super RecyclerView, ? super C40979qiE, Unit> function2) {
        this.ejfBZ = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AkhnZx() {
        this.AhwBna.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingCalendarType values() {
        return this.getNewProxyInstance;
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

    public C40979qiE() {
        final Function0 function0 = null;
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$viewModels$default$2
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TradingCalendarDetailViewPagerItemViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$viewModels$default$5
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
        this.AuCTel = C55298xhM.dp2px$default(12.0f, null, 1, null);
        this.AYXKKw = "";
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.qiN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40979qiE.AhwBna();
            }
        });
        this.hDKMBd = "";
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.qiE$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qiE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C40979qiE AEQbTJ(@NotNull TradingCalendarType tradingCalendarType, @NotNull Function2<? super RecyclerView, ? super C40979qiE, Unit> function2) {
            Intrinsics.checkNotNullParameter(tradingCalendarType, "");
            Intrinsics.checkNotNullParameter(function2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("tradingCalendarType", tradingCalendarType);
            C40979qiE c40979qiE = new C40979qiE();
            c40979qiE.AEQbTJ(function2);
            c40979qiE.setArguments(bundle);
            return c40979qiE;
        }
    }

    public final C41018qir valueOf() {
        return (C41018qir) this.fJNWhG.getValue();
    }

    public static final C41018qir fetchVPNInfo(final C40979qiE c40979qiE) {
        return new C41018qir(new Function2() { // from class: o.qiQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40979qiE.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (TradingCalendarEconomicTypeVo) obj2);
            }
        });
    }

    public static final Unit copydefault(C40979qiE c40979qiE, int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        Intrinsics.checkNotNullParameter(tradingCalendarEconomicTypeVo, "");
        c40979qiE.copydefault(i, tradingCalendarEconomicTypeVo);
        return Unit.INSTANCE;
    }

    public final TradingCalendarDetailViewPagerItemViewModel fetchVPNInfo() {
        return (TradingCalendarDetailViewPagerItemViewModel) this.uzCIH.getValue();
    }

    public static final InterfaceC48893ueK AhwBna() {
        return (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
    }

    public final InterfaceC48893ueK djBIcL() {
        return (InterfaceC48893ueK) this.iwGUEr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pGZ AuCTel() {
        return (pGZ) this.AkhnZx.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("tradingCalendarType") : null;
        this.getNewProxyInstance = serializable instanceof TradingCalendarType ? (TradingCalendarType) serializable : null;
    }

    public final void copydefault(@NotNull InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        pUU.KWHzl(getTAG(), "isInit = " + this.fetchVPNInfo);
        if (this.fetchVPNInfo) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradingCalendarDetailViewPagerItemFragment$setData$1(this, interfaceC49371unL, null), 3, null);
        } else {
            this.values = interfaceC49371unL;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C42689rbE c42689rbECopydefault = C42689rbE.copydefault(view);
        OLrzqt(c42689rbECopydefault.OLrzqt, c42689rbECopydefault.AEQbTJ, c42689rbECopydefault.copydefault);
        this.djBIcL = c42689rbECopydefault;
        fIwbmz();
        this.fetchVPNInfo = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradingCalendarDetailViewPagerItemFragment$initView$2(this, null), 3, null);
        if (getContext() != null) {
            java.lang.String strAEQbTJ = AuCTel().AEQbTJ(C55608xnE.OLrzqt());
            this.AYXKKw = strAEQbTJ != null ? strAEQbTJ : "";
            this.gEmmrt = pDY.copydefault.copydefault(this, new Function0() { // from class: o.qiD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40979qiE.gEmmrt(this.copydefault);
                }
            }, new Function0() { // from class: o.qiK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40979qiE.AYXKKw();
                }
            }, new Function0() { // from class: o.qiH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40979qiE.DbNXlk(this.copydefault);
                }
            });
        }
        DbNXlk();
    }

    public static final Unit gEmmrt(C40979qiE c40979qiE) {
        TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo = c40979qiE.DbNXlk;
        if (tradingCalendarEconomicTypeVo != null) {
            c40979qiE.AEQbTJ(c40979qiE.fARcdN, tradingCalendarEconomicTypeVo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C40979qiE c40979qiE) {
        c40979qiE.isConnected();
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        RecyclerView recyclerView;
        C42689rbE c42689rbE = this.djBIcL;
        if (c42689rbE == null || (recyclerView = c42689rbE.copydefault) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.addItemDecoration(new C40995qiU(0, 0, this.AuCTel, 0, 1, 11, null));
        recyclerView.addItemDecoration(new C8039avH(this.isConnected));
        recyclerView.setAdapter(valueOf());
        recyclerView.addOnScrollListener(new Activity());
    }

    /* JADX INFO: renamed from: o.qiE$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            Function2 function2 = C40979qiE.this.ejfBZ;
            if (function2 != null) {
                function2.invoke(recyclerView, C40979qiE.this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TradingCalendarDetailViewPagerItemFragment$scrollToPosition$1 tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1;
        C40979qiE c40979qiE;
        C40979qiE c40979qiE2;
        java.util.Iterator it;
        int i;
        RecyclerView recyclerView;
        if (continuation instanceof TradingCalendarDetailViewPagerItemFragment$scrollToPosition$1) {
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1 = (TradingCalendarDetailViewPagerItemFragment$scrollToPosition$1) continuation;
            int i2 = tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.label = i2 - Integer.MIN_VALUE;
            } else {
                tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1 = new TradingCalendarDetailViewPagerItemFragment$scrollToPosition$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (isDetached()) {
                return Unit.INSTANCE;
            }
            TradingCalendarDetailViewPagerItemViewModel tradingCalendarDetailViewPagerItemViewModelFetchVPNInfo = fetchVPNInfo();
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.L$0 = this;
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.J$0 = j;
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.label = 1;
            objOLrzqt = OLrzqt(tradingCalendarDetailViewPagerItemViewModelFetchVPNInfo, tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c40979qiE = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.J$0;
                c40979qiE2 = (C40979qiE) tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC49371unL<java.util.List<ITradingCalendarEventVo>> interfaceC49371unLEZpvd = ((TradingCalendarDetailViewPagerItemViewModel.TaskDescription) objOLrzqt).EZpvd();
                Intrinsics.copydefault(interfaceC49371unLEZpvd, "");
                it = ((java.util.List) ((InterfaceC49371unL.Activity) interfaceC49371unLEZpvd).copydefault()).iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((ITradingCalendarEventVo) it.next()).OLrzqt().AEQbTJ() == j) {
                        break;
                    }
                    i++;
                }
                C42689rbE c42689rbE = c40979qiE2.djBIcL;
                RecyclerView.LayoutManager layoutManager = (c42689rbE != null || (recyclerView = c42689rbE.copydefault) == null) ? null : recyclerView.getLayoutManager();
                Intrinsics.copydefault(layoutManager, "");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                return Unit.INSTANCE;
            }
            j = tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.J$0;
            c40979qiE = (C40979qiE) tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        if (((TradingCalendarDetailViewPagerItemViewModel.TaskDescription) objOLrzqt).EZpvd() instanceof InterfaceC49371unL.Activity) {
            TradingCalendarDetailViewPagerItemViewModel tradingCalendarDetailViewPagerItemViewModelFetchVPNInfo2 = c40979qiE.fetchVPNInfo();
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.L$0 = c40979qiE;
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.J$0 = j;
            tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1.label = 2;
            objOLrzqt = c40979qiE.OLrzqt(tradingCalendarDetailViewPagerItemViewModelFetchVPNInfo2, tradingCalendarDetailViewPagerItemFragment$scrollToPosition$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c40979qiE2 = c40979qiE;
            InterfaceC49371unL<java.util.List<ITradingCalendarEventVo>> interfaceC49371unLEZpvd2 = ((TradingCalendarDetailViewPagerItemViewModel.TaskDescription) objOLrzqt).EZpvd();
            Intrinsics.copydefault(interfaceC49371unLEZpvd2, "");
            it = ((java.util.List) ((InterfaceC49371unL.Activity) interfaceC49371unLEZpvd2).copydefault()).iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                }
                i++;
            }
            C42689rbE c42689rbE2 = c40979qiE2.djBIcL;
            if (c42689rbE2 != null) {
                Intrinsics.copydefault(layoutManager, "");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, fetchVPNInfo(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.fragment.TradingCalendarDetailViewPagerItemFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((TradingCalendarDetailViewPagerItemViewModel.TaskDescription) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((TradingCalendarDetailViewPagerItemViewModel.TaskDescription) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, null, new TradingCalendarDetailViewPagerItemFragment$setListener$2(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:24:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<? extends ITradingCalendarEventVo> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1 tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1;
        long jCurrentTimeMillis;
        C40979qiE c40979qiE;
        java.util.Iterator it;
        if (continuation instanceof TradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1) {
            tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1 = (TradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1) continuation;
            int i = tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1 = new TradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            c40979qiE = this;
            it = list.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jCurrentTimeMillis = tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.J$0;
        ITradingCalendarEventVo iTradingCalendarEventVo = (ITradingCalendarEventVo) tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.L$2;
        it = (java.util.Iterator) tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.L$1;
        c40979qiE = (C40979qiE) tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.L$0;
        C56391yDq.AEQbTJ(objEZpvd);
        KlineEventCalendarEntity klineEventCalendarEntity = (KlineEventCalendarEntity) objEZpvd;
        if (klineEventCalendarEntity == null) {
            TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo = (TradingCalendarEconomicTypeVo) iTradingCalendarEventVo;
            tradingCalendarEconomicTypeVo.KWHzl(klineEventCalendarEntity.getEventId() > -1);
            tradingCalendarEconomicTypeVo.EZpvd(klineEventCalendarEntity.getEventId());
        } else {
            TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo2 = (TradingCalendarEconomicTypeVo) iTradingCalendarEventVo;
            tradingCalendarEconomicTypeVo2.KWHzl(false);
            tradingCalendarEconomicTypeVo2.EZpvd(-1L);
        }
        while (it.hasNext()) {
            iTradingCalendarEventVo = (ITradingCalendarEventVo) it.next();
            if (iTradingCalendarEventVo instanceof TradingCalendarEconomicTypeVo) {
                TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo3 = (TradingCalendarEconomicTypeVo) iTradingCalendarEventVo;
                if (tradingCalendarEconomicTypeVo3.AhwBna() > jCurrentTimeMillis) {
                    pGZ pgzAuCTel = c40979qiE.AuCTel();
                    java.lang.String strCopydefault = tradingCalendarEconomicTypeVo3.copydefault();
                    tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.L$0 = c40979qiE;
                    tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.L$1 = it;
                    tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.L$2 = iTradingCalendarEventVo;
                    tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.J$0 = jCurrentTimeMillis;
                    tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1.label = 1;
                    objEZpvd = pgzAuCTel.EZpvd(strCopydefault, tradingCalendarDetailViewPagerItemFragment$dealWithCalendarEventStatus$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    KlineEventCalendarEntity klineEventCalendarEntity2 = (KlineEventCalendarEntity) objEZpvd;
                    if (klineEventCalendarEntity2 == null) {
                    }
                    while (it.hasNext()) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        if (tradingCalendarEconomicTypeVo.AkhnZx()) {
            EZpvd(i, tradingCalendarEconomicTypeVo);
        } else {
            KWHzl(i, tradingCalendarEconomicTypeVo);
        }
    }

    public final void KWHzl(int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            pDY pdy = pDY.copydefault;
            if (pdy.AEQbTJ(activity)) {
                AEQbTJ(i, tradingCalendarEconomicTypeVo);
                return;
            }
            this.fARcdN = i;
            this.DbNXlk = tradingCalendarEconomicTypeVo;
            ActivityResultLauncher<java.lang.String[]> activityResultLauncher = this.gEmmrt;
            if (activityResultLauncher != null) {
                pdy.copydefault(this, activityResultLauncher);
            }
        }
    }

    public final void AEQbTJ(final int i, final TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        if (this.hDKMBd.length() == 0) {
            InterfaceC48893ueK interfaceC48893ueKDjBIcL = djBIcL();
            if (interfaceC48893ueKDjBIcL == null || (abstractC58185ywXAEQbTJ = interfaceC48893ueKDjBIcL.AEQbTJ("https://www.okx.com/", new C48891ueI("market_calendar", this.AYXKKw, false, null, null, 28, null))) == null || (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this)) == null) {
                return;
            }
            final Function1 function1 = new Function1() { // from class: o.qiP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40979qiE.EZpvd(this.EZpvd, tradingCalendarEconomicTypeVo, i, (C48887ueE) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.qiO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C40979qiE.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.qiV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40979qiE.copydefault(this.copydefault, tradingCalendarEconomicTypeVo, i, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.qiJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C40979qiE.EZpvd(function12, obj);
                }
            });
            return;
        }
        java.lang.String str = this.hDKMBd;
        if (str == null) {
            str = "";
        }
        copydefault(tradingCalendarEconomicTypeVo, str, i);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C40979qiE c40979qiE, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo, int i, C48887ueE c48887ueE) {
        c40979qiE.hDKMBd = c48887ueE.OLrzqt();
        c40979qiE.copydefault(tradingCalendarEconomicTypeVo, c48887ueE.OLrzqt(), i);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C40979qiE c40979qiE, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo, int i, java.lang.Throwable th) {
        c40979qiE.copydefault(tradingCalendarEconomicTypeVo, "", i);
        C41298qoF.e$default(C41298qoF.AEQbTJ, c40979qiE.getTAG(), "createShortLink error: " + th.getMessage(), null, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo, java.lang.String str, int i) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new TradingCalendarDetailViewPagerItemFragment$addCalendarEvent$1(this, tradingCalendarEconomicTypeVo, str, i, null));
    }

    public final void OLrzqt(int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new TradingCalendarDetailViewPagerItemFragment$deleteCalendarEvent$1(this, tradingCalendarEconomicTypeVo, i, null));
    }

    public final void OLrzqt(TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo, boolean z, int i) {
        tradingCalendarEconomicTypeVo.KWHzl(z);
        valueOf().notifyItemChanged(i, "update_reminder_status");
    }

    public final void EZpvd(final int i, final TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            pDB.OLrzqt.KWHzl(activity, new Function0() { // from class: o.qiL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40979qiE.KWHzl(this.EZpvd, i, tradingCalendarEconomicTypeVo);
                }
            });
        }
    }

    public static final Unit KWHzl(C40979qiE c40979qiE, int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        c40979qiE.OLrzqt(i, tradingCalendarEconomicTypeVo);
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            pDB.OLrzqt.AEQbTJ(activity, new Function0() { // from class: o.qiI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40979qiE.copydefault(activity);
                }
            });
        }
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity) {
        pDY.copydefault.KWHzl(fragmentActivity);
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        AuCTel().EZpvd();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ActivityResultLauncher<java.lang.String[]> activityResultLauncher = this.gEmmrt;
        if (activityResultLauncher != null) {
            pDY.copydefault.EZpvd(activityResultLauncher);
        }
    }
}
