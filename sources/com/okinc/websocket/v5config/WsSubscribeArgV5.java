package com.okinc.websocket.v5config;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57559ykh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class WsSubscribeArgV5 implements InterfaceC57559ykh {
    public static final int $stable = 8;
    private String channel = "undefine";
    private String extraParams;
    private int referenceCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void decreaseReferenceCount$OKNetwork_websocket() {
        this.referenceCount--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraParams() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasNoRef$OKNetwork_websocket() {
        return this.referenceCount <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void increaseReferenceCount$OKNetwork_websocket() {
        this.referenceCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraParams(String str) {
        this.extraParams = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefCount$OKNetwork_websocket(int i) {
        this.referenceCount = i;
    }

    public final boolean matchResponse$OKNetwork_websocket(HashMap<String, String> map) {
        return Intrinsics.EZpvd((Object) getUniqueKey(), (Object) getUniqueKeyByResponse(map));
    }
}
