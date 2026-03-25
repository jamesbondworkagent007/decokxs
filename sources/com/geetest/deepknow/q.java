package com.geetest.deepknow;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import androidx.autofill.HintConstants;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes21.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f399a = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
    private static final String[] b = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    private static final Map<String, String> c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : "$unknown";
            if (simOperator != null) {
                if (!simOperator.startsWith("46000") && !simOperator.startsWith("46002") && !simOperator.startsWith("46004") && !simOperator.startsWith("46007")) {
                    if (!simOperator.startsWith("46001") && !simOperator.startsWith("46006") && !simOperator.startsWith("46009")) {
                        if (!simOperator.startsWith("46003") && !simOperator.startsWith("46005")) {
                            if (simOperator.startsWith("46011")) {
                            }
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d() {
        try {
            return new BufferedReader(new FileReader("/proc/cpuinfo")).readLine().split(":\\s+", 2)[1];
        } catch (Exception unused) {
            return "$unknown";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e() {
        String str = Build.VERSION.INCREMENTAL;
        if (str == null) {
            return str;
        }
        String str2 = Build.DISPLAY;
        return str2.contains(str) ? str2 : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static String f() {
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec("cat /proc/version");
        } catch (IOException unused) {
            processExec = null;
        }
        if (processExec == null) {
            return "$unknown";
        }
        InputStream inputStream = processExec.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 8192);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (IOException unused2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    inputStreamReader.close();
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException unused5) {
                    }
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (IOException unused6) {
                        throw th;
                    }
                }
            } catch (IOException unused7) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused8) {
            }
        }
        inputStreamReader.close();
        try {
            bufferedReader.close();
        } catch (IOException unused9) {
        }
        if ("".equals(sb.toString())) {
            return "$unknown";
        }
        String strSubstring = sb.substring(sb.indexOf("version ") + 8);
        return strSubstring.substring(0, strSubstring.indexOf(" "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g() {
        return (a().size() > 0 || b().size() > 0) ? "1" : "0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String[] h() {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec("mount").getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException unused2) {
            next = "";
        }
        return next.split("\n");
    }

    public static String c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Exception unused) {
            return "$unknown";
        }
    }

    public static String b(Context context) {
        long jLongValue;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            jLongValue = Long.valueOf(bufferedReader.readLine().split("\\s+")[1]).longValue() * 1024;
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            jLongValue = 0;
        }
        return Formatter.formatFileSize(context, jLongValue);
    }

    public static String c(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(17).isConnected() ? "1" : "0";
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    public static String d(Context context) {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? "0" : "1";
    }

    private static List<String> a() {
        String[] strArrH = h();
        ArrayList arrayList = new ArrayList();
        if (strArrH != null) {
            for (String str : strArrH) {
                String[] strArrSplit = str.split(" ");
                if (strArrSplit.length >= 4) {
                    String str2 = strArrSplit[1];
                    String str3 = strArrSplit[3];
                    for (String str4 : b) {
                        if (str2.equalsIgnoreCase(str4)) {
                            String[] strArrSplit2 = str3.split(",");
                            int length = strArrSplit2.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                if ("rw".equalsIgnoreCase(strArrSplit2[i])) {
                                    arrayList.add(str4);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<String> b() {
        ArrayList arrayList = new ArrayList();
        for (String str : f399a) {
            if (new File(str).exists()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
