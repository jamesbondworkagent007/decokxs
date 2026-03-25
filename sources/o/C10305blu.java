package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewParams;
import com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewViewModel;
import com.okinc.business.defi.assets.utxo.widget.UtxoAssetListState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC10310blz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10305blu extends AbstractC10302blr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public C17026euy AYXKKw;
    public final InterfaceC56387yDm gEmmrt;

    public C10305blu() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewDialog$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestUtxoAssetPreviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.utxo.previewasset.InvestUtxoAssetPreviewDialog$special$$inlined$viewModels$default$5
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
    }

    /* JADX DEBUG: Possible override for method o.blr.KWHzl()V */
    public final C17026euy KWHzl() {
        C17026euy c17026euy = this.AYXKKw;
        Intrinsics.copydefault(c17026euy);
        return c17026euy;
    }

    public final InvestUtxoAssetPreviewParams gEmmrt() {
        InvestUtxoAssetPreviewParams investUtxoAssetPreviewParams;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (investUtxoAssetPreviewParams = (InvestUtxoAssetPreviewParams) arguments.getParcelable("key.params")) == null) {
            throw new java.lang.IllegalStateException("Must provide params");
        }
        return investUtxoAssetPreviewParams;
    }

    public final InvestUtxoAssetPreviewViewModel djBIcL() {
        return (InvestUtxoAssetPreviewViewModel) this.gEmmrt.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C17026euy.OLrzqt(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        AYXKKw();
        C14646dpQ.collectOnLifecycle$default(this, djBIcL().KWHzl(), null, new Function1() { // from class: o.bly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10305blu.OLrzqt(this.AEQbTJ, (InterfaceC10310blz) obj);
            }
        }, 2, null);
        djBIcL().OLrzqt(gEmmrt());
    }

    public static final Unit OLrzqt(C10305blu c10305blu, InterfaceC10310blz interfaceC10310blz) {
        Intrinsics.checkNotNullParameter(interfaceC10310blz, "");
        c10305blu.AEQbTJ(interfaceC10310blz);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
        bottomSheetBehavior.setState(3);
    }

    private final void AYXKKw() {
        C17026euy c17026euyKWHzl = KWHzl();
        android.widget.ImageView imageView = c17026euyKWHzl.AhwBna;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        c17026euyKWHzl.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.blx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10305blu.OLrzqt(this.EZpvd, view);
            }
        });
        LinearLayoutCompat linearLayoutCompat = KWHzl().EZpvd;
        C10353bmp c10353bmp = C10353bmp.OLrzqt;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        linearLayoutCompat.setBackground(c10353bmp.AEQbTJ(contextRequireContext, 8, java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialDPHOMC), 0.5f, java.lang.Integer.valueOf(C52761wXj.Activity.zuBGHE)));
    }

    public static final void OLrzqt(C10305blu c10305blu, android.view.View view) {
        c10305blu.djBIcL().OLrzqt(c10305blu.gEmmrt());
    }

    public final void AEQbTJ(InterfaceC10310blz interfaceC10310blz) {
        boolean z = interfaceC10310blz instanceof InterfaceC10310blz.StateListAnimator;
        boolean z2 = z && ((InterfaceC10310blz.StateListAnimator) interfaceC10310blz).KWHzl().isEmpty();
        C17026euy c17026euyKWHzl = KWHzl();
        C55113xdn c55113xdn = c17026euyKWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(interfaceC10310blz instanceof InterfaceC10310blz.Activity ? 0 : 8);
        android.widget.FrameLayout frameLayout = c17026euyKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(interfaceC10310blz instanceof InterfaceC10310blz.TaskDescription ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c17026euyKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        android.widget.FrameLayout frameLayout2 = c17026euyKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(z2 ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = c17026euyKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility((z && (true ^ ((InterfaceC10310blz.StateListAnimator) interfaceC10310blz).KWHzl().isEmpty())) ? 0 : 8);
        if (z) {
            InterfaceC10310blz.StateListAnimator stateListAnimator = (InterfaceC10310blz.StateListAnimator) interfaceC10310blz;
            AEQbTJ(stateListAnimator.copydefault());
            if (z2) {
                return;
            }
            KWHzl().gEmmrt.setData(new UtxoAssetListState(stateListAnimator.KWHzl(), true, null, 4, null));
        }
    }

    public final void AEQbTJ(java.util.List<java.lang.String> list) {
        C17026euy c17026euyKWHzl = KWHzl();
        LinearLayoutCompat linearLayoutCompat = c17026euyKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        if (list.isEmpty()) {
            return;
        }
        java.lang.String string = getString(C13754dXa.FragmentManager.fjfviF);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String str2 = (java.lang.String) next;
            if (str2.length() == 0) {
                next = str;
            } else {
                next = str2 + string + " " + str;
            }
        }
        c17026euyKWHzl.djBIcL.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.DaRZkR, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("asset", (java.lang.String) next))));
    }

    /* JADX INFO: renamed from: o.blu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.blu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C10305blu EZpvd(@NotNull InvestUtxoAssetPreviewParams investUtxoAssetPreviewParams) {
            Intrinsics.checkNotNullParameter(investUtxoAssetPreviewParams, "");
            C10305blu c10305blu = new C10305blu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", investUtxoAssetPreviewParams);
            c10305blu.setArguments(bundle);
            return c10305blu;
        }
    }

    /* JADX INFO: renamed from: o.blu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C10305blu AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C10305blu c10305blu) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c10305blu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
