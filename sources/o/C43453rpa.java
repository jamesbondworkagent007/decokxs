package o;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.NetworkInterface;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43453rpa {
    public static final C43453rpa AEQbTJ = new C43453rpa();
    public static final java.lang.String OLrzqt = "NetworkUtil";

    private C43453rpa() {
    }

    public final boolean OLrzqt() {
        try {
            java.util.Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) networkInterface.getName(), (java.lang.Object) "tun0") || Intrinsics.EZpvd((java.lang.Object) networkInterface.getName(), (java.lang.Object) "ppp0")) {
                    pUU.KWHzl(OLrzqt, "isDeviceInVPN current device is in VPN.");
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(OLrzqt, e);
            return false;
        }
    }

    public final boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            java.lang.Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.copydefault(systemService, "");
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
            return false;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(OLrzqt, e);
            return false;
        }
    }

    public final java.lang.String EZpvd() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            java.util.ArrayList<NetworkInterface> arrayListCopydefault = copydefault();
            Intrinsics.checkNotNullExpressionValue(arrayListCopydefault, "");
            z2 = false;
            for (NetworkInterface networkInterface : arrayListCopydefault) {
                try {
                    pUU.EZpvd(OLrzqt, "intf.name = " + networkInterface.getName());
                    if (Intrinsics.EZpvd((java.lang.Object) networkInterface.getName(), (java.lang.Object) "wlan0") || Intrinsics.EZpvd((java.lang.Object) networkInterface.getName(), (java.lang.Object) "rmnet0")) {
                        java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterface.getInetAddresses();
                        Intrinsics.checkNotNullExpressionValue(inetAddresses, "");
                        java.util.Iterator itAEQbTJ = yDX.AEQbTJ(inetAddresses);
                        while (itAEQbTJ.hasNext()) {
                            java.net.InetAddress inetAddress = (java.net.InetAddress) itAEQbTJ.next();
                            if (!inetAddress.isLoopbackAddress()) {
                                if (inetAddress instanceof Inet6Address) {
                                    pUU.KWHzl(OLrzqt, networkInterface.getName() + " is support IPv6");
                                    z3 = true;
                                } else if (inetAddress instanceof Inet4Address) {
                                    pUU.KWHzl(OLrzqt, networkInterface.getName() + " is support IPv4");
                                    z2 = true;
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    z = z3;
                    z3 = z2;
                    e.printStackTrace();
                    z2 = z3;
                    z3 = z;
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            z = false;
        }
        return z3 ? "ipv6" : z2 ? "ipv4" : "unknown";
    }

    public final java.util.ArrayList<NetworkInterface> copydefault() {
        return Collections.list(NetworkInterface.getNetworkInterfaces());
    }
}
