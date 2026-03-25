package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailPnlResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyPlanDetailPnlBean implements Parcelable {
    public static final int $stable = 0;
    private final String avgPrice;
    private final String currentPrice;
    private final String performance;
    private final int scale;
    private final String totalPaymentAmount;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<RecurringBuyPlanDetailPnlBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyPlanDetailPnlBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanDetailPnlBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyPlanDetailPnlBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyPlanDetailPnlBean[] newArray(int i) {
            return new RecurringBuyPlanDetailPnlBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyPlanDetailPnlBean() {
        this(null, null, null, null, 0, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyPlanDetailPnlBean copy$default(RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recurringBuyPlanDetailPnlBean.totalPaymentAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = recurringBuyPlanDetailPnlBean.avgPrice;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = recurringBuyPlanDetailPnlBean.currentPrice;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = recurringBuyPlanDetailPnlBean.performance;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = recurringBuyPlanDetailPnlBean.scale;
        }
        return recurringBuyPlanDetailPnlBean.copy(str, str5, str6, str7, i);
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
    public final RecurringBuyPlanDetailPnlBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecurringBuyPlanDetailPnlBean(str, str2, str3, str4, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringBuyPlanDetailPnlBean)) {
            return false;
        }
        RecurringBuyPlanDetailPnlBean recurringBuyPlanDetailPnlBean = (RecurringBuyPlanDetailPnlBean) obj;
        return Intrinsics.EZpvd((Object) this.totalPaymentAmount, (Object) recurringBuyPlanDetailPnlBean.totalPaymentAmount) && Intrinsics.EZpvd((Object) this.avgPrice, (Object) recurringBuyPlanDetailPnlBean.avgPrice) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) recurringBuyPlanDetailPnlBean.currentPrice) && Intrinsics.EZpvd((Object) this.performance, (Object) recurringBuyPlanDetailPnlBean.performance) && this.scale == recurringBuyPlanDetailPnlBean.scale;
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
        return "RecurringBuyPlanDetailPnlBean(totalPaymentAmount=" + this.totalPaymentAmount + ", avgPrice=" + this.avgPrice + ", currentPrice=" + this.currentPrice + ", performance=" + this.performance + ", scale=" + this.scale + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalPaymentAmount);
        parcel.writeString(this.avgPrice);
        parcel.writeString(this.currentPrice);
        parcel.writeString(this.performance);
        parcel.writeInt(this.scale);
    }

    public RecurringBuyPlanDetailPnlBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailPnlBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ RecurringBuyPlanDetailPnlBean(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? 2 : i);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailPnlBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RecurringBuyPlanDetailPnlBean copydefault(@NotNull RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyPlanDetailPnlResponseBean, "");
            return new RecurringBuyPlanDetailPnlBean(C33129mqd.gEmmrt(recurringBuyPlanDetailPnlResponseBean.getTotalPaymentAmount()), C33129mqd.gEmmrt(recurringBuyPlanDetailPnlResponseBean.getAvgPrice()), C33129mqd.gEmmrt(recurringBuyPlanDetailPnlResponseBean.getCurrentPrice()), C33129mqd.gEmmrt(recurringBuyPlanDetailPnlResponseBean.getPerformance()), recurringBuyPlanDetailPnlResponseBean.getScale());
        }
    }
}
