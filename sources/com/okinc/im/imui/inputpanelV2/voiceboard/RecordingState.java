package com.okinc.im.imui.inputpanelV2.voiceboard;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class RecordingState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecordingState[] $VALUES;
    public static final RecordingState IDLE = new RecordingState("IDLE", 0);
    public static final RecordingState RECORDING = new RecordingState("RECORDING", 1);
    public static final RecordingState CANCELED = new RecordingState("CANCELED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecordingState[] $values() {
        return new RecordingState[]{IDLE, RECORDING, CANCELED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecordingState> getEntries() {
        return $ENTRIES;
    }

    private RecordingState(String str, int i) {
    }

    static {
        RecordingState[] recordingStateArr$values = $values();
        $VALUES = recordingStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recordingStateArr$values);
    }

    public static RecordingState valueOf(String str) {
        return (RecordingState) Enum.valueOf(RecordingState.class, str);
    }

    public static RecordingState[] values() {
        return (RecordingState[]) $VALUES.clone();
    }
}
