package uniffi.account;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C60173zxj;
import o.C60230zyn;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteI8;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultI8;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfacePasskeyCoreBinding;
import uniffi.account.uniffiCallbackInterfacePasskeyCoreBinding;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePasskeyCoreBinding {
    public static final uniffiCallbackInterfacePasskeyCoreBinding INSTANCE = new uniffiCallbackInterfacePasskeyCoreBinding();
    public static UniffiVTableCallbackInterfacePasskeyCoreBinding.UniffiByValue vtable = new UniffiVTableCallbackInterfacePasskeyCoreBinding.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, isPasskeyEntryEnableInSecurityCenter.INSTANCE);
    public static final int $stable = 8;

    public static final class isPasskeyEntryEnableInSecurityCenter implements UniffiCallbackInterfacePasskeyCoreBindingMethod0 {
        public static final int $stable = 0;
        public static final isPasskeyEntryEnableInSecurityCenter INSTANCE = new isPasskeyEntryEnableInSecurityCenter();

        private isPasskeyEntryEnableInSecurityCenter() {
        }

        @Override // uniffi.account.UniffiCallbackInterfacePasskeyCoreBindingMethod0
        public void callback(long j, byte b, @NotNull final UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteI8, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfacePasskeyCoreBinding$isPasskeyEntryEnableInSecurityCenter$callback$makeCall$1 unifficallbackinterfacepasskeycorebinding_ispasskeyentryenableinsecuritycenter_callback_makecall_1 = new uniffiCallbackInterfacePasskeyCoreBinding$isPasskeyEntryEnableInSecurityCenter$callback$makeCall$1(FfiConverterTypePasskeyCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), b, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfacePasskeyCoreBinding$isPasskeyEntryEnableInSecurityCenter$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.AmC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeyCoreBinding.isPasskeyEntryEnableInSecurityCenter.callback$lambda$0(uniffiForeignFutureCompleteI8, j2, ((java.lang.Boolean) obj).booleanValue());
                }
            }, unifficallbackinterfacepasskeycorebinding_ispasskeyentryenableinsecuritycenter_callback_makecall_1, new Function1() { // from class: o.AmE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePasskeyCoreBinding.isPasskeyEntryEnableInSecurityCenter.callback$lambda$1(uniffiForeignFutureCompleteI8, j2, (UniffiRustCallStatus.ByValue) obj);
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

    private uniffiCallbackInterfacePasskeyCoreBinding() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypePasskeyCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePasskeyCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_passkeycorebinding(vtable);
    }
}
