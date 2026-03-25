package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC20007gXl;
import o.C20013gXr;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.gLQ;
import o.gWN;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyBasicInfoViewModel$updateOrderStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StrategyStatus $status;
    Object L$0;
    int label;
    final /* synthetic */ StrategyBasicInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyBasicInfoViewModel$updateOrderStatus$1(StrategyBasicInfoViewModel strategyBasicInfoViewModel, StrategyStatus strategyStatus, Continuation<? super StrategyBasicInfoViewModel$updateOrderStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyBasicInfoViewModel;
        this.$status = strategyStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyBasicInfoViewModel$updateOrderStatus$1(this.this$0, this.$status, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrategyBasicInfoViewModel$updateOrderStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Triple triple;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gWN gwn = this.this$0.values;
            this.label = 1;
            obj = gWN.checkSAState$default(gwn, null, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                triple = (Triple) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                StrategyBasicInfoViewModel strategyBasicInfoViewModel = this.this$0;
                StrategyStatus strategyStatus = this.$status;
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    if (((Number) objOLrzqt).intValue() == 0) {
                        strategyBasicInfoViewModel.copydefault(new AbstractC20007gXl.ActionBar(triple, false, strategyStatus, null, null, 24, null));
                    } else {
                        strategyBasicInfoViewModel.copydefault(new AbstractC20007gXl.TaskDescription("", strategyStatus));
                    }
                }
                StrategyBasicInfoViewModel strategyBasicInfoViewModel2 = this.this$0;
                StrategyStatus strategyStatus2 = this.$status;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                    boolean z2 = thM7380exceptionOrNullimpl instanceof OKServerException;
                    OKServerException oKServerException = z2 ? (OKServerException) thM7380exceptionOrNullimpl : null;
                    String message = oKServerException != null ? oKServerException.getMessage() : null;
                    if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException)) {
                        z = z2 ? ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException : false;
                    }
                    strategyBasicInfoViewModel2.copydefault(new AbstractC20007gXl.ActionBar(triple, z, strategyStatus2, message, null, 16, null));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        gLQ glq = (gLQ) obj;
        String str = this.this$0.valueOf;
        CopyTradingPnLResponse copyTradingPnLResponseEZpvd = this.this$0.EZpvd();
        String name = copyTradingPnLResponseEZpvd != null ? copyTradingPnLResponseEZpvd.getName() : null;
        if (name == null) {
            name = "";
        }
        CopyTradingPnLResponse copyTradingPnLResponseEZpvd2 = this.this$0.EZpvd();
        String chainId = copyTradingPnLResponseEZpvd2 != null ? copyTradingPnLResponseEZpvd2.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        Triple triple2 = new Triple(str, name, chainId);
        if (this.$status != StrategyStatus.Active || glq == null || this.this$0.AEQbTJ(glq)) {
            C20013gXr c20013gXr = this.this$0.djBIcL;
            List<String> listEZpvd = C56402yEa.EZpvd(triple2.getFirst());
            StrategyStatus strategyStatus3 = this.$status;
            this.L$0 = triple2;
            this.label = 2;
            objOLrzqt = c20013gXr.OLrzqt(listEZpvd, strategyStatus3, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            triple = triple2;
            StrategyBasicInfoViewModel strategyBasicInfoViewModel3 = this.this$0;
            StrategyStatus strategyStatus4 = this.$status;
            if (Result.m7384isSuccessimpl(objOLrzqt)) {
            }
            StrategyBasicInfoViewModel strategyBasicInfoViewModel22 = this.this$0;
            StrategyStatus strategyStatus22 = this.$status;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        this.this$0.copydefault(new AbstractC20007gXl.ActionBar(triple2, false, this.$status, null, glq, 8, null));
        return Unit.INSTANCE;
    }
}
