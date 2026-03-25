package o;

import com.okinc.business.invest_biz.data.contants.InvestAction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25527iyR {
    void KWHzl(java.lang.Long l, java.lang.Long l2, InvestAction investAction);

    void copydefault(@NotNull InterfaceC25530iyU interfaceC25530iyU);

    static /* synthetic */ void updateTrackerParams$default(InterfaceC25527iyR interfaceC25527iyR, java.lang.Long l, java.lang.Long l2, InvestAction investAction, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTrackerParams");
        }
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            investAction = null;
        }
        interfaceC25527iyR.KWHzl(l, l2, investAction);
    }
}
