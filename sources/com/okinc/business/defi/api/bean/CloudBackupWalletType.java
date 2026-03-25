package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CloudBackupWalletType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CloudBackupWalletType[] $VALUES;
    public static final CloudBackupWalletType HD = new CloudBackupWalletType("HD", 0, "normal");
    public static final CloudBackupWalletType TON = new CloudBackupWalletType("TON", 1, "ton");
    private final String attrName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CloudBackupWalletType[] $values() {
        return new CloudBackupWalletType[]{HD, TON};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CloudBackupWalletType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttrName() {
        return this.attrName;
    }

    private CloudBackupWalletType(String str, int i, String str2) {
        this.attrName = str2;
    }

    static {
        CloudBackupWalletType[] cloudBackupWalletTypeArr$values = $values();
        $VALUES = cloudBackupWalletTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cloudBackupWalletTypeArr$values);
    }

    public static CloudBackupWalletType valueOf(String str) {
        return (CloudBackupWalletType) Enum.valueOf(CloudBackupWalletType.class, str);
    }

    public static CloudBackupWalletType[] values() {
        return (CloudBackupWalletType[]) $VALUES.clone();
    }
}
