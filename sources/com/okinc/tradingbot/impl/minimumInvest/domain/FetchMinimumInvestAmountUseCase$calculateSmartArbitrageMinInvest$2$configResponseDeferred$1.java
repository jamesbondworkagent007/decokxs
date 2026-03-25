package com.okinc.tradingbot.impl.minimumInvest.domain;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C52020vxx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC50055vAf;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends StrategyConfigInfo>>, Object> {
    final /* synthetic */ C52020vxx.Activity.C0987Activity $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52020vxx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1(C52020vxx c52020vxx, C52020vxx.Activity.C0987Activity c0987Activity, Continuation<? super FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c52020vxx;
        this.$input = c0987Activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1 fetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1 = new FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1(this.this$0, this.$input, continuation);
        fetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1.L$0 = obj;
        return fetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends StrategyConfigInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<StrategyConfigInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<StrategyConfigInfo>> continuation) {
        return ((FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2$configResponseDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C52020vxx c52020vxx = this.this$0;
                C52020vxx.Activity.C0987Activity c0987Activity = this.$input;
                InterfaceC50055vAf interfaceC50055vAf = c52020vxx.AEQbTJ;
                String strAEQbTJ = c0987Activity.AEQbTJ();
                this.label = 1;
                obj = interfaceC50055vAf.AhwBna("smart_arbitrage", strAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return actionBar.AEQbTJ();
    }
}
