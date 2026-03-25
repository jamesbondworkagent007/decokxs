package o;

import com.okinc.market.biz.data.datasource.premarket.datasource.PreMarketDataSource$collectInstruments$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pWI extends AbstractC38387pWx implements pWF {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC38387pWx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation) throws java.lang.Throwable {
        PreMarketDataSource$collectInstruments$1 preMarketDataSource$collectInstruments$1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.util.List<BizInstrument> listUzCIH;
        if (continuation instanceof PreMarketDataSource$collectInstruments$1) {
            preMarketDataSource$collectInstruments$1 = (PreMarketDataSource$collectInstruments$1) continuation;
            int i = preMarketDataSource$collectInstruments$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preMarketDataSource$collectInstruments$1.label = i - Integer.MIN_VALUE;
            } else {
                preMarketDataSource$collectInstruments$1 = new PreMarketDataSource$collectInstruments$1(this, continuation);
            }
        }
        java.lang.Object obj = preMarketDataSource$collectInstruments$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preMarketDataSource$collectInstruments$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            xNE xne = new xNE();
            preMarketDataSource$collectInstruments$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, xne, preMarketDataSource$collectInstruments$1, 1, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                return (interfaceC54581xNrOLrzqt != null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt("FUTURES")) == null || (listUzCIH = abstractC54531xLwOLrzqt2.uzCIH()) == null) ? yDY.AhwBna() : listUzCIH;
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("FUTURES")) != null) {
            preMarketDataSource$collectInstruments$1.label = 2;
            if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, preMarketDataSource$collectInstruments$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt3 != null) {
        }
    }
}
