package uniffi.buy_sell;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceBuySellFormatterMethod0 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, @NotNull RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
