package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultU32;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteU32 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultU32.UniffiByValue uniffiByValue);
}
