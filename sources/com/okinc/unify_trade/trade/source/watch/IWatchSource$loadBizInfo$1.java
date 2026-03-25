package com.okinc.unify_trade.trade.source.watch;

import com.okinc.market.common.MarketHttpApi;
import com.okinc.market.common.bean.GetProductInfoRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C43417ror;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.xTS;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final class IWatchSource$loadBizInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizReqS;
    final /* synthetic */ String $coinReq;
    final /* synthetic */ Function2<Boolean, Exception, Unit> $loader;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IWatchSource$loadBizInfo$1(String str, String str2, xTS xts, Function2<? super Boolean, ? super Exception, Unit> function2, Continuation<? super IWatchSource$loadBizInfo$1> continuation) {
        super(2, continuation);
        this.$coinReq = str;
        this.$bizReqS = str2;
        this.this$0 = xts;
        this.$loader = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IWatchSource$loadBizInfo$1(this.$coinReq, this.$bizReqS, this.this$0, this.$loader, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IWatchSource$loadBizInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object favoriteInfo;
        xTS xts;
        Function2<Boolean, Exception, Unit> function2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$coinReq;
            String str2 = this.$bizReqS;
            xTS xts2 = this.this$0;
            Function2<Boolean, Exception, Unit> function22 = this.$loader;
            Result.Application application2 = Result.Companion;
            MarketHttpApi marketHttpApi = (MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class));
            GetProductInfoRequest getProductInfoRequest = new GetProductInfoRequest(0, str, str2, false, yDY.AhwBna(), 9, null);
            this.L$0 = xts2;
            this.L$1 = function22;
            this.label = 1;
            favoriteInfo = marketHttpApi.getFavoriteInfo(getProductInfoRequest, this);
            if (favoriteInfo == objCopydefault) {
                return objCopydefault;
            }
            xts = xts2;
            function2 = function22;
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
                Function2<Boolean, Exception, Unit> function23 = this.$loader;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    IWatchSource$loadBizInfo$1$2$1 iWatchSource$loadBizInfo$1$2$1 = new IWatchSource$loadBizInfo$1$2$1(function23, null);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(main, iWatchSource$loadBizInfo$1$2$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            function2 = (Function2) this.L$1;
            xts = (xTS) this.L$0;
            C56391yDq.AEQbTJ(obj);
            favoriteInfo = obj;
        }
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        IWatchSource$loadBizInfo$1$1$1 iWatchSource$loadBizInfo$1$1$1 = new IWatchSource$loadBizInfo$1$1$1((ResponseData) favoriteInfo, xts, function2, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (BuildersKt.withContext(immediate, iWatchSource$loadBizInfo$1$1$1, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        Function2<Boolean, Exception, Unit> function232 = this.$loader;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
