package uniffi.account;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.AbstractC58575zHl;
import o.C60173zxj;
import o.C60230zyn;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultRustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.UniffiVTableCallbackInterfaceMfaServiceTrait;
import uniffi.account.uniffiCallbackInterfaceMfaServiceTrait;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceMfaServiceTrait {
    public static final uniffiCallbackInterfaceMfaServiceTrait INSTANCE = new uniffiCallbackInterfaceMfaServiceTrait();
    public static UniffiVTableCallbackInterfaceMfaServiceTrait.UniffiByValue vtable = new UniffiVTableCallbackInterfaceMfaServiceTrait.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, verifyMfa.INSTANCE);
    public static final int $stable = 8;

    public static final class verifyMfa implements UniffiCallbackInterfaceMfaServiceTraitMethod0 {
        public static final int $stable = 0;
        public static final verifyMfa INSTANCE = new verifyMfa();

        private verifyMfa() {
        }

        @Override // uniffi.account.UniffiCallbackInterfaceMfaServiceTraitMethod0
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, byte b, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1 unifficallbackinterfacemfaservicetrait_verifymfa_callback_makecall_1 = new uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1(FfiConverterTypeMfaServiceTrait.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, byValue2, byValue3, b, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.AjZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceMfaServiceTrait.verifyMfa.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (AbstractC58575zHl) obj);
                }
            }, unifficallbackinterfacemfaservicetrait_verifymfa_callback_makecall_1, new Function1() { // from class: o.Akd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceMfaServiceTrait.verifyMfa.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, C60230zyn.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, AbstractC58575zHl abstractC58575zHl) {
            Intrinsics.checkNotNullParameter(abstractC58575zHl, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(C60230zyn.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeMfaServiceResult.INSTANCE.lower2((Object) abstractC58575zHl), new UniffiRustCallStatus.ByValue(null, 1, null));
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

    private uniffiCallbackInterfaceMfaServiceTrait() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeMfaServiceTrait.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeMfaServiceTrait.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_account_fn_init_callback_vtable_mfaservicetrait(vtable);
    }
}
