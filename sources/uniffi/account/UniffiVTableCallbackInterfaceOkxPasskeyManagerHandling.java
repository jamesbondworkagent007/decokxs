package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "isDeviceSupportBiometric", "createCredential", "getAssertion"})
public class UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1 createCredential;
    public UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2 getAssertion;
    public UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 isDeviceSupportBiometric;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0) : (r7v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1) : (r8v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2) : (r9v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2):void (m)] (LINE:1597) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0) : (r7v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1) : (r8v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2) : (r9v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2):void (m)] (LINE:1604) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, uniffi.account.UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1, UniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2 uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.isDeviceSupportBiometric = uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod0;
        this.createCredential = uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod1;
        this.getAssertion = uniffiCallbackInterfaceOkxPasskeyManagerHandlingMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyManagerHandling uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.uniffiClone;
        this.isDeviceSupportBiometric = uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.isDeviceSupportBiometric;
        this.createCredential = uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.createCredential;
        this.getAssertion = uniffiVTableCallbackInterfaceOkxPasskeyManagerHandling.getAssertion;
    }
}
