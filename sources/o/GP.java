package o;

import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GP implements GU {
    public static final GP AEQbTJ = new GP();
    public static final GT KWHzl = GT.KWHzl.OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.GU
    public GT EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.GU
    public void KWHzl(@NotNull SpanStatus spanStatus) {
        Intrinsics.checkNotNullParameter(spanStatus, "");
    }

    @Override // o.GU, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.GU
    public <T> void copydefault(@NotNull C57737yo<T> c57737yo, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(t, "");
    }

    private GP() {
    }
}
