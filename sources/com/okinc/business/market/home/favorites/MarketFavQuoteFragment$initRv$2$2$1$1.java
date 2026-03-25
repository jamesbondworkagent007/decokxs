package com.okinc.business.market.home.favorites;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C38382pWs;
import o.C38383pWt;
import o.C56391yDq;
import o.C56442yFn;
import o.qWK;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$initRv$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $location;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$initRv$2$2$1$1(MarketFavQuoteFragment marketFavQuoteFragment, int[] iArr, Continuation<? super MarketFavQuoteFragment$initRv$2$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = marketFavQuoteFragment;
        this.$location = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketFavQuoteFragment$initRv$2$2$1$1 marketFavQuoteFragment$initRv$2$2$1$1 = new MarketFavQuoteFragment$initRv$2$2$1$1(this.this$0, this.$location, continuation);
        marketFavQuoteFragment$initRv$2$2$1$1.L$0 = obj;
        return marketFavQuoteFragment$initRv$2$2$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$initRv$2$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        MarketFavQuoteFragment marketFavQuoteFragment;
        int[] iArr;
        boolean zBooleanValue;
        Object objAEQbTJ;
        CoroutineScope coroutineScope2;
        MarketFavQuoteFragment marketFavQuoteFragment2;
        int[] iArr2;
        String instId;
        Object objCopydefault;
        Object objCopydefault2;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            marketFavQuoteFragment = this.this$0;
            iArr = this.$location;
            Result.Application application2 = Result.Companion;
            Object obj2 = marketFavQuoteFragment.uzCIH;
            if (obj2 instanceof CoinQuote) {
                Object obj3 = marketFavQuoteFragment.uzCIH;
                Intrinsics.copydefault(obj3, "");
                if (Intrinsics.EZpvd((Object) ((CoinQuote) obj3).getInstType(), (Object) "COIN")) {
                    C38383pWt c38383pWtValueOf = marketFavQuoteFragment.valueOf();
                    Object obj4 = marketFavQuoteFragment.uzCIH;
                    CoinQuote coinQuote = obj4 instanceof CoinQuote ? (CoinQuote) obj4 : null;
                    String str = (coinQuote != null ? coinQuote.getInstId() : null) + "-USDT";
                    String strOLrzqt = C38382pWs.copydefault.OLrzqt("SPOT");
                    this.L$0 = coroutineScope;
                    this.L$1 = marketFavQuoteFragment;
                    this.L$2 = iArr;
                    this.label = 1;
                    objCopydefault2 = c38383pWtValueOf.copydefault(str, strOLrzqt, this);
                    if (objCopydefault2 == objCopydefault3) {
                        return objCopydefault3;
                    }
                    coroutineScope2 = coroutineScope;
                    marketFavQuoteFragment2 = marketFavQuoteFragment;
                    iArr2 = iArr;
                    zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
                } else {
                    C38383pWt c38383pWtValueOf2 = marketFavQuoteFragment.valueOf();
                    Object obj5 = marketFavQuoteFragment.uzCIH;
                    CoinQuote coinQuote2 = obj5 instanceof CoinQuote ? (CoinQuote) obj5 : null;
                    if (coinQuote2 == null || (instId = coinQuote2.getInstId()) == null) {
                        instId = "";
                    }
                    C38382pWs c38382pWs = C38382pWs.copydefault;
                    Object obj6 = marketFavQuoteFragment.uzCIH;
                    Intrinsics.copydefault(obj6, "");
                    String strOLrzqt2 = c38382pWs.OLrzqt(((CoinQuote) obj6).getInstType());
                    this.L$0 = coroutineScope;
                    this.L$1 = marketFavQuoteFragment;
                    this.L$2 = iArr;
                    this.label = 2;
                    objCopydefault = c38383pWtValueOf2.copydefault(instId, strOLrzqt2, this);
                    if (objCopydefault == objCopydefault3) {
                        return objCopydefault3;
                    }
                    coroutineScope2 = coroutineScope;
                    marketFavQuoteFragment2 = marketFavQuoteFragment;
                    iArr2 = iArr;
                    zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                }
            } else if (obj2 instanceof qWK) {
                C38383pWt c38383pWtValueOf3 = marketFavQuoteFragment.valueOf();
                Object obj7 = marketFavQuoteFragment.uzCIH;
                Intrinsics.copydefault(obj7, "");
                DexInstrument dexInstrumentCopydefault = ((qWK) obj7).copydefault();
                this.L$0 = coroutineScope;
                this.L$1 = marketFavQuoteFragment;
                this.L$2 = iArr;
                this.label = 3;
                objAEQbTJ = c38383pWtValueOf3.AEQbTJ(dexInstrumentCopydefault, this);
                if (objAEQbTJ == objCopydefault3) {
                    return objCopydefault3;
                }
                coroutineScope2 = coroutineScope;
                marketFavQuoteFragment2 = marketFavQuoteFragment;
                iArr2 = iArr;
                zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
            } else {
                zBooleanValue = false;
                boolean z = zBooleanValue;
                MarketFavQuoteFragment marketFavQuoteFragment3 = marketFavQuoteFragment;
                MarketToolDialog.Activity activity = MarketToolDialog.Companion;
                String name = coroutineScope.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                activity.copydefault(marketFavQuoteFragment3, name, iArr[1], true, !marketFavQuoteFragment3.getNewProxyInstance() ? "inst_list" : "watch_list", (96 & 32) != 0 ? false : z, (96 & 64) != 0 ? false : false);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            iArr2 = (int[]) this.L$2;
            marketFavQuoteFragment2 = (MarketFavQuoteFragment) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope2 = coroutineScope3;
            objCopydefault2 = obj;
            zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
        } else if (i == 2) {
            iArr2 = (int[]) this.L$2;
            marketFavQuoteFragment2 = (MarketFavQuoteFragment) this.L$1;
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope2 = coroutineScope4;
            objCopydefault = obj;
            zBooleanValue = ((Boolean) objCopydefault).booleanValue();
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr2 = (int[]) this.L$2;
            marketFavQuoteFragment2 = (MarketFavQuoteFragment) this.L$1;
            CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope2 = coroutineScope5;
            objAEQbTJ = obj;
            zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
        }
        iArr = iArr2;
        marketFavQuoteFragment = marketFavQuoteFragment2;
        coroutineScope = coroutineScope2;
        boolean z2 = zBooleanValue;
        MarketFavQuoteFragment marketFavQuoteFragment32 = marketFavQuoteFragment;
        MarketToolDialog.Activity activity2 = MarketToolDialog.Companion;
        String name2 = coroutineScope.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        activity2.copydefault(marketFavQuoteFragment32, name2, iArr[1], true, !marketFavQuoteFragment32.getNewProxyInstance() ? "inst_list" : "watch_list", (96 & 32) != 0 ? false : z2, (96 & 64) != 0 ? false : false);
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
