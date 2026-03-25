package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultI32;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteI32 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultI32.UniffiByValue uniffiByValue);
}
