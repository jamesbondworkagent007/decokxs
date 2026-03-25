package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationError;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$1;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$2;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$3;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel.RecoverPassKeyWalletAccessViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.uilab.reminder.OKReminder;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.ActivityC17625fMg;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fLW extends fLY implements InterfaceC49363unD {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final ActivityResultLauncher<Unit> AYXKKw;
    public final ActivityResultLauncher<Unit> AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public AbstractC17078evx gEmmrt;

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

    public fLW() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(RecoverPassKeyWalletAccessViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).gEmmrt(), new ActivityResultCallback() { // from class: o.fLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fLW.OLrzqt(this.copydefault, (PasskeyRecoverState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(ActivityC17625fMg.ActionBar.OLrzqt, new ActivityResultCallback() { // from class: o.fMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fLW.OLrzqt(this.copydefault, (EmailRecoveryResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fLW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final class Application extends ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> {
        public static final Application EZpvd = new Application();

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull EmailRecoveryInput emailRecoveryInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(emailRecoveryInput, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fLW.class);
            intent.putExtra("email_recovery_input", emailRecoveryInput);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public EmailRecoveryResult parseResult(int i, android.content.Intent intent) {
            android.os.Parcelable parcelableExtra;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("recover_access_result", EmailRecoveryResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("recover_access_result");
                }
                EmailRecoveryResult emailRecoveryResult = (EmailRecoveryResult) parcelableExtra;
                if (emailRecoveryResult != null) {
                    return emailRecoveryResult;
                }
            }
            return EmailRecoveryResult.Cancelled.KWHzl;
        }
    }

    public final RecoverPassKeyWalletAccessViewModel AYXKKw() {
        return (RecoverPassKeyWalletAccessViewModel) this.djBIcL.getValue();
    }

    public static final void OLrzqt(fLW flw, PasskeyRecoverState passkeyRecoverState) {
        if (Intrinsics.EZpvd(passkeyRecoverState, PasskeyRecoverState.Close.OLrzqt)) {
            pUU.copydefault("RecoverPassKeyWalletAccessActivity", "recoverPasskeyLauncher close");
            return;
        }
        if (Intrinsics.EZpvd(passkeyRecoverState, PasskeyRecoverState.ResetInProgress.AEQbTJ)) {
            pUU.copydefault("RecoverPassKeyWalletAccessActivity", "recoverPasskeyLauncher ResetInProgress");
            flw.KWHzl(EmailRecoveryResult.ResetInProgress.AEQbTJ);
        } else {
            if (!Intrinsics.EZpvd(passkeyRecoverState, PasskeyRecoverState.Success.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.copydefault("RecoverPassKeyWalletAccessActivity", "recoverPasskeyLauncher Success");
            flw.AYXKKw.launch(Unit.INSTANCE);
        }
    }

    public static final void OLrzqt(fLW flw, EmailRecoveryResult emailRecoveryResult) {
        if (Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.Cancelled.KWHzl)) {
            pUU.copydefault("RecoverPassKeyWalletAccessActivity", "recoveryDetailLauncher Cancelled");
            return;
        }
        EmailRecoveryResult.ResetInProgress resetInProgress = EmailRecoveryResult.ResetInProgress.AEQbTJ;
        if (Intrinsics.EZpvd(emailRecoveryResult, resetInProgress)) {
            pUU.copydefault("RecoverPassKeyWalletAccessActivity", "recoveryDetailLauncher ResetInProgress");
            flw.KWHzl(resetInProgress);
            return;
        }
        EmailRecoveryResult.Success success = EmailRecoveryResult.Success.OLrzqt;
        if (!Intrinsics.EZpvd(emailRecoveryResult, success)) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.copydefault("RecoverPassKeyWalletAccessActivity", "recoveryDetailLauncher Success");
        flw.KWHzl(success);
    }

    @Override // o.fLY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        AbstractC17078evx abstractC17078evxKWHzl = AbstractC17078evx.KWHzl(getLayoutInflater());
        this.gEmmrt = abstractC17078evxKWHzl;
        if (abstractC17078evxKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evxKWHzl = null;
        }
        setContentView(abstractC17078evxKWHzl.getRoot());
        C32866mlf.onEvent$default("Wallet_Recovery_Start_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AkhnZx();
        valueOf();
        AYXKKw().AhwBna();
    }

    private final void AkhnZx() {
        AbstractC17078evx abstractC17078evx = this.gEmmrt;
        if (abstractC17078evx == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx = null;
        }
        C52794wYp c52794wYp = abstractC17078evx.KWHzl;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RecoverPassKeyWalletAccessActivity$observeState$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RecoverPassKeyWalletAccessActivity$observeState$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RecoverPassKeyWalletAccessActivity$observeState$3(this, null), 3, null);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ fLW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fLW flw) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = flw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Wallet_Recovery_Start_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.copydefault.AYXKKw().AEQbTJ();
            }
        }
    }

    public final void OLrzqt() {
        InterfaceC9916bec interfaceC9916bec = (InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        interfaceC9916bec.AEQbTJ(supportFragmentManager, this, new PasskeyOperationInput(PasskeyOperationSourceType.FROM_CEDEFI_RECOVER, PasskeyOperationSourceSubType.DIRECT, PasskeyOperationType.REGISTER_PASSKEY, true, (java.lang.String) null, 16, (DefaultConstructorMarker) null), new Function1() { // from class: o.fMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fLW.KWHzl(this.copydefault, (PasskeyOperationResult) obj);
            }
        });
    }

    public static final Unit KWHzl(fLW flw, PasskeyOperationResult passkeyOperationResult) {
        Intrinsics.checkNotNullParameter(passkeyOperationResult, "");
        if (passkeyOperationResult instanceof PasskeyOperationResult.Success) {
            pUU.copydefault(flw.getTAG(), "createPasskey in recover process success");
            flw.AYXKKw.launch(Unit.INSTANCE);
        } else if (passkeyOperationResult instanceof PasskeyOperationResult.Failed) {
            PasskeyOperationError passkeyOperationErrorAEQbTJ = ((PasskeyOperationResult.Failed) passkeyOperationResult).AEQbTJ();
            pUU.copydefault(flw.getTAG(), "createPasskey in recover process failed: " + passkeyOperationErrorAEQbTJ);
            if (passkeyOperationErrorAEQbTJ instanceof PasskeyOperationError.Already) {
                flw.AYXKKw.launch(Unit.INSTANCE);
            } else if (!Intrinsics.EZpvd(passkeyOperationErrorAEQbTJ, PasskeyOperationError.AccountFrozen.KWHzl)) {
                if (passkeyOperationErrorAEQbTJ instanceof PasskeyOperationError.GeneralFailure) {
                    C55326xho.toast$default(((PasskeyOperationError.GeneralFailure) passkeyOperationErrorAEQbTJ).EZpvd().getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                } else if (!Intrinsics.EZpvd(passkeyOperationErrorAEQbTJ, PasskeyOperationError.NoValidPasskey.copydefault)) {
                    if (passkeyOperationErrorAEQbTJ instanceof PasskeyOperationError.PasskeyNetworkFailure) {
                        C55326xho.toast$default(((PasskeyOperationError.PasskeyNetworkFailure) passkeyOperationErrorAEQbTJ).copydefault().getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    } else if (passkeyOperationErrorAEQbTJ instanceof PasskeyOperationError.PasskeySdkError) {
                        java.lang.String message = ((PasskeyOperationError.PasskeySdkError) passkeyOperationErrorAEQbTJ).KWHzl().getMessage();
                        if (message != null) {
                            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                        }
                    } else if (!Intrinsics.EZpvd(passkeyOperationErrorAEQbTJ, PasskeyOperationError.ReachMaximum.KWHzl) && !Intrinsics.EZpvd(passkeyOperationErrorAEQbTJ, PasskeyOperationError.RiskControl.copydefault)) {
                        if (!(passkeyOperationErrorAEQbTJ instanceof PasskeyOperationError.WalletNetworkFailure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C55326xho.toast$default(((PasskeyOperationError.WalletNetworkFailure) passkeyOperationErrorAEQbTJ).KWHzl().getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    }
                }
            }
        } else if (!Intrinsics.EZpvd(passkeyOperationResult, PasskeyOperationResult.Cancelled.OLrzqt)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(EmailRecoveryResult emailRecoveryResult) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("recover_access_result", emailRecoveryResult);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    public final void djBIcL() {
        AbstractC17078evx abstractC17078evx = this.gEmmrt;
        if (abstractC17078evx == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx = null;
        }
        OKReminder oKReminder = abstractC17078evx.gEmmrt;
        oKReminder.setVisibility(0);
        java.lang.String string = getString(C13754dXa.FragmentManager.OeawrHOeawrH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        oKReminder.setTitle(string);
        oKReminder.setMessage(getString(C13754dXa.FragmentManager.QYNZmZ));
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
    }

    public final void gEmmrt() {
        AbstractC17078evx abstractC17078evx = this.gEmmrt;
        if (abstractC17078evx == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx = null;
        }
        OKReminder oKReminder = abstractC17078evx.copydefault;
        oKReminder.setVisibility(0);
        oKReminder.setMessage(getString(C13754dXa.FragmentManager.OeawrH));
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        AbstractC17078evx abstractC17078evx = this.gEmmrt;
        AbstractC17078evx abstractC17078evx2 = null;
        if (abstractC17078evx == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx = null;
        }
        abstractC17078evx.AYXKKw.setVisibility(8);
        AbstractC17078evx abstractC17078evx3 = this.gEmmrt;
        if (abstractC17078evx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx3 = null;
        }
        abstractC17078evx3.AhwBna.setVisibility(8);
        AbstractC17078evx abstractC17078evx4 = this.gEmmrt;
        if (abstractC17078evx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx4 = null;
        }
        abstractC17078evx4.OLrzqt.setVisibility(8);
        AbstractC17078evx abstractC17078evx5 = this.gEmmrt;
        if (abstractC17078evx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx5 = null;
        }
        abstractC17078evx5.KWHzl.setVisibility(8);
        AbstractC17078evx abstractC17078evx6 = this.gEmmrt;
        if (abstractC17078evx6 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx6 = null;
        }
        abstractC17078evx6.AEQbTJ.setVisibility(8);
        AbstractC17078evx abstractC17078evx7 = this.gEmmrt;
        if (abstractC17078evx7 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx7 = null;
        }
        abstractC17078evx7.gEmmrt.setVisibility(8);
        AbstractC17078evx abstractC17078evx8 = this.gEmmrt;
        if (abstractC17078evx8 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx8 = null;
        }
        abstractC17078evx8.copydefault.setVisibility(8);
        AbstractC17078evx abstractC17078evx9 = this.gEmmrt;
        if (abstractC17078evx9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17078evx2 = abstractC17078evx9;
        }
        C55113xdn c55113xdn = abstractC17078evx2.djBIcL;
        c55113xdn.setVisibility(0);
        c55113xdn.setAnimation(C52761wXj.PendingIntent.values);
        c55113xdn.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        AbstractC17078evx abstractC17078evx = this.gEmmrt;
        AbstractC17078evx abstractC17078evx2 = null;
        if (abstractC17078evx == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx = null;
        }
        abstractC17078evx.AYXKKw.setVisibility(0);
        AbstractC17078evx abstractC17078evx3 = this.gEmmrt;
        if (abstractC17078evx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx3 = null;
        }
        abstractC17078evx3.AhwBna.setVisibility(0);
        AbstractC17078evx abstractC17078evx4 = this.gEmmrt;
        if (abstractC17078evx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx4 = null;
        }
        abstractC17078evx4.OLrzqt.setVisibility(0);
        AbstractC17078evx abstractC17078evx5 = this.gEmmrt;
        if (abstractC17078evx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx5 = null;
        }
        abstractC17078evx5.KWHzl.setVisibility(0);
        AbstractC17078evx abstractC17078evx6 = this.gEmmrt;
        if (abstractC17078evx6 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx6 = null;
        }
        abstractC17078evx6.gEmmrt.setVisibility(8);
        AbstractC17078evx abstractC17078evx7 = this.gEmmrt;
        if (abstractC17078evx7 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx7 = null;
        }
        abstractC17078evx7.copydefault.setVisibility(8);
        AbstractC17078evx abstractC17078evx8 = this.gEmmrt;
        if (abstractC17078evx8 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx8 = null;
        }
        C55113xdn c55113xdn = abstractC17078evx8.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        AbstractC17078evx abstractC17078evx9 = this.gEmmrt;
        if (abstractC17078evx9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17078evx2 = abstractC17078evx9;
        }
        abstractC17078evx2.AEQbTJ.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        AbstractC17078evx abstractC17078evx = this.gEmmrt;
        AbstractC17078evx abstractC17078evx2 = null;
        if (abstractC17078evx == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx = null;
        }
        C55113xdn c55113xdn = abstractC17078evx.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        AbstractC17078evx abstractC17078evx3 = this.gEmmrt;
        if (abstractC17078evx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx3 = null;
        }
        abstractC17078evx3.AYXKKw.setVisibility(8);
        AbstractC17078evx abstractC17078evx4 = this.gEmmrt;
        if (abstractC17078evx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx4 = null;
        }
        abstractC17078evx4.AhwBna.setVisibility(8);
        AbstractC17078evx abstractC17078evx5 = this.gEmmrt;
        if (abstractC17078evx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx5 = null;
        }
        abstractC17078evx5.OLrzqt.setVisibility(8);
        AbstractC17078evx abstractC17078evx6 = this.gEmmrt;
        if (abstractC17078evx6 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx6 = null;
        }
        abstractC17078evx6.KWHzl.setVisibility(8);
        AbstractC17078evx abstractC17078evx7 = this.gEmmrt;
        if (abstractC17078evx7 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx7 = null;
        }
        abstractC17078evx7.gEmmrt.setVisibility(8);
        AbstractC17078evx abstractC17078evx8 = this.gEmmrt;
        if (abstractC17078evx8 == null) {
            Intrinsics.gEmmrt("");
            abstractC17078evx8 = null;
        }
        abstractC17078evx8.copydefault.setVisibility(8);
        AbstractC17078evx abstractC17078evx9 = this.gEmmrt;
        if (abstractC17078evx9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17078evx2 = abstractC17078evx9;
        }
        C55173xeu c55173xeu = abstractC17078evx2.AEQbTJ;
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
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fLW.EZpvd(this.AEQbTJ, view);
            }
        });
    }

    public static final void EZpvd(fLW flw, android.view.View view) {
        flw.AYXKKw().AhwBna();
    }

    @Override // o.fLY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fLY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fLY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fLY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
