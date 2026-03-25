package com.okinc.lib.dionysus.bean;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class AppLaunchData {
    ArrayList<LaunchInfo> launchDataList = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<LaunchInfo> getLaunchDataList() {
        return this.launchDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLaunchDataList(ArrayList<LaunchInfo> arrayList) {
        this.launchDataList = arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class LaunchInfo {
        public String channel;
        public String flavor;
        public String version;
        public String versionCode;

        public LaunchInfo() {
        }

        public LaunchInfo(String str, String str2, String str3, String str4) {
            this.version = str;
            this.versionCode = str2;
            this.flavor = str3;
            this.channel = str4;
        }

        public String toString() {
            return "LaunchInfo{version='" + this.version + "', versionCode='" + this.versionCode + "', flavor='" + this.flavor + "', channel='" + this.channel + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String toString() {
        return "AppLaunchData{launchDataList=" + this.launchDataList + AbstractJsonLexerKt.END_OBJ;
    }
}
