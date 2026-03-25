package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RecurringBuyPlanDetailPnlResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String avgPrice;
    private final String currentPrice;
    private final String performance;
    private final int scale;
    private final String totalPaymentAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyPlanDetailPnlResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyPlanDetailPnlResponseBean copy$default(RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recurringBuyPlanDetailPnlResponseBean.totalPaymentAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = recurringBuyPlanDetailPnlResponseBean.avgPrice;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = recurringBuyPlanDetailPnlResponseBean.currentPrice;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = recurringBuyPlanDetailPnlResponseBean.performance;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = recurringBuyPlanDetailPnlResponseBean.scale;
        }
        return recurringBuyPlanDetailPnlResponseBean.copy(str, str5, str6, str7, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPaymentAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.performance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailPnlResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecurringBuyPlanDetailPnlResponseBean(str, str2, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanDetailPnlResponseBean)) {
            return false;
        }
        RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean = (RecurringBuyPlanDetailPnlResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.totalPaymentAmount, (Object) recurringBuyPlanDetailPnlResponseBean.totalPaymentAmount) && Intrinsics.EZpvd((Object) this.avgPrice, (Object) recurringBuyPlanDetailPnlResponseBean.avgPrice) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) recurringBuyPlanDetailPnlResponseBean.currentPrice) && Intrinsics.EZpvd((Object) this.performance, (Object) recurringBuyPlanDetailPnlResponseBean.performance) && this.scale == recurringBuyPlanDetailPnlResponseBean.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPrice() {
        return this.avgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerformance() {
        return this.performance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPaymentAmount() {
        return this.totalPaymentAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.totalPaymentAmount.hashCode() * 31) + this.avgPrice.hashCode()) * 31) + this.currentPrice.hashCode()) * 31) + this.performance.hashCode()) * 31) + Integer.hashCode(this.scale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyPlanDetailPnlResponseBean(totalPaymentAmount=" + this.totalPaymentAmount + ", avgPrice=" + this.avgPrice + ", currentPrice=" + this.currentPrice + ", performance=" + this.performance + ", scale=" + this.scale + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyPlanDetailPnlResponseBean> serializer() {
            return RecurringBuyPlanDetailPnlResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyPlanDetailPnlResponseBean(int i, String str, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalPaymentAmount = "";
        } else {
            this.totalPaymentAmount = str;
        }
        if ((i & 2) == 0) {
            this.avgPrice = "";
        } else {
            this.avgPrice = str2;
        }
        if ((i & 4) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str3;
        }
        if ((i & 8) == 0) {
            this.performance = "";
        } else {
            this.performance = str4;
        }
        if ((i & 16) == 0) {
            this.scale = 2;
        } else {
            this.scale = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailPnlResponseBean.totalPaymentAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyPlanDetailPnlResponseBean.totalPaymentAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailPnlResponseBean.avgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyPlanDetailPnlResponseBean.avgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailPnlResponseBean.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyPlanDetailPnlResponseBean.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recurringBuyPlanDetailPnlResponseBean.performance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyPlanDetailPnlResponseBean.performance);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && recurringBuyPlanDetailPnlResponseBean.scale == 2) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, recurringBuyPlanDetailPnlResponseBean.scale);
    }

    public RecurringBuyPlanDetailPnlResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.totalPaymentAmount = str;
        this.avgPrice = str2;
        this.currentPrice = str3;
        this.performance = str4;
        this.scale = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r8v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ RecurringBuyPlanDetailPnlResponseBean(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? 2 : i);
    }
}
