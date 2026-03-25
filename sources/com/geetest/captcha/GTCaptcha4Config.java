package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class GTCaptcha4Config implements NoProguard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f355a;
    public final String b;
    public final String c;
    public final String[] d;
    public final String[] e;
    public final Map<String, Object> f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final String k;
    public final GTCaptcha4Client.OnDialogShowListener l;

    public static class Builder implements NoProguard {
        public String[] d;
        public String[] e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f356a = false;
        public String b = null;
        public String c = "file:///android_asset/gt4-index.html";
        public Map<String, Object> f = null;
        public boolean g = true;
        public boolean h = false;
        public int i = 10000;
        public int j = 0;
        public String k = null;
        public GTCaptcha4Client.OnDialogShowListener l = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GTCaptcha4Config build() {
            return new GTCaptcha4Config(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setApiServers(String[] strArr) {
            this.d = strArr;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setBackgroundColor(int i) {
            this.j = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setCanceledOnTouchOutside(boolean z) {
            this.g = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDebug(boolean z) {
            this.f356a = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDialogShowListener(GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
            this.l = onDialogShowListener;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDialogStyle(String str) {
            this.k = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setGTC4ViewHidden(boolean z) {
            this.h = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setLanguage(String str) {
            this.b = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setParams(Map<String, Object> map) {
            this.f = map;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setResourcePath(String str) {
            this.c = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setStaticServers(String[] strArr) {
            this.e = strArr;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setTimeOut(int i) {
            this.i = i;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getApiServers() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBackgroundColor() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GTCaptcha4Client.OnDialogShowListener getDialogShowListener() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDialogStyle() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getHtml() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLanguage() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> getParams() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getStaticServers() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTimeOut() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCanceledOnTouchOutside() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDebug() {
        return this.f355a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGTC4ViewHidden() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private GTCaptcha4Config(Builder builder) {
        this.f355a = builder.f356a;
        this.b = builder.b;
        this.c = builder.c;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
        this.d = builder.d;
        this.e = builder.e;
    }
}
