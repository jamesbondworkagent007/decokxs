package com.okinc.business.defi.biz.net.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MpcStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MpcStatus[] $VALUES;
    private final int value;
    public static final MpcStatus Init = new MpcStatus("Init", 0, 0);
    public static final MpcStatus WalletCreated = new MpcStatus("WalletCreated", 1, 1);
    public static final MpcStatus Backuped = new MpcStatus("Backuped", 2, 2);
    public static final MpcStatus Refreshed = new MpcStatus("Refreshed", 3, 3);
    public static final MpcStatus Escape = new MpcStatus("Escape", 4, 4);
    public static final MpcStatus BackupedFail = new MpcStatus("BackupedFail", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MpcStatus[] $values() {
        return new MpcStatus[]{Init, WalletCreated, Backuped, Refreshed, Escape, BackupedFail};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MpcStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MpcStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MpcStatus[] mpcStatusArr$values = $values();
        $VALUES = mpcStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mpcStatusArr$values);
    }

    public static MpcStatus valueOf(String str) {
        return (MpcStatus) Enum.valueOf(MpcStatus.class, str);
    }

    public static MpcStatus[] values() {
        return (MpcStatus[]) $VALUES.clone();
    }
}
