package com.okinc.im.camera;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class OKIMCaptureMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKIMCaptureMode[] $VALUES;
    public static final OKIMCaptureMode CAPTURE_ONLY = new OKIMCaptureMode("CAPTURE_ONLY", 0);
    public static final OKIMCaptureMode RECORD_ONLY = new OKIMCaptureMode("RECORD_ONLY", 1);
    public static final OKIMCaptureMode BOTH = new OKIMCaptureMode("BOTH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKIMCaptureMode[] $values() {
        return new OKIMCaptureMode[]{CAPTURE_ONLY, RECORD_ONLY, BOTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKIMCaptureMode> getEntries() {
        return $ENTRIES;
    }

    private OKIMCaptureMode(String str, int i) {
    }

    static {
        OKIMCaptureMode[] oKIMCaptureModeArr$values = $values();
        $VALUES = oKIMCaptureModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKIMCaptureModeArr$values);
    }

    public static OKIMCaptureMode valueOf(String str) {
        return (OKIMCaptureMode) Enum.valueOf(OKIMCaptureMode.class, str);
    }

    public static OKIMCaptureMode[] values() {
        return (OKIMCaptureMode[]) $VALUES.clone();
    }
}
