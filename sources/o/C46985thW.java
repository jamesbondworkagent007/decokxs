package o;

import android.content.pm.PackageManager;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.okrisk.OKRiskPayloadManager;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.thW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C46985thW {
    public static volatile boolean AEQbTJ = false;

    public static java.lang.String copydefault(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            java.lang.String string = java.lang.Integer.toString(b & UnsignedBytes.MAX_VALUE, 16);
            if (string.length() == 1) {
                string = "0" + string;
            }
            sb.append(string);
        }
        return sb.toString();
    }

    public static java.lang.String values() {
        return "Manufacturer: " + android.os.Build.MANUFACTURER + "\nModel: " + android.os.Build.MODEL + "\nBrand: " + android.os.Build.BRAND + "\nProduct: " + android.os.Build.PRODUCT;
    }

    public static boolean EZpvd(java.lang.String str) {
        try {
            return new java.io.File(str).exists();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    public static java.util.Map<java.lang.String, java.lang.String> KWHzl(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new java.io.FileInputStream(str));
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[1024];
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        java.lang.String name = nextEntry.getName();
                        if (name.endsWith(".so") || name.endsWith(".dex")) {
                            messageDigest.reset();
                            while (true) {
                                int i = zipInputStream.read(bArr, 0, 1024);
                                if (i == -1) {
                                    break;
                                }
                                messageDigest.update(bArr, 0, i);
                            }
                            map.put(name, copydefault(messageDigest.digest()));
                        }
                    } else {
                        zipInputStream.close();
                        return map;
                    }
                }
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return map;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> EZpvd(android.content.Context context) {
        java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        try {
            map = KWHzl(context.getPackageCodePath());
            java.lang.String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1024).applicationInfo.splitSourceDirs;
            if (strArr != null) {
                for (java.lang.String str : strArr) {
                    map.putAll(KWHzl(str));
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return map;
    }

    public static int valueOf() {
        try {
            java.lang.reflect.Field field = android.content.pm.PackageInfo.class.getField("CREATOR");
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (obj == null) {
                return -8;
            }
            java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
            java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
            if (classLoader != null && systemClassLoader != null) {
                return systemClassLoader.getClass().getName().equals(classLoader.getClass().getName()) ? 1 : 0;
            }
            return -6;
        } catch (java.lang.Throwable unused) {
            return -7;
        }
    }

    public static int KWHzl(android.content.Context context) {
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        java.lang.String packageName = context.getPackageName();
        java.lang.String str = "/data/data/" + packageName + "/files";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("/data/user/0/");
        sb.append(packageName);
        sb.append("/files");
        return (str.equals(absolutePath) || sb.toString().equals(absolutePath)) ? 0 : 1;
    }

    public static int djBIcL() {
        int iAhwBna = (AhwBna() << 3) + (copydefault() << 2) + (AEQbTJ() << 1);
        if (iAhwBna == 0) {
            return 0;
        }
        return iAhwBna;
    }

    public static int AhwBna() {
        return AEQbTJ("tomq_MANAGER_SERVICE");
    }

    public static int copydefault() {
        return (EZpvd("/proc/self/root/") && EZpvd("/proc/self/root", "VMOS_SYS_NUM")) ? 1 : 0;
    }

    public static int AEQbTJ() {
        if (EZpvd("/proc/self/root/data/data/com.vmos.app")) {
            return 1;
        }
        if (EZpvd("/proc/self/root/data/data/com.vmos.pro")) {
            return 2;
        }
        return EZpvd("/proc/self/root/data/data/com.vmos.ggp") ? 3 : 0;
    }

    public static int AEQbTJ(java.lang.String str) {
        java.lang.String line;
        try {
            java.lang.Process processExec = java.lang.Runtime.getRuntime().exec("service list");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()));
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    processExec.destroy();
                    return 0;
                }
            } while (!line.contains(str));
            return 1;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String line;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return false;
                    }
                } finally {
                }
            } while (!line.contains(str2));
            bufferedReader.close();
            return true;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int DbNXlk() {
        int iEZpvd = EZpvd();
        if (iEZpvd == 0) {
            return 0;
        }
        return iEZpvd;
    }

    public static int EZpvd() {
        if (EZpvd("/x8/config/root.pkg.blacklist")) {
            return 1;
        }
        return EZpvd("/x8/config/full_vm") ? 2 : 0;
    }

    public static int gEmmrt() {
        return KWHzl();
    }

    public static int KWHzl() {
        if (EZpvd("/proc/self/root/data/data/com.f1player")) {
            return 1;
        }
        return EZpvd("/proc/self/root/data/data/com.f1player.play") ? 2 : -6;
    }

    public static int AYXKKw() {
        return OLrzqt();
    }

    public static int OLrzqt() {
        if (EZpvd("/proc/self/root/data/data/com.pspace.vandroid")) {
            return 1;
        }
        return EZpvd("/proc/self/root/data/data/com.yiqiang.xmaster") ? 2 : -6;
    }

    public static int copydefault(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        for (android.net.Network network : connectivityManager.getAllNetworks()) {
            if (connectivityManager.getNetworkCapabilities(network).hasTransport(4)) {
                return 1;
            }
        }
        return -1;
    }

    public static java.lang.String fetchVPNInfo() {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(android.os.Build.BOARD);
            sb.append(android.os.Build.BRAND);
            sb.append(android.os.Build.DEVICE);
            sb.append(android.os.Build.HARDWARE);
            sb.append(android.os.Build.ID);
            sb.append(android.os.Build.MODEL);
            sb.append(android.os.Build.PRODUCT);
            sb.append(android.os.Build.SERIAL);
            return new UUID(sb.toString().hashCode(), r1.hashCode()).toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static boolean copydefault(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!java.lang.Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Process processExec = java.lang.Runtime.getRuntime().exec(str);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()));
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append("\n");
                } else {
                    bufferedReader.close();
                    processExec.waitFor();
                    return sb.toString().trim();
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.String AkhnZx() {
        java.lang.String strOLrzqt = OLrzqt("cat /proc/self/cgroup");
        if (strOLrzqt != null && strOLrzqt.length() != 0) {
            int iLastIndexOf = strOLrzqt.lastIndexOf("uid");
            int iLastIndexOf2 = strOLrzqt.lastIndexOf("/pid");
            if (iLastIndexOf < 0) {
                return null;
            }
            if (iLastIndexOf2 <= 0) {
                iLastIndexOf2 = strOLrzqt.length();
            }
            try {
                if (copydefault(strOLrzqt.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll("\n", ""))) {
                    return java.lang.String.format("u0_a%d", java.lang.Integer.valueOf(java.lang.Integer.valueOf(r0).intValue() - 10000));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    @yCM
    public C46985thW() {
    }

    public static java.util.List<java.util.Map<java.lang.String, java.lang.String>> OLrzqt(android.content.Context context) {
        InterfaceC46984thV interfaceC46984thV = (InterfaceC46984thV) C43248rlh.KWHzl.OLrzqt(InterfaceC46984thV.class);
        if (interfaceC46984thV == null) {
            return null;
        }
        return interfaceC46984thV.KWHzl(context);
    }

    public static void AEQbTJ(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        if (AEQbTJ) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Already called in this session, skipping");
            return;
        }
        AEQbTJ = true;
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: START");
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e) {
            pUU.copydefault("OKRiskAuxiliaryDetection", "detectJavaTamperSign: NameNotFoundException - " + e.getMessage(), e);
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: DEBUG_SUMMARY - NameNotFoundException: " + e.getMessage());
            OKRiskPayloadManager.copydefault.AEQbTJ("detectJavaTamperSign", "NameNotFoundException: " + e.getMessage());
        } catch (java.lang.Exception e2) {
            pUU.copydefault("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Exception - " + e2.getMessage(), e2);
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: DEBUG_SUMMARY - Exception: " + e2.getMessage());
            OKRiskPayloadManager.copydefault.AEQbTJ("detectJavaTamperSign", "Exception: " + e2.getMessage());
        }
        if (packageManager == null) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - PackageManager is null");
            return;
        }
        java.lang.String packageName = context.getPackageName();
        if (packageName == null) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - PackageName is null");
            return;
        }
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: PackageName=" + packageName);
        try {
            java.lang.String str = context.getApplicationInfo().sourceDir;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("detectJavaTamperSign: APK Path=");
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            sb.append(str);
            pUU.EZpvd("OKRiskAuxiliaryDetection", sb.toString());
        } catch (java.lang.Exception e3) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Failed to get APK path: " + e3.getMessage());
        }
        android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 64);
        if (packageInfo == null) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - PackageInfo is null");
            return;
        }
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - signatures array is null");
            return;
        }
        if (signatureArr.length == 0) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - signatures array is empty");
            return;
        }
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Number of signatures=" + packageInfo.signatures.length);
        android.content.pm.Signature signature = packageInfo.signatures[0];
        if (signature == null) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - First signature is null");
            return;
        }
        byte[] byteArray = signature.toByteArray();
        if (byteArray == null) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - Signature bytes is null");
            return;
        }
        if (byteArray.length == 0) {
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: ERROR - Signature bytes length is 0");
            return;
        }
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Signature bytes length=" + byteArray.length);
        int iMin = java.lang.Math.min(20, byteArray.length);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        for (int i = 0; i < iMin; i++) {
            sb2.append(java.lang.String.format("%02x", java.lang.Integer.valueOf(byteArray[i] & UnsignedBytes.MAX_VALUE)));
            if (i < iMin - 1) {
                sb2.append(" ");
            }
        }
        pUU.KWHzl("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Signature bytes preview (first " + iMin + " bytes): " + sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        int i2 = 0;
        while (i2 < byteArray.length) {
            sb3.append(java.lang.String.format("%02x", java.lang.Integer.valueOf(byteArray[i2] & UnsignedBytes.MAX_VALUE)));
            int i3 = i2 + 1;
            if (i3 % 32 == 0 && i2 < byteArray.length - 1) {
                sb3.append("\n");
            }
            i2 = i3;
        }
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: Full signature bytes (hex, " + byteArray.length + " bytes):\n" + sb3.toString());
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(byteArray, 2);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append("detectJavaTamperSign: Signature bytes (Base64): ");
        sb4.append(strEncodeToString);
        pUU.EZpvd("OKRiskAuxiliaryDetection", sb4.toString());
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(byteArray);
        java.lang.String strCopydefault = copydefault(messageDigest.digest());
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: MD5 hash of signature=" + strCopydefault);
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: DEBUG_SUMMARY - Package=" + packageName + ", SignatureLen=" + byteArray.length + ", MD5=" + strCopydefault);
        java.lang.String str2 = null;
        try {
            str2 = context.getApplicationInfo().sourceDir;
            pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: apkPath=" + str2);
        } catch (java.lang.Exception unused) {
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append("Package=");
        sb5.append(packageName);
        sb5.append(", APKPath=");
        if (str2 == null) {
            str2 = "unknown";
        }
        sb5.append(str2);
        sb5.append(", SignatureLen=");
        sb5.append(byteArray.length);
        sb5.append(", MD5=");
        sb5.append(strCopydefault);
        sb5.append(", SignaturePreview=");
        sb5.append(sb2.toString());
        sb5.append(", SignatureBase64=");
        sb5.append(strEncodeToString);
        sb5.append(", SignatureFirst20Hex=");
        sb5.append(sb2.toString().replace(" ", ""));
        OKRiskPayloadManager.copydefault.AEQbTJ("detectJavaTamperSign", sb5.toString());
        pUU.EZpvd("OKRiskAuxiliaryDetection", "detectJavaTamperSign: END");
    }

    public static boolean OLrzqt(android.content.Context context, java.lang.String str) {
        if (context == null) {
            pUU.copydefault("InstalledAppsUtils", "上下文不能为空");
            return false;
        }
        if (str == null || str.trim().isEmpty()) {
            pUU.copydefault("InstalledAppsUtils", "包名不能为空");
            return false;
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                pUU.copydefault("InstalledAppsUtils", "无法获取PackageManager");
                return false;
            }
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            pUU.KWHzl("InstalledAppsUtils", "未找到指定包: " + str);
            return false;
        } catch (java.lang.Exception e) {
            pUU.copydefault("InstalledAppsUtils", "检查包是否安装时发生异常: " + e.getMessage());
            return false;
        }
    }
}
