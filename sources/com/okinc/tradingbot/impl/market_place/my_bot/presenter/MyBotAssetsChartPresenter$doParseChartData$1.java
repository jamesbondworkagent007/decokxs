package com.okinc.tradingbot.impl.market_place.my_bot.presenter;

import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C51714vsI;
import o.C51715vsJ;
import o.C56391yDq;
import o.C56405yEd;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class MyBotAssetsChartPresenter$doParseChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BotAssetsHistoryData> $list;
    int label;
    final /* synthetic */ MyBotAssetsChartPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBotAssetsChartPresenter$doParseChartData$1(List<BotAssetsHistoryData> list, MyBotAssetsChartPresenter myBotAssetsChartPresenter, Continuation<? super MyBotAssetsChartPresenter$doParseChartData$1> continuation) {
        super(2, continuation);
        this.$list = list;
        this.this$0 = myBotAssetsChartPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBotAssetsChartPresenter$doParseChartData$1(this.$list, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBotAssetsChartPresenter$doParseChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<BotAssetsHistoryData> listHDKMBd = C56405yEd.hDKMBd(this.$list);
            if (this.this$0.DbNXlk()) {
                this.this$0.AYXKKw().postValue(new C51714vsI().KWHzl(listHDKMBd));
            } else {
                this.this$0.KWHzl().postValue(new C51715vsJ().KWHzl2(listHDKMBd));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
