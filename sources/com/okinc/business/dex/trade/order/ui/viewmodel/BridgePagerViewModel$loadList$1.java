package com.okinc.business.dex.trade.order.ui.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C20071gZv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC20068gZs;
import o.gZC;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgePagerViewModel$loadList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BridgePagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgePagerViewModel$loadList$1(BridgePagerViewModel bridgePagerViewModel, Continuation<? super BridgePagerViewModel$loadList$1> continuation) {
        super(2, continuation);
        this.this$0 = bridgePagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BridgePagerViewModel$loadList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BridgePagerViewModel$loadList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gZC gzc = this.this$0.KWHzl;
            BridgeOrderSubStatus bridgeOrderSubStatusOLrzqt = this.this$0.OLrzqt();
            DefiChainInfo defiChainInfoCopydefault = this.this$0.copydefault();
            C20071gZv c20071gZv = new C20071gZv("", null, bridgeOrderSubStatusOLrzqt, null, defiChainInfoCopydefault != null ? defiChainInfoCopydefault.getChainId() : null, null, 0, 106, null);
            this.label = 1;
            obj = gzc.EZpvd(c20071gZv, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        if (abstractC43419rot.OLrzqt()) {
            this.this$0.copydefault.setValue(new InterfaceC20068gZs.Application(false));
            return Unit.INSTANCE;
        }
        OrderListPagerResult orderListPagerResult = (OrderListPagerResult) abstractC43419rot.copydefault();
        if (orderListPagerResult == null) {
            return Unit.INSTANCE;
        }
        this.this$0.EZpvd = orderListPagerResult.getCursor();
        if (orderListPagerResult.getDataList().isEmpty()) {
            this.this$0.copydefault.setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
            return Unit.INSTANCE;
        }
        this.this$0.copydefault.setValue(new InterfaceC20068gZs.StateListAnimator(this.this$0.OLrzqt(orderListPagerResult.getDataList()), orderListPagerResult.getHasNext(), null, 4, null));
        return Unit.INSTANCE;
    }
}
