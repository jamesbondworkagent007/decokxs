package o;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DF {
    public static final DD copydefault(@NotNull java.net.InetAddress inetAddress) {
        DJ dg;
        Intrinsics.checkNotNullParameter(inetAddress, "");
        if (inetAddress instanceof Inet4Address) {
            byte[] address = ((Inet4Address) inetAddress).getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "");
            dg = new DH(address);
        } else {
            if (!(inetAddress instanceof Inet6Address)) {
                throw new java.lang.IllegalStateException(("unrecognized InetAddress " + inetAddress).toString());
            }
            byte[] address2 = ((Inet6Address) inetAddress).getAddress();
            Intrinsics.checkNotNullExpressionValue(address2, "");
            dg = new DG(address2, null, 2, null);
        }
        java.lang.String hostName = inetAddress.getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "");
        return new DD(hostName, dg);
    }

    public static final java.net.InetAddress KWHzl(@NotNull DD dd) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(dd, "");
        java.net.InetAddress byAddress = java.net.InetAddress.getByAddress(dd.EZpvd(), dd.OLrzqt().OLrzqt());
        Intrinsics.checkNotNullExpressionValue(byAddress, "");
        return byAddress;
    }
}
