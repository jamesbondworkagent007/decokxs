package uniffi.retail_trading;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onUpdateDexListBatched", "onUpdateDexListError", "onUpdateDexListCompleted"})
public class UniffiVTableCallbackInterfaceDexListUpdateCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceDexListUpdateCallbackMethod0 onUpdateDexListBatched;
    public UniffiCallbackInterfaceDexListUpdateCallbackMethod2 onUpdateDexListCompleted;
    public UniffiCallbackInterfaceDexListUpdateCallbackMethod1 onUpdateDexListError;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceDexListUpdateCallback() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0) : (r7v0 uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1) : (r8v0 uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2) : (r9v0 uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2):void (m)] (LINE:82) call: uniffi.retail_trading.UniffiVTableCallbackInterfaceDexListUpdateCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceDexListUpdateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexListUpdateCallbackMethod0 uniffiCallbackInterfaceDexListUpdateCallbackMethod0, UniffiCallbackInterfaceDexListUpdateCallbackMethod1 uniffiCallbackInterfaceDexListUpdateCallbackMethod1, UniffiCallbackInterfaceDexListUpdateCallbackMethod2 uniffiCallbackInterfaceDexListUpdateCallbackMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceDexListUpdateCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceDexListUpdateCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceDexListUpdateCallbackMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceDexListUpdateCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0) : (r7v0 uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1) : (r8v0 uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1))
  (wrap:uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2) : (r9v0 uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2):void (m)] (LINE:89) call: uniffi.retail_trading.UniffiVTableCallbackInterfaceDexListUpdateCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1, uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexListUpdateCallbackMethod0 uniffiCallbackInterfaceDexListUpdateCallbackMethod0, UniffiCallbackInterfaceDexListUpdateCallbackMethod1 uniffiCallbackInterfaceDexListUpdateCallbackMethod1, UniffiCallbackInterfaceDexListUpdateCallbackMethod2 uniffiCallbackInterfaceDexListUpdateCallbackMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceDexListUpdateCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceDexListUpdateCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceDexListUpdateCallbackMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexListUpdateCallbackMethod0 uniffiCallbackInterfaceDexListUpdateCallbackMethod0, UniffiCallbackInterfaceDexListUpdateCallbackMethod1 uniffiCallbackInterfaceDexListUpdateCallbackMethod1, UniffiCallbackInterfaceDexListUpdateCallbackMethod2 uniffiCallbackInterfaceDexListUpdateCallbackMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceDexListUpdateCallbackMethod0, uniffiCallbackInterfaceDexListUpdateCallbackMethod1, uniffiCallbackInterfaceDexListUpdateCallbackMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceDexListUpdateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexListUpdateCallbackMethod0 uniffiCallbackInterfaceDexListUpdateCallbackMethod0, UniffiCallbackInterfaceDexListUpdateCallbackMethod1 uniffiCallbackInterfaceDexListUpdateCallbackMethod1, UniffiCallbackInterfaceDexListUpdateCallbackMethod2 uniffiCallbackInterfaceDexListUpdateCallbackMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onUpdateDexListBatched = uniffiCallbackInterfaceDexListUpdateCallbackMethod0;
        this.onUpdateDexListError = uniffiCallbackInterfaceDexListUpdateCallbackMethod1;
        this.onUpdateDexListCompleted = uniffiCallbackInterfaceDexListUpdateCallbackMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceDexListUpdateCallback uniffiVTableCallbackInterfaceDexListUpdateCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceDexListUpdateCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceDexListUpdateCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceDexListUpdateCallback.uniffiClone;
        this.onUpdateDexListBatched = uniffiVTableCallbackInterfaceDexListUpdateCallback.onUpdateDexListBatched;
        this.onUpdateDexListError = uniffiVTableCallbackInterfaceDexListUpdateCallback.onUpdateDexListError;
        this.onUpdateDexListCompleted = uniffiVTableCallbackInterfaceDexListUpdateCallback.onUpdateDexListCompleted;
    }
}
