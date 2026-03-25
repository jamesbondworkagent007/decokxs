package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class WsListenerKind {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WsListenerKind[] $VALUES;
    public static final WsListenerKind NORMAL = new WsListenerKind("NORMAL", 0);
    public static final WsListenerKind SIMPLIFIED = new WsListenerKind("SIMPLIFIED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WsListenerKind[] $values() {
        return new WsListenerKind[]{NORMAL, SIMPLIFIED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WsListenerKind> getEntries() {
        return $ENTRIES;
    }

    private WsListenerKind(String str, int i) {
    }

    static {
        WsListenerKind[] wsListenerKindArr$values = $values();
        $VALUES = wsListenerKindArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(wsListenerKindArr$values);
    }

    public static WsListenerKind valueOf(String str) {
        return (WsListenerKind) Enum.valueOf(WsListenerKind.class, str);
    }

    public static WsListenerKind[] values() {
        return (WsListenerKind[]) $VALUES.clone();
    }
}
