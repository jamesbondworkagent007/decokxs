package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletTxHistoryDetailReq implements Parcelable {
    private String accountId;
    private String address;
    private long coinId;
    private String orderId;
    private String orderType;
    private String txHash;
    private String txId;
    private String uOpHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletTxHistoryDetailReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletTxHistoryDetailReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTxHistoryDetailReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletTxHistoryDetailReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTxHistoryDetailReq[] newArray(int i) {
            return new WalletTxHistoryDetailReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.uOpHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTxHistoryDetailReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new WalletTxHistoryDetailReq(str, str2, str3, j, str4, str5, str6, str7);
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
        if (!(obj instanceof WalletTxHistoryDetailReq)) {
            return false;
        }
        WalletTxHistoryDetailReq walletTxHistoryDetailReq = (WalletTxHistoryDetailReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) walletTxHistoryDetailReq.accountId) && Intrinsics.EZpvd((Object) this.orderType, (Object) walletTxHistoryDetailReq.orderType) && Intrinsics.EZpvd((Object) this.orderId, (Object) walletTxHistoryDetailReq.orderId) && this.coinId == walletTxHistoryDetailReq.coinId && Intrinsics.EZpvd((Object) this.address, (Object) walletTxHistoryDetailReq.address) && Intrinsics.EZpvd((Object) this.txId, (Object) walletTxHistoryDetailReq.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) walletTxHistoryDetailReq.txHash) && Intrinsics.EZpvd((Object) this.uOpHash, (Object) walletTxHistoryDetailReq.uOpHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
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
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.orderType.hashCode();
        int iHashCode3 = this.orderId.hashCode();
        int iHashCode4 = Long.hashCode(this.coinId);
        int iHashCode5 = this.address.hashCode();
        String str = this.txId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.txHash;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uOpHash;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUOpHash(String str) {
        this.uOpHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTxHistoryDetailReq(accountId=" + this.accountId + ", orderType=" + this.orderType + ", orderId=" + this.orderId + ", coinId=" + this.coinId + ", address=" + this.address + ", txId=" + this.txId + ", txHash=" + this.txHash + ", uOpHash=" + this.uOpHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.orderType);
        parcel.writeString(this.orderId);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.address);
        parcel.writeString(this.txId);
        parcel.writeString(this.txHash);
        parcel.writeString(this.uOpHash);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletTxHistoryDetailReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletTxHistoryDetailReq> serializer() {
            return WalletTxHistoryDetailReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletTxHistoryDetailReq(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, WalletTxHistoryDetailReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.orderType = str2;
        this.orderId = str3;
        this.coinId = j;
        this.address = str4;
        if ((i & 32) == 0) {
            this.txId = null;
        } else {
            this.txId = str5;
        }
        if ((i & 64) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str6;
        }
        if ((i & 128) == 0) {
            this.uOpHash = null;
        } else {
            this.uOpHash = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletTxHistoryDetailReq walletTxHistoryDetailReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, walletTxHistoryDetailReq.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, walletTxHistoryDetailReq.orderType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, walletTxHistoryDetailReq.orderId);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, walletTxHistoryDetailReq.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, walletTxHistoryDetailReq.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletTxHistoryDetailReq.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletTxHistoryDetailReq.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || walletTxHistoryDetailReq.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, walletTxHistoryDetailReq.txHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && walletTxHistoryDetailReq.uOpHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, walletTxHistoryDetailReq.uOpHash);
    }

    public WalletTxHistoryDetailReq(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountId = str;
        this.orderType = str2;
        this.orderId = str3;
        this.coinId = j;
        this.address = str4;
        this.txId = str5;
        this.txHash = str6;
        this.uOpHash = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 long)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:369) call: com.okinc.business.defi.biz.net.bean.WalletTxHistoryDetailReq.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletTxHistoryDetailReq(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
