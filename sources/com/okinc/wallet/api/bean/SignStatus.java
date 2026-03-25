package com.okinc.wallet.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class SignStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignStatus[] $VALUES;
    public static final SignStatus Success = new SignStatus("Success", 0);
    public static final SignStatus SignDataEmpty = new SignStatus("SignDataEmpty", 1);
    public static final SignStatus AccountNotExist = new SignStatus("AccountNotExist", 2);
    public static final SignStatus AccountNotSupport = new SignStatus("AccountNotSupport", 3);
    public static final SignStatus AccountNotBackup = new SignStatus("AccountNotBackup", 4);
    public static final SignStatus UserCancel = new SignStatus("UserCancel", 5);
    public static final SignStatus SyncFailed = new SignStatus("SyncFailed", 6);
    public static final SignStatus OtherError = new SignStatus("OtherError", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignStatus[] $values() {
        return new SignStatus[]{Success, SignDataEmpty, AccountNotExist, AccountNotSupport, AccountNotBackup, UserCancel, SyncFailed, OtherError};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignStatus> getEntries() {
        return $ENTRIES;
    }

    private SignStatus(String str, int i) {
    }

    static {
        SignStatus[] signStatusArr$values = $values();
        $VALUES = signStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signStatusArr$values);
    }

    public static SignStatus valueOf(String str) {
        return (SignStatus) Enum.valueOf(SignStatus.class, str);
    }

    public static SignStatus[] values() {
        return (SignStatus[]) $VALUES.clone();
    }
}
