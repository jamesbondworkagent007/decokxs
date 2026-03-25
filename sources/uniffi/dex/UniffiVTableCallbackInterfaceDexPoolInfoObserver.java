package uniffi.dex;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onStateChanged"})
public class UniffiVTableCallbackInterfaceDexPoolInfoObserver extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceDexPoolInfoObserverMethod0 onStateChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceDexPoolInfoObserver() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0) : (r4v0 uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0):void (m)] (LINE:82) call: uniffi.dex.UniffiVTableCallbackInterfaceDexPoolInfoObserver.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceDexPoolInfoObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexPoolInfoObserverMethod0 uniffiCallbackInterfaceDexPoolInfoObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceDexPoolInfoObserverMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceDexPoolInfoObserver implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0) : (r4v0 uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0):void (m)] (LINE:87) call: uniffi.dex.UniffiVTableCallbackInterfaceDexPoolInfoObserver.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.dex.UniffiCallbackInterfaceDexPoolInfoObserverMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexPoolInfoObserverMethod0 uniffiCallbackInterfaceDexPoolInfoObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceDexPoolInfoObserverMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexPoolInfoObserverMethod0 uniffiCallbackInterfaceDexPoolInfoObserverMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceDexPoolInfoObserverMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceDexPoolInfoObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDexPoolInfoObserverMethod0 uniffiCallbackInterfaceDexPoolInfoObserverMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onStateChanged = uniffiCallbackInterfaceDexPoolInfoObserverMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceDexPoolInfoObserver uniffiVTableCallbackInterfaceDexPoolInfoObserver) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceDexPoolInfoObserver, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceDexPoolInfoObserver.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceDexPoolInfoObserver.uniffiClone;
        this.onStateChanged = uniffiVTableCallbackInterfaceDexPoolInfoObserver.onStateChanged;
    }
}
