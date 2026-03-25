package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "create", "unifiedErrorMessage"})
public class UniffiVTableCallbackInterfaceOkxRequestFactory extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxRequestFactoryMethod0 create;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;
    public UniffiCallbackInterfaceOkxRequestFactoryMethod1 unifiedErrorMessage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxRequestFactory() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1):void (m)] (LINE:340) call: uniffi.network.UniffiVTableCallbackInterfaceOkxRequestFactory.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxRequestFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxRequestFactoryMethod0 uniffiCallbackInterfaceOkxRequestFactoryMethod0, UniffiCallbackInterfaceOkxRequestFactoryMethod1 uniffiCallbackInterfaceOkxRequestFactoryMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxRequestFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxRequestFactoryMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxRequestFactory implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1):void (m)] (LINE:346) call: uniffi.network.UniffiVTableCallbackInterfaceOkxRequestFactory.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod0, uniffi.network.UniffiCallbackInterfaceOkxRequestFactoryMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxRequestFactoryMethod0 uniffiCallbackInterfaceOkxRequestFactoryMethod0, UniffiCallbackInterfaceOkxRequestFactoryMethod1 uniffiCallbackInterfaceOkxRequestFactoryMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxRequestFactoryMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxRequestFactoryMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxRequestFactoryMethod0 uniffiCallbackInterfaceOkxRequestFactoryMethod0, UniffiCallbackInterfaceOkxRequestFactoryMethod1 uniffiCallbackInterfaceOkxRequestFactoryMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxRequestFactoryMethod0, uniffiCallbackInterfaceOkxRequestFactoryMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkxRequestFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxRequestFactoryMethod0 uniffiCallbackInterfaceOkxRequestFactoryMethod0, UniffiCallbackInterfaceOkxRequestFactoryMethod1 uniffiCallbackInterfaceOkxRequestFactoryMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.create = uniffiCallbackInterfaceOkxRequestFactoryMethod0;
        this.unifiedErrorMessage = uniffiCallbackInterfaceOkxRequestFactoryMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxRequestFactory uniffiVTableCallbackInterfaceOkxRequestFactory) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxRequestFactory, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxRequestFactory.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxRequestFactory.uniffiClone;
        this.create = uniffiVTableCallbackInterfaceOkxRequestFactory.create;
        this.unifiedErrorMessage = uniffiVTableCallbackInterfaceOkxRequestFactory.unifiedErrorMessage;
    }
}
