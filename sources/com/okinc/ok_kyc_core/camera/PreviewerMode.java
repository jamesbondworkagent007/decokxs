package com.okinc.ok_kyc_core.camera;

import com.just.agentweb.AgentWebPermissions;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PreviewerMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreviewerMode[] $VALUES;
    public static final PreviewerMode Camera = new PreviewerMode(AgentWebPermissions.ACTION_CAMERA, 0);
    public static final PreviewerMode Gallery = new PreviewerMode("Gallery", 1);
    public static final PreviewerMode DirectShow = new PreviewerMode("DirectShow", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreviewerMode[] $values() {
        return new PreviewerMode[]{Camera, Gallery, DirectShow};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreviewerMode> getEntries() {
        return $ENTRIES;
    }

    private PreviewerMode(String str, int i) {
    }

    static {
        PreviewerMode[] previewerModeArr$values = $values();
        $VALUES = previewerModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(previewerModeArr$values);
    }

    public static PreviewerMode valueOf(String str) {
        return (PreviewerMode) Enum.valueOf(PreviewerMode.class, str);
    }

    public static PreviewerMode[] values() {
        return (PreviewerMode[]) $VALUES.clone();
    }
}
