package com.okinc.business.defi.wallet.mine.walletbind.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CheckWalletBindStatusAccountResponse implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final boolean isBinded;
    private final Long uid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CheckWalletBindStatusAccountResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckWalletBindStatusAccountResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckWalletBindStatusAccountResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckWalletBindStatusAccountResponse(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckWalletBindStatusAccountResponse[] newArray(int i) {
            return new CheckWalletBindStatusAccountResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckWalletBindStatusAccountResponse() {
        this((String) null, false, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckWalletBindStatusAccountResponse copy$default(CheckWalletBindStatusAccountResponse checkWalletBindStatusAccountResponse, String str, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkWalletBindStatusAccountResponse.accountId;
        }
        if ((i & 2) != 0) {
            z = checkWalletBindStatusAccountResponse.isBinded;
        }
        if ((i & 4) != 0) {
            l = checkWalletBindStatusAccountResponse.uid;
        }
        return checkWalletBindStatusAccountResponse.copy(str, z, l);
    }

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    @SerialName("uid")
    public static /* synthetic */ void getUid$annotations() {
    }

    @SerialName("isBinded")
    public static /* synthetic */ void isBinded$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isBinded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckWalletBindStatusAccountResponse copy(@NotNull String str, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckWalletBindStatusAccountResponse(str, z, l);
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
        if (!(obj instanceof CheckWalletBindStatusAccountResponse)) {
            return false;
        }
        CheckWalletBindStatusAccountResponse checkWalletBindStatusAccountResponse = (CheckWalletBindStatusAccountResponse) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) checkWalletBindStatusAccountResponse.accountId) && this.isBinded == checkWalletBindStatusAccountResponse.isBinded && Intrinsics.EZpvd(this.uid, checkWalletBindStatusAccountResponse.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isBinded);
        Long l = this.uid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBinded() {
        return this.isBinded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckWalletBindStatusAccountResponse(accountId=" + this.accountId + ", isBinded=" + this.isBinded + ", uid=" + this.uid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeInt(this.isBinded ? 1 : 0);
        Long l = this.uid;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusAccountResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckWalletBindStatusAccountResponse> serializer() {
            return CheckWalletBindStatusAccountResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckWalletBindStatusAccountResponse(int i, String str, boolean z, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isBinded = false;
        } else {
            this.isBinded = z;
        }
        if ((i & 4) == 0) {
            this.uid = null;
        } else {
            this.uid = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckWalletBindStatusAccountResponse checkWalletBindStatusAccountResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) checkWalletBindStatusAccountResponse.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, checkWalletBindStatusAccountResponse.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || checkWalletBindStatusAccountResponse.isBinded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, checkWalletBindStatusAccountResponse.isBinded);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && checkWalletBindStatusAccountResponse.uid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, checkWalletBindStatusAccountResponse.uid);
    }

    public CheckWalletBindStatusAccountResponse(@NotNull String str, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.isBinded = z;
        this.uid = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.String, boolean, java.lang.Long):void (m)] (LINE:27) call: com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusAccountResponse.<init>(java.lang.String, boolean, java.lang.Long):void type: THIS */
    public /* synthetic */ CheckWalletBindStatusAccountResponse(String str, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : l);
    }
}
