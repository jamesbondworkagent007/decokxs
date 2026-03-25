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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class XRC20BalanceDetailInfoResp implements Parcelable {
    private String address;
    private String availableReceiving;
    private String availableWithoutSpending;
    private Long chainIndex;
    private Long coinId;
    private String receivedPendingBalance;
    private String totalBalance;
    private String transferableWithoutSpending;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<XRC20BalanceDetailInfoResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<XRC20BalanceDetailInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20BalanceDetailInfoResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new XRC20BalanceDetailInfoResp(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20BalanceDetailInfoResp[] newArray(int i) {
            return new XRC20BalanceDetailInfoResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.receivedPendingBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.transferableWithoutSpending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.availableWithoutSpending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.availableReceiving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20BalanceDetailInfoResp copy(Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6) {
        return new XRC20BalanceDetailInfoResp(l, str, l2, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof XRC20BalanceDetailInfoResp)) {
            return false;
        }
        XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp = (XRC20BalanceDetailInfoResp) obj;
        return Intrinsics.EZpvd(this.coinId, xRC20BalanceDetailInfoResp.coinId) && Intrinsics.EZpvd((Object) this.address, (Object) xRC20BalanceDetailInfoResp.address) && Intrinsics.EZpvd(this.chainIndex, xRC20BalanceDetailInfoResp.chainIndex) && Intrinsics.EZpvd((Object) this.totalBalance, (Object) xRC20BalanceDetailInfoResp.totalBalance) && Intrinsics.EZpvd((Object) this.receivedPendingBalance, (Object) xRC20BalanceDetailInfoResp.receivedPendingBalance) && Intrinsics.EZpvd((Object) this.transferableWithoutSpending, (Object) xRC20BalanceDetailInfoResp.transferableWithoutSpending) && Intrinsics.EZpvd((Object) this.availableWithoutSpending, (Object) xRC20BalanceDetailInfoResp.availableWithoutSpending) && Intrinsics.EZpvd((Object) this.availableReceiving, (Object) xRC20BalanceDetailInfoResp.availableReceiving);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableReceiving() {
        return this.availableReceiving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableWithoutSpending() {
        return this.availableWithoutSpending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceivedPendingBalance() {
        return this.receivedPendingBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferableWithoutSpending() {
        return this.transferableWithoutSpending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l2 = this.chainIndex;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.totalBalance;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.receivedPendingBalance;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.transferableWithoutSpending;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.availableWithoutSpending;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.availableReceiving;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableReceiving(String str) {
        this.availableReceiving = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableWithoutSpending(String str) {
        this.availableWithoutSpending = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceivedPendingBalance(String str) {
        this.receivedPendingBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalBalance(String str) {
        this.totalBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferableWithoutSpending(String str) {
        this.transferableWithoutSpending = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "XRC20BalanceDetailInfoResp(coinId=" + this.coinId + ", address=" + this.address + ", chainIndex=" + this.chainIndex + ", totalBalance=" + this.totalBalance + ", receivedPendingBalance=" + this.receivedPendingBalance + ", transferableWithoutSpending=" + this.transferableWithoutSpending + ", availableWithoutSpending=" + this.availableWithoutSpending + ", availableReceiving=" + this.availableReceiving + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.address);
        Long l2 = this.chainIndex;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.totalBalance);
        parcel.writeString(this.receivedPendingBalance);
        parcel.writeString(this.transferableWithoutSpending);
        parcel.writeString(this.availableWithoutSpending);
        parcel.writeString(this.availableReceiving);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<XRC20BalanceDetailInfoResp> serializer() {
            return XRC20BalanceDetailInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XRC20BalanceDetailInfoResp(int i, Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (253 != (i & 253)) {
            PluginExceptionsKt.throwMissingFieldException(i, 253, XRC20BalanceDetailInfoResp$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = l;
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        this.chainIndex = l2;
        this.totalBalance = str2;
        this.receivedPendingBalance = str3;
        this.transferableWithoutSpending = str4;
        this.availableWithoutSpending = str5;
        this.availableReceiving = str6;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, longSerializer, xRC20BalanceDetailInfoResp.coinId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) xRC20BalanceDetailInfoResp.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, xRC20BalanceDetailInfoResp.address);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, longSerializer, xRC20BalanceDetailInfoResp.chainIndex);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, xRC20BalanceDetailInfoResp.totalBalance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, xRC20BalanceDetailInfoResp.receivedPendingBalance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, xRC20BalanceDetailInfoResp.transferableWithoutSpending);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, xRC20BalanceDetailInfoResp.availableWithoutSpending);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, xRC20BalanceDetailInfoResp.availableReceiving);
    }

    public XRC20BalanceDetailInfoResp(Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6) {
        this.coinId = l;
        this.address = str;
        this.chainIndex = l2;
        this.totalBalance = str2;
        this.receivedPendingBalance = str3;
        this.transferableWithoutSpending = str4;
        this.availableWithoutSpending = str5;
        this.availableReceiving = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r11v0 java.lang.Long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (r13v0 java.lang.Long)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
 A[MD:(java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:135) call: com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ XRC20BalanceDetailInfoResp(Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, (i & 2) != 0 ? "" : str, l2, str2, str3, str4, str5, str6);
    }
}
