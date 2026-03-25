package com.okinc.planet.biz_content.leaderboard.viewmodel;

import com.okinc.planet.biz_content.leaderboard.bean.Rank;
import com.okinc.planet.biz_content.leaderboard.bean.TopTrader;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C47668tuU;
import o.C47673tuZ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47663tuP;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTopTradersViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $size;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47673tuZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetTopTradersViewModel$loadData$1(C47673tuZ c47673tuZ, String str, Continuation<? super PlanetTopTradersViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = c47673tuZ;
        this.$size = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetTopTradersViewModel$loadData$1 planetTopTradersViewModel$loadData$1 = new PlanetTopTradersViewModel$loadData$1(this.this$0, this.$size, continuation);
        planetTopTradersViewModel$loadData$1.L$0 = obj;
        return planetTopTradersViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTopTradersViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C47673tuZ c47673tuZ = this.this$0;
            String str = this.$size;
            Result.Application application2 = Result.Companion;
            C47668tuU c47668tuU = c47673tuZ.AEQbTJ;
            String strCopydefault = c47673tuZ.copydefault();
            String strOLrzqt = c47673tuZ.OLrzqt();
            this.label = 1;
            obj = InterfaceC47663tuP.TaskDescription.invoke$default(c47668tuU, str, "1", strCopydefault, strOLrzqt, null, this, 16, null);
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
        objM7377constructorimpl = Result.m7377constructorimpl((TopTrader) obj);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("qjf", "getTopTradersUseCase failed " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            objM7377constructorimpl = null;
        }
        TopTrader topTrader = (TopTrader) objM7377constructorimpl;
        MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
        List<Rank> ranks = topTrader != null ? topTrader.getRanks() : null;
        this.label = 2;
        if (mutableSharedFlow.emit(ranks, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
