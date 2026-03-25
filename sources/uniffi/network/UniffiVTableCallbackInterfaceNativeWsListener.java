package uniffi.network;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "kind", TtmlNode.START, "stop", "getSendable"})
public class UniffiVTableCallbackInterfaceNativeWsListener extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceNativeWsListenerMethod3 getSendable;
    public UniffiCallbackInterfaceNativeWsListenerMethod0 kind;
    public UniffiCallbackInterfaceNativeWsListenerMethod1 start;
    public UniffiCallbackInterfaceNativeWsListenerMethod2 stop;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceNativeWsListener() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0) : (r8v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1) : (r9v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2) : (r10v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3) : (r11v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3):void (m)] (LINE:268) call: uniffi.network.UniffiVTableCallbackInterfaceNativeWsListener.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceNativeWsListener(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsListenerMethod0 uniffiCallbackInterfaceNativeWsListenerMethod0, UniffiCallbackInterfaceNativeWsListenerMethod1 uniffiCallbackInterfaceNativeWsListenerMethod1, UniffiCallbackInterfaceNativeWsListenerMethod2 uniffiCallbackInterfaceNativeWsListenerMethod2, UniffiCallbackInterfaceNativeWsListenerMethod3 uniffiCallbackInterfaceNativeWsListenerMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod3);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceNativeWsListener implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0) : (r8v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1) : (r9v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2) : (r10v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2))
  (wrap:uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3) : (r11v0 uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3):void (m)] (LINE:276) call: uniffi.network.UniffiVTableCallbackInterfaceNativeWsListener.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod0, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod1, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod2, uniffi.network.UniffiCallbackInterfaceNativeWsListenerMethod3):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsListenerMethod0 uniffiCallbackInterfaceNativeWsListenerMethod0, UniffiCallbackInterfaceNativeWsListenerMethod1 uniffiCallbackInterfaceNativeWsListenerMethod1, UniffiCallbackInterfaceNativeWsListenerMethod2 uniffiCallbackInterfaceNativeWsListenerMethod2, UniffiCallbackInterfaceNativeWsListenerMethod3 uniffiCallbackInterfaceNativeWsListenerMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceNativeWsListenerMethod3);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsListenerMethod0 uniffiCallbackInterfaceNativeWsListenerMethod0, UniffiCallbackInterfaceNativeWsListenerMethod1 uniffiCallbackInterfaceNativeWsListenerMethod1, UniffiCallbackInterfaceNativeWsListenerMethod2 uniffiCallbackInterfaceNativeWsListenerMethod2, UniffiCallbackInterfaceNativeWsListenerMethod3 uniffiCallbackInterfaceNativeWsListenerMethod3) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceNativeWsListenerMethod0, uniffiCallbackInterfaceNativeWsListenerMethod1, uniffiCallbackInterfaceNativeWsListenerMethod2, uniffiCallbackInterfaceNativeWsListenerMethod3);
        }
    }

    public UniffiVTableCallbackInterfaceNativeWsListener(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNativeWsListenerMethod0 uniffiCallbackInterfaceNativeWsListenerMethod0, UniffiCallbackInterfaceNativeWsListenerMethod1 uniffiCallbackInterfaceNativeWsListenerMethod1, UniffiCallbackInterfaceNativeWsListenerMethod2 uniffiCallbackInterfaceNativeWsListenerMethod2, UniffiCallbackInterfaceNativeWsListenerMethod3 uniffiCallbackInterfaceNativeWsListenerMethod3) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.kind = uniffiCallbackInterfaceNativeWsListenerMethod0;
        this.start = uniffiCallbackInterfaceNativeWsListenerMethod1;
        this.stop = uniffiCallbackInterfaceNativeWsListenerMethod2;
        this.getSendable = uniffiCallbackInterfaceNativeWsListenerMethod3;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceNativeWsListener uniffiVTableCallbackInterfaceNativeWsListener) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceNativeWsListener, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceNativeWsListener.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceNativeWsListener.uniffiClone;
        this.kind = uniffiVTableCallbackInterfaceNativeWsListener.kind;
        this.start = uniffiVTableCallbackInterfaceNativeWsListener.start;
        this.stop = uniffiVTableCallbackInterfaceNativeWsListener.stop;
        this.getSendable = uniffiVTableCallbackInterfaceNativeWsListener.getSendable;
    }
}
