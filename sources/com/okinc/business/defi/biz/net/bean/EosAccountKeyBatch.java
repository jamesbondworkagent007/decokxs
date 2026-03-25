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
public final class EosAccountKeyBatch implements Parcelable {
    private String account;
    private String activeKey;
    private String balance;
    private Long chainId;
    private Long coinId;
    private String currencyAmount;
    private String ownerKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosAccountKeyBatch> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EosAccountKeyBatch> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountKeyBatch createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EosAccountKeyBatch(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountKeyBatch[] newArray(int i) {
            return new EosAccountKeyBatch[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosAccountKeyBatch() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EosAccountKeyBatch copy$default(EosAccountKeyBatch eosAccountKeyBatch, Long l, String str, String str2, String str3, String str4, Long l2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            l = eosAccountKeyBatch.coinId;
        }
        if ((i & 2) != 0) {
            str = eosAccountKeyBatch.account;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = eosAccountKeyBatch.balance;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = eosAccountKeyBatch.currencyAmount;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = eosAccountKeyBatch.activeKey;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            l2 = eosAccountKeyBatch.chainId;
        }
        Long l3 = l2;
        if ((i & 64) != 0) {
            str5 = eosAccountKeyBatch.ownerKey;
        }
        return eosAccountKeyBatch.copy(l, str6, str7, str8, str9, l3, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.activeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ownerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosAccountKeyBatch copy(Long l, String str, String str2, String str3, String str4, Long l2, String str5) {
        return new EosAccountKeyBatch(l, str, str2, str3, str4, l2, str5);
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
        if (!(obj instanceof EosAccountKeyBatch)) {
            return false;
        }
        EosAccountKeyBatch eosAccountKeyBatch = (EosAccountKeyBatch) obj;
        return Intrinsics.EZpvd(this.coinId, eosAccountKeyBatch.coinId) && Intrinsics.EZpvd((Object) this.account, (Object) eosAccountKeyBatch.account) && Intrinsics.EZpvd((Object) this.balance, (Object) eosAccountKeyBatch.balance) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) eosAccountKeyBatch.currencyAmount) && Intrinsics.EZpvd((Object) this.activeKey, (Object) eosAccountKeyBatch.activeKey) && Intrinsics.EZpvd(this.chainId, eosAccountKeyBatch.chainId) && Intrinsics.EZpvd((Object) this.ownerKey, (Object) eosAccountKeyBatch.ownerKey);
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
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.account;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.balance;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyAmount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.activeKey;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Long l2 = this.chainId;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        String str5 = this.ownerKey;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
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
        return "EosAccountKeyBatch(coinId=" + this.coinId + ", account=" + this.account + ", balance=" + this.balance + ", currencyAmount=" + this.currencyAmount + ", activeKey=" + this.activeKey + ", chainId=" + this.chainId + ", ownerKey=" + this.ownerKey + ")";
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
        parcel.writeString(this.account);
        parcel.writeString(this.balance);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.activeKey);
        Long l2 = this.chainId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.ownerKey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosAccountKeyBatch.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosAccountKeyBatch> serializer() {
            return EosAccountKeyBatch$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosAccountKeyBatch(int i, Long l, String str, String str2, String str3, String str4, Long l2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.account = null;
        } else {
            this.account = str;
        }
        if ((i & 4) == 0) {
            this.balance = null;
        } else {
            this.balance = str2;
        }
        if ((i & 8) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str3;
        }
        if ((i & 16) == 0) {
            this.activeKey = "";
        } else {
            this.activeKey = str4;
        }
        if ((i & 32) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = l2;
        }
        if ((i & 64) == 0) {
            this.ownerKey = "";
        } else {
            this.ownerKey = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosAccountKeyBatch eosAccountKeyBatch, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosAccountKeyBatch.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, eosAccountKeyBatch.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eosAccountKeyBatch.account != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eosAccountKeyBatch.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eosAccountKeyBatch.balance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eosAccountKeyBatch.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eosAccountKeyBatch.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eosAccountKeyBatch.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) eosAccountKeyBatch.activeKey, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eosAccountKeyBatch.activeKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (l = eosAccountKeyBatch.chainId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, eosAccountKeyBatch.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) eosAccountKeyBatch.ownerKey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, eosAccountKeyBatch.ownerKey);
    }

    public EosAccountKeyBatch(Long l, String str, String str2, String str3, String str4, Long l2, String str5) {
        this.coinId = l;
        this.account = str;
        this.balance = str2;
        this.currencyAmount = str3;
        this.activeKey = str4;
        this.chainId = l2;
        this.ownerKey = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Long:0x002f: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:53) call: com.okinc.business.defi.biz.net.bean.EosAccountKeyBatch.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ EosAccountKeyBatch(Long l, String str, String str2, String str3, String str4, Long l2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0L : l2, (i & 64) != 0 ? "" : str5);
    }
}
