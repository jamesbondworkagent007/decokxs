package com.okinc.business.dexui.chain_picker;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25983jNp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23411hxi;

/* JADX INFO: loaded from: classes6.dex */
public final class ChainPickerViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChainPickerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainPickerViewModel$loadData$1(ChainPickerViewModel chainPickerViewModel, Continuation<? super ChainPickerViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = chainPickerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChainPickerViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChainPickerViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25983jNp c25983jNp = this.this$0.KWHzl;
            this.label = 1;
            obj = c25983jNp.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj2 : (Iterable) obj) {
            if (!z) {
                if (!Intrinsics.EZpvd((Object) ((MarketChainBean) obj2).getChainId(), (Object) "-100")) {
                    arrayList.add(obj2);
                    z = true;
                }
            } else {
                arrayList.add(obj2);
            }
        }
        this.this$0.copydefault.setValue(new InterfaceC23411hxi.Application(arrayList));
        return Unit.INSTANCE;
    }
}
