package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class WsConnectionState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WsConnectionState[] $VALUES;
    public static final WsConnectionState OPEN = new WsConnectionState("OPEN", 0);
    public static final WsConnectionState CLOSED = new WsConnectionState("CLOSED", 1);
    public static final WsConnectionState FAILURE = new WsConnectionState("FAILURE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WsConnectionState[] $values() {
        return new WsConnectionState[]{OPEN, CLOSED, FAILURE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WsConnectionState> getEntries() {
        return $ENTRIES;
    }

    private WsConnectionState(String str, int i) {
    }

    static {
        WsConnectionState[] wsConnectionStateArr$values = $values();
        $VALUES = wsConnectionStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(wsConnectionStateArr$values);
    }

    public static WsConnectionState valueOf(String str) {
        return (WsConnectionState) Enum.valueOf(WsConnectionState.class, str);
    }

    public static WsConnectionState[] values() {
        return (WsConnectionState[]) $VALUES.clone();
    }
}
