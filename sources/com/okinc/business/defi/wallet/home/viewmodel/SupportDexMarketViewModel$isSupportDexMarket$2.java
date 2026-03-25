package com.okinc.business.defi.wallet.home.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C18272ffK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class SupportDexMarketViewModel$isSupportDexMarket$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ long $generalChainId;
    int label;
    final /* synthetic */ C18272ffK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportDexMarketViewModel$isSupportDexMarket$2(C18272ffK c18272ffK, long j, Continuation<? super SupportDexMarketViewModel$isSupportDexMarket$2> continuation) {
        super(2, continuation);
        this.this$0 = c18272ffK;
        this.$generalChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportDexMarketViewModel$isSupportDexMarket$2(this.this$0, this.$generalChainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SupportDexMarketViewModel$isSupportDexMarket$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zContains;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.KWHzl.isEmpty()) {
                zContains = this.this$0.KWHzl.contains(String.valueOf(this.$generalChainId));
                return C56443yFo.KWHzl(zContains);
            }
            C13934dbu c13934dbu = this.this$0.copydefault;
            this.label = 1;
            obj = c13934dbu.AkhnZx(this);
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
        C18272ffK c18272ffK = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Iterator it = ((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).iterator();
            while (it.hasNext()) {
                c18272ffK.KWHzl.add(((MarketChainBean) it.next()).getChainId());
            }
        }
        zContains = this.this$0.KWHzl.contains(String.valueOf(this.$generalChainId));
        return C56443yFo.KWHzl(zContains);
    }
}
