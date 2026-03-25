package com.okinc.business.defi.wallet.hardware.onekey;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class HardwareWalletOneKeyPairingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HardwareWalletOneKeyPairingType[] $VALUES;
    public static final HardwareWalletOneKeyPairingType OneKeyUnlocking = new HardwareWalletOneKeyPairingType("OneKeyUnlocking", 0);
    public static final HardwareWalletOneKeyPairingType OneKeyPassphrase = new HardwareWalletOneKeyPairingType("OneKeyPassphrase", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HardwareWalletOneKeyPairingType[] $values() {
        return new HardwareWalletOneKeyPairingType[]{OneKeyUnlocking, OneKeyPassphrase};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HardwareWalletOneKeyPairingType> getEntries() {
        return $ENTRIES;
    }

    private HardwareWalletOneKeyPairingType(String str, int i) {
    }

    static {
        HardwareWalletOneKeyPairingType[] hardwareWalletOneKeyPairingTypeArr$values = $values();
        $VALUES = hardwareWalletOneKeyPairingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hardwareWalletOneKeyPairingTypeArr$values);
    }

    public static HardwareWalletOneKeyPairingType valueOf(String str) {
        return (HardwareWalletOneKeyPairingType) Enum.valueOf(HardwareWalletOneKeyPairingType.class, str);
    }

    public static HardwareWalletOneKeyPairingType[] values() {
        return (HardwareWalletOneKeyPairingType[]) $VALUES.clone();
    }
}
