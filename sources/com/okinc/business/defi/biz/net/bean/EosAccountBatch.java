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
public final class EosAccountBatch implements Parcelable {
    private String account;
    private String activeKey;
    private String balance;
    private Long chainId;
    private Long coinId;
    private String currencyAmount;
    private String ownerKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosAccountBatch> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EosAccountBatch> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountBatch createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EosAccountBatch(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountBatch[] newArray(int i) {
            return new EosAccountBatch[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosAccountBatch() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EosAccountBatch copy$default(EosAccountBatch eosAccountBatch, String str, String str2, String str3, String str4, String str5, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eosAccountBatch.account;
        }
        if ((i & 2) != 0) {
            str2 = eosAccountBatch.ownerKey;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = eosAccountBatch.activeKey;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = eosAccountBatch.balance;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = eosAccountBatch.currencyAmount;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            l = eosAccountBatch.coinId;
        }
        Long l3 = l;
        if ((i & 64) != 0) {
            l2 = eosAccountBatch.chainId;
        }
        return eosAccountBatch.copy(str, str6, str7, str8, str9, l3, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosAccountBatch copy(String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        return new EosAccountBatch(str, str2, str3, str4, str5, l, l2);
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
        if (!(obj instanceof EosAccountBatch)) {
            return false;
        }
        EosAccountBatch eosAccountBatch = (EosAccountBatch) obj;
        return Intrinsics.EZpvd((Object) this.account, (Object) eosAccountBatch.account) && Intrinsics.EZpvd((Object) this.ownerKey, (Object) eosAccountBatch.ownerKey) && Intrinsics.EZpvd((Object) this.activeKey, (Object) eosAccountBatch.activeKey) && Intrinsics.EZpvd((Object) this.balance, (Object) eosAccountBatch.balance) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) eosAccountBatch.currencyAmount) && Intrinsics.EZpvd(this.coinId, eosAccountBatch.coinId) && Intrinsics.EZpvd(this.chainId, eosAccountBatch.chainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveKey() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
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
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwnerKey() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.account;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ownerKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.activeKey;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.balance;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.currencyAmount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Long l = this.coinId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        Long l2 = this.chainId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(String str) {
        this.account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActiveKey(String str) {
        this.activeKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(String str) {
        this.balance = str;
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
    public final void setCurrencyAmount(String str) {
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwnerKey(String str) {
        this.ownerKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosAccountBatch(account=" + this.account + ", ownerKey=" + this.ownerKey + ", activeKey=" + this.activeKey + ", balance=" + this.balance + ", currencyAmount=" + this.currencyAmount + ", coinId=" + this.coinId + ", chainId=" + this.chainId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.account);
        parcel.writeString(this.ownerKey);
        parcel.writeString(this.activeKey);
        parcel.writeString(this.balance);
        parcel.writeString(this.currencyAmount);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.chainId;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosAccountBatch.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosAccountBatch> serializer() {
            return EosAccountBatch$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosAccountBatch(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.account = null;
        } else {
            this.account = str;
        }
        if ((i & 2) == 0) {
            this.ownerKey = null;
        } else {
            this.ownerKey = str2;
        }
        if ((i & 4) == 0) {
            this.activeKey = null;
        } else {
            this.activeKey = str3;
        }
        if ((i & 8) == 0) {
            this.balance = "0";
        } else {
            this.balance = str4;
        }
        if ((i & 16) == 0) {
            this.currencyAmount = "0";
        } else {
            this.currencyAmount = str5;
        }
        if ((i & 32) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = l;
        }
        if ((i & 64) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosAccountBatch eosAccountBatch, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosAccountBatch.account != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eosAccountBatch.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eosAccountBatch.ownerKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eosAccountBatch.ownerKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eosAccountBatch.activeKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eosAccountBatch.activeKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) eosAccountBatch.balance, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eosAccountBatch.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) eosAccountBatch.currencyAmount, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eosAccountBatch.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (l2 = eosAccountBatch.coinId) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, eosAccountBatch.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (l = eosAccountBatch.chainId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, eosAccountBatch.chainId);
        }
    }

    public EosAccountBatch(String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        this.account = str;
        this.ownerKey = str2;
        this.activeKey = str3;
        this.balance = str4;
        this.currencyAmount = str5;
        this.coinId = l;
        this.chainId = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r10v0 java.lang.String))
  (wrap:java.lang.Long:0x002f: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0030: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long):void (m)] (LINE:20) call: com.okinc.business.defi.biz.net.bean.EosAccountBatch.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ EosAccountBatch(String str, String str2, String str3, String str4, String str5, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? "0" : str4, (i & 16) != 0 ? "0" : str5, (i & 32) != 0 ? 0L : l, (i & 64) != 0 ? 0L : l2);
    }
}
