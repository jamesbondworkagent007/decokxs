package uniffi.shared_preference;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceSharedPreferencesInterfaceMethod9 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, double d, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
