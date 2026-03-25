package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultU8;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteU8 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultU8.UniffiByValue uniffiByValue);
}
