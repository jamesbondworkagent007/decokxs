package com.okinc.business.dex.api.bean.sa_small_assets;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class ConflictDetailBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ConflictDetailBean> CREATOR = new Creator();
    private final String batchOrderId;
    private final String batchOrderStatus;
    private final String createTime;

    public static final class Creator implements Parcelable.Creator<ConflictDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConflictDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConflictDetailBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConflictDetailBean[] newArray(int i) {
            return new ConflictDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConflictDetailBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConflictDetailBean copy$default(ConflictDetailBean conflictDetailBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conflictDetailBean.batchOrderId;
        }
        if ((i & 2) != 0) {
            str2 = conflictDetailBean.batchOrderStatus;
        }
        if ((i & 4) != 0) {
            str3 = conflictDetailBean.createTime;
        }
        return conflictDetailBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.batchOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.batchOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConflictDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ConflictDetailBean(str, str2, str3);
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
        if (!(obj instanceof ConflictDetailBean)) {
            return false;
        }
        ConflictDetailBean conflictDetailBean = (ConflictDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.batchOrderId, (Object) conflictDetailBean.batchOrderId) && Intrinsics.EZpvd((Object) this.batchOrderStatus, (Object) conflictDetailBean.batchOrderStatus) && Intrinsics.EZpvd((Object) this.createTime, (Object) conflictDetailBean.createTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchOrderId() {
        return this.batchOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchOrderStatus() {
        return this.batchOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.batchOrderId.hashCode() * 31) + this.batchOrderStatus.hashCode()) * 31) + this.createTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConflictDetailBean(batchOrderId=" + this.batchOrderId + ", batchOrderStatus=" + this.batchOrderStatus + ", createTime=" + this.createTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.batchOrderId);
        parcel.writeString(this.batchOrderStatus);
        parcel.writeString(this.createTime);
    }

    public ConflictDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.batchOrderId = str;
        this.batchOrderStatus = str2;
        this.createTime = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.dex.api.bean.sa_small_assets.ConflictDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConflictDetailBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
