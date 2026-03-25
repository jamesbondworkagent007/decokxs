package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeInternalResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$observeUIData$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$observeUIData$2;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedDetailStatus;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletStatusViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C13754dXa;
import o.C52761wXj;
import o.C55284xgz;
import o.InterfaceC49363unD;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fKG extends AbstractActivityC17596fLe implements InterfaceC49363unD {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;
    public C17597fLf KWHzl;
    public C17008eug OLrzqt;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EscapedDetailStatus.values().length];
            try {
                iArr[EscapedDetailStatus.IN_PROGRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
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

    public fKG() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(EscapePassKeyWalletStatusViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletStatusActivity$special$$inlined$viewModels$default$3
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fKG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull EscapeStatusInput escapeStatusInput) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(escapeStatusInput, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) fKG.class);
            intent.putExtra("escape_status_input", escapeStatusInput);
            activity.startActivityForResult(intent, 200001);
        }
    }

    /* JADX DEBUG: Possible override for method o.fLe.OLrzqt()V */
    public final EscapePassKeyWalletStatusViewModel OLrzqt() {
        return (EscapePassKeyWalletStatusViewModel) this.EZpvd.getValue();
    }

    @Override // o.AbstractActivityC17596fLe, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        C17008eug c17008eugAEQbTJ = C17008eug.AEQbTJ(getLayoutInflater());
        this.OLrzqt = c17008eugAEQbTJ;
        if (c17008eugAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c17008eugAEQbTJ = null;
        }
        setContentView(c17008eugAEQbTJ.getRoot());
        C32866mlf.onEvent$default("Wallet_Release_Result_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        EZpvd();
        AEQbTJ();
        AYXKKw();
        OLrzqt().AEQbTJ(true);
    }

    private final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletStatusActivity$observeUIData$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletStatusActivity$observeUIData$2(this, null), 3, null);
    }

    public final void KWHzl(final EscapedStatusUIData escapedStatusUIData) {
        C17008eug c17008eug = this.OLrzqt;
        C17008eug c17008eug2 = null;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        c17008eug.DbNXlk.setVisibility(0);
        OLrzqt(escapedStatusUIData.getEscapeStatus());
        copydefault(escapedStatusUIData.getEscapeTime());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.KWHzl = new C17597fLf(supportFragmentManager, lifecycle, escapedStatusUIData.getEscapedAddressTabItem(), !escapedStatusUIData.getShowCheckAssets());
        C17008eug c17008eug3 = this.OLrzqt;
        if (c17008eug3 == null) {
            Intrinsics.gEmmrt("");
            c17008eug3 = null;
        }
        c17008eug3.fARcdN.setAdapter(this.KWHzl);
        C17008eug c17008eug4 = this.OLrzqt;
        if (c17008eug4 == null) {
            Intrinsics.gEmmrt("");
            c17008eug4 = null;
        }
        android.widget.LinearLayout linearLayout = c17008eug4.values;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(escapedStatusUIData.getShowCheckAssets() ^ true ? 0 : 8);
        C17008eug c17008eug5 = this.OLrzqt;
        if (c17008eug5 == null) {
            Intrinsics.gEmmrt("");
            c17008eug5 = null;
        }
        android.widget.LinearLayout linearLayout2 = c17008eug5.isConnected;
        AEQbTJ(C52761wXj.PendingIntent.uzCIH, 0);
        Intrinsics.copydefault(linearLayout2);
        linearLayout2.setVisibility(escapedStatusUIData.getShowCheckAssets() ? 0 : 8);
        C17008eug c17008eug6 = this.OLrzqt;
        if (c17008eug6 == null) {
            Intrinsics.gEmmrt("");
            c17008eug6 = null;
        }
        C52794wYp c52794wYp = c17008eug6.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        ConstraintSet constraintSet = new ConstraintSet();
        C17008eug c17008eug7 = this.OLrzqt;
        if (c17008eug7 == null) {
            Intrinsics.gEmmrt("");
            c17008eug7 = null;
        }
        constraintSet.clone(c17008eug7.AYXKKw);
        constraintSet.connect(C13754dXa.ActionBar.hkDICb, 3, escapedStatusUIData.getShowCheckAssets() ? C13754dXa.ActionBar.hijVBL : C13754dXa.ActionBar.extraCommand, 4);
        C17008eug c17008eug8 = this.OLrzqt;
        if (c17008eug8 == null) {
            Intrinsics.gEmmrt("");
            c17008eug8 = null;
        }
        constraintSet.applyTo(c17008eug8.AYXKKw);
        C17008eug c17008eug9 = this.OLrzqt;
        if (c17008eug9 == null) {
            Intrinsics.gEmmrt("");
            c17008eug9 = null;
        }
        TabLayout tabLayout = c17008eug9.ejfBZ;
        C17008eug c17008eug10 = this.OLrzqt;
        if (c17008eug10 == null) {
            Intrinsics.gEmmrt("");
            c17008eug10 = null;
        }
        new TabLayoutMediator(tabLayout, c17008eug10.fARcdN, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.fKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                fKG.OLrzqt(escapedStatusUIData, tab, i);
            }
        }).attach();
        C17008eug c17008eug11 = this.OLrzqt;
        if (c17008eug11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17008eug2 = c17008eug11;
        }
        c17008eug2.ejfBZ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription());
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ fKG EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, fKG fkg) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = fkg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ fKG EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fKG fkg) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = fkg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC54829xWw.ActionBar.enterWallet$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), this.EZpvd, null, false, false, false, 30, null);
            }
        }
    }

    public static final void OLrzqt(EscapedStatusUIData escapedStatusUIData, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(escapedStatusUIData.getEscapedAddressTabItem().get(i).getTabName());
        tab.setTag(escapedStatusUIData.getEscapedAddressTabItem().get(i).getTabTag());
    }

    public final void OLrzqt(EscapedDetailStatus escapedDetailStatus) {
        C17008eug c17008eug = null;
        if (ActionBar.EZpvd[escapedDetailStatus.ordinal()] != 1) {
            C17008eug c17008eug2 = this.OLrzqt;
            if (c17008eug2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17008eug = c17008eug2;
            }
            c17008eug.OLrzqt.setVisibility(8);
            return;
        }
        C17008eug c17008eug3 = this.OLrzqt;
        if (c17008eug3 == null) {
            Intrinsics.gEmmrt("");
            c17008eug3 = null;
        }
        c17008eug3.OLrzqt.setVisibility(0);
        C17008eug c17008eug4 = this.OLrzqt;
        if (c17008eug4 == null) {
            Intrinsics.gEmmrt("");
            c17008eug4 = null;
        }
        C55113xdn.showLoading$default(c17008eug4.valueOf, 0L, 1, null);
        C17008eug c17008eug5 = this.OLrzqt;
        if (c17008eug5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17008eug = c17008eug5;
        }
        c17008eug.fIwbmz.setText(getString(C13754dXa.FragmentManager.MediaControllerCompatApi21CallbackProxy));
    }

    public final void copydefault(java.lang.String str) {
        C17008eug c17008eug = this.OLrzqt;
        C17008eug c17008eug2 = null;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        c17008eug.fJNWhG.setVisibility(str.length() == 0 ? 8 : 0);
        C17008eug c17008eug3 = this.OLrzqt;
        if (c17008eug3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17008eug2 = c17008eug3;
        }
        c17008eug2.fJNWhG.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.OqHLSf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", str))));
    }

    public final void EZpvd() {
        C17008eug c17008eug = this.OLrzqt;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        C52794wYp c52794wYp = c17008eug.EZpvd;
        int color = ContextCompat.getColor(this, C52761wXj.Activity.fdOvFl);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.AwvSrB);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, color);
            drawable.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
        } else {
            drawable = null;
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
        c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    public final void OLrzqt(boolean z) {
        C17008eug c17008eug = null;
        if (z) {
            C17008eug c17008eug2 = this.OLrzqt;
            if (c17008eug2 == null) {
                Intrinsics.gEmmrt("");
                c17008eug2 = null;
            }
            c17008eug2.AYXKKw.setVisibility(8);
            C17008eug c17008eug3 = this.OLrzqt;
            if (c17008eug3 == null) {
                Intrinsics.gEmmrt("");
                c17008eug3 = null;
            }
            c17008eug3.gEmmrt.setVisibility(8);
            C17008eug c17008eug4 = this.OLrzqt;
            if (c17008eug4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17008eug = c17008eug4;
            }
            C55113xdn c55113xdn = c17008eug.djBIcL;
            c55113xdn.setVisibility(0);
            c55113xdn.setAnimation(C52761wXj.PendingIntent.values);
            c55113xdn.playAnimation();
            return;
        }
        C17008eug c17008eug5 = this.OLrzqt;
        if (c17008eug5 == null) {
            Intrinsics.gEmmrt("");
            c17008eug5 = null;
        }
        c17008eug5.AhwBna.setVisibility(8);
        C17008eug c17008eug6 = this.OLrzqt;
        if (c17008eug6 == null) {
            Intrinsics.gEmmrt("");
            c17008eug6 = null;
        }
        c17008eug6.DbNXlk.setVisibility(8);
        C17008eug c17008eug7 = this.OLrzqt;
        if (c17008eug7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17008eug = c17008eug7;
        }
        C55113xdn c55113xdn2 = c17008eug.KWHzl;
        c55113xdn2.setVisibility(0);
        c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        c55113xdn2.playAnimation();
    }

    public final void copydefault(boolean z) {
        C17008eug c17008eug = null;
        if (z) {
            C17008eug c17008eug2 = this.OLrzqt;
            if (c17008eug2 == null) {
                Intrinsics.gEmmrt("");
                c17008eug2 = null;
            }
            c17008eug2.AYXKKw.setVisibility(0);
            C17008eug c17008eug3 = this.OLrzqt;
            if (c17008eug3 == null) {
                Intrinsics.gEmmrt("");
                c17008eug3 = null;
            }
            c17008eug3.gEmmrt.setVisibility(8);
            C17008eug c17008eug4 = this.OLrzqt;
            if (c17008eug4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17008eug = c17008eug4;
            }
            C55113xdn c55113xdn = c17008eug.djBIcL;
            c55113xdn.setVisibility(8);
            c55113xdn.cancelAnimation();
            return;
        }
        C17008eug c17008eug5 = this.OLrzqt;
        if (c17008eug5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17008eug = c17008eug5;
        }
        C55113xdn c55113xdn2 = c17008eug.KWHzl;
        c55113xdn2.setVisibility(8);
        c55113xdn2.cancelAnimation();
    }

    public final void valueOf() {
        C17008eug c17008eug = this.OLrzqt;
        C17008eug c17008eug2 = null;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        c17008eug.AYXKKw.setVisibility(8);
        C17008eug c17008eug3 = this.OLrzqt;
        if (c17008eug3 == null) {
            Intrinsics.gEmmrt("");
            c17008eug3 = null;
        }
        c17008eug3.AhwBna.setVisibility(8);
        C17008eug c17008eug4 = this.OLrzqt;
        if (c17008eug4 == null) {
            Intrinsics.gEmmrt("");
            c17008eug4 = null;
        }
        C55113xdn c55113xdn = c17008eug4.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        C17008eug c17008eug5 = this.OLrzqt;
        if (c17008eug5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17008eug2 = c17008eug5;
        }
        C55173xeu c55173xeu = c17008eug2.gEmmrt;
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
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fKG.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(fKG fkg, android.view.View view) {
        fkg.OLrzqt().AEQbTJ(true);
    }

    public final void KWHzl(boolean z) {
        copydefault(z);
        C17008eug c17008eug = this.OLrzqt;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        C55173xeu c55173xeu = c17008eug.AhwBna;
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(6);
        java.lang.String string = getString(C13754dXa.FragmentManager.processPendingCallbacksLocked);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImplApi21);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fKE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fKG.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(fKG fkg, android.view.View view) {
        fkg.OLrzqt().AEQbTJ(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        C17008eug c17008eug = this.OLrzqt;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        C55113xdn c55113xdn = c17008eug.djBIcL;
        c55113xdn.setVisibility(8);
        c55113xdn.cancelAnimation();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(0);
        viewOnClickListenerC54939xaY.EZpvd(getString(C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImplApi21ExtraCallback));
        java.lang.String string = getString(C13754dXa.FragmentManager.DCJXGO);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fKG.valueOf(this.copydefault, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void valueOf(fKG fkg, android.view.View view) {
        fkg.finish();
    }

    public final void AEQbTJ() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("escape_status_result", EscapeInternalResult.Success.KWHzl);
        setResult(-1, intent);
    }

    public final void KWHzl() {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", getString(C13754dXa.FragmentManager.MediaControllerCompatMediaControllerImplApi24)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt(OtcExtraKeys.FLAG, java.lang.Boolean.TRUE), C56390yDp.OLrzqt("set_token", java.lang.Boolean.FALSE)), null, 4, null);
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(fKG fkg, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        fkg.AEQbTJ(i, i2);
    }

    public final void AEQbTJ(@androidx.annotation.RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(this, i).addListener(new LottieListener() { // from class: o.fKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                fKG.EZpvd(this.copydefault, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void EZpvd(fKG fkg, int i, LottieComposition lottieComposition) {
        C17008eug c17008eug = fkg.OLrzqt;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        android.widget.ImageView imageView = c17008eug.AkhnZx;
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(i);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
    }

    public final void KWHzl(java.lang.String str) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        C17008eug c17008eug = this.OLrzqt;
        if (c17008eug == null) {
            Intrinsics.gEmmrt("");
            c17008eug = null;
        }
        ConstraintLayout constraintLayoutOLrzqt = c17008eug.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOLrzqt, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(constraintLayoutOLrzqt, str);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.AEQbTJ(str);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    @Override // o.AbstractActivityC17596fLe, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17596fLe, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17596fLe, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17596fLe, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
