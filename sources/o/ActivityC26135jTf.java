package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$adapter$2$3;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$1;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$10;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$2;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$4;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$6;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$8;
import com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$updateLoadGroupsUiStateView$1;
import com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet;
import com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.concurrent.CancellationException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C26165jUi;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.jSB;
import o.qXK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jTf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC26135jTf extends jSF implements InterfaceC49363unD, qXK {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public C42633raB AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final /* synthetic */ qXB djBIcL = new qXB();
    public final ActivityResultLauncher<android.content.Intent> gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.AEQbTJ(i, i2, i3, i4, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.AEQbTJ(str, str2, str3, i, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw() {
        this.djBIcL.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.EZpvd(i, i2, i3, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(C55173xeu c55173xeu, C55113xdn c55113xdn, @NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        this.djBIcL.KWHzl(c55173xeu, c55113xdn, viewArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(long j) {
        this.djBIcL.copydefault(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qXK
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL.copydefault(str, str2, str3, function0);
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

    public ActivityC26135jTf() {
        final Function0 function0 = null;
        this.values = new ViewModelLazy(C56524yIo.AEQbTJ(MarketFavoritesGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.jTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC26135jTf.EZpvd(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.jTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26135jTf.AhwBna(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26135jTf.djBIcL(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.jTf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jTf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC26135jTf.class));
        }
    }

    public final MarketFavoritesGroupViewModel djBIcL() {
        return (MarketFavoritesGroupViewModel) this.values.getValue();
    }

    public static final void EZpvd(ActivityC26135jTf activityC26135jTf, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            activityC26135jTf.EZpvd(true);
        }
    }

    /* JADX DEBUG: Possible override for method o.jSF.KWHzl()V */
    public final C26155jTz KWHzl() {
        return (C26155jTz) this.AhwBna.getValue();
    }

    public static final C26155jTz AhwBna(final ActivityC26135jTf activityC26135jTf) {
        return new C26155jTz(new yHO() { // from class: o.jTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC26135jTf.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), (C26170jUn) obj3);
            }
        }, new Function2() { // from class: o.jTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC26135jTf.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (C26170jUn) obj2);
            }
        }, new MarketFavoritesGroupsEditActivity$adapter$2$3(activityC26135jTf), new Function2() { // from class: o.jTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC26135jTf.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C26170jUn) obj2);
            }
        });
    }

    public static final Unit copydefault(ActivityC26135jTf activityC26135jTf, int i, boolean z, C26170jUn c26170jUn) {
        Intrinsics.checkNotNullParameter(c26170jUn, "");
        pUU.EZpvd(activityC26135jTf.getTAG(), "onGroupItemHiddenChangeCallback: " + z + ", " + c26170jUn);
        C32866mlf.onEvent$default("Favorites_GroupManageTools_FullButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26135jTf.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC26135jTf.djBIcL().AEQbTJ(c26170jUn.AEQbTJ().getGroupName(), z);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "hide", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC26135jTf activityC26135jTf, int i, C26170jUn c26170jUn) {
        Intrinsics.checkNotNullParameter(c26170jUn, "");
        pUU.EZpvd(activityC26135jTf.getTAG(), "onGroupItemMoreClickCallback: " + c26170jUn);
        C32866mlf.onEvent$default("Favorites_GroupManageTools_FullButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26135jTf.djBIcL((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C26165jUi.Activity activity = C26165jUi.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC26135jTf.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        activity.EZpvd(supportFragmentManager, c26170jUn.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "edit", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC26135jTf activityC26135jTf, int i, C26170jUn c26170jUn) {
        Intrinsics.checkNotNullParameter(c26170jUn, "");
        pUU.EZpvd(activityC26135jTf.getTAG(), "onItemClickCallback: " + c26170jUn);
        C32866mlf.onEvent$default("Favorites_GroupManageTools_FullButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26135jTf.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC26135jTf.gEmmrt.launch(jSN.Companion.EZpvd(activityC26135jTf, c26170jUn.copydefault(), c26170jUn.KWHzl()));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "group_item", false, 4, null);
        return Unit.INSTANCE;
    }

    private final ItemTouchHelper gEmmrt() {
        return (ItemTouchHelper) this.valueOf.getValue();
    }

    public static final ItemTouchHelper djBIcL(final ActivityC26135jTf activityC26135jTf) {
        return new ItemTouchHelper(new C26164jUh(new Function1() { // from class: o.jTp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26135jTf.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, new Function2() { // from class: o.jTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC26135jTf.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        }, new Function0() { // from class: o.jTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26135jTf.valueOf(this.KWHzl);
            }
        }, new Function0() { // from class: o.jTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC26135jTf.AYXKKw(this.AEQbTJ);
            }
        }));
    }

    public static final InterfaceC40516qYt OLrzqt(ActivityC26135jTf activityC26135jTf, int i) {
        return activityC26135jTf.KWHzl().copydefault(i);
    }

    public static final Unit copydefault(ActivityC26135jTf activityC26135jTf, int i, int i2) {
        pUU.EZpvd(activityC26135jTf.getTAG(), "onDragSwapItem: " + i + ", " + i2);
        activityC26135jTf.KWHzl().EZpvd(i, i2);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC26135jTf activityC26135jTf) {
        pUU.EZpvd(activityC26135jTf.getTAG(), "onDragStart");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ActivityC26135jTf activityC26135jTf) {
        pUU.EZpvd(activityC26135jTf.getTAG(), "onDragEnd");
        C32866mlf.onEvent$default("Favorites_GroupManageTools_FullButton_Click", (TrackChannel[]) null, new Function1() { // from class: o.jTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC26135jTf.AYXKKw((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC26135jTf.djBIcL().KWHzl(activityC26135jTf.KWHzl().OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "sort", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.jSF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C42633raB c42633raBOLrzqt = C42633raB.OLrzqt(android.view.LayoutInflater.from(this));
        EZpvd(c42633raBOLrzqt.EZpvd, c42633raBOLrzqt.KWHzl, c42633raBOLrzqt.AEQbTJ);
        c42633raBOLrzqt.EZpvd.setGravity(17);
        androidx.appcompat.widget.Toolbar toolbar = c42633raBOLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        copydefault(toolbar);
        RecyclerView recyclerView = c42633raBOLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        OLrzqt(recyclerView);
        setContentView(c42633raBOLrzqt.getRoot());
        C52794wYp c52794wYp = c42633raBOLrzqt.copydefault;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        this.AYXKKw = c42633raBOLrzqt;
        qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
        valueOf();
        loadData$default(this, false, 1, null);
    }

    /* JADX INFO: renamed from: o.jTf$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity KWHzl = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button_type", "create", false, 4, null);
        }
    }

    private final void OLrzqt(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
        recyclerView.setAdapter(KWHzl());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        gEmmrt().attachToRecyclerView(recyclerView);
    }

    private final void copydefault(androidx.appcompat.widget.Toolbar toolbar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(RecyclerView.ViewHolder viewHolder) {
        pUU.EZpvd(getTAG(), "startDrag: " + viewHolder.getBindingAdapterPosition());
        gEmmrt().startDrag(viewHolder);
    }

    private final void valueOf() {
        MarketFavoritesGroupViewModel marketFavoritesGroupViewModelDjBIcL = djBIcL();
        MarketFavoritesGroupsEditActivity$observeUiStates$1 marketFavoritesGroupsEditActivity$observeUiStates$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).EZpvd((InterfaceC49371unL) obj2);
            }
        };
        Lifecycle.State state = Lifecycle.State.CREATED;
        collectLatestOnLifecycle(marketFavoritesGroupViewModelDjBIcL, marketFavoritesGroupsEditActivity$observeUiStates$1, state, new MarketFavoritesGroupsEditActivity$observeUiStates$2(this));
        collectLatestOnLifecycle(djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).AEQbTJ((InterfaceC49371unL) obj2);
            }
        }, state, new MarketFavoritesGroupsEditActivity$observeUiStates$4(this));
        collectLatestOnLifecycle(djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$5
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).copydefault((InterfaceC49371unL<String>) obj2);
            }
        }, state, new MarketFavoritesGroupsEditActivity$observeUiStates$6(this));
        collectLatestOnLifecycle(djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).KWHzl((InterfaceC49371unL<Unit>) obj2);
            }
        }, state, new MarketFavoritesGroupsEditActivity$observeUiStates$8(this));
        collectLatestOnLifecycle(djBIcL(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity$observeUiStates$9
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketFavoritesGroupViewModel.StateListAnimator) obj).valueOf();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketFavoritesGroupViewModel.StateListAnimator) obj).AhwBna((InterfaceC49371unL) obj2);
            }
        }, state, new MarketFavoritesGroupsEditActivity$observeUiStates$10(this));
        getSupportFragmentManager().setFragmentResultListener(MarketFavoritesEditGroupNameBottomSheet.class.getName(), this, new FragmentResultListener() { // from class: o.jTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                this.OLrzqt.KWHzl(str, bundle);
            }
        });
    }

    public static final /* synthetic */ java.lang.Object gEmmrt(ActivityC26135jTf activityC26135jTf, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        activityC26135jTf.EZpvd((InterfaceC49371unL<? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jTf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC26135jTf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC26135jTf activityC26135jTf) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = activityC26135jTf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Favorites_GroupManageTools_FullButton_Click", (TrackChannel[]) null, Activity.KWHzl, 1, (java.lang.Object) null);
                this.OLrzqt.KWHzl((java.lang.String) null);
            }
        }
    }

    public static final /* synthetic */ java.lang.Object AYXKKw(ActivityC26135jTf activityC26135jTf, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        activityC26135jTf.OLrzqt((InterfaceC49371unL<? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object AhwBna(ActivityC26135jTf activityC26135jTf, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        activityC26135jTf.AEQbTJ((InterfaceC49371unL<java.lang.String>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object valueOf(ActivityC26135jTf activityC26135jTf, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        activityC26135jTf.KWHzl((InterfaceC49371unL<Unit>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object djBIcL(ActivityC26135jTf activityC26135jTf, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        activityC26135jTf.copydefault((InterfaceC49371unL<? extends kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public final void EZpvd(InterfaceC49371unL<? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            qXK.StateListAnimator.showLoadingState$default(this, 0L, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            pUU.valueOf(getTAG(), "updateLoadGroupsUiStateView empty");
            AEQbTJ(qZH.PendingIntent.isConnected, 0, qZH.PendingIntent.fetchVPNInfo, 6, new MarketFavoritesGroupsEditActivity$updateLoadGroupsUiStateView$1(this));
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            pUU.copydefault(getTAG(), "updateLoadGroupsUiStateView error: " + ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ());
            EZpvd(qZH.PendingIntent.finit, 0, qZH.PendingIntent.fetchVPNInfo, new Function0() { // from class: o.jTl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC26135jTf.DbNXlk(this.copydefault);
                }
            });
            rVN.reportFullyDrawn$default((android.app.Activity) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            pUU.EZpvd(getTAG(), "updateLoadGroupsUiStateView ok: " + activity.copydefault());
            KWHzl().copydefault((kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>) activity.copydefault(), new Function0() { // from class: o.jTk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC26135jTf.values(this.KWHzl);
                }
            });
            if (KWHzl().EZpvd().isEmpty()) {
                EZpvd(new InterfaceC49371unL.TaskDescription(null, 1, null));
            } else {
                AYXKKw();
            }
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit DbNXlk(ActivityC26135jTf activityC26135jTf) {
        loadData$default(activityC26135jTf, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit values(final ActivityC26135jTf activityC26135jTf) {
        C42633raB c42633raB;
        C40499qYc c40499qYcKWHzl;
        final java.util.List<InterfaceC40516qYt> listEZpvd = activityC26135jTf.KWHzl().EZpvd();
        if ((!activityC26135jTf.KWHzl().EZpvd().isEmpty()) && (c42633raB = activityC26135jTf.AYXKKw) != null && (c40499qYcKWHzl = c42633raB.getRoot()) != null) {
            c40499qYcKWHzl.postDelayed(new java.lang.Runnable() { // from class: o.jTm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC26135jTf.EZpvd(this.AEQbTJ, listEZpvd);
                }
            }, 150L);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC26135jTf activityC26135jTf, java.util.List list) {
        C26172jUp c26172jUp = C26172jUp.AEQbTJ;
        C42633raB c42633raB = activityC26135jTf.AYXKKw;
        if (c42633raB == null) {
            return;
        }
        c26172jUp.copydefault(activityC26135jTf, c42633raB, list);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jTz.setData$default(o.jTz, kotlin.Pair, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void OLrzqt(InterfaceC49371unL<? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            C26155jTz.setData$default(KWHzl(), (kotlin.Pair) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault(), null, 2, null);
        }
    }

    public final void copydefault(InterfaceC49371unL<? extends kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.Boolean>, ? extends kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            pUU.copydefault(getTAG(), "updateGroupVisibilityUiStateView error: " + application.AEQbTJ());
            C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            pUU.EZpvd(getTAG(), "updateGroupVisibilityUiStateView ok: " + activity.copydefault());
            kotlin.Pair pair = (kotlin.Pair) activity.copydefault();
            kotlin.Pair pair2 = (kotlin.Pair) pair.component1();
            C26155jTz.setData$default(KWHzl(), (kotlin.Pair) pair.component2(), null, 2, null);
            new jSB.LoaderManager((java.lang.String) pair2.component1(), ((java.lang.Boolean) pair2.component2()).booleanValue()).KWHzl();
        }
    }

    public final void AEQbTJ(InterfaceC49371unL<java.lang.String> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
            showLoading(0L);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            pUU.copydefault(getTAG(), "updateDeleteGroupUiStateView error: " + application.AEQbTJ());
            dismissLoading();
            C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
            pUU.EZpvd(getTAG(), "updateDeleteGroupUiStateView ok: " + activity.copydefault());
            dismissLoading();
            java.lang.String str = (java.lang.String) activity.copydefault();
            KWHzl().KWHzl(str);
            new jSB.Dialog(str).OLrzqt();
            jSE.showTip$default(jSE.EZpvd, this, qZH.PendingIntent.zDGrpR, C56423yEv.EZpvd(C56390yDp.OLrzqt("group", str)), 0, 8, null);
            return;
        }
        dismissLoading();
    }

    public final void KWHzl(InterfaceC49371unL<Unit> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            if (!(application.AEQbTJ() instanceof CancellationException)) {
                pUU.copydefault(getTAG(), "updateRearrangeGroupsUiStateView error: " + application.AEQbTJ());
                C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
                return;
            }
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            pUU.EZpvd(getTAG(), "updateRearrangeGroupsUiStateView ok");
            jSB.SharedElementCallback.copydefault.OLrzqt();
        }
    }

    public static /* synthetic */ void loadData$default(ActivityC26135jTf activityC26135jTf, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activityC26135jTf.EZpvd(z);
    }

    private final void EZpvd(boolean z) {
        djBIcL().KWHzl(z);
    }

    public final void KWHzl(java.lang.String str, android.os.Bundle bundle) {
        pUU.EZpvd(getTAG(), "onGroupNameEditDone: " + str + " -> " + bundle);
        java.lang.String string = bundle.getString("groupId");
        java.lang.String string2 = bundle.getString(OtpEventTracker.OTP_EVENT_VALUE_NEW);
        if (string2 == null) {
            return;
        }
        if (string == null || string.length() == 0) {
            new jSB.FragmentManager(string2).KWHzl();
            finish();
        } else {
            new jSB.PendingIntent(string, string2).OLrzqt();
            jSE.showTip$default(jSE.EZpvd, this, qZH.PendingIntent.svhCHd, null, 0, 12, null);
            KWHzl().KWHzl(string, string2);
        }
    }

    public final void KWHzl(java.lang.String str) {
        pUU.EZpvd(getTAG(), "showEditGroupNameDialog: " + str);
        java.util.List<C26170jUn> listOLrzqt = KWHzl().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(((C26170jUn) it.next()).copydefault());
        }
        MarketFavoritesEditGroupNameBottomSheet.StateListAnimator stateListAnimator = MarketFavoritesEditGroupNameBottomSheet.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        MarketFavoritesEditGroupNameBottomSheet.StateListAnimator.show$default(stateListAnimator, supportFragmentManager, str, arrayList, null, 8, null);
    }

    public final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd(getTAG(), "showDeleteGroupConfirmDialog: " + str);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.OLrzqt(ContextCompat.getColor(this, C52761wXj.Activity.HJWChPdIKEqB));
        viewOnClickListenerC54939xaY.setTitle(getString(qZH.PendingIntent.FHvxmb));
        viewOnClickListenerC54939xaY.EZpvd(getString(qZH.PendingIntent.hdpuIA));
        java.lang.String string = getString(qZH.PendingIntent.getNewProxyInstance);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
        java.lang.String string2 = getString(qZH.PendingIntent.dbwnZN);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string2, new View.OnClickListener() { // from class: o.jTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC26135jTf.copydefault(viewOnClickListenerC54939xaY, this, str, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC26135jTf activityC26135jTf, java.lang.String str, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        activityC26135jTf.djBIcL().copydefault(str);
    }

    @Override // o.jSF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.jSF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.jSF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.jSF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
