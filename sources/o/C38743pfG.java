package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import com.okinc.kline.features.contractinfo.ui.model.PriceLimitStatus;
import com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel;
import com.okinc.kline.ui.MarketContractInfoFragment$loadContractInfo$1;
import com.okinc.kline.ui.MarketContractInfoFragment$observeUiStates$2;
import com.okinc.kline.ui.MarketContractInfoFragment$refreshInstrument$1;
import com.okinc.kline.ui.viewmodel.TradingRulesContainerViewModel;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$2;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$3;
import com.okinc.kline.util.MarketViewModelKt$parentViewModels$$inlined$viewModels$default$4;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
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
import o.C35964oKf;
import o.C36123oQc;
import o.InterfaceC49361unB;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.InterfaceC54581xNr;
import o.oPY;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38743pfG extends AbstractC38562pbl implements InterfaceC49363unD {
    public final int AhwBna = C35964oKf.Application.zLjUOn;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public oPX gEmmrt;
    public RecyclerView isConnected;
    public boolean valueOf;
    public MarketCoinInfo values;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.pfG$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContractInfoItemType.values().length];
            try {
                iArr[ContractInfoItemType.PRICE_LIMIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ContractInfoItemType.ORDER_RULE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ContractInfoItemType.OPEN_POSITION_LIMIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.pfG$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX INFO: renamed from: o.pfG$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.AEQbTJ;
            if (fragment != null && !(fragment instanceof C38980pjf)) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C38980pjf)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C38980pjf)) {
                    parentFragment = null;
                }
                fragment = (C38980pjf) parentFragment;
            }
            if (!(fragment instanceof C38980pjf)) {
                fragment = null;
            }
            C38980pjf c38980pjf = (C38980pjf) fragment;
            C38980pjf c38980pjf2 = c38980pjf instanceof ViewModelStoreOwner ? c38980pjf : null;
            if (c38980pjf2 != null) {
                return c38980pjf2;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + C38980pjf.class.getSimpleName()).toString());
        }
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

    public C38743pfG() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ContractInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$special$$inlined$viewModels$default$5
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
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1(new ActionBar(this)));
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TradingRulesContainerViewModel.class), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new MarketViewModelKt$parentViewModels$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
    }

    /* JADX INFO: renamed from: o.pfG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pfG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C38743pfG copydefault(@NotNull MarketCoinInfo marketCoinInfo) {
            Intrinsics.checkNotNullParameter(marketCoinInfo, "");
            C38743pfG c38743pfG = new C38743pfG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("market_detail_info", marketCoinInfo);
            c38743pfG.setArguments(bundle);
            return c38743pfG;
        }
    }

    private final C54822xWp isConnected() {
        return (C54822xWp) this.DbNXlk.getValue();
    }

    public final ContractInfoViewModel gEmmrt() {
        return (ContractInfoViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.pbl.EZpvd()V */
    public final TradingRulesContainerViewModel EZpvd() {
        return (TradingRulesContainerViewModel) this.djBIcL.getValue();
    }

    public final InterfaceC54581xNr djBIcL() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) {
            return null;
        }
        return interfaceC54577xNn.OLrzqt();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.values = (MarketCoinInfo) requireArguments().getParcelable("market_detail_info");
        this.gEmmrt = new oPX(new Function1() { // from class: o.pfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38743pfG.copydefault(this.EZpvd, (oPY.ActionBar) obj);
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.aeJQwa);
        recyclerView.setAdapter(this.gEmmrt);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        this.isConnected = recyclerView;
        fetchVPNInfo();
        values();
        AhwBna();
        valueOf();
    }

    public static final Unit copydefault(C38743pfG c38743pfG, oPY.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        c38743pfG.EZpvd(actionBar);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (this.valueOf) {
            return;
        }
        AkhnZx();
        AYXKKw();
        this.valueOf = true;
    }

    private final void fetchVPNInfo() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, gEmmrt(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.MarketContractInfoFragment$observeUiStates$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C36123oQc) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C36123oQc) obj).copydefault((InterfaceC49371unL) obj2);
            }
        }, null, new MarketContractInfoFragment$observeUiStates$2(this, null), 2, null);
    }

    public final void values() {
        isConnected().djBIcL().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.pfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38743pfG.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C38743pfG c38743pfG, java.lang.String str) {
        ContractInfoViewModel contractInfoViewModelGEmmrt = c38743pfG.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) str);
        contractInfoViewModelGEmmrt.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        C56111xwe<xMJ.StateListAnimator> c56111xweEZpvd = gEmmrt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweEZpvd.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.pfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38743pfG.copydefault(this.EZpvd, (xMJ.StateListAnimator) obj);
            }
        }));
    }

    public static final Unit copydefault(C38743pfG c38743pfG, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        c38743pfG.gEmmrt().KWHzl(stateListAnimator.OLrzqt());
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C56111xwe<java.util.List<TickersData>> c56111xweAEQbTJ = gEmmrt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweAEQbTJ.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.pfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38743pfG.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    public static final Unit EZpvd(C38743pfG c38743pfG, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            c38743pfG.gEmmrt().EZpvd(new C54536xML().OLrzqt(((TickersData) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getVol24h()));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(oPY.ActionBar actionBar) {
        BizInstrument suggestedInstrument$default;
        if (actionBar instanceof oPY.ActionBar.C0903ActionBar) {
            copydefault(((oPY.ActionBar.C0903ActionBar) actionBar).AEQbTJ());
            return;
        }
        if (actionBar instanceof oPY.ActionBar.Activity) {
            AEQbTJ(((oPY.ActionBar.Activity) actionBar).copydefault());
            return;
        }
        if (!(actionBar instanceof oPY.ActionBar.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        android.content.Context context = getContext();
        if (context != null) {
            InterfaceC54581xNr interfaceC54581xNrDjBIcL = djBIcL();
            if (interfaceC54581xNrDjBIcL != null) {
                oPY.ActionBar.Application application = (oPY.ActionBar.Application) actionBar;
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrDjBIcL, application.KWHzl(), application.AEQbTJ(), null, null, 12, null);
            } else {
                suggestedInstrument$default = null;
            }
            AEQbTJ(context, ((oPY.ActionBar.Application) actionBar).OLrzqt(), suggestedInstrument$default);
        }
    }

    public final void copydefault(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.gUEfcq), (View.OnClickListener) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public final void AEQbTJ(java.lang.String str) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
    }

    public final android.view.View AEQbTJ(SwapInstrument swapInstrument) {
        android.view.View viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(C35964oKf.Application.fkESqH, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.sendRequest);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.removeSubscription);
        android.widget.TextView textView3 = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.addSubscription);
        Intrinsics.copydefault(textView);
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (swapInstrument != null ? swapInstrument.getUserPositionMaxPercent() : null)) ? 0 : 8);
        Intrinsics.copydefault(textView2);
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (swapInstrument != null ? swapInstrument.getUserPositionMaxValueUSD() : null)) ? 0 : 8);
        Intrinsics.copydefault(textView3);
        textView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (swapInstrument != null ? swapInstrument.getPlatformSidePositionMaxValueUSD() : null)) ? 0 : 8);
        textView.setText(copydefault(swapInstrument));
        textView2.setText(EZpvd(swapInstrument));
        textView3.setText(OLrzqt(swapInstrument));
        return viewInflate;
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull ContractInfoItemType contractInfoItemType, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(contractInfoItemType, "");
        if (bizInstrument == null) {
            return;
        }
        if (bizInstrument instanceof SpotInstrument) {
            KWHzl(context, contractInfoItemType, (SpotInstrument) bizInstrument);
        } else if ((bizInstrument instanceof SwapInstrument) || (bizInstrument instanceof FutureInstrument)) {
            KWHzl(context, contractInfoItemType, bizInstrument);
        }
    }

    public final void copydefault(final android.content.Context context, SpotInstrument spotInstrument) {
        oMT omtEZpvd = oMT.EZpvd(android.view.LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(omtEZpvd, "");
        java.lang.String priceLimitStatus = spotInstrument.getPriceLimitStatus();
        if (Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.H1.toString())) {
            omtEZpvd.AEQbTJ.setText(C33069mpW.copydefault(C35964oKf.Fragment.QYNZmZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("h1", pTB.formatLocalized$default(spotInstrument.getSpotLpH1(), null, 1, null)))));
        } else if (Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.H2.toString())) {
            omtEZpvd.AEQbTJ.setText(C33069mpW.copydefault(C35964oKf.Fragment.OeZisf, C56423yEv.EZpvd(C56390yDp.OLrzqt("h2", pTB.formatLocalized$default(spotInstrument.getSpotLpH2(), null, 1, null)))));
        } else if (Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.H3.toString())) {
            omtEZpvd.AEQbTJ.setText(C33069mpW.copydefault(C35964oKf.Fragment.OWSZPf, C56423yEv.EZpvd(C56390yDp.OLrzqt("h3", pTB.formatLocalized$default(spotInstrument.getSpotLpH3(), null, 1, null)))));
        } else if (Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.X.toString())) {
            java.lang.String localized$default = pTB.formatLocalized$default(spotInstrument.getLpX1(), null, 1, null);
            java.lang.String localized$default2 = pTB.formatLocalized$default(spotInstrument.getLpX2(), null, 1, null);
            omtEZpvd.AEQbTJ.setText(C33069mpW.copydefault(C35964oKf.Fragment.uLLnq, C56423yEv.EZpvd(C56390yDp.OLrzqt("x1", localized$default))) + "\n" + C33069mpW.copydefault(C35964oKf.Fragment.OqHLSf, C56423yEv.EZpvd(C56390yDp.OLrzqt("x2", localized$default2))));
        } else if (Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.Y.toString()) || Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.Z.toString())) {
            java.lang.String localized$default3 = pTB.formatLocalized$default(spotInstrument.getLpY1(), null, 1, null);
            java.lang.String localized$default4 = pTB.formatLocalized$default(spotInstrument.getLpZ1(), null, 1, null);
            java.lang.String localized$default5 = pTB.formatLocalized$default(spotInstrument.getLpY2(), null, 1, null);
            java.lang.String localized$default6 = pTB.formatLocalized$default(spotInstrument.getLpZ2(), null, 1, null);
            omtEZpvd.AEQbTJ.setText(C33069mpW.copydefault(C35964oKf.Fragment.OAUGar, C56424yEw.gEmmrt(C56390yDp.OLrzqt("y1", localized$default3), C56390yDp.OLrzqt("z1", localized$default4))) + "\n" + C33069mpW.copydefault(C35964oKf.Fragment.OeawrHOeawrH, C56424yEw.gEmmrt(C56390yDp.OLrzqt("y2", localized$default5), C56390yDp.OLrzqt("z2", localized$default6))));
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) priceLimitStatus, (java.lang.Object) PriceLimitStatus.J.toString())) {
                return;
            }
            java.lang.String localized$default7 = pTB.formatLocalized$default(spotInstrument.getSpotLpJ1(), null, 1, null);
            java.lang.String localized$default8 = pTB.formatLocalized$default(spotInstrument.getSpotLpJ2(), null, 1, null);
            omtEZpvd.AEQbTJ.setText(C33069mpW.copydefault(C35964oKf.Fragment.OeawrH, C56423yEv.EZpvd(C56390yDp.OLrzqt("J1", localized$default7))) + "\n" + C33069mpW.copydefault(C35964oKf.Fragment.RidNCX, C56423yEv.EZpvd(C56390yDp.OLrzqt("J2", localized$default8))));
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp));
        android.widget.LinearLayout root = omtEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.OLrzqt(root, 16);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.adevsa), new View.OnClickListener() { // from class: o.pfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38743pfG.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35964oKf.Fragment.UeEOUB, new View.OnClickListener() { // from class: o.pfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38743pfG.KWHzl(context, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(android.content.Context context, android.view.View view) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C35964oKf.Fragment.dkJJWw))), null, 4, null);
    }

    public final void KWHzl(android.content.Context context, ContractInfoItemType contractInfoItemType, SpotInstrument spotInstrument) {
        if (spotInstrument == null) {
            return;
        }
        int i = Application.copydefault[contractInfoItemType.ordinal()];
        if (i == 1) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp);
            copydefault(context, spotInstrument);
            new kotlin.Pair(strAYXKKw, Unit.INSTANCE);
        } else {
            if (i == 2) {
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.RIKbBf);
                OLrzqt(context, spotInstrument);
                new kotlin.Pair(strAYXKKw2, Unit.INSTANCE);
                return;
            }
            new kotlin.Pair("", null);
        }
    }

    public final void OLrzqt(android.content.Context context, SpotInstrument spotInstrument) {
        int i = C35964oKf.Fragment.RIKbBf;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.giSNqX, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QUeTTI);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OqIZjC);
        textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.KDccX), C56423yEv.EZpvd(C56390yDp.OLrzqt("maxLmtAmt", pTB.formatLocalized$default(spotInstrument.getMaxLmtAmt(), null, 1, null)))));
        textView2.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.UrRBLY), C56423yEv.EZpvd(C56390yDp.OLrzqt("maxMktAmt", pTB.formatLocalized$default(spotInstrument.getMaxMktAmt(), null, 1, null)))));
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(i);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.OLrzqt(viewInflate, 16);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.adevsa), new View.OnClickListener() { // from class: o.pfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38743pfG.valueOf(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(android.content.Context context, ContractInfoItemType contractInfoItemType, BizInstrument bizInstrument) {
        kotlin.Pair<java.lang.String, android.view.View> pairEZpvd = EZpvd(context, contractInfoItemType, bizInstrument);
        java.lang.String strComponent1 = pairEZpvd.component1();
        android.view.View viewComponent2 = pairEZpvd.component2();
        if (viewComponent2 != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(strComponent1);
            viewOnClickListenerC54939xaY.OLrzqt(viewComponent2, 16);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.adevsa), new View.OnClickListener() { // from class: o.pfR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38743pfG.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final kotlin.Pair<java.lang.String, android.view.View> EZpvd(android.content.Context context, ContractInfoItemType contractInfoItemType, BizInstrument bizInstrument) {
        kotlin.Pair<java.lang.String, android.view.View> pair;
        int i = Application.copydefault[contractInfoItemType.ordinal()];
        if (i == 1) {
            pair = new kotlin.Pair<>(C33070mpX.AYXKKw(C35964oKf.Fragment.DcNNRp), EZpvd(context, bizInstrument));
        } else if (i != 2) {
            if (i == 3) {
                pair = new kotlin.Pair<>(C33070mpX.AYXKKw(C35964oKf.Fragment.fGsPTM), AEQbTJ(bizInstrument instanceof SwapInstrument ? (SwapInstrument) bizInstrument : null));
            } else {
                return new kotlin.Pair<>("", null);
            }
        } else {
            pair = new kotlin.Pair<>(C33070mpX.AYXKKw(C35964oKf.Fragment.RIKbBf), OLrzqt(context, bizInstrument));
        }
        return pair;
    }

    public final android.view.View EZpvd(android.content.Context context, BizInstrument bizInstrument) {
        android.view.View view;
        if (bizInstrument == null) {
            return null;
        }
        if (bizInstrument instanceof SwapInstrument) {
            android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.iZzfmt, (android.view.ViewGroup) null, false);
            android.widget.TextView textView = viewInflate != null ? (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.sendCaptioningEnabled) : null;
            android.widget.TextView textView2 = viewInflate != null ? (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.gEmmrt) : null;
            SwapInstrument swapInstrument = (SwapInstrument) bizInstrument;
            java.util.List listGEmmrt = yDY.gEmmrt(swapInstrument.getLpX1(), swapInstrument.getLpX2(), swapInstrument.getLpY1(), swapInstrument.getLpY2(), swapInstrument.getLpZ1(), swapInstrument.getLpZ2());
            if (!(listGEmmrt instanceof java.util.Collection) || !listGEmmrt.isEmpty()) {
                java.util.Iterator it = listGEmmrt.iterator();
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).length() == 0) {
                        return null;
                    }
                }
            }
            java.lang.String localized$default = pTB.formatLocalized$default(swapInstrument.getLpX1(), null, 1, null);
            java.lang.String localized$default2 = pTB.formatLocalized$default(swapInstrument.getLpX2(), null, 1, null);
            java.lang.String localized$default3 = pTB.formatLocalized$default(swapInstrument.getLpY1(), null, 1, null);
            java.lang.String localized$default4 = pTB.formatLocalized$default(swapInstrument.getLpZ1(), null, 1, null);
            view = viewInflate;
            java.lang.String localized$default5 = pTB.formatLocalized$default(swapInstrument.getLpZ2(), null, 1, null);
            java.lang.String localized$default6 = pTB.formatLocalized$default(swapInstrument.getLpY2(), null, 1, null);
            java.lang.String strCopydefault = C33069mpW.copydefault(C35964oKf.Fragment.UJpkuA, C56424yEw.gEmmrt(C56390yDp.OLrzqt("x1", localized$default), C56390yDp.OLrzqt("x2", localized$default2)));
            if (textView != null) {
                textView.setText(strCopydefault);
            }
            java.lang.String strCopydefault2 = C33069mpW.copydefault(C35964oKf.Fragment.OhcwxsRkSIEV, C56424yEw.gEmmrt(C56390yDp.OLrzqt("y1", localized$default3), C56390yDp.OLrzqt("z1", localized$default4), C56390yDp.OLrzqt("y2", localized$default6), C56390yDp.OLrzqt("z2", localized$default5)));
            if (textView2 != null) {
                textView2.setText(strCopydefault2);
            }
        } else {
            if (!(bizInstrument instanceof FutureInstrument)) {
                return null;
            }
            android.view.View viewInflate2 = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.QVAiDq, (android.view.ViewGroup) null, false);
            android.widget.TextView textView3 = (android.widget.TextView) viewInflate2.findViewById(C35964oKf.StateListAnimator.sendMetadata);
            android.widget.TextView textView4 = (android.widget.TextView) viewInflate2.findViewById(C35964oKf.StateListAnimator.AhwBna);
            android.widget.TextView textView5 = (android.widget.TextView) viewInflate2.findViewById(C35964oKf.StateListAnimator.sendCaptioningEnabled);
            android.widget.TextView textView6 = (android.widget.TextView) viewInflate2.findViewById(C35964oKf.StateListAnimator.gEmmrt);
            android.widget.TextView textView7 = (android.widget.TextView) viewInflate2.findViewById(C35964oKf.StateListAnimator.sSMYrx);
            android.widget.TextView textView8 = (android.widget.TextView) viewInflate2.findViewById(C35964oKf.StateListAnimator.AwvSrB);
            FutureInstrument futureInstrument = (FutureInstrument) bizInstrument;
            view = viewInflate2;
            java.lang.String localized$default7 = pTB.formatLocalized$default(futureInstrument.getLpX1(), null, 1, null);
            java.lang.String localized$default8 = pTB.formatLocalized$default(futureInstrument.getLpX2(), null, 1, null);
            java.lang.String localized$default9 = pTB.formatLocalized$default(futureInstrument.getLpY1(), null, 1, null);
            java.lang.String localized$default10 = pTB.formatLocalized$default(futureInstrument.getLpY2(), null, 1, null);
            java.lang.String localized$default11 = pTB.formatLocalized$default(futureInstrument.getLpZ1(), null, 1, null);
            java.lang.String localized$default12 = pTB.formatLocalized$default(futureInstrument.getLpZ2(), null, 1, null);
            java.lang.String localized$default13 = pTB.formatLocalized$default(futureInstrument.getLpC1(), null, 1, null);
            java.lang.String localized$default14 = pTB.formatLocalized$default(futureInstrument.getLpC2(), null, 1, null);
            if (futureInstrument.isPreMarketPair()) {
                java.util.List listGEmmrt2 = yDY.gEmmrt(futureInstrument.getLpZ1(), futureInstrument.getLpZ2(), futureInstrument.getLpC1(), futureInstrument.getLpC2());
                if (!(listGEmmrt2 instanceof java.util.Collection) || !listGEmmrt2.isEmpty()) {
                    java.util.Iterator it2 = listGEmmrt2.iterator();
                    while (it2.hasNext()) {
                        if (((java.lang.String) it2.next()).length() == 0) {
                            return null;
                        }
                    }
                }
                textView3.setText(C35964oKf.Fragment.isTimeProfileEmpty);
                textView5.setText(C33069mpW.copydefault(C35964oKf.Fragment.QjzqRB, C56424yEw.gEmmrt(C56390yDp.OLrzqt("z1", localized$default11), C56390yDp.OLrzqt("z2", localized$default12))));
                textView4.setText(C35964oKf.Fragment.fmdvVn);
                textView6.setText(C33069mpW.copydefault(C35964oKf.Fragment.OEsIKP, C56424yEw.gEmmrt(C56390yDp.OLrzqt("c1", localized$default13), C56390yDp.OLrzqt("c2", localized$default14))));
                textView7.setText(C35964oKf.Fragment.compare);
                textView8.setVisibility(8);
            } else {
                java.util.List listGEmmrt3 = yDY.gEmmrt(futureInstrument.getLpX1(), futureInstrument.getLpX2(), futureInstrument.getLpY1(), futureInstrument.getLpY2(), futureInstrument.getLpZ1(), futureInstrument.getLpZ2(), futureInstrument.getLpC1(), futureInstrument.getLpC2());
                if (!(listGEmmrt3 instanceof java.util.Collection) || !listGEmmrt3.isEmpty()) {
                    java.util.Iterator it3 = listGEmmrt3.iterator();
                    while (it3.hasNext()) {
                        if (((java.lang.String) it3.next()).length() == 0) {
                            return null;
                        }
                    }
                }
                textView5.setText(C33069mpW.copydefault(C35964oKf.Fragment.Ohcwxs, C56424yEw.gEmmrt(C56390yDp.OLrzqt("x1", localized$default7), C56390yDp.OLrzqt("x2", localized$default8))));
                textView6.setText(C33069mpW.copydefault(C35964oKf.Fragment.gCiISl, C56424yEw.gEmmrt(C56390yDp.OLrzqt("y1", localized$default9), C56390yDp.OLrzqt("z1", localized$default11), C56390yDp.OLrzqt("y2", localized$default10), C56390yDp.OLrzqt("z2", localized$default12))));
                textView7.setText(C33069mpW.copydefault(C35964oKf.Fragment.OeawrHRnVkix, C56424yEw.gEmmrt(C56390yDp.OLrzqt("y1", localized$default9), C56390yDp.OLrzqt("c1", localized$default13), C56390yDp.OLrzqt("y2", localized$default10), C56390yDp.OLrzqt("c2", localized$default14))));
                if (!Intrinsics.EZpvd((java.lang.Object) futureInstrument.getAlias(), (java.lang.Object) "this_week")) {
                    textView7.setVisibility(8);
                    textView8.setVisibility(8);
                } else {
                    textView7.setVisibility(0);
                    textView8.setVisibility(0);
                }
            }
        }
        return view;
    }

    public final android.view.View OLrzqt(android.content.Context context, BizInstrument bizInstrument) {
        Triple triple;
        if (bizInstrument instanceof SwapInstrument) {
            SwapInstrument swapInstrument = (SwapInstrument) bizInstrument;
            triple = new Triple(swapInstrument.getMaxLmtAmt(), swapInstrument.getMinSize(), swapInstrument.getMaxMktSz());
        } else {
            if (!(bizInstrument instanceof FutureInstrument)) {
                return null;
            }
            FutureInstrument futureInstrument = (FutureInstrument) bizInstrument;
            triple = new Triple(futureInstrument.getMaxLmtAmt(), futureInstrument.getMinSize(), futureInstrument.getMaxMktSz());
        }
        java.lang.String str = (java.lang.String) triple.component1();
        java.lang.String str2 = (java.lang.String) triple.component2();
        java.lang.String str3 = (java.lang.String) triple.component3();
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.QbewEr, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.BVXAa);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UimiPO);
        textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.KDccX), C56423yEv.EZpvd(C56390yDp.OLrzqt("maxLmtAmt", pTB.formatLocalized$default(str, null, 1, null)))));
        textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QhYuFg) + " " + pTB.formatLocalized$default(str2, null, 1, null) + "-" + pTB.formatLocalized$default(str3, null, 1, null));
        return viewInflate;
    }

    public final java.lang.String copydefault(SwapInstrument swapInstrument) {
        if (swapInstrument == null || swapInstrument.getUserPositionMaxPercent().length() == 0) {
            return "";
        }
        return C33069mpW.copydefault(C35964oKf.Fragment.gvFztT, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.copydefault.AEQbTJ(swapInstrument.getUserPositionMaxPercent(), 1, RoundingMode.DOWN))));
    }

    public final java.lang.String EZpvd(SwapInstrument swapInstrument) {
        if (swapInstrument == null || swapInstrument.getUserPositionMaxValueUSD().length() == 0) {
            return "";
        }
        return C33069mpW.copydefault(C35964oKf.Fragment.DDDCac, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", xMR.copydefault.copydefault(swapInstrument.getUserPositionMaxValueUSD(), 0))));
    }

    public final java.lang.String OLrzqt(SwapInstrument swapInstrument) {
        if (swapInstrument == null || swapInstrument.getPlatformSidePositionMaxValueUSD().length() == 0) {
            return "";
        }
        return C33069mpW.copydefault(C35964oKf.Fragment.OmYuqg, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", xMR.copydefault.KWHzl(swapInstrument.getPlatformSidePositionMaxValueUSD(), 0))));
    }

    private final void AkhnZx() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (C39216poC.copydefault.copydefault()) {
            if (parentFragment instanceof C39014pkM) {
                this.values = ((C39014pkM) parentFragment).DbNXlk().hDKMBd();
            }
        } else if (parentFragment instanceof oYA) {
            this.values = ((oYA) parentFragment).QbewEr();
        }
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketContractInfoFragment$loadContractInfo$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(BizInstrument bizInstrument, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketContractInfoFragment$refreshInstrument$1 marketContractInfoFragment$refreshInstrument$1;
        boolean zBooleanValue;
        AbstractC54531xLw abstractC54531xLw;
        C38743pfG c38743pfG;
        MarketCoinInfo marketCoinInfo;
        if (continuation instanceof MarketContractInfoFragment$refreshInstrument$1) {
            marketContractInfoFragment$refreshInstrument$1 = (MarketContractInfoFragment$refreshInstrument$1) continuation;
            int i = marketContractInfoFragment$refreshInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketContractInfoFragment$refreshInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                marketContractInfoFragment$refreshInstrument$1 = new MarketContractInfoFragment$refreshInstrument$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = marketContractInfoFragment$refreshInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketContractInfoFragment$refreshInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54581xNr interfaceC54581xNrDjBIcL = djBIcL();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrDjBIcL != null ? interfaceC54581xNrDjBIcL.OLrzqt(str) : null;
            if (abstractC54531xLwOLrzqt != null) {
                marketContractInfoFragment$refreshInstrument$1.L$0 = this;
                marketContractInfoFragment$refreshInstrument$1.L$1 = abstractC54531xLwOLrzqt;
                marketContractInfoFragment$refreshInstrument$1.label = 1;
                objEZpvd = abstractC54531xLwOLrzqt.EZpvd(bizInstrument, marketContractInfoFragment$refreshInstrument$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                abstractC54531xLw = abstractC54531xLwOLrzqt;
                c38743pfG = this;
            } else {
                zBooleanValue = false;
                abstractC54531xLw = abstractC54531xLwOLrzqt;
                c38743pfG = this;
                if (zBooleanValue && (marketCoinInfo = c38743pfG.values) != null) {
                    c38743pfG.gEmmrt().AEQbTJ(marketCoinInfo, abstractC54531xLw);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC54531xLw = (AbstractC54531xLw) marketContractInfoFragment$refreshInstrument$1.L$1;
            c38743pfG = (C38743pfG) marketContractInfoFragment$refreshInstrument$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        zBooleanValue = ((java.lang.Boolean) objEZpvd).booleanValue();
        if (zBooleanValue) {
            c38743pfG.gEmmrt().AEQbTJ(marketCoinInfo, abstractC54531xLw);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.isConnected;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.isConnected = null;
        this.gEmmrt = null;
    }
}
