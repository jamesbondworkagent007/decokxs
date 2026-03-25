package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeInternalResult;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.model.EscapeErrorCodes;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$observeUIState$2;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$observeUIState$3;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$observeUIState$4;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.RiskControlDialogCallback;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignInput;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalEscapeTransactionResult;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionInput;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
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
import o.C52761wXj;
import o.C55284xgz;
import o.C9678baC;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fKK extends AbstractActivityC17593fLb implements InterfaceC49363unD, RiskControlDialogCallback {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm EZpvd;
    public AbstractC17006eue copydefault;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fKH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fKK.KWHzl();
        }
    });
    public final ActionBar OLrzqt = new ActionBar();

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

    public fKK() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(fLT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fKK.AEQbTJ();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$special$$inlined$viewModels$default$3
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

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fKK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class Activity extends ActivityResultContract<EscapeSignInput, EscapeInternalResult> {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull EscapeSignInput escapeSignInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(escapeSignInput, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fKK.class);
            intent.putParcelableArrayListExtra("escape_confirm_address_data", escapeSignInput.getSignDataList());
            intent.putExtra("escape_confirm_bound_web3_wallet", escapeSignInput.getBoundWebWallet());
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public EscapeInternalResult parseResult(int i, android.content.Intent intent) {
            android.os.Parcelable parcelableExtra;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("sign_escape_result", EscapeInternalResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("sign_escape_result");
                }
                EscapeInternalResult escapeInternalResult = (EscapeInternalResult) parcelableExtra;
                if (escapeInternalResult != null) {
                    return escapeInternalResult;
                }
            }
            return new EscapeInternalResult.Cancelled(false);
        }
    }

    private final C43316rmw AkhnZx() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    public static final C43316rmw KWHzl() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(EscapeSignAddressData.class, new C17613fLv());
        return c43316rmw;
    }

    public static final class ActionBar extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            rect.set(0, C55298xhM.dp2px$default(16.0f, null, 1, null), 0, 0);
        }
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

    @Override // o.AbstractActivityC17593fLb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        AbstractC17006eue abstractC17006eueAEQbTJ = AbstractC17006eue.AEQbTJ(getLayoutInflater());
        this.copydefault = abstractC17006eueAEQbTJ;
        if (abstractC17006eueAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC17006eueAEQbTJ = null;
        }
        setContentView(abstractC17006eueAEQbTJ.getRoot());
        AhwBna();
        values();
        fetchVPNInfo();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fKK.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(fKK fkk) {
        rVN.reportFullyDrawn$default((android.app.Activity) fkk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AhwBna() {
        C32866mlf.onEvent$default("Wallet_Release_ConfirmEscape_View", (TrackChannel[]) null, new Function1() { // from class: o.fKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fKK.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(fKK fkk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.util.ArrayList parcelableArrayListExtra = fkk.getIntent().getParcelableArrayListExtra("escape_confirm_address_data");
        eventParamsList.put("chain_count", C33129mqd.gEmmrt(parcelableArrayListExtra != null ? java.lang.Integer.valueOf(parcelableArrayListExtra.size()) : null), false);
        return Unit.INSTANCE;
    }

    private final void values() {
        getSupportFragmentManager().setFragmentResultListener("request_key_cedefi_sign_escape_transaction", this, new FragmentResultListener() { // from class: o.fKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                fKK.copydefault(this.EZpvd, str, bundle);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePasskeyWalletSignActivity$observeUIState$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePasskeyWalletSignActivity$observeUIState$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePasskeyWalletSignActivity$observeUIState$4(this, null), 3, null);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fKK AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fKK fkk) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = fkk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Wallet_Release_Passkey_View", (TrackChannel[]) null, this.AEQbTJ.new StateListAnimator(), 1, (java.lang.Object) null);
                this.AEQbTJ.gEmmrt().fetchVPNInfo();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ fKK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, fKK fkk) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = fkk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ fKK OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, fKK fkk) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = fkk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Wallet_Release_ConfirmEscape_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.gEmmrt().AEQbTJ();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(PasskeyAuthenticateRequest passkeyAuthenticateRequest) {
        EscapeSignAddressData escapeSignAddressDataKWHzl = gEmmrt().KWHzl();
        java.lang.String strGEmmrt = escapeSignAddressDataKWHzl != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(escapeSignAddressDataKWHzl.getChainIndex())) : null;
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            pUU.copydefault("EscapePasskeyWalletSignActivity", "openSignPage failed: invalid chainIndex");
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(int i) {
        int size = gEmmrt().AYXKKw().size();
        AbstractC17006eue abstractC17006eue = this.copydefault;
        AbstractC17006eue abstractC17006eue2 = null;
        if (abstractC17006eue == null) {
            Intrinsics.gEmmrt("");
            abstractC17006eue = null;
        }
        abstractC17006eue.AYXKKw.setText(OLrzqt(i, size));
        if (i >= 1) {
            AkhnZx().notifyItemChanged(i - 1);
        }
        if (i < size) {
            AbstractC17006eue abstractC17006eue3 = this.copydefault;
            if (abstractC17006eue3 == null) {
                Intrinsics.gEmmrt("");
                abstractC17006eue3 = null;
            }
            abstractC17006eue3.OLrzqt.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.binderDied, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("current", java.lang.Integer.valueOf(i + 1)), C56390yDp.OLrzqt("total", java.lang.Integer.valueOf(size)))));
        }
        if (i == size) {
            AbstractC17006eue abstractC17006eue4 = this.copydefault;
            if (abstractC17006eue4 == null) {
                Intrinsics.gEmmrt("");
                abstractC17006eue4 = null;
            }
            abstractC17006eue4.OLrzqt.setOKDSType(257);
            AbstractC17006eue abstractC17006eue5 = this.copydefault;
            if (abstractC17006eue5 == null) {
                Intrinsics.gEmmrt("");
                abstractC17006eue5 = null;
            }
            abstractC17006eue5.OLrzqt.setText(getString(C13754dXa.FragmentManager.getTransportControls));
            AbstractC17006eue abstractC17006eue6 = this.copydefault;
            if (abstractC17006eue6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC17006eue2 = abstractC17006eue6;
            }
            C52794wYp c52794wYp = abstractC17006eue2.OLrzqt;
            c52794wYp.setOnClickListener(new PendingIntent(c52794wYp, 1000L, this));
        }
    }

    private final void fetchVPNInfo() {
        int size = gEmmrt().AYXKKw().size();
        AbstractC17006eue abstractC17006eue = this.copydefault;
        if (abstractC17006eue == null) {
            Intrinsics.gEmmrt("");
            abstractC17006eue = null;
        }
        RecyclerView recyclerView = abstractC17006eue.gEmmrt;
        recyclerView.setAdapter(AkhnZx());
        recyclerView.removeItemDecoration(this.OLrzqt);
        recyclerView.addItemDecoration(this.OLrzqt);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C52794wYp c52794wYp = abstractC17006eue.OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        abstractC17006eue.AYXKKw.setText(OLrzqt(0, size));
        abstractC17006eue.OLrzqt.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.binderDied, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("current", 1), C56390yDp.OLrzqt("total", java.lang.Integer.valueOf(size)))));
        C52794wYp c52794wYp2 = abstractC17006eue.KWHzl;
        c52794wYp2.setOnClickListener(new Dialog(c52794wYp2, 1000L, this));
        C33064mpR.OLrzqt(AkhnZx(), (java.util.List<? extends java.lang.Object>) gEmmrt().AYXKKw());
        AkhnZx().notifyDataSetChanged();
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("stage", java.lang.String.valueOf(fKK.this.gEmmrt().EZpvd() + 1), true);
            EscapeSignAddressData escapeSignAddressDataKWHzl = fKK.this.gEmmrt().KWHzl();
            eventParamsList.put("chain_name", C33129mqd.gEmmrt(escapeSignAddressDataKWHzl != null ? escapeSignAddressDataKWHzl.getChainName() : null), false);
        }
    }

    public final java.lang.CharSequence OLrzqt(int i, int i2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(java.lang.String.valueOf(i));
        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder2.length(), 17);
        android.text.SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder2);
        android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder("/" + i2);
        spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder3.length(), 17);
        android.text.SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((java.lang.CharSequence) spannableStringBuilder3);
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend2, "");
        return spannableStringBuilderAppend2;
    }

    @Override // com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.RiskControlDialogCallback
    public void KWHzl(@NotNull RiskControlDialogCallback.BackType backType) {
        Intrinsics.checkNotNullParameter(backType, "");
        KWHzl(new EscapeInternalResult.Cancelled(backType == RiskControlDialogCallback.BackType.BACK_TO_HOME));
    }

    @Override // com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.RiskControlDialogCallback
    public void OLrzqt(EscapeErrorCodes.EscapeRiskType escapeRiskType) {
        if (escapeRiskType == EscapeErrorCodes.EscapeRiskType.ADDRESS_RISK) {
            gEmmrt().copydefault(true);
        }
        gEmmrt().fetchVPNInfo();
    }

    private final void KWHzl(EscapeInternalResult escapeInternalResult) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sign_escape_result", escapeInternalResult);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        EscapeInternalResult cancelled;
        android.os.Parcelable parcelableExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 200001 && i2 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("escape_status_result", EscapeInternalResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("escape_status_result");
                }
                cancelled = (EscapeInternalResult) parcelableExtra;
                if (cancelled == null) {
                }
            } else {
                cancelled = new EscapeInternalResult.Cancelled(false);
            }
            if (cancelled instanceof EscapeInternalResult.Success) {
                KWHzl(cancelled);
            }
        }
    }

    private final void KWHzl(java.lang.String str) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        AbstractC17006eue abstractC17006eue = this.copydefault;
        AbstractC17006eue abstractC17006eue2 = null;
        if (abstractC17006eue == null) {
            Intrinsics.gEmmrt("");
            abstractC17006eue = null;
        }
        android.view.View root = abstractC17006eue.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(root, str);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.AEQbTJ(str);
            AbstractC17006eue abstractC17006eue3 = this.copydefault;
            if (abstractC17006eue3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC17006eue2 = abstractC17006eue3;
            }
            c55284xgzKWHzl.AEQbTJ(abstractC17006eue2.OLrzqt);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    public static final ViewModelProvider.Factory AEQbTJ() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fLT.class), new Function1() { // from class: o.fKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fKK.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final void copydefault(fKK fkk, java.lang.String str, android.os.Bundle bundle) {
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
            java.lang.String strGEmmrt = fkk.gEmmrt().gEmmrt();
            if (strGEmmrt == null || (passkeyAuthenticateRequestOLrzqt = fkk.gEmmrt().OLrzqt()) == null) {
                return;
            }
            int i = C13754dXa.FragmentManager.MediaControllerCompatApi21Callback;
            EscapeSignAddressData escapeSignAddressDataKWHzl = fkk.gEmmrt().KWHzl();
            fkk.KWHzl(C33069mpW.KWHzl(fkk, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", C33129mqd.gEmmrt(escapeSignAddressDataKWHzl != null ? escapeSignAddressDataKWHzl.getChainName() : null)))));
            fkk.gEmmrt().OLrzqt(fkk.gEmmrt().EZpvd(), strGEmmrt, passkeyAuthenticateRequestOLrzqt, ((InternalEscapeTransactionResult.Success) obj).AEQbTJ());
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

    @Override // o.AbstractActivityC17593fLb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17593fLb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17593fLb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17593fLb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
