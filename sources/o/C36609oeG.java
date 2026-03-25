package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.bean.InputPanelStyle;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.ObserverSource;
import com.okinc.im.imui.conversationlist.viewmodel.VipGroupStatusViewModel;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.ChatActivityViewModel;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$checkAvailabilityThenProceed$1;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$initTaskHandler$1$2$execute$1;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeViewModelData$20;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeViewModelData$26;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeViewModelData$27;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeViewModelData$28;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeViewModelData$29;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeViewModelData$30;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$observeVipGroupEvent$1;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$onCreateView$3;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$onResume$1;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$onViewCreated$1$1$1;
import com.okinc.im.imui.messageV2.view.MessageListMainFragment$postDelayedWithLifecycle$1;
import com.okinc.im.imui.messageV2.view.MessageListMainViewModel;
import com.okinc.im.imui.messageV2.view.banner.joincall.JoinOnGoingCallFragment;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment;
import com.okinc.im.widgets.inputpanel.InputMode;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC36555odF;
import o.AbstractC37162ood;
import o.C35399nuc;
import o.C36712ogD;
import o.C36774ohM;
import o.C36812ohy;
import o.C36897ojd;
import o.C36913ojt;
import o.InterfaceC35289nsX;
import o.ServiceC37177oos;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oeG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36609oeG extends AbstractC36606oeD {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public ViewOnClickListenerC54939xaY AhwBna;
    public android.app.Dialog AkhnZx;
    public int AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public final InterfaceC56387yDm AxsJAY;
    public Job DbNXlk;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public ViewOnClickListenerC54939xaY fetchVPNInfo;
    public C36603oeA gEmmrt;
    public ActivityResultLauncher<android.content.Intent> gHZMYf;
    public final int getFieldNames;
    public ActivityResultLauncher<java.lang.String[]> getNewProxyInstance;
    public long hDKMBd;
    public boolean isConnected;
    public Function1<? super java.lang.Boolean, Unit> iwGUEr;
    public final InterfaceC56387yDm sSMYrx;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public C33907nKg wlaJM;
    public C35346ntb zLjUOn;
    public final InterfaceC56387yDm zsXlph;

    /* JADX INFO: renamed from: o.oeG$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.oeG$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessageListMainViewModel.RetryEventType.values().length];
            try {
                iArr[MessageListMainViewModel.RetryEventType.RETRY_INIT_CONVERSATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MessageListMainViewModel.RetryEventType.RETRY_MESSAGE_LIST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static final androidx.fragment.app.Fragment AuCTel(C36609oeG c36609oeG) {
        return c36609oeG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.getFieldNames;
    }

    public C36609oeG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$2
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
        this.sSMYrx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MessageListMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChatActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AxsJAY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VipGroupStatusViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.MessageListMainFragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.oeH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36609oeG.uzCIH(this.AEQbTJ);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oeN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36609oeG.isConnected(this.AEQbTJ);
            }
        });
        this.zsXlph = C56392yDr.copydefault(new Function0() { // from class: o.oeJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36609oeG.getNewProxyInstance(this.KWHzl);
            }
        });
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.oeL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36609oeG.iwGUEr(this.AEQbTJ);
            }
        });
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.oeK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36609oeG.hDKMBd(this.OLrzqt);
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.oeM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36609oeG.fJNWhG(this.OLrzqt));
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.oeQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36609oeG.ejfBZ(this.EZpvd));
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.oeO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36609oeG.getFieldNames(this.copydefault));
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.oeR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36609oeG.fARcdN(this.EZpvd));
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.oeP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C36609oeG.fIwbmz(this.EZpvd));
            }
        });
        this.getFieldNames = C35399nuc.Dialog.OxVOHk;
    }

    /* JADX INFO: renamed from: o.oeG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oeG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C36609oeG EZpvd(@NotNull C35241nrc c35241nrc) {
            Intrinsics.checkNotNullParameter(c35241nrc, "");
            C36609oeG c36609oeG = new C36609oeG();
            android.os.Bundle bundleEnsureArguments = c36609oeG.ensureArguments();
            bundleEnsureArguments.putString("channel_id", c35241nrc.OLrzqt());
            bundleEnsureArguments.putString("relation_id", c35241nrc.isConnected());
            bundleEnsureArguments.putParcelable("chat_origin", c35241nrc.KWHzl());
            bundleEnsureArguments.putSerializable(EopTrackEvent.KEY_PAGE_TYPE, c35241nrc.AYXKKw());
            bundleEnsureArguments.putString("ARG_FRAGMENT_RESULT_LISTENER_KEY", c35241nrc.AEQbTJ());
            bundleEnsureArguments.putString("ARG_INPUT_HINT_TEXT", c35241nrc.gEmmrt());
            java.lang.Integer numDjBIcL = c35241nrc.djBIcL();
            if (numDjBIcL != null) {
                bundleEnsureArguments.putInt("ARG_INITIAL_MSG_SEQUENCE", numDjBIcL.intValue());
            }
            InputPanelStyle inputPanelStyleValueOf = c35241nrc.valueOf();
            if (inputPanelStyleValueOf != null) {
                bundleEnsureArguments.putInt("ARG_INPUT_PANEL_STYLE", inputPanelStyleValueOf.getV());
            }
            java.lang.Boolean boolCopydefault = c35241nrc.copydefault();
            if (boolCopydefault != null) {
                bundleEnsureArguments.putBoolean("ARG_ALLOW_MSG_CLICK_ACTIONS", boolCopydefault.booleanValue());
            }
            OKMessage oKMessageAkhnZx = c35241nrc.AkhnZx();
            if (oKMessageAkhnZx != null) {
                bundleEnsureArguments.putParcelable("KEY_TARGET_MESSAGE", oKMessageAkhnZx);
            }
            java.lang.String strFetchVPNInfo = c35241nrc.fetchVPNInfo();
            if (strFetchVPNInfo != null) {
                bundleEnsureArguments.putString("KEY_SEARCH_KEY", strFetchVPNInfo);
            }
            java.lang.String strAhwBna = c35241nrc.AhwBna();
            if (strAhwBna != null) {
                bundleEnsureArguments.putString("KEY_PRE_FILLED_MSG", strAhwBna);
            }
            bundleEnsureArguments.putBoolean("ARG_IS_DISPLAY_USER_INFO", c35241nrc.ejfBZ());
            bundleEnsureArguments.putBoolean("ARG_IS_ENABLE_ADD_BUTTON", c35241nrc.AuCTel());
            bundleEnsureArguments.putBoolean("ARG_IS_ENABLE_STICKER_BUTTON", c35241nrc.fJNWhG());
            bundleEnsureArguments.putBoolean("ARG_IS_ENABLE_VOICE_BUTTON", c35241nrc.fIwbmz());
            bundleEnsureArguments.putBoolean("ARG_IS_DISPLAY_INTERVAL_TIMESTAMP", c35241nrc.values());
            bundleEnsureArguments.putString("ARG_GROUP_ID", c35241nrc.EZpvd());
            bundleEnsureArguments.putString("ARG_TRACKER_SOURCE", c35241nrc.DbNXlk());
            pUU.KWHzl("MessageListMainFragment", "newInstance request: " + c35241nrc);
            return c36609oeG;
        }
    }

    public final MessageListMainViewModel valueOf() {
        return (MessageListMainViewModel) this.sSMYrx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.oeD.AEQbTJ()V */
    public final ChatActivityViewModel AEQbTJ() {
        return (ChatActivityViewModel) this.valueOf.getValue();
    }

    public final VipGroupStatusViewModel DbNXlk() {
        return (VipGroupStatusViewModel) this.AxsJAY.getValue();
    }

    public final OKMessage AYXKKw() {
        return (OKMessage) this.AubY.getValue();
    }

    public static final OKMessage uzCIH(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments == null) {
            arguments = android.os.Bundle.EMPTY;
        }
        return (OKMessage) BundleCompat.getParcelable(arguments, "KEY_TARGET_MESSAGE", OKMessage.class);
    }

    public final ChatOrigin gEmmrt() {
        return (ChatOrigin) this.AYXKKw.getValue();
    }

    public static final ChatOrigin isConnected(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments == null) {
            arguments = android.os.Bundle.EMPTY;
        }
        return (ChatOrigin) BundleCompat.getParcelable(arguments, "chat_origin", ChatOrigin.class);
    }

    public final java.lang.String djBIcL() {
        return (java.lang.String) this.zsXlph.getValue();
    }

    public static final java.lang.String getNewProxyInstance(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_TRACKER_SOURCE");
        }
        return null;
    }

    public final IMPageType AhwBna() {
        return (IMPageType) this.uzCIH.getValue();
    }

    public static final IMPageType iwGUEr(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable(EopTrackEvent.KEY_PAGE_TYPE) : null;
        if (serializable instanceof IMPageType) {
            return (IMPageType) serializable;
        }
        return null;
    }

    private final java.lang.String AuCTelauCTel() {
        return (java.lang.String) this.AuCTelauCTel.getValue();
    }

    public static final java.lang.String hDKMBd(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getString("KEY_SEARCH_KEY");
        }
        return null;
    }

    public final boolean fARcdN() {
        return ((java.lang.Boolean) this.fJNWhG.getValue()).booleanValue();
    }

    public static final boolean fJNWhG(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_DISPLAY_USER_INFO");
        }
        return true;
    }

    public final boolean fJNWhG() {
        return ((java.lang.Boolean) this.fIwbmz.getValue()).booleanValue();
    }

    public static final boolean ejfBZ(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_ENABLE_ADD_BUTTON");
        }
        return false;
    }

    public final boolean fIwbmz() {
        return ((java.lang.Boolean) this.ejfBZ.getValue()).booleanValue();
    }

    public static final boolean getFieldNames(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_ENABLE_VOICE_BUTTON");
        }
        return false;
    }

    public final boolean AuCTel() {
        return ((java.lang.Boolean) this.fARcdN.getValue()).booleanValue();
    }

    public static final boolean fARcdN(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_ENABLE_STICKER_BUTTON");
        }
        return false;
    }

    public final boolean ejfBZ() {
        return ((java.lang.Boolean) this.values.getValue()).booleanValue();
    }

    public static final boolean fIwbmz(C36609oeG c36609oeG) {
        android.os.Bundle arguments = c36609oeG.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_DISPLAY_INTERVAL_TIMESTAMP");
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AhwBna;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        this.AhwBna = null;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.fetchVPNInfo;
        if (viewOnClickListenerC54939xaY2 != null) {
            viewOnClickListenerC54939xaY2.dismiss();
        }
        this.fetchVPNInfo = null;
        android.app.Dialog dialog = this.AkhnZx;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.AkhnZx = null;
        this.wlaJM = null;
        this.gEmmrt = null;
        C35346ntb c35346ntb = this.zLjUOn;
        if (c35346ntb != null) {
            c35346ntb.EZpvd();
        }
        this.zLjUOn = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C35346ntb c35346ntb = this.zLjUOn;
        if (c35346ntb != null) {
            c35346ntb.KWHzl();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C35346ntb c35346ntb = this.zLjUOn;
        if (c35346ntb != null) {
            c35346ntb.AEQbTJ();
        }
    }

    public final void copydefault(int i) {
        android.widget.FrameLayout root;
        C55284xgz c55284xgzKWHzl;
        java.lang.String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (root = c33907nKg.getRoot()) == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(root, string)) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(0);
        c55284xgzKWHzl.djBIcL(0);
        c55284xgzKWHzl.AEQbTJ(string);
        C33907nKg c33907nKg2 = this.wlaJM;
        c55284xgzKWHzl.AEQbTJ(c33907nKg2 != null ? c33907nKg2.DbNXlk : null);
        c55284xgzKWHzl.hDKMBd();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.getNewProxyInstance = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.ofy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C36609oeG.EZpvd(this.KWHzl, (java.util.Map) obj);
            }
        });
        this.gHZMYf = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.ofz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C36609oeG.KWHzl(this.KWHzl, (ActivityResult) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MessageListMainFragment$onCreateView$3(this, null), 3, null);
        C33907nKg c33907nKgOLrzqt = C33907nKg.OLrzqt(layoutInflater, viewGroup, false);
        this.wlaJM = c33907nKgOLrzqt;
        if (c33907nKgOLrzqt != null) {
            return c33907nKgOLrzqt.getRoot();
        }
        return null;
    }

    public static final void EZpvd(C36609oeG c36609oeG, java.util.Map map) {
        boolean z;
        Intrinsics.copydefault(map);
        if (map.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!((java.lang.Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        Function1<? super java.lang.Boolean, Unit> function1 = c36609oeG.iwGUEr;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        c36609oeG.iwGUEr = null;
    }

    public static final void KWHzl(C36609oeG c36609oeG, ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        boolean z = activityResult.getResultCode() == 1;
        java.lang.String stringExtra = data != null ? data.getStringExtra("key_audio_call_target_id") : null;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = data != null ? data.getStringArrayListExtra("key_group_call_target_uid_list") : null;
        if (z && stringExtra != null) {
            c36609oeG.EZpvd(stringExtra, stringArrayListExtra);
        } else {
            c36609oeG.copydefault(C35399nuc.LoaderManager.vLaW);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C35290nsY.AEQbTJ(this, ObserverSource.MessageListMainFragment, (Function1<? super java.util.ArrayList<GeneralAction>, Unit>) new Function1() { // from class: o.oeE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.EZpvd(this.EZpvd, (java.util.ArrayList) obj);
            }
        });
        sEF sef = sEF.OLrzqt;
        ReportManager reportManager = ReportManager.AEQbTJ;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg("ConversationPage");
        eventDataAEQbTJ.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", "true")));
        Unit unit = Unit.INSTANCE;
        sef.EZpvd(reportManager, eventDataAEQbTJ);
        iwGUEr();
        getFieldNames();
        MessageListMainViewModel messageListMainViewModelValueOf = valueOf();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("channel_id") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("relation_id") : null;
        ChatOrigin chatOriginGEmmrt = gEmmrt();
        IMPageType iMPageTypeAhwBna = AhwBna();
        android.os.Bundle arguments3 = getArguments();
        messageListMainViewModelValueOf.copydefault(string, string2, chatOriginGEmmrt, iMPageTypeAhwBna, arguments3 != null ? arguments3.getString("ARG_GROUP_ID") : null, java.lang.Boolean.valueOf(fARcdN()));
        C36603oeA c36603oeA = new C36603oeA(gEmmrt(), djBIcL());
        c36603oeA.OLrzqt();
        this.gEmmrt = c36603oeA;
        getChildFragmentManager().setFragmentResultListener("VOICE_BOARD_REQUEST_CODE", this, new FragmentResultListener() { // from class: o.oeS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C36609oeG.AubY(this.AEQbTJ, str, bundle2);
            }
        });
    }

    public static final void AubY(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.valueOf().KWHzl(bundle.getBoolean("VOICE_BOARD_RESULT_CODE", false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oeG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestStartVoiceCall$default(C36609oeG c36609oeG, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        c36609oeG.EZpvd((java.util.List<java.lang.String>) list);
    }

    public final void EZpvd(java.util.List<java.lang.String> list) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - this.hDKMBd < 1000) {
            return;
        }
        this.hDKMBd = jCurrentTimeMillis;
        OKConversation value = valueOf().valueOf().getValue();
        java.lang.String targetId = value != null ? value.getTargetId() : null;
        if (targetId == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) targetId)) {
            copydefault(C35399nuc.LoaderManager.vLaW);
            return;
        }
        OKConversation value2 = valueOf().valueOf().getValue();
        if ((value2 != null ? value2.getConversationType() : null) == OKConversationType.GROUP) {
            KWHzl(targetId, list);
        }
    }

    public final void KWHzl(final java.lang.String str, final java.util.List<java.lang.String> list) {
        OKConversation value = valueOf().valueOf().getValue();
        ActivityResultLauncher<java.lang.String[]> activityResultLauncher = null;
        if ((value != null ? value.getConversationType() : null) == OKConversationType.GROUP) {
            java.lang.String[] strArrOLrzqt = C37724ozI.EZpvd.OLrzqt();
            if (C60121zwJ.KWHzl(requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length))) {
                OLrzqt(str, list);
                return;
            }
            this.iwGUEr = new Function1() { // from class: o.ofE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36609oeG.OLrzqt(this.KWHzl, str, list, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            ActivityResultLauncher<java.lang.String[]> activityResultLauncher2 = this.getNewProxyInstance;
            if (activityResultLauncher2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                activityResultLauncher = activityResultLauncher2;
            }
            activityResultLauncher.launch(strArrOLrzqt);
        }
    }

    public static final Unit OLrzqt(C36609oeG c36609oeG, java.lang.String str, java.util.List list, boolean z) {
        if (z) {
            c36609oeG.OLrzqt(str, (java.util.List<java.lang.String>) list);
        } else {
            C37127onv.AEQbTJ.AhwBna().copydefault(false);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str, java.util.List<java.lang.String> list) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MessageListMainFragment$checkAvailabilityThenProceed$1(this, str, list, null), 3, null);
    }

    public final void copydefault(final java.lang.String str, final java.util.List<java.lang.String> list) {
        OKConversation value = valueOf().valueOf().getValue();
        ActivityResultLauncher<java.lang.String[]> activityResultLauncher = null;
        if ((value != null ? value.getConversationType() : null) == OKConversationType.GROUP) {
            java.lang.String[] strArrOLrzqt = C37724ozI.EZpvd.OLrzqt();
            if (C60121zwJ.KWHzl(requireContext(), (java.lang.String[]) java.util.Arrays.copyOf(strArrOLrzqt, strArrOLrzqt.length))) {
                AEQbTJ(str, list);
                return;
            }
            this.iwGUEr = new Function1() { // from class: o.ofL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36609oeG.EZpvd(this.OLrzqt, str, list, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            ActivityResultLauncher<java.lang.String[]> activityResultLauncher2 = this.getNewProxyInstance;
            if (activityResultLauncher2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                activityResultLauncher = activityResultLauncher2;
            }
            activityResultLauncher.launch(strArrOLrzqt);
        }
    }

    public static final Unit EZpvd(C36609oeG c36609oeG, java.lang.String str, java.util.List list, boolean z) {
        if (z) {
            c36609oeG.AEQbTJ(str, (java.util.List<java.lang.String>) list);
        } else {
            C37127onv.AEQbTJ.AhwBna().copydefault(false);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, java.util.List<java.lang.String> list) {
        java.lang.String string;
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        if (!c43453rpa.KWHzl(c32979mnm.OLrzqt())) {
            copydefault(C35399nuc.LoaderManager.vLaW);
            return;
        }
        C37127onv c37127onv = C37127onv.AEQbTJ;
        InterfaceC35259nru interfaceC35259nruAhwBna = c37127onv.AhwBna();
        boolean zKWHzl = interfaceC35259nruAhwBna.KWHzl();
        OKCallSession second = interfaceC35259nruAhwBna.OLrzqt().getSecond();
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = null;
        java.lang.String targetId = second != null ? second.getTargetId() : null;
        if (zKWHzl && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) targetId)) {
            android.content.res.Resources resources = c32979mnm.OLrzqt().getResources();
            if (resources == null || (string = resources.getString(C35399nuc.LoaderManager.zKcAg)) == null) {
                return;
            }
            c37127onv.copydefault(string);
            return;
        }
        OKConversation value = valueOf().valueOf().getValue();
        java.lang.String contactId = value != null ? value.getContactId() : null;
        if (contactId == null) {
            contactId = "";
        }
        android.content.Intent intentOLrzqt = ActivityC42573rXw.Companion.OLrzqt(c32979mnm.OLrzqt());
        intentOLrzqt.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("key_audio_call_target_id", str), C56390yDp.OLrzqt("key_audio_call_contact_id", contactId), C56390yDp.OLrzqt("key_group_call_target_uid_list", list)));
        ActivityResultLauncher<android.content.Intent> activityResultLauncher2 = this.gHZMYf;
        if (activityResultLauncher2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            activityResultLauncher = activityResultLauncher2;
        }
        activityResultLauncher.launch(intentOLrzqt);
    }

    public final void EZpvd(java.lang.String str, java.util.List<java.lang.String> list) {
        AbstractC37162ood actionBar;
        C37127onv.AEQbTJ.AhwBna().copydefault(true);
        if (list == null || list.isEmpty()) {
            actionBar = new AbstractC37162ood.ActionBar(str, null, null, null, 14, null);
        } else {
            actionBar = new AbstractC37162ood.LoaderManager(str, list, null, null, null, 28, null);
        }
        pUU.KWHzl(getTAG(), "Request for group voice call is " + actionBar);
        ServiceC37177oos.StateListAnimator stateListAnimator = ServiceC37177oos.Companion;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        c32979mnm.OLrzqt().startService(stateListAnimator.copydefault(c32979mnm.OLrzqt(), actionBar));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final android.view.View viewFindViewById = requireActivity().findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.oeV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                return C36609oeG.EZpvd(this.copydefault, viewFindViewById, view2, windowInsetsCompat);
            }
        });
        viewFindViewById.post(new java.lang.Runnable() { // from class: o.oeX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36609oeG.EZpvd(viewFindViewById);
            }
        });
    }

    public static final WindowInsetsCompat EZpvd(final C36609oeG c36609oeG, android.view.View view, android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        final boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
        int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        Job job = c36609oeG.DbNXlk;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Intrinsics.copydefault(view);
        final int i3 = i2 - i;
        c36609oeG.DbNXlk = c36609oeG.EZpvd(view, 150L, new Function0() { // from class: o.oeT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36609oeG.AEQbTJ(zIsVisible, c36609oeG, i3);
            }
        });
        return windowInsetsCompat;
    }

    public static final Unit AEQbTJ(boolean z, C36609oeG c36609oeG, int i) {
        if (z) {
            if (!c36609oeG.isConnected || c36609oeG.AuCTel != i) {
                c36609oeG.KWHzl(i);
            }
            c36609oeG.AuCTel = i;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c36609oeG), null, null, new MessageListMainFragment$onViewCreated$1$1$1(c36609oeG, i, null), 3, null);
        } else if ((c36609oeG.valueOf().fetchVPNInfo().getSecond() == InputMode.TextInput && c36609oeG.isConnected) || c36609oeG.valueOf().fetchVPNInfo().getSecond() == InputMode.DefaultMode) {
            c36609oeG.values();
        }
        c36609oeG.isConnected = z;
        return Unit.INSTANCE;
    }

    public static final void EZpvd(android.view.View view) {
        ViewCompat.requestApplyInsets(view);
    }

    public final void KWHzl(int i) {
        android.widget.LinearLayout linearLayout;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (linearLayout = c33907nKg.EZpvd) == null) {
            return;
        }
        linearLayout.getLayoutParams().height = i;
        linearLayout.setVisibility(0);
        linearLayout.requestLayout();
        linearLayout.invalidate();
    }

    public final void values() {
        android.widget.LinearLayout linearLayout;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (linearLayout = c33907nKg.EZpvd) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void EZpvd(IMPageType iMPageType, OKConversation oKConversation) {
        java.lang.String targetId = oKConversation.getTargetId();
        OKConversationType conversationType = oKConversation.getConversationType();
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionOLrzqt = OLrzqt(KWHzl(EZpvd(djBIcL(AEQbTJ(AEQbTJ(OLrzqt(KWHzl(EZpvd(KWHzl(AYXKKw(copydefault(AEQbTJ(AEQbTJ(fragmentTransactionBeginTransaction, targetId), targetId, conversationType), targetId), targetId), targetId, iMPageType), targetId, iMPageType), targetId, conversationType), targetId, iMPageType), oKConversation, iMPageType), targetId, iMPageType), targetId), targetId), targetId), targetId);
        android.os.Bundle arguments = getArguments();
        copydefault(copydefault(fragmentTransactionOLrzqt, targetId, conversationType, arguments != null ? arguments.getString("KEY_PRE_FILLED_MSG") : null), targetId, iMPageType).commitAllowingStateLoss();
        OLrzqt(iMPageType, oKConversation);
        C35346ntb c35346ntb = this.zLjUOn;
        if (c35346ntb != null) {
            c35346ntb.copydefault();
        }
    }

    public final void OLrzqt(IMPageType iMPageType, OKConversation oKConversation) {
        android.os.Bundle extras;
        C35346ntb c35346ntbInvoke;
        android.content.Intent intent;
        C35285nsT c35285nsTKWHzl = C36596odu.copydefault.KWHzl(iMPageType);
        C35346ntb c35346ntb = null;
        Function1<C35354ntj, C35346ntb> function1GEmmrt = c35285nsTKWHzl != null ? c35285nsTKWHzl.gEmmrt() : null;
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null) {
            extras = android.os.Bundle.EMPTY;
        }
        Intrinsics.copydefault(extras);
        C35354ntj c35354ntj = new C35354ntj(oKConversation, extras);
        if (function1GEmmrt != null && (c35346ntbInvoke = function1GEmmrt.invoke(c35354ntj)) != null) {
            c35346ntbInvoke.OLrzqt(new Function0() { // from class: o.ofC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C36609oeG.AuCTel(this.AEQbTJ);
                }
            }, new TaskDescription());
            c35346ntb = c35346ntbInvoke;
        }
        this.zLjUOn = c35346ntb;
    }

    /* JADX INFO: renamed from: o.oeG$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription implements InterfaceC35289nsX {
        public TaskDescription() {
        }

        @Override // o.InterfaceC35289nsX
        public void KWHzl(GeneralAction generalAction) {
            InterfaceC35289nsX.ActionBar.OLrzqt(this, generalAction);
        }

        @Override // o.InterfaceC35289nsX
        public void AEQbTJ(java.util.List<? extends GeneralAction> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C36609oeG.this), null, null, new MessageListMainFragment$initTaskHandler$1$2$execute$1(C36609oeG.this, list, null), 3, null);
        }
    }

    public final void iwGUEr() {
        C34032nOx c34032nOx;
        C55173xeu c55173xeu;
        valueOf().isConnected().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg != null && (c34032nOx = c33907nKg.hDKMBd) != null && (c55173xeu = c34032nOx.EZpvd) != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ofk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36609oeG.KWHzl(this.OLrzqt, view);
                }
            });
        }
        valueOf().valueOf().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.KWHzl(this.AEQbTJ, (OKConversation) obj);
            }
        }));
        valueOf().fIwbmz().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.EZpvd(this.copydefault, (Unit) obj);
            }
        }));
        valueOf().getNewProxyInstance().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.OLrzqt(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        valueOf().QVAiDq().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.AYXKKw(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().uzCIH().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.oft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.KWHzl(this.OLrzqt, (StringResource) obj);
            }
        }));
        valueOf().QfsBiF().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.DbNXlk(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        valueOf().AwvSrB().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.fetchVPNInfo(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        valueOf().OcIXYQ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.AkhnZx(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().DTwDnp().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.oeZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.values(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().AkhnZx().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.copydefault(this.AEQbTJ, (Unit) obj);
            }
        }));
        valueOf().getFieldNames().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.oeY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.copydefault(this.KWHzl, (MessageListMainViewModel.RetryEventType) obj);
            }
        }));
        valueOf().gEmmrt().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.OLrzqt(this.KWHzl, (StringResource) obj);
            }
        }));
        valueOf().hDKMBd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }));
        valueOf().DbNXlk().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.KWHzl(this.AEQbTJ, (AbstractC36555odF) obj);
            }
        }));
        valueOf().AhwBna().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.off
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.djBIcL(this.copydefault, (Unit) obj);
            }
        }));
        valueOf().iwGUEr().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.EZpvd(this.KWHzl, (C32989mnw) obj);
            }
        }));
        valueOf().gHZMYf().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.isConnected(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        SharedFlow<java.lang.Boolean> sharedFlowFARcdN = valueOf().fARcdN();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowFARcdN, viewLifecycleOwner, (Lifecycle.State) null, new MessageListMainFragment$observeViewModelData$20(this, null), 2, (java.lang.Object) null);
        valueOf().QUSxYX().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.fIwbmz(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        valueOf().dNCPSb().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.fARcdN(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        valueOf().QKVWgx().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.fJNWhG(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        valueOf().fJNWhG().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.OLrzqt(this.KWHzl, (AbstractC35281nsP) obj);
            }
        }));
        valueOf().ejfBZ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.ofo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.KWHzl(this.EZpvd, (AbstractC35281nsP) obj);
            }
        }));
        SharedFlow<java.lang.Boolean> sharedFlowAxsJAY = valueOf().AxsJAY();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowAxsJAY, viewLifecycleOwner2, (Lifecycle.State) null, new MessageListMainFragment$observeViewModelData$26(this, null), 2, (java.lang.Object) null);
        SharedFlow<java.lang.Boolean> sharedFlowAubY = valueOf().AubY();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowAubY, viewLifecycleOwner3, (Lifecycle.State) null, new MessageListMainFragment$observeViewModelData$27(this, null), 2, (java.lang.Object) null);
        MutableSharedFlow<Unit> mutableSharedFlowAuCTel = valueOf().AuCTel();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C37721ozF.collectOnLifecycle$default(mutableSharedFlowAuCTel, viewLifecycleOwner4, (Lifecycle.State) null, new MessageListMainFragment$observeViewModelData$28(this, null), 2, (java.lang.Object) null);
        SharedFlow<GroupInfo> sharedFlowValues = valueOf().values();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowValues, viewLifecycleOwner5, (Lifecycle.State) null, new MessageListMainFragment$observeViewModelData$29(this, null), 2, (java.lang.Object) null);
        MutableSharedFlow<Unit> mutableSharedFlowAYXKKw = valueOf().AYXKKw();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        C37721ozF.collectOnLifecycle$default(mutableSharedFlowAYXKKw, viewLifecycleOwner6, (Lifecycle.State) null, new MessageListMainFragment$observeViewModelData$30(null), 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(C36609oeG c36609oeG, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C35290nsY.copydefault(c36609oeG, (java.util.List<? extends GeneralAction>) list);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C36609oeG c36609oeG, android.view.View view) {
        pUU.KWHzl("MessageListMainFragment", "sectionRetryBanner retry clicked");
        c36609oeG.valueOf().dxcTrN();
    }

    public static final Unit KWHzl(C36609oeG c36609oeG, OKConversation oKConversation) {
        pUU.KWHzl("MessageListMainFragment", "conversation update: " + (oKConversation != null ? oKConversation.getTargetId() : null));
        if (oKConversation != null) {
            C36603oeA c36603oeA = c36609oeG.gEmmrt;
            if (c36603oeA != null) {
                c36603oeA.AEQbTJ(oKConversation);
            }
            c36609oeG.AEQbTJ(oKConversation);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36609oeG c36609oeG, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c36609oeG.getChildFragmentManager().setFragmentResult("FRAGMENT_RESULT_KEY_REFRESH_INFO_COMPLETED", BundleKt.bundleOf());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36609oeG c36609oeG, java.lang.Integer num) {
        C36603oeA c36603oeA;
        pUU.KWHzl("MessageListMainFragment", "relationSourceType update: " + num);
        if (num != null && (c36603oeA = c36609oeG.gEmmrt) != null) {
            c36603oeA.copydefault(num.intValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C36609oeG c36609oeG, java.lang.Boolean bool) {
        C34032nOx c34032nOx;
        android.widget.FrameLayout frameLayout;
        pUU.KWHzl("MessageListMainFragment", "isRetrySectionVisible update: " + bool);
        C33907nKg c33907nKg = c36609oeG.wlaJM;
        if (c33907nKg != null && (c34032nOx = c33907nKg.hDKMBd) != null && (frameLayout = c34032nOx.copydefault) != null) {
            frameLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36609oeG c36609oeG, StringResource stringResource) {
        C34032nOx c34032nOx;
        C55173xeu c55173xeu;
        java.lang.String str = "";
        if (stringResource != null) {
            android.content.Context contextRequireContext = c36609oeG.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.lang.String strAEQbTJ = C36563odN.AEQbTJ(stringResource, contextRequireContext);
            if (strAEQbTJ != null) {
                str = strAEQbTJ;
            }
        }
        pUU.KWHzl("MessageListMainFragment", "retryMessage update: " + str);
        C33907nKg c33907nKg = c36609oeG.wlaJM;
        if (c33907nKg != null && (c34032nOx = c33907nKg.hDKMBd) != null && (c55173xeu = c34032nOx.EZpvd) != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C36609oeG c36609oeG, java.lang.Boolean bool) {
        C34032nOx c34032nOx;
        C55173xeu c55173xeu;
        pUU.KWHzl("MessageListMainFragment", "isRetryButtonVisible update: " + bool);
        C33907nKg c33907nKg = c36609oeG.wlaJM;
        if (c33907nKg != null && (c34032nOx = c33907nKg.hDKMBd) != null && (c55173xeu = c34032nOx.EZpvd) != null) {
            java.lang.String string = bool.booleanValue() ? c36609oeG.getString(C35399nuc.LoaderManager.QFTsTN) : "";
            Intrinsics.copydefault((java.lang.Object) string);
            c55173xeu.setRetry(string);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C36609oeG c36609oeG, java.lang.Boolean bool) {
        pUU.KWHzl("MessageListMainFragment", "isLegacyLoading update: " + bool);
        Intrinsics.copydefault(bool);
        c36609oeG.EZpvd(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C36609oeG c36609oeG, java.lang.Boolean bool) {
        pUU.KWHzl("MessageListMainFragment", "isLoading update: " + bool);
        Intrinsics.copydefault(bool);
        c36609oeG.EZpvd(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit values(C36609oeG c36609oeG, java.lang.Boolean bool) {
        pUU.KWHzl("MessageListMainFragment", "isLoadingWithTransparent update: " + bool);
        Intrinsics.copydefault(bool);
        c36609oeG.EZpvd(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36609oeG c36609oeG, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("MessageListMainFragment", "finishActivityEvent received");
        FragmentActivity activity = c36609oeG.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C36609oeG c36609oeG, MessageListMainViewModel.RetryEventType retryEventType) {
        Intrinsics.checkNotNullParameter(retryEventType, "");
        pUU.KWHzl("MessageListMainFragment", "retryEvent updated: " + retryEventType);
        int i = StateListAnimator.EZpvd[retryEventType.ordinal()];
        if (i == 1) {
            MessageListMainViewModel messageListMainViewModelValueOf = c36609oeG.valueOf();
            android.os.Bundle arguments = c36609oeG.getArguments();
            java.lang.String string = arguments != null ? arguments.getString("channel_id") : null;
            android.os.Bundle arguments2 = c36609oeG.getArguments();
            java.lang.String string2 = arguments2 != null ? arguments2.getString("relation_id") : null;
            ChatOrigin chatOriginGEmmrt = c36609oeG.gEmmrt();
            IMPageType iMPageTypeAhwBna = c36609oeG.AhwBna();
            android.os.Bundle arguments3 = c36609oeG.getArguments();
            messageListMainViewModelValueOf.copydefault(string, string2, chatOriginGEmmrt, iMPageTypeAhwBna, arguments3 != null ? arguments3.getString("ARG_GROUP_ID") : null, java.lang.Boolean.valueOf(c36609oeG.fARcdN()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            androidx.fragment.app.Fragment fragmentFindFragmentById = c36609oeG.getChildFragmentManager().findFragmentById(C35399nuc.StateListAnimator.iqeXgQ);
            MessageListFragment messageListFragment = fragmentFindFragmentById instanceof MessageListFragment ? (MessageListFragment) fragmentFindFragmentById : null;
            if (messageListFragment != null) {
                messageListFragment.fARcdN();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36609oeG c36609oeG, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(stringResource, "");
        android.content.Context contextRequireContext = c36609oeG.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55326xho.copydefault(C36563odN.AEQbTJ(stringResource, contextRequireContext), 1);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36609oeG c36609oeG, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextRequireContext = c36609oeG.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c36609oeG.EZpvd(contextRequireContext, str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36609oeG c36609oeG, AbstractC36555odF abstractC36555odF) {
        Intrinsics.checkNotNullParameter(abstractC36555odF, "");
        pUU.KWHzl("MessageListMainFragment", "initConversationSuccess event received: " + abstractC36555odF);
        if (abstractC36555odF instanceof AbstractC36555odF.StateListAnimator) {
            AbstractC36555odF.StateListAnimator stateListAnimator = (AbstractC36555odF.StateListAnimator) abstractC36555odF;
            FragmentKt.setFragmentResult(c36609oeG, "KEY_MESSAGE_LIST_REQUEST", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_INIT_SUCCESS", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("KEY_CONVERSATION", stateListAnimator.OLrzqt()), C56390yDp.OLrzqt("KEY_PAGE_TYPE", stateListAnimator.KWHzl())));
            c36609oeG.EZpvd(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt());
            c36609oeG.valueOf().EZpvd();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36609oeG, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            if (!(abstractC36555odF instanceof AbstractC36555odF.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC36555odF.TaskDescription taskDescription = (AbstractC36555odF.TaskDescription) abstractC36555odF;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.EZpvd())) {
                C55326xho.toastWithFailedIcon$default(taskDescription.EZpvd(), 0, 1, (java.lang.Object) null);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36609oeG, false, (java.lang.String) null, 2, (java.lang.Object) null);
            FragmentKt.setFragmentResult(c36609oeG, "KEY_MESSAGE_LIST_REQUEST", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_INIT_SUCCESS", java.lang.Boolean.FALSE)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C36609oeG c36609oeG, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("MessageListMainFragment", "displayAppUpdateDialog event received");
        c36609oeG.wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C36609oeG c36609oeG, C32989mnw c32989mnw) {
        pUU.KWHzl("MessageListMainFragment", "editContactInfoDialog received");
        c36609oeG.uzCIH();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C36609oeG c36609oeG, java.lang.Boolean bool) {
        FragmentContainerView fragmentContainerView;
        C33907nKg c33907nKg = c36609oeG.wlaJM;
        if (c33907nKg != null && (fragmentContainerView = c33907nKg.DbNXlk) != null) {
            fragmentContainerView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C36609oeG c36609oeG, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c36609oeG.hDKMBd();
        } else {
            c36609oeG.AkhnZx();
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(C36609oeG c36609oeG, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c36609oeG.AubY();
        } else {
            c36609oeG.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(C36609oeG c36609oeG, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c36609oeG.getNewProxyInstance();
        } else {
            c36609oeG.isConnected();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C36609oeG c36609oeG, AbstractC35281nsP abstractC35281nsP) {
        if (abstractC35281nsP == null) {
            pUU.KWHzl("MessageListMainFragment", "messageListTopSlotOneFragment update: null");
            androidx.fragment.app.Fragment fragmentFindFragmentById = c36609oeG.getChildFragmentManager().findFragmentById(C35399nuc.StateListAnimator.ikIEnW);
            if (fragmentFindFragmentById != null) {
                c36609oeG.getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
            }
        } else {
            pUU.KWHzl("MessageListMainFragment", "messageListTopSlotOneFragment update: not null");
            c36609oeG.getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.ikIEnW, abstractC35281nsP).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C36609oeG c36609oeG, AbstractC35281nsP abstractC35281nsP) {
        if (abstractC35281nsP == null) {
            androidx.fragment.app.Fragment fragmentFindFragmentById = c36609oeG.getChildFragmentManager().findFragmentById(C35399nuc.StateListAnimator.HJWChPUUMfbK);
            if (fragmentFindFragmentById != null) {
                c36609oeG.getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
            }
        } else {
            c36609oeG.getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.HJWChPUUMfbK, abstractC35281nsP).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public final void getFieldNames() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MessageListMainFragment$observeVipGroupEvent$1(this, null), 3, null);
        valueOf().wlaJM().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }));
        valueOf().zsXlph().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.ofA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36609oeG.AEQbTJ(this.copydefault, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final Unit copydefault(C36609oeG c36609oeG, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithSuccessfulIcon$default(C33069mpW.copydefault(c36609oeG, C35399nuc.LoaderManager.NRYds, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str))), 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C36609oeG c36609oeG, long j) {
        C37107onb.Companion.KWHzl(j).show(c36609oeG.getParentFragmentManager(), c36609oeG.getTAG());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(OKConversation oKConversation) {
        android.widget.ImageView imageView;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (imageView = c33907nKg.copydefault) == null) {
            return;
        }
        android.view.View view = c33907nKg != null ? c33907nKg.sSMYrx : null;
        if (C44170sFx.AEQbTJ(oKConversation)) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.lang.String strCopydefault = C43454rpb.copydefault("images/im/vip_bg_chat.webp", contextRequireContext, true);
            imageView.setVisibility(0);
            C33054mpH.loadUrl$default(imageView, strCopydefault, null, 0, 0, 14, null);
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        imageView.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void getNewProxyInstance() {
        FragmentContainerView fragmentContainerView;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (fragmentContainerView = c33907nKg.fIwbmz) == null) {
            return;
        }
        showSection$default(this, fragmentContainerView, null, 2, null);
    }

    public final void isConnected() {
        FragmentContainerView fragmentContainerView;
        FragmentContainerView fragmentContainerView2;
        if (valueOf().fetchVPNInfo().getFirst() == InputMode.PluginMode && valueOf().fetchVPNInfo().getSecond() == InputMode.TextInput) {
            C33907nKg c33907nKg = this.wlaJM;
            if (c33907nKg != null && (fragmentContainerView2 = c33907nKg.fIwbmz) != null) {
                fragmentContainerView2.setVisibility(4);
            }
        } else {
            C33907nKg c33907nKg2 = this.wlaJM;
            if (c33907nKg2 != null && (fragmentContainerView = c33907nKg2.fIwbmz) != null) {
                fragmentContainerView.setVisibility(8);
            }
        }
        if (valueOf().fetchVPNInfo().getSecond() == InputMode.DefaultMode) {
            values();
        }
    }

    public final void AubY() {
        FragmentContainerView fragmentContainerView;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (fragmentContainerView = c33907nKg.zLjUOn) == null) {
            return;
        }
        showSection$default(this, fragmentContainerView, null, 2, null);
    }

    public static /* synthetic */ void showSection$default(C36609oeG c36609oeG, android.view.View view, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        c36609oeG.EZpvd(view, num);
    }

    public final void EZpvd(android.view.View view, java.lang.Integer num) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams;
        android.widget.LinearLayout linearLayout3;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg != null && (linearLayout3 = c33907nKg.EZpvd) != null) {
            linearLayout3.setVisibility(0);
        }
        C33907nKg c33907nKg2 = this.wlaJM;
        if (c33907nKg2 != null && (linearLayout2 = c33907nKg2.EZpvd) != null && (layoutParams = linearLayout2.getLayoutParams()) != null) {
            layoutParams.height = num != null ? num.intValue() : -2;
        }
        C33907nKg c33907nKg3 = this.wlaJM;
        if (c33907nKg3 != null && (linearLayout = c33907nKg3.EZpvd) != null) {
            linearLayout.requestLayout();
        }
        view.setVisibility(0);
        view.getLayoutParams().height = num != null ? num.intValue() : -2;
        view.requestLayout();
    }

    public final void fetchVPNInfo() {
        FragmentContainerView fragmentContainerView;
        FragmentContainerView fragmentContainerView2;
        if (valueOf().fetchVPNInfo().getFirst() == InputMode.VoiceInput && valueOf().fetchVPNInfo().getSecond() == InputMode.TextInput) {
            C33907nKg c33907nKg = this.wlaJM;
            if (c33907nKg != null && (fragmentContainerView2 = c33907nKg.zLjUOn) != null) {
                fragmentContainerView2.setVisibility(4);
            }
        } else {
            C33907nKg c33907nKg2 = this.wlaJM;
            if (c33907nKg2 != null && (fragmentContainerView = c33907nKg2.zLjUOn) != null) {
                fragmentContainerView.setVisibility(8);
            }
        }
        if (valueOf().fetchVPNInfo().getSecond() == InputMode.DefaultMode) {
            values();
        }
    }

    public final void hDKMBd() {
        FragmentContainerView fragmentContainerView;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (fragmentContainerView = c33907nKg.uzCIH) == null) {
            return;
        }
        EZpvd(fragmentContainerView, java.lang.Integer.valueOf(C55298xhM.dp2px$default(300.0f, null, 1, null)));
    }

    public final void AkhnZx() {
        FragmentContainerView fragmentContainerView;
        FragmentContainerView fragmentContainerView2;
        if (valueOf().fetchVPNInfo().getFirst() == InputMode.StickerMode && valueOf().fetchVPNInfo().getSecond() == InputMode.TextInput) {
            C33907nKg c33907nKg = this.wlaJM;
            if (c33907nKg != null && (fragmentContainerView2 = c33907nKg.uzCIH) != null) {
                fragmentContainerView2.setVisibility(4);
            }
        } else {
            C33907nKg c33907nKg2 = this.wlaJM;
            if (c33907nKg2 != null && (fragmentContainerView = c33907nKg2.uzCIH) != null) {
                fragmentContainerView.setVisibility(8);
            }
        }
        if (valueOf().fetchVPNInfo().getSecond() == InputMode.DefaultMode) {
            values();
        }
    }

    public final void EZpvd(boolean z) {
        C34030nOv c34030nOv;
        C33907nKg c33907nKg = this.wlaJM;
        if (c33907nKg == null || (c34030nOv = c33907nKg.isConnected) == null) {
            return;
        }
        android.widget.FrameLayout root = c34030nOv.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(z ? 0 : 8);
        if (z) {
            C55113xdn.showLoading$default(c34030nOv.OLrzqt, 0L, 1, null);
        } else {
            c34030nOv.OLrzqt.copydefault();
        }
    }

    public final void EZpvd(android.content.Context context, java.lang.String str) {
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C35399nuc.LoaderManager.QVAiDq, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", str)));
        android.app.Dialog dialog = this.AkhnZx;
        if (dialog != null) {
            dialog.dismiss();
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(strCopydefault);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.QbewEr);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.DCUTEI, (View.OnClickListener) null, 2, (java.lang.Object) null);
        this.AkhnZx = viewOnClickListenerC54939xaY;
        viewOnClickListenerC54939xaY.show();
    }

    public final androidx.fragment.app.FragmentTransaction AEQbTJ(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPURsaBn, JoinOnGoingCallFragment.Companion.AEQbTJ(str));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction copydefault(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        C36712ogD.Activity activity = C36712ogD.Companion;
        C36712ogD c36712ogDAEQbTJ = activity.AEQbTJ("FRAGMENT_RESULT_KEY_GROUP_ANNOUNCEMENT_BANNER", str);
        getChildFragmentManager().setFragmentResultListener(activity.KWHzl("FRAGMENT_RESULT_KEY_GROUP_ANNOUNCEMENT_BANNER"), this, new FragmentResultListener() { // from class: o.ofO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.DbNXlk(this.EZpvd, str2, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener(activity.AEQbTJ("FRAGMENT_RESULT_KEY_GROUP_ANNOUNCEMENT_BANNER"), this, new FragmentResultListener() { // from class: o.oeI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.AkhnZx(this.EZpvd, str2, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.gCNefq, c36712ogDAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public static final void DbNXlk(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.valueOf().copydefault(bundle.getBoolean("ARG_IS_LOADING", false));
    }

    public static final void AkhnZx(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.zLjUOn();
    }

    public final androidx.fragment.app.FragmentTransaction AEQbTJ(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, OKConversationType oKConversationType) {
        if (oKConversationType == OKConversationType.GROUP) {
            fragmentTransaction = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPQdUnVm, C36753ogs.Companion.AEQbTJ(str));
        }
        Intrinsics.checkNotNullExpressionValue(fragmentTransaction, "");
        return fragmentTransaction;
    }

    public final void zLjUOn() {
        android.widget.LinearLayout linearLayout;
        C33907nKg c33907nKg = this.wlaJM;
        int height = (c33907nKg == null || (linearLayout = c33907nKg.OLrzqt) == null) ? 0 : linearLayout.getHeight();
        pUU.KWHzl("MessageListMainFragment", "Top Banner sections updated, update messageListPaddingTop: " + height);
        getChildFragmentManager().setFragmentResult("KEY_REQUEST_BANNER_HEIGHT_CHANGED", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_BANNER_HEIGHT", java.lang.Integer.valueOf(height))));
    }

    public final androidx.fragment.app.FragmentTransaction KWHzl(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, OKConversationType oKConversationType) {
        C36812ohy.Activity activity = C36812ohy.Companion;
        C36812ohy c36812ohyEZpvd = activity.EZpvd("FRAGMENT_RESULT_KEY_PENDING_JOIN_REVIEWS_BANNER", str, oKConversationType);
        getChildFragmentManager().setFragmentResultListener(activity.OLrzqt("FRAGMENT_RESULT_KEY_PENDING_JOIN_REVIEWS_BANNER"), this, new FragmentResultListener() { // from class: o.oeF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.EZpvd(str2, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.apHBvG, c36812ohyEZpvd);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction KWHzl(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, IMPageType iMPageType) {
        C36897ojd.ActionBar actionBar = C36897ojd.Companion;
        C36897ojd c36897ojdOLrzqt = actionBar.OLrzqt("FRAGMENT_RESULT_KEY_VERIFY_IDENTITY_BANNER", str, iMPageType);
        getChildFragmentManager().setFragmentResultListener(actionBar.EZpvd("FRAGMENT_RESULT_KEY_VERIFY_IDENTITY_BANNER"), this, new FragmentResultListener() { // from class: o.ofD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.getFieldNames(this.KWHzl, str2, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.gLWkOL, c36897ojdOLrzqt);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public static final void getFieldNames(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.zLjUOn();
    }

    public final androidx.fragment.app.FragmentTransaction EZpvd(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, IMPageType iMPageType) {
        C36774ohM.Activity activity = C36774ohM.Companion;
        C36774ohM c36774ohMOLrzqt = activity.OLrzqt("FRAGMENT_RESULT_KEY_PAID_GROUP_STATUS_BANNER", str, iMPageType);
        getChildFragmentManager().setFragmentResultListener(activity.EZpvd("FRAGMENT_RESULT_KEY_PAID_GROUP_STATUS_BANNER"), this, new FragmentResultListener() { // from class: o.ofJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.getNewProxyInstance(this.OLrzqt, str2, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPdIKEqB, c36774ohMOLrzqt);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public static final void getNewProxyInstance(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.zLjUOn();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment.TaskDescription.newInstance$default(com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment$TaskDescription, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.okinc.im.config.page.IMPageType, boolean, boolean, java.lang.Long, int, java.lang.Object):com.okinc.im.imui.messageV2.view.messagelist.MessageListFragment */
    public final androidx.fragment.app.FragmentTransaction OLrzqt(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, IMPageType iMPageType) {
        MessageListFragment.TaskDescription taskDescription = MessageListFragment.Companion;
        OKMessage oKMessageAYXKKw = AYXKKw();
        MessageListFragment messageListFragmentKWHzl = taskDescription.KWHzl("FRAGMENT_RESULT_KEY_MESSAGE_LIST", str, oKMessageAYXKKw != null ? java.lang.Long.valueOf(oKMessageAYXKKw.getSeq()) : null, AuCTelauCTel(), iMPageType, fARcdN(), ejfBZ(), (128 & 128) != 0 ? null : null);
        getChildFragmentManager().setFragmentResultListener(taskDescription.AEQbTJ("FRAGMENT_RESULT_KEY_MESSAGE_LIST"), this, new FragmentResultListener() { // from class: o.ofI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.ejfBZ(this.EZpvd, str2, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener(taskDescription.EZpvd("FRAGMENT_RESULT_KEY_MESSAGE_LIST"), this, new FragmentResultListener() { // from class: o.ofK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.fJNWhG(this.OLrzqt, str2, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener(taskDescription.copydefault("FRAGMENT_RESULT_KEY_MESSAGE_LIST"), this, new FragmentResultListener() { // from class: o.ofH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.fARcdN(this.KWHzl, str2, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener(taskDescription.KWHzl("FRAGMENT_RESULT_KEY_MESSAGE_LIST"), this, new FragmentResultListener() { // from class: o.ofQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.iwGUEr(this.KWHzl, str2, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.iqeXgQ, messageListFragmentKWHzl);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public static final void ejfBZ(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.valueOf().AEQbTJ(bundle.getBoolean("ARG_IS_LOADING", false));
    }

    public static final void fJNWhG(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.valueOf().OLrzqt(bundle.getBoolean("ARG_IS_LOADING", false));
    }

    public static final void fARcdN(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c36609oeG.valueOf().EZpvd(bundle.getBoolean("ARG_IS_FAILURE", false));
        C36603oeA c36603oeA = c36609oeG.gEmmrt;
        if (c36603oeA != null) {
            c36603oeA.AEQbTJ();
        }
    }

    public static final void iwGUEr(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        androidx.fragment.app.Fragment fragmentFindFragmentById = c36609oeG.getChildFragmentManager().findFragmentById(C35399nuc.StateListAnimator.HJWChPRGtXKC);
        C36913ojt c36913ojt = fragmentFindFragmentById instanceof C36913ojt ? (C36913ojt) fragmentFindFragmentById : null;
        if (c36913ojt != null) {
            c36913ojt.AYXKKw();
        }
    }

    public final androidx.fragment.app.FragmentTransaction copydefault(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, OKConversationType oKConversationType, java.lang.String str2) {
        C36913ojt.TaskDescription taskDescription = C36913ojt.Companion;
        C36913ojt c36913ojtAEQbTJ = taskDescription.AEQbTJ("FRAGMENT_RESULT_KEY_KEYBOARD", str, oKConversationType, str2, fJNWhG(), fIwbmz(), AuCTel());
        getChildFragmentManager().setFragmentResultListener(taskDescription.EZpvd("FRAGMENT_RESULT_KEY_KEYBOARD"), this, new FragmentResultListener() { // from class: o.ofF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str3, android.os.Bundle bundle) {
                C36609oeG.fIwbmz(this.copydefault, str3, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener(taskDescription.AEQbTJ("FRAGMENT_RESULT_KEY_KEYBOARD"), this, new FragmentResultListener() { // from class: o.ofG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str3, android.os.Bundle bundle) {
                C36609oeG.AuCTel(this.OLrzqt, str3, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPRGtXKC, c36913ojtAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public static final void fIwbmz(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.io.Serializable serializable = bundle.getSerializable("ARG_INPUT_MODE");
        c36609oeG.valueOf().KWHzl(serializable instanceof InputMode ? (InputMode) serializable : null);
    }

    public static final void AuCTel(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("ARG_TEXT_CONTENT", "");
        MessageListMainViewModel messageListMainViewModelValueOf = c36609oeG.valueOf();
        Intrinsics.copydefault((java.lang.Object) string);
        messageListMainViewModelValueOf.AEQbTJ(string);
    }

    public final androidx.fragment.app.FragmentTransaction copydefault(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, IMPageType iMPageType) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.dNxZaP, C36950okd.Companion.EZpvd(str, iMPageType));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final void wlaJM() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AhwBna;
        if (viewOnClickListenerC54939xaY == null || !viewOnClickListenerC54939xaY.isShowing()) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY2.setTitle(C35399nuc.LoaderManager.QOLQEE);
            viewOnClickListenerC54939xaY2.copydefault(C35399nuc.LoaderManager.DTwDnp);
            viewOnClickListenerC54939xaY2.EZpvd(C35399nuc.LoaderManager.ORxRYg, new View.OnClickListener() { // from class: o.ofP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36609oeG.OLrzqt(this.AEQbTJ, view);
                }
            });
            viewOnClickListenerC54939xaY2.OLrzqt(C35399nuc.LoaderManager.OqFWZa, new View.OnClickListener() { // from class: o.ofM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36609oeG.OLrzqt(viewOnClickListenerC54939xaY2, this, view);
                }
            });
            viewOnClickListenerC54939xaY2.setCancelable(false);
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY2.show();
            this.AhwBna = viewOnClickListenerC54939xaY2;
        }
    }

    public static final void OLrzqt(C36609oeG c36609oeG, android.view.View view) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
        android.content.Context contextRequireContext = c36609oeG.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC8104awT.AEQbTJ(contextRequireContext);
        c36609oeG.AhwBna = null;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C36609oeG c36609oeG, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        FragmentActivity activity = c36609oeG.getActivity();
        if (activity != null) {
            activity.finish();
        }
        c36609oeG.AhwBna = null;
    }

    public final void uzCIH() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.fetchVPNInfo;
        if (viewOnClickListenerC54939xaY == null || !viewOnClickListenerC54939xaY.isShowing()) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY2.copydefault(C35399nuc.LoaderManager.DcMfJKdMCrTj);
            viewOnClickListenerC54939xaY2.EZpvd(C35399nuc.LoaderManager.fARcdN, new View.OnClickListener() { // from class: o.ofm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36609oeG.EZpvd(this.EZpvd, viewOnClickListenerC54939xaY2, view);
                }
            });
            viewOnClickListenerC54939xaY2.OLrzqt(C35399nuc.LoaderManager.RXzakW, new View.OnClickListener() { // from class: o.ofB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36609oeG.AEQbTJ(this.KWHzl, viewOnClickListenerC54939xaY2, view);
                }
            });
            viewOnClickListenerC54939xaY2.setCancelable(true);
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY2.show();
            this.fetchVPNInfo = viewOnClickListenerC54939xaY2;
        }
    }

    public static final void EZpvd(C36609oeG c36609oeG, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c36609oeG.valueOf().OLrzqt();
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
        FragmentActivity fragmentActivityRequireActivity = c36609oeG.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC8104awT.KWHzl(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(C36609oeG c36609oeG, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c36609oeG.valueOf().OLrzqt();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final androidx.fragment.app.FragmentTransaction AEQbTJ(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str, IMPageType iMPageType) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.gdwsGQ, C36857oiq.Companion.EZpvd(str, iMPageType));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction AEQbTJ(androidx.fragment.app.FragmentTransaction fragmentTransaction, OKConversation oKConversation, IMPageType iMPageType) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPRAkuRW, C35563nxi.Companion.OLrzqt(oKConversation, iMPageType));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final Job EZpvd(android.view.View view, long j, Function0<Unit> function0) {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MessageListMainFragment$postDelayedWithLifecycle$1(j, view, function0, null), 3, null);
    }

    public final androidx.fragment.app.FragmentTransaction djBIcL(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.dpErvT, C36829oiO.Companion.copydefault(str));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction EZpvd(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.getSerial, C36791ohd.Companion.KWHzl(str));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction KWHzl(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPdNQGVJ, C36780ohS.Companion.KWHzl(str));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction OLrzqt(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.RWIpjU, C36759ogy.Companion.KWHzl(str));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public final androidx.fragment.app.FragmentTransaction AYXKKw(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        C36728ogT c36728ogTCopydefault = C36728ogT.Companion.copydefault("FRAGMENT_RESULT_KEY_UPGRADE_GROUP_BANNER", str);
        getChildFragmentManager().setFragmentResultListener("FRAGMENT_RESULT_KEY_UPGRADE_GROUP_BANNER", this, new FragmentResultListener() { // from class: o.oeW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.uzCIH(this.copydefault, str2, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("INCREASE_GROUP_SIZE_REQUEST", this, new FragmentResultListener() { // from class: o.oeU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                C36609oeG.hDKMBd(this.AEQbTJ, str2, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(C35399nuc.StateListAnimator.HJWChPRGtXKCRGtXKC, c36728ogTCopydefault);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
        return fragmentTransactionReplace;
    }

    public static final void uzCIH(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean z = bundle.getBoolean("ARG_FRAGMENT_BANNER_CLICK", false);
        boolean z2 = bundle.getBoolean("ARG_FRAGMENT_IS_GROUP_ALREADY_FULL", false);
        int i = bundle.getInt("ARG_FRAGMENT_GROUP_CAPACITY", 0);
        if (z) {
            nVO.Companion.OLrzqt(z2, i, true).show(c36609oeG.getParentFragmentManager(), c36609oeG.getTAG());
        }
    }

    public static final void hDKMBd(C36609oeG c36609oeG, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        boolean z = bundle.getBoolean("KEY_INCREASE_ACCEPTED", false);
        int i = bundle.getInt("KEY_GROUP_CAPACITY", 0);
        if (z) {
            c36609oeG.valueOf().AEQbTJ(i);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        valueOf().EZpvd();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MessageListMainFragment$onResume$1(this, null), 3, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        valueOf().copydefault();
    }

    public static final Unit EZpvd(C36609oeG c36609oeG, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GeneralAction generalAction = (GeneralAction) it.next();
            if (generalAction instanceof GeneralAction.SendMessages) {
                c36609oeG.valueOf().KWHzl(((GeneralAction.SendMessages) generalAction).copydefault());
            } else if (generalAction instanceof GeneralAction.OpenActivity) {
                c36609oeG.startActivity(((GeneralAction.OpenActivity) generalAction).OLrzqt());
            } else if (generalAction instanceof GeneralAction.LaunchActivity) {
                Function1<android.content.Context, Unit> function1OLrzqt = ((GeneralAction.LaunchActivity) generalAction).OLrzqt();
                android.content.Context contextRequireContext = c36609oeG.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                function1OLrzqt.invoke(contextRequireContext);
            } else if (generalAction instanceof GeneralAction.OpenDialog) {
                Function1<android.content.Context, android.app.Dialog> function1AEQbTJ = ((GeneralAction.OpenDialog) generalAction).AEQbTJ();
                android.content.Context contextRequireContext2 = c36609oeG.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                android.app.Dialog dialogInvoke = function1AEQbTJ.invoke(contextRequireContext2);
                android.app.Dialog dialog = c36609oeG.AkhnZx;
                if (dialog != null) {
                    dialog.dismiss();
                }
                c36609oeG.AkhnZx = dialogInvoke;
                if (dialogInvoke != null) {
                    dialogInvoke.show();
                }
            } else if (generalAction instanceof GeneralAction.OpenMediaPickerToast) {
                C55326xho.toastWithFailedIcon$default(((GeneralAction.OpenMediaPickerToast) generalAction).OLrzqt(), 0, 1, (java.lang.Object) null);
            } else if (generalAction instanceof GeneralAction.OpenDialogFragment) {
                GeneralAction.OpenDialogFragment openDialogFragment = (GeneralAction.OpenDialogFragment) generalAction;
                Function1<FragmentActivity, androidx.fragment.app.DialogFragment> function1KWHzl = openDialogFragment.KWHzl();
                FragmentActivity fragmentActivityRequireActivity = c36609oeG.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                function1KWHzl.invoke(fragmentActivityRequireActivity).show(c36609oeG.getChildFragmentManager(), openDialogFragment.EZpvd());
            } else if (generalAction instanceof GeneralAction.Toast) {
                C55326xho.toast$default(((GeneralAction.Toast) generalAction).OLrzqt(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else if (generalAction instanceof GeneralAction.CustomAction) {
                Function1<FragmentActivity, Unit> function1EZpvd = ((GeneralAction.CustomAction) generalAction).EZpvd();
                FragmentActivity fragmentActivityRequireActivity2 = c36609oeG.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                function1EZpvd.invoke(fragmentActivityRequireActivity2);
            }
        }
        return Unit.INSTANCE;
    }
}
