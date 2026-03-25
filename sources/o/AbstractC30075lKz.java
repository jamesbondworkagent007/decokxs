package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.paymentmethod.BasePaymentMethodFragment$runPreCheckFlow$1;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CSwapBean;
import com.okinc.fiat.api.bean.CoinType;
import com.okinc.fiat.api.bean.FiatCryptoCoinBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.CurrencyPreviewPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentPlatformService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC30126lMw;
import o.AbstractC31388ltA;
import o.lKH;
import o.lOI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30075lKz<BINDING extends ViewDataBinding, VM extends lKH> extends lzN<BINDING> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final int gEmmrt;
    public boolean isConnected;

    /* JADX INFO: renamed from: o.lKz$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelCategoryCode.values().length];
            try {
                iArr[ChannelCategoryCode.THIRD_PARTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelCategoryCode.BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelCategoryCode.NATIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public abstract void AkhnZx();

    public abstract void AuCTel();

    public abstract void KWHzl(@NotNull AbstractC31388ltA abstractC31388ltA);

    public abstract void fARcdN();

    public abstract void fIwbmz();

    public abstract VM fetchVPNInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN, o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public AbstractC30075lKz(@androidx.annotation.LayoutRes int i) {
        super(i);
        this.gEmmrt = i;
        this.isConnected = true;
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.BasePaymentMethodFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.BasePaymentMethodFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.BasePaymentMethodFragment$special$$inlined$activityViewModels$default$3
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
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return fetchVPNInfo();
    }

    public PaymentMethodSelectionViewModel isConnected() {
        return (PaymentMethodSelectionViewModel) this.AYXKKw.getValue();
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        copydefault(DataBindingUtil.inflate(getLayoutInflater(), getLayoutId(), viewGroup, false));
        KWHzl().setLifecycleOwner(getViewLifecycleOwner());
        return KWHzl().getRoot();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getNewProxyInstance();
        AuCTel();
        fARcdN();
        AkhnZx();
        fIwbmz();
        fJNWhG();
        uzCIH();
    }

    private final void getNewProxyInstance() {
        CoinType coinType;
        fetchVPNInfo().copydefault(fetchVPNInfo().QbewEr(), fetchVPNInfo().uzCIH(), fetchVPNInfo().AwvSrB(), fetchVPNInfo().AubY(), fetchVPNInfo().aKErDB(), fetchVPNInfo().iwGUEr());
        C34745niJ c34745niJ = C34745niJ.AEQbTJ;
        if (fetchVPNInfo().UeEOUB() == TradeType.BUY) {
            coinType = CoinType.COIN_TYPE_BUY;
        } else {
            coinType = CoinType.COIN_TYPE_SELL;
        }
        FiatCryptoCoinBean fiatCryptoCoinBeanOLrzqt = c34745niJ.OLrzqt(coinType);
        lKH lkhFetchVPNInfo = fetchVPNInfo();
        java.lang.String currencyIcon = fiatCryptoCoinBeanOLrzqt != null ? fiatCryptoCoinBeanOLrzqt.getCurrencyIcon() : null;
        if (currencyIcon == null) {
            currencyIcon = "";
        }
        lkhFetchVPNInfo.EZpvd(currencyIcon);
        fetchVPNInfo().OLrzqt(fetchVPNInfo().AwvSrB(), fetchVPNInfo().QbewEr());
        fetchVPNInfo().KWHzl(fetchVPNInfo().AubY(), fetchVPNInfo().uzCIH());
    }

    public final void uzCIH() {
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new TaskDescription(this));
    }

    /* JADX INFO: renamed from: o.lKz$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        public final /* synthetic */ AbstractC30075lKz<BINDING, VM> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(AbstractC30075lKz<BINDING, VM> abstractC30075lKz) {
            super(true);
            this.OLrzqt = abstractC30075lKz;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (isEnabled()) {
                this.OLrzqt.fetchVPNInfo().accept();
                this.OLrzqt.isConnected().KWHzl("back");
                setEnabled(false);
                FragmentActivity activity = this.OLrzqt.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
    }

    public final void fJNWhG() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<AbstractC30126lMw<java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>, OKServerException>>> liveDataAEQbTJ = isConnected().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAEQbTJ, viewLifecycleOwner, new Function1() { // from class: o.lKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC30075lKz.AEQbTJ(this.OLrzqt, (AbstractC30126lMw) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC30075lKz abstractC30075lKz, AbstractC30126lMw abstractC30126lMw) {
        Intrinsics.checkNotNullParameter(abstractC30126lMw, "");
        if (abstractC30126lMw instanceof AbstractC30126lMw.ActionBar) {
            abstractC30075lKz.fetchVPNInfo().AxsJAYaxsJAY();
        } else if (abstractC30126lMw instanceof AbstractC30126lMw.Application) {
            AbstractC30126lMw.Application application = (AbstractC30126lMw.Application) abstractC30126lMw;
            abstractC30075lKz.fetchVPNInfo().copydefault((java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>) application.KWHzl());
            abstractC30075lKz.fetchVPNInfo().gkJEwt();
            if (((java.util.List) application.KWHzl()).isEmpty()) {
                abstractC30075lKz.KWHzl(AbstractC31388ltA.ActionBar.copydefault);
            }
        } else {
            if (!(abstractC30126lMw instanceof AbstractC30126lMw.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC30075lKz.fetchVPNInfo().gkJEwt();
            abstractC30075lKz.KWHzl(AbstractC31388ltA.Activity.OLrzqt);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        int i = Application.AEQbTJ[channel.getCategoryCode().ordinal()];
        if (i == 1) {
            fetchVPNInfo().AEQbTJ("third");
        } else if (i == 2) {
            fetchVPNInfo().AEQbTJ("balance");
        } else if (i == 3) {
            fetchVPNInfo().AEQbTJ("native");
        } else {
            fetchVPNInfo().AEQbTJ("unknown");
        }
        fetchVPNInfo().onEventTrigger(new lKH.StateListAnimator.ActionBar(channel));
        isConnected().KWHzl("select_channel");
    }

    public final void copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod) {
        if (paymentMethod != null && channel != null) {
            fetchVPNInfo().onEventTrigger(new lKH.StateListAnimator.Activity(channel, paymentMethod));
        }
        isConnected().KWHzl("select_method");
    }

    public final void KWHzl(@NotNull ChannelCategoryCode channelCategoryCode, @NotNull B2CQuoteBean b2CQuoteBean, @NotNull java.lang.String str) {
        java.lang.String convertPrice;
        java.lang.String convertBaseAmount;
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(b2CQuoteBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        lOI.Application application = lOI.Companion;
        java.lang.String strCopydefault = C31661lzi.copydefault(b2CQuoteBean.getQuoteAmount(), false);
        java.lang.String quoteCurrencySymbol = b2CQuoteBean.getQuoteCurrencySymbol();
        java.lang.String strCopydefault2 = C31661lzi.copydefault(b2CQuoteBean.getBaseAmount(), false);
        java.lang.String baseCurrencySymbol = b2CQuoteBean.getBaseCurrencySymbol();
        B2CSwapBean convertDetail = b2CQuoteBean.getConvertDetail();
        java.lang.String strCopydefault3 = null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(convertDetail != null ? convertDetail.getConvertBaseCurrency() : null);
        B2CSwapBean convertDetail2 = b2CQuoteBean.getConvertDetail();
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt((convertDetail2 == null || (convertBaseAmount = convertDetail2.getConvertBaseAmount()) == null) ? null : C31661lzi.copydefault(convertBaseAmount, false));
        B2CSwapBean convertDetail3 = b2CQuoteBean.getConvertDetail();
        if (convertDetail3 != null && (convertPrice = convertDetail3.getConvertPrice()) != null) {
            strCopydefault3 = C31661lzi.copydefault(convertPrice, false);
        }
        final lOI loiOLrzqt = application.OLrzqt(str, strCopydefault, quoteCurrencySymbol, strCopydefault2, baseCurrencySymbol, strGEmmrt, strGEmmrt2, C33129mqd.gEmmrt(strCopydefault3), channelCategoryCode);
        loiOLrzqt.show(getParentFragmentManager(), loiOLrzqt.getClass().getName());
        loiOLrzqt.KWHzl(new Function0() { // from class: o.lKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC30075lKz.AEQbTJ(this.OLrzqt, loiOLrzqt);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC30075lKz abstractC30075lKz, lOI loi) {
        abstractC30075lKz.fetchVPNInfo().onEventTrigger(lKH.StateListAnimator.Dialog.AEQbTJ);
        loi.dismiss();
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TradeType tradeType, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        fetchVPNInfo().values("card_confirm_order");
        OKPaymentPlatformService oKPaymentPlatformService = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        mHA mha = mHA.OLrzqt;
        lKX lkx = (lKX) mha.AEQbTJ(isConnected().fIwbmz());
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd = lkx != null ? lkx.EZpvd() : null;
        lKX lkx2 = (lKX) mha.AEQbTJ(isConnected().fIwbmz());
        oKPaymentPlatformService.OLrzqt(contextRequireContext, new CurrencyPreviewPageParameters(str, null, null, str2, null, tradeType, false, i, 0, null, str10, channelEZpvd, lkx2 != null ? lkx2.AEQbTJ() : null, null, null, false, null, null, null, null, null, false, 4186966, null));
    }

    public final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BasePaymentMethodFragment$runPreCheckFlow$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.lKz$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lKz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
