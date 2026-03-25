package o;

import android.media.AudioAttributes;
import android.os.Build;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletDetailActivity$observeDetailInfo$1;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel.RecoverPassKeyWalletDetailViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC17625fMg extends fLV implements InterfaceC49363unD {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public AbstractC17029evA djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public C43316rmw valueOf;

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

    /* JADX INFO: renamed from: o.fMg$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public ActivityC17625fMg() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(RecoverPassKeyWalletDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletDetailActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.fLV.AEQbTJ()V */
    public final RecoverPassKeyWalletDetailViewModel AEQbTJ() {
        return (RecoverPassKeyWalletDetailViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: renamed from: o.fMg$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends ActivityResultContract<Unit, EmailRecoveryResult> {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC17625fMg.class);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public EmailRecoveryResult parseResult(int i, android.content.Intent intent) {
            android.os.Parcelable parcelableExtra;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("recover_detail_result", EmailRecoveryResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("recover_detail_result");
                }
                EmailRecoveryResult emailRecoveryResult = (EmailRecoveryResult) parcelableExtra;
                if (emailRecoveryResult != null) {
                    return emailRecoveryResult;
                }
            }
            return EmailRecoveryResult.Cancelled.KWHzl;
        }
    }

    @Override // o.fLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        AbstractC17029evA abstractC17029evAKWHzl = AbstractC17029evA.KWHzl(getLayoutInflater());
        this.djBIcL = abstractC17029evAKWHzl;
        if (abstractC17029evAKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evAKWHzl = null;
        }
        setContentView(abstractC17029evAKWHzl.getRoot());
        C32866mlf.onEvent$default("Wallet_Recovery_Email_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AYXKKw();
        gEmmrt();
        AEQbTJ().KWHzl();
    }

    private final void AYXKKw() {
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        AppCompatImageView appCompatImageView = abstractC17029evA.djBIcL;
        AbstractC17029evA abstractC17029evA2 = abstractC17029evA;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this, abstractC17029evA2));
        AppCompatImageView appCompatImageView2 = abstractC17029evA.AYXKKw;
        appCompatImageView2.setOnClickListener(new Application(appCompatImageView2, 1000L, this, abstractC17029evA2));
        C52794wYp c52794wYp = abstractC17029evA.EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        djBIcL();
        copydefault(false, "");
        pUU.KWHzl(getTAG(), "onCreate");
    }

    private final void djBIcL() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(C17631fMm.class, new C17623fMe());
        this.valueOf = c43316rmw;
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        C43316rmw c43316rmw2 = null;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        RecyclerView recyclerView = abstractC17029evA.valueOf;
        C43316rmw c43316rmw3 = this.valueOf;
        if (c43316rmw3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c43316rmw2 = c43316rmw3;
        }
        recyclerView.setAdapter(c43316rmw2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public final void copydefault(java.lang.CharSequence charSequence) {
        valueOf();
        java.lang.Object systemService = getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, charSequence));
        }
        java.lang.String string = getString(C13754dXa.FragmentManager.gvFztT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RecoverPassKeyWalletDetailActivity$observeDetailInfo$1(this, null), 3, null);
    }

    public final void OLrzqt(boolean z, java.lang.String str, C17628fMj c17628fMj) {
        java.lang.String string;
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        AbstractC17029evA abstractC17029evA2 = null;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        abstractC17029evA.fetchVPNInfo.setText(str);
        abstractC17029evA.iwGUEr.setText(c17628fMj.AEQbTJ());
        abstractC17029evA.fARcdN.setText(c17628fMj.OLrzqt());
        copydefault(z, str);
        AbstractC17029evA abstractC17029evA3 = this.djBIcL;
        if (abstractC17029evA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17029evA2 = abstractC17029evA3;
        }
        android.widget.TextView textView = abstractC17029evA2.AkhnZx;
        if (z) {
            string = getString(C13754dXa.FragmentManager.seuMaA);
        } else {
            string = getString(C13754dXa.FragmentManager.znKlvJ);
        }
        textView.setText(string);
    }

    /* JADX INFO: renamed from: o.fMg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC17625fMg EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC17625fMg activityC17625fMg) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC17625fMg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(EmailRecoveryResult.Success.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.fMg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AbstractC17029evA KWHzl;
        public final /* synthetic */ ActivityC17625fMg OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC17625fMg activityC17625fMg, AbstractC17029evA abstractC17029evA) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = activityC17625fMg;
            this.KWHzl = abstractC17029evA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault(this.KWHzl.fARcdN.getText());
            }
        }
    }

    /* JADX INFO: renamed from: o.fMg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC17625fMg AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ AbstractC17029evA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC17625fMg activityC17625fMg, AbstractC17029evA abstractC17029evA) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC17625fMg;
            this.copydefault = abstractC17029evA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.copydefault(this.copydefault.iwGUEr.getText());
            }
        }
    }

    public final void copydefault(boolean z, java.lang.String str) {
        java.lang.CharSequence string;
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        android.widget.TextView textView = abstractC17029evA.uzCIH;
        if (!z) {
            string = getString(C13754dXa.FragmentManager.OHsvZP);
            Intrinsics.copydefault(string);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) getString(C13754dXa.FragmentManager.getConnectivityMgr));
            spannableStringBuilder.append((java.lang.CharSequence) "\n");
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            string = new android.text.SpannedString(spannableStringBuilder);
        }
        textView.setText(string);
    }

    public final void valueOf() {
        java.lang.Object systemService = getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            android.os.Vibrator vibrator2 = vibrator.hasVibrator() ? vibrator : null;
            if (vibrator2 != null) {
                vibrator2.vibrate(100L, new AudioAttributes.Builder().build());
            }
        }
    }

    public final void AEQbTJ(EmailRecoveryResult emailRecoveryResult) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("recover_detail_result", emailRecoveryResult);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        AbstractC17029evA abstractC17029evA2 = null;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        abstractC17029evA.copydefault.setVisibility(8);
        AbstractC17029evA abstractC17029evA3 = this.djBIcL;
        if (abstractC17029evA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA3 = null;
        }
        abstractC17029evA3.values.setVisibility(8);
        AbstractC17029evA abstractC17029evA4 = this.djBIcL;
        if (abstractC17029evA4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA4 = null;
        }
        abstractC17029evA4.EZpvd.setVisibility(8);
        AbstractC17029evA abstractC17029evA5 = this.djBIcL;
        if (abstractC17029evA5 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA5 = null;
        }
        abstractC17029evA5.AhwBna.setVisibility(0);
        AbstractC17029evA abstractC17029evA6 = this.djBIcL;
        if (abstractC17029evA6 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA6 = null;
        }
        abstractC17029evA6.AhwBna.setAnimation(C52761wXj.PendingIntent.values);
        AbstractC17029evA abstractC17029evA7 = this.djBIcL;
        if (abstractC17029evA7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17029evA2 = abstractC17029evA7;
        }
        abstractC17029evA2.AhwBna.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        AbstractC17029evA abstractC17029evA2 = null;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        abstractC17029evA.values.setVisibility(0);
        AbstractC17029evA abstractC17029evA3 = this.djBIcL;
        if (abstractC17029evA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA3 = null;
        }
        abstractC17029evA3.EZpvd.setVisibility(0);
        AbstractC17029evA abstractC17029evA4 = this.djBIcL;
        if (abstractC17029evA4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA4 = null;
        }
        abstractC17029evA4.copydefault.setVisibility(8);
        AbstractC17029evA abstractC17029evA5 = this.djBIcL;
        if (abstractC17029evA5 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA5 = null;
        }
        abstractC17029evA5.AhwBna.setVisibility(8);
        AbstractC17029evA abstractC17029evA6 = this.djBIcL;
        if (abstractC17029evA6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17029evA2 = abstractC17029evA6;
        }
        abstractC17029evA2.AhwBna.cancelAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        AbstractC17029evA abstractC17029evA = this.djBIcL;
        AbstractC17029evA abstractC17029evA2 = null;
        if (abstractC17029evA == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA = null;
        }
        abstractC17029evA.AhwBna.setVisibility(8);
        AbstractC17029evA abstractC17029evA3 = this.djBIcL;
        if (abstractC17029evA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17029evA3 = null;
        }
        abstractC17029evA3.AhwBna.cancelAnimation();
        AbstractC17029evA abstractC17029evA4 = this.djBIcL;
        if (abstractC17029evA4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17029evA2 = abstractC17029evA4;
        }
        C55173xeu c55173xeu = abstractC17029evA2.copydefault;
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
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17625fMg.EZpvd(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(ActivityC17625fMg activityC17625fMg, android.view.View view) {
        activityC17625fMg.AEQbTJ().KWHzl();
    }

    @Override // o.fLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fLV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
