package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.net.BizApiService;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C43393roT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes11.dex */
public final class OverviewViewModel$fetchLeadDetailInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewModel$fetchLeadDetailInfo$1(String str, OverviewViewModel overviewViewModel, Continuation<? super OverviewViewModel$fetchLeadDetailInfo$1> continuation) {
        super(2, continuation);
        this.$algoId = str;
        this.this$0 = overviewViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OverviewViewModel$fetchLeadDetailInfo$1 overviewViewModel$fetchLeadDetailInfo$1 = new OverviewViewModel$fetchLeadDetailInfo$1(this.$algoId, this.this$0, continuation);
        overviewViewModel$fetchLeadDetailInfo$1.L$0 = obj;
        return overviewViewModel$fetchLeadDetailInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewViewModel$fetchLeadDetailInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        OverviewViewModel overviewViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$algoId;
            overviewViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
            this.L$0 = overviewViewModel;
            this.label = 1;
            obj = bizApiService.fetchBotLeadDetailInfo(str, this);
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
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                OverviewViewModel overviewViewModel2 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MutableStateFlow mutableStateFlow = overviewViewModel2.copydefault;
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            overviewViewModel = (OverviewViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = overviewViewModel.copydefault;
        List list = (List) ((ResponseData) obj).getData();
        BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails = list != null ? (BotLeadProfitProfitOrderDetails) list.get(0) : null;
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(botLeadProfitProfitOrderDetails, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        OverviewViewModel overviewViewModel22 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
