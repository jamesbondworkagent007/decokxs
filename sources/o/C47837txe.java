package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.planet.biz_create_centre.data.GroupsData;
import com.okinc.planet.biz_create_centre.ui.CreatorCentreGroupsFragment$observeData$1;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47837txe extends androidx.fragment.app.Fragment {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public boolean KWHzl;
    public C46238tMy OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public C47837txe() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47858txz.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_create_centre.ui.CreatorCentreGroupsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_create_centre.ui.CreatorCentreGroupsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_create_centre.ui.CreatorCentreGroupsFragment$special$$inlined$activityViewModels$default$3
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

    public final C46238tMy EZpvd() {
        C46238tMy c46238tMy = this.OLrzqt;
        Intrinsics.copydefault(c46238tMy);
        return c46238tMy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47858txz AEQbTJ() {
        return (C47858txz) this.copydefault.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.OLrzqt = C46238tMy.KWHzl(layoutInflater, viewGroup, false);
        android.widget.LinearLayout root = EZpvd().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
    }

    private final void KWHzl() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CreatorCentreGroupsFragment$observeData$1(this, null), 3, null);
    }

    public final void copydefault(GroupsData groupsData) {
        java.lang.String numberKmb;
        android.widget.TextView textView = EZpvd().copydefault;
        java.lang.String numberKmb2 = "--";
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (groupsData != null ? groupsData.getMembershipChange() : null))) {
            numberKmb = UdMath.formatNumberKmb(groupsData != null ? groupsData.getMembershipChange() : null, 1, 2, 0, 0);
        } else {
            numberKmb = "--";
        }
        textView.setText(numberKmb);
        android.widget.TextView textView2 = EZpvd().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AEQbTJ(textView2, groupsData != null ? groupsData.getMembershipChangePopRatio() : null);
        android.widget.TextView textView3 = EZpvd().gEmmrt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (groupsData != null ? groupsData.getMessageCount() : null))) {
            numberKmb2 = UdMath.formatNumberKmb(groupsData != null ? groupsData.getMessageCount() : null, 1, 2, 0, 0);
        }
        textView3.setText(numberKmb2);
        android.widget.TextView textView4 = EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        AEQbTJ(textView4, groupsData != null ? groupsData.getMessageCountPopRatio() : null);
    }

    public final void AEQbTJ(android.widget.TextView textView, java.lang.String str) {
        if (str == null || str.length() == 0) {
            textView.setText("");
            return;
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        textView.setText(pTB.formatICUPercent$default(java.lang.Double.valueOf(dAEQbTJ), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(1), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null));
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        textView.setTextColor(C47775twV.AEQbTJ(str, contextRequireContext));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    /* JADX INFO: renamed from: o.txe$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txe.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
