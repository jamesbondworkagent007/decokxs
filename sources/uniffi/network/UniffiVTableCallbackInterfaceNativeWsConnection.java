package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "kind", "createListener", "reconnect"})
public class UniffiVTableCallbackInterfaceNativeWsConnection extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceNativeWsConnectionMethod1 createListener;
    public UniffiCallbackInterfaceNativeWsConnectionMethod0 kind;
    public UniffiCallbackInterfaceNativeWsConnectionMethod2 reconnect;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceNativeWsConnection() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2):void (m)] (LINE:243) call: uniffi.network.UniffiVTableCallbackInterfaceNativeWsConnection.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceNativeWsConnection(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsConnectionMethod0 uniffiCallbackInterfaceNativeWsConnectionMethod0, UniffiCallbackInterfaceNativeWsConnectionMethod1 uniffiCallbackInterfaceNativeWsConnectionMethod1, UniffiCallbackInterfaceNativeWsConnectionMethod2 uniffiCallbackInterfaceNativeWsConnectionMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceNativeWsConnectionMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceNativeWsConnectionMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceNativeWsConnectionMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceNativeWsConnection implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2):void (m)] (LINE:250) call: uniffi.network.UniffiVTableCallbackInterfaceNativeWsConnection.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsConnectionMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsConnectionMethod0 uniffiCallbackInterfaceNativeWsConnectionMethod0, UniffiCallbackInterfaceNativeWsConnectionMethod1 uniffiCallbackInterfaceNativeWsConnectionMethod1, UniffiCallbackInterfaceNativeWsConnectionMethod2 uniffiCallbackInterfaceNativeWsConnectionMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceNativeWsConnectionMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceNativeWsConnectionMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceNativeWsConnectionMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsConnectionMethod0 uniffiCallbackInterfaceNativeWsConnectionMethod0, UniffiCallbackInterfaceNativeWsConnectionMethod1 uniffiCallbackInterfaceNativeWsConnectionMethod1, UniffiCallbackInterfaceNativeWsConnectionMethod2 uniffiCallbackInterfaceNativeWsConnectionMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceNativeWsConnectionMethod0, uniffiCallbackInterfaceNativeWsConnectionMethod1, uniffiCallbackInterfaceNativeWsConnectionMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceNativeWsConnection(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsConnectionMethod0 uniffiCallbackInterfaceNativeWsConnectionMethod0, UniffiCallbackInterfaceNativeWsConnectionMethod1 uniffiCallbackInterfaceNativeWsConnectionMethod1, UniffiCallbackInterfaceNativeWsConnectionMethod2 uniffiCallbackInterfaceNativeWsConnectionMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.kind = uniffiCallbackInterfaceNativeWsConnectionMethod0;
        this.createListener = uniffiCallbackInterfaceNativeWsConnectionMethod1;
        this.reconnect = uniffiCallbackInterfaceNativeWsConnectionMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceNativeWsConnection uniffiVTableCallbackInterfaceNativeWsConnection) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceNativeWsConnection, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceNativeWsConnection.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceNativeWsConnection.uniffiClone;
        this.kind = uniffiVTableCallbackInterfaceNativeWsConnection.kind;
        this.createListener = uniffiVTableCallbackInterfaceNativeWsConnection.createListener;
        this.reconnect = uniffiVTableCallbackInterfaceNativeWsConnection.reconnect;
    }
}
