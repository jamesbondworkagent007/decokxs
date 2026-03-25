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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddCoinReq implements Parcelable {
    private Long chainId;
    private Long coinId;
    private String contractAddress;
    private String currentAccountId;
    private int precision;
    private Integer protocolId;
    private String symbol;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddCoinReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddCoinReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddCoinReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddCoinReq(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddCoinReq[] newArray(int i) {
            return new AddCoinReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddCoinReq() {
        this((Long) null, (String) null, (String) null, 0, (String) null, (String) null, (Integer) null, (Long) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddCoinReq copy(Long l, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, Integer num, Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AddCoinReq(l, str, str2, i, str3, str4, num, l2);
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
        if (!(obj instanceof AddCoinReq)) {
            return false;
        }
        AddCoinReq addCoinReq = (AddCoinReq) obj;
        return Intrinsics.EZpvd(this.chainId, addCoinReq.chainId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) addCoinReq.contractAddress) && Intrinsics.EZpvd((Object) this.symbol, (Object) addCoinReq.symbol) && this.precision == addCoinReq.precision && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) addCoinReq.userUniqueId) && Intrinsics.EZpvd((Object) this.currentAccountId, (Object) addCoinReq.currentAccountId) && Intrinsics.EZpvd(this.protocolId, addCoinReq.protocolId) && Intrinsics.EZpvd(this.coinId, addCoinReq.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentAccountId() {
        return this.currentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = this.contractAddress.hashCode();
        int iHashCode3 = this.symbol.hashCode();
        int iHashCode4 = Integer.hashCode(this.precision);
        int iHashCode5 = this.userUniqueId.hashCode();
        int iHashCode6 = this.currentAccountId.hashCode();
        Integer num = this.protocolId;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Long l2 = this.coinId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currentAccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(int i) {
        this.precision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddCoinReq(chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ", symbol=" + this.symbol + ", precision=" + this.precision + ", userUniqueId=" + this.userUniqueId + ", currentAccountId=" + this.currentAccountId + ", protocolId=" + this.protocolId + ", coinId=" + this.coinId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.symbol);
        parcel.writeInt(this.precision);
        parcel.writeString(this.userUniqueId);
        parcel.writeString(this.currentAccountId);
        Integer num = this.protocolId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l2 = this.coinId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddCoinReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddCoinReq> serializer() {
            return AddCoinReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddCoinReq(int i, Long l, String str, String str2, int i2, String str3, String str4, Integer num, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str;
        }
        if ((i & 4) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str2;
        }
        if ((i & 8) == 0) {
            this.precision = 0;
        } else {
            this.precision = i2;
        }
        if ((i & 16) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str3;
        }
        if ((i & 32) == 0) {
            this.currentAccountId = "";
        } else {
            this.currentAccountId = str4;
        }
        if ((i & 64) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num;
        }
        if ((i & 128) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddCoinReq addCoinReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addCoinReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, addCoinReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addCoinReq.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, addCoinReq.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addCoinReq.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, addCoinReq.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addCoinReq.precision != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, addCoinReq.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) addCoinReq.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, addCoinReq.userUniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) addCoinReq.currentAccountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, addCoinReq.currentAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || addCoinReq.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, addCoinReq.protocolId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && addCoinReq.coinId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, addCoinReq.coinId);
    }

    public AddCoinReq(Long l, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, Integer num, Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = l;
        this.contractAddress = str;
        this.symbol = str2;
        this.precision = i;
        this.userUniqueId = str3;
        this.currentAccountId = str4;
        this.protocolId = num;
        this.coinId = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long):void (m)] (LINE:244) call: com.okinc.business.defi.biz.net.bean.AddCoinReq.<init>(java.lang.Long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ AddCoinReq(Long l, String str, String str2, int i, String str3, String str4, Integer num, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? null : num, (i2 & 128) == 0 ? l2 : null);
    }
}
