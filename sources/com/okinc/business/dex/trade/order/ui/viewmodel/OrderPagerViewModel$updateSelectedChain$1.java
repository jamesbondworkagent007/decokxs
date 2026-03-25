package com.okinc.business.dex.trade.order.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC20068gZs;
import o.kUH;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderPagerViewModel$updateSelectedChain$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ OrderPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPagerViewModel$updateSelectedChain$1(OrderPagerViewModel orderPagerViewModel, String str, Continuation<? super OrderPagerViewModel$updateSelectedChain$1> continuation) {
        super(2, continuation);
        this.this$0 = orderPagerViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderPagerViewModel$updateSelectedChain$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderPagerViewModel$updateSelectedChain$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DefiChainInfo defiChainInfo;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kUH kuh = this.this$0.DbNXlk;
            ChainBizType chainBizType = ChainBizType.Single;
            this.label = 1;
            obj = kuh.EZpvd(chainBizType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((AbstractC43419rot) obj).copydefault();
        if (list != null) {
            String str = this.$chainId;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                    break;
                }
            }
            defiChainInfo = (DefiChainInfo) next;
        } else {
            defiChainInfo = null;
        }
        if (defiChainInfo == null) {
            this.this$0.DbNXlk().setValue(new InterfaceC20068gZs.ActionBar(false));
            this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(true));
            this.this$0.AEQbTJ((DefiChainInfo) null);
            return Unit.INSTANCE;
        }
        this.this$0.AEQbTJ(defiChainInfo);
        OrderPagerViewModel.loadOrderList$default(this.this$0, false, 1, null);
        return Unit.INSTANCE;
    }
}
