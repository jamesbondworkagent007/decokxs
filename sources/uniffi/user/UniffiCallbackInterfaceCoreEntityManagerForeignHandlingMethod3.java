package uniffi.user;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes14.dex */
public interface UniffiCallbackInterfaceCoreEntityManagerForeignHandlingMethod3 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
