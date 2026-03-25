package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonV2Filter implements Parcelable {
    public static final int $stable = 0;
    private final String filterTypeId;
    private final String investType;
    private final String network;
    private final String property;
    private final String riskFilterId;
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<CommonV2Filter> CREATOR = new Creator();
    private static final CommonV2Filter DEFAULT = new CommonV2Filter(null, null, null, null, null, 31, null);

    public static final class Creator implements Parcelable.Creator<CommonV2Filter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonV2Filter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommonV2Filter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonV2Filter[] newArray(int i) {
            return new CommonV2Filter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonV2Filter() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonV2Filter copy$default(CommonV2Filter commonV2Filter, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonV2Filter.network;
        }
        if ((i & 2) != 0) {
            str2 = commonV2Filter.filterTypeId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = commonV2Filter.property;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = commonV2Filter.investType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = commonV2Filter.riskFilterId;
        }
        return commonV2Filter.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.filterTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.riskFilterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonV2Filter copy(String str, String str2, String str3, String str4, String str5) {
        return new CommonV2Filter(str, str2, str3, str4, str5);
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
        if (!(obj instanceof CommonV2Filter)) {
            return false;
        }
        CommonV2Filter commonV2Filter = (CommonV2Filter) obj;
        return Intrinsics.EZpvd((Object) this.network, (Object) commonV2Filter.network) && Intrinsics.EZpvd((Object) this.filterTypeId, (Object) commonV2Filter.filterTypeId) && Intrinsics.EZpvd((Object) this.property, (Object) commonV2Filter.property) && Intrinsics.EZpvd((Object) this.investType, (Object) commonV2Filter.investType) && Intrinsics.EZpvd((Object) this.riskFilterId, (Object) commonV2Filter.riskFilterId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterTypeId() {
        return this.filterTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProperty() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskFilterId() {
        return this.riskFilterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.network;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.filterTypeId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.property;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.investType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.riskFilterId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonV2Filter(network=" + this.network + ", filterTypeId=" + this.filterTypeId + ", property=" + this.property + ", investType=" + this.investType + ", riskFilterId=" + this.riskFilterId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.network);
        parcel.writeString(this.filterTypeId);
        parcel.writeString(this.property);
        parcel.writeString(this.investType);
        parcel.writeString(this.riskFilterId);
    }

    public CommonV2Filter(String str, String str2, String str3, String str4, String str5) {
        this.network = str;
        this.filterTypeId = str2;
        this.property = str3;
        this.investType = str4;
        this.riskFilterId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.invest_biz.data.bean.CommonV2Filter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonV2Filter(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.CommonV2Filter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final CommonV2Filter KWHzl() {
            return CommonV2Filter.DEFAULT;
        }
    }
}
