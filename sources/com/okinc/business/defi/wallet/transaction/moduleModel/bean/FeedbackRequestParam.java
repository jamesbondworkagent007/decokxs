package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedbackRequestParam implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FeedbackRequestParam> CREATOR = new Creator();
    private final String address;
    private final Long chainIndex;
    private final Integer reportType;
    private final String reportedAddress;

    public static final class Creator implements Parcelable.Creator<FeedbackRequestParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeedbackRequestParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FeedbackRequestParam(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeedbackRequestParam[] newArray(int i) {
            return new FeedbackRequestParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeedbackRequestParam() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FeedbackRequestParam copy$default(FeedbackRequestParam feedbackRequestParam, String str, String str2, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackRequestParam.address;
        }
        if ((i & 2) != 0) {
            str2 = feedbackRequestParam.reportedAddress;
        }
        if ((i & 4) != 0) {
            l = feedbackRequestParam.chainIndex;
        }
        if ((i & 8) != 0) {
            num = feedbackRequestParam.reportType;
        }
        return feedbackRequestParam.copy(str, str2, l, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.reportedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.reportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackRequestParam copy(String str, String str2, Long l, Integer num) {
        return new FeedbackRequestParam(str, str2, l, num);
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
        if (!(obj instanceof FeedbackRequestParam)) {
            return false;
        }
        FeedbackRequestParam feedbackRequestParam = (FeedbackRequestParam) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) feedbackRequestParam.address) && Intrinsics.EZpvd((Object) this.reportedAddress, (Object) feedbackRequestParam.reportedAddress) && Intrinsics.EZpvd(this.chainIndex, feedbackRequestParam.chainIndex) && Intrinsics.EZpvd(this.reportType, feedbackRequestParam.reportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReportType() {
        return this.reportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReportedAddress() {
        return this.reportedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.reportedAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.chainIndex;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Integer num = this.reportType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeedbackRequestParam(address=" + this.address + ", reportedAddress=" + this.reportedAddress + ", chainIndex=" + this.chainIndex + ", reportType=" + this.reportType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.reportedAddress);
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.reportType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public FeedbackRequestParam(String str, String str2, Long l, Integer num) {
        this.address = str;
        this.reportedAddress = str2;
        this.chainIndex = l;
        this.reportType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r5v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r6v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer):void (m)] (LINE:48) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.FeedbackRequestParam.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ FeedbackRequestParam(String str, String str2, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? -1L : l, (i & 8) != 0 ? -1 : num);
    }
}
