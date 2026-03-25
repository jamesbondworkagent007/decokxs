package uniffi.localization;

import com.sun.jna.Callback;
import com.sun.jna.ptr.LongByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceLanguageFactoryMethod3 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
