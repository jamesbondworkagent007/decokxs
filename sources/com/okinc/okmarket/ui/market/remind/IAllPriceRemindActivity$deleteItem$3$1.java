package com.okinc.okmarket.ui.market.remind;

import com.okinc.market.alert.data.MarketUserAlert;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC46767tdQ;
import o.C38383pWt;
import o.C46705tcH;
import o.C55686xod;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class IAllPriceRemindActivity$deleteItem$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46705tcH $item;
    int label;
    final /* synthetic */ AbstractActivityC46767tdQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAllPriceRemindActivity$deleteItem$3$1(AbstractActivityC46767tdQ abstractActivityC46767tdQ, C46705tcH c46705tcH, Continuation<? super IAllPriceRemindActivity$deleteItem$3$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC46767tdQ;
        this.$item = c46705tcH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IAllPriceRemindActivity$deleteItem$3$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IAllPriceRemindActivity$deleteItem$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C38383pWt c38383pWtOLrzqt = this.this$0.OLrzqt();
            String strValues = this.$item.values();
            String strKWHzl = C55686xod.KWHzl();
            int iKWHzl = this.$item.KWHzl();
            String strFARcdN = this.$item.fARcdN();
            MarketUserAlert marketUserAlert = new MarketUserAlert(0L, strValues, strKWHzl, String.valueOf(iKWHzl), this.$item.djBIcL(), strFARcdN, this.$item.AEQbTJ(), this.$item.fIwbmz(), 1, null);
            this.label = 1;
            if (c38383pWtOLrzqt.copydefault(marketUserAlert, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
