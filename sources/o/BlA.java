package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.retail_trading.FfiConverterTypeRetailTradingNativeApi;
import uniffi.retail_trading.IntegrityCheckingUniffiLib;
import uniffi.retail_trading.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class BlA {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Activity());

    public static final class Activity implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_retail_trading_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_retail_trading_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_retail_trading_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void registerRetailTradingGlobalNativeApi(@NotNull final InterfaceC4642Blq interfaceC4642Blq) {
        Intrinsics.checkNotNullParameter(interfaceC4642Blq, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BlA.registerRetailTradingGlobalNativeApi$lambda$0(interfaceC4642Blq, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerRetailTradingGlobalNativeApi$lambda$0(InterfaceC4642Blq interfaceC4642Blq, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_retail_trading_fn_func_register_retail_trading_global_native_api(FfiConverterTypeRetailTradingNativeApi.INSTANCE.lower2(interfaceC4642Blq).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
