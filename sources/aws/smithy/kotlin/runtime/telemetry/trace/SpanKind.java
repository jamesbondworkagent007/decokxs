package aws.smithy.kotlin.runtime.telemetry.trace;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class SpanKind {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SpanKind[] $VALUES;
    public static final SpanKind INTERNAL = new SpanKind("INTERNAL", 0);
    public static final SpanKind CLIENT = new SpanKind("CLIENT", 1);
    public static final SpanKind SERVER = new SpanKind("SERVER", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SpanKind[] $values() {
        return new SpanKind[]{INTERNAL, CLIENT, SERVER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SpanKind> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SpanKind valueOf(String str) {
        return (SpanKind) Enum.valueOf(SpanKind.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SpanKind[] values() {
        return (SpanKind[]) $VALUES.clone();
    }

    private SpanKind(String str, int i) {
    }

    static {
        SpanKind[] spanKindArr$values = $values();
        $VALUES = spanKindArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(spanKindArr$values);
    }
}
