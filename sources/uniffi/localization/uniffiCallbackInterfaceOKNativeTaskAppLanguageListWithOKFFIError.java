package uniffi.localization;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.AYE;
import o.C2758AYc;
import o.C2775AYt;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultRustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.localization.UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError;
import uniffi.localization.uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError {
    public static final uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError INSTANCE = new uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError();
    public static UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, execute.INSTANCE, cancel.INSTANCE);
    public static final int $stable = 8;

    public static final class execute implements UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0 {
        public static final int $stable = 0;
        public static final execute INSTANCE = new execute();

        private execute() {
        }

        @Override // uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1 unifficallbackinterfaceoknativetaskapplanguagelistwithokffierror_execute_callback_makecall_1 = new uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$makeCall$1(FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError$execute$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AZf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError.execute.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (C2758AYc) obj);
                }
            }, unifficallbackinterfaceoknativetaskapplanguagelistwithokffierror_execute_callback_makecall_1, new Function1() { // from class: o.AZd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError.execute.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C2775AYt.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, C2758AYc c2758AYc) {
            Intrinsics.checkNotNullParameter(c2758AYc, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C2775AYt.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeAppLanguageList.INSTANCE.lower2((Object) c2758AYc), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C2775AYt.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError() {
    }

    public static final class cancel implements UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1 {
        public static final int $stable = 0;
        public static final cancel INSTANCE = new cancel();

        private cancel() {
        }

        @Override // uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AYE ayeCopydefault = FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AYX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError.cancel.callback$lambda$0(ayeCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AZc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskAppLanguageListWithOKFFIError.cancel.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(AYE aye) {
            aye.copydefault();
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
            FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_localization_fn_init_callback_vtable_oknativetaskapplanguagelistwithokffierror(vtable);
    }
}
