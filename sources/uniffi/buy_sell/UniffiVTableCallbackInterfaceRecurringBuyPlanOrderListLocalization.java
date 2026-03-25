package uniffi.buy_sell;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "formatOrderDate"})
public class UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0 formatOrderDate;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0):void (m)] (LINE:358) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0) : (r4v0 uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0):void (m)] (LINE:363) call: uniffi.buy_sell.UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.buy_sell.UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0 uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.formatOrderDate = uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalizationMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.uniffiClone;
        this.formatOrderDate = uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization.formatOrderDate;
    }
}
