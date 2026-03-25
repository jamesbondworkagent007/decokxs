package o;

import com.okinc.im.config.ImEnabledStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nsH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35273nsH {
    public static final C35273nsH KWHzl = new C35273nsH();

    private C35273nsH() {
    }

    public final boolean copydefault() {
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
        java.lang.Boolean boolValueOf = interfaceC33171mrS != null ? java.lang.Boolean.valueOf(interfaceC33171mrS.fIwbmz()) : null;
        boolean zValues = C44157sFk.gEmmrt().values();
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE) && !zValues) {
            pUU.KWHzl("OKIMConfig", "isAllowImEntryPoint: not allowed in non-login wallet mode");
        } else if (oGU.KWHzl.AEQbTJ() != ImEnabledStatus.Disabled) {
            return true;
        }
        return false;
    }

    public final boolean AEQbTJ() {
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
        boolean z = C44157sFk.gEmmrt().values() || Intrinsics.EZpvd(interfaceC33171mrS != null ? java.lang.Boolean.valueOf(interfaceC33171mrS.fIwbmz()) : null, java.lang.Boolean.TRUE);
        pUU.KWHzl("OKIMConfig", "isAllowEnterNotification: " + z);
        return z;
    }
}
