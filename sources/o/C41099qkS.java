package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesMkpVosUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesMkpVosUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesMkpVosUseCase$onExecute$task1$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesMkpVosUseCase$onExecute$task2$1;
import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesMkpVosUseCase$onExecute$task3$1;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41099qkS extends AbstractC49400uno<Triple<? extends C41467qrP, ? extends FuturesTypeEnum, ? extends FuturesUnitVo>, C41467qrP> {
    public final C41100qkT EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41099qkS(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41100qkT c41100qkT) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41100qkT, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c41100qkT;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Triple<C41467qrP, ? extends FuturesTypeEnum, FuturesUnitVo> triple, @NotNull Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesMkpVosUseCase$onExecute$1 getMarketDiscoverFuturesMkpVosUseCase$onExecute$1;
        C41467qrP c41467qrP;
        if (continuation instanceof GetMarketDiscoverFuturesMkpVosUseCase$onExecute$1) {
            getMarketDiscoverFuturesMkpVosUseCase$onExecute$1 = (GetMarketDiscoverFuturesMkpVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesMkpVosUseCase$onExecute$1 = new GetMarketDiscoverFuturesMkpVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCoroutineScope = getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCoroutineScope);
            C41467qrP c41467qrPComponent1 = triple.component1();
            FuturesTypeEnum futuresTypeEnumComponent2 = triple.component2();
            FuturesUnitVo futuresUnitVoComponent3 = triple.component3();
            C41100qkT c41100qkT = this.EZpvd;
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(futuresTypeEnumComponent2, futuresUnitVoComponent3);
            getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.L$0 = c41467qrPComponent1;
            getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41100qkT.EZpvd(pairOLrzqt, getMarketDiscoverFuturesMkpVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objCoroutineScope = objEZpvd;
            c41467qrP = c41467qrPComponent1;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41467qrP = (C41467qrP) getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objCoroutineScope);
                Triple triple2 = (Triple) objCoroutineScope;
                return C41467qrP.copy$default(c41467qrP, (java.util.List) triple2.component2(), (java.util.List) triple2.component1(), (java.util.List) triple2.component3(), null, null, 0L, 56, null);
            }
            c41467qrP = (C41467qrP) getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCoroutineScope);
        }
        java.util.List list = (java.util.List) objCoroutineScope;
        if (list == null || list.isEmpty()) {
            return null;
        }
        GetMarketDiscoverFuturesMkpVosUseCase$onExecute$$inlined$executeAsyncTasks$1 getMarketDiscoverFuturesMkpVosUseCase$onExecute$$inlined$executeAsyncTasks$1 = new GetMarketDiscoverFuturesMkpVosUseCase$onExecute$$inlined$executeAsyncTasks$1(new GetMarketDiscoverFuturesMkpVosUseCase$onExecute$task1$1(c41467qrP, list, null), new GetMarketDiscoverFuturesMkpVosUseCase$onExecute$task2$1(c41467qrP, list, null), new GetMarketDiscoverFuturesMkpVosUseCase$onExecute$task3$1(c41467qrP, list, null), null);
        getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.L$0 = c41467qrP;
        getMarketDiscoverFuturesMkpVosUseCase$onExecute$1.label = 2;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(getMarketDiscoverFuturesMkpVosUseCase$onExecute$$inlined$executeAsyncTasks$1, getMarketDiscoverFuturesMkpVosUseCase$onExecute$1);
        if (objCoroutineScope == objCopydefault) {
            return objCopydefault;
        }
        Triple triple22 = (Triple) objCoroutineScope;
        return C41467qrP.copy$default(c41467qrP, (java.util.List) triple22.component2(), (java.util.List) triple22.component1(), (java.util.List) triple22.component3(), null, null, 0L, 56, null);
    }
}
