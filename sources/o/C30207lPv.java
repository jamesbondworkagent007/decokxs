package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.buysell.api.QuickConvertBottomSheetSubmissionStatus;
import com.okinc.buysell.api.QuickConvertParams;
import com.okinc.buysell.ui.quickconvert.QuickConvertBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lPv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30207lPv extends AbstractC30208lPw {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public Function1<? super QuickConvertBottomSheetSubmissionStatus, Unit> AYXKKw;
    public BottomSheetBehavior<android.widget.FrameLayout> AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public AbstractC31453luM gEmmrt;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C30207lPv() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(QuickConvertBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertBottomSheet$special$$inlined$activityViewModels$default$3
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

    private final QuickConvertBottomSheetViewModel EZpvd() {
        return (QuickConvertBottomSheetViewModel) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        this.AhwBna = bottomSheetBehavior;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = AbstractC31453luM.KWHzl(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        setCancelable(false);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        QuickConvertParams quickConvertParams;
        Intrinsics.checkNotNullParameter(wxq, "");
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (quickConvertParams = (QuickConvertParams) arguments.getParcelable("quick_convert_params")) == null) {
            quickConvertParams = new QuickConvertParams(yDY.AhwBna(), "");
        }
        getChildFragmentManager().beginTransaction().replace(C31351lsQ.Application.sYcwUD, lPD.Companion.KWHzl(quickConvertParams)).commitAllowingStateLoss();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataKWHzl = EZpvd().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataKWHzl, viewLifecycleOwner, new Function1() { // from class: o.lPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30207lPv.copydefault(this.OLrzqt, (Unit) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataOLrzqt = EZpvd().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataOLrzqt, viewLifecycleOwner2, new Function1() { // from class: o.lPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30207lPv.EZpvd(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C30207lPv c30207lPv, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c30207lPv.EZpvd().AEQbTJ();
        c30207lPv.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C30207lPv c30207lPv, boolean z) {
        C52781wYc c52781wYc;
        C52781wYc c52781wYc2;
        if (z) {
            C54946xaf binding = c30207lPv.getBinding();
            if (binding != null && (c52781wYc2 = binding.EZpvd) != null) {
                c52781wYc2.setType(2);
            }
        } else {
            C54946xaf binding2 = c30207lPv.getBinding();
            if (binding2 != null && (c52781wYc = binding2.EZpvd) != null) {
                c52781wYc.setType(0);
            }
        }
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior = c30207lPv.AhwBna;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setDraggable(z);
        }
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior2 = c30207lPv.AhwBna;
        if (bottomSheetBehavior2 != null) {
            c30207lPv.onSetBehavior(bottomSheetBehavior2);
        }
        c30207lPv.setCancelable(z);
        android.app.Dialog dialog = c30207lPv.getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(z);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Function1<? super QuickConvertBottomSheetSubmissionStatus, Unit> function1 = this.AYXKKw;
        if (function1 != null) {
            function1.invoke(EZpvd().EZpvd());
        }
        EZpvd().gEmmrt();
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.lPv$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lPv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
