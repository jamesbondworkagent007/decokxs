package o;

import android.widget.FrameLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.buysell.ui.pro.transaction.list.OrderRouteType;
import com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder;
import com.okinc.buysell.ui.pro.transaction.list.viewmodel.FiatCryptoOrderViewModel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.BuySellOrderDetailParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31456luP;
import o.C30199lPn;
import o.C31351lsQ;
import o.C31698mAp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lOR extends AbstractC30192lPg {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final int AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public C30196lPk EZpvd;
    public int KWHzl;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lOW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return lOR.gEmmrt(this.EZpvd);
        }
    });
    public AbstractC31456luP djBIcL;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderRouteType.values().length];
            try {
                iArr[OrderRouteType.WEBVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderRouteType.NATIVE_DETAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public lOR() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FiatCryptoOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = 1;
        this.AEQbTJ = C31351lsQ.ActionBar.gHZMYf;
    }

    /* JADX DEBUG: Possible override for method o.lPg.OLrzqt()V */
    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String gEmmrt(lOR lor) {
        return lor.requireArguments().getString("DEPOSIT_TYPE", "buy_sell");
    }

    public final FiatCryptoOrderViewModel EZpvd() {
        return (FiatCryptoOrderViewModel) this.AhwBna.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final lOR OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("DEPOSIT_TYPE", str);
            lOR lor = new lOR();
            lor.setArguments(bundle);
            return lor;
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        android.widget.FrameLayout frameLayout;
        C30193lPh.copydefault.KWHzl(null);
        RxBus.KWHzl("event_fiat_order_list_clear_filter");
        FiatCryptoOrderViewModel fiatCryptoOrderViewModelEZpvd = EZpvd();
        int i = this.KWHzl;
        java.lang.String strOLrzqt = OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        fiatCryptoOrderViewModelEZpvd.AEQbTJ(i, strOLrzqt);
        RxBus.AEQbTJ("event_fiat_order_list_filter_change").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderFragment$onVisible$1
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                FrameLayout frameLayout2;
                FiatCryptoOrderViewModel fiatCryptoOrderViewModelEZpvd2 = this.this$0.EZpvd();
                int i2 = this.this$0.KWHzl;
                String strOLrzqt2 = this.this$0.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
                fiatCryptoOrderViewModelEZpvd2.AEQbTJ(i2, strOLrzqt2);
                AbstractC31456luP abstractC31456luP = this.this$0.djBIcL;
                if (abstractC31456luP == null || (frameLayout2 = abstractC31456luP.KWHzl) == null) {
                    return;
                }
                C30199lPn.OLrzqt(frameLayout2);
            }
        });
        AbstractC31456luP abstractC31456luP = this.djBIcL;
        if (abstractC31456luP == null || (frameLayout = abstractC31456luP.KWHzl) == null) {
            return;
        }
        C30199lPn.OLrzqt(frameLayout);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C30193lPh.copydefault.KWHzl(null);
        SubHelper.AEQbTJ(this);
        super.onDestroy();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C31698mAp c31698mAp;
        C31698mAp c31698mAp2;
        C31698mAp c31698mAp3;
        C31698mAp c31698mAp4;
        C31698mAp c31698mAp5;
        Intrinsics.checkNotNullParameter(view, "");
        djBIcL();
        this.djBIcL = AbstractC31456luP.AEQbTJ(view);
        java.lang.String strOLrzqt = OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        C30196lPk c30196lPk = new C30196lPk(strOLrzqt, getContext(), new Function1() { // from class: o.lOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lOR.AEQbTJ(this.AEQbTJ, (FiatThirdPartyOrder) obj);
            }
        });
        this.EZpvd = c30196lPk;
        AbstractC31456luP abstractC31456luP = this.djBIcL;
        if (abstractC31456luP != null && (c31698mAp5 = abstractC31456luP.AEQbTJ) != null) {
            c31698mAp5.setAdapter(c30196lPk);
        }
        AbstractC31456luP abstractC31456luP2 = this.djBIcL;
        if (abstractC31456luP2 != null && (c31698mAp4 = abstractC31456luP2.AEQbTJ) != null) {
            c31698mAp4.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        AbstractC31456luP abstractC31456luP3 = this.djBIcL;
        if (abstractC31456luP3 != null && (c31698mAp3 = abstractC31456luP3.AEQbTJ) != null) {
            c31698mAp3.setRefreshView(new C31699mAq(getActivity(), null, 0, 6, null));
        }
        AbstractC31456luP abstractC31456luP4 = this.djBIcL;
        if (abstractC31456luP4 != null && (c31698mAp2 = abstractC31456luP4.AEQbTJ) != null) {
            c31698mAp2.setLoadMoreView(new C31700mAr(getActivity(), null, 0, 6, null));
        }
        AbstractC31456luP abstractC31456luP5 = this.djBIcL;
        if (abstractC31456luP5 == null || (c31698mAp = abstractC31456luP5.AEQbTJ) == null) {
            return;
        }
        c31698mAp.setRecyclerListener(new TaskDescription());
    }

    public static final Unit AEQbTJ(lOR lor, FiatThirdPartyOrder fiatThirdPartyOrder) {
        Intrinsics.checkNotNullParameter(fiatThirdPartyOrder, "");
        lor.OLrzqt(fiatThirdPartyOrder);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements C31698mAp.Application {
        public TaskDescription() {
        }

        @Override // o.C31698mAp.Application
        public void EZpvd() {
            FiatCryptoOrderViewModel fiatCryptoOrderViewModelEZpvd = lOR.this.EZpvd();
            java.lang.String strOLrzqt = lOR.this.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            fiatCryptoOrderViewModelEZpvd.AEQbTJ(1, strOLrzqt);
        }

        @Override // o.C31698mAp.Application
        public void OLrzqt() {
            lOR.this.EZpvd().EZpvd();
        }
    }

    private final void djBIcL() {
        EZpvd().AEQbTJ().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.lOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lOR.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        EZpvd().KWHzl().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.lOY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lOR.EZpvd(this.copydefault, (FiatCryptoOrderViewModel.TaskDescription) obj);
            }
        }));
    }

    public static final Unit copydefault(lOR lor, boolean z) {
        lor.KWHzl();
        lor.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lOR lor, FiatCryptoOrderViewModel.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        lor.copydefault(taskDescription.OLrzqt(), taskDescription.AEQbTJ());
        if (!taskDescription.OLrzqt().isEmpty()) {
            RxBus.KWHzl("event_fiat_order_list_show_filter_icon");
        } else if (taskDescription.OLrzqt().isEmpty() && !taskDescription.AEQbTJ()) {
            RxBus.KWHzl("event_fiat_order_list_hide_filter_icon");
        }
        return Unit.INSTANCE;
    }

    public final OrderRouteType KWHzl(FiatThirdPartyOrder fiatThirdPartyOrder) {
        if (Intrinsics.EZpvd((java.lang.Object) fiatThirdPartyOrder.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.ADVCASH.getCode()) && fiatThirdPartyOrder.getType() == TradeType.SELL) {
            return OrderRouteType.WEBVIEW;
        }
        return OrderRouteType.NATIVE_DETAIL;
    }

    public final void OLrzqt(FiatThirdPartyOrder fiatThirdPartyOrder) {
        java.lang.String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i = StateListAnimator.KWHzl[KWHzl(fiatThirdPartyOrder).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
                TradeType type = fiatThirdPartyOrder.getType();
                if (type == null) {
                    type = TradeType.BUY;
                }
                java.lang.String orderNo = fiatThirdPartyOrder.getOrderNo();
                interfaceC47251tmX.copydefault(activity, new BuySellOrderDetailParameters(type, orderNo != null ? orderNo : "", OKPaymentSource.PAYMENT_INTERNAL_FLOW));
                return;
            }
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            java.lang.String url = fiatThirdPartyOrder.getUrl();
            pairArr[0] = C56390yDp.OLrzqt("url", (url == null || (str = (java.lang.String) C33084mpl.OLrzqt(url, fiatThirdPartyOrder.getUrl())) == null) ? null : C6813aWU.AEQbTJ(str));
            pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.FLAG, java.lang.Boolean.TRUE);
            pairArr[2] = C56390yDp.OLrzqt("set_token", java.lang.Boolean.FALSE);
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(pairArr);
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
        }
    }

    public final void copydefault(java.util.List<FiatThirdPartyOrder> list, boolean z) {
        OLrzqt(list.isEmpty());
        C30196lPk c30196lPk = this.EZpvd;
        if (c30196lPk != null) {
            c30196lPk.OLrzqt(list, z);
        }
    }

    public final void OLrzqt(boolean z) {
        C31698mAp c31698mAp;
        AbstractC31456luP abstractC31456luP = this.djBIcL;
        if (abstractC31456luP == null || (c31698mAp = abstractC31456luP.AEQbTJ) == null) {
            return;
        }
        c31698mAp.EZpvd(z);
    }

    public final void KWHzl() {
        android.widget.FrameLayout frameLayout;
        C31698mAp c31698mAp;
        AbstractC31456luP abstractC31456luP = this.djBIcL;
        if (abstractC31456luP != null && (c31698mAp = abstractC31456luP.AEQbTJ) != null) {
            c31698mAp.EZpvd();
        }
        AbstractC31456luP abstractC31456luP2 = this.djBIcL;
        if (abstractC31456luP2 == null || (frameLayout = abstractC31456luP2.KWHzl) == null) {
            return;
        }
        C57600ylV.AEQbTJ(frameLayout);
    }
}
