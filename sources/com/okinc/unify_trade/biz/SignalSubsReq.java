package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SignalSubsReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalSubsReq> CREATOR = new Creator();
    private Boolean autoRenewal;
    private String profitSharingRatio;
    private final String signalChanId;
    private String subscriptionFee;
    private final String subscriptionType;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalSubsReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSubsReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SignalSubsReq(string, string2, string3, string4, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSubsReq[] newArray(int i) {
            return new SignalSubsReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalSubsReq copy$default(SignalSubsReq signalSubsReq, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalSubsReq.signalChanId;
        }
        if ((i & 2) != 0) {
            str2 = signalSubsReq.subscriptionType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = signalSubsReq.subscriptionFee;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = signalSubsReq.profitSharingRatio;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = signalSubsReq.autoRenewal;
        }
        return signalSubsReq.copy(str, str5, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.autoRenewal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalSubsReq copy(@NotNull String str, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalSubsReq(str, str2, str3, str4, bool);
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
        if (!(obj instanceof SignalSubsReq)) {
            return false;
        }
        SignalSubsReq signalSubsReq = (SignalSubsReq) obj;
        return Intrinsics.EZpvd((Object) this.signalChanId, (Object) signalSubsReq.signalChanId) && Intrinsics.EZpvd((Object) this.subscriptionType, (Object) signalSubsReq.subscriptionType) && Intrinsics.EZpvd((Object) this.subscriptionFee, (Object) signalSubsReq.subscriptionFee) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) signalSubsReq.profitSharingRatio) && Intrinsics.EZpvd(this.autoRenewal, signalSubsReq.autoRenewal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalChanId() {
        return this.signalChanId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionFee() {
        return this.subscriptionFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.signalChanId.hashCode();
        String str = this.subscriptionType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subscriptionFee;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.profitSharingRatio;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.autoRenewal;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoRenewal(Boolean bool) {
        this.autoRenewal = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscriptionFee(String str) {
        this.subscriptionFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalSubsReq(signalChanId=" + this.signalChanId + ", subscriptionType=" + this.subscriptionType + ", subscriptionFee=" + this.subscriptionFee + ", profitSharingRatio=" + this.profitSharingRatio + ", autoRenewal=" + this.autoRenewal + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signalChanId);
        parcel.writeString(this.subscriptionType);
        parcel.writeString(this.subscriptionFee);
        parcel.writeString(this.profitSharingRatio);
        Boolean bool = this.autoRenewal;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public SignalSubsReq(@NotNull String str, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signalChanId = str;
        this.subscriptionType = str2;
        this.subscriptionFee = str3;
        this.profitSharingRatio = str4;
        this.autoRenewal = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:967) call: com.okinc.unify_trade.biz.SignalSubsReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SignalSubsReq(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
    }
}
