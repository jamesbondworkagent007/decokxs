package o;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import androidx.core.content.ContextCompat;
import java.net.NetworkInterface;
import java.net.SocketException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47133tkL {
    public static final C47133tkL OLrzqt = new C47133tkL();

    private C47133tkL() {
    }

    public final java.lang.String AEQbTJ() throws SocketException {
        java.util.Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (networkInterfaces.hasMoreElements()) {
            java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                java.net.InetAddress inetAddressNextElement = inetAddresses.nextElement();
                java.lang.String hostAddress = inetAddressNextElement.getHostAddress();
                if (hostAddress != null && !inetAddressNextElement.isLinkLocalAddress() && !inetAddressNextElement.isLoopbackAddress() && StringsKt__StringsKt.contains$default((java.lang.CharSequence) hostAddress, (java.lang.CharSequence) ":", false, 2, (java.lang.Object) null)) {
                    arrayList.add(hostAddress);
                }
            }
        }
        return arrayList.isEmpty() ? "" : arrayList.toString();
    }

    public final java.lang.String KWHzl() {
        java.lang.String property = java.lang.System.getProperty("http.proxyHost");
        if (property == null) {
            property = "";
        }
        java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = "";
        }
        if (property.length() == 0 || property2.length() == 0) {
            return "";
        }
        return property + ":" + property2;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getApplicationContext().getSystemService("connectivity");
        Intrinsics.copydefault(systemService, "");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return Intrinsics.EZpvd(networkCapabilities != null ? java.lang.Boolean.valueOf(networkCapabilities.hasTransport(4)) : null, java.lang.Boolean.TRUE) ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r0 = r2.getHostAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault() {
        try {
            java.util.Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            loop0: while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLinkLocalAddress() && !inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.isSiteLocalAddress()) {
                        break loop0;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") != 0) {
            return "";
        }
        java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
        Intrinsics.copydefault(systemService, "");
        WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
        java.lang.String ssid = connectionInfo != null ? connectionInfo.getSSID() : null;
        return ssid == null ? "" : ssid;
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") != 0) {
            return "";
        }
        java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
        Intrinsics.copydefault(systemService, "");
        WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
        java.lang.String bssid = connectionInfo != null ? connectionInfo.getBSSID() : null;
        return bssid == null ? "" : bssid;
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getApplicationContext().getSystemService("connectivity");
        Intrinsics.copydefault(systemService, "");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 0) {
            return "No connection";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
                return "4G";
            case 16:
            case 19:
            default:
                return "Mobile";
            case 20:
                return "5G";
        }
    }
}
