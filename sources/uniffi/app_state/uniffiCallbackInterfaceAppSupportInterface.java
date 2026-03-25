package uniffi.app_state;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3567AoQ;
import o.C60173zxj;
import o.InterfaceC3563AoM;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.app_state.AppState;
import uniffi.app_state.UniffiVTableCallbackInterfaceAppSupportInterface;
import uniffi.app_state.uniffiCallbackInterfaceAppSupportInterface;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceAppSupportInterface {
    public static final uniffiCallbackInterfaceAppSupportInterface INSTANCE = new uniffiCallbackInterfaceAppSupportInterface();
    public static UniffiVTableCallbackInterfaceAppSupportInterface.UniffiByValue vtable = new UniffiVTableCallbackInterfaceAppSupportInterface.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getCurrentState.INSTANCE);
    public static final int $stable = 8;

    public static final class getCurrentState implements UniffiCallbackInterfaceAppSupportInterfaceMethod0 {
        public static final int $stable = 0;
        public static final getCurrentState INSTANCE = new getCurrentState();

        private getCurrentState() {
        }

        @Override // uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3563AoM interfaceC3563AoMCopydefault = FfiConverterTypeAppSupportInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Apd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC3563AoMCopydefault.KWHzl();
                }
            };
            Function1 function1 = new Function1() { // from class: o.Apc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAppSupportInterface.getCurrentState.callback$lambda$1(rustBuffer, (AppState) obj);
                }
            };
            RustBuffer rustBuffer2 = C3567AoQ.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, AppState appState) {
            Intrinsics.checkNotNullParameter(appState, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeAppState.INSTANCE.lower2((Object) appState));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceAppSupportInterface() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeAppSupportInterface.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeAppSupportInterface.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_app_state_fn_init_callback_vtable_appsupportinterface(vtable);
    }
}
