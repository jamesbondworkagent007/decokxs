package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeDoneParam;
import com.okinc.business.defi.wallet.tee.activate.model.NotificationStateType;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$createSADoneActivityResultLauncher$1$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$handleErrorResponse$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$initSingleClick$1$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$initSingleClick$2$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$initView$2$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$2;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$4;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$5;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$6;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$7;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$8;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$onBackPressed$1;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import com.okinc.web.WebActivity;
import kotlin.Triple;
import kotlin.Unit;
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
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC49363unD;
import o.InterfaceC49371unL;
import o.fSK;
import o.fWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17792fSl extends AbstractActivityC17832fTy implements InterfaceC49363unD {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<ActivateTeeDoneParam> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean EZpvd;
    public C16253egT OLrzqt;
    public final long copydefault = CalendarModelKt.MillisecondsIn24Hours;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.fSl$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NotificationStateType.values().length];
            try {
                iArr[NotificationStateType.EnableFailed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationStateType.SmartEnabled.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationStateType.EnableAgain.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
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

    public <T extends InterfaceC49369unJ<T>> java.lang.Object copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, continuation);
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

    public ActivityC17792fSl() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(ActivateSAViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$special$$inlined$viewModels$default$3
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
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(ReEnableViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$special$$inlined$viewModels$default$6
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
        ActivityResultLauncher<ActivateTeeDoneParam> activityResultLauncherRegisterForActivityResult = registerForActivityResult(fSK.StateListAnimator.OLrzqt, new ActivityResultCallback() { // from class: o.fSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17792fSl.EZpvd(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX DEBUG: Possible override for method o.fTy.AEQbTJ()V */
    public final ActivateSAViewModel AEQbTJ() {
        return (ActivateSAViewModel) this.AYXKKw.getValue();
    }

    public final ReEnableViewModel KWHzl() {
        return (ReEnableViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: o.fSl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fSl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17792fSl.class);
            intent.putExtra("tee_account_info", activateTeeGuideModel);
            context.startActivity(intent);
        }
    }

    public static final void EZpvd(ActivityC17792fSl activityC17792fSl, ActivityResult activityResult) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC17792fSl), null, null, new ActivateSAActivity$createSADoneActivityResultLauncher$1$1(activityC17792fSl, activityResult, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fSl$ActionBar */
    public static final class ActionBar extends ActivityResultContract<ActivateTeeGuideModel, ActivityResult> {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17792fSl.class);
            intent.putExtra("tee_account_info", activateTeeGuideModel);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i, android.content.Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    @Override // o.AbstractActivityC17832fTy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16253egT c16253egTEZpvd = C16253egT.EZpvd(getLayoutInflater());
        this.OLrzqt = c16253egTEZpvd;
        C16253egT c16253egT = null;
        if (c16253egTEZpvd == null) {
            Intrinsics.gEmmrt("");
            c16253egTEZpvd = null;
        }
        setContentView(c16253egTEZpvd.getRoot());
        C16253egT c16253egT2 = this.OLrzqt;
        if (c16253egT2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16253egT = c16253egT2;
        }
        c16253egT.AEQbTJ.setBackImage(C52761wXj.TaskDescription.alsFma);
        AEQbTJ().KWHzl(AEQbTJ().AEQbTJ().getValue().isNeedToCreateNewAccount());
        AkhnZx();
        valueOf();
        AhwBna();
    }

    private final void AkhnZx() {
        C16253egT c16253egT = this.OLrzqt;
        C16253egT c16253egT2 = null;
        if (c16253egT == null) {
            Intrinsics.gEmmrt("");
            c16253egT = null;
        }
        c16253egT.AEQbTJ.setVisibility(4);
        C16253egT c16253egT3 = this.OLrzqt;
        if (c16253egT3 == null) {
            Intrinsics.gEmmrt("");
            c16253egT3 = null;
        }
        c16253egT3.AkhnZx.setVisibility(4);
        C16253egT c16253egT4 = this.OLrzqt;
        if (c16253egT4 == null) {
            Intrinsics.gEmmrt("");
            c16253egT4 = null;
        }
        c16253egT4.AYXKKw.setVisibility(4);
        AEQbTJ(C13754dXa.FragmentManager.RZOtbZ);
        C16253egT c16253egT5 = this.OLrzqt;
        if (c16253egT5 == null) {
            Intrinsics.gEmmrt("");
            c16253egT5 = null;
        }
        AppCompatTextView appCompatTextView = c16253egT5.hDKMBd;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialhrnhsO);
        android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw + "\u200b");
        spannableString.setSpan(new fVQ(C33070mpX.copydefault(C52761wXj.Activity.QwvEab), strAYXKKw), 0, strAYXKKw.length(), 33);
        appCompatTextView.setText(spannableString);
        appCompatTextView.setOnClickListener(new LoaderManager(appCompatTextView, 1000L, this));
        C16253egT c16253egT6 = this.OLrzqt;
        if (c16253egT6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16253egT2 = c16253egT6;
        }
        ConstraintLayout constraintLayout = c16253egT2.fARcdN;
        constraintLayout.setOnClickListener(new Fragment(constraintLayout, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fSl$Dialog */
    public static final class Dialog implements Function0<Unit> {
        public static final Dialog KWHzl = new Dialog();

        public final void copydefault() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fSl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC17792fSl AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC17792fSl activityC17792fSl) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC17792fSl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new ActivateSAActivity$initSingleClick$1$1(this.AEQbTJ, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fSl$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ActivityC17792fSl EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC17792fSl activityC17792fSl) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = activityC17792fSl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3WalletEnableSmartAccountPage_Button_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new ActivateSAActivity$initView$2$1(this.EZpvd, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fSl$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC17792fSl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC17792fSl activityC17792fSl) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC17792fSl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17877fVp.Companion.OLrzqt().KWHzl(this.OLrzqt, Dialog.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.fSl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC17792fSl AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC17792fSl activityC17792fSl) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC17792fSl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new ActivateSAActivity$initSingleClick$2$1(this.AEQbTJ, null), 3, null);
            }
        }
    }

    public final void AEQbTJ(final int i) {
        C16253egT c16253egT = this.OLrzqt;
        C16253egT c16253egT2 = null;
        if (c16253egT == null) {
            Intrinsics.gEmmrt("");
            c16253egT = null;
        }
        c16253egT.ejfBZ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fWSAZA));
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.UPbYzn, C56423yEv.EZpvd(C56390yDp.OLrzqt("learn", str))) + "\u200b";
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.fSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17792fSl.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null);
        C16253egT c16253egT3 = this.OLrzqt;
        if (c16253egT3 == null) {
            Intrinsics.gEmmrt("");
            c16253egT3 = null;
        }
        c16253egT3.fIwbmz.setText(charSequence);
        C16253egT c16253egT4 = this.OLrzqt;
        if (c16253egT4 == null) {
            Intrinsics.gEmmrt("");
            c16253egT4 = null;
        }
        AppCompatTextView appCompatTextView = c16253egT4.fIwbmz;
        C16253egT c16253egT5 = this.OLrzqt;
        if (c16253egT5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16253egT2 = c16253egT5;
        }
        appCompatTextView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(c16253egT2.fIwbmz, str2, str, new Function0() { // from class: o.fSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17792fSl.copydefault(i, this);
            }
        }));
    }

    public static final Unit AEQbTJ(ActivityC17792fSl activityC17792fSl, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(activityC17792fSl, C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i, ActivityC17792fSl activityC17792fSl) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activityC17792fSl, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(i)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C16253egT c16253egT = this.OLrzqt;
        C16253egT c16253egT2 = null;
        if (c16253egT == null) {
            Intrinsics.gEmmrt("");
            c16253egT = null;
        }
        c16253egT.ejfBZ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QhsCdE));
        C16253egT c16253egT3 = this.OLrzqt;
        if (c16253egT3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16253egT2 = c16253egT3;
        }
        c16253egT2.fIwbmz.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DDxOgT));
    }

    public final void valueOf() {
        C16253egT c16253egT = this.OLrzqt;
        C16253egT c16253egT2 = null;
        if (c16253egT == null) {
            Intrinsics.gEmmrt("");
            c16253egT = null;
        }
        LinearLayoutCompat linearLayoutCompat = c16253egT.isConnected;
        linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, this));
        C16253egT c16253egT3 = this.OLrzqt;
        if (c16253egT3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16253egT2 = c16253egT3;
        }
        C52794wYp c52794wYp = c16253egT2.KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    public final void AhwBna() {
        ActivateSAViewModel activateSAViewModelAEQbTJ = AEQbTJ();
        ActivateSAActivity$observerData$1 activateSAActivity$observerData$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((ActivateSAViewModel.Application) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ActivateSAViewModel.Application) obj).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj2);
            }
        };
        Lifecycle.State state = Lifecycle.State.CREATED;
        collectLatestOnLifecycle(activateSAViewModelAEQbTJ, activateSAActivity$observerData$1, state, new ActivateSAActivity$observerData$2(this, null));
        collectLatestOnLifecycle(AEQbTJ(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((ActivateSAViewModel.Application) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((ActivateSAViewModel.Application) obj).EZpvd((InterfaceC49371unL) obj2);
            }
        }, state, new ActivateSAActivity$observerData$4(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ActivateSAActivity$observerData$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ActivateSAActivity$observerData$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ActivateSAActivity$observerData$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ActivateSAActivity$observerData$8(this, null), 3, null);
    }

    public final void copydefault(final java.lang.String str, java.lang.String str2) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(getString(C13754dXa.FragmentManager.ruDxL));
        viewOnClickListenerC54939xaY.EZpvd(str2);
        java.lang.String string = getString(C13754dXa.FragmentManager.DCJXGO);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17792fSl.OLrzqt(this.copydefault, str, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ActivityC17792fSl activityC17792fSl, java.lang.String str, android.view.View view) {
        activityC17792fSl.copydefault(NotificationStateType.Other, str, true);
    }

    public final void EZpvd() {
        C16253egT c16253egT = this.OLrzqt;
        if (c16253egT == null) {
            Intrinsics.gEmmrt("");
            c16253egT = null;
        }
        c16253egT.KWHzl.setEnabled(false);
    }

    public final void OLrzqt(java.lang.Throwable th) {
        pUU.copydefault(getTAG(), "activate tee error message = " + th.getMessage());
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dNCPSb);
        }
        java.lang.String str = message;
        if (th instanceof OKServerException) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ActivateSAActivity$handleErrorResponse$1(this, th, str, null), 3, null);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
    }

    public final void EZpvd(final int i, final boolean z) {
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "reNewSA", new Function1() { // from class: o.fSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17792fSl.copydefault(this.EZpvd, i, z, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
    }

    public static final Unit copydefault(ActivityC17792fSl activityC17792fSl, int i, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17792fSl.KWHzl().EZpvd(str, i, z);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ActivateSAActivity$onBackPressed$1(this, null), 3, null);
    }

    public final java.lang.String AYXKKw() {
        return AEQbTJ().AEQbTJ().getValue().getPathSource();
    }

    public static /* synthetic */ void handleSetResult$default(ActivityC17792fSl activityC17792fSl, NotificationStateType notificationStateType, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        activityC17792fSl.copydefault(notificationStateType, str, z);
    }

    public final void copydefault(NotificationStateType notificationStateType, java.lang.String str, boolean z) {
        if (z) {
            setResult(-1);
            finish();
        }
        if (AEQbTJ().AEQbTJ().getValue().isNeedToCreateNewAccount()) {
            int i = Application.copydefault[notificationStateType.ordinal()];
            if (i == 1) {
                fVE.Companion.EZpvd().EZpvd(new fWX.VoiceInteractor(str));
            } else if (i == 2) {
                fVE.Companion.EZpvd().EZpvd(new fWX.PictureInPictureParams(str));
            } else {
                if (i != 3) {
                    return;
                }
                fVE.Companion.EZpvd().EZpvd(new fWX.SharedElementCallback(str));
            }
        }
    }

    @Override // o.AbstractActivityC17832fTy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17832fTy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17832fTy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17832fTy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
