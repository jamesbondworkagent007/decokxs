package uniffi.upgrade;

import com.sun.jna.Callback;
import com.sun.jna.ptr.IntByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes14.dex */
public interface UniffiCallbackInterfaceUpgradeContextInterfaceMethod0 extends Callback {
    void callback(long j, @NotNull IntByReference intByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
