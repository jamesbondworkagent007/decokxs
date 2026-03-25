package com.okinc.buysell.ui.bsc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.LayoutRes;
import androidx.camera.video.AudioStats;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.buysell.data.FrequencyType;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.AvailableBalanceParameter;
import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import com.okinc.buysell.util.PaymentFeatureFlag;
import com.okinc.buysell.util.PaymentLogger;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CSwapBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.InformationBox;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo;
import com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl;
import com.okinc.okx.paymentapi.data.ResultType;
import com.okinc.okx.paymentapi.data.paas.ACHProperties;
import com.okinc.okx.paymentapi.data.paas.PaymentAddAccountParams;
import com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget;
import com.okinc.okx.paymentapi.presentation.AddPaymentMethodResult;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult;
import com.okinc.okx.paymentapi.presentation.PaymentMethodParameter;
import com.okinc.okx.paymentapi.service.BscDepositBottomSheetParameters;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.CreateAccountType;
import com.okinc.okx.paymentapi.service.CurrencyPreviewPageParameters;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.DexPreviewParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.OKPaymentPlatformService;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.P2pPaymentParameters;
import com.okinc.okx.paymentapi.service.RecurringBuyOrderType;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import com.okinc.okx.paymentapi.uv.AccountFrozenStatus;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.C29826lBt;
import o.C29846lCm;
import o.C30018lIw;
import o.C30158lOG;
import o.C30327lUg;
import o.C31349lsO;
import o.C31351lsQ;
import o.C31661lzi;
import o.C31662lzj;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C43251rlk;
import o.C46880tfX;
import o.C46881tfY;
import o.C47242tmO;
import o.C47309tnc;
import o.C52794wYp;
import o.C56390yDp;
import o.C56392yDr;
import o.C56424yEw;
import o.C56524yIo;
import o.InterfaceC31430ltq;
import o.InterfaceC31670lzr;
import o.InterfaceC47251tmX;
import o.InterfaceC47311tne;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC8224ayh;
import o.lAU;
import o.lJI;
import o.lKM;
import o.lKX;
import o.lMA;
import o.lMD;
import o.lOI;
import o.lTZ;
import o.lyN;
import o.lzR;
import o.lzT;
import o.mDA;
import o.mHA;
import o.pUU;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseBuySellFragment<T extends ViewDataBinding> extends lzR<T> {
    public String AYXKKw;
    public boolean AkhnZx;
    public boolean DbNXlk;
    public final InterfaceC56387yDm ejfBZ;
    public boolean fARcdN;
    public final InterfaceC56387yDm fJNWhG;
    public boolean fetchVPNInfo;
    public CreateAccountType isConnected;
    public final ActivityResultLauncher<Intent> values;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TargetTab.values().length];
            try {
                iArr[TargetTab.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetTab.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
            int[] iArr3 = new int[VerificationStatus.values().length];
            try {
                iArr3[VerificationStatus.PRE_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[VerificationStatus.PRE_KYC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.DbNXlk = z;
    }

    public abstract BaseBuySellViewModel AuCTel();

    public abstract void AuCTelauCTel();

    public abstract void EZpvd(@NotNull String str, boolean z);

    public abstract void KWHzl(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.fARcdN = z;
    }

    public abstract InputBaseViewModel ejfBZ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    public BaseBuySellFragment(@LayoutRes int i) {
        super(i);
        final Function0 function0 = null;
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = "";
        this.isConnected = CreateAccountType.CREATE_NEW_ACCOUNT;
        this.AkhnZx = true;
        final Function0 function02 = new Function0() { // from class: o.lAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseBuySellFragment.gEmmrt(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$viewModels$default$1
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.BaseBuySellFragment$special$$inlined$viewModels$default$4
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
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                BaseBuySellFragment.KWHzl(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.values = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BSCMasterViewModel AubY() {
        return (BSCMasterViewModel) this.fJNWhG.getValue();
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return AuCTel();
    }

    public final PaymentMethodSelectionViewModel hDKMBd() {
        return (PaymentMethodSelectionViewModel) this.ejfBZ.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(BaseBuySellFragment baseBuySellFragment) {
        FragmentActivity fragmentActivityRequireActivity = baseBuySellFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final void KWHzl(BaseBuySellFragment baseBuySellFragment, ActivityResult activityResult) {
        AddPaymentMethodResult addPaymentMethodResultAEQbTJ;
        SelectPaymentMethodResult selectPaymentMethodResultAEQbTJ;
        baseBuySellFragment.fetchVPNInfo = true;
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (data != null && (selectPaymentMethodResultAEQbTJ = lMA.AEQbTJ(data)) != null && selectPaymentMethodResultAEQbTJ.isSuccess()) {
                baseBuySellFragment.AubY().KWHzl(selectPaymentMethodResultAEQbTJ.getChannel().getDepositName());
                String depositName = selectPaymentMethodResultAEQbTJ.getChannel().getDepositName();
                Channel channelAwvSrB = baseBuySellFragment.AuCTel().AwvSrB();
                if (!Intrinsics.EZpvd((Object) depositName, (Object) (channelAwvSrB != null ? channelAwvSrB.getDepositName() : null))) {
                    baseBuySellFragment.AuCTelauCTel();
                }
                baseBuySellFragment.AuCTel().OLrzqt(selectPaymentMethodResultAEQbTJ.getChannel(), selectPaymentMethodResultAEQbTJ.getPaymentMethod());
            }
            Intent data2 = activityResult.getData();
            if (data2 == null || (addPaymentMethodResultAEQbTJ = C47242tmO.AEQbTJ(data2)) == null) {
                return;
            }
            PaymentAddAccountResult accountResultType = addPaymentMethodResultAEQbTJ.getAccountResultType();
            if ((accountResultType instanceof PaymentAddAccountResult.ThirdPartyFinalState) && Intrinsics.EZpvd((Object) addPaymentMethodResultAEQbTJ.getChannel(), (Object) ChannelPlatformCode.ACH_BUY.getCode())) {
                baseBuySellFragment.copydefault((PaymentAddAccountResult.ThirdPartyFinalState) accountResultType);
            }
        }
    }

    @Override // o.lzN
    public void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseBuySellFragment$setupContent$1(this, null), 3, null);
        boolean z = false;
        boolean z2 = C30327lUg.OLrzqt(PaymentFeatureFlag.SIMPLE_TRADE_L2_TOKEN_CARRYOVER) && isConnected().AEQbTJ(BSCLevel.LEVEL2);
        BuySellConvertParameters fieldNames = isConnected().getFieldNames();
        if (fieldNames != null) {
            TargetTab targetTabIsConnected = fieldNames.isConnected();
            int[] iArr = Application.copydefault;
            int i = iArr[targetTabIsConnected.ordinal()];
            boolean z3 = i == 1 ? AuCTel().flVtFt() == TradeType.BUY || fieldNames.values().length() == 0 : i == 2 ? AuCTel().flVtFt() == TradeType.SELL || fieldNames.values().length() == 0 : fieldNames.values().length() == 0;
            BaseBuySellViewModel baseBuySellViewModelAuCTel = AuCTel();
            int i2 = Application.KWHzl[baseBuySellViewModelAuCTel.flVtFt().ordinal()];
            if (i2 == 1 ? isConnected().AkhnZx() == BSCTabIndex.BUY : !(i2 != 2 || isConnected().AkhnZx() != BSCTabIndex.SELL)) {
                DexTokenParameters dexTokenParametersAEQbTJ = fieldNames.AEQbTJ();
                if (dexTokenParametersAEQbTJ != null) {
                    baseBuySellViewModelAuCTel.KWHzl(new DexInfo(mDA.EZpvd.EZpvd(dexTokenParametersAEQbTJ.KWHzl(), dexTokenParametersAEQbTJ.AEQbTJ()), dexTokenParametersAEQbTJ.KWHzl(), (String) null, (String) null, dexTokenParametersAEQbTJ.AEQbTJ(), (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65516, (DefaultConstructorMarker) null));
                }
            }
            if (isConnected().EZpvd(fieldNames.OLrzqt(), fieldNames.AYXKKw()) != FrequencyType.ONE_TIME && baseBuySellViewModelAuCTel.flVtFt() == TradeType.BUY) {
                z = true;
            }
            baseBuySellViewModelAuCTel.OLrzqt(z);
            if (z2 && z3 && C33129mqd.OLrzqt((CharSequence) fieldNames.copydefault())) {
                baseBuySellViewModelAuCTel.EZpvd(true);
                baseBuySellViewModelAuCTel.OLrzqt(fieldNames.copydefault());
                baseBuySellViewModelAuCTel.AEQbTJ(fieldNames.KWHzl());
                return;
            }
            int i3 = iArr[fieldNames.isConnected().ordinal()];
            if (i3 == 1) {
                if (baseBuySellViewModelAuCTel.flVtFt() == TradeType.BUY) {
                    BaseBuySellViewModel baseBuySellViewModelAuCTel2 = AuCTel();
                    baseBuySellViewModelAuCTel2.OLrzqt(fieldNames.copydefault());
                    baseBuySellViewModelAuCTel2.AEQbTJ(fieldNames.KWHzl());
                    baseBuySellViewModelAuCTel2.valueOf(fieldNames.AhwBna());
                    return;
                }
                return;
            }
            if (i3 == 2 && baseBuySellViewModelAuCTel.flVtFt() == TradeType.SELL) {
                BaseBuySellViewModel baseBuySellViewModelAuCTel3 = AuCTel();
                baseBuySellViewModelAuCTel3.OLrzqt(fieldNames.copydefault());
                baseBuySellViewModelAuCTel3.AEQbTJ(fieldNames.KWHzl());
                baseBuySellViewModelAuCTel3.valueOf(fieldNames.AhwBna());
            }
        }
    }

    @Override // o.lzN, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AuCTel().AEQbTJ(System.currentTimeMillis());
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        PaymentLogger.Type type;
        super.onResume();
        if (!this.fetchVPNInfo && !this.AkhnZx && AuCTel().DAIeex()) {
            int i = Application.KWHzl[AuCTel().flVtFt().ordinal()];
            if (i == 1) {
                type = PaymentLogger.Type.BSC_BUY;
            } else if (i == 2) {
                type = PaymentLogger.Type.BSC_SELL;
            } else {
                type = PaymentLogger.Type.OTHER;
            }
            PaymentLogger.EZpvd.EZpvd(type, "refresh is called");
            KWHzl(true);
            this.fARcdN = true;
            AuCTel().AEQbTJ(System.currentTimeMillis());
        }
        this.fetchVPNInfo = false;
        this.AkhnZx = false;
        AuCTel().djBIcL("");
    }

    public static /* synthetic */ void load$default(BaseBuySellFragment baseBuySellFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseBuySellFragment.KWHzl(z);
    }

    @Override // o.lzN
    public void AYXKKw() {
        AuCTel().AEQbTJ(System.currentTimeMillis());
        load$default(this, false, 1, null);
    }

    public final void OLrzqt(SelectPaymentMethodResult selectPaymentMethodResult) {
        AubY().KWHzl(selectPaymentMethodResult.getChannel().getDepositName());
        AuCTel().OLrzqt(selectPaymentMethodResult.getChannel(), selectPaymentMethodResult.getPaymentMethod());
        pUU.EZpvd("BaseBuySellFragment bottomsheet success", "result: " + selectPaymentMethodResult.getChannel().getSupportCurrency() + " current:" + AuCTel().OcIXYQ());
        if (!Intrinsics.EZpvd((Object) selectPaymentMethodResult.getChannel().getSupportCurrency(), (Object) AuCTel().OcIXYQ())) {
            AuCTelauCTel();
        }
        this.fARcdN = true;
        EZpvd(selectPaymentMethodResult.getChannel().getSupportCurrency(), false);
    }

    public final String uzCIH() {
        return C33492mxV.OLrzqt() ? "https://static.coinall.ltd/cdn/assets/imgs/255/16F3C8005E182A6E.png" : "https://static.coinall.ltd/cdn/assets/imgs/255/1A76E34E6890B990.png";
    }

    public static /* synthetic */ void goToPaymentSelectionPage$default(BaseBuySellFragment baseBuySellFragment, String str, String str2, int i, boolean z, Channel channel, PaymentMethod paymentMethod, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToPaymentSelectionPage");
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        baseBuySellFragment.EZpvd(str, str2, i, z, (i2 & 16) != 0 ? null : channel, (i2 & 32) != 0 ? null : paymentMethod);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, int i, boolean z, Channel channel, PaymentMethod paymentMethod) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        CurrencyToken currencyTokenCopydefault2;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mHA mha = mHA.OLrzqt;
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        String currency = null;
        String currency2 = (actionBar == null || (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ2.getCurrency();
        if (currency2 == null) {
            currency2 = "";
        }
        BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        if (actionBar2 != null && (currencyTokenCopydefault2 = actionBar2.copydefault()) != null) {
            currency = currencyTokenCopydefault2.getCurrency();
        }
        if (currency == null) {
            currency = "";
        }
        TradeType tradeTypeFlVtFt = AuCTel().flVtFt();
        BaseBuySellViewModel.ActionBar actionBar3 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        int scale = (actionBar3 == null || (currencyTokenCopydefault = actionBar3.copydefault()) == null) ? 2 : currencyTokenCopydefault.getScale();
        BaseBuySellViewModel.ActionBar actionBar4 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        PaymentMethodParameter paymentMethodParameter = new PaymentMethodParameter(currency2, str, currency, str2, tradeTypeFlVtFt, i, scale, true, (actionBar4 == null || (buySellCurrencyAEQbTJ = actionBar4.AEQbTJ()) == null) ? 0 : buySellCurrencyAEQbTJ.getScale(), z, channel, paymentMethod);
        lKM.TaskDescription taskDescription = lKM.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        taskDescription.AEQbTJ(contextRequireContext, paymentMethodParameter, this.values);
    }

    public static /* synthetic */ void goToPaymentSelectionPageV3$default(BaseBuySellFragment baseBuySellFragment, Integer num, String str, String str2, Channel channel, PaymentMethod paymentMethod, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToPaymentSelectionPageV3");
        }
        baseBuySellFragment.copydefault((i & 1) != 0 ? null : num, str, str2, (i & 8) != 0 ? null : channel, (i & 16) != 0 ? null : paymentMethod);
    }

    public final void copydefault(Integer num, @NotNull String str, @NotNull String str2, Channel channel, PaymentMethod paymentMethod) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOLrzqt = (AuCTel().hUfVAv() || AuCTel().flVtFt() != TradeType.BUY) ? false : BuyFrequencyOption.Companion.OLrzqt(AubY().zLjUOn());
        TradeType tradeTypeFlVtFt = AuCTel().flVtFt();
        mHA mha = mHA.OLrzqt;
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        String currency = (actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrency();
        if (currency == null) {
            currency = "";
        }
        BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        String currency2 = (actionBar2 == null || (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
        SelectPaymentMethodParameter selectPaymentMethodParameter = new SelectPaymentMethodParameter((String) null, (String) null, (String) null, tradeTypeFlVtFt, new BuySellParameter(currency, currency2 == null ? "" : currency2, str, str2, (String) null, num, 16, (DefaultConstructorMarker) null), 0, false, true, (List) null, zOLrzqt, false, channel, paymentMethod, (List) (AuCTel().iRxXKY() ? null : AuCTel().AkhnZx()), AuCTel().hUfVAv() ? new DexTokenParameters(AuCTel().ORxRYg().getChainIndex(), AuCTel().ORxRYg().getTokenAddress()) : null, 1383, (DefaultConstructorMarker) null);
        if (getParentFragmentManager().findFragmentByTag("PaymentSelectionBottomSheet") == null) {
            C29826lBt c29826lBtEZpvd = C29826lBt.Companion.EZpvd(selectPaymentMethodParameter);
            c29826lBtEZpvd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("PaymentSelectionBottomSheet.key_param", selectPaymentMethodParameter)));
            c29826lBtEZpvd.show(getParentFragmentManager(), "PaymentSelectionBottomSheet");
        }
    }

    public final void EZpvd(@NotNull C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        boolean z = AuCTel().hDKMBd().getValue().booleanValue() && AuCTel().AxsJAYaxsJAY().getValue().booleanValue();
        VerificationStatus verificationStatusFJNWhG = isConnected().fJNWhG();
        int i = verificationStatusFJNWhG == null ? -1 : Application.AEQbTJ[verificationStatusFJNWhG.ordinal()];
        if (i != -1) {
            if (i == 1) {
                c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.RcXXUw));
                c52794wYp.setEnabled(true);
                c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lAw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        BaseBuySellFragment.AhwBna(this.copydefault, view);
                    }
                });
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dxcTrN));
                c52794wYp.setEnabled(true);
                c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lAu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        BaseBuySellFragment.djBIcL(this.AEQbTJ, view);
                    }
                });
            }
        } else if (AuCTel().hUfVAv() && AuCTel().fIwbmz().copydefault() == BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_NOT_EXIST) {
            c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sVXHln));
            c52794wYp.setEnabled(true);
            C32866mlf.onEvent$default("Simpletrade_Buy_ActivateDex_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BaseBuySellFragment.gEmmrt(this.OLrzqt, view);
                }
            });
        } else if (AuCTel().RlQdEF()) {
            c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fXYAwm));
            c52794wYp.setEnabled(true);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lAt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BaseBuySellFragment.AYXKKw(this.EZpvd, view);
                }
            });
        } else {
            if (BuyFrequencyOption.Companion.OLrzqt(AubY().zLjUOn())) {
                c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dvKsVJ));
            } else {
                c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.OuxcSI));
            }
            c52794wYp.setEnabled(z);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lAx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BaseBuySellFragment.valueOf(this.AEQbTJ, view);
                }
            });
        }
        C30018lIw.AEQbTJ(c52794wYp, true);
    }

    public static final void AhwBna(BaseBuySellFragment baseBuySellFragment, View view) {
        baseBuySellFragment.AkhnZx();
    }

    public static final void djBIcL(BaseBuySellFragment baseBuySellFragment, View view) {
        baseBuySellFragment.fetchVPNInfo();
    }

    public static final void gEmmrt(BaseBuySellFragment baseBuySellFragment, View view) {
        lJI.StateListAnimator stateListAnimator = lJI.Companion;
        Context contextRequireContext = baseBuySellFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        stateListAnimator.copydefault(contextRequireContext);
        C32866mlf.onEvent$default("Simpletrade_Buy_ActivateDex_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public static final void AYXKKw(BaseBuySellFragment baseBuySellFragment, View view) {
        InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
        FragmentActivity fragmentActivityRequireActivity = baseBuySellFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC8224ayh.TaskDescription.goToDeposit$default(interfaceC8224ayh, fragmentActivityRequireActivity, DepositEntryPoint.SelectCryptoPage.EZpvd, null, null, null, null, 60, null);
    }

    public static final void valueOf(BaseBuySellFragment baseBuySellFragment, View view) {
        baseBuySellFragment.fJNWhG();
    }

    public final boolean zLjUOn() {
        InputBaseViewModel.AmountCheckResult amountCheckResult = (InputBaseViewModel.AmountCheckResult) mHA.OLrzqt.AEQbTJ(ejfBZ().isConnected());
        Channel channelAwvSrB = AuCTel().AwvSrB();
        String depositPlatformCode = channelAwvSrB != null ? channelAwvSrB.getDepositPlatformCode() : null;
        if (depositPlatformCode == null) {
            depositPlatformCode = "";
        }
        return AuCTel().flVtFt() == TradeType.BUY && ejfBZ().EZpvd(depositPlatformCode) && (amountCheckResult == InputBaseViewModel.AmountCheckResult.BALANCE || amountCheckResult == InputBaseViewModel.AmountCheckResult.BALANCE_LOW_BALANCE_MIN);
    }

    public final void fJNWhG() {
        AuCTel().AYXKKw(true);
        AuCTel().KWHzl(C46881tfY.KWHzl(AubY().zLjUOn().getFrequencyModel().getFrequency()), C46880tfX.AEQbTJ(AubY().zLjUOn().getFrequencyModel().getFrequency()), AubY().fARcdN());
        OLrzqt(AuCTel().flVtFt(), AuCTel().hUfVAv(), new Function1() { // from class: o.lAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.copydefault(this.AEQbTJ, (AccountFrozenStatus) obj);
            }
        });
    }

    public static final Unit copydefault(BaseBuySellFragment baseBuySellFragment, AccountFrozenStatus accountFrozenStatus) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        Intrinsics.checkNotNullParameter(accountFrozenStatus, "");
        int scale = 0;
        if (Intrinsics.EZpvd(accountFrozenStatus, AccountFrozenStatus.AccountFrozen.KWHzl)) {
            baseBuySellFragment.AuCTel().AYXKKw(false);
        } else if (Intrinsics.EZpvd(accountFrozenStatus, AccountFrozenStatus.AccountVerified.OLrzqt)) {
            if (baseBuySellFragment.zLjUOn()) {
                baseBuySellFragment.wlaJM();
            } else if (baseBuySellFragment.AuCTel().hUfVAv()) {
                baseBuySellFragment.AuCTel().AYXKKw(false);
                BaseBuySellViewModel baseBuySellViewModelAuCTel = baseBuySellFragment.AuCTel();
                String strOLrzqt = C33129mqd.OLrzqt((Object) baseBuySellFragment.ejfBZ().OLrzqt());
                String strUzCIH = baseBuySellFragment.ejfBZ().uzCIH();
                BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(baseBuySellFragment.AuCTel().QOLQEE());
                if (actionBar != null && (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) != null) {
                    scale = buySellCurrencyAEQbTJ.getScale();
                }
                baseBuySellViewModelAuCTel.EZpvd(strOLrzqt, C31661lzi.OLrzqt(strUzCIH, scale), baseBuySellFragment.ejfBZ().fetchVPNInfo());
            } else {
                baseBuySellFragment.AxsJAY();
            }
        }
        return Unit.INSTANCE;
    }

    public final void wlaJM() {
        BuySellCurrency buySellCurrencyAEQbTJ;
        AuCTel().AYXKKw(false);
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AuCTel().QOLQEE());
        final int iAhwBna = C33129mqd.AhwBna((actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrencyId());
        lAU.Companion.KWHzl(new BscDepositBottomSheetParameters(AuCTel().OcIXYQ(), AuCTel().zuBGHE(), iAhwBna, ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw(), DbNXlk(), new Function0() { // from class: o.lAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseBuySellFragment.copydefault(iAhwBna, this);
            }
        })).showNow(getChildFragmentManager(), "");
    }

    public static final Unit copydefault(int i, BaseBuySellFragment baseBuySellFragment) {
        C29846lCm.Companion.AEQbTJ(i).showNow(baseBuySellFragment.getChildFragmentManager(), "");
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        DepositWithdrawPageParameters depositWithdrawPageParameters = new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPage(AuCTel().OcIXYQ(), null, null, 6, null), OKPaymentSource.PAYMENT_INTERNAL_FLOW);
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default(interfaceC47251tmX, fragmentActivityRequireActivity, depositWithdrawPageParameters, null, null, 12, null);
    }

    public final String KWHzl(@NotNull String str) {
        SupportCurrencyInfo supportCurrencyInfo;
        Intrinsics.checkNotNullParameter(str, "");
        Pair pair = (Pair) mHA.OLrzqt.AEQbTJ(AuCTel().sSMYrx());
        String peggedCurrency = null;
        Channel channel = pair != null ? (Channel) pair.getFirst() : null;
        if (channel != null && (supportCurrencyInfo = channel.getSupportCurrencyInfo()) != null) {
            peggedCurrency = supportCurrencyInfo.getPeggedCurrency();
        }
        return (AuCTel().copydefault(channel) && peggedCurrency != null && C33129mqd.OLrzqt((CharSequence) peggedCurrency)) ? peggedCurrency : str;
    }

    private final void AxsJAY() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseBuySellFragment$runPreCheck$1(this, null), 3, null);
    }

    public static /* synthetic */ void launchPlaidFlowForV3$default(BaseBuySellFragment baseBuySellFragment, CreateAccountType createAccountType, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchPlaidFlowForV3");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        baseBuySellFragment.OLrzqt(createAccountType, str, str2);
    }

    public final void OLrzqt(CreateAccountType createAccountType, String str, String str2) {
        this.AYXKKw = str;
        this.isConnected = createAccountType;
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        PaymentAddAccountParams.Activity activity = PaymentAddAccountParams.Companion;
        PaymentAddAccountTarget.ACH.NewAccount newAccount = PaymentAddAccountTarget.ACH.NewAccount.KWHzl;
        Channel channelFARcdN = hDKMBd().fARcdN();
        String depositName = channelFARcdN != null ? channelFARcdN.getDepositName() : null;
        InterfaceC47251tmX.StateListAnimator.launchPaymentAddAccountFlow$default(interfaceC47251tmX, contextRequireContext, activity.copydefault(newAccount, new ACHProperties(str, createAccountType, depositName != null ? depositName : "", ChannelPlatformCode.ACH_BUY.getCode())), null, hDKMBd().uzCIH().getType(), this.values, 4, null);
    }

    public final void copydefault(PaymentAddAccountResult.ThirdPartyFinalState thirdPartyFinalState) {
        InterfaceC31430ltq interfaceC31430ltq;
        if (Intrinsics.EZpvd(thirdPartyFinalState, PaymentAddAccountResult.ThirdPartyFinalState.Exit.EZpvd)) {
            if (this.AYXKKw.length() == 0) {
                hDKMBd().AEQbTJ(true);
            }
        } else if (Intrinsics.EZpvd(thirdPartyFinalState, PaymentAddAccountResult.ThirdPartyFinalState.Pending.OLrzqt)) {
            OKPaymentPlatformService oKPaymentPlatformService = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "");
            oKPaymentPlatformService.EZpvd(fragmentActivityRequireActivity, new C47309tnc(activityResultRegistry, new Function0() { // from class: o.lAp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BaseBuySellFragment.AhwBna(this.KWHzl);
                }
            }, null, null, 12, null), ResultType.ActionBar.Application.Activity.EZpvd);
        } else if (thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Success) {
            PaymentMethodSelectionViewModel paymentMethodSelectionViewModelHDKMBd = hDKMBd();
            if (this.isConnected == CreateAccountType.RE_LINK && C33129mqd.OLrzqt((CharSequence) this.AYXKKw)) {
                interfaceC31430ltq = InterfaceC31430ltq.Activity.copydefault;
            } else {
                interfaceC31430ltq = InterfaceC31430ltq.TaskDescription.EZpvd;
            }
            paymentMethodSelectionViewModelHDKMBd.AEQbTJ(interfaceC31430ltq);
        } else {
            if (!(thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            OKPaymentPlatformService oKPaymentPlatformService2 = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            ActivityResultRegistry activityResultRegistry2 = requireActivity().getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry2, "");
            oKPaymentPlatformService2.EZpvd(fragmentActivityRequireActivity2, new C47309tnc(activityResultRegistry2, null, null, new Function1() { // from class: o.lAo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseBuySellFragment.copydefault(this.AEQbTJ, (ResultType.ResultButtonActionType) obj);
                }
            }, 6, null), new ResultType.Application(((PaymentAddAccountResult.ThirdPartyFinalState.Failure) thirdPartyFinalState).EZpvd(), null, 2, null));
        }
        hDKMBd().OLrzqt();
    }

    public static final Unit AhwBna(BaseBuySellFragment baseBuySellFragment) {
        baseBuySellFragment.requireActivity().finish();
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity = baseBuySellFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC31670lzr.AEQbTJ(fragmentActivityRequireActivity);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BaseBuySellFragment baseBuySellFragment, ResultType.ResultButtonActionType resultButtonActionType) {
        Intrinsics.checkNotNullParameter(resultButtonActionType, "");
        OKPaymentPlatformService oKPaymentPlatformService = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
        FragmentActivity fragmentActivityRequireActivity = baseBuySellFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        OKPaymentPlatformService.StateListAnimator.handleResultScreenButtonClick$default(oKPaymentPlatformService, resultButtonActionType, fragmentActivityRequireActivity, null, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.lzN
    public void EZpvd() {
        hDKMBd().ejfBZ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.OLrzqt(this.EZpvd, (SelectPaymentMethodResult) obj);
            }
        }));
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Boolean>> liveDataIsConnected = hDKMBd().isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataIsConnected, viewLifecycleOwner, new Function1() { // from class: o.lAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<InterfaceC31430ltq>> liveDataCopydefault = hDKMBd().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataCopydefault, viewLifecycleOwner2, new Function1() { // from class: o.lAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.KWHzl(this.OLrzqt, (InterfaceC31430ltq) obj);
            }
        });
        LiveData<C32989mnw<Pair<Channel, PaymentMethod>>> liveDataGEmmrt = hDKMBd().gEmmrt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataGEmmrt, viewLifecycleOwner3, new Function1() { // from class: o.lAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.copydefault(this.EZpvd, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataFJNWhG = hDKMBd().fJNWhG();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataFJNWhG, viewLifecycleOwner4, new Function1() { // from class: o.lAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.AEQbTJ(this.copydefault, (Unit) obj);
            }
        });
        LiveData<C32989mnw<AvailableBalanceParameter>> newProxyInstance = hDKMBd().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(newProxyInstance, viewLifecycleOwner5, new Function1() { // from class: o.lAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.OLrzqt(this.OLrzqt, (AvailableBalanceParameter) obj);
            }
        });
        final BaseBuySellViewModel baseBuySellViewModelAuCTel = AuCTel();
        LiveData<C32989mnw<Pair<ChannelCategoryCode, B2CQuoteBean>>> liveDataDvKsVJ = baseBuySellViewModelAuCTel.dvKsVJ();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataDvKsVJ, viewLifecycleOwner6, new Function1() { // from class: o.lAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.AEQbTJ(baseBuySellViewModelAuCTel, this, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<Pair<String, String>>> fieldNames = baseBuySellViewModelAuCTel.getFieldNames();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(fieldNames, viewLifecycleOwner7, new Function1() { // from class: o.lAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.KWHzl(this.KWHzl, baseBuySellViewModelAuCTel, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<Boolean>> liveDataRJOkX = baseBuySellViewModelAuCTel.RJOkX();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        mha.copydefault(liveDataRJOkX, viewLifecycleOwner8, new Function1() { // from class: o.lAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<Pair<Channel, lMD<PaymentMethod, OKServerException>>>> liveDataUzCIH = baseBuySellViewModelAuCTel.uzCIH();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        mha.copydefault(liveDataUzCIH, viewLifecycleOwner9, new Function1() { // from class: o.lAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellFragment.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        });
    }

    public static final Unit OLrzqt(BaseBuySellFragment baseBuySellFragment, SelectPaymentMethodResult selectPaymentMethodResult) {
        if (baseBuySellFragment.AuCTel().flVtFt() == selectPaymentMethodResult.getTradeType()) {
            if (baseBuySellFragment.hDKMBd().zLjUOn() && selectPaymentMethodResult.isSuccess()) {
                baseBuySellFragment.hDKMBd().EZpvd(false);
                Intrinsics.copydefault(selectPaymentMethodResult);
                baseBuySellFragment.OLrzqt(selectPaymentMethodResult);
            } else {
                baseBuySellFragment.hDKMBd().EZpvd(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final BaseBuySellFragment baseBuySellFragment, boolean z) {
        FragmentManager supportFragmentManager;
        lKX lkxOLrzqt;
        Channel channelEZpvd;
        if (z) {
            C32989mnw<lKX> value = baseBuySellFragment.hDKMBd().fIwbmz().getValue();
            final String depositName = (value == null || (lkxOLrzqt = value.OLrzqt()) == null || (channelEZpvd = lkxOLrzqt.EZpvd()) == null) ? null : channelEZpvd.getDepositName();
            if (depositName != null) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("PaymentMethod_AddAccountQuitSheet_FullPage_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lAr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return BaseBuySellFragment.EZpvd(depositName, (EventParamsList) obj);
                    }
                });
            }
            FragmentActivity activity = baseBuySellFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                ((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class)).KWHzl(TradeType.BUY, new Function0() { // from class: o.lAs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return BaseBuySellFragment.copydefault(this.copydefault, depositName);
                    }
                }, supportFragmentManager);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BaseBuySellFragment baseBuySellFragment, String str) {
        launchPlaidFlowForV3$default(baseBuySellFragment, CreateAccountType.CREATE_NEW_ACCOUNT, null, str, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BaseBuySellFragment baseBuySellFragment, InterfaceC31430ltq interfaceC31430ltq) {
        Intrinsics.checkNotNullParameter(interfaceC31430ltq, "");
        baseBuySellFragment.OLrzqt(interfaceC31430ltq);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BaseBuySellFragment baseBuySellFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        baseBuySellFragment.AuCTel().EZpvd((Channel) pair.component1(), (PaymentMethod) pair.component2());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(BaseBuySellFragment baseBuySellFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        baseBuySellFragment.wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final BaseBuySellFragment baseBuySellFragment, AvailableBalanceParameter availableBalanceParameter) {
        Intrinsics.checkNotNullParameter(availableBalanceParameter, "");
        C30158lOG.Companion.EZpvd(availableBalanceParameter, baseBuySellFragment.AuCTel().QKVWgx(), new Function0() { // from class: o.lAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseBuySellFragment.valueOf(this.AEQbTJ);
            }
        }).show(baseBuySellFragment.getChildFragmentManager(), "AvailableBalanceBottomSheet");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(BaseBuySellFragment baseBuySellFragment) {
        int iFetchVPNInfo = baseBuySellFragment.ejfBZ().fetchVPNInfo();
        String strOLrzqt = baseBuySellFragment.ejfBZ().OLrzqt();
        String strUzCIH = baseBuySellFragment.ejfBZ().uzCIH();
        mHA mha = mHA.OLrzqt;
        Pair pair = (Pair) mha.AEQbTJ(baseBuySellFragment.AuCTel().sSMYrx());
        Channel channel = pair != null ? (Channel) pair.getFirst() : null;
        Pair pair2 = (Pair) mha.AEQbTJ(baseBuySellFragment.AuCTel().sSMYrx());
        baseBuySellFragment.copydefault(Integer.valueOf(iFetchVPNInfo), strOLrzqt, strUzCIH, channel, pair2 != null ? (PaymentMethod) pair2.getSecond() : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(BaseBuySellViewModel baseBuySellViewModel, BaseBuySellFragment baseBuySellFragment, Pair pair) {
        CurrencyToken currencyTokenCopydefault;
        String icon;
        CurrencyToken currencyTokenCopydefault2;
        Intrinsics.checkNotNullParameter(pair, "");
        if (C33492mxV.OLrzqt()) {
            BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(baseBuySellViewModel.QOLQEE());
            icon = (actionBar == null || (currencyTokenCopydefault2 = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault2.getNightIcon();
        } else {
            BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(baseBuySellViewModel.QOLQEE());
            if (actionBar2 != null && (currencyTokenCopydefault = actionBar2.copydefault()) != null) {
                icon = currencyTokenCopydefault.getIcon();
            }
        }
        baseBuySellFragment.AEQbTJ((ChannelCategoryCode) pair.getFirst(), (B2CQuoteBean) pair.getSecond(), icon != null ? icon : "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BaseBuySellFragment baseBuySellFragment, BaseBuySellViewModel baseBuySellViewModel, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        InterfaceC47311tne interfaceC47311tne = (InterfaceC47311tne) C43251rlk.copydefault(InterfaceC47311tne.class);
        Context contextRequireContext = baseBuySellFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC47311tne.KWHzl(contextRequireContext, baseBuySellFragment.AEQbTJ((String) pair.getFirst(), (String) pair.getSecond()));
        baseBuySellViewModel.AYXKKw(false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BaseBuySellFragment baseBuySellFragment, boolean z) {
        if (z) {
            baseBuySellFragment.showLoading(1000L);
        } else {
            baseBuySellFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(BaseBuySellFragment baseBuySellFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        baseBuySellFragment.EZpvd((Channel) pair.component1(), (lMD<PaymentMethod, OKServerException>) pair.component2());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CurrencyPreviewPageParameters AEQbTJ(String str, String str2) {
        Channel channel;
        PaymentMethod paymentMethod;
        int i;
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        Pair pair;
        String currency;
        String strEjfBZ;
        DexPreviewParameters dexPreviewParameters;
        String quoteAmount;
        PaymentMethod paymentMethod2;
        String description;
        String paymentAccountId;
        Pair pair2 = (Pair) mHA.OLrzqt.AEQbTJ(AuCTel().sSMYrx());
        if (pair2 == null || (channel = (Channel) pair2.getFirst()) == null) {
            channel = new Channel((TradingAgentInfo) null, (String) null, false, (String) null, (ChannelCategoryCode) null, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfo) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, (PaymentMethodCategory) null, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannel) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (String) null, (String) null, (TradeLimit) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, (String) null, false, (SupportCurrencyInfo) null, (Integer) null, (EarnOption) null, (List) null, (String) null, false, false, -1, -1, 16383, (DefaultConstructorMarker) null);
        }
        channel.setQuoteAmount(str2);
        channel.setBaseAmount(str);
        int iFetchVPNInfo = 0;
        if (Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
            if (paymentMethods == null) {
                C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), MultiTransferSignData.DEFAULT_INTERVAL, String.valueOf(channel.getPaymentMethods()));
                break;
            }
            if (!paymentMethods.isEmpty()) {
                Iterator<T> it = paymentMethods.iterator();
                while (it.hasNext()) {
                    Account account = ((PaymentMethod) it.next()).getAccount();
                    if (!((account == null || (paymentAccountId = account.getPaymentAccountId()) == null || StringsKt__StringsKt.fARcdN((CharSequence) paymentAccountId)) ? false : true)) {
                        C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), MultiTransferSignData.DEFAULT_INTERVAL, String.valueOf(channel.getPaymentMethods()));
                        break;
                    }
                }
            }
        }
        BaseBuySellViewModel baseBuySellViewModelAuCTel = AuCTel();
        mHA mha = mHA.OLrzqt;
        Pair pair3 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel.sSMYrx());
        if (pair3 == null || (paymentMethod = (PaymentMethod) pair3.getSecond()) == null) {
            paymentMethod = new PaymentMethod((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, false, (Account) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, false, (SellerReceiptAccount) null, (String) null, (String) null, (String) null, false, (List) null, 0, 536870911, (DefaultConstructorMarker) null);
        }
        baseBuySellViewModelAuCTel.OLrzqt(channel, paymentMethod);
        BaseBuySellViewModel baseBuySellViewModelAuCTel2 = AuCTel();
        TradeType tradeTypeFlVtFt = baseBuySellViewModelAuCTel2.flVtFt();
        TradeType tradeType = TradeType.SELL;
        if (tradeTypeFlVtFt == tradeType) {
            if (baseBuySellViewModelAuCTel2.hUfVAv()) {
                i = 1;
            }
            BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(baseBuySellViewModelAuCTel2.QOLQEE());
            buySellCurrencyAEQbTJ = actionBar == null ? actionBar.AEQbTJ() : null;
            BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(baseBuySellViewModelAuCTel2.QOLQEE());
            currencyTokenCopydefault = actionBar2 == null ? actionBar2.copydefault() : null;
            if (!C33492mxV.OLrzqt()) {
                String nightIcon = buySellCurrencyAEQbTJ != null ? buySellCurrencyAEQbTJ.getNightIcon() : null;
                if (nightIcon == null) {
                    nightIcon = "";
                }
                String nightIcon2 = currencyTokenCopydefault != null ? currencyTokenCopydefault.getNightIcon() : null;
                if (nightIcon2 == null) {
                    nightIcon2 = "";
                }
                pair = new Pair(nightIcon, nightIcon2);
            } else {
                String icon = buySellCurrencyAEQbTJ != null ? buySellCurrencyAEQbTJ.getIcon() : null;
                if (icon == null) {
                    icon = "";
                }
                String icon2 = currencyTokenCopydefault != null ? currencyTokenCopydefault.getIcon() : null;
                if (icon2 == null) {
                    icon2 = "";
                }
                pair = new Pair(icon, icon2);
            }
            String str3 = (String) pair.component1();
            String str4 = (String) pair.component2();
            if (buySellCurrencyAEQbTJ != null || (currency = buySellCurrencyAEQbTJ.getCurrency()) == null) {
                currency = "";
            }
            String strQKVWgx = baseBuySellViewModelAuCTel2.QKVWgx();
            if (currencyTokenCopydefault != null || (strEjfBZ = currencyTokenCopydefault.getCurrency()) == null) {
                strEjfBZ = AuCTel().ejfBZ();
            }
            String str5 = strEjfBZ;
            TradeType tradeTypeFlVtFt2 = baseBuySellViewModelAuCTel2.flVtFt();
            int id = ejfBZ().valueOf().getId();
            P2pPaymentParameters p2pPaymentParameters = new P2pPaymentParameters(AuCTel().wlaJM().getP2pConvertBaseCurrency(), AuCTel().wlaJM().getP2pConvertBaseAmount(), AuCTel().wlaJM().getP2pBasePrice(), AuCTel().wlaJM().getP2pOrderTotal(), AuCTel().wlaJM().getP2pAmount(), AuCTel().wlaJM().getP2pQPAmount(), AuCTel().wlaJM().getP2pPayment());
            Pair pair4 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel2.sSMYrx());
            String str6 = (pair4 != null || (paymentMethod2 = (PaymentMethod) pair4.getSecond()) == null || (description = paymentMethod2.getDescription()) == null) ? "" : description;
            Pair pair5 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel2.sSMYrx());
            Channel channel2 = pair5 == null ? (Channel) pair5.getFirst() : null;
            Pair pair6 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel2.sSMYrx());
            PaymentMethod paymentMethod3 = pair6 == null ? (PaymentMethod) pair6.getSecond() : null;
            BSCMasterViewModel bSCMasterViewModelAubY = AubY();
            BaseBuySellViewModel.ActionBar actionBar3 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
            RecurringBuyOrderType recurringBuyOrderTypeKWHzl = bSCMasterViewModelAubY.KWHzl(actionBar3 == null ? actionBar3.AEQbTJ() : null);
            BuySellConvertParameters fieldNames = isConnected().getFieldNames();
            OKPaymentSource oKPaymentSourceAkhnZx = fieldNames == null ? fieldNames.AkhnZx() : null;
            boolean zCopydefault = baseBuySellViewModelAuCTel2.copydefault(baseBuySellViewModelAuCTel2.AwvSrB());
            if (baseBuySellViewModelAuCTel2.hUfVAv()) {
                dexPreviewParameters = null;
            } else {
                String tokenAddress = AuCTel().ORxRYg().getTokenAddress();
                int iAhwBna = C33129mqd.AhwBna(AuCTel().DTwDnp());
                int iAhwBna2 = C33129mqd.AhwBna(AuCTel().ORxRYg().getChainIndex());
                String strAxsJAY = AuCTel().AxsJAY();
                String icon3 = currencyTokenCopydefault != null ? currencyTokenCopydefault.getIcon() : null;
                String str7 = icon3 == null ? "" : icon3;
                String chainLogo = AuCTel().ORxRYg().getChainLogo();
                if (AuCTel().flVtFt() == tradeType) {
                    quoteAmount = channel.getBaseAmount();
                } else {
                    quoteAmount = channel.getQuoteAmount();
                }
                dexPreviewParameters = new DexPreviewParameters(tokenAddress, iAhwBna, iAhwBna2, strAxsJAY, str7, chainLogo, quoteAmount);
            }
            return new CurrencyPreviewPageParameters(currency, str3, strQKVWgx, str5, str4, tradeTypeFlVtFt2, false, i, id, p2pPaymentParameters, str6, channel2, paymentMethod3, null, recurringBuyOrderTypeKWHzl, zCopydefault, null, dexPreviewParameters, oKPaymentSourceAkhnZx, Boolean.TRUE, null, mha.AEQbTJ(AuCTel().isConnected()) instanceof lyN.TaskDescription.Application.PendingIntent, 1122368, null);
        }
        iFetchVPNInfo = ejfBZ().fetchVPNInfo();
        i = iFetchVPNInfo;
        BaseBuySellViewModel.ActionBar actionBar4 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(baseBuySellViewModelAuCTel2.QOLQEE());
        if (actionBar4 == null) {
        }
        BaseBuySellViewModel.ActionBar actionBar22 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(baseBuySellViewModelAuCTel2.QOLQEE());
        if (actionBar22 == null) {
        }
        if (!C33492mxV.OLrzqt()) {
        }
        String str32 = (String) pair.component1();
        String str42 = (String) pair.component2();
        if (buySellCurrencyAEQbTJ != null) {
            currency = "";
        }
        String strQKVWgx2 = baseBuySellViewModelAuCTel2.QKVWgx();
        if (currencyTokenCopydefault != null) {
            strEjfBZ = AuCTel().ejfBZ();
        }
        String str52 = strEjfBZ;
        TradeType tradeTypeFlVtFt22 = baseBuySellViewModelAuCTel2.flVtFt();
        int id2 = ejfBZ().valueOf().getId();
        P2pPaymentParameters p2pPaymentParameters2 = new P2pPaymentParameters(AuCTel().wlaJM().getP2pConvertBaseCurrency(), AuCTel().wlaJM().getP2pConvertBaseAmount(), AuCTel().wlaJM().getP2pBasePrice(), AuCTel().wlaJM().getP2pOrderTotal(), AuCTel().wlaJM().getP2pAmount(), AuCTel().wlaJM().getP2pQPAmount(), AuCTel().wlaJM().getP2pPayment());
        Pair pair42 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel2.sSMYrx());
        if (pair42 != null) {
        }
        Pair pair52 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel2.sSMYrx());
        if (pair52 == null) {
        }
        Pair pair62 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel2.sSMYrx());
        if (pair62 == null) {
        }
        BSCMasterViewModel bSCMasterViewModelAubY2 = AubY();
        BaseBuySellViewModel.ActionBar actionBar32 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        RecurringBuyOrderType recurringBuyOrderTypeKWHzl2 = bSCMasterViewModelAubY2.KWHzl(actionBar32 == null ? actionBar32.AEQbTJ() : null);
        BuySellConvertParameters fieldNames2 = isConnected().getFieldNames();
        if (fieldNames2 == null) {
        }
        boolean zCopydefault2 = baseBuySellViewModelAuCTel2.copydefault(baseBuySellViewModelAuCTel2.AwvSrB());
        if (baseBuySellViewModelAuCTel2.hUfVAv()) {
        }
        return new CurrencyPreviewPageParameters(currency, str32, strQKVWgx2, str52, str42, tradeTypeFlVtFt22, false, i, id2, p2pPaymentParameters2, str6, channel2, paymentMethod3, null, recurringBuyOrderTypeKWHzl2, zCopydefault2, null, dexPreviewParameters, oKPaymentSourceAkhnZx, Boolean.TRUE, null, mha.AEQbTJ(AuCTel().isConnected()) instanceof lyN.TaskDescription.Application.PendingIntent, 1122368, null);
    }

    public final CurrencyPreviewPageParameters KWHzl(@NotNull String str, @NotNull String str2) {
        Channel channel;
        Pair pair;
        String strEjfBZ;
        DexPreviewParameters dexPreviewParameters;
        String quoteAmount;
        PaymentMethod paymentMethod;
        String description;
        String currency;
        String paymentAccountId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Pair pair2 = (Pair) mHA.OLrzqt.AEQbTJ(AuCTel().sSMYrx());
        if (pair2 == null || (channel = (Channel) pair2.getFirst()) == null) {
            channel = new Channel((TradingAgentInfo) null, (String) null, false, (String) null, (ChannelCategoryCode) null, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (B2CExtCollectInfo) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, (PaymentMethodCategory) null, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (TermContentChannel) null, (Integer) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (String) null, (String) null, (TradeLimit) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, (String) null, false, (SupportCurrencyInfo) null, (Integer) null, (EarnOption) null, (List) null, (String) null, false, false, -1, -1, 16383, (DefaultConstructorMarker) null);
        }
        channel.setQuoteAmount(str2);
        channel.setBaseAmount(str);
        if (Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
            if (paymentMethods == null) {
                C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), "-2", String.valueOf(channel.getPaymentMethods()));
                break;
            }
            if (!paymentMethods.isEmpty()) {
                Iterator<T> it = paymentMethods.iterator();
                while (it.hasNext()) {
                    Account account = ((PaymentMethod) it.next()).getAccount();
                    if (!((account == null || (paymentAccountId = account.getPaymentAccountId()) == null || StringsKt__StringsKt.fARcdN((CharSequence) paymentAccountId)) ? false : true)) {
                        C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), "-2", String.valueOf(channel.getPaymentMethods()));
                        break;
                    }
                }
            }
        }
        BaseBuySellViewModel baseBuySellViewModelAuCTel = AuCTel();
        TradeType tradeTypeFlVtFt = baseBuySellViewModelAuCTel.flVtFt();
        TradeType tradeType = TradeType.SELL;
        int iFetchVPNInfo = tradeTypeFlVtFt != tradeType ? ejfBZ().fetchVPNInfo() : 0;
        mHA mha = mHA.OLrzqt;
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(baseBuySellViewModelAuCTel.QOLQEE());
        BuySellCurrency buySellCurrencyAEQbTJ = actionBar != null ? actionBar.AEQbTJ() : null;
        BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(baseBuySellViewModelAuCTel.QOLQEE());
        CurrencyToken currencyTokenCopydefault = actionBar2 != null ? actionBar2.copydefault() : null;
        if (C33492mxV.OLrzqt()) {
            String nightIcon = buySellCurrencyAEQbTJ != null ? buySellCurrencyAEQbTJ.getNightIcon() : null;
            if (nightIcon == null) {
                nightIcon = "";
            }
            String nightIcon2 = currencyTokenCopydefault != null ? currencyTokenCopydefault.getNightIcon() : null;
            if (nightIcon2 == null) {
                nightIcon2 = "";
            }
            pair = new Pair(nightIcon, nightIcon2);
        } else {
            String icon = buySellCurrencyAEQbTJ != null ? buySellCurrencyAEQbTJ.getIcon() : null;
            if (icon == null) {
                icon = "";
            }
            String icon2 = currencyTokenCopydefault != null ? currencyTokenCopydefault.getIcon() : null;
            if (icon2 == null) {
                icon2 = "";
            }
            pair = new Pair(icon, icon2);
        }
        String str3 = (String) pair.component1();
        String str4 = (String) pair.component2();
        String str5 = (buySellCurrencyAEQbTJ == null || (currency = buySellCurrencyAEQbTJ.getCurrency()) == null) ? "" : currency;
        if (currencyTokenCopydefault == null || (strEjfBZ = currencyTokenCopydefault.getCurrency()) == null) {
            strEjfBZ = AuCTel().ejfBZ();
        }
        String str6 = strEjfBZ;
        String strQKVWgx = baseBuySellViewModelAuCTel.QKVWgx();
        TradeType tradeTypeFlVtFt2 = baseBuySellViewModelAuCTel.flVtFt();
        int id = ejfBZ().valueOf().getId();
        P2pPaymentParameters p2pPaymentParameters = new P2pPaymentParameters(AuCTel().wlaJM().getP2pConvertBaseCurrency(), AuCTel().wlaJM().getP2pConvertBaseAmount(), AuCTel().wlaJM().getP2pBasePrice(), AuCTel().wlaJM().getP2pOrderTotal(), AuCTel().wlaJM().getP2pAmount(), AuCTel().wlaJM().getP2pQPAmount(), AuCTel().wlaJM().getP2pPayment());
        Pair pair3 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel.sSMYrx());
        String str7 = (pair3 == null || (paymentMethod = (PaymentMethod) pair3.getSecond()) == null || (description = paymentMethod.getDescription()) == null) ? "" : description;
        Pair pair4 = (Pair) mha.AEQbTJ(baseBuySellViewModelAuCTel.sSMYrx());
        PaymentMethod paymentMethod2 = pair4 != null ? (PaymentMethod) pair4.getSecond() : null;
        BSCMasterViewModel bSCMasterViewModelAubY = AubY();
        BaseBuySellViewModel.ActionBar actionBar3 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        RecurringBuyOrderType recurringBuyOrderTypeKWHzl = bSCMasterViewModelAubY.KWHzl(actionBar3 != null ? actionBar3.AEQbTJ() : null);
        BuySellConvertParameters fieldNames = isConnected().getFieldNames();
        OKPaymentSource oKPaymentSourceAkhnZx = fieldNames != null ? fieldNames.AkhnZx() : null;
        boolean zCopydefault = baseBuySellViewModelAuCTel.copydefault(baseBuySellViewModelAuCTel.AwvSrB());
        if (baseBuySellViewModelAuCTel.hUfVAv()) {
            String tokenAddress = AuCTel().ORxRYg().getTokenAddress();
            int iAhwBna = C33129mqd.AhwBna(AuCTel().DTwDnp());
            int iAhwBna2 = C33129mqd.AhwBna(AuCTel().ORxRYg().getChainIndex());
            String strAxsJAY = AuCTel().AxsJAY();
            String icon3 = currencyTokenCopydefault != null ? currencyTokenCopydefault.getIcon() : null;
            String str8 = icon3 == null ? "" : icon3;
            String chainLogo = AuCTel().ORxRYg().getChainLogo();
            if (AuCTel().flVtFt() == tradeType) {
                quoteAmount = channel.getBaseAmount();
            } else {
                quoteAmount = channel.getQuoteAmount();
            }
            dexPreviewParameters = new DexPreviewParameters(tokenAddress, iAhwBna, iAhwBna2, strAxsJAY, str8, chainLogo, quoteAmount);
        } else {
            dexPreviewParameters = null;
        }
        return new CurrencyPreviewPageParameters(str5, str3, strQKVWgx, str6, str4, tradeTypeFlVtFt2, false, iFetchVPNInfo, id, p2pPaymentParameters, str7, channel, paymentMethod2, null, recurringBuyOrderTypeKWHzl, zCopydefault, null, dexPreviewParameters, oKPaymentSourceAkhnZx, Boolean.TRUE, null, mha.AEQbTJ(AuCTel().isConnected()) instanceof lyN.TaskDescription.Application.PendingIntent, 1122368, null);
    }

    public final void OLrzqt(@NotNull InterfaceC31430ltq interfaceC31430ltq) {
        Intrinsics.checkNotNullParameter(interfaceC31430ltq, "");
        Pair<String, Integer> pairEZpvd = hDKMBd().EZpvd(interfaceC31430ltq);
        String strComponent1 = pairEZpvd.component1();
        int iIntValue = pairEZpvd.component2().intValue();
        lTZ ltz = lTZ.KWHzl;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        lTZ.showNotification$default(ltz, (Context) fragmentActivityRequireActivity, strComponent1, iIntValue, true, 0L, 16, (Object) null);
    }

    private final void AEQbTJ(ChannelCategoryCode channelCategoryCode, final B2CQuoteBean b2CQuoteBean, String str) {
        String convertPrice;
        String convertBaseAmount;
        String strCopydefault = C31661lzi.copydefault(b2CQuoteBean.getQuoteAmount(), false);
        String strCopydefault2 = C31661lzi.copydefault(b2CQuoteBean.getBaseAmount(), false);
        lOI.Application application = lOI.Companion;
        String quoteCurrencySymbol = b2CQuoteBean.getQuoteCurrencySymbol();
        String baseCurrencySymbol = b2CQuoteBean.getBaseCurrencySymbol();
        B2CSwapBean convertDetail = b2CQuoteBean.getConvertDetail();
        String strCopydefault3 = null;
        String strGEmmrt = C33129mqd.gEmmrt(convertDetail != null ? convertDetail.getConvertBaseCurrency() : null);
        B2CSwapBean convertDetail2 = b2CQuoteBean.getConvertDetail();
        String strGEmmrt2 = C33129mqd.gEmmrt((convertDetail2 == null || (convertBaseAmount = convertDetail2.getConvertBaseAmount()) == null) ? null : C31661lzi.copydefault(convertBaseAmount, false));
        B2CSwapBean convertDetail3 = b2CQuoteBean.getConvertDetail();
        if (convertDetail3 != null && (convertPrice = convertDetail3.getConvertPrice()) != null) {
            strCopydefault3 = C31661lzi.copydefault(convertPrice, false);
        }
        final lOI loiOLrzqt = application.OLrzqt(str, strCopydefault, quoteCurrencySymbol, strCopydefault2, baseCurrencySymbol, strGEmmrt, strGEmmrt2, C33129mqd.gEmmrt(strCopydefault3), channelCategoryCode);
        loiOLrzqt.show(getParentFragmentManager(), loiOLrzqt.getClass().getName());
        loiOLrzqt.KWHzl(new Function0() { // from class: o.lAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseBuySellFragment.KWHzl(this.AEQbTJ, b2CQuoteBean, loiOLrzqt);
            }
        });
        AuCTel().AYXKKw(false);
    }

    public static final Unit KWHzl(BaseBuySellFragment baseBuySellFragment, B2CQuoteBean b2CQuoteBean, lOI loi) {
        baseBuySellFragment.AuCTel().copydefault(C33129mqd.OLrzqt((Object) baseBuySellFragment.ejfBZ().OLrzqt()), b2CQuoteBean.getQuoteAmount());
        loi.dismiss();
        return Unit.INSTANCE;
    }

    public final void EZpvd(Channel channel, lMD<PaymentMethod, OKServerException> lmd) {
        EZpvd(channel.getSupportCurrency(), true);
        if (lmd instanceof lMD.TaskDescription) {
            if (C31662lzj.EZpvd(channel)) {
                hDKMBd().AEQbTJ(InterfaceC31430ltq.Dialog.OLrzqt);
            } else {
                hDKMBd().AEQbTJ(InterfaceC31430ltq.ActionBar.copydefault);
            }
        } else {
            if (!(lmd instanceof lMD.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            if (C31662lzj.EZpvd(channel)) {
                hDKMBd().AEQbTJ(InterfaceC31430ltq.LoaderManager.EZpvd);
            } else {
                hDKMBd().AEQbTJ(new InterfaceC31430ltq.Application(((lMD.StateListAnimator) lmd).AEQbTJ().getMessage()));
            }
        }
        hDKMBd().OLrzqt();
    }

    public final void zsXlph() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseBuySellFragment$navigateToOtcAgentChat$1(this, null), 3, null);
    }

    public final String fARcdN() {
        Pair pair;
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        mHA mha = mHA.OLrzqt;
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        String currency = (actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrency();
        String str = currency == null ? "" : currency;
        BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(AuCTel().QOLQEE());
        String currency2 = (actionBar2 == null || (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
        if (currency2 == null) {
            currency2 = "";
        }
        String strOLrzqt = ejfBZ().OLrzqt();
        String strUzCIH = ejfBZ().uzCIH();
        if (C33129mqd.AEQbTJ(strOLrzqt) == AudioStats.AUDIO_AMPLITUDE_NONE || C33129mqd.AEQbTJ(strUzCIH) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (Application.KWHzl[AuCTel().flVtFt().ordinal()] == 2) {
                return C33069mpW.copydefault(C31351lsQ.Activity.AxsJAYsNCnLh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tokenName", str), C56390yDp.OLrzqt("currency", currency2)));
            }
            return C33069mpW.copydefault(C31351lsQ.Activity.iRxXKY, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tokenName", str), C56390yDp.OLrzqt("currency", currency2)));
        }
        if (Application.KWHzl[AuCTel().flVtFt().ordinal()] == 2) {
            return C33069mpW.copydefault(C31351lsQ.Activity.GFUIi, C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseCurrency", C31661lzi.appendCryptoSymbol$default(strOLrzqt, str, 0, null, null, null, 30, null)), C56390yDp.OLrzqt("quoteCurrency", currency2)));
        }
        if (ejfBZ().valueOf() == InputType.FIAT_INPUT) {
            Channel channelAwvSrB = AuCTel().AwvSrB();
            if ((channelAwvSrB != null ? channelAwvSrB.getPaymentMethodCategory() : null) == PaymentMethodCategory.CASH) {
                pair = new Pair(str, C31661lzi.appendFiatSymbol$default(strUzCIH, currency2, 0, null, null, null, 30, null));
            } else {
                pair = new Pair(str, C31661lzi.appendCryptoSymbol$default(strUzCIH, currency2, 0, null, null, null, 30, null));
            }
        } else {
            pair = new Pair(C31661lzi.appendCryptoSymbol$default(strOLrzqt, str, 0, null, null, null, 30, null), currency2);
        }
        return C33069mpW.copydefault(C31351lsQ.Activity.dlRikr, C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseCurrency", (String) pair.component1()), C56390yDp.OLrzqt("quoteCurrency", (String) pair.component2())));
    }

    /* JADX INFO: loaded from: classes18.dex */
    @Serializable
    public static final class OtcAgentGetQuoteMessage extends OKCustomMessage implements sJU<OtcAgentGetQuoteMessage> {
        public static final Companion Companion = new Companion(null);
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null};

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellFragment.OtcAgentGetQuoteMessage.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OtcAgentGetQuoteMessage> serializer() {
                return BaseBuySellFragment$OtcAgentGetQuoteMessage$$serializer.INSTANCE;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r21v0 int)
  (r22v0 java.lang.String)
  (r23v0 com.okinc.okimcore.model.im.OKUserInfo)
  (r24v0 com.okinc.okimcore.model.im.OKMentionedInfo)
  (r25v0 java.lang.String)
  (r26v0 boolean)
  (r27v0 long)
  (r29v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType)
  (r30v0 boolean)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (wrap:kotlinx.serialization.json.JsonObject:0x0024: CHECK_CAST (kotlinx.serialization.json.JsonObject) (r36v0 java.lang.String))
  (wrap:java.lang.String:0x0028: CHECK_CAST (java.lang.String) (r37v0 kotlinx.serialization.json.JsonObject))
  (r38v0 java.lang.String)
  (r39v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] (LINE:1235) call: com.okinc.okimcore.model.im.OKCustomMessage.<init>(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: SUPER */
        /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.lang.String */
        /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: kotlinx.serialization.json.JsonObject */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ OtcAgentGetQuoteMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, (JsonObject) str8, (String) jsonObject, str9, serializationConstructorMarker);
        }

        public OtcAgentGetQuoteMessage() {
        }

        @Override // o.sJU
        public String encodeToInHouseCustomContent() {
            String content = getContent();
            return content == null ? "" : content;
        }

        /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
        @Override // o.sJU
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public OtcAgentGetQuoteMessage decodeFromInHouseCustomContent(String str) {
            setContent(str);
            return this;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    @Serializable
    public static final class OtcAgentGetQuoteMessageContent {
        public static final Companion Companion = new Companion(null);
        public final OtcAgentGetQuoteMessageData data;
        public final String useCase;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OtcAgentGetQuoteMessageContent() {
            this((String) null, (OtcAgentGetQuoteMessageData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OtcAgentGetQuoteMessageContent copy$default(OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent, String str, OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otcAgentGetQuoteMessageContent.useCase;
            }
            if ((i & 2) != 0) {
                otcAgentGetQuoteMessageData = otcAgentGetQuoteMessageContent.data;
            }
            return otcAgentGetQuoteMessageContent.OLrzqt(str, otcAgentGetQuoteMessageData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OtcAgentGetQuoteMessageContent OLrzqt(@NotNull String str, @NotNull OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(otcAgentGetQuoteMessageData, "");
            return new OtcAgentGetQuoteMessageContent(str, otcAgentGetQuoteMessageData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtcAgentGetQuoteMessageContent)) {
                return false;
            }
            OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent = (OtcAgentGetQuoteMessageContent) obj;
            return Intrinsics.EZpvd((Object) this.useCase, (Object) otcAgentGetQuoteMessageContent.useCase) && Intrinsics.EZpvd(this.data, otcAgentGetQuoteMessageContent.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.useCase.hashCode() * 31) + this.data.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OtcAgentGetQuoteMessageContent(useCase=" + this.useCase + ", data=" + this.data + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellFragment.OtcAgentGetQuoteMessageContent.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OtcAgentGetQuoteMessageContent> serializer() {
                return BaseBuySellFragment$OtcAgentGetQuoteMessageContent$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OtcAgentGetQuoteMessageContent(int i, String str, OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData, SerializationConstructorMarker serializationConstructorMarker) {
            this.useCase = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.data = new OtcAgentGetQuoteMessageData((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            } else {
                this.data = otcAgentGetQuoteMessageData;
            }
        }

        public static final /* synthetic */ void OLrzqt(OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) otcAgentGetQuoteMessageContent.useCase, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, otcAgentGetQuoteMessageContent.useCase);
            }
            int i = 1;
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(otcAgentGetQuoteMessageContent.data, new OtcAgentGetQuoteMessageData((String) null, i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, BaseBuySellFragment$OtcAgentGetQuoteMessageData$$serializer.INSTANCE, otcAgentGetQuoteMessageContent.data);
        }

        public OtcAgentGetQuoteMessageContent(@NotNull String str, @NotNull OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(otcAgentGetQuoteMessageData, "");
            this.useCase = str;
            this.data = otcAgentGetQuoteMessageData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.buysell.ui.bsc.BaseBuySellFragment$OtcAgentGetQuoteMessageData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.buysell.ui.bsc.BaseBuySellFragment$OtcAgentGetQuoteMessageData:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
 A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:1254) call: com.okinc.buysell.ui.bsc.BaseBuySellFragment.OtcAgentGetQuoteMessageData.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 com.okinc.buysell.ui.bsc.BaseBuySellFragment$OtcAgentGetQuoteMessageData))
 A[MD:(java.lang.String, com.okinc.buysell.ui.bsc.BaseBuySellFragment$OtcAgentGetQuoteMessageData):void (m)] (LINE:1252) call: com.okinc.buysell.ui.bsc.BaseBuySellFragment.OtcAgentGetQuoteMessageContent.<init>(java.lang.String, com.okinc.buysell.ui.bsc.BaseBuySellFragment$OtcAgentGetQuoteMessageData):void type: THIS */
        public /* synthetic */ OtcAgentGetQuoteMessageContent(String str, OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new OtcAgentGetQuoteMessageData((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : otcAgentGetQuoteMessageData);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    @Serializable
    public static final class OtcAgentGetQuoteMessageData {
        public static final Companion Companion = new Companion(null);
        public final String payload;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OtcAgentGetQuoteMessageData() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OtcAgentGetQuoteMessageData copy$default(OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otcAgentGetQuoteMessageData.payload;
            }
            return otcAgentGetQuoteMessageData.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OtcAgentGetQuoteMessageData KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new OtcAgentGetQuoteMessageData(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OtcAgentGetQuoteMessageData) && Intrinsics.EZpvd((Object) this.payload, (Object) ((OtcAgentGetQuoteMessageData) obj).payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.payload.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OtcAgentGetQuoteMessageData(payload=" + this.payload + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellFragment.OtcAgentGetQuoteMessageData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OtcAgentGetQuoteMessageData> serializer() {
                return BaseBuySellFragment$OtcAgentGetQuoteMessageData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ OtcAgentGetQuoteMessageData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.payload = "";
            } else {
                this.payload = str;
            }
        }

        public static final /* synthetic */ void copydefault(OtcAgentGetQuoteMessageData otcAgentGetQuoteMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) otcAgentGetQuoteMessageData.payload, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 0, otcAgentGetQuoteMessageData.payload);
        }

        public OtcAgentGetQuoteMessageData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.payload = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:1258) call: com.okinc.buysell.ui.bsc.BaseBuySellFragment.OtcAgentGetQuoteMessageData.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ OtcAgentGetQuoteMessageData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
