package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.overview.domain.RwaTradingStatus;
import com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$onCreateContent$2;
import com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheetParams;
import com.okinc.business.market.features.rwa.ui.RwaStatusesViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC29168koZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29167koY extends AbstractC29160koR {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.koW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29167koY.OLrzqt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public C23474hys valueOf;

    public C29167koY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RwaStatusesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.rwa.ui.RwaStatusesBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.kpb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29167koY.valueOf();
            }
        });
    }

    /* JADX INFO: renamed from: o.koY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.koY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29167koY KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C29167koY c29167koY = new C29167koY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.rwa_bottom_sheet", new RwaStatusesBottomSheetParams(str));
            c29167koY.setArguments(bundle);
            return c29167koY;
        }
    }

    public final RwaStatusesBottomSheetParams gEmmrt() {
        return (RwaStatusesBottomSheetParams) this.AYXKKw.getValue();
    }

    public static final RwaStatusesBottomSheetParams OLrzqt(C29167koY c29167koY) {
        RwaStatusesBottomSheetParams rwaStatusesBottomSheetParams;
        android.os.Bundle arguments = c29167koY.getArguments();
        return (arguments == null || (rwaStatusesBottomSheetParams = (RwaStatusesBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.rwa_bottom_sheet", RwaStatusesBottomSheetParams.class))) == null) ? new RwaStatusesBottomSheetParams("") : rwaStatusesBottomSheetParams;
    }

    public final RwaStatusesViewModel AYXKKw() {
        return (RwaStatusesViewModel) this.AhwBna.getValue();
    }

    public final kMM AhwBna() {
        return (kMM) this.gEmmrt.getValue();
    }

    public static final kMM valueOf() {
        kMM kmm = new kMM();
        kmm.register(RwaTradingStatus.class, new C29166koX());
        return kmm;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23474hys c23474hysEZpvd = C23474hys.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        this.valueOf = c23474hysEZpvd;
        if (c23474hysEZpvd == null) {
            Intrinsics.gEmmrt("");
            c23474hysEZpvd = null;
        }
        c23474hysEZpvd.AEQbTJ.setLayoutManager(new LinearLayoutManager(c23474hysEZpvd.getRoot().getContext()));
        RecyclerView recyclerView = c23474hysEZpvd.AEQbTJ;
        android.content.Context context = c23474hysEZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.addItemDecoration(new C24290iaz(C33052mpF.copydefault(16.0f, context), true));
        c23474hysEZpvd.AEQbTJ.setAdapter(AhwBna());
        c23474hysEZpvd.copydefault.setRetryClickListener(new View.OnClickListener() { // from class: o.kpd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29167koY.KWHzl(this.copydefault, view);
            }
        });
        AYXKKw().KWHzl(gEmmrt().EZpvd());
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RwaStatusesBottomSheet$onCreateContent$2(this, null), 3, null);
    }

    public static final void KWHzl(C29167koY c29167koY, android.view.View view) {
        c29167koY.AYXKKw().KWHzl(c29167koY.gEmmrt().EZpvd());
    }

    public final void copydefault(InterfaceC29168koZ interfaceC29168koZ) {
        C23474hys c23474hys = this.valueOf;
        if (c23474hys == null) {
            Intrinsics.gEmmrt("");
            c23474hys = null;
        }
        C55173xeu c55173xeu = c23474hys.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC29168koZ instanceof InterfaceC29168koZ.StateListAnimator ? 0 : 8);
        C55113xdn c55113xdn = c23474hys.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(interfaceC29168koZ instanceof InterfaceC29168koZ.Activity ? 0 : 8);
        RecyclerView recyclerView = c23474hys.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        boolean z = interfaceC29168koZ instanceof InterfaceC29168koZ.Application;
        recyclerView.setVisibility(z ? 0 : 8);
        if (z) {
            kMM.setData$default(AhwBna(), ((InterfaceC29168koZ.Application) interfaceC29168koZ).copydefault(), null, 2, null);
        } else {
            kMM.setData$default(AhwBna(), yDY.AhwBna(), null, 2, null);
        }
    }
}
