package uniffi.upgrade;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.BtK;
import o.BuB;
import o.C60173zxj;
import o.InterfaceC4845Btd;
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
import uniffi.uniffiForeignFutureDroppedCallbackImpl;
import uniffi.upgrade.UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError;
import uniffi.upgrade.uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError {
    public static final uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError INSTANCE = new uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError();
    public static UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, execute.INSTANCE, cancel.INSTANCE);
    public static final int $stable = 8;

    public static final class execute implements UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0 {
        public static final int $stable = 0;
        public static final execute INSTANCE = new execute();

        private execute() {
        }

        @Override // uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError$execute$callback$makeCall$1 unifficallbackinterfaceoknativetaskokuserwithgetusererror_execute_callback_makecall_1 = new uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError$execute$callback$makeCall$1(FfiConverterTypeOKNativeTaskOKUserWithGetUserError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError$execute$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.BuO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError.execute.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (BtK) obj);
                }
            }, unifficallbackinterfaceoknativetaskokuserwithgetusererror_execute_callback_makecall_1, new Function1() { // from class: o.BuP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError.execute.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BuB.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, BtK btK) {
            Intrinsics.checkNotNullParameter(btK, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(BuB.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeOKUser.INSTANCE.lower2((Object) btK), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(BuB.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError() {
    }

    public static final class cancel implements UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1 {
        public static final int $stable = 0;
        public static final cancel INSTANCE = new cancel();

        private cancel() {
        }

        @Override // uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4845Btd interfaceC4845BtdCopydefault = FfiConverterTypeOKNativeTaskOKUserWithGetUserError.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BuQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError.cancel.callback$lambda$0(interfaceC4845BtdCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BuR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError.cancel.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BuB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4845Btd interfaceC4845Btd) {
            interfaceC4845Btd.KWHzl();
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
            FfiConverterTypeOKNativeTaskOKUserWithGetUserError.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOKNativeTaskOKUserWithGetUserError.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_upgrade_fn_init_callback_vtable_oknativetaskokuserwithgetusererror(vtable);
    }
}
