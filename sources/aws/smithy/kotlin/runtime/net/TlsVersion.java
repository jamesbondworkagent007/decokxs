package aws.smithy.kotlin.runtime.net;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TlsVersion {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TlsVersion[] $VALUES;
    public static final TlsVersion TLS_1_0 = new TlsVersion("TLS_1_0", 0);
    public static final TlsVersion TLS_1_1 = new TlsVersion("TLS_1_1", 1);
    public static final TlsVersion TLS_1_2 = new TlsVersion("TLS_1_2", 2);
    public static final TlsVersion TLS_1_3 = new TlsVersion("TLS_1_3", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TlsVersion[] $values() {
        return new TlsVersion[]{TLS_1_0, TLS_1_1, TLS_1_2, TLS_1_3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TlsVersion> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TlsVersion[] values() {
        return (TlsVersion[]) $VALUES.clone();
    }

    private TlsVersion(String str, int i) {
    }

    static {
        TlsVersion[] tlsVersionArr$values = $values();
        $VALUES = tlsVersionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tlsVersionArr$values);
    }
}
