package uniffi.account;

import com.sun.jna.Callback;
import com.sun.jna.ptr.ByteByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 extends Callback {
    void callback(long j, @NotNull ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
