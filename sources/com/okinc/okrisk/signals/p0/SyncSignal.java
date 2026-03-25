package com.okinc.okrisk.signals.p0;

import android.content.Context;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.push.AttributionReporter;
import com.okinc.okrisk.service.DeviceProfileRemoteConfig;
import com.okinc.okrisk.signals.p0.SyncSignal;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C47126tkE;
import o.C47130tkI;
import o.C47132tkK;
import o.C47133tkL;
import o.C47136tkO;
import o.C47138tkQ;
import o.C47139tkR;
import o.C47141tkT;
import o.C47207tlg;
import o.C47219tls;
import o.C47239tmL;
import o.C56444yFp;
import o.C6777aVl;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class SyncSignal {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public ConcurrentHashMap<String, String> AEQbTJ = new ConcurrentHashMap<>(150);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SignalKey {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SignalKey[] $VALUES;
        private final Function2<Context, Map<String, String>, Object> getValue;
        private final String key;
        public static final SignalKey BATTERY_LEVEL = new SignalKey("BATTERY_LEVEL", 0, "batteryLevel", new Function2() { // from class: o.tiO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$0((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BATTERY_STATUS = new SignalKey("BATTERY_STATUS", 1, "batteryState", new Function2() { // from class: o.tiP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$1((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BATTERY_TEMPERATURE = new SignalKey("BATTERY_TEMPERATURE", 2, "batteryTemperature", new Function2() { // from class: o.tiZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$2((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BATTERY_TECHNOLOGY = new SignalKey("BATTERY_TECHNOLOGY", 3, "batteryTechnology", new Function2() { // from class: o.tjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$3((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BATTERY_HEALTH = new SignalKey("BATTERY_HEALTH", 4, "batteryHealth", new Function2() { // from class: o.tjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$4((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BATTERY_VOLTAGE = new SignalKey("BATTERY_VOLTAGE", 5, "batteryVoltage", new Function2() { // from class: o.tjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$5((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BATTERY_CHARGING_METHOD = new SignalKey("BATTERY_CHARGING_METHOD", 6, "batteryChargingMethod", new Function2() { // from class: o.tjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$6((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey EMULATOR = new SignalKey("EMULATOR", 7, "isSimulator", new Function2() { // from class: o.tki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$7((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey JAILBREAK = new SignalKey("JAILBREAK", 8, "isJailbroken", new Function2() { // from class: o.tkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$8((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey EMULATOR_PROPERTY = new SignalKey("EMULATOR_PROPERTY", 9, "qemuprops", new Function2() { // from class: o.tkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$9((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_ID = new SignalKey("APP_ID", 10, "appId", new Function2() { // from class: o.tiR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$10((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SESSION_ID = new SignalKey("SESSION_ID", 11, OtcExtraKeys.SESSIONID, new Function2() { // from class: o.tjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$11((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey TRANSACTION_ID = new SignalKey("TRANSACTION_ID", 12, "transactionId", new Function2() { // from class: o.tjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$12((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey FINGERPRINT_ID = new SignalKey("FINGERPRINT_ID", 13, "fingerprintId", new Function2() { // from class: o.tjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$13((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BUNDLE_IDENTIFIER = new SignalKey("BUNDLE_IDENTIFIER", 14, "bundleIdentifier", new Function2() { // from class: o.tjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$14((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey ADVERTISING_ID = new SignalKey("ADVERTISING_ID", 15, "advertisingId", new Function2() { // from class: o.tjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$15((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DEVICE_ID = new SignalKey("DEVICE_ID", 16, "deviceId", new Function2() { // from class: o.tkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$16((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey ANDROID_ID = new SignalKey("ANDROID_ID", 17, "androidId", new Function2() { // from class: o.tkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$17((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey ALIFD_DEVICETOEKN_ID = new SignalKey("ALIFD_DEVICETOEKN_ID", 18, "ali_deviceToken", new Function2() { // from class: o.tkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$18((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey IPV6_ADDRESSES = new SignalKey("IPV6_ADDRESSES", 19, "ipv6", new Function2() { // from class: o.tiT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$19((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PROXY_INFO = new SignalKey("PROXY_INFO", 20, "proxyInfo", new Function2() { // from class: o.tiS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$20((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey VPN_INFO = new SignalKey("VPN_INFO", 21, "vpnInfo", new Function2() { // from class: o.tiQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$21((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PRIVATE_IP = new SignalKey("PRIVATE_IP", 22, "privateIp", new Function2() { // from class: o.tiV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$22((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SSID = new SignalKey("SSID", 23, "ssid", new Function2() { // from class: o.tiY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$23((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BSSID = new SignalKey("BSSID", 24, "bssid", new Function2() { // from class: o.tiX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$24((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey NETWORK_TYPE = new SignalKey("NETWORK_TYPE", 25, "networkType", new Function2() { // from class: o.tiW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$25((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PROCESSOR_COUNT = new SignalKey("PROCESSOR_COUNT", 26, "processorCount", new Function2() { // from class: o.tiU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$26((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_AVAILABLE_MEMORY = new SignalKey("APP_AVAILABLE_MEMORY", 27, "appFreeMemory", new Function2() { // from class: o.tjb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$27((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_TOTAL_MEMORY = new SignalKey("APP_TOTAL_MEMORY", 28, "appTotalMemory", new Function2() { // from class: o.tja
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$28((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey AVAILABLE_MEMORY = new SignalKey("AVAILABLE_MEMORY", 29, "freeMemory", new Function2() { // from class: o.tjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$29((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PHYSICAL_MEMORY = new SignalKey("PHYSICAL_MEMORY", 30, "physicalMemory", new Function2() { // from class: o.tjg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$30((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey LOW_MEMORY = new SignalKey("LOW_MEMORY", 31, "lowMemory", new Function2() { // from class: o.tjh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$31((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey RUNNING_PROCESSES = new SignalKey("RUNNING_PROCESSES", 32, "runningProcesses", new Function2() { // from class: o.tje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$32((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey CPU_HARDWARE = new SignalKey("CPU_HARDWARE", 33, "cpuName", new Function2() { // from class: o.tji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$33((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey CPU_PROCESSOR = new SignalKey("CPU_PROCESSOR", 34, "cpuProcessorName", new Function2() { // from class: o.tjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$34((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DENSITY = new SignalKey("DENSITY", 35, "screenScale", new Function2() { // from class: o.tjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$35((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DENSITY_DPI = new SignalKey("DENSITY_DPI", 36, "densityDpi", new Function2() { // from class: o.tjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$36((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SCALED_DENSITY = new SignalKey("SCALED_DENSITY", 37, "scaledScreenDensity", new Function2() { // from class: o.tjj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$37((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SCREEN_WIDTH = new SignalKey("SCREEN_WIDTH", 38, "screenWidth", new Function2() { // from class: o.tjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$38((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SCREEN_HEIGHT = new SignalKey("SCREEN_HEIGHT", 39, "screenHeight", new Function2() { // from class: o.tjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$39((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey X_DPI = new SignalKey("X_DPI", 40, "xdpi", new Function2() { // from class: o.tjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$40((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey Y_DPI = new SignalKey("Y_DPI", 41, "ydpi", new Function2() { // from class: o.tjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$41((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey ORIENTATION = new SignalKey("ORIENTATION", 42, "orientation", new Function2() { // from class: o.tjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$42((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PLATFORM = new SignalKey("PLATFORM", 43, MTPushConstants.PlatformNode.KEY_PLATFORM, new Function2() { // from class: o.tjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$43((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_BRAND = new SignalKey("SYSTEM_BRAND", 44, "systemBrand", new Function2() { // from class: o.tjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$44((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_MANUFACTURER = new SignalKey("SYSTEM_MANUFACTURER", 45, "systemManufacturer", new Function2() { // from class: o.tju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$45((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_BOARD = new SignalKey("SYSTEM_BOARD", 46, "systemBoard", new Function2() { // from class: o.tjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$46((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_FINGERPRINT = new SignalKey("SYSTEM_FINGERPRINT", 47, "systemFingerprint", new Function2() { // from class: o.tjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$47((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_NAME = new SignalKey("SYSTEM_NAME", 48, "systemName", new Function2() { // from class: o.tjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$48((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SECURITY_PATCH = new SignalKey("SECURITY_PATCH", 49, "securityPatch", new Function2() { // from class: o.tjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$49((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_MODEL = new SignalKey("SYSTEM_MODEL", 50, "systemModel", new Function2() { // from class: o.tjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$50((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DEVICE_MODEL = new SignalKey("DEVICE_MODEL", 51, "deviceModel", new Function2() { // from class: o.tjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$51((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey INCREMENTAL_VERSION = new SignalKey("INCREMENTAL_VERSION", 52, "buildNumber", new Function2() { // from class: o.tjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$52((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey CODE_NAME = new SignalKey("CODE_NAME", 53, "codeName", new Function2() { // from class: o.tjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$53((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BUILD_TAGS = new SignalKey("BUILD_TAGS", 54, "buildTags", new Function2() { // from class: o.tjE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$54((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey KERNEL_VERSION = new SignalKey("KERNEL_VERSION", 55, "kernelVersion", new Function2() { // from class: o.tjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$55((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey HARDWARE = new SignalKey("HARDWARE", 56, "hardware", new Function2() { // from class: o.tjL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$56((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey HOST = new SignalKey("HOST", 57, "host", new Function2() { // from class: o.tjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$57((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DISPLAY = new SignalKey("DISPLAY", 58, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, new Function2() { // from class: o.tjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$58((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey RADIO_VERSION = new SignalKey("RADIO_VERSION", 59, "radioVersion", new Function2() { // from class: o.tjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$59((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PRODUCT = new SignalKey("PRODUCT", 60, "product", new Function2() { // from class: o.tjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$60((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SERIAL_NUMBER = new SignalKey("SERIAL_NUMBER", 61, "serialNumber", new Function2() { // from class: o.tjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$61((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DEVICE_NAME = new SignalKey("DEVICE_NAME", 62, "deviceName", new Function2() { // from class: o.tjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$62((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey TIME_STAMP = new SignalKey("TIME_STAMP", 63, "timeStamp", new Function2() { // from class: o.tjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$63((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey LOCALE = new SignalKey("LOCALE", 64, "locale", new Function2() { // from class: o.tjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$64((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey SYSTEM_VERSION = new SignalKey("SYSTEM_VERSION", 65, "systemVersion", new Function2() { // from class: o.tjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$65((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BOOT_TIME = new SignalKey("BOOT_TIME", 66, "bootTime", new Function2() { // from class: o.tjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$66((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey UP_TIME = new SignalKey("UP_TIME", 67, "upTime", new Function2() { // from class: o.tjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$67((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey TIME_ZONE = new SignalKey("TIME_ZONE", 68, "timeZone", new Function2() { // from class: o.tka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$68((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_NAME = new SignalKey("APP_NAME", 69, "appName", new Function2() { // from class: o.tjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$69((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_DISPLAY_NAME = new SignalKey("APP_DISPLAY_NAME", 70, "appDisplayName", new Function2() { // from class: o.tjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$70((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_VERSION = new SignalKey("APP_VERSION", 71, AttributionReporter.APP_VERSION, new Function2() { // from class: o.tkb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$71((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey APP_VERSION_CODE = new SignalKey("APP_VERSION_CODE", 72, "appVersionCode", new Function2() { // from class: o.tkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$72((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PREFERRED_LANGUAGES = new SignalKey("PREFERRED_LANGUAGES", 73, "preferredLanguages", new Function2() { // from class: o.tke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$73((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey KEYBOARD_LANGUAGES = new SignalKey("KEYBOARD_LANGUAGES", 74, "keyboardPrimaryLanguage", new Function2() { // from class: o.tkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$74((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey CURRENT_TIME_UTC = new SignalKey("CURRENT_TIME_UTC", 75, "currentTimeUTC", new Function2() { // from class: o.tkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$75((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey USER_AGENT = new SignalKey("USER_AGENT", 76, "userAgent", new Function2() { // from class: o.tkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$76((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DEFAULT_TIME_ZONE_OFFSET = new SignalKey("DEFAULT_TIME_ZONE_OFFSET", 77, "defaultTimeZoneOffset", new Function2() { // from class: o.tkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$77((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DISK_SPACE = new SignalKey("DISK_SPACE", 78, "diskSpace", new Function2() { // from class: o.tkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$78((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey DST = new SignalKey("DST", 79, "dst", new Function2() { // from class: o.tkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$79((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey FIRST_INSTALL_TIME = new SignalKey("FIRST_INSTALL_TIME", 80, "firstAppInstallTime", new Function2() { // from class: o.tko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$80((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey LAST_UPDATE_TIME = new SignalKey("LAST_UPDATE_TIME", 81, "lastAppUpdate", new Function2() { // from class: o.tkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$81((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey KEYBOARD_CONNECTED = new SignalKey("KEYBOARD_CONNECTED", 82, "keyboardConnected", new Function2() { // from class: o.tkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$82((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey GPU_NAME = new SignalKey("GPU_NAME", 83, "gpuName", new Function2() { // from class: o.tkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$83((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey GPU_VENDOR = new SignalKey("GPU_VENDOR", 84, "gpuVendor", new Function2() { // from class: o.tks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$84((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey IMEI = new SignalKey("IMEI", 85, "imei", new Function2() { // from class: o.tkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$85((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey NETWORK_OPERATOR = new SignalKey("NETWORK_OPERATOR", 86, "networkOperator", new Function2() { // from class: o.tku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$86((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey CARRIER_NAME = new SignalKey("CARRIER_NAME", 87, "carrierName", new Function2() { // from class: o.tkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$87((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey NETWORK_COUNTRY_ISO = new SignalKey("NETWORK_COUNTRY_ISO", 88, "networkCountryISO", new Function2() { // from class: o.tkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$88((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey FONT_HASH = new SignalKey("FONT_HASH", 89, "osFontsHash", new Function2() { // from class: o.tkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$89((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey FONT_SIZE = new SignalKey("FONT_SIZE", 90, "osFontsSize", new Function2() { // from class: o.tkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$90((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey USER_TOKEN = new SignalKey("USER_TOKEN", 91, "uToken", new Function2() { // from class: o.tky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$91((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey PUBLIC_KEY = new SignalKey("PUBLIC_KEY", 92, "pk", new Function2() { // from class: o.tkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$92((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey CREATION_TIME = new SignalKey("CREATION_TIME", 93, "creation", new Function2() { // from class: o.tkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$93((android.content.Context) obj, (java.util.Map) obj2);
            }
        });
        public static final SignalKey BIOMETRICS = new SignalKey("BIOMETRICS", 94, "biometrics", new Function2() { // from class: o.tkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SyncSignal.SignalKey._init_$lambda$94((android.content.Context) obj, (java.util.Map) obj2);
            }
        });

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SignalKey[] $values() {
            return new SignalKey[]{BATTERY_LEVEL, BATTERY_STATUS, BATTERY_TEMPERATURE, BATTERY_TECHNOLOGY, BATTERY_HEALTH, BATTERY_VOLTAGE, BATTERY_CHARGING_METHOD, EMULATOR, JAILBREAK, EMULATOR_PROPERTY, APP_ID, SESSION_ID, TRANSACTION_ID, FINGERPRINT_ID, BUNDLE_IDENTIFIER, ADVERTISING_ID, DEVICE_ID, ANDROID_ID, ALIFD_DEVICETOEKN_ID, IPV6_ADDRESSES, PROXY_INFO, VPN_INFO, PRIVATE_IP, SSID, BSSID, NETWORK_TYPE, PROCESSOR_COUNT, APP_AVAILABLE_MEMORY, APP_TOTAL_MEMORY, AVAILABLE_MEMORY, PHYSICAL_MEMORY, LOW_MEMORY, RUNNING_PROCESSES, CPU_HARDWARE, CPU_PROCESSOR, DENSITY, DENSITY_DPI, SCALED_DENSITY, SCREEN_WIDTH, SCREEN_HEIGHT, X_DPI, Y_DPI, ORIENTATION, PLATFORM, SYSTEM_BRAND, SYSTEM_MANUFACTURER, SYSTEM_BOARD, SYSTEM_FINGERPRINT, SYSTEM_NAME, SECURITY_PATCH, SYSTEM_MODEL, DEVICE_MODEL, INCREMENTAL_VERSION, CODE_NAME, BUILD_TAGS, KERNEL_VERSION, HARDWARE, HOST, DISPLAY, RADIO_VERSION, PRODUCT, SERIAL_NUMBER, DEVICE_NAME, TIME_STAMP, LOCALE, SYSTEM_VERSION, BOOT_TIME, UP_TIME, TIME_ZONE, APP_NAME, APP_DISPLAY_NAME, APP_VERSION, APP_VERSION_CODE, PREFERRED_LANGUAGES, KEYBOARD_LANGUAGES, CURRENT_TIME_UTC, USER_AGENT, DEFAULT_TIME_ZONE_OFFSET, DISK_SPACE, DST, FIRST_INSTALL_TIME, LAST_UPDATE_TIME, KEYBOARD_CONNECTED, GPU_NAME, GPU_VENDOR, IMEI, NETWORK_OPERATOR, CARRIER_NAME, NETWORK_COUNTRY_ISO, FONT_HASH, FONT_SIZE, USER_TOKEN, PUBLIC_KEY, CREATION_TIME, BIOMETRICS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$12(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return "";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$18(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return "";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SignalKey> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function2<Context, Map<String, String>, Object> getGetValue() {
            return this.getValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKey() {
            return this.key;
        }

        private SignalKey(String str, int i, String str2, Function2 function2) {
            this.key = str2;
            this.getValue = function2;
        }

        static {
            SignalKey[] signalKeyArr$values = $values();
            $VALUES = signalKeyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(signalKeyArr$values);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$0(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$1(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.KWHzl(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$2(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$3(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.copydefault(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$4(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.AEQbTJ(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$5(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.djBIcL(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$6(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47126tkE.OLrzqt.gEmmrt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$7(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47130tkI.AEQbTJ.KWHzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$8(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47130tkI.AEQbTJ.AEQbTJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$9(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47130tkI.AEQbTJ.copydefault();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$10(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.AEQbTJ(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$11(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.valueOf(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$13(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.EZpvd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$14(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$15(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$16(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.gEmmrt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$17(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47136tkO.AEQbTJ.KWHzl(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$19(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.AEQbTJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$20(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.KWHzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$21(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$22(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.copydefault();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$23(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.AEQbTJ(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$24(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.copydefault(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$25(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47133tkL.OLrzqt.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$26(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.AEQbTJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$27(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.copydefault();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$28(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.KWHzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$29(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$30(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.copydefault(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$31(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.AEQbTJ(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$32(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$33(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.OLrzqt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$34(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47141tkT.copydefault.gEmmrt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$35(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$36(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.copydefault(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$37(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.AEQbTJ(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$38(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.djBIcL(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$39(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.KWHzl(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$40(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.gEmmrt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$41(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.AhwBna(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$42(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47139tkR.OLrzqt.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$43(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.getNewProxyInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$44(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.gHZMYf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$45(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AxsJAY();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$46(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AwvSrB();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$47(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.sSMYrx();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$48(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.OcIXYQ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$49(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AuCTelauCTel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$50(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.QOLQEE();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$51(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AkhnZx();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$52(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.uzCIH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$53(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.gEmmrt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$54(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.valueOf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$55(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.iwGUEr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$56(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.fIwbmz();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$57(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.ejfBZ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$58(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.DbNXlk();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$59(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.zLjUOn();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$60(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AubY();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$61(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.wlaJM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$62(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.fetchVPNInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$63(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.QKVWgx();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$64(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.hDKMBd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$65(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.ORxRYg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$66(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AYXKKw();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$67(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.QfsBiF();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$68(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.DTwDnp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$69(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.KWHzl(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$70(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$71(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$72(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return String.valueOf(C47138tkQ.EZpvd.valueOf(context));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$73(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.zsXlph();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$74(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.djBIcL(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$75(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AhwBna();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$76(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.QUSxYX();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$77(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.values();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$78(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AhwBna(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$79(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.djBIcL();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$80(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AYXKKw(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$81(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.gEmmrt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$82(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.fARcdN(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$83(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.fARcdN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$84(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.AuCTel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$85(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47207tlg.KWHzl.AEQbTJ(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$86(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47207tlg.KWHzl.EZpvd(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$87(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47207tlg.KWHzl.OLrzqt(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$88(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47207tlg.KWHzl.copydefault(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$89(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47132tkK.OLrzqt.AEQbTJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$90(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47132tkK.OLrzqt.copydefault();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$91(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47219tls.OLrzqt.KWHzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$92(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47239tmL.copydefault.KWHzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$93(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.isConnected(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$94(Context context, Map map) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(map, "");
            return C47138tkQ.EZpvd.KWHzl();
        }

        public static SignalKey valueOf(String str) {
            return (SignalKey) Enum.valueOf(SignalKey.class, str);
        }

        public static SignalKey[] values() {
            return (SignalKey[]) $VALUES.clone();
        }
    }

    public final void OLrzqt(@NotNull Context context, @NotNull SignalKey signalKey, @NotNull List<? extends SignalKey> list, @NotNull DeviceProfileRemoteConfig deviceProfileRemoteConfig) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signalKey, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(deviceProfileRemoteConfig, "");
        if (deviceProfileRemoteConfig.getBk().contains(signalKey.getKey())) {
            this.AEQbTJ.remove(signalKey.getKey());
            return;
        }
        if (list.contains(signalKey)) {
            this.AEQbTJ.remove(signalKey.getKey());
        }
        if (C33129mqd.OLrzqt((CharSequence) this.AEQbTJ.get(signalKey.getKey()))) {
            return;
        }
        try {
            Object objInvoke = signalKey.getGetValue().invoke(context, this.AEQbTJ);
            if (objInvoke instanceof String) {
                if (C33129mqd.OLrzqt((CharSequence) objInvoke)) {
                    this.AEQbTJ.put(signalKey.getKey(), (String) objInvoke);
                }
            } else if (objInvoke instanceof JSONObject) {
                AEQbTJ(this.AEQbTJ, (JSONObject) objInvoke);
            }
        } catch (Exception e) {
            C6777aVl.Companion.EZpvd(new Exception("DeviceSignal Exception collectSignal key: " + signalKey + "  and fail reason ==" + e.getMessage()));
        }
    }

    public final void AEQbTJ(@NotNull Map<String, String> map, @NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = jSONObject.getString(next);
            if (C33129mqd.OLrzqt((CharSequence) string)) {
                map.put(next, string.toString());
            }
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.signals.p0.SyncSignal.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
