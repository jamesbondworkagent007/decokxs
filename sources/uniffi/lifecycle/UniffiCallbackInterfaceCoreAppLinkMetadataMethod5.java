package uniffi.lifecycle;

import com.sun.jna.Callback;
import com.sun.jna.ptr.ByteByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceCoreAppLinkMetadataMethod5 extends Callback {
    void callback(long j, @NotNull ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
