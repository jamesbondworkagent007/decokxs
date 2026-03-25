package com.okinc.wallet.api.bean;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class WalletTxDetailBean implements Parcelable {
    private final String address;
    private final long coinId;
    private String orderId;
    private String orderType;
    private final String txHash;
    private final String txId;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletTxDetailBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletTxDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTxDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletTxDetailBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTxDetailBean[] newArray(int i) {
            return new WalletTxDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTxDetailBean copy(String str, String str2, String str3, long j, String str4, String str5, String str6) {
        return new WalletTxDetailBean(str, str2, str3, j, str4, str5, str6);
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
        if (!(obj instanceof WalletTxDetailBean)) {
            return false;
        }
        WalletTxDetailBean walletTxDetailBean = (WalletTxDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) walletTxDetailBean.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) walletTxDetailBean.txHash) && Intrinsics.EZpvd((Object) this.address, (Object) walletTxDetailBean.address) && this.coinId == walletTxDetailBean.coinId && Intrinsics.EZpvd((Object) this.walletId, (Object) walletTxDetailBean.walletId) && Intrinsics.EZpvd((Object) this.orderType, (Object) walletTxDetailBean.orderType) && Intrinsics.EZpvd((Object) this.orderId, (Object) walletTxDetailBean.orderId);
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
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.txHash;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Long.hashCode(this.coinId);
        String str4 = this.walletId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.orderType;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.orderId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(String str) {
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(String str) {
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTxDetailBean(txId=" + this.txId + ", txHash=" + this.txHash + ", address=" + this.address + ", coinId=" + this.coinId + ", walletId=" + this.walletId + ", orderType=" + this.orderType + ", orderId=" + this.orderId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txId);
        parcel.writeString(this.txHash);
        parcel.writeString(this.address);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.walletId);
        parcel.writeString(this.orderType);
        parcel.writeString(this.orderId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.WalletTxDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletTxDetailBean> serializer() {
            return WalletTxDetailBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletTxDetailBean(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i, 23, WalletTxDetailBean$$serializer.INSTANCE.getDescriptor());
        }
        this.txId = str;
        this.txHash = str2;
        this.address = str3;
        if ((i & 8) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = j;
        }
        this.walletId = str4;
        if ((i & 32) == 0) {
            this.orderType = null;
        } else {
            this.orderType = str5;
        }
        if ((i & 64) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(WalletTxDetailBean walletTxDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, walletTxDetailBean.txId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, walletTxDetailBean.txHash);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, walletTxDetailBean.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletTxDetailBean.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, walletTxDetailBean.coinId);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, walletTxDetailBean.walletId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletTxDetailBean.orderType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, walletTxDetailBean.orderType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && walletTxDetailBean.orderId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, walletTxDetailBean.orderId);
    }

    public WalletTxDetailBean(String str, String str2, String str3, long j, String str4, String str5, String str6) {
        this.txId = str;
        this.txHash = str2;
        this.address = str3;
        this.coinId = j;
        this.walletId = str4;
        this.orderType = str5;
        this.orderId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.wallet.api.bean.WalletTxDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletTxDetailBean(String str, String str2, String str3, long j, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0L : j, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
