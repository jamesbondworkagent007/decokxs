package uniffi.account;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C58953zVp;
import o.C60173zxj;
import o.C60230zyn;
import o.zWT;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultRustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfacePasskeySdkTrait;
import uniffi.account.uniffiCallbackInterfacePasskeySDKTrait;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePasskeySDKTrait {
    public static final uniffiCallbackInterfacePasskeySDKTrait INSTANCE = new uniffiCallbackInterfacePasskeySDKTrait();
    public static UniffiVTableCallbackInterfacePasskeySdkTrait.UniffiByValue vtable = new UniffiVTableCallbackInterfacePasskeySdkTrait.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, assertPasskey.INSTANCE, assertUsingInHousePasskey.INSTANCE, registerPasskey.INSTANCE);
    public static final int $stable = 8;

    public static final class assertPasskey implements UniffiCallbackInterfacePasskeySdkTraitMethod0 {
        public static final int $stable = 0;
        public static final assertPasskey INSTANCE = new assertPasskey();

        private assertPasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfacePasskeySDKTrait$assertPasskey$callback$makeCall$1 unifficallbackinterfacepasskeysdktrait_assertpasskey_callback_makecall_1 = new uniffiCallbackInterfacePasskeySDKTrait$assertPasskey$callback$makeCall$1(FfiConverterTypePasskeySDKTrait.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, b, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfacePasskeySDKTrait$assertPasskey$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AmN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySDKTrait.assertPasskey.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (C58953zVp) obj);
                }
            }, unifficallbackinterfacepasskeysdktrait_assertpasskey_callback_makecall_1, new Function1() { // from class: o.AmM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySDKTrait.assertPasskey.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, C58953zVp c58953zVp) {
            Intrinsics.checkNotNullParameter(c58953zVp, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypePasskeyAssertionResponse.INSTANCE.lower2((Object) c58953zVp), new UniffiRustCallStatus.ByValue(null, 1, null));
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

    private uniffiCallbackInterfacePasskeySDKTrait() {
    }

    public static final class assertUsingInHousePasskey implements UniffiCallbackInterfacePasskeySdkTraitMethod1 {
        public static final int $stable = 0;
        public static final assertUsingInHousePasskey INSTANCE = new assertUsingInHousePasskey();

        private assertUsingInHousePasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfacePasskeySDKTrait$assertUsingInHousePasskey$callback$makeCall$1 unifficallbackinterfacepasskeysdktrait_assertusinginhousepasskey_callback_makecall_1 = new uniffiCallbackInterfacePasskeySDKTrait$assertUsingInHousePasskey$callback$makeCall$1(FfiConverterTypePasskeySDKTrait.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfacePasskeySDKTrait$assertUsingInHousePasskey$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AmL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySDKTrait.assertUsingInHousePasskey.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (C58953zVp) obj);
                }
            }, unifficallbackinterfacepasskeysdktrait_assertusinginhousepasskey_callback_makecall_1, new Function1() { // from class: o.AmO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySDKTrait.assertUsingInHousePasskey.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, C58953zVp c58953zVp) {
            Intrinsics.checkNotNullParameter(c58953zVp, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypePasskeyAssertionResponse.INSTANCE.lower2((Object) c58953zVp), new UniffiRustCallStatus.ByValue(null, 1, null));
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

    public static final class registerPasskey implements UniffiCallbackInterfacePasskeySdkTraitMethod2 {
        public static final int $stable = 0;
        public static final registerPasskey INSTANCE = new registerPasskey();

        private registerPasskey() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfacePasskeySDKTrait$registerPasskey$callback$makeCall$1 unifficallbackinterfacepasskeysdktrait_registerpasskey_callback_makecall_1 = new uniffiCallbackInterfacePasskeySDKTrait$registerPasskey$callback$makeCall$1(FfiConverterTypePasskeySDKTrait.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, b, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfacePasskeySDKTrait$registerPasskey$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AmP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySDKTrait.registerPasskey.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (zWT) obj);
                }
            }, unifficallbackinterfacepasskeysdktrait_registerpasskey_callback_makecall_1, new Function1() { // from class: o.AmS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeySDKTrait.registerPasskey.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, zWT zwt) {
            Intrinsics.checkNotNullParameter(zwt, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypePasskeyRegistrationResponse.INSTANCE.lower2((Object) zwt), new UniffiRustCallStatus.ByValue(null, 1, null));
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
            FfiConverterTypePasskeySDKTrait.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePasskeySDKTrait.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_passkeysdktrait(vtable);
    }
}
