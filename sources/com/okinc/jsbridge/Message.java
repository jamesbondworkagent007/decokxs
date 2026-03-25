package com.okinc.jsbridge;

/* JADX INFO: loaded from: classes16.dex */
public class Message {
    public String data;
    public String fail;
    public String method;
    public String params;
    public String success;
    public String uri;

    public String toString() {
        return "{uri:" + this.uri + ";method:" + this.method + ";data:" + this.data + ";params:" + this.params + ";success:" + this.success + ";fail:" + this.fail + "}";
    }
}
