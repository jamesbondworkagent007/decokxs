package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeInternalResult;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$initData$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$observeUIData$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$observeUIData$3;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$observeUIData$4;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$observeUIData$5;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletSetAddressViewModel;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalEscapeTransactionResult;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionInput;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.NoWhenBranchMatchedException;
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
import o.C13754dXa;
import o.C17599fLh;
import o.C52761wXj;
import o.C9678baC;
import o.InterfaceC49363unD;
import o.InterfaceC54855xXv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fKc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17567fKc extends fKW implements InterfaceC49363unD, InterfaceC17595fLd, C17599fLh.TaskDescription {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public AbstractC17013eul AEQbTJ;
    public InterfaceC9738bbJ AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public java.util.List<fLJ> copydefault = yDY.AhwBna();
    public final InterfaceC56387yDm djBIcL;

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

    public ActivityC17567fKc() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(fLG.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$3
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
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(EscapePassKeyWalletSetAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$6
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
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(fLT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$8
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
        }, new Function0() { // from class: o.fJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17567fKc.EZpvd();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$special$$inlined$viewModels$default$9
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

    /* JADX INFO: renamed from: o.fKc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fKc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.fKc$TaskDescription */
    public static final class TaskDescription extends ActivityResultContract<Unit, EscapeInternalResult> {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC17567fKc.class);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public EscapeInternalResult parseResult(int i, android.content.Intent intent) {
            android.os.Parcelable parcelableExtra;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("set_owner_escape_result", EscapeInternalResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("set_owner_escape_result");
                }
                EscapeInternalResult escapeInternalResult = (EscapeInternalResult) parcelableExtra;
                if (escapeInternalResult != null) {
                    return escapeInternalResult;
                }
            }
            return new EscapeInternalResult.Cancelled(false);
        }
    }

    public final fLG AYXKKw() {
        return (fLG) this.KWHzl.getValue();
    }

    public final EscapePassKeyWalletSetAddressViewModel djBIcL() {
        return (EscapePassKeyWalletSetAddressViewModel) this.djBIcL.getValue();
    }

    public final fLT gEmmrt() {
        return (fLT) this.EZpvd.getValue();
    }

    public static final fLT copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
        C9678baC.Activity activity = C9678baC.Companion;
        return new fLT(savedStateHandleCreateSavedStateHandle, new C17652fNg(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp(), Dispatchers.getIO()), new fJO(C13458dMb.EZpvd(activity.AEQbTJ()).DTwDnp()));
    }

    @Override // o.fKW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC17013eul abstractC17013eulAEQbTJ = AbstractC17013eul.AEQbTJ(getLayoutInflater());
        this.AEQbTJ = abstractC17013eulAEQbTJ;
        if (abstractC17013eulAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eulAEQbTJ = null;
        }
        setContentView(abstractC17013eulAEQbTJ.getRoot());
        fIwbmz();
        ejfBZ();
        values();
        djBIcL().KWHzl();
    }

    private final void ejfBZ() {
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new EscapePassKeyWalletConfirmActivity$initData$1(this, null), 3, null);
    }

    private final void fIwbmz() {
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        AbstractC17013eul abstractC17013eul2 = null;
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        abstractC17013eul.copydefault.setEnabled(false);
        AbstractC17013eul abstractC17013eul3 = this.AEQbTJ;
        if (abstractC17013eul3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17013eul2 = abstractC17013eul3;
        }
        ConstraintLayout constraintLayout = abstractC17013eul2.EZpvd;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fKc$ActionBar */
    public static final class ActionBar implements InterfaceC54855xXv {
        public ActionBar() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            pUU.copydefault(ActivityC17567fKc.this.getTAG(), "onWalletAndNetworkSwitched = " + interfaceC9738bbJ.AkhnZx() + " : " + interfaceC9738bbJ.DbNXlk());
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            pUU.copydefault(ActivityC17567fKc.this.getTAG(), "onWalletSwitched = " + interfaceC9738bbJ.AkhnZx() + " : " + interfaceC9738bbJ.DbNXlk());
            ActivityC17567fKc.this.OLrzqt(interfaceC9738bbJ);
            ActivityC17567fKc.this.copydefault(interfaceC9738bbJ);
        }
    }

    /* JADX INFO: renamed from: o.fKc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC17567fKc OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC17567fKc activityC17567fKc) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = activityC17567fKc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.gEmmrt().fetchVPNInfo();
            }
        }
    }

    /* JADX INFO: renamed from: o.fKc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC17567fKc KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC17567fKc activityC17567fKc) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = activityC17567fKc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.showLoading();
                this.KWHzl.AYXKKw().AEQbTJ();
            }
        }
    }

    public final InterfaceC54855xXv KWHzl() {
        return new ActionBar();
    }

    public final void OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.AhwBna = interfaceC9738bbJ;
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        AbstractC17013eul abstractC17013eul2 = null;
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        abstractC17013eul.valueOf.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        AbstractC17013eul abstractC17013eul3 = this.AEQbTJ;
        if (abstractC17013eul3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul3 = null;
        }
        abstractC17013eul3.valueOf.setText(interfaceC9738bbJ.AYXKKw());
        AbstractC17013eul abstractC17013eul4 = this.AEQbTJ;
        if (abstractC17013eul4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul4 = null;
        }
        abstractC17013eul4.AEQbTJ.setVisibility(0);
        AbstractC17013eul abstractC17013eul5 = this.AEQbTJ;
        if (abstractC17013eul5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17013eul2 = abstractC17013eul5;
        }
        android.widget.ImageView imageView = abstractC17013eul2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14725dqq.copydefault(imageView, interfaceC9738bbJ.AEQbTJ(), C13754dXa.Activity.DGUQLI, new Function1() { // from class: o.fKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17567fKc.copydefault((C5335Nt) obj);
            }
        }, 32.0f);
    }

    public static final Unit copydefault(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    @Override // o.C17599fLh.TaskDescription
    public void valueOf() {
        xWO xwo = (xWO) C43251rlk.copydefault(xWO.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        xwo.EZpvd(supportFragmentManager, this, new Function1() { // from class: o.fKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17567fKc.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(ActivityC17567fKc activityC17567fKc, boolean z) {
        if (z) {
            activityC17567fKc.AYXKKw().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    @Override // o.C17599fLh.TaskDescription
    public void AhwBna() {
        C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : 2, (226 & 2) != 0 ? false : false, (226 & 4) != 0 ? null : null, (226 & 8) != 0 ? yDY.AhwBna() : yDY.gEmmrt(UnsupportedWalletType.MPCWallet, UnsupportedWalletType.HardwareWallet, UnsupportedWalletType.PrivateKeyWallet), (226 & 16) == 0 ? false : false, (226 & 32) != 0 ? null : new C14456dlm(null, new Function0() { // from class: o.fKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17567fKc.values(this.OLrzqt);
            }
        }, 1, null), (226 & 64) != 0 ? new java.util.ArrayList() : yDY.copydefault(java.lang.Integer.valueOf(WalletType.HDWallet.ordinal())), (226 & 128) == 0 ? new Function0() { // from class: o.fKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17567fKc.isConnected(this.copydefault);
            }
        } : null).show(getSupportFragmentManager(), "EscapePassKeyWalletConfirmActivity");
    }

    public static final Unit values(ActivityC17567fKc activityC17567fKc) {
        activityC17567fKc.AYXKKw().AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(ActivityC17567fKc activityC17567fKc) {
        activityC17567fKc.AYXKKw().AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletConfirmActivity$observeUIData$1(this, null), 3, null);
        getSupportFragmentManager().setFragmentResultListener("request_key_cedefi_sign_escape_transaction", this, new FragmentResultListener() { // from class: o.fKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC17567fKc.EZpvd(this.copydefault, str, bundle);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletConfirmActivity$observeUIData$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletConfirmActivity$observeUIData$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletConfirmActivity$observeUIData$5(this, null), 3, null);
    }

    public final void KWHzl(int i) {
        int size = gEmmrt().AYXKKw().size();
        if (i == size && size > 0) {
            AbstractC17013eul abstractC17013eul = this.AEQbTJ;
            if (abstractC17013eul == null) {
                Intrinsics.gEmmrt("");
                abstractC17013eul = null;
            }
            C52794wYp c52794wYp = abstractC17013eul.copydefault;
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCurrentControllerInfo));
            C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
            gEmmrt().AEQbTJ();
            Intrinsics.copydefault(c52794wYp);
            return;
        }
        AbstractC17013eul abstractC17013eul2 = this.AEQbTJ;
        if (abstractC17013eul2 == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul2 = null;
        }
        C52794wYp c52794wYp2 = abstractC17013eul2.copydefault;
        int i2 = C13754dXa.FragmentManager.flagMapping;
        EscapeSignAddressData escapeSignAddressDataKWHzl = gEmmrt().KWHzl();
        c52794wYp2.setText(C33069mpW.KWHzl(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("network", C33129mqd.gEmmrt(escapeSignAddressDataKWHzl != null ? escapeSignAddressDataKWHzl.getChainName() : null)))));
    }

    public final void KWHzl(PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
        EscapeSignAddressData escapeSignAddressDataKWHzl = gEmmrt().KWHzl();
        java.lang.String strGEmmrt = escapeSignAddressDataKWHzl != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(escapeSignAddressDataKWHzl.getChainIndex())) : null;
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            pUU.copydefault("EscapePassKeyWalletConfirmActivity", "openSignPage failed: invalid chainIndex");
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("cedefi_sign_escape_transaction_fragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.add(C17609fLr.Companion.copydefault(new InternalTransactionInput(passkeyAuthenticateRequest, strGEmmrt)), "cedefi_sign_escape_transaction_fragment");
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public final void isConnected() {
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        AbstractC17013eul abstractC17013eul2 = null;
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        abstractC17013eul.copydefault.setVisibility(8);
        AbstractC17013eul abstractC17013eul3 = this.AEQbTJ;
        if (abstractC17013eul3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul3 = null;
        }
        abstractC17013eul3.KWHzl.setVisibility(8);
        AbstractC17013eul abstractC17013eul4 = this.AEQbTJ;
        if (abstractC17013eul4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17013eul2 = abstractC17013eul4;
        }
        C55113xdn c55113xdn = abstractC17013eul2.djBIcL;
        c55113xdn.setVisibility(0);
        c55113xdn.setAnimation(C52761wXj.PendingIntent.values);
        c55113xdn.playAnimation();
    }

    public final void OLrzqt() {
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        AbstractC17013eul abstractC17013eul2 = null;
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        C55113xdn c55113xdn = abstractC17013eul.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        AbstractC17013eul abstractC17013eul3 = this.AEQbTJ;
        if (abstractC17013eul3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17013eul2 = abstractC17013eul3;
        }
        abstractC17013eul2.KWHzl.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uzCIH() {
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        AbstractC17013eul abstractC17013eul2 = null;
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        C55113xdn c55113xdn = abstractC17013eul.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        AbstractC17013eul abstractC17013eul3 = this.AEQbTJ;
        if (abstractC17013eul3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul3 = null;
        }
        abstractC17013eul3.copydefault.setVisibility(8);
        AbstractC17013eul abstractC17013eul4 = this.AEQbTJ;
        if (abstractC17013eul4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17013eul2 = abstractC17013eul4;
        }
        C55173xeu c55173xeu = abstractC17013eul2.KWHzl;
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string = getString(C13754dXa.FragmentManager.DcMfJKfNLfdT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C13754dXa.FragmentManager.R);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        java.lang.String string3 = getString(C13754dXa.FragmentManager.DcMfJKfNUfqk);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17567fKc.KWHzl(this.EZpvd, view);
            }
        });
    }

    public static final void KWHzl(ActivityC17567fKc activityC17567fKc, android.view.View view) {
        activityC17567fKc.djBIcL().KWHzl();
    }

    public final void DbNXlk() {
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        AbstractC17013eul abstractC17013eul2 = null;
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        C55113xdn c55113xdn = abstractC17013eul.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        AbstractC17013eul abstractC17013eul3 = this.AEQbTJ;
        if (abstractC17013eul3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17013eul2 = abstractC17013eul3;
        }
        abstractC17013eul2.copydefault.setVisibility(8);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(0);
        viewOnClickListenerC54939xaY.EZpvd(getString(C13754dXa.FragmentManager.requestExtraBinder));
        java.lang.String string = getString(C13754dXa.FragmentManager.DCJXGO);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17567fKc.OLrzqt(this.EZpvd, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ActivityC17567fKc activityC17567fKc, android.view.View view) {
        activityC17567fKc.OLrzqt(new EscapeInternalResult.Cancelled(true));
    }

    @Override // o.InterfaceC17595fLd
    public void fetchVPNInfo() {
        OLrzqt(new EscapeInternalResult.Cancelled(true));
    }

    @Override // o.InterfaceC17595fLd
    public void AEQbTJ(EscapeErrorCodes.EscapeRiskType escapeRiskType) {
        if (escapeRiskType == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK) {
            gEmmrt().copydefault(true);
        }
        gEmmrt().fetchVPNInfo();
    }

    @Override // o.InterfaceC17595fLd
    public void AkhnZx() {
        AYXKKw().AEQbTJ();
    }

    public final void OLrzqt(EscapeInternalResult escapeInternalResult) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("set_owner_escape_result", escapeInternalResult);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    public final void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String chainName;
        java.util.List<fLJ> list = this.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            fLJ flj = (fLJ) obj;
            fLD fld = new fLD(flj.AEQbTJ(), flj.copydefault(), flj.KWHzl(), interfaceC9738bbJ.EZpvd(flj.KWHzl()));
            djBIcL().KWHzl(new fLJ(fld.copydefault(), fld.EZpvd(), fld.OLrzqt(), fld.KWHzl(), true, true), i);
            arrayList.add(fld);
            i++;
        }
        gEmmrt().KWHzl(djBIcL().EZpvd());
        gEmmrt().OLrzqt(true);
        gEmmrt().copydefault(interfaceC9738bbJ.DbNXlk());
        AbstractC17013eul abstractC17013eul = this.AEQbTJ;
        java.lang.String str = "";
        if (abstractC17013eul == null) {
            Intrinsics.gEmmrt("");
            abstractC17013eul = null;
        }
        C52794wYp c52794wYp = abstractC17013eul.copydefault;
        EscapeSignAddressData escapeSignAddressDataKWHzl = gEmmrt().KWHzl();
        if (escapeSignAddressDataKWHzl != null && (chainName = escapeSignAddressDataKWHzl.getChainName()) != null) {
            str = chainName;
        }
        c52794wYp.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.flagMapping, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("network", str))));
        c52794wYp.setEnabled(true);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    public static final ViewModelProvider.Factory EZpvd() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fLT.class), new Function1() { // from class: o.fKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17567fKc.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final void EZpvd(ActivityC17567fKc activityC17567fKc, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        PasskeyAuthenticateRequest passkeyAuthenticateRequestOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("result_data_cedefi_sign_escape_transaction", InternalEscapeTransactionResult.class);
        } else {
            parcelable = bundle.getParcelable("result_data_cedefi_sign_escape_transaction");
        }
        java.lang.Object obj = (InternalEscapeTransactionResult) parcelable;
        if (obj == null) {
            obj = InternalEscapeTransactionResult.Cancelled.copydefault;
        }
        if (obj instanceof InternalEscapeTransactionResult.Success) {
            java.lang.String strGEmmrt = activityC17567fKc.gEmmrt().gEmmrt();
            if (strGEmmrt == null || (passkeyAuthenticateRequestOLrzqt = activityC17567fKc.gEmmrt().OLrzqt()) == null) {
                return;
            }
            activityC17567fKc.gEmmrt().OLrzqt(activityC17567fKc.gEmmrt().EZpvd(), strGEmmrt, passkeyAuthenticateRequestOLrzqt, ((InternalEscapeTransactionResult.Success) obj).AEQbTJ());
            return;
        }
        if (obj instanceof InternalEscapeTransactionResult.Failed) {
            java.lang.String strKWHzl = ((InternalEscapeTransactionResult.Failed) obj).KWHzl();
            if (strKWHzl != null) {
                C55326xho.toastWithFailedIcon$default(strKWHzl, 0, 1, (java.lang.Object) null);
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd(obj, InternalEscapeTransactionResult.Cancelled.copydefault)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.fKW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fKW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fKW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fKW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
