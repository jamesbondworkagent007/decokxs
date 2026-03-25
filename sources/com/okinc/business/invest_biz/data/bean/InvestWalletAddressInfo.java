package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestWalletAddressInfo implements Parcelable {
    private final Long chainId;
    private String pubKey;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestWalletAddressInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestWalletAddressInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestWalletAddressInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestWalletAddressInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestWalletAddressInfo[] newArray(int i) {
            return new InvestWalletAddressInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestWalletAddressInfo() {
        this((Long) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestWalletAddressInfo copy$default(InvestWalletAddressInfo investWalletAddressInfo, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = investWalletAddressInfo.chainId;
        }
        if ((i & 2) != 0) {
            str = investWalletAddressInfo.walletAddress;
        }
        if ((i & 4) != 0) {
            str2 = investWalletAddressInfo.pubKey;
        }
        return investWalletAddressInfo.copy(l, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestWalletAddressInfo copy(Long l, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestWalletAddressInfo(l, str, str2);
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
        if (!(obj instanceof InvestWalletAddressInfo)) {
            return false;
        }
        InvestWalletAddressInfo investWalletAddressInfo = (InvestWalletAddressInfo) obj;
        return Intrinsics.EZpvd(this.chainId, investWalletAddressInfo.chainId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) investWalletAddressInfo.walletAddress) && Intrinsics.EZpvd((Object) this.pubKey, (Object) investWalletAddressInfo.pubKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = this.walletAddress.hashCode();
        String str = this.pubKey;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubKey(String str) {
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestWalletAddressInfo(chainId=" + this.chainId + ", walletAddress=" + this.walletAddress + ", pubKey=" + this.pubKey + ")";
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
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.pubKey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestWalletAddressInfo> serializer() {
            return InvestWalletAddressInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestWalletAddressInfo(int i, Long l, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 2) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        if ((i & 4) == 0) {
            this.pubKey = null;
        } else {
            this.pubKey = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestWalletAddressInfo investWalletAddressInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investWalletAddressInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investWalletAddressInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investWalletAddressInfo.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investWalletAddressInfo.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investWalletAddressInfo.pubKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investWalletAddressInfo.pubKey);
    }

    public InvestWalletAddressInfo(Long l, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = l;
        this.walletAddress = str;
        this.pubKey = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo.<init>(java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestWalletAddressInfo(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
    }
}
