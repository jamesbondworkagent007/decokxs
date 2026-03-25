package com.okinc.wallet.hardware.api.onekey;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyAuthStage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OneKeyAuthStage[] $VALUES;
    public static final OneKeyAuthStage WAIT_FOR_PIN = new OneKeyAuthStage("WAIT_FOR_PIN", 0);
    public static final OneKeyAuthStage WAIT_FOR_BUTTON_CLICK = new OneKeyAuthStage("WAIT_FOR_BUTTON_CLICK", 1);
    public static final OneKeyAuthStage WAIT_FOR_PASSPHRASE = new OneKeyAuthStage("WAIT_FOR_PASSPHRASE", 2);
    public static final OneKeyAuthStage CLOSE_WINDOW = new OneKeyAuthStage("CLOSE_WINDOW", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OneKeyAuthStage[] $values() {
        return new OneKeyAuthStage[]{WAIT_FOR_PIN, WAIT_FOR_BUTTON_CLICK, WAIT_FOR_PASSPHRASE, CLOSE_WINDOW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OneKeyAuthStage> getEntries() {
        return $ENTRIES;
    }

    private OneKeyAuthStage(String str, int i) {
    }

    static {
        OneKeyAuthStage[] oneKeyAuthStageArr$values = $values();
        $VALUES = oneKeyAuthStageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oneKeyAuthStageArr$values);
    }

    public static OneKeyAuthStage valueOf(String str) {
        return (OneKeyAuthStage) Enum.valueOf(OneKeyAuthStage.class, str);
    }

    public static OneKeyAuthStage[] values() {
        return (OneKeyAuthStage[]) $VALUES.clone();
    }
}
