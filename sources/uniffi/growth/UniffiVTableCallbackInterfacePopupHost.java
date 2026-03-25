package uniffi.growth;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "kind", "identifier"})
public class UniffiVTableCallbackInterfacePopupHost extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePopupHostMethod1 identifier;
    public UniffiCallbackInterfacePopupHostMethod0 kind;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePopupHost() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupHostMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupHostMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfacePopupHostMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupHostMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupHostMethod1) : (r5v0 uniffi.growth.UniffiCallbackInterfacePopupHostMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupHostMethod0, uniffi.growth.UniffiCallbackInterfacePopupHostMethod1):void (m)] (LINE:151) call: uniffi.growth.UniffiVTableCallbackInterfacePopupHost.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupHostMethod0, uniffi.growth.UniffiCallbackInterfacePopupHostMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePopupHost(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupHostMethod0 uniffiCallbackInterfacePopupHostMethod0, UniffiCallbackInterfacePopupHostMethod1 uniffiCallbackInterfacePopupHostMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePopupHostMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePopupHostMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePopupHost implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupHostMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupHostMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfacePopupHostMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupHostMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupHostMethod1) : (r5v0 uniffi.growth.UniffiCallbackInterfacePopupHostMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupHostMethod0, uniffi.growth.UniffiCallbackInterfacePopupHostMethod1):void (m)] (LINE:157) call: uniffi.growth.UniffiVTableCallbackInterfacePopupHost.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupHostMethod0, uniffi.growth.UniffiCallbackInterfacePopupHostMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupHostMethod0 uniffiCallbackInterfacePopupHostMethod0, UniffiCallbackInterfacePopupHostMethod1 uniffiCallbackInterfacePopupHostMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePopupHostMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePopupHostMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupHostMethod0 uniffiCallbackInterfacePopupHostMethod0, UniffiCallbackInterfacePopupHostMethod1 uniffiCallbackInterfacePopupHostMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePopupHostMethod0, uniffiCallbackInterfacePopupHostMethod1);
        }
    }

    public UniffiVTableCallbackInterfacePopupHost(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupHostMethod0 uniffiCallbackInterfacePopupHostMethod0, UniffiCallbackInterfacePopupHostMethod1 uniffiCallbackInterfacePopupHostMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.kind = uniffiCallbackInterfacePopupHostMethod0;
        this.identifier = uniffiCallbackInterfacePopupHostMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePopupHost uniffiVTableCallbackInterfacePopupHost) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePopupHost, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePopupHost.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePopupHost.uniffiClone;
        this.kind = uniffiVTableCallbackInterfacePopupHost.kind;
        this.identifier = uniffiVTableCallbackInterfacePopupHost.identifier;
    }
}
