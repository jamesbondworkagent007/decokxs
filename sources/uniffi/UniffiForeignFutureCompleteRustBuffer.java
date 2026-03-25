package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public interface UniffiForeignFutureCompleteRustBuffer extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue);
}
