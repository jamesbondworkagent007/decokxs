package com.okinc.business.invest_biz.ui.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C23597iCg;
import o.C23605iCo;
import o.C23610iCt;
import o.C27549jxL;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTransactionResultViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InvestTradeManager.TransactionResultExtraData AEQbTJ;
    public final String AYXKKw;
    public final Bundle KWHzl;
    public final StateFlow<Application> OLrzqt;
    public final TransactionType copydefault;
    public final String djBIcL;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAction.values().length];
            try {
                iArr[InvestAction.Subscription.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAction.Redeem.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestAction.Claim.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestAction.Bonus.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvestAction.MerklBonus.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvestAction.Deploy.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InvestAction.Mint.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InvestAction.Repay.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InvestAction.BabylonUnbond.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InvestAction.Borrow.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> AEQbTJ() {
        return this.OLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public InvestTransactionResultViewModel(@NotNull C23597iCg c23597iCg, @NotNull SavedStateHandle savedStateHandle) {
        TransactionType transactionType;
        Integer numOLrzqt;
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Bundle bundle = (Bundle) savedStateHandle.get("bundle");
        this.KWHzl = bundle;
        this.AYXKKw = bundle != null ? bundle.getString("tx_uop_hash") : null;
        this.djBIcL = bundle != null ? bundle.getString("tx_hash") : null;
        InvestTradeManager.TransactionResultExtraData transactionResultExtraData = (InvestTradeManager.TransactionResultExtraData) savedStateHandle.get("extraData");
        this.AEQbTJ = transactionResultExtraData;
        switch (StateListAnimator.KWHzl[InvestAction.Companion.copydefault((transactionResultExtraData == null || (numOLrzqt = transactionResultExtraData.OLrzqt()) == null) ? -1 : numOLrzqt.intValue()).ordinal()]) {
            case 1:
                transactionType = TransactionType.INVEST;
                break;
            case 2:
                transactionType = TransactionType.REDEEM;
                break;
            case 3:
            case 4:
            case 5:
                transactionType = TransactionType.CLAIM;
                break;
            case 6:
                transactionType = TransactionType.DEPLOY;
                break;
            case 7:
                transactionType = TransactionType.MINT;
                break;
            case 8:
                transactionType = TransactionType.REPAY;
                break;
            case 9:
                transactionType = TransactionType.UNBOND;
                break;
            case 10:
                transactionType = TransactionType.BORROW;
                break;
            default:
                transactionType = null;
                break;
        }
        this.copydefault = transactionType;
        this.OLrzqt = FlowKt.stateIn(new Dialog(new TaskDescription(c23597iCg.AEQbTJ(), this), this), ViewModelKt.getViewModelScope(this), C27549jxL.AEQbTJ, transactionType != null ? new Application(ActionBar.StateListAnimator.copydefault, transactionType) : null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransactionType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TransactionType[] $VALUES;
        public static final TransactionType INVEST = new TransactionType("INVEST", 0);
        public static final TransactionType REDEEM = new TransactionType("REDEEM", 1);
        public static final TransactionType CLAIM = new TransactionType("CLAIM", 2);
        public static final TransactionType DEPLOY = new TransactionType("DEPLOY", 3);
        public static final TransactionType MINT = new TransactionType("MINT", 4);
        public static final TransactionType REPAY = new TransactionType("REPAY", 5);
        public static final TransactionType UNBOND = new TransactionType("UNBOND", 6);
        public static final TransactionType BORROW = new TransactionType("BORROW", 7);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TransactionType[] $values() {
            return new TransactionType[]{INVEST, REDEEM, CLAIM, DEPLOY, MINT, REPAY, UNBOND, BORROW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TransactionType> getEntries() {
            return $ENTRIES;
        }

        static {
            TransactionType[] transactionTypeArr$values = $values();
            $VALUES = transactionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        }

        private TransactionType(String str, int i) {
        }

        public static TransactionType valueOf(String str) {
            return (TransactionType) Enum.valueOf(TransactionType.class, str);
        }

        public static TransactionType[] values() {
            return (TransactionType[]) $VALUES.clone();
        }
    }

    public interface ActionBar {

        public interface TaskDescription extends ActionBar {
        }

        public static final class LoaderManager implements ActionBar {
            public final InvestTransactionModel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, InvestTransactionModel investTransactionModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    investTransactionModel = loaderManager.EZpvd;
                }
                return loaderManager.EZpvd(investTransactionModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InvestTransactionModel AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager EZpvd(@NotNull InvestTransactionModel investTransactionModel) {
                Intrinsics.checkNotNullParameter(investTransactionModel, "");
                return new LoaderManager(investTransactionModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.EZpvd, ((LoaderManager) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(transaction=" + this.EZpvd + ")";
            }

            public LoaderManager(@NotNull InvestTransactionModel investTransactionModel) {
                Intrinsics.checkNotNullParameter(investTransactionModel, "");
                this.EZpvd = investTransactionModel;
            }
        }

        public static final class Application implements ActionBar {
            public final InvestTransactionModel AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, InvestTransactionModel investTransactionModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    investTransactionModel = application.AEQbTJ;
                }
                return application.OLrzqt(investTransactionModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InvestTransactionModel EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull InvestTransactionModel investTransactionModel) {
                Intrinsics.checkNotNullParameter(investTransactionModel, "");
                return new Application(investTransactionModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Failure(transaction=" + this.AEQbTJ + ")";
            }

            public Application(@NotNull InvestTransactionModel investTransactionModel) {
                Intrinsics.checkNotNullParameter(investTransactionModel, "");
                this.AEQbTJ = investTransactionModel;
            }
        }

        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator copydefault = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Estimating";
            }

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0340ActionBar implements TaskDescription {
            public final long AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0340ActionBar copy$default(C0340ActionBar c0340ActionBar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = c0340ActionBar.AEQbTJ;
                }
                return c0340ActionBar.OLrzqt(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0340ActionBar OLrzqt(long j) {
                return new C0340ActionBar(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0340ActionBar) && this.AEQbTJ == ((C0340ActionBar) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Long.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EstimatedTimeAvailable(estimatedTime=" + this.AEQbTJ + ")";
            }

            public C0340ActionBar(long j) {
                this.AEQbTJ = j;
            }
        }

        public static final class Activity implements TaskDescription {
            public static final Activity OLrzqt = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FailedToEstimate";
            }

            private Activity() {
            }
        }
    }

    public static final class Dialog implements Flow<Application> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ InvestTransactionResultViewModel OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel$Dialog$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ InvestTransactionResultViewModel EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, InvestTransactionResultViewModel investTransactionResultViewModel) {
                this.copydefault = flowCollector;
                this.EZpvd = investTransactionResultViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1 investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1;
                ActionBar c0340ActionBar;
                ActionBar loaderManager;
                TransactionType transactionType;
                Integer numCopydefault;
                if (continuation instanceof InvestTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1) {
                    investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1 = (InvestTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1) continuation;
                    int i = investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1 = new InvestTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj2 = investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    InvestTransactionModel investTransactionModel = (InvestTransactionModel) obj;
                    Integer pushToastCode = investTransactionModel.getPushToastCode();
                    Application application = null;
                    if (pushToastCode != null) {
                        int iIntValue = pushToastCode.intValue();
                        C23610iCt c23610iCt = C23610iCt.copydefault;
                        if (c23610iCt.AhwBna(iIntValue)) {
                            InvestTransactionParam routerParams = investTransactionModel.getRouterParams();
                            if (routerParams == null || (numCopydefault = routerParams.getEstTime()) == null) {
                                InvestTradeManager.TransactionResultExtraData transactionResultExtraData = this.EZpvd.AEQbTJ;
                                numCopydefault = transactionResultExtraData != null ? transactionResultExtraData.copydefault() : null;
                            }
                            if (numCopydefault == null || numCopydefault.intValue() < 1) {
                                c0340ActionBar = ActionBar.Activity.OLrzqt;
                            } else {
                                c0340ActionBar = new ActionBar.C0340ActionBar(C56548yJl.copydefault(TimeUnit.SECONDS.toMinutes(numCopydefault.intValue()), 1L));
                            }
                        } else {
                            if (c23610iCt.KWHzl(iIntValue)) {
                                loaderManager = new ActionBar.Application(investTransactionModel);
                            } else if (c23610iCt.djBIcL(iIntValue)) {
                                loaderManager = new ActionBar.LoaderManager(investTransactionModel);
                            } else {
                                pUU.copydefault("InvestTransactionResultViewModel", "Unknown status for pushToastCode: " + iIntValue);
                                c0340ActionBar = ActionBar.Activity.OLrzqt;
                            }
                            c0340ActionBar = loaderManager;
                        }
                        if (c23610iCt.valueOf(iIntValue)) {
                            transactionType = TransactionType.INVEST;
                        } else if (c23610iCt.AYXKKw(iIntValue)) {
                            transactionType = TransactionType.REDEEM;
                        } else if (c23610iCt.AEQbTJ(iIntValue)) {
                            transactionType = TransactionType.CLAIM;
                        } else if (c23610iCt.EZpvd(iIntValue)) {
                            transactionType = TransactionType.DEPLOY;
                        } else if (c23610iCt.gEmmrt(iIntValue)) {
                            transactionType = TransactionType.REPAY;
                        } else if (c23610iCt.copydefault(iIntValue)) {
                            transactionType = TransactionType.MINT;
                        } else if (c23610iCt.OLrzqt(iIntValue)) {
                            transactionType = TransactionType.BORROW;
                        } else {
                            pUU.copydefault("InvestTransactionResultViewModel", "Unknown type for pushToastCode: " + iIntValue);
                        }
                        application = new Application(c0340ActionBar, transactionType);
                    }
                    if (application != null) {
                        investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(application, investTransactionResultViewModel$special$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Dialog(Flow flow, InvestTransactionResultViewModel investTransactionResultViewModel) {
            this.KWHzl = flow;
            this.OLrzqt = investTransactionResultViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Application> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<InvestTransactionModel> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ InvestTransactionResultViewModel copydefault;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ InvestTransactionResultViewModel KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, InvestTransactionResultViewModel investTransactionResultViewModel) {
                this.copydefault = flowCollector;
                this.KWHzl = investTransactionResultViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestTransactionResultViewModel$special$$inlined$filter$1$2$1 investTransactionResultViewModel$special$$inlined$filter$1$2$1;
                if (continuation instanceof InvestTransactionResultViewModel$special$$inlined$filter$1$2$1) {
                    investTransactionResultViewModel$special$$inlined$filter$1$2$1 = (InvestTransactionResultViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i = investTransactionResultViewModel$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investTransactionResultViewModel$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investTransactionResultViewModel$special$$inlined$filter$1$2$1 = new InvestTransactionResultViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = investTransactionResultViewModel$special$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investTransactionResultViewModel$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    InvestTransactionModel investTransactionModel = (InvestTransactionModel) obj;
                    String str = this.KWHzl.djBIcL;
                    String str2 = this.KWHzl.AYXKKw;
                    InvestTradeManager.TransactionResultExtraData transactionResultExtraData = this.KWHzl.AEQbTJ;
                    if (C23605iCo.OLrzqt(investTransactionModel, str, str2, transactionResultExtraData != null ? transactionResultExtraData.AEQbTJ() : null)) {
                        investTransactionResultViewModel$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, investTransactionResultViewModel$special$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, InvestTransactionResultViewModel investTransactionResultViewModel) {
            this.OLrzqt = flow;
            this.copydefault = investTransactionResultViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InvestTransactionModel> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application {
        public final TransactionType KWHzl;
        public final ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, ActionBar actionBar, TransactionType transactionType, int i, Object obj) {
            if ((i & 1) != 0) {
                actionBar = application.copydefault;
            }
            if ((i & 2) != 0) {
                transactionType = application.KWHzl;
            }
            return application.copydefault(actionBar, transactionType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull ActionBar actionBar, @NotNull TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            return new Application(actionBar, transactionType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransactionResultState(status=" + this.copydefault + ", type=" + this.KWHzl + ")";
        }

        public Application(@NotNull ActionBar actionBar, @NotNull TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            this.copydefault = actionBar;
            this.KWHzl = transactionType;
        }
    }
}
