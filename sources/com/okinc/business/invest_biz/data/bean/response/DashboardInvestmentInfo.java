package com.okinc.business.invest_biz.data.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardInvestmentInfo implements Parcelable {
    public static final int $stable = 0;
    public final int investType;
    public final long investmentId;
    public final String investmentKey;
    public final String poolAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DashboardInvestmentInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DashboardInvestmentInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DashboardInvestmentInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DashboardInvestmentInfo(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DashboardInvestmentInfo[] newArray(int i) {
            return new DashboardInvestmentInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardInvestmentInfo() {
        this((String) null, 0L, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DashboardInvestmentInfo copy$default(DashboardInvestmentInfo dashboardInvestmentInfo, String str, long j, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dashboardInvestmentInfo.investmentKey;
        }
        if ((i2 & 2) != 0) {
            j = dashboardInvestmentInfo.investmentId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str2 = dashboardInvestmentInfo.poolAddress;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            i = dashboardInvestmentInfo.investType;
        }
        return dashboardInvestmentInfo.OLrzqt(str, j2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.poolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.investmentKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardInvestmentInfo OLrzqt(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DashboardInvestmentInfo(str, j, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.investType;
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
        if (!(obj instanceof DashboardInvestmentInfo)) {
            return false;
        }
        DashboardInvestmentInfo dashboardInvestmentInfo = (DashboardInvestmentInfo) obj;
        return Intrinsics.EZpvd((Object) this.investmentKey, (Object) dashboardInvestmentInfo.investmentKey) && this.investmentId == dashboardInvestmentInfo.investmentId && Intrinsics.EZpvd((Object) this.poolAddress, (Object) dashboardInvestmentInfo.poolAddress) && this.investType == dashboardInvestmentInfo.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.investmentKey.hashCode() * 31) + Long.hashCode(this.investmentId)) * 31) + this.poolAddress.hashCode()) * 31) + Integer.hashCode(this.investType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardInvestmentInfo(investmentKey=" + this.investmentKey + ", investmentId=" + this.investmentId + ", poolAddress=" + this.poolAddress + ", investType=" + this.investType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.investmentKey);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.poolAddress);
        parcel.writeInt(this.investType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardInvestmentInfo> serializer() {
            return DashboardInvestmentInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardInvestmentInfo(int i, String str, long j, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentKey = "";
        } else {
            this.investmentKey = str;
        }
        if ((i & 2) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j;
        }
        if ((i & 4) == 0) {
            this.poolAddress = "";
        } else {
            this.poolAddress = str2;
        }
        if ((i & 8) == 0) {
            this.investType = -1;
        } else {
            this.investType = i2;
        }
    }

    public static final /* synthetic */ void copydefault(DashboardInvestmentInfo dashboardInvestmentInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dashboardInvestmentInfo.investmentKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dashboardInvestmentInfo.investmentKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dashboardInvestmentInfo.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, dashboardInvestmentInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dashboardInvestmentInfo.poolAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardInvestmentInfo.poolAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && dashboardInvestmentInfo.investType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, dashboardInvestmentInfo.investType);
    }

    public DashboardInvestmentInfo(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.investmentKey = str;
        this.investmentId = j;
        this.poolAddress = str2;
        this.investType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:long:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r8v0 int))
 A[MD:(java.lang.String, long, java.lang.String, int):void (m)] (LINE:102) call: com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo.<init>(java.lang.String, long, java.lang.String, int):void type: THIS */
    public /* synthetic */ DashboardInvestmentInfo(String str, long j, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? -1 : i);
    }
}
