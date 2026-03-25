package uniffi.settings;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceSettingsServiceForeignHandlingMethod0 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
