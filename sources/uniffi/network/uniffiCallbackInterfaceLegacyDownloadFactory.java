package uniffi.network;

import com.sun.jna.ptr.LongByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AZC;
import o.AZE;
import o.C4298Bav;
import o.C60173zxj;
import o.InterfaceC2800AZs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadFactory;
import uniffi.network.uniffiCallbackInterfaceLegacyDownloadFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLegacyDownloadFactory {
    public static final uniffiCallbackInterfaceLegacyDownloadFactory INSTANCE = new uniffiCallbackInterfaceLegacyDownloadFactory();
    public static UniffiVTableCallbackInterfaceLegacyDownloadFactory.UniffiByValue vtable = new UniffiVTableCallbackInterfaceLegacyDownloadFactory.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, create.INSTANCE);
    public static final int $stable = 8;

    public static final class create implements UniffiCallbackInterfaceLegacyDownloadFactoryMethod0 {
        public static final int $stable = 0;
        public static final create INSTANCE = new create();

        private create() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceLegacyDownloadFactoryMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2800AZs interfaceC2800AZsCopydefault = FfiConverterTypeLegacyDownloadFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BcU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLegacyDownloadFactory.create.callback$lambda$0(interfaceC2800AZsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BcW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLegacyDownloadFactory.create.callback$lambda$1(longByReference, (AZE) obj);
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
        public static final AZE callback$lambda$0(InterfaceC2800AZs interfaceC2800AZs, RustBuffer.ByValue byValue) {
            return interfaceC2800AZs.KWHzl((AZC) FfiConverterTypeLegacyDownloadOptions.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, AZE aze) {
            Intrinsics.checkNotNullParameter(aze, "");
            longByReference.setValue(FfiConverterTypeLegacyDownloadTask.INSTANCE.lower2(aze).longValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceLegacyDownloadFactory() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeLegacyDownloadFactory.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeLegacyDownloadFactory.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_legacydownloadfactory(vtable);
    }
}
