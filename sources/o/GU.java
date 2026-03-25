package o;

import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface GU extends InterfaceC5137Gd {
    GT EZpvd();

    void KWHzl(@NotNull SpanStatus spanStatus);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    <T> void copydefault(@NotNull C57737yo<T> c57737yo, @NotNull T t);
}
