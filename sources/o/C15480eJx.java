package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$initFilterTXTypeView$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.Bitmap;
import o.C13754dXa;
import o.C52761wXj;
import o.C8039avH;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15480eJx extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public AbstractC16696eom AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public final Application DbNXlk;
    public final Function1<TxRecord, Unit> EZpvd;
    public final Function1<TxRecord, Unit> KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eJB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15480eJx.gEmmrt(this.OLrzqt);
        }
    });
    public TxRecord djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final Function1<TxRecord, Unit> valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.eJx$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.dIjzlO;
    }

    public C15480eJx() {
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(eIY.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C15513eLc.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(eIL.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$6
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C15516eLf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$8
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$special$$inlined$activityViewModels$default$9
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
        this.DbNXlk = new Application();
        this.valueOf = new Function1() { // from class: o.eJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.AuCTel(this.EZpvd, (TxRecord) obj);
            }
        };
        this.EZpvd = new Function1() { // from class: o.eJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.DbNXlk(this.copydefault, (TxRecord) obj);
            }
        };
        this.KWHzl = new Function1() { // from class: o.eJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.AkhnZx(this.AEQbTJ, (TxRecord) obj);
            }
        };
    }

    /* JADX INFO: renamed from: o.eJx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eJx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C15480eJx copydefault() {
            return new C15480eJx();
        }
    }

    private final C59534zip gEmmrt() {
        return (C59534zip) this.OLrzqt.getValue();
    }

    public static final C59534zip gEmmrt(C15480eJx c15480eJx) {
        return c15480eJx.djBIcL();
    }

    public final eIY KWHzl() {
        return (eIY) this.values.getValue();
    }

    public final C15513eLc AEQbTJ() {
        return (C15513eLc) this.AYXKKw.getValue();
    }

    public final eIL EZpvd() {
        return (eIL) this.gEmmrt.getValue();
    }

    public final C15516eLf OLrzqt() {
        return (C15516eLf) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: renamed from: o.eJx$Application */
    public static final class Application extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public Application() {
            super("subTxHistory-txHistory", null, 2, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C15480eJx c15480eJx = C15480eJx.this;
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                AbstractC12782ctV abstractC12782ctVDjBIcL = c15480eJx.KWHzl().djBIcL();
                java.lang.String address = subResponse.getAddress();
                if (address == null) {
                    address = "";
                }
                if (abstractC12782ctVDjBIcL.DbNXlk(address)) {
                    if (c15480eJx.KWHzl().djBIcL().QfsBiF() || c15480eJx.KWHzl().djBIcL().zsXlph()) {
                        subResponse.setShowCancel(false);
                        subResponse.setShowSpeedUp(false);
                        subResponse.setShowPending(false);
                    }
                    c15480eJx.AEQbTJ().copydefault();
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = AbstractC16696eom.copydefault(view);
        fetchVPNInfo();
        AkhnZx();
        valueOf();
        isConnected();
        values();
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.DbNXlk);
        eIY.refresh$default(KWHzl(), false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.DbNXlk);
    }

    private final void AhwBna() {
        KWHzl().AhwBna().clear();
        C33064mpR.OLrzqt(gEmmrt(), KWHzl().AhwBna());
    }

    public final void valueOf() {
        AbstractC16696eom abstractC16696eom = this.AEQbTJ;
        if (abstractC16696eom == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom = null;
        }
        C54989xbV c54989xbV = abstractC16696eom.KWHzl;
        c54989xbV.setStyle(2);
        c54989xbV.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c54989xbV.OLrzqt().setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c54989xbV.setOnClickListener(new ActionBar(c54989xbV, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletTradeHistoryFragment$initFilterTXTypeView$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.eJx$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C15480eJx OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C15480eJx c15480eJx) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c15480eJx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.getChildFragmentManager().beginTransaction().add(C15469eJm.Companion.AEQbTJ(), "TypeFilterBottomSheetFragment").commitAllowingStateLoss();
            }
        }
    }

    private final void isConnected() {
        AbstractC16696eom abstractC16696eom = this.AEQbTJ;
        AbstractC16696eom abstractC16696eom2 = null;
        if (abstractC16696eom == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom = null;
        }
        abstractC16696eom.copydefault.AhwBna(true);
        AbstractC16696eom abstractC16696eom3 = this.AEQbTJ;
        if (abstractC16696eom3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom3 = null;
        }
        abstractC16696eom3.copydefault.OLrzqt(new InterfaceC57903yrG() { // from class: o.eKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C15480eJx.OLrzqt(this.OLrzqt, interfaceC57934yrl);
            }
        });
        AbstractC16696eom abstractC16696eom4 = this.AEQbTJ;
        if (abstractC16696eom4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom4 = null;
        }
        abstractC16696eom4.copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.eKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C15480eJx.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        AbstractC16696eom abstractC16696eom5 = this.AEQbTJ;
        if (abstractC16696eom5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16696eom2 = abstractC16696eom5;
        }
        abstractC16696eom2.OLrzqt.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    public static final void OLrzqt(C15480eJx c15480eJx, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c15480eJx.KWHzl().AEQbTJ(false);
    }

    public static final void AEQbTJ(C15480eJx c15480eJx, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c15480eJx.KWHzl().OLrzqt(false);
    }

    private final void values() {
        AbstractC16696eom abstractC16696eom = this.AEQbTJ;
        AbstractC16696eom abstractC16696eom2 = null;
        if (abstractC16696eom == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom = null;
        }
        abstractC16696eom.EZpvd.setAdapter(gEmmrt());
        AbstractC16696eom abstractC16696eom3 = this.AEQbTJ;
        if (abstractC16696eom3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom3 = null;
        }
        abstractC16696eom3.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        C15513eLc c15513eLcAEQbTJ = AEQbTJ();
        AbstractC16696eom abstractC16696eom4 = this.AEQbTJ;
        if (abstractC16696eom4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom4 = null;
        }
        RecyclerView recyclerView = abstractC16696eom4.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c15513eLcAEQbTJ.copydefault(recyclerView);
        gAI gai = new gAI();
        AbstractC16696eom abstractC16696eom5 = this.AEQbTJ;
        if (abstractC16696eom5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16696eom2 = abstractC16696eom5;
        }
        abstractC16696eom2.EZpvd.addItemDecoration(new C8039avH(new Activity(gai)));
    }

    public static final C15489eKf KWHzl(C15480eJx c15480eJx, int i) {
        java.lang.Object obj = c15480eJx.gEmmrt().getItems().get(i);
        if (obj instanceof C15489eKf) {
            return (C15489eKf) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.eJx$Activity */
    public static final class Activity implements C8039avH.ActionBar<eIO> {
        public final /* synthetic */ gAI AEQbTJ;

        public Activity(gAI gai) {
            this.AEQbTJ = gai;
        }

        @Override // o.C8039avH.ActionBar
        public long EZpvd(int i) {
            TxRecord txRecordAuCTel;
            TxRecord txRecordAuCTel2;
            C15489eKf c15489eKfKWHzl = C15480eJx.KWHzl(C15480eJx.this, i);
            java.lang.Long lValueOf = (c15489eKfKWHzl == null || (txRecordAuCTel2 = c15489eKfKWHzl.AuCTel()) == null) ? null : java.lang.Long.valueOf(txRecordAuCTel2.getTxTime());
            boolean z = (c15489eKfKWHzl == null || (txRecordAuCTel = c15489eKfKWHzl.AuCTel()) == null || !txRecordAuCTel.isShowPending()) ? false : true;
            java.lang.Integer numValueOf = c15489eKfKWHzl != null ? java.lang.Integer.valueOf(c15489eKfKWHzl.fJNWhG()) : null;
            if (lValueOf == null || lValueOf.longValue() == 0 || z || ((numValueOf != null && numValueOf.intValue() == 0) || ((numValueOf != null && numValueOf.intValue() == 1) || ((numValueOf != null && numValueOf.intValue() == 2) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == 8) || (numValueOf != null && numValueOf.intValue() == 9))))))) {
                return i < C15480eJx.this.KWHzl().AhwBna().size() - 1 ? 1000L : -1L;
            }
            return this.AEQbTJ.KWHzl(lValueOf.longValue());
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public eIO OLrzqt(android.view.ViewGroup viewGroup) {
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(C15480eJx.this.getContext()), C13754dXa.TaskDescription.GQzpsZgQzpsZ, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            return new eIO((AbstractC16899esd) viewDataBindingInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void KWHzl(eIO eio, int i) {
            TxRecord txRecordAuCTel;
            TxRecord txRecordAuCTel2;
            C15489eKf c15489eKfKWHzl = C15480eJx.KWHzl(C15480eJx.this, i);
            java.lang.Long lValueOf = (c15489eKfKWHzl == null || (txRecordAuCTel2 = c15489eKfKWHzl.AuCTel()) == null) ? null : java.lang.Long.valueOf(txRecordAuCTel2.getTxTime());
            boolean z = (c15489eKfKWHzl == null || (txRecordAuCTel = c15489eKfKWHzl.AuCTel()) == null || !txRecordAuCTel.isShowPending()) ? false : true;
            java.lang.Integer numValueOf = c15489eKfKWHzl != null ? java.lang.Integer.valueOf(c15489eKfKWHzl.fJNWhG()) : null;
            if (lValueOf != null && lValueOf.longValue() != 0 && !z && ((numValueOf == null || numValueOf.intValue() != 0) && ((numValueOf == null || numValueOf.intValue() != 1) && ((numValueOf == null || numValueOf.intValue() != 2) && ((numValueOf == null || numValueOf.intValue() != 3) && ((numValueOf == null || numValueOf.intValue() != 8) && (numValueOf == null || numValueOf.intValue() != 9))))))) {
                if (eio != null) {
                    eio.OLrzqt(this.AEQbTJ.AEQbTJ(lValueOf.longValue()), i > 0);
                }
            } else if (eio != null) {
                java.lang.String string = C15480eJx.this.getString(C13754dXa.FragmentManager.ensureViewModelStore);
                Intrinsics.checkNotNullExpressionValue(string, "");
                eio.OLrzqt(string, false);
            }
        }
    }

    private final void AkhnZx() {
        KWHzl().EZpvd(eIL.getDefaultStartTime$default(EZpvd(), false, 1, null).getTimeInMillis());
        KWHzl().copydefault(eIL.getDefaultEndTime$default(EZpvd(), false, 1, null).getTimeInMillis());
        KWHzl().OLrzqt(EZpvd().AEQbTJ().getTimeInMillis());
        KWHzl().AYXKKw().add(3);
        KWHzl().AYXKKw().add(4);
        KWHzl().AYXKKw().add(2);
        KWHzl().AYXKKw().add(1);
        KWHzl().OLrzqt().observe(this, new StateListAnimator(new Function1() { // from class: o.eJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.OLrzqt(this.AEQbTJ, (Bitmap) obj);
            }
        }));
        KWHzl().EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.eJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().valueOf().observe(this, new StateListAnimator(new Function1() { // from class: o.eJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.KWHzl(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AEQbTJ().KWHzl().observe(this, new StateListAnimator(new Function1() { // from class: o.eJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.djBIcL(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        KWHzl().AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.eJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.KWHzl(this.KWHzl, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C15480eJx c15480eJx, Bitmap bitmap) {
        if (bitmap instanceof Bitmap.TaskDescription) {
            if (c15480eJx.KWHzl().fetchVPNInfo()) {
                c15480eJx.fetchVPNInfo();
            }
        } else if (bitmap instanceof Bitmap.StateListAnimator) {
            C33064mpR.OLrzqt(c15480eJx.gEmmrt(), c15480eJx.KWHzl().AhwBna());
            AbstractC16696eom abstractC16696eom = c15480eJx.AEQbTJ;
            if (abstractC16696eom == null) {
                Intrinsics.gEmmrt("");
                abstractC16696eom = null;
            }
            abstractC16696eom.copydefault.AEQbTJ();
            AbstractC16696eom abstractC16696eom2 = c15480eJx.AEQbTJ;
            if (abstractC16696eom2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16696eom2 = null;
            }
            abstractC16696eom2.copydefault.valueOf();
            c15480eJx.KWHzl().EZpvd(true);
            c15480eJx.AYXKKw();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15480eJx, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            if (!(bitmap instanceof Bitmap.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.AEQbTJ(((Bitmap.ActionBar) bitmap).AEQbTJ());
            C33064mpR.OLrzqt(c15480eJx.gEmmrt(), c15480eJx.KWHzl().AhwBna());
            AbstractC16696eom abstractC16696eom3 = c15480eJx.AEQbTJ;
            if (abstractC16696eom3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16696eom3 = null;
            }
            abstractC16696eom3.copydefault.AEQbTJ();
            AbstractC16696eom abstractC16696eom4 = c15480eJx.AEQbTJ;
            if (abstractC16696eom4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16696eom4 = null;
            }
            abstractC16696eom4.copydefault.valueOf();
            c15480eJx.KWHzl().EZpvd(true);
            c15480eJx.AYXKKw();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15480eJx, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C15480eJx c15480eJx, java.lang.Boolean bool) {
        AbstractC16696eom abstractC16696eom = c15480eJx.AEQbTJ;
        if (abstractC16696eom == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom = null;
        }
        C33546myW c33546myW = abstractC16696eom.copydefault;
        Intrinsics.copydefault(bool);
        c33546myW.AhwBna(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15480eJx c15480eJx, java.lang.Boolean bool) {
        c15480eJx.fetchVPNInfo();
        c15480eJx.AhwBna();
        AbstractC16696eom abstractC16696eom = null;
        eIY.refresh$default(c15480eJx.KWHzl(), false, 1, null);
        AbstractC16696eom abstractC16696eom2 = c15480eJx.AEQbTJ;
        if (abstractC16696eom2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16696eom = abstractC16696eom2;
        }
        abstractC16696eom.EZpvd.scrollToPosition(0);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C15480eJx c15480eJx, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c15480eJx.KWHzl().AEQbTJ(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15480eJx c15480eJx, java.lang.Integer num) {
        c15480eJx.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        c15480eJx.djBIcL = txRecord;
        gCZ gcz = gCZ.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = c15480eJx.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gcz.EZpvd(childFragmentManager, c15480eJx.KWHzl().djBIcL().DbNXlk(), txRecord, new Function1() { // from class: o.eJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.djBIcL(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C15480eJx c15480eJx, boolean z) {
        c15480eJx.djBIcL = null;
        if (z) {
            c15480eJx.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        c15480eJx.djBIcL = txRecord;
        gCZ gcz = gCZ.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = c15480eJx.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gcz.AEQbTJ(childFragmentManager, txRecord.getWalletId(), txRecord, new Function1() { // from class: o.eJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15480eJx c15480eJx, boolean z) {
        c15480eJx.djBIcL = null;
        if (z) {
            c15480eJx.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        c15480eJx.djBIcL = txRecord;
        gCZ gcz = gCZ.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = c15480eJx.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gcz.KWHzl(childFragmentManager, c15480eJx.KWHzl().djBIcL().DbNXlk(), txRecord, new Function1() { // from class: o.eJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C15480eJx c15480eJx, boolean z) {
        c15480eJx.djBIcL = null;
        if (z) {
            c15480eJx.copydefault();
        }
        return Unit.INSTANCE;
    }

    private final C59534zip djBIcL() {
        C59534zip c59534zip = new C59534zip(KWHzl().AhwBna());
        c59534zip.register(C15491eKh.class, new eKH(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.values(this.EZpvd, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15488eKe.class, new eKY(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.isConnected(this.KWHzl, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15494eKk.class, new eKK(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.fetchVPNInfo(this.AEQbTJ, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15492eKi.class, new eKL(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.fARcdN(this.KWHzl, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15493eKj.class, new eKC(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.ejfBZ(this.OLrzqt, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15500eKq.class, new eKS(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.fJNWhG(this.KWHzl, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15499eKp.class, new eKW(this.valueOf, this.EZpvd, this.KWHzl, new Function1() { // from class: o.eJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.fIwbmz(this.AEQbTJ, (TxRecord) obj);
            }
        }));
        c59534zip.register(C15496eKm.class, new eIG(new Function1() { // from class: o.eJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.KWHzl(this.EZpvd, (java.util.Map) obj);
            }
        }));
        c59534zip.register(C15497eKn.class, new eIM(new Function1() { // from class: o.eJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.OLrzqt(this.KWHzl, (java.util.Map) obj);
            }
        }));
        c59534zip.register(C15498eKo.class, new eKP(new Function1() { // from class: o.eJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.KWHzl(this.AEQbTJ, (android.view.View) obj);
            }
        }));
        return c59534zip;
    }

    public static final Unit values(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.valueOf(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.djBIcL(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.AhwBna(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.isConnected(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.AkhnZx(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.values(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit values(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(final C15480eJx c15480eJx, TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.DbNXlk(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C15480eJx c15480eJx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "wallet", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "history_details", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(c15480eJx.KWHzl().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15480eJx c15480eJx, java.util.Map map) {
        if (c15480eJx.KWHzl().djBIcL().zLjUOn()) {
            c15480eJx.EZpvd((java.util.Map<java.lang.String, java.lang.String>) map);
        } else {
            FragmentActivity fragmentActivityRequireActivity = c15480eJx.requireActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
            if (abstractActivityC33041mov != null) {
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, c15480eJx.getChildFragmentManager(), c15480eJx.KWHzl().djBIcL(), null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15480eJx c15480eJx, java.util.Map map) {
        c15480eJx.EZpvd((java.util.Map<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15480eJx c15480eJx, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        eIY.refresh$default(c15480eJx.KWHzl(), false, 1, null);
        c15480eJx.KWHzl().AhwBna().clear();
        C33064mpR.OLrzqt(c15480eJx.gEmmrt(), c15480eJx.KWHzl().AhwBna());
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = null;
        if (KWHzl().copydefault() == null) {
            new C16264ege().AEQbTJ(KWHzl().djBIcL().DbNXlk(), new Function1() { // from class: o.eJX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15480eJx.AEQbTJ(map, this, (java.lang.String) obj);
                }
            }).show(getChildFragmentManager(), (java.lang.String) null);
            return;
        }
        if (map != null) {
            C10854bwM c10854bwMCopydefault = KWHzl().copydefault();
            str = map.get(C33129mqd.gEmmrt(c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()) : null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            OLrzqt(KWHzl().copydefault(), str);
        }
    }

    public static final Unit AEQbTJ(java.util.Map map, C15480eJx c15480eJx, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = map != null ? (java.lang.String) map.get(str) : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            c15480eJx.OLrzqt(C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(str))), str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gvz.openChooseAddressDialog$default(o.gvz, androidx.fragment.app.FragmentManager, java.lang.String, long, long, java.lang.String, boolean, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void OLrzqt(C10854bwM c10854bwM, final java.lang.String str) {
        if (c10854bwM != null && c10854bwM.dxcTrN() && KWHzl().djBIcL().DGOPHZ()) {
            C21241gvz c21241gvz = C21241gvz.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            java.lang.String strDbNXlk = KWHzl().djBIcL().DbNXlk();
            C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
            c21241gvz.KWHzl(childFragmentManager, strDbNXlk, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L, c10854bwM.AhwBna(), (256 & 16) != 0 ? "" : "", (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? false : true, (256 & 128) != 0 ? "" : getTAG(), (256 & 256) != 0 ? false : false, (Function1<? super java.lang.String, Unit>) ((256 & 512) != 0 ? null : new Function1() { // from class: o.eJO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15480eJx.AEQbTJ(this.OLrzqt, str, (java.lang.String) obj);
                }
            }));
            return;
        }
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(KWHzl().djBIcL(), c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, null, 2, null);
        copydefault(str + (chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null));
    }

    public static final Unit AEQbTJ(C15480eJx c15480eJx, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        c15480eJx.copydefault(str + str2);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(300L, 300L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.eJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15480eJx.KWHzl(this.EZpvd, (java.lang.Long) obj);
            }
        };
        this.AhwBna = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.eJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15480eJx.EZpvd(function1, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C15480eJx c15480eJx, java.lang.Long l) {
        c15480eJx.KWHzl().AEQbTJ(false);
        InterfaceC58217yxC interfaceC58217yxC = c15480eJx.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
    }

    private final void fetchVPNInfo() {
        AbstractC16696eom abstractC16696eom = this.AEQbTJ;
        if (abstractC16696eom == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom = null;
        }
        abstractC16696eom.AEQbTJ.getRoot().setVisibility(0);
    }

    private final void AYXKKw() {
        AbstractC16696eom abstractC16696eom = this.AEQbTJ;
        AbstractC16696eom abstractC16696eom2 = null;
        if (abstractC16696eom == null) {
            Intrinsics.gEmmrt("");
            abstractC16696eom = null;
        }
        abstractC16696eom.AEQbTJ.getRoot().setVisibility(8);
        AbstractC16696eom abstractC16696eom3 = this.AEQbTJ;
        if (abstractC16696eom3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16696eom2 = abstractC16696eom3;
        }
        abstractC16696eom2.AEQbTJ.OLrzqt.cancelAnimation();
    }
}
