package com.okinc.debugbox.bean;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class SenderWsMsg extends BaseWsMsg {
    public static final int $stable = 8;
    private ArrayList<WsMsg> args = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WsMsg> getArgs() {
        return this.args;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArgs(ArrayList<WsMsg> arrayList) {
        this.args = arrayList;
    }
}
