package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.okuser.data.User;

/* JADX INFO: renamed from: o.xod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55686xod {
    public static final InterfaceC47278tmy KWHzl = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf().getApplicationContext(), InterfaceC47230tmC.class)).fmB();

    public static final java.lang.String KWHzl() {
        java.lang.String uid;
        User userOLrzqt = KWHzl.OLrzqt();
        return (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? MultiTransferSignData.DEFAULT_INTERVAL : uid;
    }

    public static final java.lang.String OLrzqt() {
        java.lang.String nickname;
        User userOLrzqt = KWHzl.OLrzqt();
        return (userOLrzqt == null || (nickname = userOLrzqt.getNickname()) == null) ? "" : nickname;
    }
}
