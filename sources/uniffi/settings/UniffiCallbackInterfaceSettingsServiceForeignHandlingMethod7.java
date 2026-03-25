package uniffi.settings;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod7 extends Callback {
    void callback(long j, @NotNull RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
