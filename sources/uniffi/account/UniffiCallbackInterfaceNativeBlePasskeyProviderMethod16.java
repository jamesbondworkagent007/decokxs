package uniffi.account;

import com.sun.jna.Callback;
import com.sun.jna.ptr.IntByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceNativeBlePasskeyProviderMethod16 extends Callback {
    void callback(long j, @NotNull IntByReference intByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
