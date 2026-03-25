package o;

import com.okinc.market.biz.data.datasource.coin.datasource.CoinDataSource$collectInstruments$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38389pWz extends AbstractC38387pWx implements pWD {
    @yCM
    public C38389pWz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC38387pWx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation) throws java.lang.Throwable {
        CoinDataSource$collectInstruments$1 coinDataSource$collectInstruments$1;
        java.util.ArrayList<TradeCoinInfo> arrayList;
        C56084xwD fieldNames;
        if (continuation instanceof CoinDataSource$collectInstruments$1) {
            coinDataSource$collectInstruments$1 = (CoinDataSource$collectInstruments$1) continuation;
            int i = coinDataSource$collectInstruments$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinDataSource$collectInstruments$1.label = i - Integer.MIN_VALUE;
            } else {
                coinDataSource$collectInstruments$1 = new CoinDataSource$collectInstruments$1(this, continuation);
            }
        }
        CoinDataSource$collectInstruments$1 coinDataSource$collectInstruments$12 = coinDataSource$collectInstruments$1;
        java.lang.Object obj = coinDataSource$collectInstruments$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinDataSource$collectInstruments$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            xNE xne = new xNE();
            coinDataSource$collectInstruments$12.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, xne, coinDataSource$collectInstruments$12, 1, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null || (arrayList = fieldNames.KWHzl()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new CoinWatchInstrument(((TradeCoinInfo) it.next()).getSymbol(), "COIN"));
        }
        return arrayList2;
    }
}
