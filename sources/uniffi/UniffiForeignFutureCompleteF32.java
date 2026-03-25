package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultF32;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteF32 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultF32.UniffiByValue uniffiByValue);
}
