package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$onCreateContent$1;
import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import com.okinc.im.imui.group.create.viewmodel.InvitePermissionsViewModel;
import com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nRh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34097nRh extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final boolean EZpvd;
    public android.animation.ValueAnimator OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public boolean djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public C34097nRh() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CreateGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvitePermissionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.create.InvitePermissionsBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34097nRh.AYXKKw();
            }
        });
        this.djBIcL = true;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34097nRh.valueOf(this.AEQbTJ);
            }
        });
    }

    public final CreateGroupViewModel OLrzqt() {
        return (CreateGroupViewModel) this.copydefault.getValue();
    }

    public final InvitePermissionsViewModel copydefault() {
        return (InvitePermissionsViewModel) this.valueOf.getValue();
    }

    private final GroupSettingsAdapter djBIcL() {
        return (GroupSettingsAdapter) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSettingsAdapter AYXKKw() {
        return new GroupSettingsAdapter();
    }

    public final RecyclerView EZpvd() {
        return (RecyclerView) this.AhwBna.getValue();
    }

    public static final RecyclerView valueOf(C34097nRh c34097nRh) {
        RecyclerView recyclerView = new RecyclerView(c34097nRh.requireContext());
        recyclerView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setPadding(0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), 0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY));
        recyclerView.setOverScrollMode(2);
        recyclerView.setHorizontalScrollBarEnabled(false);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        return recyclerView;
    }

    /* JADX INFO: renamed from: o.nRh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nRh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34097nRh KWHzl() {
            return new C34097nRh();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.clearCurrentKeyboardTarget));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        copydefault().OLrzqt(OLrzqt().AEQbTJ());
        android.view.ViewParent parent = constraintLayout.getParent();
        Intrinsics.copydefault(parent, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int iIndexOfChild = viewGroup.indexOfChild(constraintLayout);
        viewGroup.removeView(constraintLayout);
        viewGroup.addView(EZpvd(), iIndexOfChild, layoutParams);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        EZpvd().setAdapter(djBIcL());
        StateFlow<CreateGroupViewModel.InvitePermissions> stateFlowCopydefault = copydefault().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowCopydefault, viewLifecycleOwner, (Lifecycle.State) null, new InvitePermissionsBottomSheet$onCreateContent$1(this, null), 2, (java.lang.Object) null);
    }

    public final void KWHzl(CreateGroupViewModel.InvitePermissions invitePermissions) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new C37740ozY(C33070mpX.AYXKKw(C35399nuc.LoaderManager.hErYDe), "Invite Permissions Section"));
        listOLrzqt.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OTJFaA), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DRuYWY), invitePermissions.copydefault(), false, "Invite Others Setting", new Function0() { // from class: o.nRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34097nRh.AYXKKw(this.EZpvd);
            }
        }, 8, null));
        if (invitePermissions.copydefault()) {
            listOLrzqt.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.DvMhtu), C33070mpX.AYXKKw(C35399nuc.LoaderManager.DHEdFZ), invitePermissions.AEQbTJ(), false, "Join With QR Invite Setting", new Function0() { // from class: o.nRk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34097nRh.djBIcL(this.AEQbTJ);
                }
            }, 8, null));
        }
        listOLrzqt.add(C35689oAa.EZpvd);
        listOLrzqt.add(new C37740ozY(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fObYrO), "Admin Controls Section"));
        listOLrzqt.add(createSwitchItem$default(this, C33070mpX.AYXKKw(C35399nuc.LoaderManager.RAaltf), C33070mpX.AYXKKw(C35399nuc.LoaderManager.OsDdEf), invitePermissions.OLrzqt(), false, "Join Approval Setting", new Function0() { // from class: o.nRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34097nRh.gEmmrt(this.EZpvd);
            }
        }, 8, null));
        djBIcL().OLrzqt(C56402yEa.fARcdN(listOLrzqt), new Function0() { // from class: o.nRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34097nRh.AhwBna(this.copydefault);
            }
        });
    }

    public static final Unit AYXKKw(C34097nRh c34097nRh) {
        c34097nRh.copydefault().OLrzqt();
        c34097nRh.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C34097nRh c34097nRh) {
        c34097nRh.copydefault().valueOf();
        c34097nRh.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C34097nRh c34097nRh) {
        c34097nRh.copydefault().AEQbTJ();
        c34097nRh.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C34097nRh c34097nRh) {
        if (c34097nRh.djBIcL) {
            c34097nRh.AEQbTJ = c34097nRh.EZpvd().getHeight();
            c34097nRh.djBIcL = false;
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        OLrzqt().copydefault(copydefault().EZpvd());
        copydefault().KWHzl();
    }

    public static /* synthetic */ C35690oAb createSwitchItem$default(C34097nRh c34097nRh, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c34097nRh.AEQbTJ(str, str2, z, z2, str3, function0);
    }

    /* JADX INFO: renamed from: o.nRh$ActionBar */
    public static final class ActionBar extends C35690oAb {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, boolean z, java.lang.String str2, boolean z2, java.lang.String str3, Function0<Unit> function0) {
            super(str, z, str2, z2, str3);
            this.AEQbTJ = function0;
        }

        @Override // o.C35694oAf
        public void KWHzl(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.AEQbTJ.invoke();
        }
    }

    private final C35690oAb AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0<Unit> function0) {
        return new ActionBar(str, z2, str2, z, str3, function0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.animation.ValueAnimator valueAnimator = this.OLrzqt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.OLrzqt = null;
        this.AEQbTJ = 0;
        this.djBIcL = true;
        super.onDestroyView();
    }
}
