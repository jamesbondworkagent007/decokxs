package uniffi.retail_trading;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceDexListUpdateCallbackMethod2 extends Callback {
    void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
