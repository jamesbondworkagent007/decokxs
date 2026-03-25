package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$setupObservers$1$1;
import com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$setupUi$1$2$1$1;
import com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardViewModel;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C52761wXj;
import o.nZD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34307nZc extends AbstractC34309nZe {
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public C33909nKi valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35399nuc.Dialog.aUsmxb;
    }

    public C34307nZc() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaidDashboardViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(C34307nZc.AEQbTJ(this.AEQbTJ));
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.nZe.OLrzqt()V */
    public final PaidDashboardViewModel OLrzqt() {
        return (PaidDashboardViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long djBIcL() {
        return ((java.lang.Number) this.gEmmrt.getValue()).longValue();
    }

    public static final long AEQbTJ(C34307nZc c34307nZc) {
        android.os.Bundle arguments = c34307nZc.getArguments();
        if (arguments != null) {
            return arguments.getLong("GROUP_ID", -1L);
        }
        return -1L;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33909nKi c33909nKiCopydefault = C33909nKi.copydefault(layoutInflater, viewGroup, false);
        this.valueOf = c33909nKiCopydefault;
        if (c33909nKiCopydefault == null) {
            Intrinsics.gEmmrt("");
            c33909nKiCopydefault = null;
        }
        NestedScrollView nestedScrollViewKWHzl = c33909nKiCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(nestedScrollViewKWHzl, "");
        return nestedScrollViewKWHzl;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gEmmrt();
        AhwBna();
        OLrzqt().KWHzl();
    }

    private final void gEmmrt() {
        PaidDashboardViewModel paidDashboardViewModelOLrzqt = OLrzqt();
        StateFlow<PaidDashboardViewModel.Activity> stateFlowCopydefault = paidDashboardViewModelOLrzqt.copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowCopydefault, viewLifecycleOwner, (Lifecycle.State) null, new PaidDashboardFragment$setupObservers$1$1(this, paidDashboardViewModelOLrzqt, null), 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        C55320xhi c55320xhiKWHzl;
        C33909nKi c33909nKi = this.valueOf;
        if (c33909nKi == null) {
            Intrinsics.gEmmrt("");
            c33909nKi = null;
        }
        C55312xha c55312xhaValueOf = c33909nKi.KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(getString(C35399nuc.LoaderManager.vqBjd));
            c55320xhiKWHzl.setTextAppearance(C52761wXj.LoaderManager.AxsJAY);
        }
        C55173xeu c55173xeu = c33909nKi.EZpvd;
        java.lang.String string = c55173xeu.getContext().getString(C35399nuc.LoaderManager.djBIcL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.nZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34307nZc.EZpvd(this.OLrzqt, view);
            }
        });
        OKRegularCell oKRegularCell = c33909nKi.djBIcL;
        oKRegularCell.EZpvd().setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fmdvVn));
        oKRegularCell.setOnClickListener(new Application(oKRegularCell, 1000L, oKRegularCell, this));
    }

    public static final void EZpvd(C34307nZc c34307nZc, android.view.View view) {
        pUU.EZpvd(c34307nZc.getTAG(), "Retry button clicked");
        LifecycleOwner viewLifecycleOwner = c34307nZc.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PaidDashboardFragment$setupUi$1$2$1$1(c34307nZc, null), 3, null);
    }

    /* JADX INFO: renamed from: o.nZc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C34307nZc EZpvd(long j) {
            C34307nZc c34307nZc = new C34307nZc();
            c34307nZc.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("GROUP_ID", java.lang.Long.valueOf(j))));
            return c34307nZc;
        }
    }

    /* JADX INFO: renamed from: o.nZc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ OKRegularCell AEQbTJ;
        public final /* synthetic */ C34307nZc EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, OKRegularCell oKRegularCell, C34307nZc c34307nZc) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = oKRegularCell;
            this.EZpvd = c34307nZc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                nZD.Application application = nZD.Companion;
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                this.EZpvd.startActivity(application.OLrzqt(context, java.lang.Long.valueOf(this.EZpvd.djBIcL())));
            }
        }
    }
}
