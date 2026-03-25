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
public final class CardanoUTXOReq implements Parcelable {
    private String address;
    private String amount;
    private Long coinId;
    private String fee;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardanoUTXOReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CardanoUTXOReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoUTXOReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CardanoUTXOReq(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardanoUTXOReq[] newArray(int i) {
            return new CardanoUTXOReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoUTXOReq() {
        this((Long) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardanoUTXOReq copy$default(CardanoUTXOReq cardanoUTXOReq, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = cardanoUTXOReq.coinId;
        }
        if ((i & 2) != 0) {
            str = cardanoUTXOReq.address;
        }
        if ((i & 4) != 0) {
            str2 = cardanoUTXOReq.amount;
        }
        if ((i & 8) != 0) {
            str3 = cardanoUTXOReq.fee;
        }
        return cardanoUTXOReq.copy(l, str, str2, str3);
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
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoUTXOReq copy(Long l, String str, String str2, String str3) {
        return new CardanoUTXOReq(l, str, str2, str3);
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
        if (!(obj instanceof CardanoUTXOReq)) {
            return false;
        }
        CardanoUTXOReq cardanoUTXOReq = (CardanoUTXOReq) obj;
        return Intrinsics.EZpvd(this.coinId, cardanoUTXOReq.coinId) && Intrinsics.EZpvd((Object) this.address, (Object) cardanoUTXOReq.address) && Intrinsics.EZpvd((Object) this.amount, (Object) cardanoUTXOReq.amount) && Intrinsics.EZpvd((Object) this.fee, (Object) cardanoUTXOReq.fee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.address;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fee;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoUTXOReq(coinId=" + this.coinId + ", address=" + this.address + ", amount=" + this.amount + ", fee=" + this.fee + ")";
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
        parcel.writeString(this.amount);
        parcel.writeString(this.fee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CardanoUTXOReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoUTXOReq> serializer() {
            return CardanoUTXOReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoUTXOReq(int i, Long l, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 8) == 0) {
            this.fee = null;
        } else {
            this.fee = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CardanoUTXOReq cardanoUTXOReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardanoUTXOReq.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, cardanoUTXOReq.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardanoUTXOReq.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cardanoUTXOReq.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardanoUTXOReq.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardanoUTXOReq.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && cardanoUTXOReq.fee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardanoUTXOReq.fee);
    }

    public CardanoUTXOReq(Long l, String str, String str2, String str3) {
        this.coinId = l;
        this.address = str;
        this.amount = str2;
        this.fee = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:357) call: com.okinc.business.defi.biz.net.bean.CardanoUTXOReq.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardanoUTXOReq(Long l, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
