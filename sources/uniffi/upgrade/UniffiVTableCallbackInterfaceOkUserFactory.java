package uniffi.upgrade;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes14.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "createUserTask"})
public class UniffiVTableCallbackInterfaceOkUserFactory extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkUserFactoryMethod0 createUserTask;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkUserFactory() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0) : (r4v0 uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0):void (m)] (LINE:123) call: uniffi.upgrade.UniffiVTableCallbackInterfaceOkUserFactory.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkUserFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkUserFactoryMethod0 uniffiCallbackInterfaceOkUserFactoryMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkUserFactoryMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkUserFactory implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0) : (r4v0 uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0):void (m)] (LINE:128) call: uniffi.upgrade.UniffiVTableCallbackInterfaceOkUserFactory.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkUserFactoryMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkUserFactoryMethod0 uniffiCallbackInterfaceOkUserFactoryMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkUserFactoryMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkUserFactoryMethod0 uniffiCallbackInterfaceOkUserFactoryMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkUserFactoryMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceOkUserFactory(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkUserFactoryMethod0 uniffiCallbackInterfaceOkUserFactoryMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.createUserTask = uniffiCallbackInterfaceOkUserFactoryMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkUserFactory uniffiVTableCallbackInterfaceOkUserFactory) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkUserFactory, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkUserFactory.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkUserFactory.uniffiClone;
        this.createUserTask = uniffiVTableCallbackInterfaceOkUserFactory.createUserTask;
    }
}
