package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jFI extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public long AEQbTJ;
    public Function0<Unit> EZpvd;
    public hEH KWHzl;
    public java.util.List<C25780jGb> OLrzqt = yDY.AhwBna();
    public final InterfaceC56387yDm djBIcL;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 40.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public jFI() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerManageAddressGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.ManageAddressSelectGroupFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.ManageAddressSelectGroupFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.ManageAddressSelectGroupFragment$special$$inlined$activityViewModels$default$3
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

    private final TrackerManageAddressGroupViewModel copydefault() {
        return (TrackerManageAddressGroupViewModel) this.djBIcL.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jFI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final jFI KWHzl(@NotNull java.util.List<C25780jGb> list, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            jFI jfi = new jFI();
            android.os.Bundle bundle = new android.os.Bundle();
            jfi.OLrzqt = list;
            jfi.AEQbTJ = j;
            jfi.setArguments(bundle);
            return jfi;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = requireContext().getString(C23274hvD.Fragment.DQzvGNdrmXxu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(this.OLrzqt);
        view.post(new java.lang.Runnable() { // from class: o.jFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jFI.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(jFI jfi) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jfi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = hEH.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }

    private final void KWHzl(java.util.List<C25780jGb> list) {
        RecyclerView recyclerView;
        jFO jfo = new jFO(list, this.AEQbTJ, new Function1() { // from class: o.jFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jFI.KWHzl(this.copydefault, (C25780jGb) obj);
            }
        });
        hEH heh = this.KWHzl;
        if (heh == null || (recyclerView = heh.AEQbTJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(jfo);
    }

    public static final Unit KWHzl(jFI jfi, C25780jGb c25780jGb) {
        Intrinsics.checkNotNullParameter(c25780jGb, "");
        jfi.copydefault().AEQbTJ(c25780jGb.copydefault());
        jfi.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
