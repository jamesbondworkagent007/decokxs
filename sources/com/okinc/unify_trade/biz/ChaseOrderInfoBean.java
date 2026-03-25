package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ChaseOrderInfoBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ChaseOrderInfoBean> CREATOR = new Creator();
    private final String chaseType;
    private final String chaseVal;
    private final String stopChasePrice;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ChaseOrderInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChaseOrderInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChaseOrderInfoBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChaseOrderInfoBean[] newArray(int i) {
            return new ChaseOrderInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChaseOrderInfoBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChaseOrderInfoBean copy$default(ChaseOrderInfoBean chaseOrderInfoBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chaseOrderInfoBean.chaseType;
        }
        if ((i & 2) != 0) {
            str2 = chaseOrderInfoBean.chaseVal;
        }
        if ((i & 4) != 0) {
            str3 = chaseOrderInfoBean.stopChasePrice;
        }
        return chaseOrderInfoBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stopChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChaseOrderInfoBean copy(String str, String str2, String str3) {
        return new ChaseOrderInfoBean(str, str2, str3);
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
        if (!(obj instanceof ChaseOrderInfoBean)) {
            return false;
        }
        ChaseOrderInfoBean chaseOrderInfoBean = (ChaseOrderInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.chaseType, (Object) chaseOrderInfoBean.chaseType) && Intrinsics.EZpvd((Object) this.chaseVal, (Object) chaseOrderInfoBean.chaseVal) && Intrinsics.EZpvd((Object) this.stopChasePrice, (Object) chaseOrderInfoBean.stopChasePrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChaseType() {
        return this.chaseType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChaseVal() {
        return this.chaseVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopChasePrice() {
        return this.stopChasePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chaseType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chaseVal;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.stopChasePrice;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChaseOrderInfoBean(chaseType=" + this.chaseType + ", chaseVal=" + this.chaseVal + ", stopChasePrice=" + this.stopChasePrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chaseType);
        parcel.writeString(this.chaseVal);
        parcel.writeString(this.stopChasePrice);
    }

    public ChaseOrderInfoBean(String str, String str2, String str3) {
        this.chaseType = str;
        this.chaseVal = str2;
        this.stopChasePrice = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4604) call: com.okinc.unify_trade.biz.ChaseOrderInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChaseOrderInfoBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
