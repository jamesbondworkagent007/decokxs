package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$getLastVisibleItemView$1;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$getLastVisibleItemView$2;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$initTouchDrag$1$2;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$initView$4;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$initView$6;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$onUserActionEnd$1;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$onVisible$1;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$updateContent$2;
import com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.widget.SortTextView;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchActivity;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
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
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC27554jxQ;
import o.C52761wXj;
import o.InterfaceC46790tdn;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.jSB;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C27931kIq extends kIB implements InterfaceC46790tdn, InterfaceC49363unD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean AuCTel;
    public final boolean DbNXlk;
    public final boolean EZpvd;
    public final int OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public boolean djBIcL;
    public C41381qpj fARcdN;
    public final java.util.Map<java.lang.String, java.lang.Integer> fIwbmz;
    public Job fJNWhG;
    public boolean fetchVPNInfo;
    public C52812wZg gEmmrt;
    public C33546myW getNewProxyInstance;
    public C46802tdz hDKMBd;
    public CoinQuote isConnected;
    public boolean valueOf;
    public C46796tdt values;
    public final C59534zip AkhnZx = new C59534zip();
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.kIy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C27931kIq.KWHzl();
        }
    });
    public long iwGUEr = -1;

    /* JADX INFO: renamed from: o.kIq$TaskDescription */
    public static final class TaskDescription extends DefaultItemAnimator {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getAddDuration() {
            return 50L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getMoveDuration() {
            return 60L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public long getRemoveDuration() {
            return 50L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46796tdt AhwBna() {
        return this.values;
    }

    public final boolean AuCTel() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean[] DbNXlk() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return new java.lang.Boolean[]{bool, bool, bool, bool};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i, int i2) {
        this.AuCTel = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33546myW fetchVPNInfo() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.fERRXa;
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

    public C27931kIq() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupWatchListChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = 0 - C55298xhM.dp2px$default(18.0f, null, 1, null);
        this.AEQbTJ = C55298xhM.dp2px$default(30.0f, null, 1, null);
        this.AYXKKw = true;
        this.fIwbmz = C56424yEw.gEmmrt(C56390yDp.OLrzqt("COIN", 0), C56390yDp.OLrzqt("SPOT", 1), C56390yDp.OLrzqt("MARGIN", 2), C56390yDp.OLrzqt("SWAP", 3), C56390yDp.OLrzqt("FUTURES", 4), C56390yDp.OLrzqt("OPTION", 5));
        this.EZpvd = true;
    }

    public final java.lang.String valueOf() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("WATCH_LIST_TYPE", "ANY")) == null) ? "ANY" : string;
    }

    private final java.lang.String iwGUEr() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("WATCH_LIST_DISPLAY_NAME", "")) == null) ? "" : string;
    }

    public final boolean values() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("WATCH_LIST_IS_PRESENT");
        }
        return false;
    }

    public final MutableLiveData<java.lang.String> djBIcL() {
        return (MutableLiveData) this.ejfBZ.getValue();
    }

    public static final MutableLiveData KWHzl() {
        return C42955rgF.copydefault.copydefault();
    }

    public final GroupWatchListChildViewModel AYXKKw() {
        return (GroupWatchListChildViewModel) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.kIq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kIq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final androidx.fragment.app.Fragment copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return EZpvd(new C27931kIq(), str, str2, z);
        }

        public final androidx.fragment.app.Fragment EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("WATCH_LIST_TYPE", str);
            bundle.putString("WATCH_LIST_DISPLAY_NAME", str2);
            bundle.putBoolean("WATCH_LIST_IS_PRESENT", z);
            fragment.setArguments(bundle);
            return fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jSB.Application application = jSB.Companion;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        application.EZpvd(lifecycle, new Function1() { // from class: o.kIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27931kIq.EZpvd(this.AEQbTJ, (jSB) obj);
            }
        });
    }

    public static final Unit EZpvd(C27931kIq c27931kIq, jSB jsb) {
        Intrinsics.checkNotNullParameter(jsb, "");
        if (jsb instanceof jSB.ActionBar) {
            jSE jse = jSE.EZpvd;
            android.content.Context contextRequireContext = c27931kIq.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            jSE.showTip$default(jse, contextRequireContext, qZH.PendingIntent.dPkBzA, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", ((jSB.ActionBar) jsb).EZpvd())), 0, 8, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.ArrayList<CoinQuote> arrayList) {
        C55173xeu c55173xeuGEmmrt;
        C52794wYp c52794wYpAEQbTJ;
        if (this.fetchVPNInfo) {
            return;
        }
        if (!ejfBZ()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((CoinQuote) it.next()).setIcon("");
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        if ((!arrayList.isEmpty()) && C55608xnE.isLogin$default(null, 1, null)) {
            arrayList2.add(new UserGroupEditJumpData(valueOf(), iwGUEr(), "Discover_Fav", values()));
        }
        this.AkhnZx.setItems(arrayList2);
        this.AkhnZx.notifyDataSetChanged();
        if (!this.valueOf && isResumed() && C55608xnE.isLogin$default(null, 1, null)) {
            this.valueOf = true;
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            kKI kki = parentFragment instanceof kKI ? (kKI) parentFragment : null;
            if ((!arrayList2.isEmpty()) && ((kki != null && kki.ejfBZ()) || AuCTel())) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain().getImmediate(), null, new GroupWatchListQuoteFragment$updateContent$2(this, kki, null), 2, null);
            }
        }
        if (getHost() == null || getView() == null) {
            return;
        }
        if (!arrayList.isEmpty()) {
            C41381qpj c41381qpj = this.fARcdN;
            if (c41381qpj != null) {
                c41381qpj.values();
                return;
            }
            return;
        }
        C41381qpj c41381qpj2 = this.fARcdN;
        if (c41381qpj2 != null) {
            c41381qpj2.AEQbTJ(qZH.PendingIntent.apAOXX, qZH.PendingIntent.DztXDE, values() ? 0 : qZH.PendingIntent.DcMfJKOmnske, 7, new Function0() { // from class: o.kIu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27931kIq.AYXKKw(this.OLrzqt);
                }
            });
        }
        C41381qpj c41381qpj3 = this.fARcdN;
        if (c41381qpj3 == null || (c55173xeuGEmmrt = c41381qpj3.gEmmrt()) == null || (c52794wYpAEQbTJ = c55173xeuGEmmrt.AEQbTJ()) == null) {
            return;
        }
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYpAEQbTJ.getContext(), C52761wXj.TaskDescription.onLocationChanged);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
        }
        c52794wYpAEQbTJ.setCompoundDrawables(drawable, null, null, null);
        c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
    }

    public static final Unit AYXKKw(C27931kIq c27931kIq) {
        C32866mlf.onEvent$default("Favorites_Page_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.kIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27931kIq.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FavoriteSearchActivity.Activity activity = FavoriteSearchActivity.Companion;
        android.content.Context contextRequireContext = c27931kIq.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activity.AEQbTJ(contextRequireContext, new UserGroupEditJumpData(c27931kIq.valueOf(), c27931kIq.iwGUEr(), "Discover_Fav", c27931kIq.values()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "add_crypto", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(RecyclerView recyclerView, Continuation<? super android.view.View> continuation) throws java.lang.Throwable {
        GroupWatchListQuoteFragment$getLastVisibleItemView$1 groupWatchListQuoteFragment$getLastVisibleItemView$1;
        C27931kIq c27931kIq;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (continuation instanceof GroupWatchListQuoteFragment$getLastVisibleItemView$1) {
            groupWatchListQuoteFragment$getLastVisibleItemView$1 = (GroupWatchListQuoteFragment$getLastVisibleItemView$1) continuation;
            int i = groupWatchListQuoteFragment$getLastVisibleItemView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListQuoteFragment$getLastVisibleItemView$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListQuoteFragment$getLastVisibleItemView$1 = new GroupWatchListQuoteFragment$getLastVisibleItemView$1(this, continuation);
            }
        }
        java.lang.Object obj = groupWatchListQuoteFragment$getLastVisibleItemView$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupWatchListQuoteFragment$getLastVisibleItemView$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return null;
            }
            if (!recyclerView.canScrollVertically(1)) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(recyclerView.getAdapter() != null ? r11.getItemCount() - 1 : 0);
                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                    return viewHolderFindViewHolderForAdapterPosition2.itemView;
                }
                return null;
            }
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            recyclerView.scrollToPosition(java.lang.Math.max(adapter2 != null ? adapter2.getItemCount() - 1 : 0, 0));
            groupWatchListQuoteFragment$getLastVisibleItemView$1.L$0 = this;
            groupWatchListQuoteFragment$getLastVisibleItemView$1.L$1 = recyclerView;
            groupWatchListQuoteFragment$getLastVisibleItemView$1.label = 1;
            if (DelayKt.delay(100L, groupWatchListQuoteFragment$getLastVisibleItemView$1) == objCopydefault) {
                return objCopydefault;
            }
            c27931kIq = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                recyclerView = (RecyclerView) groupWatchListQuoteFragment$getLastVisibleItemView$1.L$0;
                C56391yDq.AEQbTJ(obj);
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(recyclerView.getAdapter() != null ? r11.getItemCount() - 1 : 0);
                if (viewHolderFindViewHolderForAdapterPosition == null) {
                    return viewHolderFindViewHolderForAdapterPosition.itemView;
                }
                return null;
            }
            recyclerView = (RecyclerView) groupWatchListQuoteFragment$getLastVisibleItemView$1.L$1;
            c27931kIq = (C27931kIq) groupWatchListQuoteFragment$getLastVisibleItemView$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        GroupWatchListQuoteFragment$getLastVisibleItemView$2 groupWatchListQuoteFragment$getLastVisibleItemView$2 = new GroupWatchListQuoteFragment$getLastVisibleItemView$2(c27931kIq, recyclerView, null);
        groupWatchListQuoteFragment$getLastVisibleItemView$1.L$0 = recyclerView;
        groupWatchListQuoteFragment$getLastVisibleItemView$1.L$1 = null;
        groupWatchListQuoteFragment$getLastVisibleItemView$1.label = 2;
        if (TimeoutKt.withTimeout(250L, groupWatchListQuoteFragment$getLastVisibleItemView$2, groupWatchListQuoteFragment$getLastVisibleItemView$1) == objCopydefault) {
            return objCopydefault;
        }
        viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(recyclerView.getAdapter() != null ? r11.getItemCount() - 1 : 0);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
        }
    }

    /* JADX INFO: renamed from: o.kIq$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public final /* synthetic */ CancellableContinuation<Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                pUU.KWHzl(C27931kIq.this.getTAG(), "onScrollStateChanged: 0");
                recyclerView.removeOnScrollListener(this);
                if (this.copydefault.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = this.copydefault;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kIq$StateListAnimator */
    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ Activity AEQbTJ;
        public final /* synthetic */ RecyclerView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(RecyclerView recyclerView, Activity activity) {
            this.EZpvd = recyclerView;
            this.AEQbTJ = activity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            EZpvd(th);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.Throwable th) {
            this.EZpvd.removeOnScrollListener(this.AEQbTJ);
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        rVN.copydefault(this);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListQuoteFragment$onVisible$1(this, null), 3, null);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        try {
            Result.Application application = Result.Companion;
            C52812wZg c52812wZg = this.gEmmrt;
            if (c52812wZg != null) {
                c52812wZg.KWHzl();
            }
            android.view.View view = getView();
            android.widget.LinearLayout linearLayout = view != null ? (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.TarCU) : null;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C46796tdt c46796tdt;
        Intrinsics.checkNotNullParameter(view, "");
        this.fARcdN = (C41381qpj) view.findViewById(qZH.StateListAnimator.adwzgZ);
        C46796tdt c46796tdt2 = (C46796tdt) view.findViewById(qZH.StateListAnimator.IKQXqd);
        this.values = c46796tdt2;
        if (c46796tdt2 != null) {
            c46796tdt2.setItemViewCacheSize(12);
        }
        if (C41307qoO.EZpvd.OLrzqt() && (c46796tdt = this.values) != null) {
            c46796tdt.setNestedScrollingEnabled(true);
        }
        C46796tdt c46796tdt3 = this.values;
        if (c46796tdt3 != null) {
            c46796tdt3.setItemAnimator(new TaskDescription());
        }
        C46796tdt c46796tdt4 = this.values;
        if (c46796tdt4 != null) {
            c46796tdt4.addOnScrollListener(new Application());
        }
        C46796tdt c46796tdt5 = this.values;
        if (c46796tdt5 != null) {
            c46796tdt5.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        if (!this.AkhnZx.hasObservers()) {
            this.AkhnZx.setHasStableIds(true);
        }
        C46796tdt c46796tdt6 = this.values;
        if (c46796tdt6 != null) {
            c46796tdt6.setAdapter(this.AkhnZx);
        }
        this.getNewProxyInstance = (C33546myW) view.findViewById(qZH.StateListAnimator.Ohcwxs);
        EZpvd(this.AkhnZx);
        handleSort$default(this, false, 1, null);
        AkhnZx();
        Job job = this.fJNWhG;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fJNWhG = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListQuoteFragment$initView$4(this, null), 3, null);
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, AYXKKw(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$initView$5
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((GroupWatchListChildViewModel.TaskDescription) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((GroupWatchListChildViewModel.TaskDescription) obj).EZpvd((InterfaceC49371unL<? extends List<CoinQuote>>) obj2);
            }
        }, null, new GroupWatchListQuoteFragment$initView$6(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.kIq$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C27931kIq.this.KWHzl(false);
            } else {
                if (i != 1) {
                    return;
                }
                C27931kIq.this.KWHzl(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(boolean z) {
        if (z != this.AhwBna) {
            this.AhwBna = z;
            this.iwGUEr = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // o.InterfaceC46790tdn
    public void AEQbTJ(java.util.List<?> list, boolean z) {
        InterfaceC46790tdn.StateListAnimator.AEQbTJ(this, list, z);
        getTAG();
        if (z && this.AuCTel) {
            getTAG();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupWatchListQuoteFragment$onUserActionEnd$1(this, list, null), 3, null);
        } else {
            OLrzqt(false);
        }
        this.AuCTel = false;
        C33546myW c33546myW = this.getNewProxyInstance;
        if (c33546myW != null) {
            c33546myW.setEnabled(true);
        }
    }

    @Override // o.InterfaceC46790tdn
    public void EZpvd(int i, java.lang.Object obj) {
        getTAG();
        OLrzqt(true);
        C33546myW c33546myW = this.getNewProxyInstance;
        if (c33546myW != null) {
            c33546myW.setEnabled(false);
        }
        if (obj instanceof CoinQuote) {
            this.isConnected = (CoinQuote) obj;
        }
    }

    public final void AkhnZx() {
        final C46796tdt c46796tdt = this.values;
        if (c46796tdt != null) {
            C46802tdz c46802tdz = this.hDKMBd;
            if (c46802tdz != null) {
                if (Intrinsics.EZpvd(c46802tdz != null ? c46802tdz.djBIcL() : null, c46796tdt)) {
                    return;
                }
            }
            this.hDKMBd = new C46802tdz(c46796tdt, this.AkhnZx, this, false, new Function0() { // from class: o.kIw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C27931kIq.djBIcL(this.OLrzqt));
                }
            }, new GroupWatchListQuoteFragment$initTouchDrag$1$2(this), new Function1() { // from class: o.kIA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27931kIq.KWHzl(this.copydefault, c46796tdt, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final boolean djBIcL(C27931kIq c27931kIq) {
        java.lang.String value = c27931kIq.AYXKKw().EZpvd().getValue();
        return value == null || value.length() == 0;
    }

    public static final Unit KWHzl(C27931kIq c27931kIq, C46796tdt c46796tdt, int i) {
        c27931kIq.getTAG();
        try {
            Result.Application application = Result.Companion;
            java.lang.Object obj = c27931kIq.AkhnZx.getItems().get(i);
            java.lang.Boolean boolValueOf = null;
            c27931kIq.isConnected = obj instanceof CoinQuote ? (CoinQuote) obj : null;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c46796tdt.findViewHolderForAdapterPosition(i);
            android.view.View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
            if (view != null) {
                ActivityResultCaller parentFragment = c27931kIq.getParentFragment();
                AbstractC27554jxQ.ActionBar actionBar = parentFragment instanceof AbstractC27554jxQ.ActionBar ? (AbstractC27554jxQ.ActionBar) parentFragment : null;
                if (actionBar != null) {
                    boolValueOf = java.lang.Boolean.valueOf(actionBar.OLrzqt(view, i, c27931kIq.isConnected));
                }
            }
            Result.m7377constructorimpl(boolValueOf);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public final Sextet<kJH, kJO, kJN, kJS, kJM, kJP> copydefault(AbstractC27554jxQ.ActionBar actionBar, MutableLiveData<java.lang.String> mutableLiveData) {
        return new Sextet<>(new kJH(actionBar), new kJO(mutableLiveData, actionBar), new kJN(actionBar), new kJS(mutableLiveData, actionBar, false, 4, null), new kJM(actionBar), new kJP(actionBar));
    }

    public static final C27947kJf copydefault(InterfaceC56387yDm<C27947kJf> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public void EZpvd(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        final androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this;
        }
        Function0 function0 = new Function0() { // from class: o.kIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27931kIq.EZpvd();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$registerItemTemplates$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return parentFragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$registerItemTemplates$$inlined$viewModels$default$2
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
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C27947kJf.class);
        Function0<ViewModelStore> function03 = new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$registerItemTemplates$$inlined$viewModels$default$3
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
        };
        final byte b = 0 == true ? 1 : 0;
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(parentFragment, interfaceC56551yJoAEQbTJ, function03, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$registerItemTemplates$$inlined$viewModels$default$4
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
                Function0 function04 = b;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        AbstractC27554jxQ.ActionBar actionBarKWHzl = parentFragment2 instanceof AbstractC27554jxQ.ActionBar ? (AbstractC27554jxQ.ActionBar) parentFragment2 : null;
        if (actionBarKWHzl == null) {
            actionBarKWHzl = copydefault((InterfaceC56387yDm<C27947kJf>) interfaceC56387yDmCreateViewModelLazy).KWHzl();
        }
        Sextet<kJH, kJO, kJN, kJS, kJM, kJP> sextetCopydefault = copydefault(new FragmentManager(actionBarKWHzl), djBIcL());
        InterfaceC59537zis interfaceC59537zisRegister = c59534zip.register(CoinQuote.class);
        kJH first = sextetCopydefault.getFirst();
        kJH kjh = first;
        kjh.gEmmrt();
        kjh.copydefault(true);
        kjh.OLrzqt("favorites");
        kjh.EZpvd(valueOf());
        kjh.AEQbTJ("discoverfavorites");
        kjh.copydefault("Discover_Fav");
        Unit unit = Unit.INSTANCE;
        kJO second = sextetCopydefault.getSecond();
        kJO kjo = second;
        kjo.OLrzqt("favorites");
        kjo.EZpvd(valueOf());
        kjo.copydefault("Discover_Fav");
        kJN third = sextetCopydefault.getThird();
        kJN kjn = third;
        kjn.OLrzqt("favorites");
        kjn.EZpvd(valueOf());
        kjn.copydefault("Discover_Fav");
        kJS fourth = sextetCopydefault.getFourth();
        kJS kjs = fourth;
        kjs.OLrzqt("favorites");
        kjs.EZpvd(valueOf());
        kjs.copydefault("Discover_Fav");
        kJM fifth = sextetCopydefault.getFifth();
        kJM kjm = fifth;
        kjm.OLrzqt("favorites");
        kjm.EZpvd(valueOf());
        kjm.copydefault("Discover_Fav");
        kJP sixth = sextetCopydefault.getSixth();
        kJP kjp = sixth;
        kjp.OLrzqt("favorites");
        kjp.EZpvd(valueOf());
        kjp.copydefault("Discover_Fav");
        interfaceC59537zisRegister.copydefault(first, second, third, fourth, fifth, sixth).AEQbTJ(new InterfaceC59531zim() { // from class: o.kIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return C27931kIq.EZpvd(this.EZpvd, i, (CoinQuote) obj);
            }
        });
        c59534zip.register(UserGroupEditJumpData.class, new C43029rha());
    }

    public static final ViewModelProvider.Factory EZpvd() {
        return new LoaderManager();
    }

    /* JADX INFO: renamed from: o.kIq$LoaderManager */
    public static final class LoaderManager implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C27947kJf(C43246rlf.OLrzqt.valueOf(), new kIR(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.kIq$FragmentManager */
    public static final class FragmentManager implements AbstractC27554jxQ.ActionBar {
        public final /* synthetic */ AbstractC27554jxQ.ActionBar AEQbTJ;

        public FragmentManager(AbstractC27554jxQ.ActionBar actionBar) {
            this.AEQbTJ = actionBar;
        }

        @Override // o.AbstractC27554jxQ.ActionBar
        public boolean OLrzqt(android.view.View view, int i, CoinQuote coinQuote) {
            AbstractC27554jxQ.ActionBar actionBar;
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.String strOLrzqt = C27931kIq.this.AYXKKw().OLrzqt();
            if (strOLrzqt == null || !C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) || (actionBar = this.AEQbTJ) == null) {
                return false;
            }
            return actionBar.OLrzqt(view, i, coinQuote);
        }
    }

    public static final int EZpvd(C27931kIq c27931kIq, int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.Integer num = c27931kIq.fIwbmz.get(coinQuote.getInstType());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void copydefault(int i, @NotNull SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        AYXKKw().KWHzl(i, sortType);
    }

    public static /* synthetic */ C42951rgB handleSort$default(C27931kIq c27931kIq, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSort");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return c27931kIq.EZpvd(z);
    }

    public C42951rgB EZpvd(boolean z) {
        android.view.View view = getView();
        C42951rgB c42951rgB = view != null ? (C42951rgB) view.findViewById(qZH.StateListAnimator.dGrqPl) : null;
        if (c42951rgB != null) {
            c42951rgB.setDisableVolumeSorter$OKMarket_market_impl(z);
        }
        if (c42951rgB != null) {
            c42951rgB.setCallback(DbNXlk(), isConnected(), new Function2() { // from class: o.kIo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C27931kIq.OLrzqt(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2);
                }
            });
        }
        if (c42951rgB != null) {
            c42951rgB.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        }
        if (c42951rgB != null) {
            c42951rgB.setVolumeSortChange(new yHT() { // from class: o.kIt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return C27931kIq.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2, ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                }
            });
        }
        return c42951rgB;
    }

    public static final Unit OLrzqt(C27931kIq c27931kIq, int i, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        c27931kIq.copydefault(i, sortType);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C27931kIq c27931kIq, int i, SortTextView.SortType sortType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (c27931kIq.gEmmrt()) {
            if (i2 == 1) {
                c27931kIq.djBIcL().setValue("Volume");
            } else {
                c27931kIq.djBIcL().setValue("Turnover");
            }
        }
        if (i3 == 0) {
            c27931kIq.AYXKKw().KWHzl("");
        } else if (i3 != 1) {
            if (i2 == 1) {
                c27931kIq.AYXKKw().KWHzl("volume_descending_sort");
            } else {
                c27931kIq.AYXKKw().KWHzl("turnover_descending_sort");
            }
        } else if (i2 == 1) {
            c27931kIq.AYXKKw().KWHzl("volume_ascending_sort");
        } else {
            c27931kIq.AYXKKw().KWHzl("turnover_ascending_sort");
        }
        return Unit.INSTANCE;
    }

    public java.lang.String[] isConnected() {
        java.lang.String strAYXKKw;
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw((interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 0) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.ihnvzI);
        if (Intrinsics.EZpvd((java.lang.Object) "Turnover", (java.lang.Object) C42955rgF.copydefault.OLrzqt())) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.AubY);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.AuCTelauCTel);
        }
        return new java.lang.String[]{C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn), C33070mpX.AYXKKw(qZH.PendingIntent.gdmIOq), strAYXKKw2, " / " + strAYXKKw};
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fIwbmz() {
        FragmentActivity activity;
        java.lang.Object objM7377constructorimpl;
        android.view.View viewFindViewById;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM7377constructorimpl3;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        android.view.View view;
        try {
            Result.Application application = Result.Companion;
            if (AuCTel() && (activity = getActivity()) != null) {
                try {
                    C46796tdt c46796tdt = this.values;
                    Unit unit = null;
                    if (c46796tdt != null) {
                        C52812wZg c52812wZg = new C52812wZg(activity);
                        RecyclerView.LayoutManager layoutManager = c46796tdt.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        java.lang.Integer numValueOf = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()) : null;
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            C46796tdt c46796tdt2 = this.values;
                            viewFindViewById = (c46796tdt2 == null || (viewHolderFindViewHolderForAdapterPosition = c46796tdt2.findViewHolderForAdapterPosition(iIntValue)) == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? null : view.findViewById(qZH.StateListAnimator.DcMfJKfbSiEC);
                        } else {
                            viewFindViewById = null;
                        }
                        if (numValueOf != null) {
                            try {
                                java.lang.Object obj = this.AkhnZx.getItems().get(numValueOf.intValue());
                                CoinQuote coinQuote = obj instanceof CoinQuote ? (CoinQuote) obj : null;
                                objM7377constructorimpl2 = Result.m7377constructorimpl(coinQuote);
                            } catch (java.lang.Throwable th) {
                                Result.Application application2 = Result.Companion;
                                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            Result.m7383isFailureimpl(objM7377constructorimpl2);
                            android.view.View view2 = getView();
                            android.widget.LinearLayout linearLayout = view2 != null ? (android.widget.LinearLayout) view2.findViewById(qZH.StateListAnimator.TarCU) : null;
                            if (linearLayout != null) {
                                linearLayout.removeAllViews();
                            }
                            if (linearLayout != null) {
                                int[] iArr = new int[2];
                                int[] iArr2 = new int[2];
                                android.view.View view3 = getView();
                                if (view3 != null) {
                                    view3.getLocationOnScreen(iArr2);
                                }
                                if (viewFindViewById != null) {
                                    viewFindViewById.getLocationOnScreen(iArr);
                                }
                                try {
                                    Result.Application application3 = Result.Companion;
                                    objM7377constructorimpl3 = Result.m7377constructorimpl(java.lang.Integer.valueOf(iArr[1] - iArr2[1]));
                                } catch (java.lang.Throwable th2) {
                                    Result.Application application4 = Result.Companion;
                                    objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                                }
                                if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                                    objM7377constructorimpl3 = null;
                                }
                                java.lang.Integer num = (java.lang.Integer) objM7377constructorimpl3;
                                int iIntValue2 = num != null ? num.intValue() : 0;
                                MarketToolDialog.Activity activity2 = MarketToolDialog.Companion;
                                activity2.AEQbTJ(iIntValue2 + C55298xhM.dp2px$default(6.0f, null, 1, null), activity2.EZpvd(), linearLayout);
                            }
                            if (viewFindViewById != null && linearLayout != null) {
                                LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3(viewFindViewById, linearLayout, this, c52812wZg, null));
                            }
                            unit = Unit.INSTANCE;
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                } catch (java.lang.Throwable th3) {
                    Result.Application application5 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th4) {
            Result.Application application6 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
        }
    }

    public final java.lang.Object copydefault(RecyclerView recyclerView, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Activity activity = new Activity(cancellableContinuationImpl);
        if (recyclerView.getScrollState() == 0) {
            if (cancellableContinuationImpl.isActive()) {
                Result.Application application = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        } else {
            recyclerView.addOnScrollListener(activity);
        }
        cancellableContinuationImpl.invokeOnCancellation(new StateListAnimator(recyclerView, activity));
        recyclerView.addOnScrollListener(activity);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }
}
