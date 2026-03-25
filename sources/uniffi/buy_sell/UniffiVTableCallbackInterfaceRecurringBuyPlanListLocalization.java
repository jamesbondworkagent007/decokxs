package uniffi.buy_sell;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "formatFrequency", "formatDate"})
public class UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1 formatDate;
    public UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0 formatFrequency;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1) : (r5v0 uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1):void (m)] (LINE:317) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1) : (r5v0 uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1):void (m)] (LINE:323) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0, UniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1 uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.formatFrequency = uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod0;
        this.formatDate = uniffiCallbackInterfaceRecurringBuyPlanListLocalizationMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization.uniffiClone;
        this.formatFrequency = uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization.formatFrequency;
        this.formatDate = uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization.formatDate;
    }
}
