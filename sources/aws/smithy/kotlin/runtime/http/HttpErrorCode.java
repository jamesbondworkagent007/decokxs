package aws.smithy.kotlin.runtime.http;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpErrorCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HttpErrorCode[] $VALUES;
    public static final HttpErrorCode CONNECT_TIMEOUT = new HttpErrorCode("CONNECT_TIMEOUT", 0);
    public static final HttpErrorCode CONNECTION_ACQUIRE_TIMEOUT = new HttpErrorCode("CONNECTION_ACQUIRE_TIMEOUT", 1);
    public static final HttpErrorCode TLS_NEGOTIATION_TIMEOUT = new HttpErrorCode("TLS_NEGOTIATION_TIMEOUT", 2);
    public static final HttpErrorCode TLS_NEGOTIATION_ERROR = new HttpErrorCode("TLS_NEGOTIATION_ERROR", 3);
    public static final HttpErrorCode CONNECTION_CLOSED = new HttpErrorCode("CONNECTION_CLOSED", 4);
    public static final HttpErrorCode SOCKET_TIMEOUT = new HttpErrorCode("SOCKET_TIMEOUT", 5);
    public static final HttpErrorCode PROTOCOL_NEGOTIATION_ERROR = new HttpErrorCode("PROTOCOL_NEGOTIATION_ERROR", 6);
    public static final HttpErrorCode SDK_UNKNOWN = new HttpErrorCode("SDK_UNKNOWN", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HttpErrorCode[] $values() {
        return new HttpErrorCode[]{CONNECT_TIMEOUT, CONNECTION_ACQUIRE_TIMEOUT, TLS_NEGOTIATION_TIMEOUT, TLS_NEGOTIATION_ERROR, CONNECTION_CLOSED, SOCKET_TIMEOUT, PROTOCOL_NEGOTIATION_ERROR, SDK_UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HttpErrorCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static HttpErrorCode valueOf(String str) {
        return (HttpErrorCode) Enum.valueOf(HttpErrorCode.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static HttpErrorCode[] values() {
        return (HttpErrorCode[]) $VALUES.clone();
    }

    private HttpErrorCode(String str, int i) {
    }

    static {
        HttpErrorCode[] httpErrorCodeArr$values = $values();
        $VALUES = httpErrorCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(httpErrorCodeArr$values);
    }
}
