package com.okinc.business.defi.wallet.home.escapebind.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EscapeAccountListReq implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final Boolean isBind;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EscapeAccountListReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EscapeAccountListReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountListReq createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EscapeAccountListReq(string, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountListReq[] newArray(int i) {
            return new EscapeAccountListReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EscapeAccountListReq() {
        this((String) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeAccountListReq copy$default(EscapeAccountListReq escapeAccountListReq, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeAccountListReq.accountId;
        }
        if ((i & 2) != 0) {
            bool = escapeAccountListReq.isBind;
        }
        return escapeAccountListReq.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isBind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeAccountListReq copy(String str, Boolean bool) {
        return new EscapeAccountListReq(str, bool);
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
        if (!(obj instanceof EscapeAccountListReq)) {
            return false;
        }
        EscapeAccountListReq escapeAccountListReq = (EscapeAccountListReq) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) escapeAccountListReq.accountId) && Intrinsics.EZpvd(this.isBind, escapeAccountListReq.isBind);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isBind;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBind() {
        return this.isBind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeAccountListReq(accountId=" + this.accountId + ", isBind=" + this.isBind + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        Boolean bool = this.isBind;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeAccountListReq> serializer() {
            return EscapeAccountListReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeAccountListReq(int i, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.isBind = null;
        } else {
            this.isBind = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeAccountListReq escapeAccountListReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || escapeAccountListReq.accountId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, escapeAccountListReq.accountId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && escapeAccountListReq.isBind == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, escapeAccountListReq.isBind);
    }

    public EscapeAccountListReq(String str, Boolean bool) {
        this.accountId = str;
        this.isBind = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean):void (m)] (LINE:19) call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListReq.<init>(java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ EscapeAccountListReq(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
