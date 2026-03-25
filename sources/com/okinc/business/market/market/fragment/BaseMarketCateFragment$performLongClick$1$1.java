package com.okinc.business.market.market.fragment;

import android.graphics.Point;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC27870kGj;
import o.C38382pWs;
import o.C38383pWt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseMarketCateFragment$performLongClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinQuote $item;
    final /* synthetic */ Point $location;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC27870kGj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketCateFragment$performLongClick$1$1(CoinQuote coinQuote, AbstractC27870kGj abstractC27870kGj, Point point, Continuation<? super BaseMarketCateFragment$performLongClick$1$1> continuation) {
        super(2, continuation);
        this.$item = coinQuote;
        this.this$0 = abstractC27870kGj;
        this.$location = point;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseMarketCateFragment$performLongClick$1$1 baseMarketCateFragment$performLongClick$1$1 = new BaseMarketCateFragment$performLongClick$1$1(this.$item, this.this$0, this.$location, continuation);
        baseMarketCateFragment$performLongClick$1$1.L$0 = obj;
        return baseMarketCateFragment$performLongClick$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseMarketCateFragment$performLongClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoinQuote coinQuote;
        String instId;
        String instType;
        Object objCopydefault;
        CoroutineScope coroutineScope;
        AbstractC27870kGj abstractC27870kGj;
        Point point;
        Object objCopydefault2;
        boolean zBooleanValue;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                coinQuote = this.$item;
                AbstractC27870kGj abstractC27870kGj2 = this.this$0;
                Point point2 = this.$location;
                Result.Application application = Result.Companion;
                if (Intrinsics.EZpvd((Object) (coinQuote != null ? coinQuote.getInstType() : null), (Object) "COIN")) {
                    C38383pWt newProxyInstance = abstractC27870kGj2.getNewProxyInstance();
                    String str = (coinQuote != null ? coinQuote.getInstId() : null) + "-USDT";
                    String strOLrzqt = C38382pWs.copydefault.OLrzqt("SPOT");
                    this.L$0 = coroutineScope2;
                    this.L$1 = coinQuote;
                    this.L$2 = abstractC27870kGj2;
                    this.L$3 = point2;
                    this.label = 1;
                    objCopydefault2 = newProxyInstance.copydefault(str, strOLrzqt, this);
                    if (objCopydefault2 == objCopydefault3) {
                        return objCopydefault3;
                    }
                    coroutineScope = coroutineScope2;
                    abstractC27870kGj = abstractC27870kGj2;
                    point = point2;
                    zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
                } else {
                    C38383pWt newProxyInstance2 = abstractC27870kGj2.getNewProxyInstance();
                    if (coinQuote == null || (instId = coinQuote.getInstId()) == null) {
                        instId = "";
                    }
                    C38382pWs c38382pWs = C38382pWs.copydefault;
                    if (coinQuote == null || (instType = coinQuote.getInstType()) == null) {
                        instType = "";
                    }
                    String strOLrzqt2 = c38382pWs.OLrzqt(instType);
                    this.L$0 = coroutineScope2;
                    this.L$1 = coinQuote;
                    this.L$2 = abstractC27870kGj2;
                    this.L$3 = point2;
                    this.label = 2;
                    objCopydefault = newProxyInstance2.copydefault(instId, strOLrzqt2, this);
                    if (objCopydefault == objCopydefault3) {
                        return objCopydefault3;
                    }
                    coroutineScope = coroutineScope2;
                    abstractC27870kGj = abstractC27870kGj2;
                    point = point2;
                    zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                }
            } else if (i == 1) {
                point = (Point) this.L$3;
                abstractC27870kGj = (AbstractC27870kGj) this.L$2;
                CoinQuote coinQuote2 = (CoinQuote) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coinQuote = coinQuote2;
                objCopydefault2 = obj;
                zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                point = (Point) this.L$3;
                abstractC27870kGj = (AbstractC27870kGj) this.L$2;
                CoinQuote coinQuote3 = (CoinQuote) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coinQuote = coinQuote3;
                objCopydefault = obj;
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
            }
            AbstractC27870kGj abstractC27870kGj3 = abstractC27870kGj;
            boolean z = zBooleanValue;
            MarketToolDialog.Activity activity = MarketToolDialog.Companion;
            String name = coroutineScope.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            activity.copydefault(abstractC27870kGj3, name, point.y, coinQuote.isWatch(), abstractC27870kGj3.uzCIH(), (96 & 32) != 0 ? false : z, (96 & 64) != 0 ? false : false);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
