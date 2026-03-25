package uniffi;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureResultVoid;

/* JADX INFO: loaded from: classes17.dex */
public interface UniffiForeignFutureCompleteVoid extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue);
}
