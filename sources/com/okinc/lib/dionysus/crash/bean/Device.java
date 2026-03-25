package com.okinc.lib.dionysus.crash.bean;

import android.text.TextUtils;
import com.amplitude.analytics.BuildConfig;

/* JADX INFO: loaded from: classes9.dex */
public class Device {
    private String appBuild;
    private String appNamespace;
    private String appVersion;
    private String carrierCountry;
    private String carrierName;
    private String locale;
    private String model;
    private String oemName;
    private Integer osApiLevel;
    private String osBuild;
    private String osName;
    private String osVersion;
    private String screenSize;
    private String sdkName = "custom.android";
    private String sdkVersion = BuildConfig.VERSION_NAME;
    private Integer timeZoneOffset;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppBuild() {
        return this.appBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppNamespace() {
        return this.appNamespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppVersion() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCarrierCountry() {
        return this.carrierCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCarrierName() {
        return this.carrierName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLocale() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOemName() {
        return this.oemName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getOsApiLevel() {
        return this.osApiLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOsBuild() {
        return this.osBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOsName() {
        return this.osName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOsVersion() {
        return this.osVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getScreenSize() {
        return this.screenSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSdkName() {
        return this.sdkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAppBuild(String str) {
        this.appBuild = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAppNamespace(String str) {
        this.appNamespace = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCarrierCountry(String str) {
        this.carrierCountry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCarrierName(String str) {
        this.carrierName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLocale(String str) {
        this.locale = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setModel(String str) {
        this.model = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOemName(String str) {
        this.oemName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOsApiLevel(Integer num) {
        this.osApiLevel = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOsBuild(String str) {
        this.osBuild = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOsName(String str) {
        this.osName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScreenSize(String str) {
        this.screenSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSdkName(String str) {
        this.sdkName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTimeZoneOffset(Integer num) {
        this.timeZoneOffset = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Device device = (Device) obj;
        String str = this.sdkName;
        if (str == null ? device.sdkName != null : !str.equals(device.sdkName)) {
            return false;
        }
        String str2 = this.sdkVersion;
        if (str2 == null ? device.sdkVersion != null : !str2.equals(device.sdkVersion)) {
            return false;
        }
        String str3 = this.model;
        if (str3 == null ? device.model != null : !str3.equals(device.model)) {
            return false;
        }
        String str4 = this.oemName;
        if (str4 == null ? device.oemName != null : !str4.equals(device.oemName)) {
            return false;
        }
        String str5 = this.osName;
        if (str5 == null ? device.osName != null : !str5.equals(device.osName)) {
            return false;
        }
        String str6 = this.osVersion;
        if (str6 == null ? device.osVersion != null : !str6.equals(device.osVersion)) {
            return false;
        }
        String str7 = this.osBuild;
        if (str7 == null ? device.osBuild != null : !str7.equals(device.osBuild)) {
            return false;
        }
        Integer num = this.osApiLevel;
        if (num == null ? device.osApiLevel != null : !num.equals(device.osApiLevel)) {
            return false;
        }
        String str8 = this.locale;
        if (str8 == null ? device.locale != null : !str8.equals(device.locale)) {
            return false;
        }
        Integer num2 = this.timeZoneOffset;
        if (num2 == null ? device.timeZoneOffset != null : !num2.equals(device.timeZoneOffset)) {
            return false;
        }
        String str9 = this.screenSize;
        if (str9 == null ? device.screenSize != null : !str9.equals(device.screenSize)) {
            return false;
        }
        String str10 = this.appVersion;
        if (str10 == null ? device.appVersion != null : !str10.equals(device.appVersion)) {
            return false;
        }
        String str11 = this.carrierName;
        if (str11 == null ? device.carrierName != null : !str11.equals(device.carrierName)) {
            return false;
        }
        String str12 = this.carrierCountry;
        if (str12 == null ? device.carrierCountry != null : !str12.equals(device.carrierCountry)) {
            return false;
        }
        String str13 = this.appBuild;
        if (str13 == null ? device.appBuild != null : !str13.equals(device.appBuild)) {
            return false;
        }
        String str14 = this.appNamespace;
        String str15 = device.appNamespace;
        return str14 != null ? str14.equals(str15) : str15 == null;
    }

    public int hashCode() {
        int iHashCode = super.hashCode();
        String str = this.sdkName;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.sdkVersion;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.model;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.oemName;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.osName;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.osVersion;
        int iHashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.osBuild;
        int iHashCode8 = str7 != null ? str7.hashCode() : 0;
        Integer num = this.osApiLevel;
        int iHashCode9 = num != null ? num.hashCode() : 0;
        String str8 = this.locale;
        int iHashCode10 = str8 != null ? str8.hashCode() : 0;
        Integer num2 = this.timeZoneOffset;
        int iHashCode11 = num2 != null ? num2.hashCode() : 0;
        String str9 = this.screenSize;
        int iHashCode12 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.appVersion;
        int iHashCode13 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.carrierName;
        int iHashCode14 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.carrierCountry;
        int iHashCode15 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.appBuild;
        int iHashCode16 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.appNamespace;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.model) || TextUtils.isEmpty(this.osVersion);
    }
}
