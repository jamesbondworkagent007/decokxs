package uniffi.compliance;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiCallbackInterfaceIdScanCallbackMethod1 extends Callback {
    void callback(long j, float f, float f2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
