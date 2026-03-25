package com.okinc.business.dex.trade.order.ui.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.TradesOrderData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C20071gZv;
import o.C20074gZy;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC20068gZs;
import o.gZE;

/* JADX INFO: loaded from: classes5.dex */
public final class TradesPagerViewModel$loadList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TradesPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradesPagerViewModel$loadList$1(TradesPagerViewModel tradesPagerViewModel, Continuation<? super TradesPagerViewModel$loadList$1> continuation) {
        super(2, continuation);
        this.this$0 = tradesPagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradesPagerViewModel$loadList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradesPagerViewModel$loadList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gZE gze = this.this$0.gEmmrt;
            OrderSubStatus orderSubStatusCopydefault = this.this$0.copydefault();
            DefiChainInfo defiChainInfoEZpvd = this.this$0.EZpvd();
            C20071gZv c20071gZv = new C20071gZv("", orderSubStatusCopydefault, null, null, defiChainInfoEZpvd != null ? defiChainInfoEZpvd.getChainId() : null, null, 20, 44, null);
            this.label = 1;
            obj = gze.copydefault(c20071gZv, this);
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
            this.this$0.OLrzqt.setValue(new InterfaceC20068gZs.Application(false));
            return Unit.INSTANCE;
        }
        OrderListPagerResult orderListPagerResult = (OrderListPagerResult) abstractC43419rot.copydefault();
        if (orderListPagerResult == null) {
            return Unit.INSTANCE;
        }
        this.this$0.EZpvd = orderListPagerResult.getCursor();
        if (orderListPagerResult.getDataList().isEmpty()) {
            this.this$0.OLrzqt.setValue(new InterfaceC20068gZs.ActionBar(false, 1, null));
            return Unit.INSTANCE;
        }
        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
        List dataList = orderListPagerResult.getDataList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
        Iterator it = dataList.iterator();
        while (it.hasNext()) {
            arrayList.add(C20074gZy.Companion.EZpvd((TradesOrderData) it.next()));
        }
        mutableStateFlow.setValue(new InterfaceC20068gZs.StateListAnimator(this.this$0.copydefault.AEQbTJ(arrayList), orderListPagerResult.getHasNext(), null, 4, null));
        return Unit.INSTANCE;
    }
}
