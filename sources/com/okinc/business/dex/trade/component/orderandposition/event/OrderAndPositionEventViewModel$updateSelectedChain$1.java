package com.okinc.business.dex.trade.component.orderandposition.event;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
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
import o.InterfaceC19815gQi;
import o.kUP;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderAndPositionEventViewModel$updateSelectedChain$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ OrderAndPositionEventViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderAndPositionEventViewModel$updateSelectedChain$1(OrderAndPositionEventViewModel orderAndPositionEventViewModel, String str, Continuation<? super OrderAndPositionEventViewModel$updateSelectedChain$1> continuation) {
        super(2, continuation);
        this.this$0 = orderAndPositionEventViewModel;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderAndPositionEventViewModel$updateSelectedChain$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderAndPositionEventViewModel$updateSelectedChain$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kUP kup = this.this$0.fARcdN;
            this.label = 1;
            obj = kup.KWHzl(this);
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
        String str = this.$chainId;
        OrderAndPositionEventViewModel orderAndPositionEventViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Iterator it = ((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).iterator();
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
            DefiChainInfo defiChainInfo = (DefiChainInfo) next;
            if (defiChainInfo != null) {
                orderAndPositionEventViewModel.AhwBna.setValue(new InterfaceC19815gQi.Application(defiChainInfo));
            }
        }
        return Unit.INSTANCE;
    }
}
