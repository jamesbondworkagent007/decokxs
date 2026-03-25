package com.okinc.planet.biz_content.leaderboard.viewmodel;

import com.okinc.planet.biz_content.leaderboard.bean.Rank;
import com.okinc.planet.biz_content.leaderboard.bean.TopTrader;
import com.okinc.uilab.stateful.StatefulView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C47655tuH;
import o.C47668tuU;
import o.C47672tuY;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class TopTradersActivityViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefresh;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47672tuY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopTradersActivityViewModel$loadData$1(C47672tuY c47672tuY, boolean z, Continuation<? super TopTradersActivityViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = c47672tuY;
        this.$isRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TopTradersActivityViewModel$loadData$1 topTradersActivityViewModel$loadData$1 = new TopTradersActivityViewModel$loadData$1(this.this$0, this.$isRefresh, continuation);
        topTradersActivityViewModel$loadData$1.L$0 = obj;
        return topTradersActivityViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopTradersActivityViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        List<Object> listAhwBna;
        List<Rank> ranks;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C47672tuY c47672tuY = this.this$0;
                Result.Application application = Result.Companion;
                C47668tuU c47668tuU = c47672tuY.copydefault;
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(c47672tuY.valueOf()));
                String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(c47672tuY.KWHzl()));
                String strEZpvd = c47672tuY.EZpvd();
                String strAEQbTJ = c47672tuY.AEQbTJ();
                String strAhwBna = c47672tuY.AhwBna();
                this.label = 1;
                obj = c47668tuU.copydefault(strGEmmrt, strGEmmrt2, strEZpvd, strAEQbTJ, strAhwBna, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((TopTrader) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("qjf", "getTopTradersUseCase failed " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            objM7377constructorimpl = null;
        }
        TopTrader topTrader = (TopTrader) objM7377constructorimpl;
        int iAhwBna = C33129mqd.AhwBna(topTrader != null ? topTrader.getPages() : null);
        this.this$0.AEQbTJ(topTrader != null ? topTrader.getDataVersion() : null);
        if (this.this$0.KWHzl() < C33129mqd.AhwBna(C56443yFo.AEQbTJ(iAhwBna))) {
            this.this$0.AEQbTJ(true);
        } else {
            this.this$0.AEQbTJ(false);
        }
        if (C33129mqd.KWHzl((Collection) (topTrader != null ? topTrader.getRanks() : null))) {
            ArrayList arrayList = new ArrayList();
            if (this.$isRefresh) {
                ranks = topTrader != null ? topTrader.getRanks() : null;
                Intrinsics.copydefault(ranks);
                arrayList.addAll(ranks);
            } else {
                C47655tuH value = this.this$0.AYXKKw().getValue();
                if (value == null || (listAhwBna = value.KWHzl()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                arrayList.addAll(listAhwBna);
                ranks = topTrader != null ? topTrader.getRanks() : null;
                Intrinsics.copydefault(ranks);
                arrayList.addAll(ranks);
            }
            this.this$0.AYXKKw().setValue(new C47655tuH(StatefulView.Status.Content, arrayList, this.this$0.djBIcL(), this.$isRefresh, null, 16, null));
        } else {
            this.this$0.AYXKKw().setValue(new C47655tuH(StatefulView.Status.Empty, yDY.AhwBna(), false, this.$isRefresh, null, 16, null));
        }
        return Unit.INSTANCE;
    }
}
