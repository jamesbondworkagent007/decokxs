package com.okinc.unify_trade.trade.source.watch;

import com.okinc.market.common.bean.FavoriteInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.FavoriteBizConfig;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import com.okinc.unify_trade.biz.FavoriteBizInst;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.xTS;

/* JADX INFO: loaded from: classes12.dex */
public final class IWatchSource$loadBizInfo$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Exception, Unit> $loader;
    final /* synthetic */ ResponseData<FavoriteInfo> $result;
    int label;
    final /* synthetic */ xTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IWatchSource$loadBizInfo$1$1$1(ResponseData<FavoriteInfo> responseData, xTS xts, Function2<? super Boolean, ? super Exception, Unit> function2, Continuation<? super IWatchSource$loadBizInfo$1$1$1> continuation) {
        super(2, continuation);
        this.$result = responseData;
        this.this$0 = xts;
        this.$loader = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IWatchSource$loadBizInfo$1$1$1(this.$result, this.this$0, this.$loader, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IWatchSource$loadBizInfo$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FavoriteBizInfo favoriteBizInfo;
        FavoriteBizConfig favoriteBizConfig;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ResponseData<FavoriteInfo> responseData = this.$result;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                FavoriteInfo data = this.$result.getData();
                if (data != null) {
                    FavoriteBizInst simpleProduct = data.getSimpleProduct();
                    List<TradeCoinInfo> coins = data.getCoins();
                    List<FavoriteBizConfig> configs = data.getConfigs();
                    if (configs == null || (favoriteBizConfig = (FavoriteBizConfig) CollectionsKt___CollectionsKt.firstOrNull(configs)) == null) {
                        favoriteBizConfig = new FavoriteBizConfig((List) null, (List) null, 3, (DefaultConstructorMarker) null);
                    }
                    favoriteBizInfo = new FavoriteBizInfo(simpleProduct, favoriteBizConfig, coins);
                } else {
                    favoriteBizInfo = new FavoriteBizInfo((FavoriteBizInst) null, (FavoriteBizConfig) null, (List) null, 7, (DefaultConstructorMarker) null);
                }
                this.this$0.AEQbTJ(favoriteBizInfo);
                this.$loader.invoke(C56443yFo.KWHzl(true), null);
            } else {
                this.$loader.invoke(C56443yFo.KWHzl(false), null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
