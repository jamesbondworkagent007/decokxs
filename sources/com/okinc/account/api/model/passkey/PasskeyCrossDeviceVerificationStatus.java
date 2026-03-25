package com.okinc.account.api.model.passkey;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyCrossDeviceVerificationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyCrossDeviceVerificationStatus[] $VALUES;
    public static final PasskeyCrossDeviceVerificationStatus FINISHED = new PasskeyCrossDeviceVerificationStatus("FINISHED", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyCrossDeviceVerificationStatus[] $values() {
        return new PasskeyCrossDeviceVerificationStatus[]{FINISHED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyCrossDeviceVerificationStatus> getEntries() {
        return $ENTRIES;
    }

    private PasskeyCrossDeviceVerificationStatus(String str, int i) {
    }

    static {
        PasskeyCrossDeviceVerificationStatus[] passkeyCrossDeviceVerificationStatusArr$values = $values();
        $VALUES = passkeyCrossDeviceVerificationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyCrossDeviceVerificationStatusArr$values);
    }

    public static PasskeyCrossDeviceVerificationStatus valueOf(String str) {
        return (PasskeyCrossDeviceVerificationStatus) Enum.valueOf(PasskeyCrossDeviceVerificationStatus.class, str);
    }

    public static PasskeyCrossDeviceVerificationStatus[] values() {
        return (PasskeyCrossDeviceVerificationStatus[]) $VALUES.clone();
    }
}
