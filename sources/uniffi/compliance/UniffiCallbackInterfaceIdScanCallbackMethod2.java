package uniffi.compliance;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiCallbackInterfaceIdScanCallbackMethod2 extends Callback {
    void callback(long j, int i, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
