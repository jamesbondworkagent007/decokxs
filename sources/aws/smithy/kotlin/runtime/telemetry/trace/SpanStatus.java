package aws.smithy.kotlin.runtime.telemetry.trace;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class SpanStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SpanStatus[] $VALUES;
    public static final SpanStatus UNSET = new SpanStatus("UNSET", 0);
    public static final SpanStatus OK = new SpanStatus("OK", 1);
    public static final SpanStatus ERROR = new SpanStatus(EventType.ERROR, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SpanStatus[] $values() {
        return new SpanStatus[]{UNSET, OK, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SpanStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SpanStatus valueOf(String str) {
        return (SpanStatus) Enum.valueOf(SpanStatus.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SpanStatus[] values() {
        return (SpanStatus[]) $VALUES.clone();
    }

    private SpanStatus(String str, int i) {
    }

    static {
        SpanStatus[] spanStatusArr$values = $values();
        $VALUES = spanStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(spanStatusArr$values);
    }
}
