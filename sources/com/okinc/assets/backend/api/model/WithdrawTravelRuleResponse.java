package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawTravelRuleResponse implements Serializable, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawTravelRuleResponse> CREATOR = new Creator();
    private boolean isTravelRule;
    private String playbookName;
    private Long travelRuleId;

    public static final class Creator implements Parcelable.Creator<WithdrawTravelRuleResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawTravelRuleResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WithdrawTravelRuleResponse(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawTravelRuleResponse[] newArray(int i) {
            return new WithdrawTravelRuleResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawTravelRuleResponse() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawTravelRuleResponse copy$default(WithdrawTravelRuleResponse withdrawTravelRuleResponse, Long l, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = withdrawTravelRuleResponse.travelRuleId;
        }
        if ((i & 2) != 0) {
            z = withdrawTravelRuleResponse.isTravelRule;
        }
        if ((i & 4) != 0) {
            str = withdrawTravelRuleResponse.playbookName;
        }
        return withdrawTravelRuleResponse.copy(l, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isTravelRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.playbookName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawTravelRuleResponse copy(Long l, boolean z, String str) {
        return new WithdrawTravelRuleResponse(l, z, str);
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
        if (!(obj instanceof WithdrawTravelRuleResponse)) {
            return false;
        }
        WithdrawTravelRuleResponse withdrawTravelRuleResponse = (WithdrawTravelRuleResponse) obj;
        return Intrinsics.EZpvd(this.travelRuleId, withdrawTravelRuleResponse.travelRuleId) && this.isTravelRule == withdrawTravelRuleResponse.isTravelRule && Intrinsics.EZpvd((Object) this.playbookName, (Object) withdrawTravelRuleResponse.playbookName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybookName() {
        return this.playbookName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.travelRuleId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isTravelRule);
        String str = this.playbookName;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTravelRule() {
        return this.isTravelRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybookName(String str) {
        this.playbookName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTravelRule(boolean z) {
        this.isTravelRule = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTravelRuleId(Long l) {
        this.travelRuleId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawTravelRuleResponse(travelRuleId=" + this.travelRuleId + ", isTravelRule=" + this.isTravelRule + ", playbookName=" + this.playbookName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.travelRuleId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isTravelRule ? 1 : 0);
        parcel.writeString(this.playbookName);
    }

    public WithdrawTravelRuleResponse(Long l, boolean z, String str) {
        this.travelRuleId = l;
        this.isTravelRule = z;
        this.playbookName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, boolean, java.lang.String):void (m)] (LINE:129) call: com.okinc.assets.backend.api.model.WithdrawTravelRuleResponse.<init>(java.lang.Long, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawTravelRuleResponse(Long l, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }
}
