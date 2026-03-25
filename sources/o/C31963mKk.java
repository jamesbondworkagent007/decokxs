package o;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.appsflyer.AdRevenueScheme;
import com.okinc.p2p.api.OtcExtraKeys;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mKk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31963mKk {
    public static java.lang.String EZpvd(android.content.Context context) {
        java.lang.String typeName;
        java.lang.String strKWHzl;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return "ConnectivityManager not found";
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (typeName = activeNetworkInfo.getTypeName()) == null) {
            return "UNKNOWN";
        }
        if (typeName.equalsIgnoreCase("WIFI")) {
            return "WIFI";
        }
        if (typeName.equalsIgnoreCase("MOBILE")) {
            strKWHzl = android.text.TextUtils.isEmpty(android.net.Proxy.getDefaultHost()) ? KWHzl(context) : "WAP";
        } else {
            strKWHzl = null;
        }
        return strKWHzl;
    }

    public static java.lang.Boolean OLrzqt(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return java.lang.Boolean.FALSE;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return java.lang.Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String copydefault(android.content.Context context) {
        byte b;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "未知运营商";
        }
        java.lang.String simOperator = telephonyManager.getSimOperator();
        if (simOperator == null) {
            return simOperator;
        }
        int iHashCode = simOperator.hashCode();
        if (iHashCode != 49679502) {
            switch (iHashCode) {
                case 49679470:
                    b = !simOperator.equals("46000") ? (byte) -1 : (byte) 0;
                    break;
                case 49679471:
                    if (simOperator.equals("46001")) {
                        b = 1;
                        break;
                    }
                    break;
                case 49679472:
                    if (simOperator.equals("46002")) {
                        b = 2;
                        break;
                    }
                    break;
                case 49679473:
                    if (simOperator.equals("46003")) {
                        b = 3;
                        break;
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 49679475:
                            if (simOperator.equals("46005")) {
                                b = 4;
                                break;
                            }
                            break;
                        case 49679476:
                            if (simOperator.equals("46006")) {
                                b = 5;
                                break;
                            }
                            break;
                        case 49679477:
                            if (simOperator.equals("46007")) {
                                b = 6;
                                break;
                            }
                            break;
                    }
                    break;
            }
        } else if (simOperator.equals("46011")) {
            b = 7;
        }
        switch (b) {
            case 0:
            case 2:
            case 6:
                return "中国移动";
            case 1:
            case 5:
                return "中国联通";
            case 3:
            case 4:
            case 7:
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static java.lang.String AEQbTJ(android.content.Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return "wifiManager not found";
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            return "wifiInfo not found";
        }
        int ipAddress = connectionInfo.getIpAddress();
        return java.lang.String.format("%d.%d.%d.%d", java.lang.Integer.valueOf(ipAddress & 255), java.lang.Integer.valueOf((ipAddress >> 8) & 255), java.lang.Integer.valueOf((ipAddress >> 16) & 255), java.lang.Integer.valueOf((ipAddress >> 24) & 255));
    }

    public static java.lang.String AEQbTJ() {
        try {
            java.util.Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static java.lang.String AhwBna(android.content.Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return "wifiManager not found";
        }
        android.net.DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return null;
        }
        int i = dhcpInfo.gateway;
        return java.lang.String.format("%d.%d.%d.%d", java.lang.Integer.valueOf(i & 255), java.lang.Integer.valueOf((i >> 8) & 255), java.lang.Integer.valueOf((i >> 16) & 255), java.lang.Integer.valueOf((i >> 24) & 255));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0048 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0061 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x0006 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e A[Catch: Exception -> 0x0066, TRY_ENTER, TryCatch #6 {Exception -> 0x0066, blocks: (B:9:0x003a, B:33:0x0063, B:31:0x005e), top: B:48:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[Catch: Exception -> 0x0066, PHI: r1 r6
  0x0063: PHI (r1v5 ??) = (r1v3 ??), (r1v11 ??) binds: [B:32:0x0061, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r6v13 ??) = (r6v11 ??), (r6v15 ??) binds: [B:32:0x0061, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {Exception -> 0x0066, blocks: (B:9:0x003a, B:33:0x0063, B:31:0x005e), top: B:48:0x0006 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String EZpvd(java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Object e;
        java.io.BufferedReader bufferedReader;
        ?? sb = new java.lang.StringBuilder();
        ?? line = 0;
        line = 0;
        line = 0;
        line = 0;
        line = 0;
        try {
            try {
                str = java.lang.Runtime.getRuntime().exec("getprop net." + ((java.lang.String) str));
                try {
                    bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(str.getInputStream()));
                } catch (java.io.IOException e2) {
                    e = e2;
                } catch (java.lang.InterruptedException e3) {
                    e = e3;
                }
            } catch (java.io.IOException e4) {
                e = e4;
                e = e;
                str = 0;
                pUU.AEQbTJ("tag", e);
                if (line != 0) {
                }
                if (str != 0) {
                    str.destroy();
                }
                return sb.toString().trim();
            } catch (java.lang.InterruptedException e5) {
                e = e5;
                e = e;
                str = 0;
                pUU.AEQbTJ("tag", e);
                if (line != 0) {
                }
                if (str != 0) {
                }
                return sb.toString().trim();
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = 0;
            }
            while (true) {
                try {
                    line = bufferedReader.readLine();
                    if (line == 0) {
                        break;
                    }
                    sb.append(line);
                } catch (java.io.IOException e6) {
                    e = e6;
                    e = e;
                    line = bufferedReader;
                    pUU.AEQbTJ("tag", e);
                    if (line != 0) {
                        line.close();
                    }
                    if (str != 0) {
                    }
                    return sb.toString().trim();
                } catch (java.lang.InterruptedException e7) {
                    e = e7;
                    e = e;
                    line = bufferedReader;
                    pUU.AEQbTJ("tag", e);
                    if (line != 0) {
                    }
                    if (str != 0) {
                    }
                    return sb.toString().trim();
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    line = bufferedReader;
                    if (line != 0) {
                        try {
                            line.close();
                        } catch (java.lang.Exception unused) {
                            throw th;
                        }
                    }
                    if (str != 0) {
                        str.destroy();
                    }
                    throw th;
                }
                str.destroy();
                return sb.toString().trim();
            }
            str.waitFor();
            bufferedReader.close();
            str.destroy();
            return sb.toString().trim();
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> copydefault(java.lang.String str) throws java.lang.Throwable {
        long jCurrentTimeMillis;
        java.lang.Object obj;
        UnknownHostException e;
        java.net.InetAddress[] allByName;
        java.util.HashMap map = new java.util.HashMap();
        java.lang.Object obj2 = null;
        try {
            try {
                jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            } catch (UnknownHostException e2) {
                e = e2;
                jCurrentTimeMillis = 0;
            }
            try {
                allByName = java.net.InetAddress.getAllByName(str);
                if (allByName != null) {
                    try {
                        try {
                            obj2 = (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + "";
                        } catch (java.lang.Throwable th) {
                            java.lang.Object obj3 = obj2;
                            obj2 = allByName;
                            th = th;
                            obj = obj3;
                            map.put("remoteInet", obj2);
                            map.put("useTime", obj);
                            throw th;
                        }
                    } catch (UnknownHostException e3) {
                        e = e3;
                        obj2 = (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + "";
                        pUU.AEQbTJ("tag", e);
                        map.put("remoteInet", allByName);
                    }
                }
                map.put("remoteInet", allByName);
            } catch (UnknownHostException e4) {
                e = e4;
                e = e;
                allByName = null;
                obj2 = (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + "";
                pUU.AEQbTJ("tag", e);
                map.put("remoteInet", allByName);
                map.put("useTime", obj2);
                return map;
            }
            map.put("useTime", obj2);
            return map;
        } catch (java.lang.Throwable th2) {
            th = th2;
            obj = null;
            map.put("remoteInet", obj2);
            map.put("useTime", obj);
            throw th;
        }
    }

    public static java.lang.String KWHzl(android.content.Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                return "TM==null";
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                return "UNKNOWN";
            }
            int networkType = telephonyManager.getNetworkType();
            if (networkType == 20) {
                return "5G";
            }
            switch (networkType) {
                case 0:
                    return "UNKNOWN";
                case 1:
                case 2:
                case 7:
                    return "2G";
                case 3:
                    return "3G";
                case 4:
                    return "2G";
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                    return "3G";
                case 11:
                    return "2G";
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                default:
                    return "4G";
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return "UNKNOWN";
        }
    }

    public static java.lang.String copydefault() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new java.net.URL("http://ip.taobao.com/service/getIpInfo2.php?ip=myip").openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.7 Safari/537.36");
            if (httpURLConnection.getResponseCode() == 200) {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                }
                JSONObject jSONObject = new JSONObject(sb.toString());
                if (jSONObject.getString("code").equals("0")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    java.lang.String str = jSONObject2.getString("ip") + "(" + jSONObject2.getString(AdRevenueScheme.COUNTRY) + jSONObject2.getString(OtcExtraKeys.AREA) + "区" + jSONObject2.getString("region") + jSONObject2.getString("city") + jSONObject2.getString("isp") + ")";
                    pUU.copydefault("提示", "您的IP地址是：" + str);
                    return str;
                }
                pUU.copydefault("提示", "IP接口异常，无法获取IP地址！");
            } else {
                pUU.copydefault("提示", "网络连接异常，无法获取IP地址！ code = " + httpURLConnection.getResponseCode());
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("提示", "获取IP地址时出现异常，异常信息是：" + e);
        }
        return "";
    }
}
