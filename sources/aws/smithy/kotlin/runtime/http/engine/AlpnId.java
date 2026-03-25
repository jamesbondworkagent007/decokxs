package aws.smithy.kotlin.runtime.http.engine;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AlpnId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlpnId[] $VALUES;
    private final String protocolId;
    public static final AlpnId HTTP1_1 = new AlpnId("HTTP1_1", 0, "http/1.1");
    public static final AlpnId HTTP2 = new AlpnId("HTTP2", 1, "h2");
    public static final AlpnId H2_PRIOR_KNOWLEDGE = new AlpnId("H2_PRIOR_KNOWLEDGE", 2, "h2_prior_knowledge");
    public static final AlpnId HTTP3 = new AlpnId("HTTP3", 3, "h3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlpnId[] $values() {
        return new AlpnId[]{HTTP1_1, HTTP2, H2_PRIOR_KNOWLEDGE, HTTP3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlpnId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AlpnId valueOf(String str) {
        return (AlpnId) Enum.valueOf(AlpnId.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AlpnId[] values() {
        return (AlpnId[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolId() {
        return this.protocolId;
    }

    private AlpnId(String str, int i, String str2) {
        this.protocolId = str2;
    }

    static {
        AlpnId[] alpnIdArr$values = $values();
        $VALUES = alpnIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alpnIdArr$values);
    }
}
