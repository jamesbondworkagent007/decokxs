package com.okinc.okassetslite.api.assets_lite_api.common.model;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class EventStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventStatus[] $VALUES;
    private final int status;
    public static final EventStatus PENDING = new EventStatus(CardSyncResponse.PENDING, 0, 1);
    public static final EventStatus COMPLETED = new EventStatus("COMPLETED", 1, 2);
    public static final EventStatus CANCELED = new EventStatus("CANCELED", 2, 3);
    public static final EventStatus FAILED = new EventStatus(CardSyncResponse.FAILED, 3, 4);
    public static final EventStatus EXPIRED = new EventStatus("EXPIRED", 4, 5);
    public static final EventStatus CANCELING = new EventStatus("CANCELING", 5, 6);
    public static final EventStatus INTERCEPTED = new EventStatus("INTERCEPTED", 6, 7);
    public static final EventStatus UNSUCCESSFUL = new EventStatus("UNSUCCESSFUL", 7, 8);
    public static final EventStatus ON_HOLD = new EventStatus("ON_HOLD", 8, 9);
    public static final EventStatus REVERSING = new EventStatus("REVERSING", 9, 10);
    public static final EventStatus REVERSED = new EventStatus("REVERSED", 10, 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventStatus[] $values() {
        return new EventStatus[]{PENDING, COMPLETED, CANCELED, FAILED, EXPIRED, CANCELING, INTERCEPTED, UNSUCCESSFUL, ON_HOLD, REVERSING, REVERSED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private EventStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        EventStatus[] eventStatusArr$values = $values();
        $VALUES = eventStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventStatusArr$values);
    }

    public static EventStatus valueOf(String str) {
        return (EventStatus) Enum.valueOf(EventStatus.class, str);
    }

    public static EventStatus[] values() {
        return (EventStatus[]) $VALUES.clone();
    }
}
