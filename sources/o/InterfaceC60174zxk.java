package o;

import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: renamed from: o.zxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC60174zxk {
    RustBuffer.ByValue alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
