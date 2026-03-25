package uniffi.upgrade;

import com.sun.jna.Callback;
import com.sun.jna.ptr.LongByReference;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes14.dex */
public interface UniffiCallbackInterfaceOkUserFactoryMethod0 extends Callback {
    void callback(long j, @NotNull LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
