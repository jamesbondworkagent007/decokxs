package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.tradingbot.impl.strategy.dialog.ContractDCAReinvestmentDialog$setupViewModel$1;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53845wtF extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public AbstractC48395uPx AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C53845wtF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractDCAReinvestmentDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractDCAReinvestmentDialog$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(wTD.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractDCAReinvestmentDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractDCAReinvestmentDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractDCAReinvestmentDialog$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wtD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53845wtF.EZpvd(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.wtF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C53845wtF KWHzl(TacticsData tacticsData) {
            C53845wtF c53845wtF = new C53845wtF();
            c53845wtF.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_DCA_TACTICS_DATA", tacticsData)));
            return c53845wtF;
        }
    }

    public final wTD EZpvd() {
        return (wTD) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsData copydefault() {
        return (TacticsData) this.KWHzl.getValue();
    }

    public static final TacticsData EZpvd(C53845wtF c53845wtF) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53845wtF.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("KEY_DCA_TACTICS_DATA", TacticsData.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("KEY_DCA_TACTICS_DATA");
            parcelable = (TacticsData) (parcelable2 instanceof TacticsData ? parcelable2 : null);
        }
        return (TacticsData) parcelable;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setTitle(C33070mpX.OLrzqt(C55688xof.Application.DcMfJKDSqxTE, requireContext()));
        wxq.AYXKKw().setTextSize(16.0f);
        wxq.setDividerVisibility(true);
        wxq.KWHzl().setVisibility(0);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = AbstractC48395uPx.copydefault(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt();
        AEQbTJ();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
    }

    private final void OLrzqt() {
        C55239xgG c55239xgG;
        AbstractC48395uPx abstractC48395uPx = this.AEQbTJ;
        if (abstractC48395uPx == null || (c55239xgG = abstractC48395uPx.EZpvd) == null) {
            return;
        }
        TacticsData tacticsDataCopydefault = copydefault();
        c55239xgG.setChecked(tacticsDataCopydefault != null ? tacticsDataCopydefault.getReinvestment() : false);
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ContractDCAReinvestmentDialog$setupViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.wtF$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C53845wtF AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53845wtF c53845wtF) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c53845wtF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C55239xgG c55239xgG;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                TacticsData tacticsDataCopydefault = this.AEQbTJ.copydefault();
                if (tacticsDataCopydefault != null) {
                    AbstractC48395uPx abstractC48395uPx = this.AEQbTJ.AEQbTJ;
                    this.AEQbTJ.EZpvd().OLrzqt(tacticsDataCopydefault.getAlgoId(), tacticsDataCopydefault.getReinvestment(), (abstractC48395uPx == null || (c55239xgG = abstractC48395uPx.EZpvd) == null) ? false : c55239xgG.isChecked(), Dispatchers.getIO(), (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wtF$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53845wtF EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53845wtF c53845wtF) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c53845wtF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
