package uniffi.settings;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0) : (r4v0 uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0):void (m)] (LINE:211) call: uniffi.settings.UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0 uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0) : (r4v0 uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0):void (m)] (LINE:216) call: uniffi.settings.UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0 uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0 uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0 uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceCurrencyListStateChangeCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback uniffiVTableCallbackInterfaceCurrencyListStateChangeCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCurrencyListStateChangeCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCurrencyListStateChangeCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCurrencyListStateChangeCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceCurrencyListStateChangeCallback.onChanged;
    }
}
