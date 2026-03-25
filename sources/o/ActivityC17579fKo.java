package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeInternalResult;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletSetAddressActivity$observeUIData$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignInput;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletSetAddressViewModel;
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
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.fKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fKo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17579fKo extends fKY implements InterfaceC49363unD {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C17012euk AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final TaskDescription KWHzl;
    public final ActivityResultLauncher<EscapeSignInput> OLrzqt;
    public C43316rmw copydefault;

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

    public ActivityC17579fKo() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(EscapePassKeyWalletSetAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletSetAddressActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletSetAddressActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletSetAddressActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<EscapeSignInput> activityResultLauncherRegisterForActivityResult = registerForActivityResult(fKK.Activity.OLrzqt, new ActivityResultCallback() { // from class: o.fKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17579fKo.EZpvd(this.copydefault, (EscapeInternalResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.KWHzl = new TaskDescription();
    }

    /* JADX INFO: renamed from: o.fKo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fKo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.fKo$Application */
    public static final class Application extends ActivityResultContract<Unit, EscapeInternalResult> {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC17579fKo.class);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public EscapeInternalResult parseResult(int i, android.content.Intent intent) {
            android.os.Parcelable parcelableExtra;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("set_address_escape_result", EscapeInternalResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("set_address_escape_result");
                }
                EscapeInternalResult escapeInternalResult = (EscapeInternalResult) parcelableExtra;
                if (escapeInternalResult != null) {
                    return escapeInternalResult;
                }
            }
            return new EscapeInternalResult.Cancelled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EscapePassKeyWalletSetAddressViewModel isConnected() {
        return (EscapePassKeyWalletSetAddressViewModel) this.AhwBna.getValue();
    }

    public static final void EZpvd(ActivityC17579fKo activityC17579fKo, EscapeInternalResult escapeInternalResult) {
        if (escapeInternalResult instanceof EscapeInternalResult.Success) {
            activityC17579fKo.KWHzl(escapeInternalResult);
        } else {
            if (!(escapeInternalResult instanceof EscapeInternalResult.Cancelled)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((EscapeInternalResult.Cancelled) escapeInternalResult).KWHzl()) {
                activityC17579fKo.KWHzl(new EscapeInternalResult.Cancelled(true));
            }
        }
    }

    /* JADX INFO: renamed from: o.fKo$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildLayoutPosition(view) == 0) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, C55298xhM.dp2px$default(24.0f, null, 1, null), 0, 0);
            }
        }
    }

    @Override // o.fKY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        C17012euk c17012eukCopydefault = C17012euk.copydefault(getLayoutInflater());
        this.AEQbTJ = c17012eukCopydefault;
        if (c17012eukCopydefault == null) {
            Intrinsics.gEmmrt("");
            c17012eukCopydefault = null;
        }
        setContentView(c17012eukCopydefault.getRoot());
        C32866mlf.onEvent$default("Wallet_Release_Address_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AuCTel();
        AYXKKw();
        valueOf();
        djBIcL();
        fARcdN();
        isConnected().KWHzl();
    }

    private final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletSetAddressActivity$observeUIData$1(this, null), 3, null);
    }

    public final void AYXKKw() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(fLJ.class, new C17615fLx(new Function2() { // from class: o.fKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC17579fKo.OLrzqt(this.KWHzl, (fLJ) obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        this.copydefault = c43316rmw;
        C17012euk c17012euk = this.AEQbTJ;
        C43316rmw c43316rmw2 = null;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        RecyclerView recyclerView = c17012euk.valueOf;
        C43316rmw c43316rmw3 = this.copydefault;
        if (c43316rmw3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c43316rmw2 = c43316rmw3;
        }
        recyclerView.setAdapter(c43316rmw2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.removeItemDecoration(this.KWHzl);
        recyclerView.addItemDecoration(this.KWHzl);
    }

    public static final Unit OLrzqt(ActivityC17579fKo activityC17579fKo, fLJ flj, int i) {
        Intrinsics.checkNotNullParameter(flj, "");
        activityC17579fKo.isConnected().KWHzl(flj, i);
        activityC17579fKo.AhwBna();
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        EZpvd();
        KWHzl();
        gEmmrt();
    }

    public final void EZpvd() {
        C17012euk c17012euk = this.AEQbTJ;
        C17012euk c17012euk2 = null;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        c17012euk.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fKq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC17579fKo.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
        C17012euk c17012euk3 = this.AEQbTJ;
        if (c17012euk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17012euk2 = c17012euk3;
        }
        c17012euk2.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.fKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17579fKo.KWHzl(this.KWHzl, view);
            }
        });
    }

    public static final void KWHzl(ActivityC17579fKo activityC17579fKo, android.widget.CompoundButton compoundButton, boolean z) {
        activityC17579fKo.AhwBna();
    }

    /* JADX INFO: renamed from: o.fKo$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC17579fKo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC17579fKo activityC17579fKo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = activityC17579fKo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.launch(new EscapeSignInput(this.KWHzl.isConnected().EZpvd(), false));
            }
        }
    }

    public static final void KWHzl(ActivityC17579fKo activityC17579fKo, android.view.View view) {
        C17012euk c17012euk = activityC17579fKo.AEQbTJ;
        C17012euk c17012euk2 = null;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        wYK wyk = c17012euk.KWHzl;
        C17012euk c17012euk3 = activityC17579fKo.AEQbTJ;
        if (c17012euk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17012euk2 = c17012euk3;
        }
        wyk.setChecked(!c17012euk2.KWHzl.isChecked());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        boolean z;
        C43316rmw c43316rmw = this.copydefault;
        C17012euk c17012euk = null;
        if (c43316rmw == null) {
            Intrinsics.gEmmrt("");
            c43316rmw = null;
        }
        java.util.List<?> items = c43316rmw.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (obj instanceof fLJ) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            fLJ flj = (fLJ) obj2;
            if (!flj.AYXKKw() || !flj.OLrzqt()) {
                arrayList2.add(obj2);
            }
        }
        C17012euk c17012euk2 = this.AEQbTJ;
        if (c17012euk2 == null) {
            Intrinsics.gEmmrt("");
            c17012euk2 = null;
        }
        C52794wYp c52794wYp = c17012euk2.copydefault;
        if (arrayList2.isEmpty()) {
            C17012euk c17012euk3 = this.AEQbTJ;
            if (c17012euk3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17012euk = c17012euk3;
            }
            if (c17012euk.KWHzl.isChecked()) {
                z = true;
            }
        } else {
            z = false;
        }
        c52794wYp.setEnabled(z);
    }

    public final void KWHzl() {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        C52794wYp c52794wYp = c17012euk.copydefault;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    public final void gEmmrt() {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        OKReminder oKReminder = c17012euk.AYXKKw;
        java.lang.String string = getString(C13754dXa.FragmentManager.MediaControllerCompatTransportControlsApi21);
        Intrinsics.checkNotNullExpressionValue(string, "");
        oKReminder.setTitle(string);
        oKReminder.setMessage(getString(C13754dXa.FragmentManager.MediaControllerCompatTransportControls));
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        C17012euk c17012euk = this.AEQbTJ;
        C17012euk c17012euk2 = null;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        c17012euk.OLrzqt.setVisibility(8);
        C17012euk c17012euk3 = this.AEQbTJ;
        if (c17012euk3 == null) {
            Intrinsics.gEmmrt("");
            c17012euk3 = null;
        }
        c17012euk3.AhwBna.setVisibility(8);
        C17012euk c17012euk4 = this.AEQbTJ;
        if (c17012euk4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17012euk2 = c17012euk4;
        }
        C55113xdn c55113xdn = c17012euk2.djBIcL;
        c55113xdn.setVisibility(0);
        c55113xdn.setAnimation(C52761wXj.PendingIntent.values);
        c55113xdn.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        C17012euk c17012euk = this.AEQbTJ;
        C17012euk c17012euk2 = null;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        c17012euk.OLrzqt.setVisibility(0);
        C17012euk c17012euk3 = this.AEQbTJ;
        if (c17012euk3 == null) {
            Intrinsics.gEmmrt("");
            c17012euk3 = null;
        }
        c17012euk3.EZpvd.setVisibility(0);
        C17012euk c17012euk4 = this.AEQbTJ;
        if (c17012euk4 == null) {
            Intrinsics.gEmmrt("");
            c17012euk4 = null;
        }
        C55113xdn c55113xdn = c17012euk4.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        C17012euk c17012euk5 = this.AEQbTJ;
        if (c17012euk5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17012euk2 = c17012euk5;
        }
        c17012euk2.AhwBna.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        C17012euk c17012euk = this.AEQbTJ;
        C17012euk c17012euk2 = null;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        C55113xdn c55113xdn = c17012euk.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        C17012euk c17012euk3 = this.AEQbTJ;
        if (c17012euk3 == null) {
            Intrinsics.gEmmrt("");
            c17012euk3 = null;
        }
        c17012euk3.OLrzqt.setVisibility(8);
        C17012euk c17012euk4 = this.AEQbTJ;
        if (c17012euk4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17012euk2 = c17012euk4;
        }
        C55173xeu c55173xeu = c17012euk2.AhwBna;
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
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17579fKo.valueOf(this.AEQbTJ, view);
            }
        });
    }

    public static final void valueOf(ActivityC17579fKo activityC17579fKo, android.view.View view) {
        activityC17579fKo.isConnected().KWHzl();
    }

    public final void valueOf() {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c17012euk.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.fKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC17579fKo.copydefault(this.AEQbTJ, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat copydefault(final ActivityC17579fKo activityC17579fKo, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        C17012euk c17012euk = null;
        if (i > 0) {
            C17012euk c17012euk2 = activityC17579fKo.AEQbTJ;
            if (c17012euk2 == null) {
                Intrinsics.gEmmrt("");
                c17012euk2 = null;
            }
            c17012euk2.EZpvd.setVisibility(8);
            activityC17579fKo.EZpvd(i);
            C17012euk c17012euk3 = activityC17579fKo.AEQbTJ;
            if (c17012euk3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17012euk = c17012euk3;
            }
            c17012euk.DbNXlk.postDelayed(new java.lang.Runnable() { // from class: o.fKu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17579fKo.AhwBna(this.OLrzqt);
                }
            }, 100L);
        } else {
            C17012euk c17012euk4 = activityC17579fKo.AEQbTJ;
            if (c17012euk4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17012euk = c17012euk4;
            }
            c17012euk.EZpvd.setVisibility(0);
            activityC17579fKo.AhwBna();
            activityC17579fKo.OLrzqt();
        }
        return windowInsetsCompat;
    }

    public static final void AhwBna(ActivityC17579fKo activityC17579fKo) {
        activityC17579fKo.AEQbTJ();
    }

    public final void djBIcL() {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        c17012euk.getRoot().getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: o.fKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                ActivityC17579fKo.KWHzl(this.EZpvd, view, view2);
            }
        });
    }

    public static final void KWHzl(final ActivityC17579fKo activityC17579fKo, android.view.View view, final android.view.View view2) {
        if (view2 instanceof android.widget.EditText) {
            C17012euk c17012euk = activityC17579fKo.AEQbTJ;
            if (c17012euk == null) {
                Intrinsics.gEmmrt("");
                c17012euk = null;
            }
            c17012euk.DbNXlk.post(new java.lang.Runnable() { // from class: o.fKx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17579fKo.djBIcL(this.EZpvd, view2);
                }
            });
        }
    }

    public static final void djBIcL(ActivityC17579fKo activityC17579fKo, android.view.View view) {
        activityC17579fKo.scrollToView(view);
    }

    public final void EZpvd(int i) {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        android.widget.Space space = c17012euk.isConnected;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        layoutParams.height = i;
        space.setLayoutParams(layoutParams);
        space.setVisibility(0);
    }

    public final void OLrzqt() {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        c17012euk.isConnected.setVisibility(8);
    }

    public final void AEQbTJ() {
        android.view.View currentFocus = getCurrentFocus();
        if (currentFocus instanceof android.widget.EditText) {
            scrollToView(currentFocus);
        }
    }

    public final void scrollToView(android.view.View view) {
        int iEZpvd = EZpvd(view);
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        c17012euk.DbNXlk.smoothScrollTo(0, iEZpvd);
    }

    public final int EZpvd(android.view.View view) {
        int top = 0;
        for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            C17012euk c17012euk = this.AEQbTJ;
            if (c17012euk == null) {
                Intrinsics.gEmmrt("");
                c17012euk = null;
            }
            if (Intrinsics.EZpvd(parent, c17012euk.DbNXlk)) {
                break;
            }
            if (parent instanceof android.view.View) {
                top += ((android.view.View) parent).getTop();
            }
        }
        return top - 200;
    }

    private final void KWHzl(EscapeInternalResult escapeInternalResult) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("set_address_escape_result", escapeInternalResult);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        C17012euk c17012euk = this.AEQbTJ;
        if (c17012euk == null) {
            Intrinsics.gEmmrt("");
            c17012euk = null;
        }
        C55113xdn c55113xdn = c17012euk.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(0);
        viewOnClickListenerC54939xaY.EZpvd(getString(C13754dXa.FragmentManager.requestExtraBinder));
        java.lang.String string = getString(C13754dXa.FragmentManager.DCJXGO);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17579fKo.gEmmrt(this.EZpvd, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(ActivityC17579fKo activityC17579fKo, android.view.View view) {
        activityC17579fKo.KWHzl(new EscapeInternalResult.Cancelled(true));
    }

    @Override // o.fKY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fKY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fKY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fKY, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
