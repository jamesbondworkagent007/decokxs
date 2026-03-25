package uniffi.buy_sell;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onStateChanged"})
public class UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0 onStateChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0):void (m)] (LINE:220) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0 uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0):void (m)] (LINE:225) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0 uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0 uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0 uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onStateChanged = uniffiCallbackInterfaceBuySellOrderDetailStateObserverMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver uniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver.uniffiClone;
        this.onStateChanged = uniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver.onStateChanged;
    }
}
