package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultI16;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteI16 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultI16.UniffiByValue uniffiByValue);
}
