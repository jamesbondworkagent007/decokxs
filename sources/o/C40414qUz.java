package o;

import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getAllCupTickers$1;
import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getAllMarkPriceTickers$1;
import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getAllPairTickers$1;
import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getBatchCupTickers$1;
import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getBatchMarkPriceTickers$1;
import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getBatchPairTickers$1;
import com.okinc.market.ticker.datasource.impl.TickersHttpDataSourceImpl$getIndexTickers$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC40403qUo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40414qUz implements InterfaceC40393qUe {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qUA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40414qUz.KWHzl();
        }
    });

    @yCM
    public C40414qUz() {
    }

    public final InterfaceC40403qUo AEQbTJ() {
        return (InterfaceC40403qUo) this.copydefault.getValue();
    }

    public static final InterfaceC40403qUo KWHzl() {
        return (InterfaceC40403qUo) C38416pXz.copydefault(C56524yIo.AEQbTJ(InterfaceC40403qUo.class));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qUo.StateListAnimator.getMarketAllPairTickers$default(o.qUo, java.lang.String, java.lang.String, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<TickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getAllPairTickers$1 tickersHttpDataSourceImpl$getAllPairTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getAllPairTickers$1) {
            tickersHttpDataSourceImpl$getAllPairTickers$1 = (TickersHttpDataSourceImpl$getAllPairTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getAllPairTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getAllPairTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getAllPairTickers$1 = new TickersHttpDataSourceImpl$getAllPairTickers$1(this, continuation);
            }
        }
        TickersHttpDataSourceImpl$getAllPairTickers$1 tickersHttpDataSourceImpl$getAllPairTickers$12 = tickersHttpDataSourceImpl$getAllPairTickers$1;
        java.lang.Object marketAllPairTickers$default = tickersHttpDataSourceImpl$getAllPairTickers$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getAllPairTickers$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(marketAllPairTickers$default);
            InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
            tickersHttpDataSourceImpl$getAllPairTickers$12.label = 1;
            marketAllPairTickers$default = InterfaceC40403qUo.StateListAnimator.getMarketAllPairTickers$default(interfaceC40403qUoAEQbTJ, str, null, tickersHttpDataSourceImpl$getAllPairTickers$12, 2, null);
            if (marketAllPairTickers$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(marketAllPairTickers$default);
        }
        return ((ResponseData) marketAllPairTickers$default).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getBatchPairTickers$1 tickersHttpDataSourceImpl$getBatchPairTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getBatchPairTickers$1) {
            tickersHttpDataSourceImpl$getBatchPairTickers$1 = (TickersHttpDataSourceImpl$getBatchPairTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getBatchPairTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getBatchPairTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getBatchPairTickers$1 = new TickersHttpDataSourceImpl$getBatchPairTickers$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = tickersHttpDataSourceImpl$getBatchPairTickers$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getBatchPairTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (list.size() > 50) {
                pUU.copydefault("TickersHttpDataSourceImpl", "getBatchPairTickers: instIdList size > 50");
                list = list.subList(0, 50);
            }
            java.lang.String strAEQbTJ = qTN.AEQbTJ(new TickerInstReq(list));
            InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
            tickersHttpDataSourceImpl$getBatchPairTickers$1.label = 1;
            objCopydefault = interfaceC40403qUoAEQbTJ.copydefault(strAEQbTJ, tickersHttpDataSourceImpl$getBatchPairTickers$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return ((ResponseData) objCopydefault).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<TickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getAllCupTickers$1 tickersHttpDataSourceImpl$getAllCupTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getAllCupTickers$1) {
            tickersHttpDataSourceImpl$getAllCupTickers$1 = (TickersHttpDataSourceImpl$getAllCupTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getAllCupTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getAllCupTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getAllCupTickers$1 = new TickersHttpDataSourceImpl$getAllCupTickers$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = tickersHttpDataSourceImpl$getAllCupTickers$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getAllCupTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
            tickersHttpDataSourceImpl$getAllCupTickers$1.label = 1;
            objCopydefault = interfaceC40403qUoAEQbTJ.copydefault(tickersHttpDataSourceImpl$getAllCupTickers$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return ((ResponseData) objCopydefault).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getBatchCupTickers$1 tickersHttpDataSourceImpl$getBatchCupTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getBatchCupTickers$1) {
            tickersHttpDataSourceImpl$getBatchCupTickers$1 = (TickersHttpDataSourceImpl$getBatchCupTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getBatchCupTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getBatchCupTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getBatchCupTickers$1 = new TickersHttpDataSourceImpl$getBatchCupTickers$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = tickersHttpDataSourceImpl$getBatchCupTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getBatchCupTickers$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objEZpvd);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return (java.util.List) ((ResponseData) objEZpvd).getData();
        }
        C56391yDq.AEQbTJ(objEZpvd);
        if (list.size() > 50) {
            tickersHttpDataSourceImpl$getBatchCupTickers$1.label = 1;
            objEZpvd = OLrzqt(tickersHttpDataSourceImpl$getBatchCupTickers$1);
            return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
        }
        java.lang.String strCopydefault = qTN.copydefault(new TickerCupReq(list));
        InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
        tickersHttpDataSourceImpl$getBatchCupTickers$1.label = 2;
        objEZpvd = interfaceC40403qUoAEQbTJ.EZpvd(strCopydefault, tickersHttpDataSourceImpl$getBatchCupTickers$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return (java.util.List) ((ResponseData) objEZpvd).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC40393qUe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super java.util.List<IndexTickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getIndexTickers$1 tickersHttpDataSourceImpl$getIndexTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getIndexTickers$1) {
            tickersHttpDataSourceImpl$getIndexTickers$1 = (TickersHttpDataSourceImpl$getIndexTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getIndexTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getIndexTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getIndexTickers$1 = new TickersHttpDataSourceImpl$getIndexTickers$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = tickersHttpDataSourceImpl$getIndexTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getIndexTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
            tickersHttpDataSourceImpl$getIndexTickers$1.label = 1;
            objAEQbTJ = interfaceC40403qUoAEQbTJ.AEQbTJ(str, str2, tickersHttpDataSourceImpl$getIndexTickers$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((ResponseData) objAEQbTJ).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super java.util.List<TickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getAllMarkPriceTickers$1 tickersHttpDataSourceImpl$getAllMarkPriceTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getAllMarkPriceTickers$1) {
            tickersHttpDataSourceImpl$getAllMarkPriceTickers$1 = (TickersHttpDataSourceImpl$getAllMarkPriceTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getAllMarkPriceTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getAllMarkPriceTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getAllMarkPriceTickers$1 = new TickersHttpDataSourceImpl$getAllMarkPriceTickers$1(this, continuation);
            }
        }
        TickersHttpDataSourceImpl$getAllMarkPriceTickers$1 tickersHttpDataSourceImpl$getAllMarkPriceTickers$12 = tickersHttpDataSourceImpl$getAllMarkPriceTickers$1;
        java.lang.Object objOLrzqt = tickersHttpDataSourceImpl$getAllMarkPriceTickers$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getAllMarkPriceTickers$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
            tickersHttpDataSourceImpl$getAllMarkPriceTickers$12.label = 1;
            objOLrzqt = interfaceC40403qUoAEQbTJ.OLrzqt(str, str2, str3, str4, str5, tickersHttpDataSourceImpl$getAllMarkPriceTickers$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((ResponseData) objOLrzqt).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TickersData>> continuation) throws java.lang.Throwable {
        TickersHttpDataSourceImpl$getBatchMarkPriceTickers$1 tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1;
        if (continuation instanceof TickersHttpDataSourceImpl$getBatchMarkPriceTickers$1) {
            tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1 = (TickersHttpDataSourceImpl$getBatchMarkPriceTickers$1) continuation;
            int i = tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1 = new TickersHttpDataSourceImpl$getBatchMarkPriceTickers$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (list.size() > 50) {
                pUU.copydefault("TickersHttpDataSourceImpl", "getBatchMarkPriceTickers: instIdList size > 50");
                list = list.subList(0, 50);
            }
            java.lang.String strAEQbTJ = qTN.AEQbTJ(new TickerInstReq(list));
            InterfaceC40403qUo interfaceC40403qUoAEQbTJ = AEQbTJ();
            tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1.label = 1;
            objOLrzqt = interfaceC40403qUoAEQbTJ.OLrzqt(strAEQbTJ, tickersHttpDataSourceImpl$getBatchMarkPriceTickers$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((ResponseData) objOLrzqt).getData();
    }
}
