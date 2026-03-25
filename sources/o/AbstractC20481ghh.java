package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.account.api.model.login.BindConst;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.defi.api.model.tx.signdata.CeDefiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.biz.constant.KYSApprovalType;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressPermissionModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressSwitchModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AppBarTitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ButtonGroupModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DappInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataShowModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DefaultTx;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DivideModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.InputsOutputsModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.NetworkFeeModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PsbtsModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.RiskPopupInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ShowInformationModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.SignJsonRouter;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.SimpleTextModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TabListModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Tabs;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TextModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TokenPair;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TriggerPrice;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.okinc.web.WebActivity;
import com.okinc.web3Uilib.bean.TransactionAddressPermissionInfoBean;
import com.okinc.web3Uilib.uilib3.OKWeb3TXDataInputView;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20169gbn;
import o.ActivityC20262gda;
import o.C13754dXa;
import o.C52761wXj;
import o.C55284xgz;
import o.C57516yjr;
import o.C9694baS;
import o.InterfaceC54829xWw;
import o.InterfaceC9730bbB;
import o.InterfaceC9736bbH;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.ghh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC20481ghh<T extends OKWBaseTransaction<?>> extends AbstractC20169gbn<T> {
    public static Function1<? super AbstractC20481ghh<?>, Unit> ejfBZ;
    public static java.util.List<? extends BaseModel<?>> fIwbmz;
    public boolean fARcdN;
    public InterfaceC58217yxC getFieldNames;
    public Function0<Unit> getNewProxyInstance;
    public boolean hDKMBd;
    public final InterfaceC56387yDm iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public static final Activity Companion = new Activity(null);
    public static final int fJNWhG = 8;

    public void DTwDnp() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.getNewProxyInstance = function0;
    }

    public AbstractC20481ghh() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.OKWBaseTransactionModularizationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.OKWBaseTransactionModularizationFragment$special$$inlined$viewModels$default$2
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C20484ghk.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.OKWBaseTransactionModularizationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.OKWBaseTransactionModularizationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.OKWBaseTransactionModularizationFragment$special$$inlined$viewModels$default$5
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
        this.fARcdN = true;
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.ghu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20481ghh.djBIcL(this.OLrzqt);
            }
        });
    }

    public final C20484ghk OcIXYQ() {
        return (C20484ghk) this.uzCIH.getValue();
    }

    /* JADX INFO: renamed from: o.ghh$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ghh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(java.util.List<? extends BaseModel<?>> list) {
            AbstractC20481ghh.fIwbmz = list;
        }

        public final void OLrzqt(Function1<? super AbstractC20481ghh<?>, Unit> function1) {
            AbstractC20481ghh.ejfBZ = function1;
        }
    }

    public final java.util.List<BaseModel<?>> QKVWgx() {
        TxInfoItem txInfo;
        java.util.List<BaseModel<?>> listAEQbTJ = OcIXYQ().AEQbTJ();
        if (listAEQbTJ != null) {
            return listAEQbTJ;
        }
        PreExecTransactionRes preExecTransactionResQSLkRj = ejfBZ().QSLkRj();
        if (preExecTransactionResQSLkRj == null || (txInfo = preExecTransactionResQSLkRj.getTxInfo()) == null) {
            return null;
        }
        return txInfo.getModuleList();
    }

    /* JADX DEBUG: Possible override for method o.gbn.QOLQEE()V */
    public final boolean QOLQEE() {
        return OcIXYQ().AEQbTJ() != null;
    }

    @Override // o.AbstractC20082gaF
    public boolean uzCIH() {
        return QOLQEE();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.List<? extends BaseModel<?>> list;
        super.onCreate(bundle);
        if (OcIXYQ().AEQbTJ() == null && (list = fIwbmz) != null) {
            OcIXYQ().EZpvd(list);
            fIwbmz = null;
        }
        Function1<? super AbstractC20481ghh<?>, Unit> function1 = ejfBZ;
        if (function1 != null) {
            OcIXYQ().OLrzqt(function1);
            ejfBZ = null;
        }
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C33537myN c33537myN;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        final Function1<AbstractC20481ghh<?>, Unit> function1Copydefault = OcIXYQ().copydefault();
        if (function1Copydefault != null) {
            FragmentActivity activity = getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.gic
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC20481ghh.KWHzl(function1Copydefault, this, (OnBackPressedCallback) obj);
                    }
                }, 2, null);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (c33537myN = (C33537myN) activity2.findViewById(C13754dXa.ActionBar.accept)) != null) {
                c33537myN.setBackListener(new View.OnClickListener() { // from class: o.gie
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        AbstractC20481ghh.OLrzqt(function1Copydefault, this, view2);
                    }
                });
            }
        }
        if (ejfBZ() instanceof C12152chZ) {
            fXL fxl = fXL.copydefault;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            int i = C13754dXa.ActionBar.DfrfUJ;
            T tEjfBZ = ejfBZ();
            Intrinsics.copydefault(tEjfBZ, "");
            fxl.OLrzqt(contextRequireContext, parentFragmentManager, i, (C12152chZ) tEjfBZ, new Function0() { // from class: o.gid
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20481ghh.AhwBna(this.EZpvd);
                }
            });
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(ejfBZ().WS());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        yBI.subscribeBy$default(C58156yvv.OLrzqt(abstractC58185ywXKWHzl, viewLifecycleOwner, Lifecycle.Event.ON_STOP), (Function1) null, (Function0) null, new Function1() { // from class: o.gia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit KWHzl(Function1 function1, AbstractC20481ghh abstractC20481ghh, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        function1.invoke(abstractC20481ghh);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, AbstractC20481ghh abstractC20481ghh, android.view.View view) {
        function1.invoke(abstractC20481ghh);
    }

    public static final Unit AhwBna(AbstractC20481ghh abstractC20481ghh) {
        FragmentActivity activity = abstractC20481ghh.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.util.List<BaseModel<?>> listQKVWgx = QKVWgx();
        if (listQKVWgx != null) {
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                actionBar.KWHzl(OLrzqt((BaseModel<?>) it.next(), z));
            }
        }
    }

    public final void KWHzl(AbstractC20082gaF<T>.ActionBar actionBar, BaseModel<?> baseModel) {
        android.view.View viewAEQbTJ;
        java.lang.Object data;
        java.lang.String moduleId = baseModel.getModuleId();
        if (moduleId.length() <= 0) {
            moduleId = null;
        }
        if (moduleId == null || (viewAEQbTJ = actionBar.AEQbTJ(moduleId)) == null || (data = baseModel.getData()) == null || C20514giN.copydefault(viewAEQbTJ, data)) {
            return;
        }
        int iKWHzl = actionBar.KWHzl(viewAEQbTJ);
        actionBar.EZpvd(viewAEQbTJ);
        java.lang.Object objOLrzqt = OLrzqt(baseModel, false);
        if (objOLrzqt instanceof android.view.View) {
            android.view.View view = (android.view.View) objOLrzqt;
            view.setTag(C13754dXa.ActionBar.UiThread, moduleId);
            actionBar.AEQbTJ(view, iKWHzl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(C57508yjj c57508yjj, AssetDiffModuleModel.AssetDiffItem assetDiffItem) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.lang.String displayAmount;
        java.lang.String displaySymbol;
        java.lang.String displayCurrency;
        java.lang.String str2;
        java.lang.String title = assetDiffItem.getTitle();
        java.lang.String subTitle = assetDiffItem.getSubTitle();
        RiskPopupInfo riskPopupInfo = assetDiffItem.getRiskPopupInfo();
        RiskPopupInfo.RiskPopupInfoItem data = riskPopupInfo != null ? riskPopupInfo.getData() : null;
        java.util.List<AssetDiffModuleModel.AssetDiff> assetDiffList = assetDiffItem.getAssetDiffList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(assetDiffList, 10));
        for (AssetDiffModuleModel.AssetDiff assetDiff : assetDiffList) {
            java.lang.String title2 = assetDiff.getTitle();
            java.util.List<AssetDiffModuleModel.TokenAssetDifflist> tokenAssetDifflist = assetDiff.getTokenAssetDifflist();
            if (tokenAssetDifflist != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(tokenAssetDifflist, 10));
                for (AssetDiffModuleModel.TokenAssetDifflist tokenAssetDifflist2 : tokenAssetDifflist) {
                    java.lang.Object displayImage = tokenAssetDifflist2.getTokenInfo().getDisplayImage();
                    if (displayImage == null) {
                        displayImage = tokenAssetDifflist2.getTokenInfo().getImageUrl();
                    }
                    java.lang.Object obj = displayImage;
                    if (tokenAssetDifflist2.getDisplayAmount() != null) {
                        displayAmount = tokenAssetDifflist2.getDisplayAmount();
                        Intrinsics.copydefault((java.lang.Object) displayAmount);
                    } else {
                        java.lang.String amount = tokenAssetDifflist2.getAmount();
                        if (amount != null && amount.length() != 0) {
                            java.lang.String type = tokenAssetDifflist2.getType();
                            java.lang.String amount2 = tokenAssetDifflist2.getAmount();
                            int decimals = tokenAssetDifflist2.getTokenInfo().getDecimals();
                            java.lang.Integer signTokenPrecision = tokenAssetDifflist2.getTokenInfo().getSignTokenPrecision();
                            displayAmount = type + C54870xYj.EZpvd(amount2, decimals, signTokenPrecision != null ? signTokenPrecision.intValue() : 8, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                        } else {
                            str = "";
                            displaySymbol = tokenAssetDifflist2.getTokenInfo().getDisplaySymbol();
                            if (displaySymbol == null) {
                                displaySymbol = tokenAssetDifflist2.getTokenInfo().getSymbol();
                                if (displaySymbol.length() == 0) {
                                    displaySymbol = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
                                }
                            }
                            java.lang.String str3 = displaySymbol;
                            java.lang.String tokenTag = tokenAssetDifflist2.getTokenInfo().getTokenTag();
                            java.lang.String str4 = tokenTag != null ? "" : tokenTag;
                            displayCurrency = tokenAssetDifflist2.getDisplayCurrency();
                            if (displayCurrency != null) {
                                java.lang.String usdAmount = tokenAssetDifflist2.getUsdAmount();
                                java.lang.String strCopydefault = usdAmount != null ? ejfBZ().copydefault(usdAmount) : null;
                                str2 = strCopydefault == null ? "" : strCopydefault;
                            } else {
                                str2 = displayCurrency;
                            }
                            arrayList.add(new AbstractC20169gbn.ActionBar(obj, str, str3, str4, str2, null, null, null, tokenAssetDifflist2.getRoundedRadius()));
                        }
                    }
                    str = displayAmount;
                    displaySymbol = tokenAssetDifflist2.getTokenInfo().getDisplaySymbol();
                    if (displaySymbol == null) {
                    }
                    java.lang.String str32 = displaySymbol;
                    java.lang.String tokenTag2 = tokenAssetDifflist2.getTokenInfo().getTokenTag();
                    if (tokenTag2 != null) {
                    }
                    displayCurrency = tokenAssetDifflist2.getDisplayCurrency();
                    if (displayCurrency != null) {
                    }
                    arrayList.add(new AbstractC20169gbn.ActionBar(obj, str, str32, str4, str2, null, null, null, tokenAssetDifflist2.getRoundedRadius()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new AbstractC20169gbn.StateListAnimator(title2, arrayList));
        }
        KWHzl(c57508yjj, title, subTitle, data, arrayList2);
    }

    public final android.view.View OLrzqt(android.view.View view, java.lang.String str) {
        if (str != null) {
            view.setTag(C13754dXa.ActionBar.UiThread, str);
        }
        return view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r12v31, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r14v11, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r14v4, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(BaseModel<?> baseModel, boolean z) {
        java.lang.Object objEZpvd;
        java.util.List<AbstractC20169gbn.StateListAnimator> listAhwBna;
        java.lang.String str;
        android.graphics.drawable.Drawable drawable;
        java.lang.String strCopydefault;
        android.graphics.drawable.Drawable drawableKWHzl;
        java.lang.String strEZpvd;
        java.lang.Integer signTokenPrecision;
        java.lang.Integer decimals;
        java.lang.String imageUrl;
        ApproveInfoModuleModel.AuthQuantity authQuantity;
        ApproveInfoModuleModel.AuthQuantity authQuantity2;
        java.util.List<AbstractC20169gbn.StateListAnimator> listAhwBna2;
        java.lang.Object light;
        java.lang.String subTitle;
        java.lang.String title;
        C33537myN c33537myN;
        obj = null;
        java.lang.Object obj = null;
        if (baseModel instanceof DivideModuleModel) {
            return yDY.gEmmrt(OLrzqt(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)), AbstractC20169gbn.lineView$default(this, 0, 0, 0, 7, null), OLrzqt(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        if (baseModel instanceof NetworkFeeModuleModel) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(zuBGHE());
            NetworkFeeModuleModel networkFeeModuleModel = (NetworkFeeModuleModel) baseModel;
            NetworkFeeModuleModel.NetworkFeeItem data = networkFeeModuleModel.getData();
            if (data != null && Intrinsics.EZpvd(data.getShowFee(), java.lang.Boolean.TRUE)) {
                C57516yjr c57516yjrDjBIcL = djBIcL();
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDrawerArrowDrawable);
                NetworkFeeModuleModel.NetworkFeeItem data2 = networkFeeModuleModel.getData();
                c57516yjrDjBIcL.setData(new C57516yjr.StateListAnimator(strAYXKKw, data2 != null ? data2.getFeeValue() : null, null, false, false, null, null, null, 252, null));
                arrayList.add(c57516yjrDjBIcL);
            }
            return arrayList;
        }
        if ((baseModel instanceof TokenPair) || (baseModel instanceof TriggerPrice)) {
            return null;
        }
        if (baseModel instanceof AppBarTitleModuleModel) {
            AppBarTitleModuleModel.AppBarTitleItem data3 = ((AppBarTitleModuleModel) baseModel).getData();
            if (data3 == null || (title = data3.getTitle()) == null) {
                return null;
            }
            FragmentActivity activity = getActivity();
            if (activity != null && (c33537myN = (C33537myN) activity.findViewById(C13754dXa.ActionBar.accept)) != null) {
                c33537myN.setTitle(title);
                Unit unit = Unit.INSTANCE;
            }
            this.hDKMBd = true;
            Unit unit2 = Unit.INSTANCE;
            return null;
        }
        final java.lang.Object data4 = baseModel != null ? baseModel.getData() : null;
        if (data4 instanceof TitleModuleModel.TitleModel) {
            TitleModuleModel.TitleModel titleModel = (TitleModuleModel.TitleModel) data4;
            TitleModuleModel.ImageItem topImage = titleModel.getTopImage();
            if ((topImage != null ? topImage.getLocalImage() : null) == null) {
                if (C33492mxV.OLrzqt()) {
                    TitleModuleModel.ImageItem topImage2 = titleModel.getTopImage();
                    if (topImage2 != null) {
                        light = topImage2.getDark();
                    }
                } else {
                    TitleModuleModel.ImageItem topImage3 = titleModel.getTopImage();
                    if (topImage3 != null) {
                        light = topImage3.getLight();
                    }
                }
                java.lang.String text = titleModel.getTitle().getText();
                java.lang.String str2 = text != null ? "" : text;
                boolean zEZpvd = Intrinsics.EZpvd(titleModel.getTitle().getIdentify(), java.lang.Boolean.TRUE);
                subTitle = titleModel.getSubTitle();
                if (subTitle == null) {
                    subTitle = "";
                }
                return OLrzqt(obj, str2, !zEZpvd, subTitle, titleModel.getTitle().getCustomColor());
            }
            java.lang.Integer localImage = titleModel.getTopImage().getLocalImage();
            Intrinsics.copydefault(localImage);
            light = C33070mpX.KWHzl(localImage.intValue());
            obj = light;
            java.lang.String text2 = titleModel.getTitle().getText();
            if (text2 != null) {
            }
            boolean zEZpvd2 = Intrinsics.EZpvd(titleModel.getTitle().getIdentify(), java.lang.Boolean.TRUE);
            subTitle = titleModel.getSubTitle();
            if (subTitle == null) {
            }
            return OLrzqt(obj, str2, !zEZpvd2, subTitle, titleModel.getTitle().getCustomColor());
        }
        if (data4 instanceof AssetDiffModuleModel.AssetDiffItem) {
            return OLrzqt(C20514giN.copydefault(ORxRYg(), data4, new Function2() { // from class: o.ghT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC20481ghh.AEQbTJ(this.EZpvd, (C57508yjj) obj2, (AssetDiffModuleModel.AssetDiffItem) obj3);
                }
            }, new Function2() { // from class: o.gih
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC20481ghh.EZpvd(this.OLrzqt, (C57508yjj) obj2, (AssetDiffModuleModel.AssetDiffItem) obj3);
                }
            }), baseModel.getModuleId());
        }
        if (data4 instanceof DefaultTx.DefaultTxItem) {
            DefaultTx.DefaultTxItem defaultTxItem = (DefaultTx.DefaultTxItem) data4;
            java.lang.String title2 = defaultTxItem.getTitle();
            java.lang.String subTitle2 = defaultTxItem.getSubTitle();
            RiskPopupInfo riskPopupInfo = defaultTxItem.getRiskPopupInfo();
            RiskPopupInfo.RiskPopupInfoItem data5 = riskPopupInfo != null ? riskPopupInfo.getData() : null;
            DefaultTx.TxInfoItem txInfo = defaultTxItem.getTxInfo();
            if (txInfo != null) {
                java.lang.String icon = txInfo.getIcon();
                java.lang.String str3 = icon == null ? "" : icon;
                java.lang.String title3 = txInfo.getTitle();
                listAhwBna2 = C56402yEa.EZpvd(new AbstractC20169gbn.StateListAnimator(null, C56402yEa.EZpvd(new AbstractC20169gbn.ActionBar(str3, title3 == null ? "" : title3, "", "", "", null, null, null, null))));
                if (listAhwBna2 == null) {
                }
            } else {
                listAhwBna2 = yDY.AhwBna();
            }
            return KWHzl(title2, subTitle2, data5, listAhwBna2);
        }
        if (data4 instanceof ApproveInfoModuleModel.ApproveInfoItem) {
            ApproveInfoModuleModel.ApproveInfoItem approveInfoItem = (ApproveInfoModuleModel.ApproveInfoItem) data4;
            java.lang.String title4 = approveInfoItem.getTitle();
            java.lang.String subTitle3 = approveInfoItem.getSubTitle();
            RiskPopupInfo riskPopupInfo2 = approveInfoItem.getRiskPopupInfo();
            RiskPopupInfo.RiskPopupInfoItem data6 = riskPopupInfo2 != null ? riskPopupInfo2.getData() : null;
            java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> approveInfoList = approveInfoItem.getApproveInfoList();
            if (approveInfoList == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList<>(C56403yEb.AYXKKw(approveInfoList, 10));
                for (final ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem : approveInfoList) {
                    int iIntValue = 0;
                    if (this.fARcdN && (authQuantity2 = approveInfoListItem.getAuthQuantity()) != null && Intrinsics.EZpvd(authQuantity2.getAutoEdit(), java.lang.Boolean.TRUE) && (ejfBZ() instanceof InterfaceC9730bbB)) {
                        this.fARcdN = false;
                        KWHzl(approveInfoListItem, approveInfoItem.getTxTitle());
                    }
                    KYSApprovalType.Application application = KYSApprovalType.Companion;
                    ApproveInfoModuleModel.Spender spender = approveInfoListItem.getSpender();
                    byte b = application.OLrzqt(spender != null ? spender.getApprovalType() : null) == KYSApprovalType.CANCEL_AUTHORIZATION;
                    byte b2 = !b == true && (authQuantity = approveInfoListItem.getAuthQuantity()) != null && Intrinsics.EZpvd(authQuantity.getCanEdit(), java.lang.Boolean.TRUE) && (ejfBZ() instanceof InterfaceC9730bbB);
                    ApproveInfoModuleModel.TxInfoItem tokenInfo = approveInfoListItem.getTokenInfo();
                    java.lang.String str4 = (tokenInfo == null || (imageUrl = tokenInfo.getImageUrl()) == null) ? "" : imageUrl;
                    if (b == true) {
                        str = "";
                    } else {
                        if (approveInfoListItem.getDisplayAmount() != null) {
                            strEZpvd = approveInfoListItem.getDisplayAmount();
                            Intrinsics.copydefault((java.lang.Object) strEZpvd);
                        } else if (Intrinsics.EZpvd((java.lang.Object) approveInfoListItem.getAmount(), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                            strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                        } else {
                            java.lang.String amount = approveInfoListItem.getAmount();
                            if (amount != null) {
                                ApproveInfoModuleModel.TxInfoItem tokenInfo2 = approveInfoListItem.getTokenInfo();
                                if (tokenInfo2 != null && (decimals = tokenInfo2.getDecimals()) != null) {
                                    iIntValue = decimals.intValue();
                                }
                                int i = iIntValue;
                                ApproveInfoModuleModel.TxInfoItem tokenInfo3 = approveInfoListItem.getTokenInfo();
                                strEZpvd = C54870xYj.EZpvd(amount, i, (tokenInfo3 == null || (signTokenPrecision = tokenInfo3.getSignTokenPrecision()) == null) ? 8 : signTokenPrecision.intValue(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                                if (strEZpvd == null) {
                                }
                            }
                            str = "";
                        }
                        str = strEZpvd;
                    }
                    ApproveInfoModuleModel.TxInfoItem tokenInfo4 = approveInfoListItem.getTokenInfo();
                    java.lang.String symbol = tokenInfo4 != null ? tokenInfo4.getSymbol() : null;
                    java.lang.String strAYXKKw2 = (symbol == null || symbol.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol;
                    if (!b2 == true || (drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DPHsZd)) == null) {
                        drawable = null;
                    } else {
                        drawableKWHzl.setTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.QwvEab));
                        Unit unit3 = Unit.INSTANCE;
                        drawable = drawableKWHzl;
                    }
                    Function0 function0 = b2 != false ? new Function0() { // from class: o.gig
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.OLrzqt(this.OLrzqt, approveInfoListItem, data4);
                        }
                    } : null;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) approveInfoListItem.getExpiration())) {
                        int i2 = C13754dXa.FragmentManager.PickVisualMediaRequestdefault;
                        java.lang.String expiration = approveInfoListItem.getExpiration();
                        Intrinsics.copydefault((java.lang.Object) expiration);
                        strCopydefault = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", expiration)));
                    } else {
                        strCopydefault = "";
                    }
                    listAhwBna.add(new AbstractC20169gbn.StateListAnimator(null, C56402yEa.EZpvd(new AbstractC20169gbn.ActionBar(str4, str, strAYXKKw2, "", "", drawable, function0, strCopydefault, null))));
                }
            }
            return KWHzl(title4, subTitle3, data6, listAhwBna);
        }
        if (data4 instanceof MevInfo.MevInfoItem) {
            MevInfo.MevInfoItem mevInfoItem = (MevInfo.MevInfoItem) data4;
            if (!Intrinsics.EZpvd(mevInfoItem.getSupportMev(), java.lang.Boolean.TRUE) || !(ejfBZ() instanceof InterfaceC9743bbO)) {
                data4 = null;
            }
            if (((MevInfo.MevInfoItem) data4) != null) {
                return EZpvd(z, mevInfoItem.getOpenMev(), mevInfoItem.getMevNodeList());
            }
            return null;
        }
        if (data4 instanceof DappInfoModuleModel.DappItem) {
            DappInfoModuleModel.DappItem dappItem = (DappInfoModuleModel.DappItem) data4;
            java.lang.String name = dappItem.getName();
            if (name == null) {
                name = "";
            }
            int iQwvEab = ejfBZ().QwvEab();
            if (iQwvEab == 1 || iQwvEab == 3 || iQwvEab == 4 || iQwvEab == 6 || iQwvEab == 7) {
                C14726dqr c14726dqr = C14726dqr.OLrzqt;
                android.content.Context context = getContext();
                if (context == null) {
                    return null;
                }
                objEZpvd = c14726dqr.EZpvd(context);
            } else {
                objEZpvd = dappItem.getLocalIconRes() != null ? dappItem.getLocalIconRes() : dappItem.getIcon();
            }
            java.lang.String host = dappItem.getHost();
            return copydefault(name, objEZpvd, host != null ? host : "");
        }
        if (data4 instanceof AddressModuleModel.AddressItem) {
            AddressModuleModel.AddressItem addressItem = (AddressModuleModel.AddressItem) data4;
            java.lang.String title5 = addressItem.getTitle();
            java.lang.String address = addressItem.getAddress();
            java.lang.String str5 = address == null ? "" : address;
            java.lang.Boolean redShow = addressItem.getRedShow();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Integer numValueOf = Intrinsics.EZpvd(redShow, bool) ? java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)) : null;
            java.lang.String tag = addressItem.getTag();
            return OLrzqt(title5, str5, numValueOf, tag == null ? "" : tag, addressItem.getAddressType(), Intrinsics.EZpvd(addressItem.getShowArrow(), bool), new Function1() { // from class: o.gif
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AbstractC20481ghh.AEQbTJ((java.lang.String) obj2);
                }
            });
        }
        if (data4 instanceof Advance.AdvanceItem) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            Advance.AdvanceItem advanceItem = (Advance.AdvanceItem) data4;
            java.util.List<BaseModel<?>> children = advanceItem.getChildren();
            if (children != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(children, 10));
                for (BaseModel<?> baseModel2 : children) {
                    java.lang.Object objOLrzqt = OLrzqt(baseModel2, z);
                    if (objOLrzqt instanceof android.view.View) {
                        listOLrzqt.add(OLrzqt((android.view.View) objOLrzqt, baseModel2.getModuleId()));
                    } else if (objOLrzqt instanceof java.util.List) {
                        for (java.lang.Object obj2 : (java.lang.Iterable) objOLrzqt) {
                            if (obj2 instanceof android.view.View) {
                                listOLrzqt.add(OLrzqt((android.view.View) obj2, baseModel2.getModuleId()));
                            }
                        }
                    }
                    arrayList2.add(Unit.INSTANCE);
                }
            }
            java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            android.view.View viewOLrzqt = OLrzqt(AbstractC20169gbn.moreView$default(this, Intrinsics.EZpvd(advanceItem.getListExpansion(), java.lang.Boolean.TRUE), null, null, listFARcdN, 6, null), baseModel.getModuleId());
            if (!(!listFARcdN.isEmpty())) {
                return viewOLrzqt;
            }
            java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
            listOLrzqt2.add(viewOLrzqt);
            listOLrzqt2.addAll(listFARcdN);
            return C56402yEa.fARcdN(listOLrzqt2);
        }
        if (data4 instanceof Tabs.TabItem) {
            java.util.List<Tabs.Children> children2 = ((Tabs.TabItem) data4).getChildren();
            if (children2 == null) {
                return null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(children2, 10));
            for (Tabs.Children children3 : children2) {
                java.lang.String title6 = children3.getTitle();
                if (title6 == null) {
                    title6 = "";
                }
                java.lang.String data7 = children3.getData();
                if (data7 == null) {
                    data7 = "";
                }
                arrayList3.add(AEQbTJ(title6, data7));
            }
            return arrayList3;
        }
        if (data4 instanceof TabListModuleModel.TabListItem) {
            TabListModuleModel.TabListItem tabListItem = (TabListModuleModel.TabListItem) data4;
            return OLrzqt(tabListItem.getTitle(), tabListItem.getDatas());
        }
        if (data4 instanceof TxExplain.ExplainItem) {
            Intrinsics.copydefault(baseModel, "");
            return KWHzl((TxExplain) baseModel);
        }
        if (data4 instanceof SignJsonRouter.SignJsonRouterItem) {
            SignJsonRouter.SignJsonRouterItem signJsonRouterItem = (SignJsonRouter.SignJsonRouterItem) data4;
            java.lang.String title7 = signJsonRouterItem.getTitle();
            if (title7 == null) {
                title7 = "";
            }
            java.lang.String data8 = signJsonRouterItem.getData();
            return AEQbTJ(title7, data8 != null ? data8 : "");
        }
        if (data4 instanceof DataInputModuleModel.DataInputItem) {
            return OLrzqt(AEQbTJ((DataInputModuleModel.DataInputItem) data4, Intrinsics.EZpvd((java.lang.Object) baseModel.getModuleId(), (java.lang.Object) "hex_data") ? new Function1() { // from class: o.gio
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return AbstractC20481ghh.EZpvd(this.KWHzl, (java.lang.String) obj3);
                }
            } : null), baseModel.getModuleId());
        }
        if (data4 instanceof DataShowModuleModel.DataShowItem) {
            return KWHzl((DataShowModuleModel.DataShowItem) data4);
        }
        if (data4 instanceof TextModuleModel.TextItem) {
            TextModuleModel.TextItem textItem = (TextModuleModel.TextItem) data4;
            java.lang.String title8 = textItem.getTitle();
            if (title8 == null) {
                title8 = "";
            }
            java.lang.String text3 = textItem.getText();
            return AEQbTJ(title8, text3 != null ? text3 : "");
        }
        if (data4 instanceof SimpleTextModuleModel.TextItem) {
            SimpleTextModuleModel.TextItem textItem2 = (SimpleTextModuleModel.TextItem) data4;
            java.lang.String title9 = textItem2.getTitle();
            if (title9 == null) {
                title9 = "";
            }
            java.lang.String text4 = textItem2.getText();
            return OLrzqt(EZpvd(title9, text4 != null ? text4 : ""), baseModel.getModuleId());
        }
        if (!(data4 instanceof PsbtsModuleModel.Psbts)) {
            if (data4 instanceof InputsOutputsModuleModel.InputsOutputs) {
                InputsOutputsModuleModel.InputsOutputs inputsOutputs = (InputsOutputsModuleModel.InputsOutputs) data4;
                return OLrzqt(EZpvd(inputsOutputs.getTitle(), inputsOutputs.getInputInfo(), inputsOutputs.getOutputInfo()), baseModel.getModuleId());
            }
            if (data4 instanceof AddressPermissionModuleModel.AddressPermission) {
                AddressPermissionModuleModel.AddressPermission addressPermission = (AddressPermissionModuleModel.AddressPermission) data4;
                java.lang.String title10 = addressPermission.getTitle();
                java.util.List<AddressPermissionModuleModel.AddressPermission.AddressPermissionDataBean> dataList = addressPermission.getDataList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(dataList, 10));
                for (AddressPermissionModuleModel.AddressPermission.AddressPermissionDataBean addressPermissionDataBean : dataList) {
                    arrayList4.add(new TransactionAddressPermissionInfoBean.AddressPermissionDataBean(addressPermissionDataBean.getTitle(), addressPermissionDataBean.getAddress()));
                }
                return EZpvd(title10, arrayList4);
            }
            if (data4 instanceof AddressSwitchModuleModel.AddressItem) {
                AddressSwitchModuleModel.AddressItem addressItem2 = (AddressSwitchModuleModel.AddressItem) data4;
                return KWHzl(addressItem2.getTitle(), addressItem2.getAddressTypeText());
            }
            if (data4 instanceof ShowInformationModuleModel.InformationItem) {
                copydefault(((ShowInformationModuleModel.InformationItem) data4).getTitle());
                return Unit.INSTANCE;
            }
            if (!(data4 instanceof ButtonGroupModuleModel.ButtonGroup)) {
                return null;
            }
            OLrzqt((ButtonGroupModuleModel.ButtonGroup) data4);
            return null;
        }
        java.util.List<PsbtsModuleModel.PsbtHex> psbtHexs = ((PsbtsModuleModel.Psbts) data4).getPsbtHexs();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(psbtHexs, 10));
        for (PsbtsModuleModel.PsbtHex psbtHex : psbtHexs) {
            arrayList5.add(OLrzqt(psbtHex.getTxTitle(), psbtHex.getPsbtHex(), psbtHex.getModuleList()));
        }
        return arrayList5;
    }

    public static final Unit AEQbTJ(AbstractC20481ghh abstractC20481ghh, C57508yjj c57508yjj, AssetDiffModuleModel.AssetDiffItem assetDiffItem) {
        Intrinsics.checkNotNullParameter(c57508yjj, "");
        Intrinsics.checkNotNullParameter(assetDiffItem, "");
        abstractC20481ghh.OLrzqt(c57508yjj, assetDiffItem);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC20481ghh abstractC20481ghh, C57508yjj c57508yjj, AssetDiffModuleModel.AssetDiffItem assetDiffItem) {
        Intrinsics.checkNotNullParameter(c57508yjj, "");
        Intrinsics.checkNotNullParameter(assetDiffItem, "");
        abstractC20481ghh.OLrzqt(c57508yjj, assetDiffItem);
        android.view.View childAt = c57508yjj.getChildAt(0);
        C57512yjn c57512yjn = childAt instanceof C57512yjn ? (C57512yjn) childAt : null;
        if (c57512yjn != null) {
            abstractC20481ghh.KWHzl(yDY.gEmmrt(c57512yjn.KWHzl(), c57512yjn.AEQbTJ(), c57512yjn.copydefault()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC20481ghh abstractC20481ghh, ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, java.lang.Object obj) {
        abstractC20481ghh.AEQbTJ(approveInfoListItem, ((ApproveInfoModuleModel.ApproveInfoItem) obj).getTxTitle(), false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final AbstractC20481ghh abstractC20481ghh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C52794wYp.startLoading$default(abstractC20481ghh.gEmmrt().KWHzl.copydefault(), 0L, 1, null);
        T tEjfBZ = abstractC20481ghh.ejfBZ();
        Intrinsics.copydefault(tEjfBZ, "");
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtKWHzl = ((InterfaceC9778bbx) tEjfBZ).KWHzl(str);
        final Function1 function1 = new Function1() { // from class: o.ghR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ghQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20481ghh.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ghS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ghY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20481ghh.values(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC20481ghh abstractC20481ghh, kotlin.Pair pair) {
        abstractC20481ghh.gEmmrt().KWHzl.copydefault().fIwbmz();
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC20481ghh abstractC20481ghh, java.lang.Throwable th) {
        abstractC20481ghh.gEmmrt().KWHzl.copydefault().fIwbmz();
        return Unit.INSTANCE;
    }

    private final void KWHzl(final ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, final TitleModuleModel titleModuleModel) {
        PreExecTransactionRes preExecTransactionResQSLkRj;
        if (ejfBZ().OJuSTm().isChangedCustomRpc()) {
            return;
        }
        android.view.View view = getView();
        if (view != null) {
            view.setVisibility(4);
        }
        fXJ fxj = fXJ.KWHzl;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FragmentActivity activity = getActivity();
        if (activity == null || (preExecTransactionResQSLkRj = ejfBZ().QSLkRj()) == null) {
            return;
        }
        fxj.EZpvd(viewLifecycleOwner, activity, preExecTransactionResQSLkRj, new Function0() { // from class: o.gii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20481ghh.copydefault(this.KWHzl, approveInfoListItem, titleModuleModel);
            }
        });
    }

    public static final Unit copydefault(AbstractC20481ghh abstractC20481ghh, ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, TitleModuleModel titleModuleModel) {
        abstractC20481ghh.AEQbTJ(approveInfoListItem, titleModuleModel, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ(ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, TitleModuleModel titleModuleModel, final boolean z) {
        final int iKWHzl;
        if (!z) {
            AubY();
        }
        final T tEjfBZ = ejfBZ();
        if (tEjfBZ instanceof C8972bMm) {
            C8972bMm c8972bMm = (C8972bMm) tEjfBZ;
            iKWHzl = c8972bMm.heceqZ() ? c8972bMm.KWHzl(approveInfoListItem) : 0;
        }
        C9694baS.Application application = C9694baS.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        ActivityC20262gda.TaskDescription taskDescription = ActivityC20262gda.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.KWHzl(childFragmentManager, taskDescription.EZpvd(contextRequireContext, tEjfBZ, iKWHzl, titleModuleModel, z), new Function2() { // from class: o.ghv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC20481ghh.KWHzl(tEjfBZ, this, iKWHzl, z, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(OKWBaseTransaction oKWBaseTransaction, AbstractC20481ghh abstractC20481ghh, int i, boolean z, int i2, android.content.Intent intent) {
        FragmentActivity activity;
        if (!(oKWBaseTransaction instanceof AbstractC8601bFm) || !(oKWBaseTransaction instanceof InterfaceC9730bbB)) {
            return Unit.INSTANCE;
        }
        if (i2 == -1) {
            android.view.View view = abstractC20481ghh.getView();
            if (view != null) {
                view.setVisibility(0);
            }
            abstractC20481ghh.AwvSrB();
        } else if (oKWBaseTransaction instanceof C8972bMm) {
            C8972bMm c8972bMm = (C8972bMm) oKWBaseTransaction;
            if (c8972bMm.heceqZ()) {
                java.lang.String approveAmount$default = InterfaceC9736bbH.StateListAnimator.getApproveAmount$default((InterfaceC9736bbH) oKWBaseTransaction, i, false, 2, null);
                if (approveAmount$default.length() > 0) {
                    c8972bMm.copydefault(i, approveAmount$default);
                }
            } else {
                InterfaceC9730bbB interfaceC9730bbB = (InterfaceC9730bbB) oKWBaseTransaction;
                java.lang.String approveAmount$default2 = InterfaceC9730bbB.Application.getApproveAmount$default(interfaceC9730bbB, false, 1, null);
                if (approveAmount$default2.length() > 0) {
                    interfaceC9730bbB.EZpvd(approveAmount$default2);
                }
            }
            if ((z || ((AbstractC8601bFm) oKWBaseTransaction).OJuSTm().isChangedCustomRpc()) && (activity = abstractC20481ghh.getActivity()) != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private final eUI QfsBiF() {
        return (eUI) this.iwGUEr.getValue();
    }

    public static final eUI djBIcL(AbstractC20481ghh abstractC20481ghh) {
        FragmentActivity fragmentActivityRequireActivity = abstractC20481ghh.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (eUI) new ViewModelProvider(fragmentActivityRequireActivity).get(eUI.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r2v53, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Type inference failed for: r12v5, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r1v116, types: [o.bCW] */
    /* JADX WARN: Type inference failed for: r3v70, types: [o.bCW] */
    @Override // o.AbstractC20082gaF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) throws CoinMetaError {
        java.lang.String strCopydefault;
        java.util.ArrayList arrayList;
        java.lang.Object next;
        java.lang.String strCopydefault2;
        java.lang.String strCopydefault3;
        final java.lang.String strAEQbTJ;
        java.lang.String str;
        Function0 function0;
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault4;
        Function0 function02;
        Function0 function03;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String strCopydefault5;
        java.lang.String strCopydefault6;
        Function0 function04;
        C10854bwM c10854bwMDHguZz;
        C10854bwM c10854bwMDHguZz2;
        java.lang.String str4;
        Function0 function05;
        java.lang.String strAYXKKw2;
        boolean z;
        java.util.Collection<AbstractC9832bcy> collectionValues;
        strCopydefault = "";
        Intrinsics.checkNotNullParameter(collection, "");
        if (QOLQEE()) {
            return;
        }
        fXW fxwAkhnZx = AkhnZx();
        FragmentActivity activity = getActivity();
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        java.util.HashMap<java.lang.String, AbstractC9832bcy> mapEZpvd = ejfBZ().UlJrfe().EZpvd(3);
        java.lang.String strFJNWhG = null;
        if (mapEZpvd == null || (collectionValues = mapEZpvd.values()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionValues) {
                if (!((AbstractC9832bcy) obj).AhwBna()) {
                    arrayList.add(obj);
                }
            }
        }
        fxwAkhnZx.AEQbTJ(activity, parentFragmentManager, arrayList, ejfBZ().aUsmxb(), !(ejfBZ() instanceof C9216bRR), new Function0() { // from class: o.ghw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20481ghh.valueOf(this.KWHzl);
            }
        });
        OKWeb3TXDataInputView oKWeb3TXDataInputView = (OKWeb3TXDataInputView) isConnected().AEQbTJ("memo");
        java.util.Collection<? extends AbstractC9832bcy> collection2 = collection;
        java.util.Collection<? extends AbstractC9832bcy> collection3 = collection2;
        if (!collection3.isEmpty()) {
            java.util.Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (((AbstractC9832bcy) it.next()) instanceof C9800bcS) {
                    if (oKWeb3TXDataInputView != null) {
                        int i = C13754dXa.FragmentManager.setLogo;
                        T tEjfBZ = ejfBZ();
                        Intrinsics.copydefault(tEjfBZ, "");
                        oKWeb3TXDataInputView.setErrorText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(((InterfaceC9747bbS) tEjfBZ).KWHzl())))));
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (oKWeb3TXDataInputView != null) {
            }
        } else if (oKWeb3TXDataInputView != null) {
            oKWeb3TXDataInputView.EZpvd();
            Unit unit2 = Unit.INSTANCE;
        }
        OKWeb3TXDataInputView oKWeb3TXDataInputView2 = (OKWeb3TXDataInputView) isConnected().AEQbTJ("hex_data");
        if (!collection3.isEmpty()) {
            java.util.Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC9832bcy) it2.next()) instanceof C9795bcN) {
                    if (oKWeb3TXDataInputView2 != null) {
                        oKWeb3TXDataInputView2.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.uncaughtException));
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
            if (oKWeb3TXDataInputView2 != null) {
            }
        } else if (oKWeb3TXDataInputView2 != null) {
            oKWeb3TXDataInputView2.EZpvd();
            Unit unit4 = Unit.INSTANCE;
        }
        if (ejfBZ() instanceof C12207cib) {
            AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection2);
            T tEjfBZ2 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ2, "");
            OkUTXOTransaction.InputsAndOutputs inputsAndOutputs$default = ((abstractC9832bcy instanceof C9784bcC) || (abstractC9832bcy instanceof C9811bcd)) ? null : C12207cib.getInputsAndOutputs$default((C12207cib) tEjfBZ2, false, 1, null);
            C57519yju c57519yju = (C57519yju) isConnected().AEQbTJ("advance");
            if (c57519yju != null) {
                if (!C33129mqd.KWHzl((java.util.Collection) (inputsAndOutputs$default != null ? inputsAndOutputs$default.getInputs() : null))) {
                    z = false;
                    c57519yju.AEQbTJ(z);
                    Unit unit5 = Unit.INSTANCE;
                } else {
                    if (C33129mqd.KWHzl((java.util.Collection) (inputsAndOutputs$default != null ? inputsAndOutputs$default.getOutputs() : null))) {
                        z = true;
                    }
                    c57519yju.AEQbTJ(z);
                    Unit unit52 = Unit.INSTANCE;
                }
            }
        }
        java.util.Iterator<T> it3 = collection2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((AbstractC9832bcy) next) instanceof C9785bcD) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final AbstractC9832bcy abstractC9832bcy2 = (AbstractC9832bcy) next;
        if (abstractC9832bcy2 == null) {
            T tEjfBZ3 = ejfBZ();
            if (tEjfBZ3 instanceof AbstractC8601bFm) {
                AbstractC8601bFm abstractC8601bFm = (AbstractC8601bFm) tEjfBZ3;
                java.lang.String strX_ = abstractC8601bFm.X_();
                if (C59449zhJ.equals$default(abstractC8601bFm.W_(), "SKIP_EDIT", false, 2, null) && strX_.length() > 0) {
                    AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, strX_, null, null, null, null, null, 250, null);
                    return;
                } else {
                    AbstractC20169gbn.showHeaderReminder$default(this, "hide", null, null, null, null, null, null, null, 254, null);
                    return;
                }
            }
            AbstractC20169gbn.showHeaderReminder$default(this, "hide", null, null, null, null, null, null, null, 254, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9868bdh) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, ((C9868bdh) abstractC9832bcy2).AEQbTJ(), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9876bdp) {
            C9876bdp c9876bdp = (C9876bdp) abstractC9832bcy2;
            int i2 = c9876bdp.OLrzqt() ? C13754dXa.FragmentManager.MediaDescriptionCompat1 : C13754dXa.FragmentManager.setMediaId;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("approved_address", C14079deg.getAddressStr$default(C14079deg.EZpvd, c9876bdp.KWHzl(), false, 2, null));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c9876bdp.AEQbTJ())) {
                strAYXKKw2 = c9876bdp.AEQbTJ();
                Intrinsics.copydefault((java.lang.Object) strAYXKKw2);
            } else {
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIconUri);
            }
            pairArr[1] = C56390yDp.OLrzqt("approved_asset", strAYXKKw2);
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr)), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9825bcr) {
            T tEjfBZ4 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ4, "");
            final AbstractC8564bFB abstractC8564bFB = (AbstractC8564bFB) tEjfBZ4;
            C10854bwM feeCoinMeta = abstractC8564bFB.QKudOq().KWHzl().getFeeCoinMeta();
            int i3 = C13754dXa.FragmentManager.describeContents;
            AbstractC8426bCW abstractC8426bCWQKudOq = abstractC8564bFB.QKudOq();
            java.lang.String strOLrzqt = ((C9825bcr) abstractC9832bcy2).OLrzqt();
            AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCWQKudOq, strOLrzqt == null ? "" : strOLrzqt, false, false, false, 10, null)))), null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta.fJNWhG()))), new Function0() { // from class: o.ghC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20481ghh.OLrzqt(this.copydefault, abstractC8564bFB);
                }
            }, null, null, 204, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9826bcs) {
            T tEjfBZ5 = ejfBZ();
            if (tEjfBZ5 instanceof AbstractC8564bFB) {
                java.lang.String strCopydefault7 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", ((AbstractC8564bFB) tEjfBZ5).QKudOq().KWHzl().getFeeCoinMeta().fJNWhG())));
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C9826bcs) abstractC9832bcy2).KWHzl())) {
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                    Function0 function06 = new Function0() { // from class: o.ghE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.copydefault(abstractC9832bcy2, this);
                        }
                    };
                    str4 = strAYXKKw3;
                    function05 = function06;
                } else {
                    str4 = "";
                    function05 = null;
                }
                AbstractC20169gbn.showHeaderReminder$default(this, "highlight", str4, strCopydefault7, function05, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                return;
            }
            return;
        }
        boolean z2 = abstractC9832bcy2 instanceof C9786bcE;
        if (z2 || (abstractC9832bcy2 instanceof C9784bcC) || (abstractC9832bcy2 instanceof C9811bcd) || (abstractC9832bcy2 instanceof C9864bdd)) {
            final T tEjfBZ6 = ejfBZ();
            if (tEjfBZ6 instanceof AbstractC8564bFB) {
                AbstractC8564bFB abstractC8564bFB2 = (AbstractC8564bFB) tEjfBZ6;
                final C10854bwM c10854bwMAYXKKw = abstractC8564bFB2.QKudOq().AYXKKw();
                Function0 function07 = new Function0() { // from class: o.ghK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20481ghh.copydefault(this.copydefault, c10854bwMAYXKKw, tEjfBZ6);
                    }
                };
                if (tEjfBZ6 instanceof AbstractC8727bIF) {
                    final AbstractC8744bIW abstractC8744bIW = (AbstractC8744bIW) ((AbstractC8727bIF) tEjfBZ6).QKudOq();
                    final java.lang.String strFJNWhG2 = c10854bwMAYXKKw.fJNWhG();
                    AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG2))), C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG2))), new Function0() { // from class: o.ghI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.KWHzl(tEjfBZ6, this, abstractC8744bIW, strFJNWhG2, c10854bwMAYXKKw);
                        }
                    }, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                    return;
                }
                if (z2) {
                    if (tEjfBZ6 instanceof AbstractC8601bFm) {
                        AbstractC20169gbn.showHeaderReminder$default(this, "highlight", null, C33069mpW.copydefault(C13754dXa.FragmentManager.apLTlu, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwMAYXKKw.fJNWhG()))), null, C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), function07, C33069mpW.copydefault(C13754dXa.FragmentManager.iMXFZQ, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", c10854bwMAYXKKw.fJNWhG()))), new Function0() { // from class: o.ghH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return AbstractC20481ghh.AEQbTJ(this.OLrzqt, tEjfBZ6, c10854bwMAYXKKw, abstractC9832bcy2);
                            }
                        }, 10, null);
                        return;
                    }
                    return;
                }
                if (abstractC9832bcy2 instanceof C9784bcC) {
                    java.lang.String strFJNWhG3 = abstractC8564bFB2.QKudOq().KWHzl().getFeeCoinMeta().fJNWhG();
                    C9784bcC c9784bcC = (C9784bcC) abstractC9832bcy2;
                    java.lang.String strCopydefault8 = c9784bcC.copydefault();
                    if (strCopydefault8 != null && strCopydefault8.length() != 0) {
                        strCopydefault3 = c9784bcC.copydefault();
                    } else {
                        strCopydefault3 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG3)));
                    }
                    AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), strCopydefault3, function07, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                    return;
                }
                C8486bDd c8486bDdKWHzl = abstractC8564bFB2.QKudOq().KWHzl();
                java.lang.String strFJNWhG4 = c8486bDdKWHzl.getFeeCoinMeta().fJNWhG();
                if (!(c8486bDdKWHzl instanceof C9215bRQ)) {
                    strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG4)));
                } else if ((tEjfBZ6 instanceof AbstractC8704bHj) && ((AbstractC8704bHj) tEjfBZ6).heceqZ()) {
                    strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG4)));
                } else {
                    strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG4)));
                }
                AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMAYXKKw.fJNWhG()))), strCopydefault2, function07, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                return;
            }
            return;
        }
        if (abstractC9832bcy2 instanceof C9753bbY) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", C33070mpX.AYXKKw(C13754dXa.FragmentManager.QsIRgs), null, null, null, null, null, null, 252, null);
            return;
        }
        if ((abstractC9832bcy2 instanceof C9813bcf) || (abstractC9832bcy2 instanceof C9822bco)) {
            T tEjfBZ7 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ7, "");
            AbstractC8664bGw abstractC8664bGw = (AbstractC8664bGw) tEjfBZ7;
            java.lang.String strAEQbTJ2 = C14731dqw.AEQbTJ.AEQbTJ(abstractC8664bGw.fHqPtx().fJNWhG(), 12);
            C9785bcD c9785bcD = (C9785bcD) abstractC9832bcy2;
            if (c9785bcD instanceof C9813bcf) {
                strCopydefault = ((C9813bcf) abstractC9832bcy2).copydefault();
            } else if (c9785bcD instanceof C9822bco) {
                strCopydefault = ((C9822bco) abstractC9832bcy2).copydefault();
            }
            java.lang.String toFeeCoinAmount$default = strCopydefault;
            if (!(abstractC8664bGw instanceof C12319ckh)) {
                toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8664bGw.QKudOq(), toFeeCoinAmount$default, false, false, false, 10, null);
            }
            AbstractC20169gbn.showHeaderReminder$default(this, "block", C33069mpW.copydefault(C13754dXa.FragmentManager.dispatchKeyShortcutEvent, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, toFeeCoinAmount$default), C56390yDp.OLrzqt("currency", strAEQbTJ2))), null, null, null, null, null, null, 252, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9787bcF) {
            T tEjfBZ8 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ8, "");
            AbstractC20169gbn.showHeaderReminder$default(this, "block", C33069mpW.copydefault(C13754dXa.FragmentManager.IntentSenderRequestBuilder, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9787bcF) abstractC9832bcy2).copydefault()), C56390yDp.OLrzqt("currency", ((AbstractC8664bGw) tEjfBZ8).fHqPtx().fJNWhG()))), null, null, null, null, null, null, 252, null);
            return;
        }
        if ((abstractC9832bcy2 instanceof C9828bcu) || (abstractC9832bcy2 instanceof C9829bcv)) {
            C9785bcD c9785bcD2 = (C9785bcD) abstractC9832bcy2;
            if (c9785bcD2 instanceof C9828bcu) {
                strAEQbTJ = ((C9828bcu) abstractC9832bcy2).KWHzl();
            } else {
                strAEQbTJ = c9785bcD2 instanceof C9829bcv ? ((C9829bcv) abstractC9832bcy2).AEQbTJ() : "";
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                function0 = new Function0() { // from class: o.ghJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20481ghh.OLrzqt(strAEQbTJ, this);
                    }
                };
                str = strAYXKKw4;
            } else {
                str = "";
                function0 = null;
            }
            AbstractC20169gbn.showHeaderReminder$default(this, "highlight", str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQYQgr), function0, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
            return;
        }
        boolean z3 = abstractC9832bcy2 instanceof C9808bca;
        if (z3 || (abstractC9832bcy2 instanceof C9754bbZ)) {
            final T tEjfBZ9 = ejfBZ();
            if (tEjfBZ9 instanceof AbstractC8564bFB) {
                C8486bDd c8486bDdKWHzl2 = ((AbstractC8564bFB) tEjfBZ9).QKudOq().KWHzl();
                java.lang.String strFJNWhG5 = c8486bDdKWHzl2.getFeeCoinMeta().fJNWhG();
                if (tEjfBZ9 instanceof AbstractC8664bGw) {
                    AbstractC8664bGw abstractC8664bGw2 = (AbstractC8664bGw) tEjfBZ9;
                    strAYXKKw = C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", abstractC8664bGw2.fHqPtx().fJNWhG())));
                    if (z3) {
                        strCopydefault4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE);
                    } else if (!(c8486bDdKWHzl2 instanceof C9215bRQ)) {
                        strCopydefault4 = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG5)));
                    } else if (abstractC8664bGw2.heceqZ()) {
                        strCopydefault4 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG5)));
                    } else {
                        strCopydefault4 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG5)));
                    }
                    function02 = new Function0() { // from class: o.ghL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.copydefault(tEjfBZ9, this);
                        }
                    };
                } else {
                    if (tEjfBZ9 instanceof AbstractC8727bIF) {
                        java.lang.String strCopydefault9 = C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ((CeDefiTransferSignData) ((AbstractC8727bIF) tEjfBZ9).QVsKAR()).getSymbol())));
                        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE);
                        function03 = new Function0() { // from class: o.ghM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return AbstractC20481ghh.AhwBna(tEjfBZ9, this);
                            }
                        };
                        str2 = strAYXKKw5;
                        str3 = strCopydefault9;
                        AbstractC20169gbn.showHeaderReminder$default(this, "highlight", str3, str2, function03, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                        return;
                    }
                    strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ggKfIT);
                    if (z3) {
                        strCopydefault4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE);
                    } else if (!(c8486bDdKWHzl2 instanceof C9215bRQ)) {
                        strCopydefault4 = C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG5)));
                    } else {
                        strCopydefault4 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG5)));
                    }
                    function02 = new Function0() { // from class: o.ghN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.AYXKKw(tEjfBZ9, this);
                        }
                    };
                }
                function03 = function02;
                str3 = strAYXKKw;
                str2 = strCopydefault4;
                AbstractC20169gbn.showHeaderReminder$default(this, "highlight", str3, str2, function03, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                return;
            }
            return;
        }
        if (abstractC9832bcy2 instanceof C9879bds) {
            int i4 = C13754dXa.FragmentManager.reopenMenu;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            T tEjfBZ10 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz = tEjfBZ10 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ10 : null;
            java.lang.String strOLrzqt2 = interfaceC9462bVz != null ? interfaceC9462bVz.OLrzqt(true, false) : null;
            if (strOLrzqt2 == null) {
                strOLrzqt2 = "";
            }
            pairArr2[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strOLrzqt2);
            T tEjfBZ11 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz2 = tEjfBZ11 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ11 : null;
            if (interfaceC9462bVz2 != null && (c10854bwMDHguZz2 = interfaceC9462bVz2.dHguZz()) != null) {
                strFJNWhG = c10854bwMDHguZz2.fJNWhG();
            }
            pairArr2[1] = C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "");
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33069mpW.copydefault(i4, C56424yEw.gEmmrt(pairArr2)), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9878bdr) {
            int i5 = C13754dXa.FragmentManager.onKeyDownPanel;
            kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
            T tEjfBZ12 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz3 = tEjfBZ12 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ12 : null;
            java.lang.String strCopydefault10 = interfaceC9462bVz3 != null ? interfaceC9462bVz3.copydefault(true, false) : null;
            if (strCopydefault10 == null) {
                strCopydefault10 = "";
            }
            pairArr3[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strCopydefault10);
            T tEjfBZ13 = ejfBZ();
            InterfaceC9462bVz interfaceC9462bVz4 = tEjfBZ13 instanceof InterfaceC9462bVz ? (InterfaceC9462bVz) tEjfBZ13 : null;
            if (interfaceC9462bVz4 != null && (c10854bwMDHguZz = interfaceC9462bVz4.dHguZz()) != null) {
                strFJNWhG = c10854bwMDHguZz.fJNWhG();
            }
            pairArr3[1] = C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "");
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairArr3)), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9865bde) {
            T tEjfBZ14 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ14, "");
            final AbstractC8664bGw abstractC8664bGw3 = (AbstractC8664bGw) tEjfBZ14;
            AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", abstractC8664bGw3.QKudOq().AYXKKw().fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.AppCompatDelegateImplAppCompatWindowCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ((C9865bde) abstractC9832bcy2).KWHzl()))), new Function0() { // from class: o.ghz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20481ghh.OLrzqt(abstractC8664bGw3, this);
                }
            }, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9881bdu) {
            AbstractC20169gbn.showHeaderReminder$default(this, "hide", null, null, null, null, null, null, null, 254, null);
            DTwDnp();
            return;
        }
        if (abstractC9832bcy2 instanceof C9802bcU) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onBackPressedDispatcherlambda1), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9885bdy) {
            T tEjfBZ15 = ejfBZ();
            Intrinsics.copydefault(tEjfBZ15, "");
            final AbstractC8664bGw abstractC8664bGw4 = (AbstractC8664bGw) tEjfBZ15;
            final C10854bwM feeCoinMeta2 = abstractC8664bGw4.QKudOq().KWHzl().getFeeCoinMeta();
            AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta2.fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.setSupportProgressBarVisibility, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9885bdy) abstractC9832bcy2).OLrzqt()))), new Function0() { // from class: o.ghy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20481ghh.EZpvd(this.AEQbTJ, feeCoinMeta2, abstractC8664bGw4);
                }
            }, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9880bdt) {
            final T tEjfBZ16 = ejfBZ();
            if ((tEjfBZ16 instanceof AbstractC8564bFB) && (tEjfBZ16 instanceof InterfaceC9462bVz)) {
                AbstractC8564bFB abstractC8564bFB3 = (AbstractC8564bFB) tEjfBZ16;
                AbstractC20169gbn.showHeaderReminder$default(this, "highlight", C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", abstractC8564bFB3.QKudOq().AYXKKw().fJNWhG()))), C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelMenu, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", abstractC8564bFB3.dHguZz().fJNWhG()), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C54870xYj.KWHzl(C54862xYb.convertToBigIntegerString$default(((InterfaceC9462bVz) tEjfBZ16).EZpvd(abstractC8564bFB3.QKudOq().KWHzl().getFeeAmount()), false, (RoundingMode) null, 3, (java.lang.Object) null), abstractC8564bFB3.dHguZz().valueOf(), abstractC8564bFB3.dHguZz().fZBcTu(), null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)))), new Function0() { // from class: o.ghA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20481ghh.valueOf(tEjfBZ16, this);
                    }
                }, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                return;
            }
            return;
        }
        if (abstractC9832bcy2 instanceof C9838bdD) {
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, ((C9838bdD) abstractC9832bcy2).copydefault(), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9882bdv) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStub), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9886bdz) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setVolumeTo), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9867bdg) {
            final T tEjfBZ17 = ejfBZ();
            if (tEjfBZ17 instanceof AbstractC8564bFB) {
                final C10854bwM feeCoinMeta3 = ((AbstractC8564bFB) tEjfBZ17).QKudOq().KWHzl().getFeeCoinMeta();
                if (tEjfBZ17 instanceof C9443bVg) {
                    strCopydefault5 = C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta3.fJNWhG())));
                    strCopydefault6 = C33069mpW.copydefault(C13754dXa.FragmentManager.onAttachedFromWindow, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ((C9443bVg) tEjfBZ17).OLrzqt(true))));
                    function04 = new Function0() { // from class: o.ghF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.EZpvd(this.OLrzqt, feeCoinMeta3, tEjfBZ17);
                        }
                    };
                } else {
                    strCopydefault5 = C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesImplApi21Parcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", feeCoinMeta3.fJNWhG())));
                    strCopydefault6 = C33069mpW.copydefault(C13754dXa.FragmentManager.invokespecialODCBUN, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", feeCoinMeta3.fJNWhG())));
                    function04 = new Function0() { // from class: o.ghB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20481ghh.gEmmrt(this.copydefault, feeCoinMeta3, tEjfBZ17);
                        }
                    };
                }
                AbstractC20169gbn.showHeaderReminder$default(this, "highlight", strCopydefault5, strCopydefault6, function04, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                return;
            }
            return;
        }
        if (abstractC9832bcy2 instanceof C9782bcA) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi24Callback), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9783bcB) {
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCloseMenu), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9798bcQ) {
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateResourcesConfigurationForNightMode), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9810bcc) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.InterpolatorRes), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9809bcb) {
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoBatteryNightModeManager), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9837bdC) {
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9835bdA) {
            C9835bdA c9835bdA = (C9835bdA) abstractC9832bcy2;
            if (c9835bdA.copydefault().EZpvd()) {
                C9701baZ c9701baZOLrzqt = c9835bdA.copydefault().OLrzqt();
                java.lang.String strCopydefault11 = c9701baZOLrzqt != null ? c9701baZOLrzqt.copydefault() : null;
                if (strCopydefault11 == null || strCopydefault11.length() == 0) {
                    return;
                }
                AbstractC20169gbn.showHeaderReminder$default(this, "normal", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setExtras), C33069mpW.copydefault(C13754dXa.FragmentManager.createSubDecor, C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountAddress", C14079deg.getAddressStr$default(C14079deg.EZpvd, strCopydefault11, false, 2, null)))), new Function0() { // from class: o.ghD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20481ghh.AYXKKw(this.KWHzl);
                    }
                }, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                return;
            }
            AbstractC20169gbn.showHeaderReminder$default(this, "hide", null, null, null, null, null, null, null, 254, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9818bck) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, ((C9818bck) abstractC9832bcy2).OLrzqt(), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9872bdl) {
            AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, ((C9872bdl) abstractC9832bcy2).copydefault(), null, null, null, null, null, 250, null);
            return;
        }
        if (abstractC9832bcy2 instanceof C9884bdx) {
            AbstractC20169gbn.showHeaderReminder$default(this, "block", null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.startSupportActionModeFromWindow), null, null, null, null, null, 250, null);
            return;
        }
        if ((abstractC9832bcy2 instanceof C9827bct) && ejfBZ().aUsmxb() == OKWBaseTransaction.TransactionType.DappTransfer) {
            C9827bct c9827bct = (C9827bct) abstractC9832bcy2;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c9827bct.KWHzl())) {
                AbstractC20169gbn.showHeaderReminder$default(this, "normal", null, c9827bct.KWHzl(), null, null, null, null, null, 250, null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    public static final Unit valueOf(final AbstractC20481ghh abstractC20481ghh) {
        java.lang.String strOLrzqt;
        ?? EjfBZ = abstractC20481ghh.ejfBZ();
        boolean z = EjfBZ instanceof AbstractC8601bFm;
        if (!z && !(EjfBZ instanceof AbstractC8610bFv) && !(EjfBZ instanceof AbstractC8664bGw)) {
            return Unit.INSTANCE;
        }
        C10854bwM c10854bwMDHguZz = EjfBZ.dHguZz();
        long jAEQbTJ = c10854bwMDHguZz.AEQbTJ();
        if (z) {
            strOLrzqt = ((AbstractC8601bFm) EjfBZ).zLjUOn();
        } else {
            strOLrzqt = c10854bwMDHguZz.OLrzqt();
        }
        java.lang.String strHtlTjW = EjfBZ.htlTjW();
        eUI euiQfsBiF = abstractC20481ghh.QfsBiF();
        euiQfsBiF.EZpvd(jAEQbTJ, strHtlTjW, strOLrzqt, 2, EjfBZ.dUDNAs().USBtdM(), EjfBZ.dUDNAs().DbNXlk(), new Function0() { // from class: o.ghs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20481ghh.gEmmrt(this.OLrzqt);
            }
        }, EjfBZ.dUDNAs().aUsmxb());
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractC20481ghh abstractC20481ghh) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.content.Context context = abstractC20481ghh.getContext();
        Intrinsics.copydefault(context, "");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzKWHzl = activity.KWHzl((android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegate));
            c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.gib
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20481ghh.OLrzqt(c55284xgzKWHzl, view);
                }
            });
        }
        android.view.View viewAkhnZx = c55284xgzKWHzl != null ? c55284xgzKWHzl.AkhnZx() : null;
        if (viewAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams = viewAkhnZx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C55298xhM.dpInt$default(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, (android.content.Context) null, 1, (java.lang.Object) null));
            viewAkhnZx.setLayoutParams(marginLayoutParams);
        }
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public static final Unit OLrzqt(AbstractC20481ghh abstractC20481ghh, AbstractC8564bFB abstractC8564bFB) throws CoinMetaError {
        abstractC20481ghh.gHZMYf();
        C10854bwM c10854bwMAYXKKw = abstractC8564bFB.QKudOq().AYXKKw();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMAYXKKw.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMAYXKKw.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, abstractC8564bFB.fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC9832bcy abstractC9832bcy, AbstractC20481ghh abstractC20481ghh) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", ((C9826bcs) abstractC9832bcy).KWHzl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = abstractC20481ghh.getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final AbstractC20481ghh abstractC20481ghh, C10854bwM c10854bwM, OKWBaseTransaction oKWBaseTransaction) {
        abstractC20481ghh.gHZMYf();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        interfaceC54829xWw.EZpvd(abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8564bFB) oKWBaseTransaction).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), C13754dXa.LoaderManager.AuCTel, new Function1() { // from class: o.ghm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.copydefault(this.AEQbTJ, (WalletRechargeResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC20481ghh abstractC20481ghh, WalletRechargeResult walletRechargeResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        if (walletRechargeResult.isSubmit() && (activity = abstractC20481ghh.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(OKWBaseTransaction oKWBaseTransaction, AbstractC20481ghh abstractC20481ghh, AbstractC8744bIW abstractC8744bIW, java.lang.String str, C10854bwM c10854bwM) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        AbstractC8727bIF abstractC8727bIF = (AbstractC8727bIF) oKWBaseTransaction;
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) abstractC8727bIF.QVsKAR();
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.OLrzqt(!abstractC8744bIW.DbNXlk(), abstractC8727bIF.dHguZz().fetchVPNInfo(), ceDefiTransferSignData.getFromAddress(), ceDefiTransferSignData.getTokenAddress(), str, c10854bwM.DbNXlk()));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(abstractC20481ghh.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final AbstractC20481ghh abstractC20481ghh, final OKWBaseTransaction oKWBaseTransaction, final C10854bwM c10854bwM, final AbstractC9832bcy abstractC9832bcy) {
        abstractC20481ghh.showLoading();
        InterfaceC58217yxC interfaceC58217yxC = abstractC20481ghh.getFieldNames;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtEZpvd = ((AbstractC8601bFm) oKWBaseTransaction).aj_().EZpvd(new ReserveBean(c10854bwM.AuCTel(), c10854bwM.OLrzqt(), ((C9786bcE) abstractC9832bcy).OLrzqt(), c10854bwM.valueOf()));
        LifecycleOwner viewLifecycleOwner = abstractC20481ghh.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtEZpvd, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.OLrzqt(this.EZpvd, oKWBaseTransaction, abstractC9832bcy, c10854bwM, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20481ghh.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ghp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.copydefault(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC20481ghh.getFieldNames = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ghn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20481ghh.ejfBZ(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [o.bCW] */
    public static final Unit OLrzqt(AbstractC20481ghh abstractC20481ghh, OKWBaseTransaction oKWBaseTransaction, AbstractC9832bcy abstractC9832bcy, C10854bwM c10854bwM, kotlin.Pair pair) {
        abstractC20481ghh.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            abstractC20481ghh.AwvSrB();
            FragmentActivity activity = abstractC20481ghh.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
            c55097xdX.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.DtnWsU, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", AbstractC8426bCW.formatToFeeCoinAmount$default(((AbstractC8601bFm) oKWBaseTransaction).QKudOq(), ((C9786bcE) abstractC9832bcy).AEQbTJ(), false, false, false, 10, null)), C56390yDp.OLrzqt("symbol", c10854bwM.fJNWhG()))));
            c55097xdX.setState(2);
            c55097xdX.setType(1);
            c55097xdX.setCloseBtnShow(false);
            c55097xdX.setMessage(null);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        } else {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC20481ghh abstractC20481ghh, java.lang.Throwable th) {
        if (abstractC20481ghh.getViewLifecycleOwner().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        abstractC20481ghh.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("OKWBaseTransactionModularizationFragment", th);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, AbstractC20481ghh abstractC20481ghh) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = abstractC20481ghh.getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(OKWBaseTransaction oKWBaseTransaction, AbstractC20481ghh abstractC20481ghh) {
        AbstractC8664bGw abstractC8664bGw = (AbstractC8664bGw) oKWBaseTransaction;
        C10854bwM c10854bwMFHqPtx = abstractC8664bGw.fHqPtx();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMFHqPtx.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, abstractC8664bGw.fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(OKWBaseTransaction oKWBaseTransaction, AbstractC20481ghh abstractC20481ghh) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        AbstractC8727bIF abstractC8727bIF = (AbstractC8727bIF) oKWBaseTransaction;
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) abstractC8727bIF.QVsKAR();
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.OLrzqt(ceDefiTransferSignData.isToken(), abstractC8727bIF.dHguZz().fetchVPNInfo(), ceDefiTransferSignData.getFromAddress(), ceDefiTransferSignData.getTokenAddress(), ceDefiTransferSignData.getSymbol(), ceDefiTransferSignData.getImgUrl()));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(abstractC20481ghh.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(OKWBaseTransaction oKWBaseTransaction, AbstractC20481ghh abstractC20481ghh) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        AbstractC8564bFB abstractC8564bFB = (AbstractC8564bFB) oKWBaseTransaction;
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(abstractC8564bFB.dUDNAs().DbNXlk(), java.lang.String.valueOf(abstractC8564bFB.dHguZz().AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(abstractC20481ghh.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC8664bGw abstractC8664bGw, AbstractC20481ghh abstractC20481ghh) {
        C10854bwM c10854bwMFHqPtx = abstractC8664bGw.fHqPtx();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwMFHqPtx.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, abstractC8664bGw.fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC20481ghh abstractC20481ghh, C10854bwM c10854bwM, AbstractC8664bGw abstractC8664bGw) {
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, abstractC8664bGw.fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(OKWBaseTransaction oKWBaseTransaction, AbstractC20481ghh abstractC20481ghh) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        AbstractC8564bFB abstractC8564bFB = (AbstractC8564bFB) oKWBaseTransaction;
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.copydefault(abstractC8564bFB.dUDNAs().DbNXlk(), java.lang.String.valueOf(abstractC8564bFB.dHguZz().AhwBna()), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(abstractC20481ghh.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC20481ghh abstractC20481ghh, C10854bwM c10854bwM, OKWBaseTransaction oKWBaseTransaction) {
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "balance", yDY.copydefault("gas_station"), (java.util.ArrayList) null, false, (java.lang.String) null, ((C9443bVg) oKWBaseTransaction).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(final AbstractC20481ghh abstractC20481ghh, C10854bwM c10854bwM, OKWBaseTransaction oKWBaseTransaction) {
        abstractC20481ghh.gHZMYf();
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
        FragmentActivity activity = abstractC20481ghh.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        interfaceC54829xWw.EZpvd(abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())), C33129mqd.gEmmrt(c10854bwM.OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, ((AbstractC8564bFB) oKWBaseTransaction).fERRXa().getAddressType(), 224, (DefaultConstructorMarker) null), C13754dXa.LoaderManager.AuCTel, new Function1() { // from class: o.gij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.OLrzqt(this.AEQbTJ, (WalletRechargeResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC20481ghh abstractC20481ghh, WalletRechargeResult walletRechargeResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        if (walletRechargeResult.isSubmit() && (activity = abstractC20481ghh.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(AbstractC20481ghh abstractC20481ghh) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity activity = abstractC20481ghh.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDescription)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF
    public void getFieldNames() {
        C9758bbd c9758bbdCopydefault;
        C9701baZ c9701baZOLrzqt;
        C9835bdA c9835bdA = (C9835bdA) ejfBZ().UlJrfe().KWHzl(C56524yIo.AEQbTJ(C9835bdA.class));
        java.lang.String strCopydefault = (c9835bdA == null || (c9758bbdCopydefault = c9835bdA.copydefault()) == null || (c9701baZOLrzqt = c9758bbdCopydefault.OLrzqt()) == null) ? null : c9701baZOLrzqt.copydefault();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AnimRes), C33069mpW.copydefault(C13754dXa.FragmentManager.fromParcel, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, strCopydefault, false, 2, null)))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaVisualMediaType), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaImageOnly), 2, null));
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            defiWalletVReminderDFragmentEZpvd.AEQbTJ(childFragmentManager, new Function1() { // from class: o.ghx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20481ghh.EZpvd(this.EZpvd, (java.lang.Integer) obj);
                }
            });
            return;
        }
        T tEjfBZ = ejfBZ();
        if (tEjfBZ instanceof C12152chZ) {
            if (((C12152chZ) tEjfBZ).djBIcL()) {
                DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd2 = DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fqaWRL), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZpNRhN), C33070mpX.AYXKKw(C13754dXa.FragmentManager.QAQCdZ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), 2, null));
                androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                defiWalletVReminderDFragmentEZpvd2.AEQbTJ(parentFragmentManager, new Function1() { // from class: o.ghG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC20481ghh.copydefault(this.EZpvd, (java.lang.Integer) obj);
                    }
                });
                return;
            }
            super.getFieldNames();
            return;
        }
        if (tEjfBZ instanceof AbstractC8610bFv) {
            MessageSignData messageSignData = (MessageSignData) ((AbstractC8610bFv) tEjfBZ).QVsKAR();
            if ((messageSignData instanceof EVMMessageSignData) && Intrinsics.EZpvd((java.lang.Object) ((EVMMessageSignData) messageSignData).getMethod(), (java.lang.Object) "eth_sign")) {
                C32866mlf.onEvent$default("security_event_eth_sign", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
            super.getFieldNames();
            return;
        }
        super.getFieldNames();
    }

    public static final Unit EZpvd(AbstractC20481ghh abstractC20481ghh, java.lang.Integer num) {
        if (num != null && num.intValue() == 2) {
            super.getFieldNames();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC20481ghh abstractC20481ghh, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            super.getFieldNames();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull final C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        Function0<Unit> function0 = this.getNewProxyInstance;
        if (function0 != null) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        T tEjfBZ = ejfBZ();
        if (tEjfBZ instanceof AbstractC8601bFm) {
            KWHzl(c9748bbT.gEmmrt());
            AEQbTJ(c9748bbT);
            return;
        }
        if (tEjfBZ instanceof AbstractC8664bGw) {
            T tEjfBZ2 = ejfBZ();
            if (tEjfBZ2 instanceof C12149chW) {
                AEQbTJ(c9748bbT);
                return;
            }
            if (tEjfBZ2 instanceof C12266cjh) {
                C20690gle.OLrzqt.copydefault(true);
                AEQbTJ(c9748bbT.KWHzl(), true);
                KWHzl(new Function0() { // from class: o.ght
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20481ghh.KWHzl(this.copydefault, c9748bbT);
                    }
                });
                return;
            } else {
                C20690gle.OLrzqt.copydefault(true);
                AEQbTJ(c9748bbT.KWHzl(), false);
                KWHzl(new Function0() { // from class: o.ghr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20481ghh.copydefault(this.EZpvd, c9748bbT);
                    }
                });
                return;
            }
        }
        if (tEjfBZ instanceof AbstractC8610bFv) {
            java.lang.String strAEQbTJ = c9748bbT.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String strKWHzl = c9748bbT.KWHzl();
            OLrzqt(strAEQbTJ, strKWHzl != null ? strKWHzl : "", ejfBZ().fERRXa().getPublicKey());
            return;
        }
        if (tEjfBZ instanceof AbstractC8727bIF) {
            C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.QOjuYg, 0, 1, (java.lang.Object) null);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public static final Unit KWHzl(AbstractC20481ghh abstractC20481ghh, C9748bbT c9748bbT) {
        FragmentActivity activity = abstractC20481ghh.getActivity();
        if (activity != null) {
            android.content.Intent intentPutExtra = new android.content.Intent().putExtra("send_coin_status", true);
            java.lang.String strKWHzl = c9748bbT.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            activity.setResult(-1, intentPutExtra.putExtra("tx_hash", strKWHzl));
        }
        FragmentActivity activity2 = abstractC20481ghh.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC20481ghh abstractC20481ghh, C9748bbT c9748bbT) {
        abstractC20481ghh.AEQbTJ(c9748bbT);
        return Unit.INSTANCE;
    }

    private final void KWHzl(final java.lang.String str) {
        int iQwvEab = ejfBZ().QwvEab();
        if (iQwvEab == 3) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_trade_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ghO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20481ghh.EZpvd(str, (EventParamsList) obj);
                }
            });
        } else if (iQwvEab == 4) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_NFT_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ghP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20481ghh.KWHzl(str, (EventParamsList) obj);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_metax_wallet_contractinteract_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ghU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20481ghh.djBIcL(str, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("tx_id", str, false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str, final boolean z) {
        T tEjfBZ = ejfBZ();
        Intrinsics.copydefault(tEjfBZ, "");
        final AbstractC8664bGw abstractC8664bGw = (AbstractC8664bGw) tEjfBZ;
        C32866mlf.onEvent$default("Web3SendCoin_SendResult_Api_Status", (TrackChannel[]) null, new Function1() { // from class: o.ghq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.copydefault(str, abstractC8664bGw, z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, AbstractC8664bGw abstractC8664bGw, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str == null) {
            str = "";
        }
        eventParamsList.put("hash", str, false);
        eventParamsList.put("network", abstractC8664bGw.dHguZz().fJNWhG(), false);
        if (!z) {
            eventParamsList.put("to_address", abstractC8664bGw.an_(), false);
            eventParamsList.put("from_address", abstractC8664bGw.spnCvw(), false);
            eventParamsList.put("token_symbol", abstractC8664bGw.fHqPtx().fJNWhG(), false);
            eventParamsList.put("token_contract_address", abstractC8664bGw.fHqPtx().OLrzqt(), false);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("result", -1);
        bundle.putString("data", c9748bbT.KWHzl());
        bundle.putString("tx_id", c9748bbT.gEmmrt());
        bundle.putString("tx_hash", c9748bbT.KWHzl());
        bundle.putString(BindConst.TELEGRAM_RESULT_KEY, c9748bbT.AEQbTJ());
        if (ejfBZ().dUDNAs().getFieldNames()) {
            bundle.putString("tx_uop_hash", c9748bbT.KWHzl());
        }
        bundle.putString("tx_sign", c9748bbT.OLrzqt());
        bundle.putBoolean("tx_isbatch", Intrinsics.EZpvd(c9748bbT.AYXKKw(), java.lang.Boolean.TRUE));
        bundle.putBoolean("send_coin_status", true);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new android.content.Intent().putExtras(bundle));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    private final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("result", -1);
        bundle.putString("data", str);
        bundle.putString("tx_hash", str2);
        bundle.putString("publicKey", str3);
        bundle.putBoolean("is_reject_sign", false);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new android.content.Intent().putExtras(bundle));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    private final void KWHzl(final Function0<Unit> function0) {
        java.lang.String string;
        T tEjfBZ = ejfBZ();
        Intrinsics.copydefault(tEjfBZ, "");
        AbstractC8664bGw abstractC8664bGw = (AbstractC8664bGw) tEjfBZ;
        SendCoinRecordEntity sendCoinRecordEntity = new SendCoinRecordEntity(null, null, null, null, null, 0L, 0, 127, null);
        C10854bwM c10854bwMFHqPtx = abstractC8664bGw.fHqPtx();
        java.lang.String strZLjUOn = abstractC8664bGw.zLjUOn();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ens_domain")) == null) {
            string = "";
        }
        if (string.length() > 0 && StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            sendCoinRecordEntity.setAddress(string);
        } else {
            C10854bwM c10854bwMKWHzl = c10854bwMFHqPtx.KWHzl();
            sendCoinRecordEntity.setAddress((c10854bwMKWHzl == null || !c10854bwMKWHzl.DGgnkA()) ? strZLjUOn : abstractC8664bGw.an_());
        }
        sendCoinRecordEntity.setChainId(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMFHqPtx.AhwBna())));
        sendCoinRecordEntity.setWalletId(abstractC8664bGw.dUDNAs().DbNXlk());
        sendCoinRecordEntity.setChainName(c10854bwMFHqPtx.djBIcL());
        java.util.List<C13853daS> listAEQbTJ = C13847daM.Companion.AEQbTJ(strZLjUOn);
        if (listAEQbTJ.isEmpty()) {
            sendCoinRecordEntity.setChainUrl(c10854bwMFHqPtx.copydefault());
        } else {
            for (C13853daS c13853daS : listAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) c13853daS.copydefault().djBIcL(), (java.lang.Object) sendCoinRecordEntity.getChainName())) {
                    sendCoinRecordEntity.setChainUrl(c13853daS.copydefault().copydefault());
                }
            }
        }
        sendCoinRecordEntity.setCreateTime(java.lang.System.currentTimeMillis());
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("is_smart_account")) {
            sendCoinRecordEntity.setSmartContract();
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = cGL.KWHzl.KWHzl(sendCoinRecordEntity);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtKWHzl, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.ghV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.copydefault(function0, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ghX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20481ghh.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ghZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20481ghh.OLrzqt(function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ghW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20481ghh.fetchVPNInfo(function12, obj);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0, java.lang.Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0, java.lang.Long l) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentActivity activity;
        C33537myN c33537myN;
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.getFieldNames;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (!this.hDKMBd || (activity = getActivity()) == null || (c33537myN = (C33537myN) activity.findViewById(C13754dXa.ActionBar.accept)) == null) {
            return;
        }
        c33537myN.setTitle(" ");
    }

    public static final Unit KWHzl(AbstractC20481ghh abstractC20481ghh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            abstractC20481ghh.KWHzl(abstractC20481ghh.isConnected(), (BaseModel<?>) it.next());
        }
        return Unit.INSTANCE;
    }
}
