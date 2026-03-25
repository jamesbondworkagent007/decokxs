package uniffi.account;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiForeignFutureCompleteVoid;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceNativePasskeyKeyProviderMethod3 extends Callback {
    void callback(long j, @NotNull UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct);
}
