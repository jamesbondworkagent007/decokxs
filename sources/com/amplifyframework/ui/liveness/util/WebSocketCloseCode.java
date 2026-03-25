package com.amplifyframework.ui.liveness.util;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class WebSocketCloseCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WebSocketCloseCode[] $VALUES;
    private final int code;
    public static final WebSocketCloseCode TIMEOUT = new WebSocketCloseCode("TIMEOUT", 0, MTAnalysisConstants.MainWhat.INIT);
    public static final WebSocketCloseCode CANCELED = new WebSocketCloseCode("CANCELED", 1, MTAnalysisConstants.MainWhat.ON_ACCOUNT);
    public static final WebSocketCloseCode RUNTIME_ERROR = new WebSocketCloseCode("RUNTIME_ERROR", 2, MTAnalysisConstants.MainWhat.ON_DRAW_DONE);
    public static final WebSocketCloseCode DISPOSED = new WebSocketCloseCode("DISPOSED", 3, 4008);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WebSocketCloseCode[] $values() {
        return new WebSocketCloseCode[]{TIMEOUT, CANCELED, RUNTIME_ERROR, DISPOSED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WebSocketCloseCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private WebSocketCloseCode(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        WebSocketCloseCode[] webSocketCloseCodeArr$values = $values();
        $VALUES = webSocketCloseCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(webSocketCloseCodeArr$values);
    }

    public static WebSocketCloseCode valueOf(String str) {
        return (WebSocketCloseCode) Enum.valueOf(WebSocketCloseCode.class, str);
    }

    public static WebSocketCloseCode[] values() {
        return (WebSocketCloseCode[]) $VALUES.clone();
    }
}
