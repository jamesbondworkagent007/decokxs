package com.okinc.business.defi.dapp.webview.okxconnect;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Request {
    public static final int $stable = 0;
    private final String name;
    private final String payload;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = request.name;
        }
        if ((i & 2) != 0) {
            str2 = request.payload;
        }
        return request.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Request copy(String str, String str2) {
        return new Request(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) request.name) && Intrinsics.EZpvd((Object) this.payload, (Object) request.payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.payload;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Request(name=" + this.name + ", payload=" + this.payload + ")";
    }

    public Request(String str, String str2) {
        this.name = str;
        this.payload = str2;
    }
}
