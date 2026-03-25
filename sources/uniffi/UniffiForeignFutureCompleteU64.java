package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultU64;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteU64 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultU64.UniffiByValue uniffiByValue);
}
