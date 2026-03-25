package o;

import android.view.ViewGroup;
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
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventShareData;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$1;
import com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$subscribeOnUiChange$2;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel;
import com.okinc.kline.features.widget.WrapContentLinearLayoutManager;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C35964oKf;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36142oQv extends AbstractC36135oQo implements InterfaceC49363unD, InterfaceC36144oQx {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public oMN AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public C55254xgV DbNXlk;
    public android.widget.LinearLayout djBIcL;
    public pXL fetchVPNInfo;
    public java.lang.String isConnected;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.oQA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36142oQv.djBIcL(this.OLrzqt);
        }
    });
    public C33546myW values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.RcXXUw;
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

    public C36142oQv() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketEventsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.MarketEventsFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.oQv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oQv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C36142oQv AEQbTJ() {
            return new C36142oQv();
        }
    }

    public static final oQK djBIcL(C36142oQv c36142oQv) {
        return new oQK(c36142oQv);
    }

    /* JADX DEBUG: Possible override for method o.oQo.OLrzqt()V */
    public final oQK OLrzqt() {
        return (oQK) this.valueOf.getValue();
    }

    public final MarketEventsViewModel djBIcL() {
        return (MarketEventsViewModel) this.AkhnZx.getValue();
    }

    public final int gEmmrt() {
        RecyclerView recyclerView;
        oMN omn = this.AYXKKw;
        RecyclerView.LayoutManager layoutManager = (omn == null || (recyclerView = omn.EZpvd) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        return 0;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = getActivity();
        this.values = activity != null ? (C33546myW) activity.findViewById(C35964oKf.StateListAnimator.getSessionToken) : null;
        FragmentActivity activity2 = getActivity();
        this.fetchVPNInfo = activity2 != null ? (pXL) activity2.findViewById(C35964oKf.StateListAnimator.SaJVGb) : null;
        FragmentActivity activity3 = getActivity();
        this.DbNXlk = activity3 != null ? (C55254xgV) activity3.findViewById(C35964oKf.StateListAnimator.DdI) : null;
        FragmentActivity activity4 = getActivity();
        this.djBIcL = activity4 != null ? (android.widget.LinearLayout) activity4.findViewById(C35964oKf.StateListAnimator.SQPLEi) : null;
        oMN omnAEQbTJ = oMN.AEQbTJ(view);
        this.AYXKKw = omnAEQbTJ;
        if (omnAEQbTJ != null && (recyclerView = omnAEQbTJ.EZpvd) != null) {
            copydefault(recyclerView);
        }
        valueOf();
        AYXKKw();
        C36133oQm.copydefault.AEQbTJ(this.isConnected, this.AhwBna);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AhwBna();
        pXL pxl = this.fetchVPNInfo;
        if (pxl != null) {
            pxl.setHeaderView(this.djBIcL);
        }
        pXL pxl2 = this.fetchVPNInfo;
        if (pxl2 != null) {
            pxl2.setExtraView(this.DbNXlk);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        pXL pxl = this.fetchVPNInfo;
        if (pxl != null) {
            pxl.setHeaderView(null);
        }
        pXL pxl2 = this.fetchVPNInfo;
        if (pxl2 != null) {
            pxl2.setExtraView(null);
        }
        C33546myW c33546myW = this.values;
        if (c33546myW != null) {
            c33546myW.AhwBna(false);
            c33546myW.setNoMoreDataEffective(false);
        }
        C33546myW c33546myW2 = this.values;
        if (c33546myW2 != null) {
            c33546myW2.KWHzl((InterfaceC57900yrD) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL().gEmmrt();
    }

    public final void copydefault(final RecyclerView recyclerView) {
        oQY oqy;
        pXL pxl = this.fetchVPNInfo;
        if (pxl != null) {
            pxl.post(new java.lang.Runnable() { // from class: o.oQD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36142oQv.AEQbTJ(recyclerView, this);
                }
            });
        }
        oMN omn = this.AYXKKw;
        if (omn != null && (oqy = omn.copydefault) != null) {
            oqy.AEQbTJ(recyclerView);
        }
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new C36242oUn(OLrzqt()));
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(OLrzqt());
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketEventsFragment$subscribeOnUiChange$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketEventsFragment$subscribeOnUiChange$2(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AYXKKw() {
        KlineQuoteDataComponent klineQuoteDataComponentDbNXlk;
        java.lang.String str;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C39014pkM c39014pkM = parentFragment instanceof C39014pkM ? (C39014pkM) parentFragment : null;
        if (c39014pkM != null && (klineQuoteDataComponentDbNXlk = c39014pkM.DbNXlk()) != null) {
            djBIcL().AEQbTJ(klineQuoteDataComponentDbNXlk.hDKMBd());
            MarketEventsViewModel marketEventsViewModelDjBIcL = djBIcL();
            MarketEventsViewModel marketEventsViewModelDjBIcL2 = djBIcL();
            AbstractC54531xLw abstractC54531xLwAhwBna = klineQuoteDataComponentDbNXlk.AhwBna();
            marketEventsViewModelDjBIcL.OLrzqt(marketEventsViewModelDjBIcL2.EZpvd(abstractC54531xLwAhwBna != null ? abstractC54531xLwAhwBna.gEmmrt(klineQuoteDataComponentDbNXlk.AYXKKw()) : null));
            BizInstrument bizInstrumentAYXKKw = klineQuoteDataComponentDbNXlk.AYXKKw();
            this.isConnected = bizInstrumentAYXKKw != null ? bizInstrumentAYXKKw.getTradeSymbol() : null;
            MarketCoinInfo marketCoinInfoHDKMBd = klineQuoteDataComponentDbNXlk.hDKMBd();
            java.lang.String instrumentType = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null;
            if (instrumentType == null) {
                str = null;
                this.AhwBna = str;
            } else {
                int iHashCode = instrumentType.hashCode();
                if (iHashCode == 2552066) {
                    if (instrumentType.equals("SPOT")) {
                        str = "Spot";
                    }
                    this.AhwBna = str;
                } else if (iHashCode != 2558355) {
                    if (iHashCode == 214415088 && instrumentType.equals("FUTURES")) {
                        str = "Future";
                    }
                    this.AhwBna = str;
                } else {
                    if (instrumentType.equals("SWAP")) {
                        str = "perp";
                    }
                    this.AhwBna = str;
                }
            }
        }
        MarketEventsViewModel.queryMarketEventList$default(djBIcL(), true, null, 2, null);
    }

    private final void AhwBna() {
        oQY oqy;
        C33546myW c33546myW = this.values;
        if (c33546myW != null) {
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.oQw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C36142oQv.AEQbTJ(this.copydefault, interfaceC57934yrl);
                }
            });
        }
        oMN omn = this.AYXKKw;
        if (omn == null || (oqy = omn.copydefault) == null) {
            return;
        }
        oqy.setRefreshClickListener(new Function0() { // from class: o.oQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36142oQv.AYXKKw(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(C36142oQv c36142oQv, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        MarketEventsViewModel.queryMarketEventList$default(c36142oQv.djBIcL(), false, c36142oQv.OLrzqt().EZpvd(), 1, null);
    }

    public static final Unit AYXKKw(C36142oQv c36142oQv) {
        C36133oQm.copydefault.OLrzqt(c36142oQv.isConnected, c36142oQv.AhwBna);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC36144oQx
    public void AEQbTJ(@NotNull MarketEventsVo.Content content) {
        Intrinsics.checkNotNullParameter(content, "");
        java.lang.String type = content.djBIcL().getType();
        java.lang.String summaryContentId = content.djBIcL().getSummaryContentId();
        if (summaryContentId == null) {
            summaryContentId = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "content")) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) summaryContentId)) {
                oQM oqmCopydefault = oQM.Companion.copydefault(content);
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                oqmCopydefault.show(childFragmentManager);
            }
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) content.djBIcL().getNewTitle())) {
            oQM oqmCopydefault2 = oQM.Companion.copydefault(content);
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            oqmCopydefault2.show(childFragmentManager2);
        }
        C36133oQm.copydefault.AEQbTJ(this.isConnected, this.AhwBna, type, summaryContentId);
    }

    @Override // o.InterfaceC36144oQx
    public void KWHzl(@NotNull final MarketEventsVo.Content content) {
        java.lang.String instrumentId;
        java.lang.String instrumentType;
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        Intrinsics.checkNotNullParameter(content, "");
        FragmentActivity activity = getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        MarketCoinInfo marketCoinInfoOLrzqt = djBIcL().OLrzqt();
        if (marketCoinInfoOLrzqt == null || (instrumentId = marketCoinInfoOLrzqt.getInstrumentId()) == null) {
            instrumentId = "";
        }
        MarketCoinInfo marketCoinInfoOLrzqt2 = djBIcL().OLrzqt();
        if (marketCoinInfoOLrzqt2 == null || (instrumentType = marketCoinInfoOLrzqt2.getInstrumentType()) == null) {
            instrumentType = "";
        }
        java.lang.String str = "okx://pro/trade_kline?id=" + instrumentId + "&type=" + instrumentType + "&source=share";
        final java.lang.String strEZpvd = djBIcL().EZpvd(djBIcL().OLrzqt());
        final InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
            ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.oQB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36142oQv.EZpvd(strEZpvd, content, (ImageShareParams) obj);
                }
            }), new Function1() { // from class: o.oQy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36142oQv.EZpvd((ShareConfig) obj);
                }
            });
            if (interfaceC48893ueK != null) {
                interfaceC48893ueK.copydefault(abstractActivityC33041mov, shareConfigCopydefault);
            }
        } else if (interfaceC48893ueK != null && (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(strEZpvd, new C48891ueI("market_kline", str, false, null, null, 28, null))) != null && (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this)) != null) {
            final Function1 function1 = new Function1() { // from class: o.oQC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36142oQv.KWHzl(interfaceC48893ueK, abstractActivityC33041mov, content, (C48887ueE) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oQG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C36142oQv.KWHzl(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.oQE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36142oQv.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oQH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C36142oQv.AEQbTJ(function12, obj);
                }
            });
        }
        C36133oQm c36133oQm = C36133oQm.copydefault;
        java.lang.String str2 = this.isConnected;
        java.lang.String str3 = this.AhwBna;
        java.lang.String type = content.djBIcL().getType();
        java.lang.String summaryContentId = content.djBIcL().getSummaryContentId();
        c36133oQm.KWHzl(str2, str3, type, summaryContentId != null ? summaryContentId : "");
    }

    public static final Unit EZpvd(java.lang.String str, MarketEventsVo.Content content, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(str);
        imageShareParams.setShareFrom("market_kline");
        imageShareParams.getExtras().putParcelable("marketEventShareParamKey", MarketEventShareData.Companion.KWHzl(content));
        imageShareParams.getExtras().putString("marketEventShareShortLinkKey", str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, oQV.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setPreviewBottomTips("");
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InterfaceC48893ueK interfaceC48893ueK, AbstractActivityC33041mov abstractActivityC33041mov, final MarketEventsVo.Content content, final C48887ueE c48887ueE) {
        interfaceC48893ueK.copydefault(abstractActivityC33041mov, ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.oQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36142oQv.OLrzqt(c48887ueE, content, (ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.oQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36142oQv.AEQbTJ((ShareConfig) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C48887ueE c48887ueE, MarketEventsVo.Content content, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        imageShareParams.setShareFrom("market_kline");
        imageShareParams.getExtras().putParcelable("marketEventShareParamKey", MarketEventShareData.Companion.KWHzl(content));
        imageShareParams.getExtras().putString("marketEventShareShortLinkKey", c48887ueE.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, oQV.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setPreviewBottomTips("");
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(RecyclerView recyclerView, C36142oQv c36142oQv) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            pXL pxl = c36142oQv.fetchVPNInfo;
            if (pxl != null) {
                layoutParams.height = pxl.getHeight();
            }
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
