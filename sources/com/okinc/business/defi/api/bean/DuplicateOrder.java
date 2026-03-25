package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class DuplicateOrder implements Parcelable {
    private Long coinId;
    private Boolean isDuplicateBizHash;
    private String txHash;
    private String txId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DuplicateOrder> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DuplicateOrder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuplicateOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DuplicateOrder(lValueOf, string, string2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DuplicateOrder[] newArray(int i) {
            return new DuplicateOrder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DuplicateOrder() {
        this((Long) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DuplicateOrder copy$default(DuplicateOrder duplicateOrder, Long l, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            l = duplicateOrder.coinId;
        }
        if ((i & 2) != 0) {
            str = duplicateOrder.txId;
        }
        if ((i & 4) != 0) {
            str2 = duplicateOrder.txHash;
        }
        if ((i & 8) != 0) {
            bool = duplicateOrder.isDuplicateBizHash;
        }
        return duplicateOrder.copy(l, str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isDuplicateBizHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DuplicateOrder copy(Long l, String str, String str2, Boolean bool) {
        return new DuplicateOrder(l, str, str2, bool);
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
        if (!(obj instanceof DuplicateOrder)) {
            return false;
        }
        DuplicateOrder duplicateOrder = (DuplicateOrder) obj;
        return Intrinsics.EZpvd(this.coinId, duplicateOrder.coinId) && Intrinsics.EZpvd((Object) this.txId, (Object) duplicateOrder.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) duplicateOrder.txHash) && Intrinsics.EZpvd(this.isDuplicateBizHash, duplicateOrder.isDuplicateBizHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
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
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.txId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.txHash;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isDuplicateBizHash;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDuplicateBizHash() {
        return this.isDuplicateBizHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuplicateBizHash(Boolean bool) {
        this.isDuplicateBizHash = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DuplicateOrder(coinId=" + this.coinId + ", txId=" + this.txId + ", txHash=" + this.txHash + ", isDuplicateBizHash=" + this.isDuplicateBizHash + ")";
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
        parcel.writeString(this.txId);
        parcel.writeString(this.txHash);
        Boolean bool = this.isDuplicateBizHash;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.DuplicateOrder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DuplicateOrder> serializer() {
            return DuplicateOrder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DuplicateOrder(int i, Long l, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.txId = null;
        } else {
            this.txId = str;
        }
        if ((i & 4) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str2;
        }
        if ((i & 8) == 0) {
            this.isDuplicateBizHash = Boolean.FALSE;
        } else {
            this.isDuplicateBizHash = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(DuplicateOrder duplicateOrder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || duplicateOrder.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, duplicateOrder.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || duplicateOrder.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, duplicateOrder.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || duplicateOrder.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, duplicateOrder.txHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(duplicateOrder.isDuplicateBizHash, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, duplicateOrder.isDuplicateBizHash);
    }

    public DuplicateOrder(Long l, String str, String str2, Boolean bool) {
        this.coinId = l;
        this.txId = str;
        this.txHash = str2;
        this.isDuplicateBizHash = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0014: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:47) call: com.okinc.business.defi.api.bean.DuplicateOrder.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DuplicateOrder(Long l, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
