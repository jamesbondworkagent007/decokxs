package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.tee.review.ui.WalletTeeServiceUpgradeFragment$observeViewModelState$1;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fWG extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC16692eoi OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.atDTRm;
    }

    public fWG() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ReNewEnableViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.review.ui.WalletTeeServiceUpgradeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.review.ui.WalletTeeServiceUpgradeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.review.ui.WalletTeeServiceUpgradeFragment$special$$inlined$activityViewModels$default$3
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

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fWG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final fWG copydefault() {
            return new fWG();
        }
    }

    public final ReNewEnableViewModel KWHzl() {
        return (ReNewEnableViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = (AbstractC16692eoi) DataBindingUtil.bind(view);
        OLrzqt();
        copydefault();
        EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.fWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fWG.AYXKKw(this.AEQbTJ);
            }
        });
    }

    public static final void AYXKKw(fWG fwg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fwg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletTeeServiceUpgradeFragment$observeViewModelState$1(this, null), 3, null);
    }

    private final void OLrzqt() {
        C55178xez c55178xez;
        wYF wyfOLrzqt;
        C55178xez c55178xez2;
        android.widget.ImageView imageViewAEQbTJ;
        AbstractC16692eoi abstractC16692eoi = this.OLrzqt;
        if (abstractC16692eoi != null && (c55178xez2 = abstractC16692eoi.OLrzqt) != null && (imageViewAEQbTJ = c55178xez2.AEQbTJ()) != null) {
            imageViewAEQbTJ.setVisibility(8);
        }
        AbstractC16692eoi abstractC16692eoi2 = this.OLrzqt;
        if (abstractC16692eoi2 == null || (c55178xez = abstractC16692eoi2.OLrzqt) == null || (wyfOLrzqt = c55178xez.OLrzqt()) == null) {
            return;
        }
        wyfOLrzqt.setVisibility(8);
    }

    private final void EZpvd() {
        C52794wYp c52794wYp;
        AbstractC16692eoi abstractC16692eoi = this.OLrzqt;
        if (abstractC16692eoi == null || (c52794wYp = abstractC16692eoi.copydefault) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public final void AEQbTJ() {
        if (KWHzl().EZpvd()) {
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            new C14461dlr(parentFragmentManager, "upgradeTeeService", new Function1() { // from class: o.fWE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fWG.copydefault(this.OLrzqt, (java.lang.String) obj);
                }
            }, null, null, false, 56, null).EZpvd();
        } else {
            C17877fVp c17877fVpOLrzqt = C17877fVp.Companion.OLrzqt();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c17877fVpOLrzqt.copydefault(contextRequireContext, new Function0() { // from class: o.fWH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fWG.djBIcL(this.OLrzqt);
                }
            });
        }
    }

    public static final Unit copydefault(fWG fwg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        fwg.showLoadingWithLogo();
        fwg.KWHzl().OLrzqt(str, true);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(fWG fwg) {
        FragmentActivity activity = fwg.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ fWG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fWG fwg) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = fwg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.widget.TextView textView;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AbstractC16692eoi abstractC16692eoi = this.copydefault.OLrzqt;
                if (abstractC16692eoi != null && (textView = abstractC16692eoi.valueOf) != null && textView.getVisibility() == 0) {
                    this.copydefault.AEQbTJ();
                } else {
                    this.copydefault.getParentFragmentManager().popBackStack();
                }
            }
        }
    }
}
