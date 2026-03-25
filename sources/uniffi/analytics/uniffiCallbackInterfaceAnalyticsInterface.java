package uniffi.analytics;

import com.sun.jna.Pointer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3551AoA;
import o.C3554AoD;
import o.C3599Aow;
import o.C60173zxj;
import o.InterfaceC3591Aoo;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.analytics.UniffiVTableCallbackInterfaceAnalyticsInterface;
import uniffi.analytics.uniffiCallbackInterfaceAnalyticsInterface;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceAnalyticsInterface {
    public static final uniffiCallbackInterfaceAnalyticsInterface INSTANCE = new uniffiCallbackInterfaceAnalyticsInterface();
    public static UniffiVTableCallbackInterfaceAnalyticsInterface.UniffiByValue vtable = new UniffiVTableCallbackInterfaceAnalyticsInterface.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, trackEvent.INSTANCE, reportToGrafana.INSTANCE, reportException.INSTANCE);
    public static final int $stable = 8;

    public static final class trackEvent implements UniffiCallbackInterfaceAnalyticsInterfaceMethod0 {
        public static final int $stable = 0;
        public static final trackEvent INSTANCE = new trackEvent();

        private trackEvent() {
        }

        @Override // uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull final RustBuffer.ByValue byValue2, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3591Aoo interfaceC3591AooCopydefault = FfiConverterTypeAnalyticsInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AoG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceAnalyticsInterface.trackEvent.callback$lambda$0(interfaceC3591AooCopydefault, byValue, byValue2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AoO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAnalyticsInterface.trackEvent.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3599Aow.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC3591Aoo interfaceC3591Aoo, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2) {
            interfaceC3591Aoo.KWHzl(FfiConverterString.INSTANCE.lift2(byValue), (List) FfiConverterSequenceTypeTrackEventParam.INSTANCE.lift2(byValue2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceAnalyticsInterface() {
    }

    public static final class reportToGrafana implements UniffiCallbackInterfaceAnalyticsInterfaceMethod1 {
        public static final int $stable = 0;
        public static final reportToGrafana INSTANCE = new reportToGrafana();

        private reportToGrafana() {
        }

        @Override // uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3591Aoo interfaceC3591AooCopydefault = FfiConverterTypeAnalyticsInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AoF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceAnalyticsInterface.reportToGrafana.callback$lambda$0(interfaceC3591AooCopydefault, byValue, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AoI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAnalyticsInterface.reportToGrafana.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3599Aow.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC3591Aoo interfaceC3591Aoo, RustBuffer.ByValue byValue, byte b) {
            interfaceC3591Aoo.AEQbTJ((C3551AoA) FfiConverterTypeGrafanaEventData.INSTANCE.lift2(byValue), FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class reportException implements UniffiCallbackInterfaceAnalyticsInterfaceMethod2 {
        public static final int $stable = 0;
        public static final reportException INSTANCE = new reportException();

        private reportException() {
        }

        @Override // uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3591Aoo interfaceC3591AooCopydefault = FfiConverterTypeAnalyticsInterface.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AoH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceAnalyticsInterface.reportException.callback$lambda$0(interfaceC3591AooCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AoJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceAnalyticsInterface.reportException.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3599Aow.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC3591Aoo interfaceC3591Aoo, RustBuffer.ByValue byValue) {
            interfaceC3591Aoo.AEQbTJ((C3554AoD) FfiConverterTypeExceptionData.INSTANCE.lift2(byValue));
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
            FfiConverterTypeAnalyticsInterface.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeAnalyticsInterface.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_analytics_fn_init_callback_vtable_analyticsinterface(vtable);
    }
}
