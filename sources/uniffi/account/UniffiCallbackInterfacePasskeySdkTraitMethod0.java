package uniffi.account;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfacePasskeySdkTraitMethod0 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
