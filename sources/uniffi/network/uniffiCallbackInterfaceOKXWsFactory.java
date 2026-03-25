package uniffi.network;

import com.sun.jna.ptr.LongByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AZX;
import o.C4298Bav;
import o.C4367BcK;
import o.C60173zxj;
import o.InterfaceC4354Bby;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfaceOkxWsFactory;
import uniffi.network.uniffiCallbackInterfaceOKXWsFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKXWsFactory {
    public static final uniffiCallbackInterfaceOKXWsFactory INSTANCE = new uniffiCallbackInterfaceOKXWsFactory();
    public static UniffiVTableCallbackInterfaceOkxWsFactory.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkxWsFactory.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, createConnection.INSTANCE, createSimplifiedConnection.INSTANCE);
    public static final int $stable = 8;

    public static final class createConnection implements UniffiCallbackInterfaceOkxWsFactoryMethod0 {
        public static final int $stable = 0;
        public static final createConnection INSTANCE = new createConnection();

        private createConnection() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, final long j2, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4354Bby interfaceC4354BbyCopydefault = FfiConverterTypeOKXWsFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BdC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKXWsFactory.createConnection.callback$lambda$0(interfaceC4354BbyCopydefault, byValue, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BdE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKXWsFactory.createConnection.callback$lambda$1(longByReference, (AZX) obj);
                }
            };
            RustBuffer rustBuffer = C4298Bav.uniffiRustBuffer;
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
        public static final AZX callback$lambda$0(InterfaceC4354Bby interfaceC4354Bby, RustBuffer.ByValue byValue, long j) {
            return interfaceC4354Bby.EZpvd((C4367BcK) FfiConverterTypeWsStaticConnectionConfig.INSTANCE.lift2(byValue), FfiConverterTypeWsConfigProvider.INSTANCE.lift(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, AZX azx) {
            Intrinsics.checkNotNullParameter(azx, "");
            longByReference.setValue(FfiConverterTypeNativeWsConnection.INSTANCE.lower2(azx).longValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKXWsFactory() {
    }

    public static final class createSimplifiedConnection implements UniffiCallbackInterfaceOkxWsFactoryMethod1 {
        public static final int $stable = 0;
        public static final createSimplifiedConnection INSTANCE = new createSimplifiedConnection();

        private createSimplifiedConnection() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, final long j2, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4354Bby interfaceC4354BbyCopydefault = FfiConverterTypeOKXWsFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BdD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKXWsFactory.createSimplifiedConnection.callback$lambda$0(interfaceC4354BbyCopydefault, byValue, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BdF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKXWsFactory.createSimplifiedConnection.callback$lambda$1(longByReference, (AZX) obj);
                }
            };
            RustBuffer rustBuffer = C4298Bav.uniffiRustBuffer;
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
        public static final AZX callback$lambda$0(InterfaceC4354Bby interfaceC4354Bby, RustBuffer.ByValue byValue, long j) {
            return interfaceC4354Bby.AEQbTJ((C4367BcK) FfiConverterTypeWsStaticConnectionConfig.INSTANCE.lift2(byValue), FfiConverterTypeWsConfigProvider.INSTANCE.lift(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, AZX azx) {
            Intrinsics.checkNotNullParameter(azx, "");
            longByReference.setValue(FfiConverterTypeNativeWsConnection.INSTANCE.lower2(azx).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeOKXWsFactory.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKXWsFactory.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_okxwsfactory(vtable);
    }
}
