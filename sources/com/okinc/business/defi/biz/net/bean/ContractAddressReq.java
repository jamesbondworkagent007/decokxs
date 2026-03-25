package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ContractAddressReq implements Parcelable {
    private long coinId;
    private String contractAddress;
    private final Integer protocolId;
    private Boolean supportNftToken;
    private final String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContractAddressReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ContractAddressReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractAddressReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContractAddressReq(j, string, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractAddressReq[] newArray(int i) {
            return new ContractAddressReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractAddressReq() {
        this(0L, (String) null, (Boolean) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContractAddressReq copy$default(ContractAddressReq contractAddressReq, long j, String str, Boolean bool, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contractAddressReq.coinId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = contractAddressReq.contractAddress;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            bool = contractAddressReq.supportNftToken;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            num = contractAddressReq.protocolId;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str2 = contractAddressReq.symbol;
        }
        return contractAddressReq.copy(j2, str3, bool2, num2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.supportNftToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAddressReq copy(long j, String str, Boolean bool, Integer num, String str2) {
        return new ContractAddressReq(j, str, bool, num, str2);
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
        if (!(obj instanceof ContractAddressReq)) {
            return false;
        }
        ContractAddressReq contractAddressReq = (ContractAddressReq) obj;
        return this.coinId == contractAddressReq.coinId && Intrinsics.EZpvd((Object) this.contractAddress, (Object) contractAddressReq.contractAddress) && Intrinsics.EZpvd(this.supportNftToken, contractAddressReq.supportNftToken) && Intrinsics.EZpvd(this.protocolId, contractAddressReq.protocolId) && Intrinsics.EZpvd((Object) this.symbol, (Object) contractAddressReq.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportNftToken() {
        return this.supportNftToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.coinId);
        String str = this.contractAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.supportNftToken;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Integer num = this.protocolId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.symbol;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportNftToken(Boolean bool) {
        this.supportNftToken = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractAddressReq(coinId=" + this.coinId + ", contractAddress=" + this.contractAddress + ", supportNftToken=" + this.supportNftToken + ", protocolId=" + this.protocolId + ", symbol=" + this.symbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.contractAddress);
        Boolean bool = this.supportNftToken;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.protocolId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.symbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ContractAddressReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractAddressReq> serializer() {
            return ContractAddressReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractAddressReq(int i, long j, String str, Boolean bool, Integer num, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.coinId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str;
        }
        if ((i & 4) == 0) {
            this.supportNftToken = null;
        } else {
            this.supportNftToken = bool;
        }
        if ((i & 8) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num;
        }
        if ((i & 16) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ContractAddressReq contractAddressReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contractAddressReq.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, contractAddressReq.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractAddressReq.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contractAddressReq.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || contractAddressReq.supportNftToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, contractAddressReq.supportNftToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || contractAddressReq.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, contractAddressReq.protocolId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && contractAddressReq.symbol == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, contractAddressReq.symbol);
    }

    public ContractAddressReq(long j, String str, Boolean bool, Integer num, String str2) {
        this.coinId = j;
        this.contractAddress = str;
        this.supportNftToken = bool;
        this.protocolId = num;
        this.symbol = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:47) call: com.okinc.business.defi.biz.net.bean.ContractAddressReq.<init>(long, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ContractAddressReq(long j, String str, Boolean bool, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2);
    }
}
