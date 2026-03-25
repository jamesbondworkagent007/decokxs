package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.filter.SignalMultiSelectViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheetParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29634kxO extends wXX {
    public C23471hyp AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public wYF KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault = true;
    public final InterfaceC56387yDm gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public C29634kxO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalMultiSelectViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheet$special$$inlined$viewModels$default$5
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
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29634kxO.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public final SignalMultiSelectViewModel KWHzl() {
        return (SignalMultiSelectViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM copydefault() {
        return (kMM) this.EZpvd.getValue();
    }

    public static final kMM AEQbTJ(final C29634kxO c29634kxO) {
        C29497kuk c29497kuk = new C29497kuk(new Function1() { // from class: o.kxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C29634kxO.AEQbTJ(this.KWHzl, (java.lang.String) obj));
            }
        });
        kMM kmm = new kMM();
        kmm.register(SignalMultiSelectUiModel.class, c29497kuk);
        return kmm;
    }

    public static final boolean AEQbTJ(C29634kxO c29634kxO, java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<SignalMultiSelectUiModel> value = c29634kxO.KWHzl().KWHzl().getValue();
        java.util.Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((SignalMultiSelectUiModel) next).copydefault(), (java.lang.Object) str)) {
                break;
            }
        }
        SignalMultiSelectUiModel signalMultiSelectUiModel = (SignalMultiSelectUiModel) next;
        if (signalMultiSelectUiModel == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            if (((SignalMultiSelectUiModel) obj).valueOf()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1 && signalMultiSelectUiModel.valueOf()) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.run), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return true;
        }
        return c29634kxO.KWHzl().KWHzl(str);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.QKudOq));
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C23471hyp.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        SignalMultiSelectBottomSheetParams signalMultiSelectBottomSheetParams;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (signalMultiSelectBottomSheetParams = (SignalMultiSelectBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", SignalMultiSelectBottomSheetParams.class))) == null) {
            signalMultiSelectBottomSheetParams = new SignalMultiSelectBottomSheetParams(null, 1, null);
        }
        KWHzl().AEQbTJ(signalMultiSelectBottomSheetParams.copydefault());
        OLrzqt();
        EZpvd();
    }

    public final InterfaceC29633kxN AEQbTJ() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC29633kxN) {
            return (InterfaceC29633kxN) parentFragment;
        }
        return null;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.KWHzl = wyf;
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.dpErvT));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Activity(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ3, 1000L, this));
        }
    }

    private final void OLrzqt() {
        C23471hyp c23471hyp = this.AYXKKw;
        if (c23471hyp != null) {
            RecyclerView recyclerView = c23471hyp.OLrzqt;
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(copydefault());
        }
    }

    /* JADX INFO: renamed from: o.kxO$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<SignalMultiSelectUiModel> list, Continuation<? super Unit> continuation) {
            kMM.setData$default(C29634kxO.this.copydefault(), list, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    private final void EZpvd() {
        C25390ivn.collectOnViewLifecycle$default(this, KWHzl().KWHzl(), null, new TaskDescription(), 2, null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        InterfaceC29633kxN interfaceC29633kxNAEQbTJ = AEQbTJ();
        if (interfaceC29633kxNAEQbTJ != null) {
            interfaceC29633kxNAEQbTJ.fIwbmz();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.kxO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kxO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C29634kxO copydefault(@NotNull java.util.List<SignalMultiSelectUiModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C29634kxO c29634kxO = new C29634kxO();
            c29634kxO.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", new SignalMultiSelectBottomSheetParams(list))));
            return c29634kxO;
        }
    }

    /* JADX INFO: renamed from: o.kxO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C29634kxO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29634kxO c29634kxO) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c29634kxO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC29633kxN interfaceC29633kxNAEQbTJ = this.copydefault.AEQbTJ();
                if (interfaceC29633kxNAEQbTJ != null) {
                    java.util.List<SignalMultiSelectUiModel> value = this.copydefault.KWHzl().KWHzl().getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : value) {
                        if (((SignalMultiSelectUiModel) obj).valueOf()) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((SignalMultiSelectUiModel) it.next()).copydefault());
                    }
                    interfaceC29633kxNAEQbTJ.EZpvd(arrayList2);
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.kxO$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29634kxO KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29634kxO c29634kxO) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c29634kxO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC29633kxN interfaceC29633kxNAEQbTJ = this.KWHzl.AEQbTJ();
                if (interfaceC29633kxNAEQbTJ != null) {
                    java.util.List<SignalMultiSelectUiModel> value = this.KWHzl.KWHzl().KWHzl().getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
                    java.util.Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SignalMultiSelectUiModel) it.next()).copydefault());
                    }
                    interfaceC29633kxNAEQbTJ.EZpvd(arrayList);
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
