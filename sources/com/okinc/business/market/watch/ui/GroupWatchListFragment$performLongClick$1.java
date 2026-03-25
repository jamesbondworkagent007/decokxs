package com.okinc.business.market.watch.ui;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
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
import o.kKI;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$performLongClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinQuote $item;
    final /* synthetic */ int[] $location;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$performLongClick$1(CoinQuote coinQuote, kKI kki, int[] iArr, Continuation<? super GroupWatchListFragment$performLongClick$1> continuation) {
        super(2, continuation);
        this.$item = coinQuote;
        this.this$0 = kki;
        this.$location = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupWatchListFragment$performLongClick$1 groupWatchListFragment$performLongClick$1 = new GroupWatchListFragment$performLongClick$1(this.$item, this.this$0, this.$location, continuation);
        groupWatchListFragment$performLongClick$1.L$0 = obj;
        return groupWatchListFragment$performLongClick$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$performLongClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        CoinQuote coinQuote;
        kKI kki;
        int[] iArr;
        Object objCopydefault;
        CoroutineScope coroutineScope2;
        int[] iArr2;
        boolean zBooleanValue;
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
            coinQuote = this.$item;
            kki = this.this$0;
            iArr = this.$location;
            Result.Application application2 = Result.Companion;
            if (Intrinsics.EZpvd((Object) coinQuote.getInstType(), (Object) "COIN")) {
                C38383pWt c38383pWtZLjUOn = kki.zLjUOn();
                if (c38383pWtZLjUOn != null) {
                    String str = coinQuote.getInstId() + "-USDT";
                    String strOLrzqt = C38382pWs.copydefault.OLrzqt("SPOT");
                    this.L$0 = coinQuote;
                    this.L$1 = kki;
                    this.L$2 = iArr;
                    this.L$3 = coroutineScope;
                    this.label = 1;
                    objCopydefault2 = c38383pWtZLjUOn.copydefault(str, strOLrzqt, this);
                    if (objCopydefault2 == objCopydefault3) {
                        return objCopydefault3;
                    }
                    coroutineScope2 = coroutineScope;
                    iArr2 = iArr;
                    zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
                }
            } else {
                C38383pWt c38383pWtZLjUOn2 = kki.zLjUOn();
                if (c38383pWtZLjUOn2 != null) {
                    String instId = coinQuote.getInstId();
                    if (instId == null) {
                        instId = "";
                    }
                    C38382pWs c38382pWs = C38382pWs.copydefault;
                    String instType = coinQuote.getInstType();
                    if (instType == null) {
                        instType = "";
                    }
                    String strOLrzqt2 = c38382pWs.OLrzqt(instType);
                    this.L$0 = coinQuote;
                    this.L$1 = kki;
                    this.L$2 = iArr;
                    this.L$3 = coroutineScope;
                    this.label = 2;
                    objCopydefault = c38383pWtZLjUOn2.copydefault(instId, strOLrzqt2, this);
                    if (objCopydefault == objCopydefault3) {
                        return objCopydefault3;
                    }
                    coroutineScope2 = coroutineScope;
                    iArr2 = iArr;
                    zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                }
            }
            zBooleanValue = false;
            boolean z = zBooleanValue;
            MarketToolDialog.Activity activity = MarketToolDialog.Companion;
            String name = coroutineScope.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            activity.copydefault(kki, name, iArr[1], coinQuote.isWatch(), "watch_list", (96 & 32) != 0 ? false : z, (96 & 64) != 0 ? false : false);
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        if (i == 1) {
            coroutineScope2 = (CoroutineScope) this.L$3;
            iArr2 = (int[]) this.L$2;
            kKI kki2 = (kKI) this.L$1;
            coinQuote = (CoinQuote) this.L$0;
            C56391yDq.AEQbTJ(obj);
            kki = kki2;
            objCopydefault2 = obj;
            zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$3;
            iArr2 = (int[]) this.L$2;
            kKI kki3 = (kKI) this.L$1;
            coinQuote = (CoinQuote) this.L$0;
            C56391yDq.AEQbTJ(obj);
            kki = kki3;
            objCopydefault = obj;
            zBooleanValue = ((Boolean) objCopydefault).booleanValue();
        }
        iArr = iArr2;
        coroutineScope = coroutineScope2;
        boolean z2 = zBooleanValue;
        MarketToolDialog.Activity activity2 = MarketToolDialog.Companion;
        String name2 = coroutineScope.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        activity2.copydefault(kki, name2, iArr[1], coinQuote.isWatch(), "watch_list", (96 & 32) != 0 ? false : z2, (96 & 64) != 0 ? false : false);
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
