package com.okinc.websocket.bean;

import com.okinc.core.livelistener.OKIncomingData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OKWSConnDataParseResult {
    public static final int $stable = 8;
    private String error;
    private OKIncomingData incomingData;
    private OKWSEvent event = OKWSEvent.UNKNOWN;
    private String connId = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConnId() {
        return this.connId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKWSEvent getEvent() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKIncomingData getIncomingData() {
        return this.incomingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.connId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(String str) {
        this.error = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvent(@NotNull OKWSEvent oKWSEvent) {
        Intrinsics.checkNotNullParameter(oKWSEvent, "");
        this.event = oKWSEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIncomingData(OKIncomingData oKIncomingData) {
        this.incomingData = oKIncomingData;
    }
}
