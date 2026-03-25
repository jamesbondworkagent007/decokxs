package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lBu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C29827lBu extends AbstractC29813lBg<AbstractC31476luj> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int DbNXlk = 8;
    public java.util.Map<java.lang.String, java.lang.String> AkhnZx;
    public java.lang.String AuCTel;
    public final InterfaceC56387yDm ejfBZ;
    public final C43316rmw fIwbmz;
    public boolean fetchVPNInfo;

    @Override // o.lzN
    public void AYXKKw() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN
    public boolean AhwBna() {
        return this.fetchVPNInfo;
    }

    @Override // o.lzN
    public void EZpvd() {
    }

    @Override // o.lzN
    public void djBIcL() {
    }

    public C29827lBu() {
        super(C31351lsQ.ActionBar.values);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentLimitsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentLimitsFragment$special$$inlined$viewModels$default$2
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentLimitsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentLimitsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentLimitsFragment$special$$inlined$viewModels$default$5
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
        this.AkhnZx = C56424yEw.KWHzl();
        this.AuCTel = "";
        this.fIwbmz = new C43316rmw();
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return fARcdN();
    }

    private final SelectPaymentMethodViewModel fARcdN() {
        return (SelectPaymentMethodViewModel) this.ejfBZ.getValue();
    }

    @Override // o.lzN, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("PaymentLimitsFragment_list") : null;
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = serializable instanceof LinkedHashMap ? (LinkedHashMap) serializable : null;
        if (mapKWHzl == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        this.AkhnZx = mapKWHzl;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("PaymentLimitsFragment_list_currency")) == null) {
            string = "";
        }
        this.AuCTel = string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((AbstractC31476luj) KWHzl()).OLrzqt;
        Intrinsics.copydefault(recyclerView);
        recyclerView.setVisibility(0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.addItemDecoration(new C57593ylO(recyclerView.getContext().getResources().getDimensionPixelSize(mDC.Activity.OLrzqt), false, false));
        C43316rmw c43316rmw = this.fIwbmz;
        c43316rmw.register(C31438lty.class, new C30005lIj());
        c43316rmw.setItems(KWHzl(this.AkhnZx));
        c43316rmw.notifyDataSetChanged();
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX INFO: renamed from: o.lBu$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lBu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29827lBu OLrzqt(@NotNull LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, java.lang.String str) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "");
            C29827lBu c29827lBu = new C29827lBu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("PaymentLimitsFragment_list", new LinkedHashMap(linkedHashMap));
            bundle.putString("PaymentLimitsFragment_list_currency", str);
            c29827lBu.setArguments(bundle);
            return c29827lBu;
        }
    }

    public final java.util.List<C31438lty> KWHzl(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String strAYXKKw;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(entry.getValue(), this.AuCTel, "", null, null, false, 28, null);
            if (Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) C33070mpX.AYXKKw(C31351lsQ.Activity.aJFbMH))) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.QslYrK);
            } else if (Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) C33070mpX.AYXKKw(C31351lsQ.Activity.akftKQ))) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.gGNlxh);
            } else if (Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) C33070mpX.AYXKKw(C31351lsQ.Activity.alsFma))) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.fVjYLc);
            } else {
                Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) C33070mpX.AYXKKw(C31351lsQ.Activity.gSBher));
                strAYXKKw = "";
            }
            arrayList.add(new C31438lty(key, strAYXKKw, strPrependFiatSymbol$default));
        }
        return arrayList;
    }
}
