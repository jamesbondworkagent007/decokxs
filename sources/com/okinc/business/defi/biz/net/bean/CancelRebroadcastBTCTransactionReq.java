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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class CancelRebroadcastBTCTransactionReq implements Parcelable {
    public static final int $stable = 0;
    private final Long chainId;
    private final String txHash;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CancelRebroadcastBTCTransactionReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CancelRebroadcastBTCTransactionReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelRebroadcastBTCTransactionReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CancelRebroadcastBTCTransactionReq(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CancelRebroadcastBTCTransactionReq[] newArray(int i) {
            return new CancelRebroadcastBTCTransactionReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CancelRebroadcastBTCTransactionReq() {
        this((String) null, (Long) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CancelRebroadcastBTCTransactionReq copy$default(CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelRebroadcastBTCTransactionReq.walletId;
        }
        if ((i & 2) != 0) {
            l = cancelRebroadcastBTCTransactionReq.chainId;
        }
        if ((i & 4) != 0) {
            str2 = cancelRebroadcastBTCTransactionReq.txHash;
        }
        return cancelRebroadcastBTCTransactionReq.copy(str, l, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelRebroadcastBTCTransactionReq copy(@NotNull String str, Long l, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CancelRebroadcastBTCTransactionReq(str, l, str2);
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
        if (!(obj instanceof CancelRebroadcastBTCTransactionReq)) {
            return false;
        }
        CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq = (CancelRebroadcastBTCTransactionReq) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) cancelRebroadcastBTCTransactionReq.walletId) && Intrinsics.EZpvd(this.chainId, cancelRebroadcastBTCTransactionReq.chainId) && Intrinsics.EZpvd((Object) this.txHash, (Object) cancelRebroadcastBTCTransactionReq.txHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletId.hashCode();
        Long l = this.chainId;
        return (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.txHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CancelRebroadcastBTCTransactionReq(walletId=" + this.walletId + ", chainId=" + this.chainId + ", txHash=" + this.txHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.txHash);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CancelRebroadcastBTCTransactionReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CancelRebroadcastBTCTransactionReq> serializer() {
            return CancelRebroadcastBTCTransactionReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CancelRebroadcastBTCTransactionReq(int i, String str, Long l, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 4) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cancelRebroadcastBTCTransactionReq.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cancelRebroadcastBTCTransactionReq.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cancelRebroadcastBTCTransactionReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, cancelRebroadcastBTCTransactionReq.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) cancelRebroadcastBTCTransactionReq.txHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, cancelRebroadcastBTCTransactionReq.txHash);
    }

    public CancelRebroadcastBTCTransactionReq(@NotNull String str, Long l, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.walletId = str;
        this.chainId = l;
        this.txHash = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:1517) call: com.okinc.business.defi.biz.net.bean.CancelRebroadcastBTCTransactionReq.<init>(java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ CancelRebroadcastBTCTransactionReq(String str, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? "" : str2);
    }
}
