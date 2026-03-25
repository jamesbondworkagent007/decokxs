package com.okinc.liveness.lca.manager;

import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.lca.data.LcaJwstCollectCallback;
import com.okinc.liveness.lca.data.LcaJwstResultCallback;
import com.okinc.liveness.lca.data.LcaJwstWsCloseStatus;
import com.okinc.liveness.lca.data.LcaJwstWsRemote;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WebSocketManager {
    public static final int $stable = 8;
    public final String KYC_LOG_TAG;
    public final FacialExtParams extParams;
    public final LcaJwstResultCallback resultCallback;
    public final String wsBaseUrl;
    public LcaJwstWsRemote wsRemote;

    public WebSocketManager(@NotNull String str, @NotNull LcaJwstCollectCallback lcaJwstCollectCallback, @NotNull LcaJwstResultCallback lcaJwstResultCallback, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaJwstCollectCallback, "");
        Intrinsics.checkNotNullParameter(lcaJwstResultCallback, "");
        this.wsBaseUrl = str;
        this.resultCallback = lcaJwstResultCallback;
        this.extParams = facialExtParams;
        this.KYC_LOG_TAG = "kyc_in_house";
        LcaJwstWsRemote companion = LcaJwstWsRemote.Companion.getInstance();
        this.wsRemote = companion;
        if (companion != null) {
            companion.setCollectCallback(lcaJwstCollectCallback);
        }
    }

    public final void connect() {
        Map<String, String> customHeader;
        pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - connecting to WebSocket");
        LcaJwstWsRemote lcaJwstWsRemote = this.wsRemote;
        if (lcaJwstWsRemote != null) {
            String str = this.wsBaseUrl;
            FacialExtParams facialExtParams = this.extParams;
            lcaJwstWsRemote.connectWebsocket(str, (facialExtParams == null || (customHeader = facialExtParams.getCustomHeader()) == null) ? null : customHeader.get("Subdomain-Strategy"));
        }
    }

    public static /* synthetic */ void disconnect$default(WebSocketManager webSocketManager, LcaJwstWsCloseStatus lcaJwstWsCloseStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            lcaJwstWsCloseStatus = null;
        }
        webSocketManager.disconnect(lcaJwstWsCloseStatus);
    }

    public final void disconnect(LcaJwstWsCloseStatus lcaJwstWsCloseStatus) {
        pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - disconnecting WebSocket");
        LcaJwstWsRemote lcaJwstWsRemote = this.wsRemote;
        if (lcaJwstWsRemote != null) {
            lcaJwstWsRemote.disconnect(lcaJwstWsCloseStatus);
        }
    }

    public final void sendAuthEvent(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - sending auth event");
        LcaJwstWsRemote lcaJwstWsRemote = this.wsRemote;
        if (lcaJwstWsRemote != null) {
            lcaJwstWsRemote.sendAuthEvent(str, str2, z, z2);
        }
    }

    public final void sendFlashColorTimeoutEvent(long j) {
        LcaJwstWsRemote lcaJwstWsRemote = this.wsRemote;
        if (lcaJwstWsRemote != null) {
            lcaJwstWsRemote.sendFlashColorTimeoutEvent(j);
        }
    }

    public final void sendVideoSegment(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        LcaJwstWsRemote lcaJwstWsRemote = this.wsRemote;
        if (lcaJwstWsRemote != null) {
            lcaJwstWsRemote.sendVideoSegmentEvent(bArr);
        }
    }

    public final void sendFinalDescriptiveParams(long j, long j2, long j3, int i, int i2, long j4, @NotNull List<ColorEvent> list, @NotNull String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - sending final descriptive params");
        LcaJwstWsRemote lcaJwstWsRemote = this.wsRemote;
        if (lcaJwstWsRemote != null) {
            lcaJwstWsRemote.setResultCallback(this.resultCallback);
        }
        LcaJwstWsRemote lcaJwstWsRemote2 = this.wsRemote;
        if (lcaJwstWsRemote2 != null) {
            lcaJwstWsRemote2.sendFinalDescriptiveParams(j, j2, j3, i, i2, j4, list, str, map);
        }
    }
}
