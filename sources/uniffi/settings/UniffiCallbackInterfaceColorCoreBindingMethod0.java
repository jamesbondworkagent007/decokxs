package uniffi.settings;

import com.sun.jna.Callback;
import com.sun.jna.ptr.ByteByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceColorCoreBindingMethod0 extends Callback {
    void callback(long j, int i, @NotNull ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
