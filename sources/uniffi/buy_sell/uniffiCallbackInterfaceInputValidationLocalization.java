package uniffi.buy_sell;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3792Asd;
import o.C60173zxj;
import o.InterfaceC3796Ash;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.UniffiVTableCallbackInterfaceInputValidationLocalization;
import uniffi.buy_sell.uniffiCallbackInterfaceInputValidationLocalization;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceInputValidationLocalization {
    public static final uniffiCallbackInterfaceInputValidationLocalization INSTANCE = new uniffiCallbackInterfaceInputValidationLocalization();
    public static UniffiVTableCallbackInterfaceInputValidationLocalization.UniffiByValue vtable = new UniffiVTableCallbackInterfaceInputValidationLocalization.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getBuyLocalizedErrorMessage.INSTANCE, getSellLocalizedErrorMessage.INSTANCE);
    public static final int $stable = 8;

    public static final class getBuyLocalizedErrorMessage implements UniffiCallbackInterfaceInputValidationLocalizationMethod0 {
        public static final int $stable = 0;
        public static final getBuyLocalizedErrorMessage INSTANCE = new getBuyLocalizedErrorMessage();

        private getBuyLocalizedErrorMessage() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3796Ash interfaceC3796AshCopydefault = FfiConverterTypeInputValidationLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceInputValidationLocalization.getBuyLocalizedErrorMessage.callback$lambda$0(interfaceC3796AshCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceInputValidationLocalization.getBuyLocalizedErrorMessage.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C3722ArM.uniffiRustBuffer;
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
        public static final String callback$lambda$0(InterfaceC3796Ash interfaceC3796Ash, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC3796Ash.KWHzl((InputValidationResult) FfiConverterTypeInputValidationResult.INSTANCE.lift2(byValue), (C3792Asd) FfiConverterTypeErrorMessageItem.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceInputValidationLocalization() {
    }

    public static final class getSellLocalizedErrorMessage implements UniffiCallbackInterfaceInputValidationLocalizationMethod1 {
        public static final int $stable = 0;
        public static final getSellLocalizedErrorMessage INSTANCE = new getSellLocalizedErrorMessage();

        private getSellLocalizedErrorMessage() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3796Ash interfaceC3796AshCopydefault = FfiConverterTypeInputValidationLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceInputValidationLocalization.getSellLocalizedErrorMessage.callback$lambda$0(interfaceC3796AshCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceInputValidationLocalization.getSellLocalizedErrorMessage.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C3722ArM.uniffiRustBuffer;
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
        public static final String callback$lambda$0(InterfaceC3796Ash interfaceC3796Ash, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC3796Ash.OLrzqt((InputValidationResult) FfiConverterTypeInputValidationResult.INSTANCE.lift2(byValue), (C3792Asd) FfiConverterTypeErrorMessageItem.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
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
            FfiConverterTypeInputValidationLocalization.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeInputValidationLocalization.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_buy_sell_fn_init_callback_vtable_inputvalidationlocalization(vtable);
    }
}
