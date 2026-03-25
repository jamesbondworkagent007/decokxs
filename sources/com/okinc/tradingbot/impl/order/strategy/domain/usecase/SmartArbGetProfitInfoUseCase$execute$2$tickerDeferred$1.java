package com.okinc.tradingbot.impl.order.strategy.domain.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC50055vAf;
import o.pUU;
import o.vNI;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TickersData>, Object> {
    final /* synthetic */ vNI.TaskDescription $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vNI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1(vNI vni, vNI.TaskDescription taskDescription, Continuation<? super SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = vni;
        this.$input = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1 smartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1 = new SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1(this.this$0, this.$input, continuation);
        smartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1.L$0 = obj;
        return smartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TickersData> continuation) {
        return ((SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                vNI vni = this.this$0;
                vNI.TaskDescription taskDescription = this.$input;
                InterfaceC50055vAf interfaceC50055vAf = vni.OLrzqt;
                String strAEQbTJ = taskDescription.AEQbTJ();
                this.label = 1;
                obj = interfaceC50055vAf.fetchVPNInfo(strAEQbTJ, this);
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
        List list = (List) actionBar.copydefault();
        if (list != null) {
            return (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }
}
