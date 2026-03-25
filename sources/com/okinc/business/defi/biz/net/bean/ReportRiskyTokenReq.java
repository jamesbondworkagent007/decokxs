package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ReportRiskyTokenReq implements Parcelable {
    private String address;
    private Long chainIndex;
    private Integer reportType;
    private String reportedAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReportRiskyTokenReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ReportRiskyTokenReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReportRiskyTokenReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReportRiskyTokenReq(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReportRiskyTokenReq[] newArray(int i) {
            return new ReportRiskyTokenReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReportRiskyTokenReq() {
        this((Long) null, (String) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReportRiskyTokenReq copy$default(ReportRiskyTokenReq reportRiskyTokenReq, Long l, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            l = reportRiskyTokenReq.chainIndex;
        }
        if ((i & 2) != 0) {
            str = reportRiskyTokenReq.address;
        }
        if ((i & 4) != 0) {
            str2 = reportRiskyTokenReq.reportedAddress;
        }
        if ((i & 8) != 0) {
            num = reportRiskyTokenReq.reportType;
        }
        return reportRiskyTokenReq.copy(l, str, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reportedAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.reportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReportRiskyTokenReq copy(Long l, String str, String str2, Integer num) {
        return new ReportRiskyTokenReq(l, str, str2, num);
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
        if (!(obj instanceof ReportRiskyTokenReq)) {
            return false;
        }
        ReportRiskyTokenReq reportRiskyTokenReq = (ReportRiskyTokenReq) obj;
        return Intrinsics.EZpvd(this.chainIndex, reportRiskyTokenReq.chainIndex) && Intrinsics.EZpvd((Object) this.address, (Object) reportRiskyTokenReq.address) && Intrinsics.EZpvd((Object) this.reportedAddress, (Object) reportRiskyTokenReq.reportedAddress) && Intrinsics.EZpvd(this.reportType, reportRiskyTokenReq.reportType);
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
        Long l = this.chainIndex;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.reportedAddress;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.reportType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReportType(Integer num) {
        this.reportType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReportedAddress(String str) {
        this.reportedAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReportRiskyTokenReq(chainIndex=" + this.chainIndex + ", address=" + this.address + ", reportedAddress=" + this.reportedAddress + ", reportType=" + this.reportType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.address);
        parcel.writeString(this.reportedAddress);
        Integer num = this.reportType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ReportRiskyTokenReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReportRiskyTokenReq> serializer() {
            return ReportRiskyTokenReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReportRiskyTokenReq(int i, Long l, String str, String str2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainIndex = (i & 1) == 0 ? 0L : l;
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 4) == 0) {
            this.reportedAddress = "";
        } else {
            this.reportedAddress = str2;
        }
        if ((i & 8) == 0) {
            this.reportType = 0;
        } else {
            this.reportType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ReportRiskyTokenReq reportRiskyTokenReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = reportRiskyTokenReq.chainIndex) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, reportRiskyTokenReq.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) reportRiskyTokenReq.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, reportRiskyTokenReq.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) reportRiskyTokenReq.reportedAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, reportRiskyTokenReq.reportedAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num = reportRiskyTokenReq.reportType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, reportRiskyTokenReq.reportType);
        }
    }

    public ReportRiskyTokenReq(Long l, String str, String str2, Integer num) {
        this.chainIndex = l;
        this.address = str;
        this.reportedAddress = str2;
        this.reportType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:502) call: com.okinc.business.defi.biz.net.bean.ReportRiskyTokenReq.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ ReportRiskyTokenReq(Long l, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0 : num);
    }
}
