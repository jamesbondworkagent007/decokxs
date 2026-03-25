package com.okinc.business.dex.tee.quick.market.ui.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30503lcQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;

/* JADX INFO: loaded from: classes5.dex */
public final class QuickMarketPlaceOrderViewModel$restoreAutoSellCheckboxState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ QuickMarketPlaceOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickMarketPlaceOrderViewModel$restoreAutoSellCheckboxState$1(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, Continuation<? super QuickMarketPlaceOrderViewModel$restoreAutoSellCheckboxState$1> continuation) {
        super(2, continuation);
        this.this$0 = quickMarketPlaceOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickMarketPlaceOrderViewModel$restoreAutoSellCheckboxState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickMarketPlaceOrderViewModel$restoreAutoSellCheckboxState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28149kQs interfaceC28149kQs = this.this$0.gEmmrt;
            this.label = 1;
            obj = interfaceC28149kQs.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                list = (List) obj;
                if (!(!list.isEmpty())) {
                    this.this$0.EZpvd.setValue(new AbstractC30503lcQ.StateListAnimator(list));
                } else {
                    InterfaceC28149kQs interfaceC28149kQs2 = this.this$0.gEmmrt;
                    this.label = 3;
                    if (interfaceC28149kQs2.KWHzl(false, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC28149kQs interfaceC28149kQs3 = this.this$0.gEmmrt;
            this.label = 2;
            obj = interfaceC28149kQs3.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            list = (List) obj;
            if (!(!list.isEmpty())) {
            }
        }
        return Unit.INSTANCE;
    }
}
