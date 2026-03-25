package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ApplyLossInsuranceBean implements Parcelable {
    private String deeplink;
    private final String issuedVoucherCnt;
    private String pTime;
    private final long realTimestamp;
    private final String voucherExpireTime;
    private final String voucherIssueTime;
    private final String voucherNo;
    private final String voucherStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApplyLossInsuranceBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ApplyLossInsuranceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApplyLossInsuranceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApplyLossInsuranceBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApplyLossInsuranceBean[] newArray(int i) {
            return new ApplyLossInsuranceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApplyLossInsuranceBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.issuedVoucherCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.voucherExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.voucherIssueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.voucherNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.voucherStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.realTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApplyLossInsuranceBean copy(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7) {
        return new ApplyLossInsuranceBean(str, str2, str3, str4, str5, j, str6, str7);
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
        if (!(obj instanceof ApplyLossInsuranceBean)) {
            return false;
        }
        ApplyLossInsuranceBean applyLossInsuranceBean = (ApplyLossInsuranceBean) obj;
        return Intrinsics.EZpvd((Object) this.issuedVoucherCnt, (Object) applyLossInsuranceBean.issuedVoucherCnt) && Intrinsics.EZpvd((Object) this.voucherExpireTime, (Object) applyLossInsuranceBean.voucherExpireTime) && Intrinsics.EZpvd((Object) this.voucherIssueTime, (Object) applyLossInsuranceBean.voucherIssueTime) && Intrinsics.EZpvd((Object) this.voucherNo, (Object) applyLossInsuranceBean.voucherNo) && Intrinsics.EZpvd((Object) this.voucherStatus, (Object) applyLossInsuranceBean.voucherStatus) && this.realTimestamp == applyLossInsuranceBean.realTimestamp && Intrinsics.EZpvd((Object) this.deeplink, (Object) applyLossInsuranceBean.deeplink) && Intrinsics.EZpvd((Object) this.pTime, (Object) applyLossInsuranceBean.pTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuedVoucherCnt() {
        return this.issuedVoucherCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealTimestamp() {
        return this.realTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherExpireTime() {
        return this.voucherExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherIssueTime() {
        return this.voucherIssueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherNo() {
        return this.voucherNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherStatus() {
        return this.voucherStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.issuedVoucherCnt;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.voucherExpireTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.voucherIssueTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.voucherNo;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.voucherStatus;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        int iHashCode6 = Long.hashCode(this.realTimestamp);
        String str6 = this.deeplink;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pTime;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApplyLossInsuranceBean(issuedVoucherCnt=" + this.issuedVoucherCnt + ", voucherExpireTime=" + this.voucherExpireTime + ", voucherIssueTime=" + this.voucherIssueTime + ", voucherNo=" + this.voucherNo + ", voucherStatus=" + this.voucherStatus + ", realTimestamp=" + this.realTimestamp + ", deeplink=" + this.deeplink + ", pTime=" + this.pTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.issuedVoucherCnt);
        parcel.writeString(this.voucherExpireTime);
        parcel.writeString(this.voucherIssueTime);
        parcel.writeString(this.voucherNo);
        parcel.writeString(this.voucherStatus);
        parcel.writeLong(this.realTimestamp);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.pTime);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ApplyLossInsuranceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApplyLossInsuranceBean> serializer() {
            return ApplyLossInsuranceBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApplyLossInsuranceBean(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.issuedVoucherCnt = null;
        } else {
            this.issuedVoucherCnt = str;
        }
        if ((i & 2) == 0) {
            this.voucherExpireTime = null;
        } else {
            this.voucherExpireTime = str2;
        }
        if ((i & 4) == 0) {
            this.voucherIssueTime = null;
        } else {
            this.voucherIssueTime = str3;
        }
        if ((i & 8) == 0) {
            this.voucherNo = null;
        } else {
            this.voucherNo = str4;
        }
        if ((i & 16) == 0) {
            this.voucherStatus = null;
        } else {
            this.voucherStatus = str5;
        }
        if ((i & 32) == 0) {
            this.realTimestamp = SystemClock.elapsedRealtime();
        } else {
            this.realTimestamp = j;
        }
        if ((i & 64) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str6;
        }
        if ((i & 128) == 0) {
            this.pTime = null;
        } else {
            this.pTime = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ApplyLossInsuranceBean applyLossInsuranceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || applyLossInsuranceBean.issuedVoucherCnt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, applyLossInsuranceBean.issuedVoucherCnt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || applyLossInsuranceBean.voucherExpireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, applyLossInsuranceBean.voucherExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || applyLossInsuranceBean.voucherIssueTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, applyLossInsuranceBean.voucherIssueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || applyLossInsuranceBean.voucherNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, applyLossInsuranceBean.voucherNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || applyLossInsuranceBean.voucherStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, applyLossInsuranceBean.voucherStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || applyLossInsuranceBean.realTimestamp != SystemClock.elapsedRealtime()) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, applyLossInsuranceBean.realTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || applyLossInsuranceBean.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, applyLossInsuranceBean.deeplink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && applyLossInsuranceBean.pTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, applyLossInsuranceBean.pTime);
    }

    public ApplyLossInsuranceBean(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7) {
        this.issuedVoucherCnt = str;
        this.voucherExpireTime = str2;
        this.voucherIssueTime = str3;
        this.voucherNo = str4;
        this.voucherStatus = str5;
        this.realTimestamp = j;
        this.deeplink = str6;
        this.pTime = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: INVOKE  STATIC call: android.os.SystemClock.elapsedRealtime():long A[MD:():long (c), WRAPPED] (LINE:4388)) : (r16v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void (m)] (LINE:4382) call: com.okinc.unify_trade.biz.ApplyLossInsuranceBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ApplyLossInsuranceBean(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? SystemClock.elapsedRealtime() : j, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
