package com.okinc.websocket.v5config;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57559ykh;
import o.InterfaceC57562ykk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OKWSResponseData {
    public static final int $stable = 8;
    private final InterfaceC57559ykh arg;
    private final HashMap<String, String> argMap;
    private InterfaceC57562ykk channelDataBuffer;
    private long firstDataTime;
    private long subscribeTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57559ykh getArg() {
        return this.arg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getArgMap() {
        return this.argMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57562ykk getChannelDataBuffer() {
        return this.channelDataBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFirstDataTime() {
        return this.firstDataTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSubscribeTime() {
        return this.subscribeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelDataBuffer(InterfaceC57562ykk interfaceC57562ykk) {
        this.channelDataBuffer = interfaceC57562ykk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstDataTime(long j) {
        this.firstDataTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscribeTime(long j) {
        this.subscribeTime = j;
    }

    public OKWSResponseData(HashMap<String, String> map, @NotNull InterfaceC57559ykh interfaceC57559ykh) {
        Intrinsics.checkNotNullParameter(interfaceC57559ykh, "");
        this.argMap = map;
        this.arg = interfaceC57559ykh;
    }
}
