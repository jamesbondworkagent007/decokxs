package uniffi.account;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C60173zxj;
import o.C60230zyn;
import o.zIR;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteI8;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureCompleteVoid;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultI8;
import uniffi.UniffiForeignFutureResultRustBuffer;
import uniffi.UniffiForeignFutureResultVoid;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceNativePasskeyKeyProvider;
import uniffi.account.uniffiCallbackInterfaceNativePasskeyKeyProvider;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceNativePasskeyKeyProvider {
    public static final uniffiCallbackInterfaceNativePasskeyKeyProvider INSTANCE = new uniffiCallbackInterfaceNativePasskeyKeyProvider();
    public static UniffiVTableCallbackInterfaceNativePasskeyKeyProvider.UniffiByValue vtable = new UniffiVTableCallbackInterfaceNativePasskeyKeyProvider.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, checkDevicePasscode.INSTANCE, isProtectionKeyAvailable.INSTANCE, showDevicePasscodeForLockout.INSTANCE, verifyUserPresence.INSTANCE, getProtectionPublicKey.INSTANCE, decryptWithProtectionKey.INSTANCE, removeProtectionKey.INSTANCE, storeEncryptedPasskey.INSTANCE, loadEncryptedPasskey.INSTANCE, loadEncryptedPasskeyByCredentialId.INSTANCE, removeEncryptedPasskey.INSTANCE, hasEncryptedPasskey.INSTANCE);
    public static final int $stable = 8;

    public static final class checkDevicePasscode implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod0 {
        public static final int $stable = 0;
        public static final checkDevicePasscode INSTANCE = new checkDevicePasscode();

        private checkDevicePasscode() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod0
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.checkDevicePasscode.callback$lambda$0(zirCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AkW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.checkDevicePasscode.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof OkxPasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeOkxPasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zIR zir) {
            zir.OLrzqt();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceNativePasskeyKeyProvider() {
    }

    public static final class isProtectionKeyAvailable implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod1 {
        public static final int $stable = 0;
        public static final isProtectionKeyAvailable INSTANCE = new isProtectionKeyAvailable();

        private isProtectionKeyAvailable() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod1
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull final UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteI8, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceNativePasskeyKeyProvider$isProtectionKeyAvailable$callback$makeCall$1 unifficallbackinterfacenativepasskeykeyprovider_isprotectionkeyavailable_callback_makecall_1 = new uniffiCallbackInterfaceNativePasskeyKeyProvider$isProtectionKeyAvailable$callback$makeCall$1(FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, byValue2, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceNativePasskeyKeyProvider$isProtectionKeyAvailable$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AkZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.isProtectionKeyAvailable.callback$lambda$0(uniffiForeignFutureCompleteI8, j2, ((java.lang.Boolean) obj).booleanValue());
                }
            }, unifficallbackinterfacenativepasskeykeyprovider_isprotectionkeyavailable_callback_makecall_1, new Function1() { // from class: o.Alc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.isProtectionKeyAvailable.callback$lambda$1(uniffiForeignFutureCompleteI8, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, boolean z) {
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), (byte) 0, byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class showDevicePasscodeForLockout implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod2 {
        public static final int $stable = 0;
        public static final showDevicePasscodeForLockout INSTANCE = new showDevicePasscodeForLockout();

        private showDevicePasscodeForLockout() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod2
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Alj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.showDevicePasscodeForLockout.callback$lambda$0(zirCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.showDevicePasscodeForLockout.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof OkxPasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeOkxPasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zIR zir) {
            zir.EZpvd();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class verifyUserPresence implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod3 {
        public static final int $stable = 0;
        public static final verifyUserPresence INSTANCE = new verifyUserPresence();

        private verifyUserPresence() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod3
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceNativePasskeyKeyProvider$verifyUserPresence$callback$makeCall$1 unifficallbackinterfacenativepasskeykeyprovider_verifyuserpresence_callback_makecall_1 = new uniffiCallbackInterfaceNativePasskeyKeyProvider$verifyUserPresence$callback$makeCall$1(FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceNativePasskeyKeyProvider$verifyUserPresence$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Alm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.verifyUserPresence.callback$lambda$0(uniffiForeignFutureCompleteVoid, j2, (Unit) obj);
                }
            }, unifficallbackinterfacenativepasskeykeyprovider_verifyuserpresence_callback_makecall_1, new Function1() { // from class: o.Aln
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.verifyUserPresence.callback$lambda$1(uniffiForeignFutureCompleteVoid, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class getProtectionPublicKey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod4 {
        public static final int $stable = 0;
        public static final getProtectionPublicKey INSTANCE = new getProtectionPublicKey();

        private getProtectionPublicKey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod4
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceNativePasskeyKeyProvider$getProtectionPublicKey$callback$makeCall$1 unifficallbackinterfacenativepasskeykeyprovider_getprotectionpublickey_callback_makecall_1 = new uniffiCallbackInterfaceNativePasskeyKeyProvider$getProtectionPublicKey$callback$makeCall$1(FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, byValue2, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceNativePasskeyKeyProvider$getProtectionPublicKey$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Ala
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.getProtectionPublicKey.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (byte[]) obj);
                }
            }, unifficallbackinterfacenativepasskeykeyprovider_getprotectionpublickey_callback_makecall_1, new Function1() { // from class: o.AkX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.getProtectionPublicKey.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterByteArray.INSTANCE.lower2((Object) bArr), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class decryptWithProtectionKey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod5 {
        public static final int $stable = 0;
        public static final decryptWithProtectionKey INSTANCE = new decryptWithProtectionKey();

        private decryptWithProtectionKey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod5
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1 unifficallbackinterfacenativepasskeykeyprovider_decryptwithprotectionkey_callback_makecall_1 = new uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$makeCall$1(FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, byValue2, byValue3, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceNativePasskeyKeyProvider$decryptWithProtectionKey$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AkT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.decryptWithProtectionKey.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (byte[]) obj);
                }
            }, unifficallbackinterfacenativepasskeykeyprovider_decryptwithprotectionkey_callback_makecall_1, new Function1() { // from class: o.AkU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.decryptWithProtectionKey.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterByteArray.INSTANCE.lower2((Object) bArr), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class removeProtectionKey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod6 {
        public static final int $stable = 0;
        public static final removeProtectionKey INSTANCE = new removeProtectionKey();

        private removeProtectionKey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Alh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.removeProtectionKey.callback$lambda$0(zirCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Ali
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.removeProtectionKey.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(zIR zir, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zir.djBIcL(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class storeEncryptedPasskey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod7 {
        public static final int $stable = 0;
        public static final storeEncryptedPasskey INSTANCE = new storeEncryptedPasskey();

        private storeEncryptedPasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod7
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull final RustBuffer.ByValue byValue4, @NotNull final RustBuffer.ByValue byValue5, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(byValue5, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Alo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.storeEncryptedPasskey.callback$lambda$0(zirCopydefault, byValue, byValue2, byValue3, byValue4, byValue5);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.storeEncryptedPasskey.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof OkxPasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeOkxPasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(zIR zir, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, RustBuffer.ByValue byValue5) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zir.AEQbTJ(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3), ffiConverterString.lift2(byValue4), (byte[]) FfiConverterByteArray.INSTANCE.lift2(byValue5));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class loadEncryptedPasskey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod8 {
        public static final int $stable = 0;
        public static final loadEncryptedPasskey INSTANCE = new loadEncryptedPasskey();

        private loadEncryptedPasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod8
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ale
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.loadEncryptedPasskey.callback$lambda$0(zirCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.loadEncryptedPasskey.callback$lambda$1(rustBuffer, (byte[]) obj);
                }
            };
            RustBuffer rustBuffer2 = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof OkxPasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeOkxPasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final byte[] callback$lambda$0(zIR zir, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return zir.AEQbTJ(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterByteArray.INSTANCE.lower2((Object) bArr));
            return Unit.INSTANCE;
        }
    }

    public static final class loadEncryptedPasskeyByCredentialId implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod9 {
        public static final int $stable = 0;
        public static final loadEncryptedPasskeyByCredentialId INSTANCE = new loadEncryptedPasskeyByCredentialId();

        private loadEncryptedPasskeyByCredentialId() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod9
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Ald
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.loadEncryptedPasskeyByCredentialId.callback$lambda$0(zirCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.loadEncryptedPasskeyByCredentialId.callback$lambda$1(rustBuffer, (byte[]) obj);
                }
            };
            RustBuffer rustBuffer2 = C60230zyn.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                if (e instanceof OkxPasskeyException) {
                    uniffiRustCallStatus.code = (byte) 1;
                    uniffiRustCallStatus.error_buf = FfiConverterTypeOkxPasskeyError.INSTANCE.lower2(e);
                } else {
                    Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                    if (unExceptionReport != null) {
                        unExceptionReport.invoke(e);
                    }
                    uniffiRustCallStatus.code = (byte) 2;
                    uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer2).lower2(e.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final byte[] callback$lambda$0(zIR zir, RustBuffer.ByValue byValue) {
            return zir.OLrzqt(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterByteArray.INSTANCE.lower2((Object) bArr));
            return Unit.INSTANCE;
        }
    }

    public static final class removeEncryptedPasskey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod10 {
        public static final int $stable = 0;
        public static final removeEncryptedPasskey INSTANCE = new removeEncryptedPasskey();

        private removeEncryptedPasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod10
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.All
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.removeEncryptedPasskey.callback$lambda$0(zirCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.removeEncryptedPasskey.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(zIR zir, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zir.EZpvd(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class hasEncryptedPasskey implements UniffiCallbackInterfaceNativePasskeyKeyProviderMethod11 {
        public static final int $stable = 0;
        public static final hasEncryptedPasskey INSTANCE = new hasEncryptedPasskey();

        private hasEncryptedPasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceNativePasskeyKeyProviderMethod11
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final zIR zirCopydefault = FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AkY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceNativePasskeyKeyProvider.hasEncryptedPasskey.callback$lambda$0(zirCopydefault, byValue, byValue2));
                }
            };
            Function1 function1 = new Function1() { // from class: o.Alb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceNativePasskeyKeyProvider.hasEncryptedPasskey.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C60230zyn.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(zIR zir, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return zir.KWHzl(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
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
            FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeNativePasskeyKeyProvider.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_nativepasskeykeyprovider(vtable);
    }
}
