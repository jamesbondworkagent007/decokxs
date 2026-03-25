package uniffi.buy_sell;

import com.sun.jna.Callback;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod5 extends Callback {
    void callback(long j, byte b, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
