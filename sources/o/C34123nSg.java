package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
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
import com.okinc.im.biz.group.contacts.GiftContactInfo;
import com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$setObserver$1$1;
import com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$setObserver$1$2;
import com.okinc.im.imui.group.giftcontact.GiftContactSelectionViewModel;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import o.C34131nSo;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nSg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34123nSg extends AbstractC34133nSq implements C34131nSo.StateListAnimator {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;
    public nJC KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.DCJXGO;
    }

    public C34123nSg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GiftContactSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.giftcontact.GiftContactSelectionFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nSk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34123nSg.copydefault(this.copydefault);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.nSq.EZpvd()V */
    public final GiftContactSelectionViewModel EZpvd() {
        return (GiftContactSelectionViewModel) this.EZpvd.getValue();
    }

    public final C34131nSo KWHzl() {
        return (C34131nSo) this.OLrzqt.getValue();
    }

    public static final C34131nSo copydefault(C34123nSg c34123nSg) {
        C34131nSo c34131nSo = new C34131nSo();
        c34131nSo.copydefault(c34123nSg);
        return c34131nSo;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJC njcOLrzqt = nJC.OLrzqt(layoutInflater, viewGroup, false);
        this.KWHzl = njcOLrzqt;
        if (njcOLrzqt == null) {
            Intrinsics.gEmmrt("");
            njcOLrzqt = null;
        }
        ConstraintLayout constraintLayoutAEQbTJ = njcOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutAEQbTJ, "");
        return constraintLayoutAEQbTJ;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna();
        EZpvd().copydefault();
        gEmmrt();
    }

    private final void AhwBna() {
        nJC njc = this.KWHzl;
        if (njc == null) {
            Intrinsics.gEmmrt("");
            njc = null;
        }
        RecyclerView recyclerView = njc.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(KWHzl());
        recyclerView.setItemAnimator(null);
        njc.EZpvd.KWHzl().addTextChangedListener(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.nSg$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (editable != null) {
                C34123nSg.this.EZpvd().AEQbTJ(editable.toString());
            }
        }
    }

    private final void gEmmrt() {
        GiftContactSelectionViewModel giftContactSelectionViewModelEZpvd = EZpvd();
        StateFlow<java.lang.Boolean> stateFlowOLrzqt = giftContactSelectionViewModelEZpvd.OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowOLrzqt, viewLifecycleOwner, (Lifecycle.State) null, new GiftContactSelectionFragment$setObserver$1$1(this, null), 2, (java.lang.Object) null);
        Flow<java.util.List<GroupMemberInfo>> flowAEQbTJ = giftContactSelectionViewModelEZpvd.AEQbTJ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(flowAEQbTJ, viewLifecycleOwner2, (Lifecycle.State) null, new GiftContactSelectionFragment$setObserver$1$2(this, null), 2, (java.lang.Object) null);
    }

    public final void OLrzqt(java.util.List<GroupMemberInfo> list) {
        C34131nSo c34131nSoKWHzl = KWHzl();
        nJC njc = this.KWHzl;
        if (njc == null) {
            Intrinsics.gEmmrt("");
            njc = null;
        }
        RecyclerView recyclerView = njc.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c34131nSoKWHzl.EZpvd(recyclerView, list);
    }

    @Override // o.C34131nSo.StateListAnimator
    public void OLrzqt(@NotNull GiftContactInfo giftContactInfo) {
        Intrinsics.checkNotNullParameter(giftContactInfo, "");
        pUU.KWHzl("GiftContactSelectionFragment", giftContactInfo + " on clicked");
        FragmentKt.setFragmentResult(this, "REQUEST_KEY_SELECTED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_SELECTED", giftContactInfo)));
    }

    /* JADX INFO: renamed from: o.nSg$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nSg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
