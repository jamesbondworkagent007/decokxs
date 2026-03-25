package uniffi.buy_sell;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C60173zxj;
import o.InterfaceC3696Aqn;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.UniffiVTableCallbackInterfaceBuySellFormatter;
import uniffi.buy_sell.uniffiCallbackInterfaceBuySellFormatter;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceBuySellFormatter {
    public static final uniffiCallbackInterfaceBuySellFormatter INSTANCE = new uniffiCallbackInterfaceBuySellFormatter();
    public static UniffiVTableCallbackInterfaceBuySellFormatter.UniffiByValue vtable = new UniffiVTableCallbackInterfaceBuySellFormatter.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, formatFiatWithSymbolMax.INSTANCE, formatFiatWithSymbolMinmax.INSTANCE, formatFiatWithCodeMax.INSTANCE, formatFiatWithCodeMinmax.INSTANCE, formatCrypto.INSTANCE, formatExchangeRate.INSTANCE, toPlainString.INSTANCE, formatPlainString.INSTANCE);
    public static final int $stable = 8;

    public static final class formatFiatWithSymbolMax implements UniffiCallbackInterfaceBuySellFormatterMethod0 {
        public static final int $stable = 0;
        public static final formatFiatWithSymbolMax INSTANCE = new formatFiatWithSymbolMax();

        private formatFiatWithSymbolMax() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final int i, final int i2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithSymbolMax.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, byValue2, i, i2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithSymbolMax.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, int i, int i2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC3696Aqn.EZpvd(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), FfiConverterInt.INSTANCE.lift(i).intValue(), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceBuySellFormatter() {
    }

    public static final class formatFiatWithSymbolMinmax implements UniffiCallbackInterfaceBuySellFormatterMethod1 {
        public static final int $stable = 0;
        public static final formatFiatWithSymbolMinmax INSTANCE = new formatFiatWithSymbolMinmax();

        private formatFiatWithSymbolMinmax() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final int i, final int i2, final int i3, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithSymbolMinmax.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, byValue2, i, i2, i3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithSymbolMinmax.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, int i, int i2, int i3) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            String strLift2 = ffiConverterString.lift2(byValue);
            String strLift22 = ffiConverterString.lift2(byValue2);
            int iIntValue = FfiConverterInt.INSTANCE.lift(i).intValue();
            FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
            return interfaceC3696Aqn.copydefault(strLift2, strLift22, iIntValue, ffiConverterUInt.m9550liftOGnWXxg(i2), ffiConverterUInt.m9550liftOGnWXxg(i3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatFiatWithCodeMax implements UniffiCallbackInterfaceBuySellFormatterMethod2 {
        public static final int $stable = 0;
        public static final formatFiatWithCodeMax INSTANCE = new formatFiatWithCodeMax();

        private formatFiatWithCodeMax() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final int i, final int i2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithCodeMax.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, byValue2, i, i2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithCodeMax.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, int i, int i2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC3696Aqn.AEQbTJ(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), FfiConverterInt.INSTANCE.lift(i).intValue(), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatFiatWithCodeMinmax implements UniffiCallbackInterfaceBuySellFormatterMethod3 {
        public static final int $stable = 0;
        public static final formatFiatWithCodeMinmax INSTANCE = new formatFiatWithCodeMinmax();

        private formatFiatWithCodeMinmax() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final int i, final int i2, final int i3, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithCodeMinmax.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, byValue2, i, i2, i3);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatFiatWithCodeMinmax.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, int i, int i2, int i3) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            String strLift2 = ffiConverterString.lift2(byValue);
            String strLift22 = ffiConverterString.lift2(byValue2);
            int iIntValue = FfiConverterInt.INSTANCE.lift(i).intValue();
            FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
            return interfaceC3696Aqn.OLrzqt(strLift2, strLift22, iIntValue, ffiConverterUInt.m9550liftOGnWXxg(i2), ffiConverterUInt.m9550liftOGnWXxg(i3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatCrypto implements UniffiCallbackInterfaceBuySellFormatterMethod4 {
        public static final int $stable = 0;
        public static final formatCrypto INSTANCE = new formatCrypto();

        private formatCrypto() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, final int i, final int i2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatCrypto.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, byValue2, i, i2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatCrypto.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, int i, int i2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC3696Aqn.KWHzl(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), FfiConverterInt.INSTANCE.lift(i).intValue(), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatExchangeRate implements UniffiCallbackInterfaceBuySellFormatterMethod5 {
        public static final int $stable = 0;
        public static final formatExchangeRate INSTANCE = new formatExchangeRate();

        private formatExchangeRate() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod5
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer.ByValue byValue3, @NotNull final RustBuffer.ByValue byValue4, final int i, final int i2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(byValue3, "");
            Intrinsics.checkNotNullParameter(byValue4, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatExchangeRate.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, byValue2, byValue3, byValue4, i, i2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatExchangeRate.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, RustBuffer.ByValue byValue4, int i, int i2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC3696Aqn.OLrzqt(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2), ffiConverterString.lift2(byValue3), ffiConverterString.lift2(byValue4), FfiConverterInt.INSTANCE.lift(i).intValue(), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class toPlainString implements UniffiCallbackInterfaceBuySellFormatterMethod6 {
        public static final int $stable = 0;
        public static final toPlainString INSTANCE = new toPlainString();

        private toPlainString() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, final int i, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.toPlainString.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, i);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.toPlainString.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, int i) {
            return interfaceC3696Aqn.AEQbTJ(FfiConverterString.INSTANCE.lift2(byValue), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatPlainString implements UniffiCallbackInterfaceBuySellFormatterMethod7 {
        public static final int $stable = 0;
        public static final formatPlainString INSTANCE = new formatPlainString();

        private formatPlainString() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceBuySellFormatterMethod7
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, final int i, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3696Aqn interfaceC3696AqnCopydefault = FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AvO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceBuySellFormatter.formatPlainString.callback$lambda$0(interfaceC3696AqnCopydefault, byValue, i);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AvQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceBuySellFormatter.formatPlainString.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3696Aqn interfaceC3696Aqn, RustBuffer.ByValue byValue, int i) {
            return interfaceC3696Aqn.EZpvd(FfiConverterString.INSTANCE.lift2(byValue), FfiConverterUInt.INSTANCE.m9550liftOGnWXxg(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            rustBuffer.setValue$OKCore_deploy(FfiConverterOptionalString.INSTANCE.lower2(str));
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
            FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeBuySellFormatter.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_buy_sell_fn_init_callback_vtable_buysellformatter(vtable);
    }
}
