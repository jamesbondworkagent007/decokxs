package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestAdvancePanelUIBean;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.page.InvestSubscriptionNewFragment$showKeyboardLayout$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.DeserializationStrategy;
import o.Bitmap;
import o.C24096iUt;
import o.C25493ixk;
import o.C26601jfR;
import o.C27197jqe;
import o.C27200jqh;
import o.C27209jqq;
import o.C52761wXj;
import o.C55030xcJ;
import o.InterfaceC27161jpv;
import o.InterfaceC43294rma;
import o.InterfaceC54829xWw;
import o.iUB;
import o.iUX;
import o.iUZ;
import o.iXD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iQS extends iPV implements InterfaceC33040mou, InterfaceC26609jfZ, C24096iUt.StateListAnimator {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public ActivityResultLauncher<android.content.Intent> AYXKKw;
    public int AkhnZx;
    public long AuCTel;
    public InterfaceC58217yxC AuCTelauCTel;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> AubY;
    public InvestInputData AxsJAY;
    public int DbNXlk;
    public iHK fARcdN;
    public boolean fIwbmz;
    public int fJNWhG;
    public long gEmmrt;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> isConnected;
    public final Observer<InvestTransactionModel> iwGUEr;
    public InterfaceC58217yxC valueOf;
    public InvestSubscriptionInfo values;
    public InterfaceC58217yxC zLjUOn;
    public long zsXlph;
    public C26684jgv zuBGHE;
    public final int ejfBZ = C25493ixk.Activity.QOLQEE;
    public java.lang.String AwvSrB = "";
    public java.lang.String sSMYrx = "";
    public java.lang.String gHZMYf = "";
    public final java.lang.Object AhwBna = new java.lang.Object();
    public java.lang.String wlaJM = "";
    public boolean fetchVPNInfo = true;
    public final InterfaceC56387yDm hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.iSi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iQS.AuCTel(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.iSk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iQS.ejfBZ(this.AEQbTJ);
        }
    });

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionMethod.values().length];
            try {
                iArr[TransactionMethod.SINGLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionMethod.MULTI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.ejfBZ;
    }

    public static final class PendingIntent implements Function1<java.lang.String, InvestTransactionModel> {
        public static final PendingIntent KWHzl = new PendingIntent();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class PictureInPictureParams implements Function0<java.lang.Object> {
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(java.lang.String str, Function1 function1) {
            this.OLrzqt = str;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.iQS$PictureInPictureParams$1] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final java.lang.String str = this.OLrzqt;
            final Function1 function1 = this.copydefault;
            return new ViewModelProvider.Factory() { // from class: o.iQS.PictureInPictureParams.1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return new C23611iCu(str, function1);
                }
            };
        }
    }

    private final java.lang.String AwvSrB() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iQS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final iQS KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, int i, @NotNull java.lang.String str3, boolean z, @NotNull InvestSubscriptionInfo investSubscriptionInfo, InvestInputData investInputData, long j2, int i2, java.lang.String str4, @NotNull java.lang.String str5) {
            java.util.ArrayList arrayList;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(investSubscriptionInfo, "");
            Intrinsics.checkNotNullParameter(str5, "");
            iQS iqs = new iQS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("walletid", str);
            bundle.putString("wallet_address", str2);
            bundle.putLong("investmentId", j);
            bundle.putInt("investType", i);
            bundle.putString("validatorName", str3);
            bundle.putBoolean("is_multi", z);
            bundle.putParcelable("subs_info", investSubscriptionInfo);
            bundle.putLong("relatedInvestmentId", j2);
            bundle.putString("source", str4);
            bundle.putInt("investmentCategory", i2);
            bundle.putParcelable("user_input_data", investInputData);
            bundle.putString("poolId", str5);
            java.lang.Long analysisPlatformId = investSubscriptionInfo.getAnalysisPlatformId();
            long jLongValue = analysisPlatformId != null ? analysisPlatformId.longValue() : 0L;
            long chainId = investSubscriptionInfo.getChainId();
            java.lang.String str6 = str4 == null ? "" : str4;
            if (investInputData == null || (arrayList = yDY.copydefault(investInputData)) == null) {
                arrayList = new java.util.ArrayList();
            }
            TransactionConfig transactionConfig = new TransactionConfig(i2, 1, j, !z, j2, chainId, str5, str6, arrayList, 0, -1, jLongValue, i, null, null, null, null, null, false, false, null, null, false, false, null, 33546752, null);
            iqs.zuBGHE = new C26684jgv(new C26683jgu(transactionConfig.isConnected(), transactionConfig.copydefault(), transactionConfig.AuCTel(), InvestAction.Subscription), false, 2, null);
            bundle.putParcelable("key.trx_config", transactionConfig);
            iqs.setArguments(bundle);
            return iqs;
        }
    }

    public final InvestSubscriptionNewViewModel isConnected() {
        return (InvestSubscriptionNewViewModel) this.hDKMBd.getValue();
    }

    public static final InvestSubscriptionNewViewModel AuCTel(iQS iqs) {
        return (InvestSubscriptionNewViewModel) new ViewModelProvider(iqs).get(InvestSubscriptionNewViewModel.class);
    }

    public final C27073joM AkhnZx() {
        return (C27073joM) this.uzCIH.getValue();
    }

    public static final C27073joM ejfBZ(iQS iqs) {
        FragmentActivity fragmentActivityRequireActivity = iqs.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C27073joM) new ViewModelProvider(fragmentActivityRequireActivity).get(C27073joM.class);
    }

    public final C23611iCu<InvestTransactionModel> DbNXlk() {
        return (C23611iCu) this.getNewProxyInstance.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel.getReceiveInfoAndCheckState$default(com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel, boolean, int, java.lang.Object):void */
    public static final void AEQbTJ(iQS iqs, InvestTransactionModel investTransactionModel) {
        InvestTransactionParam routerParams;
        java.lang.Integer pushToastCode;
        java.lang.Integer pushToastCode2;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        if (Intrinsics.EZpvd((java.lang.Object) investTransactionModel.getTxHash(), (java.lang.Object) iqs.isConnected().fFgQHt()) && (((pushToastCode = investTransactionModel.getPushToastCode()) != null && pushToastCode.intValue() == 1) || ((pushToastCode2 = investTransactionModel.getPushToastCode()) != null && pushToastCode2.intValue() == 5))) {
            InvestSubscriptionNewViewModel.getReceiveInfoAndCheckState$default(iqs.isConnected(), false, 1, null);
        }
        java.lang.Integer pushToastCode3 = investTransactionModel.getPushToastCode();
        if (pushToastCode3 == null || pushToastCode3.intValue() != 7 || (routerParams = investTransactionModel.getRouterParams()) == null) {
            return;
        }
        java.lang.Long relatedInvestmentId = routerParams.getRelatedInvestmentId();
        long j = iqs.AuCTel;
        if (relatedInvestmentId != null && relatedInvestmentId.longValue() == j) {
            iqs.isConnected().iRxXKY();
        }
    }

    private final void sSMYrx() {
        final C55033xcM c55033xcM;
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        iHK ihk = this.fARcdN;
        if (ihk == null || (c55033xcM = ihk.valueOf) == null) {
            return;
        }
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(c55033xcM).skip(1L).debounce(500L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.iRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(this.copydefault, c55033xcM, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iQS.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.EZpvd((java.lang.Throwable) obj);
            }
        };
        this.valueOf = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iQS.djBIcL(function12, obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(iQS iqs, C55033xcM c55033xcM, AbstractC8060avc abstractC8060avc) {
        iqs.isConnected().EZpvd(c55033xcM.valueOf());
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit KWHzl(iQS iqs, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c55033xcM.setTextByAnimation(((java.lang.Object) charSequence) + " " + iqs.isConnected().AuCTel().getTokenSymbol());
        iqs.isConnected().KWHzl(c55033xcM.valueOf());
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C27349jtX c27349jtX;
        final C55033xcM c55033xcMOLrzqt;
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        iHK ihk = this.fARcdN;
        if (ihk == null || (c27349jtX = ihk.AhwBna) == null || (c55033xcMOLrzqt = c27349jtX.OLrzqt()) == null) {
            return;
        }
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(c55033xcMOLrzqt).skip(1L).debounce(500L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.iRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.copydefault(this.copydefault, c55033xcMOLrzqt, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iQS.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.AuCTelauCTel = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iQS.AhwBna(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(iQS iqs, C55033xcM c55033xcM, AbstractC8060avc abstractC8060avc) {
        if (iqs.isConnected().gGvvIC() && iqs.isConnected().dxcTrN()) {
            iqs.isConnected().EZpvd(c55033xcM.valueOf());
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void hDKMBd() {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTelauCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit OLrzqt(iQS iqs, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        C27349jtX c27349jtX;
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c55033xcM.setTextByAnimation(charSequence);
        iHK ihk = iqs.fARcdN;
        if (ihk != null && (c27349jtX = ihk.AhwBna) != null) {
            c27349jtX.copydefault();
        }
        if (iqs.isConnected().gGvvIC()) {
            if (iqs.isConnected().dxcTrN()) {
                iqs.isConnected().KWHzl(c55033xcM.valueOf());
            } else {
                iqs.isConnected().gEmmrt(c55033xcM.valueOf());
            }
        }
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C27349jtX c27349jtX;
        final C55033xcM c55033xcMOLrzqt;
        InterfaceC58217yxC interfaceC58217yxC = this.zLjUOn;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        iHK ihk = this.fARcdN;
        if (ihk == null || (c27349jtX = ihk.fARcdN) == null || (c55033xcMOLrzqt = c27349jtX.OLrzqt()) == null) {
            return;
        }
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(c55033xcMOLrzqt).skip(1L).debounce(500L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.iRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.gEmmrt(this.KWHzl, c55033xcMOLrzqt, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iRz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iQS.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.djBIcL((java.lang.Throwable) obj);
            }
        };
        this.zLjUOn = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iQS.isConnected(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(iQS iqs, C55033xcM c55033xcM, AbstractC8060avc abstractC8060avc) {
        if (iqs.isConnected().gGvvIC() && !iqs.isConnected().dxcTrN()) {
            iqs.isConnected().EZpvd(c55033xcM.valueOf());
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        InterfaceC58217yxC interfaceC58217yxC = this.zLjUOn;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit AYXKKw(iQS iqs, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        C27349jtX c27349jtX;
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c55033xcM.setTextByAnimation(charSequence);
        iHK ihk = iqs.fARcdN;
        if (ihk != null && (c27349jtX = ihk.fARcdN) != null) {
            c27349jtX.copydefault();
        }
        if (iqs.isConnected().gGvvIC()) {
            if (!iqs.isConnected().dxcTrN()) {
                iqs.isConnected().KWHzl(c55033xcM.valueOf());
            } else {
                iqs.isConnected().djBIcL(c55033xcM.valueOf());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC26609jfZ
    public void OLrzqt(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        isConnected().isConnected(investTokenWithAmount);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.widget.TextView textView;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.fARcdN = (iHK) viewDataBindingBind;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AwvSrB = arguments.getString("walletid", "");
            this.sSMYrx = arguments.getString("wallet_address", "");
            this.AuCTel = arguments.getLong("investmentId", 0L);
            this.DbNXlk = arguments.getInt("investType", 0);
            this.gHZMYf = arguments.getString("validatorName", "");
            this.fIwbmz = arguments.getBoolean("is_multi", false);
            android.os.Parcelable parcelable = arguments.getParcelable("subs_info");
            Intrinsics.copydefault(parcelable, "");
            this.values = (InvestSubscriptionInfo) parcelable;
            this.AxsJAY = (InvestInputData) arguments.getParcelable("user_input_data");
            this.zsXlph = arguments.getLong("relatedInvestmentId");
            this.AkhnZx = arguments.getInt("investmentCategory", 0);
            this.wlaJM = arguments.getString("poolId", "");
        }
        InvestSubscriptionNewViewModel investSubscriptionNewViewModelIsConnected = isConnected();
        java.lang.String str = this.AwvSrB;
        java.lang.String str2 = this.sSMYrx;
        long j = this.AuCTel;
        InvestSubscriptionInfo investSubscriptionInfo = this.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        int value = investSubscriptionInfo.getInvestType().getValue();
        int i = this.AkhnZx;
        boolean z = this.fIwbmz;
        InvestSubscriptionInfo investSubscriptionInfo2 = this.values;
        if (investSubscriptionInfo2 == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo2 = null;
        }
        investSubscriptionNewViewModelIsConnected.EZpvd(str, str2, j, value, i, z, investSubscriptionInfo2, this.AxsJAY, this.zsXlph, this.wlaJM);
        iHK ihk = this.fARcdN;
        if (ihk != null) {
            AEQbTJ(ihk);
            copydefault(ihk);
            OLrzqt(ihk);
        }
        zsXlph();
        this.gEmmrt = java.lang.System.currentTimeMillis();
        if (this.DbNXlk != 7) {
            iHK ihk2 = this.fARcdN;
            if (ihk2 == null || (constraintLayout = ihk2.copydefault) == null) {
                return;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        OLrzqt(this.AuCTel);
        iHK ihk3 = this.fARcdN;
        if (ihk3 != null && (constraintLayout2 = ihk3.copydefault) != null) {
            constraintLayout2.setVisibility(0);
        }
        iHK ihk4 = this.fARcdN;
        if (ihk4 == null || (textView = ihk4.QOLQEE) == null) {
            return;
        }
        textView.setText(this.gHZMYf);
    }

    public final void AEQbTJ(iHK ihk) {
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = c33566myq.OLrzqt(contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iCopydefault = C55298xhM.copydefault(44.0f, contextRequireContext2);
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        float fCopydefault = (iOLrzqt - iCopydefault) - C55298xhM.copydefault(233.0f, contextRequireContext3);
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        float fOLrzqt = fCopydefault - (c33566myq.OLrzqt(r3) * 0.27f);
        EZpvd(ihk, fOLrzqt);
        KWHzl(ihk, fOLrzqt);
        C27197jqe c27197jqe = ihk.wlaJM;
        java.lang.String string = c27197jqe.getContext().getString(C25493ixk.FragmentManager.reset);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c27197jqe.setTitleText(string);
        KWHzl(ihk, false);
        if (this.fIwbmz) {
            ihk.AuCTelauCTel.setVisibility(0);
            if (isConnected().dxcTrN()) {
                EZpvd(ihk.AhwBna.OLrzqt());
                ihk.AhwBna.AEQbTJ(false);
                ihk.fARcdN.EZpvd(false);
                ihk.AhwBna.OLrzqt().setPlainNumericText("0");
                ihk.fARcdN.OLrzqt().setPlainNumericText("0");
            } else {
                EZpvd(ihk.fARcdN.OLrzqt());
                ihk.fARcdN.AEQbTJ(false);
                ihk.AhwBna.EZpvd(false);
                ihk.fARcdN.OLrzqt().setPlainNumericText("0");
                ihk.AhwBna.OLrzqt().setPlainNumericText("0");
            }
        } else {
            ihk.getNewProxyInstance.setVisibility(0);
            C55033xcM c55033xcM = ihk.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
            EZpvd(c55033xcM);
            ihk.valueOf.setPlainNumericText("0");
        }
        C27174jqH c27174jqH = ihk.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c27174jqH, "");
        InvestSubscriptionInfo investSubscriptionInfo = this.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        c27174jqH.setVisibility(C25544iyi.KWHzl(investSubscriptionInfo) ? 0 : 8);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim);
        android.graphics.drawable.Drawable drawableMutate = drawableKWHzl != null ? drawableKWHzl.mutate() : null;
        if (drawableMutate != null) {
            android.content.Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            int iCopydefault2 = C55298xhM.copydefault(16.0f, contextRequireContext4);
            android.content.Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            drawableMutate.setBounds(0, 0, iCopydefault2, C55298xhM.copydefault(16.0f, contextRequireContext5));
            DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        ihk.sSMYrx.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        android.widget.TextView textView = ihk.sSMYrx;
        android.content.Context contextRequireContext6 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
        textView.setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, contextRequireContext6));
    }

    public final void EZpvd(iHK ihk, float f) {
        C55033xcM c55033xcM = ihk.valueOf;
        c55033xcM.setMaxDecimalLength(6);
        c55033xcM.setMaxInputLength(26);
        ihk.valueOf.setOnTextWillChange(this.isConnected);
        ihk.wlaJM.setNeedFundTips(true);
    }

    public final void KWHzl(iHK ihk, float f) {
        ihk.AhwBna.OLrzqt().setOnTextWillChange(this.getFieldNames);
        ihk.fARcdN.OLrzqt().setOnTextWillChange(this.AubY);
    }

    public final void copydefault(final iHK ihk) {
        ihk.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.iQU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.valueOf(this.OLrzqt, ihk, view);
            }
        });
        ihk.isConnected.setClickListener(new View.OnClickListener() { // from class: o.iSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.valueOf(this.AEQbTJ, view);
            }
        });
        ihk.uzCIH.setOnClickListener(new View.OnClickListener() { // from class: o.iSo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.gEmmrt(this.KWHzl, ihk, view);
            }
        });
        ihk.wlaJM.setMaxClickListener(new View.OnClickListener() { // from class: o.iSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.AhwBna(this.OLrzqt, ihk, view);
            }
        });
        ihk.wlaJM.setOnWarningTipClickCallback(new Fragment());
        ihk.EZpvd.setSlippageClickListener(new Function0() { // from class: o.iSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iQS.isConnected(this.OLrzqt);
            }
        });
        ihk.fIwbmz.setOnStatusClickListener(new View.OnClickListener() { // from class: o.iRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.copydefault(ihk, this, view);
            }
        });
        ihk.KWHzl.setOnCTAButtonClick(new Function0() { // from class: o.iQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iQS.values(this.OLrzqt);
            }
        });
        ihk.KWHzl.setOnReminderActionClick(new Function1() { // from class: o.iQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.copydefault(this.KWHzl, (InvestPopUpData) obj);
            }
        });
        ihk.zLjUOn.setProcessClickListener(new View.OnClickListener() { // from class: o.iQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.AhwBna(this.OLrzqt, view);
            }
        });
        ihk.iwGUEr.set3MoreClickListener(new View.OnClickListener() { // from class: o.iRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.AYXKKw(this.EZpvd, view);
            }
        });
        ihk.values.setOnClickListener(new View.OnClickListener() { // from class: o.iRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.OLrzqt(ihk, this, view);
            }
        });
        DbNXlk().KWHzl().observeForever(this.iwGUEr);
        ihk.AhwBna.setClickListener(new View.OnClickListener() { // from class: o.iRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.djBIcL(this.KWHzl, ihk, view);
            }
        });
        ihk.fARcdN.setClickListener(new View.OnClickListener() { // from class: o.iRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.AYXKKw(this.OLrzqt, ihk, view);
            }
        });
        ihk.zsXlph.setOnTipClickCallback(new FragmentManager());
        ihk.AwvSrB.setOnClickListener(new View.OnClickListener() { // from class: o.iRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.gEmmrt(this.copydefault, view);
            }
        });
        ihk.sSMYrx.setOnClickListener(new View.OnClickListener() { // from class: o.iRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.djBIcL(this.EZpvd, view);
            }
        });
    }

    public static final void valueOf(iQS iqs, iHK ihk, android.view.View view) {
        if (iqs.isConnected().gasjUx()) {
            return;
        }
        C55033xcM c55033xcM = ihk.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
        iqs.EZpvd(c55033xcM);
        showKeyboardLayout$default(iqs, ihk, false, 2, null);
    }

    public static final void valueOf(iQS iqs, android.view.View view) {
        if (iqs.isConnected().gasjUx()) {
            iqs.fARcdN();
        } else {
            iqs.values();
        }
        C26601jfR.StateListAnimator stateListAnimator = C26601jfR.Companion;
        long j = iqs.AuCTel;
        java.lang.String str = iqs.AwvSrB;
        InvestSubscriptionInfo investSubscriptionInfo = iqs.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        C26601jfR c26601jfRAEQbTJ = stateListAnimator.AEQbTJ(new TokenSelectionParams(j, str, investSubscriptionInfo.getChainId(), TokenSelectionAction.Invest));
        androidx.fragment.app.FragmentManager childFragmentManager = iqs.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26601jfRAEQbTJ.show(childFragmentManager);
    }

    public static final void gEmmrt(final iQS iqs, final iHK ihk, android.view.View view) {
        iqs.isConnected().EZpvd();
        iqs.fIwbmz();
        InvestSubscriptionNewViewModel.refreshDataFirst$default(iqs.isConnected(), new Function0() { // from class: o.iSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iQS.EZpvd(this.copydefault, ihk);
            }
        }, null, 2, null);
        iqs.AkhnZx().djBIcL().setValue(java.lang.Boolean.FALSE);
    }

    public static final Unit EZpvd(iQS iqs, iHK ihk) {
        showConfirmLayout$default(iqs, ihk, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(iQS iqs, iHK ihk, android.view.View view) {
        java.lang.String strEZpvd;
        int iEZpvd;
        java.lang.Integer num;
        java.lang.Object tag = view.getTag();
        boolean z = false;
        InvestSubscriptionInfo investSubscriptionInfo = null;
        InvestSubscriptionInfo investSubscriptionInfo2 = null;
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 3)) {
            InvestSubscriptionInfo investSubscriptionInfo3 = iqs.values;
            if (investSubscriptionInfo3 == null) {
                Intrinsics.gEmmrt("");
                investSubscriptionInfo3 = null;
            }
            int i = ActionBar.EZpvd[investSubscriptionInfo3.getSubscriptionMethod().ordinal()];
            boolean z2 = i == 1 || (i != 2 && ((num = SPUtils.getInt("sp_invest_pool_subscribe_select", 0)) == null || num.intValue() != 2));
            InvestSubscriptionInfo investSubscriptionInfo4 = iqs.values;
            if (investSubscriptionInfo4 == null) {
                Intrinsics.gEmmrt("");
                investSubscriptionInfo4 = null;
            }
            long sourceInvestmentId = investSubscriptionInfo4.getSourceInvestmentId();
            long j = iqs.AuCTel;
            InvestSubscriptionInfo investSubscriptionInfo5 = iqs.values;
            if (investSubscriptionInfo5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                investSubscriptionInfo = investSubscriptionInfo5;
            }
            showFarmGuidePoolDialog$default(iqs, sourceInvestmentId, j, investSubscriptionInfo.getChainId(), z2, null, 16, null);
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 2)) {
            InterfaceC27161jpv interfaceC27161jpvOLrzqt = iqs.AkhnZx().OLrzqt(iqs.isConnected().AuCTel());
            if (interfaceC27161jpvOLrzqt instanceof InterfaceC27161jpv.StateListAnimator) {
                iqs.KWHzl(((InterfaceC27161jpv.StateListAnimator) interfaceC27161jpvOLrzqt).EZpvd());
                return;
            }
            if (!(interfaceC27161jpvOLrzqt instanceof InterfaceC27161jpv.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC27161jpv.ActionBar actionBar = (InterfaceC27161jpv.ActionBar) interfaceC27161jpvOLrzqt;
            long jOLrzqt = actionBar.OLrzqt();
            long j2 = iqs.AuCTel;
            InvestSubscriptionInfo investSubscriptionInfo6 = iqs.values;
            if (investSubscriptionInfo6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                investSubscriptionInfo2 = investSubscriptionInfo6;
            }
            showFarmGuidePoolDialog$default(iqs, jOLrzqt, j2, investSubscriptionInfo2.getChainId(), false, actionBar.EZpvd(), 8, null);
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 4)) {
            iqs.AubY();
            return;
        }
        iqs.AuCTel();
        java.lang.String strAhwBna = iqs.isConnected().AhwBna();
        if (strAhwBna != null) {
            java.lang.String str = C33129mqd.valueOf(strAhwBna, 0) ? "0" : strAhwBna;
            if (iqs.isConnected().fvQaOB()) {
                java.lang.String strSubS$default = C33129mqd.subS$default(strAhwBna, iqs.isConnected().values(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                if (C33129mqd.AEQbTJ(strSubS$default, 0)) {
                    if (!SPUtils.getBoolean("sp_invest_maxreminder_dialog_never_show", false)) {
                        iTW itwKWHzl = iTW.Companion.KWHzl("sp_invest_maxreminder_dialog_never_show");
                        if (iqs.getActivity() != null) {
                            itwKWHzl.show(iqs.requireActivity().getSupportFragmentManager(), iTW.class.getName());
                        }
                    }
                    strEZpvd = C27491jwG.EZpvd(strSubS$default);
                } else {
                    strEZpvd = "0";
                    z = true;
                }
            } else {
                strEZpvd = C27491jwG.EZpvd(str);
            }
            if (z) {
                ihk.fetchVPNInfo.AEQbTJ();
                iqs.isConnected().RlQdEF();
                return;
            }
            if (iqs.isConnected().gGvvIC()) {
                if (iqs.isConnected().dxcTrN()) {
                    iEZpvd = ihk.AhwBna.OLrzqt().EZpvd();
                } else {
                    iEZpvd = ihk.fARcdN.OLrzqt().EZpvd();
                }
            } else {
                iEZpvd = ihk.valueOf.EZpvd();
            }
            if (Intrinsics.EZpvd((java.lang.Object) pTB.formatUpToMax$default(C33129mqd.EZpvd(strEZpvd), iEZpvd, null, 2, null), (java.lang.Object) "0")) {
                iqs.zuBGHE();
            }
            iqs.isConnected().hUfVAv();
            C55030xcJ.LoaderManager loaderManagerKWHzl = ihk.fetchVPNInfo.KWHzl();
            C55031xcK c55031xcK = loaderManagerKWHzl instanceof C55031xcK ? (C55031xcK) loaderManagerKWHzl : null;
            if (c55031xcK != null) {
                c55031xcK.KWHzl(C33129mqd.gEmmrt(C33129mqd.EZpvd(strEZpvd)));
            }
        }
    }

    public static final class Fragment implements C27197jqe.Activity {
        public Fragment() {
        }

        @Override // o.C27197jqe.Activity
        public void OLrzqt() {
            iQS.this.uzCIH();
        }
    }

    public static final Unit isConnected(iQS iqs) {
        iqs.fetchVPNInfo();
        C23978iQj.Companion.AEQbTJ(0).show(iqs.getChildFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final void copydefault(iHK ihk, iQS iqs, android.view.View view) {
        C24096iUt.Companion.copydefault(ihk.fIwbmz.EZpvd()).show(iqs.getChildFragmentManager(), "InvestRewardingAddressDialog");
    }

    public static final Unit values(iQS iqs) {
        iqs.gHZMYf();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(iQS iqs, InvestPopUpData investPopUpData) {
        Intrinsics.checkNotNullParameter(investPopUpData, "");
        iUW iuwAEQbTJ = iUW.Companion.AEQbTJ(investPopUpData);
        androidx.fragment.app.FragmentManager childFragmentManager = iqs.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        iuwAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(iQS iqs, android.view.View view) {
        iqs.gEmmrt();
        new iUI().show(iqs.getChildFragmentManager(), "javaClass");
    }

    public static final void AYXKKw(iQS iqs, android.view.View view) {
        if (iqs.isConnected().fIwbmz().getValue() != null) {
            iUB.TaskDescription taskDescription = iUB.Companion;
            C25537iyb value = iqs.isConnected().fIwbmz().getValue();
            Intrinsics.copydefault(value);
            iUB iubEZpvd = taskDescription.EZpvd(value);
            if (iqs.getActivity() != null) {
                iubEZpvd.show(iqs.getChildFragmentManager(), "javaClass");
            }
        }
    }

    public static final void OLrzqt(iHK ihk, iQS iqs, android.view.View view) {
        java.lang.Object tag = ihk.values.getTag();
        if ((tag instanceof java.lang.Integer) && 2 == ((java.lang.Number) tag).intValue()) {
            iqs.getFieldNames();
            return;
        }
        java.lang.Object tag2 = ihk.values.getTag();
        if ((tag2 instanceof java.lang.Integer) && 5 == ((java.lang.Number) tag2).intValue()) {
            iqs.wlaJM();
        }
    }

    public static final void djBIcL(iQS iqs, iHK ihk, android.view.View view) {
        iqs.isConnected().EZpvd(true);
        if (!iqs.isConnected().gasjUx()) {
            showKeyboardLayout$default(iqs, ihk, false, 2, null);
        }
        iqs.EZpvd(ihk.AhwBna.OLrzqt());
        C27349jtX.exitEditMode$default(ihk.fARcdN, false, 1, null);
    }

    public static final void AYXKKw(iQS iqs, iHK ihk, android.view.View view) {
        iqs.isConnected().EZpvd(false);
        if (!iqs.isConnected().gasjUx()) {
            showKeyboardLayout$default(iqs, ihk, false, 2, null);
        }
        iqs.EZpvd(ihk.fARcdN.OLrzqt());
        C27349jtX.exitEditMode$default(ihk.AhwBna, false, 1, null);
    }

    public static final class FragmentManager implements C27200jqh.StateListAnimator {
        public FragmentManager() {
        }

        @Override // o.C27200jqh.StateListAnimator
        public void AEQbTJ(InvestTokenWithAmount investTokenWithAmount) {
            Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
            if (investTokenWithAmount.getDataType() == InvestTokenType.TRADING_FEE) {
                iQS.this.AuCTelauCTel();
            }
        }
    }

    public static final void gEmmrt(iQS iqs, android.view.View view) {
        InvestTransactionLossInfo value = iqs.isConnected().UeEOUB().getValue();
        if (value != null) {
            iUX.ActionBar.newInstance$default(iUX.Companion, value, false, 2, null).show(iqs.getChildFragmentManager(), (java.lang.String) null);
        }
    }

    public static final void djBIcL(iQS iqs, android.view.View view) {
        FragmentActivity activity = iqs.getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, activity.getString(C25493ixk.FragmentManager.ggKfIT), activity.getString(C25493ixk.FragmentManager.DQzvGNdrmXxudrmXxu), null, false, false, activity.getString(C25493ixk.FragmentManager.gwwfep), null, null, null, false, 1976, null);
        }
    }

    private final void zsXlph() {
        this.AYXKKw = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.iRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                iQS.AEQbTJ(this.copydefault, (ActivityResult) obj);
            }
        });
    }

    public static final void AEQbTJ(iQS iqs, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            iqs.requireActivity().finish();
        }
    }

    public final void EZpvd(C55033xcM c55033xcM) {
        C55030xcJ c55030xcJ;
        iHK ihk = this.fARcdN;
        if (ihk == null || (c55030xcJ = ihk.fetchVPNInfo) == null) {
            return;
        }
        c55030xcJ.setEditable(c55033xcM.KWHzl());
    }

    public final void djBIcL() {
        C55030xcJ c55030xcJ;
        iHK ihk = this.fARcdN;
        if (ihk == null || (c55030xcJ = ihk.fetchVPNInfo) == null) {
            return;
        }
        c55030xcJ.setEditable(null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        sSMYrx();
        EZpvd();
        valueOf();
        isConnected().gkJEwt();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        iwGUEr();
        hDKMBd();
        getNewProxyInstance();
        isConnected().giSNqX();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.AhwBna);
        isConnected().AxsJAYaxsJAY();
        DbNXlk().KWHzl().removeObserver(this.iwGUEr);
    }

    @Override // o.C24096iUt.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected().copydefault(str);
    }

    public final void OLrzqt(final iHK ihk) {
        isConnected().getNewProxyInstance().observe(this, new LoaderManager(new Function1() { // from class: o.iRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        isConnected().hDKMBd().observe(this, new LoaderManager(new Function1() { // from class: o.iRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AEQbTJ(ihk, this, (java.lang.Boolean) obj);
            }
        }));
        isConnected().QVAiDq().observe(this, new Application());
        isConnected().valueOf().observe(this, new LoaderManager(new Function1() { // from class: o.iRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AEQbTJ(ihk, this, (InvestAdvancePanelUIBean) obj);
            }
        }));
        isConnected().AkhnZx().observe(this, new LoaderManager(new Function1() { // from class: o.iRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AEQbTJ(ihk, this, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }));
        isConnected().dNCPSb().observe(this, new LoaderManager(new Function1() { // from class: o.iRZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(ihk, (java.lang.Boolean) obj);
            }
        }));
        isConnected().UeEOUB().observe(this, new LoaderManager(new Function1() { // from class: o.iRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(ihk, (InvestTransactionLossInfo) obj);
            }
        }));
        isConnected().copydefault().observe(this, new LoaderManager(new Function1() { // from class: o.iRW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.copydefault(ihk, this, (InvestConsumeData) obj);
            }
        }));
        isConnected().ejfBZ().observe(this, new LoaderManager(new Function1() { // from class: o.iSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        isConnected().aKErDB().observe(this, new LoaderManager(new Function1() { // from class: o.iSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.KWHzl(this.EZpvd, (InvestSubscriptionNewViewModel.SubscriptionResult) obj);
            }
        }));
        isConnected().AwvSrB().observe(this, new LoaderManager(new Function1() { // from class: o.iSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.EZpvd(this.AEQbTJ, ihk, (C23948iPg) obj);
            }
        }));
        isConnected().zuBGHE().observe(this, new LoaderManager(new Function1() { // from class: o.iRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.KWHzl(this.KWHzl, ihk, (C23948iPg) obj);
            }
        }));
        isConnected().DTwDnp().observe(this, new LoaderManager(new Function1() { // from class: o.iRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.djBIcL(this.AEQbTJ, ihk, (C23948iPg) obj);
            }
        }));
        isConnected().gEmmrt().observe(this, new LoaderManager(new Function1() { // from class: o.iRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.KWHzl(ihk, (C25481ixY) obj);
            }
        }));
        isConnected().isConnected().observe(this, new LoaderManager(new Function1() { // from class: o.iRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.EZpvd(ihk, (C25482ixZ) obj);
            }
        }));
        isConnected().AxsJAY().observe(this, new LoaderManager(new Function1() { // from class: o.iRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.EZpvd(ihk, this, (C25479ixW) obj);
            }
        }));
        isConnected().sSMYrx().observe(this, new Observer() { // from class: o.iRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                iQS.AEQbTJ(this.AEQbTJ, obj);
            }
        });
        isConnected().AuCTelauCTel().observe(this, new LoaderManager(new Function1() { // from class: o.iRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(this.copydefault, ihk, (C25536iya) obj);
            }
        }));
        isConnected().fIwbmz().observe(this, new LoaderManager(new Function1() { // from class: o.iRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.KWHzl(ihk, this, (C25537iyb) obj);
            }
        }));
        isConnected().iwGUEr().observe(this, new LoaderManager(new Function1() { // from class: o.iRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AEQbTJ(ihk, (java.lang.Boolean) obj);
            }
        }));
        isConnected().uzCIH().observe(this, new LoaderManager(new Function1() { // from class: o.iRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.djBIcL(ihk, (java.lang.Boolean) obj);
            }
        }));
        isConnected().QfsBiF().observe(this, new LoaderManager(new Function1() { // from class: o.iRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.djBIcL(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        isConnected().flVtFt().observe(this, new LoaderManager(new Function1() { // from class: o.iRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AEQbTJ(this.KWHzl, ihk, (java.lang.Boolean) obj);
            }
        }));
        isConnected().gHZMYf().observe(this, new LoaderManager(new Function1() { // from class: o.iRR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(ihk, (C25480ixX) obj);
            }
        }));
        isConnected().ORxRYg().observe(this, new LoaderManager(new Function1() { // from class: o.iRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.copydefault(ihk, (C25480ixX) obj);
            }
        }));
        AkhnZx().AYXKKw().observe(this, new LoaderManager(new Function1() { // from class: o.iRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt(this.OLrzqt, ihk, (java.lang.Boolean) obj);
            }
        }));
        C27589jxz.collectOnViewLifecycle$default(this, isConnected().DbNXlk(), null, new Activity(ihk), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, isConnected().finit(), null, new TaskDescription(), 2, null);
    }

    public static final Unit copydefault(iQS iqs, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            iqs.showLoading();
        } else {
            iqs.dismissLoading();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) iqs, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(iHK ihk, iQS iqs, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            if (ihk.AubY.getVisibility() != 0) {
                iqs.KWHzl(ihk, true);
            }
            if (Intrinsics.EZpvd(iqs.isConnected().flVtFt().getValue(), java.lang.Boolean.TRUE)) {
                if (iqs.isConnected().dxcTrN()) {
                    iqs.EZpvd(ihk.AhwBna.OLrzqt());
                    C27349jtX.enterEditMode$default(ihk.AhwBna, false, 1, null);
                    C27349jtX.exitEditMode$default(ihk.fARcdN, false, 1, null);
                } else {
                    iqs.EZpvd(ihk.fARcdN.OLrzqt());
                    C27349jtX.enterEditMode$default(ihk.fARcdN, false, 1, null);
                    C27349jtX.exitEditMode$default(ihk.AhwBna, false, 1, null);
                }
            } else {
                C55033xcM c55033xcM = ihk.valueOf;
                Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
                iqs.EZpvd(c55033xcM);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Observer<ResponseState> {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onChanged(ResponseState responseState) {
            Intrinsics.checkNotNullParameter(responseState, "");
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) iQS.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            if (responseState.getErrorType() == ResponseStateType.NET_ERRO) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                return;
            }
            if (responseState.getErrorType() == ResponseStateType.SERVER_ERRRO) {
                java.lang.String errorMsg = responseState.getErrorMsg();
                if (errorMsg == null || errorMsg.length() == 0) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                } else {
                    C55328xhq.show$default(C55328xhq.OLrzqt, responseState.getErrorMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                }
            }
        }
    }

    public static final Unit AEQbTJ(iHK ihk, iQS iqs, InvestAdvancePanelUIBean investAdvancePanelUIBean) {
        C27206jqn c27206jqn = ihk.EZpvd;
        int state = investAdvancePanelUIBean.getState();
        boolean z = investAdvancePanelUIBean.getSubscriptionReceiveInfo() != null;
        InvestSubscriptionInfo investSubscriptionInfo = iqs.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        java.lang.String network = investSubscriptionInfo.getNetwork();
        InvestSubscriptionInfo investSubscriptionInfo2 = iqs.values;
        if (investSubscriptionInfo2 == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo2 = null;
        }
        java.lang.String networkLogo = investSubscriptionInfo2.getNetworkLogo();
        InvestGasPriceConfig value = iqs.isConnected().OLrzqt().getValue();
        java.lang.String strQOLQEE = (value != null ? value.getInvestSlippage() : null) != null ? iqs.isConnected().QOLQEE() : "";
        InvestGasPriceConfig value2 = iqs.isConnected().OLrzqt().getValue();
        c27206jqn.AEQbTJ(state, z, network, networkLogo, strQOLQEE, value2 != null ? java.lang.Boolean.valueOf(C27505jwU.OLrzqt(value2)) : null, (512 & 64) != 0 ? 0 : investAdvancePanelUIBean.getSlippageState(), (512 & 128) != 0 ? "" : investAdvancePanelUIBean.getSlippageTips(), (512 & 256) != 0 ? false : investAdvancePanelUIBean.getSlippageWarn(), (512 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(iHK ihk, iQS iqs, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        C27187jqU c27187jqU = ihk.zLjUOn;
        Intrinsics.copydefault(investSubscriptionReceiveInfoUIBean);
        c27187jqU.setData(investSubscriptionReceiveInfoUIBean);
        if (investSubscriptionReceiveInfoUIBean.isDataErro()) {
            ihk.OLrzqt.KWHzl();
            C27209jqq c27209jqq = ihk.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c27209jqq, "");
            c27209jqq.setVisibility(8);
            C27209jqq c27209jqq2 = ihk.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c27209jqq2, "");
            c27209jqq2.setVisibility(8);
        } else {
            ihk.OLrzqt.setData(investSubscriptionReceiveInfoUIBean.getExchangeBean());
            iqs.AEQbTJ(ihk, investSubscriptionReceiveInfoUIBean.getMaturityTime());
            iqs.OLrzqt(ihk, investSubscriptionReceiveInfoUIBean.getFixedApy());
        }
        iqs.copydefault(ihk, investSubscriptionReceiveInfoUIBean.getReceiveTokenInfo(), investSubscriptionReceiveInfoUIBean.isDataErro());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(iHK ihk, java.lang.Boolean bool) {
        LinearLayoutCompat linearLayoutCompat = ihk.AwvSrB;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(iHK ihk, InvestTransactionLossInfo investTransactionLossInfo) {
        ihk.gHZMYf.setText(investTransactionLossInfo != null ? C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTransactionLossInfo.getTotalTransactionLoss(), null, null, null, 14, null) : null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(iHK ihk, iQS iqs, InvestConsumeData investConsumeData) {
        if (!((java.lang.Boolean) investConsumeData.getData()).booleanValue()) {
            ihk.EZpvd.setSlippageText(iqs.isConnected().QOLQEE());
            InvestSubscriptionNewViewModel.getReceiveInfoAndCheckState$default(iqs.isConnected(), false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final iQS iqs, java.lang.Boolean bool) {
        iHK ihk;
        android.widget.LinearLayout linearLayout;
        if (!bool.booleanValue() && (ihk = iqs.fARcdN) != null && (linearLayout = ihk.AubY) != null) {
            linearLayout.post(new java.lang.Runnable() { // from class: o.iSc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    iQS.fetchVPNInfo(this.copydefault);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(iQS iqs) {
        iHK ihk = iqs.fARcdN;
        Intrinsics.copydefault(ihk);
        iqs.fJNWhG = ihk.AubY.getHeight();
    }

    public static final Unit KWHzl(iQS iqs, InvestSubscriptionNewViewModel.SubscriptionResult subscriptionResult) {
        C26684jgv c26684jgv;
        if (subscriptionResult.copydefault() == 3) {
            iqs.KWHzl(subscriptionResult.OLrzqt(), subscriptionResult.KWHzl());
        }
        int iCopydefault = subscriptionResult.copydefault();
        java.lang.String str = iCopydefault != 3 ? iCopydefault != 4 ? null : EopTrackEvent.CLOSE : "confirm_button";
        if (str != null && (c26684jgv = iqs.zuBGHE) != null) {
            c26684jgv.OLrzqt(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final iQS iqs, final iHK ihk, C23948iPg c23948iPg) {
        iHK ihk2;
        android.widget.LinearLayout linearLayout;
        if (c23948iPg.KWHzl() && !iqs.isConnected().gasjUx()) {
            iqs.KWHzl(ihk, true);
        }
        if (c23948iPg.copydefault()) {
            ihk.valueOf.setPlainNumericText("0");
        } else {
            ihk.valueOf.setPlainNumericText(c23948iPg.OLrzqt());
        }
        if (c23948iPg.EZpvd() && iqs.fJNWhG == 0 && (ihk2 = iqs.fARcdN) != null && (linearLayout = ihk2.AubY) != null) {
            linearLayout.post(new java.lang.Runnable() { // from class: o.iRw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    iQS.copydefault(this.OLrzqt, ihk);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(iQS iqs, iHK ihk) {
        iHK ihk2 = iqs.fARcdN;
        Intrinsics.copydefault(ihk2);
        iqs.fJNWhG = ihk2.AubY.getHeight();
        iqs.OLrzqt(ihk, false);
    }

    public static final Unit KWHzl(iQS iqs, iHK ihk, C23948iPg c23948iPg) {
        if (!iqs.isConnected().dxcTrN()) {
            iqs.isConnected().EZpvd(true);
        }
        iqs.EZpvd(ihk.AhwBna.OLrzqt());
        ihk.AhwBna.OLrzqt().setPlainNumericText(c23948iPg.OLrzqt());
        iqs.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(iQS iqs, iHK ihk, C23948iPg c23948iPg) {
        if (iqs.isConnected().dxcTrN()) {
            iqs.isConnected().EZpvd(false);
        }
        iqs.EZpvd(ihk.fARcdN.OLrzqt());
        ihk.fARcdN.OLrzqt().setPlainNumericText(c23948iPg.OLrzqt());
        iqs.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(iHK ihk, C25481ixY c25481ixY) {
        C27197jqe c27197jqe = ihk.wlaJM;
        Intrinsics.copydefault(c25481ixY);
        c27197jqe.setData(c25481ixY);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(iHK ihk, C25482ixZ c25482ixZ) {
        ihk.AkhnZx.setText(c25482ixZ.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(iHK ihk, iQS iqs, C25479ixW c25479ixW) {
        ihk.values.setTag(java.lang.Integer.valueOf(c25479ixW.EZpvd()));
        if (c25479ixW.EZpvd() == 6 && c25479ixW.AEQbTJ() != null) {
            android.widget.TextView textView = ihk.values;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(iqs.isConnected().gasjUx() ^ true ? 8 : 0);
            int color = ContextCompat.getColor(iqs.requireContext(), C52761wXj.Activity.fhUrPt);
            if (c25479ixW.AEQbTJ().getClickAction().equals(InvestClickActionType.NO_ACTION)) {
                ihk.values.setTextColor(color);
                ihk.values.setText(c25479ixW.AEQbTJ().getTipContent());
                ihk.values.setOnClickListener(null);
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(c25479ixW.AEQbTJ().getTipContent() + " ");
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(iqs.requireContext(), C52761wXj.TaskDescription.GGlJim);
                android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                if (drawableMutate != null) {
                    android.content.Context contextRequireContext = iqs.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    int iCopydefault = C55298xhM.copydefault(16.0f, contextRequireContext);
                    android.content.Context contextRequireContext2 = iqs.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    drawableMutate.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, contextRequireContext2));
                    DrawableCompat.setTint(drawableMutate, color);
                }
                if (drawableMutate != null) {
                    spannableStringBuilder.append(" ", new mAB(drawableMutate, 0, 2, null), 33);
                }
                ihk.values.setTextColor(color);
                ihk.values.setText(spannableStringBuilder);
                FragmentActivity activity = iqs.getActivity();
                if (activity != null) {
                    C27569jxf c27569jxf = C27569jxf.OLrzqt;
                    android.widget.TextView textView2 = ihk.values;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    c27569jxf.AEQbTJ(activity, null, textView2, c25479ixW.AEQbTJ(), (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
                }
            }
        } else {
            ihk.values.setTextColor(ContextCompat.getColor(iqs.requireContext(), C52761wXj.Activity.fhUrPt));
            ihk.values.setText(c25479ixW.KWHzl());
            ihk.values.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(iQS iqs, java.lang.Object obj) {
        iqs.AkhnZx().AEQbTJ().setValue(new java.lang.Object());
    }

    public static final Unit OLrzqt(iQS iqs, iHK ihk, C25536iya c25536iya) {
        if (c25536iya.KWHzl() && C33129mqd.gEmmrt(c25536iya.copydefault().getCoinAmount(), java.lang.Double.valueOf(1.0E-6d))) {
            iqs.zLjUOn();
        } else {
            iqs.AkhnZx().AEQbTJ().setValue(new java.lang.Object());
        }
        C27308jsj c27308jsj = ihk.isConnected;
        Intrinsics.copydefault(c25536iya);
        c27308jsj.setData(c25536iya);
        ihk.valueOf.setMaxDecimalLength(c25536iya.EZpvd());
        ihk.valueOf.setMaxInputLength(30);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(iHK ihk, iQS iqs, C25537iyb c25537iyb) {
        if (c25537iyb.AEQbTJ()) {
            C27200jqh.setData$default(ihk.zsXlph, c25537iyb.KWHzl(), iqs.DbNXlk, false, false, null, 28, null);
            C27138jpY.setData$default(ihk.iwGUEr, c25537iyb.KWHzl(), iqs.DbNXlk, false, false, null, 28, null);
        } else if (c25537iyb.EZpvd()) {
            ihk.zsXlph.copydefault(c25537iyb.KWHzl(), iqs.DbNXlk, true);
            ihk.iwGUEr.copydefault(c25537iyb.KWHzl(), iqs.DbNXlk, true);
        } else {
            ihk.zsXlph.copydefault(c25537iyb.KWHzl(), iqs.DbNXlk, false);
            ihk.iwGUEr.copydefault(c25537iyb.KWHzl(), iqs.DbNXlk, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(iHK ihk, java.lang.Boolean bool) {
        ihk.uzCIH.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(iHK ihk, java.lang.Boolean bool) {
        C27349jtX c27349jtX = ihk.AhwBna;
        Intrinsics.copydefault(bool);
        c27349jtX.setIntercept(bool.booleanValue());
        ihk.fARcdN.setIntercept(bool.booleanValue());
        if (bool.booleanValue()) {
            ihk.zsXlph.KWHzl();
        } else {
            ihk.zsXlph.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(iQS iqs, java.lang.Boolean bool) {
        if (bool.booleanValue() && !SPUtils.getBoolean("sp_invest_select_coin_reminder_dialog_never_show", false)) {
            iUD iud = new iUD();
            if (iqs.getActivity() != null) {
                iud.show(iqs.requireActivity().getSupportFragmentManager(), iUD.class.getName());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(iQS iqs, iHK ihk, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(iqs.isConnected().ejfBZ().getValue(), java.lang.Boolean.TRUE)) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(bool);
        iqs.copydefault(ihk, bool.booleanValue());
        iqs.isConnected().accept();
        if (!iqs.isConnected().gasjUx()) {
            iqs.KWHzl(ihk, true);
        }
        if (bool.booleanValue()) {
            if (iqs.isConnected().dxcTrN()) {
                iqs.EZpvd(ihk.AhwBna.OLrzqt());
                C27349jtX.enterEditMode$default(ihk.AhwBna, false, 1, null);
                C27349jtX.exitEditMode$default(ihk.fARcdN, false, 1, null);
                if (ihk.AhwBna.OLrzqt().valueOf().length() == 0) {
                    ihk.AhwBna.OLrzqt().setPlainNumericText("0");
                }
                if (ihk.fARcdN.OLrzqt().valueOf().length() == 0) {
                    ihk.fARcdN.OLrzqt().setPlainNumericText("0");
                }
            } else {
                iqs.EZpvd(ihk.fARcdN.OLrzqt());
                C27349jtX.enterEditMode$default(ihk.fARcdN, false, 1, null);
                C27349jtX.exitEditMode$default(ihk.AhwBna, false, 1, null);
                if (ihk.AhwBna.OLrzqt().valueOf().length() == 0) {
                    ihk.AhwBna.OLrzqt().setPlainNumericText("0");
                }
                if (ihk.fARcdN.OLrzqt().valueOf().length() == 0) {
                    ihk.fARcdN.OLrzqt().setPlainNumericText("0");
                }
            }
        } else {
            C55033xcM c55033xcM = ihk.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
            iqs.EZpvd(c55033xcM);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(iHK ihk, C25480ixX c25480ixX) {
        C27349jtX c27349jtX = ihk.AhwBna;
        Intrinsics.copydefault(c25480ixX);
        c27349jtX.AEQbTJ(c25480ixX);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(iHK ihk, C25480ixX c25480ixX) {
        C27349jtX c27349jtX = ihk.fARcdN;
        Intrinsics.copydefault(c25480ixX);
        c27349jtX.AEQbTJ(c25480ixX);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final iQS iqs, final iHK ihk, java.lang.Boolean bool) {
        if (iqs.fetchVPNInfo) {
            iqs.showLoading();
            iqs.isConnected().AEQbTJ(true ^ iqs.AkhnZx().AhwBna(), new Function1() { // from class: o.iRp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iQS.copydefault(this.KWHzl, ihk, (Bitmap) obj);
                }
            });
        } else {
            iqs.isConnected().flVtFt().setValue(java.lang.Boolean.valueOf(iqs.AkhnZx().AhwBna()));
            iqs.isConnected().gkJEwt();
            iqs.AkhnZx().AEQbTJ(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(iQS iqs, iHK ihk, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        iqs.dismissLoading();
        if (bitmap instanceof Bitmap.StateListAnimator) {
            iqs.fetchVPNInfo = false;
            iqs.isConnected().gkJEwt();
            if (ihk.AubY.getVisibility() != 0) {
                showKeyboardLayout$default(iqs, ihk, false, 2, null);
            }
            iqs.AkhnZx().AEQbTJ(true);
        } else {
            iqs.AkhnZx().AEQbTJ(false);
            C27577jxn c27577jxn = C27577jxn.copydefault;
            java.lang.Object objOLrzqt = bitmap.OLrzqt();
            Intrinsics.copydefault(objOLrzqt);
            C55326xho.toast$default(c27577jxn.OLrzqt((java.lang.Throwable) objOLrzqt), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ iHK OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(iHK ihk) {
            this.OLrzqt = ihk;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            this.OLrzqt.KWHzl.setButtonState(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXD ixd, Continuation<? super Unit> continuation) {
            iQS.this.OLrzqt(ixd);
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(iHK ihk, boolean z) {
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        android.animation.ObjectAnimator objectAnimatorOfFloat2;
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(300L);
        if (z) {
            ihk.AuCTelauCTel.setVisibility(0);
        } else {
            ihk.getNewProxyInstance.setVisibility(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z) {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(ihk.getNewProxyInstance, "alpha", 1.0f, 0.0f);
        } else {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(ihk.getNewProxyInstance, "alpha", 0.0f, 1.0f);
        }
        arrayList.add(objectAnimatorOfFloat);
        if (z) {
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(ihk.AuCTelauCTel, "alpha", 0.0f, 1.0f);
        } else {
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(ihk.AuCTelauCTel, "alpha", 1.0f, 0.0f);
        }
        arrayList.add(objectAnimatorOfFloat2);
        duration.addListener(new Dialog(z, ihk));
        duration.playTogether(arrayList);
        duration.start();
    }

    public static final class Dialog implements Animator.AnimatorListener {
        public final /* synthetic */ iHK EZpvd;
        public final /* synthetic */ boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Dialog(boolean z, iHK ihk) {
            this.OLrzqt = z;
            this.EZpvd = ihk;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.OLrzqt) {
                this.EZpvd.getNewProxyInstance.setVisibility(8);
            } else {
                this.EZpvd.AuCTelauCTel.setVisibility(8);
            }
        }
    }

    public final void getFieldNames() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, null, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RAQtXZ), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.aJZHYI), null, null, null, false, 1978, null);
        }
    }

    public final void wlaJM() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27496jwL c27496jwL = C27496jwL.EZpvd;
            InvestSubscriptionInfo investSubscriptionInfo = this.values;
            if (investSubscriptionInfo == null) {
                Intrinsics.gEmmrt("");
                investSubscriptionInfo = null;
            }
            java.lang.String lockRedeemTip = investSubscriptionInfo.getLockRedeemTip();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.ORWKdN);
            if (lockRedeemTip != null && lockRedeemTip.length() != 0) {
                strAYXKKw = lockRedeemTip;
            }
            C27496jwL.showDialog$default(c27496jwL, activity, null, strAYXKKw, null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.aQtmcU), null, null, null, false, 1978, null);
        }
    }

    public final void uzCIH() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, null, C33070mpX.AYXKKw(C25493ixk.FragmentManager.fkESqH), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.aJZHYI), null, null, null, false, 1978, null);
        }
    }

    public final void AuCTelauCTel() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, C33070mpX.AYXKKw(C25493ixk.FragmentManager.GQzpsZ), C33070mpX.AYXKKw(C25493ixk.FragmentManager.GPCHlQ), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.aJZHYI), null, null, null, false, 1976, null);
        }
    }

    public static /* synthetic */ void showKeyboardLayout$default(iQS iqs, iHK ihk, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        iqs.KWHzl(ihk, z);
    }

    public final void KWHzl(final iHK ihk, boolean z) {
        isConnected().AEQbTJ(TransactionStage.INPUT);
        fJNWhG();
        EZpvd(ihk, z);
        KWHzl(ihk);
        if (z) {
            ihk.AubY.setAlpha(0.0f);
            ihk.AubY.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = ihk.AYXKKw.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((ConstraintLayout.LayoutParams) layoutParams).bottomToTop = C25493ixk.ActionBar.QfgJNx;
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(new android.view.animation.LinearInterpolator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.iRo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    iQS.KWHzl(ihk, valueAnimator);
                }
            });
            duration.start();
        } else {
            ihk.AubY.setVisibility(0);
            ihk.AubY.setAlpha(1.0f);
            ViewGroup.LayoutParams layoutParams2 = ihk.AYXKKw.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ((ConstraintLayout.LayoutParams) layoutParams2).bottomToTop = C25493ixk.ActionBar.QfgJNx;
            ihk.hDKMBd.setVisibility(8);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestSubscriptionNewFragment$showKeyboardLayout$2(this, ihk, null), 3, null);
    }

    public static final void KWHzl(iHK ihk, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.widget.LinearLayout linearLayout = ihk.AubY;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        linearLayout.setAlpha(((java.lang.Float) animatedValue).floatValue());
        ConstraintLayout constraintLayout = ihk.hDKMBd;
        java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        constraintLayout.setAlpha(1.0f - ((java.lang.Float) animatedValue2).floatValue());
        java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue3, "");
        if (((java.lang.Float) animatedValue3).floatValue() == 1.0f) {
            ihk.hDKMBd.setVisibility(8);
        }
    }

    public static /* synthetic */ void showConfirmLayout$default(iQS iqs, iHK ihk, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        iqs.OLrzqt(ihk, z);
    }

    public final void OLrzqt(final iHK ihk, boolean z) {
        isConnected().AEQbTJ(TransactionStage.CONFIRMATION);
        djBIcL();
        boolean zGGvvIC = isConnected().gGvvIC();
        AYXKKw();
        copydefault(ihk, z, zGGvvIC);
        KWHzl(ihk);
        if (z) {
            if ((!zGGvvIC && ihk.getNewProxyInstance.getHeight() < ihk.fJNWhG.getHeight()) || (zGGvvIC && ihk.AuCTelauCTel.getHeight() < ihk.DbNXlk.getHeight())) {
                ViewGroup.LayoutParams layoutParams = ihk.AYXKKw.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ((ConstraintLayout.LayoutParams) layoutParams).bottomToTop = -1;
            }
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(new android.view.animation.LinearInterpolator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.iSp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    iQS.copydefault(ihk, valueAnimator);
                }
            });
            duration.start();
            ihk.hDKMBd.setAlpha(0.0f);
            ihk.hDKMBd.setVisibility(0);
            return;
        }
        if ((!zGGvvIC && ihk.getNewProxyInstance.getHeight() < ihk.fJNWhG.getHeight()) || (zGGvvIC && ihk.AuCTelauCTel.getHeight() < ihk.DbNXlk.getHeight())) {
            ViewGroup.LayoutParams layoutParams2 = ihk.AYXKKw.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ((ConstraintLayout.LayoutParams) layoutParams2).bottomToTop = -1;
        }
        ihk.AubY.setAlpha(0.0f);
        ihk.AubY.setVisibility(4);
        ihk.hDKMBd.setVisibility(0);
    }

    public static final void copydefault(iHK ihk, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.widget.LinearLayout linearLayout = ihk.AubY;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        linearLayout.setAlpha(((java.lang.Float) animatedValue).floatValue());
        java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        if (((java.lang.Float) animatedValue2).floatValue() == 0.0f) {
            ihk.AubY.setVisibility(4);
        }
        ConstraintLayout constraintLayout = ihk.hDKMBd;
        java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue3, "");
        constraintLayout.setAlpha(1.0f - ((java.lang.Float) animatedValue3).floatValue());
    }

    private final void KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        java.lang.String strDjBIcL;
        java.lang.String strHDKMBd;
        java.util.ArrayList arrayListCopydefault;
        ejfBZ();
        java.lang.String tokenAddress = !investTokenWithAmount.isBaseToken() ? investTokenWithAmount.getTokenAddress() : "";
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(this.AwvSrB);
        if (interfaceC9738bbJOLrzqt == null || (strDjBIcL = interfaceC9738bbJOLrzqt.djBIcL(investTokenWithAmount.getChainId())) == null) {
            strDjBIcL = "0";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(this.AwvSrB);
        if (interfaceC9738bbJOLrzqt2 == null || (strHDKMBd = interfaceC9738bbJOLrzqt2.hDKMBd()) == null) {
            strHDKMBd = "0";
        }
        boolean z = (C33129mqd.AEQbTJ(strDjBIcL, "0") || C33129mqd.AEQbTJ(strHDKMBd, "0")) ? false : true;
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC23916iOb.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(investTokenWithAmount.getChainId()));
        if (z) {
            arrayListCopydefault = yDY.copydefault("dex", "gas_station");
        } else {
            arrayListCopydefault = yDY.copydefault("gas_station");
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(strGEmmrt, tokenAddress, "yield", "balance", arrayListCopydefault, (java.util.ArrayList) null, true, (java.lang.String) null, 0, 416, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    public final void AubY() {
        InvestTokenWithAmount investTokenWithAmountAuCTel = isConnected().AuCTel();
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, contextRequireContext, "okx://wallet/nft/featured?jumpType=jump&page=brc20_collections&brc20Id=" + investTokenWithAmountAuCTel.getTokenSymbol(), null, new Function1() { // from class: o.iSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showFarmGuidePoolDialog$default(iQS iqs, long j, long j2, long j3, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        iqs.copydefault(j, j2, j3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str);
    }

    private final void copydefault(final long j, final long j2, final long j3, final boolean z, java.lang.String str) {
        java.lang.String strAYXKKw;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (str == null || (strAYXKKw = C33069mpW.copydefault(this, C25493ixk.FragmentManager.OAhWiU, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("productType", str)))) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.GLcwwN);
            }
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, getString(C25493ixk.FragmentManager.DBAlnt), strAYXKKw, null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.dbUqJD), new Function0() { // from class: o.iRk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iQS.OLrzqt(this.AEQbTJ, j, z, j3, j2);
                }
            }, null, null, false, 1848, null);
        }
    }

    public static final Unit OLrzqt(iQS iqs, long j, boolean z, long j2, long j3) {
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        android.content.Context contextRequireContext = iqs.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c27508jwX.OLrzqt(contextRequireContext, j, (992 & 4) != 0 ? true : z, (992 & 8) != 0 ? null : null, (992 & 16) != 0 ? 0L : j2, (992 & 32) != 0 ? null : java.lang.Long.valueOf(j3), (992 & 64) != 0 ? null : null, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public final void zLjUOn() {
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iEZpvd = c33566myq.EZpvd(contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iCopydefault = (iEZpvd - C55298xhM.copydefault(235.0f, contextRequireContext2)) / 2;
        FragmentActivity activity = getActivity();
        iHK ihk = this.fARcdN;
        mAE.OLrzqt(activity, ihk != null ? ihk.isConnected : null, AnchorPopupWindow.Style.Gray, C33070mpX.AYXKKw(C25493ixk.FragmentManager.invokespecialaVhqwO), AnchorPopupWindow.VerticalPosition.BELOW, true, 0, 0, 1, 17, new android.graphics.Rect(iCopydefault, 0, iCopydefault, 0), new android.graphics.Rect(0, 0, 0, 0), new int[]{0, 0}).setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.iSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                iQS.fJNWhG(this.OLrzqt);
            }
        });
    }

    public static final void fJNWhG(iQS iqs) {
        iqs.AkhnZx().AEQbTJ().setValue(new java.lang.Object());
    }

    private final void zuBGHE() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, null, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DPHNDa), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DPhTBN), null, null, null, false, 1978, null);
        }
    }

    public static /* synthetic */ void showMultiConfirmLayout$default(iQS iqs, iHK ihk, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        iqs.copydefault(ihk, z, z2);
    }

    public final void copydefault(iHK ihk, boolean z, boolean z2) {
        isConnected().KWHzl(false);
        if (z2) {
            ihk.AhwBna.AEQbTJ(z);
            ihk.fARcdN.AEQbTJ(z);
        }
    }

    public final void KWHzl(iHK ihk) {
        android.widget.TextView textView = ihk.values;
        java.lang.Object tag = textView.getTag();
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 5)) {
            Intrinsics.copydefault(textView);
            textView.setVisibility(isConnected().gasjUx() ^ true ? 0 : 8);
        } else if (Intrinsics.EZpvd(tag, (java.lang.Object) 7)) {
            Intrinsics.copydefault(textView);
            textView.setVisibility(isConnected().gasjUx() ? 0 : 8);
        } else {
            Intrinsics.copydefault(textView);
            textView.setVisibility(0);
        }
    }

    public static /* synthetic */ void showMultiKeyboardLayout$default(iQS iqs, iHK ihk, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        iqs.EZpvd(ihk, z);
    }

    public final void EZpvd(iHK ihk, boolean z) {
        isConnected().KWHzl(true);
        if (isConnected().gGvvIC()) {
            if (isConnected().dxcTrN()) {
                EZpvd(ihk.AhwBna.OLrzqt());
                ihk.fARcdN.EZpvd(z);
                return;
            } else {
                EZpvd(ihk.fARcdN.OLrzqt());
                ihk.AhwBna.EZpvd(z);
                return;
            }
        }
        C55033xcM c55033xcM = ihk.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55033xcM, "");
        EZpvd(c55033xcM);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Full_Page_View", null, new Function1() { // from class: o.iSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.EZpvd((EventParamsList) obj);
            }
        }, 1, null);
    }

    public final void fARcdN() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Full_Button_Click", null, new Function1() { // from class: o.iRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.AYXKKw(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AYXKKw(iQS iqs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(iqs.AuCTel)), false);
        InvestSubscriptionInfo investSubscriptionInfo = iqs.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(investSubscriptionInfo.getChainId())), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "select_coins", true);
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Full_Button_Click", null, new Function1() { // from class: o.iRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.djBIcL(this.copydefault, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit djBIcL(iQS iqs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(iqs.AuCTel)), false);
        InvestSubscriptionInfo investSubscriptionInfo = iqs.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(investSubscriptionInfo.getChainId())), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "max", true);
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        C27570jxg.investEvent$default("YieldDepositNumpad_Full_Button_Click", null, new Function1() { // from class: o.iSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.valueOf(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit valueOf(iQS iqs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("investment_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(iqs.AuCTel)), false);
        InvestSubscriptionInfo investSubscriptionInfo = iqs.values;
        if (investSubscriptionInfo == null) {
            Intrinsics.gEmmrt("");
            investSubscriptionInfo = null;
        }
        eventParamsList.put("chain_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(investSubscriptionInfo.getChainId())), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "next_button", true);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C27570jxg.investEvent$default("YieldDepositConfirm_Full_Page_View", null, new Function1() { // from class: o.iSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iQS.KWHzl(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(iQS iqs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strAwvSrB = iqs.AwvSrB();
        if (strAwvSrB != null) {
            eventParamsList.put("source", strAwvSrB, false);
        }
        return Unit.INSTANCE;
    }

    public final void values() {
        C26684jgv c26684jgv = this.zuBGHE;
        if (c26684jgv != null) {
            c26684jgv.OLrzqt("select_coins", TransactionStage.CONFIRMATION, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
        }
    }

    public final void gEmmrt() {
        C26684jgv c26684jgv = this.zuBGHE;
        if (c26684jgv != null) {
            c26684jgv.OLrzqt("invest_process", TransactionStage.CONFIRMATION, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
        }
    }

    public final void fetchVPNInfo() {
        C26684jgv c26684jgv = this.zuBGHE;
        if (c26684jgv != null) {
            c26684jgv.OLrzqt("slippage", TransactionStage.CONFIRMATION, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
        }
    }

    public final void ejfBZ() {
        C26684jgv c26684jgv = this.zuBGHE;
        if (c26684jgv != null) {
            c26684jgv.AEQbTJ();
        }
    }

    public final void OLrzqt(long j) {
        AkhnZx().EZpvd(j, 1, this.sSMYrx);
    }

    public final void AEQbTJ(iHK ihk, java.lang.String str) {
        if (str == null || str.length() == 0) {
            C27209jqq c27209jqq = ihk.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c27209jqq, "");
            c27209jqq.setVisibility(8);
            return;
        }
        C27209jqq c27209jqq2 = ihk.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c27209jqq2, "");
        c27209jqq2.setVisibility(0);
        android.content.Context context = ihk.ejfBZ.getContext();
        java.lang.String string = context.getString(C25493ixk.FragmentManager.jNexW);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Intrinsics.copydefault(context);
        ihk.ejfBZ.OLrzqt(new C27209jqq.ActionBar(string, C33069mpW.KWHzl(context, C25493ixk.FragmentManager.QKDJJA, C27492jwH.OLrzqt.EZpvd(C33129mqd.valueOf(str))), 0, new View.OnClickListener() { // from class: o.iSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.AEQbTJ(view);
            }
        }, false, 20, null));
    }

    public static final void AEQbTJ(android.view.View view) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(view.getContext());
        if (activityOLrzqt != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityOLrzqt);
            viewOnClickListenerC54939xaY.EZpvd(activityOLrzqt.getString(C25493ixk.FragmentManager.gsvlRV));
            java.lang.String string = activityOLrzqt.getString(C25493ixk.FragmentManager.OHqIaq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.iRj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    iQS.KWHzl(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(iHK ihk, java.lang.String str) {
        if (str == null || str.length() == 0) {
            C27209jqq c27209jqq = ihk.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c27209jqq, "");
            c27209jqq.setVisibility(8);
            return;
        }
        C27209jqq c27209jqq2 = ihk.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c27209jqq2, "");
        c27209jqq2.setVisibility(0);
        java.lang.String string = ihk.djBIcL.getContext().getString(C25493ixk.FragmentManager.QWpYiD);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ihk.djBIcL.OLrzqt(new C27209jqq.ActionBar(string, C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, str, false, 2, null), 0, new View.OnClickListener() { // from class: o.iRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.KWHzl(view);
            }
        }, false, 20, null));
    }

    public static final void KWHzl(android.view.View view) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(view.getContext());
        if (activityOLrzqt != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityOLrzqt);
            viewOnClickListenerC54939xaY.EZpvd(activityOLrzqt.getString(C25493ixk.FragmentManager.dbwnZN));
            java.lang.String string = activityOLrzqt.getString(C25493ixk.FragmentManager.OHqIaq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.iSg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    iQS.OLrzqt(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void handleSubscriptionReceivePanel$default(iQS iqs, iHK ihk, InvestTokenWithAmount investTokenWithAmount, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        iqs.copydefault(ihk, investTokenWithAmount, z);
    }

    public final void copydefault(iHK ihk, InvestTokenWithAmount investTokenWithAmount, boolean z) {
        android.content.Context context = ihk.AxsJAY.getContext();
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        java.lang.String coinAmount = investTokenWithAmount != null ? investTokenWithAmount.getCoinAmount() : null;
        if (coinAmount == null || coinAmount.length() == 0) {
            coinAmount = "0";
        }
        java.lang.String strLimitFmtNoZeroAndUpWithKMB$default = C27492jwH.limitFmtNoZeroAndUpWithKMB$default(c27492jwH, coinAmount, 6, 2, false, 8, null);
        java.lang.String tokenSymbol = investTokenWithAmount != null ? investTokenWithAmount.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        java.lang.String str = strLimitFmtNoZeroAndUpWithKMB$default + " " + tokenSymbol;
        java.lang.String string = context.getString(C25493ixk.FragmentManager.QCjLjM);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (z) {
            java.lang.String tokenSymbol2 = investTokenWithAmount != null ? investTokenWithAmount.getTokenSymbol() : null;
            if (tokenSymbol2 == null) {
                tokenSymbol2 = "";
            }
            str = "-- " + tokenSymbol2;
        }
        ihk.AxsJAY.OLrzqt(new C27209jqq.ActionBar(string, str, 0, new View.OnClickListener() { // from class: o.iSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iQS.AhwBna(view);
            }
        }, false, 20, null));
        C27209jqq c27209jqq = ihk.AxsJAY;
        Intrinsics.checkNotNullExpressionValue(c27209jqq, "");
        c27209jqq.setVisibility(investTokenWithAmount != null ? 0 : 8);
    }

    public static final void AhwBna(android.view.View view) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(view.getContext());
        if (activityOLrzqt != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityOLrzqt);
            viewOnClickListenerC54939xaY.EZpvd(activityOLrzqt.getString(C25493ixk.FragmentManager.RqmePg));
            java.lang.String string = activityOLrzqt.getString(C25493ixk.FragmentManager.OHqIaq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.iSs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    iQS.valueOf(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        if (isConnected().gasjUx()) {
            return false;
        }
        isConnected().hDKMBd().setValue(java.lang.Boolean.TRUE);
        AkhnZx().djBIcL().setValue(java.lang.Boolean.valueOf(isConnected().wlaJM() == 7));
        return true;
    }

    private final void gHZMYf() {
        final iHK ihk = this.fARcdN;
        if (ihk != null) {
            ihk.KWHzl.AEQbTJ();
            isConnected().copydefault(new Function0() { // from class: o.iRg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iQS.fARcdN(this.AEQbTJ);
                }
            }, new Function0() { // from class: o.iRd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iQS.gEmmrt(this.AEQbTJ, ihk);
                }
            });
        }
    }

    public static final Unit fARcdN(iQS iqs) {
        InvestSubscriptionNewViewModel.settleTransaction$default(iqs.isConnected(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(iQS iqs, iHK ihk) {
        iqs.KWHzl(ihk, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final iXD ixd) {
        java.lang.Throwable thOLrzqt;
        android.content.Context context = getContext();
        if (context != null) {
            if (ixd instanceof iXD.ActionBar) {
                C27508jwX.AEQbTJ.EZpvd(context, ((iXD.ActionBar) ixd).EZpvd(), new Function1() { // from class: o.iSv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return iQS.OLrzqt(this.EZpvd, ixd, (android.os.Bundle) obj);
                    }
                }, new Function1() { // from class: o.iSu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return iQS.OLrzqt(ixd, (NewCallbackBean) obj);
                    }
                }, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) null);
                return;
            }
            if (!(ixd instanceof iXD.TaskDescription) || (thOLrzqt = ((iXD.TaskDescription) ixd).OLrzqt()) == null) {
                return;
            }
            if ((thOLrzqt instanceof OKServerException) && ((OKServerException) thOLrzqt).getCode() == 111000111) {
                iUZ.Companion.OLrzqt(new iUZ.TaskDescription() { // from class: o.iSw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.iUZ.TaskDescription
                    public final void KWHzl() {
                        iQS.DbNXlk(this.AEQbTJ);
                    }
                }).show(getChildFragmentManager(), iUZ.class.getSimpleName());
                return;
            }
            java.lang.String message = thOLrzqt.getMessage();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) message)) {
                message = null;
            }
            if (message == null) {
                message = C43422row.OLrzqt();
            }
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final Unit OLrzqt(iQS iqs, iXD ixd, android.os.Bundle bundle) {
        iqs.copydefault(bundle, ((iXD.ActionBar) ixd).copydefault().getOrderType());
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(iXD ixd, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        iXD.ActionBar actionBar = (iXD.ActionBar) ixd;
        return actionBar.OLrzqt().invoke(newCallbackBean, actionBar.copydefault());
    }

    public static final void DbNXlk(iQS iqs) {
        iqs.isConnected().AEQbTJ(true);
    }

    private final void copydefault(android.os.Bundle bundle, int i) {
        C27131jpR c27131jpR;
        C27131jpR c27131jpR2;
        C27131jpR c27131jpR3;
        if (bundle == null || bundle.getInt("result") != -1) {
            iHK ihk = this.fARcdN;
            if (ihk == null || (c27131jpR = ihk.KWHzl) == null) {
                return;
            }
            c27131jpR.copydefault();
            return;
        }
        if (InvestTradeManager.OLrzqt.AEQbTJ(i)) {
            iHK ihk2 = this.fARcdN;
            if (ihk2 != null && (c27131jpR3 = ihk2.KWHzl) != null) {
                c27131jpR3.AEQbTJ();
            }
            isConnected().AEQbTJ(bundle);
            return;
        }
        iHK ihk3 = this.fARcdN;
        if (ihk3 != null && (c27131jpR2 = ihk3.KWHzl) != null) {
            c27131jpR2.copydefault();
        }
        KWHzl(bundle, isConnected().djSkpj());
    }

    public final void KWHzl(android.os.Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, activity, bundle, transactionResultExtraData, isConnected().AubY(), null, null, 24, null);
            activity.finish();
        }
    }

    public iQS() {
        PictureInPictureParams pictureInPictureParams = new PictureInPictureParams("invest-tx-status-toast", PendingIntent.KWHzl);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.InvestSubscriptionNewFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.InvestSubscriptionNewFragment$special$$inlined$viewModels$default$2
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C23611iCu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.InvestSubscriptionNewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.InvestSubscriptionNewFragment$special$$inlined$viewModels$default$4
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
        }, pictureInPictureParams);
        this.iwGUEr = new Observer() { // from class: o.iSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                iQS.AEQbTJ(this.copydefault, (InvestTransactionModel) obj);
            }
        };
        this.isConnected = new Function2() { // from class: o.iSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return iQS.KWHzl(this.EZpvd, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        this.getFieldNames = new Function2() { // from class: o.iSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return iQS.OLrzqt(this.AEQbTJ, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        this.AubY = new Function2() { // from class: o.iSt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return iQS.AYXKKw(this.KWHzl, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
    }
}
