package uniffi.feature_restriction;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.ALB;
import o.C60173zxj;
import o.InterfaceC2462AMr;
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
import uniffi.feature_restriction.UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError;
import uniffi.feature_restriction.uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError {
    public static final uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError INSTANCE = new uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError();
    public static UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, execute.INSTANCE, cancel.INSTANCE);
    public static final int $stable = 8;

    public static final class execute implements UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0 {
        public static final int $stable = 0;
        public static final execute INSTANCE = new execute();

        private execute() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteI8, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError$execute$callback$makeCall$1 unifficallbackinterfaceoknativetaskboolwithnativefetchfeaturerestrictionerror_execute_callback_makecall_1 = new uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError$execute$callback$makeCall$1(FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError$execute$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.ANm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError.execute.callback$lambda$0(uniffiForeignFutureCompleteI8, j2, ((java.lang.Boolean) obj).booleanValue());
                }
            }, unifficallbackinterfaceoknativetaskboolwithnativefetchfeaturerestrictionerror_execute_callback_makecall_1, new Function1() { // from class: o.ANn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError.execute.callback$lambda$1(uniffiForeignFutureCompleteI8, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ALB.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, boolean z) {
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(ALB.uniffiRustBuffer.getRustBufferOp(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(ALB.uniffiRustBuffer.getRustBufferOp(), (byte) 0, byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError() {
    }

    public static final class cancel implements UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1 {
        public static final int $stable = 0;
        public static final cancel INSTANCE = new cancel();

        private cancel() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2462AMr interfaceC2462AMrCopydefault = FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.ANi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError.cancel.callback$lambda$0(interfaceC2462AMrCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.ANj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskboolWithNativeFetchFeatureRestrictionError.cancel.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC2462AMr interfaceC2462AMr) {
            interfaceC2462AMr.EZpvd();
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
            FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_feature_restriction_fn_init_callback_vtable_oknativetaskboolwithnativefetchfeaturerestrictionerror(vtable);
    }
}
