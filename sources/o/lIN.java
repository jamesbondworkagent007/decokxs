package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BuySellOrderHistoryDetailParameters;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$addObservers$1;
import com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailViewModelV2;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C31351lsQ;
import o.C47244tmQ;
import o.InterfaceC6804aWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lIN extends AbstractC30023lJa<AbstractC31531lvl> {
    public final InterfaceC56387yDm EZpvd;
    public BuySellOrderHistoryDetailParameters OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BuySellTradeType.values().length];
            try {
                iArr[BuySellTradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BuySellTradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BuySellTradeType.CONVERT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public lIN() {
        super(C31351lsQ.ActionBar.QVAiDq);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuySellOrderDetailViewModelV2.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.buysellconvert.transaction.buysell.BuySellOrderDetailFragmentV2$special$$inlined$viewModels$default$5
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

    public BuySellOrderDetailViewModelV2 OLrzqt() {
        return (BuySellOrderDetailViewModelV2) this.EZpvd.getValue();
    }

    @Override // o.AbstractC31907mIi
    public void djBIcL() {
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters;
        uniffi.buy_sell.BuySellTradeType buySellTradeType;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (buySellOrderHistoryDetailParameters = (BuySellOrderHistoryDetailParameters) arguments.getParcelable("BUY_SELL_ORDER_DETAIL_PARAMS")) == null) {
            buySellOrderHistoryDetailParameters = new BuySellOrderHistoryDetailParameters(BuySellTradeType.BUY, "", false, "");
        }
        this.OLrzqt = buySellOrderHistoryDetailParameters;
        int i = TaskDescription.OLrzqt[buySellOrderHistoryDetailParameters.copydefault().ordinal()];
        if (i == 1) {
            buySellTradeType = uniffi.buy_sell.BuySellTradeType.BUY;
        } else if (i == 2) {
            buySellTradeType = uniffi.buy_sell.BuySellTradeType.SELL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            buySellTradeType = uniffi.buy_sell.BuySellTradeType.CONVERT;
        }
        BuySellOrderDetailViewModelV2 buySellOrderDetailViewModelV2OLrzqt = OLrzqt();
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters2 = this.OLrzqt;
        if (buySellOrderHistoryDetailParameters2 == null) {
            Intrinsics.gEmmrt("");
            buySellOrderHistoryDetailParameters2 = null;
        }
        buySellOrderDetailViewModelV2OLrzqt.OLrzqt(buySellOrderHistoryDetailParameters2.EZpvd(), buySellTradeType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC31907mIi
    public void gEmmrt() {
        AbstractC31531lvl abstractC31531lvl = (AbstractC31531lvl) isConnected();
        abstractC31531lvl.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.lIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lIN.EZpvd(this.KWHzl, view);
            }
        });
        abstractC31531lvl.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lIN.AEQbTJ(this.EZpvd, view);
            }
        });
        C55173xeu c55173xeu = abstractC31531lvl.gEmmrt.KWHzl;
        c55173xeu.setImage(C47244tmQ.StateListAnimator.AEQbTJ);
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.UlJrfe));
        c55173xeu.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lIN.AYXKKw(this.AEQbTJ, view);
            }
        });
    }

    public static final void EZpvd(lIN lin, android.view.View view) {
        FragmentActivity activity = lin.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void AEQbTJ(lIN lin, android.view.View view) {
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
        android.content.Context contextRequireContext = lin.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC6804aWL.Application.openSupportCenter$default(interfaceC6804aWL, contextRequireContext, null, 2, null);
    }

    public static final void AYXKKw(lIN lin, android.view.View view) {
        lin.OLrzqt().copydefault();
    }

    @Override // o.AbstractC31907mIi
    public void EZpvd() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BuySellOrderDetailFragmentV2$addObservers$1(this, null), 3, null);
        OLrzqt().KWHzl().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.lIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lIN.copydefault(this.copydefault, (C32989mnw) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lIN lin, C32989mnw c32989mnw) {
        kotlin.Pair pair;
        if (c32989mnw != null && (pair = (kotlin.Pair) c32989mnw.KWHzl()) != null) {
            C30030lJh c30030lJh = ((AbstractC31531lvl) lin.isConnected()).copydefault;
            android.content.Context contextRequireContext = lin.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lin);
            SupportService supportService = (SupportService) pair.getFirst();
            C3682AqZ c3682AqZ = (C3682AqZ) pair.getSecond();
            BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters = lin.OLrzqt;
            if (buySellOrderHistoryDetailParameters == null) {
                Intrinsics.gEmmrt("");
                buySellOrderHistoryDetailParameters = null;
            }
            c30030lJh.KWHzl(contextRequireContext, lifecycleScope, supportService, c3682AqZ, buySellOrderHistoryDetailParameters.copydefault());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt().OLrzqt();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        OLrzqt().AEQbTJ();
        super.onPause();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        AbstractC31531lvl abstractC31531lvl = (AbstractC31531lvl) isConnected();
        abstractC31531lvl.valueOf.getRoot().setVisibility(8);
        abstractC31531lvl.AhwBna.setVisibility(8);
        abstractC31531lvl.gEmmrt.getRoot().setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        AbstractC31531lvl abstractC31531lvl = (AbstractC31531lvl) isConnected();
        abstractC31531lvl.valueOf.getRoot().setVisibility(0);
        abstractC31531lvl.AhwBna.setVisibility(8);
        abstractC31531lvl.gEmmrt.getRoot().setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        AbstractC31531lvl abstractC31531lvl = (AbstractC31531lvl) isConnected();
        abstractC31531lvl.valueOf.getRoot().setVisibility(8);
        abstractC31531lvl.AhwBna.setVisibility(0);
        abstractC31531lvl.gEmmrt.getRoot().setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        AbstractC31531lvl abstractC31531lvl = (AbstractC31531lvl) isConnected();
        abstractC31531lvl.valueOf.getRoot().setVisibility(8);
        abstractC31531lvl.AhwBna.setVisibility(8);
        abstractC31531lvl.gEmmrt.getRoot().setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(C3682AqZ c3682AqZ) {
        AbstractC31531lvl abstractC31531lvl = (AbstractC31531lvl) isConnected();
        abstractC31531lvl.KWHzl.setData(c3682AqZ);
        C30027lJe c30027lJe = abstractC31531lvl.OLrzqt;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30027lJe.setData(c3682AqZ, childFragmentManager);
        C30030lJh c30030lJh = abstractC31531lvl.copydefault;
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters = this.OLrzqt;
        if (buySellOrderHistoryDetailParameters == null) {
            Intrinsics.gEmmrt("");
            buySellOrderHistoryDetailParameters = null;
        }
        c30030lJh.setData(c3682AqZ, buySellOrderHistoryDetailParameters.AEQbTJ());
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final lIN AEQbTJ(@NotNull BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters) {
            Intrinsics.checkNotNullParameter(buySellOrderHistoryDetailParameters, "");
            lIN lin = new lIN();
            lin.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("BUY_SELL_ORDER_DETAIL_PARAMS", buySellOrderHistoryDetailParameters)));
            return lin;
        }
    }
}
