package uniffi.account;

import com.sun.jna.ptr.ByteByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C3066Aet;
import o.C60173zxj;
import o.C60207zyQ;
import o.C60230zyn;
import o.InterfaceC58880zSu;
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
import uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling;
import uniffi.account.uniffiCallbackInterfaceOkxPasskeyManagerHandling;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceOkxPasskeyManagerHandling {
    public static final uniffiCallbackInterfaceOkxPasskeyManagerHandling INSTANCE = new uniffiCallbackInterfaceOkxPasskeyManagerHandling();
    public static UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.UniffiByValue vtable = new UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, isDeviceSupportBiometric.INSTANCE, createCredential.INSTANCE, getAssertion.INSTANCE);
    public static final int $stable = 8;

    public static final class isDeviceSupportBiometric implements UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 {
        public static final int $stable = 0;
        public static final isDeviceSupportBiometric INSTANCE = new isDeviceSupportBiometric();

        private isDeviceSupportBiometric() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0
        public void callback(long j, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC58880zSu interfaceC58880zSuCopydefault = FfiConverterTypeOkxPasskeyManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Amq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(interfaceC58880zSuCopydefault.AEQbTJ());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Amp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyManagerHandling.isDeviceSupportBiometric.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
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
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceOkxPasskeyManagerHandling() {
    }

    public static final class createCredential implements UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1 {
        public static final int $stable = 0;
        public static final createCredential INSTANCE = new createCredential();

        private createCredential() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull RustBuffer.ByValue byValue7, byte b, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(byValue5, "");
            Intrinsics.checkNotNullParameter(byValue6, "");
            Intrinsics.checkNotNullParameter(byValue7, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceOkxPasskeyManagerHandling$createCredential$callback$makeCall$1 unifficallbackinterfaceokxpasskeymanagerhandling_createcredential_callback_makecall_1 = new uniffiCallbackInterfaceOkxPasskeyManagerHandling$createCredential$callback$makeCall$1(FfiConverterTypeOkxPasskeyManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, byValue2, byValue3, byValue4, byValue5, byValue6, byValue7, b, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceOkxPasskeyManagerHandling$createCredential$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Aml
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyManagerHandling.createCredential.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (C3066Aet) obj);
                }
            }, unifficallbackinterfaceokxpasskeymanagerhandling_createcredential_callback_makecall_1, new Function1() { // from class: o.Amn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyManagerHandling.createCredential.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, C3066Aet c3066Aet) {
            Intrinsics.checkNotNullParameter(c3066Aet, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeRegistrationResult.INSTANCE.lower2((Object) c3066Aet), new UniffiRustCallStatus.ByValue(null, 1, null));
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

    public static final class getAssertion implements UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2 {
        public static final int $stable = 0;
        public static final getAssertion INSTANCE = new getAssertion();

        private getAssertion() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(byValue5, "");
            Intrinsics.checkNotNullParameter(byValue6, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1 unifficallbackinterfaceokxpasskeymanagerhandling_getassertion_callback_makecall_1 = new uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$makeCall$1(FfiConverterTypeOkxPasskeyManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, byValue2, byValue3, byValue4, byValue5, byValue6, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceOkxPasskeyManagerHandling$getAssertion$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.Amm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyManagerHandling.getAssertion.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (C60207zyQ) obj);
                }
            }, unifficallbackinterfaceokxpasskeymanagerhandling_getassertion_callback_makecall_1, new Function1() { // from class: o.Amk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceOkxPasskeyManagerHandling.getAssertion.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, C60207zyQ c60207zyQ) {
            Intrinsics.checkNotNullParameter(c60207zyQ, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeAssertionResult.INSTANCE.lower2((Object) c60207zyQ), new UniffiRustCallStatus.ByValue(null, 1, null));
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

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeOkxPasskeyManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeOkxPasskeyManagerHandling.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_okxpasskeymanagerhandling(vtable);
    }
}
