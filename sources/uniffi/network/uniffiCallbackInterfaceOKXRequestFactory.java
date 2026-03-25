package uniffi.network;

import com.sun.jna.ptr.LongByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4343Bbn;
import o.C60173zxj;
import o.InterfaceC4267BaQ;
import o.InterfaceC4346Bbq;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfaceOkxRequestFactory;
import uniffi.network.uniffiCallbackInterfaceOKXRequestFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKXRequestFactory {
    public static final uniffiCallbackInterfaceOKXRequestFactory INSTANCE = new uniffiCallbackInterfaceOKXRequestFactory();
    public static UniffiVTableCallbackInterfaceOkxRequestFactory.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkxRequestFactory.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, create.INSTANCE, unifiedErrorMessage.INSTANCE);
    public static final int $stable = 8;

    public static final class create implements UniffiCallbackInterfaceOkxRequestFactoryMethod0 {
        public static final int $stable = 0;
        public static final create INSTANCE = new create();

        private create() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4346Bbq interfaceC4346BbqCopydefault = FfiConverterTypeOKXRequestFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKXRequestFactory.create.callback$lambda$0(interfaceC4346BbqCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKXRequestFactory.create.callback$lambda$1(longByReference, (InterfaceC4267BaQ) obj);
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
        public static final InterfaceC4267BaQ callback$lambda$0(InterfaceC4346Bbq interfaceC4346Bbq, RustBuffer.ByValue byValue) {
            return interfaceC4346Bbq.copydefault((C4343Bbn) FfiConverterTypeOKXHttpRequestOptions.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC4267BaQ interfaceC4267BaQ) {
            Intrinsics.checkNotNullParameter(interfaceC4267BaQ, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskResponseWithNetworkError.INSTANCE.lower2(interfaceC4267BaQ).longValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKXRequestFactory() {
    }

    public static final class unifiedErrorMessage implements UniffiCallbackInterfaceOkxRequestFactoryMethod1 {
        public static final int $stable = 0;
        public static final unifiedErrorMessage INSTANCE = new unifiedErrorMessage();

        private unifiedErrorMessage() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4346Bbq interfaceC4346BbqCopydefault = FfiConverterTypeOKXRequestFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bdy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4346BbqCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BdB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKXRequestFactory.unifiedErrorMessage.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C4298Bav.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
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
            FfiConverterTypeOKXRequestFactory.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKXRequestFactory.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_okxrequestfactory(vtable);
    }
}
