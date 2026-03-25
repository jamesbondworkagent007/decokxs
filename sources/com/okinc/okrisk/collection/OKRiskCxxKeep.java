package com.okinc.okrisk.collection;

import android.content.Context;
import java.util.List;
import java.util.Map;
import o.C46985thW;
import o.C47135tkN;
import o.C47136tkO;
import o.C47208tlh;

/* JADX INFO: loaded from: classes24.dex */
public class OKRiskCxxKeep {
    public static boolean isShot() {
        return false;
    }

    public static String getDeviceModel() {
        return C46985thW.values();
    }

    public static Map<String, String> detectAABFile(Context context) {
        return C46985thW.EZpvd(context);
    }

    public static int detectTamperCREATOR() {
        return C46985thW.valueOf();
    }

    public static int detectVirtualPath(Context context) {
        return C46985thW.KWHzl(context);
    }

    public static int detectVirtualVMOS() {
        return C46985thW.djBIcL();
    }

    public static int detectVirtualX8Box() {
        return C46985thW.DbNXlk();
    }

    public static int detectVirtual51() {
        return C46985thW.gEmmrt();
    }

    public static int detectVirtualMaster() {
        return C46985thW.AYXKKw();
    }

    public static int vpnDetect(Context context) {
        return C46985thW.copydefault(context);
    }

    public static String getDeviceUUID() {
        return C46985thW.fetchVPNInfo();
    }

    public static String getMulData() {
        return C46985thW.AkhnZx();
    }

    public static List<Map<String, String>> getTargetAppInfo(Context context) {
        return C46985thW.OLrzqt(context);
    }

    public static void detectJavaTamperSign(Context context) {
        C46985thW.AEQbTJ(context);
    }

    public static int isMagiskInstalled(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.topjohnwu.magisk", 0) != null ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getAppSize(Context context) {
        return C47208tlh.AEQbTJ(context);
    }

    public static String getAccelerometerInfo(Context context) {
        return C47208tlh.EZpvd(context);
    }

    public static String getPressureInfo(Context context) {
        return C47208tlh.OLrzqt(context);
    }

    public static String getProximityInfo(Context context) {
        return C47208tlh.KWHzl(context);
    }

    public static String getStepCounterInfo(Context context) {
        return C47208tlh.copydefault(context);
    }

    public static String getStepDetectorInfo(Context context) {
        return C47208tlh.gEmmrt(context);
    }

    public static int getAirplaneModeStatus() {
        return C47208tlh.copydefault();
    }

    public static int getStayOnWhilePluggedIn() {
        return C47208tlh.djBIcL();
    }

    public static int getDevelopModeStatus() {
        return C47208tlh.KWHzl();
    }

    public static int getBootCount() {
        return C47208tlh.EZpvd();
    }

    public static String getHttpProxy() {
        return C47208tlh.valueOf();
    }

    public static int isHttpProxyEnabled() {
        return C47208tlh.AYXKKw();
    }

    public static int getAccessibilityEnabled() {
        return C47208tlh.OLrzqt();
    }

    public static String[] getEnabledAccessibilityServices() {
        return (String[]) C47208tlh.AEQbTJ().toArray(new String[0]);
    }

    public static int isBluetoothAvailable(Context context) {
        return C47208tlh.gEmmrt();
    }

    public static int isDataDirParentReadable() {
        return C47208tlh.AhwBna();
    }

    public static String getTargetPackageInfo(Context context, String str) {
        return C47135tkN.copydefault(context, str);
    }

    public static String getDevId(Context context) {
        return C47136tkO.Application.KWHzl(context);
    }

    public static boolean isTargetPackageInstalled(Context context, String str) {
        return C46985thW.OLrzqt(context, str);
    }
}
