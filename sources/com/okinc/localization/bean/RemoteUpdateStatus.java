package com.okinc.localization.bean;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class RemoteUpdateStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RemoteUpdateStatus[] $VALUES;
    public static final RemoteUpdateStatus LOADING = new RemoteUpdateStatus("LOADING", 0);
    public static final RemoteUpdateStatus FAILED = new RemoteUpdateStatus(CardSyncResponse.FAILED, 1);
    public static final RemoteUpdateStatus LATEST = new RemoteUpdateStatus("LATEST", 2);
    public static final RemoteUpdateStatus UPDATED = new RemoteUpdateStatus("UPDATED", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RemoteUpdateStatus[] $values() {
        return new RemoteUpdateStatus[]{LOADING, FAILED, LATEST, UPDATED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RemoteUpdateStatus> getEntries() {
        return $ENTRIES;
    }

    private RemoteUpdateStatus(String str, int i) {
    }

    static {
        RemoteUpdateStatus[] remoteUpdateStatusArr$values = $values();
        $VALUES = remoteUpdateStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(remoteUpdateStatusArr$values);
    }

    public static RemoteUpdateStatus valueOf(String str) {
        return (RemoteUpdateStatus) Enum.valueOf(RemoteUpdateStatus.class, str);
    }

    public static RemoteUpdateStatus[] values() {
        return (RemoteUpdateStatus[]) $VALUES.clone();
    }
}
