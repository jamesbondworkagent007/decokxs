package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.sub.data.datasource.ChartPreferencesType;
import com.okinc.kline.features.settings.sub.data.datasource.ChartStyleType;
import com.okinc.kline.features.settings.sub.data.datasource.OthersType;
import com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$enterClick$5;
import com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$segmentClick$1;
import com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$subscribeOnUiChange$1;
import com.okinc.kline.features.settings.sub.viewmodel.KlineSubSettingViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C35964oKf;
import o.C39403prf;
import o.InterfaceC49363unD;
import o.oTB;
import o.oTH;
import o.pDT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTH extends oTF implements InterfaceC49363unD, oTG {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C36055oNp AYXKKw;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final /* synthetic */ C39267ppA djBIcL = new C39267ppA();
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oTN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oTH.OLrzqt(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.djBIcL.OLrzqt(abstractActivityC33041mov);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.djBIcL.OLrzqt();
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
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

    public oTH() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(KlineSubSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$special$$inlined$viewModels$default$3
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
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.features.settings.sub.ui.KlineSettingActivity$special$$inlined$viewModels$default$6
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

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oTH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull SettingEntryPoint settingEntryPoint, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(settingEntryPoint, "");
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) oTH.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("entry_point", settingEntryPoint)));
            context.startActivity(intent);
        }
    }

    public static final oTM OLrzqt(oTH oth) {
        return new oTM(oth);
    }

    /* JADX DEBUG: Possible override for method o.oTF.AEQbTJ()V */
    public final oTM AEQbTJ() {
        return (oTM) this.AhwBna.getValue();
    }

    public final KlineSubSettingViewModel AYXKKw() {
        return (KlineSubSettingViewModel) this.gEmmrt.getValue();
    }

    private final pCW valueOf() {
        return (pCW) this.valueOf.getValue();
    }

    @Override // o.oTF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt((AbstractActivityC33041mov) this);
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C33567myr.AEQbTJ(this, djBIcL());
        C33494mxX.copydefault.EZpvd(this, djBIcL());
    }

    @Override // o.oTF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna();
        AkhnZx();
        gEmmrt();
        OLrzqt(bundle);
        C36234oUf.EZpvd.AhwBna();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("entry_point", AYXKKw().copydefault());
    }

    private final void AhwBna() {
        C36055oNp c36055oNpAEQbTJ = C36055oNp.AEQbTJ(android.view.LayoutInflater.from(this));
        setContentView(c36055oNpAEQbTJ.getRoot());
        this.AYXKKw = c36055oNpAEQbTJ;
        RecyclerView recyclerView = c36055oNpAEQbTJ.EZpvd;
        if (recyclerView != null) {
            EZpvd(recyclerView);
        }
    }

    public final void EZpvd(RecyclerView recyclerView) {
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(AEQbTJ());
    }

    private final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineSettingActivity$subscribeOnUiChange$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        getSupportFragmentManager().setFragmentResultListener("REQUEST_UPDATE_COLOR", this, new FragmentResultListener() { // from class: o.oTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                oTH.copydefault(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void copydefault(oTH oth, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        C36246oUr.copydefault().valueOf(C36240oUl.copydefault());
        C36246oUr.copydefault().AhwBna(C36240oUl.AEQbTJ());
        KlineSubSettingViewModel.reloadSettingList$default(oth.AYXKKw(), null, 1, null);
    }

    private final void OLrzqt(android.os.Bundle bundle) {
        KlineSubSettingViewModel klineSubSettingViewModelAYXKKw = AYXKKw();
        SettingEntryPoint settingEntryPoint = null;
        if (bundle != null) {
            android.os.Parcelable parcelable = bundle.getParcelable("entry_point");
            if (parcelable instanceof SettingEntryPoint) {
                settingEntryPoint = (SettingEntryPoint) parcelable;
            }
        } else {
            android.content.Intent intent = getIntent();
            SettingEntryPoint settingEntryPoint2 = intent != null ? (SettingEntryPoint) intent.getParcelableExtra("entry_point") : null;
            if (settingEntryPoint2 instanceof SettingEntryPoint) {
                settingEntryPoint = settingEntryPoint2;
            }
        }
        klineSubSettingViewModelAYXKKw.AEQbTJ(settingEntryPoint);
    }

    @Override // o.oTG
    public void AEQbTJ(@NotNull oTB otb) {
        Intrinsics.checkNotNullParameter(otb, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        java.lang.String strOLrzqt = otb.OLrzqt();
        if (strOLrzqt.length() == 0) {
            strOLrzqt = otb.copydefault();
        }
        viewOnClickListenerC54939xaY.setTitle(strOLrzqt);
        viewOnClickListenerC54939xaY.EZpvd(otb.EZpvd());
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C35964oKf.Fragment.sSMYrx), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    @Override // o.oTG
    public void copydefault(@NotNull oTB.TaskDescription taskDescription, boolean z) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        InterfaceC36227oTz interfaceC36227oTzKWHzl = taskDescription.KWHzl();
        if (interfaceC36227oTzKWHzl == ChartStyleType.FullScreenMode) {
            C36236oUh.EZpvd.EZpvd(!z);
            AYXKKw().OLrzqt(z ? EntryType.PRO_FULL_SCREEN : EntryType.PRO_PORTRAIT);
            RxBus.AEQbTJ(new C39387prP(z));
            C36234oUf.EZpvd.KWHzl("chart_settings", "full_screen_mode");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.NewsDisplay) {
            SPUtils.put("kline_flash_news_on", java.lang.Boolean.valueOf(z));
            C36234oUf.EZpvd.EZpvd(z);
            pUU.KWHzl(getTAG(), "user switch news display status to " + z);
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.QuickTrading) {
            SPUtils.put("chart_quick_order", java.lang.Boolean.valueOf(z));
            AYXKKw().AEQbTJ().setSupportQuickOrder(z);
            valueOf().KWHzl("isAppTampered");
            C36234oUf.EZpvd.KWHzl("chart_settings", "quick_trading");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.KeepScreenOn) {
            SPUtils.put("key_screen_on", java.lang.Boolean.valueOf(z));
            C36234oUf.EZpvd.KWHzl("chart_settings", "keep_screen_on");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.DoubleTapToFullScreen) {
            SPUtils.put("kline_double_click", java.lang.Boolean.valueOf(z));
            C36246oUr.copydefault().djBIcL(z);
            C36234oUf.EZpvd.KWHzl("chart_settings", "double_tap_for_fullscreen");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.CancelOrderConfirm) {
            C36246oUr.copydefault().zLjUOn().setOrderCancelConfirm(z);
            C36234oUf.EZpvd.KWHzl("chart_settings", "cancel_order_confirmation");
            return;
        }
        if (interfaceC36227oTzKWHzl == OthersType.SyncDrawing) {
            SPUtils.put("kline_drawing_data", java.lang.Boolean.valueOf(z));
            return;
        }
        if (interfaceC36227oTzKWHzl == OthersType.RemoveDrawing) {
            SPUtils.put("kline_drawing_data_clear", java.lang.Boolean.valueOf(z));
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.AnchorTime) {
            C36236oUh c36236oUh = C36236oUh.EZpvd;
            c36236oUh.copydefault(AYXKKw().AEQbTJ().getMode(), z);
            c36236oUh.AYXKKw();
            C36234oUf.EZpvd.AhwBna(z);
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.AnchorTimeSwitchPairs) {
            C36236oUh c36236oUh2 = C36236oUh.EZpvd;
            c36236oUh2.EZpvd(AYXKKw().AEQbTJ().getMode(), z);
            c36236oUh2.djBIcL();
            C36234oUf.EZpvd.KWHzl(z);
        }
    }

    @Override // o.oTG
    public void KWHzl(@NotNull android.view.ViewGroup viewGroup, @NotNull oTB.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        InterfaceC36227oTz interfaceC36227oTzKWHzl = stateListAnimator.KWHzl();
        if (interfaceC36227oTzKWHzl == ChartStyleType.Bullish) {
            EZpvd(viewGroup, pEM.AEQbTJ.copydefault(), true);
        } else if (interfaceC36227oTzKWHzl == ChartStyleType.Bearish) {
            EZpvd(viewGroup, pEM.AEQbTJ.KWHzl(), false);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.oTG
    public void EZpvd(@NotNull oTB.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        InterfaceC36227oTz interfaceC36227oTzKWHzl = stateListAnimator.KWHzl();
        if (interfaceC36227oTzKWHzl == ChartStyleType.ChartView) {
            boolean z = stateListAnimator.AhwBna() == 1;
            C36246oUr.copydefault().AubY(z);
            pEI.EZpvd.KWHzl(z);
            AYXKKw().OLrzqt(z ? EntryType.PRO_PORTRAIT_TV : EntryType.PRO_PORTRAIT);
            C36234oUf.EZpvd.KWHzl("chart_settings", "chart_view");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartStyleType.ZoomStyle) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineSettingActivity$segmentClick$1(stateListAnimator, this, null), 3, null);
            C36234oUf.EZpvd.KWHzl("chart_settings", "zoom_style");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartStyleType.TradeButton) {
            SPUtils.put("trade_button_left", java.lang.Boolean.valueOf(stateListAnimator.AhwBna() == 0));
            RxBus.KWHzl("trade_button_position");
            C36234oUf.EZpvd.KWHzl("chart_settings", "trade_button");
        } else if (interfaceC36227oTzKWHzl == ChartStyleType.Bullish) {
            pEM.AEQbTJ.AEQbTJ(1 == stateListAnimator.AhwBna() ? 0 : 1);
            C36234oUf.EZpvd.KWHzl("chart_settings", "bullish");
        } else if (interfaceC36227oTzKWHzl == ChartStyleType.Bearish) {
            pEM.AEQbTJ.copydefault(1 == stateListAnimator.AhwBna() ? 0 : 1);
            C36234oUf.EZpvd.KWHzl("chart_settings", "bearish");
        }
    }

    @Override // o.oTG
    public void KWHzl(@NotNull oTB.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        InterfaceC36227oTz interfaceC36227oTzKWHzl = application.KWHzl();
        if (interfaceC36227oTzKWHzl == ChartStyleType.Theme) {
            C39403prf.TaskDescription taskDescription = C39403prf.Companion;
            java.util.List<TradeMenuItemBean> listGEmmrt = application.gEmmrt();
            if (listGEmmrt == null) {
                return;
            }
            C39403prf c39403prfNewInstance$default = C39403prf.TaskDescription.newInstance$default(taskDescription, listGEmmrt, application.copydefault(), false, 4, null);
            c39403prfNewInstance$default.KWHzl(new ActionBar());
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c39403prfNewInstance$default.show(supportFragmentManager);
            C36234oUf.EZpvd.KWHzl("chart_settings", "theme");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.UtcChangeAndChartTime) {
            C39403prf.TaskDescription taskDescription2 = C39403prf.Companion;
            java.util.List<TradeMenuItemBean> listGEmmrt2 = application.gEmmrt();
            if (listGEmmrt2 == null) {
                return;
            }
            C39403prf c39403prfNewInstance$default2 = C39403prf.TaskDescription.newInstance$default(taskDescription2, listGEmmrt2, C33070mpX.AYXKKw(C35964oKf.Fragment.DCUTEI), false, 4, null);
            c39403prfNewInstance$default2.KWHzl(new StateListAnimator());
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            c39403prfNewInstance$default2.show(supportFragmentManager2);
            C36234oUf.EZpvd.KWHzl("chart_settings", "chart_time");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.AbstractOnChart) {
            C39270ppD c39270ppDOLrzqt = C39270ppD.Companion.OLrzqt();
            c39270ppDOLrzqt.EZpvd(new Function1() { // from class: o.oTL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oTH.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            c39270ppDOLrzqt.show(supportFragmentManager3);
            C36234oUf.EZpvd.KWHzl("chart_settings", "abstract_on_chart");
            return;
        }
        if (interfaceC36227oTzKWHzl == ChartPreferencesType.DragPosition) {
            C39403prf.TaskDescription taskDescription3 = C39403prf.Companion;
            java.util.List<TradeMenuItemBean> listGEmmrt3 = application.gEmmrt();
            if (listGEmmrt3 == null) {
                return;
            }
            C39403prf c39403prfNewInstance$default3 = C39403prf.TaskDescription.newInstance$default(taskDescription3, listGEmmrt3, C33070mpX.AYXKKw(C35964oKf.Fragment.dvImUD), false, 4, null);
            c39403prfNewInstance$default3.KWHzl(new Activity());
            androidx.fragment.app.FragmentManager supportFragmentManager4 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
            c39403prfNewInstance$default3.show(supportFragmentManager4);
            C36234oUf.EZpvd.KWHzl("chart_settings", "drag_position");
            return;
        }
        if (interfaceC36227oTzKWHzl == OthersType.FloatingWidget) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain().getImmediate(), null, new KlineSettingActivity$enterClick$5(this, null), 2, null);
        }
    }

    public static final class ActionBar implements C39403prf.ActionBar {
        public ActionBar() {
        }

        @Override // o.C39403prf.ActionBar
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            if (tradeMenuItemBean.isSelect()) {
                return;
            }
            java.lang.Object data = tradeMenuItemBean.getData();
            int i = (!Intrinsics.EZpvd(data, (java.lang.Object) "kline_white") && (!Intrinsics.EZpvd(data, (java.lang.Object) "kline_follow_app") || C33492mxV.OLrzqt())) ? 2 : 1;
            SPUtils.put("kline_theme_type", tradeMenuItemBean.getData());
            KlineSubSettingViewModel.reloadSettingList$default(oTH.this.AYXKKw(), null, 1, null);
            oTH.this.getDelegate().setLocalNightMode(i);
            RxBus.KWHzl("kline_theme_type");
        }
    }

    public static final class StateListAnimator implements C39403prf.ActionBar {
        public StateListAnimator() {
        }

        @Override // o.C39403prf.ActionBar
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            InterfaceC46557tYt interfaceC46557tYtEZpvd;
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            if (!(tradeMenuItemBean.getData() instanceof java.lang.Integer) || (interfaceC46557tYtEZpvd = oTH.this.AYXKKw().EZpvd()) == null) {
                return;
            }
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            int iIntValue = ((java.lang.Integer) data).intValue();
            final oTH oth = oTH.this;
            interfaceC46557tYtEZpvd.OLrzqt(iIntValue, new Function0() { // from class: o.oTQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oTH.StateListAnimator.AEQbTJ(oth);
                }
            });
        }

        public static final Unit AEQbTJ(oTH oth) {
            KlineSubSettingViewModel.reloadSettingList$default(oth.AYXKKw(), null, 1, null);
            RxBus.KWHzl("up_down_time_changed");
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(oTH oth, boolean z) {
        int i = !z ? 1 : 0;
        SPUtils.put("kline_abstract_type", java.lang.Integer.valueOf(i));
        oth.AYXKKw().AEQbTJ().setMKlineAbstractType(i);
        KlineSubSettingViewModel.reloadSettingList$default(oth.AYXKKw(), null, 1, null);
        return Unit.INSTANCE;
    }

    public static final class Activity implements C39403prf.ActionBar {
        public Activity() {
        }

        @Override // o.C39403prf.ActionBar
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            int iIntValue = ((java.lang.Integer) data).intValue();
            SPUtils.put("chart_position", java.lang.Integer.valueOf(iIntValue));
            oTH.this.AYXKKw().AEQbTJ().setMChartPosition(iIntValue);
            oTH.this.AYXKKw().AEQbTJ().setMChartOffsetInit(false);
            oTH.this.AYXKKw().AEQbTJ().setKlineDefaultOffset(0.0f);
            KlineSubSettingViewModel.reloadSettingList$default(oTH.this.AYXKKw(), null, 1, null);
        }
    }

    @Override // o.oTG
    public void EZpvd(@NotNull oTB.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (actionBar.KWHzl() == ChartStyleType.ColorPreference) {
            InterfaceC46552tYo interfaceC46552tYo = (InterfaceC46552tYo) C43248rlh.KWHzl.AEQbTJ(InterfaceC46552tYo.class);
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC46552tYo.EZpvd(supportFragmentManager, false, !C55608xnE.OLrzqt());
            C36234oUf.EZpvd.KWHzl("chart_settings", "color_preferences");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, o.pvE] */
    public final void EZpvd(android.view.View view, java.lang.String str, final boolean z) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        objectRef.element = new C39587pvE(this, stateListAnimator.KWHzl().djBIcL(), new Function1() { // from class: o.oTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oTH.AEQbTJ(z, this, objectRef, (oLO) obj);
            }
        }, new Function0() { // from class: o.oTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oTH.KWHzl(this.copydefault, objectRef);
            }
        }, null, 16, null);
        int iOLrzqt = C55302xhQ.OLrzqt(this);
        C39587pvE c39587pvE = (C39587pvE) objectRef.element;
        if (c39587pvE != null) {
            iOLrzqt -= c39587pvE.KWHzl() + C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        C39587pvE c39587pvE2 = (C39587pvE) objectRef.element;
        if (c39587pvE2 != null) {
            java.lang.String strCopydefault = stateListAnimator.KWHzl().copydefault(str);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            C39587pvE.setSelectedColorAndPos$default(c39587pvE2, strCopydefault, false, true, false, null, 24, null);
        }
        C39587pvE c39587pvE3 = (C39587pvE) objectRef.element;
        if (c39587pvE3 != null) {
            c39587pvE3.showAsDropDown(view, iOLrzqt, C55298xhM.dpInt$default(-10, (android.content.Context) null, 1, (java.lang.Object) null), 8388611);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(boolean z, oTH oth, Ref.ObjectRef objectRef, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        if (z) {
            pEM.AEQbTJ.AEQbTJ(olo.copydefault());
        } else {
            pEM.AEQbTJ.EZpvd(olo.copydefault());
        }
        oth.AYXKKw().gEmmrt();
        C39587pvE c39587pvE = (C39587pvE) objectRef.element;
        if (c39587pvE != null) {
            c39587pvE.dismiss();
        }
        objectRef.element = null;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(oTH oth, Ref.ObjectRef objectRef) {
        oth.AYXKKw().gEmmrt();
        C39587pvE c39587pvE = (C39587pvE) objectRef.element;
        if (c39587pvE != null) {
            c39587pvE.dismiss();
        }
        objectRef.element = null;
        return Unit.INSTANCE;
    }

    @Override // o.oTF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C36234oUf.EZpvd.DbNXlk();
    }

    @Override // o.oTF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.oTF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.oTF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
