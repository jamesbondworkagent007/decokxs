package uniffi.shared_preference;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C4832Bsr;
import o.C60173zxj;
import o.InterfaceC4812Bry;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.shared_preference.UniffiVTableCallbackInterfaceSharedPreferencesInterface;
import uniffi.shared_preference.uniffiCallbackInterfaceSharedPreferencesInterface;

/* JADX INFO: loaded from: classes14.dex */
public final class uniffiCallbackInterfaceSharedPreferencesInterface {
    public static final uniffiCallbackInterfaceSharedPreferencesInterface INSTANCE = new uniffiCallbackInterfaceSharedPreferencesInterface();
    public static UniffiVTableCallbackInterfaceSharedPreferencesInterface.UniffiByValue vtable = new UniffiVTableCallbackInterfaceSharedPreferencesInterface.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, getString.INSTANCE, setString.INSTANCE, getBool.INSTANCE, setBool.INSTANCE, getI32.INSTANCE, setI32.INSTANCE, getI64.INSTANCE, setI64.INSTANCE, getF64.INSTANCE, setF64.INSTANCE, getStringList.INSTANCE, setStringList.INSTANCE, getJsonString.INSTANCE, setJsonString.INSTANCE, contains.INSTANCE, remove.INSTANCE, clear.INSTANCE, keys.INSTANCE);
    public static final int $stable = 8;

    public static final class getString implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod0 {
        public static final int $stable = 0;
        public static final getString INSTANCE = new getString();

        private getString() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getString.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getString.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final String callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.valueOf(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceSharedPreferencesInterface() {
    }

    public static final class setString implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod1 {
        public static final int $stable = 0;
        public static final setString INSTANCE = new setString();

        private setString() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setString.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, byValue3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setString.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3) {
            String strLift2 = FfiConverterOptionalString.INSTANCE.lift2(byValue);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4812Bry.AEQbTJ(strLift2, ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getBool implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod2 {
        public static final int $stable = 0;
        public static final getBool INSTANCE = new getBool();

        private getBool() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bsu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getBool.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bst
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getBool.callback$lambda$1(rustBuffer, (java.lang.Boolean) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final Boolean callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.copydefault(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, Boolean bool) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalBoolean.INSTANCE.lower2(bool));
            return Unit.INSTANCE;
        }
    }

    public static final class setBool implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod3 {
        public static final int $stable = 0;
        public static final setBool INSTANCE = new setBool();

        private setBool() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setBool.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setBool.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, byte b) {
            interfaceC4812Bry.KWHzl(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2), FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getI32 implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod4 {
        public static final int $stable = 0;
        public static final getI32 INSTANCE = new getI32();

        private getI32() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bsy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getI32.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bsx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getI32.callback$lambda$1(rustBuffer, (java.lang.Integer) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final Integer callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.OLrzqt(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, Integer num) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalInt.INSTANCE.lower2(num));
            return Unit.INSTANCE;
        }
    }

    public static final class setI32 implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod5 {
        public static final int $stable = 0;
        public static final setI32 INSTANCE = new setI32();

        private setI32() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final int i, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setI32.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, i);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setI32.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, int i) {
            interfaceC4812Bry.EZpvd(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2), FfiConverterInt.INSTANCE.lift(i).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getI64 implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod6 {
        public static final int $stable = 0;
        public static final getI64 INSTANCE = new getI64();

        private getI64() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bsz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getI64.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getI64.callback$lambda$1(rustBuffer, (java.lang.Long) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final Long callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.EZpvd(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, Long l) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalLong.INSTANCE.lower2(l));
            return Unit.INSTANCE;
        }
    }

    public static final class setI64 implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod7 {
        public static final int $stable = 0;
        public static final setI64 INSTANCE = new setI64();

        private setI64() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod7
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final long j2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setI64.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setI64.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, long j) {
            interfaceC4812Bry.AEQbTJ(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2), FfiConverterLong.INSTANCE.lift(j).longValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getF64 implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod8 {
        public static final int $stable = 0;
        public static final getF64 INSTANCE = new getF64();

        private getF64() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod8
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getF64.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getF64.callback$lambda$1(rustBuffer, (java.lang.Double) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final Double callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.AEQbTJ(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, Double d) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalDouble.INSTANCE.lower2(d));
            return Unit.INSTANCE;
        }
    }

    public static final class setF64 implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod9 {
        public static final int $stable = 0;
        public static final setF64 INSTANCE = new setF64();

        private setF64() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod9
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final double d, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setF64.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, d);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setF64.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, double d) {
            interfaceC4812Bry.AEQbTJ(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2), FfiConverterDouble.INSTANCE.lift(d).doubleValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getStringList implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod10 {
        public static final int $stable = 0;
        public static final getStringList INSTANCE = new getStringList();

        private getStringList() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod10
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getStringList.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getStringList.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final List callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.AYXKKw(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalSequenceString.INSTANCE.lower2(list));
            return Unit.INSTANCE;
        }
    }

    public static final class setStringList implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod11 {
        public static final int $stable = 0;
        public static final setStringList INSTANCE = new setStringList();

        private setStringList() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod11
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bta
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setStringList.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, byValue3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setStringList.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3) {
            interfaceC4812Bry.KWHzl(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2), (List<String>) FfiConverterSequenceString.INSTANCE.lift2(byValue3));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class getJsonString implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod12 {
        public static final int $stable = 0;
        public static final getJsonString INSTANCE = new getJsonString();

        private getJsonString() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod12
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getJsonString.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.getJsonString.callback$lambda$1(rustBuffer, (java.lang.String) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final String callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.djBIcL(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class setJsonString implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod13 {
        public static final int $stable = 0;
        public static final setJsonString INSTANCE = new setJsonString();

        private setJsonString() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod13
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setJsonString.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2, byValue3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.setJsonString.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3) {
            String strLift2 = FfiConverterOptionalString.INSTANCE.lift2(byValue);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            interfaceC4812Bry.EZpvd(strLift2, ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class contains implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod14 {
        public static final int $stable = 0;
        public static final contains INSTANCE = new contains();

        private contains() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod14
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final ByteByReference byteByReference, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byteByReference, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bsv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(uniffiCallbackInterfaceSharedPreferencesInterface.contains.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2));
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bss
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.contains.callback$lambda$1(byteByReference, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final boolean callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            return interfaceC4812Bry.KWHzl(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(ByteByReference byteByReference, boolean z) {
            byteByReference.setValue(FfiConverterBoolean.INSTANCE.lower(z).byteValue());
            return Unit.INSTANCE;
        }
    }

    public static final class remove implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod15 {
        public static final int $stable = 0;
        public static final remove INSTANCE = new remove();

        private remove() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod15
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.remove.callback$lambda$0(interfaceC4812BryCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.remove.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            interfaceC4812Bry.AhwBna(FfiConverterOptionalString.INSTANCE.lift2(byValue), FfiConverterString.INSTANCE.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class clear implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod16 {
        public static final int $stable = 0;
        public static final clear INSTANCE = new clear();

        private clear() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod16
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bsq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.clear.callback$lambda$0(interfaceC4812BryCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bsw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.clear.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4832Bsr.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue) {
            interfaceC4812Bry.AEQbTJ(FfiConverterString.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class keys implements UniffiCallbackInterfaceSharedPreferencesInterfaceMethod17 {
        public static final int $stable = 0;
        public static final keys INSTANCE = new keys();

        private keys() {
        }

        @Override // uniffi.shared_preference.UniffiCallbackInterfaceSharedPreferencesInterfaceMethod17
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4812Bry interfaceC4812BryCopydefault = FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BsH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.keys.callback$lambda$0(interfaceC4812BryCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BsI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharedPreferencesInterface.keys.callback$lambda$1(rustBuffer, (java.util.List) obj);
                }
            };
            RustBuffer rustBuffer2 = C4832Bsr.uniffiRustBuffer;
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
        public static final List callback$lambda$0(InterfaceC4812Bry interfaceC4812Bry, RustBuffer.ByValue byValue) {
            return interfaceC4812Bry.EZpvd(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterSequenceString.INSTANCE.lower2((Object) list));
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
            FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeSharedPreferencesInterface.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void KWHzl(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_shared_preference_fn_init_callback_vtable_sharedpreferencesinterface(vtable);
    }
}
