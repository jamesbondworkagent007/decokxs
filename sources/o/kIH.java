package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
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
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$initTouchDrag$1$2;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$initView$4$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$2;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$3;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onUserActionEnd$1;
import com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onVisible$1;
import com.okinc.core.widget.SortTextView;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.bean.MarketDataSource;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC27554jxQ;
import o.C52761wXj;
import o.InterfaceC46790tdn;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kIH extends AbstractC32998moE implements InterfaceC46790tdn, InterfaceC49363unD, qXK {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public CoinQuote AYXKKw;
    public C33546myW AkhnZx;
    public boolean EZpvd;
    public boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C46796tdt djBIcL;
    public boolean fetchVPNInfo;
    public C46802tdz isConnected;
    public final java.util.Map<java.lang.String, java.lang.Integer> valueOf;
    public C55052xcf values;
    public final /* synthetic */ qXB AEQbTJ = new qXB();
    public final C59534zip AhwBna = new C59534zip();
    public java.lang.String fJNWhG = "ANY";
    public kIR fARcdN = new kIR();
    public final MutableLiveData<java.lang.String> gEmmrt = C42955rgF.copydefault.copydefault();
    public long DbNXlk = -1;

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
    public void AEQbTJ(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.AEQbTJ.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean[] AYXKKw() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return new java.lang.Boolean[]{bool, bool, bool, bool};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinQuote AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i, int i2) {
        this.fetchVPNInfo = true;
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
    public void gEmmrt() {
        this.AEQbTJ.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.EZpvd;
    }

    public kIH() {
        Function0 function0 = new Function0() { // from class: o.kIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kIH.djBIcL(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(kIJ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.valueOf = C56424yEw.gEmmrt(C56390yDp.OLrzqt("COIN", 0), C56390yDp.OLrzqt("SPOT", 1), C56390yDp.OLrzqt("MARGIN", 2), C56390yDp.OLrzqt("SWAP", 3), C56390yDp.OLrzqt("FUTURES", 4), C56390yDp.OLrzqt("OPTION", 5));
    }

    public <T extends InterfaceC49369unJ<T>> java.lang.Object EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, function2, continuation);
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

    public static final class Activity implements ViewModelProvider.Factory {
        public Activity() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new kIJ(C43246rlf.OLrzqt.valueOf(), kIH.this.fJNWhG, kIH.this.fARcdN);
        }
    }

    public final kIJ EZpvd() {
        return (kIJ) this.OLrzqt.getValue();
    }

    public static final ViewModelProvider.Factory djBIcL(kIH kih) {
        return kih.new Activity();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kIH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final kIH AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            kIH kih = new kIH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("WATCH_LIST_TYPE", str);
            kih.setArguments(bundle);
            return kih;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        kIR newProxyInstance;
        java.lang.String string;
        super.onCreate(bundle);
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        kIY kiy = parentFragment instanceof kIY ? (kIY) parentFragment : null;
        if (kiy == null || (newProxyInstance = kiy.getNewProxyInstance()) == null) {
            newProxyInstance = this.fARcdN;
        }
        this.fARcdN = newProxyInstance;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("WATCH_LIST_TYPE", this.fJNWhG)) == null) {
            string = this.fJNWhG;
        }
        this.fJNWhG = string;
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WatchListNewQuoteFragment$onCreate$1(this, null));
        if (Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "SWAP")) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WatchListNewQuoteFragment$onCreate$2(this, null));
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WatchListNewQuoteFragment$onCreate$3(this, null));
        }
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("WATCH_LIST_TYPE", this.fJNWhG)) == null) {
            string = this.fJNWhG;
        }
        this.fJNWhG = string;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        rVN.copydefault(this);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchListNewQuoteFragment$onVisible$1(this, null), 3, null);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ kIH OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, kIH kih) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = kih;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new WatchListNewQuoteFragment$initView$4$1(this.OLrzqt, null), 3, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(InterfaceC49371unL<? extends java.util.List<? extends kotlin.Pair<CoinQuote, ? extends MarketDataSource>>> interfaceC49371unL) {
        char c;
        java.lang.Object obj;
        java.lang.Object next;
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            java.util.Iterator it = ((java.lang.Iterable) activity.copydefault()).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) ((kotlin.Pair) next).getSecond()).getInstType(), (java.lang.Object) "SWAP")) {
                        break;
                    }
                }
            }
            kotlin.Pair pair = (kotlin.Pair) next;
            java.util.Iterator it2 = ((java.lang.Iterable) activity.copydefault()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) ((kotlin.Pair) next2).getSecond()).getInstType(), (java.lang.Object) "FUTURES")) {
                    obj = next2;
                    break;
                }
            }
            c = (pair == null || ((kotlin.Pair) obj) == null) ? (char) 0 : (char) 2;
        }
        if (c != 2) {
            EZpvd().OLrzqt("");
        }
        C55052xcf c55052xcf = this.values;
        if (c55052xcf != null) {
            c55052xcf.setVisibility((c == 2 && isResumed()) ? 0 : 8);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.View view2;
        Intrinsics.checkNotNullParameter(view, "");
        C46796tdt c46796tdt = (C46796tdt) view.findViewById(qZH.StateListAnimator.IKQXqd);
        this.djBIcL = c46796tdt;
        if (c46796tdt != null) {
            c46796tdt.setItemViewCacheSize(12);
        }
        C46796tdt c46796tdt2 = this.djBIcL;
        if (c46796tdt2 != null) {
            c46796tdt2.setItemAnimator(new TaskDescription());
        }
        C46796tdt c46796tdt3 = this.djBIcL;
        if (c46796tdt3 != null) {
            c46796tdt3.addOnScrollListener(new Fragment());
        }
        C46796tdt c46796tdt4 = this.djBIcL;
        if (c46796tdt4 != null) {
            c46796tdt4.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        if (!this.AhwBna.hasObservers()) {
            this.AhwBna.setHasStableIds(true);
        }
        C46796tdt c46796tdt5 = this.djBIcL;
        if (c46796tdt5 != null) {
            c46796tdt5.setAdapter(this.AhwBna);
        }
        this.AkhnZx = (C33546myW) view.findViewById(qZH.StateListAnimator.Ohcwxs);
        C55052xcf c55052xcf = null;
        AEQbTJ((C55173xeu) view.findViewById(qZH.StateListAnimator.QIZEnU), (C55113xdn) null, view.findViewById(qZH.StateListAnimator.DRGLNw));
        copydefault(this.AhwBna);
        DbNXlk();
        isConnected();
        if (Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "SWAP")) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            if (parentFragment != null && (view2 = parentFragment.getView()) != null) {
                c55052xcf = (C55052xcf) view2.findViewById(qZH.StateListAnimator.DPHOMC);
            }
            this.values = c55052xcf;
            if (c55052xcf != null) {
                c55052xcf.setSelected(false);
            }
            C55052xcf c55052xcf2 = this.values;
            if (c55052xcf2 != null) {
                c55052xcf2.setOnClickListener(new StateListAnimator(c55052xcf2, 1000L, this));
            }
        }
    }

    public static final class Fragment extends RecyclerView.OnScrollListener {
        public Fragment() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                kIH.this.AEQbTJ(false);
            } else {
                if (i != 1) {
                    return;
                }
                kIH.this.AEQbTJ(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        if (z != this.KWHzl) {
            this.KWHzl = z;
            this.DbNXlk = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // o.InterfaceC46790tdn
    public void AEQbTJ(java.util.List<?> list, boolean z) {
        InterfaceC46790tdn.StateListAnimator.AEQbTJ(this, list, z);
        getTAG();
        if (z && this.fetchVPNInfo) {
            getTAG();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), null, new WatchListNewQuoteFragment$onUserActionEnd$1(this, list, null), 2, null);
        } else {
            KWHzl(false);
        }
        this.fetchVPNInfo = false;
        C33546myW c33546myW = this.AkhnZx;
        if (c33546myW != null) {
            c33546myW.setEnabled(true);
        }
    }

    @Override // o.InterfaceC46790tdn
    public void EZpvd(int i, java.lang.Object obj) {
        getTAG();
        KWHzl(true);
        C33546myW c33546myW = this.AkhnZx;
        if (c33546myW != null) {
            c33546myW.setEnabled(false);
        }
        if (obj instanceof CoinQuote) {
            this.AYXKKw = (CoinQuote) obj;
        }
    }

    private final void isConnected() {
        final C46796tdt c46796tdt = this.djBIcL;
        if (c46796tdt != null) {
            C46802tdz c46802tdz = this.isConnected;
            if (c46802tdz != null) {
                if (Intrinsics.EZpvd(c46802tdz != null ? c46802tdz.djBIcL() : null, c46796tdt)) {
                    return;
                }
            }
            this.isConnected = new C46802tdz(c46796tdt, this.AhwBna, this, false, new Function0() { // from class: o.kIP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(kIH.AkhnZx(this.OLrzqt));
                }
            }, new WatchListNewQuoteFragment$initTouchDrag$1$2(this), new Function1() { // from class: o.kIU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kIH.OLrzqt(this.EZpvd, c46796tdt, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final boolean AkhnZx(kIH kih) {
        java.lang.String strKWHzl;
        java.lang.String value = kih.EZpvd().gEmmrt().getValue();
        return (value == null || value.length() == 0) && ((strKWHzl = kih.EZpvd().KWHzl()) == null || strKWHzl.length() == 0);
    }

    public static final Unit OLrzqt(kIH kih, C46796tdt c46796tdt, int i) {
        kih.getTAG();
        try {
            Result.Application application = Result.Companion;
            java.lang.Object obj = kih.AhwBna.getItems().get(i);
            java.lang.Boolean boolValueOf = null;
            kih.AYXKKw = obj instanceof CoinQuote ? (CoinQuote) obj : null;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c46796tdt.findViewHolderForAdapterPosition(i);
            android.view.View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
            if (view != null) {
                ActivityResultCaller parentFragment = kih.getParentFragment();
                AbstractC27554jxQ.ActionBar actionBar = parentFragment instanceof AbstractC27554jxQ.ActionBar ? (AbstractC27554jxQ.ActionBar) parentFragment : null;
                if (actionBar != null) {
                    boolValueOf = java.lang.Boolean.valueOf(actionBar.OLrzqt(view, i, kih.AYXKKw));
                }
            }
            Result.m7377constructorimpl(boolValueOf);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final C27947kJf KWHzl(InterfaceC56387yDm<C27947kJf> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        final androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this;
        }
        Function0 function0 = new Function0() { // from class: o.kIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kIH.OLrzqt();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$registerItemTemplates$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$registerItemTemplates$$inlined$viewModels$default$2
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
        Function0<ViewModelStore> function03 = new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$registerItemTemplates$$inlined$viewModels$default$3
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
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(parentFragment, interfaceC56551yJoAEQbTJ, function03, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$registerItemTemplates$$inlined$viewModels$default$4
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
            actionBarKWHzl = KWHzl((InterfaceC56387yDm<C27947kJf>) interfaceC56387yDmCreateViewModelLazy).KWHzl();
        }
        LoaderManager loaderManager = new LoaderManager(actionBarKWHzl);
        InterfaceC59537zis interfaceC59537zisRegister = c59534zip.register(CoinQuote.class);
        kJH kjh = new kJH(loaderManager);
        kjh.gEmmrt();
        kjh.copydefault(true);
        kjh.OLrzqt("favorites");
        kjh.EZpvd(this.fJNWhG);
        kjh.AEQbTJ("discoverfavorites");
        kjh.copydefault("Discover_Fav");
        Unit unit = Unit.INSTANCE;
        kJO kjo = new kJO(this.gEmmrt, loaderManager);
        kjo.OLrzqt("favorites");
        kjo.EZpvd(this.fJNWhG);
        kjo.copydefault("Discover_Fav");
        kJN kjn = new kJN(loaderManager);
        kjn.OLrzqt("favorites");
        kjn.EZpvd(this.fJNWhG);
        kjn.copydefault("Discover_Fav");
        kJS kjs = new kJS(this.gEmmrt, loaderManager, false, 4, null);
        kjs.OLrzqt("favorites");
        kjs.EZpvd(this.fJNWhG);
        kjs.copydefault("Discover_Fav");
        kJM kjm = new kJM(loaderManager);
        kjm.OLrzqt("favorites");
        kjm.EZpvd(this.fJNWhG);
        kjm.copydefault("Discover_Fav");
        kJP kjp = new kJP(loaderManager);
        kjp.OLrzqt("favorites");
        kjp.EZpvd(this.fJNWhG);
        kjp.copydefault("Discover_Fav");
        interfaceC59537zisRegister.copydefault(kjh, kjo, kjn, kjs, kjm, kjp).AEQbTJ(new InterfaceC59531zim() { // from class: o.kIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return kIH.AEQbTJ(this.KWHzl, i, (CoinQuote) obj);
            }
        });
    }

    public static final ViewModelProvider.Factory OLrzqt() {
        return new Dialog();
    }

    public static final class Dialog implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C27947kJf(C43246rlf.OLrzqt.valueOf(), new kIR(), null, 4, null);
        }
    }

    public static final class LoaderManager implements AbstractC27554jxQ.ActionBar {
        public final /* synthetic */ AbstractC27554jxQ.ActionBar AEQbTJ;

        public LoaderManager(AbstractC27554jxQ.ActionBar actionBar) {
            this.AEQbTJ = actionBar;
        }

        @Override // o.AbstractC27554jxQ.ActionBar
        public boolean OLrzqt(android.view.View view, int i, CoinQuote coinQuote) {
            AbstractC27554jxQ.ActionBar actionBar;
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.String strOLrzqt = kIH.this.EZpvd().OLrzqt();
            if (strOLrzqt == null || !C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) || (actionBar = this.AEQbTJ) == null) {
                return false;
            }
            return actionBar.OLrzqt(view, i, coinQuote);
        }
    }

    public static final int AEQbTJ(kIH kih, int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.Integer num = kih.valueOf.get(coinQuote.getInstType());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final class ActionBar implements ViewModelProvider.Factory {
        public ActionBar() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new kIJ(C43246rlf.OLrzqt.valueOf(), kIH.this.fJNWhG, kIH.this.fARcdN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        android.content.res.Resources resources;
        Function0 function0 = new Function0() { // from class: o.kIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kIH.values(this.copydefault);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$handleSort$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$handleSort$$inlined$viewModels$default$2
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
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(kIJ.class);
        Function0<ViewModelStore> function03 = new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$handleSort$$inlined$viewModels$default$3
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
        final InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ, function03, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$handleSort$$inlined$viewModels$default$4
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
        android.view.View view = getView();
        C42951rgB c42951rgB = view != null ? (C42951rgB) view.findViewById(qZH.StateListAnimator.dGrqPl) : null;
        if (c42951rgB != null) {
            c42951rgB.setCallback(AYXKKw(), djBIcL(), new Function2() { // from class: o.kII
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return kIH.EZpvd(interfaceC56387yDmCreateViewModelLazy, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2);
                }
            });
        }
        android.content.Context context = getContext();
        if (context != null && c42951rgB != null) {
            c42951rgB.setMiddleMarginEnd(C55298xhM.OLrzqt(118.0f, context));
        }
        if (c42951rgB != null) {
            android.content.Context context2 = getContext();
            c42951rgB.setBackgroundColor((context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getColor(C52761wXj.Activity.EZpvd));
        }
        if (c42951rgB != null) {
            c42951rgB.setVolumeSortChange(new yHT() { // from class: o.kIO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return kIH.copydefault(this.OLrzqt, interfaceC56387yDmCreateViewModelLazy, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2, ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final kIJ OLrzqt(InterfaceC56387yDm<kIJ> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final ViewModelProvider.Factory values(kIH kih) {
        return kih.new ActionBar();
    }

    public static final Unit EZpvd(InterfaceC56387yDm interfaceC56387yDm, int i, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        OLrzqt((InterfaceC56387yDm<kIJ>) interfaceC56387yDm).AEQbTJ(i, sortType);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kIH kih, InterfaceC56387yDm interfaceC56387yDm, int i, SortTextView.SortType sortType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (i2 == 1) {
            kih.gEmmrt.setValue("Volume");
        } else {
            kih.gEmmrt.setValue("Turnover");
        }
        if (i3 == 0) {
            OLrzqt((InterfaceC56387yDm<kIJ>) interfaceC56387yDm).EZpvd("");
        } else if (i3 != 1) {
            if (i2 == 1) {
                OLrzqt((InterfaceC56387yDm<kIJ>) interfaceC56387yDm).EZpvd("volume_descending_sort");
            } else {
                OLrzqt((InterfaceC56387yDm<kIJ>) interfaceC56387yDm).EZpvd("turnover_descending_sort");
            }
        } else if (i2 == 1) {
            OLrzqt((InterfaceC56387yDm<kIJ>) interfaceC56387yDm).EZpvd("volume_ascending_sort");
        } else {
            OLrzqt((InterfaceC56387yDm<kIJ>) interfaceC56387yDm).EZpvd("turnover_ascending_sort");
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String[] djBIcL() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.util.ArrayList<kotlin.Pair<CoinQuote, MarketDataSource>> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            kotlin.Pair pair = (kotlin.Pair) obj;
            java.lang.String strKWHzl = EZpvd().KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0 || Intrinsics.EZpvd((java.lang.Object) ((MarketDataSource) pair.getSecond()).getInstType(), (java.lang.Object) strKWHzl)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((CoinQuote) ((kotlin.Pair) it.next()).getFirst());
        }
        this.AhwBna.setItems(arrayList3);
        this.AhwBna.notifyDataSetChanged();
        if (getHost() != null && getView() != null) {
            if (arrayList3.isEmpty()) {
                AEQbTJ(qZH.PendingIntent.DtnWsU, 0, 0, 4, new Function0() { // from class: o.kIT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return kIH.copydefault();
                    }
                });
            } else {
                gEmmrt();
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C55052xcf c55052xcf = this.values;
        if (c55052xcf != null) {
            c55052xcf.setVisibility(8);
        }
    }
}
