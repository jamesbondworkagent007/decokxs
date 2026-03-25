package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionBottomSheet$onSave$1;
import com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams;
import com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionViewModel;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.InterfaceC25657jBn;
import o.InterfaceC25659jBp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25655jBl extends AbstractC25652jBi implements InterfaceC26241jXd {
    public final InterfaceC56387yDm AhwBna;
    public C23476hyu djBIcL;
    public yHO<? super InterfaceC25657jBn, ? super TrackerGroupSelectionParams, ? super java.util.List<CommonGroupUiModel>, Unit> gEmmrt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jBk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25655jBl.gEmmrt(this.copydefault);
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public C25655jBl() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerGroupSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionBottomSheet$special$$inlined$viewModels$default$5
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
    }

    public final TrackerGroupSelectionParams AYXKKw() {
        TrackerGroupSelectionParams trackerGroupSelectionParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (trackerGroupSelectionParams = (TrackerGroupSelectionParams) BundleCompat.getParcelable(arguments, "key.selected_group", TrackerGroupSelectionParams.class)) == null) ? new TrackerGroupSelectionParams(null, null, null, null, false, false, 63, null) : trackerGroupSelectionParams;
    }

    /* JADX DEBUG: Possible override for method o.jBi.KWHzl()V */
    public final kMM KWHzl() {
        return (kMM) this.valueOf.getValue();
    }

    public static final kMM gEmmrt(final C25655jBl c25655jBl) {
        kMM kmm = new kMM();
        kmm.register(CommonGroupUiModel.class, new C27773kCv(c25655jBl.AYXKKw().KWHzl() != GroupSelectionMode.INDIVIDUAL, new Function1() { // from class: o.jBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25655jBl.AEQbTJ(this.EZpvd, (CommonGroupUiModel) obj);
            }
        }));
        return kmm;
    }

    public static final Unit AEQbTJ(C25655jBl c25655jBl, CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        c25655jBl.AhwBna().OLrzqt(c25655jBl.AYXKKw().KWHzl(), commonGroupUiModel.KWHzl());
        if (c25655jBl.AYXKKw().KWHzl() == GroupSelectionMode.INDIVIDUAL) {
            c25655jBl.djBIcL();
        }
        return Unit.INSTANCE;
    }

    public final TrackerGroupSelectionViewModel AhwBna() {
        return (TrackerGroupSelectionViewModel) this.AhwBna.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherApi33Impl));
        wxq.setDividerVisibility(false);
    }

    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = C23476hyu.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    private final void DbNXlk() {
        C23476hyu c23476hyu = this.djBIcL;
        if (c23476hyu != null) {
            c23476hyu.copydefault.setAdapter(KWHzl());
            c23476hyu.copydefault.setItemAnimator(null);
            C52794wYp c52794wYp = c23476hyu.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(AYXKKw().KWHzl() != GroupSelectionMode.INDIVIDUAL ? 0 : 8);
            C52794wYp c52794wYp2 = c23476hyu.KWHzl;
            c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
            android.view.View view = c23476hyu.valueOf;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(AYXKKw().AEQbTJ() ? 0 : 8);
            OKRegularCell oKRegularCell = c23476hyu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
            oKRegularCell.setVisibility(AYXKKw().AEQbTJ() ? 0 : 8);
            OKRegularCell oKRegularCell2 = c23476hyu.EZpvd;
            oKRegularCell2.setOnClickListener(new TaskDescription(oKRegularCell2, 1000L, this));
        }
    }

    public static /* synthetic */ void openGroupNameInputBottomSheet$default(C25655jBl c25655jBl, java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            tokenGroupActionType = TokenGroupActionType.NEW;
        }
        c25655jBl.EZpvd(str, num, tokenGroupActionType);
    }

    private final void EZpvd(java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType) {
        C25639jAw c25639jAwOLrzqt = C25639jAw.Companion.OLrzqt(str, num, tokenGroupActionType);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25639jAwOLrzqt.show(childFragmentManager);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        InterfaceC25657jBn interfaceC25657jBn;
        InterfaceC25657jBn interfaceC25657jBn2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (AYXKKw().EZpvd().size() == 1) {
            ActivityResultCaller parentFragment = getParentFragment();
            InterfaceC25660jBq interfaceC25660jBq = null;
            InterfaceC25660jBq interfaceC25660jBq2 = parentFragment instanceof InterfaceC25660jBq ? (InterfaceC25660jBq) parentFragment : null;
            if (interfaceC25660jBq2 == null) {
                KeyEventDispatcher.Component activity = getActivity();
                if (activity instanceof InterfaceC25660jBq) {
                    interfaceC25660jBq = (InterfaceC25660jBq) activity;
                }
            } else {
                interfaceC25660jBq = interfaceC25660jBq2;
            }
            if (interfaceC25660jBq != null) {
                java.util.List<CommonGroupUiModel> listEZpvd = AYXKKw().EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listEZpvd) {
                    if (((CommonGroupUiModel) obj).copydefault()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    interfaceC25657jBn2 = InterfaceC25657jBn.ActionBar.copydefault;
                } else {
                    interfaceC25657jBn2 = InterfaceC25657jBn.StateListAnimator.KWHzl;
                }
                TrackerGroupSelectionParams trackerGroupSelectionParamsAYXKKw = AYXKKw();
                java.util.List<CommonGroupUiModel> listEZpvd2 = AYXKKw().EZpvd();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
                java.util.Iterator<T> it = listEZpvd2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(CommonGroupUiModel.copy$default((CommonGroupUiModel) it.next(), 0, null, 0, 0, 0, !r9.copydefault(), false, 95, null));
                }
                interfaceC25660jBq.EZpvd(interfaceC25657jBn2, trackerGroupSelectionParamsAYXKKw, arrayList2);
                dismissAllowingStateLoss();
            }
            yHO<? super InterfaceC25657jBn, ? super TrackerGroupSelectionParams, ? super java.util.List<CommonGroupUiModel>, Unit> yho = this.gEmmrt;
            if (yho != null) {
                java.util.List<CommonGroupUiModel> listEZpvd3 = AYXKKw().EZpvd();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listEZpvd3) {
                    if (((CommonGroupUiModel) obj2).copydefault()) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    interfaceC25657jBn = InterfaceC25657jBn.ActionBar.copydefault;
                } else {
                    interfaceC25657jBn = InterfaceC25657jBn.StateListAnimator.KWHzl;
                }
                TrackerGroupSelectionParams trackerGroupSelectionParamsAYXKKw2 = AYXKKw();
                java.util.List<CommonGroupUiModel> listEZpvd4 = AYXKKw().EZpvd();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd4, 10));
                java.util.Iterator<T> it2 = listEZpvd4.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(CommonGroupUiModel.copy$default((CommonGroupUiModel) it2.next(), 0, null, 0, 0, 0, !r8.copydefault(), false, 95, null));
                }
                yho.invoke(interfaceC25657jBn, trackerGroupSelectionParamsAYXKKw2, arrayList4);
            }
        }
        DbNXlk();
        gEmmrt();
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().KWHzl(), null, new Application(), 2, null);
    }

    /* JADX INFO: renamed from: o.jBl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C25655jBl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25655jBl c25655jBl) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c25655jBl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.jBl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C25655jBl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25655jBl c25655jBl) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c25655jBl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C25655jBl.openGroupNameInputBottomSheet$default(this.copydefault, null, null, null, 7, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.jBl$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC25659jBp interfaceC25659jBp, Continuation<? super Unit> continuation) {
            C52794wYp c52794wYp;
            C23476hyu c23476hyu = C25655jBl.this.djBIcL;
            if (c23476hyu != null && (c52794wYp = c23476hyu.KWHzl) != null) {
                c52794wYp.setEnabled((interfaceC25659jBp instanceof InterfaceC25659jBp.Application) && !Intrinsics.EZpvd(((InterfaceC25659jBp.Application) interfaceC25659jBp).OLrzqt(), C25655jBl.this.AYXKKw().EZpvd()));
            }
            if (Intrinsics.EZpvd(interfaceC25659jBp, InterfaceC25659jBp.ActionBar.copydefault)) {
                C25655jBl.this.dismissAllowingStateLoss();
            } else if (Intrinsics.EZpvd(interfaceC25659jBp, InterfaceC25659jBp.StateListAnimator.AEQbTJ)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            } else if (!Intrinsics.EZpvd(interfaceC25659jBp, InterfaceC25659jBp.TaskDescription.copydefault)) {
                if (interfaceC25659jBp instanceof InterfaceC25659jBp.Application) {
                    C25655jBl.this.AEQbTJ(((InterfaceC25659jBp.Application) interfaceC25659jBp).OLrzqt());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        AhwBna().OLrzqt(AYXKKw());
    }

    public final void AEQbTJ(java.util.List<CommonGroupUiModel> list) {
        C23476hyu c23476hyu = this.djBIcL;
        if (c23476hyu != null) {
            java.util.List<?> items = KWHzl().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            kMM.setData$default(KWHzl(), list, null, 2, null);
            if ((!items.isEmpty()) && items.size() != list.size()) {
                c23476hyu.copydefault.smoothScrollToPosition(list.size() - 1);
            }
            LinearLayoutCompat linearLayoutCompat = c23476hyu.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(C33129mqd.KWHzl((java.util.Collection) list) ? 0 : 8);
            android.view.View view = c23476hyu.valueOf;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility((!AYXKKw().AEQbTJ() || list.size() >= 20) ? 8 : 0);
            OKRegularCell oKRegularCell = c23476hyu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
            oKRegularCell.setVisibility((!AYXKKw().AEQbTJ() || list.size() >= 20) ? 8 : 0);
        }
    }

    @Override // o.AbstractC52786wYh, o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.djBIcL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    public final void djBIcL() {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerGroupSelectionBottomSheet$onSave$1(this, null), 3, null);
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.jBl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jBl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jBl$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C25655jBl newInstance$default(StateListAnimator stateListAnimator, TrackerGroupSelectionParams trackerGroupSelectionParams, yHO yho, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                yho = null;
            }
            return stateListAnimator.OLrzqt(trackerGroupSelectionParams, yho);
        }

        public final C25655jBl OLrzqt(@NotNull TrackerGroupSelectionParams trackerGroupSelectionParams, yHO<? super InterfaceC25657jBn, ? super TrackerGroupSelectionParams, ? super java.util.List<CommonGroupUiModel>, Unit> yho) {
            Intrinsics.checkNotNullParameter(trackerGroupSelectionParams, "");
            C25655jBl c25655jBl = new C25655jBl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.selected_group", trackerGroupSelectionParams);
            c25655jBl.setArguments(bundle);
            c25655jBl.gEmmrt = yho;
            return c25655jBl;
        }
    }

    @Override // o.InterfaceC26241jXd
    public void valueOf() {
        TrackerGroupSelectionViewModel.loadData$default(AhwBna(), null, 1, null);
    }
}
