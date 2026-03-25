package o;

import com.okinc.market.biz.data.datasource.future.datasource.SingleFutureDataSource$collectInstruments$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pWB extends AbstractC38387pWx implements InterfaceC38388pWy {
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC38387pWx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<? extends BizInstrument>> continuation) throws java.lang.Throwable {
        SingleFutureDataSource$collectInstruments$1 singleFutureDataSource$collectInstruments$1;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.util.List<BizInstrument> listAhwBna;
        java.util.List<BizInstrument> listAhwBna2;
        java.util.List listAhwBna3;
        if (continuation instanceof SingleFutureDataSource$collectInstruments$1) {
            singleFutureDataSource$collectInstruments$1 = (SingleFutureDataSource$collectInstruments$1) continuation;
            int i = singleFutureDataSource$collectInstruments$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleFutureDataSource$collectInstruments$1.label = i - Integer.MIN_VALUE;
            } else {
                singleFutureDataSource$collectInstruments$1 = new SingleFutureDataSource$collectInstruments$1(this, continuation);
            }
        }
        java.lang.Object obj = singleFutureDataSource$collectInstruments$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = singleFutureDataSource$collectInstruments$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            xNE xne = new xNE();
            singleFutureDataSource$collectInstruments$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, xne, singleFutureDataSource$collectInstruments$1, 1, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt == null ? interfaceC54581xNrOLrzqt.OLrzqt("FUTURES") : null;
                if (abstractC54531xLwOLrzqt2 != null || (listAhwBna = abstractC54531xLwOLrzqt2.uzCIH()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (abstractC54531xLwOLrzqt2 != null || (listAhwBna2 = abstractC54531xLwOLrzqt2.hDKMBd()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2);
                if (abstractC54531xLwOLrzqt2 != null || (listAhwBna3 = C55608xnE.queryBizList$default(abstractC54531xLwOLrzqt2, false, 1, null)) == null) {
                    listAhwBna3 = yDY.AhwBna();
                }
                return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL, (java.lang.Iterable) listAhwBna3);
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("FUTURES")) != null) {
            singleFutureDataSource$collectInstruments$1.label = 2;
            if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, singleFutureDataSource$collectInstruments$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt3 == null) {
        }
        if (abstractC54531xLwOLrzqt2 != null) {
            listAhwBna = yDY.AhwBna();
        }
        if (abstractC54531xLwOLrzqt2 != null) {
            listAhwBna2 = yDY.AhwBna();
        }
        java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2);
        if (abstractC54531xLwOLrzqt2 != null) {
            listAhwBna3 = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL2, (java.lang.Iterable) listAhwBna3);
    }
}
