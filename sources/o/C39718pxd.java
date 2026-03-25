package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.core.util.format.MatchPattern;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$initView$2;
import com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$initViewPager$1$1$onTabSelected$1$1;
import com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.util.SpanUtils;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Objects;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C35964oKf;
import o.C38605pcb;
import o.C39718pxd;
import o.C43035rhg;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39718pxd extends AbstractC39657pwV implements InterfaceC49363unD {
    public final InterfaceC56387yDm AhwBna;
    public TabLayoutMediator AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public boolean djBIcL;
    public oOY gEmmrt;
    public java.util.ArrayList<Triple<InterfaceC38786pfx, java.lang.CharSequence, java.lang.String>> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.pxd$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.iCPUKe;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
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

    public C39718pxd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(UnlockTokensViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.unlock.ui.KLineIntroduceTabFragment$special$$inlined$activityViewModels$default$3
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
        this.valueOf = new java.util.ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnlockTokensViewModel gEmmrt() {
        return (UnlockTokensViewModel) this.DbNXlk.getValue();
    }

    private final C54822xWp AYXKKw() {
        return (C54822xWp) this.AhwBna.getValue();
    }

    /* JADX INFO: renamed from: o.pxd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pxd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C39718pxd KWHzl() {
            return new C39718pxd();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLineIntroduceTabFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = oOY.EZpvd(view);
        isConnected();
        AYXKKw().KWHzl().observe(this, new FragmentManager(new Function1() { // from class: o.pxi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39718pxd.EZpvd(this.EZpvd, (MarketCoinInfo) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineIntroduceTabFragment$initView$2(this, null), 3, null);
    }

    public static final Unit EZpvd(C39718pxd c39718pxd, MarketCoinInfo marketCoinInfo) {
        c39718pxd.gEmmrt().AEQbTJ(marketCoinInfo.getInstrumentId());
        c39718pxd.gEmmrt().copydefault();
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        oOY ooy = this.gEmmrt;
        if (ooy != null) {
            ViewPager2 viewPager2 = ooy.OLrzqt;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            viewPager2.setAdapter(new Application(this, childFragmentManager, lifecycle));
            ooy.AEQbTJ.copydefault(new Dialog());
        }
    }

    /* JADX INFO: renamed from: o.pxd$Dialog */
    public static final class Dialog implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Dialog() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [123=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C39718pxd c39718pxd = C39718pxd.this;
                if (!(!c39718pxd.valueOf.isEmpty()) || tab.getPosition() >= c39718pxd.valueOf.size()) {
                    return;
                }
                java.lang.String str = (java.lang.String) ((Triple) c39718pxd.valueOf.get(tab.getPosition())).getThird();
                switch (str.hashCode()) {
                    case -1393107422:
                        if (str.equals("CRYPTO_INFO_TAB")) {
                            C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, new Function1() { // from class: o.pxj
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C39718pxd.Dialog.djBIcL((EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            break;
                        }
                        break;
                    case -1231018464:
                        if (str.equals("TOKEN_UNLOCK_TAB")) {
                            boolean z = SPUtils.getBoolean("KLINE_USER_VISITED_UNLOCK_TOKEN", false);
                            SPUtils.put("KLINE_USER_VISITED_UNLOCK_TOKEN", java.lang.Boolean.TRUE);
                            if (!z) {
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c39718pxd), null, null, new KLineIntroduceTabFragment$initViewPager$1$1$onTabSelected$1$1(tab, null), 3, null);
                            }
                            C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, new Function1() { // from class: o.pxg
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C39718pxd.Dialog.AYXKKw((EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            break;
                        }
                        break;
                    case 13024847:
                        if (str.equals("TRADING_RULES_TAB")) {
                            C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, new Function1() { // from class: o.pxf
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C39718pxd.Dialog.gEmmrt((EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            break;
                        }
                        break;
                    case 1293783736:
                        if (str.equals("FUNDING_RATE_TAB")) {
                            C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, new Function1() { // from class: o.pxk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C39718pxd.Dialog.AhwBna((EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            break;
                        }
                        break;
                    case 1593502201:
                        if (str.equals("INDEX_COMPONENTS_TAB")) {
                            C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, new Function1() { // from class: o.pxl
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C39718pxd.Dialog.valueOf((EventParamsList) obj);
                                }
                            }, 1, (java.lang.Object) null);
                            break;
                        }
                        break;
                }
            }
        }

        public static final Unit AYXKKw(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "overview_subtab_clicks", "token_unlocks", false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit djBIcL(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "overview_subtab_clicks", TtmlNode.TAG_INFORMATION, false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit gEmmrt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "overview_subtab_clicks", "trading_rules", false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit AhwBna(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "overview_subtab_clicks", "funding_rate", false, 4, null);
            return Unit.INSTANCE;
        }

        public static final Unit valueOf(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "overview_subtab_clicks", "index_sample", false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(boolean z) {
        oOY ooy;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        this.valueOf.clear();
        AEQbTJ(z);
        oOY ooy2 = this.gEmmrt;
        RecyclerView.Adapter adapter = (ooy2 == null || (viewPager22 = ooy2.OLrzqt) == null) ? null : viewPager22.getAdapter();
        Intrinsics.copydefault(adapter, "");
        Application application = (Application) adapter;
        java.util.ArrayList<Triple<InterfaceC38786pfx, java.lang.CharSequence, java.lang.String>> arrayList = this.valueOf;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC38786pfx) ((Triple) it.next()).getFirst());
        }
        application.AEQbTJ(arrayList2);
        oOY ooy3 = this.gEmmrt;
        if (ooy3 != null && (viewPager2 = ooy3.OLrzqt) != null) {
            viewPager2.setCurrentItem(0, false);
        }
        if (!(!this.valueOf.isEmpty()) || this.djBIcL || (ooy = this.gEmmrt) == null) {
            return;
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(ooy.AEQbTJ.AYXKKw(), ooy.OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.pxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C39718pxd.EZpvd(this.copydefault, tab, i);
            }
        });
        this.AkhnZx = tabLayoutMediator;
        tabLayoutMediator.attach();
        this.djBIcL = true;
    }

    public static final void EZpvd(C39718pxd c39718pxd, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i < c39718pxd.valueOf.size()) {
            Triple<InterfaceC38786pfx, java.lang.CharSequence, java.lang.String> triple = c39718pxd.valueOf.get(i);
            Intrinsics.checkNotNullExpressionValue(triple, "");
            Triple<InterfaceC38786pfx, java.lang.CharSequence, java.lang.String> triple2 = triple;
            tab.setText(triple2.getSecond());
            tab.setContentDescription(triple2.getThird());
        }
    }

    public final void EZpvd(InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL) {
        java.lang.Boolean boolValueOf;
        ViewPager2 viewPager2;
        C55244xgL c55244xgL;
        oOY ooy;
        ViewPager2 viewPager22;
        ViewPager2 viewPager23;
        C55244xgL c55244xgL2;
        boolean z = interfaceC49371unL instanceof InterfaceC49371unL.Activity;
        if (z) {
            boolValueOf = java.lang.Boolean.valueOf(((KlineCoinInfo) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).getSupportTokenUnlock());
        } else {
            boolValueOf = (!(interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) && ((interfaceC49371unL instanceof InterfaceC49371unL.Application) || (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription))) ? java.lang.Boolean.FALSE : null;
        }
        if (boolValueOf != null) {
            KWHzl(boolValueOf.booleanValue());
        }
        getTAG();
        Objects.toString(boolValueOf);
        if (this.valueOf.size() > 1) {
            oOY ooy2 = this.gEmmrt;
            if (ooy2 != null && (c55244xgL2 = ooy2.AEQbTJ) != null) {
                c55244xgL2.setVisibility(0);
            }
            oOY ooy3 = this.gEmmrt;
            if (ooy3 != null && (viewPager23 = ooy3.OLrzqt) != null) {
                viewPager23.setPadding(0, 0, 0, 0);
            }
        } else {
            oOY ooy4 = this.gEmmrt;
            if (ooy4 != null && (c55244xgL = ooy4.AEQbTJ) != null) {
                c55244xgL.setVisibility(8);
            }
            oOY ooy5 = this.gEmmrt;
            if (ooy5 != null && (viewPager2 = ooy5.OLrzqt) != null) {
                viewPager2.setPadding(0, C55298xhM.dp2px$default(8.0f, null, 1, null), 0, 0);
            }
        }
        if (z) {
            if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.FALSE) && (ooy = this.gEmmrt) != null && (viewPager22 = ooy.OLrzqt) != null) {
                viewPager22.setCurrentItem(0);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void djBIcL() {
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        oOY ooy = this.gEmmrt;
        if (ooy == null || (viewPager2 = ooy.OLrzqt) == null || !gEmmrt().valueOf() || (adapter = viewPager2.getAdapter()) == null || adapter.getItemCount() <= 1) {
            return;
        }
        viewPager2.setCurrentItem(1, true);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC39502ptZ interfaceC39502ptZ = parentFragment instanceof InterfaceC39502ptZ ? (InterfaceC39502ptZ) parentFragment : null;
        if (interfaceC39502ptZ != null) {
            interfaceC39502ptZ.dUDNAs();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TabLayoutMediator tabLayoutMediator = this.AkhnZx;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.AkhnZx = null;
        this.djBIcL = false;
        this.gEmmrt = null;
    }

    /* JADX INFO: renamed from: o.pxd$Activity */
    public static final class Activity implements InterfaceC38786pfx {
        public Activity() {
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            C38605pcb.ActionBar actionBar = C38605pcb.Companion;
            ActivityResultCaller parentFragment = C39718pxd.this.getParentFragment();
            Intrinsics.copydefault(parentFragment, "");
            return actionBar.AEQbTJ((InterfaceC39502ptZ) parentFragment);
        }
    }

    public final void AEQbTJ(boolean z) {
        this.valueOf.add(new Triple<>(new Activity(), C33070mpX.AYXKKw(C35964oKf.Fragment.IYdWPz), "CRYPTO_INFO_TAB"));
        if (gEmmrt().valueOf() && z) {
            this.valueOf.add(new Triple<>(new TaskDescription(), valueOf(), "TOKEN_UNLOCK_TAB"));
        }
        MarketCoinInfo value = AYXKKw().KWHzl().getValue();
        if (value != null && AYXKKw().DbNXlk()) {
            this.valueOf.add(new Triple<>(new ActionBar(value), C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPfvRMlC), "TRADING_RULES_TAB"));
        }
        if (AYXKKw().AYXKKw()) {
            MarketCoinInfo value2 = AYXKKw().KWHzl().getValue();
            java.lang.String instrumentId = value2 != null ? value2.getInstrumentId() : null;
            if (instrumentId != null && instrumentId.length() != 0) {
                this.valueOf.add(new Triple<>(new Fragment(instrumentId), C33070mpX.AYXKKw(C35964oKf.Fragment.setProfilesSinceInitCount), "FUNDING_RATE_TAB"));
            }
        }
        java.lang.String strOLrzqt = OLrzqt();
        if (strOLrzqt == null || strOLrzqt.length() == 0 || !pDX.AEQbTJ.AhwBna()) {
            return;
        }
        java.lang.String strAhwBna = AhwBna();
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        getTAG();
        MarketCoinInfo value3 = AYXKKw().KWHzl().getValue();
        if (value3 != null) {
            value3.getInstrumentType();
        }
        MarketCoinInfo value4 = AYXKKw().KWHzl().getValue();
        if (value4 != null) {
            value4.getInstrumentId();
        }
        this.valueOf.add(new Triple<>(new LoaderManager(strOLrzqt, strAhwBna), C33070mpX.AYXKKw(C35964oKf.Fragment.dbUqJD), "INDEX_COMPONENTS_TAB"));
    }

    /* JADX INFO: renamed from: o.pxd$TaskDescription */
    public static final class TaskDescription implements InterfaceC38786pfx {
        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            return C39732pxr.Companion.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.pxd$ActionBar */
    public static final class ActionBar implements InterfaceC38786pfx {
        public final /* synthetic */ MarketCoinInfo EZpvd;

        public ActionBar(MarketCoinInfo marketCoinInfo) {
            this.EZpvd = marketCoinInfo;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            return C38980pjf.Companion.EZpvd(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.pxd$Fragment */
    public static final class Fragment implements InterfaceC38786pfx {
        public final /* synthetic */ java.lang.String AEQbTJ;

        public Fragment(java.lang.String str) {
            this.AEQbTJ = str;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            java.lang.Object objM7377constructorimpl;
            java.lang.String str = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(((InterfaceC49497upf) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).copydefault(str));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
            return fragment == null ? new androidx.fragment.app.Fragment() : fragment;
        }
    }

    /* JADX INFO: renamed from: o.pxd$LoaderManager */
    public static final class LoaderManager implements InterfaceC38786pfx {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        public LoaderManager(java.lang.String str, java.lang.String str2) {
            this.KWHzl = str;
            this.EZpvd = str2;
        }

        @Override // o.InterfaceC38786pfx
        public androidx.fragment.app.Fragment EZpvd() {
            return oRE.Companion.EZpvd(this.KWHzl, this.EZpvd);
        }
    }

    private final java.lang.String AhwBna() {
        BizInstrument suggestedInstrument$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        InterfaceC54577xNn interfaceC54577xNn;
        MarketCoinInfo value = AYXKKw().KWHzl().getValue();
        if (value == null) {
            return null;
        }
        java.lang.String instrumentId = value.getInstrumentId();
        java.lang.String instrumentType = value.getInstrumentType();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        if (!Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "SPOT")) {
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instrumentType, instrumentId, null, null, 12, null)) == null) {
                return null;
            }
            return suggestedInstrument$default.getDisplayQuoteSymbol();
        }
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instrumentType)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instrumentId)) == null) {
            return null;
        }
        return bizInstrumentValueOf.getDisplayQuoteSymbol();
    }

    /* JADX DEBUG: Possible override for method o.pwV.OLrzqt()V */
    public final java.lang.String OLrzqt() {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        MarketCoinInfo value = AYXKKw().KWHzl().getValue();
        java.lang.String underlying = null;
        if (value == null) {
            return null;
        }
        java.lang.String instrumentId = value.getInstrumentId();
        java.lang.String instrumentType = value.getInstrumentType();
        int iHashCode = instrumentType.hashCode();
        if (iHashCode != 2552066) {
            if (iHashCode != 2558355) {
                interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instrumentType, instrumentId, null, null, 12, null)) != null) {
                    underlying = suggestedInstrument$default.getUnderlying();
                }
                getTAG();
            } else {
                interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM != null) {
                    underlying = suggestedInstrument$default.getUnderlying();
                }
                getTAG();
            }
        } else if (instrumentType.equals("SPOT") && pFS.KWHzl.AEQbTJ(instrumentId)) {
            underlying = instrumentId;
        }
        getTAG();
        return underlying;
    }

    public final java.lang.CharSequence valueOf() {
        final android.graphics.drawable.Drawable drawableKWHzl;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DDjgSw);
        if (SPUtils.getBoolean("KLINE_USER_VISITED_UNLOCK_TOKEN", false) || (drawableKWHzl = C33070mpX.KWHzl(C43035rhg.ActionBar.OLrzqt)) == null) {
            return strAYXKKw;
        }
        java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(strAYXKKw + " ", new java.lang.String[]{" "}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.pxb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39718pxd.EZpvd(drawableKWHzl, (java.util.List) obj);
            }
        }, 10, null);
        return charSequence == null ? strAYXKKw : charSequence;
    }

    public static final Unit EZpvd(android.graphics.drawable.Drawable drawable, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new SpanUtils.Activity(drawable, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pxd$Application */
    public final class Application extends FragmentStateAdapter {
        public final java.util.List<InterfaceC38786pfx> AEQbTJ;
        public final /* synthetic */ C39718pxd copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C39718pxd c39718pxd, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycle, "");
            this.copydefault = c39718pxd;
            this.AEQbTJ = new java.util.ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        public final void AEQbTJ(@NotNull java.util.List<? extends InterfaceC38786pfx> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ.clear();
            this.AEQbTJ.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return this.AEQbTJ.get(i).EZpvd();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return C33129mqd.valueOf(java.lang.Integer.valueOf(this.AEQbTJ.get(i).hashCode()));
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public boolean containsItem(long j) {
            java.util.List<InterfaceC38786pfx> list = this.AEQbTJ;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C33129mqd.valueOf(java.lang.Integer.valueOf(((InterfaceC38786pfx) it.next()).hashCode())) == j) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
