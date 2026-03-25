package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.finality_provider.InvestFinalityProviderItem;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenFragment;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$collectFlows$$inlined$filter$1$2$1;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$initView$1;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$onInputChange$1;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$transactionDetailAdapter$2$1;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolViewModel;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorTrxType;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C25493ixk;
import o.C26640jgD;
import o.InterfaceC24178iXu;
import o.InterfaceC24182iXy;
import o.InterfaceC26680jgr;
import o.InterfaceC54829xWw;
import o.iPO;
import o.iUX;
import o.iVM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26640jgD extends AbstractC26685jgw implements InterfaceC33040mou, InterfaceC26609jfZ, InterfaceC27520jwj, iPT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public iHN AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public long DbNXlk;
    public InitialInfoModel values;
    public final int fetchVPNInfo = C25493ixk.Activity.QUSxYX;
    public final boolean fARcdN = true;
    public final MutableSharedFlow<iXB> isConnected = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.jgH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26640jgD.AkhnZx(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.jgD$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DetailItemType.values().length];
            try {
                iArr[DetailItemType.NETWORK_FEE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DetailItemType.FINALITY_PROVIDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[TransactionMethod.values().length];
            try {
                iArr2[TransactionMethod.SINGLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransactionMethod.MULTI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.jgD$AssistContent */
    public static final /* synthetic */ class AssistContent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(Function1 function1) {
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
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.jgD$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements Flow<InitialInfoModel> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C26640jgD OLrzqt;

        /* JADX INFO: renamed from: o.jgD$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C26640jgD KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C26640jgD c26640jgD) {
                this.copydefault = flowCollector;
                this.KWHzl = c26640jgD;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                InvestSubscriptionFragment$collectFlows$$inlined$filter$1$2$1 investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1;
                if (continuation instanceof InvestSubscriptionFragment$collectFlows$$inlined$filter$1$2$1) {
                    investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1 = (InvestSubscriptionFragment$collectFlows$$inlined$filter$1$2$1) continuation;
                    int i = investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1 = new InvestSubscriptionFragment$collectFlows$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (!Intrinsics.EZpvd((InitialInfoModel) obj, this.KWHzl.values)) {
                        investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, investSubscriptionFragment$collectFlows$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, C26640jgD c26640jgD) {
            this.KWHzl = flow;
            this.OLrzqt = c26640jgD;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super InitialInfoModel> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public C26640jgD() {
        final Function0 function0 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestSubscriptionProtocolViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionFragment$special$$inlined$activityViewModels$default$3
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

    public final InvestSubscriptionProtocolViewModel getFieldNames() {
        return (InvestSubscriptionProtocolViewModel) this.AkhnZx.getValue();
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public TransactionConfig valueOf() {
        TransactionConfig transactionConfig;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (transactionConfig = (TransactionConfig) arguments.getParcelable("key.trx_config")) == null) {
            throw new java.lang.IllegalArgumentException("TransactionConfig not Provided.");
        }
        return transactionConfig;
    }

    public final TransactionConfig fJNWhG() {
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
        Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
        return ((C26661jgY) abstractC24170iXmFetchVPNInfo).values();
    }

    /* JADX INFO: renamed from: o.jgD$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jgD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26640jgD OLrzqt(@NotNull TransactionConfig transactionConfig) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            C26640jgD c26640jgD = new C26640jgD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trx_config", transactionConfig);
            c26640jgD.setArguments(bundle);
            return c26640jgD;
        }
    }

    public final iHN ejfBZ() {
        iHN ihn = this.AhwBna;
        Intrinsics.copydefault(ihn);
        return ihn;
    }

    private final InterfaceC9738bbJ AwvSrB() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(aU_().gEmmrt().copydefault());
    }

    public final C26676jgn getNewProxyInstance() {
        return (C26676jgn) this.fJNWhG.getValue();
    }

    public static final C26676jgn AkhnZx(final C26640jgD c26640jgD) {
        return new C26676jgn(new InvestSubscriptionFragment$transactionDetailAdapter$2$1(c26640jgD), new Function1() { // from class: o.jgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26640jgD.KWHzl(this.AEQbTJ, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }, null, new Function0() { // from class: o.jgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26640jgD.fetchVPNInfo(this.OLrzqt);
            }
        }, null, new Function1() { // from class: o.jgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26640jgD.copydefault(this.OLrzqt, (InterfaceC24178iXu.TaskDescription) obj);
            }
        }, null, c26640jgD.fARcdN, 84, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iVM.ActionBar.newInstance$default(o.iVM$ActionBar, com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean, int, int, java.lang.Object):o.iVM */
    public static final Unit KWHzl(C26640jgD c26640jgD, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
        iVM.ActionBar.newInstance$default(iVM.Companion, investSubscriptionReceiveInfoUIBean, 0, 2, null).show(c26640jgD.getChildFragmentManager(), "javaClass");
        BaseTransactionFragment.trackButtonClick$default(c26640jgD, "invest_process", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C26640jgD c26640jgD) {
        c26640jgD.isConnected();
        BaseTransactionFragment.trackButtonClick$default(c26640jgD, "slippage", null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C26640jgD c26640jgD, InterfaceC24178iXu.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c26640jgD.OLrzqt(taskDescription);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(InterfaceC24178iXu.TaskDescription taskDescription) {
        NetworkFee networkFee;
        iXC ixcAEQbTJ;
        java.util.List<InvestValidatorListItems> listFARcdN;
        int i = ActionBar.KWHzl[taskDescription.EZpvd().ordinal()];
        if (i == 1) {
            InvestGasPriceConfig value = fetchVPNInfo().OLrzqt().getValue();
            if (value == null || (networkFee = value.getNetworkFee()) == null) {
                return;
            }
            OLrzqt(networkFee);
            BaseTransactionFragment.trackButtonClick$default(this, "network_fee", null, null, null, 14, null);
            return;
        }
        if (i != 2 || (ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue())) == null || (listFARcdN = ixcAEQbTJ.fARcdN()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
        java.util.Iterator<T> it = listFARcdN.iterator();
        while (it.hasNext()) {
            arrayList.add(iPN.OLrzqt((InvestValidatorListItems) it.next()));
        }
        InvestValidatorListItems investValidatorListItemsValues = ixcAEQbTJ.values();
        copydefault(arrayList, investValidatorListItemsValues != null ? iPN.OLrzqt(investValidatorListItemsValues) : null);
    }

    @Override // o.InterfaceC26609jfZ
    public void OLrzqt(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        InvestTokenWithAmount investTokenWithAmount2;
        InvestTokenWithAmount investTokenWithAmountDjBIcL;
        java.util.List<InvestTokenWithAmount> listUzCIH;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        InitialInfoModel value = fetchVPNInfo().gEmmrt().getValue();
        java.lang.String tokenAddress = null;
        InitialInfoModel.InvestInitialInfo investInitialInfo = value instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) value : null;
        if (investInitialInfo == null || (listUzCIH = investInitialInfo.uzCIH()) == null) {
            investTokenWithAmount2 = null;
        } else {
            java.util.Iterator<T> it = listUzCIH.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                        break;
                    }
                }
            }
            investTokenWithAmount2 = (InvestTokenWithAmount) next;
        }
        if (investTokenWithAmount2 == null) {
            fetchVPNInfo().KWHzl("sp_invest_select_coin_reminder_dialog_never_show");
        }
        java.lang.String tokenAddress2 = investTokenWithAmount.getTokenAddress();
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value2 != null && (investTokenWithAmountDjBIcL = value2.djBIcL()) != null) {
            tokenAddress = investTokenWithAmountDjBIcL.getTokenAddress();
        }
        if (Intrinsics.EZpvd((java.lang.Object) tokenAddress2, (java.lang.Object) tokenAddress)) {
            return;
        }
        copydefault("0", investTokenWithAmount, true);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (fetchVPNInfo().KWHzl() != TransactionStage.INPUT) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26661jgY) abstractC24170iXmFetchVPNInfo).EZpvd(InterfaceC26680jgr.Application.copydefault);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = iHN.AEQbTJ(view);
        this.DbNXlk = java.lang.System.currentTimeMillis();
        sSMYrx();
        AxsJAY();
        if (valueOf().AYXKKw() != InvestPageSource.Home) {
            ejfBZ().fetchVPNInfo.EZpvd(false);
        }
        EZpvd();
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestSubscriptionFragment$initView$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.jgD$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C25481ixY c25481ixY, Continuation<? super Unit> continuation) {
            C26640jgD.this.KWHzl(c25481ixY);
            return Unit.INSTANCE;
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void EZpvd() {
        super.EZpvd();
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().isConnected(), null, new TaskDescription(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, fetchVPNInfo().EZpvd(), null, new PendingIntent(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, FlowKt.debounce(this.isConnected, 500L), null, new Fragment(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, new Application(fetchVPNInfo().gEmmrt(), this), null, new Dialog(), 2, null);
        getFieldNames().AEQbTJ().observe(this, new AssistContent(new Function1() { // from class: o.jgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26640jgD.OLrzqt(this.AEQbTJ, (TransactionConfig) obj);
            }
        }));
        C27589jxz.collectOnViewLifecycle$default(this, getFieldNames().OLrzqt(), null, new FragmentManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.jgD$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24173iXp interfaceC24173iXp, Continuation<? super Unit> continuation) {
            C26640jgD.this.KWHzl(interfaceC24173iXp);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jgD$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(iXB ixb, Continuation<? super Unit> continuation) {
            C26640jgD.updateUserInput$default(C26640jgD.this, ixb.EZpvd(), ixb.djBIcL(), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jgD$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ((InitialInfoModel) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object AEQbTJ(InitialInfoModel initialInfoModel, Continuation<? super Unit> continuation) {
            java.lang.String str;
            C26640jgD.this.values = initialInfoModel;
            final InitialInfoModel.InvestInitialInfo investInitialInfo = initialInfoModel instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) initialInfoModel : null;
            if (investInitialInfo != null) {
                final C26640jgD c26640jgD = C26640jgD.this;
                c26640jgD.ejfBZ().fetchVPNInfo.setProtocolTitle(investInitialInfo.fetchVPNInfo());
                c26640jgD.ejfBZ().fetchVPNInfo.setProtocolIcon(investInitialInfo.values());
                C27443jvL c27443jvL = c26640jgD.ejfBZ().fetchVPNInfo;
                java.lang.String strFIwbmz = investInitialInfo.fIwbmz();
                if (strFIwbmz == null) {
                    str = "--";
                    c27443jvL.setApy(str);
                    if (!c26640jgD.fJNWhG().iwGUEr()) {
                        c26640jgD.ejfBZ().fetchVPNInfo.setTvl(C27492jwH.formatTvl$default(C27492jwH.OLrzqt, investInitialInfo.hDKMBd(), false, true, 2, null));
                    }
                    c26640jgD.ejfBZ().fetchVPNInfo.setGoDetailCallback(new Function0() { // from class: o.jgR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C26640jgD.Dialog.EZpvd(c26640jgD, investInitialInfo);
                        }
                    });
                } else {
                    str = C56443yFo.KWHzl(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFIwbmz) ^ true).booleanValue() ? strFIwbmz : null;
                    if (str == null) {
                    }
                    c27443jvL.setApy(str);
                    if (!c26640jgD.fJNWhG().iwGUEr()) {
                    }
                    c26640jgD.ejfBZ().fetchVPNInfo.setGoDetailCallback(new Function0() { // from class: o.jgR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C26640jgD.Dialog.EZpvd(c26640jgD, investInitialInfo);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(C26640jgD c26640jgD, InitialInfoModel.InvestInitialInfo investInitialInfo) {
            FragmentActivity activity = c26640jgD.getActivity();
            if (activity != null) {
                C27508jwX.startInvestDetailActivity$default(C27508jwX.AEQbTJ, activity, java.lang.Long.valueOf(investInitialInfo.gEmmrt()), null, "investsubscribeentrance", java.lang.Long.valueOf(investInitialInfo.KWHzl()), true, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(C26640jgD c26640jgD, TransactionConfig transactionConfig) {
        if (c26640jgD.fJNWhG().isConnected() == transactionConfig.isConnected()) {
            return Unit.INSTANCE;
        }
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = c26640jgD.fetchVPNInfo();
        Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
        Intrinsics.copydefault(transactionConfig);
        ((C26661jgY) abstractC24170iXmFetchVPNInfo).AEQbTJ(transactionConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jgD$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C26658jgV c26658jgV, Continuation<? super Unit> continuation) {
            if (C26640jgD.this.fJNWhG().gEmmrt()) {
                C26640jgD.this.ejfBZ().fetchVPNInfo.OLrzqt(C26656jgT.copydefault.AEQbTJ());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public final void AuCTelauCTel() {
        updateUserInput$default(this, null, null, false, 7, null);
    }

    /* JADX DEBUG: Possible override for method o.jgw.AhwBna()V */
    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        iXB value;
        iXC ixcAEQbTJ;
        iXA ixaEZpvd;
        iXC ixcAEQbTJ2;
        iXA ixaEZpvd2;
        java.lang.String strEZpvd;
        java.lang.String strEZpvd2;
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value2 != null && value2.isConnected()) {
            iXB value3 = fetchVPNInfo().fetchVPNInfo().getValue();
            updateUserInput$default(this, (value3 == null || (strEZpvd2 = value3.EZpvd()) == null) ? "0" : strEZpvd2, null, false, 6, null);
            return true;
        }
        iXB value4 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value4 == null || !value4.isConnected() || (value = fetchVPNInfo().fetchVPNInfo().getValue()) == null || !value.copydefault() || (ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue())) == null || (ixaEZpvd = ixcAEQbTJ.EZpvd()) == null || !ixaEZpvd.DbNXlk() || (ixcAEQbTJ2 = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue())) == null || (ixaEZpvd2 = ixcAEQbTJ2.EZpvd()) == null || !ixaEZpvd2.copydefault()) {
            return false;
        }
        iXB value5 = fetchVPNInfo().fetchVPNInfo().getValue();
        updateUserInput$default(this, (value5 == null || (strEZpvd = value5.EZpvd()) == null) ? "0" : strEZpvd, null, false, 6, null);
        return true;
    }

    private final void sSMYrx() {
        iHN ihnEjfBZ = ejfBZ();
        ihnEjfBZ.gEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.jgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26640jgD.KWHzl(this.copydefault, view);
            }
        });
        ihnEjfBZ.AkhnZx.KWHzl(this.fARcdN);
        ihnEjfBZ.EZpvd.setUseNewLayout(this.fARcdN);
        ihnEjfBZ.OLrzqt.setAddFoundsVisible(!fJNWhG().getFieldNames());
        ihnEjfBZ.OLrzqt.setMaxClickListener(new View.OnClickListener() { // from class: o.jgN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26640jgD.copydefault(this.copydefault, view);
            }
        });
        ihnEjfBZ.EZpvd.setOnCTAButtonClick(new Function0() { // from class: o.jgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26640jgD.AhwBna(this.AEQbTJ);
            }
        });
        ihnEjfBZ.EZpvd.setOnReminderActionClick(new Function1() { // from class: o.jgO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26640jgD.OLrzqt(this.EZpvd, (InvestPopUpData) obj);
            }
        });
        if (this.fARcdN) {
            zLjUOn();
        }
        ihnEjfBZ.fetchVPNInfo.setOnCardClickListener(new View.OnClickListener() { // from class: o.jgL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26640jgD.valueOf(this.copydefault, view);
            }
        });
    }

    public static final void KWHzl(C26640jgD c26640jgD, android.view.View view) {
        AbstractC24170iXm.fetchInitialInfo$default(c26640jgD.fetchVPNInfo(), null, 1, null);
    }

    public static final void copydefault(C26640jgD c26640jgD, android.view.View view) {
        java.lang.Integer num;
        java.lang.Object tag = view.getTag();
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 3)) {
            InitialInfoModel value = c26640jgD.fetchVPNInfo().gEmmrt().getValue();
            InitialInfoModel.InvestInitialInfo investInitialInfo = value instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) value : null;
            if (investInitialInfo == null) {
                return;
            }
            int i = ActionBar.AEQbTJ[investInitialInfo.iwGUEr().ordinal()];
            showFarmGuidePoolDialog$default(c26640jgD, investInitialInfo.getNewProxyInstance(), c26640jgD.fJNWhG().isConnected(), c26640jgD.fJNWhG().copydefault(), i == 1 || (i != 2 && ((num = SPUtils.getInt("sp_invest_pool_subscribe_select", 0)) == null || num.intValue() != 2)), null, 16, null);
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 2)) {
            iXC ixcAEQbTJ = C24181iXx.AEQbTJ(c26640jgD.fetchVPNInfo().AhwBna().getValue());
            if (ixcAEQbTJ == null) {
                return;
            }
            c26640jgD.EZpvd(ixcAEQbTJ.EZpvd().values());
            c26640jgD.djBIcL().AEQbTJ();
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 4) || !Intrinsics.EZpvd(tag, (java.lang.Object) 1)) {
            return;
        }
        c26640jgD.iwGUEr();
    }

    public static final Unit AhwBna(C26640jgD c26640jgD) {
        c26640jgD.hDKMBd();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C26640jgD c26640jgD, InvestPopUpData investPopUpData) {
        Intrinsics.checkNotNullParameter(investPopUpData, "");
        iUW iuwAEQbTJ = iUW.Companion.AEQbTJ(investPopUpData);
        androidx.fragment.app.FragmentManager childFragmentManager = c26640jgD.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        iuwAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final void valueOf(C26640jgD c26640jgD, android.view.View view) {
        if (C26656jgT.copydefault.AEQbTJ()) {
            DefiRecommendTokenFragment.Companion.copydefault().show(c26640jgD.getChildFragmentManager(), C56524yIo.AEQbTJ(DefiRecommendTokenFragment.class).valueOf());
        }
    }

    public final void zLjUOn() {
        C27444jvM c27444jvM = ejfBZ().djBIcL;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        c27444jvM.setInputRanges(yDY.gEmmrt(new C24180iXw("0.25", C27492jwH.formatRatePercent$default(c27492jwH, "0.25", false, 2, null)), new C24180iXw("0.50", C27492jwH.formatRatePercent$default(c27492jwH, "0.50", false, 2, null)), new C24180iXw("1", C33070mpX.AYXKKw(C25493ixk.FragmentManager.awiJhF))));
        c27444jvM.setInputRangeClickListener(new Function1() { // from class: o.jgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26640jgD.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(C26640jgD c26640jgD, java.lang.String str) {
        C55033xcM c55033xcMOLrzqt;
        C55033xcM c55033xcMOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        if (c26640jgD.fJNWhG().getFieldNames()) {
            java.lang.String strMulS$default = C33129mqd.mulS$default(c26640jgD.aV_(), C33129mqd.EZpvd(str), null, null, null, 14, null);
            if (C33129mqd.AEQbTJ(strMulS$default, "0")) {
                if (c26640jgD.fJNWhG().AwvSrB()) {
                    c55033xcMOLrzqt2 = c26640jgD.ejfBZ().AkhnZx.EZpvd();
                } else {
                    c55033xcMOLrzqt2 = c26640jgD.ejfBZ().AYXKKw.OLrzqt();
                }
                c55033xcMOLrzqt2.setPlainNumericText(strMulS$default);
            }
        } else if (C33129mqd.OLrzqt(str, "1")) {
            c26640jgD.iwGUEr();
        } else {
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(c26640jgD.OLrzqt(), C33129mqd.EZpvd(str), null, null, null, 14, null);
            if (C33129mqd.AEQbTJ(strMulS$default2, "0")) {
                if (c26640jgD.fJNWhG().AwvSrB()) {
                    c55033xcMOLrzqt = c26640jgD.ejfBZ().AkhnZx.EZpvd();
                } else {
                    c55033xcMOLrzqt = c26640jgD.ejfBZ().AYXKKw.OLrzqt();
                }
                c55033xcMOLrzqt.setPlainNumericText(strMulS$default2);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AubY() {
        iHN ihnEjfBZ = ejfBZ();
        if (fJNWhG().AwvSrB()) {
            ihnEjfBZ.AhwBna.setEditable(ihnEjfBZ.AkhnZx.EZpvd().KWHzl());
            ihnEjfBZ.AkhnZx.EZpvd().requestFocus();
        } else {
            C55033xcM c55033xcMOLrzqt = ihnEjfBZ.AYXKKw.OLrzqt();
            ihnEjfBZ.AhwBna.setEditable(c55033xcMOLrzqt.KWHzl());
            c55033xcMOLrzqt.requestFocus();
        }
    }

    public static /* synthetic */ void updateUserInput$default(C26640jgD c26640jgD, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "0";
        }
        if ((i & 2) != 0) {
            investTokenWithAmount = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c26640jgD.copydefault(str, investTokenWithAmount, z);
    }

    public final void copydefault(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, boolean z) {
        iXA ixaEZpvd;
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        if (investTokenWithAmount == null) {
            investTokenWithAmount = (ixcAEQbTJ == null || (ixaEZpvd = ixcAEQbTJ.EZpvd()) == null) ? null : ixaEZpvd.values();
        }
        InvestTokenWithAmount investTokenWithAmount2 = investTokenWithAmount;
        AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
        Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
        ((C26661jgY) abstractC24170iXmFetchVPNInfo).EZpvd(new InterfaceC26680jgr.Activity(str, investTokenWithAmount2, null, null, z, 12, null));
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void OLrzqt(@NotNull InterfaceC24182iXy interfaceC24182iXy) {
        Intrinsics.checkNotNullParameter(interfaceC24182iXy, "");
        iHN ihnEjfBZ = ejfBZ();
        C55173xeu c55173xeu = ihnEjfBZ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.TaskDescription ? 0 : 8);
        C55113xdn c55113xdn = ihnEjfBZ.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = interfaceC24182iXy instanceof InterfaceC24182iXy.ActionBar;
        c55113xdn.setVisibility(z ? 0 : 8);
        if (z) {
            ihnEjfBZ.valueOf.setAnimation(C33492mxV.OLrzqt() ? "invest_subscription_loading_new_night.lottie" : "invest_subscription_loading_new.lottie");
            ihnEjfBZ.valueOf.KWHzl(0L);
        }
        ConstraintLayout constraintLayout = ihnEjfBZ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(interfaceC24182iXy instanceof InterfaceC24182iXy.Activity ? 0 : 8);
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(interfaceC24182iXy);
        if (ixcAEQbTJ != null) {
            EZpvd(ixcAEQbTJ);
        }
    }

    public final void EZpvd(iXC ixc) {
        iHN ihnEjfBZ = ejfBZ();
        DbNXlk();
        ConstraintLayout constraintLayout = ihnEjfBZ.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        TransactionStage transactionStageDbNXlk = ixc.DbNXlk();
        TransactionStage transactionStage = TransactionStage.INPUT;
        constraintLayout.setVisibility(transactionStageDbNXlk == transactionStage ? 0 : 8);
        ihnEjfBZ.OLrzqt.setVisibility(ixc.DbNXlk() == transactionStage ? 0 : 4);
        ihnEjfBZ.fARcdN.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 4);
        RxBus.AEQbTJ(new C25517iyH(ixc.DbNXlk() == transactionStage));
        RecyclerView recyclerView = ihnEjfBZ.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        android.view.View viewFindViewById = ejfBZ().getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        android.view.View viewFindViewById2 = ejfBZ().getRoot().findViewById(C25493ixk.ActionBar.RcLksq);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(ixc.DbNXlk() != transactionStage ? 0 : 8);
        }
        C27456jvY c27456jvY = ihnEjfBZ.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c27456jvY, "");
        c27456jvY.setVisibility(fJNWhG().AwvSrB() ? 0 : 8);
        C27447jvP c27447jvP = ihnEjfBZ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c27447jvP, "");
        c27447jvP.setVisibility(fJNWhG().zuBGHE() ? 0 : 8);
        copydefault(ixc);
        KWHzl(ixc);
        if (ixc.DbNXlk() != transactionStage && fJNWhG().zuBGHE()) {
            ihnEjfBZ.AYXKKw.EZpvd();
        }
        OLrzqt(ixc.AuCTel());
        ihnEjfBZ.AkhnZx.EZpvd(ixc.DbNXlk() != transactionStage);
        if (ixc.fIwbmz() && ixc.copydefault() != null) {
            java.lang.String message = ixc.copydefault().getMessage();
            C55326xho.toast$default((message == null || message.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) message)) ? C43422row.OLrzqt() : message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ihnEjfBZ.AkhnZx.copydefault();
        }
        djBIcL().gEmmrt(fetchVPNInfo().KWHzl());
    }

    public final void copydefault(iXC ixc) {
        boolean z = ixc.DbNXlk() == TransactionStage.CONFIRMATION && C33129mqd.OLrzqt((java.lang.CharSequence) ixc.ejfBZ());
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC26761jiS interfaceC26761jiS = activity instanceof InterfaceC26761jiS ? (InterfaceC26761jiS) activity : null;
        if (interfaceC26761jiS != null) {
            interfaceC26761jiS.OLrzqt(z ? new ValidatorSelectionParams(ixc.djBIcL(), ixc.ejfBZ(), fJNWhG().copydefault(), ValidatorTrxType.INVEST, ixc.iwGUEr()) : null);
        }
    }

    public final void KWHzl(InterfaceC24173iXp interfaceC24173iXp) {
        ejfBZ().EZpvd.setButtonState(interfaceC24173iXp);
    }

    public final void KWHzl(iXC ixc) {
        copydefault(ixc.EZpvd());
        InterfaceC24178iXu interfaceC24178iXuGEmmrt = ixc.gEmmrt();
        if (interfaceC24178iXuGEmmrt != null) {
            OLrzqt(interfaceC24178iXuGEmmrt, ixc.fJNWhG());
        }
        if (ixc.DbNXlk() == TransactionStage.INPUT) {
            AubY();
        }
    }

    public final void copydefault(iXA ixa) {
        iXA ixaAEQbTJ;
        java.lang.String strEZpvd;
        iHN ihnEjfBZ = ejfBZ();
        C27456jvY c27456jvY = ihnEjfBZ.AkhnZx;
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        java.lang.String str = "0";
        if (C33129mqd.valueOf(value != null ? value.EZpvd() : null, "0") && !ixa.fetchVPNInfo()) {
            ihnEjfBZ.AkhnZx.AEQbTJ();
            return;
        }
        if (ixa.AkhnZx()) {
            ixaAEQbTJ = ixa.AEQbTJ((1032191 & 1) != 0 ? ixa.AuCTel : null, (1032191 & 2) != 0 ? ixa.DbNXlk : false, (1032191 & 4) != 0 ? ixa.copydefault : null, (1032191 & 8) != 0 ? ixa.AYXKKw : null, (1032191 & 16) != 0 ? ixa.ejfBZ : null, (1032191 & 32) != 0 ? ixa.fARcdN : null, (1032191 & 64) != 0 ? ixa.djBIcL : null, (1032191 & 128) != 0 ? ixa.EZpvd : 0, (1032191 & 256) != 0 ? ixa.fIwbmz : 0, (1032191 & 512) != 0 ? ixa.AkhnZx : false, (1032191 & 1024) != 0 ? ixa.values : false, (1032191 & 2048) != 0 ? ixa.fJNWhG : null, (1032191 & 4096) != 0 ? ixa.KWHzl : null, (1032191 & 8192) != 0 ? ixa.AEQbTJ : null, (1032191 & 16384) != 0 ? ixa.isConnected : null, (1032191 & 32768) != 0 ? ixa.AhwBna : false, (1032191 & 65536) != 0 ? ixa.valueOf : false, (1032191 & 131072) != 0 ? ixa.OLrzqt : false, (1032191 & 262144) != 0 ? ixa.fetchVPNInfo : false, (1032191 & 524288) != 0 ? ixa.gEmmrt : false);
        } else {
            ixaAEQbTJ = ixa;
        }
        c27456jvY.setData(ixaAEQbTJ);
        iXB value2 = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value2 != null && (strEZpvd = value2.EZpvd()) != null) {
            str = strEZpvd;
        }
        if (!EZpvd(str) && !ixa.AkhnZx()) {
            ihnEjfBZ.AkhnZx.KWHzl();
        }
        c27456jvY.setTokenInputListeners(this);
    }

    public static /* synthetic */ void setupAdditionalInfoDisplay$default(C26640jgD c26640jgD, InterfaceC24178iXu interfaceC24178iXu, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c26640jgD.OLrzqt(interfaceC24178iXu, z);
    }

    public final void OLrzqt(InterfaceC24178iXu interfaceC24178iXu, boolean z) {
        iHN ihnEjfBZ = ejfBZ();
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (C33129mqd.valueOf(value != null ? value.EZpvd() : null, "0") || fJNWhG().iwGUEr()) {
            return;
        }
        InterfaceC24178iXu.StateListAnimator stateListAnimator = interfaceC24178iXu instanceof InterfaceC24178iXu.StateListAnimator ? (InterfaceC24178iXu.StateListAnimator) interfaceC24178iXu : null;
        if (stateListAnimator != null) {
            ihnEjfBZ.fetchVPNInfo.KWHzl(C33069mpW.copydefault(this, C25493ixk.FragmentManager.RcXXUw, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("fiatValue", stateListAnimator.djBIcL().length() == 0 ? "" : C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, stateListAnimator.djBIcL(), null, null, null, 14, null)))), z);
        }
    }

    public final void OLrzqt(java.util.List<? extends InterfaceC24178iXu> list) {
        iSE.submitList$default(getNewProxyInstance(), list, null, 2, null);
    }

    public final void iwGUEr() {
        java.lang.String strEZpvd;
        int iOLrzqt;
        C55033xcM c55033xcMOLrzqt;
        java.lang.String strOLrzqt = OLrzqt();
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        iXA ixaEZpvd = ixcAEQbTJ != null ? ixcAEQbTJ.EZpvd() : null;
        boolean z = false;
        if (ixaEZpvd != null && ixaEZpvd.values().isBaseToken()) {
            java.lang.String strSubS$default = C33129mqd.subS$default(strOLrzqt, ixaEZpvd.djBIcL(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            if (C33129mqd.AEQbTJ(strSubS$default, "0")) {
                fetchVPNInfo().KWHzl("sp_invest_maxreminder_dialog_never_show");
                strEZpvd = C27491jwG.EZpvd(strSubS$default);
            } else {
                z = true;
                strEZpvd = "0";
            }
        } else {
            strEZpvd = C27491jwG.EZpvd(strOLrzqt);
        }
        if (z) {
            ejfBZ().AhwBna.AEQbTJ();
            if (fJNWhG().AwvSrB()) {
                ejfBZ().AkhnZx.djBIcL();
            } else if (ixaEZpvd != null) {
                ejfBZ().AYXKKw.copydefault(ixaEZpvd);
            }
        } else {
            if (fJNWhG().AwvSrB()) {
                iOLrzqt = ejfBZ().AkhnZx.EZpvd().OLrzqt();
            } else {
                iOLrzqt = ejfBZ().AYXKKw.OLrzqt().OLrzqt();
            }
            if (C33129mqd.AEQbTJ(strOLrzqt, "0") && Intrinsics.EZpvd((java.lang.Object) pTB.formatUpToMax$default(C33129mqd.EZpvd(strEZpvd), iOLrzqt, null, 2, null), (java.lang.Object) "0")) {
                gHZMYf();
            }
            if (fJNWhG().AwvSrB()) {
                c55033xcMOLrzqt = ejfBZ().AkhnZx.EZpvd();
            } else {
                c55033xcMOLrzqt = ejfBZ().AYXKKw.OLrzqt();
            }
            c55033xcMOLrzqt.setPlainNumericText(strEZpvd);
        }
        BaseTransactionFragment.trackButtonClick$default(this, "max", null, null, null, 14, null);
    }

    public final void hDKMBd() {
        C27131jpR c27131jpR = ejfBZ().EZpvd;
        java.lang.Object tag = c27131jpR.getTag();
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 3)) {
            RxBus.AEQbTJ(new C25518iyI(fJNWhG().isConnected()));
            C7323ahf.KWHzl().AEQbTJ("InvestBorrowAddSupplyEvent", null, C56423yEv.EZpvd(C56390yDp.OLrzqt("investmentId", java.lang.Long.valueOf(fJNWhG().isConnected()))));
            requireActivity().finish();
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 0)) {
            BaseTransactionFragment.trackButtonClick$default(this, "next_button", null, null, null, 14, null);
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26661jgY) abstractC24170iXmFetchVPNInfo).EZpvd(InterfaceC26680jgr.StateListAnimator.copydefault);
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 1)) {
            c27131jpR.AEQbTJ();
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo2 = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo2, "");
            ((C26661jgY) abstractC24170iXmFetchVPNInfo2).EZpvd(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.APPROVAL));
            return;
        }
        if (Intrinsics.EZpvd(tag, (java.lang.Object) 2)) {
            fARcdN();
            InitialInfoModel value = fetchVPNInfo().gEmmrt().getValue();
            InitialInfoModel.InvestInitialInfo investInitialInfo = value instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) value : null;
            djBIcL().EZpvd();
            KWHzl("confirm_button", investInitialInfo != null ? investInitialInfo.isConnected() : null, investInitialInfo != null ? investInitialInfo.fetchVPNInfo() : null, investInitialInfo != null ? investInitialInfo.DbNXlk() : null);
        }
    }

    private final void AxsJAY() {
        android.content.Context context = ejfBZ().getRoot().getContext();
        RecyclerView recyclerView = ejfBZ().ejfBZ;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(getNewProxyInstance());
        ejfBZ().ejfBZ.addOnScrollListener(new LoaderManager());
    }

    /* JADX INFO: renamed from: o.jgD$LoaderManager */
    public static final class LoaderManager extends RecyclerView.OnScrollListener {
        public LoaderManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            android.view.View viewFindViewById = C26640jgD.this.ejfBZ().getRoot().findViewById(C25493ixk.ActionBar.fdazkH);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
            }
            android.view.View viewFindViewById2 = C26640jgD.this.ejfBZ().getRoot().findViewById(C25493ixk.ActionBar.RcLksq);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(recyclerView.canScrollVertically(1) ? 0 : 8);
            }
        }
    }

    public final void KWHzl(C25481ixY c25481ixY) {
        iHN ihnEjfBZ = ejfBZ();
        ihnEjfBZ.OLrzqt.setData(c25481ixY);
        ihnEjfBZ.fARcdN.setText(C23628iDk.EZpvd(fJNWhG(), c25481ixY.KWHzl()));
    }

    public final void zsXlph() {
        InterfaceC9738bbJ interfaceC9738bbJAwvSrB = AwvSrB();
        java.lang.String strDbNXlk = interfaceC9738bbJAwvSrB != null ? interfaceC9738bbJAwvSrB.DbNXlk() : null;
        C26601jfR c26601jfRAEQbTJ = C26601jfR.Companion.AEQbTJ(new TokenSelectionParams(C33129mqd.valueOf(java.lang.Long.valueOf(fJNWhG().isConnected())), strDbNXlk == null ? "" : strDbNXlk, fJNWhG().copydefault(), TokenSelectionAction.Invest));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26601jfRAEQbTJ.show(childFragmentManager);
        BaseTransactionFragment.trackButtonClick$default(this, "select_coins", null, null, null, 14, null);
    }

    public final void EZpvd(InvestTokenWithAmount investTokenWithAmount) {
        java.lang.String strDjBIcL;
        java.lang.String strHDKMBd;
        java.util.ArrayList arrayListCopydefault;
        java.lang.String tokenAddress = !investTokenWithAmount.isBaseToken() ? investTokenWithAmount.getTokenAddress() : "";
        InterfaceC9741bbM interfaceC9741bbMGEmmrt = aU_().gEmmrt();
        InterfaceC9738bbJ interfaceC9738bbJAwvSrB = AwvSrB();
        java.lang.String strDbNXlk = interfaceC9738bbJAwvSrB != null ? interfaceC9738bbJAwvSrB.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = interfaceC9741bbMGEmmrt.OLrzqt(strDbNXlk);
        if (interfaceC9738bbJOLrzqt == null || (strDjBIcL = interfaceC9738bbJOLrzqt.djBIcL(investTokenWithAmount.getChainId())) == null) {
            strDjBIcL = "0";
        }
        InterfaceC9741bbM interfaceC9741bbMGEmmrt2 = aU_().gEmmrt();
        InterfaceC9738bbJ interfaceC9738bbJAwvSrB2 = AwvSrB();
        java.lang.String strDbNXlk2 = interfaceC9738bbJAwvSrB2 != null ? interfaceC9738bbJAwvSrB2.DbNXlk() : null;
        if (strDbNXlk2 == null) {
            strDbNXlk2 = "";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = interfaceC9741bbMGEmmrt2.OLrzqt(strDbNXlk2);
        if (interfaceC9738bbJOLrzqt2 == null || (strHDKMBd = interfaceC9738bbJOLrzqt2.hDKMBd()) == null) {
            strHDKMBd = "0";
        }
        boolean z = (C33129mqd.AEQbTJ(strDjBIcL, "0") || C33129mqd.AEQbTJ(strHDKMBd, "0")) ? false : true;
        InterfaceC23916iOb interfaceC23916iObAU_ = aU_();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(investTokenWithAmount.getChainId()));
        if (z) {
            arrayListCopydefault = yDY.copydefault("dex", "gas_station");
        } else {
            arrayListCopydefault = yDY.copydefault("gas_station");
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC23916iObAU_, abstractActivityC33041mov, new WalletRechargeBean(strGEmmrt, tokenAddress, "yield", "balance", arrayListCopydefault, (java.util.ArrayList) null, true, (java.lang.String) null, 0, 416, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    public static /* synthetic */ void showFarmGuidePoolDialog$default(C26640jgD c26640jgD, long j, long j2, long j3, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        c26640jgD.copydefault(j, j2, j3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str);
    }

    public final void copydefault(final long j, final long j2, final long j3, final boolean z, java.lang.String str) {
        java.lang.String strAYXKKw;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (str == null || (strAYXKKw = C33069mpW.copydefault(this, C25493ixk.FragmentManager.OAhWiU, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("productType", str)))) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.GLcwwN);
            }
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, getString(C25493ixk.FragmentManager.DBAlnt), strAYXKKw, null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.dbUqJD), new Function0() { // from class: o.jgK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26640jgD.copydefault(this.OLrzqt, j, z, j3, j2);
                }
            }, null, null, false, 1848, null);
        }
    }

    public static final Unit copydefault(C26640jgD c26640jgD, long j, boolean z, long j2, long j3) {
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        android.content.Context contextRequireContext = c26640jgD.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c27508jwX.OLrzqt(contextRequireContext, j, (992 & 4) != 0 ? true : z, (992 & 8) != 0 ? null : null, (992 & 16) != 0 ? 0L : j2, (992 & 32) != 0 ? null : java.lang.Long.valueOf(j3), (992 & 64) != 0 ? null : null, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        java.util.List<InterfaceC24178iXu> listEZpvd = getNewProxyInstance().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (obj instanceof InterfaceC24178iXu.PendingIntent) {
                arrayList.add(obj);
            }
        }
        InterfaceC24178iXu.PendingIntent pendingIntent = (InterfaceC24178iXu.PendingIntent) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (pendingIntent == null || C33129mqd.valueOf(java.lang.Integer.valueOf(pendingIntent.KWHzl().getNumDays()), 3)) {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26661jgY) abstractC24170iXmFetchVPNInfo).EZpvd(new InterfaceC26680jgr.TaskDescription(fetchVPNInfo().AhwBna().getValue(), TransactionStage.SUBMIT));
            ejfBZ().EZpvd.AEQbTJ();
            return;
        }
        iUQ iuqEZpvd = iUQ.Companion.EZpvd(pendingIntent.KWHzl());
        iuqEZpvd.AEQbTJ(new Activity());
        iuqEZpvd.show(getChildFragmentManager(), iUQ.class.getName());
    }

    /* JADX INFO: renamed from: o.jgD$Activity */
    public static final class Activity implements iUV {
        public Activity() {
        }

        @Override // o.iUV
        public void AEQbTJ() {
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = C26640jgD.this.fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26661jgY) abstractC24170iXmFetchVPNInfo).EZpvd(new InterfaceC26680jgr.TaskDescription(C26640jgD.this.fetchVPNInfo().AhwBna().getValue(), TransactionStage.SUBMIT));
            C26640jgD.this.ejfBZ().EZpvd.AEQbTJ();
        }
    }

    public final void KWHzl(InvestTransactionLossInfo investTransactionLossInfo) {
        iUX.ActionBar.newInstance$default(iUX.Companion, investTransactionLossInfo, false, 2, null).show(getChildFragmentManager(), (java.lang.String) null);
    }

    public final void gHZMYf() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, null, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DPHNDa), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DPhTBN), null, null, null, false, 1978, null);
        }
    }

    @Override // o.InterfaceC27520jwj
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull InvestTokenWithAmount investTokenWithAmount, boolean z) {
        java.lang.String strHDKMBd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        if (C33129mqd.OLrzqt(str, "0")) {
            if (!fJNWhG().iwGUEr()) {
                C27443jvL c27443jvL = ejfBZ().fetchVPNInfo;
                C27492jwH c27492jwH = C27492jwH.OLrzqt;
                InitialInfoModel value = fetchVPNInfo().gEmmrt().getValue();
                InitialInfoModel.InvestInitialInfo investInitialInfo = value instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) value : null;
                if (investInitialInfo == null || (strHDKMBd = investInitialInfo.hDKMBd()) == null) {
                    strHDKMBd = "";
                }
                c27443jvL.KWHzl(C27492jwH.formatTvl$default(c27492jwH, strHDKMBd, false, true, 2, null), false);
            }
            ejfBZ().AkhnZx.AEQbTJ();
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestSubscriptionFragment$onInputChange$1(str, investTokenWithAmount, this, null), 3, null);
    }

    @Override // o.InterfaceC27520jwj
    public void uzCIH() {
        zsXlph();
        BaseTransactionFragment.trackButtonClick$default(this, "select_coins", null, null, null, 14, null);
    }

    @Override // o.InterfaceC27520jwj
    public void wlaJM() {
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value != null && value.isConnected()) {
            AhwBna();
        } else if (fJNWhG().zuBGHE()) {
            AubY();
        }
    }

    @Override // o.iPT
    public void KWHzl(@NotNull InvestFinalityProviderItem investFinalityProviderItem) {
        Intrinsics.checkNotNullParameter(investFinalityProviderItem, "");
        iXC ixcAEQbTJ = C24181iXx.AEQbTJ(fetchVPNInfo().AhwBna().getValue());
        iXB ixbKWHzl = null;
        java.lang.Object obj = null;
        InvestValidatorListItems investValidatorListItems = null;
        java.util.List<InvestValidatorListItems> listFARcdN = ixcAEQbTJ != null ? ixcAEQbTJ.fARcdN() : null;
        iXB value = fetchVPNInfo().fetchVPNInfo().getValue();
        if (value != null) {
            if (listFARcdN != null) {
                java.util.Iterator<T> it = listFARcdN.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((InvestValidatorListItems) next).getProviderPubkey(), (java.lang.Object) investFinalityProviderItem.getProviderPubkey())) {
                        obj = next;
                        break;
                    }
                }
                investValidatorListItems = (InvestValidatorListItems) obj;
            }
            ixbKWHzl = value.KWHzl((4091 & 1) != 0 ? value.copydefault : null, (4091 & 2) != 0 ? value.valueOf : null, (4091 & 4) != 0 ? value.AkhnZx : null, (4091 & 8) != 0 ? value.OLrzqt : null, (4091 & 16) != 0 ? value.AYXKKw : null, (4091 & 32) != 0 ? value.gEmmrt : investValidatorListItems, (4091 & 64) != 0 ? value.fetchVPNInfo : 0L, (4091 & 128) != 0 ? value.djBIcL : null, (4091 & 256) != 0 ? value.AEQbTJ : 0, (4091 & 512) != 0 ? value.AhwBna : false, (4091 & 1024) != 0 ? value.KWHzl : false, (4091 & 2048) != 0 ? value.EZpvd : false);
        }
        if (ixbKWHzl != null) {
            fetchVPNInfo().copydefault(ixbKWHzl);
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment
    public void DbNXlk() {
        ejfBZ().EZpvd.copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        if (!(fragments instanceof java.util.Collection) || !fragments.isEmpty()) {
            for (androidx.fragment.app.Fragment fragment : fragments) {
                if (fragment.isAdded() && !fragment.isDetached()) {
                    return;
                }
            }
        }
        C26656jgT.copydefault.OLrzqt();
    }

    public final void copydefault(java.util.List<InvestFinalityProviderItem> list, InvestFinalityProviderItem investFinalityProviderItem) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InvestFinalityProviderItem) next).getProviderPubkey(), (java.lang.Object) (investFinalityProviderItem != null ? investFinalityProviderItem.getProviderPubkey() : null))) {
                    break;
                }
            }
        }
        InvestFinalityProviderItem investFinalityProviderItem2 = (InvestFinalityProviderItem) next;
        if (investFinalityProviderItem2 != null) {
            investFinalityProviderItem2.setSelected(true);
        }
        iPO.TaskDescription.newInstance$default(iPO.Companion, list, null, 2, null).show(getChildFragmentManager(), C56524yIo.AEQbTJ(C26640jgD.class).valueOf());
    }
}
