package uniffi.settings;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiForeignFutureCompleteI8;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceLanguageCoreBindingMethod0 extends Callback {
    void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
