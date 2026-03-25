package uniffi.user;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BuX;
import o.BvH;
import o.BvK;
import o.BzK;
import o.C5007Bzd;
import o.C5008Bze;
import o.C5010Bzg;
import o.C60173zxj;
import o.InterfaceC4968Bxs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.user.UniffiVTableCallbackInterfaceCoreUserManagerHandling;
import uniffi.user.uniffiCallbackInterfaceCoreUserManagerHandling;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceCoreUserManagerHandling {
    public static final uniffiCallbackInterfaceCoreUserManagerHandling INSTANCE = new uniffiCallbackInterfaceCoreUserManagerHandling();
    public static UniffiVTableCallbackInterfaceCoreUserManagerHandling.UniffiByValue vtable = new UniffiVTableCallbackInterfaceCoreUserManagerHandling.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, isLogin.INSTANCE, isLoginMainAccount.INSTANCE, getCurrentUser.INSTANCE, getAllUsers.INSTANCE, getAllUsernames.INSTANCE, getUserById.INSTANCE, getUserByLoginName.INSTANCE, getAllUsersOfCurrentSite.INSTANCE, getAllUsersByLoginTime.INSTANCE, getNonCurrentUsersWithToken.INSTANCE, loginUser.INSTANCE, logoutCurrentUser.INSTANCE, switchToUser.INSTANCE, getAuthorisationToken.INSTANCE, getTempToken.INSTANCE, setTempToken.INSTANCE, clearTempToken.INSTANCE, updateUserToken.INSTANCE, updateUserTokenWithType.INSTANCE, getCurrentUserInfo.INSTANCE, getUserInfo.INSTANCE, saveCurrentUserInfo.INSTANCE, saveUserInfo.INSTANCE, getCurrentUserProfile.INSTANCE, getUserProfile.INSTANCE, saveCurrentUserProfile.INSTANCE, saveUserProfile.INSTANCE, updateUser.INSTANCE, updateUserLoginName.INSTANCE, removeUser.INSTANCE, removeTestUsers.INSTANCE, setAllUsers.INSTANCE, clearAllUsers.INSTANCE, getRbacFeatures.INSTANCE, isMainAccountApprover.INSTANCE, reloadData.INSTANCE, getRmFeatures.INSTANCE, isRmAccount.INSTANCE, hasSpecialModeDeeplinkRestriction.INSTANCE, getBoundAccount.INSTANCE, registerUserInfoEventCallback.INSTANCE);
    public static final int $stable = 8;

    public static final class isLogin implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod0 {
        public static final int $stable = 0;
        public static final isLogin INSTANCE = new isLogin();

        private isLogin() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod0
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC4968BxsCopydefault.fJNWhG());
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.isLogin.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceCoreUserManagerHandling() {
    }

    public static final class isLoginMainAccount implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod1 {
        public static final int $stable = 0;
        public static final isLoginMainAccount INSTANCE = new isLoginMainAccount();

        private isLoginMainAccount() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod1
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC4968BxsCopydefault.fARcdN());
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.isLoginMainAccount.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrentUser implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod2 {
        public static final int $stable = 0;
        public static final getCurrentUser INSTANCE = new getCurrentUser();

        private getCurrentUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod2
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.gEmmrt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getCurrentUser.callback$lambda$1(rustBuffer, (BvH) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BvH bvH) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUser.INSTANCE.lower2(bvH));
            return Unit.INSTANCE;
        }
    }

    public static final class getAllUsers implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod3 {
        public static final int $stable = 0;
        public static final getAllUsers INSTANCE = new getAllUsers();

        private getAllUsers() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod3
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.KWHzl();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getAllUsers.callback$lambda$1(rustBuffer, (java.util.List) obj);
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

    public static final class getAllUsernames implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod4 {
        public static final int $stable = 0;
        public static final getAllUsernames INSTANCE = new getAllUsernames();

        private getAllUsernames() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod4
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.AEQbTJ();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getAllUsernames.callback$lambda$1(rustBuffer, (java.util.List) obj);
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
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceString.INSTANCE.lower2((Object) list));
            return Unit.INSTANCE;
        }
    }

    public static final class getUserById implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod5 {
        public static final int $stable = 0;
        public static final getUserById INSTANCE = new getUserById();

        private getUserById() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserById.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserById.callback$lambda$1(rustBuffer, (BvH) obj);
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
        public static final BvH callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            return interfaceC4968Bxs.AEQbTJ(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BvH bvH) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUser.INSTANCE.lower2(bvH));
            return Unit.INSTANCE;
        }
    }

    public static final class getUserByLoginName implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod6 {
        public static final int $stable = 0;
        public static final getUserByLoginName INSTANCE = new getUserByLoginName();

        private getUserByLoginName() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserByLoginName.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserByLoginName.callback$lambda$1(rustBuffer, (BvH) obj);
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
        public static final BvH callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            return interfaceC4968Bxs.copydefault(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BvH bvH) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUser.INSTANCE.lower2(bvH));
            return Unit.INSTANCE;
        }
    }

    public static final class getAllUsersOfCurrentSite implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod7 {
        public static final int $stable = 0;
        public static final getAllUsersOfCurrentSite INSTANCE = new getAllUsersOfCurrentSite();

        private getAllUsersOfCurrentSite() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod7
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.djBIcL();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getAllUsersOfCurrentSite.callback$lambda$1(rustBuffer, (java.util.List) obj);
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

    public static final class getAllUsersByLoginTime implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod8 {
        public static final int $stable = 0;
        public static final getAllUsersByLoginTime INSTANCE = new getAllUsersByLoginTime();

        private getAllUsersByLoginTime() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod8
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.OLrzqt();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getAllUsersByLoginTime.callback$lambda$1(rustBuffer, (java.util.List) obj);
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

    public static final class getNonCurrentUsersWithToken implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod9 {
        public static final int $stable = 0;
        public static final getNonCurrentUsersWithToken INSTANCE = new getNonCurrentUsersWithToken();

        private getNonCurrentUsersWithToken() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod9
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.fetchVPNInfo();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getNonCurrentUsersWithToken.callback$lambda$1(rustBuffer, (java.util.List) obj);
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

    public static final class loginUser implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod10 {
        public static final int $stable = 0;
        public static final loginUser INSTANCE = new loginUser();

        private loginUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod10
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull final RustBuffer.ByValue byValue4, @NotNull final RustBuffer.ByValue byValue5, @NotNull final RustBuffer.ByValue byValue6, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(byValue5, "");
            Intrinsics.checkNotNullParameter(byValue6, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.loginUser.callback$lambda$0(interfaceC4968BxsCopydefault, byValue, byValue2, byValue3, byValue4, byValue5, byValue6, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.loginUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, RustBuffer.ByValue byValue5, RustBuffer.ByValue byValue6, byte b) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4968Bxs.copydefault(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3), (TokenType) FfiConverterTypeTokenType.INSTANCE.lift2(byValue4), ffiConverterString.lift2(byValue5), FfiConverterOptionalString.INSTANCE.lift2(byValue6), FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class logoutCurrentUser implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod11 {
        public static final int $stable = 0;
        public static final logoutCurrentUser INSTANCE = new logoutCurrentUser();

        private logoutCurrentUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod11
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.logoutCurrentUser.callback$lambda$0(interfaceC4968BxsCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.logoutCurrentUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs) {
            interfaceC4968Bxs.uzCIH();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class switchToUser implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod12 {
        public static final int $stable = 0;
        public static final switchToUser INSTANCE = new switchToUser();

        private switchToUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod12
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.switchToUser.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.switchToUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.gEmmrt(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getAuthorisationToken implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod13 {
        public static final int $stable = 0;
        public static final getAuthorisationToken INSTANCE = new getAuthorisationToken();

        private getAuthorisationToken() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod13
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.AYXKKw();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getAuthorisationToken.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class getTempToken implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod14 {
        public static final int $stable = 0;
        public static final getTempToken INSTANCE = new getTempToken();

        private getTempToken() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod14
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.DbNXlk();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getTempToken.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class setTempToken implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod15 {
        public static final int $stable = 0;
        public static final setTempToken INSTANCE = new setTempToken();

        private setTempToken() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod15
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.setTempToken.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.setTempToken.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.djBIcL(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class clearTempToken implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod16 {
        public static final int $stable = 0;
        public static final clearTempToken INSTANCE = new clearTempToken();

        private clearTempToken() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod16
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.clearTempToken.callback$lambda$0(interfaceC4968BxsCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.clearTempToken.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs) {
            interfaceC4968Bxs.EZpvd();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class updateUserToken implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod17 {
        public static final int $stable = 0;
        public static final updateUserToken INSTANCE = new updateUserToken();

        private updateUserToken() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod17
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BCa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUserToken.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUserToken.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.AhwBna(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class updateUserTokenWithType implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod18 {
        public static final int $stable = 0;
        public static final updateUserTokenWithType INSTANCE = new updateUserTokenWithType();

        private updateUserTokenWithType() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod18
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUserTokenWithType.callback$lambda$0(interfaceC4968BxsCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUserTokenWithType.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4968Bxs.AEQbTJ(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrentUserInfo implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod19 {
        public static final int $stable = 0;
        public static final getCurrentUserInfo INSTANCE = new getCurrentUserInfo();

        private getCurrentUserInfo() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod19
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.valueOf();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getCurrentUserInfo.callback$lambda$1(rustBuffer, (BvK) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BvK bvK) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lower2(bvK));
            return Unit.INSTANCE;
        }
    }

    public static final class getUserInfo implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod20 {
        public static final int $stable = 0;
        public static final getUserInfo INSTANCE = new getUserInfo();

        private getUserInfo() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod20
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserInfo.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserInfo.callback$lambda$1(rustBuffer, (BvK) obj);
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
        public static final BvK callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            return interfaceC4968Bxs.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BvK bvK) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lower2(bvK));
            return Unit.INSTANCE;
        }
    }

    public static final class saveCurrentUserInfo implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod21 {
        public static final int $stable = 0;
        public static final saveCurrentUserInfo INSTANCE = new saveCurrentUserInfo();

        private saveCurrentUserInfo() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod21
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveCurrentUserInfo.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveCurrentUserInfo.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.AEQbTJ(FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class saveUserInfo implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod22 {
        public static final int $stable = 0;
        public static final saveUserInfo INSTANCE = new saveUserInfo();

        private saveUserInfo() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod22
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveUserInfo.callback$lambda$0(interfaceC4968BxsCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveUserInfo.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            interfaceC4968Bxs.EZpvd(FfiConverterString.INSTANCE.lift2(byValue), (BvK) FfiConverterTypeCoreUserInfo.INSTANCE.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getCurrentUserProfile implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod23 {
        public static final int $stable = 0;
        public static final getCurrentUserProfile INSTANCE = new getCurrentUserProfile();

        private getCurrentUserProfile() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod23
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.values();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getCurrentUserProfile.callback$lambda$1(rustBuffer, (C5007Bzd) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, C5007Bzd c5007Bzd) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lower2(c5007Bzd));
            return Unit.INSTANCE;
        }
    }

    public static final class getUserProfile implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod24 {
        public static final int $stable = 0;
        public static final getUserProfile INSTANCE = new getUserProfile();

        private getUserProfile() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod24
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserProfile.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getUserProfile.callback$lambda$1(rustBuffer, (C5007Bzd) obj);
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
        public static final C5007Bzd callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            return interfaceC4968Bxs.KWHzl(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, C5007Bzd c5007Bzd) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lower2(c5007Bzd));
            return Unit.INSTANCE;
        }
    }

    public static final class saveCurrentUserProfile implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod25 {
        public static final int $stable = 0;
        public static final saveCurrentUserProfile INSTANCE = new saveCurrentUserProfile();

        private saveCurrentUserProfile() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod25
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveCurrentUserProfile.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveCurrentUserProfile.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.OLrzqt(FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class saveUserProfile implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod26 {
        public static final int $stable = 0;
        public static final saveUserProfile INSTANCE = new saveUserProfile();

        private saveUserProfile() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod26
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveUserProfile.callback$lambda$0(interfaceC4968BxsCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.saveUserProfile.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            interfaceC4968Bxs.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue), (C5007Bzd) FfiConverterTypeCoreUserProfile.INSTANCE.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class updateUser implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod27 {
        public static final int $stable = 0;
        public static final updateUser INSTANCE = new updateUser();

        private updateUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod27
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUser.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.EZpvd((BvH) FfiConverterTypeCoreUser.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class updateUserLoginName implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod28 {
        public static final int $stable = 0;
        public static final updateUserLoginName INSTANCE = new updateUserLoginName();

        private updateUserLoginName() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod28
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUserLoginName.callback$lambda$0(interfaceC4968BxsCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BCb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.updateUserLoginName.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4968Bxs.EZpvd(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class removeUser implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod29 {
        public static final int $stable = 0;
        public static final removeUser INSTANCE = new removeUser();

        private removeUser() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod29
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.removeUser.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.removeUser.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class removeTestUsers implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod30 {
        public static final int $stable = 0;
        public static final removeTestUsers INSTANCE = new removeTestUsers();

        private removeTestUsers() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod30
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.removeTestUsers.callback$lambda$0(interfaceC4968BxsCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.removeTestUsers.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs) {
            interfaceC4968Bxs.hDKMBd();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class setAllUsers implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod31 {
        public static final int $stable = 0;
        public static final setAllUsers INSTANCE = new setAllUsers();

        private setAllUsers() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod31
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.setAllUsers.callback$lambda$0(interfaceC4968BxsCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.setAllUsers.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, RustBuffer.ByValue byValue) {
            interfaceC4968Bxs.EZpvd((List<BvH>) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class clearAllUsers implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod32 {
        public static final int $stable = 0;
        public static final clearAllUsers INSTANCE = new clearAllUsers();

        private clearAllUsers() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod32
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.clearAllUsers.callback$lambda$0(interfaceC4968BxsCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.clearAllUsers.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs) {
            interfaceC4968Bxs.copydefault();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getRbacFeatures implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod33 {
        public static final int $stable = 0;
        public static final getRbacFeatures INSTANCE = new getRbacFeatures();

        private getRbacFeatures() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod33
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.isConnected();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getRbacFeatures.callback$lambda$1(rustBuffer, (C5010Bzg) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, C5010Bzg c5010Bzg) {
            Intrinsics.checkNotNullParameter(c5010Bzg, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeRbacFeatures.INSTANCE.lower2((Object) c5010Bzg));
            return Unit.INSTANCE;
        }
    }

    public static final class isMainAccountApprover implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod34 {
        public static final int $stable = 0;
        public static final isMainAccountApprover INSTANCE = new isMainAccountApprover();

        private isMainAccountApprover() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod34
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC4968BxsCopydefault.AuCTel());
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.isMainAccountApprover.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class reloadData implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod35 {
        public static final int $stable = 0;
        public static final reloadData INSTANCE = new reloadData();

        private reloadData() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod35
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.reloadData.callback$lambda$0(interfaceC4968BxsCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.reloadData.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs) {
            interfaceC4968Bxs.getNewProxyInstance();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getRmFeatures implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod36 {
        public static final int $stable = 0;
        public static final getRmFeatures INSTANCE = new getRmFeatures();

        private getRmFeatures() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod36
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.AkhnZx();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getRmFeatures.callback$lambda$1(rustBuffer, (C5008Bze) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, C5008Bze c5008Bze) {
            Intrinsics.checkNotNullParameter(c5008Bze, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterTypeRmFeatures.INSTANCE.lower2((Object) c5008Bze));
            return Unit.INSTANCE;
        }
    }

    public static final class isRmAccount implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod37 {
        public static final int $stable = 0;
        public static final isRmAccount INSTANCE = new isRmAccount();

        private isRmAccount() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod37
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC4968BxsCopydefault.fIwbmz());
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.isRmAccount.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class hasSpecialModeDeeplinkRestriction implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod38 {
        public static final int $stable = 0;
        public static final hasSpecialModeDeeplinkRestriction INSTANCE = new hasSpecialModeDeeplinkRestriction();

        private hasSpecialModeDeeplinkRestriction() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod38
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC4968BxsCopydefault.ejfBZ());
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.hasSpecialModeDeeplinkRestriction.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getBoundAccount implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod39 {
        public static final int $stable = 0;
        public static final getBoundAccount INSTANCE = new getBoundAccount();

        private getBoundAccount() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod39
        public void callback(long j, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BAO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return interfaceC4968BxsCopydefault.AhwBna();
                }
            };
            Function1 function1 = new Function1() { // from class: o.BAL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.getBoundAccount.callback$lambda$1(rustBuffer, (BuX) obj);
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
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, BuX buX) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalTypeBoundAccount.INSTANCE.lower2(buX));
            return Unit.INSTANCE;
        }
    }

    public static final class registerUserInfoEventCallback implements UniffiCallbackInterfaceCoreUserManagerHandlingMethod40 {
        public static final int $stable = 0;
        public static final registerUserInfoEventCallback INSTANCE = new registerUserInfoEventCallback();

        private registerUserInfoEventCallback() {
        }

        @Override // uniffi.user.UniffiCallbackInterfaceCoreUserManagerHandlingMethod40
        public void callback(long j, final long j2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4968Bxs interfaceC4968BxsCopydefault = FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BBB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.registerUserInfoEventCallback.callback$lambda$0(interfaceC4968BxsCopydefault, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BBz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceCoreUserManagerHandling.registerUserInfoEventCallback.callback$lambda$1((Unit) obj);
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
        public static final Unit callback$lambda$0(InterfaceC4968Bxs interfaceC4968Bxs, long j) {
            interfaceC4968Bxs.EZpvd(FfiConverterTypeUserInfoEventCallback.INSTANCE.lift(j));
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
            FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeCoreUserManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_user_fn_init_callback_vtable_coreusermanagerhandling(vtable);
    }
}
