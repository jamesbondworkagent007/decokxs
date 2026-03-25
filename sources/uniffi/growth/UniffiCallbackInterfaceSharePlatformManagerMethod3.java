package uniffi.growth;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceSharePlatformManagerMethod3 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
