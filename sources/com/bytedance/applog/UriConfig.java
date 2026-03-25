package com.bytedance.applog;

import com.bytedance.applog.util.UriConstants;

/* JADX INFO: loaded from: classes2.dex */
public class UriConfig {
    public static final String PATH_AB = "/service/2/abtest_config/";
    public static final String PATH_ACTIVE = "/service/2/app_alert_check/";
    public static final String PATH_ALINK_ATTRIBUTION = "/service/2/attribution_data";
    public static final String PATH_ALINK_QUERY = "/service/2/alink_data";
    public static final String PATH_CONFIG = "/service/2/log_settings/";
    public static final String PATH_DEVICE_UPDATE = "/service/2/device_update";
    public static final String PATH_ID_BIND = "/service/2/id_bind";
    public static final String PATH_PROFILE = "/service/2/profile/";
    public static final String PATH_REGISTER = "/service/2/device_register/";
    public static final String PATH_SEND = "/service/2/app_log/";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f109a;
    public String b;
    public String c;
    public String[] d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f110a;
        public String b;
        public String c;
        public String[] d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UriConfig build() {
            return new UriConfig(this, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setALinkAttributionUri(String str) {
            this.j = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setALinkQueryUri(String str) {
            this.i = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setAbUri(String str) {
            this.f = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setActiveUri(String str) {
            this.c = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setBusinessUri(String str) {
            this.h = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setIDBindUri(String str) {
            this.k = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setProfileUri(String str) {
            this.g = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setRegisterUri(String str) {
            this.f110a = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setReportOaidUri(String str) {
            this.b = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setSendUris(String[] strArr) {
            this.d = strArr;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setSettingUri(String str) {
            this.e = str;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ UriConfig(Builder builder, a aVar) {
        this.f109a = builder.f110a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static UriConfig createByDomain(String str, String[] strArr) {
        Builder builder = new Builder();
        builder.setRegisterUri(str + PATH_REGISTER).setReportOaidUri(str + PATH_DEVICE_UPDATE).setActiveUri(str + PATH_ACTIVE).setALinkAttributionUri(str + PATH_ALINK_ATTRIBUTION).setALinkQueryUri(str + PATH_ALINK_QUERY);
        if (strArr == null || strArr.length == 0) {
            builder.setSendUris(new String[]{com.bytedance.bdtracker.a.a(str, PATH_SEND)});
        } else {
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            strArr2[0] = com.bytedance.bdtracker.a.a(str, PATH_SEND);
            for (int i = 1; i < length; i++) {
                strArr2[i] = strArr[i - 1] + PATH_SEND;
            }
            builder.setSendUris(strArr2);
        }
        builder.setSettingUri(str + PATH_CONFIG).setAbUri(str + PATH_AB).setProfileUri(str + PATH_PROFILE).setIDBindUri(str + PATH_ID_BIND);
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static UriConfig createUriConfig(int i) {
        return UriConstants.createUriConfig(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAbUri() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getActiveUri() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAlinkAttributionUri() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAlinkQueryUri() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBusinessUri() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getIDBindUri() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getProfileUri() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRegisterUri() {
        return this.f109a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getReportOaidUri() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getSendUris() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSettingUri() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setALinkAttributionUri(String str) {
        this.j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setALinkQueryUri(String str) {
        this.i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAbUri(String str) {
        this.f = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setActiveUri(String str) {
        this.c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBusinessUri(String str) {
        this.h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProfileUri(String str) {
        this.g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRegisterUri(String str) {
        this.f109a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setReportOaidUri(String str) {
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSendUris(String[] strArr) {
        this.d = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSettingUri(String str) {
        this.e = str;
    }
}
