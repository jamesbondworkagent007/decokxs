package uniffi.network;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 extends Callback {
    void callback(long j, int i, @NotNull RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
