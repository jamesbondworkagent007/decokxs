package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$adapter$2$3;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$1;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$2;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$4;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$6;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1;
import com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet;
import com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesListViewModel;
import com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchActivity;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
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
import o.C26175jUs;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.jSB;
import o.jTS;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jSN extends jSI implements InterfaceC49363unD, qXK {
    public C26170jUn AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public C42683raz valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final /* synthetic */ qXB AYXKKw = new qXB();
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jSQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jSN.isConnected(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.jSP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jSN.fIwbmz(this.copydefault);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jSR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jSN.fetchVPNInfo(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.AYXKKw.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.AYXKKw.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw.copydefault(str, str2, str3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fIwbmz() {
        this.AYXKKw.copydefault();
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

    public jSN() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(MarketFavoritesListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jSN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) jSN.class);
            intent.putExtra("groupId", str);
            intent.putExtra("name", str2);
            return intent;
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            pUU.EZpvd("MarketFavoritesCryptosEditActivity", "startActivity groupName: " + str + ", displayingGroupName: " + str2);
            context.startActivity(EZpvd(context, str, str2));
        }
    }

    /* JADX DEBUG: Possible override for method o.jSI.AhwBna()V */
    public final MarketFavoritesListViewModel AhwBna() {
        return (MarketFavoritesListViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.jSI.OLrzqt()V */
    public final jTH OLrzqt() {
        return (jTH) this.gEmmrt.getValue();
    }

    public static final jTH isConnected(final jSN jsn) {
        return new jTH(new Function1() { // from class: o.jSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jSN.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new yHO() { // from class: o.jSM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return jSN.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), (C26175jUs) obj3);
            }
        }, new MarketFavoritesCryptosEditActivity$adapter$2$3(jsn));
    }

    public static final Unit EZpvd(jSN jsn, boolean z) {
        pUU.EZpvd(jsn.getTAG(), "onAllSelect: " + z);
        jsn.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jSN jsn, int i, boolean z, C26175jUs c26175jUs) {
        Intrinsics.checkNotNullParameter(c26175jUs, "");
        pUU.EZpvd(jsn.getTAG(), "onItemSelect: " + i + ", " + z + ", " + c26175jUs);
        jsn.fJNWhG();
        return Unit.INSTANCE;
    }

    public final ItemTouchHelper AYXKKw() {
        return (ItemTouchHelper) this.fetchVPNInfo.getValue();
    }

    public static final ItemTouchHelper fIwbmz(final jSN jsn) {
        return new ItemTouchHelper(new C26167jUk(new Function1() { // from class: o.jTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jSN.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, new Function2() { // from class: o.jTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jSN.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        }, new Function0() { // from class: o.jTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jSN.fJNWhG(this.EZpvd);
            }
        }, new Function0() { // from class: o.jSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jSN.fARcdN(this.KWHzl);
            }
        }));
    }

    public static final InterfaceC40516qYt OLrzqt(jSN jsn, int i) {
        return jsn.OLrzqt().copydefault(i);
    }

    public static final Unit copydefault(jSN jsn, int i, int i2) {
        pUU.EZpvd(jsn.getTAG(), "onDrawSwapItem: " + i + ", " + i2);
        jsn.OLrzqt().AEQbTJ(i, i2);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(jSN jsn) {
        pUU.EZpvd(jsn.getTAG(), "onDragStart");
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(jSN jsn) {
        pUU.EZpvd(jsn.getTAG(), "onDragEnd");
        C32866mlf.onEvent$default("Favorite_ManageToolsEditList_FullButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jSN.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        jsn.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "sort", false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String fetchVPNInfo(jSN jsn) {
        java.lang.String stringExtra;
        android.content.Intent intent = jsn.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("groupId")) == null) ? "" : stringExtra;
    }

    public final boolean DbNXlk() {
        C26170jUn c26170jUn = this.AhwBna;
        return c26170jUn != null && c26170jUn.AhwBna();
    }

    public final java.util.List<C26175jUs> djBIcL() {
        java.util.List<InterfaceC40516qYt> listEZpvd = OLrzqt().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (obj instanceof C26175jUs) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((C26175jUs) obj2).OLrzqt()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // o.jSI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String strGEmmrt;
        super.onCreate(bundle);
        C42683raz c42683razOLrzqt = C42683raz.OLrzqt(android.view.LayoutInflater.from(this));
        android.widget.TextView textView = c42683razOLrzqt.AkhnZx;
        android.content.Intent intent = getIntent();
        if (intent == null || (strGEmmrt = intent.getStringExtra("name")) == null) {
            strGEmmrt = gEmmrt();
        }
        textView.setText(strGEmmrt);
        OLrzqt(c42683razOLrzqt.KWHzl, c42683razOLrzqt.djBIcL, c42683razOLrzqt.AYXKKw, c42683razOLrzqt.AhwBna);
        c42683razOLrzqt.KWHzl.setGravity(17);
        androidx.appcompat.widget.Toolbar toolbar = c42683razOLrzqt.isConnected;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        KWHzl(toolbar);
        RecyclerView recyclerView = c42683razOLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        KWHzl(recyclerView);
        setContentView(c42683razOLrzqt.getRoot());
        AppCompatTextView appCompatTextView = c42683razOLrzqt.copydefault;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        AppCompatTextView appCompatTextView2 = c42683razOLrzqt.OLrzqt;
        appCompatTextView2.setOnClickListener(new StateListAnimator(appCompatTextView2, 1000L, this));
        android.widget.ImageView imageView = c42683razOLrzqt.EZpvd;
        imageView.setOnClickListener(new LoaderManager(imageView, 1000L, this));
        this.valueOf = c42683razOLrzqt;
        qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
        AkhnZx();
        jSB.Application application = jSB.Companion;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        application.EZpvd(lifecycle, new Function1() { // from class: o.jSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jSN.EZpvd(this.EZpvd, (jSB) obj);
            }
        });
        getSupportFragmentManager().setFragmentResultListener(MarketFavoritesEditGroupNameBottomSheet.class.getName(), this, new FragmentResultListener() { // from class: o.jTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                jSN.EZpvd(this.copydefault, str, bundle2);
            }
        });
    }

    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button_type", "add_to", false, 4, null);
        }
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button_type", "remove", false, 4, null);
        }
    }

    public static final Unit EZpvd(jSN jsn, jSB jsb) {
        Intrinsics.checkNotNullParameter(jsb, "");
        if (jsb instanceof jSB.ActionBar) {
            jSE.showTip$default(jSE.EZpvd, jsn, qZH.PendingIntent.dPkBzA, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", ((jSB.ActionBar) jsb).EZpvd())), 0, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jSN EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, jSN jsn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = jsn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Favorite_ManageToolsEditList_FullButton_Click", (TrackChannel[]) null, ActionBar.copydefault, 1, (java.lang.Object) null);
                this.EZpvd.values();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ jSN AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, jSN jsn) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = jsn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.valueOf();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ jSN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, jSN jsn) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = jsn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Favorite_ManageToolsEditList_FullButton_Click", (TrackChannel[]) null, Application.OLrzqt, 1, (java.lang.Object) null);
                this.copydefault.isConnected();
            }
        }
    }

    public static final void EZpvd(jSN jsn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        jsn.setResult(-1);
    }

    @Override // o.jSI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ejfBZ();
    }

    public final void valueOf() {
        java.lang.String strGEmmrt;
        C32866mlf.onEvent$default("Favorite_ManageToolsEditList_FullButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jSN.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FavoriteSearchActivity.Activity activity = FavoriteSearchActivity.Companion;
        java.lang.String strGEmmrt2 = gEmmrt();
        android.content.Intent intent = getIntent();
        if (intent == null || (strGEmmrt = intent.getStringExtra("name")) == null) {
            strGEmmrt = gEmmrt();
        }
        activity.AEQbTJ(this, new UserGroupEditJumpData(strGEmmrt2, strGEmmrt, "Discover_Fav", DbNXlk()));
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "add_crypto", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
        recyclerView.setAdapter(OLrzqt());
        AYXKKw().attachToRecyclerView(recyclerView);
    }

    public final void KWHzl(androidx.appcompat.widget.Toolbar toolbar) {
        setSupportActionBar(toolbar);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(false);
        }
        androidx.appcompat.app.ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setTitle("");
        }
        toolbar.setPadding(0, C33570myu.AEQbTJ((android.content.Context) this), 0, 0);
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C33570myu.AEQbTJ(toolbar.getContext()) + C33570myu.valueOf(toolbar.getContext());
            toolbar.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void copydefault(RecyclerView.ViewHolder viewHolder) {
        pUU.EZpvd(getTAG(), "startDrag: " + viewHolder.getBindingAdapterPosition());
        AYXKKw().startDrag(viewHolder);
    }

    public final void fJNWhG() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        int size = djBIcL().size();
        if (size > 0) {
            C42683raz c42683raz = this.valueOf;
            if (c42683raz != null && (appCompatTextView8 = c42683raz.copydefault) != null) {
                appCompatTextView8.setEnabled(true);
            }
            C42683raz c42683raz2 = this.valueOf;
            if (c42683raz2 != null && (appCompatTextView7 = c42683raz2.OLrzqt) != null) {
                appCompatTextView7.setEnabled(true);
            }
            C42683raz c42683raz3 = this.valueOf;
            if (c42683raz3 != null && (appCompatTextView6 = c42683raz3.copydefault) != null) {
                appCompatTextView6.setText(pTD.KWHzl(this, qZH.PendingIntent.getStatusCode, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(size)))));
            }
            C42683raz c42683raz4 = this.valueOf;
            if (c42683raz4 == null || (appCompatTextView5 = c42683raz4.OLrzqt) == null) {
                return;
            }
            appCompatTextView5.setText(pTD.KWHzl(this, qZH.PendingIntent.fcfzuX, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(size)))));
            return;
        }
        C42683raz c42683raz5 = this.valueOf;
        if (c42683raz5 != null && (appCompatTextView4 = c42683raz5.copydefault) != null) {
            appCompatTextView4.setEnabled(false);
        }
        C42683raz c42683raz6 = this.valueOf;
        if (c42683raz6 != null && (appCompatTextView3 = c42683raz6.OLrzqt) != null) {
            appCompatTextView3.setEnabled(false);
        }
        C42683raz c42683raz7 = this.valueOf;
        if (c42683raz7 != null && (appCompatTextView2 = c42683raz7.copydefault) != null) {
            appCompatTextView2.setText(getString(qZH.PendingIntent.DcMfJKdMCrTj));
        }
        C42683raz c42683raz8 = this.valueOf;
        if (c42683raz8 == null || (appCompatTextView = c42683raz8.OLrzqt) == null) {
            return;
        }
        appCompatTextView.setText(getString(qZH.PendingIntent.DcMfJKRKUgwx));
    }

    public final void AkhnZx() {
        MarketFavoritesListViewModel marketFavoritesListViewModelAhwBna = AhwBna();
        MarketFavoritesCryptosEditActivity$observeUiStates$1 marketFavoritesCryptosEditActivity$observeUiStates$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).KWHzl((InterfaceC49371unL) obj2);
            }
        };
        Lifecycle.State state = Lifecycle.State.CREATED;
        collectLatestOnLifecycle(marketFavoritesListViewModelAhwBna, marketFavoritesCryptosEditActivity$observeUiStates$1, state, new MarketFavoritesCryptosEditActivity$observeUiStates$2(this));
        collectLatestOnLifecycle(AhwBna(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).OLrzqt((InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>>) obj2);
            }
        }, state, new MarketFavoritesCryptosEditActivity$observeUiStates$4(this));
        collectLatestOnLifecycle(AhwBna(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity$observeUiStates$5
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesListViewModel.Application) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesListViewModel.Application) obj).EZpvd((InterfaceC49371unL) obj2);
            }
        }, state, new MarketFavoritesCryptosEditActivity$observeUiStates$6(this));
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(jSN jsn, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        jsn.copydefault((InterfaceC49371unL<? extends kotlin.Pair<C26170jUn, ? extends java.util.List<C26175jUs>>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object djBIcL(jSN jsn, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        jsn.OLrzqt((InterfaceC49371unL<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object KWHzl(jSN jsn, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        jsn.KWHzl((InterfaceC49371unL<Unit>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    private final void ejfBZ() {
        AhwBna().copydefault(gEmmrt());
    }

    public final void copydefault(InterfaceC49371unL<? extends kotlin.Pair<C26170jUn, ? extends java.util.List<C26175jUs>>> interfaceC49371unL) {
        android.widget.ImageView imageView;
        C55173xeu c55173xeu;
        C52794wYp c52794wYpAEQbTJ;
        Group group;
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            pUU.valueOf(getTAG(), "updateCryptoListUiStateView: empty");
            int i = qZH.PendingIntent.apAOXX;
            int i2 = qZH.PendingIntent.DztXDE;
            C26170jUn c26170jUn = this.AhwBna;
            AEQbTJ(i, i2, (c26170jUn == null || !c26170jUn.AhwBna()) ? qZH.PendingIntent.DcMfJKOmnske : 0, 7, new Function0() { // from class: o.jSW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jSN.AuCTel(this.OLrzqt);
                }
            });
            C42683raz c42683raz = this.valueOf;
            if (c42683raz != null && (group = c42683raz.AhwBna) != null) {
                group.setVisibility(0);
            }
            C42683raz c42683raz2 = this.valueOf;
            if (c42683raz2 != null && (c55173xeu = c42683raz2.KWHzl) != null && (c52794wYpAEQbTJ = c55173xeu.AEQbTJ()) != null) {
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.onLocationChanged);
                if (drawable != null) {
                    drawable.setBounds(0, 0, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                }
                c52794wYpAEQbTJ.setCompoundDrawables(drawable, null, null, null);
                c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
            }
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            pUU.copydefault(getTAG(), "updateCryptoListUiStateView: error " + ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ());
            EZpvd(qZH.PendingIntent.finit, 0, qZH.PendingIntent.fetchVPNInfo, new Function0() { // from class: o.jSX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jSN.ejfBZ(this.EZpvd);
                }
            });
            rVN.reportFullyDrawn$default((android.app.Activity) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            pUU.EZpvd(getTAG(), "updateCryptoListUiStateView: success " + activity.copydefault());
            kotlin.Pair pair = (kotlin.Pair) activity.copydefault();
            C26170jUn c26170jUn2 = (C26170jUn) pair.component1();
            java.util.List<C26175jUs> list = (java.util.List) pair.component2();
            this.AhwBna = c26170jUn2;
            C42683raz c42683raz3 = this.valueOf;
            if (c42683raz3 != null && (imageView = c42683raz3.EZpvd) != null) {
                imageView.setVisibility((c26170jUn2 != null && c26170jUn2.AhwBna()) ^ true ? 0 : 8);
            }
            OLrzqt().OLrzqt(list, new Function0() { // from class: o.jSU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jSN.iwGUEr(this.OLrzqt);
                }
            });
            if (list.isEmpty()) {
                copydefault(new InterfaceC49371unL.TaskDescription(null, 1, null));
            } else {
                fIwbmz();
            }
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AuCTel(jSN jsn) {
        jsn.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(jSN jsn) {
        jsn.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(jSN jsn) {
        if (!jsn.OLrzqt().OLrzqt()) {
            jsn.AuCTel();
        }
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1(this, null), 3, null);
    }

    public final void OLrzqt(InterfaceC49371unL<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<C26175jUs>>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            showLoading();
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            pUU.copydefault(getTAG(), "updateRemoveCryptosUiStateView: error " + application.AEQbTJ());
            C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
            dismissLoading();
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            pUU.EZpvd(getTAG(), "updateRemoveCryptosUiStateView: success " + activity.copydefault());
            kotlin.Pair pair = (kotlin.Pair) activity.copydefault();
            java.lang.String str = (java.lang.String) pair.component1();
            java.util.List<C26175jUs> list = (java.util.List) pair.component2();
            dismissLoading();
            OLrzqt().copydefault(list, new Function0() { // from class: o.jSS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jSN.uzCIH(this.OLrzqt);
                }
            });
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C26175jUs) it.next()).AEQbTJ().getInstId());
            }
            new jSB.StateListAnimator(arrayList, gEmmrt()).EZpvd();
            if (str == null || str.length() == 0) {
                jSE.showTip$default(jSE.EZpvd, this, qZH.PendingIntent.FQMcgEfQMcgE, null, 0, 12, null);
                return;
            } else {
                jSE.showTip$default(jSE.EZpvd, this, qZH.PendingIntent.Dap, C56423yEv.EZpvd(C56390yDp.OLrzqt("group", str)), 0, 8, null);
                return;
            }
        }
        dismissLoading();
    }

    public static final Unit uzCIH(jSN jsn) {
        jsn.fJNWhG();
        if (jsn.OLrzqt().OLrzqt()) {
            jsn.copydefault(new InterfaceC49371unL.TaskDescription(null, 1, null));
            jsn.setResult(-1);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(InterfaceC49371unL<Unit> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            if (!(application.AEQbTJ() instanceof CancellationException)) {
                pUU.copydefault(getTAG(), "updateRearrangeListUiStateView: error " + application.AEQbTJ());
                C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
                return;
            }
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            pUU.EZpvd(getTAG(), "updateRearrangeListUiStateView: success");
            jSB.TaskDescription.copydefault.KWHzl();
        }
    }

    public final void values() {
        pUU.EZpvd(getTAG(), "showAddToGroupsDialog");
        java.util.List<C26175jUs> listDjBIcL = djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add(((C26175jUs) it.next()).AEQbTJ());
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        jTS.StateListAnimator stateListAnimator = jTS.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        stateListAnimator.copydefault(supportFragmentManager, gEmmrt(), arrayList, "edit_list");
    }

    public final void isConnected() {
        final java.util.List<C26175jUs> listDjBIcL = djBIcL();
        if (!(!listDjBIcL.isEmpty())) {
            listDjBIcL = null;
        }
        if (listDjBIcL == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(viewOnClickListenerC54939xaY.getContext(), C52761wXj.Activity.HJWChPdIKEqB));
        java.lang.String string = getString(qZH.PendingIntent.getNewProxyInstance);
        Intrinsics.copydefault(string, "");
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, (java.lang.CharSequence) string, (View.OnClickListener) null, 2, (java.lang.Object) null);
        if (DbNXlk()) {
            viewOnClickListenerC54939xaY.setTitle(getString(qZH.PendingIntent.OEgNct));
            viewOnClickListenerC54939xaY.EZpvd(getString(qZH.PendingIntent.gkZNMa));
            java.lang.String string2 = getString(qZH.PendingIntent.fVjYLc);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string2, new View.OnClickListener() { // from class: o.jSV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jSN.KWHzl(viewOnClickListenerC54939xaY, this, listDjBIcL, view);
                }
            });
        } else {
            viewOnClickListenerC54939xaY.setTitle(getString(qZH.PendingIntent.gCZUJG));
            viewOnClickListenerC54939xaY.EZpvd(getString(qZH.PendingIntent.hNurIN));
            java.lang.String string3 = getString(qZH.PendingIntent.fVjYLc);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string3, new View.OnClickListener() { // from class: o.jSY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jSN.EZpvd(viewOnClickListenerC54939xaY, this, listDjBIcL, view);
                }
            });
            java.lang.String string4 = getString(qZH.PendingIntent.gsvlRV);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string4, new View.OnClickListener() { // from class: o.jTd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jSN.AhwBna(viewOnClickListenerC54939xaY, this, listDjBIcL, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, jSN jsn, java.util.List list, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        jsn.AhwBna().AEQbTJ((java.lang.String) null, (java.util.List<C26175jUs>) list);
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, jSN jsn, java.util.List list, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        jsn.AhwBna().AEQbTJ(jsn.gEmmrt(), (java.util.List<C26175jUs>) list);
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, jSN jsn, java.util.List list, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        jsn.AhwBna().AEQbTJ((java.lang.String) null, (java.util.List<C26175jUs>) list);
    }

    public final void fetchVPNInfo() {
        java.util.List<InterfaceC40516qYt> listEZpvd = OLrzqt().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (obj instanceof C26175jUs) {
                arrayList.add(obj);
            }
        }
        AhwBna().EZpvd(gEmmrt(), arrayList);
    }

    @Override // o.jSI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.jSI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.jSI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
