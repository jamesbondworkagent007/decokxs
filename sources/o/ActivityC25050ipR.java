package o;

import android.view.View;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CallData;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.JitoData;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.uilab.util.TipTool;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;

/* JADX INFO: renamed from: o.ipR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC25050ipR extends AbstractActivityC25051ipS {
    public android.view.View AhwBna;
    public android.widget.FrameLayout djBIcL;
    public final InterfaceC56387yDm isConnected;
    public C33537myN valueOf;
    public InterfaceC25054ipV values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm AkhnZx = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null);
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.iqh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC25050ipR.valueOf(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.iql
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC25050ipR.AhwBna(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.iqn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC25050ipR.gEmmrt(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.ipR$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.ipR$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.INQUIRY_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.ipR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ipR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public ActivityC25050ipR() {
        final Function0 function0 = null;
        this.isConnected = new ViewModelLazy(C56524yIo.AEQbTJ(C22971hpS.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final java.lang.String DbNXlk() {
        return (java.lang.String) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionBean values() {
        return (TransactionBean) this.fetchVPNInfo.getValue();
    }

    public static final TransactionBean valueOf(ActivityC25050ipR activityC25050ipR) {
        TransactionBean transactionBean;
        android.content.Intent intent = activityC25050ipR.getIntent();
        return (intent == null || (transactionBean = (TransactionBean) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "data", TransactionBean.class))) == null) ? new TransactionBean((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, new QuotePriceRes((java.util.List) null, (java.util.List) null, (java.lang.String) null, (CommonDexInfo) null, false, false, false, (java.lang.String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TransactionType) null, (OrderIdTypeData) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, false, false, 0L, (java.lang.String) null, (TransactionBean.SwapType) null, (MergeCallData) null, (ServiceFeeInfo) null, (SlippageMode) null, (java.lang.String) null, (SlippageFeeType) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AccountInfo) null, (PresetRouteType) null, (TeeSaStatus) null, false, -33, 0, (DefaultConstructorMarker) null) : transactionBean;
    }

    /* JADX DEBUG: Possible override for method o.ipS.valueOf()V */
    public final boolean valueOf() {
        return ((java.lang.Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public static final boolean AhwBna(ActivityC25050ipR activityC25050ipR) {
        return activityC25050ipR.getIntent().getBooleanExtra("swap_type", true);
    }

    public final C22971hpS AYXKKw() {
        return (C22971hpS) this.isConnected.getValue();
    }

    public static final C55173xeu gEmmrt(ActivityC25050ipR activityC25050ipR) {
        return (C55173xeu) activityC25050ipR.findViewById(C23274hvD.Application.sZqaRl);
    }

    public final C55173xeu gEmmrt() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55173xeu) value;
    }

    @Override // o.AbstractActivityC25051ipS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23274hvD.Activity.idLUrz);
        AkhnZx();
        isConnected();
    }

    private final void isConnected() {
        DeFiPlatformForSwap selectedDeFiPlatform;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        DeFiPlatformForSwap selectedDeFiPlatform2;
        final InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(DbNXlk()).fARcdN().AEQbTJ();
        if (values().getQuotePriceRes() != null) {
            QuotePriceRes quotePriceRes = values().getQuotePriceRes();
            java.lang.String chainId = null;
            if (((quotePriceRes == null || (selectedDeFiPlatform2 = quotePriceRes.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform2.getPermit2Data()) != null) {
                QuotePriceRes quotePriceRes2 = values().getQuotePriceRes();
                if (quotePriceRes2 == null || (selectedDeFiPlatform = quotePriceRes2.getSelectedDeFiPlatform()) == null) {
                    return;
                }
                java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                QuotePriceRes quotePriceRes3 = values().getQuotePriceRes();
                if (quotePriceRes3 != null && (dexMultiTokenInfoBeanFromToken = quotePriceRes3.fromToken()) != null) {
                    chainId = dexMultiTokenInfoBeanFromToken.getChainId();
                }
                C31148loZ.OLrzqt(selectedDeFiPlatform, this, strDbNXlk, chainId != null ? chainId : "", new Function2() { // from class: o.iqd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return ActivityC25050ipR.OLrzqt(this.AEQbTJ, interfaceC9738bbJAEQbTJ, (java.lang.Integer) obj, (java.lang.String) obj2);
                    }
                });
                return;
            }
            gatherCallData$default(this, interfaceC9738bbJAEQbTJ, null, 2, null);
            return;
        }
        AYXKKw().AEQbTJ().setValue(java.lang.Boolean.FALSE);
        pUU.EZpvd("TransactionPageActivity", "transactionBean.quotePriceRes == null");
    }

    public static final Unit OLrzqt(ActivityC25050ipR activityC25050ipR, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Integer num, java.lang.String str) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == -1) {
                activityC25050ipR.AYXKKw().copydefault(str);
                activityC25050ipR.KWHzl(interfaceC9738bbJ, str);
            } else {
                pUU.copydefault(activityC25050ipR.getTAG(), "checkPermit2ValidationAndContinue: result=" + iIntValue);
                activityC25050ipR.AYXKKw().copydefault().setValue(new Triple<>(TransactionType.INQUIRY_TYPE, new MergeCallData((UnsignedSwapData) null, 1, (DefaultConstructorMarker) null), new CallDataError("RESULT_NOT_OK", (java.lang.String) null, true, 2, (DefaultConstructorMarker) null)));
            }
        } else {
            activityC25050ipR.finish();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void gatherCallData$default(ActivityC25050ipR activityC25050ipR, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        activityC25050ipR.KWHzl(interfaceC9738bbJ, str);
    }

    public final void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str) {
        this.djBIcL = (android.widget.FrameLayout) findViewById(C23274hvD.Application.MediaControllerCompatApi24TransportControls);
        AYXKKw().AEQbTJ().setValue(java.lang.Boolean.TRUE);
        QuotePriceRes quotePriceRes = values().getQuotePriceRes();
        if (quotePriceRes != null && quotePriceRes.isPMM()) {
            QuotePriceRes quotePriceRes2 = values().getQuotePriceRes();
            if (quotePriceRes2 != null && quotePriceRes2.isIntentBridge()) {
                KWHzl();
                return;
            } else {
                AhwBna();
                return;
            }
        }
        C23016hqK c23016hqK = C23016hqK.copydefault;
        java.lang.String strDbNXlk = DbNXlk();
        QuotePriceRes quotePriceRes3 = values().getQuotePriceRes();
        Intrinsics.copydefault(quotePriceRes3);
        boolean zValueOf = valueOf();
        C22971hpS c22971hpSAYXKKw = AYXKKw();
        QuotePriceRes quotePriceRes4 = values().getQuotePriceRes();
        Intrinsics.copydefault(quotePriceRes4);
        AbstractC58185ywX abstractC58185ywXKWHzl = C58156yvv.OLrzqt(c23016hqK.AEQbTJ(strDbNXlk, quotePriceRes3, zValueOf, c22971hpSAYXKKw.OLrzqt(quotePriceRes4.fromToken().getChainId(), DbNXlk(), interfaceC9738bbJ), AYXKKw().valueOf(), str, new Function1() { // from class: o.iqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.AEQbTJ(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }), this, Lifecycle.Event.ON_DESTROY).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.iqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.AEQbTJ(this.KWHzl, (MergeCallData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ipY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC25050ipR.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ipW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC25050ipR.KWHzl(function12, obj);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC25050ipR activityC25050ipR, boolean z) {
        activityC25050ipR.AYXKKw().AEQbTJ().setValue(java.lang.Boolean.FALSE);
        pUU.EZpvd("TransactionPageActivity", "getCallData: if (checkGasTypeAndGasAmount(\n                \"swap\", quotePriceRes\n            ).not() || wallet == null\n        )");
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC25050ipR activityC25050ipR, MergeCallData mergeCallData) {
        activityC25050ipR.AYXKKw().copydefault().setValue(new Triple<>(TransactionType.INQUIRY_TYPE, mergeCallData, new CallDataError((java.lang.String) null, (java.lang.String) null, false, 3, (DefaultConstructorMarker) null)));
        pUU.EZpvd("TransactionPageActivity", "getCallData success");
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC25050ipR activityC25050ipR, java.lang.Throwable th) {
        activityC25050ipR.AYXKKw().AEQbTJ().setValue(java.lang.Boolean.FALSE);
        pUU.EZpvd("TransactionPageActivity", "getCallData error");
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getCode() != 10055 && oKServerException.getCode() != 10054 && C33129mqd.OLrzqt((java.lang.CharSequence) oKServerException.getMessage())) {
                C55326xho.toast$default(oKServerException.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            MutableLiveData<Triple<TransactionType, MergeCallData, CallDataError>> mutableLiveDataCopydefault = activityC25050ipR.AYXKKw().copydefault();
            TransactionType transactionType = TransactionType.INQUIRY_TYPE;
            MergeCallData mergeCallData = new MergeCallData((UnsignedSwapData) null, 1, (DefaultConstructorMarker) null);
            int code = oKServerException.getCode();
            java.lang.String message = oKServerException.getMessage();
            if (message == null) {
                message = "";
            }
            mutableLiveDataCopydefault.setValue(new Triple<>(transactionType, mergeCallData, new CallDataError(java.lang.String.valueOf(code), message, true)));
        } else {
            activityC25050ipR.AYXKKw().copydefault().setValue(new Triple<>(TransactionType.INQUIRY_TYPE, new MergeCallData((UnsignedSwapData) null, 1, (DefaultConstructorMarker) null), new CallDataError((java.lang.String) null, (java.lang.String) null, true, 3, (DefaultConstructorMarker) null)));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        DexQuoteBridgeVO bridge;
        QuotePriceRes quotePriceRes = values().getQuotePriceRes();
        if (quotePriceRes != null) {
            PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
            if (selectRouterItem$default == null || (bridge = selectRouterItem$default.getBridge()) == null) {
                return;
            }
            QuotePriceRes quotePriceRes2 = values().getQuotePriceRes();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes2 != null ? quotePriceRes2.fromToken() : null;
            QuotePriceRes quotePriceRes3 = values().getQuotePriceRes();
            DexMultiTokenInfoBean token = quotePriceRes3 != null ? quotePriceRes3.toToken() : null;
            java.lang.String tokenName = dexMultiTokenInfoBeanFromToken != null ? dexMultiTokenInfoBeanFromToken.getTokenName() : null;
            java.lang.String str = tokenName == null ? "" : tokenName;
            java.lang.String tokenName2 = token != null ? token.getTokenName() : null;
            CallData callData = new CallData(str, tokenName2 == null ? "" : tokenName2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32764, (DefaultConstructorMarker) null);
            OfflineQuote calldata = bridge.getCalldata();
            java.lang.String unsignedTx = calldata != null ? calldata.getUnsignedTx() : null;
            java.lang.String str2 = unsignedTx == null ? "" : unsignedTx;
            OfflineQuote calldata2 = bridge.getCalldata();
            AYXKKw().copydefault().setValue(new Triple<>(TransactionType.INQUIRY_TYPE, new MergeCallData(new UnsignedSwapData((java.lang.String) null, callData, str2, (java.lang.String) null, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, (java.lang.String) null, values().getQuotePriceRes(), calldata2 != null ? calldata2.getQuote() : null, (JitoData) null, false, false, (MevConfig) null, MTPushConstants.RemoteWhat.ADD_GEOFENCE, (DefaultConstructorMarker) null)), new CallDataError((java.lang.String) null, (java.lang.String) null, false, 3, (DefaultConstructorMarker) null)));
        }
    }

    public final void AhwBna() {
        DeFiPlatformForSwap selectedDeFiPlatform;
        QuotePriceRes quotePriceRes = values().getQuotePriceRes();
        if (quotePriceRes == null || (selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform()) == null) {
            return;
        }
        OfflineQuote calldata = selectedDeFiPlatform.getCalldata();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (calldata != null ? calldata.getUnsignedTx() : null))) {
            OfflineQuote calldata2 = selectedDeFiPlatform.getCalldata();
            java.lang.String unsignedTx = calldata2 != null ? calldata2.getUnsignedTx() : null;
            QuotePriceRes quotePriceRes2 = values().getQuotePriceRes();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes2 != null ? quotePriceRes2.fromToken() : null;
            QuotePriceRes quotePriceRes3 = values().getQuotePriceRes();
            DexMultiTokenInfoBean token = quotePriceRes3 != null ? quotePriceRes3.toToken() : null;
            java.lang.String tokenName = dexMultiTokenInfoBeanFromToken != null ? dexMultiTokenInfoBeanFromToken.getTokenName() : null;
            java.lang.String str = tokenName == null ? "" : tokenName;
            java.lang.String tokenName2 = token != null ? token.getTokenName() : null;
            CallData callData = new CallData(str, tokenName2 == null ? "" : tokenName2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32764, (DefaultConstructorMarker) null);
            java.lang.String str2 = unsignedTx == null ? "" : unsignedTx;
            OfflineQuote calldata3 = selectedDeFiPlatform.getCalldata();
            UnsignedSwapData unsignedSwapData = new UnsignedSwapData((java.lang.String) null, callData, str2, (java.lang.String) null, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, (java.lang.String) null, values().getQuotePriceRes(), calldata3 != null ? calldata3.getQuote() : null, (JitoData) null, false, false, (MevConfig) null, MTPushConstants.RemoteWhat.ADD_GEOFENCE, (DefaultConstructorMarker) null);
            pUU.EZpvd("TransactionPageActivity", "if (transactionBean.quotePriceRes?.snapModeQuote?.unsignedTx.isNotNullOrEmptyOrBlank())");
            AYXKKw().copydefault().setValue(new Triple<>(TransactionType.INQUIRY_TYPE, new MergeCallData(unsignedSwapData), new CallDataError((java.lang.String) null, (java.lang.String) null, false, 3, (DefaultConstructorMarker) null)));
            return;
        }
        pUU.EZpvd("TransactionPageActivity", "if (transactionBean.quotePriceRes?.snapModeQuote?.unsignedTx.isNotNullOrEmptyOrBlank()) else");
    }

    @Override // o.AbstractActivityC25051ipS, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AYXKKw().djBIcL();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("cancel_action_from_tx_page", true);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
    }

    private final void AkhnZx() {
        this.valueOf = (C33537myN) findViewById(C23274hvD.Application.dxcTrN);
        this.AhwBna = findViewById(C23274hvD.Application.OEgNct);
        C33537myN c33537myN = this.valueOf;
        C25352ivB.setOnDoubleCheckClickListener$default(c33537myN != null ? c33537myN.getBackImage() : null, 0L, new Function1() { // from class: o.ipX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.values(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
        C33537myN c33537myN2 = this.valueOf;
        C25352ivB.setOnDoubleCheckClickListener$default(c33537myN2 != null ? c33537myN2.getDoImage() : null, 0L, new Function1() { // from class: o.ipZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.AkhnZx(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        fetchVPNInfo();
    }

    public static final Unit values(ActivityC25050ipR activityC25050ipR, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        activityC25050ipR.AYXKKw().AEQbTJ(DexTrackEventParameter.ButtonName.BACK.getValue());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("cancel_action_from_tx_page", true);
        Unit unit = Unit.INSTANCE;
        activityC25050ipR.setResult(-1, intent);
        activityC25050ipR.finish();
        return unit;
    }

    public static final Unit AkhnZx(final ActivityC25050ipR activityC25050ipR, android.view.View view) {
        java.lang.String value;
        java.lang.String strEZpvd;
        QuotePriceRes quotePriceRes;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        C33537myN c33537myN = activityC25050ipR.valueOf;
        java.lang.String chainId = null;
        java.lang.Object tag = c33537myN != null ? c33537myN.getTag() : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        C25235isr.Companion.AEQbTJ(activityC25050ipR.DbNXlk(), zBooleanValue, 1, false, activityC25050ipR.AYXKKw().AhwBna(), new Function1() { // from class: o.iqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.valueOf(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }).show(activityC25050ipR.getSupportFragmentManager(), "javaClass");
        TransactionBean transactionBeanValueOf = activityC25050ipR.AYXKKw().valueOf();
        if (transactionBeanValueOf != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && (commonDexInfo = quotePriceRes.getCommonDexInfo()) != null && (fromToken = commonDexInfo.getFromToken()) != null) {
            chainId = fromToken.getChainId();
        }
        if (chainId == null) {
            chainId = "";
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(activityC25050ipR.DbNXlk()).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ != null && (strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(chainId))) != null) {
            str = strEZpvd;
        }
        java.lang.String strOLrzqt = c22380heK.copydefault(activityC25050ipR.DbNXlk()).OLrzqt(activityC25050ipR.valueOf()).OLrzqt();
        if (strOLrzqt.length() == 0) {
            strOLrzqt = DexTrackEventParameter.AEQbTJ.OLrzqt(activityC25050ipR.DbNXlk());
        }
        if (zBooleanValue) {
            value = DexTrackEventParameter.ButtonName.ON.getValue();
        } else {
            value = DexTrackEventParameter.ButtonName.OFF.getValue();
        }
        C23301hve.EZpvd(str, "swap", strOLrzqt, "mev", value);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC25050ipR activityC25050ipR, boolean z) {
        activityC25050ipR.AYXKKw().EZpvd(z);
        activityC25050ipR.KWHzl(z);
        activityC25050ipR.OLrzqt(z);
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        AYXKKw().AEQbTJ(values());
        AYXKKw().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.iqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.copydefault(this.KWHzl, (Triple) obj);
            }
        }));
        AYXKKw().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.iqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.KWHzl(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        C25390ivn.collectOnLifecycle$default(this, AYXKKw().KWHzl(), null, new TaskDescription(), 2, null);
        AYXKKw().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.iqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25050ipR.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [369=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(final ActivityC25050ipR activityC25050ipR, Triple triple) {
        if (((CallDataError) triple.getThird()).getResStatus()) {
            rVN.reportFullyDrawn$default((android.app.Activity) activityC25050ipR, false, (java.lang.String) null, 2, (java.lang.Object) null);
            C55173xeu c55173xeuGEmmrt = activityC25050ipR.gEmmrt();
            c55173xeuGEmmrt.setVisibility(0);
            java.lang.String code = ((CallDataError) triple.getThird()).getCode();
            switch (code.hashCode()) {
                case 46730320:
                    if (!code.equals("10054")) {
                        c55173xeuGEmmrt.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
                        c55173xeuGEmmrt.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
                        c55173xeuGEmmrt.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
                        c55173xeuGEmmrt.setEmptyTypeImage(2);
                        c55173xeuGEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.iqg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                ActivityC25050ipR.valueOf(this.AEQbTJ, view);
                            }
                        });
                    } else {
                        c55173xeuGEmmrt.setSubTitle((java.lang.CharSequence) ((CallDataError) triple.getThird()).getMessage());
                        c55173xeuGEmmrt.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp));
                        c55173xeuGEmmrt.setEmptyTypeImage(6);
                        c55173xeuGEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.iqc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                ActivityC25050ipR.AhwBna(this.AEQbTJ, view);
                            }
                        });
                    }
                    break;
                case 46730321:
                    if (code.equals("10055")) {
                        c55173xeuGEmmrt.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.getIControllerCallback));
                        c55173xeuGEmmrt.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.registerCallback));
                        c55173xeuGEmmrt.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp));
                        c55173xeuGEmmrt.setEmptyTypeImage(6);
                        c55173xeuGEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.iqe
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                ActivityC25050ipR.djBIcL(this.OLrzqt, view);
                            }
                        });
                        break;
                    }
                    break;
                case 547403082:
                    if (code.equals("RESULT_NOT_OK")) {
                        c55173xeuGEmmrt.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
                        c55173xeuGEmmrt.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp));
                        c55173xeuGEmmrt.setEmptyTypeImage(6);
                        c55173xeuGEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.iqf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                ActivityC25050ipR.AYXKKw(this.OLrzqt, view);
                            }
                        });
                        break;
                    }
                    break;
                case 1448635041:
                    if (code.equals("100002")) {
                        c55173xeuGEmmrt.setEmptyTypeImage(7);
                        c55173xeuGEmmrt.setSubTitle((java.lang.CharSequence) ((CallDataError) triple.getThird()).getMessage());
                        break;
                    }
                    break;
            }
        } else {
            activityC25050ipR.gEmmrt().setVisibility(8);
            TransactionPageFragment<? extends AbstractC22977hpY> transactionPageFragmentOLrzqt = activityC25050ipR.OLrzqt((MergeCallData) triple.getSecond());
            activityC25050ipR.values = transactionPageFragmentOLrzqt;
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, activityC25050ipR.DbNXlk());
            bundle.putBoolean("swap_type", activityC25050ipR.valueOf());
            transactionPageFragmentOLrzqt.setArguments(bundle);
            activityC25050ipR.getSupportFragmentManager().beginTransaction().replace(C23274hvD.Application.OEgNct, transactionPageFragmentOLrzqt).commitAllowingStateLoss();
            rVN.reportFullyDrawn$default((android.app.Activity) activityC25050ipR, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(ActivityC25050ipR activityC25050ipR, android.view.View view) {
        activityC25050ipR.finish();
    }

    public static final void djBIcL(ActivityC25050ipR activityC25050ipR, android.view.View view) {
        activityC25050ipR.finish();
    }

    public static final void AYXKKw(ActivityC25050ipR activityC25050ipR, android.view.View view) {
        activityC25050ipR.finish();
    }

    public static final void valueOf(ActivityC25050ipR activityC25050ipR, android.view.View view) {
        activityC25050ipR.isConnected();
    }

    public static final Unit KWHzl(ActivityC25050ipR activityC25050ipR, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC25050ipR.isConnected();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ipR$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.Boolean bool, Continuation<? super Unit> continuation) {
            if (bool == null) {
                C33537myN c33537myN = ActivityC25050ipR.this.valueOf;
                if (c33537myN != null) {
                    c33537myN.setSubDoVisible(8);
                }
                C33537myN c33537myN2 = ActivityC25050ipR.this.valueOf;
                if (c33537myN2 != null) {
                    c33537myN2.setSubDoImageVisible(8);
                }
                ActivityC25050ipR.this.AYXKKw().EZpvd(false);
            } else if (ActivityC25050ipR.this.values().getTradeMode() == TradeMode.SimpleSellMode) {
                C33537myN c33537myN3 = ActivityC25050ipR.this.valueOf;
                if (c33537myN3 != null) {
                    c33537myN3.setSubDoVisible(8);
                }
                C33537myN c33537myN4 = ActivityC25050ipR.this.valueOf;
                if (c33537myN4 != null) {
                    c33537myN4.setSubDoImageVisible(8);
                }
            } else {
                ActivityC25050ipR.this.AYXKKw().EZpvd(bool.booleanValue());
                if (bool.booleanValue()) {
                    ActivityC25050ipR.this.KWHzl(true);
                    ActivityC25050ipR.this.OLrzqt(bool.booleanValue());
                } else {
                    ActivityC25050ipR.this.KWHzl(false);
                    ActivityC25050ipR.this.djBIcL();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(ActivityC25050ipR activityC25050ipR, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            android.view.View view = activityC25050ipR.AhwBna;
            if (view != null) {
                view.setVisibility(8);
            }
            activityC25050ipR.showLoadingWithLogo();
        } else {
            android.view.View view2 = activityC25050ipR.AhwBna;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            activityC25050ipR.dismissLoadingWithLogo();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        android.widget.ImageView doImage;
        C33537myN c33537myN = this.valueOf;
        if (c33537myN != null) {
            c33537myN.setTag(java.lang.Boolean.valueOf(z));
        }
        if (valueOf()) {
            C33537myN c33537myN2 = this.valueOf;
            if (c33537myN2 != null) {
                c33537myN2.setSubDoVisible(8);
            }
            C33537myN c33537myN3 = this.valueOf;
            if (c33537myN3 != null) {
                c33537myN3.setSubDoImageVisible(8);
                return;
            }
            return;
        }
        if (!z) {
            C33537myN c33537myN4 = this.valueOf;
            if (c33537myN4 != null) {
                c33537myN4.setSubDoVisible(0);
            }
            C33537myN c33537myN5 = this.valueOf;
            if (c33537myN5 != null) {
                c33537myN5.setSubDoImageVisible(0);
            }
            C33537myN c33537myN6 = this.valueOf;
            if (c33537myN6 != null) {
                c33537myN6.setSubDoImageResource(C52761wXj.TaskDescription.dhOYXF);
                return;
            }
            return;
        }
        C33537myN c33537myN7 = this.valueOf;
        if (c33537myN7 != null) {
            c33537myN7.setSubDoVisible(0);
        }
        C33537myN c33537myN8 = this.valueOf;
        if (c33537myN8 != null) {
            c33537myN8.setSubDoImageVisible(0);
        }
        C33537myN c33537myN9 = this.valueOf;
        if (c33537myN9 != null) {
            c33537myN9.setSubDoImageResource(C52761wXj.TaskDescription.hQkvHM);
        }
        C33537myN c33537myN10 = this.valueOf;
        if (c33537myN10 == null || (doImage = c33537myN10.getDoImage()) == null) {
            return;
        }
        doImage.setImageTintList(C25382ivf.copydefault(C52761wXj.Activity.OJuSTm));
    }

    public final void OLrzqt(boolean z) {
        if (valueOf()) {
            return;
        }
        AEQbTJ(C33070mpX.AYXKKw(z ? C23274hvD.Fragment.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1 : C23274hvD.Fragment.ReportDrawnWhen));
    }

    public final void djBIcL() {
        if (valueOf() || C23317hvu.fJNWhG()) {
            return;
        }
        AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnAfter));
        C23317hvu.isConnected(true);
    }

    public final void AEQbTJ(java.lang.String str) {
        android.view.View viewFindViewById = findViewById(C23274hvD.Application.getMediaType);
        TipTool.TaskDescription taskDescription = TipTool.Companion;
        Intrinsics.copydefault(viewFindViewById);
        taskDescription.KWHzl(viewFindViewById).OLrzqt(str).AEQbTJ(TipTool.Position.BOTTOM).KWHzl(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null)).EZpvd(true).EZpvd(C55298xhM.dp2px$default(9.0f, null, 1, null)).djBIcL();
    }

    public final TransactionPageFragment<? extends AbstractC22977hpY> OLrzqt(MergeCallData mergeCallData) {
        DeFiPlatformForSwap selectedDeFiPlatform;
        java.lang.Integer offlineType;
        DeFiPlatformForSwap selectedDeFiPlatform2;
        java.lang.Integer offlineType2;
        DeFiPlatformForSwap selectedDeFiPlatform3;
        java.lang.Integer offlineType3;
        DexQuoteBridgeVO dexQuoteBridgeVOBridge;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(DbNXlk());
        QuotePriceRes quotePriceRes = values().getQuotePriceRes();
        java.lang.String chainId = (quotePriceRes == null || (dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken()) == null) ? null : dexMultiTokenInfoBeanFromToken.getChainId();
        if (chainId == null) {
            chainId = "";
        }
        if (chainId.length() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            java.lang.String str = "chainInfo is null \nchainId: " + chainId + "\nsourceType: " + DbNXlk();
            C23310hvn.e$default(C23310hvn.copydefault, "newTransactionPageInstance", str, null, 4, null);
            C6777aVl.Companion.EZpvd(new java.lang.Exception(str));
            finish();
        }
        boolean zCopydefault = c22374heECopydefault.fARcdN().copydefault(C33129mqd.valueOf(chainId));
        boolean zEZpvd = c22374heECopydefault.fARcdN().EZpvd(C33129mqd.valueOf(chainId));
        if (Activity.copydefault[values().getTransactionType().ordinal()] != 1) {
            if (zCopydefault) {
                return new C25243isz();
            }
            return new C25205isN();
        }
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22374heECopydefault.fARcdN().AEQbTJ();
        if (quotePriceRes != null && (dexQuoteBridgeVOBridge = quotePriceRes.bridge()) != null && dexQuoteBridgeVOBridge.isIntentBridge()) {
            return new C25199isH();
        }
        if (mergeCallData != null) {
            if (mergeCallData.isTransfer(interfaceC9738bbJAEQbTJ != null && interfaceC9738bbJAEQbTJ.getFieldNames()) && (quotePriceRes == null || (selectedDeFiPlatform3 = quotePriceRes.getSelectedDeFiPlatform()) == null || (offlineType3 = selectedDeFiPlatform3.getOfflineType()) == null || offlineType3.intValue() != 1)) {
                return new C25277itg();
            }
        }
        if (quotePriceRes != null && (selectedDeFiPlatform2 = quotePriceRes.getSelectedDeFiPlatform()) != null && (offlineType2 = selectedDeFiPlatform2.getOfflineType()) != null && offlineType2.intValue() == 1 && zCopydefault) {
            return new C25212isU();
        }
        if (quotePriceRes != null && (selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform()) != null && (offlineType = selectedDeFiPlatform.getOfflineType()) != null && offlineType.intValue() == 1 && zEZpvd) {
            return new C25275ite();
        }
        if (zCopydefault) {
            return new C25243isz();
        }
        return new C25205isN();
    }

    @Override // o.AbstractActivityC25051ipS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC25051ipS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC25051ipS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC25051ipS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
