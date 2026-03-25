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
public final class ApproveAAItemParam implements Parcelable {
    private String amount;
    private String approvalAddress;
    private String beforeAmount;
    private Long chainId;
    private String from;
    private String to;
    private String txId;
    private String uOpHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApproveAAItemParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ApproveAAItemParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveAAItemParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApproveAAItemParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveAAItemParam[] newArray(int i) {
            return new ApproveAAItemParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveAAItemParam() {
        this((String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.beforeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveAAItemParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, Long l, @NotNull String str4, @NotNull String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ApproveAAItemParam(str, str2, str3, l, str4, str5, str6, str7);
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
        if (!(obj instanceof ApproveAAItemParam)) {
            return false;
        }
        ApproveAAItemParam approveAAItemParam = (ApproveAAItemParam) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) approveAAItemParam.from) && Intrinsics.EZpvd((Object) this.to, (Object) approveAAItemParam.to) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) approveAAItemParam.approvalAddress) && Intrinsics.EZpvd(this.chainId, approveAAItemParam.chainId) && Intrinsics.EZpvd((Object) this.txId, (Object) approveAAItemParam.txId) && Intrinsics.EZpvd((Object) this.amount, (Object) approveAAItemParam.amount) && Intrinsics.EZpvd((Object) this.beforeAmount, (Object) approveAAItemParam.beforeAmount) && Intrinsics.EZpvd((Object) this.uOpHash, (Object) approveAAItemParam.uOpHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBeforeAmount() {
        return this.beforeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUOpHash() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.approvalAddress.hashCode();
        Long l = this.chainId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        int iHashCode5 = this.txId.hashCode();
        int iHashCode6 = this.amount.hashCode();
        String str = this.beforeAmount;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.uOpHash;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.approvalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBeforeAmount(String str) {
        this.beforeAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUOpHash(String str) {
        this.uOpHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveAAItemParam(from=" + this.from + ", to=" + this.to + ", approvalAddress=" + this.approvalAddress + ", chainId=" + this.chainId + ", txId=" + this.txId + ", amount=" + this.amount + ", beforeAmount=" + this.beforeAmount + ", uOpHash=" + this.uOpHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.approvalAddress);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.txId);
        parcel.writeString(this.amount);
        parcel.writeString(this.beforeAmount);
        parcel.writeString(this.uOpHash);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ApproveAAItemParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveAAItemParam> serializer() {
            return ApproveAAItemParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveAAItemParam(int i, String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.approvalAddress = "";
        } else {
            this.approvalAddress = str3;
        }
        if ((i & 8) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 16) == 0) {
            this.txId = "";
        } else {
            this.txId = str4;
        }
        if ((i & 32) == 0) {
            this.amount = "";
        } else {
            this.amount = str5;
        }
        if ((i & 64) == 0) {
            this.beforeAmount = null;
        } else {
            this.beforeAmount = str6;
        }
        if ((i & 128) == 0) {
            this.uOpHash = null;
        } else {
            this.uOpHash = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ApproveAAItemParam approveAAItemParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) approveAAItemParam.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, approveAAItemParam.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) approveAAItemParam.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, approveAAItemParam.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) approveAAItemParam.approvalAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, approveAAItemParam.approvalAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || approveAAItemParam.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, approveAAItemParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) approveAAItemParam.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, approveAAItemParam.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) approveAAItemParam.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, approveAAItemParam.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || approveAAItemParam.beforeAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, approveAAItemParam.beforeAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && approveAAItemParam.uOpHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, approveAAItemParam.uOpHash);
    }

    public ApproveAAItemParam(@NotNull String str, @NotNull String str2, @NotNull String str3, Long l, @NotNull String str4, @NotNull String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.from = str;
        this.to = str2;
        this.approvalAddress = str3;
        this.chainId = l;
        this.txId = str4;
        this.amount = str5;
        this.beforeAmount = str6;
        this.uOpHash = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:571) call: com.okinc.business.defi.biz.net.bean.ApproveAAItemParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ApproveAAItemParam(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
