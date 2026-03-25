package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultF64;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteF64 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultF64.UniffiByValue uniffiByValue);
}
