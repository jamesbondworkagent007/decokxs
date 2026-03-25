package uniffi.network;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.LongByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C60173zxj;
import o.InterfaceC4274BaX;
import o.InterfaceC4310BbG;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfacePlatformDohManager;
import uniffi.network.uniffiCallbackInterfacePlatformDohManager;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePlatformDohManager {
    public static final uniffiCallbackInterfacePlatformDohManager INSTANCE = new uniffiCallbackInterfacePlatformDohManager();
    public static UniffiVTableCallbackInterfacePlatformDohManager.UniffiByValue vtable = new UniffiVTableCallbackInterfacePlatformDohManager.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, setCorDomain.INSTANCE, setH5CorDomain.INSTANCE, clearCorDomain.INSTANCE);
    public static final int $stable = 8;

    public static final class setCorDomain implements UniffiCallbackInterfacePlatformDohManagerMethod0 {
        public static final int $stable = 0;
        public static final setCorDomain INSTANCE = new setCorDomain();

        private setCorDomain() {
        }

        @Override // uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull final RustBuffer.ByValue byValue4, final long j2, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4310BbG interfaceC4310BbGCopydefault = FfiConverterTypePlatformDohManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BdL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePlatformDohManager.setCorDomain.callback$lambda$0(interfaceC4310BbGCopydefault, byValue, byValue2, byValue3, byValue4, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BdK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePlatformDohManager.setCorDomain.callback$lambda$1(longByReference, (InterfaceC4274BaX) obj);
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
        public static final InterfaceC4274BaX callback$lambda$0(InterfaceC4310BbG interfaceC4310BbG, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, long j) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC4310BbG.OLrzqt(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3), ffiConverterString.lift2(byValue4), FfiConverterULong.INSTANCE.m9557liftI7RO_PI(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC4274BaX interfaceC4274BaX) {
            Intrinsics.checkNotNullParameter(interfaceC4274BaX, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError.INSTANCE.lower2(interfaceC4274BaX).longValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePlatformDohManager() {
    }

    public static final class setH5CorDomain implements UniffiCallbackInterfacePlatformDohManagerMethod1 {
        public static final int $stable = 0;
        public static final setH5CorDomain INSTANCE = new setH5CorDomain();

        private setH5CorDomain() {
        }

        @Override // uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final long j2, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4310BbG interfaceC4310BbGCopydefault = FfiConverterTypePlatformDohManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BdJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePlatformDohManager.setH5CorDomain.callback$lambda$0(interfaceC4310BbGCopydefault, byValue, byValue2, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BdH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePlatformDohManager.setH5CorDomain.callback$lambda$1(longByReference, (InterfaceC4274BaX) obj);
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
        public static final InterfaceC4274BaX callback$lambda$0(InterfaceC4310BbG interfaceC4310BbG, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, long j) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC4310BbG.copydefault(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), FfiConverterULong.INSTANCE.m9557liftI7RO_PI(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, InterfaceC4274BaX interfaceC4274BaX) {
            Intrinsics.checkNotNullParameter(interfaceC4274BaX, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError.INSTANCE.lower2(interfaceC4274BaX).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class clearCorDomain implements UniffiCallbackInterfacePlatformDohManagerMethod2 {
        public static final int $stable = 0;
        public static final clearCorDomain INSTANCE = new clearCorDomain();

        private clearCorDomain() {
        }

        @Override // uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4310BbG interfaceC4310BbGCopydefault = FfiConverterTypePlatformDohManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BdG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePlatformDohManager.clearCorDomain.callback$lambda$0(interfaceC4310BbGCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BdI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePlatformDohManager.clearCorDomain.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4310BbG interfaceC4310BbG, RustBuffer.ByValue byValue) {
            interfaceC4310BbG.AEQbTJ(FfiConverterOptionalString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
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
            FfiConverterTypePlatformDohManager.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePlatformDohManager.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_platformdohmanager(vtable);
    }
}
