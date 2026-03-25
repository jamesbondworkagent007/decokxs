package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultI64;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteI64 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultI64.UniffiByValue uniffiByValue);
}
