package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultU16;

/* JADX INFO: loaded from: classes25.dex */
public interface UniffiForeignFutureCompleteU16 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultU16.UniffiByValue uniffiByValue);
}
