package com.okinc.lib.dionysus.crash.bean;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class CrashData {
    ArrayList<CrashInfo> crashList = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<CrashInfo> getCrashList() {
        return this.crashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCrashList(ArrayList<CrashInfo> arrayList) {
        this.crashList = arrayList;
    }

    public static class CrashInfo {
        public long appUseTime;
        public long crashTime;
        public long dmpFileSize;
        public boolean isNativeCrash;
        public boolean isStartUpCrash;

        public CrashInfo() {
            this.isStartUpCrash = false;
            this.isNativeCrash = false;
        }

        public CrashInfo(long j, long j2, boolean z, boolean z2, long j3) {
            this.crashTime = j;
            this.appUseTime = j2;
            this.isStartUpCrash = z;
            this.isNativeCrash = z2;
            this.dmpFileSize = j3;
        }

        public String toString() {
            return "CrashInfo{crashTime=" + this.crashTime + ", appUseTime=" + this.appUseTime + ", isStartUpCrash=" + this.isStartUpCrash + ", isNativeCrash=" + this.isNativeCrash + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String toString() {
        return "CrashData{crashList=" + this.crashList + AbstractJsonLexerKt.END_OBJ;
    }
}
