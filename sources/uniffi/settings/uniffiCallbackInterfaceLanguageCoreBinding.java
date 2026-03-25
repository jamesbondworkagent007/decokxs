package uniffi.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.BoN;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteI8;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultI8;
import uniffi.UniffiRustCallStatus;
import uniffi.settings.UniffiVTableCallbackInterfaceLanguageCoreBinding;
import uniffi.settings.uniffiCallbackInterfaceLanguageCoreBinding;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceLanguageCoreBinding {
    public static final uniffiCallbackInterfaceLanguageCoreBinding INSTANCE = new uniffiCallbackInterfaceLanguageCoreBinding();
    public static UniffiVTableCallbackInterfaceLanguageCoreBinding.UniffiByValue vtable = new UniffiVTableCallbackInterfaceLanguageCoreBinding.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, setAppLanguage.INSTANCE);
    public static final int $stable = 8;

    public static final class setAppLanguage implements UniffiCallbackInterfaceLanguageCoreBindingMethod0 {
        public static final int $stable = 0;
        public static final setAppLanguage INSTANCE = new setAppLanguage();

        private setAppLanguage() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceLanguageCoreBindingMethod0
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteI8, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1 unifficallbackinterfacelanguagecorebinding_setapplanguage_callback_makecall_1 = new uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$makeCall$1(FfiConverterTypeLanguageCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceLanguageCoreBinding$setAppLanguage$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.BqJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLanguageCoreBinding.setAppLanguage.callback$lambda$0(uniffiForeignFutureCompleteI8, j2, ((java.lang.Boolean) obj).booleanValue());
                }
            }, unifficallbackinterfacelanguagecorebinding_setapplanguage_callback_makecall_1, new Function1() { // from class: o.BqK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceLanguageCoreBinding.setAppLanguage.callback$lambda$1(uniffiForeignFutureCompleteI8, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, BoN.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, boolean z) {
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteI8 uniffiForeignFutureCompleteI8, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultI8.UniffiByValue uniffiByValue = new UniffiForeignFutureResultI8.UniffiByValue(BoN.uniffiRustBuffer.getRustBufferOp(), (byte) 0, byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteI8.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceLanguageCoreBinding() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeLanguageCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeLanguageCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_settings_fn_init_callback_vtable_languagecorebinding(vtable);
    }
}
