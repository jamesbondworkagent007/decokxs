package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.FilterAction;
import com.okinc.dexkline.market.features.holdings.ui.PositionSortType;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
import com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$openFilter$1;
import com.okinc.dexkline.market.features.position.ui.PositionsViewModel;
import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC32365mZh;
import o.InterfaceC34465ncb;
import o.xHC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34483nct extends androidx.fragment.app.Fragment implements InterfaceC32365mZh, InterfaceC34464nca {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public InterfaceC34464nca KWHzl;
    public C36067oOa OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;

    private final boolean copydefault(boolean z, boolean z2, boolean z3) {
        return (z && z2) || (!z && (z2 || z3));
    }

    public C34483nct() {
        final Function0 function0 = new Function0() { // from class: o.ncC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34483nct.AkhnZx(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$1
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$viewModels$default$4
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionHeaderFragment$special$$inlined$activityViewModels$default$3
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
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ncy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34483nct.valueOf(this.AEQbTJ);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ncz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34483nct.AhwBna(this.copydefault);
            }
        });
    }

    @Override // o.InterfaceC32365mZh
    public void EZpvd(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        InterfaceC32365mZh.Application.copydefault(this, filterAction, tokenFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionsViewModel AhwBna() {
        return (PositionsViewModel) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner AkhnZx(C34483nct c34483nct) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c34483nct.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final RealtimeDataViewModel AYXKKw() {
        return (RealtimeDataViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionDetailsParam OLrzqt() {
        return (PositionDetailsParam) this.copydefault.getValue();
    }

    public static final PositionDetailsParam valueOf(C34483nct c34483nct) {
        android.os.Bundle arguments = c34483nct.getArguments();
        if (arguments != null) {
            return (PositionDetailsParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.position_details", PositionDetailsParam.class));
        }
        return null;
    }

    private final C34478nco EZpvd() {
        return (C34478nco) this.AEQbTJ.getValue();
    }

    public static final C34478nco AhwBna(final C34483nct c34483nct) {
        return new C34478nco(new Function1() { // from class: o.ncw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34483nct.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.ncv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34483nct.AEQbTJ((java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(C34483nct c34483nct, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextRequireContext = c34483nct.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        mUO.AEQbTJ(contextRequireContext, "", str, C35964oKf.Fragment.DcMfJKDDUqPf);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C36067oOa c36067oOaAEQbTJ = C36067oOa.AEQbTJ(layoutInflater, viewGroup, false);
        this.OLrzqt = c36067oOaAEQbTJ;
        if (c36067oOaAEQbTJ != null) {
            return c36067oOaAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        DbNXlk();
        gEmmrt();
        AhwBna().AYXKKw();
    }

    @Override // o.InterfaceC34464nca
    public void AEQbTJ(@NotNull InterfaceC34465ncb interfaceC34465ncb) {
        Intrinsics.checkNotNullParameter(interfaceC34465ncb, "");
        if (interfaceC34465ncb instanceof InterfaceC34465ncb.Application) {
            copydefault(((InterfaceC34465ncb.Application) interfaceC34465ncb).AEQbTJ());
            return;
        }
        InterfaceC34464nca interfaceC34464nca = this.KWHzl;
        if (interfaceC34464nca != null) {
            interfaceC34464nca.AEQbTJ(interfaceC34465ncb);
        }
    }

    @Override // o.InterfaceC32365mZh
    public void OLrzqt(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        AhwBna().AEQbTJ(tokenFilter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        super.onDestroyView();
    }

    private final void DbNXlk() {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            c36067oOa.getNewProxyInstance.setTextValue(C33070mpX.AYXKKw(C35964oKf.Fragment.aKhcqp));
            android.widget.ImageView imageViewOLrzqt = c36067oOa.AuCTel.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new VoiceInteractor(imageViewOLrzqt, 1000L, c36067oOa, this));
            RecyclerView recyclerView = c36067oOa.iwGUEr;
            recyclerView.setAdapter(EZpvd());
            recyclerView.setItemAnimator(null);
            LinearLayoutCompat linearLayoutCompat = c36067oOa.ejfBZ;
            Intrinsics.copydefault(linearLayoutCompat);
            linearLayoutCompat.setVisibility(AhwBna().fetchVPNInfo().getValue().copydefault().isEmpty() ^ true ? 0 : 8);
            C52794wYp c52794wYp = c36067oOa.EZpvd;
            c52794wYp.setOnClickListener(new PictureInPictureParams(c52794wYp, 1000L, this));
            valueOf();
            djBIcL();
        }
        this.KWHzl = new C34470ncg(this);
    }

    /* JADX INFO: renamed from: o.nct$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            OKAlertBanner oKAlertBanner;
            C36067oOa c36067oOa = C34483nct.this.OLrzqt;
            if (c36067oOa != null && (oKAlertBanner = c36067oOa.AuCTel) != null) {
                oKAlertBanner.setVisibility(z ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        mUN.collectOnViewLifecycle$default(this, AhwBna().valueOf(), null, new TaskDescription(), 2, null);
        mUN.collectOnViewLifecycle$default(this, AhwBna().AkhnZx(), null, new StateListAnimator(), 2, null);
        mUN.collectOnViewLifecycle$default(this, AhwBna().AhwBna(), null, new ActionBar(), 2, null);
        mUN.collectOnViewLifecycle$default(this, AhwBna().values(), null, new Application(), 2, null);
        mUN.collectOnViewLifecycle$default(this, AhwBna().fetchVPNInfo(), null, new PendingIntent(), 2, null);
        mUN.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt(), null, new FragmentManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.nct$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34457ncT c34457ncT, Continuation<? super Unit> continuation) {
            C34483nct.this.KWHzl(c34457ncT.copydefault());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.nct$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kotlin.Pair<C34479ncp, xHC.ActionBar> pair, Continuation<? super Unit> continuation) {
            C34483nct.this.AEQbTJ(pair.getFirst().KWHzl(), pair.getSecond());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.nct$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34446ncI c34446ncI, Continuation<? super Unit> continuation) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C34483nct.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            C34483nct.this.copydefault(c34446ncI);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.nct$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34455ncR c34455ncR, Continuation<? super Unit> continuation) {
            LinearLayoutCompat linearLayoutCompat;
            C36067oOa c36067oOa = C34483nct.this.OLrzqt;
            if (c36067oOa != null && (linearLayoutCompat = c36067oOa.ejfBZ) != null) {
                linearLayoutCompat.setVisibility(c34455ncR.copydefault().isEmpty() ^ true ? 0 : 8);
            }
            C34483nct.this.copydefault();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.nct$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            PositionsViewModel positionsViewModelAhwBna = C34483nct.this.AhwBna();
            java.lang.String strDbNXlk = tokenDetail.DbNXlk();
            if (strDbNXlk == null) {
                strDbNXlk = "";
            }
            positionsViewModelAhwBna.AEQbTJ(strDbNXlk);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.nct$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C34483nct KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C34483nct c34483nct) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c34483nct;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C36067oOa c36067oOa = this.KWHzl.OLrzqt;
                if (c36067oOa != null) {
                    C34483nct c34483nct = this.KWHzl;
                    RecyclerView recyclerView = c36067oOa.iwGUEr;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    c34483nct.EZpvd(!(recyclerView.getVisibility() == 0));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.nct$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C34483nct AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C34483nct c34483nct) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c34483nct;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.nct$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ OKSortTextView KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, OKSortTextView oKSortTextView) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = oKSortTextView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.KWHzl.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                if (sortTypeAEQbTJ == sortType) {
                    sortType = OKSortTextView.SortType.UP;
                }
                OKSortTextView.setSortType$default(this.KWHzl, sortType, false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.nct$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ OKSortTextView KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, OKSortTextView oKSortTextView) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = oKSortTextView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.KWHzl.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                if (sortTypeAEQbTJ == sortType) {
                    sortType = OKSortTextView.SortType.UP;
                }
                OKSortTextView.setSortType$default(this.KWHzl, sortType, false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.nct$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C34483nct OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C34483nct c34483nct) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c34483nct;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C34517nda c34517ndaAEQbTJ = C34517nda.Companion.AEQbTJ();
                androidx.fragment.app.FragmentManager parentFragmentManager = this.OLrzqt.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                c34517ndaAEQbTJ.show(parentFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.nct$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C36067oOa copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C36067oOa c36067oOa) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c36067oOa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                OKSortTextView.SortType sortTypeAEQbTJ = this.copydefault.DbNXlk.AEQbTJ();
                OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
                if (sortTypeAEQbTJ == sortType) {
                    sortType = OKSortTextView.SortType.UP;
                }
                OKSortTextView.setSortType$default(this.copydefault.DbNXlk, sortType, false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.nct$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ C34483nct EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C36067oOa OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C36067oOa c36067oOa, C34483nct c34483nct) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c36067oOa;
            this.EZpvd = c34483nct;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                OKAlertBanner oKAlertBanner = this.OLrzqt.AuCTel;
                Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
                oKAlertBanner.setVisibility(8);
                this.EZpvd.AhwBna().KWHzl();
            }
        }
    }

    private final void valueOf() {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            OKSortTextView oKSortTextView = c36067oOa.DbNXlk;
            oKSortTextView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialROgMPW));
            oKSortTextView.setDefaultIndicator(null);
            oKSortTextView.setOnClickListener(new SharedElementCallback(oKSortTextView, 1000L, c36067oOa));
            oKSortTextView.setOnSortTypeChangeListener(new Function2() { // from class: o.ncH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C34483nct.djBIcL(this.KWHzl, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            OKSortTextView oKSortTextView2 = c36067oOa.AhwBna;
            oKSortTextView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DxnCrt));
            oKSortTextView2.setDefaultIndicator(null);
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView2, sortType, false, 2, null);
            OKSortTextView oKSortTextView3 = c36067oOa.values;
            oKSortTextView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.dIjzlO));
            oKSortTextView3.setDefaultIndicator(null);
            OKSortTextView.setSortType$default(oKSortTextView3, sortType, false, 2, null);
            LinearLayoutCompat linearLayoutCompat = c36067oOa.ejfBZ;
            linearLayoutCompat.setOnClickListener(new AssistContent(linearLayoutCompat, 1000L, this));
        }
    }

    public static final Unit djBIcL(C34483nct c34483nct, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c34483nct.AhwBna().KWHzl(sortType == OKSortTextView.SortType.DOWN);
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            android.widget.LinearLayout linearLayout = c36067oOa.AYXKKw;
            linearLayout.setOnClickListener(new Dialog(linearLayout, 1000L, this));
            OKSortTextView oKSortTextView = c36067oOa.gEmmrt;
            oKSortTextView.setOnClickListener(new LoaderManager(oKSortTextView, 1000L, oKSortTextView));
            oKSortTextView.setOnSortTypeChangeListener(new Function2() { // from class: o.ncD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C34483nct.EZpvd(this.copydefault, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            OKSortTextView oKSortTextView2 = c36067oOa.fetchVPNInfo;
            oKSortTextView2.setOnClickListener(new Fragment(oKSortTextView2, 1000L, oKSortTextView2));
            oKSortTextView2.setOnSortTypeChangeListener(new Function2() { // from class: o.ncG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C34483nct.copydefault(this.KWHzl, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
        }
    }

    public static final Unit EZpvd(C34483nct c34483nct, OKSortTextView oKSortTextView, final OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c34483nct.AhwBna().copydefault(new Function1() { // from class: o.ncA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34483nct.EZpvd(sortType, (C34380naw) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final C34380naw EZpvd(OKSortTextView.SortType sortType, C34380naw c34380naw) {
        Intrinsics.checkNotNullParameter(c34380naw, "");
        return C34380naw.copy$default(c34380naw, false, false, PositionSortType.BALANCE, sortType == OKSortTextView.SortType.DOWN, 3, null);
    }

    public static final Unit copydefault(C34483nct c34483nct, OKSortTextView oKSortTextView, final OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c34483nct.AhwBna().copydefault(new Function1() { // from class: o.ncB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34483nct.AEQbTJ(sortType, (C34380naw) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final C34380naw AEQbTJ(OKSortTextView.SortType sortType, C34380naw c34380naw) {
        Intrinsics.checkNotNullParameter(c34380naw, "");
        return C34380naw.copy$default(c34380naw, false, false, PositionSortType.PNL, sortType == OKSortTextView.SortType.DOWN, 3, null);
    }

    public final void KWHzl() {
        AhwBna().copydefault(new Function1() { // from class: o.ncE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34483nct.EZpvd((C34380naw) obj);
            }
        });
        boolean zAEQbTJ = AhwBna().djBIcL().getValue().AEQbTJ();
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            c36067oOa.zLjUOn.setText(C33070mpX.AYXKKw(zAEQbTJ ? C35964oKf.Fragment.gwwfep : C35964oKf.Fragment.zzQwtT));
        }
    }

    public static final C34380naw EZpvd(C34380naw c34380naw) {
        Intrinsics.checkNotNullParameter(c34380naw, "");
        return C34380naw.copy$default(c34380naw, false, !c34380naw.AEQbTJ(), null, false, 13, null);
    }

    public final void EZpvd(boolean z) {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            c36067oOa.djBIcL.setImageDrawable(ContextCompat.getDrawable(c36067oOa.getRoot().getContext(), z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG));
            LinearLayoutCompat linearLayoutCompat = c36067oOa.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(z ? 0 : 8);
            RecyclerView recyclerView = c36067oOa.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(z ? 0 : 8);
            if (z) {
                copydefault();
                return;
            }
            C52794wYp c52794wYp = c36067oOa.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        int i;
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            java.util.List<C34462ncY> listCopydefault = AhwBna().fetchVPNInfo().getValue().copydefault();
            LinearLayoutCompat linearLayoutCompat = c36067oOa.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(listCopydefault.isEmpty() ^ true ? 0 : 8);
            C52794wYp c52794wYp = c36067oOa.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            if (listCopydefault.size() > 5) {
                RecyclerView recyclerView = c36067oOa.iwGUEr;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                i = recyclerView.getVisibility() != 0 ? 8 : 0;
            }
            c52794wYp.setVisibility(i);
            if (!listCopydefault.isEmpty()) {
                EZpvd().submitList(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listCopydefault, 5));
            }
        }
    }

    public final void copydefault(C34446ncI c34446ncI) {
        C36067oOa c36067oOa;
        OKAlertBanner oKAlertBanner;
        C36067oOa c36067oOa2 = this.OLrzqt;
        if (c36067oOa2 != null) {
            LinearLayoutCompat linearLayoutCompat = c36067oOa2.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility((c34446ncI.AEQbTJ() != null || c34446ncI.copydefault()) ? 8 : 0);
            OKReminder oKReminder = c36067oOa2.fARcdN;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            oKReminder.setVisibility(c34446ncI.copydefault() ? 0 : 8);
            if (c34446ncI.AEQbTJ() != null && (c36067oOa = this.OLrzqt) != null && (oKAlertBanner = c36067oOa.AuCTel) != null) {
                oKAlertBanner.setVisibility(8);
            }
        }
        AEQbTJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            c36067oOa.AuCTelauCTel.setText(str);
        }
    }

    public final void AEQbTJ(PnLDetailsUiModel pnLDetailsUiModel, xHC.ActionBar actionBar) {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            LinearLayoutCompat linearLayoutCompat = c36067oOa.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            int i = 0;
            linearLayoutCompat.setVisibility(pnLDetailsUiModel.KWHzl() ? 0 : 8);
            c36067oOa.fIwbmz.setData(pnLDetailsUiModel, this.KWHzl, actionBar);
            C34530ndn c34530ndn = c36067oOa.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c34530ndn, "");
            if (C33129mqd.AEQbTJ(actionBar.gEmmrt()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(actionBar.AEQbTJ()) != AudioStats.AUDIO_AMPLITUDE_NONE) {
                i = 8;
            }
            c34530ndn.setVisibility(i);
        }
    }

    public final void AEQbTJ() {
        C36067oOa c36067oOa = this.OLrzqt;
        if (c36067oOa != null) {
            final boolean zAEQbTJ = AhwBna().AhwBna().getValue().getFirst().KWHzl().AEQbTJ();
            PositionDetailsParam positionDetailsParamOLrzqt = OLrzqt();
            final boolean zIsNativeToken = positionDetailsParamOLrzqt != null ? positionDetailsParamOLrzqt.isNativeToken() : false;
            if (copydefault(zIsNativeToken, false, zAEQbTJ)) {
                c36067oOa.getNewProxyInstance.setHelperLabelType(1);
                mUO.setOnDoubleCheckClickListener$default(c36067oOa.getNewProxyInstance, 0L, new Function1() { // from class: o.ncF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34483nct.KWHzl(zIsNativeToken, zAEQbTJ, this, (android.view.View) obj);
                    }
                }, 1, null);
            } else {
                c36067oOa.getNewProxyInstance.setHelperLabelType(2);
                mUO.setOnDoubleCheckClickListener$default(c36067oOa.getNewProxyInstance, 0L, new Function1() { // from class: o.ncu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34483nct.KWHzl((android.view.View) obj);
                    }
                }, 1, null);
            }
        }
    }

    public static final Unit KWHzl(boolean z, boolean z2, C34483nct c34483nct, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C34458ncU c34458ncUKWHzl = C34458ncU.Companion.KWHzl(z, z2, false);
        androidx.fragment.app.FragmentManager childFragmentManager = c34483nct.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c34458ncUKWHzl.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(TokenFilter tokenFilter) {
        if (getChildFragmentManager().findFragmentByTag("tag.FilterBottomSheet") != null) {
            return;
        }
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PositionHeaderFragment$openFilter$1(this, tokenFilter, null), 3, null);
    }

    /* JADX INFO: renamed from: o.nct$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nct.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C34483nct AEQbTJ(PositionDetailsParam positionDetailsParam) {
            C34483nct c34483nct = new C34483nct();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.position_details", positionDetailsParam);
            c34483nct.setArguments(bundle);
            return c34483nct;
        }
    }
}
