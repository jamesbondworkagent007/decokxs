package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.market.discover.features.markets.MarketDiscoverMarketsFragment;
import com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$initListener$1;
import com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$initListener$2;
import com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$initListener$4;
import com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$setupRecyclerView$1;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesGroupViewModel;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C40694qcl;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.jSB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qcl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40694qcl extends AbstractC49393unh implements InterfaceC49363unD {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public C42650raS OLrzqt;
    public C46662tbR copydefault;

    public C40694qcl() {
        final Activity activity = new Activity(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) activity.invoke();
            }
        });
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketsFavoritesGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$special$$inlined$parentViewModels$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qcr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40694qcl.AhwBna(this.OLrzqt);
            }
        });
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

    /* JADX INFO: renamed from: o.qcl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qcl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qcl$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment show$default(Application application, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return application.KWHzl(fragmentManager, (Function0<Unit>) function0);
        }

        public final androidx.fragment.app.Fragment KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C40694qcl c40694qcl = new C40694qcl();
            c40694qcl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.qcs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    C40694qcl.Application.KWHzl(function0, dialogInterface);
                }
            });
            c40694qcl.show(fragmentManager, C40694qcl.class.getSimpleName());
            return c40694qcl;
        }

        public static final void KWHzl(Function0 function0, android.content.DialogInterface dialogInterface) {
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final MarketsFavoritesGroupViewModel AEQbTJ() {
        return (MarketsFavoritesGroupViewModel) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemTouchHelper KWHzl() {
        return (ItemTouchHelper) this.KWHzl.getValue();
    }

    public static final ItemTouchHelper AhwBna(final C40694qcl c40694qcl) {
        return new ItemTouchHelper(new C46734tck(new Function2() { // from class: o.qcq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40694qcl.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        }, new Function0() { // from class: o.qct
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40694qcl.gEmmrt(this.KWHzl);
            }
        }, new Function0() { // from class: o.qcp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40694qcl.valueOf(this.OLrzqt);
            }
        }, false, 8, null));
    }

    public static final Unit copydefault(C40694qcl c40694qcl, int i, int i2) {
        C41298qoF.AEQbTJ.EZpvd("PreMarketFavSwitchBottomSheet", "onDragSwapItem: " + i + ", " + i2);
        C46662tbR c46662tbR = c40694qcl.copydefault;
        if (c46662tbR != null) {
            c46662tbR.KWHzl(i, i2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C40694qcl c40694qcl) {
        C41298qoF.AEQbTJ.EZpvd("PreMarketFavSwitchBottomSheet", "onDragStart");
        C42650raS c42650raS = c40694qcl.OLrzqt;
        if (c42650raS == null) {
            Intrinsics.gEmmrt("");
            c42650raS = null;
        }
        c42650raS.OLrzqt.setNestedScrollingEnabled(false);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C40694qcl c40694qcl) {
        java.util.List<UserGroupVo> listCopydefault;
        C41298qoF.AEQbTJ.EZpvd("PreMarketFavSwitchBottomSheet", "onDragEnd");
        InterfaceC38466pZv interfaceC38466pZvCopydefault = C38470pZz.copydefault(c40694qcl);
        if (interfaceC38466pZvCopydefault != null) {
            interfaceC38466pZvCopydefault.EZpvd();
        }
        MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModelAEQbTJ = c40694qcl.AEQbTJ();
        C46662tbR c46662tbR = c40694qcl.copydefault;
        if (c46662tbR != null && (listCopydefault = c46662tbR.copydefault()) != null) {
            marketsFavoritesGroupViewModelAEQbTJ.EZpvd(listCopydefault);
            C42650raS c42650raS = c40694qcl.OLrzqt;
            if (c42650raS == null) {
                Intrinsics.gEmmrt("");
                c42650raS = null;
            }
            c42650raS.OLrzqt.setNestedScrollingEnabled(true);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42650raS c42650raSEZpvd = C42650raS.EZpvd(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c42650raSEZpvd, "");
        RecyclerView recyclerView = c42650raSEZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        AEQbTJ(recyclerView);
        this.OLrzqt = c42650raSEZpvd;
    }

    private final void AEQbTJ(RecyclerView recyclerView) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketSwitchFavoritesGroupBottomSheet$setupRecyclerView$1(recyclerView, this, null), 3, null);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
    }

    private final void copydefault() {
        MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModelAEQbTJ = AEQbTJ();
        MarketSwitchFavoritesGroupBottomSheet$initListener$1 marketSwitchFavoritesGroupBottomSheet$initListener$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$initListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketsFavoritesGroupViewModel.StateListAnimator) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketsFavoritesGroupViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        };
        Lifecycle.State state = Lifecycle.State.CREATED;
        collectLatestOnLifecycle(marketsFavoritesGroupViewModelAEQbTJ, marketSwitchFavoritesGroupBottomSheet$initListener$1, state, new MarketSwitchFavoritesGroupBottomSheet$initListener$2(this));
        collectLatestOnLifecycle(AEQbTJ(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.favorites.dialog.MarketSwitchFavoritesGroupBottomSheet$initListener$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketsFavoritesGroupViewModel.StateListAnimator) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketsFavoritesGroupViewModel.StateListAnimator) obj).copydefault((InterfaceC49371unL<Unit>) obj2);
            }
        }, state, new MarketSwitchFavoritesGroupBottomSheet$initListener$4(this));
        C42650raS c42650raS = this.OLrzqt;
        if (c42650raS == null) {
            Intrinsics.gEmmrt("");
            c42650raS = null;
        }
        AppCompatImageView appCompatImageView = c42650raS.AEQbTJ;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
    }

    public static final /* synthetic */ java.lang.Object KWHzl(C40694qcl c40694qcl, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        c40694qcl.OLrzqt((InterfaceC49371unL<? extends java.util.List<UserGroup>>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(C40694qcl c40694qcl, InterfaceC49371unL interfaceC49371unL, Continuation continuation) {
        c40694qcl.KWHzl((InterfaceC49371unL<Unit>) interfaceC49371unL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qcl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C40694qcl OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C40694qcl c40694qcl) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c40694qcl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    InterfaceC38466pZv interfaceC38466pZvCopydefault = C38470pZz.copydefault(this.OLrzqt);
                    if (interfaceC38466pZvCopydefault != null) {
                        interfaceC38466pZvCopydefault.OLrzqt();
                    }
                    if (C55608xnE.isLogin$default(null, 1, null)) {
                        ActivityC26135jTf.Companion.KWHzl(context);
                    } else {
                        ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).OLrzqt(context, new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null));
                    }
                    this.OLrzqt.dismissAllowingStateLoss();
                }
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tbR.setData$default(o.tbR, java.util.List, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void OLrzqt(InterfaceC49371unL<? extends java.util.List<UserGroup>> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            java.lang.Iterable iterable = (java.lang.Iterable) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : iterable) {
                if (!((UserGroup) obj).isHidden()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                dismissAllowingStateLoss();
            } else {
                C46662tbR c46662tbR = this.copydefault;
                if (c46662tbR != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new UserGroupVo((UserGroup) it.next()));
                    }
                    C46662tbR.setData$default(c46662tbR, arrayList2, null, 2, null);
                }
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            dismissAllowingStateLoss();
        } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            dismissAllowingStateLoss();
        }
    }

    private final void KWHzl(InterfaceC49371unL<Unit> interfaceC49371unL) {
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
            if (!(application.AEQbTJ() instanceof CancellationException)) {
                C41298qoF.e$default(C41298qoF.AEQbTJ, "PreMarketFavSwitchBottomSheet", "updateRearrangeGroupsUiStateView error: " + application.AEQbTJ(), null, 4, null);
                C41353qpH.friendlyToast$default(application.AEQbTJ(), false, 1, null);
                return;
            }
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
            C41298qoF.AEQbTJ.EZpvd("PreMarketFavSwitchBottomSheet", "updateRearrangeGroupsUiStateView ok");
            jSB.SharedElementCallback.copydefault.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.qcl$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
            if (fragment != null && !(fragment instanceof MarketDiscoverMarketsFragment)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof MarketDiscoverMarketsFragment)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof MarketDiscoverMarketsFragment)) {
                    parentFragment = null;
                }
                fragment = (MarketDiscoverMarketsFragment) parentFragment;
            }
            if (!(fragment instanceof MarketDiscoverMarketsFragment)) {
                fragment = null;
            }
            MarketDiscoverMarketsFragment marketDiscoverMarketsFragment = (MarketDiscoverMarketsFragment) fragment;
            MarketDiscoverMarketsFragment marketDiscoverMarketsFragment2 = marketDiscoverMarketsFragment instanceof ViewModelStoreOwner ? marketDiscoverMarketsFragment : null;
            if (marketDiscoverMarketsFragment2 != null) {
                return marketDiscoverMarketsFragment2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + MarketDiscoverMarketsFragment.class.getSimpleName()).toString());
        }
    }
}
