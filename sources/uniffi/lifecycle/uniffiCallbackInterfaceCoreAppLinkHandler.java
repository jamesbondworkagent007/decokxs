package uniffi.lifecycle;

import com.sun.jna.Pointer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C2692AVo;
import o.C60173zxj;
import o.InterfaceC2599ARy;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkHandler;
import uniffi.lifecycle.uniffiCallbackInterfaceCoreAppLinkHandler;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceCoreAppLinkHandler {
    public static final uniffiCallbackInterfaceCoreAppLinkHandler INSTANCE = new uniffiCallbackInterfaceCoreAppLinkHandler();
    public static UniffiVTableCallbackInterfaceCoreAppLinkHandler.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreAppLinkHandler.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, execute.INSTANCE);
    public static final int $stable = 8;

    public static final class execute implements UniffiCallbackInterfaceCoreAppLinkHandlerMethod0 {
        public static final int $stable = 0;
        public static final execute INSTANCE = new execute();

        private execute() {
        }

        @Override // uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkHandlerMethod0
        public void callback(long j, final long j2, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2599ARy interfaceC2599ARyCopydefault = FfiConverterTypeCoreAppLinkHandler.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AWD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreAppLinkHandler.execute.callback$lambda$0(interfaceC2599ARyCopydefault, j2, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AWE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreAppLinkHandler.execute.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C2692AVo.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC2599ARy interfaceC2599ARy, long j, RustBuffer.ByValue byValue) {
            interfaceC2599ARy.EZpvd(FfiConverterTypeCoreAppLinkMetadata.INSTANCE.lift(j), (Map) FfiConverterMapStringString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreAppLinkHandler() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeCoreAppLinkHandler.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreAppLinkHandler.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_lifecycle_fn_init_callback_vtable_coreapplinkhandler(vtable);
    }
}
