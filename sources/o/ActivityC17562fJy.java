package o;

import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailSetResult;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import o.C7343ahz;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17562fJy extends AbstractActivityC33041mov implements InterfaceC49363unD {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C59534zip AEQbTJ = new C59534zip();
    public final ActivityResultLauncher<java.lang.String> EZpvd;
    public C16245egL KWHzl;
    public final InterfaceC56387yDm OLrzqt;

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

    public ActivityC17562fJy() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(fJL.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.email.ui.AddOrUpdateEmailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17562fJy.OLrzqt();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.email.ui.AddOrUpdateEmailActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).copydefault(), new ActivityResultCallback() { // from class: o.fJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17562fJy.AEQbTJ(this.copydefault, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    public final C16245egL KWHzl() {
        C16245egL c16245egL = this.KWHzl;
        if (c16245egL != null) {
            return c16245egL;
        }
        throw new java.lang.IllegalStateException("Binding is only available between onCreateView and onDestroyView".toString());
    }

    /* JADX INFO: renamed from: o.fJy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fJy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.fJy$Application */
    public static final class Application extends ActivityResultContract<EmailOperationInput, EmailSetResult> {
        public static final Application OLrzqt = new Application();

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull EmailOperationInput emailOperationInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(emailOperationInput, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17562fJy.class);
            intent.putExtra("bind_email_info_key", emailOperationInput);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public EmailSetResult parseResult(int i, android.content.Intent intent) {
            android.os.Parcelable parcelableExtra;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("bind_email_result_key", EmailSetResult.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("bind_email_result_key");
                }
                EmailSetResult emailSetResult = (EmailSetResult) parcelableExtra;
                if (emailSetResult != null) {
                    return emailSetResult;
                }
            }
            return EmailSetResult.Cancelled.KWHzl;
        }
    }

    public final fJL copydefault() {
        return (fJL) this.OLrzqt.getValue();
    }

    public static final fJL copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new fJL(new fJK(C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).DTwDnp()));
    }

    public static final void AEQbTJ(ActivityC17562fJy activityC17562fJy, java.lang.Boolean bool) {
        pUU.copydefault(activityC17562fJy.getTAG(), "emailLauncher result = " + bool);
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            activityC17562fJy.EZpvd(EmailSetResult.Success.copydefault);
        } else if (!Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.os.Parcelable parcelableExtra;
        super.onCreate(bundle);
        overridePendingTransition(C7343ahz.ActionBar.AEQbTJ, 0);
        this.KWHzl = C16245egL.OLrzqt(getLayoutInflater());
        setContentView(KWHzl().getRoot());
        fJL fjlCopydefault = copydefault();
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("bind_email_info_key", EmailOperationInput.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("bind_email_info_key");
        }
        EmailOperationInput emailOperationInput = (EmailOperationInput) parcelableExtra;
        if (emailOperationInput == null) {
            emailOperationInput = new EmailOperationInput((EmailOperationSourceType) null, (BindEmailData) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
        }
        fjlCopydefault.EZpvd(emailOperationInput);
        C33516mxt.EZpvd(this);
        gEmmrt();
        AYXKKw();
        valueOf();
        AEQbTJ();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17562fJy.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(ActivityC17562fJy activityC17562fJy) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17562fJy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        try {
            if (copydefault().KWHzl().getBindEmailData().getNoEmail()) {
                C32866mlf.onEvent$default("Wallet_Email_Link_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            } else {
                final java.lang.String str = copydefault().KWHzl().getEmailOperationSourceType() == EmailOperationSourceType.FROM_CREATE_WALLET ? "tc" : ExtJson.BRC20TYPE_TRADE;
                C32866mlf.onEvent$default("Wallet_Email_Change_View", (TrackChannel[]) null, new Function1() { // from class: o.fJG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC17562fJy.AYXKKw(str, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "displayViewOnEvent e = " + e.getMessage());
        }
    }

    public static final Unit AYXKKw(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_page", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        final java.lang.String str = z ? "success" : "fail";
        try {
            if (copydefault().KWHzl().getBindEmailData().getNoEmail()) {
                C32866mlf.onEvent$default("Wallet_Email_Link_Click", (TrackChannel[]) null, new Function1() { // from class: o.fJv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC17562fJy.EZpvd(str, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            } else {
                C32866mlf.onEvent$default("Wallet_Email_Change_Click", (TrackChannel[]) null, new Function1() { // from class: o.fJB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC17562fJy.AEQbTJ(str, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "displayViewOnEvent e = " + e.getMessage());
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "status", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "status", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(BindEmailData bindEmailData) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        AppCompatTextView appCompatTextView = KWHzl().valueOf;
        if (bindEmailData.getNoEmail()) {
            strAYXKKw = getString(C13754dXa.FragmentManager.OeZisf);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dkJJWw);
        }
        appCompatTextView.setText(strAYXKKw);
        AppCompatTextView appCompatTextView2 = KWHzl().AhwBna;
        if (bindEmailData.getNoEmail()) {
            strAYXKKw2 = getString(C13754dXa.FragmentManager.fGT);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OFqMGB);
        }
        appCompatTextView2.setText(strAYXKKw2);
        C52794wYp c52794wYp = KWHzl().copydefault;
        if (bindEmailData.getNoEmail()) {
            strAYXKKw3 = getString(C13754dXa.FragmentManager.hpmliR);
        } else {
            strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OAjjVP);
        }
        c52794wYp.setText(strAYXKKw3);
        C33064mpR.OLrzqt(this.AEQbTJ, bindEmailData.getEmailSuffixList());
    }

    /* JADX INFO: renamed from: o.fJy$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC17562fJy OLrzqt;
        public final /* synthetic */ BindEmailData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC17562fJy activityC17562fJy, BindEmailData bindEmailData) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC17562fJy;
            this.copydefault = bindEmailData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.text.Editable text;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActivityC17562fJy activityC17562fJy = this.OLrzqt;
                C33570myu.AEQbTJ((android.content.Context) activityC17562fJy, (android.view.View) activityC17562fJy.KWHzl().AEQbTJ.AkhnZx());
                C55001xbh c55001xbhAkhnZx = this.OLrzqt.KWHzl().AEQbTJ.AkhnZx();
                java.lang.String string = (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null) ? null : text.toString();
                if (string == null) {
                    string = "";
                }
                if (string.length() == 0) {
                    return;
                }
                boolean zKWHzl = this.OLrzqt.copydefault().KWHzl(string, this.copydefault.getEmailSuffixList());
                this.OLrzqt.copydefault(zKWHzl);
                if (zKWHzl) {
                    C55001xbh c55001xbhAkhnZx2 = this.OLrzqt.KWHzl().AEQbTJ.AkhnZx();
                    if (c55001xbhAkhnZx2 != null) {
                        c55001xbhAkhnZx2.clearFocus();
                    }
                    this.OLrzqt.KWHzl().AEQbTJ.values();
                    this.OLrzqt.EZpvd.launch(string);
                    return;
                }
                C55008xbo c55008xbo = this.OLrzqt.KWHzl().AEQbTJ;
                java.lang.String string2 = this.OLrzqt.getString(C13754dXa.FragmentManager.uLLnq);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55008xbo.setErrorText(string2);
            }
        }
    }

    public final void valueOf() {
        BindEmailData bindEmailData = copydefault().KWHzl().getBindEmailData();
        EZpvd(bindEmailData);
        C52794wYp c52794wYp = KWHzl().copydefault;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, bindEmailData));
    }

    public final void AYXKKw() {
        KWHzl().AYXKKw.setLayoutManager(new GridLayoutManager(this, 2));
        this.AEQbTJ.register(java.lang.String.class, new ActionBar());
        KWHzl().AYXKKw.setAdapter(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.fJy$ActionBar */
    public static final class ActionBar extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: o.fJy$ActionBar$TaskDescription */
        public static final class TaskDescription extends RecyclerView.ViewHolder {
            public TaskDescription(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new TaskDescription(layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKDIADVb, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.String str) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(str, "");
            ((android.widget.TextView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.RLmrWm)).setText(str);
        }
    }

    public final void gEmmrt() {
        android.widget.LinearLayout linearLayoutDjBIcL;
        C33537myN c33537myN = KWHzl().EZpvd;
        c33537myN.setBackVisible(8);
        c33537myN.setSubDoVisible(0);
        c33537myN.setSubDoImageVisible(0);
        c33537myN.setSubDoImageResource(C52761wXj.TaskDescription.alsFma);
        c33537myN.getDoImage().setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        c33537myN.setSubDoListener(new View.OnClickListener() { // from class: o.fJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17562fJy.KWHzl(this.KWHzl, view);
            }
        });
        C55008xbo c55008xbo = KWHzl().AEQbTJ;
        c55008xbo.setHintText(getString(C13754dXa.FragmentManager.OAUGar));
        c55008xbo.EZpvd(true);
        final C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setInputType(33);
            c55001xbhAkhnZx.post(new java.lang.Runnable() { // from class: o.fJE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17562fJy.EZpvd(c55001xbhAkhnZx, this);
                }
            });
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        imageView.setImageResource(C13754dXa.Activity.dvKsVJ);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        C55009xbp c55009xbpFIwbmz = KWHzl().AEQbTJ.fIwbmz();
        if (c55009xbpFIwbmz == null || (linearLayoutDjBIcL = c55009xbpFIwbmz.djBIcL()) == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(C55298xhM.dp2px$default(6.0f, null, 1, null));
        layoutParams.gravity = 16;
        linearLayoutDjBIcL.addView(imageView, 0, layoutParams);
        djBIcL();
    }

    public static final void KWHzl(ActivityC17562fJy activityC17562fJy, android.view.View view) {
        activityC17562fJy.onBackPressed();
    }

    public static final void EZpvd(final C55001xbh c55001xbh, final ActivityC17562fJy activityC17562fJy) {
        c55001xbh.requestFocus();
        android.text.Editable text = c55001xbh.getText();
        java.lang.String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        c55001xbh.setSelection(string.length());
        c55001xbh.postDelayed(new java.lang.Runnable() { // from class: o.fJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17562fJy.OLrzqt(this.OLrzqt, c55001xbh);
            }
        }, 100L);
    }

    public static final void OLrzqt(ActivityC17562fJy activityC17562fJy, C55001xbh c55001xbh) {
        C33570myu.AEQbTJ((android.content.Context) activityC17562fJy, (android.widget.EditText) c55001xbh);
    }

    public final void djBIcL() {
        C55001xbh c55001xbhAkhnZx = KWHzl().AEQbTJ.AkhnZx();
        if (c55001xbhAkhnZx == null) {
            return;
        }
        BindEmailData bindEmailData = copydefault().KWHzl().getBindEmailData();
        if (!bindEmailData.getNoEmail() && !bindEmailData.isValidEmail()) {
            C55008xbo c55008xbo = KWHzl().AEQbTJ;
            c55008xbo.setText(bindEmailData.getEmail());
            java.lang.String string = getString(C13754dXa.FragmentManager.uLLnq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55008xbo.setErrorText(string);
            KWHzl().copydefault.setEnabled(true);
        } else if (bindEmailData.getNoEmail()) {
            KWHzl().copydefault.setEnabled(false);
        } else {
            KWHzl().copydefault.setEnabled(true);
        }
        c55001xbhAkhnZx.addTextChangedListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.fJy$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            ActivityC17562fJy activityC17562fJy = ActivityC17562fJy.this;
            try {
                Result.Application application = Result.Companion;
                if (editable == null || editable.length() == 0) {
                    activityC17562fJy.KWHzl().AEQbTJ.values();
                }
                activityC17562fJy.KWHzl().copydefault.setEnabled(C33129mqd.OLrzqt((java.lang.CharSequence) editable));
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    public final void EZpvd(EmailSetResult emailSetResult) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("bind_email_result_key", emailSetResult);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C7343ahz.ActionBar.valueOf);
    }

    public static final ViewModelProvider.Factory OLrzqt() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fJL.class), new Function1() { // from class: o.fJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17562fJy.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
