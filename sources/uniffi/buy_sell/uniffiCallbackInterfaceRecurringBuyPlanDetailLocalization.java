package uniffi.buy_sell;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C60173zxj;
import o.InterfaceC3849Ath;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanDetailLocalization;
import uniffi.buy_sell.uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization {
    public static final uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization INSTANCE = new uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization();
    public static UniffiVTableCallbackInterfaceRecurringBuyPlanDetailLocalization.UniffiByValue vtable = new UniffiVTableCallbackInterfaceRecurringBuyPlanDetailLocalization.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, formatFrequency.INSTANCE, formatDate.INSTANCE, formatFrequencyOptionDate.INSTANCE, getBannerTitle.INSTANCE, getBannerMessage.INSTANCE, getDepositButtonLabel.INSTANCE, formatBuyAmount.INSTANCE);
    public static final int $stable = 8;

    public static final class formatFrequency implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod0 {
        public static final int $stable = 0;
        public static final formatFrequency INSTANCE = new formatFrequency();

        private formatFrequency() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatFrequency.callback$lambda$0(interfaceC3849AthCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatFrequency.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, RustBuffer.ByValue byValue) {
            return interfaceC3849Ath.KWHzl(FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization() {
    }

    public static final class formatDate implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod1 {
        public static final int $stable = 0;
        public static final formatDate INSTANCE = new formatDate();

        private formatDate() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod1
        public void callback(long j, final long j2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatDate.callback$lambda$0(interfaceC3849AthCopydefault, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatDate.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, long j) {
            return interfaceC3849Ath.copydefault(FfiConverterLong.INSTANCE.lift(j).longValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatFrequencyOptionDate implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod2 {
        public static final int $stable = 0;
        public static final formatFrequencyOptionDate INSTANCE = new formatFrequencyOptionDate();

        private formatFrequencyOptionDate() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod2
        public void callback(long j, final long j2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatFrequencyOptionDate.callback$lambda$0(interfaceC3849AthCopydefault, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatFrequencyOptionDate.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, long j) {
            return interfaceC3849Ath.KWHzl(FfiConverterLong.INSTANCE.lift(j).longValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class getBannerTitle implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod3 {
        public static final int $stable = 0;
        public static final getBannerTitle INSTANCE = new getBannerTitle();

        private getBannerTitle() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod3
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.getBannerTitle.callback$lambda$0(interfaceC3849AthCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.getBannerTitle.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, RustBuffer.ByValue byValue) {
            return interfaceC3849Ath.AEQbTJ((RecurringBuyPlanDetailErrorCase) FfiConverterTypeRecurringBuyPlanDetailErrorCase.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class getBannerMessage implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod4 {
        public static final int $stable = 0;
        public static final getBannerMessage INSTANCE = new getBannerMessage();

        private getBannerMessage() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod4
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.getBannerMessage.callback$lambda$0(interfaceC3849AthCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.getBannerMessage.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, RustBuffer.ByValue byValue) {
            return interfaceC3849Ath.copydefault((RecurringBuyPlanDetailErrorCase) FfiConverterTypeRecurringBuyPlanDetailErrorCase.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class getDepositButtonLabel implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod5 {
        public static final int $stable = 0;
        public static final getDepositButtonLabel INSTANCE = new getDepositButtonLabel();

        private getDepositButtonLabel() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod5
        public void callback(long j, final byte b, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.getDepositButtonLabel.callback$lambda$0(interfaceC3849AthCopydefault, b, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.getDepositButtonLabel.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, byte b, RustBuffer.ByValue byValue) {
            return interfaceC3849Ath.EZpvd(FfiConverterBoolean.INSTANCE.lift(b).booleanValue(), FfiConverterString.INSTANCE.lift2(byValue));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    public static final class formatBuyAmount implements UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod6 {
        public static final int $stable = 0;
        public static final formatBuyAmount INSTANCE = new formatBuyAmount();

        private formatBuyAmount() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanDetailLocalizationMethod6
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3849Ath interfaceC3849AthCopydefault = FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Awd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatBuyAmount.callback$lambda$0(interfaceC3849AthCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.formatBuyAmount.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3849Ath interfaceC3849Ath, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return interfaceC3849Ath.OLrzqt(ffiConverterString.lift2(byValue), ffiConverterString.lift2(byValue2));
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
            FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplandetaillocalization(vtable);
    }
}
