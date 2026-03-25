package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel;
import com.okinc.kline.features.kline.classic.viewmodel.KlineClassicViewModel;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$subscribeUiChange$3;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent;
import com.okinc.kline.ui.component.business.klinequote.conainer.KlineContainerUiComponent;
import com.okinc.kline.ui.component.business.klinequote.headmarket.HeadMarketUiComponent;
import com.okinc.kline.ui.component.business.klinequote.timeset.TimeSettingUiComponent;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import java.lang.ref.WeakReference;
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
import o.C39037pkj;
import o.InterfaceC39272ppF;
import o.InterfaceC39563puh;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39014pkM extends AbstractC39010pkI implements InterfaceC49363unD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int ejfBZ = 8;
    public boolean AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.plb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39014pkM.gEmmrt();
        }
    });
    public InterfaceC49420uoH fARcdN;
    public oML fIwbmz;
    public java.util.Set<C39037pkj.TaskDescription> fJNWhG;
    public final InterfaceC56387yDm getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public InterfaceC39502ptZ hDKMBd;
    public final InterfaceC56387yDm iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm zsXlph;

    /* JADX INFO: renamed from: o.pkM$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.util.Set<C39037pkj.TaskDescription> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.fJNWhG = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC39502ptZ interfaceC39502ptZ) {
        this.hDKMBd = interfaceC39502ptZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.flVtFt;
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

    public C39014pkM() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$2
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
        this.zsXlph = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineQuoteViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$5
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
        this.getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.pla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39014pkM.gEmmrt(this.EZpvd);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineClassicViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$10
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketEventsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$14
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$special$$inlined$viewModels$default$15
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.pkP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39014pkM.AhwBna(this.OLrzqt);
            }
        });
    }

    @Override // o.AbstractC39028pka
    public java.util.Set<C39037pkj.TaskDescription> AEQbTJ() {
        java.util.Set<C39037pkj.TaskDescription> set = this.fJNWhG;
        if (set != null) {
            return set;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final oUV gEmmrt() {
        return new oUV();
    }

    public final oUV fIwbmz() {
        return (oUV) this.AuCTelauCTel.getValue();
    }

    public final KlineQuoteViewModel fJNWhG() {
        return (KlineQuoteViewModel) this.zsXlph.getValue();
    }

    public static final C39263pox gEmmrt(C39014pkM c39014pkM) {
        return (C39263pox) new ViewModelProvider(c39014pkM).get(C39263pox.class);
    }

    public final C39263pox fetchVPNInfo() {
        return (C39263pox) this.getNewProxyInstance.getValue();
    }

    public final KlineClassicViewModel values() {
        return (KlineClassicViewModel) this.iwGUEr.getValue();
    }

    public final MarketEventsViewModel isConnected() {
        return (MarketEventsViewModel) this.uzCIH.getValue();
    }

    public final KlineQuoteDataComponent DbNXlk() {
        return (KlineQuoteDataComponent) this.getFieldNames.getValue();
    }

    public static final pCT copydefault(InterfaceC56387yDm<pCT> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final C54822xWp AEQbTJ(InterfaceC56387yDm<C54822xWp> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final C37854pDd KWHzl(InterfaceC56387yDm<C37854pDd> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final pCW EZpvd(InterfaceC56387yDm<pCW> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final pGZ OLrzqt(InterfaceC56387yDm<pGZ> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    /* JADX INFO: renamed from: o.pkM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pkM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C39014pkM newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, InterfaceC39502ptZ interfaceC39502ptZ, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = false;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                str3 = null;
            }
            return actionBar.KWHzl(str, str2, z3, z4, str3, interfaceC39502ptZ);
        }

        public final C39014pkM KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.lang.String str3, @NotNull InterfaceC39502ptZ interfaceC39502ptZ) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(interfaceC39502ptZ, "");
            C39014pkM c39014pkM = new C39014pkM();
            c39014pkM.copydefault(interfaceC39502ptZ);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putBoolean("klineNeedLoad", z);
            bundle.putBoolean(oLT.AhwBna(), z2);
            bundle.putString("tag", str3);
            c39014pkM.setArguments(bundle);
            c39014pkM.setSharedElementEnterTransition(new C36358oYv());
            c39014pkM.setSharedElementReturnTransition(new C36358oYv());
            return c39014pkM;
        }
    }

    @Override // o.AbstractC39028pka, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setSharedElementEnterTransition(new C36358oYv());
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLIneQuotesComponentFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC39010pkI, o.AbstractC39028pka, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        KWHzl(yEE.gEmmrt(copydefault(context)));
    }

    @Override // o.AbstractC39009pkH, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C33546myW c33546myW;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        oML oml = this.fIwbmz;
        if (oml != null) {
            EZpvd(oml);
        }
        oML oml2 = this.fIwbmz;
        if (oml2 != null && (c33546myW = oml2.DTwDnp) != null) {
            c33546myW.AhwBna(false);
        }
        wlaJM();
        isConnected().AEQbTJ(DbNXlk().hDKMBd());
        isConnected().djBIcL();
    }

    @Override // o.AbstractC39028pka, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        isConnected().djBIcL();
    }

    public final void wlaJM() {
        DbNXlk().AxsJAY().djBIcL().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.pkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39014pkM.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        }));
        DbNXlk().ejfBZ().djBIcL().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.pkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39014pkM.copydefault(this.AEQbTJ, (Unit) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLIneQuotesComponentFragment$subscribeUiChange$3(this, null), 3, null);
    }

    public static final Unit AEQbTJ(C39014pkM c39014pkM, java.lang.String str) {
        if (c39014pkM.fARcdN == null) {
            c39014pkM.values().copydefault();
            return Unit.INSTANCE;
        }
        c39014pkM.values().copydefault(c39014pkM.DbNXlk().values().wlaJM());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C39014pkM c39014pkM, Unit unit) {
        C36250oUv c36250oUv;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39014pkM, true, (java.lang.String) null, 2, (java.lang.Object) null);
        if (c39014pkM.AuCTel) {
            c39014pkM.OLrzqt(true);
            oML oml = c39014pkM.fIwbmz;
            if (oml != null && (c36250oUv = oml.AuCTel) != null) {
                oUV ouvFIwbmz = c39014pkM.fIwbmz();
                C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(c36250oUv);
                Intrinsics.checkNotNullExpressionValue(c36312oXcAEQbTJ, "");
                ouvFIwbmz.copydefault(c36312oXcAEQbTJ);
                c36250oUv.invalidate();
                c39014pkM.AuCTel = false;
            }
            c39014pkM.DbNXlk().AubY().KWHzl().setValue(java.lang.Boolean.TRUE);
        } else {
            BotGridOrderDialogData botGridOrderDialogDataKWHzl = c39014pkM.values().KWHzl();
            if (botGridOrderDialogDataKWHzl != null) {
                c39014pkM.EZpvd(botGridOrderDialogDataKWHzl);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.pkM$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC36249oUu {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC36249oUu
        public void AEQbTJ(float f, boolean z) {
            BotGridOrderDialogData botGridOrderDialogDataAEQbTJ;
            InterfaceC49420uoH interfaceC49420uoH;
            if (C39014pkM.this.hDKMBd() || (botGridOrderDialogDataAEQbTJ = C39014pkM.this.values().AEQbTJ(f, z)) == null || (interfaceC49420uoH = C39014pkM.this.fARcdN) == null) {
                return;
            }
            interfaceC49420uoH.KWHzl(botGridOrderDialogDataAEQbTJ);
        }

        @Override // o.InterfaceC36249oUu
        public void KWHzl(float f, boolean z) {
            BotGridOrderDialogData botGridOrderDialogDataCopydefault;
            InterfaceC49420uoH interfaceC49420uoH;
            if (C39014pkM.this.hDKMBd() || (botGridOrderDialogDataCopydefault = C39014pkM.this.values().copydefault(f, z)) == null || (interfaceC49420uoH = C39014pkM.this.fARcdN) == null) {
                return;
            }
            interfaceC49420uoH.KWHzl(botGridOrderDialogDataCopydefault);
        }
    }

    public final void EZpvd(oML oml) {
        oml.AuCTel.setBotGridDragListener(new StateListAnimator());
    }

    public final boolean hDKMBd() {
        if (values().gEmmrt()) {
            return false;
        }
        C55328xhq c55328xhq = C55328xhq.OLrzqt;
        if (c55328xhq.EZpvd()) {
            return false;
        }
        C55328xhq.show$default(c55328xhq, (java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.QfJbVf), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, -400, 22, (java.lang.Object) null);
        return true;
    }

    public final C39037pkj.TaskDescription copydefault(final android.content.Context context) {
        return new C39037pkj.TaskDescription(true, null, new Function0() { // from class: o.pkR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39014pkM.AEQbTJ(context, this);
            }
        }, 2, null);
    }

    public static final C39037pkj AEQbTJ(android.content.Context context, final C39014pkM c39014pkM) {
        C39043pkp c39043pkp = new C39043pkp(new C39048pku(context, C35964oKf.Application.dvKsVJ, null, 4, null), new Function1() { // from class: o.pkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39014pkM.KWHzl(this.AEQbTJ, (android.view.View) obj);
            }
        });
        return new C39037pkj(c39043pkp, yED.AEQbTJ(c39014pkM.DbNXlk()), yEE.AhwBna(new HeadMarketUiComponent(c39043pkp, c39014pkM.DbNXlk()), new ChartUIComponent(c39043pkp, c39014pkM.DbNXlk()), new TimeSettingUiComponent(c39043pkp, c39014pkM.DbNXlk()), new KlineContainerUiComponent(c39043pkp, c39014pkM.DbNXlk())));
    }

    public static final oML KWHzl(C39014pkM c39014pkM, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        oML omlCopydefault = oML.copydefault(view);
        c39014pkM.fIwbmz = omlCopydefault;
        return omlCopydefault;
    }

    @Override // o.AbstractC39009pkH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        fJNWhG().fvQaOB();
    }

    @Override // o.AbstractC39009pkH, o.AbstractC32998moE
    public void onInvisible() {
        fJNWhG().gasjUx();
    }

    public final void fARcdN() {
        if (isAdded()) {
            DbNXlk().OLrzqt(true);
        }
    }

    @Override // o.AbstractC39009pkH
    public void OLrzqt() {
        DbNXlk().values().djSkpj();
    }

    public final void getNewProxyInstance() {
        DbNXlk().values().flVtFt();
    }

    public final void iwGUEr() {
        DbNXlk().values().gGvvIC();
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        C36246oUr.copydefault().DbNXlk("NORMAL");
        C36246oUr.copydefault().EZpvd(false);
        DbNXlk().values().AEQbTJ(new C39104plx(str, str2));
        DbNXlk().values().AxsJAYaxsJAY();
    }

    public final boolean AkhnZx() {
        return isVisibled();
    }

    public final int AuCTel() {
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = DbNXlk().uzCIH();
        C39562pug c39562pug = stateListAnimatorUzCIH instanceof C39562pug ? (C39562pug) stateListAnimatorUzCIH : null;
        if (c39562pug != null) {
            return c39562pug.valueOf();
        }
        return 0;
    }

    public final void ejfBZ() {
        DbNXlk().values().hDKMBd().setValue(java.lang.Boolean.TRUE);
    }

    public final void uzCIH() {
        DbNXlk().values().getFieldNames().setValue(java.lang.Boolean.TRUE);
    }

    public final void getFieldNames() {
        DbNXlk().values().uzCIH().setValue(java.lang.Boolean.TRUE);
    }

    public static /* synthetic */ void setQuickOrderPrice$default(C39014pkM c39014pkM, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "limit";
        }
        c39014pkM.copydefault(str, str2);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DbNXlk().values().OLrzqt(new KlineQuickOrderPriceBean(str, str2));
    }

    public final void OLrzqt(@NotNull final java.lang.String str, java.lang.String str2, java.lang.String str3, final WeakReference<InterfaceC39272ppF> weakReference) {
        InterfaceC49420uoH interfaceC49420uoHAEQbTJ;
        final InterfaceC39272ppF interfaceC39272ppF;
        Intrinsics.checkNotNullParameter(str, "");
        if (isAdded()) {
            final java.lang.String str4 = (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN")) ? MTPushConstants.NotificationTime.KEY_DAYS : "4hour";
            uBU ubu = (uBU) C43251rlk.OLrzqt(uBU.class);
            if (ubu != null) {
                interfaceC49420uoHAEQbTJ = ubu.AEQbTJ(str3 == null ? "" : str3);
            } else {
                interfaceC49420uoHAEQbTJ = null;
            }
            this.fARcdN = interfaceC49420uoHAEQbTJ;
            if (interfaceC49420uoHAEQbTJ != null) {
                interfaceC49420uoHAEQbTJ.KWHzl(new Function1() { // from class: o.pkO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39014pkM.EZpvd(this.copydefault, (BotGridOrderDialogData) obj);
                    }
                });
                interfaceC49420uoHAEQbTJ.OLrzqt(new Function1() { // from class: o.pkV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39014pkM.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                if (weakReference != null && (interfaceC39272ppF = weakReference.get()) != null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    interfaceC39272ppF.KWHzl(interfaceC49420uoHAEQbTJ.KWHzl(str2, str3), new Function0() { // from class: o.pkT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C39014pkM.KWHzl(this.AEQbTJ, str4);
                        }
                    }, new Function0() { // from class: o.pkU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C39014pkM.AEQbTJ(this.EZpvd, interfaceC39272ppF, str);
                        }
                    });
                    InterfaceC39272ppF.ActionBar.setState$default(interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States.STATE_EXPANDED, false, 2, null);
                }
                interfaceC49420uoHAEQbTJ.EZpvd(new Function1() { // from class: o.pkS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39014pkM.AEQbTJ(this.copydefault, (BotGridOrderDialogData) obj);
                    }
                });
                interfaceC49420uoHAEQbTJ.copydefault(new Function1() { // from class: o.pkW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39014pkM.copydefault(weakReference, this, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }
    }

    public static final Unit EZpvd(C39014pkM c39014pkM, BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        c39014pkM.EZpvd(botGridOrderDialogData);
        c39014pkM.values().copydefault(botGridOrderDialogData.copy((219 & 1) != 0 ? botGridOrderDialogData.tickerPrice : c39014pkM.DbNXlk().values().wlaJM(), (219 & 2) != 0 ? botGridOrderDialogData.maxPx : null, (219 & 4) != 0 ? botGridOrderDialogData.minPx : null, (219 & 8) != 0 ? botGridOrderDialogData.gridCount : null, (219 & 16) != 0 ? botGridOrderDialogData.orderLine : null, (219 & 32) != 0 ? botGridOrderDialogData.isFinally : false, (219 & 64) != 0 ? botGridOrderDialogData.digit : 0, (219 & 128) != 0 ? botGridOrderDialogData.isDraggingForCalculateGridNum : false));
        if (botGridOrderDialogData.isFinally()) {
            C36163oRp.AEQbTJ.EZpvd();
        }
        pUU.KWHzl(c39014pkM.getTAG(), "refresh bot grid data: " + botGridOrderDialogData);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C39014pkM c39014pkM, boolean z) {
        c39014pkM.values().OLrzqt(z);
        pUU.KWHzl(c39014pkM.getTAG(), "drag state change to: " + z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C39014pkM c39014pkM, java.lang.String str) {
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableLiveDataOLrzqt = c39014pkM.DbNXlk().AxsJAY().OLrzqt();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mutableLiveDataOLrzqt.setValue(C56390yDp.OLrzqt(bool, str));
        c39014pkM.DbNXlk().AubY().KWHzl().setValue(bool);
        c39014pkM.OLrzqt(true);
        C36163oRp.AEQbTJ.OLrzqt();
        pUU.KWHzl(c39014pkM.getTAG(), "grid dialog open now");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39014pkM c39014pkM, InterfaceC39272ppF interfaceC39272ppF, java.lang.String str) {
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableLiveDataOLrzqt = c39014pkM.DbNXlk().AxsJAY().OLrzqt();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mutableLiveDataOLrzqt.setValue(C56390yDp.OLrzqt(bool, null));
        c39014pkM.DbNXlk().AubY().KWHzl().setValue(bool);
        c39014pkM.OLrzqt(false);
        c39014pkM.values().copydefault();
        c39014pkM.fARcdN = null;
        if (interfaceC39272ppF.valueOf()) {
            C36163oRp.AEQbTJ.AEQbTJ(str);
        }
        pUU.KWHzl(c39014pkM.getTAG(), "grid dialog close now, will clear all data");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39014pkM c39014pkM, BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        c39014pkM.AuCTel = true;
        c39014pkM.DbNXlk().AubY().KWHzl().setValue(java.lang.Boolean.FALSE);
        c39014pkM.values().copydefault(botGridOrderDialogData.copy((219 & 1) != 0 ? botGridOrderDialogData.tickerPrice : c39014pkM.DbNXlk().values().wlaJM(), (219 & 2) != 0 ? botGridOrderDialogData.maxPx : null, (219 & 4) != 0 ? botGridOrderDialogData.minPx : null, (219 & 8) != 0 ? botGridOrderDialogData.gridCount : null, (219 & 16) != 0 ? botGridOrderDialogData.orderLine : null, (219 & 32) != 0 ? botGridOrderDialogData.isFinally : false, (219 & 64) != 0 ? botGridOrderDialogData.digit : 0, (219 & 128) != 0 ? botGridOrderDialogData.isDraggingForCalculateGridNum : false));
        pUU.KWHzl(c39014pkM.getTAG(), "restore grid data now");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(WeakReference weakReference, C39014pkM c39014pkM, boolean z) {
        InterfaceC39272ppF interfaceC39272ppF;
        if (weakReference != null && (interfaceC39272ppF = (InterfaceC39272ppF) weakReference.get()) != null) {
            interfaceC39272ppF.AEQbTJ(KlineQuickOrderBottomSheetBehavior.States.STATE_COLLAPSED, false);
        }
        pUU.KWHzl(c39014pkM.getTAG(), "bot side notify to close grid dialog");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z) {
        oML oml = this.fIwbmz;
        if (oml != null) {
            AppCompatTextView appCompatTextView = oml.zsXlph;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(z ? 8 : 0);
            ConstraintLayout constraintLayout = oml.sSMYrx;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z ? 8 : 0);
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = oml.AuCTel.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                if (z) {
                    if (DbNXlk().ejfBZ().valueOf() == null) {
                        DbNXlk().ejfBZ().OLrzqt(ChartViewOutSideConfig.copy$default(chartViewOutSideConfigAkhnZx, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null));
                    }
                    chartViewOutSideConfigAkhnZx.setMShowCostLine(false);
                    chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(false);
                    chartViewOutSideConfigAkhnZx.setMChartHistoryOrder(false);
                    chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(false);
                    chartViewOutSideConfigAkhnZx.setMShowPriceWarning(false);
                    chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(true);
                    chartViewOutSideConfigAkhnZx.setShowBe(false);
                    chartViewOutSideConfigAkhnZx.setShowLiq(false);
                    C36246oUr.copydefault().djBIcL(false);
                    chartViewOutSideConfigAkhnZx.setSupportQuickOrder(false);
                    return;
                }
                ChartViewOutSideConfig chartViewOutSideConfigValueOf = DbNXlk().ejfBZ().valueOf();
                if (chartViewOutSideConfigValueOf != null) {
                    chartViewOutSideConfigAkhnZx.setMShowCostLine(chartViewOutSideConfigValueOf.getMShowCostLine());
                    chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(chartViewOutSideConfigValueOf.isShowSpotAveragePrice());
                    chartViewOutSideConfigAkhnZx.setMChartHistoryOrder(chartViewOutSideConfigValueOf.getMChartHistoryOrder());
                    chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(chartViewOutSideConfigValueOf.getMShowCurrentOrder());
                    chartViewOutSideConfigAkhnZx.setMShowPriceWarning(chartViewOutSideConfigValueOf.getMShowPriceWarning());
                    chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(chartViewOutSideConfigValueOf.getMHideKlineDrawingData());
                    chartViewOutSideConfigAkhnZx.setShowBe(chartViewOutSideConfigValueOf.isShowBe());
                    chartViewOutSideConfigAkhnZx.setShowLiq(chartViewOutSideConfigValueOf.isShowLiq());
                    C36236oUh c36236oUh = C36236oUh.EZpvd;
                    chartViewOutSideConfigAkhnZx.setSupportQuickOrder(c36236oUh.fJNWhG());
                    C36246oUr.copydefault().djBIcL(c36236oUh.AhwBna());
                    DbNXlk().ejfBZ().OLrzqt((ChartViewOutSideConfig) null);
                }
                C36246oUr.copydefault().DbNXlk("NORMAL");
                C36246oUr.copydefault().EZpvd(false);
            }
        }
    }

    public final void EZpvd(BotGridOrderDialogData botGridOrderDialogData) {
        oML oml;
        if (!botGridOrderDialogData.isDraggingForCalculateGridNum() && botGridOrderDialogData.getMinPx().length() > 0 && botGridOrderDialogData.getMaxPx().length() > 0 && botGridOrderDialogData.getGridCount().length() > 0 && (oml = this.fIwbmz) != null) {
            C36312oXc c36312oXcAEQbTJ = C36312oXc.AEQbTJ(oml.AuCTel);
            pUU.KWHzl(getTAG(), "try to reset for price range(" + botGridOrderDialogData.getMinPx() + ", " + botGridOrderDialogData.getMaxPx() + ")");
            oUV ouvFIwbmz = fIwbmz();
            Intrinsics.copydefault(c36312oXcAEQbTJ);
            ouvFIwbmz.AEQbTJ(c36312oXcAEQbTJ, botGridOrderDialogData.getMinPx(), botGridOrderDialogData.getMaxPx());
        }
    }

    @Override // o.AbstractC39028pka, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36250oUv c36250oUv;
        oML oml = this.fIwbmz;
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.OLrzqt();
            c36250oUv.RcXXUw();
        }
        this.fIwbmz = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.fARcdN = null;
        this.hDKMBd = null;
        super.onDestroy();
    }

    public static final KlineQuoteDataComponent AhwBna(final C39014pkM c39014pkM) {
        final Function0 function0 = null;
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(c39014pkM, C56524yIo.AEQbTJ(pCT.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c39014pkM.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = c39014pkM.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c39014pkM.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy2 = FragmentViewModelLazyKt.createViewModelLazy(c39014pkM, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c39014pkM.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = c39014pkM.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c39014pkM.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy3 = FragmentViewModelLazyKt.createViewModelLazy(c39014pkM, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c39014pkM.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$8
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
                CreationExtras defaultViewModelCreationExtras = c39014pkM.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c39014pkM.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy4 = FragmentViewModelLazyKt.createViewModelLazy(c39014pkM, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c39014pkM.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$11
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
                CreationExtras defaultViewModelCreationExtras = c39014pkM.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c39014pkM.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy5 = FragmentViewModelLazyKt.createViewModelLazy(c39014pkM, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = c39014pkM.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$14
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
                CreationExtras defaultViewModelCreationExtras = c39014pkM.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.KLIneQuotesComponentFragment$kLineDataComponent_delegate$lambda$8$$inlined$activityViewModels$default$15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = c39014pkM.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        KlineQuoteDataComponent klineQuoteDataComponent = new KlineQuoteDataComponent();
        klineQuoteDataComponent.AEQbTJ(copydefault((InterfaceC56387yDm<pCT>) interfaceC56387yDmCreateViewModelLazy));
        klineQuoteDataComponent.copydefault(AEQbTJ((InterfaceC56387yDm<C54822xWp>) interfaceC56387yDmCreateViewModelLazy2));
        klineQuoteDataComponent.copydefault(KWHzl((InterfaceC56387yDm<C37854pDd>) interfaceC56387yDmCreateViewModelLazy3));
        klineQuoteDataComponent.EZpvd(c39014pkM.fJNWhG());
        klineQuoteDataComponent.copydefault(c39014pkM.hDKMBd);
        klineQuoteDataComponent.KWHzl(c39014pkM.fetchVPNInfo());
        klineQuoteDataComponent.KWHzl(EZpvd((InterfaceC56387yDm<pCW>) interfaceC56387yDmCreateViewModelLazy4));
        klineQuoteDataComponent.copydefault(OLrzqt((InterfaceC56387yDm<pGZ>) interfaceC56387yDmCreateViewModelLazy5));
        return klineQuoteDataComponent;
    }
}
