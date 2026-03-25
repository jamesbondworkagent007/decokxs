package uniffi.settings;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiForeignFutureCompleteVoid;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod15 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
