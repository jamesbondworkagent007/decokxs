package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "createConnection", "createSimplifiedConnection"})
public class UniffiVTableCallbackInterfaceOkxWsFactory extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxWsFactoryMethod0 createConnection;
    public UniffiCallbackInterfaceOkxWsFactoryMethod1 createSimplifiedConnection;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxWsFactory() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1):void (m)] (LINE:362) call: uniffi.network.UniffiVTableCallbackInterfaceOkxWsFactory.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxWsFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxWsFactoryMethod0 uniffiCallbackInterfaceOkxWsFactoryMethod0, UniffiCallbackInterfaceOkxWsFactoryMethod1 uniffiCallbackInterfaceOkxWsFactoryMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxWsFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxWsFactoryMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxWsFactory implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1):void (m)] (LINE:368) call: uniffi.network.UniffiVTableCallbackInterfaceOkxWsFactory.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxWsFactoryMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxWsFactoryMethod0 uniffiCallbackInterfaceOkxWsFactoryMethod0, UniffiCallbackInterfaceOkxWsFactoryMethod1 uniffiCallbackInterfaceOkxWsFactoryMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxWsFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxWsFactoryMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxWsFactoryMethod0 uniffiCallbackInterfaceOkxWsFactoryMethod0, UniffiCallbackInterfaceOkxWsFactoryMethod1 uniffiCallbackInterfaceOkxWsFactoryMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxWsFactoryMethod0, uniffiCallbackInterfaceOkxWsFactoryMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkxWsFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxWsFactoryMethod0 uniffiCallbackInterfaceOkxWsFactoryMethod0, UniffiCallbackInterfaceOkxWsFactoryMethod1 uniffiCallbackInterfaceOkxWsFactoryMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.createConnection = uniffiCallbackInterfaceOkxWsFactoryMethod0;
        this.createSimplifiedConnection = uniffiCallbackInterfaceOkxWsFactoryMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxWsFactory uniffiVTableCallbackInterfaceOkxWsFactory) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxWsFactory, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxWsFactory.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxWsFactory.uniffiClone;
        this.createConnection = uniffiVTableCallbackInterfaceOkxWsFactory.createConnection;
        this.createSimplifiedConnection = uniffiVTableCallbackInterfaceOkxWsFactory.createSimplifiedConnection;
    }
}
