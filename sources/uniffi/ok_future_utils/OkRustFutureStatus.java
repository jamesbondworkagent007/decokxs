package uniffi.ok_future_utils;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class OkRustFutureStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OkRustFutureStatus[] $VALUES;
    public static final OkRustFutureStatus NOT_READY = new OkRustFutureStatus("NOT_READY", 0);
    public static final OkRustFutureStatus SUCCESS = new OkRustFutureStatus("SUCCESS", 1);
    public static final OkRustFutureStatus FAILED = new OkRustFutureStatus(CardSyncResponse.FAILED, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OkRustFutureStatus[] $values() {
        return new OkRustFutureStatus[]{NOT_READY, SUCCESS, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OkRustFutureStatus> getEntries() {
        return $ENTRIES;
    }

    private OkRustFutureStatus(String str, int i) {
    }

    static {
        OkRustFutureStatus[] okRustFutureStatusArr$values = $values();
        $VALUES = okRustFutureStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(okRustFutureStatusArr$values);
    }

    public static OkRustFutureStatus valueOf(String str) {
        return (OkRustFutureStatus) Enum.valueOf(OkRustFutureStatus.class, str);
    }

    public static OkRustFutureStatus[] values() {
        return (OkRustFutureStatus[]) $VALUES.clone();
    }
}
