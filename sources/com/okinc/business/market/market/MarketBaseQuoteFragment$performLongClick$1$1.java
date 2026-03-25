package com.okinc.business.market.market;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC27806kEY;
import o.C38382pWs;
import o.C38383pWt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketBaseQuoteFragment$performLongClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinQuote $item;
    final /* synthetic */ int[] $location;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC27806kEY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketBaseQuoteFragment$performLongClick$1$1(CoinQuote coinQuote, AbstractC27806kEY abstractC27806kEY, int[] iArr, Continuation<? super MarketBaseQuoteFragment$performLongClick$1$1> continuation) {
        super(2, continuation);
        this.$item = coinQuote;
        this.this$0 = abstractC27806kEY;
        this.$location = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketBaseQuoteFragment$performLongClick$1$1 marketBaseQuoteFragment$performLongClick$1$1 = new MarketBaseQuoteFragment$performLongClick$1$1(this.$item, this.this$0, this.$location, continuation);
        marketBaseQuoteFragment$performLongClick$1$1.L$0 = obj;
        return marketBaseQuoteFragment$performLongClick$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketBaseQuoteFragment$performLongClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        int[] iArr;
        CoinQuote coinQuote;
        AbstractC27806kEY abstractC27806kEY;
        CoroutineScope coroutineScope;
        Object objCopydefault2;
        boolean zBooleanValue;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoinQuote coinQuote2 = this.$item;
                AbstractC27806kEY abstractC27806kEY2 = this.this$0;
                int[] iArr2 = this.$location;
                Result.Application application = Result.Companion;
                if (Intrinsics.EZpvd((Object) coinQuote2.getInstType(), (Object) "COIN")) {
                    C38383pWt c38383pWtFJNWhG = abstractC27806kEY2.fJNWhG();
                    String str = coinQuote2.getInstId() + "-USDT";
                    String strOLrzqt = C38382pWs.copydefault.OLrzqt("SPOT");
                    this.L$0 = coroutineScope2;
                    this.L$1 = coinQuote2;
                    this.L$2 = abstractC27806kEY2;
                    this.L$3 = iArr2;
                    this.label = 1;
                    objCopydefault2 = c38383pWtFJNWhG.copydefault(str, strOLrzqt, this);
                    if (objCopydefault2 == objCopydefault3) {
                        return objCopydefault3;
                    }
                    iArr = iArr2;
                    coinQuote = coinQuote2;
                    abstractC27806kEY = abstractC27806kEY2;
                    coroutineScope = coroutineScope2;
                    zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
                } else {
                    C38383pWt c38383pWtFJNWhG2 = abstractC27806kEY2.fJNWhG();
                    String instId = coinQuote2.getInstId();
                    if (instId == null) {
                        instId = "";
                    }
                    C38382pWs c38382pWs = C38382pWs.copydefault;
                    String instType = coinQuote2.getInstType();
                    if (instType == null) {
                        instType = "";
                    }
                    String strOLrzqt2 = c38382pWs.OLrzqt(instType);
                    this.L$0 = coroutineScope2;
                    this.L$1 = coinQuote2;
                    this.L$2 = abstractC27806kEY2;
                    this.L$3 = iArr2;
                    this.label = 2;
                    objCopydefault = c38383pWtFJNWhG2.copydefault(instId, strOLrzqt2, this);
                    if (objCopydefault == objCopydefault3) {
                        return objCopydefault3;
                    }
                    iArr = iArr2;
                    coinQuote = coinQuote2;
                    abstractC27806kEY = abstractC27806kEY2;
                    coroutineScope = coroutineScope2;
                    zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                }
            } else if (i == 1) {
                iArr = (int[]) this.L$3;
                abstractC27806kEY = (AbstractC27806kEY) this.L$2;
                CoinQuote coinQuote3 = (CoinQuote) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope3;
                coinQuote = coinQuote3;
                objCopydefault2 = obj;
                zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) this.L$3;
                abstractC27806kEY = (AbstractC27806kEY) this.L$2;
                CoinQuote coinQuote4 = (CoinQuote) this.L$1;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope4;
                coinQuote = coinQuote4;
                objCopydefault = obj;
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
            }
            boolean z = zBooleanValue;
            CoroutineScope coroutineScope5 = coroutineScope;
            AbstractC27806kEY abstractC27806kEY3 = abstractC27806kEY;
            MarketToolDialog.Activity activity = MarketToolDialog.Companion;
            String name = coroutineScope5.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            activity.copydefault(abstractC27806kEY3, name, iArr[1], coinQuote.isWatch(), abstractC27806kEY3.OLrzqt(coinQuote), (96 & 32) != 0 ? false : z, (96 & 64) != 0 ? false : false);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
