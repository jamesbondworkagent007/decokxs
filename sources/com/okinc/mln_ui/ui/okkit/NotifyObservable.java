package com.okinc.mln_ui.ui.okkit;

import o.InterfaceC8029auy;

/* JADX INFO: loaded from: classes16.dex */
public class NotifyObservable {
    private InterfaceC8029auy callback;
    private String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC8029auy getCallback() {
        return this.callback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCallback(InterfaceC8029auy interfaceC8029auy) {
        this.callback = interfaceC8029auy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setName(String str) {
        this.name = str;
    }

    public NotifyObservable(String str, InterfaceC8029auy interfaceC8029auy) {
        this.name = str;
        this.callback = interfaceC8029auy;
    }
}
