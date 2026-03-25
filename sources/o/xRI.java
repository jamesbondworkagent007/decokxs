package o;

import com.okinc.unify_trade.biz.subscribe.MovementBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class xRI {
    public static final xRI KWHzl = new xRI();

    private xRI() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<MovementBean> OLrzqt(java.util.ArrayList<MovementBean> arrayList) {
        java.lang.String instId;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                MovementBean movementBean = (MovementBean) obj;
                if (movementBean == null || (instId = movementBean.getInstId()) == null) {
                    arrayList2.add(movementBean);
                } else {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (!Intrinsics.EZpvd(interfaceC54581xNrOLrzqt != null ? java.lang.Boolean.valueOf(interfaceC54581xNrOLrzqt.OLrzqt(instId, "")) : null, java.lang.Boolean.TRUE)) {
                    }
                }
                i++;
            }
        }
        if (arrayList != null) {
            arrayList.removeAll(arrayList2);
        }
        return arrayList;
    }
}
