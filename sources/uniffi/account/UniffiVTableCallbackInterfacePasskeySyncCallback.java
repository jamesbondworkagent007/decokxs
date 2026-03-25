package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onConnectionStateChanged", "onSessionIdReceived", "onCredentialInfoReceived", "onProtectionKeyReceived", "onErrorReceived", "onError"})
public class UniffiVTableCallbackInterfacePasskeySyncCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePasskeySyncCallbackMethod0 onConnectionStateChanged;
    public UniffiCallbackInterfacePasskeySyncCallbackMethod2 onCredentialInfoReceived;
    public UniffiCallbackInterfacePasskeySyncCallbackMethod5 onError;
    public UniffiCallbackInterfacePasskeySyncCallbackMethod4 onErrorReceived;
    public UniffiCallbackInterfacePasskeySyncCallbackMethod3 onProtectionKeyReceived;
    public UniffiCallbackInterfacePasskeySyncCallbackMethod1 onSessionIdReceived;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePasskeySyncCallback() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r10v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r11v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0) : (r12v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1) : (r13v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2) : (r14v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3) : (r15v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4) : (r16v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5) : (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5):void (m)] (LINE:1849) call: uniffi.account.UniffiVTableCallbackInterfacePasskeySyncCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePasskeySyncCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySyncCallbackMethod0 uniffiCallbackInterfacePasskeySyncCallbackMethod0, UniffiCallbackInterfacePasskeySyncCallbackMethod1 uniffiCallbackInterfacePasskeySyncCallbackMethod1, UniffiCallbackInterfacePasskeySyncCallbackMethod2 uniffiCallbackInterfacePasskeySyncCallbackMethod2, UniffiCallbackInterfacePasskeySyncCallbackMethod3 uniffiCallbackInterfacePasskeySyncCallbackMethod3, UniffiCallbackInterfacePasskeySyncCallbackMethod4 uniffiCallbackInterfacePasskeySyncCallbackMethod4, UniffiCallbackInterfacePasskeySyncCallbackMethod5 uniffiCallbackInterfacePasskeySyncCallbackMethod5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod4, (i & 128) == 0 ? uniffiCallbackInterfacePasskeySyncCallbackMethod5 : null);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePasskeySyncCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r10v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r11v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0) : (r12v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1) : (r13v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2) : (r14v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3) : (r15v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4) : (r16v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4))
  (wrap:uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5) : (null uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5):void (m)] (LINE:1859) call: uniffi.account.UniffiVTableCallbackInterfacePasskeySyncCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod0, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod1, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod2, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod3, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod4, uniffi.account.UniffiCallbackInterfacePasskeySyncCallbackMethod5):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySyncCallbackMethod0 uniffiCallbackInterfacePasskeySyncCallbackMethod0, UniffiCallbackInterfacePasskeySyncCallbackMethod1 uniffiCallbackInterfacePasskeySyncCallbackMethod1, UniffiCallbackInterfacePasskeySyncCallbackMethod2 uniffiCallbackInterfacePasskeySyncCallbackMethod2, UniffiCallbackInterfacePasskeySyncCallbackMethod3 uniffiCallbackInterfacePasskeySyncCallbackMethod3, UniffiCallbackInterfacePasskeySyncCallbackMethod4 uniffiCallbackInterfacePasskeySyncCallbackMethod4, UniffiCallbackInterfacePasskeySyncCallbackMethod5 uniffiCallbackInterfacePasskeySyncCallbackMethod5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfacePasskeySyncCallbackMethod4, (i & 128) == 0 ? uniffiCallbackInterfacePasskeySyncCallbackMethod5 : null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySyncCallbackMethod0 uniffiCallbackInterfacePasskeySyncCallbackMethod0, UniffiCallbackInterfacePasskeySyncCallbackMethod1 uniffiCallbackInterfacePasskeySyncCallbackMethod1, UniffiCallbackInterfacePasskeySyncCallbackMethod2 uniffiCallbackInterfacePasskeySyncCallbackMethod2, UniffiCallbackInterfacePasskeySyncCallbackMethod3 uniffiCallbackInterfacePasskeySyncCallbackMethod3, UniffiCallbackInterfacePasskeySyncCallbackMethod4 uniffiCallbackInterfacePasskeySyncCallbackMethod4, UniffiCallbackInterfacePasskeySyncCallbackMethod5 uniffiCallbackInterfacePasskeySyncCallbackMethod5) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePasskeySyncCallbackMethod0, uniffiCallbackInterfacePasskeySyncCallbackMethod1, uniffiCallbackInterfacePasskeySyncCallbackMethod2, uniffiCallbackInterfacePasskeySyncCallbackMethod3, uniffiCallbackInterfacePasskeySyncCallbackMethod4, uniffiCallbackInterfacePasskeySyncCallbackMethod5);
        }
    }

    public UniffiVTableCallbackInterfacePasskeySyncCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePasskeySyncCallbackMethod0 uniffiCallbackInterfacePasskeySyncCallbackMethod0, UniffiCallbackInterfacePasskeySyncCallbackMethod1 uniffiCallbackInterfacePasskeySyncCallbackMethod1, UniffiCallbackInterfacePasskeySyncCallbackMethod2 uniffiCallbackInterfacePasskeySyncCallbackMethod2, UniffiCallbackInterfacePasskeySyncCallbackMethod3 uniffiCallbackInterfacePasskeySyncCallbackMethod3, UniffiCallbackInterfacePasskeySyncCallbackMethod4 uniffiCallbackInterfacePasskeySyncCallbackMethod4, UniffiCallbackInterfacePasskeySyncCallbackMethod5 uniffiCallbackInterfacePasskeySyncCallbackMethod5) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onConnectionStateChanged = uniffiCallbackInterfacePasskeySyncCallbackMethod0;
        this.onSessionIdReceived = uniffiCallbackInterfacePasskeySyncCallbackMethod1;
        this.onCredentialInfoReceived = uniffiCallbackInterfacePasskeySyncCallbackMethod2;
        this.onProtectionKeyReceived = uniffiCallbackInterfacePasskeySyncCallbackMethod3;
        this.onErrorReceived = uniffiCallbackInterfacePasskeySyncCallbackMethod4;
        this.onError = uniffiCallbackInterfacePasskeySyncCallbackMethod5;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePasskeySyncCallback uniffiVTableCallbackInterfacePasskeySyncCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePasskeySyncCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePasskeySyncCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePasskeySyncCallback.uniffiClone;
        this.onConnectionStateChanged = uniffiVTableCallbackInterfacePasskeySyncCallback.onConnectionStateChanged;
        this.onSessionIdReceived = uniffiVTableCallbackInterfacePasskeySyncCallback.onSessionIdReceived;
        this.onCredentialInfoReceived = uniffiVTableCallbackInterfacePasskeySyncCallback.onCredentialInfoReceived;
        this.onProtectionKeyReceived = uniffiVTableCallbackInterfacePasskeySyncCallback.onProtectionKeyReceived;
        this.onErrorReceived = uniffiVTableCallbackInterfacePasskeySyncCallback.onErrorReceived;
        this.onError = uniffiVTableCallbackInterfacePasskeySyncCallback.onError;
    }
}
