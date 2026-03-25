package uniffi.oklogging;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BfX;
import o.C60173zxj;
import o.InterfaceC4494Bgd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.oklogging.UniffiVTableCallbackInterfacePlatformLogger;
import uniffi.oklogging.uniffiCallbackInterfacePlatformLogger;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfacePlatformLogger {
    public static final uniffiCallbackInterfacePlatformLogger INSTANCE = new uniffiCallbackInterfacePlatformLogger();
    public static UniffiVTableCallbackInterfacePlatformLogger.UniffiByValue vtable = new UniffiVTableCallbackInterfacePlatformLogger.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, writeLog.INSTANCE);
    public static final int $stable = 8;

    public static final class writeLog implements UniffiCallbackInterfacePlatformLoggerMethod0 {
        public static final int $stable = 0;
        public static final writeLog INSTANCE = new writeLog();

        private writeLog() {
        }

        @Override // uniffi.oklogging.UniffiCallbackInterfacePlatformLoggerMethod0
        public void callback(long j, final int i, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, final int i2, @NotNull final RustBuffer.ByValue byValue4, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4494Bgd interfaceC4494BgdCopydefault = FfiConverterTypePlatformLogger.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bgq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfacePlatformLogger.writeLog.callback$lambda$0(interfaceC4494BgdCopydefault, i, byValue, byValue2, byValue3, i2, byValue4);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bgp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfacePlatformLogger.writeLog.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BfX.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4494Bgd interfaceC4494Bgd, int i, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, int i2, RustBuffer.ByValue byValue4) {
            int iIntValue = FfiConverterInt.INSTANCE.lift(i).intValue();
            String strLift2 = FfiConverterOptionalString.INSTANCE.lift2(byValue);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4494Bgd.copydefault(iIntValue, strLift2, ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i2), ffiConverterString.lift2(byValue4));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfacePlatformLogger() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypePlatformLogger.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypePlatformLogger.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_oklogging_fn_init_callback_vtable_platformlogger(vtable);
    }
}
