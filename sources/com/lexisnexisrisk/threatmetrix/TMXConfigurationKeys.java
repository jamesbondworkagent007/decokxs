package com.lexisnexisrisk.threatmetrix;

/* JADX INFO: loaded from: classes22.dex */
public class TMXConfigurationKeys {
    public static String ADVERTISING_ID_COLLECTION_KEY = "advertisingIdCollection";
    public static String API_KEY = "apiKey";
    public static String DISABLE_APP_HASHING_KEY = "disableAppHashing";
    public static String DISABLE_AUTHENTICATION_MODULE_KEY = "disableAuthenticationModule";
    public static String DISABLE_INIT_PACKAGE_SCAN_KEY = "disableInitPackageScan";
    public static String DISABLE_LOC_SER_ON_BATTERY_LOW_KEY = "disableLocSerOnBatteryLow";
    public static String DISABLE_NON_FATAL_LOGS_KEY = "disableNonfatalLogs";
    public static String DISABLE_OPTION_KEY = "disableOption";
    public static String DISABLE_PROFILE_PACKAGE_SCAN_KEY = "disableProfilePackageScan";
    public static String ENABLE_OPTION_KEY = "enableOption";
    public static String FP_SERVER_KEY = "fpServer";
    public static String HIGH_POWER_UPDATE_TIME_KEY = "highPowerUpdateTime";
    public static String INIT_PACKAGE_SCAN_TIME_LIMIT_KEY = null;
    public static String LOCATION_ACCURACY_KEY = null;
    public static String LOW_POWER_UPDATE_TIME_KEY = null;
    public static String ORG_ID_KEY = null;
    public static String PACKAGE_SCAN_TIME_LIMIT_KEY = null;
    public static String PROFILE_TIMEOUT_KEY = null;
    public static String REGISTER_FOR_LOCATION_SERVICES_KEY = null;
    public static String SCREEN_OFF_TIMEOUT_KEY = null;
    public static String TMXBEHAVIOSEC_INCLUDED_ACTIVITIES = null;
    public static String TMXBEHAVIOSEC_INJECT_JAVASCRIPT_COLLECTOR = null;
    public static String TMXBEHAVIOSEC_MASKED_FIELDS = null;
    public static String TMXBEHAVIOSEC_USE_TAG_AS_ID = null;
    public static String TMXBEHAVIOSEC_WEBFIELD_IDENTIFIER_ATTRIBUTE = null;
    public static int _wd = 3670;
    public static int fuZ = 5817;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0027) to fix multi-entry loop: BACK_EDGE: B:16:0x0027 -> B:17:0x002f */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static {
        /*
            int r0 = com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd
            r1 = 3669(0xe55, float:5.141E-42)
            if (r0 > r1) goto L38
        L6:
            int r0 = com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd
            int r1 = r0 + 26
            r2 = 39
            if (r1 == r2) goto L21
            r2 = 106(0x6a, float:1.49E-43)
            if (r1 == r2) goto L27
            r2 = 250(0xfa, float:3.5E-43)
            if (r1 == r2) goto L1b
            r0 = 354(0x162, float:4.96E-43)
            if (r1 == r0) goto L2f
            goto L6
        L1b:
            int r1 = r0 >> 25
            int r1 = r1 + r0
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd = r1
            goto L38
        L21:
            int r0 = r0 * 3
            r0 = r0 ^ 1889(0x761, float:2.647E-42)
        L25:
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd = r0
        L27:
            int r0 = com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd
            int r0 = r0 >> 48
            r0 = r0 ^ 3860(0xf14, float:5.409E-42)
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd = r0
        L2f:
            int r0 = com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys._wd
            r0 = r0 ^ 3712(0xe80, float:5.202E-42)
            int r0 = r0 * 109
            int r0 = r0 % 51
            goto L25
        L38:
            java.lang.String r0 = "initPackageScanTimeLimit"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.INIT_PACKAGE_SCAN_TIME_LIMIT_KEY = r0
            java.lang.String r0 = "locationAccuracy"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.LOCATION_ACCURACY_KEY = r0
            java.lang.String r0 = "lowPowerUpdateTime"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.LOW_POWER_UPDATE_TIME_KEY = r0
            java.lang.String r0 = "orgId"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.ORG_ID_KEY = r0
            java.lang.String r0 = "packageScanTimeLimit"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.PACKAGE_SCAN_TIME_LIMIT_KEY = r0
            java.lang.String r0 = "profileTimeout"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.PROFILE_TIMEOUT_KEY = r0
            java.lang.String r0 = "registerForLocationServices"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.REGISTER_FOR_LOCATION_SERVICES_KEY = r0
            java.lang.String r0 = "screenOffTimeout"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.SCREEN_OFF_TIMEOUT_KEY = r0
            java.lang.String r0 = "TMXBehavioSecIncludedActivities"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.TMXBEHAVIOSEC_INCLUDED_ACTIVITIES = r0
            java.lang.String r0 = "TMXBehavioSecMaskedFields"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.TMXBEHAVIOSEC_MASKED_FIELDS = r0
            java.lang.String r0 = "TMXBehavioSecInjectJavascriptCollector"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.TMXBEHAVIOSEC_INJECT_JAVASCRIPT_COLLECTOR = r0
            java.lang.String r0 = "TMXBehavioSecWebFieldIdentifierAttribute"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.TMXBEHAVIOSEC_WEBFIELD_IDENTIFIER_ATTRIBUTE = r0
            java.lang.String r0 = "TMXBehavioSecIdFromTag"
            com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.TMXBEHAVIOSEC_USE_TAG_AS_ID = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.TMXConfigurationKeys.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TMXConfigurationKeys() {
    }
}
