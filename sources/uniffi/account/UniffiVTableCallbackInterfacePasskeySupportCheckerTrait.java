package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "isPasskeySupported", "isFido1PasskeySupported", "isFido2PasskeySupported"})
public class UniffiVTableCallbackInterfacePasskeySupportCheckerTrait extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1 isFido1PasskeySupported;
    public UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2 isFido2PasskeySupported;
    public UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0 isPasskeySupported;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePasskeySupportCheckerTrait() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0) : (r7v0 uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1) : (r8v0 uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2) : (r9v0 uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2):void (m)] (LINE:1824) call: uniffi.account.UniffiVTableCallbackInterfacePasskeySupportCheckerTrait.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePasskeySupportCheckerTrait(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePasskeySupportCheckerTrait implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0) : (r7v0 uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1) : (r8v0 uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2) : (r9v0 uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2):void (m)] (LINE:1831) call: uniffi.account.UniffiVTableCallbackInterfacePasskeySupportCheckerTrait.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2);
        }
    }

    public UniffiVTableCallbackInterfacePasskeySupportCheckerTrait(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod0 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod1 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1, UniffiCallbackInterfacePasskeySupportCheckerTraitMethod2 uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.isPasskeySupported = uniffiCallbackInterfacePasskeySupportCheckerTraitMethod0;
        this.isFido1PasskeySupported = uniffiCallbackInterfacePasskeySupportCheckerTraitMethod1;
        this.isFido2PasskeySupported = uniffiCallbackInterfacePasskeySupportCheckerTraitMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePasskeySupportCheckerTrait uniffiVTableCallbackInterfacePasskeySupportCheckerTrait) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePasskeySupportCheckerTrait, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePasskeySupportCheckerTrait.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePasskeySupportCheckerTrait.uniffiClone;
        this.isPasskeySupported = uniffiVTableCallbackInterfacePasskeySupportCheckerTrait.isPasskeySupported;
        this.isFido1PasskeySupported = uniffiVTableCallbackInterfacePasskeySupportCheckerTrait.isFido1PasskeySupported;
        this.isFido2PasskeySupported = uniffiVTableCallbackInterfacePasskeySupportCheckerTrait.isFido2PasskeySupported;
    }
}
