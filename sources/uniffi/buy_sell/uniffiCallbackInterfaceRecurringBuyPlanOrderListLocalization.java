package uniffi.buy_sell;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C60173zxj;
import o.InterfaceC3950Ave;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization;
import uniffi.buy_sell.uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization {
    public static final uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization INSTANCE = new uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization();
    public static UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.UniffiByValue vtable = new UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, formatOrderDate.INSTANCE);
    public static final int $stable = 8;

    public static final class formatOrderDate implements UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0 {
        public static final int $stable = 0;
        public static final formatOrderDate INSTANCE = new formatOrderDate();

        private formatOrderDate() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0
        public void callback(long j, final long j2, @NotNull final RustBuffer rustBuffer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3950Ave interfaceC3950AveCopydefault = FfiConverterTypeRecurringBuyPlanOrderListLocalization.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AwA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization.formatOrderDate.callback$lambda$0(interfaceC3950AveCopydefault, j2);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization.formatOrderDate.callback$lambda$1(rustBuffer, (java.lang.String) obj);
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
        public static final String callback$lambda$0(InterfaceC3950Ave interfaceC3950Ave, long j) {
            return interfaceC3950Ave.EZpvd(FfiConverterLong.INSTANCE.lift(j).longValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(RustBuffer rustBuffer, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            rustBuffer.setValue$OKCore_deploy(FfiConverterString.INSTANCE.lower2(str));
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeRecurringBuyPlanOrderListLocalization.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeRecurringBuyPlanOrderListLocalization.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void EZpvd(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplanorderlistlocalization(vtable);
    }
}
