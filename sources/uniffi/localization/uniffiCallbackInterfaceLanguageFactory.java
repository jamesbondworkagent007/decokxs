package uniffi.localization;

import com.sun.jna.ptr.LongByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AYE;
import o.C2757AYb;
import o.C2775AYt;
import o.C60173zxj;
import o.InterfaceC2760AYe;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.localization.UniffiVTableCallbackInterfaceLanguageFactory;
import uniffi.localization.uniffiCallbackInterfaceLanguageFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLanguageFactory {
    public static final uniffiCallbackInterfaceLanguageFactory INSTANCE = new uniffiCallbackInterfaceLanguageFactory();
    public static UniffiVTableCallbackInterfaceLanguageFactory.UniffiByValue vtable = new UniffiVTableCallbackInterfaceLanguageFactory.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getAppLanguage.INSTANCE, getSystemLanguageIfNecessaryForFallback.INSTANCE, createLanguageListFromLocalTask.INSTANCE, createLanguageListFromRemoteTask.INSTANCE);
    public static final int $stable = 8;

    public static final class getAppLanguage implements UniffiCallbackInterfaceLanguageFactoryMethod0 {
        public static final int $stable = 0;
        public static final getAppLanguage INSTANCE = new getAppLanguage();

        private getAppLanguage() {
        }

        @Override // uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2760AYe interfaceC2760AYeCopydefault = FfiConverterTypeLanguageFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AYY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC2760AYeCopydefault.EZpvd();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AYW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLanguageFactory.getAppLanguage.callback$lambda$1(rustBuffer, (C2757AYb) obj);
                }
            };
            RustBuffer rustBuffer2 = C2775AYt.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, C2757AYb c2757AYb) {
            Intrinsics.checkNotNullParameter(c2757AYb, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeAppLanguageInfo.INSTANCE.lower2((Object) c2757AYb));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceLanguageFactory() {
    }

    public static final class getSystemLanguageIfNecessaryForFallback implements UniffiCallbackInterfaceLanguageFactoryMethod1 {
        public static final int $stable = 0;
        public static final getSystemLanguageIfNecessaryForFallback INSTANCE = new getSystemLanguageIfNecessaryForFallback();

        private getSystemLanguageIfNecessaryForFallback() {
        }

        @Override // uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod1
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2760AYe interfaceC2760AYeCopydefault = FfiConverterTypeLanguageFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AYZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC2760AYeCopydefault.AhwBna();
                }
            };
            Function1 function1 = new Function1() { // from class: o.AZa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLanguageFactory.getSystemLanguageIfNecessaryForFallback.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C2775AYt.uniffiRustBuffer;
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
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class createLanguageListFromLocalTask implements UniffiCallbackInterfaceLanguageFactoryMethod2 {
        public static final int $stable = 0;
        public static final createLanguageListFromLocalTask INSTANCE = new createLanguageListFromLocalTask();

        private createLanguageListFromLocalTask() {
        }

        @Override // uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2760AYe interfaceC2760AYeCopydefault = FfiConverterTypeLanguageFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AYT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLanguageFactory.createLanguageListFromLocalTask.callback$lambda$0(interfaceC2760AYeCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AYR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLanguageFactory.createLanguageListFromLocalTask.callback$lambda$1(longByReference, (AYE) obj);
                }
            };
            RustBuffer rustBuffer = C2775AYt.uniffiRustBuffer;
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
        public static final AYE callback$lambda$0(InterfaceC2760AYe interfaceC2760AYe, RustBuffer.ByValue byValue) {
            return interfaceC2760AYe.EZpvd(FfiConverterOptionalString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, AYE aye) {
            Intrinsics.checkNotNullParameter(aye, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError.INSTANCE.lower2(aye).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class createLanguageListFromRemoteTask implements UniffiCallbackInterfaceLanguageFactoryMethod3 {
        public static final int $stable = 0;
        public static final createLanguageListFromRemoteTask INSTANCE = new createLanguageListFromRemoteTask();

        private createLanguageListFromRemoteTask() {
        }

        @Override // uniffi.localization.UniffiCallbackInterfaceLanguageFactoryMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final LongByReference longByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(longByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2760AYe interfaceC2760AYeCopydefault = FfiConverterTypeLanguageFactory.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AYS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceLanguageFactory.createLanguageListFromRemoteTask.callback$lambda$0(interfaceC2760AYeCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AYV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLanguageFactory.createLanguageListFromRemoteTask.callback$lambda$1(longByReference, (AYE) obj);
                }
            };
            RustBuffer rustBuffer = C2775AYt.uniffiRustBuffer;
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
        public static final AYE callback$lambda$0(InterfaceC2760AYe interfaceC2760AYe, RustBuffer.ByValue byValue) {
            return interfaceC2760AYe.OLrzqt(FfiConverterOptionalString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(LongByReference longByReference, AYE aye) {
            Intrinsics.checkNotNullParameter(aye, "");
            longByReference.setValue(FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError.INSTANCE.lower2(aye).longValue());
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
            FfiConverterTypeLanguageFactory.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeLanguageFactory.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_localization_fn_init_callback_vtable_languagefactory(vtable);
    }
}
