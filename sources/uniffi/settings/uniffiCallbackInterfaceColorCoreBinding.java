package uniffi.settings;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BlN;
import o.BoN;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.settings.UniffiVTableCallbackInterfaceColorCoreBinding;
import uniffi.settings.uniffiCallbackInterfaceColorCoreBinding;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceColorCoreBinding {
    public static final uniffiCallbackInterfaceColorCoreBinding INSTANCE = new uniffiCallbackInterfaceColorCoreBinding();
    public static UniffiVTableCallbackInterfaceColorCoreBinding.UniffiByValue vtable = new UniffiVTableCallbackInterfaceColorCoreBinding.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, setThemeMode.INSTANCE, setColorTheme.INSTANCE, getThemeMode.INSTANCE, getColorTheme.INSTANCE, emitThemeChange.INSTANCE);
    public static final int $stable = 8;

    public static final class setThemeMode implements UniffiCallbackInterfaceColorCoreBindingMethod0 {
        public static final int $stable = 0;
        public static final setThemeMode INSTANCE = new setThemeMode();

        private setThemeMode() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod0
        public void callback(long j, final int i, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BlN blNCopydefault = FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bqx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceColorCoreBinding.setThemeMode.callback$lambda$0(blNCopydefault, i));
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bqw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceColorCoreBinding.setThemeMode.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(BlN blN, int i) {
            return blN.EZpvd(FfiConverterInt.INSTANCE.lift(i).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceColorCoreBinding() {
    }

    public static final class setColorTheme implements UniffiCallbackInterfaceColorCoreBindingMethod1 {
        public static final int $stable = 0;
        public static final setColorTheme INSTANCE = new setColorTheme();

        private setColorTheme() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod1
        public void callback(long j, final int i, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BlN blNCopydefault = FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bqy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceColorCoreBinding.setColorTheme.callback$lambda$0(blNCopydefault, i));
                }
            };
            Function1 function1 = new Function1() { // from class: o.BqA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceColorCoreBinding.setColorTheme.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(BlN blN, int i) {
            return blN.copydefault(FfiConverterInt.INSTANCE.lift(i).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getThemeMode implements UniffiCallbackInterfaceColorCoreBindingMethod2 {
        public static final int $stable = 0;
        public static final getThemeMode INSTANCE = new getThemeMode();

        private getThemeMode() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod2
        public void callback(long j, @NotNull final IntByReference intByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(intByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BlN blNCopydefault = FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bqr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(blNCopydefault.EZpvd());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bqu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceColorCoreBinding.getThemeMode.callback$lambda$1(intByReference, ((java.lang.Integer) obj).intValue());
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(IntByReference intByReference, int i) {
            intByReference.setValue(FfiConverterInt.INSTANCE.lower(i).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class getColorTheme implements UniffiCallbackInterfaceColorCoreBindingMethod3 {
        public static final int $stable = 0;
        public static final getColorTheme INSTANCE = new getColorTheme();

        private getColorTheme() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod3
        public void callback(long j, @NotNull final IntByReference intByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(intByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BlN blNCopydefault = FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bqv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(blNCopydefault.copydefault());
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bqs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceColorCoreBinding.getColorTheme.callback$lambda$1(intByReference, ((java.lang.Integer) obj).intValue());
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
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
        public static final Unit callback$lambda$1(IntByReference intByReference, int i) {
            intByReference.setValue(FfiConverterInt.INSTANCE.lower(i).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class emitThemeChange implements UniffiCallbackInterfaceColorCoreBindingMethod4 {
        public static final int $stable = 0;
        public static final emitThemeChange INSTANCE = new emitThemeChange();

        private emitThemeChange() {
        }

        @Override // uniffi.settings.UniffiCallbackInterfaceColorCoreBindingMethod4
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BlN blNCopydefault = FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bqm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceColorCoreBinding.emitThemeChange.callback$lambda$0(blNCopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bqt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceColorCoreBinding.emitThemeChange.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BoN.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(BlN blN) {
            blN.AEQbTJ();
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
            FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeColorCoreBinding.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_settings_fn_init_callback_vtable_colorcorebinding(vtable);
    }
}
