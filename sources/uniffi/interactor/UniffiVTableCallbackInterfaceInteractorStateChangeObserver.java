package uniffi.interactor;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onStateChanged"})
public class UniffiVTableCallbackInterfaceInteractorStateChangeObserver extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceInteractorStateChangeObserverMethod0 onStateChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceInteractorStateChangeObserver() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0) : (r4v0 uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0):void (m)] (LINE:61) call: uniffi.interactor.UniffiVTableCallbackInterfaceInteractorStateChangeObserver.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceInteractorStateChangeObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInteractorStateChangeObserverMethod0 uniffiCallbackInterfaceInteractorStateChangeObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceInteractorStateChangeObserverMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceInteractorStateChangeObserver implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0) : (r4v0 uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0):void (m)] (LINE:66) call: uniffi.interactor.UniffiVTableCallbackInterfaceInteractorStateChangeObserver.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.interactor.UniffiCallbackInterfaceInteractorStateChangeObserverMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInteractorStateChangeObserverMethod0 uniffiCallbackInterfaceInteractorStateChangeObserverMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceInteractorStateChangeObserverMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInteractorStateChangeObserverMethod0 uniffiCallbackInterfaceInteractorStateChangeObserverMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceInteractorStateChangeObserverMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceInteractorStateChangeObserver(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInteractorStateChangeObserverMethod0 uniffiCallbackInterfaceInteractorStateChangeObserverMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onStateChanged = uniffiCallbackInterfaceInteractorStateChangeObserverMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceInteractorStateChangeObserver uniffiVTableCallbackInterfaceInteractorStateChangeObserver) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceInteractorStateChangeObserver, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceInteractorStateChangeObserver.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceInteractorStateChangeObserver.uniffiClone;
        this.onStateChanged = uniffiVTableCallbackInterfaceInteractorStateChangeObserver.onStateChanged;
    }
}
