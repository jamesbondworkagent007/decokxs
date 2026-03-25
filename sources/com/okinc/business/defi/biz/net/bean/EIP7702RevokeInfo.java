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
public final class EIP7702RevokeInfo implements Parcelable {
    private Long chainIndex;
    private String revokeContractAddress;
    private String revokeContractData;
    private Integer status;
    private Long upgradeTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EIP7702RevokeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EIP7702RevokeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EIP7702RevokeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EIP7702RevokeInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EIP7702RevokeInfo[] newArray(int i) {
            return new EIP7702RevokeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EIP7702RevokeInfo() {
        this((String) null, (String) null, (Long) null, (Integer) null, (Long) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EIP7702RevokeInfo copy$default(EIP7702RevokeInfo eIP7702RevokeInfo, String str, String str2, Long l, Integer num, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eIP7702RevokeInfo.revokeContractAddress;
        }
        if ((i & 2) != 0) {
            str2 = eIP7702RevokeInfo.revokeContractData;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            l = eIP7702RevokeInfo.chainIndex;
        }
        Long l3 = l;
        if ((i & 8) != 0) {
            num = eIP7702RevokeInfo.status;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            l2 = eIP7702RevokeInfo.upgradeTime;
        }
        return eIP7702RevokeInfo.copy(str, str3, l3, num2, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.revokeContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.revokeContractData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.upgradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EIP7702RevokeInfo copy(String str, String str2, Long l, Integer num, Long l2) {
        return new EIP7702RevokeInfo(str, str2, l, num, l2);
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
        if (!(obj instanceof EIP7702RevokeInfo)) {
            return false;
        }
        EIP7702RevokeInfo eIP7702RevokeInfo = (EIP7702RevokeInfo) obj;
        return Intrinsics.EZpvd((Object) this.revokeContractAddress, (Object) eIP7702RevokeInfo.revokeContractAddress) && Intrinsics.EZpvd((Object) this.revokeContractData, (Object) eIP7702RevokeInfo.revokeContractData) && Intrinsics.EZpvd(this.chainIndex, eIP7702RevokeInfo.chainIndex) && Intrinsics.EZpvd(this.status, eIP7702RevokeInfo.status) && Intrinsics.EZpvd(this.upgradeTime, eIP7702RevokeInfo.upgradeTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRevokeContractAddress() {
        return this.revokeContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRevokeContractData() {
        return this.revokeContractData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpgradeTime() {
        return this.upgradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.revokeContractAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.revokeContractData;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.chainIndex;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Integer num = this.status;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Long l2 = this.upgradeTime;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevokeContractAddress(String str) {
        this.revokeContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevokeContractData(String str) {
        this.revokeContractData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpgradeTime(Long l) {
        this.upgradeTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EIP7702RevokeInfo(revokeContractAddress=" + this.revokeContractAddress + ", revokeContractData=" + this.revokeContractData + ", chainIndex=" + this.chainIndex + ", status=" + this.status + ", upgradeTime=" + this.upgradeTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.revokeContractAddress);
        parcel.writeString(this.revokeContractData);
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l2 = this.upgradeTime;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EIP7702RevokeInfo> serializer() {
            return EIP7702RevokeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EIP7702RevokeInfo(int i, String str, String str2, Long l, Integer num, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.revokeContractAddress = null;
        } else {
            this.revokeContractAddress = str;
        }
        if ((i & 2) == 0) {
            this.revokeContractData = null;
        } else {
            this.revokeContractData = str2;
        }
        if ((i & 4) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = l;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = num;
        }
        if ((i & 16) == 0) {
            this.upgradeTime = null;
        } else {
            this.upgradeTime = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EIP7702RevokeInfo eIP7702RevokeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eIP7702RevokeInfo.revokeContractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eIP7702RevokeInfo.revokeContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eIP7702RevokeInfo.revokeContractData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eIP7702RevokeInfo.revokeContractData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eIP7702RevokeInfo.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, eIP7702RevokeInfo.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eIP7702RevokeInfo.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, eIP7702RevokeInfo.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && eIP7702RevokeInfo.upgradeTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, eIP7702RevokeInfo.upgradeTime);
    }

    public EIP7702RevokeInfo(String str, String str2, Long l, Integer num, Long l2) {
        this.revokeContractAddress = str;
        this.revokeContractData = str2;
        this.chainIndex = l;
        this.status = num;
        this.upgradeTime = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long):void (m)] (LINE:484) call: com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ EIP7702RevokeInfo(String str, String str2, Long l, Integer num, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l2);
    }
}
