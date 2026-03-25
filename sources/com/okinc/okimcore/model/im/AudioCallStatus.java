package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AudioCallStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AudioCallStatus[] $VALUES;
    public static final AudioCallStatus Idle = new AudioCallStatus("Idle", 0);
    public static final AudioCallStatus CallOutGoing = new AudioCallStatus("CallOutGoing", 1);
    public static final AudioCallStatus CallInComing = new AudioCallStatus("CallInComing", 2);
    public static final AudioCallStatus OnCallOut = new AudioCallStatus("OnCallOut", 3);
    public static final AudioCallStatus OnCallIn = new AudioCallStatus("OnCallIn", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AudioCallStatus[] $values() {
        return new AudioCallStatus[]{Idle, CallOutGoing, CallInComing, OnCallOut, OnCallIn};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AudioCallStatus> getEntries() {
        return $ENTRIES;
    }

    private AudioCallStatus(String str, int i) {
    }

    static {
        AudioCallStatus[] audioCallStatusArr$values = $values();
        $VALUES = audioCallStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(audioCallStatusArr$values);
    }

    public static AudioCallStatus valueOf(String str) {
        return (AudioCallStatus) Enum.valueOf(AudioCallStatus.class, str);
    }

    public static AudioCallStatus[] values() {
        return (AudioCallStatus[]) $VALUES.clone();
    }
}
