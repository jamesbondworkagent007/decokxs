package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalSelectionResult;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import com.okinc.tradingbot.impl.aiBot.dto.ModelInfoDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$1;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$2;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$3;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$4;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$5;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$6;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$initViewModel$7;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel;
import com.okinc.tradingbot.impl.common.EmptyBotOrderPresenter;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC48077uEc;
import o.ActivityC48152uGx;
import o.C48033uCm;
import o.C52755wXd;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC8104awT;
import o.uFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uFk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48112uFk extends AbstractC48096uEv<AbstractC48473uSs, EmptyBotOrderPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final int AkhnZx = C48033uCm.Activity.isReflectionWorking;
    public final InterfaceC56387yDm DbNXlk;
    public final ActivityResultLauncher<android.content.Intent> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public boolean isConnected;
    public final ActivityResultLauncher<android.content.Intent> valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC48165uHj
    public boolean AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.uSs) (wrap:Binding:0x0000: INVOKE (r0v0 o.uFk) VIRTUAL call: o.xKx.gGvvIC():androidx.databinding.ViewDataBinding A[MD:():Binding extends androidx.databinding.ViewDataBinding (m), WRAPPED] (LINE:68)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48473uSs isConnected(C48112uFk c48112uFk) {
        return (AbstractC48473uSs) c48112uFk.gGvvIC();
    }

    public C48112uFk() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LlmOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.uFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C48112uFk.valueOf(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.fetchVPNInfo = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.uFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C48112uFk.KWHzl(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.uFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C48112uFk.OLrzqt(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult3;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.uFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.DbNXlk(this.KWHzl);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.uFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.getFieldNames(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.uFk$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uFk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final LlmOrderViewModel fetchVPNInfo() {
        return (LlmOrderViewModel) this.DbNXlk.getValue();
    }

    /* JADX DEBUG: Possible override for method o.uEv.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.uHj.AEQbTJ()V */
    public final BotTradePresenter AEQbTJ() {
        return (BotTradePresenter) this.gEmmrt.getValue();
    }

    public static final void valueOf(C48112uFk c48112uFk, ActivityResult activityResult) {
        android.content.Intent data;
        MarketSignalSelectionResult marketSignalSelectionResult;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (marketSignalSelectionResult = (MarketSignalSelectionResult) data.getParcelableExtra("SelectionResultKey")) == null) {
            return;
        }
        c48112uFk.fetchVPNInfo().EZpvd(MarketSignalSelectionResult.Companion.EZpvd(marketSignalSelectionResult));
    }

    public static final void KWHzl(C48112uFk c48112uFk, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.lang.String stringExtra = data != null ? data.getStringExtra("ExtraOriginalPrompt") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            android.content.Intent data2 = activityResult.getData();
            java.lang.String stringExtra2 = data2 != null ? data2.getStringExtra("ExtraTradingStrategy") : null;
            c48112uFk.fetchVPNInfo().KWHzl(stringExtra, stringExtra2 != null ? stringExtra2 : "");
        }
    }

    public static final void OLrzqt(C48112uFk c48112uFk, ActivityResult activityResult) {
        c48112uFk.fetchVPNInfo().AuCTel();
    }

    public final wYF AhwBna() {
        return (wYF) this.AYXKKw.getValue();
    }

    public static final wYF DbNXlk(C48112uFk c48112uFk) {
        android.content.Context contextRequireContext = c48112uFk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        wYF wyf = new wYF(contextRequireContext, null, 2, null);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.DAIeex));
        return wyf;
    }

    /* JADX INFO: renamed from: o.uFk$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static abstract class TaskDescription {
        public final boolean EZpvd;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean) A[MD:(boolean):void (m)] call: o.uFk.TaskDescription.<init>(boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault() {
            return this.EZpvd;
        }

        public TaskDescription(boolean z) {
            this.EZpvd = z;
        }

        /* JADX INFO: renamed from: o.uFk$TaskDescription$ActionBar */
        public static final class ActionBar extends TaskDescription {
            public static final ActionBar KWHzl = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -646895743;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Login";
            }

            private ActionBar() {
                super(true, null);
            }
        }

        /* JADX INFO: renamed from: o.uFk$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0975TaskDescription extends TaskDescription {
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0975TaskDescription copy$default(C0975TaskDescription c0975TaskDescription, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = c0975TaskDescription.KWHzl;
                }
                return c0975TaskDescription.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0975TaskDescription copydefault(boolean z) {
                return new C0975TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C48112uFk.TaskDescription
            public boolean copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0975TaskDescription) && this.KWHzl == ((C0975TaskDescription) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AccountUpgrade(hasPrompt=" + this.KWHzl + ")";
            }

            public C0975TaskDescription(boolean z) {
                super(z, null);
                this.KWHzl = z;
            }
        }

        /* JADX INFO: renamed from: o.uFk$TaskDescription$Activity */
        public static final class Activity extends TaskDescription {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = activity.AEQbTJ;
                }
                return activity.AEQbTJ(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(boolean z) {
                return new Activity(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C48112uFk.TaskDescription
            public boolean copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.AEQbTJ == ((Activity) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Create(hasPrompt=" + this.AEQbTJ + ")";
            }

            public Activity(boolean z) {
                super(z, null);
                this.AEQbTJ = z;
            }
        }
    }

    public final TaskDescription djBIcL() {
        if (!C55697xoo.OLrzqt.isConnected()) {
            return TaskDescription.ActionBar.KWHzl;
        }
        boolean z = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fetchVPNInfo().AhwBna().getValue().KWHzl());
        if (DbNXlk() && !isConnected()) {
            return new TaskDescription.C0975TaskDescription(z);
        }
        return new TaskDescription.Activity(z);
    }

    public final boolean DbNXlk() {
        return !Intrinsics.EZpvd((java.lang.Object) fetchVPNInfo().isConnected().getValue(), (java.lang.Object) "SPOT");
    }

    public final boolean isConnected() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return C33129mqd.copydefault((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM(), "2");
    }

    public static /* synthetic */ void refreshButtonState$default(C48112uFk c48112uFk, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c48112uFk.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        final TaskDescription taskDescriptionDjBIcL = djBIcL();
        Function0 function0 = new Function0() { // from class: o.uFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.OLrzqt(taskDescriptionDjBIcL, this);
            }
        };
        C52794wYp c52794wYpAEQbTJ = AhwBna().AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, this));
        }
        if (z && C55697xoo.OLrzqt.isConnected()) {
            wYF wyfAhwBna = AhwBna();
            androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
            transitionSet.setOrdering(0);
            androidx.transition.Fade fade = new androidx.transition.Fade();
            fade.setDuration(180L);
            transitionSet.addTransition(fade);
            androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
            changeBounds.setDuration(180L);
            transitionSet.addTransition(changeBounds);
            androidx.transition.TransitionManager.beginDelayedTransition(wyfAhwBna, transitionSet);
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: renamed from: o.uFk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C48112uFk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C48112uFk c48112uFk) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c48112uFk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                LlmOrderViewModel.setSelectedInstType$default(this.OLrzqt.fetchVPNInfo(), "SWAP", false, 2, null);
                C48112uFk.refreshButtonState$default(this.OLrzqt, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.uFk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C48112uFk EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C48112uFk c48112uFk) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c48112uFk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LlmOrderViewModel.setSelectedInstType$default(this.EZpvd.fetchVPNInfo(), "SPOT", false, 2, null);
                C48112uFk.refreshButtonState$default(this.EZpvd, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.uFk$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C48112uFk KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, Function0 function0, C48112uFk c48112uFk) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
            this.KWHzl = c48112uFk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (C55697xoo.OLrzqt.isConnected()) {
                    this.AEQbTJ.invoke();
                    return;
                }
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.uFk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C48112uFk AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C48112uFk c48112uFk) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c48112uFk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.copydefault(false);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/ai/backtest_params", C56424yEw.gEmmrt(C56390yDp.OLrzqt("backtestAiThinkingIntervals", this.AEQbTJ.fetchVPNInfo().valueOf()), C56390yDp.OLrzqt("orderParams", C33488mxR.EZpvd(this.AEQbTJ.fetchVPNInfo().DbNXlk()))));
            }
        }
    }

    public static final Unit OLrzqt(TaskDescription taskDescription, C48112uFk c48112uFk) {
        if (taskDescription instanceof TaskDescription.ActionBar) {
            c48112uFk.AhwBna().setType(5);
            c48112uFk.AhwBna().setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.access001));
            C52794wYp c52794wYpCopydefault = c48112uFk.AhwBna().copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(true);
            }
            C52794wYp c52794wYpAEQbTJ = c48112uFk.AhwBna().AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(true);
            }
        } else if (taskDescription instanceof TaskDescription.C0975TaskDescription) {
            c48112uFk.AhwBna().setType(5);
            c48112uFk.AhwBna().setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.init));
            C52794wYp c52794wYpCopydefault2 = c48112uFk.AhwBna().copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setEnabled(true);
            }
            C52794wYp c52794wYpAEQbTJ2 = c48112uFk.AhwBna().AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setEnabled(((TaskDescription.C0975TaskDescription) taskDescription).copydefault());
            }
        } else {
            if (!(taskDescription instanceof TaskDescription.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            c48112uFk.AhwBna().setType(14);
            c48112uFk.AhwBna().setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
            C52794wYp c52794wYpCopydefault3 = c48112uFk.AhwBna().copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setEnabled(((TaskDescription.Activity) taskDescription).copydefault());
            }
            C52794wYp c52794wYpAEQbTJ3 = c48112uFk.AhwBna().AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setEnabled(((TaskDescription.Activity) taskDescription).copydefault());
            }
        }
        return Unit.INSTANCE;
    }

    public final uEA values() {
        return (uEA) this.values.getValue();
    }

    public static final uEA getFieldNames(final C48112uFk c48112uFk) {
        return new uEA(new Function1() { // from class: o.uFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48112uFk.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit copydefault(C48112uFk c48112uFk, int i) {
        c48112uFk.fetchVPNInfo().AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public final InterfaceC48164uHi valueOf() {
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC48164uHi) {
            return (InterfaceC48164uHi) activity;
        }
        return null;
    }

    public static /* synthetic */ void showErrorLayout$default(C48112uFk c48112uFk, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c48112uFk.copydefault(str);
    }

    public final void copydefault(java.lang.String str) {
        InterfaceC48164uHi interfaceC48164uHiValueOf = valueOf();
        if (interfaceC48164uHiValueOf != null) {
            interfaceC48164uHiValueOf.EZpvd(str, new Function0() { // from class: o.uFu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C48112uFk.iwGUEr(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit iwGUEr(C48112uFk c48112uFk) {
        c48112uFk.fetchVPNInfo().EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        InterfaceC48164uHi interfaceC48164uHiValueOf = valueOf();
        if (interfaceC48164uHiValueOf != null) {
            interfaceC48164uHiValueOf.KWHzl();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public wYF gEmmrt() {
        return AhwBna();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, getTAG(), new kotlin.Pair[0], null, 8, null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        refreshButtonState$default(this, false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ((AbstractC48473uSs) gGvvIC());
        ejfBZ();
    }

    private final void ejfBZ() {
        C52692wUv.flowAndCollect$default(fetchVPNInfo().OLrzqt(), this, null, new LlmOrderFragment$initViewModel$1(this, null), 2, null);
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        if (c55697xoo.isConnected()) {
            fetchVPNInfo().EZpvd();
        }
        C52692wUv.flowAndCollect$default(fetchVPNInfo().AkhnZx(), this, null, new LlmOrderFragment$initViewModel$2(this, null), 2, null);
        C52692wUv.flowAndCollect$default(fetchVPNInfo().isConnected(), this, null, new LlmOrderFragment$initViewModel$3(this, null), 2, null);
        C52692wUv.flowAndCollect$default(fetchVPNInfo().values(), this, null, new LlmOrderFragment$initViewModel$4(this, null), 2, null);
        C52692wUv.flowAndCollect$default(fetchVPNInfo().fARcdN(), this, null, new LlmOrderFragment$initViewModel$5(this, null), 2, null);
        C52692wUv.flowAndCollect$default(fetchVPNInfo().AhwBna(), this, null, new LlmOrderFragment$initViewModel$6(this, null), 2, null);
        C52692wUv.flowAndCollect$default(fetchVPNInfo().fJNWhG(), this, null, new LlmOrderFragment$initViewModel$7(this, null), 2, null);
        if (c55697xoo.isConnected()) {
            fetchVPNInfo().KWHzl();
        }
    }

    public final void copydefault(android.widget.TextView textView) {
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        int iDpInt$default = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.Dmq);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, iDpInt$default, iDpInt$default);
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawables(drawableKWHzl, null, null, null);
    }

    public final void AEQbTJ(android.widget.TextView textView) {
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    public final void AEQbTJ(AbstractC48473uSs abstractC48473uSs) {
        LinearLayoutCompat linearLayoutCompat = abstractC48473uSs.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        EZpvd(linearLayoutCompat, new Function0() { // from class: o.uFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.fJNWhG(this.KWHzl);
            }
        });
        LinearLayoutCompat linearLayoutCompat2 = abstractC48473uSs.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        EZpvd(linearLayoutCompat2, new Function0() { // from class: o.uFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.ejfBZ(this.EZpvd);
            }
        });
        android.widget.TextView textView = abstractC48473uSs.DbNXlk;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        android.widget.TextView textView2 = abstractC48473uSs.values;
        textView2.setOnClickListener(new Activity(textView2, 1000L, this));
        RecyclerView recyclerView = abstractC48473uSs.AYXKKw;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        recyclerView.setAdapter(values());
        recyclerView.addItemDecoration(new C57584ylF(2, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
        LinearLayoutCompat linearLayoutCompat3 = abstractC48473uSs.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        EZpvd(linearLayoutCompat3, new Function0() { // from class: o.uFx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.fARcdN(this.EZpvd);
            }
        });
        LinearLayoutCompat linearLayoutCompat4 = abstractC48473uSs.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
        EZpvd(linearLayoutCompat4, new Function0() { // from class: o.uFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48112uFk.AuCTel(this.KWHzl);
            }
        });
        C52794wYp c52794wYpCopydefault = AhwBna().copydefault();
        if (c52794wYpCopydefault != null) {
            EZpvd(c52794wYpCopydefault, new Function0() { // from class: o.uFp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C48112uFk.fIwbmz(this.copydefault);
                }
            });
        }
    }

    public static final Unit fJNWhG(final C48112uFk c48112uFk) {
        C52755wXd.Application application = C52755wXd.Companion;
        java.util.List<C55276xgr> listFetchVPNInfo = c48112uFk.fetchVPNInfo().fetchVPNInfo();
        androidx.fragment.app.FragmentManager parentFragmentManager = c48112uFk.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        application.AEQbTJ(listFetchVPNInfo, parentFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : null, new Function1() { // from class: o.uFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48112uFk.EZpvd(this.copydefault, (C55276xgr) obj);
            }
        }, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.ffGIBT), (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : new Function2() { // from class: o.uFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C48112uFk.KWHzl((android.widget.ImageView) obj, obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C48112uFk c48112uFk, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        ModelInfoDto modelInfoDto = objOLrzqt instanceof ModelInfoDto ? (ModelInfoDto) objOLrzqt : null;
        if (modelInfoDto != null) {
            c48112uFk.fetchVPNInfo().EZpvd(modelInfoDto);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.widget.ImageView imageView, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(imageView, "");
        int iDp2px$default = C55298xhM.dp2px$default(1.0f, null, 1, null);
        imageView.setPadding(iDp2px$default, iDp2px$default, iDp2px$default, iDp2px$default);
        imageView.setForeground(C33070mpX.KWHzl(C48033uCm.ActionBar.EZpvd));
        Glide.AEQbTJ(imageView.getContext()).KWHzl(obj).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(imageView.getContext())).KWHzl(C52761wXj.TaskDescription.DDxOgT).EZpvd(imageView);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(final C48112uFk c48112uFk) {
        uFI.Application application = uFI.Companion;
        androidx.fragment.app.FragmentManager parentFragmentManager = c48112uFk.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        java.util.List<uCB> value = c48112uFk.fetchVPNInfo().values().getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
        java.util.Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(((uCB) it.next()).copydefault());
        }
        java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.lang.String value2 = c48112uFk.fetchVPNInfo().isConnected().getValue();
        AiHomeDto aiHomeDtoCopydefault = c48112uFk.fetchVPNInfo().copydefault();
        java.lang.Integer numValueOf = aiHomeDtoCopydefault != null ? java.lang.Integer.valueOf(aiHomeDtoCopydefault.isConnected()) : null;
        AiHomeDto aiHomeDtoCopydefault2 = c48112uFk.fetchVPNInfo().copydefault();
        application.AEQbTJ(parentFragmentManager, setOqFWZa, value2, numValueOf, aiHomeDtoCopydefault2 != null ? java.lang.Integer.valueOf(aiHomeDtoCopydefault2.values()) : null, new Function1() { // from class: o.uFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48112uFk.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C48112uFk c48112uFk, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c48112uFk.fetchVPNInfo().EZpvd((java.util.List<uCB>) list);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(C48112uFk c48112uFk) {
        AiHomeDto aiHomeDtoCopydefault = c48112uFk.fetchVPNInfo().copydefault();
        if (aiHomeDtoCopydefault == null) {
            return Unit.INSTANCE;
        }
        MarketSignalConfigUiModel marketSignalConfigUiModelOLrzqt = C48044uCx.copydefault.OLrzqt(aiHomeDtoCopydefault);
        ActivityC48152uGx.Activity activity = ActivityC48152uGx.Companion;
        android.content.Context contextRequireContext = c48112uFk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c48112uFk.fetchVPNInfo.launch(activity.OLrzqt(contextRequireContext, marketSignalConfigUiModelOLrzqt, c48112uFk.fetchVPNInfo().ejfBZ(), c48112uFk.fetchVPNInfo().djBIcL()));
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C48112uFk c48112uFk) {
        java.lang.String strAYXKKw = c48112uFk.fetchVPNInfo().AYXKKw();
        AiOrderReq aiOrderReqDbNXlk = c48112uFk.fetchVPNInfo().DbNXlk();
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = c48112uFk.AhwBna;
        ActivityC48077uEc.Application application = ActivityC48077uEc.Companion;
        android.content.Context contextRequireContext = c48112uFk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activityResultLauncher.launch(application.OLrzqt(contextRequireContext, strAYXKKw, aiOrderReqDbNXlk));
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C48112uFk c48112uFk) {
        TaskDescription taskDescriptionDjBIcL = c48112uFk.djBIcL();
        if (taskDescriptionDjBIcL instanceof TaskDescription.C0975TaskDescription) {
            InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
            android.content.Context contextRequireContext = c48112uFk.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            interfaceC49496upeCopydefault.EZpvd(contextRequireContext, "2", java.lang.Boolean.TRUE);
        } else if (taskDescriptionDjBIcL instanceof TaskDescription.Activity) {
            c48112uFk.fetchVPNInfo().AEQbTJ();
        } else if (!(taskDescriptionDjBIcL instanceof TaskDescription.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.view.View view, Function0<Unit> function0) {
        view.setOnClickListener(new Dialog(view, 1000L, function0, this));
    }
}
