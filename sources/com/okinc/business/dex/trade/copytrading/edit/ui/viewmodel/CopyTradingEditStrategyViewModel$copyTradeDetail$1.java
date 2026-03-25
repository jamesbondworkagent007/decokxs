package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C20005gXj;
import o.C56391yDq;
import o.C56442yFn;
import o.gTB;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$copyTradeDetail$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Result<? extends CopyTradeDetail>>, Object> {
    int label;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$copyTradeDetail$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Continuation<? super CopyTradingEditStrategyViewModel$copyTradeDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyViewModel$copyTradeDetail$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Result<CopyTradeDetail>> continuation) {
        return ((CopyTradingEditStrategyViewModel$copyTradeDetail$1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Result<? extends CopyTradeDetail>> continuation) {
        return invoke(num.intValue(), (Continuation<? super Result<CopyTradeDetail>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20005gXj c20005gXj = this.this$0.AuCTel;
            String str = this.this$0.sSMYrx;
            this.label = 1;
            objOLrzqt = c20005gXj.OLrzqt(str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            CopyTradeDetail copyTradeDetail = (CopyTradeDetail) objOLrzqt;
            copyTradingEditStrategyViewModel.EZpvd(new gTB.ActionBar(copyTradeDetail.getStrategyName()));
            copyTradingEditStrategyViewModel.copydefault(copyTradeDetail.getTrackedWalletAddress());
            copyTradingEditStrategyViewModel.OLrzqt(copyTradeDetail.getChainId());
        }
        return Result.m7376boximpl(objOLrzqt);
    }
}
