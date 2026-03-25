package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultI8;

/* JADX INFO: loaded from: classes17.dex */
public interface UniffiForeignFutureCompleteI8 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultI8.UniffiByValue uniffiByValue);
}
