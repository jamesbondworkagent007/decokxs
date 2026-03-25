package o;

import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserProfile;
import kotlin.jvm.functions.Function0;
import uniffi.user.TokenType;

/* JADX INFO: renamed from: o.xoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55697xoo {
    public static final C55697xoo OLrzqt = new C55697xoo();
    public static Function0<? extends InterfaceC4968Bxs> EZpvd = new Function0() { // from class: o.xon
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C55697xoo.AEQbTJ();
        }
    };
    public static final int AEQbTJ = 8;

    private C55697xoo() {
    }

    public static final InterfaceC4968Bxs AEQbTJ() {
        return BzK.getSharedCoreUserManager();
    }

    public final InterfaceC4968Bxs OLrzqt() {
        return EZpvd.invoke();
    }

    public final InterfaceC47278tmy djBIcL() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
    }

    public final boolean isConnected() {
        return OLrzqt().fJNWhG();
    }

    public final java.lang.String copydefault() {
        java.lang.String strAhwBna;
        BvH bvHGEmmrt = OLrzqt().gEmmrt();
        return (bvHGEmmrt == null || (strAhwBna = bvHGEmmrt.AhwBna()) == null) ? "" : strAhwBna;
    }

    public final java.lang.String DbNXlk() {
        return djBIcL().gEmmrt();
    }

    public final java.lang.String AYXKKw() {
        java.lang.String strKWHzl;
        BvH bvHGEmmrt = OLrzqt().gEmmrt();
        return (bvHGEmmrt == null || (strKWHzl = bvHGEmmrt.KWHzl()) == null) ? "" : strKWHzl;
    }

    public final java.lang.String gEmmrt() {
        java.lang.String strValueOf;
        BvH bvHGEmmrt = OLrzqt().gEmmrt();
        return (bvHGEmmrt == null || (strValueOf = bvHGEmmrt.valueOf()) == null) ? "" : strValueOf;
    }

    public final java.lang.String KWHzl() {
        BvH bvHGEmmrt = OLrzqt().gEmmrt();
        if (bvHGEmmrt != null) {
            return bvHGEmmrt.djBIcL();
        }
        return null;
    }

    public final TokenType valueOf() {
        BvH bvHGEmmrt = OLrzqt().gEmmrt();
        if (bvHGEmmrt != null) {
            return bvHGEmmrt.AYXKKw();
        }
        return null;
    }

    public final boolean AuCTel() {
        BvK bvKCopydefault;
        BvH bvHGEmmrt = OLrzqt().gEmmrt();
        if (bvHGEmmrt == null || (bvKCopydefault = bvHGEmmrt.copydefault()) == null) {
            return false;
        }
        return bvKCopydefault.QOLQEE();
    }

    public final boolean values() {
        return djBIcL().AkhnZx();
    }

    public final User AhwBna() {
        return djBIcL().OLrzqt();
    }

    public final UserProfile fetchVPNInfo() {
        User userOLrzqt = djBIcL().OLrzqt();
        if (userOLrzqt != null) {
            return userOLrzqt.getProfile();
        }
        return null;
    }

    public final boolean AkhnZx() {
        return TokenType.DEMO_TRADING == valueOf();
    }
}
