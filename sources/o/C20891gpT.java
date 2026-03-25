package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressSourceGroup;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.DividerBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20891gpT extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final java.util.ArrayList<java.lang.Object> AEQbTJ;
    public final int AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public C16573emV copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.gpT$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C16573emV c16573emV) {
        Intrinsics.checkNotNullParameter(c16573emV, "");
        this.copydefault = c16573emV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C20891gpT() {
        final Function0 function0 = new Function0() { // from class: o.gpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20891gpT.djBIcL(this.KWHzl);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C20959gqi.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$4
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
        Function0 function03 = new Function0() { // from class: o.gpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20891gpT.gEmmrt(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C20974gqx.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiReceiveAddressSingleFragment$special$$inlined$viewModels$default$8
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function03);
        this.AEQbTJ = new java.util.ArrayList<>();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20891gpT.EZpvd(this.KWHzl);
            }
        });
        this.AYXKKw = C13754dXa.TaskDescription.Th;
    }

    /* JADX INFO: renamed from: o.gpT$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gpT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C20891gpT newInstance$default(Application application, AddressSourceGroup addressSourceGroup, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressSourceGroup = AddressSourceGroup.DEFAULT;
            }
            return application.AEQbTJ(addressSourceGroup);
        }

        public final C20891gpT AEQbTJ(@NotNull AddressSourceGroup addressSourceGroup) {
            Intrinsics.checkNotNullParameter(addressSourceGroup, "");
            C20891gpT c20891gpT = new C20891gpT();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("send_coin_group", addressSourceGroup.getGroup());
            c20891gpT.setArguments(bundle);
            return c20891gpT;
        }
    }

    public final C20959gqi KWHzl() {
        return (C20959gqi) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner djBIcL(C20891gpT c20891gpT) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c20891gpT.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final C20974gqx AEQbTJ() {
        return (C20974gqx) this.valueOf.getValue();
    }

    public static final C20974gqx copydefault(C20891gpT c20891gpT, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        C20897gpZ c20897gpZ = new C20897gpZ(c20891gpT.KWHzl());
        android.content.Context contextRequireContext = c20891gpT.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C20974gqx(c20897gpZ, new dZR(contextRequireContext), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    public final C16573emV OLrzqt() {
        C16573emV c16573emV = this.copydefault;
        if (c16573emV != null) {
            return c16573emV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final RecyclerView copydefault() {
        RecyclerView recyclerView = OLrzqt().copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    private final C59534zip AhwBna() {
        return (C59534zip) this.EZpvd.getValue();
    }

    public static final C59534zip EZpvd(C20891gpT c20891gpT) {
        return new C59534zip(c20891gpT.AEQbTJ);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        KWHzl(C16573emV.OLrzqt(layoutInflater, viewGroup, false));
        return OLrzqt().getRoot();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        djBIcL();
        valueOf();
        gEmmrt();
    }

    public final void djBIcL() {
        AEQbTJ().AEQbTJ();
    }

    private final void valueOf() {
        copydefault().setHasFixedSize(false);
        copydefault().setLayoutManager(new LinearLayoutManager(OLrzqt().getRoot().getContext(), 1, false));
        AYXKKw();
    }

    public final void AYXKKw() {
        C59534zip c59534zipAhwBna = AhwBna();
        java.lang.Integer numEZpvd = AEQbTJ().EZpvd();
        c59534zipAhwBna.register(AddressGroupBean.class, new C20837goS(numEZpvd != null ? numEZpvd.intValue() : MultiTransferMode.MODE_ONE_TO_MANY.getValue(), new Function2() { // from class: o.gpP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20891gpT.OLrzqt(this.KWHzl, (AddressGroupBean) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: o.gpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20891gpT.KWHzl(this.KWHzl, (AddressGroupBean) obj);
            }
        }));
        C59534zip c59534zipAhwBna2 = AhwBna();
        long jCopydefault = AEQbTJ().copydefault();
        java.lang.Integer numEZpvd2 = AEQbTJ().EZpvd();
        c59534zipAhwBna2.register(AddressChildBean.class, new C20840goV(java.lang.Long.valueOf(jCopydefault), numEZpvd2 != null ? numEZpvd2.intValue() : MultiTransferMode.MODE_ONE_TO_MANY.getValue(), new Function1() { // from class: o.gpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20891gpT.EZpvd(this.OLrzqt, (AddressChildBean) obj);
            }
        }));
        AhwBna().register(DividerBean.class, new C20831goM());
        copydefault().setAdapter(AhwBna());
    }

    public static final Unit OLrzqt(C20891gpT c20891gpT, AddressGroupBean addressGroupBean, boolean z) {
        Intrinsics.checkNotNullParameter(addressGroupBean, "");
        c20891gpT.KWHzl().KWHzl(addressGroupBean.getRootWalletId(), z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C20891gpT c20891gpT, AddressGroupBean addressGroupBean) {
        Intrinsics.checkNotNullParameter(addressGroupBean, "");
        c20891gpT.KWHzl().KWHzl(addressGroupBean.getRootWalletId(), addressGroupBean.getAddressGroup());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C20891gpT c20891gpT, AddressChildBean addressChildBean) {
        Intrinsics.checkNotNullParameter(addressChildBean, "");
        if (c20891gpT.AEQbTJ().AhwBna()) {
            C20959gqi c20959gqiKWHzl = c20891gpT.KWHzl();
            int addressGroup = addressChildBean.getAddressGroup();
            java.lang.String walletId = addressChildBean.getWalletId();
            c20959gqiKWHzl.AEQbTJ(addressGroup, walletId != null ? walletId : "", addressChildBean.getAddress());
        } else {
            C20959gqi c20959gqiKWHzl2 = c20891gpT.KWHzl();
            int addressGroup2 = addressChildBean.getAddressGroup();
            java.lang.String walletId2 = addressChildBean.getWalletId();
            c20959gqiKWHzl2.EZpvd(addressGroup2, walletId2 != null ? walletId2 : "", addressChildBean.getAddress());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    private final void gEmmrt() {
        KWHzl().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.gqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20891gpT.KWHzl(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        AEQbTJ().KWHzl().observe(this, new ActionBar(new Function1() { // from class: o.gqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20891gpT.AEQbTJ(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gqx */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C20891gpT c20891gpT, java.util.ArrayList arrayList) {
        C20974gqx c20974gqxAEQbTJ = c20891gpT.AEQbTJ();
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList<AddressGroupBean> arrayListAEQbTJ = c20974gqxAEQbTJ.AEQbTJ(arrayList, AddressSourceGroup.valueOf(c20891gpT.AEQbTJ().OLrzqt()));
        c20891gpT.EZpvd();
        c20891gpT.OLrzqt(arrayListAEQbTJ);
        android.view.View view = c20891gpT.getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.gqc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C20891gpT.valueOf(this.OLrzqt);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(C20891gpT c20891gpT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20891gpT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C20891gpT c20891gpT, java.util.ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        c20891gpT.OLrzqt((java.util.ArrayList<AddressGroupBean>) arrayList);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        if (KWHzl().AYXKKw()) {
            C32866mlf.onEvent$default("AppMultisender_ReceivingAddress_ChooseWallet_Check", (TrackChannel[]) null, new Function1() { // from class: o.gpX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20891gpT.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("cefi_account_receiving", "1", false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.ArrayList<AddressGroupBean> arrayList) {
        this.AEQbTJ.clear();
        for (AddressGroupBean addressGroupBean : arrayList) {
            if (addressGroupBean.getAddressGroup() != 3 && addressGroupBean.getAddressGroup() != 2) {
                this.AEQbTJ.add(addressGroupBean);
                if (addressGroupBean.isExpanded()) {
                    this.AEQbTJ.addAll(addressGroupBean.getDataList());
                }
                if (addressGroupBean.isShowDivider()) {
                    this.AEQbTJ.add(new DividerBean(false, 1, null));
                }
            } else {
                this.AEQbTJ.addAll(addressGroupBean.getDataList());
            }
        }
        AhwBna().notifyDataSetChanged();
    }

    public static final ViewModelProvider.Factory gEmmrt(final C20891gpT c20891gpT) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C20974gqx.class), new Function1() { // from class: o.gpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20891gpT.copydefault(this.copydefault, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
