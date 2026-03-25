package com.okinc.unify_trade.trade.source.watch;

import com.okinc.market.common.MarketHttpApi;
import com.okinc.market.common.bean.FavoriteInfo;
import com.okinc.market.watch.data.po.FavGroupItemPo;
import com.okinc.market.watch.data.po.FavGroupProductItemPo;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C40452qWj;
import o.C40453qWk;
import o.C40460qWr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.xPY;
import o.xUG;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final class WatchMarketDataSource$loadWatchList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Exception, Unit> $loader;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xUG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchMarketDataSource$loadWatchList$1(xUG xug, Function2<? super Boolean, ? super Exception, Unit> function2, Continuation<? super WatchMarketDataSource$loadWatchList$1> continuation) {
        super(2, continuation);
        this.this$0 = xug;
        this.$loader = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchMarketDataSource$loadWatchList$1(this.this$0, this.$loader, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchMarketDataSource$loadWatchList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        xUG xug;
        Function2<Boolean, Exception, Unit> function2;
        FavGroupProductItemPo favGroupProductItemPo;
        List<C40453qWk> listAhwBna;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xug = this.this$0;
                Function2<Boolean, Exception, Unit> function22 = this.$loader;
                Result.Application application = Result.Companion;
                MarketHttpApi marketHttpApiWlaJM = xug.wlaJM();
                this.L$0 = xug;
                this.L$1 = function22;
                this.label = 1;
                Object groupFavProductInfo$default = MarketHttpApi.ActionBar.getGroupFavProductInfo$default(marketHttpApiWlaJM, 0, null, null, false, this, 15, null);
                if (groupFavProductInfo$default == objCopydefault) {
                    return objCopydefault;
                }
                function2 = function22;
                obj = groupFavProductInfo$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = (Function2) this.L$1;
                xug = (xUG) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                List list = (List) responseData.getData();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((FavGroupProductItemPo) next).getGroupName(), (Object) "ALL")) {
                            break;
                        }
                    }
                    favGroupProductItemPo = (FavGroupProductItemPo) next;
                } else {
                    favGroupProductItemPo = null;
                }
                FavoriteInfo combineFavouriteBean = favGroupProductItemPo != null ? favGroupProductItemPo.getCombineFavouriteBean() : null;
                if (combineFavouriteBean != null) {
                    xug.EZpvd(combineFavouriteBean);
                    List list2 = (List) responseData.getData();
                    if (list2 == null) {
                        listAhwBna = yDY.AhwBna();
                    } else {
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C40460qWr.AEQbTJ((FavGroupProductItemPo) it2.next()));
                        }
                        listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            listAhwBna.add(C40452qWj.AEQbTJ((FavGroupItemPo) it3.next()));
                        }
                    }
                    if (xug.values() instanceof xPY) {
                        ((xPY) xug.values()).EZpvd(listAhwBna);
                    }
                } else {
                    function2.invoke(C56443yFo.KWHzl(false), null);
                }
                function2.invoke(C56443yFo.KWHzl(true), null);
            } else {
                function2.invoke(C56443yFo.KWHzl(false), null);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function2<Boolean, Exception, Unit> function23 = this.$loader;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && !(thM7380exceptionOrNullimpl instanceof CancellationException)) {
            function23.invoke(C56443yFo.KWHzl(false), thM7380exceptionOrNullimpl instanceof Exception ? (Exception) thM7380exceptionOrNullimpl : null);
        }
        return Unit.INSTANCE;
    }
}
