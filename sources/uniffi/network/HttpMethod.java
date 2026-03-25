package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class HttpMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final HttpMethod GET = new HttpMethod("GET", 0);
    public static final HttpMethod POST = new HttpMethod("POST", 1);
    public static final HttpMethod PUT = new HttpMethod("PUT", 2);
    public static final HttpMethod PATCH = new HttpMethod("PATCH", 3);
    public static final HttpMethod DELETE = new HttpMethod("DELETE", 4);
    public static final HttpMethod HEAD = new HttpMethod("HEAD", 5);
    public static final HttpMethod OPTIONS = new HttpMethod("OPTIONS", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HttpMethod[] $values() {
        return new HttpMethod[]{GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HttpMethod> getEntries() {
        return $ENTRIES;
    }

    private HttpMethod(String str, int i) {
    }

    static {
        HttpMethod[] httpMethodArr$values = $values();
        $VALUES = httpMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(httpMethodArr$values);
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }
}
