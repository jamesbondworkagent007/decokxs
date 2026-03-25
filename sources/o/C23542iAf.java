package o;

import com.okinc.business.invest_biz.data.bean.FilterRecord;
import com.okinc.business.invest_biz.data.logic.InvestSearchManager$initSearchHistory$1;
import com.okinc.business.invest_biz.data.logic.InvestSearchManager$initSearchHistory$2;
import com.okinc.business.invest_biz.data.logic.InvestSearchManager$saveToHistory$1;
import com.okinc.business.invest_biz.data.logic.InvestSearchManager$saveToHistory$lambda$1$$inlined$putObject$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C23542iAf {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<java.util.List<FilterRecord>> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final StateFlow<java.util.List<FilterRecord>> OLrzqt;
    public final InterfaceC23639iDv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<FilterRecord>> EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public C23542iAf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC23639iDv interfaceC23639iDv) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC23639iDv, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = interfaceC23639iDv;
        MutableStateFlow<java.util.List<FilterRecord>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: renamed from: o.iAf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iAf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InvestSearchManager$initSearchHistory$1 investSearchManager$initSearchHistory$1;
        FlowCollector flowCollector;
        if (continuation instanceof InvestSearchManager$initSearchHistory$1) {
            investSearchManager$initSearchHistory$1 = (InvestSearchManager$initSearchHistory$1) continuation;
            int i = investSearchManager$initSearchHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSearchManager$initSearchHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                investSearchManager$initSearchHistory$1 = new InvestSearchManager$initSearchHistory$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = investSearchManager$initSearchHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSearchManager$initSearchHistory$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            flowCollector = this.AEQbTJ;
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            InvestSearchManager$initSearchHistory$2 investSearchManager$initSearchHistory$2 = new InvestSearchManager$initSearchHistory$2(this, null);
            investSearchManager$initSearchHistory$1.L$0 = flowCollector;
            investSearchManager$initSearchHistory$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSearchManager$initSearchHistory$2, investSearchManager$initSearchHistory$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            }
            flowCollector = (MutableStateFlow) investSearchManager$initSearchHistory$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        investSearchManager$initSearchHistory$1.L$0 = null;
        investSearchManager$initSearchHistory$1.label = 2;
        if (flowCollector.emit(objWithContext, investSearchManager$initSearchHistory$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Duplicate block (B:37:0x00e4) to fix multi-entry loop: BACK_EDGE: B:37:0x00e4 -> B:38:0x00f3 */
    /* JADX WARN: Can't wrap try/catch for region: R(8:42|21|(4:24|(3:50|26|53)(1:52)|51|22)|49|27|46|28|(1:30)(5:31|32|33|38|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r7 = kotlin.Result.Companion;
        kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r6));
        r15 = r4;
        r5 = r14;
        r14 = r5;
        r6 = r2;
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b8 -> B:32:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull FilterRecord filterRecord, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InvestSearchManager$saveToHistory$1 investSearchManager$saveToHistory$1;
        MutableStateFlow mutableStateFlow;
        C23542iAf c23542iAf;
        java.lang.Object objWithContext;
        if (continuation instanceof InvestSearchManager$saveToHistory$1) {
            investSearchManager$saveToHistory$1 = (InvestSearchManager$saveToHistory$1) continuation;
            int i = investSearchManager$saveToHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investSearchManager$saveToHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                investSearchManager$saveToHistory$1 = new InvestSearchManager$saveToHistory$1(this, continuation);
            }
        }
        java.lang.Object obj = investSearchManager$saveToHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investSearchManager$saveToHistory$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutableStateFlow = this.AEQbTJ;
            c23542iAf = this;
            java.lang.Object value = mutableStateFlow.getValue();
            Sequence sequenceEZpvd = C59405zgS.EZpvd((java.lang.Object[]) new FilterRecord[]{filterRecord});
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (r5.hasNext()) {
            }
            java.util.List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.AYXKKw(C59467zhb.copydefault(sequenceEZpvd, (java.lang.Iterable) arrayList), 10));
            InterfaceC23639iDv interfaceC23639iDv = c23542iAf.copydefault;
            Result.Application application = Result.Companion;
            Intrinsics.copydefault(interfaceC23639iDv, "");
            C23642iDy c23642iDy = (C23642iDy) interfaceC23639iDv;
            CoroutineDispatcher coroutineDispatcher = c23642iDy.AEQbTJ;
            InvestSearchManager$saveToHistory$lambda$1$$inlined$putObject$1 investSearchManager$saveToHistory$lambda$1$$inlined$putObject$1 = new InvestSearchManager$saveToHistory$lambda$1$$inlined$putObject$1(null, c23642iDy, "sp.key.invest_search_history_2", listZuBGHE);
            investSearchManager$saveToHistory$1.L$0 = c23542iAf;
            investSearchManager$saveToHistory$1.L$1 = filterRecord;
            investSearchManager$saveToHistory$1.L$2 = mutableStateFlow;
            investSearchManager$saveToHistory$1.L$3 = value;
            investSearchManager$saveToHistory$1.L$4 = listZuBGHE;
            investSearchManager$saveToHistory$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, investSearchManager$saveToHistory$lambda$1$$inlined$putObject$1, investSearchManager$saveToHistory$1);
            if (objWithContext != objCopydefault) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List list = (java.util.List) investSearchManager$saveToHistory$1.L$4;
            java.lang.Object obj2 = investSearchManager$saveToHistory$1.L$3;
            MutableStateFlow mutableStateFlow2 = (MutableStateFlow) investSearchManager$saveToHistory$1.L$2;
            FilterRecord filterRecord2 = (FilterRecord) investSearchManager$saveToHistory$1.L$1;
            C23542iAf c23542iAf2 = (C23542iAf) investSearchManager$saveToHistory$1.L$0;
            try {
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (java.lang.Throwable th) {
                    C23542iAf c23542iAf3 = c23542iAf2;
                    java.util.List list2 = list;
                    FilterRecord filterRecord3 = filterRecord2;
                    java.lang.Object obj3 = obj2;
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    mutableStateFlow = mutableStateFlow2;
                    filterRecord2 = filterRecord3;
                    list = list2;
                    c23542iAf2 = c23542iAf3;
                    obj2 = obj3;
                    if (mutableStateFlow.compareAndSet(obj2, list)) {
                    }
                }
                java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl);
                Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objM7386unboximpl).booleanValue()));
                mutableStateFlow = mutableStateFlow2;
                if (mutableStateFlow.compareAndSet(obj2, list)) {
                    return Unit.INSTANCE;
                }
                filterRecord = filterRecord2;
                c23542iAf = c23542iAf2;
                java.lang.Object value2 = mutableStateFlow.getValue();
                Sequence sequenceEZpvd2 = C59405zgS.EZpvd((java.lang.Object[]) new FilterRecord[]{filterRecord});
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj4 : (java.util.List) value2) {
                    if (!Intrinsics.EZpvd((FilterRecord) obj4, filterRecord)) {
                        arrayList2.add(obj4);
                    }
                }
                java.util.List listZuBGHE2 = C59467zhb.zuBGHE(C59467zhb.AYXKKw(C59467zhb.copydefault(sequenceEZpvd2, (java.lang.Iterable) arrayList2), 10));
                InterfaceC23639iDv interfaceC23639iDv2 = c23542iAf.copydefault;
                Result.Application application3 = Result.Companion;
                Intrinsics.copydefault(interfaceC23639iDv2, "");
                C23642iDy c23642iDy2 = (C23642iDy) interfaceC23639iDv2;
                CoroutineDispatcher coroutineDispatcher2 = c23642iDy2.AEQbTJ;
                InvestSearchManager$saveToHistory$lambda$1$$inlined$putObject$1 investSearchManager$saveToHistory$lambda$1$$inlined$putObject$12 = new InvestSearchManager$saveToHistory$lambda$1$$inlined$putObject$1(null, c23642iDy2, "sp.key.invest_search_history_2", listZuBGHE2);
                investSearchManager$saveToHistory$1.L$0 = c23542iAf;
                investSearchManager$saveToHistory$1.L$1 = filterRecord;
                investSearchManager$saveToHistory$1.L$2 = mutableStateFlow;
                investSearchManager$saveToHistory$1.L$3 = value2;
                investSearchManager$saveToHistory$1.L$4 = listZuBGHE2;
                investSearchManager$saveToHistory$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, investSearchManager$saveToHistory$lambda$1$$inlined$putObject$12, investSearchManager$saveToHistory$1);
                if (objWithContext != objCopydefault) {
                    return objCopydefault;
                }
                filterRecord2 = filterRecord;
                list = listZuBGHE2;
                mutableStateFlow2 = mutableStateFlow;
                obj = objWithContext;
                c23542iAf2 = c23542iAf;
                obj2 = value2;
                java.lang.Object objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl2);
                Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objM7386unboximpl2).booleanValue()));
                mutableStateFlow = mutableStateFlow2;
                if (mutableStateFlow.compareAndSet(obj2, list)) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        }
    }
}
