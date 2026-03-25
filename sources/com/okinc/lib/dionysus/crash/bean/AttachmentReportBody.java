package com.okinc.lib.dionysus.crash.bean;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class AttachmentReportBody implements Serializable {
    ArrayList<ErrorAttachmentLog> logs = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<ErrorAttachmentLog> getLogs() {
        return this.logs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLogs(ArrayList<ErrorAttachmentLog> arrayList) {
        this.logs = arrayList;
    }
}
