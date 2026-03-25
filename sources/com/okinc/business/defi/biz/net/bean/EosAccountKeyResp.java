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
public final class EosAccountKeyResp implements Parcelable {
    private String account;
    private String balance;
    private Long coinId;
    private String currencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosAccountKeyResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EosAccountKeyResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountKeyResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EosAccountKeyResp(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosAccountKeyResp[] newArray(int i) {
            return new EosAccountKeyResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosAccountKeyResp() {
        this((Long) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EosAccountKeyResp copy$default(EosAccountKeyResp eosAccountKeyResp, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = eosAccountKeyResp.coinId;
        }
        if ((i & 2) != 0) {
            str = eosAccountKeyResp.account;
        }
        if ((i & 4) != 0) {
            str2 = eosAccountKeyResp.balance;
        }
        if ((i & 8) != 0) {
            str3 = eosAccountKeyResp.currencyAmount;
        }
        return eosAccountKeyResp.copy(l, str, str2, str3);
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
    public final EosAccountKeyResp copy(Long l, String str, String str2, String str3) {
        return new EosAccountKeyResp(l, str, str2, str3);
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
        if (!(obj instanceof EosAccountKeyResp)) {
            return false;
        }
        EosAccountKeyResp eosAccountKeyResp = (EosAccountKeyResp) obj;
        return Intrinsics.EZpvd(this.coinId, eosAccountKeyResp.coinId) && Intrinsics.EZpvd((Object) this.account, (Object) eosAccountKeyResp.account) && Intrinsics.EZpvd((Object) this.balance, (Object) eosAccountKeyResp.balance) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) eosAccountKeyResp.currencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
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
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.account;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.balance;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyAmount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(String str) {
        this.account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(String str) {
        this.balance = str;
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
    public String toString() {
        return "EosAccountKeyResp(coinId=" + this.coinId + ", account=" + this.account + ", balance=" + this.balance + ", currencyAmount=" + this.currencyAmount + ")";
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosAccountKeyResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosAccountKeyResp> serializer() {
            return EosAccountKeyResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosAccountKeyResp(int i, Long l, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosAccountKeyResp eosAccountKeyResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosAccountKeyResp.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, eosAccountKeyResp.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eosAccountKeyResp.account != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eosAccountKeyResp.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eosAccountKeyResp.balance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eosAccountKeyResp.balance);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && eosAccountKeyResp.currencyAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eosAccountKeyResp.currencyAmount);
    }

    public EosAccountKeyResp(Long l, String str, String str2, String str3) {
        this.coinId = l;
        this.account = str;
        this.balance = str2;
        this.currencyAmount = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.okinc.business.defi.biz.net.bean.EosAccountKeyResp.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EosAccountKeyResp(Long l, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
