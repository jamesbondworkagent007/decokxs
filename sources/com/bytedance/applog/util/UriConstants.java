package com.bytedance.applog.util;

import com.bytedance.applog.UriConfig;

/* JADX INFO: loaded from: classes2.dex */
public class UriConstants {
    public static final int AMERICA = 2;
    public static final int REGION_DEFAULT = 1;
    public static final int SINGAPORE = 1;
    public static final int SINGAPORE_ALI = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UriConfig f125a = new UriConfig.Builder().setRegisterUri("https://toblog.tobsnssdk.com/service/2/device_register/").setActiveUri("https://toblog.tobsnssdk.com/service/2/app_alert_check/").setSendUris(new String[]{"https://toblog.tobsnssdk.com/service/2/app_log/", "https://tobapplog.tobsnssdk.com/service/2/app_log/"}).setProfileUri("https://toblog.tobsnssdk.com/service/2/profile/").setSettingUri("https://toblog.tobsnssdk.com/service/2/log_settings/").setAbUri("https://toblog.tobsnssdk.com/service/2/abtest_config/").setALinkAttributionUri("https://toblog-alink.tobsnssdk.com/service/2/attribution_data").setALinkQueryUri("https://toblog-alink.tobsnssdk.com/service/2/alink_data").build();
    public static final UriConfig b = new UriConfig.Builder().setRegisterUri("https://toblog.itobsnssdk.com/service/2/device_register/").setActiveUri("https://toblog.itobsnssdk.com/service/2/app_alert_check/").setSendUris(new String[]{"https://toblog.itobsnssdk.com/service/2/app_log/", "https://tobapplog.itobsnssdk.com/service/2/app_log/"}).setProfileUri("https://toblog.itobsnssdk.com/service/2/profile/").setSettingUri("https://toblog.itobsnssdk.com/service/2/log_settings/").setAbUri("https://toblog.itobsnssdk.com/service/2/abtest_config/").setALinkAttributionUri("https://toblog-alink.itobsnssdk.com/service/2/attribution_data").setALinkQueryUri("https://toblog-alink.itobsnssdk.com/service/2/alink_data").build();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final UriConfig createUriConfig(int i) {
        if (1 != i && 2 == i) {
            return b;
        }
        return f125a;
    }
}
