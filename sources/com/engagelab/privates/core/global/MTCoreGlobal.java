package com.engagelab.privates.core.global;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.w;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.constants.MTCoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MTCoreGlobal {
    private static Address address = null;
    private static int connectRetryCount = 3;
    private static long heartbeatInterval = 290000;
    private static int loginCode = 0;
    private static boolean onlyBeWakeState = true;
    private static boolean onlyWakeState = true;
    private static String password = null;
    private static int registerCode = -1;
    private static String registrationId = null;
    private static long rid = 0;
    private static int seedId = 0;
    private static long serverTime = 0;
    private static long userId = 0;
    private static boolean wakeAndBeWakeState = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int getConnectRetryCount() {
        return connectRetryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<String> getHttpAddress(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getHttpAddressSet(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Set<String> getHttpAddressSet(Context context) {
        Set<String> setC = w.c(context);
        Address address2 = getAddress();
        if (address2 == null) {
            return setC;
        }
        String defaultReportUrl = address2.getDefaultReportUrl();
        if (!TextUtils.isEmpty(defaultReportUrl)) {
            setC.add(defaultReportUrl);
        }
        return setC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean getOnlyBeWakeState() {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            return onlyBeWakeState;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean getOnlyWakeState() {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            return onlyWakeState;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getPassword(Context context) {
        if (TextUtils.isEmpty(password)) {
            password = w.e(context);
        }
        return password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte getPlatformState(Context context) {
        return w.f(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getRegistrationId(Context context) {
        if (TextUtils.isEmpty(registrationId)) {
            registrationId = w.h(context);
        }
        return registrationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getRid() {
        long j = rid;
        long j2 = (j + (j % 2 == 0 ? 1L : 2L)) % 32767;
        rid = j2;
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getWakeAndBeWakeState() {
        return wakeAndBeWakeState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setAddress(Address address2) {
        if (MTGlobal.IS_FOR_ENGAGELAB) {
            return;
        }
        address = address2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setConnectRetryCount(int i) {
        if (i < 3) {
            connectRetryCount = 3;
        } else {
            connectRetryCount = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setHeartbeatInterval(long j) {
        if (j <= 0) {
            j = MTCoreConstants.Heartbeat.DEFAULT_VALUE_HEARTBEAT_INTERVAL;
        }
        heartbeatInterval = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setLoginCode(int i) {
        loginCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setOnlyBeWakeState(boolean z) {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            onlyBeWakeState = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setOnlyWakeState(boolean z) {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            onlyWakeState = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setPassword(String str) {
        password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setPlatformState(Context context, byte b) {
        w.a(context, b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setRegisterCode(int i) {
        registerCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setRegistrationId(String str) {
        registrationId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setSeedId(int i) {
        seedId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setServerTime(long j) {
        serverTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setUserId(long j) {
        userId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setWakeAndBeWakeState(boolean z) {
        wakeAndBeWakeState = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Address getAddress() {
        if (address == null) {
            synchronized (MTCoreGlobal.class) {
                if (address == null) {
                    if (MTGlobal.IS_FOR_ENGAGELAB) {
                        Address address2 = new Address();
                        address2.setSisHostArray("sis.push.theengagelab.com", "sis.push.engageforce.net", "sis.push.engage7.com");
                        address2.setSisIpArray("159.138.85.252", "114.119.186.57");
                        address2.setSisPort(19000);
                        address2.setDefaultHost("conn.push.theengagelab.com");
                        address2.setDefaultIp("159.138.90.61");
                        address2.setDefaultPort(3000);
                        address2.setDefaultReportUrl("https://pushstat.api.engagelab.cc");
                        address = address2;
                    } else {
                        address = new Address();
                    }
                }
            }
        }
        return address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int getLoginCode(Context context) {
        if (loginCode == -1) {
            loginCode = w.d(context);
        }
        return loginCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int getRegisterCode(Context context) {
        if (registerCode == -1) {
            registerCode = w.g(context);
        }
        return registerCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int getSeedId(Context context) {
        if (seedId == 0) {
            seedId = w.i(context);
        }
        return seedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static long getServerTime(Context context) {
        if (serverTime == 0) {
            serverTime = w.j(context);
        }
        return serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static long getUserId(Context context) {
        if (userId == 0) {
            userId = w.o(context);
        }
        return userId;
    }
}
