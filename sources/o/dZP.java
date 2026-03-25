package o;

import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class dZP {
    public static final dZP OLrzqt = new dZP();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dZT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return dZP.KWHzl();
        }
    });
    public static final int AEQbTJ = 8;

    private dZP() {
    }

    public final InterfaceC47278tmy AYXKKw() {
        return (InterfaceC47278tmy) KWHzl.getValue();
    }

    public static final InterfaceC47278tmy KWHzl() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
    }

    public final boolean gEmmrt() {
        return AYXKKw().fJNWhG();
    }

    public final boolean valueOf() {
        return AYXKKw().values();
    }

    public final java.lang.String AhwBna() {
        return AYXKKw().AYXKKw();
    }

    public final java.lang.String OLrzqt() {
        java.lang.String loginName;
        User userOLrzqt = AYXKKw().OLrzqt();
        return (userOLrzqt == null || (loginName = userOLrzqt.getLoginName()) == null) ? "" : loginName;
    }

    public final java.lang.String EZpvd() {
        java.lang.String uid;
        User userOLrzqt = AYXKKw().OLrzqt();
        return (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? "" : uid;
    }

    public final java.lang.String AkhnZx() {
        java.lang.String value;
        Token tokenAhwBna = AYXKKw().AhwBna();
        return (tokenAhwBna == null || (value = tokenAhwBna.getValue()) == null) ? "" : value;
    }

    public final java.util.List<User> copydefault() {
        return AYXKKw().AEQbTJ();
    }

    public final java.lang.String djBIcL() {
        return AYXKKw().gEmmrt();
    }

    public final boolean values() {
        return AYXKKw().DbNXlk();
    }
}
