package uniffi.upgrade;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes14.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "execute", OtpEventTracker.OTP_EVENT_VALUE_CANCEL})
public class UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1 cancel;
    public UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0) : (r4v0 uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1) : (r5v0 uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1):void (m)] (LINE:101) call: uniffi.upgrade.UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0) : (r4v0 uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1) : (r5v0 uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1):void (m)] (LINE:107) call: uniffi.upgrade.UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, uniffi.upgrade.UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0, UniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1 uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod0;
        this.cancel = uniffiCallbackInterfaceOkNativeTaskOkUserWithGetUserErrorMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.execute;
        this.cancel = uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError.cancel;
    }
}
