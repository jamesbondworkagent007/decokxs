package com.okinc.dexkline.market.features.position.domain;

import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C34466ncc;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC34475ncl;

/* JADX INFO: loaded from: classes18.dex */
public final class GetRecentTransactionsUseCase$subscribeWs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PositionDetailsParam $params;
    final /* synthetic */ TxType $type;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C34466ncc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecentTransactionsUseCase$subscribeWs$2(PositionDetailsParam positionDetailsParam, TxType txType, String str, C34466ncc c34466ncc, Continuation<? super GetRecentTransactionsUseCase$subscribeWs$2> continuation) {
        super(2, continuation);
        this.$params = positionDetailsParam;
        this.$type = txType;
        this.$walletAddress = str;
        this.this$0 = c34466ncc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRecentTransactionsUseCase$subscribeWs$2(this.$params, this.$type, this.$walletAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetRecentTransactionsUseCase$subscribeWs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PnLExtraParams pnLExtraParams = new PnLExtraParams(this.$params.getChainId(), this.$walletAddress, this.$params.getTokenAddress(), this.$type.getValue());
            InterfaceC34475ncl interfaceC34475ncl = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC34475ncl.copydefault(pnLExtraParams, this);
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
        final C34466ncc c34466ncc = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.dexkline.market.features.position.domain.GetRecentTransactionsUseCase$subscribeWs$2.2
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<PnLTransactionData> list, Continuation<? super Unit> continuation) {
                C34466ncc c34466ncc2 = c34466ncc;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c34466ncc2.OLrzqt.copydefault((PnLTransactionData) it.next()));
                }
                List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) c34466ncc.copydefault().getValue());
                listFJNWhG.addAll(0, arrayList);
                c34466ncc.AEQbTJ.setValue(listFJNWhG);
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
