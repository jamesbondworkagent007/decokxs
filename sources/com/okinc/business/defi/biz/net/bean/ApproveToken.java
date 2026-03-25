package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ApproveToken implements Parcelable {
    private String address;
    private String approvalAddress;
    private String approvalNum;
    private Long approvalTime;
    private String coinId;
    private Long decimalNum;
    private String imageUrl;
    private String status;
    private String symbol;
    private String tokenAddress;
    private Long vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApproveToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ApproveToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApproveToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveToken[] newArray(int i) {
            return new ApproveToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveToken() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.approvalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.approvalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveToken copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, @NotNull String str8, Long l, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ApproveToken(str, str2, str3, str4, str5, str6, str7, str8, l, l2, l3);
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
        if (!(obj instanceof ApproveToken)) {
            return false;
        }
        ApproveToken approveToken = (ApproveToken) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) approveToken.address) && Intrinsics.EZpvd((Object) this.approvalNum, (Object) approveToken.approvalNum) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) approveToken.approvalAddress) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) approveToken.tokenAddress) && Intrinsics.EZpvd((Object) this.coinId, (Object) approveToken.coinId) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) approveToken.imageUrl) && Intrinsics.EZpvd((Object) this.symbol, (Object) approveToken.symbol) && Intrinsics.EZpvd((Object) this.status, (Object) approveToken.status) && Intrinsics.EZpvd(this.decimalNum, approveToken.decimalNum) && Intrinsics.EZpvd(this.vdecimalNum, approveToken.vdecimalNum) && Intrinsics.EZpvd(this.approvalTime, approveToken.approvalTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalNum() {
        return this.approvalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getApprovalTime() {
        return this.approvalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.approvalNum.hashCode();
        int iHashCode3 = this.approvalAddress.hashCode();
        int iHashCode4 = this.tokenAddress.hashCode();
        int iHashCode5 = this.coinId.hashCode();
        String str = this.imageUrl;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.symbol.hashCode();
        int iHashCode8 = this.status.hashCode();
        Long l = this.decimalNum;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Long l2 = this.vdecimalNum;
        int iHashCode10 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.approvalTime;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.approvalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.approvalNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalTime(Long l) {
        this.approvalTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(Long l) {
        this.decimalNum = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(Long l) {
        this.vdecimalNum = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveToken(address=" + this.address + ", approvalNum=" + this.approvalNum + ", approvalAddress=" + this.approvalAddress + ", tokenAddress=" + this.tokenAddress + ", coinId=" + this.coinId + ", imageUrl=" + this.imageUrl + ", symbol=" + this.symbol + ", status=" + this.status + ", decimalNum=" + this.decimalNum + ", vdecimalNum=" + this.vdecimalNum + ", approvalTime=" + this.approvalTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.approvalNum);
        parcel.writeString(this.approvalAddress);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.coinId);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.symbol);
        parcel.writeString(this.status);
        Long l = this.decimalNum;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.vdecimalNum;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.approvalTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ApproveToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveToken> serializer() {
            return ApproveToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveToken(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.approvalNum = "";
        } else {
            this.approvalNum = str2;
        }
        if ((i & 4) == 0) {
            this.approvalAddress = "";
        } else {
            this.approvalAddress = str3;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.coinId = "";
        } else {
            this.coinId = str5;
        }
        if ((i & 32) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str6;
        }
        if ((i & 64) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str7;
        }
        if ((i & 128) == 0) {
            this.status = "";
        } else {
            this.status = str8;
        }
        if ((i & 256) == 0) {
            this.decimalNum = null;
        } else {
            this.decimalNum = l;
        }
        if ((i & 512) == 0) {
            this.vdecimalNum = null;
        } else {
            this.vdecimalNum = l2;
        }
        if ((i & 1024) == 0) {
            this.approvalTime = null;
        } else {
            this.approvalTime = l3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ApproveToken approveToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) approveToken.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, approveToken.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) approveToken.approvalNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, approveToken.approvalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) approveToken.approvalAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, approveToken.approvalAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) approveToken.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, approveToken.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) approveToken.coinId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, approveToken.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) approveToken.imageUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, approveToken.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) approveToken.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, approveToken.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) approveToken.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, approveToken.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || approveToken.decimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, approveToken.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || approveToken.vdecimalNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, approveToken.vdecimalNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && approveToken.approvalTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, approveToken.approvalTime);
    }

    public ApproveToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, @NotNull String str8, Long l, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.address = str;
        this.approvalNum = str2;
        this.approvalAddress = str3;
        this.tokenAddress = str4;
        this.coinId = str5;
        this.imageUrl = str6;
        this.symbol = str7;
        this.status = str8;
        this.decimalNum = l;
        this.vdecimalNum = l2;
        this.approvalTime = l3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long):void (m)] (LINE:467) call: com.okinc.business.defi.biz.net.bean.ApproveToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ ApproveToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2, (i & 1024) == 0 ? l3 : null);
    }
}
