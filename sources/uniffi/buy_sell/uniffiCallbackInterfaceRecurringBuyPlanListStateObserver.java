package uniffi.buy_sell;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3871AuC;
import o.C60173zxj;
import o.InterfaceC3869AuA;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanListStateObserver;
import uniffi.buy_sell.uniffiCallbackInterfaceRecurringBuyPlanListStateObserver;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceRecurringBuyPlanListStateObserver {
    public static final uniffiCallbackInterfaceRecurringBuyPlanListStateObserver INSTANCE = new uniffiCallbackInterfaceRecurringBuyPlanListStateObserver();
    public static UniffiVTableCallbackInterfaceRecurringBuyPlanListStateObserver.UniffiByValue vtable = new UniffiVTableCallbackInterfaceRecurringBuyPlanListStateObserver.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onStateChanged.INSTANCE);
    public static final int $stable = 8;

    public static final class onStateChanged implements UniffiCallbackInterfaceRecurringBuyPlanListStateObserverMethod0 {
        public static final int $stable = 0;
        public static final onStateChanged INSTANCE = new onStateChanged();

        private onStateChanged() {
        }

        @Override // uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListStateObserverMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC3869AuA interfaceC3869AuACopydefault = FfiConverterTypeRecurringBuyPlanListStateObserver.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Aww
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceRecurringBuyPlanListStateObserver.onStateChanged.callback$lambda$0(interfaceC3869AuACopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Awz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceRecurringBuyPlanListStateObserver.onStateChanged.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C3722ArM.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC3869AuA interfaceC3869AuA, RustBuffer.ByValue byValue) {
            interfaceC3869AuA.KWHzl((C3871AuC) FfiConverterTypeRecurringBuyPlanListState.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceRecurringBuyPlanListStateObserver() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeRecurringBuyPlanListStateObserver.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeRecurringBuyPlanListStateObserver.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplanliststateobserver(vtable);
    }
}
