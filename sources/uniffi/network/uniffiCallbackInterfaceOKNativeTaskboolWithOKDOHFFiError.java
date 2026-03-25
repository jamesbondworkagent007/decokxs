package uniffi.network;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C4298Bav;
import o.C60173zxj;
import o.InterfaceC4274BaX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteI8;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultI8;
import uniffi.UniffiRustCallStatus;
import uniffi.network.UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError;
import uniffi.network.uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError {
    public static final uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError INSTANCE = new uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError();
    public static UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, execute.INSTANCE, cancel.INSTANCE);
    public static final int $stable = 8;

    public static final class execute implements UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0 {
        public static final int $stable = 0;
        public static final execute INSTANCE = new execute();

        private execute() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteI8, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError$execute$callback$makeCall$1 unifficallbackinterfaceoknativetaskboolwithokdohffierror_execute_callback_makecall_1 = new uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError$execute$callback$makeCall$1(FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError$execute$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Bdt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError.execute.callback$lambda$0(uniffiForeignFutureCompleteI8, j2, ((java.lang.Boolean) obj).booleanValue());
                }
            }, unifficallbackinterfaceoknativetaskboolwithokdohffierror_execute_callback_makecall_1, new Function1() { // from class: o.BdA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError.execute.callback$lambda$1(uniffiForeignFutureCompleteI8, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C4298Bav.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, boolean z) {
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(C4298Bav.uniffiRustBuffer.getRustBufferOp(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(C4298Bav.uniffiRustBuffer.getRustBufferOp(), (byte) 0, byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError() {
    }

    public static final class cancel implements UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1 {
        public static final int $stable = 0;
        public static final cancel INSTANCE = new cancel();

        private cancel() {
        }

        @Override // uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4274BaX interfaceC4274BaXCopydefault = FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bds
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError.cancel.callback$lambda$0(interfaceC4274BaXCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bdv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError.cancel.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4274BaX interfaceC4274BaX) {
            interfaceC4274BaX.OLrzqt();
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
            FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_network_fn_init_callback_vtable_oknativetaskboolwithokdohffierror(vtable);
    }
}
