package uniffi.analytics;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceAnalyticsInterfaceMethod1 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
