package uniffi.lifecycle;

import com.sun.jna.Callback;
import com.sun.jna.ptr.LongByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceCoreLinkDependencyHelperMethod0 extends Callback {
    void callback(long j, byte b, @NotNull LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
