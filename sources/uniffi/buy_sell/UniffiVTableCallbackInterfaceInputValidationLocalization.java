package uniffi.buy_sell;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getBuyLocalizedErrorMessage", "getSellLocalizedErrorMessage"})
public class UniffiVTableCallbackInterfaceInputValidationLocalization extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceInputValidationLocalizationMethod0 getBuyLocalizedErrorMessage;
    public UniffiCallbackInterfaceInputValidationLocalizationMethod1 getSellLocalizedErrorMessage;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceInputValidationLocalization() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1) : (r5v0 uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1):void (m)] (LINE:239) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceInputValidationLocalization.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceInputValidationLocalization(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInputValidationLocalizationMethod0 uniffiCallbackInterfaceInputValidationLocalizationMethod0, UniffiCallbackInterfaceInputValidationLocalizationMethod1 uniffiCallbackInterfaceInputValidationLocalizationMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceInputValidationLocalizationMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceInputValidationLocalizationMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceInputValidationLocalization implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1) : (r5v0 uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1):void (m)] (LINE:245) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceInputValidationLocalization.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceInputValidationLocalizationMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInputValidationLocalizationMethod0 uniffiCallbackInterfaceInputValidationLocalizationMethod0, UniffiCallbackInterfaceInputValidationLocalizationMethod1 uniffiCallbackInterfaceInputValidationLocalizationMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceInputValidationLocalizationMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceInputValidationLocalizationMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInputValidationLocalizationMethod0 uniffiCallbackInterfaceInputValidationLocalizationMethod0, UniffiCallbackInterfaceInputValidationLocalizationMethod1 uniffiCallbackInterfaceInputValidationLocalizationMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceInputValidationLocalizationMethod0, uniffiCallbackInterfaceInputValidationLocalizationMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceInputValidationLocalization(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceInputValidationLocalizationMethod0 uniffiCallbackInterfaceInputValidationLocalizationMethod0, UniffiCallbackInterfaceInputValidationLocalizationMethod1 uniffiCallbackInterfaceInputValidationLocalizationMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getBuyLocalizedErrorMessage = uniffiCallbackInterfaceInputValidationLocalizationMethod0;
        this.getSellLocalizedErrorMessage = uniffiCallbackInterfaceInputValidationLocalizationMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceInputValidationLocalization uniffiVTableCallbackInterfaceInputValidationLocalization) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceInputValidationLocalization, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceInputValidationLocalization.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceInputValidationLocalization.uniffiClone;
        this.getBuyLocalizedErrorMessage = uniffiVTableCallbackInterfaceInputValidationLocalization.getBuyLocalizedErrorMessage;
        this.getSellLocalizedErrorMessage = uniffiVTableCallbackInterfaceInputValidationLocalization.getSellLocalizedErrorMessage;
    }
}
