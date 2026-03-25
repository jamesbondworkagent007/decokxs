package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SyncParamsMinTopupInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SyncParamsMinTopupInfo> CREATOR = new Creator();
    private String leadAlgoId;
    private String topupAmount;

    public static final class Creator implements Parcelable.Creator<SyncParamsMinTopupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncParamsMinTopupInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SyncParamsMinTopupInfo(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncParamsMinTopupInfo[] newArray(int i) {
            return new SyncParamsMinTopupInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SyncParamsMinTopupInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SyncParamsMinTopupInfo copy$default(SyncParamsMinTopupInfo syncParamsMinTopupInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncParamsMinTopupInfo.leadAlgoId;
        }
        if ((i & 2) != 0) {
            str2 = syncParamsMinTopupInfo.topupAmount;
        }
        return syncParamsMinTopupInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.leadAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topupAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncParamsMinTopupInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SyncParamsMinTopupInfo(str, str2);
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
        if (!(obj instanceof SyncParamsMinTopupInfo)) {
            return false;
        }
        SyncParamsMinTopupInfo syncParamsMinTopupInfo = (SyncParamsMinTopupInfo) obj;
        return Intrinsics.EZpvd((Object) this.leadAlgoId, (Object) syncParamsMinTopupInfo.leadAlgoId) && Intrinsics.EZpvd((Object) this.topupAmount, (Object) syncParamsMinTopupInfo.topupAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeadAlgoId() {
        return this.leadAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopupAmount() {
        return this.topupAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.leadAlgoId.hashCode() * 31) + this.topupAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeadAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leadAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopupAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.topupAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncParamsMinTopupInfo(leadAlgoId=" + this.leadAlgoId + ", topupAmount=" + this.topupAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.leadAlgoId);
        parcel.writeString(this.topupAmount);
    }

    public SyncParamsMinTopupInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.leadAlgoId = str;
        this.topupAmount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:4667) call: com.okinc.unify_trade.biz.SyncParamsMinTopupInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SyncParamsMinTopupInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
