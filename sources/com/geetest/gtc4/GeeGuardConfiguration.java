package com.geetest.gtc4;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class GeeGuardConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f414a;
    public final boolean b;
    public final boolean c;
    public final HashMap d;
    public final HashMap e;
    public final int f;
    public final String g;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f415a = null;
        public boolean b = false;
        public boolean c = true;
        public HashMap d = null;
        public HashMap e = null;
        public int f = 1;
        public String g = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder addSignature(String str) {
            this.g = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GeeGuardConfiguration build() {
            return new GeeGuardConfiguration(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setAlInfo(boolean z) {
            this.b = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setAppId(String str) {
            this.f415a = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDevInfo(boolean z) {
            this.c = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setExtraInfo(HashMap<String, JSONObject> map) {
            this.e = map;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setLevel(int i) {
            this.f = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setOuterInfo(HashMap<String, Object> map) {
            this.d = map;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAppId() {
        return this.f414a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContent() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HashMap<String, JSONObject> getExtraInfo() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLevel() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HashMap<String, Object> getOuterInfo() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAlInfo() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDevInfo() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private GeeGuardConfiguration(Builder builder) {
        this.f414a = builder.f415a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
    }
}
