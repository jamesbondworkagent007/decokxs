package uniffi.compliance;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiCallbackInterfaceIdScanCallbackMethod4 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
