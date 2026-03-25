package com.okinc.business.dex.trade.copytrading.edit.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingCreateParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CopyTradingCreateParams> CREATOR = new Creator();
    private final String copyFrom;
    private final String strategyId;

    public static final class Creator implements Parcelable.Creator<CopyTradingCreateParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CopyTradingCreateParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CopyTradingCreateParams(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CopyTradingCreateParams[] newArray(int i) {
            return new CopyTradingCreateParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CopyTradingCreateParams copy$default(CopyTradingCreateParams copyTradingCreateParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyTradingCreateParams.copyFrom;
        }
        if ((i & 2) != 0) {
            str2 = copyTradingCreateParams.strategyId;
        }
        return copyTradingCreateParams.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.copyFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingCreateParams copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CopyTradingCreateParams(str, str2);
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
        if (!(obj instanceof CopyTradingCreateParams)) {
            return false;
        }
        CopyTradingCreateParams copyTradingCreateParams = (CopyTradingCreateParams) obj;
        return Intrinsics.EZpvd((Object) this.copyFrom, (Object) copyTradingCreateParams.copyFrom) && Intrinsics.EZpvd((Object) this.strategyId, (Object) copyTradingCreateParams.strategyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopyFrom() {
        return this.copyFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copyFrom.hashCode();
        String str = this.strategyId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradingCreateParams(copyFrom=" + this.copyFrom + ", strategyId=" + this.strategyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copyFrom);
        parcel.writeString(this.strategyId);
    }

    public CopyTradingCreateParams(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copyFrom = str;
        this.strategyId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingCreateParams.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CopyTradingCreateParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
