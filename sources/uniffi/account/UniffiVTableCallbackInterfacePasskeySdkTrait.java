package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "assertPasskey", "assertUsingInHousePasskey", "registerPasskey"})
public class UniffiVTableCallbackInterfacePasskeySdkTrait extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePasskeySdkTraitMethod0 assertPasskey;
    public UniffiCallbackInterfacePasskeySdkTraitMethod1 assertUsingInHousePasskey;
    public UniffiCallbackInterfacePasskeySdkTraitMethod2 registerPasskey;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePasskeySdkTrait() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0) : (r7v0 uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1) : (r8v0 uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2) : (r9v0 uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2):void (m)] (LINE:1780) call: uniffi.account.UniffiVTableCallbackInterfacePasskeySdkTrait.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePasskeySdkTrait(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySdkTraitMethod0 uniffiCallbackInterfacePasskeySdkTraitMethod0, UniffiCallbackInterfacePasskeySdkTraitMethod1 uniffiCallbackInterfacePasskeySdkTraitMethod1, UniffiCallbackInterfacePasskeySdkTraitMethod2 uniffiCallbackInterfacePasskeySdkTraitMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePasskeySdkTraitMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePasskeySdkTraitMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePasskeySdkTraitMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePasskeySdkTrait implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0) : (r7v0 uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1) : (r8v0 uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2) : (r9v0 uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2):void (m)] (LINE:1787) call: uniffi.account.UniffiVTableCallbackInterfacePasskeySdkTrait.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod0, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod1, uniffi.account.UniffiCallbackInterfacePasskeySdkTraitMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySdkTraitMethod0 uniffiCallbackInterfacePasskeySdkTraitMethod0, UniffiCallbackInterfacePasskeySdkTraitMethod1 uniffiCallbackInterfacePasskeySdkTraitMethod1, UniffiCallbackInterfacePasskeySdkTraitMethod2 uniffiCallbackInterfacePasskeySdkTraitMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePasskeySdkTraitMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePasskeySdkTraitMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePasskeySdkTraitMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySdkTraitMethod0 uniffiCallbackInterfacePasskeySdkTraitMethod0, UniffiCallbackInterfacePasskeySdkTraitMethod1 uniffiCallbackInterfacePasskeySdkTraitMethod1, UniffiCallbackInterfacePasskeySdkTraitMethod2 uniffiCallbackInterfacePasskeySdkTraitMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePasskeySdkTraitMethod0, uniffiCallbackInterfacePasskeySdkTraitMethod1, uniffiCallbackInterfacePasskeySdkTraitMethod2);
        }
    }

    public UniffiVTableCallbackInterfacePasskeySdkTrait(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySdkTraitMethod0 uniffiCallbackInterfacePasskeySdkTraitMethod0, UniffiCallbackInterfacePasskeySdkTraitMethod1 uniffiCallbackInterfacePasskeySdkTraitMethod1, UniffiCallbackInterfacePasskeySdkTraitMethod2 uniffiCallbackInterfacePasskeySdkTraitMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.assertPasskey = uniffiCallbackInterfacePasskeySdkTraitMethod0;
        this.assertUsingInHousePasskey = uniffiCallbackInterfacePasskeySdkTraitMethod1;
        this.registerPasskey = uniffiCallbackInterfacePasskeySdkTraitMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePasskeySdkTrait uniffiVTableCallbackInterfacePasskeySdkTrait) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePasskeySdkTrait, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePasskeySdkTrait.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePasskeySdkTrait.uniffiClone;
        this.assertPasskey = uniffiVTableCallbackInterfacePasskeySdkTrait.assertPasskey;
        this.assertUsingInHousePasskey = uniffiVTableCallbackInterfacePasskeySdkTrait.assertUsingInHousePasskey;
        this.registerPasskey = uniffiVTableCallbackInterfacePasskeySdkTrait.registerPasskey;
    }
}
