package uniffi.localization;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "execute", OtpEventTracker.OTP_EVENT_VALUE_CANCEL})
public class UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1 cancel;
    public UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0) : (r4v0 uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0))
  (wrap:uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1) : (r5v0 uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1):void (m)] (LINE:114) call: uniffi.localization.UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0) : (r4v0 uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0))
  (wrap:uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1) : (r5v0 uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1):void (m)] (LINE:120) call: uniffi.localization.UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, uniffi.localization.UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod0;
        this.cancel = uniffiCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiErrorMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError uniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.execute;
        this.cancel = uniffiVTableCallbackInterfaceOkNativeTaskAppLanguageListWithOkffiError.cancel;
    }
}
