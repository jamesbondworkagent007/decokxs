package com.okinc.crcore.shared.net.responsebean.bsc.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyEditPlanAmountResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringBuyEditPlanAmountBean implements Parcelable {
    public static final int $stable = 0;
    private final String maxEditPlanAmount;
    private final String minEditPlanAmount;
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<RecurringBuyEditPlanAmountBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyEditPlanAmountBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyEditPlanAmountBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyEditPlanAmountBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyEditPlanAmountBean[] newArray(int i) {
            return new RecurringBuyEditPlanAmountBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyEditPlanAmountBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyEditPlanAmountBean copy$default(RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringBuyEditPlanAmountBean.minEditPlanAmount;
        }
        if ((i & 2) != 0) {
            str2 = recurringBuyEditPlanAmountBean.maxEditPlanAmount;
        }
        return recurringBuyEditPlanAmountBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyEditPlanAmountBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RecurringBuyEditPlanAmountBean(str, str2);
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
        if (!(obj instanceof RecurringBuyEditPlanAmountBean)) {
            return false;
        }
        RecurringBuyEditPlanAmountBean recurringBuyEditPlanAmountBean = (RecurringBuyEditPlanAmountBean) obj;
        return Intrinsics.EZpvd((Object) this.minEditPlanAmount, (Object) recurringBuyEditPlanAmountBean.minEditPlanAmount) && Intrinsics.EZpvd((Object) this.maxEditPlanAmount, (Object) recurringBuyEditPlanAmountBean.maxEditPlanAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxEditPlanAmount() {
        return this.maxEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinEditPlanAmount() {
        return this.minEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.minEditPlanAmount.hashCode() * 31) + this.maxEditPlanAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyEditPlanAmountBean(minEditPlanAmount=" + this.minEditPlanAmount + ", maxEditPlanAmount=" + this.maxEditPlanAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minEditPlanAmount);
        parcel.writeString(this.maxEditPlanAmount);
    }

    public RecurringBuyEditPlanAmountBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.minEditPlanAmount = str;
        this.maxEditPlanAmount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyEditPlanAmountBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyEditPlanAmountBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyEditPlanAmountBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringBuyEditPlanAmountBean OLrzqt(@NotNull RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean) {
            Intrinsics.checkNotNullParameter(recurringBuyEditPlanAmountResponseBean, "");
            return new RecurringBuyEditPlanAmountBean(recurringBuyEditPlanAmountResponseBean.getMinEditPlanAmount(), recurringBuyEditPlanAmountResponseBean.getMaxEditPlanAmount());
        }
    }
}
