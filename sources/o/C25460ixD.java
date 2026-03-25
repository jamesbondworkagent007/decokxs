package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25460ixD {
    public static final int KWHzl;
    public static final C25460ixD OLrzqt;
    public static final java.util.HashMap<java.lang.Integer, InterfaceC25462ixF> copydefault;

    private C25460ixD() {
    }

    static {
        C25460ixD c25460ixD = new C25460ixD();
        OLrzqt = c25460ixD;
        copydefault = new java.util.HashMap<>();
        c25460ixD.AEQbTJ(1, new C25461ixE());
        c25460ixD.AEQbTJ(2, new C25506ixx());
        c25460ixD.AEQbTJ(3, new C25458ixB());
        c25460ixD.AEQbTJ(7, new C25464ixH());
        c25460ixD.AEQbTJ(0, new C25463ixG());
        KWHzl = 8;
    }

    public final void AEQbTJ(int i, InterfaceC25462ixF interfaceC25462ixF) {
        copydefault.put(java.lang.Integer.valueOf(i), interfaceC25462ixF);
    }

    public final void copydefault(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        InterfaceC25462ixF interfaceC25462ixF;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("defiTabId")) {
            SPUtils.put("tabPosition", java.lang.Integer.valueOf(bundle.getInt("defiTabId", 0)), "InvestHomeContainerFragment");
        }
        int i = bundle.getInt("jumpType", 0);
        android.content.Context applicationContext = activity.getApplicationContext();
        if ((applicationContext == null || !C27508jwX.AEQbTJ.EZpvd(applicationContext)) && i != 0 && (interfaceC25462ixF = copydefault.get(0)) != null) {
            interfaceC25462ixF.copydefault(activity, bundle);
        }
        InterfaceC25462ixF interfaceC25462ixF2 = copydefault.get(java.lang.Integer.valueOf(i));
        if (interfaceC25462ixF2 != null) {
            interfaceC25462ixF2.copydefault(activity, bundle);
        }
    }
}
