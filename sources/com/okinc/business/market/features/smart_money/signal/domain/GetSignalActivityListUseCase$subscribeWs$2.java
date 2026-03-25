package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.data.model.smart_money.SignalUpdate;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C29503kuq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC29466kuF;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalActivityListUseCase$subscribeWs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $chains;
    int label;
    final /* synthetic */ C29503kuq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalActivityListUseCase$subscribeWs$2(C29503kuq c29503kuq, List<String> list, Continuation<? super GetSignalActivityListUseCase$subscribeWs$2> continuation) {
        super(2, continuation);
        this.this$0 = c29503kuq;
        this.$chains = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalActivityListUseCase$subscribeWs$2(this.this$0, this.$chains, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetSignalActivityListUseCase$subscribeWs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.OLrzqt;
            List<String> list = this.$chains;
            this.label = 1;
            obj = interfaceC29466kuF.OLrzqt(list, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        final C29503kuq c29503kuq = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$2.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SignalUpdate> list2, Continuation<? super Unit> continuation) {
                ArrayList<SignalUpdate> arrayList = new ArrayList();
                for (T t : list2) {
                    if (((SignalUpdate) t).copydefault() == SignalUpdate.Type.ACTIVITY) {
                        arrayList.add(t);
                    }
                }
                C29503kuq c29503kuq2 = c29503kuq;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (SignalUpdate signalUpdate : arrayList) {
                    arrayList2.add(c29503kuq2.AEQbTJ.EZpvd(signalUpdate.OLrzqt().copydefault(), signalUpdate.OLrzqt().EZpvd(), TxType.BUY, c29503kuq2.AhwBna));
                }
                List listQOLQEE = C56403yEb.QOLQEE(arrayList2);
                if (C33129mqd.KWHzl((Collection) listQOLQEE)) {
                    List<SignalUiModel> value = c29503kuq.AEQbTJ().getValue();
                    if (value == null) {
                        value = yDY.AhwBna();
                    }
                    List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) value);
                    listFJNWhG.addAll(0, listQOLQEE);
                    c29503kuq.copydefault.setValue(listFJNWhG);
                }
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
