package com.okinc.business.defi.common.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class CloudBackupEventType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CloudBackupEventType[] $VALUES;
    private final String attrName;
    public static final CloudBackupEventType InitialWalletCloudBackup = new CloudBackupEventType("InitialWalletCloudBackup", 0, "Initial Wallet Cloud Backup");
    public static final CloudBackupEventType RegularWalletCloudBackup = new CloudBackupEventType("RegularWalletCloudBackup", 1, "Regular Wallet Cloud Backup");
    public static final CloudBackupEventType DeleteCloudBackupWallet = new CloudBackupEventType("DeleteCloudBackupWallet", 2, "Delete the Cloud Backup Wallet");
    public static final CloudBackupEventType RecoverCloudBackupWallet = new CloudBackupEventType("RecoverCloudBackupWallet", 3, "Recover the Cloud Backup Wallet");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CloudBackupEventType[] $values() {
        return new CloudBackupEventType[]{InitialWalletCloudBackup, RegularWalletCloudBackup, DeleteCloudBackupWallet, RecoverCloudBackupWallet};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CloudBackupEventType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttrName() {
        return this.attrName;
    }

    private CloudBackupEventType(String str, int i, String str2) {
        this.attrName = str2;
    }

    static {
        CloudBackupEventType[] cloudBackupEventTypeArr$values = $values();
        $VALUES = cloudBackupEventTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cloudBackupEventTypeArr$values);
    }

    public static CloudBackupEventType valueOf(String str) {
        return (CloudBackupEventType) Enum.valueOf(CloudBackupEventType.class, str);
    }

    public static CloudBackupEventType[] values() {
        return (CloudBackupEventType[]) $VALUES.clone();
    }
}
