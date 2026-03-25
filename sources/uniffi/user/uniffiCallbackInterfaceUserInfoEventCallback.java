package uniffi.user;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BzC;
import o.BzK;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.user.UniffiVTableCallbackInterfaceUserInfoEventCallback;
import uniffi.user.uniffiCallbackInterfaceUserInfoEventCallback;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceUserInfoEventCallback {
    public static final uniffiCallbackInterfaceUserInfoEventCallback INSTANCE = new uniffiCallbackInterfaceUserInfoEventCallback();
    public static UniffiVTableCallbackInterfaceUserInfoEventCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceUserInfoEventCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onUserInfoEvent.INSTANCE);
    public static final int $stable = 8;

    public static final class onUserInfoEvent implements UniffiCallbackInterfaceUserInfoEventCallbackMethod0 {
        public static final int $stable = 0;
        public static final onUserInfoEvent INSTANCE = new onUserInfoEvent();

        private onUserInfoEvent() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceUserInfoEventCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BzC bzCCopydefault = FfiConverterTypeUserInfoEventCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceUserInfoEventCallback.onUserInfoEvent.callback$lambda$0(bzCCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUserInfoEventCallback.onUserInfoEvent.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BzK.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(BzC bzC, RustBuffer.ByValue byValue) {
            bzC.OLrzqt((UserInfoEvent) FfiConverterTypeUserInfoEvent.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceUserInfoEventCallback() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeUserInfoEventCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeUserInfoEventCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_user_fn_init_callback_vtable_userinfoeventcallback(vtable);
    }
}
