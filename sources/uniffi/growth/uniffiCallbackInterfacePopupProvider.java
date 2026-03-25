package uniffi.growth;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.ANQ;
import o.AOQ;
import o.C60173zxj;
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
import uniffi.growth.UniffiVTableCallbackInterfacePopupProvider;
import uniffi.growth.uniffiCallbackInterfacePopupProvider;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePopupProvider {
    public static final uniffiCallbackInterfacePopupProvider INSTANCE = new uniffiCallbackInterfacePopupProvider();
    public static UniffiVTableCallbackInterfacePopupProvider.UniffiByValue vtable = new UniffiVTableCallbackInterfacePopupProvider.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, popupId.INSTANCE, shouldShow.INSTANCE, showPopup.INSTANCE);
    public static final int $stable = 8;

    public static final class popupId implements UniffiCallbackInterfacePopupProviderMethod0 {
        public static final int $stable = 0;
        public static final popupId INSTANCE = new popupId();

        private popupId() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePopupProviderMethod0
        public void callback(long j, @NotNull final IntByReference intByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(intByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AOQ aoqCopydefault = FfiConverterTypePopupProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AQM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(aoqCopydefault.OLrzqt());
                }
            };
            Function1 function1 = new Function1() { // from class: o.AQP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePopupProvider.popupId.callback$lambda$1(intByReference, ((java.lang.Integer) obj).intValue());
                }
            };
            RustBuffer rustBuffer = ANQ.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(IntByReference intByReference, int i) {
            intByReference.setValue(FfiConverterInt.INSTANCE.lower(i).intValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePopupProvider() {
    }

    public static final class shouldShow implements UniffiCallbackInterfacePopupProviderMethod1 {
        public static final int $stable = 0;
        public static final shouldShow INSTANCE = new shouldShow();

        private shouldShow() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePopupProviderMethod1
        public void callback(long j, long j2, @NotNull final UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, final long j3, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteI8, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1 unifficallbackinterfacepopupprovider_shouldshow_callback_makecall_1 = new uniffiCallbackInterfacePopupProvider$shouldShow$callback$makeCall$1(FfiConverterTypePopupProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), j2, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfacePopupProvider$shouldShow$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.AQN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePopupProvider.shouldShow.callback$lambda$0(uniffiForeignFutureCompleteI8, j3, ((java.lang.Boolean) obj).booleanValue());
                }
            }, unifficallbackinterfacepopupprovider_shouldshow_callback_makecall_1, new Function1() { // from class: o.AQU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePopupProvider.shouldShow.callback$lambda$1(uniffiForeignFutureCompleteI8, j3, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ANQ.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, boolean z) {
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), (byte) 0, byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class showPopup implements UniffiCallbackInterfacePopupProviderMethod2 {
        public static final int $stable = 0;
        public static final showPopup INSTANCE = new showPopup();

        private showPopup() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfacePopupProviderMethod2
        public void callback(long j, final long j2, final long j3, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final AOQ aoqCopydefault = FfiConverterTypePopupProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AQT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePopupProvider.showPopup.callback$lambda$0(aoqCopydefault, j2, j3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AQS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePopupProvider.showPopup.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = ANQ.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(AOQ aoq, long j, long j2) {
            aoq.copydefault(FfiConverterTypePopupTriggerContext.INSTANCE.lift(j), FfiConverterTypePopupCallbacks.INSTANCE.lift(j2));
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
            FfiConverterTypePopupProvider.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePopupProvider.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_growth_fn_init_callback_vtable_popupprovider(vtable);
    }
}
