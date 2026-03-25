package com.okinc.lib.dionysus.crash.bean;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class CrashReportBody implements Serializable {
    ArrayList<ManagedCrashLog> logs = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<ManagedCrashLog> getLogs() {
        return this.logs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLogs(ArrayList<ManagedCrashLog> arrayList) {
        this.logs = arrayList;
    }
}
