package o;

import com.okinc.business.market.CategoryHelper$shouldShowMoreBtn$1;
import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27546jxI {
    public static final C27546jxI EZpvd = new C27546jxI();

    private C27546jxI() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CategoryHelper$shouldShowMoreBtn$1 categoryHelper$shouldShowMoreBtn$1;
        if (continuation instanceof CategoryHelper$shouldShowMoreBtn$1) {
            categoryHelper$shouldShowMoreBtn$1 = (CategoryHelper$shouldShowMoreBtn$1) continuation;
            int i = categoryHelper$shouldShowMoreBtn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                categoryHelper$shouldShowMoreBtn$1.label = i - Integer.MIN_VALUE;
            } else {
                categoryHelper$shouldShowMoreBtn$1 = new CategoryHelper$shouldShowMoreBtn$1(this, continuation);
            }
        }
        java.lang.Object obj = categoryHelper$shouldShowMoreBtn$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = categoryHelper$shouldShowMoreBtn$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                categoryHelper$shouldShowMoreBtn$1.label = 1;
                if (C55608xnE.tryToInitTradeGroupList$default(interfaceC54581xNrOLrzqt, false, categoryHelper$shouldShowMoreBtn$1, 1, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        java.util.ArrayList<TradeGroupData> arrayListUzCIH = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.uzCIH() : null;
        if (arrayListUzCIH != null && arrayListUzCIH.size() >= 8) {
            z = true;
        }
        return C56443yFo.KWHzl(z);
    }
}
