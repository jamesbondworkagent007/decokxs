package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC12782ctV;
import o.C15934eaS;
import o.C18911frO;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class GetSearchHistoryUseCase$invoke$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends SearchHistoryItem>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C18911frO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchHistoryUseCase$invoke$1(C18911frO c18911frO, Continuation<? super GetSearchHistoryUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = c18911frO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetSearchHistoryUseCase$invoke$1 getSearchHistoryUseCase$invoke$1 = new GetSearchHistoryUseCase$invoke$1(this.this$0, continuation);
        getSearchHistoryUseCase$invoke$1.L$0 = obj;
        return getSearchHistoryUseCase$invoke$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends SearchHistoryItem>> flowCollector, Continuation<? super Unit> continuation) {
        return ((GetSearchHistoryUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x00b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x000a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ?? r1;
        Throwable thM7380exceptionOrNullimpl;
        C18911frO c18911frO;
        FlowCollector flowCollector;
        Flow<List<DAppSearchHistory>> flow;
        List<? extends SearchType> listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            th = th;
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C18911frO c18911frO2 = this.this$0;
            Result.Application application = Result.Companion;
            CoroutineDispatcher coroutineDispatcher = c18911frO2.KWHzl;
            GetSearchHistoryUseCase$invoke$1$1$wallet$1 getSearchHistoryUseCase$invoke$1$1$wallet$1 = new GetSearchHistoryUseCase$invoke$1$1$wallet$1(c18911frO2, null);
            this.L$0 = flowCollector2;
            this.L$1 = c18911frO2;
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(coroutineDispatcher, getSearchHistoryUseCase$invoke$1$1$wallet$1, this);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c18911frO = c18911frO2;
            obj = objWithContext;
            flowCollector = flowCollector2;
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r12 = flowCollector3;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                r1 = r12;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("GetSearchHistoryUseCase", "Failed to get search history: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                    Flow flowEmptyFlow = FlowKt.emptyFlow();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 3;
                    if (FlowKt.emitAll((FlowCollector) r1, flowEmptyFlow, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            c18911frO = (C18911frO) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th2) {
                th = th2;
                r12 = flowCollector;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r1 = r12;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        boolean zCopydefault = c18911frO.copydefault();
        if (zCopydefault) {
            flow = c18911frO.EZpvd.OLrzqt();
        } else {
            flow = FlowKt.flow(new GetSearchHistoryUseCase$invoke$1$1$dappHistoryFlow$1(null));
        }
        Intrinsics.copydefault(abstractC12782ctV);
        if (C15934eaS.OLrzqt(abstractC12782ctV)) {
            listAhwBna = C56402yEa.EZpvd(SearchType.NFT_ASSET);
        } else {
            listAhwBna = yDY.AhwBna();
        }
        Flow flowFlowCombine = FlowKt.flowCombine(c18911frO.AEQbTJ.KWHzl(abstractC12782ctV.DbNXlk(), listAhwBna), flow, new GetSearchHistoryUseCase$invoke$1$1$1(c18911frO, zCopydefault, null));
        this.L$0 = flowCollector;
        this.L$1 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowFlowCombine, this) == objCopydefault) {
            return objCopydefault;
        }
        r12 = flowCollector;
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        r1 = r12;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
