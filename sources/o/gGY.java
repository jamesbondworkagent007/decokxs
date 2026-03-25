package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.tx.send.CeDeFiAAAssetInfo;
import com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$observeData$1;
import com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$observeData$2;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gGY extends AbstractC32996moC {
    public C16693eoj EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final java.util.ArrayList<java.lang.Object> OLrzqt;
    public final int copydefault;
    public final InterfaceC56387yDm valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public gGY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19565gHb.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = new java.util.ArrayList<>();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.gHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gGY.copydefault(this.copydefault);
            }
        });
        this.copydefault = C13754dXa.TaskDescription.aVhqwO;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gGY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final gGY KWHzl(@NotNull java.lang.String str, @NotNull CeDeFiAAAssetInfo ceDeFiAAAssetInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(ceDeFiAAAssetInfo, "");
            gGY ggy = new gGY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg_send_wallet_id", str);
            bundle.putParcelable("arg_send_asset_info", ceDeFiAAAssetInfo);
            ggy.setArguments(bundle);
            return ggy;
        }
    }

    public final C19565gHb OLrzqt() {
        return (C19565gHb) this.valueOf.getValue();
    }

    private final RecyclerView AEQbTJ() {
        C16693eoj c16693eoj = this.EZpvd;
        if (c16693eoj == null) {
            Intrinsics.gEmmrt("");
            c16693eoj = null;
        }
        RecyclerView recyclerView = c16693eoj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C59534zip KWHzl() {
        return (C59534zip) this.KWHzl.getValue();
    }

    public static final C59534zip copydefault(gGY ggy) {
        return new C59534zip(ggy.OLrzqt);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16693eoj c16693eojEZpvd = C16693eoj.EZpvd(layoutInflater, viewGroup, false);
        this.EZpvd = c16693eojEZpvd;
        if (c16693eojEZpvd == null) {
            Intrinsics.gEmmrt("");
            c16693eojEZpvd = null;
        }
        RecyclerView root = c16693eojEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd();
        AYXKKw();
        valueOf();
        copydefault();
    }

    public final void EZpvd() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("arg_send_wallet_id");
            if (string == null) {
                string = "";
            }
            CeDeFiAAAssetInfo ceDeFiAAAssetInfo = (CeDeFiAAAssetInfo) arguments.getParcelable("arg_send_asset_info");
            if (ceDeFiAAAssetInfo == null) {
                requireActivity().finish();
            } else {
                OLrzqt().AEQbTJ(string, ceDeFiAAAssetInfo);
            }
        }
    }

    private final void AYXKKw() {
        AEQbTJ().setHasFixedSize(true);
        AEQbTJ().setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        AEQbTJ().setAdapter(KWHzl());
    }

    private final void valueOf() {
        KWHzl().register(C19574gHk.class, new C19578gHo());
        KWHzl().register(C19577gHn.class, new C19575gHl(new Function1() { // from class: o.gHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gGY.KWHzl(this.copydefault, (C19577gHn) obj);
            }
        }));
        KWHzl().register(C17742fQp.class, new C19581gHr());
    }

    public static final Unit KWHzl(gGY ggy, C19577gHn c19577gHn) {
        Intrinsics.checkNotNullParameter(c19577gHn, "");
        ggy.OLrzqt().OLrzqt(c19577gHn);
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSelectReceiveAddressForAAFragment$observeData$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new WalletSelectReceiveAddressForAAFragment$observeData$2(this, null), 3, null);
    }
}
