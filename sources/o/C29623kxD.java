package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.activity.SignalActivityViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29623kxD extends AbstractC29621kxB {
    public C21601hFk AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public boolean djBIcL;
    public InterfaceC29581kwO gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C29623kxD() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.wallet_address.SmartMoneyAddressesBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.wallet_address.SmartMoneyAddressesBottomSheet$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.wallet_address.SmartMoneyAddressesBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.wallet_address.SmartMoneyAddressesBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.wallet_address.SmartMoneyAddressesBottomSheet$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29623kxD.AEQbTJ(this.EZpvd);
            }
        });
    }

    private final SignalActivityViewModel AhwBna() {
        return (SignalActivityViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kxB.AEQbTJ()V */
    public final SignalUiModel AEQbTJ() {
        SignalUiModel signalUiModel;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (signalUiModel = (SignalUiModel) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.smartmoney_addresses", SignalUiModel.class))) == null) ? new SignalUiModel(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0.0f, false, null, null, 33554431, null) : signalUiModel;
    }

    private final kMM djBIcL() {
        return (kMM) this.valueOf.getValue();
    }

    public static final kMM AEQbTJ(C29623kxD c29623kxD) {
        kMM kmm = new kMM();
        kmm.register(C29626kxG.class, new C29670kxy(c29623kxD.gEmmrt));
        return kmm;
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
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ODXsMY));
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setPaddingRelative(0, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 12);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C21601hFk.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().OLrzqt(), null, new Application(), 2, null);
        valueOf();
    }

    /* JADX INFO: renamed from: o.kxD$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29625kxF c29625kxF, Continuation<? super Unit> continuation) {
            C29623kxD.this.OLrzqt(c29625kxF);
            return Unit.INSTANCE;
        }
    }

    private final void valueOf() {
        AhwBna().OLrzqt(AEQbTJ());
    }

    private final void AYXKKw() {
        C21601hFk c21601hFk = this.AYXKKw;
        if (c21601hFk != null) {
            c21601hFk.AEQbTJ.setAdapter(djBIcL());
            c21601hFk.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.kxE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29623kxD.EZpvd(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void EZpvd(C29623kxD c29623kxD, android.view.View view) {
        c29623kxD.valueOf();
    }

    public final void OLrzqt(C29625kxF c29625kxF) {
        C21601hFk c21601hFk = this.AYXKKw;
        if (c21601hFk != null) {
            C55113xdn c55113xdn = c21601hFk.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(c29625kxF.EZpvd() ? 0 : 8);
            C55173xeu c55173xeu = c21601hFk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(((c29625kxF.KWHzl().isEmpty() || c29625kxF.AEQbTJ() != null) && !c29625kxF.EZpvd()) ? 0 : 8);
            RecyclerView recyclerView = c21601hFk.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility((!(c29625kxF.KWHzl().isEmpty() ^ true) || c29625kxF.EZpvd()) ? 8 : 0);
            LinearLayoutCompat linearLayoutCompat = c21601hFk.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            if ((!c29625kxF.KWHzl().isEmpty()) && !c29625kxF.EZpvd()) {
                i = 0;
            }
            linearLayoutCompat.setVisibility(i);
            if (!c29625kxF.KWHzl().isEmpty()) {
                kMM.setData$default(djBIcL(), c29625kxF.KWHzl(), null, 2, null);
            }
        }
        if (this.djBIcL) {
            return;
        }
        C29408ktA.KWHzl.KWHzl(AEQbTJ().ejfBZ() == TxType.BUY, AEQbTJ().fIwbmz(), AEQbTJ().djBIcL(), AEQbTJ().values());
        this.djBIcL = true;
    }

    /* JADX INFO: renamed from: o.kxD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kxD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C29623kxD newInstance$default(Activity activity, SignalUiModel signalUiModel, InterfaceC29581kwO interfaceC29581kwO, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                interfaceC29581kwO = null;
            }
            return activity.AEQbTJ(signalUiModel, interfaceC29581kwO);
        }

        public final C29623kxD AEQbTJ(@NotNull SignalUiModel signalUiModel, InterfaceC29581kwO interfaceC29581kwO) {
            Intrinsics.checkNotNullParameter(signalUiModel, "");
            C29623kxD c29623kxD = new C29623kxD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.smartmoney_addresses", signalUiModel);
            c29623kxD.setArguments(bundle);
            c29623kxD.gEmmrt = interfaceC29581kwO;
            return c29623kxD;
        }
    }
}
