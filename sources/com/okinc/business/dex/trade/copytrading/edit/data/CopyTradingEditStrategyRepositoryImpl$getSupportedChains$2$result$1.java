package com.okinc.business.dex.trade.copytrading.edit.data;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C19869gSi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23225huH;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends DefiChainInfo>>>, Object> {
    int label;
    final /* synthetic */ C19869gSi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1(C19869gSi c19869gSi, Continuation<? super CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1> continuation) {
        super(1, continuation);
        this.this$0 = c19869gSi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends DefiChainInfo>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<DefiChainInfo>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<DefiChainInfo>>> continuation) {
        return ((CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23225huH interfaceC23225huH = this.this$0.AhwBna;
            int value = BizMode.COPY_TRADE.getValue();
            this.label = 1;
            obj = interfaceC23225huH.OLrzqt(value, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
