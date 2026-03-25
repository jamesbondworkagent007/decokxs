package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C30565ldZ;
import o.C56391yDq;
import o.C56442yFn;
import o.gWI;
import o.gWJ;
import o.gWU;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyBasicInfoViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ StrategyBasicInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyBasicInfoViewModel$loadData$1(StrategyBasicInfoViewModel strategyBasicInfoViewModel, Continuation<? super StrategyBasicInfoViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyBasicInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyBasicInfoViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyBasicInfoViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        StrategyBasicInfoViewModel strategyBasicInfoViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gWJ gwj = this.this$0.copydefault;
            String str = this.this$0.valueOf;
            CopyTradeStatRequest.TimeRange timeRange = CopyTradeStatRequest.TimeRange.LastOneYear;
            this.label = 1;
            objKWHzl = gwj.KWHzl(str, timeRange, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strategyBasicInfoViewModel = (StrategyBasicInfoViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                strategyBasicInfoViewModel.gEmmrt = ((Number) obj).intValue();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        StrategyBasicInfoViewModel strategyBasicInfoViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            CopyTradingPnLResponse copyTradingPnLResponse = (CopyTradingPnLResponse) objKWHzl;
            String pnLUsdValue = copyTradingPnLResponse.getPnlInfo().getTotalPnl().getPnLUsdValue();
            strategyBasicInfoViewModel2.copydefault(strategyBasicInfoViewModel2.valueOf, copyTradingPnLResponse.getChainId());
            strategyBasicInfoViewModel2.AEQbTJ.setValue(new gWU.Activity(pnLUsdValue, copyTradingPnLResponse));
        }
        StrategyBasicInfoViewModel strategyBasicInfoViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            strategyBasicInfoViewModel3.AEQbTJ.setValue(new gWU.Application(C30565ldZ.AEQbTJ(thM7380exceptionOrNullimpl)));
        }
        StrategyBasicInfoViewModel strategyBasicInfoViewModel4 = this.this$0;
        gWI gwi = strategyBasicInfoViewModel4.OLrzqt;
        this.L$0 = strategyBasicInfoViewModel4;
        this.label = 2;
        Object objOLrzqt = gwi.OLrzqt(this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        strategyBasicInfoViewModel = strategyBasicInfoViewModel4;
        obj = objOLrzqt;
        strategyBasicInfoViewModel.gEmmrt = ((Number) obj).intValue();
        return Unit.INSTANCE;
    }
}
