package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.holdings.ui.PositionSortType;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.market.features.position.ui.PositionsViewModel;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.uilab.view.OKSortTextView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.gKO;
import o.jUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29101knL extends AbstractC29093knD implements jUZ, InterfaceC29127knl {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public InterfaceC29127knl AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public C21494hBl valueOf;

    public final boolean AEQbTJ(boolean z, boolean z2, boolean z3) {
        return (z && z2) || (!z && (z2 || z3));
    }

    @Override // o.jUZ
    public void AEQbTJ(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.AEQbTJ(this, filterAction, tokenFilter);
    }

    public C29101knL() {
        final Function0 function0 = new Function0() { // from class: o.knM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29101knL.AYXKKw(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$1
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$4
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.knN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29101knL.valueOf(this.OLrzqt);
            }
        });
    }

    public final PositionsViewModel gEmmrt() {
        return (PositionsViewModel) this.fetchVPNInfo.getValue();
    }

    public static final ViewModelStoreOwner AYXKKw(C29101knL c29101knL) {
        PositionDetailsParam positionDetailsParamAEQbTJ = c29101knL.AEQbTJ();
        if (positionDetailsParamAEQbTJ != null && positionDetailsParamAEQbTJ.getHeaderComponentMode()) {
            return c29101knL;
        }
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c29101knL.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Possible override for method o.knD.AEQbTJ()V */
    public final PositionDetailsParam AEQbTJ() {
        return (PositionDetailsParam) this.gEmmrt.getValue();
    }

    public static final PositionDetailsParam valueOf(C29101knL c29101knL) {
        android.os.Bundle arguments = c29101knL.getArguments();
        if (arguments != null) {
            return (PositionDetailsParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.position_details", PositionDetailsParam.class));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        PositionDetailsParam positionDetailsParamAEQbTJ = AEQbTJ();
        if (positionDetailsParamAEQbTJ != null) {
            z = positionDetailsParamAEQbTJ.getHeaderComponentMode();
        }
        this.AhwBna = z;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21494hBl c21494hBlOLrzqt = C21494hBl.OLrzqt(layoutInflater, viewGroup, false);
        this.valueOf = c21494hBlOLrzqt;
        if (c21494hBlOLrzqt != null) {
            return c21494hBlOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        values();
        valueOf();
    }

    @Override // o.InterfaceC29127knl
    public void copydefault(@NotNull InterfaceC29126knk interfaceC29126knk) {
        Intrinsics.checkNotNullParameter(interfaceC29126knk, "");
        InterfaceC29127knl interfaceC29127knl = this.AYXKKw;
        if (interfaceC29127knl != null) {
            interfaceC29127knl.copydefault(interfaceC29126knk);
        }
    }

    @Override // o.jUZ
    public void KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        gEmmrt().AEQbTJ(tokenFilter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AYXKKw = null;
        super.onDestroyView();
    }

    private final void values() {
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            PositionDetailsParam positionDetailsParamAEQbTJ = AEQbTJ();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (positionDetailsParamAEQbTJ != null ? positionDetailsParamAEQbTJ.getTokenLogo() : null))) {
                android.widget.ImageView imageView = c21494hBl.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = c21494hBl.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                PositionDetailsParam positionDetailsParamAEQbTJ2 = AEQbTJ();
                java.lang.String tokenLogo = positionDetailsParamAEQbTJ2 != null ? positionDetailsParamAEQbTJ2.getTokenLogo() : null;
                if (tokenLogo == null) {
                    tokenLogo = "";
                }
                C25386ivj.loadImageWithBorder$default(imageView2, tokenLogo, null, 2, null);
            }
            android.widget.TextView textView = c21494hBl.fetchVPNInfo;
            int i = C23274hvD.Fragment.DcMfJKffREWX;
            PositionDetailsParam positionDetailsParamAEQbTJ3 = AEQbTJ();
            java.lang.String tokenSymbol = positionDetailsParamAEQbTJ3 != null ? positionDetailsParamAEQbTJ3.getTokenSymbol() : null;
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            textView.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol))));
            OKReminder oKReminder = c21494hBl.AkhnZx;
            oKReminder.setStyle(0);
            oKReminder.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU));
            android.widget.ImageView imageViewOLrzqt = oKReminder.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new AssistContent(imageViewOLrzqt, 1000L, c21494hBl, this));
            djBIcL();
            C52794wYp c52794wYp = c21494hBl.AEQbTJ;
            c52794wYp.setOnClickListener(new VoiceInteractor(c52794wYp, 1000L, this));
            c21494hBl.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.knO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29101knL.copydefault(this.KWHzl, view);
                }
            });
            if (this.AhwBna) {
                c21494hBl.getRoot().setPaddingRelative(0, 0, 0, 0);
                c21494hBl.valueOf.setVisibility(8);
                PositionsViewModel.loadData$default(gEmmrt(), 0L, 1, null);
                LinearLayoutCompat linearLayoutCompat = c21494hBl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(8);
            }
        }
        AhwBna();
        this.AYXKKw = new C29125knj(this);
    }

    public static final void copydefault(C29101knL c29101knL, android.view.View view) {
        c29101knL.gEmmrt().AuCTel();
    }

    /* JADX INFO: renamed from: o.knL$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
            OKReminder oKReminder;
            C21494hBl c21494hBl = C29101knL.this.valueOf;
            if (c21494hBl != null && (oKReminder = c21494hBl.AkhnZx) != null) {
                oKReminder.setVisibility(z ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
    }

    public final void valueOf() {
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().values(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().OLrzqt(), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().djBIcL(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().AkhnZx(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().isConnected(), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().KWHzl(), null, new PendingIntent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, gEmmrt().valueOf(), null, new Fragment(), 2, null);
    }

    /* JADX INFO: renamed from: o.knL$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29092knC c29092knC, Continuation<? super Unit> continuation) {
            LinearLayoutCompat linearLayoutCompat;
            C21494hBl c21494hBl = C29101knL.this.valueOf;
            if (c21494hBl != null && (linearLayoutCompat = c21494hBl.AYXKKw) != null) {
                linearLayoutCompat.setVisibility(C33129mqd.KWHzl((java.util.Collection) c29092knC.OLrzqt()) ? 0 : 8);
            }
            C29101knL.this.OLrzqt(!c29092knC.EZpvd());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knL$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29095knF c29095knF, Continuation<? super Unit> continuation) {
            PnLDetailsUiModel pnLDetailsUiModelAEQbTJ = c29095knF.AEQbTJ();
            if (pnLDetailsUiModelAEQbTJ != null) {
                C29101knL c29101knL = C29101knL.this;
                c29101knL.copydefault(pnLDetailsUiModelAEQbTJ);
                c29101knL.AhwBna();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29101knL, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knL$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29109knT c29109knT, Continuation<? super Unit> continuation) {
            C21494hBl c21494hBl;
            OKReminder oKReminder;
            if (c29109knT.AEQbTJ() != null && (c21494hBl = C29101knL.this.valueOf) != null && (oKReminder = c21494hBl.AkhnZx) != null) {
                oKReminder.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knL$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return copydefault(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            android.widget.ImageView imageView;
            int i = (!C29101knL.this.gEmmrt().isConnected().getValue().booleanValue() || C29101knL.this.AhwBna) ? C52761wXj.TaskDescription.ODCBUN : C52761wXj.TaskDescription.invokespecialgBtXYZ;
            C21494hBl c21494hBl = C29101knL.this.valueOf;
            if (c21494hBl != null && (imageView = c21494hBl.valueOf) != null) {
                imageView.setImageDrawable(C33070mpX.KWHzl(i));
            }
            PnLDetailsUiModel pnLDetailsUiModelAEQbTJ = C29101knL.this.gEmmrt().djBIcL().getValue().AEQbTJ();
            if (pnLDetailsUiModelAEQbTJ != null) {
                C29101knL.this.copydefault(pnLDetailsUiModelAEQbTJ);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knL$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ C29101knL AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C21494hBl KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C21494hBl c21494hBl, C29101knL c29101knL) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c21494hBl;
            this.AEQbTJ = c29101knL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                OKReminder oKReminder = this.KWHzl.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(oKReminder, "");
                oKReminder.setVisibility(8);
                this.AEQbTJ.gEmmrt().copydefault();
            }
        }
    }

    /* JADX INFO: renamed from: o.knL$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C29101knL AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C29101knL c29101knL) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c29101knL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C29138knw c29138knwKWHzl = C29138knw.Companion.KWHzl();
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                c29138knwKWHzl.show(parentFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.knL$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29101knL EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C29101knL c29101knL) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c29101knL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C26233jWw.copydefault.copydefault(!r7.OLrzqt());
                this.EZpvd.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.knL$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C29101knL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C29101knL c29101knL) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c29101knL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                PositionDetailsParam positionDetailsParamAEQbTJ = this.copydefault.AEQbTJ();
                java.lang.String source = positionDetailsParamAEQbTJ != null ? positionDetailsParamAEQbTJ.getSource() : null;
                if (source == null) {
                    source = "";
                }
                gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                PositionDetailsParam positionDetailsParamAEQbTJ2 = this.copydefault.AEQbTJ();
                java.lang.String source2 = positionDetailsParamAEQbTJ2 != null ? positionDetailsParamAEQbTJ2.getSource() : null;
                java.lang.String str = source2 == null ? "" : source2;
                TokenBase tokenBaseAEQbTJ = this.copydefault.gEmmrt().AEQbTJ(source);
                gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, str, tokenBaseAEQbTJ.copy(((-8392705) & 1) != 0 ? tokenBaseAEQbTJ.chainId : null, ((-8392705) & 2) != 0 ? tokenBaseAEQbTJ.tokenContractAddress : null, ((-8392705) & 4) != 0 ? tokenBaseAEQbTJ.tokenLogoUrl : null, ((-8392705) & 8) != 0 ? tokenBaseAEQbTJ.chainLogoUrl : null, ((-8392705) & 16) != 0 ? tokenBaseAEQbTJ.chainBWLogoUrl : null, ((-8392705) & 32) != 0 ? tokenBaseAEQbTJ.tokenSymbol : null, ((-8392705) & 64) != 0 ? tokenBaseAEQbTJ.tokenName : null, ((-8392705) & 128) != 0 ? tokenBaseAEQbTJ.isCollected : 0, ((-8392705) & 256) != 0 ? tokenBaseAEQbTJ.decimals : 0, ((-8392705) & 512) != 0 ? tokenBaseAEQbTJ.isCustomToken : 0, ((-8392705) & 1024) != 0 ? tokenBaseAEQbTJ.isSubscribe : 0, ((-8392705) & 2048) != 0 ? tokenBaseAEQbTJ.uniqueId : null, ((-8392705) & 4096) != 0 ? tokenBaseAEQbTJ.source : null, ((-8392705) & 8192) != 0 ? tokenBaseAEQbTJ.tokenSource : null, ((-8392705) & 16384) != 0 ? tokenBaseAEQbTJ.type : null, ((-8392705) & 32768) != 0 ? tokenBaseAEQbTJ.chainName : null, ((-8392705) & 65536) != 0 ? tokenBaseAEQbTJ.isLeveraged : null, ((-8392705) & 131072) != 0 ? tokenBaseAEQbTJ.isSafeMoonToken : 0, ((-8392705) & 262144) != 0 ? tokenBaseAEQbTJ.isHoneypot : 0, ((-8392705) & 524288) != 0 ? tokenBaseAEQbTJ.localIsNeedRequestNet : false, ((-8392705) & 1048576) != 0 ? tokenBaseAEQbTJ.eventSource : "MARKET_MY_POSITION", ((-8392705) & 2097152) != 0 ? tokenBaseAEQbTJ.marketTabName : null, ((-8392705) & 4194304) != 0 ? tokenBaseAEQbTJ.showSourceAlert : false, ((-8392705) & 8388608) != 0 ? tokenBaseAEQbTJ.fromTrading : false, ((-8392705) & 16777216) != 0 ? tokenBaseAEQbTJ.moduleNameEnglish : null, ((-8392705) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenBaseAEQbTJ.moduleId : null, ((-8392705) & 67108864) != 0 ? tokenBaseAEQbTJ.sourcePageName : null, ((-8392705) & 134217728) != 0 ? tokenBaseAEQbTJ.srcType : 0, ((-8392705) & 268435456) != 0 ? tokenBaseAEQbTJ.isHighRisk : false, ((-8392705) & 536870912) != 0 ? tokenBaseAEQbTJ.referralCode : null, ((-8392705) & 1073741824) != 0 ? tokenBaseAEQbTJ.isNativeToken : null, ((-8392705) & Integer.MIN_VALUE) != 0 ? tokenBaseAEQbTJ.isMarketDetailEntry : false), TransactionType.Sell.getType(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                MemeQuickPopUpSource.Companion.copydefault(MemeQuickPopUpSource.MarketMyPosition);
            }
        }
    }

    /* JADX INFO: renamed from: o.knL$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28443kaq c28443kaq, Continuation<? super Unit> continuation) {
            wYC wyc;
            C21494hBl c21494hBl = C29101knL.this.valueOf;
            if (c21494hBl != null && (wyc = c21494hBl.KWHzl) != null) {
                wyc.setImageDrawable(C33070mpX.KWHzl((c28443kaq == null || !c28443kaq.KWHzl()) ? C52761wXj.TaskDescription.fVBECu : C52761wXj.TaskDescription.GVpNrs));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knL$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29183koo c29183koo, Continuation<? super Unit> continuation) {
            if (c29183koo != null) {
                C29101knL c29101knL = C29101knL.this;
                c29101knL.OLrzqt(c29183koo);
                c29101knL.AhwBna();
            }
            return Unit.INSTANCE;
        }
    }

    public final void djBIcL() {
        final C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            final OKSortTextView oKSortTextView = c21494hBl.AhwBna;
            oKSortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.knP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29101knL.AEQbTJ(oKSortTextView, c21494hBl, this, view);
                }
            });
            final OKSortTextView oKSortTextView2 = c21494hBl.gEmmrt;
            oKSortTextView2.setOnClickListener(new View.OnClickListener() { // from class: o.knR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29101knL.OLrzqt(this.copydefault, oKSortTextView2, c21494hBl, view);
                }
            });
            wYC wyc = c21494hBl.EZpvd;
            AYXKKw();
            wyc.setOnClickListener(new LoaderManager(wyc, 1000L, this));
            wYC wyc2 = c21494hBl.KWHzl;
            wyc2.setOnClickListener(new FragmentManager(wyc2, 1000L, this));
        }
    }

    public static final void AEQbTJ(OKSortTextView oKSortTextView, C21494hBl c21494hBl, C29101knL c29101knL, android.view.View view) {
        OKSortTextView.SortType sortTypeAEQbTJ = oKSortTextView.AEQbTJ();
        OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
        OKSortTextView.SortType sortType2 = sortTypeAEQbTJ == sortType ? OKSortTextView.SortType.UP : sortType;
        OKSortTextView.setSortType$default(oKSortTextView, sortType2, false, 2, null);
        c21494hBl.gEmmrt.setSortType(OKSortTextView.SortType.NONE, false);
        c29101knL.gEmmrt().EZpvd(new C28444kar(PositionSortType.BALANCE, sortType2 == sortType));
    }

    public static final void OLrzqt(C29101knL c29101knL, OKSortTextView oKSortTextView, C21494hBl c21494hBl, android.view.View view) {
        if (c29101knL.gEmmrt().OLrzqt().getValue().EZpvd()) {
            OKSortTextView.SortType sortTypeAEQbTJ = oKSortTextView.AEQbTJ();
            OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
            OKSortTextView.SortType sortType2 = sortTypeAEQbTJ == sortType ? OKSortTextView.SortType.UP : sortType;
            OKSortTextView.setSortType$default(oKSortTextView, sortType2, false, 2, null);
            c21494hBl.AhwBna.setSortType(OKSortTextView.SortType.NONE, false);
            c29101knL.gEmmrt().EZpvd(new C28444kar(PositionSortType.PNL, sortType2 == sortType));
        }
    }

    public final void AYXKKw() {
        wYC wyc;
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl == null || (wyc = c21494hBl.EZpvd) == null) {
            return;
        }
        wyc.setImageResource(C26233jWw.copydefault.OLrzqt() ? C52761wXj.TaskDescription.onServiceDisconnected : C52761wXj.TaskDescription.OqCbbx);
    }

    public final void OLrzqt(boolean z) {
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            c21494hBl.gEmmrt.setAlpha(z ? 0.5f : 1.0f);
            if (z) {
                PositionSortType positionSortTypeKWHzl = gEmmrt().gEmmrt().KWHzl();
                PositionSortType positionSortType = PositionSortType.BALANCE;
                if (positionSortTypeKWHzl == positionSortType) {
                    return;
                }
                c21494hBl.gEmmrt.setSortType(OKSortTextView.SortType.NONE, false);
                OKSortTextView.setSortType$default(c21494hBl.AhwBna, OKSortTextView.SortType.DOWN, false, 2, null);
                gEmmrt().EZpvd(new C28444kar(positionSortType, true));
            }
        }
    }

    public final void EZpvd(java.lang.String str) {
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            c21494hBl.fJNWhG.setText((!gEmmrt().isConnected().getValue().booleanValue() || this.AhwBna) ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, DisplaySign.AUTO, false, false, 444, null) : "*****");
        }
        OLrzqt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(PnLDetailsUiModel pnLDetailsUiModel) {
        boolean z;
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            C29147koE c29147koE = c21494hBl.isConnected;
            boolean zBooleanValue = gEmmrt().isConnected().getValue().booleanValue();
            InterfaceC29127knl interfaceC29127knl = this.AYXKKw;
            PositionDetailsParam positionDetailsParamAEQbTJ = AEQbTJ();
            if (positionDetailsParamAEQbTJ != null) {
                z = positionDetailsParamAEQbTJ.getHeaderComponentMode();
            }
            c29147koE.setData(pnLDetailsUiModel, zBooleanValue, interfaceC29127knl, z);
            EZpvd(pnLDetailsUiModel.copydefault());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        final boolean z;
        C21494hBl c21494hBl;
        C29147koE c29147koE;
        C29183koo value = gEmmrt().valueOf().getValue();
        final boolean zCopydefault = value != null ? value.copydefault() : false;
        PnLDetailsUiModel pnLDetailsUiModelAEQbTJ = gEmmrt().djBIcL().getValue().AEQbTJ();
        if (pnLDetailsUiModelAEQbTJ != null) {
            z = pnLDetailsUiModelAEQbTJ.AYXKKw();
        }
        PositionDetailsParam positionDetailsParamAEQbTJ = AEQbTJ();
        final boolean zIsNativeToken = positionDetailsParamAEQbTJ != null ? positionDetailsParamAEQbTJ.isNativeToken() : false;
        PositionDetailsParam positionDetailsParamAEQbTJ2 = AEQbTJ();
        java.lang.Boolean boolValueOf = positionDetailsParamAEQbTJ2 != null ? java.lang.Boolean.valueOf(positionDetailsParamAEQbTJ2.getHeaderComponentMode()) : null;
        pUU.EZpvd("position header debug", "component: " + boolValueOf + ", vm: " + gEmmrt().djBIcL().getValue().AEQbTJ());
        if (!AEQbTJ(zIsNativeToken, zCopydefault, z) || (c21494hBl = this.valueOf) == null || (c29147koE = c21494hBl.isConnected) == null) {
            return;
        }
        c29147koE.setPnLHelper(new Function0() { // from class: o.knK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29101knL.OLrzqt(zIsNativeToken, z, zCopydefault, this);
            }
        });
    }

    public static final Unit OLrzqt(boolean z, boolean z2, boolean z3, C29101knL c29101knL) {
        C29178koj c29178kojAEQbTJ = C29178koj.Companion.AEQbTJ(z, z2, z3);
        androidx.fragment.app.FragmentManager childFragmentManager = c29101knL.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29178kojAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C29183koo c29183koo) {
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            c21494hBl.isConnected.setLimitOrderData(c29183koo);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        PositionDetailsParam positionDetailsParamAEQbTJ;
        C21494hBl c21494hBl = this.valueOf;
        if (c21494hBl != null) {
            C52794wYp c52794wYp = c21494hBl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility((C23313hvq.OLrzqt(str, BigDecimal.ZERO) && (positionDetailsParamAEQbTJ = AEQbTJ()) != null && positionDetailsParamAEQbTJ.isSupportMemeOrder()) ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: o.knL$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.knL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C29101knL copydefault(PositionDetailsParam positionDetailsParam) {
            C29101knL c29101knL = new C29101knL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.position_details", positionDetailsParam);
            c29101knL.setArguments(bundle);
            return c29101knL;
        }
    }
}
