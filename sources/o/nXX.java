package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.members.fragment.MemberListFragment$initViewModel$1;
import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.nXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nXX extends AbstractC34279nYb implements nXV.Activity {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public C33903nKc AhwBna;
    public final InterfaceC56387yDm values;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nXZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nXX.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nYc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(nXX.valueOf(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nYg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(nXX.gEmmrt(this.KWHzl));
        }
    });
    public final int DbNXlk = C35399nuc.Dialog.ODXsMY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    public nXX() {
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupMemberListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.members.fragment.MemberListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.members.fragment.MemberListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.members.fragment.MemberListFragment$special$$inlined$activityViewModels$default$3
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
    }

    public final GroupMemberListViewModel valueOf() {
        return (GroupMemberListViewModel) this.values.getValue();
    }

    /* JADX DEBUG: Possible override for method o.nYb.OLrzqt()V */
    public final nXV OLrzqt() {
        return (nXV) this.gEmmrt.getValue();
    }

    public static final nXV AYXKKw(nXX nxx) {
        nXV nxv = new nXV();
        nxv.KWHzl(nxx);
        nxv.EZpvd(nxx.AYXKKw());
        return nxv;
    }

    public final int djBIcL() {
        return ((java.lang.Number) this.AYXKKw.getValue()).intValue();
    }

    public static final int valueOf(nXX nxx) {
        android.os.Bundle arguments = nxx.getArguments();
        if (arguments != null) {
            return arguments.getInt("ARG_CATEGORY_ID", -1);
        }
        return -1;
    }

    private final boolean AYXKKw() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean gEmmrt(nXX nxx) {
        android.os.Bundle arguments = nxx.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("ARG_IS_VIP_GROUP", false);
        }
        return false;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nXX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final nXX copydefault(int i, boolean z) {
            nXX nxx = new nXX();
            nxx.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CATEGORY_ID", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("ARG_IS_VIP_GROUP", java.lang.Boolean.valueOf(z))));
            return nxx;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33903nKc c33903nKcAEQbTJ = C33903nKc.AEQbTJ(layoutInflater, viewGroup, false);
        this.AhwBna = c33903nKcAEQbTJ;
        if (c33903nKcAEQbTJ != null) {
            return c33903nKcAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C33903nKc c33903nKc = this.AhwBna;
        if (c33903nKc != null) {
            c33903nKc.EZpvd.setAdapter(OLrzqt());
        }
        AhwBna();
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MemberListFragment$initViewModel$1(this, null), 3, null);
    }

    @Override // o.nXV.Activity
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().AEQbTJ(str);
    }

    @Override // o.nXV.Activity
    public void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().OLrzqt(str, z);
    }
}
