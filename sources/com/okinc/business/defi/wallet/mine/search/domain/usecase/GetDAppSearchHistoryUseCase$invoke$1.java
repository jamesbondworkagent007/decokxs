package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.dapp.bean.DappSearchResultBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import o.C18907frK;
import o.C56391yDq;
import o.C56403yEb;
import o.C56405yEd;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class GetDAppSearchHistoryUseCase$invoke$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends DAppSearchHistory>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C18907frK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDAppSearchHistoryUseCase$invoke$1(C18907frK c18907frK, Continuation<? super GetDAppSearchHistoryUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = c18907frK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetDAppSearchHistoryUseCase$invoke$1 getDAppSearchHistoryUseCase$invoke$1 = new GetDAppSearchHistoryUseCase$invoke$1(this.this$0, continuation);
        getDAppSearchHistoryUseCase$invoke$1.L$0 = obj;
        return getDAppSearchHistoryUseCase$invoke$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends DAppSearchHistory>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<DAppSearchHistory>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<DAppSearchHistory>> flowCollector, Continuation<? super Unit> continuation) {
        return ((GetDAppSearchHistoryUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x00e2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x000c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ?? r1;
        Throwable thM7380exceptionOrNullimpl;
        C18907frK c18907frK;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
            if (r12 == 0) {
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                C18907frK c18907frK2 = this.this$0;
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = c18907frK2.OLrzqt;
                GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1 getDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1 = new GetDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1(null);
                this.L$0 = flowCollector2;
                this.L$1 = c18907frK2;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, getDAppSearchHistoryUseCase$invoke$1$1$dappHistoryBeans$1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c18907frK = c18907frK2;
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
                        pUU.AEQbTJ("GetDAppSearchHistoryUseCase", "Failed to get DApp search history from database: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                        List listAhwBna = yDY.AhwBna();
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.label = 3;
                        if (r1.emit(listAhwBna, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                c18907frK = (C18907frK) this.L$1;
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
            List list = (List) obj;
            pUU.EZpvd("GetDAppSearchHistoryUseCase", "Loaded " + list.size() + " DApp items from database");
            Intrinsics.copydefault(list);
            List listHDKMBd = C56405yEd.hDKMBd(list);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listHDKMBd, 10));
            Iterator it = listHDKMBd.iterator();
            while (it.hasNext()) {
                arrayList.add(c18907frK.KWHzl((DappSearchResultBean) it.next()));
            }
            List listAhwBna2 = CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, 50);
            pUU.EZpvd("GetDAppSearchHistoryUseCase", "Converted " + listAhwBna2.size() + " DApp history items (limited to 50)");
            this.L$0 = flowCollector;
            this.L$1 = null;
            this.label = 2;
            if (flowCollector.emit(listAhwBna2, this) == objCopydefault) {
                return objCopydefault;
            }
            r12 = flowCollector;
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            r1 = r12;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
