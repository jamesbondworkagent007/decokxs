package uniffi.buy_sell;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onStateChanged"})
public class UniffiVTableCallbackInterfaceBscQuickConvertStateObserver extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0 onStateChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceBscQuickConvertStateObserver() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0):void (m)] (LINE:142) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceBscQuickConvertStateObserver.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceBscQuickConvertStateObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0 uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceBscQuickConvertStateObserver implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0):void (m)] (LINE:147) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceBscQuickConvertStateObserver.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0 uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0 uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBscQuickConvertStateObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBscQuickConvertStateObserverMethod0 uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onStateChanged = uniffiCallbackInterfaceBscQuickConvertStateObserverMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceBscQuickConvertStateObserver uniffiVTableCallbackInterfaceBscQuickConvertStateObserver) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceBscQuickConvertStateObserver, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceBscQuickConvertStateObserver.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBscQuickConvertStateObserver.uniffiClone;
        this.onStateChanged = uniffiVTableCallbackInterfaceBscQuickConvertStateObserver.onStateChanged;
    }
}
