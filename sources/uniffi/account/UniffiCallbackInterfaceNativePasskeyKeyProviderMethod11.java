package uniffi.account;

import com.sun.jna.Callback;
import com.sun.jna.ptr.ByteByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceNativePasskeyKeyProviderMethod11 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
