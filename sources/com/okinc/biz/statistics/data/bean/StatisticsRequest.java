package com.okinc.biz.statistics.data.bean;

import java.util.ArrayList;
import java.util.Iterator;
import o.C6900aYB;
import o.C6946aYv;
import o.InterfaceC6910aYL;
import o.InterfaceC6912aYN;

/* JADX INFO: loaded from: classes3.dex */
public class StatisticsRequest<T extends InterfaceC6912aYN> extends ArrayList<T> implements InterfaceC6910aYL {
    private C6900aYB clientInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6900aYB getClientInfo() {
        return this.clientInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setClientInfo(C6900aYB c6900aYB) {
        this.clientInfo = c6900aYB;
    }

    public StatisticsRequest(C6900aYB c6900aYB) {
        this.clientInfo = c6900aYB;
    }

    @Override // o.InterfaceC6910aYL
    public String format() {
        StringBuilder sb = new StringBuilder(this.clientInfo.format());
        sb.append("\r\n");
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(C6946aYv.EZpvd(it.next()));
        }
        return sb.toString();
    }
}
