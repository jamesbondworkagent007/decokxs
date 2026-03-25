package uniffi.user;

import com.sun.jna.Pointer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BvH;
import o.BzK;
import o.C60173zxj;
import o.InterfaceC5017Bzn;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.user.UniffiVTableCallbackInterfaceUserDataSource;
import uniffi.user.uniffiCallbackInterfaceUserDataSource;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceUserDataSource {
    public static final uniffiCallbackInterfaceUserDataSource INSTANCE = new uniffiCallbackInterfaceUserDataSource();
    public static UniffiVTableCallbackInterfaceUserDataSource.UniffiByValue vtable = new UniffiVTableCallbackInterfaceUserDataSource.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getAllUsers.INSTANCE, setAllUsers.INSTANCE, updateUser.INSTANCE, removeUser.INSTANCE, clearAll.INSTANCE);
    public static final int $stable = 8;

    public static final class getAllUsers implements UniffiCallbackInterfaceUserDataSourceMethod0 {
        public static final int $stable = 0;
        public static final getAllUsers INSTANCE = new getAllUsers();

        private getAllUsers() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC5017Bzn interfaceC5017BznCopydefault = FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC5017BznCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUserDataSource.getAllUsers.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = BzK.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceTypeCoreUser.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceUserDataSource() {
    }

    public static final class setAllUsers implements UniffiCallbackInterfaceUserDataSourceMethod1 {
        public static final int $stable = 0;
        public static final setAllUsers INSTANCE = new setAllUsers();

        private setAllUsers() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC5017Bzn interfaceC5017BznCopydefault = FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceUserDataSource.setAllUsers.callback$lambda$0(interfaceC5017BznCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUserDataSource.setAllUsers.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC5017Bzn interfaceC5017Bzn, RustBuffer.ByValue byValue) {
            interfaceC5017Bzn.AEQbTJ((List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class updateUser implements UniffiCallbackInterfaceUserDataSourceMethod2 {
        public static final int $stable = 0;
        public static final updateUser INSTANCE = new updateUser();

        private updateUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC5017Bzn interfaceC5017BznCopydefault = FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceUserDataSource.updateUser.callback$lambda$0(interfaceC5017BznCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUserDataSource.updateUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC5017Bzn interfaceC5017Bzn, RustBuffer.ByValue byValue) {
            interfaceC5017Bzn.copydefault((BvH) FfiConverterTypeCoreUser.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class removeUser implements UniffiCallbackInterfaceUserDataSourceMethod3 {
        public static final int $stable = 0;
        public static final removeUser INSTANCE = new removeUser();

        private removeUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC5017Bzn interfaceC5017BznCopydefault = FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceUserDataSource.removeUser.callback$lambda$0(interfaceC5017BznCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUserDataSource.removeUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC5017Bzn interfaceC5017Bzn, RustBuffer.ByValue byValue) {
            interfaceC5017Bzn.OLrzqt((BvH) FfiConverterTypeCoreUser.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class clearAll implements UniffiCallbackInterfaceUserDataSourceMethod4 {
        public static final int $stable = 0;
        public static final clearAll INSTANCE = new clearAll();

        private clearAll() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC5017Bzn interfaceC5017BznCopydefault = FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceUserDataSource.clearAll.callback$lambda$0(interfaceC5017BznCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUserDataSource.clearAll.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC5017Bzn interfaceC5017Bzn) {
            interfaceC5017Bzn.AEQbTJ();
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
            FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeUserDataSource.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_user_fn_init_callback_vtable_userdatasource(vtable);
    }
}
